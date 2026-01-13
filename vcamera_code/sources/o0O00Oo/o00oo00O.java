package o0O00Oo;

import com.google.common.base.Ascii;
import java.util.Arrays;
/* loaded from: classes.dex */
public class o00oo00O implements o0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public byte[] f11056o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f11057o00oOOoO;

    public o00oo00O() {
        this(10);
    }

    public o00oo00O(int i) {
        this(new byte[i]);
    }

    public o00oo00O(byte[] bArr) {
        this.f11056o00oOOo0 = bArr;
        this.f11057o00oOOoO = 0;
    }

    public o00oo00O(byte[] bArr, int i) {
        this.f11056o00oOOo0 = bArr;
        this.f11057o00oOOoO = i;
    }

    @Override // o0O00Oo.o0O000o0
    public byte get(int i) {
        return this.f11056o00oOOo0[i];
    }

    @Override // o0O00Oo.o0O000o0
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // o0O00Oo.o0O000o0
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // o0O00Oo.o0O000o0
    public int getInt(int i) {
        byte[] bArr = this.f11056o00oOOo0;
        return (bArr[i] & 255) | (bArr[i + 3] << Ascii.CAN) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // o0O00Oo.o0O000o0
    public long getLong(int i) {
        byte[] bArr = this.f11056o00oOOo0;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((255 & bArr[i7]) << 48) | (bArr[i7 + 1] << 56);
    }

    @Override // o0O00Oo.o0O000o0
    public short getShort(int i) {
        byte[] bArr = this.f11056o00oOOo0;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // o0O00Oo.o0O00, o0O00Oo.o0O000o0
    public int o00oOOo0() {
        return this.f11057o00oOOoO;
    }

    @Override // o0O00Oo.o0O00
    public void o00oOOoO(int i, byte[] bArr, int i2, int i3) {
        o00oOoO0((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f11056o00oOOo0, i, i3);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOo00(int i, int i2) {
        o00oOoO0(i + 4);
        byte[] bArr = this.f11056o00oOOo0;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i2 >> 24) & 255);
    }

    @Override // o0O00Oo.o0O000o0
    public byte[] o00oOo0O() {
        return this.f11056o00oOOo0;
    }

    @Override // o0O00Oo.o0O000o0
    public String o00oOo0o(int i, int i2) {
        return o0O0O0O.o00oOoO0(this.f11056o00oOOo0, i, i2);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoO(int i, byte b) {
        o00oOoO0(i + 1);
        this.f11056o00oOOo0[i] = b;
    }

    @Override // o0O00Oo.o0O00
    public boolean o00oOoO0(int i) {
        byte[] bArr = this.f11056o00oOOo0;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f11056o00oOOo0 = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // o0O00Oo.o0O00
    public int o00oOoOO() {
        return this.f11057o00oOOoO;
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoOo(int i, boolean z) {
        o00oOoO(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoo0(byte b) {
        o00oOoO(this.f11057o00oOOoO, b);
        this.f11057o00oOOoO++;
    }

    @Override // o0O00Oo.o0O00
    public void o00oOooO(int i, float f) {
        o00oOoO0(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f11056o00oOOo0;
        int i2 = i + 1;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i3] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i3 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOooo(int i, double d) {
        o00oOoO0(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.f11056o00oOOo0;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (doubleToRawLongBits >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0(int i, short s) {
        o00oOoO0(i + 2);
        byte[] bArr = this.f11056o00oOOo0;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // o0O00Oo.o0O000o0
    public boolean o00oo00O(int i) {
        return this.f11056o00oOOo0[i] != 0;
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0O0(byte[] bArr, int i, int i2) {
        o00oOOoO(this.f11057o00oOOoO, bArr, i, i2);
        this.f11057o00oOOoO += i2;
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0OO(int i, long j) {
        o00oOoO0(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f11056o00oOOo0;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (j >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    @Override // o0O00Oo.o0O00
    public void putBoolean(boolean z) {
        o00oOoOo(this.f11057o00oOOoO, z);
        this.f11057o00oOOoO++;
    }

    @Override // o0O00Oo.o0O00
    public void putDouble(double d) {
        o00oOooo(this.f11057o00oOOoO, d);
        this.f11057o00oOOoO += 8;
    }

    @Override // o0O00Oo.o0O00
    public void putFloat(float f) {
        o00oOooO(this.f11057o00oOOoO, f);
        this.f11057o00oOOoO += 4;
    }

    @Override // o0O00Oo.o0O00
    public void putInt(int i) {
        o00oOo00(this.f11057o00oOOoO, i);
        this.f11057o00oOOoO += 4;
    }

    @Override // o0O00Oo.o0O00
    public void putLong(long j) {
        o00oo0OO(this.f11057o00oOOoO, j);
        this.f11057o00oOOoO += 8;
    }

    @Override // o0O00Oo.o0O00
    public void putShort(short s) {
        o00oo0(this.f11057o00oOOoO, s);
        this.f11057o00oOOoO += 2;
    }
}
