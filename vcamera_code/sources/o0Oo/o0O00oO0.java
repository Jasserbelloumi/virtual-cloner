package o0Oo;

import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public final class o0O00oO0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f15490o00oOoO = 8192;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f15491o00oOoOO = 1024;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final byte[] f15492o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f15493o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15494o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f15495o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O00oO0 f15496o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O00oO0 f15497o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f15498o00oOooO;

    public o0O00oO0() {
        this.f15492o00oOOo0 = new byte[8192];
        this.f15495o00oOo0O = true;
        this.f15498o00oOooO = false;
    }

    public o0O00oO0(o0O00oO0 o0o00oo0) {
        this(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, o0o00oo0.f15494o00oOo00);
        o0o00oo0.f15498o00oOooO = true;
    }

    public o0O00oO0(byte[] bArr, int i, int i2) {
        this.f15492o00oOOo0 = bArr;
        this.f15493o00oOOoO = i;
        this.f15494o00oOo00 = i2;
        this.f15495o00oOo0O = false;
        this.f15498o00oOooO = true;
    }

    public void o00oOOo0() {
        o0O00oO0 o0o00oo0 = this.f15497o00oOoO0;
        if (o0o00oo0 == this) {
            throw new IllegalStateException();
        }
        if (o0o00oo0.f15495o00oOo0O) {
            int i = this.f15494o00oOo00 - this.f15493o00oOOoO;
            if (i > (8192 - o0o00oo0.f15494o00oOo00) + (o0o00oo0.f15498o00oOooO ? 0 : o0o00oo0.f15493o00oOOoO)) {
                return;
            }
            o00oOo0O(o0o00oo0, i);
            o00oOOoO();
            o0O0O0O.o00oOOo0(this);
        }
    }

    @Nullable
    public o0O00oO0 o00oOOoO() {
        o0O00oO0 o0o00oo0 = this.f15496o00oOo0o;
        o0O00oO0 o0o00oo02 = o0o00oo0 != this ? o0o00oo0 : null;
        o0O00oO0 o0o00oo03 = this.f15497o00oOoO0;
        o0o00oo03.f15496o00oOo0o = o0o00oo0;
        this.f15496o00oOo0o.f15497o00oOoO0 = o0o00oo03;
        this.f15496o00oOo0o = null;
        this.f15497o00oOoO0 = null;
        return o0o00oo02;
    }

    public o0O00oO0 o00oOo00(o0O00oO0 o0o00oo0) {
        o0o00oo0.f15497o00oOoO0 = this;
        o0o00oo0.f15496o00oOo0o = this.f15496o00oOo0o;
        this.f15496o00oOo0o.f15497o00oOoO0 = o0o00oo0;
        this.f15496o00oOo0o = o0o00oo0;
        return o0o00oo0;
    }

    public void o00oOo0O(o0O00oO0 o0o00oo0, int i) {
        if (!o0o00oo0.f15495o00oOo0O) {
            throw new IllegalArgumentException();
        }
        int i2 = o0o00oo0.f15494o00oOo00;
        if (i2 + i > 8192) {
            if (o0o00oo0.f15498o00oOooO) {
                throw new IllegalArgumentException();
            }
            int i3 = o0o00oo0.f15493o00oOOoO;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = o0o00oo0.f15492o00oOOo0;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            o0o00oo0.f15494o00oOo00 -= o0o00oo0.f15493o00oOOoO;
            o0o00oo0.f15493o00oOOoO = 0;
        }
        System.arraycopy(this.f15492o00oOOo0, this.f15493o00oOOoO, o0o00oo0.f15492o00oOOo0, o0o00oo0.f15494o00oOo00, i);
        o0o00oo0.f15494o00oOo00 += i;
        this.f15493o00oOOoO += i;
    }

    public o0O00oO0 o00oOooO(int i) {
        o0O00oO0 o00oOOoO2;
        if (i <= 0 || i > this.f15494o00oOo00 - this.f15493o00oOOoO) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            o00oOOoO2 = new o0O00oO0(this);
        } else {
            o00oOOoO2 = o0O0O0O.o00oOOoO();
            System.arraycopy(this.f15492o00oOOo0, this.f15493o00oOOoO, o00oOOoO2.f15492o00oOOo0, 0, i);
        }
        o00oOOoO2.f15494o00oOo00 = o00oOOoO2.f15493o00oOOoO + i;
        this.f15493o00oOOoO += i;
        this.f15497o00oOoO0.o00oOo00(o00oOOoO2);
        return o00oOOoO2;
    }
}
