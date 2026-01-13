package o0O0o0o0;

import androidx.work.WorkerParameters;
import o00oOooO.o0OO0oO;
import o0O0Ooo.o0O00O0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00ooO0 implements Runnable {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public String f12573o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00O0 f12574o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public WorkerParameters.o00oOOo0 f12575o00oo0Oo;

    public o00ooO0(o0O00O0 o0o00o0, String str, WorkerParameters.o00oOOo0 o00oooo02) {
        this.f12574o00oo0O0 = o0o00o0;
        this.f12573o00oo0O = str;
        this.f12575o00oo0Oo = o00oooo02;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12574o00oo0O0.o00ooo00().o00oOooo(this.f12573o00oo0O, this.f12575o00oo0Oo);
    }
}
