package o0O000oo;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.o0O00;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class o0OoO00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Runnable f10807o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o0O00OO> f10808o00oOOoO = new CopyOnWriteArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<o0O00OO, o00oOOo0> f10809o00oOo00 = new HashMap();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final androidx.lifecycle.o0O00 f10810o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public androidx.lifecycle.o0O00OOO f10811o00oOOoO;

        public o00oOOo0(@o00oOooO.oo0oO0 androidx.lifecycle.o0O00 o0o00, @o00oOooO.oo0oO0 androidx.lifecycle.o0O00OOO o0o00ooo) {
            this.f10810o00oOOo0 = o0o00;
            this.f10811o00oOOoO = o0o00ooo;
            o0o00.o00oOOo0(o0o00ooo);
        }

        public void o00oOOo0() {
            this.f10810o00oOOo0.o00oOooO(this.f10811o00oOOoO);
            this.f10811o00oOOoO = null;
        }
    }

    public o0OoO00O(@o00oOooO.oo0oO0 Runnable runnable) {
        this.f10807o00oOOo0 = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOo0o(o0O00OO o0o00oo, androidx.lifecycle.o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02) {
        if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
            o00oOooo(o0o00oo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoO0(o0O00.o00oOOoO o00ooooo2, o0O00OO o0o00oo, androidx.lifecycle.o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02) {
        if (o00oooo02 == o0O00.o00oOOo0.upTo(o00ooooo2)) {
            o00oOo00(o0o00oo);
        } else if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
            o00oOooo(o0o00oo);
        } else if (o00oooo02 == o0O00.o00oOOo0.downFrom(o00ooooo2)) {
            this.f10808o00oOOoO.remove(o0o00oo);
            this.f10807o00oOOo0.run();
        }
    }

    public void o00oOo00(@o00oOooO.oo0oO0 o0O00OO o0o00oo) {
        this.f10808o00oOOoO.add(o0o00oo);
        this.f10807o00oOOo0.run();
    }

    @SuppressLint({"LambdaLast"})
    public void o00oOo0O(@o00oOooO.oo0oO0 final o0O00OO o0o00oo, @o00oOooO.oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o, @o00oOooO.oo0oO0 final o0O00.o00oOOoO o00ooooo2) {
        androidx.lifecycle.o0O00 lifecycle = o0o0o0o.getLifecycle();
        o00oOOo0 remove = this.f10809o00oOo00.remove(o0o00oo);
        if (remove != null) {
            remove.o00oOOo0();
        }
        this.f10809o00oOo00.put(o0o00oo, new o00oOOo0(lifecycle, new androidx.lifecycle.o0O00OOO() { // from class: o0O000oo.o0O00O0
            @Override // androidx.lifecycle.o0O00OOO
            public final void o00oOOoO(androidx.lifecycle.o0O0O0O o0o0o0o2, o0O00.o00oOOo0 o00oooo02) {
                o0OoO00O.this.o00oOoO0(o00ooooo2, o0o00oo, o0o0o0o2, o00oooo02);
            }
        }));
    }

    public void o00oOoO(@o00oOooO.oo0oO0 Menu menu, @o00oOooO.oo0oO0 MenuInflater menuInflater) {
        Iterator<o0O00OO> it = this.f10808o00oOOoO.iterator();
        while (it.hasNext()) {
            it.next().o00oOooO(menu, menuInflater);
        }
    }

    public void o00oOoOO(@o00oOooO.oo0oO0 Menu menu) {
        Iterator<o0O00OO> it = this.f10808o00oOOoO.iterator();
        while (it.hasNext()) {
            it.next().o00oOOo0(menu);
        }
    }

    public boolean o00oOoOo(@o00oOooO.oo0oO0 MenuItem menuItem) {
        Iterator<o0O00OO> it = this.f10808o00oOOoO.iterator();
        while (it.hasNext()) {
            if (it.next().o00oOo00(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void o00oOoo0(@o00oOooO.oo0oO0 Menu menu) {
        Iterator<o0O00OO> it = this.f10808o00oOOoO.iterator();
        while (it.hasNext()) {
            it.next().o00oOOoO(menu);
        }
    }

    public void o00oOooO(@o00oOooO.oo0oO0 final o0O00OO o0o00oo, @o00oOooO.oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o) {
        o00oOo00(o0o00oo);
        androidx.lifecycle.o0O00 lifecycle = o0o0o0o.getLifecycle();
        o00oOOo0 remove = this.f10809o00oOo00.remove(o0o00oo);
        if (remove != null) {
            remove.o00oOOo0();
        }
        this.f10809o00oOo00.put(o0o00oo, new o00oOOo0(lifecycle, new androidx.lifecycle.o0O00OOO() { // from class: o0O000oo.o0O00
            @Override // androidx.lifecycle.o0O00OOO
            public final void o00oOOoO(androidx.lifecycle.o0O0O0O o0o0o0o2, o0O00.o00oOOo0 o00oooo02) {
                o0OoO00O.this.o00oOo0o(o0o00oo, o0o0o0o2, o00oooo02);
            }
        }));
    }

    public void o00oOooo(@o00oOooO.oo0oO0 o0O00OO o0o00oo) {
        this.f10808o00oOOoO.remove(o0o00oo);
        o00oOOo0 remove = this.f10809o00oOo00.remove(o0o00oo);
        if (remove != null) {
            remove.o00oOOo0();
        }
        this.f10807o00oOOo0.run();
    }
}
