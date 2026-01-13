package o0Oo0o00;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.List;
import o0Oo.o0O00;
import o0Oo.o0O00O;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0OO;
import o0Oo0Oo0.o0O0OO0;
import o0Oo0Oo0.o0O0o0;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0oOo0O0;
import o0Oo0Oo0.oo0oO0;
import o0Oo0Oo0.oo0ooO;
/* loaded from: classes3.dex */
public final class o00oOoO implements o0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OO f16339o00oOOo0;

    public o00oOoO(o0O0OO o0o0oo) {
        this.f16339o00oOOo0 = o0o0oo;
    }

    @Override // o0Oo0Oo0.o0O0o0
    public oo0ooO o00oOOo0(o0O0o0.o00oOOo0 o00oooo02) throws IOException {
        o0OO000o o00oOOo02 = o00oooo02.o00oOOo0();
        o00oOOo02.getClass();
        o0OO000o.o00oOOo0 o00oooo03 = new o0OO000o.o00oOOo0(o00oOOo02);
        oo0oO0 oo0oo0 = o00oOOo02.f16091o00oOooO;
        if (oo0oo0 != null) {
            o0oOo0O0 o00oOOoO2 = oo0oo0.o00oOOoO();
            if (o00oOOoO2 != null) {
                o00oooo03.o00oOoO("Content-Type", o00oOOoO2.f16139o00oOOo0);
            }
            long o00oOOo03 = oo0oo0.o00oOOo0();
            if (o00oOOo03 != -1) {
                o00oooo03.o00oOoO("Content-Length", Long.toString(o00oOOo03));
                o00oooo03.o00oo0(HttpHeaders.TRANSFER_ENCODING);
            } else {
                o00oooo03.o00oOoO(HttpHeaders.TRANSFER_ENCODING, "chunked");
                o00oooo03.o00oo0("Content-Length");
            }
        }
        boolean z = false;
        if (o00oOOo02.o00oOo00(HttpHeaders.HOST) == null) {
            o00oooo03.o00oOoO(HttpHeaders.HOST, oO0000O.o00oo0(o00oOOo02.f16086o00oOOo0, false));
        }
        if (o00oOOo02.o00oOo00("Connection") == null) {
            o00oooo03.o00oOoO("Connection", HttpHeaders.KEEP_ALIVE);
        }
        if (o00oOOo02.o00oOo00(HttpHeaders.ACCEPT_ENCODING) == null && o00oOOo02.o00oOo00("Range") == null) {
            z = true;
            o00oooo03.o00oOoO(HttpHeaders.ACCEPT_ENCODING, "gzip");
        }
        List<o0O0OO0> o00oOOo04 = this.f16339o00oOOo0.o00oOOo0(o00oOOo02.f16086o00oOOo0);
        if (!o00oOOo04.isEmpty()) {
            o00oooo03.o00oOoO(HttpHeaders.COOKIE, o00oOOoO(o00oOOo04));
        }
        if (o00oOOo02.o00oOo00("User-Agent") == null) {
            o00oooo03.o00oOoO("User-Agent", "okhttp/3.8.0");
        }
        oo0ooO o00oOo002 = o00oooo02.o00oOo00(o00oooo03.o00oOOoO());
        o00oo0O0.o00oOoO(this.f16339o00oOOo0, o00oOOo02.f16086o00oOOo0, o00oOo002.f16174o00oo0oO);
        oo0ooO.o00oOOo0 o00oooo04 = new oo0ooO.o00oOOo0(o00oOo002);
        o00oooo04.f16181o00oOOo0 = o00oOOo02;
        if (z && "gzip".equalsIgnoreCase(o00oOo002.o00oOooo("Content-Encoding", null)) && o00oo0O0.o00oOo00(o00oOo002)) {
            o0O00 o0o00 = new o0O00(o00oOo002.f16180o0O0o.o00ooO00());
            o0O0o00.o00oOOo0 o00oOoO2 = o00oOo002.f16174o00oo0oO.o00oOo0o().o00oOoO("Content-Encoding").o00oOoO("Content-Length");
            o00oOoO2.getClass();
            o0O0o00 o0o0o00 = new o0O0o00(o00oOoO2);
            o00oooo04.o00oOoOo(o0o0o00);
            o00oooo04.f16187o00oOoO0 = new o00oo(o0o0o00, o0O00O.o00oOooO(o0o00));
        }
        return o00oooo04.o00oOo00();
    }

    public final String o00oOOoO(List<o0O0OO0> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            o0O0OO0 o0o0oo0 = list.get(i);
            sb.append(o0o0oo0.f15846o00oOOo0);
            sb.append('=');
            sb.append(o0o0oo0.f15847o00oOOoO);
        }
        return sb.toString();
    }
}
