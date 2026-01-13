package o0Oo0OoO;

import java.io.IOException;
import o0Oo.o00ooO;
import o0Oo.o0O000O;
import o0Oo.o0O0oo0o;
/* loaded from: classes3.dex */
public class o0OOO0 extends o0O000O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f16231o00oo0O;

    public o0OOO0(o0O0oo0o o0o0oo0o) {
        super(o0o0oo0o);
    }

    @Override // o0Oo.o0O000O, o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f16231o00oo0O) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f16231o00oo0O = true;
            o00oOOoO(e);
        }
    }

    @Override // o0Oo.o0O000O, o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() throws IOException {
        if (this.f16231o00oo0O) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f16231o00oo0O = true;
            o00oOOoO(e);
        }
    }

    public void o00oOOoO(IOException iOException) {
    }

    @Override // o0Oo.o0O000O, o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        if (this.f16231o00oo0O) {
            o00ooo.skip(j);
            return;
        }
        try {
            super.o00oo(o00ooo, j);
        } catch (IOException e) {
            this.f16231o00oo0O = true;
            o00oOOoO(e);
        }
    }
}
