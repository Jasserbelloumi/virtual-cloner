package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0000O {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final CopyOnWriteArrayList<o00oOOo0> f3044o00oOOo0 = new CopyOnWriteArrayList<>();
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final FragmentManager f3045o00oOOoO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final FragmentManager.o00ooO0 f3046o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f3047o00oOOoO;

        public o00oOOo0(@oo0oO0 FragmentManager.o00ooO0 o00ooo02, boolean z) {
            this.f3046o00oOOo0 = o00ooo02;
            this.f3047o00oOOoO = z;
        }
    }

    public o0O0000O(@oo0oO0 FragmentManager fragmentManager) {
        this.f3045o00oOOoO = fragmentManager;
    }

    public void o00oOOo0(@oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOOo0(fragment, bundle, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOOo0(this.f3045o00oOOoO, fragment, bundle);
            }
        }
    }

    public void o00oOOoO(@oo0oO0 Fragment fragment, boolean z) {
        Context o00oOoOo2 = this.f3045o00oOOoO.o0O0OOO0().o00oOoOo();
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOOoO(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOOoO(this.f3045o00oOOoO, fragment, o00oOoOo2);
            }
        }
    }

    public void o00oOo00(@oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOo00(fragment, bundle, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOo00(this.f3045o00oOOoO, fragment, bundle);
            }
        }
    }

    public void o00oOo0O(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOo0O(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOo0O(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oOo0o(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOo0o(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOo0o(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oOoO(@oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOoO(fragment, bundle, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOoO(this.f3045o00oOOoO, fragment, bundle);
            }
        }
    }

    public void o00oOoO0(@oo0oO0 Fragment fragment, boolean z) {
        Context o00oOoOo2 = this.f3045o00oOOoO.o0O0OOO0().o00oOoOo();
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOoO0(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOoO0(this.f3045o00oOOoO, fragment, o00oOoOo2);
            }
        }
    }

    public void o00oOoOO(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOoOO(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOoOO(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oOoOo(@oo0oO0 Fragment fragment, @oo0oO0 Bundle bundle, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOoOo(fragment, bundle, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOoOo(this.f3045o00oOOoO, fragment, bundle);
            }
        }
    }

    public void o00oOoo0(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOoo0(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOoo0(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oOooO(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOooO(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOooO(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oOooo(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oOooo(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oOooo(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oo0(@oo0oO0 Fragment fragment, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oo0(fragment, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oo0(this.f3045o00oOOoO, fragment);
            }
        }
    }

    public void o00oo00O(@oo0oO0 Fragment fragment, @oo0oO0 View view, @o0OO00OO Bundle bundle, boolean z) {
        Fragment o0O0OOo2 = this.f3045o00oOOoO.o0O0OOo();
        if (o0O0OOo2 != null) {
            o0O0OOo2.getParentFragmentManager().o0O0OOOo().o00oo00O(fragment, view, bundle, true);
        }
        Iterator<o00oOOo0> it = this.f3044o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOOo0 next = it.next();
            if (!z || next.f3047o00oOOoO) {
                next.f3046o00oOOo0.o00oo00O(this.f3045o00oOOoO, fragment, view, bundle);
            }
        }
    }

    public void o00oo0O0(@oo0oO0 FragmentManager.o00ooO0 o00ooo02) {
        synchronized (this.f3044o00oOOo0) {
            int i = 0;
            int size = this.f3044o00oOOo0.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3044o00oOOo0.get(i).f3046o00oOOo0 == o00ooo02) {
                    this.f3044o00oOOo0.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void o00oo0OO(@oo0oO0 FragmentManager.o00ooO0 o00ooo02, boolean z) {
        this.f3044o00oOOo0.add(new o00oOOo0(o00ooo02, z));
    }
}
