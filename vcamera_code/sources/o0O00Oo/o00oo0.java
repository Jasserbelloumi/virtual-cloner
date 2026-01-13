package o0O00Oo;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f11052o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f11053o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f11054o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public ByteBuffer f11055o00oOooO;

    public int o00oOOo0(int i) {
        return (i * this.f11054o00oOo00) + this.f11052o00oOOo0;
    }

    public void o00oOOoO(int i, int i2, ByteBuffer byteBuffer) {
        this.f11055o00oOooO = byteBuffer;
        if (byteBuffer != null) {
            this.f11052o00oOOo0 = i;
            this.f11053o00oOOoO = byteBuffer.getInt(i - 4);
            this.f11054o00oOo00 = i2;
            return;
        }
        this.f11052o00oOOo0 = 0;
        this.f11053o00oOOoO = 0;
        this.f11054o00oOo00 = 0;
    }

    public int o00oOo00() {
        return this.f11052o00oOOo0;
    }

    public void o00oOo0O() {
        o00oOOoO(0, 0, null);
    }

    public int o00oOooO() {
        return this.f11053o00oOOoO;
    }
}
