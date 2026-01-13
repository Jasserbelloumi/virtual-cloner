package org.osmdroid.views.overlay.advancedpolyline;

import java.util.Map;
import java.util.SortedMap;
/* loaded from: classes3.dex */
public class ColorMappingRanges extends ColorMappingForScalar {
    private final SortedMap<Float, Integer> mColorRanges;
    private final boolean mStrictComparison;

    public ColorMappingRanges(SortedMap<Float, Integer> sortedMap, boolean z) {
        this.mColorRanges = sortedMap;
        this.mStrictComparison = z;
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.ColorMappingForScalar
    public int computeColor(float f) {
        Integer num;
        int i = 0;
        for (Map.Entry<Float, Integer> entry : this.mColorRanges.entrySet()) {
            if (this.mStrictComparison) {
                if (f < entry.getKey().floatValue()) {
                    num = entry.getValue();
                    break;
                }
                i++;
            } else if (f <= entry.getKey().floatValue()) {
                num = entry.getValue();
                break;
            } else {
                i++;
            }
        }
        if (i == this.mColorRanges.size()) {
            SortedMap<Float, Integer> sortedMap = this.mColorRanges;
            num = sortedMap.get(sortedMap.lastKey());
            return num.intValue();
        }
        return 0;
    }
}
