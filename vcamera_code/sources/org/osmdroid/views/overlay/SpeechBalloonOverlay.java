package org.osmdroid.views.overlay;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.util.RectL;
import org.osmdroid.util.SpeechBalloonHelper;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class SpeechBalloonOverlay extends Overlay {
    private Paint mBackground;
    private Paint mDragBackground;
    private float mDragDeltaX;
    private float mDragDeltaY;
    private Paint mDragForeground;
    private float mDragStartX;
    private float mDragStartY;
    private Paint mForeground;
    private GeoPoint mGeoPoint;
    private boolean mIsDragged;
    private int mMargin;
    private int mOffsetX;
    private int mOffsetY;
    private double mRadius;
    private String mTitle;
    private final SpeechBalloonHelper mHelper = new SpeechBalloonHelper();
    private final RectL mRect = new RectL();
    private final PointL mPoint = new PointL();
    private final PointL mIntersection1 = new PointL();
    private final PointL mIntersection2 = new PointL();
    private final Path mPath = new Path();
    private final Rect mTextRect = new Rect();
    private final Point mPixel = new Point();
    private boolean mDraggable = true;

    private boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        return this.mRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r2 != null) goto L9;
     */
    @Override // org.osmdroid.views.overlay.Overlay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r24, org.osmdroid.views.Projection r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.SpeechBalloonOverlay.draw(android.graphics.Canvas, org.osmdroid.views.Projection):void");
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest && this.mDraggable) {
            this.mIsDragged = true;
            this.mDragStartX = motionEvent.getX();
            this.mDragStartY = motionEvent.getY();
            this.mDragDeltaX = 0.0f;
            this.mDragDeltaY = 0.0f;
            mapView.invalidate();
        }
        return hitTest;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.mDraggable && this.mIsDragged) {
            if (motionEvent.getAction() == 1) {
                this.mDragDeltaX = motionEvent.getX() - this.mDragStartX;
                float y = motionEvent.getY() - this.mDragStartY;
                this.mOffsetX = (int) (this.mOffsetX + this.mDragDeltaX);
                this.mOffsetY = (int) (this.mOffsetY + y);
                this.mDragDeltaX = 0.0f;
                this.mDragDeltaY = 0.0f;
                this.mIsDragged = false;
            } else if (motionEvent.getAction() == 2) {
                this.mDragDeltaX = motionEvent.getX() - this.mDragStartX;
                this.mDragDeltaY = motionEvent.getY() - this.mDragStartY;
            }
            mapView.invalidate();
            return true;
        }
        return false;
    }

    public void setBackground(Paint paint) {
        this.mBackground = paint;
    }

    public void setDragBackground(Paint paint) {
        this.mDragBackground = paint;
    }

    public void setDragForeground(Paint paint) {
        this.mDragForeground = paint;
    }

    public void setForeground(Paint paint) {
        this.mForeground = paint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.mGeoPoint = geoPoint;
    }

    public void setMargin(int i) {
        this.mMargin = i;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setRadius(long j) {
        this.mRadius = j;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
