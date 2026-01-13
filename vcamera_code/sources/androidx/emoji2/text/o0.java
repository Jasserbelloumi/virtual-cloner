package androidx.emoji2.text;

import android.content.res.AssetManager;
import com.google.common.primitives.UnsignedInts;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O00Oo.o0O000Oo;
import o0OO0o.oO0000Oo;
@o0OOooO0(19)
@o00oOooO.o0O000O
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f2638o00oOOo0 = 1164798569;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f2639o00oOOoO = 1701669481;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f2640o00oOo00 = 1835365473;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOo0O {
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ByteBuffer f2641o00oOo00;

        public o00oOOo0(@oo0oO0 ByteBuffer byteBuffer) {
            this.f2641o00oOo00 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public long getPosition() {
            return this.f2641o00oOo00.position();
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public int o00oOOo0() throws IOException {
            return this.f2641o00oOo00.getInt();
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public long o00oOOoO() throws IOException {
            return o0.o00oOo0O(this.f2641o00oOo00.getInt());
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public int readUnsignedShort() throws IOException {
            return this.f2641o00oOo00.getShort() & oO0000Oo.f13232o00oo0o0;
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.f2641o00oOo00;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOo0O {
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final byte[] f2642o00oOo00;
        @oo0oO0

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final InputStream f2643o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public long f2644o00oOo0o = 0;
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final ByteBuffer f2645o00oOooO;

        public o00oOOoO(@oo0oO0 InputStream inputStream) {
            this.f2643o00oOo0O = inputStream;
            byte[] bArr = new byte[4];
            this.f2642o00oOo00 = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f2645o00oOooO = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public long getPosition() {
            return this.f2644o00oOo0o;
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public int o00oOOo0() throws IOException {
            this.f2645o00oOooO.position(0);
            o00oOo00(4);
            return this.f2645o00oOooO.getInt();
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public long o00oOOoO() throws IOException {
            this.f2645o00oOooO.position(0);
            o00oOo00(4);
            return o0.o00oOo0O(this.f2645o00oOooO.getInt());
        }

        public final void o00oOo00(@o0O0o00O(from = 0, to = 4) int i) throws IOException {
            if (this.f2643o00oOo0O.read(this.f2642o00oOo00, 0, i) != i) {
                throw new IOException("read failed");
            }
            this.f2644o00oOo0o += i;
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public int readUnsignedShort() throws IOException {
            this.f2645o00oOooO.position(0);
            o00oOo00(2);
            return this.f2645o00oOooO.getShort() & oO0000Oo.f13232o00oo0o0;
        }

        @Override // androidx.emoji2.text.o0.o00oOo0O
        public void skip(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.f2643o00oOo0O.skip(i);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i -= skip;
                this.f2644o00oOo0o += skip;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final long f2646o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final long f2647o00oOOoO;

        public o00oOo00(long j, long j2) {
            this.f2646o00oOOo0 = j;
            this.f2647o00oOOoO = j2;
        }

        public long o00oOOo0() {
            return this.f2647o00oOOoO;
        }

        public long o00oOOoO() {
            return this.f2646o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f2648o00oOOo0 = 2;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f2649o00oOOoO = 4;

        long getPosition();

        int o00oOOo0() throws IOException;

        long o00oOOoO() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int i) throws IOException;
    }

    public static o00oOo00 o00oOOo0(o00oOo0O o00ooo0o2) throws IOException {
        long j;
        o00ooo0o2.skip(4);
        int readUnsignedShort = o00ooo0o2.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            o00ooo0o2.skip(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int o00oOOo02 = o00ooo0o2.o00oOOo0();
                o00ooo0o2.skip(4);
                j = o00ooo0o2.o00oOOoO();
                o00ooo0o2.skip(4);
                if (1835365473 == o00oOOo02) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                o00ooo0o2.skip((int) (j - o00ooo0o2.getPosition()));
                o00ooo0o2.skip(12);
                long o00oOOoO2 = o00ooo0o2.o00oOOoO();
                for (int i2 = 0; i2 < o00oOOoO2; i2++) {
                    int o00oOOo03 = o00ooo0o2.o00oOOo0();
                    long o00oOOoO3 = o00ooo0o2.o00oOOoO();
                    long o00oOOoO4 = o00ooo0o2.o00oOOoO();
                    if (1164798569 == o00oOOo03 || 1701669481 == o00oOOo03) {
                        return new o00oOo00(o00oOOoO3 + j, o00oOOoO4);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static o0O000Oo o00oOOoO(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            o0O000Oo o00oOo002 = o00oOo00(open);
            if (open != null) {
                open.close();
            }
            return o00oOo002;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static o0O000Oo o00oOo00(InputStream inputStream) throws IOException {
        o00oOOoO o00ooooo2 = new o00oOOoO(inputStream);
        o00oOo00 o00oOOo02 = o00oOOo0(o00ooooo2);
        o00ooooo2.skip((int) (o00oOOo02.o00oOOoO() - o00ooooo2.f2644o00oOo0o));
        ByteBuffer allocate = ByteBuffer.allocate((int) o00oOOo02.o00oOOo0());
        int read = inputStream.read(allocate.array());
        if (read == o00oOOo02.o00oOOo0()) {
            return o0O000Oo.o00ooOo(allocate);
        }
        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Needed ");
        o00oOOo03.append(o00oOOo02.o00oOOo0());
        o00oOOo03.append(" bytes, got ");
        o00oOOo03.append(read);
        throw new IOException(o00oOOo03.toString());
    }

    public static long o00oOo0O(int i) {
        return i & UnsignedInts.INT_MASK;
    }

    public static int o00oOo0o(short s) {
        return s & oO0000Oo.f13232o00oo0o0;
    }

    public static o0O000Oo o00oOooO(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) o00oOOo0(new o00oOOo0(duplicate)).o00oOOoO());
        return o0O000Oo.o00ooOo(duplicate);
    }
}
