package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfl;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @oo0oO0
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @oo0oO0
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @oo0oO0
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @oo0oO0
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzi zziVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(zzfl zzflVar) {
        this.zza = zzflVar.zza;
        this.zzb = zzflVar.zzb;
        this.zzc = zzflVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}
