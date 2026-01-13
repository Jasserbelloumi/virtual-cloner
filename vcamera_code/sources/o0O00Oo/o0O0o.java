package o0O00Oo;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class o0O0o extends o00oo0 {
    public o0O0o o00oOo0o(int i, ByteBuffer byteBuffer) {
        o00oOOoO(i, 1, byteBuffer);
        return this;
    }

    public int o00oOoO(int i) {
        return o00oOoO0(i) & 255;
    }

    public byte o00oOoO0(int i) {
        return this.f11055o00oOooO.get(o00oOOo0(i));
    }
}
