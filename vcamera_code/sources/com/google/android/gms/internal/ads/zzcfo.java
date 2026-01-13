package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class zzcfo {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(@oo0oO0 String str, @o0OO00OO String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            while (i <= 0) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            str = str.substring(end);
        } else if (!zzb.matcher(str).find()) {
            while (i <= 0) {
                String str3 = strArr[i];
                if (str3 != null) {
                    sb.append(str3);
                }
                i++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
