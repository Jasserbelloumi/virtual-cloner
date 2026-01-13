package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AdView extends BaseAdView {
    public AdView(@oo0oO0 Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    @oo0oO0
    public final VideoController zza() {
        return this.zza.zzf();
    }
}
