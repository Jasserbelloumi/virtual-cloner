package o0O0000o;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f10270o00oOOoO = "mailto:";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f10271o00oOo00 = "mailto";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f10272o00oOo0O = "body";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f10273o00oOo0o = "cc";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f10274o00oOoO = "subject";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f10275o00oOoO0 = "bcc";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f10276o00oOooO = "to";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashMap<String, String> f10277o00oOOo0 = new HashMap<>();

    public static boolean o00oOoO(@o0OO00OO String str) {
        return str != null && str.startsWith(f10270o00oOOoO);
    }

    public static boolean o00oOoO0(@o0OO00OO Uri uri) {
        return uri != null && f10271o00oOo00.equals(uri.getScheme());
    }

    @oo0oO0
    public static o00oOo0O o00oOoOO(@oo0oO0 Uri uri) throws o00oOoO {
        return o00oOoOo(uri.toString());
    }

    @oo0oO0
    public static o00oOo0O o00oOoOo(@oo0oO0 String str) throws o00oOoO {
        String decode;
        String substring;
        str.getClass();
        if (o00oOoO(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            o00oOo0O o00ooo0o2 = new o00oOo0O();
            if (substring != null) {
                for (String str2 : substring.split("&")) {
                    String[] split = str2.split("=", 2);
                    if (split.length != 0) {
                        o00ooo0o2.f10277o00oOOo0.put(Uri.decode(split[0]).toLowerCase(Locale.ROOT), split.length > 1 ? Uri.decode(split[1]) : null);
                    }
                }
            }
            String o00oOo0o2 = o00ooo0o2.o00oOo0o();
            if (o00oOo0o2 != null) {
                decode = android.support.v4.media.o00oOoO.o00oOOo0(decode, ", ", o00oOo0o2);
            }
            o00ooo0o2.f10277o00oOOo0.put(f10276o00oOooO, decode);
            return o00ooo0o2;
        }
        throw new o00oOoO("Not a mailto scheme");
    }

    @o0OO00OO
    public String o00oOOo0() {
        return this.f10277o00oOOo0.get(f10275o00oOoO0);
    }

    @o0OO00OO
    public String o00oOOoO() {
        return this.f10277o00oOOo0.get("body");
    }

    @o0OO00OO
    public String o00oOo00() {
        return this.f10277o00oOOo0.get(f10273o00oOo0o);
    }

    @o0OO00OO
    public String o00oOo0O() {
        return this.f10277o00oOOo0.get(f10274o00oOoO);
    }

    @o0OO00OO
    public String o00oOo0o() {
        return this.f10277o00oOOo0.get(f10276o00oOooO);
    }

    @o0OO00OO
    public Map<String, String> o00oOooO() {
        return this.f10277o00oOOo0;
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder(f10270o00oOOoO);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f10277o00oOOo0.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(oOo0oooO.f13912o00oOooO);
        }
        return sb.toString();
    }
}
