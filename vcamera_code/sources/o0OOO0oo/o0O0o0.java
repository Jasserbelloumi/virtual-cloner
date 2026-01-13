package o0OOO0oo;

import androidx.recyclerview.widget.o00oo0O0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.OutputStream;
import o0OO0oO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0oOo0O0
/* loaded from: classes3.dex */
public final class o0O0o0 extends OutputStream {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final oo0OOoo f13493o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final OutputStream f13494o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f13495o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final byte[] f13496o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f13497o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final byte[] f13498o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f13499o0O0o;

    public o0O0o0(@NotNull OutputStream outputStream, @NotNull oo0OOoo oo0oooo) {
        o0ooO.o00oo0O0(outputStream, "output");
        o0ooO.o00oo0O0(oo0oooo, "base64");
        this.f13494o00oo0O0 = outputStream;
        this.f13493o00oo0O = oo0oooo;
        this.f13497o00oo0o0 = oo0oooo.o00ooOO() ? 76 : -1;
        this.f13496o00oo0o = new byte[1024];
        this.f13498o00oo0oO = new byte[3];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f13495o00oo0Oo) {
            return;
        }
        this.f13495o00oo0Oo = true;
        if (this.f13499o0O0o != 0) {
            o00oOo0O();
        }
        this.f13494o00oo0O0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        o00oOOo0();
        this.f13494o00oo0O0.flush();
    }

    public final void o00oOOo0() {
        if (this.f13495o00oo0Oo) {
            throw new IOException("The output stream is closed.");
        }
    }

    public final int o00oOOoO(byte[] bArr, int i, int i2) {
        int min = Math.min(3 - this.f13499o0O0o, i2 - i);
        o0O00000.oo0OOoo(bArr, this.f13498o00oo0oO, this.f13499o0O0o, i, i + min);
        int i3 = this.f13499o0O0o + min;
        this.f13499o0O0o = i3;
        if (i3 == 3) {
            o00oOo0O();
        }
        return min;
    }

    public final void o00oOo0O() {
        if (!(o00oOo0o(this.f13498o00oo0oO, 0, this.f13499o0O0o) == 4)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f13499o0O0o = 0;
    }

    public final int o00oOo0o(byte[] bArr, int i, int i2) {
        int o00oo0o2 = this.f13493o00oo0O.o00oo0o(bArr, this.f13496o00oo0o, 0, i, i2);
        if (this.f13497o00oo0o0 == 0) {
            OutputStream outputStream = this.f13494o00oo0O0;
            oo0OOoo.f13513o00oOo00.getClass();
            outputStream.write(oo0OOoo.f13520o00oOoo0);
            this.f13497o00oo0o0 = 76;
            if (!(o00oo0o2 <= 76)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f13494o00oo0O0.write(this.f13496o00oo0o, 0, o00oo0o2);
        this.f13497o00oo0o0 -= o00oo0o2;
        return o00oo0o2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        o00oOOo0();
        byte[] bArr = this.f13498o00oo0oO;
        int i2 = this.f13499o0O0o;
        int i3 = i2 + 1;
        this.f13499o0O0o = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            o00oOo0O();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] bArr, int i, int i2) {
        int i3;
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o00oOOo0();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("offset: ", i, ", length: ", i2, ", source size: ");
            o00oOOo02.append(bArr.length);
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        } else if (i2 == 0) {
        } else {
            int i4 = this.f13499o0O0o;
            if (!(i4 < 3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (i4 != 0) {
                i += o00oOOoO(bArr, i, i3);
                if (this.f13499o0O0o != 0) {
                    return;
                }
            }
            while (i + 3 <= i3) {
                int min = Math.min((this.f13493o00oo0O.o00ooOO() ? this.f13497o00oo0o0 : this.f13496o00oo0o.length) / 4, (i3 - i) / 3);
                int i5 = (min * 3) + i;
                if (!(o00oOo0o(bArr, i, i5) == min * 4)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i = i5;
            }
            o0O00000.oo0OOoo(bArr, this.f13498o00oo0oO, 0, i, i3);
            this.f13499o0O0o = i3 - i;
        }
    }
}
