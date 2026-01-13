package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate zza;

    /* loaded from: classes2.dex */
    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(@oo0oO0 StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* loaded from: classes2.dex */
    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(@oo0oO0 StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* loaded from: classes2.dex */
    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(@oo0oO0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* loaded from: classes2.dex */
    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(@oo0oO0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(@oo0oO0 IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zza = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
    }

    public void animateTo(@oo0oO0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        Preconditions.checkNotNull(streetViewPanoramaCamera);
        try {
            this.zza.animateTo(streetViewPanoramaCamera, j);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public StreetViewPanoramaLocation getLocation() {
        try {
            return this.zza.getStreetViewPanoramaLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zza.getPanoramaCamera();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zza.isPanningGesturesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zza.isStreetNamesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zza.isUserNavigationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zza.isZoomGesturesEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @o0OO00OO
    public Point orientationToPoint(@oo0oO0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            IObjectWrapper orientationToPoint = this.zza.orientationToPoint(streetViewPanoramaOrientation);
            if (orientationToPoint == null) {
                return null;
            }
            return (Point) ObjectWrapper.unwrap(orientationToPoint);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @oo0oO0
    public StreetViewPanoramaOrientation pointToOrientation(@oo0oO0 Point point) {
        try {
            return this.zza.pointToOrientation(ObjectWrapper.wrap(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(@o0OO00OO OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        try {
            if (onStreetViewPanoramaCameraChangeListener == null) {
                this.zza.setOnStreetViewPanoramaCameraChangeListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaCameraChangeListener(new zzaj(this, onStreetViewPanoramaCameraChangeListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(@o0OO00OO OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        try {
            if (onStreetViewPanoramaChangeListener == null) {
                this.zza.setOnStreetViewPanoramaChangeListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaChangeListener(new zzai(this, onStreetViewPanoramaChangeListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaClickListener(@o0OO00OO OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        try {
            if (onStreetViewPanoramaClickListener == null) {
                this.zza.setOnStreetViewPanoramaClickListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaClickListener(new zzak(this, onStreetViewPanoramaClickListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(@o0OO00OO OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        try {
            if (onStreetViewPanoramaLongClickListener == null) {
                this.zza.setOnStreetViewPanoramaLongClickListener(null);
            } else {
                this.zza.setOnStreetViewPanoramaLongClickListener(new zzal(this, onStreetViewPanoramaLongClickListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPanningGesturesEnabled(boolean z) {
        try {
            this.zza.enablePanning(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(@oo0oO0 LatLng latLng) {
        try {
            this.zza.setPosition(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(@oo0oO0 LatLng latLng, int i) {
        try {
            this.zza.setPositionWithRadius(latLng, i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(@oo0oO0 LatLng latLng, int i, @o0OO00OO StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithRadiusAndSource(latLng, i, streetViewSource);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(@oo0oO0 LatLng latLng, @o0OO00OO StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithSource(latLng, streetViewSource);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setPosition(@oo0oO0 String str) {
        try {
            this.zza.setPositionWithID(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setStreetNamesEnabled(boolean z) {
        try {
            this.zza.enableStreetNames(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setUserNavigationEnabled(boolean z) {
        try {
            this.zza.enableUserNavigation(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZoomGesturesEnabled(boolean z) {
        try {
            this.zza.enableZoom(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
