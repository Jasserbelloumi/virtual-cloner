package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.o00ooO0;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzhh {
    private final o00ooO0 zza;

    public zzhh(o00ooO0 o00ooo02) {
        this.zza = o00ooo02;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            o00ooO0 o00ooo02 = (o00ooO0) this.zza.get(uri.toString());
            if (o00ooo02 == null) {
                return null;
            }
            return (String) o00ooo02.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
