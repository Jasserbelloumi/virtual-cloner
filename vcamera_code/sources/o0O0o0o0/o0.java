package o0O0o0o0;

import androidx.work.impl.WorkDatabase;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0O00O0o;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0 implements Runnable {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f12519o00oo0o0 = o0O0Ooo0.o0O00000.o00oOo0o("StopWorkRunnable");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f12520o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00O0 f12521o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final boolean f12522o00oo0Oo;

    public o0(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 String str, boolean z) {
        this.f12521o00oo0O0 = o0o00o0;
        this.f12520o00oo0O = str;
        this.f12522o00oo0Oo = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o00oo0O02;
        WorkDatabase o00ooo0o2 = this.f12521o00oo0O0.o00ooo0o();
        o0O0Ooo.o0O000O o00ooo002 = this.f12521o00oo0O0.o00ooo00();
        o0O00O0o o00ooo0O2 = o00ooo0o2.o00ooo0O();
        o00ooo0o2.o00oOo00();
        try {
            boolean o00oOoOO2 = o00ooo002.o00oOoOO(this.f12520o00oo0O);
            if (this.f12522o00oo0Oo) {
                o00oo0O02 = this.f12521o00oo0O0.o00ooo00().o00oo0OO(this.f12520o00oo0O);
            } else {
                if (!o00oOoOO2 && o00ooo0O2.o00oOoO(this.f12520o00oo0O) == o0OoO00O.o00oOOo0.RUNNING) {
                    o00ooo0O2.o00oo0Oo(o0OoO00O.o00oOOo0.ENQUEUED, this.f12520o00oo0O);
                }
                o00oo0O02 = this.f12521o00oo0O0.o00ooo00().o00oo0O0(this.f12520o00oo0O);
            }
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12519o00oo0o0, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f12520o00oo0O, Boolean.valueOf(o00oo0O02)), new Throwable[0]);
            o00ooo0o2.o00ooO0o();
        } finally {
            o00ooo0o2.o00oOoOO();
        }
    }
}
