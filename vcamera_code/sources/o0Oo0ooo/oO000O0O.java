package o0Oo0ooo;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Random;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0o0;
import o0Oo.o0O0oo0o;
/* loaded from: classes3.dex */
public final class oO000O0O {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final /* synthetic */ boolean f16750o00oOoOo = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16751o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Random f16752o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0 f16753o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00ooO f16754o00oOo0O = new o00ooO();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o00oOOo0 f16755o00oOo0o = new o00oOOo0();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final byte[] f16756o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f16757o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final byte[] f16758o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f16759o00oOooO;

    /* loaded from: classes3.dex */
    public final class o00oOOo0 implements o0O0oo0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public long f16760o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f16761o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f16762o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f16764o00oo0o0;

        public o00oOOo0() {
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f16764o00oo0o0) {
                throw new IOException("closed");
            }
            synchronized (oO000O0O.this) {
                oO000O0O oo000o0o = oO000O0O.this;
                oo000o0o.o00oOooO(this.f16761o00oo0O0, oo000o0o.f16754o00oOo0O.f15434o00oo0O, this.f16762o00oo0Oo, true);
            }
            this.f16764o00oo0o0 = true;
            oO000O0O.this.f16757o00oOoO0 = false;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            if (this.f16764o00oo0o0) {
                throw new IOException("closed");
            }
            synchronized (oO000O0O.this) {
                oO000O0O oo000o0o = oO000O0O.this;
                oo000o0o.o00oOooO(this.f16761o00oo0O0, oo000o0o.f16754o00oOo0O.f15434o00oo0O, this.f16762o00oo0Oo, false);
            }
            this.f16762o00oo0Oo = false;
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return oO000O0O.this.f16753o00oOo00.o00oOooO();
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            boolean z;
            long o00oOoo02;
            if (this.f16764o00oo0o0) {
                throw new IOException("closed");
            }
            oO000O0O.this.f16754o00oOo0O.o00oo(o00ooo, j);
            if (this.f16762o00oo0Oo) {
                long j2 = this.f16760o00oo0O;
                if (j2 != -1 && oO000O0O.this.f16754o00oOo0O.f15434o00oo0O > j2 - PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                    z = true;
                    o00oOoo02 = oO000O0O.this.f16754o00oOo0O.o00oOoo0();
                    if (o00oOoo02 > 0 || z) {
                    }
                    synchronized (oO000O0O.this) {
                        oO000O0O.this.o00oOooO(this.f16761o00oo0O0, o00oOoo02, this.f16762o00oo0Oo, false);
                    }
                    this.f16762o00oo0Oo = false;
                    return;
                }
            }
            z = false;
            o00oOoo02 = oO000O0O.this.f16754o00oOo0O.o00oOoo0();
            if (o00oOoo02 > 0) {
            }
        }
    }

    public oO000O0O(boolean z, o0 o0Var, Random random) {
        if (o0Var == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f16751o00oOOo0 = z;
        this.f16753o00oOo00 = o0Var;
        this.f16752o00oOOoO = random;
        this.f16756o00oOoO = z ? new byte[4] : null;
        this.f16758o00oOoOO = z ? new byte[8192] : null;
    }

    public o0O0oo0o o00oOOo0(int i, long j) {
        if (this.f16757o00oOoO0) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.f16757o00oOoO0 = true;
        o00oOOo0 o00oooo02 = this.f16755o00oOo0o;
        o00oooo02.f16761o00oo0O0 = i;
        o00oooo02.f16760o00oo0O = j;
        o00oooo02.f16762o00oo0Oo = true;
        o00oooo02.f16764o00oo0o0 = false;
        return o00oooo02;
    }

    public void o00oOOoO(int i, o0O0000O o0o0000o) throws IOException {
        o0O0000O o0o0000o2 = o0O0000O.EMPTY;
        if (i != 0 || o0o0000o != null) {
            if (i != 0) {
                oO000.o00oOooO(i);
            }
            o00ooO o00ooo = new o00ooO();
            o00ooo.writeShort(i);
            if (o0o0000o != null) {
                o00ooo.o0O0OO0O(o0o0000o);
            }
            o0o0000o2 = o00ooo.o0O0Ooo();
        }
        synchronized (this) {
            try {
                o00oOo00(8, o0o0000o2);
                this.f16759o00oOooO = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o00oOo00(int i, o0O0000O o0o0000o) throws IOException {
        if (this.f16759o00oOooO) {
            throw new IOException("closed");
        }
        int size = o0o0000o.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f16753o00oOo00.writeByte(i | 128);
        if (this.f16751o00oOOo0) {
            this.f16753o00oOo00.writeByte(size | 128);
            this.f16752o00oOOoO.nextBytes(this.f16756o00oOoO);
            this.f16753o00oOo00.write(this.f16756o00oOoO);
            byte[] byteArray = o0o0000o.toByteArray();
            oO000.o00oOo00(byteArray, byteArray.length, this.f16756o00oOoO, 0L);
            this.f16753o00oOo00.write(byteArray);
        } else {
            this.f16753o00oOo00.writeByte(size);
            this.f16753o00oOo00.o0O0OO0O(o0o0000o);
        }
        this.f16753o00oOo00.flush();
    }

    public void o00oOo0O(o0O0000O o0o0000o) throws IOException {
        synchronized (this) {
            o00oOo00(9, o0o0000o);
        }
    }

    public void o00oOo0o(o0O0000O o0o0000o) throws IOException {
        synchronized (this) {
            o00oOo00(10, o0o0000o);
        }
    }

    public void o00oOooO(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f16759o00oOooO) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f16753o00oOo00.writeByte(i);
        int i2 = this.f16751o00oOOo0 ? 128 : 0;
        if (j <= 125) {
            this.f16753o00oOo00.writeByte(i2 | ((int) j));
        } else if (j <= oO000.f16696o00oo0o0) {
            this.f16753o00oOo00.writeByte(i2 | 126);
            this.f16753o00oOo00.writeShort((int) j);
        } else {
            this.f16753o00oOo00.writeByte(i2 | 127);
            this.f16753o00oOo00.writeLong(j);
        }
        if (this.f16751o00oOOo0) {
            this.f16752o00oOOoO.nextBytes(this.f16756o00oOoO);
            this.f16753o00oOo00.write(this.f16756o00oOoO);
            long j2 = 0;
            while (j2 < j) {
                int read = this.f16754o00oOo0O.read(this.f16758o00oOoOO, 0, (int) Math.min(j, this.f16758o00oOoOO.length));
                if (read == -1) {
                    throw new AssertionError();
                }
                long j3 = read;
                oO000.o00oOo00(this.f16758o00oOoOO, j3, this.f16756o00oOoO, j2);
                this.f16753o00oOo00.write(this.f16758o00oOoOO, 0, read);
                j2 += j3;
            }
        } else {
            this.f16753o00oOo00.o00oo(this.f16754o00oOo0O, j);
        }
        this.f16753o00oOo00.o00oo0O();
    }
}
