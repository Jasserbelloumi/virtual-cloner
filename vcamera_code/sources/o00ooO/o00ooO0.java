package o00ooO;

import o00ooO.o00oOoO;
import o00ooOO0.o0O00000;
/* loaded from: classes.dex */
public class o00ooO0 extends o00oo0O {

    /* renamed from: oooOO0  reason: collision with root package name */
    public int f7880oooOO0 = 0;

    /* renamed from: o0O0oO0  reason: collision with root package name */
    public int f7869o0O0oO0 = 0;

    /* renamed from: o0O0oO0O  reason: collision with root package name */
    public int f7870o0O0oO0O = 0;

    /* renamed from: o0O0oO0o  reason: collision with root package name */
    public int f7871o0O0oO0o = 0;

    /* renamed from: o0O0oO  reason: collision with root package name */
    public int f7868o0O0oO = 0;

    /* renamed from: o0O0oOO0  reason: collision with root package name */
    public int f7873o0O0oOO0 = 0;

    /* renamed from: o0O0oOO  reason: collision with root package name */
    public int f7872o0O0oOO = 0;

    /* renamed from: o0O0oo00  reason: collision with root package name */
    public int f7878o0O0oo00 = 0;

    /* renamed from: o0O0oOOO  reason: collision with root package name */
    public boolean f7874o0O0oOOO = false;

    /* renamed from: o0O0oOo0  reason: collision with root package name */
    public int f7876o0O0oOo0 = 0;

    /* renamed from: oo0oOOo  reason: collision with root package name */
    public int f7879oo0oOOo = 0;

    /* renamed from: o0O0oOo  reason: collision with root package name */
    public o0O00000.o00oOOo0 f7875o0O0oOo = new o0O00000.o00oOOo0();

    /* renamed from: o0O0oOoO  reason: collision with root package name */
    public o0O00000.o00oOOoO f7877o0O0oOoO = null;

    @Override // o00ooO.o00oo0O, o00ooO.o00oo0O0
    public void o00oOOoO(o00oo00O o00oo00o) {
        o0OO00OO();
    }

    public int o0OO0() {
        return this.f7880oooOO0;
    }

    public void o0OO00OO() {
        for (int i = 0; i < this.f7852o0O0oo0O; i++) {
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i];
            if (o00oooo2 != null) {
                o00oooo2.o0O0o0oO(true);
            }
        }
    }

    public int o0OO00Oo() {
        return this.f7876o0O0oOo0;
    }

    public int o0OO00o() {
        return this.f7878o0O0oo00;
    }

    public int o0OO00o0() {
        return this.f7869o0O0oO0;
    }

    public int o0OO00oo() {
        return this.f7879oo0oOOo;
    }

    public void o0OO0O0(int i, int i2, int i3, int i4) {
    }

    public void o0OO0O0O(o00oOoO o00oooo2, o00oOoO.o00oOOoO o00ooooo2, int i, o00oOoO.o00oOOoO o00ooooo3, int i2) {
        while (this.f7877o0O0oOoO == null && o0() != null) {
            this.f7877o0O0oOoO = ((o00oo00O) o0()).o0OO0oOO();
        }
        o0O00000.o00oOOo0 o00oooo02 = this.f7875o0O0oOo;
        o00oooo02.f8873o00oOOo0 = o00ooooo2;
        o00oooo02.f8874o00oOOoO = o00ooooo3;
        o00oooo02.f8875o00oOo00 = i;
        o00oooo02.f8882o00oOooO = i2;
        this.f7877o0O0oOoO.o00oOOoO(o00oooo2, o00oooo02);
        o00oooo2.o0O0ooOO(this.f7875o0O0oOo.f8876o00oOo0O);
        o00oooo2.o0O0o00(this.f7875o0O0oOo.f8877o00oOo0o);
        o00oooo2.o0O0o000(this.f7875o0O0oOo.f8878o00oOoO);
        o00oooo2.o0O0OOOo(this.f7875o0O0oOo.f8879o00oOoO0);
    }

    public boolean o0OO0OoO() {
        o00oOoO o00oooo2 = this.f7716o0O00000;
        o0O00000.o00oOOoO o0OO0oOO2 = o00oooo2 != null ? ((o00oo00O) o00oooo2).o0OO0oOO() : null;
        if (o0OO0oOO2 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f7852o0O0oo0O) {
                return true;
            }
            o00oOoO o00oooo3 = this.f7851o0O0o0oo[i];
            if (o00oooo3 != null && !(o00oooo3 instanceof o00oo0OO)) {
                o00oOoO.o00oOOoO o00ooO0O2 = o00oooo3.o00ooO0O(0);
                o00oOoO.o00oOOoO o00ooO0O3 = o00oooo3.o00ooO0O(1);
                o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o00ooO0O2 != o00ooooo2 || o00oooo3.f7685o00oo0O0 == 1 || o00ooO0O3 != o00ooooo2 || o00oooo3.f7684o00oo0O == 1) {
                    z = false;
                }
                if (!z) {
                    if (o00ooO0O2 == o00ooooo2) {
                        o00ooO0O2 = o00oOoO.o00oOOoO.WRAP_CONTENT;
                    }
                    if (o00ooO0O3 == o00ooooo2) {
                        o00ooO0O3 = o00oOoO.o00oOOoO.WRAP_CONTENT;
                    }
                    o0O00000.o00oOOo0 o00oooo02 = this.f7875o0O0oOo;
                    o00oooo02.f8873o00oOOo0 = o00ooO0O2;
                    o00oooo02.f8874o00oOOoO = o00ooO0O3;
                    o00oooo02.f8875o00oOo00 = o00oooo3.o0OoO00O();
                    this.f7875o0O0oOo.f8882o00oOooO = o00oooo3.o00ooOO();
                    o0OO0oOO2.o00oOOoO(o00oooo3, this.f7875o0O0oOo);
                    o00oooo3.o0O0ooOO(this.f7875o0O0oOo.f8876o00oOo0O);
                    o00oooo3.o0O0o00(this.f7875o0O0oOo.f8877o00oOo0o);
                    o00oooo3.o0O0OOOo(this.f7875o0O0oOo.f8879o00oOoO0);
                }
            }
            i++;
        }
    }

    public void o0OO0Ooo(boolean z) {
        this.f7874o0O0oOOO = z;
    }

    public void o0OO0o(int i) {
        this.f7870o0O0oO0O = i;
        this.f7872o0O0oOO = i;
    }

    public void o0OO0o0(int i) {
        this.f7870o0O0oO0O = i;
        this.f7880oooOO0 = i;
        this.f7871o0O0oO0o = i;
        this.f7869o0O0oO0 = i;
        this.f7868o0O0oO = i;
        this.f7873o0O0oOO0 = i;
    }

    public void o0OO0o00(int i, int i2) {
        this.f7876o0O0oOo0 = i;
        this.f7879oo0oOOo = i2;
    }

    public void o0OO0o0O(int i) {
        this.f7869o0O0oO0 = i;
    }

    public void o0OO0o0o(int i) {
        this.f7873o0O0oOO0 = i;
    }

    public void o0OO0oO(int i) {
        this.f7868o0O0oO = i;
        this.f7872o0O0oOO = i;
        this.f7878o0O0oo00 = i;
    }

    public void o0OO0oO0(int i) {
        this.f7871o0O0oO0o = i;
        this.f7878o0O0oo00 = i;
    }

    public void o0OO0oOO(int i) {
        this.f7880oooOO0 = i;
    }

    public boolean o0OOooO0() {
        return this.f7874o0O0oOOO;
    }

    public int o0OoOoO() {
        return this.f7872o0O0oOO;
    }

    public void oo0ooO(boolean z) {
        int i = this.f7868o0O0oO;
        if (i > 0 || this.f7873o0O0oOO0 > 0) {
            if (z) {
                this.f7872o0O0oOO = this.f7873o0O0oOO0;
                this.f7878o0O0oo00 = i;
                return;
            }
            this.f7872o0O0oOO = i;
            this.f7878o0O0oo00 = this.f7873o0O0oOO0;
        }
    }
}
