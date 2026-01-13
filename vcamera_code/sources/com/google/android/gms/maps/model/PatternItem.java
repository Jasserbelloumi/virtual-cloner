package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class PatternItem extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    @o0OO00OO
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;
    private static final String zza = "PatternItem";
    @oo0oO0
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) @o0OO00OO Float f) {
        boolean z = false;
        if (i == 1 || (f != null && f.floatValue() >= 0.0f)) {
            z = true;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.zzb = i;
        this.zzc = f;
    }

    @o0OO00OO
    public static List zza(@o0OO00OO List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem patternItem = (PatternItem) it.next();
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i = patternItem.zzb;
                if (i == 0) {
                    Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new Dash(patternItem.zzc.floatValue());
                } else if (i == 1) {
                    patternItem = new Dot();
                } else if (i == 2) {
                    Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new Gap(patternItem.zzc.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PatternItem) {
            PatternItem patternItem = (PatternItem) obj;
            return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    @oo0oO0
    public String toString() {
        int i = this.zzb;
        Float f = this.zzc;
        return "[PatternItem: type=" + i + " length=" + f + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
