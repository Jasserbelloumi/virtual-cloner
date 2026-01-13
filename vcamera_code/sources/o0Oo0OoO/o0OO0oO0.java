package o0Oo0OoO;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O00O;
import o0Oo.o0O00o00;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo.o0O0oo0o;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.o0O0o0;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.oo0ooO;
import o0Oo0OoO.o0OO;
import o0Oo0o00.o00oo;
import o0Oo0o00.o00oo0O;
import o0Oo0o00.o00oo0O0;
/* loaded from: classes3.dex */
public final class o0OO0oO0 implements o0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OOO0O f16225o00oOOo0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O0O0Oo {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f16226o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f16227o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OO0oO f16228o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ o0 f16230o00oo0o0;

        public o00oOOo0(o0O00000 o0o00000, o0OO0oO o0oo0oo, o0 o0Var) {
            this.f16226o00oo0O = o0o00000;
            this.f16228o00oo0Oo = o0oo0oo;
            this.f16230o00oo0o0 = o0Var;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f16227o00oo0O0 && !oO0000O.o00oOoOo(this, 100, TimeUnit.MILLISECONDS)) {
                this.f16227o00oo0O0 = true;
                this.f16228o00oo0Oo.o00oOOo0();
            }
            this.f16226o00oo0O.close();
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f16226o00oo0O.o00oOooO();
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            try {
                long o0O0o0002 = this.f16226o00oo0O.o0O0o000(o00ooo, j);
                if (o0O0o0002 != -1) {
                    o00ooo.o00ooO00(this.f16230o00oo0o0.o00oOo00(), o00ooo.f15434o00oo0O - o0O0o0002, o0O0o0002);
                    this.f16230o00oo0o0.o00ooOo();
                    return o0O0o0002;
                }
                if (!this.f16227o00oo0O0) {
                    this.f16227o00oo0O0 = true;
                    this.f16230o00oo0o0.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.f16227o00oo0O0) {
                    this.f16227o00oo0O0 = true;
                    this.f16228o00oo0Oo.o00oOOo0();
                }
                throw e;
            }
        }
    }

    public o0OO0oO0(o0OOO0O o0ooo0o) {
        this.f16225o00oOOo0 = o0ooo0o;
    }

    public static o0O0o00 o00oOo00(o0O0o00 o0o0o00, o0O0o00 o0o0o002) {
        o0O0o00.o00oOOo0 o00oooo02 = new o0O0o00.o00oOOo0();
        int length = o0o0o00.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            String o00oOooO2 = o0o0o00.o00oOooO(i);
            String o00oOoo02 = o0o0o00.o00oOoo0(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(o00oOooO2) || !o00oOoo02.startsWith("1")) && (!o00oOooO(o00oOooO2) || o0o0o002.o00oOOo0(o00oOooO2) == null)) {
                oO00000.f15748o00oOOo0.o00oOOoO(o00oooo02, o00oOooO2, o00oOoo02);
            }
        }
        int length2 = o0o0o002.f15872o00oOOo0.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String o00oOooO3 = o0o0o002.o00oOooO(i2);
            if (!"Content-Length".equalsIgnoreCase(o00oOooO3) && o00oOooO(o00oOooO3)) {
                oO00000.f15748o00oOOo0.o00oOOoO(o00oooo02, o00oOooO3, o0o0o002.o00oOoo0(i2));
            }
        }
        return new o0O0o00(o00oooo02);
    }

    public static oo0ooO o00oOo0O(oo0ooO oo0ooo) {
        if (oo0ooo == null || oo0ooo.f16180o0O0o == null) {
            return oo0ooo;
        }
        oo0ooO.o00oOOo0 o00oooo02 = new oo0ooO.o00oOOo0(oo0ooo);
        o00oooo02.f16187o00oOoO0 = null;
        return o00oooo02.o00oOo00();
    }

    public static boolean o00oOooO(String str) {
        return ("Connection".equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    @Override // o0Oo0Oo0.o0O0o0
    public oo0ooO o00oOOo0(o0O0o0.o00oOOo0 o00oooo02) throws IOException {
        o0OOO0O o0ooo0o = this.f16225o00oOOo0;
        oo0ooO o00oOo0O2 = o0ooo0o != null ? o0ooo0o.o00oOo0O(o00oooo02.o00oOOo0()) : null;
        o0OO o00oOo002 = new o0OO.o00oOOo0(System.currentTimeMillis(), o00oooo02.o00oOOo0(), o00oOo0O2).o00oOo00();
        o0OO000o o0oo000o = o00oOo002.f16211o00oOOo0;
        oo0ooO oo0ooo = o00oOo002.f16212o00oOOoO;
        o0OOO0O o0ooo0o2 = this.f16225o00oOOo0;
        if (o0ooo0o2 != null) {
            o0ooo0o2.o00oOOo0(o00oOo002);
        }
        if (o00oOo0O2 != null && oo0ooo == null) {
            oO0000O.o00oOo00(o00oOo0O2.f16180o0O0o);
        }
        if (o0oo000o == null && oo0ooo == null) {
            oo0ooO.o00oOOo0 o00oooo03 = new oo0ooO.o00oOOo0();
            o00oooo03.f16181o00oOOo0 = o00oooo02.o00oOOo0();
            o00oooo03.f16182o00oOOoO = o0O.HTTP_1_1;
            o00oooo03.f16183o00oOo00 = 504;
            o00oooo03.f16191o00oOooO = "Unsatisfiable Request (only-if-cached)";
            o00oooo03.f16187o00oOoO0 = oO0000O.f15752o00oOo00;
            o00oooo03.f16190o00oOoo0 = -1L;
            o00oooo03.f16192o00oOooo = System.currentTimeMillis();
            return o00oooo03.o00oOo00();
        } else if (o0oo000o == null) {
            oo0ooo.getClass();
            return new oo0ooO.o00oOOo0(oo0ooo).o00oOooO(o00oOo0O(oo0ooo)).o00oOo00();
        } else {
            try {
                oo0ooO o00oOo003 = o00oooo02.o00oOo00(o0oo000o);
                if (o00oOo003 == null && o00oOo0O2 != null) {
                }
                if (oo0ooo != null) {
                    if (o00oOo003.f16171o00oo0Oo == 304) {
                        oo0ooO o00oOo004 = new oo0ooO.o00oOOo0(oo0ooo).o00oOoOo(o00oOo00(oo0ooo.f16174o00oo0oO, o00oOo003.f16174o00oo0oO)).o00oo0Oo(o00oOo003.f16178o00ooO0O).o00oo0OO(o00oOo003.f16179o00ooO0o).o00oOooO(o00oOo0O(oo0ooo)).o00oOooo(o00oOo0O(o00oOo003)).o00oOo00();
                        o00oOo003.f16180o0O0o.close();
                        this.f16225o00oOOo0.o00oOooO();
                        this.f16225o00oOOo0.o00oOOoO(oo0ooo, o00oOo004);
                        return o00oOo004;
                    }
                    oO0000O.o00oOo00(oo0ooo.f16180o0O0o);
                }
                o00oOo003.getClass();
                oo0ooO o00oOo005 = new oo0ooO.o00oOOo0(o00oOo003).o00oOooO(o00oOo0O(oo0ooo)).o00oOooo(o00oOo0O(o00oOo003)).o00oOo00();
                if (this.f16225o00oOOo0 != null) {
                    if (o00oo0O0.o00oOo00(o00oOo005) && o0OO.o00oOOo0(o00oOo005, o0oo000o)) {
                        return o00oOOoO(this.f16225o00oOOo0.o00oOo0o(o00oOo005), o00oOo005);
                    }
                    if (o00oo0O.o00oOOo0(o0oo000o.f16087o00oOOoO)) {
                        try {
                            this.f16225o00oOOo0.o00oOo00(o0oo000o);
                        } catch (IOException unused) {
                        }
                    }
                }
                return o00oOo005;
            } finally {
                if (o00oOo0O2 != null) {
                    oO0000O.o00oOo00(o00oOo0O2.f16180o0O0o);
                }
            }
        }
    }

    public final oo0ooO o00oOOoO(o0OO0oO o0oo0oo, oo0ooO oo0ooo) throws IOException {
        o0O0oo0o o00oOOoO2;
        if (o0oo0oo == null || (o00oOOoO2 = o0oo0oo.o00oOOoO()) == null) {
            return oo0ooo;
        }
        o00oOOo0 o00oooo02 = new o00oOOo0(oo0ooo.f16180o0O0o.o00ooO00(), o0oo0oo, o0O00O.o00oOo00(o00oOOoO2));
        oo0ooO.o00oOOo0 o00oooo03 = new oo0ooO.o00oOOo0(oo0ooo);
        o00oooo03.f16187o00oOoO0 = new o00oo(oo0ooo.f16174o00oo0oO, new o0O00o00(o00oooo02));
        return o00oooo03.o00oOo00();
    }
}
