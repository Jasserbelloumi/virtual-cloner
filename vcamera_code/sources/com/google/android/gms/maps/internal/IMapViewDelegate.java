package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface IMapViewDelegate extends IInterface {
    @oo0oO0
    IGoogleMapDelegate getMap() throws RemoteException;

    void getMapAsync(zzas zzasVar) throws RemoteException;

    @oo0oO0
    IObjectWrapper getView() throws RemoteException;

    void onCreate(@oo0oO0 Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onEnterAmbient(@oo0oO0 Bundle bundle) throws RemoteException;

    void onExitAmbient() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(@oo0oO0 Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
