package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
/* loaded from: classes2.dex */
final class zzaev {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzzv zzzvVar) throws IOException {
        zzzk zzzkVar = (zzzk) zzzvVar;
        int i = 0;
        zzzkVar.zzm(this.zza.zzH(), 0, 1, false);
        int i2 = this.zza.zzH()[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zzzkVar.zzm(this.zza.zzH(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zzH()[i] & 255) + (i5 << 8);
            }
            this.zzb = i4 + 1 + this.zzb;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzzv zzzvVar) throws IOException {
        long zzb;
        int i;
        long zzd = zzzvVar.zzd();
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i2 != 0 && zzd <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = zzd;
        }
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i3 = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzzkVar.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & (-256)) | (this.zza.zzH()[0] & 255);
        }
        long zzb2 = zzb(zzzvVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzd)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zzzvVar) == Long.MIN_VALUE || (zzb = zzb(zzzvVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int i6 = (int) zzb;
                        zzzkVar.zzl(i6, false);
                        this.zzb += i6;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
