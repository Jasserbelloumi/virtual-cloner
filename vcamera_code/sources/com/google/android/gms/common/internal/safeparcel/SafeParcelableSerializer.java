package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    @oo0oO0
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromBytes(@oo0oO0 byte[] bArr, @oo0oO0 Parcelable.Creator<T> creator) {
        Preconditions.checkNotNull(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @o0OO00OO
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromIntentExtra(@oo0oO0 Intent intent, @oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    @oo0oO0
    @KeepForSdk
    public static <T extends SafeParcelable> T deserializeFromString(@oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00OO
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(@oo0oO0 Bundle bundle, @oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @o0OO00OO
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(@oo0oO0 Bundle bundle, @oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    @o0OO00OO
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(@o0OO00OO byte[] bArr, @oo0oO0 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00OO
    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(@oo0oO0 Intent intent, @oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @o0OO00OO
    @KeepForSdk
    public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(@oo0oO0 Intent intent, @oo0oO0 String str, @oo0oO0 Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToBundle(@oo0oO0 Iterable<T> iterable, @oo0oO0 Bundle bundle, @oo0oO0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(serializeToBytes(t));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void serializeIterableToBundleSafe(@oo0oO0 Iterable<T> iterable, @oo0oO0 Bundle bundle, @oo0oO0 String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @KeepForSdk
    @Deprecated
    public static <T extends SafeParcelable> void serializeIterableToIntentExtra(@oo0oO0 Iterable<T> iterable, @oo0oO0 Intent intent, @oo0oO0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(serializeToBytes(t));
        }
        intent.putExtra(str, arrayList);
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(@oo0oO0 Iterable<T> iterable, @oo0oO0 Intent intent, @oo0oO0 String str) {
        intent.putExtra(str, zza(iterable));
    }

    @oo0oO0
    @KeepForSdk
    public static <T extends SafeParcelable> byte[] serializeToBytes(@oo0oO0 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void serializeToIntentExtra(@oo0oO0 T t, @oo0oO0 Intent intent, @oo0oO0 String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    @oo0oO0
    @KeepForSdk
    public static <T extends SafeParcelable> String serializeToString(@oo0oO0 T t) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    private static byte[] zza(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.zzj(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
