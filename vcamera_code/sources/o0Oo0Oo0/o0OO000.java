package o0Oo0Oo0;

import java.io.IOException;
import java.util.ArrayList;
import o00ooOoo.oOo000Oo;
import o0Oo0Oo.oO00000o;
import o0Oo0Oo0.o0OooO0;
import o0Oo0OoO.o0OO0oO0;
import o0Oo0Ooo.o0OOO0OO;
import o0Oo0Ooo.oO0Oo;
import o0Oo0o00.o00oOoO;
import o0Oo0o00.o00oo00O;
import o0Oo0o00.o00ooO;
import o0Oo0o00.o0O0o;
import o0Oo0oO.oO0Ooooo;
/* loaded from: classes3.dex */
public final class o0OO000 implements o0O00o00 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00ooO f16078o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0oo00 f16079o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0OooO0 f16080o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final boolean f16081o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0OO000o f16082o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f16083o00oo0oO;

    /* loaded from: classes3.dex */
    public final class o00oOOo0 extends oO00000o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0O00oO0 f16084o00oo0O;

        public o00oOOo0(o0O00oO0 o0o00oo0) {
            super("OkHttp %s", o0OO000.this.o00oOo0o());
            this.f16084o00oo0O = o0o00oo0;
        }

        @Override // o0Oo0Oo.oO00000o
        public void o00oOooo() {
            IOException e;
            boolean z = true;
            try {
                try {
                    oo0ooO o00oOooO2 = o0OO000.this.o00oOooO();
                    try {
                        if (o0OO000.this.f16078o00oo0O.f16355o00oOo0O) {
                            this.f16084o00oo0O.o00oOOoO(o0OO000.this, new IOException("Canceled"));
                        } else {
                            this.f16084o00oo0O.o00oOOo0(o0OO000.this, o00oOooO2);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            oO0Ooooo.o00oOoO().o00oo00O(4, "Callback failure for " + o0OO000.this.o00oOoOo(), e);
                        } else {
                            this.f16084o00oo0O.o00oOOoO(o0OO000.this, e);
                        }
                    }
                } finally {
                    o0OO000.this.f16079o00oo0O0.o00oo0().o00oOo0o(this);
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            }
        }

        public String o00oo0() {
            return o0OO000.this.f16082o00oo0o0.f16086o00oOOo0.f15897o00oOooO;
        }

        public o0OO000 o00oo00O() {
            return o0OO000.this;
        }

        public o0OO000o o00oo0OO() {
            return o0OO000.this.f16082o00oo0o0;
        }
    }

    public o0OO000(o0O0oo00 o0o0oo00, o0OO000o o0oo000o, boolean z) {
        o0OooO0.o00oOo00 o00oo0O02 = o0o0oo00.o00oo0O0();
        this.f16079o00oo0O0 = o0o0oo00;
        this.f16082o00oo0o0 = o0oo000o;
        this.f16081o00oo0o = z;
        this.f16078o00oo0O = new o00ooO(o0o0oo00, z);
        this.f16080o00oo0Oo = o00oo0O02.o00oOOo0(this);
    }

    @Override // o0Oo0Oo0.o0O00o00
    public void cancel() {
        this.f16078o00oo0O.o00oOOoO();
    }

    @Override // o0Oo0Oo0.o0O00o00
    public oo0ooO execute() throws IOException {
        synchronized (this) {
            if (this.f16083o00oo0oO) {
                throw new IllegalStateException("Already Executed");
            }
            this.f16083o00oo0oO = true;
        }
        o00oOOoO();
        try {
            this.f16079o00oo0O0.o00oo0().o00oOo00(this);
            oo0ooO o00oOooO2 = o00oOooO();
            if (o00oOooO2 != null) {
                return o00oOooO2;
            }
            throw new IOException("Canceled");
        } finally {
            this.f16079o00oo0O0.o00oo0().o00oOoO0(this);
        }
    }

    @Override // o0Oo0Oo0.o0O00o00
    public o0OO000o o00oOOo0() {
        return this.f16082o00oo0o0;
    }

    public final void o00oOOoO() {
        this.f16078o00oo0O.f16356o00oOooO = oO0Ooooo.o00oOoO().o00oOoo0("response.body().close()");
    }

    @Override // o0Oo0Oo0.o0O00o00
    /* renamed from: o00oOo00 */
    public o0OO000 mo21clone() {
        return new o0OO000(this.f16079o00oo0O0, this.f16082o00oo0o0, this.f16081o00oo0o);
    }

    @Override // o0Oo0Oo0.o0O00o00
    public synchronized boolean o00oOo0O() {
        return this.f16083o00oo0oO;
    }

    public String o00oOo0o() {
        return this.f16082o00oo0o0.f16086o00oOOo0.o00oooO();
    }

    @Override // o0Oo0Oo0.o0O00o00
    public void o00oOoO(o0O00oO0 o0o00oo0) {
        synchronized (this) {
            if (this.f16083o00oo0oO) {
                throw new IllegalStateException("Already Executed");
            }
            this.f16083o00oo0oO = true;
        }
        o00oOOoO();
        this.f16079o00oo0O0.o00oo0().o00oOOoO(new o00oOOo0(o0o00oo0));
    }

    @Override // o0Oo0Oo0.o0O00o00
    public boolean o00oOoO0() {
        return this.f16078o00oo0O.f16355o00oOo0O;
    }

    public oO0Oo o00oOoOO() {
        return this.f16078o00oo0O.f16354o00oOo00;
    }

    public String o00oOoOo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16078o00oo0O.f16355o00oOo0O ? "canceled " : "");
        sb.append(this.f16081o00oo0o ? "web socket" : oOo000Oo.f9212o0O00OoO);
        sb.append(" to ");
        sb.append(o00oOo0o());
        return sb.toString();
    }

    public oo0ooO o00oOooO() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f16079o00oo0O0.o00oo0o());
        arrayList.add(this.f16078o00oo0O);
        arrayList.add(new o00oOoO(this.f16079o00oo0O0.o00oo00O()));
        arrayList.add(new o0OO0oO0(this.f16079o00oo0O0.o00oo0oO()));
        arrayList.add(new o0OOO0OO(this.f16079o00oo0O0));
        if (!this.f16081o00oo0o) {
            arrayList.addAll(this.f16079o00oo0O0.o0O0o());
        }
        arrayList.add(new o00oo00O(this.f16081o00oo0o));
        return new o0O0o(arrayList, null, null, null, 0, this.f16082o00oo0o0).o00oOo00(this.f16082o00oo0o0);
    }
}
