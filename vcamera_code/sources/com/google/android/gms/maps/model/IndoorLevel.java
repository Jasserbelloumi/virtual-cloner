package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzu zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar);
    }

    public void activate() {
        try {
            this.zza.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (obj instanceof IndoorLevel) {
            try {
                return this.zza.zzh(((IndoorLevel) obj).zza);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        return false;
    }

    @oo0oO0
    public String getName() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public String getShortName() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
