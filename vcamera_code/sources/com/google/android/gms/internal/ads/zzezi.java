package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzezi {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, @o0OO00OO String str, @o0OO00OO Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzc(Bundle bundle, @o0OO00OO String str, @o0OO00OO String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzd(Bundle bundle, @o0OO00OO String str, @o0OO00OO List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zze(Bundle bundle, @o0OO00OO String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    public static void zzf(Bundle bundle, @o0OO00OO String str, @o0OO00OO String str2, boolean z) {
        if (!z || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzg(Bundle bundle, @o0OO00OO String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
