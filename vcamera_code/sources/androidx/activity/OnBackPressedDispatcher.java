package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import o00oOooO.o0O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Runnable f40o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayDeque<o00oo0O> f41o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o<Boolean> f42o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public OnBackInvokedDispatcher f43o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f44o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public OnBackInvokedCallback f45o00oOooO;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements o0O00OOO, o00oOo0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o00oo0O f46o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O00 f47o00oo0O0;
        @o0OO00OO

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o00oOo0O f48o00oo0Oo;

        public LifecycleOnBackPressedCancellable(@oo0oO0 o0O00 o0o00, @oo0oO0 o00oo0O o00oo0o2) {
            this.f47o00oo0O0 = o0o00;
            this.f46o00oo0O = o00oo0o2;
            o0o00.o00oOOo0(this);
        }

        @Override // androidx.activity.o00oOo0O
        public void cancel() {
            this.f47o00oo0O0.o00oOooO(this);
            this.f46o00oo0O.o00oOoO(this);
            o00oOo0O o00ooo0o2 = this.f48o00oo0Oo;
            if (o00ooo0o2 != null) {
                o00ooo0o2.cancel();
                this.f48o00oo0Oo = null;
            }
        }

        @Override // androidx.lifecycle.o0O00OOO
        public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
            if (o00oooo02 == o0O00.o00oOOo0.ON_START) {
                this.f48o00oo0Oo = OnBackPressedDispatcher.this.o00oOooO(this.f46o00oo0O);
            } else if (o00oooo02 != o0O00.o00oOOo0.ON_STOP) {
                if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
                    cancel();
                }
            } else {
                o00oOo0O o00ooo0o2 = this.f48o00oo0Oo;
                if (o00ooo0o2 != null) {
                    o00ooo0o2.cancel();
                }
            }
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static OnBackInvokedCallback o00oOOo0(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new o00ooO0(runnable);
        }

        @o0O0O0Oo
        public static void o00oOOoO(Object obj, int i, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        @o0O0O0Oo
        public static void o00oOo00(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOo0O {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oo0O f51o00oo0O0;

        public o00oOOoO(o00oo0O o00oo0o2) {
            this.f51o00oo0O0 = o00oo0o2;
        }

        @Override // androidx.activity.o00oOo0O
        @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
        public void cancel() {
            OnBackPressedDispatcher.this.f41o00oOOoO.remove(this.f51o00oo0O0);
            this.f51o00oo0O0.o00oOoO(this);
            if (o0O000.o00oOOo0.o00oOoo0()) {
                this.f51o00oo0O0.o00oOoOo(null);
                OnBackPressedDispatcher.this.o00oOoOO();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public OnBackPressedDispatcher(@o0OO00OO Runnable runnable) {
        this.f41o00oOOoO = new ArrayDeque<>();
        this.f44o00oOo0o = false;
        this.f40o00oOOo0 = runnable;
        if (o0O000.o00oOOo0.o00oOoo0()) {
            this.f42o00oOo00 = new o() { // from class: androidx.activity.o0O0o
                @Override // o0ooOoOO.o
                public final void accept(Object obj) {
                    OnBackPressedDispatcher.this.o00oOo0o((Boolean) obj);
                }
            };
            this.f45o00oOooO = o00oOOo0.o00oOOo0(new Runnable() { // from class: androidx.activity.o00oo
                @Override // java.lang.Runnable
                public final void run() {
                    OnBackPressedDispatcher.this.o00oOoO0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOo0o(Boolean bool) {
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOoOO();
        }
    }

    @o0O
    public void o00oOOoO(@oo0oO0 o00oo0O o00oo0o2) {
        o00oOooO(o00oo0o2);
    }

    @o0O
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    @SuppressLint({"LambdaLast"})
    public void o00oOo00(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o00oo0O o00oo0o2) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
            return;
        }
        o00oo0o2.o00oOooO(new LifecycleOnBackPressedCancellable(lifecycle, o00oo0o2));
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOoOO();
            o00oo0o2.o00oOoOo(this.f42o00oOo00);
        }
    }

    @o0O
    public boolean o00oOo0O() {
        Iterator<o00oo0O> descendingIterator = this.f41o00oOOoO.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().o00oOo0o()) {
                return true;
            }
        }
        return false;
    }

    @o0OOooO0(33)
    public void o00oOoO(@oo0oO0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f43o00oOo0O = onBackInvokedDispatcher;
        o00oOoOO();
    }

    @o0O
    public void o00oOoO0() {
        Iterator<o00oo0O> descendingIterator = this.f41o00oOOoO.descendingIterator();
        while (descendingIterator.hasNext()) {
            o00oo0O next = descendingIterator.next();
            if (next.o00oOo0o()) {
                next.o00oOo0O();
                return;
            }
        }
        Runnable runnable = this.f40o00oOOo0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @o0OOooO0(33)
    public void o00oOoOO() {
        boolean o00oOo0O2 = o00oOo0O();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f43o00oOo0O;
        if (onBackInvokedDispatcher != null) {
            if (o00oOo0O2 && !this.f44o00oOo0o) {
                o00oOOo0.o00oOOoO(onBackInvokedDispatcher, 0, this.f45o00oOooO);
                this.f44o00oOo0o = true;
            } else if (o00oOo0O2 || !this.f44o00oOo0o) {
            } else {
                o00oOOo0.o00oOo00(onBackInvokedDispatcher, this.f45o00oOooO);
                this.f44o00oOo0o = false;
            }
        }
    }

    @o0O
    @oo0oO0
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public o00oOo0O o00oOooO(@oo0oO0 o00oo0O o00oo0o2) {
        this.f41o00oOOoO.add(o00oo0o2);
        o00oOOoO o00ooooo2 = new o00oOOoO(o00oo0o2);
        o00oo0o2.o00oOooO(o00ooooo2);
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOoOO();
            o00oo0o2.o00oOoOo(this.f42o00oOo00);
        }
        return o00ooooo2;
    }
}
