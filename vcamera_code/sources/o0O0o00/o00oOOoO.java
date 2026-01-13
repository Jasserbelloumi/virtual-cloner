package o0O0o00;

import android.content.Context;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0OoOoOo;
import o0O0Ooo0.o0O00000;
import o0O0o0Oo.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOoO implements o0OoOoOo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f12310o00oo0O = o0O00000.o00oOo0o("SystemAlarmScheduler");

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f12311o00oo0O0;

    public o00oOOoO(@oo0oO0 Context context) {
        this.f12311o00oo0O0 = context.getApplicationContext();
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOOo0(@oo0oO0 String str) {
        this.f12311o00oo0O0.startService(androidx.work.impl.background.systemalarm.o00oOOo0.o00oOoO0(this.f12311o00oo0O0, str));
    }

    public final void o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o) {
        o0O00000.o00oOo00().o00oOOo0(f12310o00oo0O, String.format("Scheduling work with workSpecId %s", o0ooo00o.f12462o00oOOo0), new Throwable[0]);
        this.f12311o00oo0O0.startService(androidx.work.impl.background.systemalarm.o00oOOo0.o00oOo0o(this.f12311o00oo0O0, o0ooo00o.f12462o00oOOo0));
    }

    @Override // o0O0Ooo.o0OoOoOo
    public void o00oOo00(@oo0oO0 o0OoO00O... o0ooo00oArr) {
        for (o0OoO00O o0ooo00o : o0ooo00oArr) {
            o00oOOoO(o0ooo00o);
        }
    }

    @Override // o0O0Ooo.o0OoOoOo
    public boolean o00oOooO() {
        return true;
    }
}
