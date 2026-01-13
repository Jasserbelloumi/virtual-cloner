package o0Oo0Ooo;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O00O;
import o0Oo0Oo0.o0O0O0o0;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO00o0;
import o0Oo0o00.o00oo0;
import o0Oo0o0o.o0O000O;
import o0Oo0o0o.o0O0O0O;
import o0Oo0o0o.o0OoOoOo;
/* loaded from: classes3.dex */
public final class oO0Oo {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final /* synthetic */ boolean f16321o00oOoo0 = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00O f16322o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OO00o0 f16323o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0O0o0 f16324o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0o0000 f16325o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f16326o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f16327o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0OOOO0o f16328o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f16329o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oo0 f16330o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Object f16331o00oOooO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends WeakReference<oO0Oo> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f16332o00oOOo0;

        public o00oOOo0(oO0Oo oo0oo, Object obj) {
            super(oo0oo);
            this.f16332o00oOOo0 = obj;
        }
    }

    public oO0Oo(o0O0O0o0 o0o0o0o0, o0O00O o0o00o, Object obj) {
        this.f16324o00oOo00 = o0o0o0o0;
        this.f16322o00oOOo0 = o0o00o;
        this.f16325o00oOo0O = new o0o0000(o0o00o, o00oo0());
        this.f16331o00oOooO = obj;
    }

    public void o00oOOo0(o0OOOO0o o0oooo0o) {
        if (this.f16328o00oOoO0 != null) {
            throw new IllegalStateException();
        }
        this.f16328o00oOoO0 = o0oooo0o;
        o0oooo0o.f16307o00oo0.add(new o00oOOo0(this, this.f16331o00oOooO));
    }

    public void o00oOOoO() {
        o00oo0 o00oo0Var;
        o0OOOO0o o0oooo0o;
        synchronized (this.f16324o00oOo00) {
            this.f16329o00oOoOO = true;
            o00oo0Var = this.f16330o00oOoOo;
            o0oooo0o = this.f16328o00oOoO0;
        }
        if (o00oo0Var != null) {
            o00oo0Var.cancel();
        } else if (o0oooo0o != null) {
            o0oooo0o.o00oOoO0();
        }
    }

    public o00oo0 o00oOo00() {
        o00oo0 o00oo0Var;
        synchronized (this.f16324o00oOo00) {
            o00oo0Var = this.f16330o00oOoOo;
        }
        return o00oo0Var;
    }

    public final Socket o00oOo0O(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f16330o00oOoOo = null;
        }
        if (z2) {
            this.f16327o00oOoO = true;
        }
        o0OOOO0o o0oooo0o = this.f16328o00oOoO0;
        if (o0oooo0o != null) {
            if (z) {
                o0oooo0o.f16304o00oOoo0 = true;
            }
            if (this.f16330o00oOoOo == null) {
                if (this.f16327o00oOoO || o0oooo0o.f16304o00oOoo0) {
                    o00oOooo(o0oooo0o);
                    if (this.f16328o00oOoO0.f16307o00oo0.isEmpty()) {
                        this.f16328o00oOoO0.f16309o00oo0OO = System.nanoTime();
                        if (oO00000.f15748o00oOOo0.o00oOo0O(this.f16324o00oOo00, this.f16328o00oOoO0)) {
                            socket = this.f16328o00oOoO0.f16298o00oOo0O;
                            this.f16328o00oOoO0 = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.f16328o00oOoO0 = null;
                    return socket;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final o0OOOO0o o00oOo0o(int i, int i2, int i3, boolean z) throws IOException {
        synchronized (this.f16324o00oOo00) {
            if (this.f16327o00oOoO) {
                throw new IllegalStateException("released");
            }
            if (this.f16330o00oOoOo == null) {
                if (this.f16329o00oOoOO) {
                    throw new IOException("Canceled");
                }
                o0OOOO0o o0oooo0o = this.f16328o00oOoO0;
                if (o0oooo0o == null || o0oooo0o.f16304o00oOoo0) {
                    Socket socket = null;
                    oO00000.f15748o00oOOo0.o00oOoO(this.f16324o00oOo00, this.f16322o00oOOo0, this, null);
                    o0OOOO0o o0oooo0o2 = this.f16328o00oOoO0;
                    if (o0oooo0o2 != null) {
                        return o0oooo0o2;
                    }
                    o0OO00o0 o0oo00o0 = this.f16323o00oOOoO;
                    if (o0oo00o0 == null) {
                        o0oo00o0 = this.f16325o00oOo0O.o00oOoO0();
                    }
                    synchronized (this.f16324o00oOo00) {
                        if (this.f16329o00oOoOO) {
                            throw new IOException("Canceled");
                        }
                        oO00000.f15748o00oOOo0.o00oOoO(this.f16324o00oOo00, this.f16322o00oOOo0, this, o0oo00o0);
                        o0OOOO0o o0oooo0o3 = this.f16328o00oOoO0;
                        if (o0oooo0o3 != null) {
                            return o0oooo0o3;
                        }
                        this.f16323o00oOOoO = o0oo00o0;
                        this.f16326o00oOo0o = 0;
                        o0OOOO0o o0oooo0o4 = new o0OOOO0o(this.f16324o00oOo00, o0oo00o0);
                        o00oOOo0(o0oooo0o4);
                        o0oooo0o4.o00oOoO(i, i2, i3, z);
                        o00oo0().o00oOOo0(o0oooo0o4.f16297o00oOo00);
                        synchronized (this.f16324o00oOo00) {
                            oO00000.f15748o00oOOo0.o00oOooo(this.f16324o00oOo00, o0oooo0o4);
                            if (o0oooo0o4.o00oo0O()) {
                                socket = oO00000.f15748o00oOOo0.o00oOo0o(this.f16324o00oOo00, this.f16322o00oOOo0, this);
                                o0oooo0o4 = this.f16328o00oOoO0;
                            }
                        }
                        oO0000O.o00oOo0O(socket);
                        return o0oooo0o4;
                    }
                }
                return o0oooo0o;
            }
            throw new IllegalStateException("codec != null");
        }
    }

    public boolean o00oOoO() {
        return this.f16323o00oOOoO != null || this.f16325o00oOo0O.o00oOo00();
    }

    public final o0OOOO0o o00oOoO0(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        while (true) {
            o0OOOO0o o00oOo0o2 = o00oOo0o(i, i2, i3, z);
            synchronized (this.f16324o00oOo00) {
                if (o00oOo0o2.f16306o00oOooo == 0) {
                    return o00oOo0o2;
                }
                if (o00oOo0o2.o00oo0O0(z2)) {
                    return o00oOo0o2;
                }
                o00oOoOo();
            }
        }
    }

    public o00oo0 o00oOoOO(o0O0oo00 o0o0oo00, boolean z) {
        try {
            o00oo0 o00oo0Oo2 = o00oOoO0(o0o0oo00.o00oOoOo(), o0o0oo00.o00ooOO0(), o0o0oo00.o00ooOoo(), o0o0oo00.o00ooOO(), z).o00oo0Oo(o0o0oo00, this);
            synchronized (this.f16324o00oOo00) {
                this.f16330o00oOoOo = o00oo0Oo2;
            }
            return o00oo0Oo2;
        } catch (IOException e) {
            throw new o0OOo000(e);
        }
    }

    public void o00oOoOo() {
        Socket o00oOo0O2;
        synchronized (this.f16324o00oOo00) {
            o00oOo0O2 = o00oOo0O(true, false, false);
        }
        oO0000O.o00oOo0O(o00oOo0O2);
    }

    public void o00oOoo0() {
        Socket o00oOo0O2;
        synchronized (this.f16324o00oOo00) {
            o00oOo0O2 = o00oOo0O(false, true, false);
        }
        oO0000O.o00oOo0O(o00oOo0O2);
    }

    public synchronized o0OOOO0o o00oOooO() {
        return this.f16328o00oOoO0;
    }

    public final void o00oOooo(o0OOOO0o o0oooo0o) {
        int size = o0oooo0o.f16307o00oo0.size();
        for (int i = 0; i < size; i++) {
            if (o0oooo0o.f16307o00oo0.get(i).get() == this) {
                o0oooo0o.f16307o00oo0.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final o0OOOO o00oo0() {
        return oO00000.f15748o00oOOo0.o00oo00O(this.f16324o00oOo00);
    }

    public Socket o00oo00O(o0OOOO0o o0oooo0o) {
        if (this.f16330o00oOoOo == null && this.f16328o00oOoO0.f16307o00oo0.size() == 1) {
            Socket o00oOo0O2 = o00oOo0O(true, false, false);
            this.f16328o00oOoO0 = o0oooo0o;
            o0oooo0o.f16307o00oo0.add(this.f16328o00oOoO0.f16307o00oo0.get(0));
            return o00oOo0O2;
        }
        throw new IllegalStateException();
    }

    public void o00oo0O0(boolean z, o00oo0 o00oo0Var) {
        Socket o00oOo0O2;
        synchronized (this.f16324o00oOo00) {
            if (o00oo0Var != null) {
                if (o00oo0Var == this.f16330o00oOoOo) {
                    if (!z) {
                        this.f16328o00oOoO0.f16306o00oOooo++;
                    }
                    o00oOo0O2 = o00oOo0O(z, false, true);
                }
            }
            throw new IllegalStateException("expected " + this.f16330o00oOoOo + " but was " + o00oo0Var);
        }
        oO0000O.o00oOo0O(o00oOo0O2);
    }

    public void o00oo0OO(IOException iOException) {
        boolean z;
        Socket o00oOo0O2;
        synchronized (this.f16324o00oOo00) {
            if (iOException instanceof o0O0O0O) {
                o0OoOoOo o0oooooo = ((o0O0O0O) iOException).errorCode;
                o0OoOoOo o0oooooo2 = o0OoOoOo.REFUSED_STREAM;
                if (o0oooooo == o0oooooo2) {
                    this.f16326o00oOo0o++;
                }
                if (o0oooooo == o0oooooo2) {
                    if (this.f16326o00oOo0o > 1) {
                    }
                    z = false;
                    o00oOo0O2 = o00oOo0O(z, false, true);
                }
                this.f16323o00oOOoO = null;
                z = true;
                o00oOo0O2 = o00oOo0O(z, false, true);
            } else {
                o0OOOO0o o0oooo0o = this.f16328o00oOoO0;
                if (o0oooo0o != null && (!o0oooo0o.o00oo0O() || (iOException instanceof o0O000O))) {
                    if (this.f16328o00oOoO0.f16306o00oOooo == 0) {
                        o0OO00o0 o0oo00o0 = this.f16323o00oOOoO;
                        if (o0oo00o0 != null && iOException != null) {
                            this.f16325o00oOo0O.o00oOOo0(o0oo00o0, iOException);
                        }
                        this.f16323o00oOOoO = null;
                    }
                    z = true;
                    o00oOo0O2 = o00oOo0O(z, false, true);
                }
                z = false;
                o00oOo0O2 = o00oOo0O(z, false, true);
            }
        }
        oO0000O.o00oOo0O(o00oOo0O2);
    }

    public String toString() {
        o0OOOO0o o00oOooO2 = o00oOooO();
        return o00oOooO2 != null ? o00oOooO2.toString() : this.f16322o00oOOo0.toString();
    }
}
