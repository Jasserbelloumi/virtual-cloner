package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzv();
    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final float zza;
    @SafeParcelable.Field(getter = "getColor", id = 3)
    private final int zzb;
    @SafeParcelable.Field(getter = "getToColor", id = 4)
    private final int zzc;
    @SafeParcelable.Field(getter = "isVisible", id = 5)
    private final boolean zzd;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getStamp", id = 6)
    private final StampStyle zze;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private float zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        @o0OO00OO
        private StampStyle zze;

        private Builder() {
        }

        public Builder(@oo0oO0 StrokeStyle strokeStyle) {
            this.zza = strokeStyle.zza();
            Pair zzb = strokeStyle.zzb();
            this.zzb = ((Integer) zzb.first).intValue();
            this.zzc = ((Integer) zzb.second).intValue();
            this.zzd = strokeStyle.isVisible();
            this.zze = strokeStyle.getStamp();
        }

        public /* synthetic */ Builder(zzu zzuVar) {
        }

        @oo0oO0
        public StrokeStyle build() {
            return new StrokeStyle(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @oo0oO0
        public Builder stamp(@oo0oO0 StampStyle stampStyle) {
            this.zze = stampStyle;
            return this;
        }

        @oo0oO0
        public final Builder zza(int i) {
            this.zzb = i;
            this.zzc = i;
            return this;
        }

        @oo0oO0
        public final Builder zzb(int i, int i2) {
            this.zzb = i;
            this.zzc = i2;
            return this;
        }

        @oo0oO0
        public final Builder zzc(boolean z) {
            this.zzd = z;
            return this;
        }

        @oo0oO0
        public final Builder zzd(float f) {
            this.zza = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StrokeStyle(@SafeParcelable.Param(id = 2) float f, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) @o0OO00OO StampStyle stampStyle) {
        this.zza = f;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = stampStyle;
    }

    @oo0oO0
    public static Builder colorBuilder(int i) {
        Builder builder = new Builder((zzu) null);
        builder.zza(i);
        return builder;
    }

    @oo0oO0
    public static Builder gradientBuilder(int i, int i2) {
        Builder builder = new Builder((zzu) null);
        builder.zzb(i, i2);
        return builder;
    }

    @oo0oO0
    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzu) null);
        builder.zza(0);
        return builder;
    }

    @o0OO00OO
    public StampStyle getStamp() {
        return this.zze;
    }

    public boolean isVisible() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zza;
    }

    @oo0oO0
    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }
}
