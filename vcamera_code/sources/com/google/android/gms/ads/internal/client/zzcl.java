package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbnf;
/* loaded from: classes.dex */
public interface zzcl extends IInterface {
    zzbnf getAdapterCreator() throws RemoteException;

    zzen getLiteSdkVersion() throws RemoteException;
}
