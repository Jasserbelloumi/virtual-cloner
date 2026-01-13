package com.google.android.gms.internal.measurement;

import android.net.Uri;
import o00oOooO.o0O0OOOo;
/* loaded from: classes2.dex */
public final class zzhq {
    @o0O0OOOo("PhenotypeConstants.class")
    private static final androidx.collection.o00oOOo0 zza = new androidx.collection.o00oOOo0();

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            androidx.collection.o00oOOo0 o00oooo02 = zza;
            Uri uri = (Uri) o00oooo02.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                o00oooo02.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
