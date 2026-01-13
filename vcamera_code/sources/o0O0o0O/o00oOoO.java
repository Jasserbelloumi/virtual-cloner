package o0O0o0O;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOoO extends o00oo00O<Boolean> {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f12346o00oOoOO = o0O00000.o00oOo0o("BatteryNotLowTracker");

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final float f12347o00oOoOo = 0.15f;

    public o00oOoO(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        super(context, oo00o0oo);
    }

    @Override // o0O0o0O.o00oo00O
    public void o00oOoO(Context context, @oo0oO0 Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(f12346o00oOoOO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        o00oOooO(bool);
    }

    @Override // o0O0o0O.o00oo00O
    public IntentFilter o00oOoO0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // o0O0o0O.o00oo0
    /* renamed from: o00oOoOO */
    public Boolean o00oOOoO() {
        Intent registerReceiver = this.f12350o00oOOoO.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            o0O00000.o00oOo00().o00oOOoO(f12346o00oOoOO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra(oOo000Oo.f9246o0ooO, -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
