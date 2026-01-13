package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface SafeParcelable extends Parcelable {
    @oo0oO0
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: classes.dex */
    public @interface Class {
        @oo0oO0
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: classes.dex */
    public @interface Constructor {
    }

    /* loaded from: classes.dex */
    public @interface Field {
        @oo0oO0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @oo0oO0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @oo0oO0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @oo0oO0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes.dex */
    public @interface Indicator {
        @oo0oO0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes.dex */
    public @interface Param {
        int id();
    }

    /* loaded from: classes.dex */
    public @interface RemovedParam {
        @oo0oO0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @oo0oO0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* loaded from: classes.dex */
    public @interface Reserved {
        @oo0oO0
        int[] value();
    }

    /* loaded from: classes.dex */
    public @interface VersionField {
        @oo0oO0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @oo0oO0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
