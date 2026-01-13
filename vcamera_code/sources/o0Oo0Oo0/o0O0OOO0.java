package o0Oo0Oo0;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import o00oOoOo.o00oo;
import o0Oo.o0O0000O;
/* loaded from: classes3.dex */
public final class o0O0OOO0 {
    public static String o00oOOo0(String str, String str2) {
        return o00oOOoO(str, str2, Charset.forName(C.ISO88591_NAME));
    }

    public static String o00oOOoO(String str, String str2, Charset charset) {
        return o00oo.o00oOOo0("Basic ", o0O0000O.of((str + ":" + str2).getBytes(charset)).base64());
    }
}
