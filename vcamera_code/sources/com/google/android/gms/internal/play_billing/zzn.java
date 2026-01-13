package com.google.android.gms.internal.play_billing;

import android.support.v4.media.o00oOoO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import o00ooOO0.o0O000O;
/* loaded from: classes2.dex */
public final class zzn {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String o00oOOo02;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                o00oOOo02 = "null";
            } else {
                try {
                    o00oOOo02 = obj.toString();
                } catch (Exception e) {
                    String o00oOOo03 = o00oOoO.o00oOOo0(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o00oOOo03), (Throwable) e);
                    o00oOOo02 = o0O000O.o00oOOo0("<", o00oOOo03, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = o00oOOo02;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
