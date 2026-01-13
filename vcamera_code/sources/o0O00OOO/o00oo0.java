package o0O00OOO;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import o0O00OOO.o00oOOoO;
/* loaded from: classes.dex */
public final class o00oo0 extends o00oOOoO<o00oo0> {

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final float f10972o00ooo00 = Float.MAX_VALUE;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public o00oo0OO f10973o00ooOo;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f10974o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f10975o00ooOoo;

    public <K> o00oo0(K k, o00oOo0O<K> o00ooo0o2) {
        super(k, o00ooo0o2);
        this.f10973o00ooOo = null;
        this.f10974o00ooOoO = Float.MAX_VALUE;
        this.f10975o00ooOoo = false;
    }

    public <K> o00oo0(K k, o00oOo0O<K> o00ooo0o2, float f) {
        super(k, o00ooo0o2);
        this.f10973o00ooOo = null;
        this.f10974o00ooOoO = Float.MAX_VALUE;
        this.f10975o00ooOoo = false;
        this.f10973o00ooOo = new o00oo0OO(f);
    }

    public o00oo0(o00oOoO o00oooo2) {
        super(o00oooo2);
        this.f10973o00ooOo = null;
        this.f10974o00ooOoO = Float.MAX_VALUE;
        this.f10975o00ooOoo = false;
    }

    @Override // o0O00OOO.o00oOOoO
    public float o00oOo0o(float f, float f2) {
        return this.f10973o00ooOo.o00oOOoO(f, f2);
    }

    @Override // o0O00OOO.o00oOOoO
    public boolean o00oOoOo(float f, float f2) {
        return this.f10973o00ooOo.o00oOOo0(f, f2);
    }

    @Override // o0O00OOO.o00oOOoO
    public void o00oo() {
        o00ooOO0();
        this.f10973o00ooOo.o00oOoOo(this.f10956o00oOoOo * 0.75f);
        super.o00oo();
    }

    public o00oo0OO o00ooO() {
        return this.f10973o00ooOo;
    }

    @Override // o0O00OOO.o00oOOoO
    public boolean o00ooO0(long j) {
        o00oo0OO o00oo0oo;
        double d;
        double d2;
        long j2;
        if (this.f10975o00ooOoo) {
            float f = this.f10974o00ooOoO;
            if (f != Float.MAX_VALUE) {
                this.f10973o00ooOo.f10993o00oOoOO = f;
                this.f10974o00ooOoO = Float.MAX_VALUE;
            }
            this.f10949o00oOOoO = (float) this.f10973o00ooOo.f10993o00oOoOO;
            this.f10948o00oOOo0 = 0.0f;
            this.f10975o00ooOoo = false;
            return true;
        }
        if (this.f10974o00ooOoO != Float.MAX_VALUE) {
            o00oo0OO o00oo0oo2 = this.f10973o00ooOo;
            double d3 = o00oo0oo2.f10993o00oOoOO;
            j2 = j / 2;
            o00oOOoO.o0O00000 o00oOoo02 = o00oo0oo2.o00oOoo0(this.f10949o00oOOoO, this.f10948o00oOOo0, j2);
            o00oo0oo = this.f10973o00ooOo;
            o00oo0oo.f10993o00oOoOO = this.f10974o00ooOoO;
            this.f10974o00ooOoO = Float.MAX_VALUE;
            d = o00oOoo02.f10962o00oOOo0;
            d2 = o00oOoo02.f10963o00oOOoO;
        } else {
            o00oo0oo = this.f10973o00ooOo;
            d = this.f10949o00oOOoO;
            d2 = this.f10948o00oOOo0;
            j2 = j;
        }
        o00oOOoO.o0O00000 o00oOoo03 = o00oo0oo.o00oOoo0(d, d2, j2);
        this.f10949o00oOOoO = o00oOoo03.f10962o00oOOo0;
        this.f10948o00oOOo0 = o00oOoo03.f10963o00oOOoO;
        float max = Math.max(this.f10949o00oOOoO, this.f10953o00oOoO);
        this.f10949o00oOOoO = max;
        float min = Math.min(max, this.f10954o00oOoO0);
        this.f10949o00oOOoO = min;
        if (o00oOoOo(min, this.f10948o00oOOo0)) {
            this.f10949o00oOOoO = (float) this.f10973o00ooOo.f10993o00oOoOO;
            this.f10948o00oOOo0 = 0.0f;
            return true;
        }
        return false;
    }

    public void o00ooO0O(float f) {
        if (this.f10952o00oOo0o) {
            this.f10974o00ooOoO = f;
            return;
        }
        if (this.f10973o00ooOo == null) {
            this.f10973o00ooOo = new o00oo0OO(f);
        }
        this.f10973o00ooOo.f10993o00oOoOO = f;
        o00oo();
    }

    public boolean o00ooO0o() {
        return this.f10973o00ooOo.f10987o00oOOoO > 0.0d;
    }

    public o00oo0 o00ooOO(o00oo0OO o00oo0oo) {
        this.f10973o00ooOo = o00oo0oo;
        return this;
    }

    public final void o00ooOO0() {
        o00oo0OO o00oo0oo = this.f10973o00ooOo;
        if (o00oo0oo == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) o00oo0oo.f10993o00oOoOO;
        if (d > this.f10954o00oOoO0) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.f10953o00oOoO) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public void o00ooOOo() {
        if (!o00ooO0o()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f10952o00oOo0o) {
            this.f10975o00ooOoo = true;
        }
    }

    @Override // o0O00OOO.o00oOOoO
    public void o0O0o(float f) {
    }
}
