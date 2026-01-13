package o0OOOoo0;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import o0OOOO0o.o00oOoO;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO00OOO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO00OOO f13863o00oOOo0 = new oO00OOO();
    @o00oOoO
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Charset f13864o00oOOoO;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Charset f13865o00oOo00;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Charset f13866o00oOo0O;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Charset f13867o00oOo0o;
    @Nullable

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static volatile Charset f13868o00oOoO;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final Charset f13869o00oOoO0;
    @Nullable

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static volatile Charset f13870o00oOoOO;
    @Nullable

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static volatile Charset f13871o00oOoOo;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Charset f13872o00oOooO;

    static {
        Charset forName = Charset.forName(C.UTF8_NAME);
        o0ooO.o00oo0OO(forName, "forName(\"UTF-8\")");
        f13864o00oOOoO = forName;
        Charset forName2 = Charset.forName(C.UTF16_NAME);
        o0ooO.o00oo0OO(forName2, "forName(\"UTF-16\")");
        f13865o00oOo00 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        o0ooO.o00oo0OO(forName3, "forName(\"UTF-16BE\")");
        f13872o00oOooO = forName3;
        Charset forName4 = Charset.forName(C.UTF16LE_NAME);
        o0ooO.o00oo0OO(forName4, "forName(\"UTF-16LE\")");
        f13866o00oOo0O = forName4;
        Charset forName5 = Charset.forName(C.ASCII_NAME);
        o0ooO.o00oo0OO(forName5, "forName(\"US-ASCII\")");
        f13867o00oOo0o = forName5;
        Charset forName6 = Charset.forName(C.ISO88591_NAME);
        o0ooO.o00oo0OO(forName6, "forName(\"ISO-8859-1\")");
        f13869o00oOoO0 = forName6;
    }

    @o00oo0OO(name = "UTF32")
    @NotNull
    public final Charset o00oOOo0() {
        Charset charset = f13868o00oOoO;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32");
            o0ooO.o00oo0OO(forName, "forName(\"UTF-32\")");
            f13868o00oOoO = forName;
            return forName;
        }
        return charset;
    }

    @o00oo0OO(name = "UTF32_BE")
    @NotNull
    public final Charset o00oOOoO() {
        Charset charset = f13871o00oOoOo;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            o0ooO.o00oo0OO(forName, "forName(\"UTF-32BE\")");
            f13871o00oOoOo = forName;
            return forName;
        }
        return charset;
    }

    @o00oo0OO(name = "UTF32_LE")
    @NotNull
    public final Charset o00oOo00() {
        Charset charset = f13870o00oOoOO;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            o0ooO.o00oo0OO(forName, "forName(\"UTF-32LE\")");
            f13870o00oOoOO = forName;
            return forName;
        }
        return charset;
    }
}
