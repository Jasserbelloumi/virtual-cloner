package o0O00OOO;

import o00oOooO.o0O0OO0;
import o0O00OOO.o00oOOoO;
/* loaded from: classes.dex */
public final class o00oOo00 extends o00oOOoO<o00oOo00> {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final o00oOOo0 f10964o00ooOo;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o00oo00O {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final float f10965o00oOo0O = 62.5f;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final float f10966o00oOooO = -4.2f;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f10968o00oOOoO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float f10967o00oOOo0 = -4.2f;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOOoO.o0O00000 f10969o00oOo00 = new o00oOOoO.o0O00000();

        @Override // o0O00OOO.o00oo00O
        public boolean o00oOOo0(float f, float f2) {
            return Math.abs(f2) < this.f10968o00oOOoO;
        }

        @Override // o0O00OOO.o00oo00O
        public float o00oOOoO(float f, float f2) {
            return f2 * this.f10967o00oOOo0;
        }

        public float o00oOo00() {
            return this.f10967o00oOOo0 / (-4.2f);
        }

        public void o00oOo0O(float f) {
            this.f10968o00oOOoO = f * 62.5f;
        }

        public o00oOOoO.o0O00000 o00oOo0o(float f, float f2, long j) {
            float f3 = (float) j;
            this.f10969o00oOo00.f10963o00oOOoO = (float) (Math.exp((f3 / 1000.0f) * this.f10967o00oOOo0) * f2);
            o00oOOoO.o0O00000 o0o00000 = this.f10969o00oOo00;
            float f4 = this.f10967o00oOOo0;
            o0o00000.f10962o00oOOo0 = (float) ((Math.exp((f4 * f3) / 1000.0f) * (f2 / f4)) + (f - (f2 / f4)));
            o00oOOoO.o0O00000 o0o000002 = this.f10969o00oOo00;
            if (o00oOOo0(o0o000002.f10962o00oOOo0, o0o000002.f10963o00oOOoO)) {
                this.f10969o00oOo00.f10963o00oOOoO = 0.0f;
            }
            return this.f10969o00oOo00;
        }

        public void o00oOooO(float f) {
            this.f10967o00oOOo0 = f * (-4.2f);
        }
    }

    public <K> o00oOo00(K k, o00oOo0O<K> o00ooo0o2) {
        super(k, o00ooo0o2);
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f10964o00ooOo = o00oooo02;
        o00oooo02.o00oOo0O(this.f10956o00oOoOo * 0.75f);
    }

    @Override // o0O00OOO.o00oOOoO
    public float o00oOo0o(float f, float f2) {
        return f2 * this.f10964o00ooOo.f10967o00oOOo0;
    }

    @Override // o0O00OOO.o00oOOoO
    public boolean o00oOoOo(float f, float f2) {
        return f >= this.f10954o00oOoO0 || f <= this.f10953o00oOoO || this.f10964o00ooOo.o00oOOo0(f, f2);
    }

    @Override // o0O00OOO.o00oOOoO
    public o00oOo00 o00oo0O(float f) {
        this.f10953o00oOoO = f;
        return this;
    }

    @Override // o0O00OOO.o00oOOoO
    public o00oOo00 o00oo0O0(float f) {
        this.f10954o00oOoO0 = f;
        return this;
    }

    @Override // o0O00OOO.o00oOOoO
    public o00oOo00 o00oo0oO(float f) {
        this.f10948o00oOOo0 = f;
        return this;
    }

    public o00oOo00 o00ooO(float f) {
        this.f10954o00oOoO0 = f;
        return this;
    }

    @Override // o0O00OOO.o00oOOoO
    public boolean o00ooO0(long j) {
        o00oOOoO.o0O00000 o00oOo0o2 = this.f10964o00ooOo.o00oOo0o(this.f10949o00oOOoO, this.f10948o00oOOo0, j);
        float f = o00oOo0o2.f10962o00oOOo0;
        this.f10949o00oOOoO = f;
        float f2 = o00oOo0o2.f10963o00oOOoO;
        this.f10948o00oOOo0 = f2;
        float f3 = this.f10953o00oOoO;
        if (f < f3) {
            this.f10949o00oOOoO = f3;
            return true;
        }
        float f4 = this.f10954o00oOoO0;
        if (f <= f4) {
            return o00oOoOo(f, f2);
        }
        this.f10949o00oOOoO = f4;
        return true;
    }

    public float o00ooO0O() {
        return this.f10964o00ooOo.o00oOo00();
    }

    public o00oOo00 o00ooO0o(@o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f10964o00ooOo.o00oOooO(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    public o00oOo00 o00ooOO(float f) {
        this.f10948o00oOOo0 = f;
        return this;
    }

    public o00oOo00 o00ooOO0(float f) {
        this.f10953o00oOoO = f;
        return this;
    }

    @Override // o0O00OOO.o00oOOoO
    public void o0O0o(float f) {
        this.f10964o00ooOo.o00oOo0O(f);
    }

    public o00oOo00(o00oOoO o00oooo2) {
        super(o00oooo2);
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f10964o00ooOo = o00oooo02;
        o00oooo02.o00oOo0O(this.f10956o00oOoOo * 0.75f);
    }
}
