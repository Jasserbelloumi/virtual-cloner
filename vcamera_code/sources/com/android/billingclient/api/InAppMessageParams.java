package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class InAppMessageParams {
    private final ArrayList zza;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Set zza = new HashSet();

        @oo0oO0
        public Builder addAllInAppMessageCategoriesToShow() {
            this.zza.add(2);
            return this;
        }

        @oo0oO0
        public Builder addInAppMessageCategoryToShow(int i) {
            this.zza.add(Integer.valueOf(i));
            return this;
        }

        @oo0oO0
        public InAppMessageParams build() {
            return new InAppMessageParams(this.zza, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(Set set, zzba zzbaVar) {
        this.zza = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder();
    }

    public final ArrayList zza() {
        return this.zza;
    }
}
