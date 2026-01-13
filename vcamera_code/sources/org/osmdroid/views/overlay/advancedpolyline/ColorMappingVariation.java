package org.osmdroid.views.overlay.advancedpolyline;
/* loaded from: classes3.dex */
public abstract class ColorMappingVariation extends ColorMappingForScalar {
    private float mEnd;
    private float mScalarEnd;
    private float mScalarStart;
    private float mSlope;
    private float mStart;

    @Override // org.osmdroid.views.overlay.advancedpolyline.ColorMappingForScalar
    public int computeColor(float f) {
        return ColorHelper.HSLToColor(getHue(f), getSaturation(f), getLuminance(f));
    }

    public abstract float getHue(float f);

    public abstract float getLuminance(float f);

    public abstract float getSaturation(float f);

    public void init(float f, float f2, float f3, float f4) {
        this.mScalarStart = f;
        this.mScalarEnd = f2;
        this.mStart = f3;
        this.mEnd = f4;
        this.mSlope = f2 == f ? 1.0f : (f4 - f3) / (f2 - f);
    }

    public float mapScalar(float f) {
        if (f >= this.mScalarEnd) {
            return this.mEnd;
        }
        float f2 = this.mScalarStart;
        return f <= f2 ? this.mStart : ((f - f2) * this.mSlope) + this.mStart;
    }
}
