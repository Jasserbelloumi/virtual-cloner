package o0O00Oo;

import com.google.common.primitives.UnsignedInts;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class o0O000 extends o00oo0 {
    public o0O000 o00oOo0o(int i, ByteBuffer byteBuffer) {
        o00oOOoO(i, 4, byteBuffer);
        return this;
    }

    public long o00oOoO(int i) {
        return o00oOoO0(i) & UnsignedInts.INT_MASK;
    }

    public int o00oOoO0(int i) {
        return this.f11055o00oOooO.getInt(o00oOOo0(i));
    }
}
