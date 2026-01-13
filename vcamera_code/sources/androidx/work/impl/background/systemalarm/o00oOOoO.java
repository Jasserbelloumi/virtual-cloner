package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.o00oOo0O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
import o0O0o00o.o00oo0OO;
import o0O0o0Oo.o0OoO00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOOoO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f5603o00oOo0O = o0O00000.o00oOo0o("ConstraintsCmdHandler");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f5604o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f5605o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOo0O f5606o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oo0OO f5607o00oOooO;

    public o00oOOoO(@oo0oO0 Context context, int i, @oo0oO0 o00oOo0O o00ooo0o2) {
        this.f5604o00oOOo0 = context;
        this.f5605o00oOOoO = i;
        this.f5606o00oOo00 = o00ooo0o2;
        this.f5607o00oOooO = new o00oo0OO(context, o00ooo0o2.o00oOo0o(), null);
    }

    @oO0Oo
    public void o00oOOo0() {
        List<o0OoO00O> o00oOooO2 = this.f5606o00oOo00.o00oOoO0().o00ooo0o().o00ooo0O().o00oOooO();
        ConstraintProxy.o00oOOo0(this.f5604o00oOOo0, o00oOooO2);
        this.f5607o00oOooO.o00oOooO(o00oOooO2);
        ArrayList arrayList = new ArrayList(o00oOooO2.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (o0OoO00O o0ooo00o : o00oOooO2) {
            String str = o0ooo00o.f12462o00oOOo0;
            if (currentTimeMillis >= o0ooo00o.o00oOOo0() && (!o0ooo00o.o00oOOoO() || this.f5607o00oOooO.o00oOo00(str))) {
                arrayList.add(o0ooo00o);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((o0OoO00O) it.next()).f12462o00oOOo0;
            Intent o00oOOoO2 = o00oOOo0.o00oOOoO(this.f5604o00oOOo0, str2);
            o0O00000.o00oOo00().o00oOOo0(f5603o00oOo0O, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            o00oOo0O o00ooo0o2 = this.f5606o00oOo00;
            o00ooo0o2.o00oOoo0(new o00oOo0O.o00oOOoO(o00ooo0o2, o00oOOoO2, this.f5605o00oOOoO));
        }
        this.f5607o00oOooO.o00oOo0O();
    }
}
