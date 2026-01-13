package multispace.multiapp.clone.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import multispace.multiapp.clone.widget.RockerView;
import o00oOooO.oo0oO0;
import o0ooO0O0.oO0O0OO;
/* loaded from: classes3.dex */
public class RockerView extends SurfaceView implements Runnable, SurfaceHolder.Callback {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f6800o00ooOO = 100;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f6801o00ooOOo = 35;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f6804o00ooOoO = 30;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f6805o00ooOoo = 300;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static Thread f6806o00ooo0 = null;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static Thread f6807o00ooo00 = null;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f6810o00oooO = 1;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f6811o00oooOO = 2;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f6812o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Paint f6813o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public SurfaceHolder f6814o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Point f6815o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f6816o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Point f6817o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f6818o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f6819o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Bitmap f6820o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Bitmap f6821o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f6822o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oOOo0 f6823o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f6824o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f6825o0O0o;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f6803o00ooOo0 = Color.argb(128, 0, 0, 0);

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f6802o00ooOo = Color.argb(128, 0, 0, 0);

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static boolean f6808o00ooo0O = true;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static boolean f6809o00ooo0o = true;

    /* loaded from: classes3.dex */
    public interface o00oOOo0 {
        void o00oOOo0(int i, float f, float f2);
    }

    public RockerView(Context context) {
        this(context, null);
    }

    public RockerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RockerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6816o00oo0o = -1;
        this.f6818o00oo0oO = -1;
        this.f6822o00ooO0O = true;
        this.f6819o00ooO = 30;
        this.f6824o00ooOO0 = 300;
        o00oOoO0(context, attributeSet);
        o00oOoOo();
        if (isInEditMode()) {
            return;
        }
        o00oOo00();
        o00oOOoO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoO() {
        while (f6809o00ooo0o) {
            o00oOoOO();
            try {
                Thread.sleep(this.f6824o00ooOO0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Bitmap getAreaBitmap() {
        return this.f6821o00ooO00;
    }

    public int getAreaColor() {
        return this.f6825o0O0o;
    }

    public int getAreaRadius() {
        return this.f6816o00oo0o;
    }

    public int getCallbackCycle() {
        return this.f6824o00ooOO0;
    }

    public int getRefreshCycle() {
        return this.f6819o00ooO;
    }

    public Bitmap getRockerBitmap() {
        return this.f6820o00ooO0;
    }

    public int getRockerColor() {
        return this.f6812o00oo;
    }

    public int getRockerRadius() {
        return this.f6818o00oo0oO;
    }

    public final void o00oOOoO() {
        SurfaceHolder holder = getHolder();
        this.f6814o00oo0O0 = holder;
        holder.addCallback(this);
        this.f6814o00oo0O0.setFormat(-2);
    }

    public final void o00oOo00() {
        setKeepScreenOn(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setZOrderOnTop(true);
    }

    public final void o00oOo0O(Canvas canvas) {
        if (this.f6820o00ooO0 == null) {
            this.f6813o00oo0O.setColor(this.f6812o00oo);
            Point point = this.f6817o00oo0o0;
            canvas.drawCircle(point.x, point.y, this.f6818o00oo0oO, this.f6813o00oo0O);
            return;
        }
        this.f6813o00oo0O.setColor(-16777216);
        Rect rect = new Rect(0, 0, this.f6820o00ooO0.getWidth(), this.f6820o00ooO0.getHeight());
        Point point2 = this.f6817o00oo0o0;
        int i = point2.x;
        int i2 = this.f6818o00oo0oO;
        int i3 = point2.y;
        canvas.drawBitmap(this.f6820o00ooO0, rect, new Rect(i - i2, i3 - i2, i + i2, i3 + i2), this.f6813o00oo0O);
    }

    public final float o00oOo0o(float f) {
        return (float) (Math.round((f / 3.141592653589793d) * 180.0d) + 90);
    }

    public final void o00oOoO0(Context context, AttributeSet attributeSet) {
        this.f6825o0O0o = f6803o00ooOo0;
        this.f6812o00oo = f6802o00ooOo;
        this.f6816o00oo0o = 100;
        this.f6818o00oo0oO = 35;
    }

    public final void o00oOoOO() {
        o00oOOo0 o00oooo02 = this.f6823o00ooO0o;
        if (o00oooo02 != null) {
            Point point = this.f6817o00oo0o0;
            int i = point.x;
            Point point2 = this.f6815o00oo0Oo;
            if (i == point2.x && point.y == point2.y) {
                o00oooo02.o00oOOo0(2, -1.0f, 0.0f);
                return;
            }
            Point point3 = this.f6817o00oo0o0;
            float o00oOo0o2 = o00oOo0o(oO0O0OO.o00oOo0O(point2, new Point(point3.x, point3.y)));
            Point point4 = this.f6815o00oo0Oo;
            Point point5 = this.f6817o00oo0o0;
            this.f6823o00ooO0o.o00oOOo0(2, o00oOo0o2, oO0O0OO.o00oOOoO(point4.x, point4.y, point5.x, point5.y));
        }
    }

    public final void o00oOoOo() {
        Paint paint = new Paint();
        this.f6813o00oo0O = paint;
        paint.setAntiAlias(true);
    }

    public final void o00oOooO(Canvas canvas) {
        if (this.f6821o00ooO00 == null) {
            this.f6813o00oo0O.setColor(this.f6825o0O0o);
            Point point = this.f6815o00oo0Oo;
            canvas.drawCircle(point.x, point.y, this.f6816o00oo0o, this.f6813o00oo0O);
            return;
        }
        this.f6813o00oo0O.setColor(-16777216);
        Rect rect = new Rect(0, 0, this.f6821o00ooO00.getWidth(), this.f6821o00ooO00.getHeight());
        Point point2 = this.f6815o00oo0Oo;
        int i = point2.x;
        int i2 = this.f6816o00oo0o;
        int i3 = point2.y;
        canvas.drawBitmap(this.f6821o00ooO00, rect, new Rect(i - i2, i3 - i2, i + i2, i3 + i2), this.f6813o00oo0O);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawColor(-1);
            o00oOooO(canvas);
            o00oOo0O(canvas);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = (this.f6816o00oo0o + this.f6818o00oo0oO) * 2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0 || size < 0) {
            size = i3;
        }
        if (mode2 != Integer.MIN_VALUE && mode2 != 0 && size2 >= 0) {
            i3 = size2;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6815o00oo0Oo = new Point(i / 2, i2 / 2);
        this.f6817o00oo0o0 = new Point(this.f6815o00oo0Oo);
        int min = Math.min((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom()) / 2;
        if (this.f6816o00oo0o == -1) {
            this.f6816o00oo0o = (int) (min * 0.75d);
        }
        if (this.f6818o00oo0oO == -1) {
            this.f6818o00oo0oO = (int) (min * 0.25d);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int o00oOOoO2;
        try {
            Point point = this.f6815o00oo0Oo;
            o00oOOoO2 = oO0O0OO.o00oOOoO(point.x, point.y, motionEvent.getX(), motionEvent.getY());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (motionEvent.getAction() != 0 || o00oOOoO2 <= this.f6816o00oo0o) {
            if (motionEvent.getAction() == 2) {
                if (o00oOOoO2 <= this.f6816o00oo0o) {
                    this.f6817o00oo0o0.set((int) motionEvent.getX(), (int) motionEvent.getY());
                } else {
                    this.f6817o00oo0o0 = oO0O0OO.o00oOooO(this.f6815o00oo0Oo, new Point((int) motionEvent.getX(), (int) motionEvent.getY()), this.f6816o00oo0o);
                }
                if (this.f6823o00ooO0o != null) {
                    float o00oOo0o2 = o00oOo0o(oO0O0OO.o00oOo0O(this.f6815o00oo0Oo, new Point((int) motionEvent.getX(), (int) motionEvent.getY())));
                    Point point2 = this.f6815o00oo0Oo;
                    this.f6823o00ooO0o.o00oOOo0(1, o00oOo0o2, oO0O0OO.o00oOOoO(point2.x, point2.y, motionEvent.getX(), motionEvent.getY()));
                }
            }
            if (motionEvent.getAction() == 1) {
                this.f6817o00oo0o0 = new Point(this.f6815o00oo0Oo);
                o00oOOo0 o00oooo02 = this.f6823o00ooO0o;
                if (o00oooo02 != null) {
                    o00oooo02.o00oOOo0(1, -1.0f, 0.0f);
                }
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@oo0oO0 View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        f6808o00ooo0O = z;
        f6809o00ooo0o = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isInEditMode()) {
            return;
        }
        Canvas canvas = null;
        while (f6808o00ooo0O) {
            boolean z = this.f6822o00ooO0O;
            if (z) {
                try {
                    try {
                        canvas = this.f6814o00oo0O0.lockCanvas();
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        o00oOooO(canvas);
                        o00oOo0O(canvas);
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (canvas != null && z) {
                        }
                    }
                } catch (Throwable th) {
                    if (canvas != null && z) {
                        this.f6814o00oo0O0.unlockCanvasAndPost(canvas);
                    }
                    throw th;
                }
            }
            Thread.sleep(this.f6819o00ooO);
            if (canvas != null && z) {
                this.f6814o00oo0O0.unlockCanvasAndPost(canvas);
            }
        }
    }

    public void setAreaBitmap(Bitmap bitmap) {
        this.f6821o00ooO00 = bitmap;
    }

    public void setAreaColor(int i) {
        this.f6825o0O0o = i;
        this.f6821o00ooO00 = null;
    }

    public void setAreaRadius(int i) {
        this.f6816o00oo0o = i;
    }

    public void setCallbackCycle(int i) {
        this.f6824o00ooOO0 = i;
    }

    public void setCanMove(boolean z) {
        this.f6822o00ooO0O = z;
    }

    public void setListener(@oo0oO0 o00oOOo0 o00oooo02) {
        this.f6823o00ooO0o = o00oooo02;
    }

    public void setRefreshCycle(int i) {
        this.f6819o00ooO = i;
    }

    public void setRockerBitmap(Bitmap bitmap) {
        this.f6820o00ooO0 = bitmap;
    }

    public void setRockerColor(int i) {
        this.f6812o00oo = i;
        this.f6820o00ooO0 = null;
    }

    public void setRockerRadius(int i) {
        this.f6818o00oo0oO = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            Thread thread = new Thread(this);
            f6807o00ooo00 = thread;
            thread.start();
            Thread thread2 = new Thread(new Runnable() { // from class: o0Oo0OOo.o0OO0o
                @Override // java.lang.Runnable
                public final void run() {
                    RockerView.this.o00oOoO();
                }
            });
            f6806o00ooo0 = thread2;
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f6808o00ooo0O = false;
        f6809o00ooo0o = false;
    }
}
