package o0OOO0oo;

import androidx.recyclerview.widget.o00oo0O0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import o0OO0oO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0oOo0O0
/* loaded from: classes3.dex */
public final class o0O0o00O extends InputStream {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f13504o00oo;
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final oo0OOoo f13505o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final InputStream f13506o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f13507o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final byte[] f13508o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f13509o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final byte[] f13510o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f13511o00ooO00;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final byte[] f13512o0O0o;

    public o0O0o00O(@NotNull InputStream inputStream, @NotNull oo0OOoo oo0oooo) {
        o0ooO.o00oo0O0(inputStream, "input");
        o0ooO.o00oo0O0(oo0oooo, "base64");
        this.f13506o00oo0O0 = inputStream;
        this.f13505o00oo0O = oo0oooo;
        this.f13508o00oo0o = new byte[1];
        this.f13510o00oo0oO = new byte[1024];
        this.f13512o0O0o = new byte[1024];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f13507o00oo0Oo) {
            return;
        }
        this.f13507o00oo0Oo = true;
        this.f13506o00oo0O0.close();
    }

    public final void o00oOOo0(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f13512o0O0o;
        int i3 = this.f13504o00oo;
        o0O00000.oo0OOoo(bArr2, bArr, i, i3, i3 + i2);
        this.f13504o00oo += i2;
        o00oOoO();
    }

    public final int o00oOOoO(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f13511o00ooO00;
        int o00oo02 = i4 + this.f13505o00oo0O.o00oo0(this.f13510o00oo0oO, this.f13512o0O0o, i4, 0, i3);
        this.f13511o00ooO00 = o00oo02;
        int min = Math.min(o00oo02 - this.f13504o00oo, i2 - i);
        o00oOOo0(bArr, i, min);
        o00oOoo0();
        return min;
    }

    public final int o00oOo0O() {
        return this.f13511o00ooO00 - this.f13504o00oo;
    }

    public final int o00oOo0o(int i) {
        this.f13510o00oo0oO[i] = oo0OOoo.f13516o00oOoO;
        if ((i & 3) == 2) {
            int o00oOoO02 = o00oOoO0();
            if (o00oOoO02 >= 0) {
                this.f13510o00oo0oO[i + 1] = (byte) o00oOoO02;
            }
            return i + 2;
        }
        return i + 1;
    }

    public final void o00oOoO() {
        if (this.f13504o00oo == this.f13511o00ooO00) {
            this.f13504o00oo = 0;
            this.f13511o00ooO00 = 0;
        }
    }

    public final int o00oOoO0() {
        int read;
        if (this.f13505o00oo0O.o00ooOO()) {
            do {
                read = this.f13506o00oo0O0.read();
                if (read == -1) {
                    break;
                }
            } while (!o0O0o00.o00oOoOO(read));
            return read;
        }
        return this.f13506o00oo0O0.read();
    }

    public final void o00oOoo0() {
        byte[] bArr = this.f13512o0O0o;
        int length = bArr.length;
        int i = this.f13511o00ooO00;
        if ((this.f13510o00oo0oO.length / 4) * 3 > length - i) {
            o0O00000.oo0OOoo(bArr, bArr, 0, this.f13504o00oo, i);
            this.f13511o00ooO00 -= this.f13504o00oo;
            this.f13504o00oo = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.f13504o00oo;
        if (i < this.f13511o00ooO00) {
            int i2 = this.f13512o0O0o[i] & 255;
            this.f13504o00oo = i + 1;
            o00oOoO();
            return i2;
        }
        int read = read(this.f13508o00oo0o, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.f13508o00oo0o[0] & 255;
            }
            throw new IllegalStateException("Unreachable".toString());
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.DESTINATION);
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("offset: ", i, ", length: ", i2, ", buffer size: ");
            o00oOOo02.append(bArr.length);
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        } else if (this.f13507o00oo0Oo) {
            throw new IOException("The input stream is closed.");
        } else {
            if (this.f13509o00oo0o0) {
                return -1;
            }
            if (i2 == 0) {
                return 0;
            }
            int i4 = this.f13511o00ooO00;
            int i5 = this.f13504o00oo;
            if (i4 - i5 >= i2) {
                o00oOOo0(bArr, i, i2);
                return i2;
            }
            int i6 = ((((i2 - (i4 - i5)) + 3) - 1) / 3) * 4;
            int i7 = i;
            while (true) {
                z = this.f13509o00oo0o0;
                if (z || i6 <= 0) {
                    break;
                }
                int min = Math.min(this.f13510o00oo0oO.length, i6);
                int i8 = 0;
                while (true) {
                    z2 = this.f13509o00oo0o0;
                    if (z2 || i8 >= min) {
                        break;
                    }
                    int o00oOoO02 = o00oOoO0();
                    if (o00oOoO02 != -1) {
                        if (o00oOoO02 != 61) {
                            this.f13510o00oo0oO[i8] = (byte) o00oOoO02;
                            i8++;
                        } else {
                            i8 = o00oOo0o(i8);
                        }
                    }
                    this.f13509o00oo0o0 = true;
                }
                if (!(z2 || i8 == min)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i6 -= i8;
                i7 += o00oOOoO(bArr, i7, i3, i8);
            }
            if (i7 == i && z) {
                return -1;
            }
            return i7 - i;
        }
    }
}
