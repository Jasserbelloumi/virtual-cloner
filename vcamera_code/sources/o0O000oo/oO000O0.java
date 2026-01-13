package o0O000oo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import com.google.android.exoplayer2.C;
import o0O000oo.oO000O0;
/* loaded from: classes.dex */
public final class oO000O0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10815o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10816o00oOo00 = 1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10817o00oOooO = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOoO f10818o00oOOo0;

    @o00oOooO.o0OOooO0(20)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOoO {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Window f10819o00oOOo0;
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final View f10820o00oOOoO;

        public o00oOOo0(@o00oOooO.oo0oO0 Window window, @o00oOooO.oo0oO0 View view) {
            this.f10819o00oOOo0 = window;
            this.f10820o00oOOoO = view;
        }

        public static /* synthetic */ void o00oo0(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOOo0(o00oo00O o00oo00o) {
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOOoO(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, o0OOOO0o o0oooo0o) {
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public int o00oOo00() {
            return 0;
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoO0(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoOo(int i) {
            if (i == 0) {
                o00oo0Oo(6144);
            } else if (i == 1) {
                o00oo0Oo(4096);
                o00oo0OO(2048);
            } else if (i != 2) {
            } else {
                o00oo0Oo(2048);
                o00oo0OO(4096);
            }
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoo0(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    o00oo0O(i2);
                }
            }
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOooO(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    o00oo00O(i2);
                }
            }
        }

        public final void o00oo00O(int i) {
            if (i == 1) {
                o00oo0OO(4);
            } else if (i == 2) {
                o00oo0OO(2);
            } else if (i != 8) {
            } else {
                ((InputMethodManager) this.f10819o00oOOo0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f10819o00oOOo0.getDecorView().getWindowToken(), 0);
            }
        }

        public final void o00oo0O(int i) {
            if (i == 1) {
                o00oo0Oo(4);
                o00oo0o0(1024);
            } else if (i == 2) {
                o00oo0Oo(2);
            } else if (i != 8) {
            } else {
                final View view = this.f10820o00oOOoO;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f10819o00oOOo0.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f10819o00oOOo0.findViewById(16908290);
                }
                if (view == null || !view.hasWindowFocus()) {
                    return;
                }
                view.post(new Runnable() { // from class: o0O000oo.oO000
                    @Override // java.lang.Runnable
                    public final void run() {
                        oO000O0.o00oOOo0.o00oo0(view);
                    }
                });
            }
        }

        public void o00oo0O0(int i) {
            this.f10819o00oOOo0.addFlags(i);
        }

        public void o00oo0OO(int i) {
            View decorView = this.f10819o00oOOo0.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void o00oo0Oo(int i) {
            View decorView = this.f10819o00oOOo0.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void o00oo0o0(int i) {
            this.f10819o00oOOo0.clearFlags(i);
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO extends o00oOOo0 {
        public o00oOOoO(@o00oOooO.oo0oO0 Window window, @o00oOooO.o0OO00OO View view) {
            super(window, view);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public boolean o00oOo0o() {
            return (this.f10819o00oOOo0.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoOO(boolean z) {
            if (!z) {
                o00oo0Oo(8192);
                return;
            }
            o00oo0o0(67108864);
            o00oo0O0(Integer.MIN_VALUE);
            o00oo0OO(8192);
        }
    }

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOOoO {
        public o00oOo00(@o00oOooO.oo0oO0 Window window, @o00oOooO.o0OO00OO View view) {
            super(window, view);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public boolean o00oOo0O() {
            return (this.f10819o00oOOo0.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoO(boolean z) {
            if (!z) {
                o00oo0Oo(16);
                return;
            }
            o00oo0o0(C.BUFFER_FLAG_FIRST_SAMPLE);
            o00oo0O0(Integer.MIN_VALUE);
            o00oo0OO(16);
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final oO000O0 f10821o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final WindowInsetsController f10822o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final androidx.collection.o00ooO0<o00oo00O, WindowInsetsController.OnControllableInsetsChangedListener> f10823o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Window f10824o00oOooO;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements WindowInsetsAnimationControlListener {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public o0OOOO f10825o00oOOo0 = null;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ o0OOOO0o f10826o00oOOoO;

            public o00oOOo0(o0OOOO0o o0oooo0o) {
                this.f10826o00oOOoO = o0oooo0o;
            }

            public void onCancelled(@o00oOooO.o0OO00OO WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f10826o00oOOoO.o00oOo00(windowInsetsAnimationController == null ? null : this.f10825o00oOOo0);
            }

            public void onFinished(@o00oOooO.oo0oO0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f10826o00oOOoO.o00oOOoO(this.f10825o00oOOo0);
            }

            public void onReady(@o00oOooO.oo0oO0 WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                o0OOOO o0oooo = new o0OOOO(windowInsetsAnimationController);
                this.f10825o00oOOo0 = o0oooo;
                this.f10826o00oOOoO.o00oOOo0(o0oooo, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o00oOo0O(@o00oOooO.oo0oO0 android.view.Window r2, @o00oOooO.oo0oO0 o0O000oo.oO000O0 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = o0O000oo.oO000O0O.o00oOOo0(r2)
                r1.<init>(r0, r3)
                r1.f10824o00oOooO = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O000oo.oO000O0.o00oOo0O.<init>(android.view.Window, o0O000oo.oO000O0):void");
        }

        public o00oOo0O(@o00oOooO.oo0oO0 WindowInsetsController windowInsetsController, @o00oOooO.oo0oO0 oO000O0 oo000o0) {
            this.f10823o00oOo00 = new androidx.collection.o00ooO0<>();
            this.f10822o00oOOoO = windowInsetsController;
            this.f10821o00oOOo0 = oo000o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oo00O(o00oo00O o00oo00o, WindowInsetsController windowInsetsController, int i) {
            if (this.f10822o00oOOoO == windowInsetsController) {
                o00oo00o.o00oOOo0(this.f10821o00oOOo0, i);
            }
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOOo0(@o00oOooO.oo0oO0 final o00oo00O o00oo00o) {
            if (this.f10823o00oOo00.containsKey(o00oo00o)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o0O000oo.oO0Ooooo
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    oO000O0.o00oOo0O.this.o00oo00O(o00oo00o, windowInsetsController, i);
                }
            };
            this.f10823o00oOo00.put(o00oo00o, onControllableInsetsChangedListener);
            this.f10822o00oOOoO.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOOoO(int i, long j, @o00oOooO.o0OO00OO Interpolator interpolator, @o00oOooO.o0OO00OO CancellationSignal cancellationSignal, @o00oOooO.oo0oO0 o0OOOO0o o0oooo0o) {
            this.f10822o00oOOoO.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new o00oOOo0(o0oooo0o));
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        @SuppressLint({"WrongConstant"})
        public int o00oOo00() {
            return this.f10822o00oOOoO.getSystemBarsBehavior();
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public boolean o00oOo0O() {
            return (this.f10822o00oOOoO.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public boolean o00oOo0o() {
            return (this.f10822o00oOOoO.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoO(boolean z) {
            if (z) {
                if (this.f10824o00oOooO != null) {
                    o00oo0(16);
                }
                this.f10822o00oOOoO.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f10824o00oOooO != null) {
                o00oo0OO(16);
            }
            this.f10822o00oOOoO.setSystemBarsAppearance(0, 16);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoO0(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
            WindowInsetsController.OnControllableInsetsChangedListener remove = this.f10823o00oOo00.remove(o00oo00o);
            if (remove != null) {
                this.f10822o00oOOoO.removeOnControllableInsetsChangedListener(remove);
            }
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoOO(boolean z) {
            if (z) {
                if (this.f10824o00oOooO != null) {
                    o00oo0(8192);
                }
                this.f10822o00oOOoO.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f10824o00oOooO != null) {
                o00oo0OO(8192);
            }
            this.f10822o00oOOoO.setSystemBarsAppearance(0, 8);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoOo(int i) {
            this.f10822o00oOOoO.setSystemBarsBehavior(i);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOoo0(int i) {
            Window window = this.f10824o00oOooO;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f10822o00oOOoO.show(i);
        }

        @Override // o0O000oo.oO000O0.o00oOoO
        public void o00oOooO(int i) {
            this.f10822o00oOOoO.hide(i);
        }

        public void o00oo0(int i) {
            View decorView = this.f10824o00oOooO.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void o00oo0OO(int i) {
            View decorView = this.f10824o00oOooO.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {
        public void o00oOOo0(o00oo00O o00oo00o) {
        }

        public void o00oOOoO(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, o0OOOO0o o0oooo0o) {
        }

        public int o00oOo00() {
            return 0;
        }

        public boolean o00oOo0O() {
            return false;
        }

        public boolean o00oOo0o() {
            return false;
        }

        public void o00oOoO(boolean z) {
        }

        public void o00oOoO0(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
        }

        public void o00oOoOO(boolean z) {
        }

        public void o00oOoOo(int i) {
        }

        public void o00oOoo0(int i) {
        }

        public void o00oOooO(int i) {
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        void o00oOOo0(@o00oOooO.oo0oO0 oO000O0 oo000o0, int i);
    }

    public oO000O0(@o00oOooO.oo0oO0 Window window, @o00oOooO.oo0oO0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10818o00oOOo0 = new o00oOo0O(window, this);
        } else {
            this.f10818o00oOOo0 = new o00oOo00(window, view);
        }
    }

    @o00oOooO.o0OOooO0(30)
    @Deprecated
    public oO000O0(@o00oOooO.oo0oO0 WindowInsetsController windowInsetsController) {
        this.f10818o00oOOo0 = new o00oOo0O(windowInsetsController, this);
    }

    @o00oOooO.o0OOooO0(30)
    @o00oOooO.oo0oO0
    @Deprecated
    public static oO000O0 o00oOooo(@o00oOooO.oo0oO0 WindowInsetsController windowInsetsController) {
        return new oO000O0(windowInsetsController);
    }

    public void o00oOOo0(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
        this.f10818o00oOOo0.o00oOOo0(o00oo00o);
    }

    public void o00oOOoO(int i, long j, @o00oOooO.o0OO00OO Interpolator interpolator, @o00oOooO.o0OO00OO CancellationSignal cancellationSignal, @o00oOooO.oo0oO0 o0OOOO0o o0oooo0o) {
        this.f10818o00oOOo0.o00oOOoO(i, j, interpolator, cancellationSignal, o0oooo0o);
    }

    @SuppressLint({"WrongConstant"})
    public int o00oOo00() {
        return this.f10818o00oOOo0.o00oOo00();
    }

    public boolean o00oOo0O() {
        return this.f10818o00oOOo0.o00oOo0O();
    }

    public boolean o00oOo0o() {
        return this.f10818o00oOOo0.o00oOo0o();
    }

    public void o00oOoO(boolean z) {
        this.f10818o00oOOo0.o00oOoO(z);
    }

    public void o00oOoO0(@o00oOooO.oo0oO0 o00oo00O o00oo00o) {
        this.f10818o00oOOo0.o00oOoO0(o00oo00o);
    }

    public void o00oOoOO(boolean z) {
        this.f10818o00oOOo0.o00oOoOO(z);
    }

    public void o00oOoOo(int i) {
        this.f10818o00oOOo0.o00oOoOo(i);
    }

    public void o00oOoo0(int i) {
        this.f10818o00oOOo0.o00oOoo0(i);
    }

    public void o00oOooO(int i) {
        this.f10818o00oOOo0.o00oOooO(i);
    }
}
