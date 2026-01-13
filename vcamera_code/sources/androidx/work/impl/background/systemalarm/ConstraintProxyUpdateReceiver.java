package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0o0o0.o00oo0;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5576o00oOOo0 = o0O00000.o00oOo0o("ConstrntProxyUpdtRecvr");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f5577o00oOOoO = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f5578o00oOo00 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f5579o00oOo0O = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f5580o00oOo0o = "KEY_NETWORK_STATE_PROXY_ENABLED";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f5581o00oOooO = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Context f5582o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Intent f5583o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f5584o00oo0Oo;

        public o00oOOo0(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5583o00oo0O0 = intent;
            this.f5582o00oo0O = context;
            this.f5584o00oo0Oo = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f5583o00oo0O0.getBooleanExtra(ConstraintProxyUpdateReceiver.f5578o00oOo00, false);
                boolean booleanExtra2 = this.f5583o00oo0O0.getBooleanExtra(ConstraintProxyUpdateReceiver.f5581o00oOooO, false);
                boolean booleanExtra3 = this.f5583o00oo0O0.getBooleanExtra(ConstraintProxyUpdateReceiver.f5579o00oOo0O, false);
                boolean booleanExtra4 = this.f5583o00oo0O0.getBooleanExtra(ConstraintProxyUpdateReceiver.f5580o00oOo0o, false);
                o0O00000.o00oOo00().o00oOOo0(ConstraintProxyUpdateReceiver.f5576o00oOOo0, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                o00oo0.o00oOo00(this.f5582o00oo0O, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o00oo0.o00oOo00(this.f5582o00oo0O, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o00oo0.o00oOo00(this.f5582o00oo0O, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o00oo0.o00oOo00(this.f5582o00oo0O, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5584o00oo0Oo.finish();
            }
        }
    }

    public static Intent o00oOOo0(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(f5577o00oOOoO);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(f5578o00oOo00, z).putExtra(f5581o00oOooO, z2).putExtra(f5579o00oOo0O, z3).putExtra(f5580o00oOo0o, z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@oo0oO0 Context context, @o0OO00OO Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (f5577o00oOOoO.equals(action)) {
            o0O00O0.o00ooOoO(context).o00oooOO().o00oOOoO(new o00oOOo0(intent, context, goAsync()));
        } else {
            o0O00000.o00oOo00().o00oOOo0(f5576o00oOOo0, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
