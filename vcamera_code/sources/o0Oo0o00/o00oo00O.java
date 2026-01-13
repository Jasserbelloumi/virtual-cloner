package o0Oo0o00;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import o00ooOoo.oO00O0oO;
import o0Oo.o0O00O;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0o0;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.o0OOOO0o;
import o0Oo0Ooo.oO0Oo;
/* loaded from: classes3.dex */
public final class o00oo00O implements o0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16343o00oOOo0;

    public o00oo00O(boolean z) {
        this.f16343o00oOOo0 = z;
    }

    @Override // o0Oo0Oo0.o0O0o0
    public oo0ooO o00oOOo0(o0O0o0.o00oOOo0 o00oooo02) throws IOException {
        oo0ooO.o00oOOo0 o00oooo03;
        oo0ooO o00oOo002;
        o0O0o o0o0o = (o0O0o) o00oooo02;
        o00oo0 o00oo0Var = o0o0o.f16359o00oOo00;
        oO0Oo oo0oo = o0o0o.f16358o00oOOoO;
        o0OOOO0o o0oooo0o = o0o0o.f16363o00oOooO;
        o0OO000o o0oo000o = o0o0o.f16361o00oOo0o;
        long currentTimeMillis = System.currentTimeMillis();
        o00oo0Var.o00oOo00(o0oo000o);
        if (!o00oo0O.o00oOOoO(o0oo000o.f16087o00oOOoO) || o0oo000o.f16091o00oOooO == null) {
            o00oooo03 = null;
        } else {
            if ("100-continue".equalsIgnoreCase(o0oo000o.o00oOo00(HttpHeaders.EXPECT))) {
                o00oo0Var.o00oOo0O();
                o00oooo03 = o00oo0Var.o00oOooO(true);
            } else {
                o00oooo03 = null;
            }
            if (o00oooo03 == null) {
                o0Oo.o0 o00oOo003 = o0O00O.o00oOo00(o00oo0Var.o00oOOoO(o0oo000o, o0oo000o.f16091o00oOooO.o00oOOo0()));
                o0oo000o.f16091o00oOooO.o00oOoO(o00oOo003);
                o00oOo003.close();
            } else if (!o0oooo0o.o00oo0O()) {
                oo0oo.o00oOoOo();
            }
        }
        o00oo0Var.o00oOOo0();
        if (o00oooo03 == null) {
            o00oooo03 = o00oo0Var.o00oOooO(false);
        }
        oo0ooO o00oOo004 = o00oooo03.o00oo0O(o0oo000o).o00oOoO(oo0oo.o00oOooO().f16299o00oOo0o).o00oo0Oo(currentTimeMillis).o00oo0OO(System.currentTimeMillis()).o00oOo00();
        int i = o00oOo004.f16171o00oo0Oo;
        if (this.f16343o00oOOo0 && i == 101) {
            oo0ooO.o00oOOo0 o00oooo04 = new oo0ooO.o00oOOo0(o00oOo004);
            o00oooo04.f16187o00oOoO0 = oO0000O.f15752o00oOo00;
            o00oOo002 = o00oooo04.o00oOo00();
        } else {
            oo0ooO.o00oOOo0 o00oooo05 = new oo0ooO.o00oOOo0(o00oOo004);
            o00oooo05.f16187o00oOoO0 = o00oo0Var.o00oOo0o(o00oOo004);
            o00oOo002 = o00oooo05.o00oOo00();
        }
        if ("close".equalsIgnoreCase(o00oOo002.f16170o00oo0O0.o00oOo00("Connection")) || "close".equalsIgnoreCase(o00oOo002.o00oOooo("Connection", null))) {
            oo0oo.o00oOoOo();
        }
        if ((i == 204 || i == 205) && o00oOo002.f16180o0O0o.o00oOoO0() > 0) {
            StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("HTTP ", i, " had non-zero Content-Length: ");
            o00oOOo02.append(o00oOo002.f16180o0O0o.o00oOoO0());
            throw new ProtocolException(o00oOOo02.toString());
        }
        return o00oOo002;
    }
}
