package o0O0000o;

import android.net.Uri;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0 {
    @oo0oO0
    public static String o00oOOo0(@oo0oO0 Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(o00oOo0O.f10271o00oOo00) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char charAt = schemeSpecificPart.charAt(i);
                        if (charAt != '-' && charAt != '@' && charAt != '.') {
                            charAt = 'x';
                        }
                        sb.append(charAt);
                    }
                }
                return sb.toString();
            } else if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("//");
                String str = "";
                o00oOOo02.append(uri.getHost() != null ? uri.getHost() : "");
                if (uri.getPort() != -1) {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(":");
                    o00oOOo03.append(uri.getPort());
                    str = o00oOOo03.toString();
                }
                schemeSpecificPart = android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, str, "/...");
            }
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (scheme != null) {
            sb2.append(scheme);
            sb2.append(':');
        }
        if (schemeSpecificPart != null) {
            sb2.append(schemeSpecificPart);
        }
        return sb2.toString();
    }
}
