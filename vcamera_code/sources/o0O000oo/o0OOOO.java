package o0O000oo;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import com.google.common.collect.LinkedHashMultimap;
import o00oooOo.oOO00o;
/* loaded from: classes.dex */
public final class o0OOOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f10750o00oOOo0;

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final WindowInsetsAnimationController f10751o00oOOo0;

        public o00oOOo0(@o00oOooO.oo0oO0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f10751o00oOOo0 = windowInsetsAnimationController;
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public void o00oOOo0(boolean z) {
            this.f10751o00oOOo0.finish(z);
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public float o00oOOoO() {
            return this.f10751o00oOOo0.getCurrentAlpha();
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public float o00oOo00() {
            return this.f10751o00oOOo0.getCurrentFraction();
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        @o00oOooO.oo0oO0
        public oOO00o o00oOo0O() {
            return oOO00o.o00oOoO0(this.f10751o00oOOo0.getHiddenStateInsets());
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        @o00oOooO.oo0oO0
        public oOO00o o00oOo0o() {
            return oOO00o.o00oOoO0(this.f10751o00oOOo0.getShownStateInsets());
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public boolean o00oOoO() {
            return this.f10751o00oOOo0.isCancelled();
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        @SuppressLint({"WrongConstant"})
        public int o00oOoO0() {
            return this.f10751o00oOOo0.getTypes();
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public boolean o00oOoOO() {
            return this.f10751o00oOOo0.isFinished();
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        public void o00oOoOo(@o00oOooO.o0OO00OO oOO00o ooo00o, float f, float f2) {
            this.f10751o00oOOo0.setInsetsAndAlpha(ooo00o == null ? null : ooo00o.o00oOoO(), f, f2);
        }

        @Override // o0O000oo.o0OOOO.o00oOOoO
        @o00oOooO.oo0oO0
        public oOO00o o00oOooO() {
            return oOO00o.o00oOoO0(this.f10751o00oOOo0.getCurrentInsets());
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public void o00oOOo0(boolean z) {
        }

        public float o00oOOoO() {
            return 0.0f;
        }

        @o00oOooO.o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        public float o00oOo00() {
            return 0.0f;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOo0O() {
            return oOO00o.f9790o00oOo0O;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOo0o() {
            return oOO00o.f9790o00oOo0O;
        }

        public boolean o00oOoO() {
            return true;
        }

        public int o00oOoO0() {
            return 0;
        }

        public boolean o00oOoOO() {
            return false;
        }

        public void o00oOoOo(@o00oOooO.o0OO00OO oOO00o ooo00o, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f2) {
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOooO() {
            return oOO00o.f9790o00oOo0O;
        }
    }

    @o00oOooO.o0OOooO0(30)
    public o0OOOO(@o00oOooO.oo0oO0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f10750o00oOOo0 = new o00oOOo0(windowInsetsAnimationController);
    }

    public void o00oOOo0(boolean z) {
        this.f10750o00oOOo0.o00oOOo0(z);
    }

    public float o00oOOoO() {
        return this.f10750o00oOOo0.o00oOOoO();
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float o00oOo00() {
        return this.f10750o00oOOo0.o00oOo00();
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOo0O() {
        return this.f10750o00oOOo0.o00oOo0O();
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOo0o() {
        return this.f10750o00oOOo0.o00oOo0o();
    }

    public boolean o00oOoO() {
        return this.f10750o00oOOo0.o00oOoO();
    }

    public int o00oOoO0() {
        return this.f10750o00oOOo0.o00oOoO0();
    }

    public boolean o00oOoOO() {
        return this.f10750o00oOOo0.o00oOoOO();
    }

    public boolean o00oOoOo() {
        return (o00oOoOO() || o00oOoO()) ? false : true;
    }

    public void o00oOoo0(@o00oOooO.o0OO00OO oOO00o ooo00o, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f2) {
        this.f10750o00oOOo0.o00oOoOo(ooo00o, f, f2);
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOooO() {
        return this.f10750o00oOOo0.o00oOooO();
    }
}
