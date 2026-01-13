package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0O
@o0OOOOO0.o0OOO00({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* loaded from: classes.dex */
public final class o0OoO00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00 f3405o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00.o00oOOoO f3406o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00ooO f3407o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00OOO f3408o00oOooO;

    public o0OoO00O(@NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o00ooO o00ooo, @NotNull final ooOOOOoo oooooooo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "minState");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo, "dispatchQueue");
        o0OOOOO0.o0ooO.o00oo0O0(oooooooo, "parentJob");
        this.f3405o00oOOo0 = o0o00;
        this.f3406o00oOOoO = o00ooooo2;
        this.f3407o00oOo00 = o00ooo;
        o0O00OOO o0o00ooo = new o0O00OOO() { // from class: androidx.lifecycle.o0O00O0
            @Override // androidx.lifecycle.o0O00OOO
            public final void o00oOOoO(o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02) {
                o0OoO00O.o00oOooO(o0OoO00O.this, oooooooo, o0o0o0o, o00oooo02);
            }
        };
        this.f3408o00oOooO = o0o00ooo;
        if (o0o00.o00oOOoO() != o0O00.o00oOOoO.DESTROYED) {
            o0o00.o00oOOo0(o0o00ooo);
            return;
        }
        ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
        o00oOOoO();
    }

    public static final void o00oOooO(o0OoO00O o0ooo00o, ooOOOOoo oooooooo, o0O0O0O o0o0o0o, o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(oooooooo, "$parentJob");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "<anonymous parameter 1>");
        if (o0o0o0o.getLifecycle().o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
            ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
            o0ooo00o.o00oOOoO();
            return;
        }
        int compareTo = o0o0o0o.getLifecycle().o00oOOoO().compareTo(o0ooo00o.f3406o00oOOoO);
        o00ooO o00ooo = o0ooo00o.f3407o00oOo00;
        if (compareTo < 0) {
            o00ooo.f3311o00oOOo0 = true;
        } else {
            o00ooo.o00oOoOO();
        }
    }

    @o00oOooO.o0O
    public final void o00oOOoO() {
        this.f3405o00oOOo0.o00oOooO(this.f3408o00oOooO);
        this.f3407o00oOo00.o00oOoO0();
    }

    public final void o00oOo00(ooOOOOoo oooooooo) {
        ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
        o00oOOoO();
    }
}
