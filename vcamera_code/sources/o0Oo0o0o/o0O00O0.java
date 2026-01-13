package o0Oo0o0o;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0oo0o;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0OO00OO;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.oO0Oo;
import o0Oo0o00.o0;
import o0Oo0o00.o00oo;
import o0Oo0o00.o00oo0;
import o0Oo0o00.o00ooO0;
/* loaded from: classes3.dex */
public final class o0O00O0 implements o00oo0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0O0000O f16480o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0O0000O f16481o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o0O0000O f16482o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o0O0000O f16483o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final o0O0000O f16484o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final o0O0000O f16485o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final o0O0000O f16486o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final List<o0O0000O> f16487o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final o0O0000O f16488o00oo00O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final List<o0O0000O> f16489o00oo0OO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0oo00 f16490o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final oO0Oo f16491o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00O f16492o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OoO00O f16493o00oOooO;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends o0Oo.o0OoOoOo {
        public o00oOOo0(o0O0O0Oo o0o0o0oo) {
            super(o0o0o0oo);
        }

        @Override // o0Oo.o0OoOoOo, o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            o0O00O0 o0o00o0 = o0O00O0.this;
            o0o00o0.f16491o00oOo00.o00oo0O0(false, o0o00o0);
            super.close();
        }
    }

    static {
        o0O0000O encodeUtf8 = o0O0000O.encodeUtf8("connection");
        f16480o00oOo0o = encodeUtf8;
        o0O0000O encodeUtf82 = o0O0000O.encodeUtf8("host");
        f16482o00oOoO0 = encodeUtf82;
        o0O0000O encodeUtf83 = o0O0000O.encodeUtf8("keep-alive");
        f16481o00oOoO = encodeUtf83;
        o0O0000O encodeUtf84 = o0O0000O.encodeUtf8("proxy-connection");
        f16483o00oOoOO = encodeUtf84;
        o0O0000O encodeUtf85 = o0O0000O.encodeUtf8("transfer-encoding");
        f16484o00oOoOo = encodeUtf85;
        o0O0000O encodeUtf86 = o0O0000O.encodeUtf8("te");
        f16485o00oOoo0 = encodeUtf86;
        o0O0000O encodeUtf87 = o0O0000O.encodeUtf8("encoding");
        f16486o00oOooo = encodeUtf87;
        o0O0000O encodeUtf88 = o0O0000O.encodeUtf8("upgrade");
        f16488o00oo00O = encodeUtf88;
        f16487o00oo0 = oO0000O.o00oo0O0(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88, o0O000Oo.f16419o00oOo0o, o0O000Oo.f16421o00oOoO0, o0O000Oo.f16420o00oOoO, o0O000Oo.f16422o00oOoOO);
        f16489o00oo0OO = oO0000O.o00oo0O0(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88);
    }

    public o0O00O0(o0O0oo00 o0o0oo00, oO0Oo oo0oo, o0OoO00O o0ooo00o) {
        this.f16490o00oOOoO = o0o0oo00;
        this.f16491o00oOo00 = oo0oo;
        this.f16493o00oOooO = o0ooo00o;
    }

    public static oo0ooO.o00oOOo0 o00oOoO(List<o0O000Oo> list) throws IOException {
        o0O0o00.o00oOOo0 o00oooo02 = new o0O0o00.o00oOOo0();
        int size = list.size();
        o0 o0Var = null;
        for (int i = 0; i < size; i++) {
            o0O000Oo o0o000oo = list.get(i);
            if (o0o000oo != null) {
                o0O0000O o0o0000o = o0o000oo.f16424o00oOOo0;
                String utf8 = o0o000oo.f16425o00oOOoO.utf8();
                if (o0o0000o.equals(o0O000Oo.f16418o00oOo0O)) {
                    o0Var = o0.o00oOOoO("HTTP/1.1 " + utf8);
                } else if (!f16489o00oo0OO.contains(o0o0000o)) {
                    oO00000.f15748o00oOOo0.o00oOOoO(o00oooo02, o0o0000o.utf8(), utf8);
                }
            } else if (o0Var != null && o0Var.f16337o00oOOoO == 100) {
                o00oooo02 = new o0O0o00.o00oOOo0();
                o0Var = null;
            }
        }
        if (o0Var != null) {
            oo0ooO.o00oOOo0 o00oooo03 = new oo0ooO.o00oOOo0();
            o00oooo03.f16182o00oOOoO = o0O.HTTP_2;
            o00oooo03.f16183o00oOo00 = o0Var.f16337o00oOOoO;
            o00oooo03.f16191o00oOooO = o0Var.f16338o00oOo00;
            return o00oooo03.o00oOoOo(new o0O0o00(o00oooo02));
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<o0O000Oo> o00oOoO0(o0OO000o o0oo000o) {
        o0O0o00 o0o0o00 = o0oo000o.f16088o00oOo00;
        ArrayList arrayList = new ArrayList((o0o0o00.f15872o00oOOo0.length / 2) + 4);
        arrayList.add(new o0O000Oo(o0O000Oo.f16419o00oOo0o, o0oo000o.f16087o00oOOoO));
        arrayList.add(new o0O000Oo(o0O000Oo.f16421o00oOoO0, o00ooO0.o00oOo00(o0oo000o.f16086o00oOOo0)));
        String o00oOo002 = o0oo000o.o00oOo00(HttpHeaders.HOST);
        if (o00oOo002 != null) {
            arrayList.add(new o0O000Oo(o0O000Oo.f16422o00oOoOO, o00oOo002));
        }
        arrayList.add(new o0O000Oo(o0O000Oo.f16420o00oOoO, o0oo000o.f16086o00oOOo0.f15889o00oOOo0));
        int length = o0o0o00.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            o0O0000O encodeUtf8 = o0O0000O.encodeUtf8(o0o0o00.o00oOooO(i).toLowerCase(Locale.US));
            if (!f16487o00oo0.contains(encodeUtf8)) {
                arrayList.add(new o0O000Oo(encodeUtf8, o0o0o00.o00oOoo0(i)));
            }
        }
        return arrayList;
    }

    @Override // o0Oo0o00.o00oo0
    public void cancel() {
        o0O00O o0o00o = this.f16492o00oOo0O;
        if (o0o00o != null) {
            o0o00o.o00oOo0o(o0OoOoOo.CANCEL);
        }
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOOo0() throws IOException {
        this.f16492o00oOo0O.o00oOoo0().close();
    }

    @Override // o0Oo0o00.o00oo0
    public o0O0oo0o o00oOOoO(o0OO000o o0oo000o, long j) {
        return this.f16492o00oOo0O.o00oOoo0();
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOo00(o0OO000o o0oo000o) throws IOException {
        if (this.f16492o00oOo0O != null) {
            return;
        }
        o0O00O o00oOoo02 = this.f16493o00oOooO.o00oOoo0(0, o00oOoO0(o0oo000o), o0oo000o.f16091o00oOooO != null);
        this.f16492o00oOo0O = o00oOoo02;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00oOoo02.f16462o00oOoOo.o00oOoO(this.f16490o00oOOoO.o00ooOO0(), timeUnit);
        this.f16492o00oOo0O.f16463o00oOoo0.o00oOoO(this.f16490o00oOOoO.o00ooOoo(), timeUnit);
    }

    @Override // o0Oo0o00.o00oo0
    public void o00oOo0O() throws IOException {
        this.f16493o00oOooO.flush();
    }

    @Override // o0Oo0o00.o00oo0
    public o0OO00OO o00oOo0o(oo0ooO oo0ooo) throws IOException {
        return new o00oo(oo0ooo.f16174o00oo0oO, o0Oo.o0O00O.o00oOooO(new o00oOOo0(this.f16492o00oOo0O.f16459o00oOoO)));
    }

    @Override // o0Oo0o00.o00oo0
    public oo0ooO.o00oOOo0 o00oOooO(boolean z) throws IOException {
        oo0ooO.o00oOOo0 o00oOoO2 = o00oOoO(this.f16492o00oOo0O.o00oo0oO());
        if (z && oO00000.f15748o00oOOo0.o00oOooO(o00oOoO2) == 100) {
            return null;
        }
        return o00oOoO2;
    }
}
