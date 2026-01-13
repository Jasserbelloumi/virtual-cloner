package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.o00oOo0O;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O0000O;
import o0O0Ooo0.o0O00000;
import o0O0o00o.o00oo0;
import o0O0o00o.o00oo0OO;
import o0O0o0Oo.o0OoO00O;
import o0O0o0o0.o0O000Oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOo00 implements o00oo0, o0O0000O, o0O000Oo.o00oOOoO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f5608o00ooO = 2;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f5609o00ooO0 = o0O00000.o00oOo0o("DelayMetCommandHandler");

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f5610o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f5611o00ooO0o = 1;
    @o0OO00OO

    /* renamed from: o00oo  reason: collision with root package name */
    public PowerManager.WakeLock f5612o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f5613o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f5614o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final String f5615o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o00oo0OO f5616o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOo0O f5617o00oo0o0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f5619o00ooO00 = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f5620o0O0o = 0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Object f5618o00oo0oO = new Object();

    public o00oOo00(@oo0oO0 Context context, int i, @oo0oO0 String str, @oo0oO0 o00oOo0O o00ooo0o2) {
        this.f5614o00oo0O0 = context;
        this.f5613o00oo0O = i;
        this.f5617o00oo0o0 = o00ooo0o2;
        this.f5615o00oo0Oo = str;
        this.f5616o00oo0o = new o00oo0OO(context, o00ooo0o2.o00oOo0o(), this);
    }

    @Override // o0O0o0o0.o0O000Oo.o00oOOoO
    public void o00oOOo0(@oo0oO0 String str) {
        o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        o00oOoO0();
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOOoO(@oo0oO0 List<String> list) {
        o00oOoO0();
    }

    public final void o00oOo00() {
        synchronized (this.f5618o00oo0oO) {
            this.f5616o00oo0o.o00oOo0O();
            this.f5617o00oo0o0.o00oOoO().o00oOo0o(this.f5615o00oo0Oo);
            PowerManager.WakeLock wakeLock = this.f5612o00oo;
            if (wakeLock != null && wakeLock.isHeld()) {
                o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("Releasing wakelock %s for WorkSpec %s", this.f5612o00oo, this.f5615o00oo0Oo), new Throwable[0]);
                this.f5612o00oo.release();
            }
        }
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        o00oOo00();
        if (z) {
            Intent o00oOo0o2 = o00oOOo0.o00oOo0o(this.f5614o00oo0O0, this.f5615o00oo0Oo);
            o00oOo0O o00ooo0o2 = this.f5617o00oo0o0;
            o00ooo0o2.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o2, o00oOo0o2, this.f5613o00oo0O));
        }
        if (this.f5619o00ooO00) {
            Intent o00oOOo02 = o00oOOo0.o00oOOo0(this.f5614o00oo0O0);
            o00oOo0O o00ooo0o3 = this.f5617o00oo0o0;
            o00ooo0o3.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o3, o00oOOo02, this.f5613o00oo0O));
        }
    }

    @Override // o0O0o00o.o00oo0
    public void o00oOo0o(@oo0oO0 List<String> list) {
        if (list.contains(this.f5615o00oo0Oo)) {
            synchronized (this.f5618o00oo0oO) {
                if (this.f5620o0O0o == 0) {
                    this.f5620o0O0o = 1;
                    o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("onAllConstraintsMet for %s", this.f5615o00oo0Oo), new Throwable[0]);
                    if (this.f5617o00oo0o0.o00oOooO().o00oOoo0(this.f5615o00oo0Oo)) {
                        this.f5617o00oo0o0.o00oOoO().o00oOo0O(this.f5615o00oo0Oo, o00oOOo0.f5594o00ooO, this);
                    } else {
                        o00oOo00();
                    }
                } else {
                    o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("Already started work for %s", this.f5615o00oo0Oo), new Throwable[0]);
                }
            }
        }
    }

    public final void o00oOoO0() {
        synchronized (this.f5618o00oo0oO) {
            if (this.f5620o0O0o < 2) {
                this.f5620o0O0o = 2;
                o0O00000 o00oOo002 = o0O00000.o00oOo00();
                String str = f5609o00ooO0;
                o00oOo002.o00oOOo0(str, String.format("Stopping work for WorkSpec %s", this.f5615o00oo0Oo), new Throwable[0]);
                Intent o00oOoO02 = o00oOOo0.o00oOoO0(this.f5614o00oo0O0, this.f5615o00oo0Oo);
                o00oOo0O o00ooo0o2 = this.f5617o00oo0o0;
                o00ooo0o2.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o2, o00oOoO02, this.f5613o00oo0O));
                if (this.f5617o00oo0o0.o00oOooO().o00oOoO(this.f5615o00oo0Oo)) {
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("WorkSpec %s needs to be rescheduled", this.f5615o00oo0Oo), new Throwable[0]);
                    Intent o00oOo0o2 = o00oOOo0.o00oOo0o(this.f5614o00oo0O0, this.f5615o00oo0Oo);
                    o00oOo0O o00ooo0o3 = this.f5617o00oo0o0;
                    o00ooo0o3.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o3, o00oOo0o2, this.f5613o00oo0O));
                } else {
                    o0O00000.o00oOo00().o00oOOo0(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f5615o00oo0Oo), new Throwable[0]);
                }
            } else {
                o0O00000.o00oOo00().o00oOOo0(f5609o00ooO0, String.format("Already stopped work for %s", this.f5615o00oo0Oo), new Throwable[0]);
            }
        }
    }

    @oO0Oo
    public void o00oOooO() {
        this.f5612o00oo = o0O0o0o0.o0O0000O.o00oOOoO(this.f5614o00oo0O0, String.format("%s (%s)", this.f5615o00oo0Oo, Integer.valueOf(this.f5613o00oo0O)));
        o0O00000 o00oOo002 = o0O00000.o00oOo00();
        String str = f5609o00ooO0;
        o00oOo002.o00oOOo0(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f5612o00oo, this.f5615o00oo0Oo), new Throwable[0]);
        this.f5612o00oo.acquire();
        o0OoO00O o00oOoOO2 = this.f5617o00oo0o0.o00oOoO0().o00ooo0o().o00ooo0O().o00oOoOO(this.f5615o00oo0Oo);
        if (o00oOoOO2 == null) {
            o00oOoO0();
            return;
        }
        boolean o00oOOoO2 = o00oOoOO2.o00oOOoO();
        this.f5619o00ooO00 = o00oOOoO2;
        if (o00oOOoO2) {
            this.f5616o00oo0o.o00oOooO(Collections.singletonList(o00oOoOO2));
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(str, String.format("No constraints for %s", this.f5615o00oo0Oo), new Throwable[0]);
        o00oOo0o(Collections.singletonList(this.f5615o00oo0Oo));
    }
}
