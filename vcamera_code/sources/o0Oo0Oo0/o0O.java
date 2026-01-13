package o0Oo0Oo0;

import java.io.IOException;
import o00oOoOo.o00oo;
/* loaded from: classes3.dex */
public enum o0O {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    o0O(String str) {
        this.protocol = str;
    }

    public static o0O get(String str) throws IOException {
        o0O o0o = HTTP_1_0;
        if (str.equals(o0o.protocol)) {
            return o0o;
        }
        o0O o0o2 = HTTP_1_1;
        if (str.equals(o0o2.protocol)) {
            return o0o2;
        }
        o0O o0o3 = HTTP_2;
        if (str.equals(o0o3.protocol)) {
            return o0o3;
        }
        o0O o0o4 = SPDY_3;
        if (str.equals(o0o4.protocol)) {
            return o0o4;
        }
        throw new IOException(o00oo.o00oOOo0("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
