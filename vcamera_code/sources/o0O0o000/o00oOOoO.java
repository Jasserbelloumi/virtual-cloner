package o0O0o000;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo.o0O00O0;
import o0O0Ooo.o0OoOoOo;
import o0O0Ooo0.o00oo00O;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0OoO00O;
import o0O0o00o.o00oo0;
import o0O0o00o.o00oo0OO;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o0.o00oo0O0;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOoO implements o0OoOoOo, o00oo0, o0O0000O {

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f12318o00ooO00 = o0O00000.o00oOo0o("GreedyScheduler");

    /* renamed from: o00oo  reason: collision with root package name */
    public Boolean f12319o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00O0 f12320o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f12321o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00oo0OO f12322o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oOOo0 f12323o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f12325o00oo0oO;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Set<o0OoO00O> f12324o00oo0o0 = new HashSet();

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Object f12326o0O0o = new Object();

    public o00oOOoO(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 o0O00O0 o0o00o0) {
        this.f12321o00oo0O0 = context;
        this.f12320o00oo0O = o0o00o0;
        this.f12322o00oo0Oo = new o00oo0OO(context, oo00o0oo, this);
        this.f12323o00oo0o = new o00oOOo0(this, o00oooo02.f5739o00oOo0O);
    }

    @o0o0000
    public o00oOOoO(@oo0oO0 Context context, @oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o00oo0OO o00oo0oo) {
        this.f12321o00oo0O0 = context;
        this.f12320o00oo0O = o0o00o0;
        this.f12322o00oo0Oo = o00oo0oo;
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOOo0(@oo0oO0 String str) {
        if (this.f12319o00oo == null) {
            o00oOoO0();
        }
        if (!this.f12319o00oo.booleanValue()) {
            o0O00000.o00oOo00().o00oOooO(f12318o00ooO00, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        o00oOoO();
        o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Cancelling work ID %s", str), new Throwable[0]);
        o00oOOo0 o00oooo02 = this.f12323o00oo0o;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOoO(str);
        }
        this.f12320o00oo0O.o0O0000o(str);
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOOoO(@oo0oO0 List<String> list) {
        for (String str : list) {
            o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f12320o00oo0O.o0O0000o(str);
        }
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOo00(@oo0oO0 o0OoO00O... o0ooo00oArr) {
        if (this.f12319o00oo == null) {
            o00oOoO0();
        }
        if (!this.f12319o00oo.booleanValue()) {
            o0O00000.o00oOo00().o00oOooO(f12318o00ooO00, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        o00oOoO();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o0OoO00O o0ooo00o : o0ooo00oArr) {
            long o00oOOo02 = o0ooo00o.o00oOOo0();
            long currentTimeMillis = System.currentTimeMillis();
            if (o0ooo00o.f12463o00oOOoO == o0OoO00O.o00oOOo0.ENQUEUED) {
                if (currentTimeMillis < o00oOOo02) {
                    o00oOOo0 o00oooo02 = this.f12323o00oo0o;
                    if (o00oooo02 != null) {
                        o00oooo02.o00oOOo0(o0ooo00o);
                    }
                } else if (o0ooo00o.o00oOOoO()) {
                    o00oo00O o00oo00o = o0ooo00o.f12470o00oOoOo;
                    if (o00oo00o.f12150o00oOo00) {
                        o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Ignoring WorkSpec %s, Requires device idle.", o0ooo00o), new Throwable[0]);
                    } else if (o00oo00o.o00oOo0O()) {
                        o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", o0ooo00o), new Throwable[0]);
                    } else {
                        hashSet.add(o0ooo00o);
                        hashSet2.add(o0ooo00o.f12462o00oOOo0);
                    }
                } else {
                    o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Starting work for %s", o0ooo00o.f12462o00oOOo0), new Throwable[0]);
                    this.f12320o00oo0O.o0(o0ooo00o.f12462o00oOOo0);
                }
            }
        }
        synchronized (this.f12326o0O0o) {
            if (!hashSet.isEmpty()) {
                o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f12324o00oo0o0.addAll(hashSet);
                this.f12322o00oo0Oo.o00oOooO(this.f12324o00oo0o0);
            }
        }
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        o00oOoOO(str);
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOo0o(@oo0oO0 List<String> list) {
        for (String str : list) {
            o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f12320o00oo0O.o0(str);
        }
    }

    public final void o00oOoO() {
        if (this.f12325o00oo0oO) {
            return;
        }
        this.f12320o00oo0O.o00ooo00().o00oOo00(this);
        this.f12325o00oo0oO = true;
    }

    public final void o00oOoO0() {
        this.f12319o00oo = Boolean.valueOf(o00oo0O0.o00oOOoO(this.f12321o00oo0O0, this.f12320o00oo0O.o00ooOo0()));
    }

    public final void o00oOoOO(@oo0oO0 String str) {
        synchronized (this.f12326o0O0o) {
            Iterator<o0O0o0Oo.o0OoO00O> it = this.f12324o00oo0o0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o0O0o0Oo.o0OoO00O next = it.next();
                if (next.f12462o00oOOo0.equals(str)) {
                    o0O00000.o00oOo00().o00oOOo0(f12318o00ooO00, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f12324o00oo0o0.remove(next);
                    this.f12322o00oo0Oo.o00oOooO(this.f12324o00oo0o0);
                    break;
                }
            }
        }
    }

    @o0o0000
    public void o00oOoOo(@oo0oO0 o00oOOo0 o00oooo02) {
        this.f12323o00oo0o = o00oooo02;
    }

    @Override // o0O0Ooo.o0OoOoOo
    public boolean o00oOooO() {
        return false;
    }
}
