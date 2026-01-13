package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import javax.annotation.Nullable;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface IMapFragmentDelegate extends IInterface {
    @oo0oO0
    IGoogleMapDelegate getMap() throws RemoteException;

    void getMapAsync(zzas zzasVar) throws RemoteException;

    boolean isReady() throws RemoteException;

    void onCreate(@oo0oO0 Bundle bundle) throws RemoteException;

    @oo0oO0
    IObjectWrapper onCreateView(@oo0oO0 IObjectWrapper iObjectWrapper, @oo0oO0 IObjectWrapper iObjectWrapper2, @oo0oO0 Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onEnterAmbient(@oo0oO0 Bundle bundle) throws RemoteException;

    void onExitAmbient() throws RemoteException;

    void onInflate(@oo0oO0 IObjectWrapper iObjectWrapper, @Nullable GoogleMapOptions googleMapOptions, @oo0oO0 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(@oo0oO0 Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
