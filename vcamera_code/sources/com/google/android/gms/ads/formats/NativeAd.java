package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class NativeAd {
    @oo0oO0
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class AdChoicesInfo {
        @oo0oO0
        public abstract List<Image> getImages();

        @oo0oO0
        public abstract CharSequence getText();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class Image {
        @oo0oO0
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @oo0oO0
        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    @Deprecated
    public abstract void performClick(@oo0oO0 Bundle bundle);

    @Deprecated
    public abstract boolean recordImpression(@oo0oO0 Bundle bundle);

    @Deprecated
    public abstract void reportTouchEvent(@oo0oO0 Bundle bundle);
}
