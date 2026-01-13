package o0OOO0oo;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO00OOO;
/* loaded from: classes3.dex */
public final class o0O0o000 {
    @o00oo00O
    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    public static final byte[] o00oOOo0(oo0OOoo oo0oooo, CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(oo0oooo, "<this>");
        o0ooO.o00oo0O0(charSequence, FirebaseAnalytics.Param.SOURCE);
        if (charSequence instanceof String) {
            oo0oooo.o00oOoO0(charSequence.length(), i, i2);
            String substring = ((String) charSequence).substring(i, i2);
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = oO00OOO.f13869o00oOoO0;
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        return oo0oooo.o00oOo0O(charSequence, i, i2);
    }

    @o00oo00O
    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    public static final int o00oOOoO(oo0OOoo oo0oooo, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        o0ooO.o00oo0O0(oo0oooo, "<this>");
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(bArr2, FirebaseAnalytics.Param.DESTINATION);
        return oo0oooo.o0O0o(bArr, bArr2, i, i2, i3);
    }

    @o00oo00O
    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    public static final byte[] o00oOo00(oo0OOoo oo0oooo, byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(oo0oooo, "<this>");
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        return oo0oooo.o00ooO(bArr, i, i2);
    }

    @o00oo00O
    @o0oOo0O0
    @o0OO00o0(version = "1.8")
    public static final String o00oOooO(oo0OOoo oo0oooo, byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(oo0oooo, "<this>");
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        return new String(oo0oooo.o00ooO(bArr, i, i2), oO00OOO.f13869o00oOoO0);
    }
}
