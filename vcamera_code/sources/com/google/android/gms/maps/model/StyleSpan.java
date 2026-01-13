package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzw();
    @SafeParcelable.Field(getter = "getStyle", id = 2)
    private final StrokeStyle zza;
    @SafeParcelable.Field(getter = "getSegments", id = 3)
    private final double zzb;

    public StyleSpan(int i) {
        this.zza = StrokeStyle.colorBuilder(i).build();
        this.zzb = 1.0d;
    }

    public StyleSpan(int i, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.zza = StrokeStyle.colorBuilder(i).build();
        this.zzb = d;
    }

    public StyleSpan(@oo0oO0 StrokeStyle strokeStyle) {
        this.zza = strokeStyle;
        this.zzb = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@SafeParcelable.Param(id = 2) @oo0oO0 StrokeStyle strokeStyle, @SafeParcelable.Param(id = 3) double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.zza = strokeStyle;
        this.zzb = d;
    }

    public double getSegments() {
        return this.zzb;
    }

    @oo0oO0
    public StrokeStyle getStyle() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
