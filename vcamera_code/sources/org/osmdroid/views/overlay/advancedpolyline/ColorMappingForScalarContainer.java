package org.osmdroid.views.overlay.advancedpolyline;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ColorMappingForScalarContainer {
    private final ColorMappingForScalar mInnerMapping;
    private final List<Float> mScalars = new ArrayList();
    private float mScalarMin = Float.MAX_VALUE;
    private float mScalarMax = Float.MIN_VALUE;

    public ColorMappingForScalarContainer(ColorMappingForScalar colorMappingForScalar) {
        this.mInnerMapping = colorMappingForScalar;
    }

    public void add(float f) {
        this.mInnerMapping.add(f);
        this.mScalars.add(Float.valueOf(f));
        if (this.mScalarMin > f) {
            this.mScalarMin = f;
        }
        if (this.mScalarMax < f) {
            this.mScalarMax = f;
        }
    }

    public ColorMappingForScalar getMappingForScalar() {
        return this.mInnerMapping;
    }

    public float getScalarMax() {
        return this.mScalarMax;
    }

    public float getScalarMin() {
        return this.mScalarMin;
    }

    public void refresh() {
        int i = 0;
        for (Float f : this.mScalars) {
            this.mInnerMapping.set(i, f.floatValue());
            i++;
        }
    }

    public int size() {
        return this.mScalars.size();
    }
}
