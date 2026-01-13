package o0Oo0Oo0;

import android.support.v4.media.o00oOo00;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o0O0OO0.o00oOo0O;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public abstract class o0OO00OO implements Closeable {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Reader f16097o00oo0O0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends o0OO00OO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f16098o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ long f16099o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f16100o00oo0o0;

        public o00oOOo0(o0oOo0O0 o0ooo0o0, long j, o0O00000 o0o00000) {
            this.f16098o00oo0O = o0ooo0o0;
            this.f16099o00oo0Oo = j;
            this.f16100o00oo0o0 = o0o00000;
        }

        @Override // o0Oo0Oo0.o0OO00OO
        @Nullable
        public o0oOo0O0 o00oOoO() {
            return this.f16098o00oo0O;
        }

        @Override // o0Oo0Oo0.o0OO00OO
        public long o00oOoO0() {
            return this.f16099o00oo0Oo;
        }

        @Override // o0Oo0Oo0.o0OO00OO
        public o0O00000 o00ooO00() {
            return this.f16100o00oo0o0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends Reader {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Charset f16101o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00000 f16102o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f16103o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public Reader f16104o00oo0o0;

        public o00oOOoO(o0O00000 o0o00000, Charset charset) {
            this.f16102o00oo0O0 = o0o00000;
            this.f16101o00oo0O = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16103o00oo0Oo = true;
            Reader reader = this.f16104o00oo0o0;
            if (reader != null) {
                reader.close();
            } else {
                this.f16102o00oo0O0.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f16103o00oo0Oo) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f16104o00oo0o0;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f16102o00oo0O0.o0O0oOo0(), oO0000O.o00oOOo0(this.f16102o00oo0O0, this.f16101o00oo0O));
                this.f16104o00oo0o0 = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static o0OO00OO o00oOoo0(@Nullable o0oOo0O0 o0ooo0o0, long j, o0O00000 o0o00000) {
        if (o0o00000 != null) {
            return new o00oOOo0(o0ooo0o0, j, o0o00000);
        }
        throw new NullPointerException("source == null");
    }

    public static o0OO00OO o00oOooo(@Nullable o0oOo0O0 o0ooo0o0, String str) {
        Charset charset = oO0000O.f15758o00oOoOo;
        if (o0ooo0o0 != null) {
            Charset o00oOOoO2 = o0ooo0o0.o00oOOoO(null);
            if (o00oOOoO2 == null) {
                o0ooo0o0 = o0oOo0O0.o00oOo00(o0ooo0o0 + "; charset=utf-8");
            } else {
                charset = o00oOOoO2;
            }
        }
        o00ooO o0O0OooO2 = new o00ooO().o0O0OooO(str, charset);
        return o00oOoo0(o0ooo0o0, o0O0OooO2.f15434o00oo0O, o0O0OooO2);
    }

    public static o0OO00OO o00oo0(@Nullable o0oOo0O0 o0ooo0o0, byte[] bArr) {
        return o00oOoo0(o0ooo0o0, bArr.length, new o00ooO().write(bArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        oO0000O.o00oOo00(o00ooO00());
    }

    public final InputStream o00oOOo0() {
        return o00ooO00().o0O0oOo0();
    }

    public final byte[] o00oOOoO() throws IOException {
        long o00oOoO02 = o00oOoO0();
        if (o00oOoO02 <= 2147483647L) {
            o0O00000 o00ooO002 = o00ooO00();
            try {
                byte[] o0O0O0o02 = o00ooO002.o0O0O0o0();
                oO0000O.o00oOo00(o00ooO002);
                if (o00oOoO02 == -1 || o00oOoO02 == o0O0O0o02.length) {
                    return o0O0O0o02;
                }
                throw new IOException(o00oOo00.o00oOOo0(androidx.concurrent.futures.o00oOOo0.o00oOOo0("Content-Length (", o00oOoO02, ") and stream length ("), o0O0O0o02.length, ") disagree"));
            } catch (Throwable th) {
                oO0000O.o00oOo00(o00ooO002);
                throw th;
            }
        }
        throw new IOException(o00oOo0O.o00oOOo0("Cannot buffer entire body for content length: ", o00oOoO02));
    }

    public final Reader o00oOo0O() {
        Reader reader = this.f16097o00oo0O0;
        if (reader != null) {
            return reader;
        }
        o00oOOoO o00ooooo2 = new o00oOOoO(o00ooO00(), o00oOo0o());
        this.f16097o00oo0O0 = o00ooooo2;
        return o00ooooo2;
    }

    public final Charset o00oOo0o() {
        o0oOo0O0 o00oOoO2 = o00oOoO();
        return o00oOoO2 != null ? o00oOoO2.o00oOOoO(oO0000O.f15758o00oOoOo) : oO0000O.f15758o00oOoOo;
    }

    @Nullable
    public abstract o0oOo0O0 o00oOoO();

    public abstract long o00oOoO0();

    public final String o00ooO0() throws IOException {
        o0O00000 o00ooO002 = o00ooO00();
        try {
            return o00ooO002.o0O0OoO0(oO0000O.o00oOOo0(o00ooO002, o00oOo0o()));
        } finally {
            oO0000O.o00oOo00(o00ooO002);
        }
    }

    public abstract o0O00000 o00ooO00();
}
