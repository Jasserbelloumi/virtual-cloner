package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import javax.annotation.Nullable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(@oo0oO0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException;

    void enablePanning(boolean z) throws RemoteException;

    void enableStreetNames(boolean z) throws RemoteException;

    void enableUserNavigation(boolean z) throws RemoteException;

    void enableZoom(boolean z) throws RemoteException;

    @oo0oO0
    StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException;

    @oo0oO0
    StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException;

    boolean isPanningGesturesEnabled() throws RemoteException;

    boolean isStreetNamesEnabled() throws RemoteException;

    boolean isUserNavigationEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    @o0OO00OO
    IObjectWrapper orientationToPoint(@oo0oO0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;

    @oo0oO0
    StreetViewPanoramaOrientation pointToOrientation(@oo0oO0 IObjectWrapper iObjectWrapper) throws RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(@Nullable zzbk zzbkVar) throws RemoteException;

    void setOnStreetViewPanoramaChangeListener(@Nullable zzbm zzbmVar) throws RemoteException;

    void setOnStreetViewPanoramaClickListener(@Nullable zzbo zzboVar) throws RemoteException;

    void setOnStreetViewPanoramaLongClickListener(@Nullable zzbq zzbqVar) throws RemoteException;

    void setPosition(@oo0oO0 LatLng latLng) throws RemoteException;

    void setPositionWithID(@oo0oO0 String str) throws RemoteException;

    void setPositionWithRadius(@oo0oO0 LatLng latLng, int i) throws RemoteException;

    void setPositionWithRadiusAndSource(@oo0oO0 LatLng latLng, int i, @Nullable StreetViewSource streetViewSource) throws RemoteException;

    void setPositionWithSource(@oo0oO0 LatLng latLng, @Nullable StreetViewSource streetViewSource) throws RemoteException;
}
