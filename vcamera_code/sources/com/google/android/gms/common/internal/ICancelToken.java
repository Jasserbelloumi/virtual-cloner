package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface ICancelToken extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @oo0oO0
        public static ICancelToken asInterface(@oo0oO0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof ICancelToken ? (ICancelToken) queryLocalInterface : new zzw(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, @oo0oO0 Parcel parcel, @oo0oO0 Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                cancel();
                return true;
            }
            return false;
        }
    }

    void cancel() throws RemoteException;
}
