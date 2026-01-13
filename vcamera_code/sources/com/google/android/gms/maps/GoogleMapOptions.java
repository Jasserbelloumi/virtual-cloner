package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @oo0oO0
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, (int) HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION));
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;
    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;
    @o0OO00OO
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;
    @o0O00O
    @o0OO00OO
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b, @SafeParcelable.Param(id = 3) byte b2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) @o0OO00OO CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b3, @SafeParcelable.Param(id = 7) byte b4, @SafeParcelable.Param(id = 8) byte b5, @SafeParcelable.Param(id = 9) byte b6, @SafeParcelable.Param(id = 10) byte b7, @SafeParcelable.Param(id = 11) byte b8, @SafeParcelable.Param(id = 12) byte b9, @SafeParcelable.Param(id = 14) byte b10, @SafeParcelable.Param(id = 15) byte b11, @SafeParcelable.Param(id = 16) @o0OO00OO Float f, @SafeParcelable.Param(id = 17) @o0OO00OO Float f2, @SafeParcelable.Param(id = 18) @o0OO00OO LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b12, @o0O00O @SafeParcelable.Param(id = 20) @o0OO00OO Integer num, @SafeParcelable.Param(id = 21) @o0OO00OO String str) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzs = num;
        this.zzt = str;
    }

    @o0OO00OO
    public static GoogleMapOptions createFromAttributes(@o0OO00OO Context context, @o0OO00OO AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i, -1));
        }
        int i2 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i15 = R.styleable.MapAttrs_backgroundColor;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes.getColor(i15, zza.intValue())));
        }
        int i16 = R.styleable.MapAttrs_mapId;
        if (obtainAttributes.hasValue(i16) && (string = obtainAttributes.getString(i16)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @o0OO00OO
    public static CameraPosition zza(@o0OO00OO Context context, @o0OO00OO AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_cameraTargetLat;
        float f = obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i2 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng(f, obtainAttributes.hasValue(i2) ? obtainAttributes.getFloat(i2, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i3 = R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i3)) {
            builder.zoom(obtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i4)) {
            builder.bearing(obtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i5)) {
            builder.tilt(obtainAttributes.getFloat(i5, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    @o0OO00OO
    public static LatLngBounds zzb(@o0OO00OO Context context, @o0OO00OO AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i2) ? Float.valueOf(obtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i3) ? Float.valueOf(obtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    @oo0oO0
    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzn = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions backgroundColor(@o0O00O @o0OO00OO Integer num) {
        this.zzs = num;
        return this;
    }

    @oo0oO0
    public GoogleMapOptions camera(@o0OO00OO CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    @oo0oO0
    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    @o0OO00OO
    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    @o0O00O
    @o0OO00OO
    public Integer getBackgroundColor() {
        return this.zzs;
    }

    @o0OO00OO
    public CameraPosition getCamera() {
        return this.zze;
    }

    @o0OO00OO
    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    @o0OO00OO
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    @o0OO00OO
    public Boolean getLiteMode() {
        return this.zzl;
    }

    @o0OO00OO
    public String getMapId() {
        return this.zzt;
    }

    @o0OO00OO
    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    @o0OO00OO
    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    @o0OO00OO
    public Float getMinZoomPreference() {
        return this.zzo;
    }

    @o0OO00OO
    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    @o0OO00OO
    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    @o0OO00OO
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    @o0OO00OO
    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    @o0OO00OO
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    @o0OO00OO
    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    @o0OO00OO
    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    @o0OO00OO
    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    @oo0oO0
    public GoogleMapOptions latLngBoundsForCameraTarget(@o0OO00OO LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    @oo0oO0
    public GoogleMapOptions liteMode(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions mapId(@oo0oO0 String str) {
        this.zzt = str;
        return this;
    }

    @oo0oO0
    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions mapType(int i) {
        this.zzd = i;
        return this;
    }

    @oo0oO0
    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzp = Float.valueOf(f);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions minZoomPreference(float f) {
        this.zzo = Float.valueOf(f);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzr = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).toString();
    }

    @oo0oO0
    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzc = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    @oo0oO0
    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }
}
