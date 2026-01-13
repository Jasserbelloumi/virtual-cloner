package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface MediationAdRequest {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @oo0oO0
    @Deprecated
    Date getBirthday();

    @Deprecated
    int getGender();

    @oo0oO0
    Set<String> getKeywords();

    @oo0oO0
    Location getLocation();

    @Deprecated
    boolean isDesignedForFamilies();

    boolean isTesting();

    int taggedForChildDirectedTreatment();
}
