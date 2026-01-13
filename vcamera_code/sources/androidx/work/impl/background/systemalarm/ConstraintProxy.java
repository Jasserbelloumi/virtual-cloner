package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import o0O0Ooo0.o00oo00O;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0O0000O;
import o0O0o0Oo.o0OoO00O;
/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5575o00oOOo0 = o0O00000.o00oOo0o("ConstraintProxy");

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void o00oOOo0(Context context, List<o0OoO00O> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (o0OoO00O o0ooo00o : list) {
            o00oo00O o00oo00o = o0ooo00o.f12470o00oOoOo;
            z |= o00oo00o.f12155o00oOooO;
            z2 |= o00oo00o.f12149o00oOOoO;
            z3 |= o00oo00o.f12151o00oOo0O;
            z4 |= o00oo00o.f12148o00oOOo0 != o0O0000O.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.o00oOOo0(context, z, z2, z3, z4));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        o0O00000.o00oOo00().o00oOOo0(f5575o00oOOo0, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(o00oOOo0.o00oOOo0(context));
    }
}
