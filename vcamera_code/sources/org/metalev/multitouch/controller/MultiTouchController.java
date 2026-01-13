package org.metalev.multitouch.controller;

import android.view.MotionEvent;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class MultiTouchController<T> {
    private static int ACTION_POINTER_INDEX_SHIFT = 8;
    private static int ACTION_POINTER_UP = 6;
    public static final boolean DEBUG = false;
    private static final long EVENT_SETTLE_TIME_INTERVAL = 20;
    private static final float MAX_MULTITOUCH_DIM_JUMP_SIZE = 40.0f;
    private static final float MAX_MULTITOUCH_POS_JUMP_SIZE = 30.0f;
    public static final int MAX_TOUCH_POINTS = 20;
    private static final float MIN_MULTITOUCH_SEPARATION = 30.0f;
    private static final int MODE_DRAG = 1;
    private static final int MODE_NOTHING = 0;
    private static final int MODE_PINCH = 2;
    private static Method m_getHistoricalPressure;
    private static Method m_getHistoricalX;
    private static Method m_getHistoricalY;
    private static Method m_getPointerCount;
    private static Method m_getPointerId;
    private static Method m_getPressure;
    private static Method m_getX;
    private static Method m_getY;
    public static final boolean multiTouchSupported;
    private static final int[] pointerIds;
    private static final float[] pressureVals;
    private static final float[] xVals;
    private static final float[] yVals;
    private boolean handleSingleTouchEvents;
    private PointInfo mCurrPt;
    private float mCurrPtAng;
    private float mCurrPtDiam;
    private float mCurrPtHeight;
    private float mCurrPtWidth;
    private float mCurrPtX;
    private float mCurrPtY;
    private PositionAndScale mCurrXform;
    private int mMode;
    private PointInfo mPrevPt;
    private long mSettleEndTime;
    private long mSettleStartTime;
    public MultiTouchObjectCanvas<T> objectCanvas;
    private T selectedObject;
    private float startAngleMinusPinchAngle;
    private float startPosX;
    private float startPosY;
    private float startScaleOverPinchDiam;
    private float startScaleXOverPinchWidth;
    private float startScaleYOverPinchHeight;

    /* loaded from: classes3.dex */
    public interface MultiTouchObjectCanvas<T> {
        T getDraggableObjectAtPoint(PointInfo pointInfo);

        void getPositionAndScale(T t, PositionAndScale positionAndScale);

        void selectObject(T t, PointInfo pointInfo);

        boolean setPositionAndScale(T t, PositionAndScale positionAndScale, PointInfo pointInfo);
    }

    /* loaded from: classes3.dex */
    public static class PointInfo {
        private int action;
        private float angle;
        private boolean angleIsCalculated;
        private float diameter;
        private boolean diameterIsCalculated;
        private float diameterSq;
        private boolean diameterSqIsCalculated;
        private float dx;
        private float dy;
        private long eventTime;
        private boolean isDown;
        private boolean isMultiTouch;
        private int numPoints;
        private float pressureMid;
        private float xMid;
        private float yMid;
        private float[] xs = new float[20];
        private float[] ys = new float[20];
        private float[] pressures = new float[20];
        private int[] pointerIds = new int[20];

        private int julery_isqrt(int i) {
            int i2 = 0;
            int i3 = 32768;
            int i4 = 15;
            while (true) {
                int i5 = i4 - 1;
                int i6 = ((i2 << 1) + i3) << i4;
                if (i >= i6) {
                    i2 += i3;
                    i -= i6;
                }
                i3 >>= 1;
                if (i3 <= 0) {
                    return i2;
                }
                i4 = i5;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
            this.eventTime = j;
            this.action = i2;
            this.numPoints = i;
            for (int i3 = 0; i3 < i; i3++) {
                this.xs[i3] = fArr[i3];
                this.ys[i3] = fArr2[i3];
                this.pressures[i3] = fArr3[i3];
                this.pointerIds[i3] = iArr[i3];
            }
            this.isDown = z;
            boolean z2 = i >= 2;
            this.isMultiTouch = z2;
            if (z2) {
                float f = fArr[0];
                float f2 = fArr[1];
                this.xMid = (f + f2) * 0.5f;
                this.yMid = (fArr2[0] + fArr2[1]) * 0.5f;
                this.pressureMid = (fArr3[0] + fArr3[1]) * 0.5f;
                this.dx = Math.abs(f2 - f);
                this.dy = Math.abs(fArr2[1] - fArr2[0]);
            } else {
                this.xMid = fArr[0];
                this.yMid = fArr2[0];
                this.pressureMid = fArr3[0];
                this.dy = 0.0f;
                this.dx = 0.0f;
            }
            this.angleIsCalculated = false;
            this.diameterIsCalculated = false;
            this.diameterSqIsCalculated = false;
        }

        public int getAction() {
            return this.action;
        }

        public long getEventTime() {
            return this.eventTime;
        }

        public float getMultiTouchAngle() {
            float atan2;
            if (!this.angleIsCalculated) {
                if (this.isMultiTouch) {
                    float[] fArr = this.ys;
                    float[] fArr2 = this.xs;
                    atan2 = (float) Math.atan2(fArr[1] - fArr[0], fArr2[1] - fArr2[0]);
                } else {
                    atan2 = 0.0f;
                }
                this.angle = atan2;
                this.angleIsCalculated = true;
            }
            return this.angle;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r0 < r1) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public float getMultiTouchDiameter() {
            /*
                r3 = this;
                boolean r0 = r3.diameterIsCalculated
                if (r0 != 0) goto L38
                boolean r0 = r3.isMultiTouch
                r1 = 0
                if (r0 != 0) goto Lc
            L9:
                r3.diameter = r1
                goto L35
            Lc:
                float r0 = r3.getMultiTouchDiameterSq()
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L15
                goto L22
            L15:
                r1 = 1132462080(0x43800000, float:256.0)
                float r0 = r0 * r1
                int r0 = (int) r0
                int r0 = r3.julery_isqrt(r0)
                float r0 = (float) r0
                r1 = 1098907648(0x41800000, float:16.0)
                float r1 = r0 / r1
            L22:
                r3.diameter = r1
                float r0 = r3.dx
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r1 >= 0) goto L2c
                r3.diameter = r0
            L2c:
                float r0 = r3.diameter
                float r1 = r3.dy
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L35
                goto L9
            L35:
                r0 = 1
                r3.diameterIsCalculated = r0
            L38:
                float r0 = r3.diameter
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.metalev.multitouch.controller.MultiTouchController.PointInfo.getMultiTouchDiameter():float");
        }

        public float getMultiTouchDiameterSq() {
            float f;
            if (!this.diameterSqIsCalculated) {
                if (this.isMultiTouch) {
                    float f2 = this.dx;
                    float f3 = this.dy;
                    f = (f3 * f3) + (f2 * f2);
                } else {
                    f = 0.0f;
                }
                this.diameterSq = f;
                this.diameterSqIsCalculated = true;
            }
            return this.diameterSq;
        }

        public float getMultiTouchHeight() {
            if (this.isMultiTouch) {
                return this.dy;
            }
            return 0.0f;
        }

        public float getMultiTouchWidth() {
            if (this.isMultiTouch) {
                return this.dx;
            }
            return 0.0f;
        }

        public int getNumTouchPoints() {
            return this.numPoints;
        }

        public int[] getPointerIds() {
            return this.pointerIds;
        }

        public float getPressure() {
            return this.pressureMid;
        }

        public float[] getPressures() {
            return this.pressures;
        }

        public float getX() {
            return this.xMid;
        }

        public float[] getXs() {
            return this.xs;
        }

        public float getY() {
            return this.yMid;
        }

        public float[] getYs() {
            return this.ys;
        }

        public boolean isDown() {
            return this.isDown;
        }

        public boolean isMultiTouch() {
            return this.isMultiTouch;
        }

        public void set(PointInfo pointInfo) {
            this.numPoints = pointInfo.numPoints;
            for (int i = 0; i < this.numPoints; i++) {
                this.xs[i] = pointInfo.xs[i];
                this.ys[i] = pointInfo.ys[i];
                this.pressures[i] = pointInfo.pressures[i];
                this.pointerIds[i] = pointInfo.pointerIds[i];
            }
            this.xMid = pointInfo.xMid;
            this.yMid = pointInfo.yMid;
            this.pressureMid = pointInfo.pressureMid;
            this.dx = pointInfo.dx;
            this.dy = pointInfo.dy;
            this.diameter = pointInfo.diameter;
            this.diameterSq = pointInfo.diameterSq;
            this.angle = pointInfo.angle;
            this.isDown = pointInfo.isDown;
            this.action = pointInfo.action;
            this.isMultiTouch = pointInfo.isMultiTouch;
            this.diameterIsCalculated = pointInfo.diameterIsCalculated;
            this.diameterSqIsCalculated = pointInfo.diameterSqIsCalculated;
            this.angleIsCalculated = pointInfo.angleIsCalculated;
            this.eventTime = pointInfo.eventTime;
        }
    }

    /* loaded from: classes3.dex */
    public static class PositionAndScale {
        private float angle;
        private float scale;
        private float scaleX;
        private float scaleY;
        private boolean updateAngle;
        private boolean updateScale;
        private boolean updateScaleXY;
        private float xOff;
        private float yOff;

        public float getAngle() {
            if (this.updateAngle) {
                return this.angle;
            }
            return 0.0f;
        }

        public float getScale() {
            if (this.updateScale) {
                return this.scale;
            }
            return 1.0f;
        }

        public float getScaleX() {
            if (this.updateScaleXY) {
                return this.scaleX;
            }
            return 1.0f;
        }

        public float getScaleY() {
            if (this.updateScaleXY) {
                return this.scaleY;
            }
            return 1.0f;
        }

        public float getXOff() {
            return this.xOff;
        }

        public float getYOff() {
            return this.yOff;
        }

        public void set(float f, float f2, float f3, float f4, float f5, float f6) {
            this.xOff = f;
            this.yOff = f2;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.scale = f3;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.scaleX = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.scaleY = f5;
            this.angle = f6;
        }

        public void set(float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, boolean z3, float f6) {
            this.xOff = f;
            this.yOff = f2;
            this.updateScale = z;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            this.scale = f3;
            this.updateScaleXY = z2;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            this.scaleX = f4;
            if (f5 == 0.0f) {
                f5 = 1.0f;
            }
            this.scaleY = f5;
            this.updateAngle = z3;
            this.angle = f6;
        }
    }

    static {
        boolean z = true;
        try {
            m_getPointerCount = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            Class cls = Integer.TYPE;
            m_getPointerId = MotionEvent.class.getMethod("getPointerId", cls);
            m_getPressure = MotionEvent.class.getMethod("getPressure", cls);
            m_getHistoricalX = MotionEvent.class.getMethod("getHistoricalX", cls, cls);
            m_getHistoricalY = MotionEvent.class.getMethod("getHistoricalY", cls, cls);
            m_getHistoricalPressure = MotionEvent.class.getMethod("getHistoricalPressure", cls, cls);
            m_getX = MotionEvent.class.getMethod("getX", cls);
            m_getY = MotionEvent.class.getMethod("getY", cls);
        } catch (Exception unused) {
            z = false;
        }
        multiTouchSupported = z;
        if (z) {
            try {
                ACTION_POINTER_UP = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                ACTION_POINTER_INDEX_SHIFT = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused2) {
            }
        }
        xVals = new float[20];
        yVals = new float[20];
        pressureVals = new float[20];
        pointerIds = new int[20];
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas) {
        this(multiTouchObjectCanvas, true);
    }

    public MultiTouchController(MultiTouchObjectCanvas<T> multiTouchObjectCanvas, boolean z) {
        this.selectedObject = null;
        this.mCurrXform = new PositionAndScale();
        this.mMode = 0;
        this.mCurrPt = new PointInfo();
        this.mPrevPt = new PointInfo();
        this.handleSingleTouchEvents = z;
        this.objectCanvas = multiTouchObjectCanvas;
    }

    private void anchorAtThisPositionAndScale() {
        T t = this.selectedObject;
        if (t == null) {
            return;
        }
        this.objectCanvas.getPositionAndScale(t, this.mCurrXform);
        float f = 1.0f / ((this.mCurrXform.updateScale && this.mCurrXform.scale != 0.0f) ? this.mCurrXform.scale : 1.0f);
        extractCurrPtInfo();
        this.startPosX = (this.mCurrPtX - this.mCurrXform.xOff) * f;
        this.startPosY = (this.mCurrPtY - this.mCurrXform.yOff) * f;
        this.startScaleOverPinchDiam = this.mCurrXform.scale / this.mCurrPtDiam;
        this.startScaleXOverPinchWidth = this.mCurrXform.scaleX / this.mCurrPtWidth;
        this.startScaleYOverPinchHeight = this.mCurrXform.scaleY / this.mCurrPtHeight;
        this.startAngleMinusPinchAngle = this.mCurrXform.angle - this.mCurrPtAng;
    }

    private void decodeTouchEvent(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
        PointInfo pointInfo = this.mPrevPt;
        this.mPrevPt = this.mCurrPt;
        this.mCurrPt = pointInfo;
        pointInfo.set(i, fArr, fArr2, fArr3, iArr, i2, z, j);
        multiTouchController();
    }

    private void extractCurrPtInfo() {
        this.mCurrPtX = this.mCurrPt.getX();
        this.mCurrPtY = this.mCurrPt.getY();
        this.mCurrPtDiam = Math.max(21.3f, !this.mCurrXform.updateScale ? 0.0f : this.mCurrPt.getMultiTouchDiameter());
        this.mCurrPtWidth = Math.max(30.0f, !this.mCurrXform.updateScaleXY ? 0.0f : this.mCurrPt.getMultiTouchWidth());
        this.mCurrPtHeight = Math.max(30.0f, !this.mCurrXform.updateScaleXY ? 0.0f : this.mCurrPt.getMultiTouchHeight());
        this.mCurrPtAng = this.mCurrXform.updateAngle ? this.mCurrPt.getMultiTouchAngle() : 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r7.mCurrPt.eventTime < r7.mSettleEndTime) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (r7.mCurrPt.getEventTime() < r7.mSettleEndTime) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
        anchorAtThisPositionAndScale();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
        performDragOrPinch();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void multiTouchController() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.metalev.multitouch.controller.MultiTouchController.multiTouchController():void");
    }

    private void performDragOrPinch() {
        if (this.selectedObject == null) {
            return;
        }
        float f = 1.0f;
        if (this.mCurrXform.updateScale && this.mCurrXform.scale != 0.0f) {
            f = this.mCurrXform.scale;
        }
        extractCurrPtInfo();
        this.mCurrXform.set(this.mCurrPtX - (this.startPosX * f), this.mCurrPtY - (this.startPosY * f), this.startScaleOverPinchDiam * this.mCurrPtDiam, this.startScaleXOverPinchWidth * this.mCurrPtWidth, this.startScaleYOverPinchHeight * this.mCurrPtHeight, this.startAngleMinusPinchAngle + this.mCurrPtAng);
        this.objectCanvas.setPositionAndScale(this.selectedObject, this.mCurrXform, this.mCurrPt);
    }

    public boolean getHandleSingleTouchEvents() {
        return this.handleSingleTouchEvents;
    }

    public int getMode() {
        return this.mMode;
    }

    public boolean isPinching() {
        return this.mMode == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146 A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x001b, B:9:0x001f, B:13:0x0026, B:18:0x0038, B:22:0x0041, B:24:0x004a, B:26:0x0066, B:28:0x0089, B:30:0x0095, B:32:0x00b8, B:34:0x00c4, B:36:0x00e7, B:35:0x00d9, B:31:0x00aa, B:27:0x007b, B:50:0x0120, B:64:0x0146, B:66:0x014f, B:65:0x014b, B:57:0x0134, B:37:0x00f3, B:39:0x00f7, B:41:0x0100, B:43:0x0106, B:45:0x010f, B:47:0x0115, B:49:0x011e, B:48:0x011a, B:44:0x010b, B:40:0x00fc), top: B:70:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b A[Catch: Exception -> 0x016b, TryCatch #0 {Exception -> 0x016b, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x001b, B:9:0x001f, B:13:0x0026, B:18:0x0038, B:22:0x0041, B:24:0x004a, B:26:0x0066, B:28:0x0089, B:30:0x0095, B:32:0x00b8, B:34:0x00c4, B:36:0x00e7, B:35:0x00d9, B:31:0x00aa, B:27:0x007b, B:50:0x0120, B:64:0x0146, B:66:0x014f, B:65:0x014b, B:57:0x0134, B:37:0x00f3, B:39:0x00f7, B:41:0x0100, B:43:0x0106, B:45:0x010f, B:47:0x0115, B:49:0x011e, B:48:0x011a, B:44:0x010b, B:40:0x00fc), top: B:70:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.metalev.multitouch.controller.MultiTouchController.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHandleSingleTouchEvents(boolean z) {
        this.handleSingleTouchEvents = z;
    }
}
