package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzber;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    @o0OO00OO
    Drawable getMainImage();

    @oo0oO0
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(@o0OO00OO Drawable drawable);

    @o0OO00OO
    zzber zza();
}
