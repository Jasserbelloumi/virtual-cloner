package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class MapView extends FrameLayout {
    private final zzah zza;

    public MapView(@oo0oO0 Context context) {
        super(context);
        this.zza = new zzah(this, context, null);
        setClickable(true);
    }

    public MapView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzah(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new zzah(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@oo0oO0 Context context, @o0OO00OO GoogleMapOptions googleMapOptions) {
        super(context);
        this.zza = new zzah(this, context, googleMapOptions);
        setClickable(true);
    }

    public void getMapAsync(@oo0oO0 OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zza(onMapReadyCallback);
    }

    public void onCreate(@o0OO00OO Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zza.onCreate(bundle);
            if (this.zza.getDelegate() == null) {
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zza.onDestroy();
    }

    public void onEnterAmbient(@o0OO00OO Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        zzah zzahVar = this.zza;
        if (zzahVar.getDelegate() != null) {
            ((zzag) zzahVar.getDelegate()).zza(bundle);
        }
    }

    public void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        zzah zzahVar = this.zza;
        if (zzahVar.getDelegate() != null) {
            ((zzag) zzahVar.getDelegate()).zzb();
        }
    }

    public void onLowMemory() {
        this.zza.onLowMemory();
    }

    public void onPause() {
        this.zza.onPause();
    }

    public void onResume() {
        this.zza.onResume();
    }

    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
    }
}
