package o0Oo;

import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes3.dex */
public final class o0O000 implements o0O0oo0o {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Deflater f15453o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0 f15454o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f15455o00oo0Oo;

    public o0O000(o0 o0Var, Deflater deflater) {
        if (o0Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15454o00oo0O0 = o0Var;
        this.f15453o00oo0O = deflater;
    }

    public o0O000(o0O0oo0o o0o0oo0o, Deflater deflater) {
        this(o0O00O.o00oOo00(o0o0oo0o), deflater);
    }

    @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15455o00oo0Oo) {
            return;
        }
        Throwable th = null;
        try {
            o00oOOoO();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f15453o00oo0O.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f15454o00oo0O0.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f15455o00oo0Oo = true;
        if (th != null) {
            o0O0OO0.o00oOo0o(th);
        }
    }

    @Override // o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() throws IOException {
        o00oOOo0(true);
        this.f15454o00oo0O0.flush();
    }

    @IgnoreJRERequirement
    public final void o00oOOo0(boolean z) throws IOException {
        o0O00oO0 o0O0oOO02;
        o00ooO o00oOo002 = this.f15454o00oo0O0.o00oOo00();
        while (true) {
            o0O0oOO02 = o00oOo002.o0O0oOO0(1);
            Deflater deflater = this.f15453o00oo0O;
            byte[] bArr = o0O0oOO02.f15492o00oOOo0;
            int i = o0O0oOO02.f15494o00oOo00;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                o0O0oOO02.f15494o00oOo00 += deflate;
                o00oOo002.f15434o00oo0O += deflate;
                this.f15454o00oo0O0.o00ooOo();
            } else if (this.f15453o00oo0O.needsInput()) {
                break;
            }
        }
        if (o0O0oOO02.f15493o00oOOoO == o0O0oOO02.f15494o00oOo00) {
            o00oOo002.f15435o00oo0O0 = o0O0oOO02.o00oOOoO();
            o0O0O0O.o00oOOo0(o0O0oOO02);
        }
    }

    public void o00oOOoO() throws IOException {
        this.f15453o00oo0O.finish();
        o00oOOo0(false);
    }

    @Override // o0Oo.o0O0oo0o
    public o0O0O0o0 o00oOooO() {
        return this.f15454o00oo0O0.o00oOooO();
    }

    @Override // o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
        while (j > 0) {
            o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
            int min = (int) Math.min(j, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
            this.f15453o00oo0O.setInput(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
            o00oOOo0(false);
            long j2 = min;
            o00ooo.f15434o00oo0O -= j2;
            int i = o0o00oo0.f15493o00oOOoO + min;
            o0o00oo0.f15493o00oOOoO = i;
            if (i == o0o00oo0.f15494o00oOo00) {
                o00ooo.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
                o0O0O0O.o00oOOo0(o0o00oo0);
            }
            j -= j2;
        }
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DeflaterSink(");
        o00oOOo02.append(this.f15454o00oo0O0);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }
}
