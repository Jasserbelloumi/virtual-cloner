package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface IProjectionDelegate extends IInterface {
    @oo0oO0
    LatLng fromScreenLocation(@oo0oO0 IObjectWrapper iObjectWrapper) throws RemoteException;

    @oo0oO0
    VisibleRegion getVisibleRegion() throws RemoteException;

    @oo0oO0
    IObjectWrapper toScreenLocation(@oo0oO0 LatLng latLng) throws RemoteException;
}
