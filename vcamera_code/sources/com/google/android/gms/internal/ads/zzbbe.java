package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzbbe extends zzbbf {
    @o0OO00OO
    private static final String zzb(@o0OO00OO String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final String zza(@o0OO00OO String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        return TextUtils.isEmpty(zzb) ? zzb2 : TextUtils.isEmpty(zzb2) ? zzb : android.support.v4.media.o00oOoO.o00oOOo0(zzb, ",", zzb2);
    }
}
