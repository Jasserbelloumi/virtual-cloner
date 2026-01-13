package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    @oo0oO0
    IObjectWrapper newCameraPosition(@oo0oO0 CameraPosition cameraPosition) throws RemoteException;

    @oo0oO0
    IObjectWrapper newLatLng(@oo0oO0 LatLng latLng) throws RemoteException;

    @oo0oO0
    IObjectWrapper newLatLngBounds(@oo0oO0 LatLngBounds latLngBounds, int i) throws RemoteException;

    @oo0oO0
    IObjectWrapper newLatLngBoundsWithSize(@oo0oO0 LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    @oo0oO0
    IObjectWrapper newLatLngZoom(@oo0oO0 LatLng latLng, float f) throws RemoteException;

    @oo0oO0
    IObjectWrapper scrollBy(float f, float f2) throws RemoteException;

    @oo0oO0
    IObjectWrapper zoomBy(float f) throws RemoteException;

    @oo0oO0
    IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws RemoteException;

    @oo0oO0
    IObjectWrapper zoomIn() throws RemoteException;

    @oo0oO0
    IObjectWrapper zoomOut() throws RemoteException;

    @oo0oO0
    IObjectWrapper zoomTo(float f) throws RemoteException;
}
