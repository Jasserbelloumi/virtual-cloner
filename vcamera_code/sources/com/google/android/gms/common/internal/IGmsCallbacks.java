package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @oo0oO0 IBinder iBinder, @oo0oO0 Bundle bundle) throws RemoteException;

    void zzb(int i, @oo0oO0 Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, zzj zzjVar) throws RemoteException;
}
