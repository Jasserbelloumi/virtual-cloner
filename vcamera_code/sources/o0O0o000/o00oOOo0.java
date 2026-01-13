package o0O0o000;

import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00;
import o0O0Ooo0.o0O00000;
import o0O0o0Oo.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12312o00oOooO = o0O00000.o00oOo0o("DelayedWorkTracker");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f12313o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00 f12314o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, Runnable> f12315o00oOo00 = new HashMap();

    /* renamed from: o0O0o000.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0154o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OoO00O f12317o00oo0O0;

        public RunnableC0154o00oOOo0(o0OoO00O o0ooo00o) {
            this.f12317o00oo0O0 = o0ooo00o;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O00000.o00oOo00().o00oOOo0(o00oOOo0.f12312o00oOooO, String.format("Scheduling work %s", this.f12317o00oo0O0.f12462o00oOOo0), new Throwable[0]);
            o00oOOo0.this.f12313o00oOOo0.o00oOo00(this.f12317o00oo0O0);
        }
    }

    public o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2, @oo0oO0 o0O00 o0o00) {
        this.f12313o00oOOo0 = o00ooooo2;
        this.f12314o00oOOoO = o0o00;
    }

    public void o00oOOo0(@oo0oO0 o0OoO00O o0ooo00o) {
        Runnable remove = this.f12315o00oOo00.remove(o0ooo00o.f12462o00oOOo0);
        if (remove != null) {
            this.f12314o00oOOoO.o00oOOo0(remove);
        }
        RunnableC0154o00oOOo0 runnableC0154o00oOOo0 = new RunnableC0154o00oOOo0(o0ooo00o);
        this.f12315o00oOo00.put(o0ooo00o.f12462o00oOOo0, runnableC0154o00oOOo0);
        long currentTimeMillis = System.currentTimeMillis();
        this.f12314o00oOOoO.o00oOOoO(o0ooo00o.o00oOOo0() - currentTimeMillis, runnableC0154o00oOOo0);
    }

    public void o00oOOoO(@oo0oO0 String str) {
        Runnable remove = this.f12315o00oOo00.remove(str);
        if (remove != null) {
            this.f12314o00oOOoO.o00oOOo0(remove);
        }
    }
}
