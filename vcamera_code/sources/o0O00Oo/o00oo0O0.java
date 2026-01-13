package o0O00Oo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class o00oo0O0 implements o0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ByteBuffer f11058o00oOOo0;

    public o00oo0O0(ByteBuffer byteBuffer) {
        this.f11058o00oOOo0 = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // o0O00Oo.o0O000o0
    public byte get(int i) {
        return this.f11058o00oOOo0.get(i);
    }

    @Override // o0O00Oo.o0O000o0
    public double getDouble(int i) {
        return this.f11058o00oOOo0.getDouble(i);
    }

    @Override // o0O00Oo.o0O000o0
    public float getFloat(int i) {
        return this.f11058o00oOOo0.getFloat(i);
    }

    @Override // o0O00Oo.o0O000o0
    public int getInt(int i) {
        return this.f11058o00oOOo0.getInt(i);
    }

    @Override // o0O00Oo.o0O000o0
    public long getLong(int i) {
        return this.f11058o00oOOo0.getLong(i);
    }

    @Override // o0O00Oo.o0O000o0
    public short getShort(int i) {
        return this.f11058o00oOOo0.getShort(i);
    }

    @Override // o0O00Oo.o0O00, o0O00Oo.o0O000o0
    public int o00oOOo0() {
        return this.f11058o00oOOo0.limit();
    }

    @Override // o0O00Oo.o0O00
    public void o00oOOoO(int i, byte[] bArr, int i2, int i3) {
        o00oOoO0((i3 - i2) + i);
        int position = this.f11058o00oOOo0.position();
        this.f11058o00oOOo0.position(i);
        this.f11058o00oOOo0.put(bArr, i2, i3);
        this.f11058o00oOOo0.position(position);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOo00(int i, int i2) {
        o00oOoO0(i + 4);
        this.f11058o00oOOo0.putInt(i, i2);
    }

    @Override // o0O00Oo.o0O000o0
    public byte[] o00oOo0O() {
        return this.f11058o00oOOo0.array();
    }

    @Override // o0O00Oo.o0O000o0
    public String o00oOo0o(int i, int i2) {
        return o0O0O0O.o00oOoO(this.f11058o00oOOo0, i, i2);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoO(int i, byte b) {
        o00oOoO0(i + 1);
        this.f11058o00oOOo0.put(i, b);
    }

    @Override // o0O00Oo.o0O00
    public boolean o00oOoO0(int i) {
        return i <= this.f11058o00oOOo0.limit();
    }

    @Override // o0O00Oo.o0O00
    public int o00oOoOO() {
        return this.f11058o00oOOo0.position();
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoOo(int i, boolean z) {
        o00oOoO(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOoo0(byte b) {
        this.f11058o00oOOo0.put(b);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOooO(int i, float f) {
        o00oOoO0(i + 4);
        this.f11058o00oOOo0.putFloat(i, f);
    }

    @Override // o0O00Oo.o0O00
    public void o00oOooo(int i, double d) {
        o00oOoO0(i + 8);
        this.f11058o00oOOo0.putDouble(i, d);
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0(int i, short s) {
        o00oOoO0(i + 2);
        this.f11058o00oOOo0.putShort(i, s);
    }

    @Override // o0O00Oo.o0O000o0
    public boolean o00oo00O(int i) {
        return get(i) != 0;
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0O0(byte[] bArr, int i, int i2) {
        this.f11058o00oOOo0.put(bArr, i, i2);
    }

    @Override // o0O00Oo.o0O00
    public void o00oo0OO(int i, long j) {
        o00oOoO0(i + 8);
        this.f11058o00oOOo0.putLong(i, j);
    }

    @Override // o0O00Oo.o0O00
    public void putBoolean(boolean z) {
        this.f11058o00oOOo0.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // o0O00Oo.o0O00
    public void putDouble(double d) {
        this.f11058o00oOOo0.putDouble(d);
    }

    @Override // o0O00Oo.o0O00
    public void putFloat(float f) {
        this.f11058o00oOOo0.putFloat(f);
    }

    @Override // o0O00Oo.o0O00
    public void putInt(int i) {
        this.f11058o00oOOo0.putInt(i);
    }

    @Override // o0O00Oo.o0O00
    public void putLong(long j) {
        this.f11058o00oOOo0.putLong(j);
    }

    @Override // o0O00Oo.o0O00
    public void putShort(short s) {
        this.f11058o00oOOo0.putShort(s);
    }
}
