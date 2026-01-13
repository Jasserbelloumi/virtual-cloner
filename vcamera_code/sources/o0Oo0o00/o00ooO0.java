package o0Oo0o00;

import java.net.Proxy;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0OO000o;
/* loaded from: classes3.dex */
public final class o00ooO0 {
    public static String o00oOOo0(o0OO000o o0oo000o, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(o0oo000o.f16087o00oOOoO);
        sb.append(' ');
        if (o00oOOoO(o0oo000o, type)) {
            sb.append(o0oo000o.f16086o00oOOo0);
        } else {
            sb.append(o00oOo00(o0oo000o.f16086o00oOOo0));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static boolean o00oOOoO(o0OO000o o0oo000o, Proxy.Type type) {
        return !o0oo000o.o00oOo0o() && type == Proxy.Type.HTTP;
    }

    public static String o00oOo00(o0O0o00O o0o0o00o) {
        String o00oOoO2 = o0o0o00o.o00oOoO();
        String o00oOoOo2 = o0o0o00o.o00oOoOo();
        if (o00oOoOo2 != null) {
            return o00oOoO2 + '?' + o00oOoOo2;
        }
        return o00oOoO2;
    }
}
