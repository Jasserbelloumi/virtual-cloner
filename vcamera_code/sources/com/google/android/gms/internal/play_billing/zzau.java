package com.google.android.gms.internal.play_billing;

import android.support.v4.media.o00oOOo0;
import o0O00Oo.o0oO0Ooo;
/* loaded from: classes2.dex */
final class zzau extends zzax {
    private final int zzc;

    public zzau(byte[] bArr, int i, int i2) {
        super(bArr);
        zzba.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(o00oOOo0.o00oOOo0("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(o0oO0Ooo.o00oOOo0("Index > length: ", i, ", ", i2));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzax
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzax, com.google.android.gms.internal.play_billing.zzba
    public final int zzd() {
        return this.zzc;
    }
}
