package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class Projection {
    private final IProjectionDelegate zza;

    public Projection(IProjectionDelegate iProjectionDelegate) {
        this.zza = iProjectionDelegate;
    }

    @oo0oO0
    public LatLng fromScreenLocation(@oo0oO0 Point point) {
        Preconditions.checkNotNull(point);
        try {
            return this.zza.fromScreenLocation(ObjectWrapper.wrap(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public VisibleRegion getVisibleRegion() {
        try {
            return this.zza.getVisibleRegion();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public Point toScreenLocation(@oo0oO0 LatLng latLng) {
        Preconditions.checkNotNull(latLng);
        try {
            return (Point) ObjectWrapper.unwrap(this.zza.toScreenLocation(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
