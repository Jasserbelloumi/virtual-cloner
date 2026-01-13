package o0O0o0O;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oOo0O extends o00oo00O<Boolean> {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f12345o00oOoOO = o0O00000.o00oOo0o("BatteryChrgTracker");

    public o00oOo0O(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        super(context, oo00o0oo);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // o0O0o0O.o00oo00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOoO(android.content.Context r6, @o00oOooO.oo0oO0 android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            o0O0Ooo0.o0O00000 r7 = o0O0Ooo0.o0O00000.o00oOo00()
            java.lang.String r0 = o0O0o0O.o00oOo0O.f12345o00oOoOO
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.o00oOOo0(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r7
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r1 = r3
        L51:
            switch(r1) {
                case 0: goto L5b;
                case 1: goto L5b;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L5e
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
        L57:
            r5.o00oOooO(r6)
            goto L5e
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L57
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0o0O.o00oOo0O.o00oOoO(android.content.Context, android.content.Intent):void");
    }

    @Override // o0O0o0O.o00oo00O
    public IntentFilter o00oOoO0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // o0O0o0O.o00oo0
    /* renamed from: o00oOoOO */
    public Boolean o00oOOoO() {
        Intent registerReceiver = this.f12350o00oOOoO.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            o0O00000.o00oOo00().o00oOOoO(f12345o00oOoOO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(o00oOoOo(registerReceiver));
    }

    public final boolean o00oOoOo(Intent intent) {
        int intExtra = intent.getIntExtra(oOo000Oo.f9246o0ooO, -1);
        return intExtra == 2 || intExtra == 5;
    }
}
