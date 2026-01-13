package org.osmdroid.views.overlay.simplefastpoint;

import android.graphics.Color;
import android.graphics.Paint;
/* loaded from: classes3.dex */
public class SimpleFastPointOverlayOptions {
    public Paint mPointStyle;
    public Paint mSelectedPointStyle;
    public Paint mTextStyle;
    public float mCircleRadius = 5.0f;
    public float mSelectedCircleRadius = 13.0f;
    public boolean mClickable = true;
    public int mCellSize = 10;
    public RenderingAlgorithm mAlgorithm = RenderingAlgorithm.MAXIMUM_OPTIMIZATION;
    public Shape mSymbol = Shape.SQUARE;
    public LabelPolicy mLabelPolicy = LabelPolicy.ZOOM_THRESHOLD;
    public int mMaxNShownLabels = 250;
    public int mMinZoomShowLabels = 11;

    /* loaded from: classes3.dex */
    public enum LabelPolicy {
        ZOOM_THRESHOLD,
        DENSITY_THRESHOLD
    }

    /* loaded from: classes3.dex */
    public enum RenderingAlgorithm {
        NO_OPTIMIZATION,
        MEDIUM_OPTIMIZATION,
        MAXIMUM_OPTIMIZATION
    }

    /* loaded from: classes3.dex */
    public enum Shape {
        CIRCLE,
        SQUARE
    }

    public SimpleFastPointOverlayOptions() {
        Paint paint = new Paint();
        this.mPointStyle = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPointStyle.setColor(Color.parseColor("#ff7700"));
        Paint paint2 = new Paint();
        this.mSelectedPointStyle = paint2;
        paint2.setStrokeWidth(5.0f);
        this.mSelectedPointStyle.setStyle(Paint.Style.STROKE);
        this.mSelectedPointStyle.setColor(Color.parseColor("#ffff00"));
        Paint paint3 = new Paint();
        this.mTextStyle = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.mTextStyle.setColor(Color.parseColor("#ffff00"));
        this.mTextStyle.setTextAlign(Paint.Align.CENTER);
        this.mTextStyle.setTextSize(24.0f);
    }

    public static SimpleFastPointOverlayOptions getDefaultStyle() {
        return new SimpleFastPointOverlayOptions();
    }

    public RenderingAlgorithm getAlgorithm() {
        return this.mAlgorithm;
    }

    public int getCellSize() {
        return this.mCellSize;
    }

    public float getCircleRadius() {
        return this.mCircleRadius;
    }

    public LabelPolicy getLabelPolicy() {
        return this.mLabelPolicy;
    }

    public int getMaxNShownLabels() {
        return this.mMaxNShownLabels;
    }

    public int getMinZoomShowLabels() {
        return this.mMinZoomShowLabels;
    }

    public Paint getPointStyle() {
        return this.mPointStyle;
    }

    public float getSelectedCircleRadius() {
        return this.mSelectedCircleRadius;
    }

    public Paint getSelectedPointStyle() {
        return this.mSelectedPointStyle;
    }

    public Shape getSymbol() {
        return this.mSymbol;
    }

    public Paint getTextStyle() {
        return this.mTextStyle;
    }

    public boolean isClickable() {
        return this.mClickable;
    }

    public SimpleFastPointOverlayOptions setAlgorithm(RenderingAlgorithm renderingAlgorithm) {
        this.mAlgorithm = renderingAlgorithm;
        return this;
    }

    public SimpleFastPointOverlayOptions setCellSize(int i) {
        this.mCellSize = i;
        return this;
    }

    public SimpleFastPointOverlayOptions setIsClickable(boolean z) {
        this.mClickable = z;
        return this;
    }

    public SimpleFastPointOverlayOptions setLabelPolicy(LabelPolicy labelPolicy) {
        this.mLabelPolicy = labelPolicy;
        return this;
    }

    public SimpleFastPointOverlayOptions setMaxNShownLabels(int i) {
        this.mMaxNShownLabels = i;
        return this;
    }

    public SimpleFastPointOverlayOptions setMinZoomShowLabels(int i) {
        this.mMinZoomShowLabels = i;
        return this;
    }

    public SimpleFastPointOverlayOptions setPointStyle(Paint paint) {
        this.mPointStyle = paint;
        return this;
    }

    public SimpleFastPointOverlayOptions setRadius(float f) {
        this.mCircleRadius = f;
        return this;
    }

    public SimpleFastPointOverlayOptions setSelectedPointStyle(Paint paint) {
        this.mSelectedPointStyle = paint;
        return this;
    }

    public SimpleFastPointOverlayOptions setSelectedRadius(float f) {
        this.mSelectedCircleRadius = f;
        return this;
    }

    public SimpleFastPointOverlayOptions setSymbol(Shape shape) {
        this.mSymbol = shape;
        return this;
    }

    public SimpleFastPointOverlayOptions setTextStyle(Paint paint) {
        this.mTextStyle = paint;
        return this;
    }
}
