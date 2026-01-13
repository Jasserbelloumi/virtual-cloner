package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getJson", id = 2)
    private String zzb;
    private static final String zza = "MapStyleOptions";
    @oo0oO0
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzh();

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(id = 2) @oo0oO0 String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    @oo0oO0
    public static MapStyleOptions loadRawResourceStyle(@oo0oO0 Context context, int i) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), C.UTF8_NAME));
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + obj);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
