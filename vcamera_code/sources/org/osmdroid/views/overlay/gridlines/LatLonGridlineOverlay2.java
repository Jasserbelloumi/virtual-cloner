package org.osmdroid.views.overlay.gridlines;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import java.text.DecimalFormat;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Overlay;
/* loaded from: classes3.dex */
public class LatLonGridlineOverlay2 extends Overlay {
    public DecimalFormat mDecimalFormatter = new DecimalFormat("#.#####");
    public float mMultiplier = 1.0f;
    public Paint mLinePaint = new Paint();
    public Paint mTextBackgroundPaint = new Paint();
    public Paint mTextPaint = new Paint();
    public GeoPoint mOptimizationGeoPoint = new GeoPoint(0.0d, 0.0d);
    public Point mOptimizationPoint = new Point();

    public LatLonGridlineOverlay2() {
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStyle(Paint.Style.STROKE);
        this.mTextBackgroundPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setStyle(Paint.Style.STROKE);
        this.mTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        setLineColor(-16777216);
        setFontColor(-1);
        setBackgroundColor(-16777216);
        setLineWidth(1.0f);
        setFontSizeDp((short) 32);
    }

    private double computeStartLatitude(double d, double d2) {
        double round = Math.round(d / d2) * d2;
        while (round > MapView.getTileSystem().getMaxLatitude()) {
            round -= d2;
        }
        while (round < MapView.getTileSystem().getMinLatitude()) {
            round += d2;
        }
        return round;
    }

    private String formatCoordinate(double d, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mDecimalFormatter.format(d));
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        sb.append(i == 0 ? "" : i > 0 ? z ? "N" : "E" : z ? "S" : "W");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    @Override // org.osmdroid.views.overlay.Overlay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r49, org.osmdroid.views.Projection r50) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.gridlines.LatLonGridlineOverlay2.draw(android.graphics.Canvas, org.osmdroid.views.Projection):void");
    }

    public double getIncrementor(int i) {
        double d;
        switch (i) {
            case 0:
            case 1:
                d = 30.0d;
                break;
            case 2:
                d = 15.0d;
                break;
            case 3:
                d = 9.0d;
                break;
            case 4:
                d = 6.0d;
                break;
            case 5:
                d = 3.0d;
                break;
            case 6:
                d = 2.0d;
                break;
            case 7:
                d = 1.0d;
                break;
            case 8:
                d = 0.5d;
                break;
            case 9:
                d = 0.25d;
                break;
            case 10:
                d = 0.1d;
                break;
            case 11:
                d = 0.05d;
                break;
            case 12:
                d = 0.025d;
                break;
            case 13:
                d = 0.0125d;
                break;
            case 14:
                d = 0.00625d;
                break;
            case 15:
                d = 0.003125d;
                break;
            case 16:
                d = 0.0015625d;
                break;
            case 17:
                d = 7.8125E-4d;
                break;
            case 18:
                d = 3.90625E-4d;
                break;
            case 19:
                d = 1.953125E-4d;
                break;
            case 20:
                d = 9.765625E-5d;
                break;
            case 21:
                d = 4.8828125E-5d;
                break;
            case 22:
                d = 2.44140625E-5d;
                break;
            case 23:
                d = 1.220703125E-5d;
                break;
            case 24:
                d = 6.103515625E-6d;
                break;
            case 25:
                d = 3.0517578125E-6d;
                break;
            case 26:
                d = 1.52587890625E-6d;
                break;
            case 27:
                d = 7.62939453125E-7d;
                break;
            case 28:
                d = 3.814697265625E-7d;
                break;
            default:
                d = 1.9073486328125E-7d;
                break;
        }
        return this.mMultiplier * d;
    }

    public Paint getTextPaint() {
        return this.mTextPaint;
    }

    public void setBackgroundColor(int i) {
        this.mTextBackgroundPaint.setColor(i);
    }

    public void setDecimalFormatter(DecimalFormat decimalFormat) {
        this.mDecimalFormatter = decimalFormat;
    }

    public void setFontColor(int i) {
        this.mTextPaint.setColor(i);
    }

    public void setFontSizeDp(short s) {
        this.mTextPaint.setTextSize(s);
    }

    public void setLineColor(int i) {
        this.mLinePaint.setColor(i);
    }

    public void setLineWidth(float f) {
        this.mLinePaint.setStrokeWidth(f);
    }

    public void setMultiplier(float f) {
        this.mMultiplier = f;
    }

    public void setTextPaint(Paint paint) {
        this.mTextPaint = paint;
    }

    public void setTextStyle(Paint.Style style) {
        this.mTextPaint.setStyle(style);
    }
}
