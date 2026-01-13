package org.osmdroid.views.overlay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.Projection;
@Deprecated
/* loaded from: classes3.dex */
public class GroundOverlay4 extends Overlay {
    private GeoPoint mBottomLeft;
    private GeoPoint mBottomRight;
    private Bitmap mImage;
    private GeoPoint mTopLeft;
    private GeoPoint mTopRight;
    public float mTransparency;
    private final Paint mPaint = new Paint();
    private Matrix mMatrix = new Matrix();
    private final float[] mMatrixSrc = new float[8];
    private final float[] mMatrixDst = new float[8];
    public float mBearing = 0.0f;

    public GroundOverlay4() {
        setTransparency(0.0f);
    }

    public void computeMatrix(Projection projection) {
        long longPixelXFromLongitude = projection.getLongPixelXFromLongitude(this.mTopLeft.getLongitude());
        long longPixelYFromLatitude = projection.getLongPixelYFromLatitude(this.mTopLeft.getLatitude());
        long longPixelXFromLongitude2 = projection.getLongPixelXFromLongitude(this.mTopRight.getLongitude());
        long longPixelYFromLatitude2 = projection.getLongPixelYFromLatitude(this.mTopRight.getLatitude());
        long longPixelXFromLongitude3 = projection.getLongPixelXFromLongitude(this.mBottomRight.getLongitude());
        long longPixelYFromLatitude3 = projection.getLongPixelYFromLatitude(this.mBottomRight.getLatitude());
        long longPixelXFromLongitude4 = projection.getLongPixelXFromLongitude(this.mBottomLeft.getLongitude());
        long longPixelYFromLatitude4 = projection.getLongPixelYFromLatitude(this.mBottomLeft.getLatitude());
        float[] fArr = this.mMatrixDst;
        fArr[0] = (float) longPixelXFromLongitude;
        fArr[1] = (float) longPixelYFromLatitude;
        fArr[2] = (float) longPixelXFromLongitude2;
        fArr[3] = (float) longPixelYFromLatitude2;
        fArr[4] = (float) longPixelXFromLongitude3;
        fArr[5] = (float) longPixelYFromLatitude3;
        fArr[6] = (float) longPixelXFromLongitude4;
        fArr[7] = (float) longPixelYFromLatitude4;
        getMatrix().setPolyToPoly(this.mMatrixSrc, 0, this.mMatrixDst, 0, 4);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (this.mImage == null) {
            return;
        }
        computeMatrix(projection);
        canvas.drawBitmap(getImage(), getMatrix(), getPaint());
    }

    public float getBearing() {
        return this.mBearing;
    }

    public Bitmap getImage() {
        return this.mImage;
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    public float getTransparency() {
        return this.mTransparency;
    }

    public void setBearing(float f) {
        this.mBearing = f;
    }

    public void setImage(Bitmap bitmap) {
        this.mImage = bitmap;
        if (getImage() == null) {
            return;
        }
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        float[] fArr = this.mMatrixSrc;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = width;
        fArr[2] = f;
        fArr[3] = 0.0f;
        fArr[4] = f;
        float f2 = height;
        fArr[5] = f2;
        fArr[6] = 0.0f;
        fArr[7] = f2;
    }

    public void setPosition(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3, GeoPoint geoPoint4) {
        this.mTopLeft = new GeoPoint(geoPoint);
        this.mTopRight = new GeoPoint(geoPoint2);
        this.mBottomRight = new GeoPoint(geoPoint3);
        this.mBottomLeft = new GeoPoint(geoPoint4);
    }

    public void setTransparency(float f) {
        this.mTransparency = f;
        this.mPaint.setAlpha(255 - ((int) (f * 255.0f)));
    }
}
