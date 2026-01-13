package o0O0o0O;

import android.content.Context;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0O {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static o00oo0O f12359o00oOo0O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOo0O f12360o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOoO f12361o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo0OO f12362o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oo0O0 f12363o00oOooO;

    public o00oo0O(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        Context applicationContext = context.getApplicationContext();
        this.f12360o00oOOo0 = new o00oOo0O(applicationContext, oo00o0oo);
        this.f12361o00oOOoO = new o00oOoO(applicationContext, oo00o0oo);
        this.f12362o00oOo00 = new o00oo0OO(applicationContext, oo00o0oo);
        this.f12363o00oOooO = new o00oo0O0(applicationContext, oo00o0oo);
    }

    @oo0oO0
    public static synchronized o00oo0O o00oOo00(Context context, oO00O0oO oo00o0oo) {
        o00oo0O o00oo0o2;
        synchronized (o00oo0O.class) {
            if (f12359o00oOo0O == null) {
                f12359o00oOo0O = new o00oo0O(context, oo00o0oo);
            }
            o00oo0o2 = f12359o00oOo0O;
        }
        return o00oo0o2;
    }

    @o0o0000
    public static synchronized void o00oOo0o(@oo0oO0 o00oo0O o00oo0o2) {
        synchronized (o00oo0O.class) {
            f12359o00oOo0O = o00oo0o2;
        }
    }

    @oo0oO0
    public o00oOo0O o00oOOo0() {
        return this.f12360o00oOOo0;
    }

    @oo0oO0
    public o00oOoO o00oOOoO() {
        return this.f12361o00oOOoO;
    }

    @oo0oO0
    public o00oo0O0 o00oOo0O() {
        return this.f12363o00oOooO;
    }

    @oo0oO0
    public o00oo0OO o00oOooO() {
        return this.f12362o00oOo00;
    }
}
