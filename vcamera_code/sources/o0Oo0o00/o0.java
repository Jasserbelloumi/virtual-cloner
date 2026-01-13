package o0Oo0o00;

import java.io.IOException;
import java.net.ProtocolException;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.oo0ooO;
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f16333o00oOo0O = 308;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f16334o00oOo0o = 100;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16335o00oOooO = 307;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O f16336o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f16337o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f16338o00oOo00;

    public o0(o0O o0o, int i, String str) {
        this.f16336o00oOOo0 = o0o;
        this.f16337o00oOOoO = i;
        this.f16338o00oOo00 = str;
    }

    public static o0 o00oOOo0(oo0ooO oo0ooo) {
        return new o0(oo0ooo.f16169o00oo0O, oo0ooo.f16171o00oo0Oo, oo0ooo.f16173o00oo0o0);
    }

    public static o0 o00oOOoO(String str) throws IOException {
        o0O o0o;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                o0o = o0O.HTTP_1_0;
            } else if (charAt != 1) {
                throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
            } else {
                o0o = o0O.HTTP_1_1;
            }
        } else if (!str.startsWith("ICY ")) {
            throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
        } else {
            o0o = o0O.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
                } else {
                    str2 = str.substring(i + 4);
                }
                return new o0(o0o, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(o00oOoOo.o00oo.o00oOOo0("Unexpected status line: ", str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16336o00oOOo0 == o0O.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f16337o00oOOoO);
        if (this.f16338o00oOo00 != null) {
            sb.append(' ');
            sb.append(this.f16338o00oOo00);
        }
        return sb.toString();
    }
}
