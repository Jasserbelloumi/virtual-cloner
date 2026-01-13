package o0O0o0O;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o00oo0<T> {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f12348o00oOo0o = o0O00000.o00oOo0o("ConstraintTracker");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO00O0oO f12349o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Context f12350o00oOOoO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public T f12352o00oOo0O;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Object f12351o00oOo00 = new Object();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Set<o0O0o00o.o00oOoO<T>> f12353o00oOooO = new LinkedHashSet();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ List f12355o00oo0O0;

        public o00oOOo0(List list) {
            this.f12355o00oo0O0 = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (o0O0o00o.o00oOoO o00oooo2 : this.f12355o00oo0O0) {
                o00oooo2.o00oOOo0(o00oo0.this.f12352o00oOo0O);
            }
        }
    }

    public o00oo0(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        this.f12350o00oOOoO = context.getApplicationContext();
        this.f12349o00oOOo0 = oo00o0oo;
    }

    public void o00oOOo0(o0O0o00o.o00oOoO<T> o00oooo2) {
        synchronized (this.f12351o00oOo00) {
            if (this.f12353o00oOooO.add(o00oooo2)) {
                if (this.f12353o00oOooO.size() == 1) {
                    this.f12352o00oOo0O = o00oOOoO();
                    o0O00000.o00oOo00().o00oOOo0(f12348o00oOo0o, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f12352o00oOo0O), new Throwable[0]);
                    o00oOo0O();
                }
                o00oooo2.o00oOOo0(this.f12352o00oOo0O);
            }
        }
    }

    public abstract T o00oOOoO();

    public void o00oOo00(o0O0o00o.o00oOoO<T> o00oooo2) {
        synchronized (this.f12351o00oOo00) {
            if (this.f12353o00oOooO.remove(o00oooo2) && this.f12353o00oOooO.isEmpty()) {
                o00oOo0o();
            }
        }
    }

    public abstract void o00oOo0O();

    public abstract void o00oOo0o();

    public void o00oOooO(T t) {
        synchronized (this.f12351o00oOo00) {
            T t2 = this.f12352o00oOo0O;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f12352o00oOo0O = t;
                this.f12349o00oOOo0.o00oOOo0().execute(new o00oOOo0(new ArrayList(this.f12353o00oOooO)));
            }
        }
    }
}
