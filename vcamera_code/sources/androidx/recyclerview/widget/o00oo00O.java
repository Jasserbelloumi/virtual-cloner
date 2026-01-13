package androidx.recyclerview.widget;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo00O implements o0O00 {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f4397o00oo = 2;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f4398o00oo0oO = 0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f4399o00ooO00 = 3;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f4400o0O0o = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00 f4402o00oo0O0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f4401o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f4403o00oo0Oo = -1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f4405o00oo0o0 = -1;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Object f4404o00oo0o = null;

    public o00oo00O(@oo0oO0 o0O00 o0o00) {
        this.f4402o00oo0O0 = o0o00;
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOOo0(int i, int i2) {
        int i3;
        if (this.f4401o00oo0O == 1 && i >= (i3 = this.f4403o00oo0Oo)) {
            int i4 = this.f4405o00oo0o0;
            if (i <= i3 + i4) {
                this.f4405o00oo0o0 = i4 + i2;
                this.f4403o00oo0Oo = Math.min(i, i3);
                return;
            }
        }
        o00oOo0O();
        this.f4403o00oo0Oo = i;
        this.f4405o00oo0o0 = i2;
        this.f4401o00oo0O = 1;
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOOoO(int i, int i2) {
        int i3;
        if (this.f4401o00oo0O == 2 && (i3 = this.f4403o00oo0Oo) >= i && i3 <= i + i2) {
            this.f4405o00oo0o0 += i2;
            this.f4403o00oo0Oo = i;
            return;
        }
        o00oOo0O();
        this.f4403o00oo0Oo = i;
        this.f4405o00oo0o0 = i2;
        this.f4401o00oo0O = 2;
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOo00(int i, int i2, Object obj) {
        int i3;
        if (this.f4401o00oo0O == 3) {
            int i4 = this.f4403o00oo0Oo;
            int i5 = this.f4405o00oo0o0;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4404o00oo0o == obj) {
                this.f4403o00oo0Oo = Math.min(i, i4);
                this.f4405o00oo0o0 = Math.max(i5 + i4, i3) - this.f4403o00oo0Oo;
                return;
            }
        }
        o00oOo0O();
        this.f4403o00oo0Oo = i;
        this.f4405o00oo0o0 = i2;
        this.f4404o00oo0o = obj;
        this.f4401o00oo0O = 3;
    }

    public void o00oOo0O() {
        int i = this.f4401o00oo0O;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f4402o00oo0O0.o00oOOo0(this.f4403o00oo0Oo, this.f4405o00oo0o0);
        } else if (i == 2) {
            this.f4402o00oo0O0.o00oOOoO(this.f4403o00oo0Oo, this.f4405o00oo0o0);
        } else if (i == 3) {
            this.f4402o00oo0O0.o00oOo00(this.f4403o00oo0Oo, this.f4405o00oo0o0, this.f4404o00oo0o);
        }
        this.f4404o00oo0o = null;
        this.f4401o00oo0O = 0;
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOooO(int i, int i2) {
        o00oOo0O();
        this.f4402o00oo0O0.o00oOooO(i, i2);
    }
}
