package o0O0o00o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
import o0O0o0.o00oOOo0;
import o0O0o0.o00oOOoO;
import o0O0o0.o00oOo00;
import o0O0o0.o00oOo0O;
import o0O0o0Oo.o0OoO00O;
import o0oOo0O0.oO00O0oO;
/* loaded from: classes.dex */
public class o00oo0OO implements o00oOo00.o00oOOo0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12341o00oOooO = o0O00000.o00oOo0o("WorkConstraintsTracker");
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0 f12342o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOo00<?>[] f12343o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Object f12344o00oOo00;

    public o00oo0OO(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo, @o0OO00OO o00oo0 o00oo0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12342o00oOOo0 = o00oo0Var;
        this.f12343o00oOOoO = new o00oOo00[]{new o00oOOo0(applicationContext, oo00o0oo), new o00oOOoO(applicationContext, oo00o0oo), new o0O0o0.o00oo0OO(applicationContext, oo00o0oo), new o00oOo0O(applicationContext, oo00o0oo), new o0O0o0.o00oo0(applicationContext, oo00o0oo), new o0O0o0.o00oo00O(applicationContext, oo00o0oo), new o0O0o0.o00oOoO(applicationContext, oo00o0oo)};
        this.f12344o00oOo00 = new Object();
    }

    @o0o0000
    public o00oo0OO(@o0OO00OO o00oo0 o00oo0Var, o00oOo00<?>[] o00ooo00Arr) {
        this.f12342o00oOOo0 = o00oo0Var;
        this.f12343o00oOOoO = o00ooo00Arr;
        this.f12344o00oOo00 = new Object();
    }

    @Override // o0O0o0.o00oOo00.o00oOOo0
    public void o00oOOo0(@oo0oO0 List<String> list) {
        synchronized (this.f12344o00oOo00) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (o00oOo00(str)) {
                    o0O00000.o00oOo00().o00oOOo0(f12341o00oOooO, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            o00oo0 o00oo0Var = this.f12342o00oOOo0;
            if (o00oo0Var != null) {
                o00oo0Var.o00oOo0o(arrayList);
            }
        }
    }

    @Override // o0O0o0.o00oOo00.o00oOOo0
    public void o00oOOoO(@oo0oO0 List<String> list) {
        synchronized (this.f12344o00oOo00) {
            o00oo0 o00oo0Var = this.f12342o00oOOo0;
            if (o00oo0Var != null) {
                o00oo0Var.o00oOOoO(list);
            }
        }
    }

    public boolean o00oOo00(@oo0oO0 String str) {
        o00oOo00<?>[] o00ooo00Arr;
        synchronized (this.f12344o00oOo00) {
            for (o00oOo00<?> o00ooo002 : this.f12343o00oOOoO) {
                if (o00ooo002.o00oOooO(str)) {
                    o0O00000.o00oOo00().o00oOOo0(f12341o00oOooO, String.format("Work %s constrained by %s", str, o00ooo002.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void o00oOo0O() {
        synchronized (this.f12344o00oOo00) {
            for (o00oOo00<?> o00ooo002 : this.f12343o00oOOoO) {
                o00ooo002.o00oOo0o();
            }
        }
    }

    public void o00oOooO(@oo0oO0 Iterable<o0OoO00O> iterable) {
        synchronized (this.f12344o00oOo00) {
            for (o00oOo00<?> o00ooo002 : this.f12343o00oOOoO) {
                o00ooo002.o00oOoO0(null);
            }
            for (o00oOo00<?> o00ooo003 : this.f12343o00oOOoO) {
                o00ooo003.o00oOo0O(iterable);
            }
            for (o00oOo00<?> o00ooo004 : this.f12343o00oOOoO) {
                o00ooo004.o00oOoO0(this);
            }
        }
    }
}
