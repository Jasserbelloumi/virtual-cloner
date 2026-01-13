package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @KeepForSdk
    public boolean equals(@o0OO00OO Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass().isInstance(obj)) {
            FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
            for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
                if (isFieldSet(field)) {
                    if (!fastJsonResponse.isFieldSet(field) || !Objects.equal(getFieldValue(field), fastJsonResponse.getFieldValue(field))) {
                        return false;
                    }
                } else if (fastJsonResponse.isFieldSet(field)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    @o0OO00OO
    public Object getValueObject(@oo0oO0 String str) {
        return null;
    }

    @KeepForSdk
    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                i = (i * 31) + Preconditions.checkNotNull(getFieldValue(field)).hashCode();
            }
        }
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    public boolean isPrimitiveFieldSet(@oo0oO0 String str) {
        return false;
    }

    @oo0oO0
    @KeepForSdk
    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
