package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;
    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float zzb;
    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int zzc;
    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float zzd;
    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean zze;
    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean zzf;
    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap zzh;
    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap zzi;
    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int zzj;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List zzk;
    @SafeParcelable.Field(getter = "getSpans", id = 13)
    private List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) float f2, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) boolean z3, @SafeParcelable.Param(id = 9) @o0OO00OO Cap cap, @SafeParcelable.Param(id = 10) @o0OO00OO Cap cap2, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 12) @o0OO00OO List list2, @SafeParcelable.Param(id = 13) @o0OO00OO List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }

    @oo0oO0
    public PolylineOptions add(@oo0oO0 LatLng latLng) {
        Preconditions.checkNotNull(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @oo0oO0
    public PolylineOptions add(@oo0oO0 LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.zza, latLngArr);
        return this;
    }

    @oo0oO0
    public PolylineOptions addAll(@oo0oO0 Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.zza.add(latLng);
        }
        return this;
    }

    @oo0oO0
    public PolylineOptions addAllSpans(@oo0oO0 Iterable<StyleSpan> iterable) {
        for (StyleSpan styleSpan : iterable) {
            addSpan(styleSpan);
        }
        return this;
    }

    @oo0oO0
    public PolylineOptions addSpan(@oo0oO0 StyleSpan styleSpan) {
        this.zzl.add(styleSpan);
        return this;
    }

    @oo0oO0
    public PolylineOptions addSpan(@oo0oO0 StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    @oo0oO0
    public PolylineOptions clickable(boolean z) {
        this.zzg = z;
        return this;
    }

    @oo0oO0
    public PolylineOptions color(int i) {
        this.zzc = i;
        return this;
    }

    @oo0oO0
    public PolylineOptions endCap(@oo0oO0 Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    @oo0oO0
    public PolylineOptions geodesic(boolean z) {
        this.zzf = z;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    @oo0oO0
    public Cap getEndCap() {
        return this.zzi.zza();
    }

    public int getJointType() {
        return this.zzj;
    }

    @o0OO00OO
    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    @oo0oO0
    public List<LatLng> getPoints() {
        return this.zza;
    }

    @oo0oO0
    public Cap getStartCap() {
        return this.zzh.zza();
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    @oo0oO0
    public PolylineOptions jointType(int i) {
        this.zzj = i;
        return this;
    }

    @oo0oO0
    public PolylineOptions pattern(@o0OO00OO List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @oo0oO0
    public PolylineOptions startCap(@oo0oO0 Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @oo0oO0
    public PolylineOptions visible(boolean z) {
        this.zze = z;
        return this;
    }

    @oo0oO0
    public PolylineOptions width(float f) {
        this.zzb = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.zzb);
            builder.zzc(this.zze);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @oo0oO0
    public PolylineOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }
}
