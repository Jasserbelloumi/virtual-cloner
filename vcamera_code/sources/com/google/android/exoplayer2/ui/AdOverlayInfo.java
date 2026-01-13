package com.google.android.exoplayer2.ui;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;
    @o0OO00OO
    public final String reasonDetail;
    public final View view;

    /* loaded from: classes.dex */
    public static final class Builder {
        @o0OO00OO
        private String detailedReason;
        private final int purpose;
        private final View view;

        public Builder(View view, int i) {
            this.view = view;
            this.purpose = i;
        }

        public AdOverlayInfo build() {
            return new AdOverlayInfo(this.view, this.purpose, this.detailedReason);
        }

        public Builder setDetailedReason(@o0OO00OO String str) {
            this.detailedReason = str;
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Purpose {
    }

    @Deprecated
    public AdOverlayInfo(View view, int i) {
        this(view, i, null);
    }

    @Deprecated
    public AdOverlayInfo(View view, int i, @o0OO00OO String str) {
        this.view = view;
        this.purpose = i;
        this.reasonDetail = str;
    }
}
