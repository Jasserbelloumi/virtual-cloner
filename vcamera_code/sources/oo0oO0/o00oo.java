package oo0oO0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0O0OO;
@o0OOooO0(api = 14)
/* loaded from: classes2.dex */
public class o00oo implements o00oo0O {
    public static Intent o00oOo0O(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static Intent o00oOo0o(@oo0oO0 Context context) {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        if (o00oOo00.o00oOo00()) {
            intent.setData(o0O00O.o00oOoo0(context));
        }
        return !o0O00O.o00oOOo0(context, intent) ? o0O00O.o00oOoOo(context) : intent;
    }

    public static boolean o00oOoO(@oo0oO0 Context context) {
        return oO0O0OO.o00oo0O(context).contains(context.getPackageName());
    }

    public static Intent o00oOoO0(@oo0oO0 Context context) {
        Intent prepare = VpnService.prepare(context);
        return (prepare == null || !o0O00O.o00oOOo0(context, prepare)) ? o0O00O.o00oOoOo(context) : prepare;
    }

    public static boolean o00oOoOO(@oo0oO0 Context context) {
        return oO0O0OO.o00oo0O0(context).o00oOOo0();
    }

    public static boolean o00oOoOo(@oo0oO0 Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return (o00oOo00.o00oOo00() ? appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", context.getApplicationInfo().uid, context.getPackageName()) : appOpsManager.checkOpNoThrow("android:get_usage_stats", context.getApplicationInfo().uid, context.getPackageName())) == 0;
    }

    public static boolean o00oOoo0(@oo0oO0 Context context) {
        return VpnService.prepare(context) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent o00oOooO(@o00oOooO.oo0oO0 android.content.Context r6) {
        /*
            boolean r0 = oo0oO0.o00oOo00.o00oOooO()
            r1 = 0
            if (r0 == 0) goto L52
            oo0oO0.o00oOOo0 r0 = oo0oO0.o0O00O.o00oOoOO(r6)
            if (r0 == 0) goto L30
            java.util.List<oo0oO0.o00oOOo0$o00oOo0O> r0 = r0.f17263o00oOo0o
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            oo0oO0.o00oOOo0$o00oOo0O r3 = (oo0oO0.o00oOOo0.o00oOo0O) r3
            java.lang.String r4 = r3.f17274o00oOOoO
            java.lang.String r5 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L2b
            goto L14
        L2b:
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L14
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L52
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS"
            r0.<init>(r3)
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r2 = r2.f17273o00oOOo0
            r3.<init>(r6, r2)
            java.lang.String r2 = r3.flattenToString()
            java.lang.String r3 = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME"
            r0.putExtra(r3, r2)
            boolean r2 = oo0oO0.o0O00O.o00oOOo0(r6, r0)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 != 0) goto L5b
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            r1.<init>(r0)
        L5b:
            boolean r0 = oo0oO0.o0O00O.o00oOOo0(r6, r1)
            if (r0 != 0) goto L65
            android.content.Intent r1 = oo0oO0.o0O00O.o00oOoOo(r6)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oo0oO0.o00oo.o00oOooO(android.content.Context):android.content.Intent");
    }

    @Override // oo0oO0.o00oo0O
    public boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        if (o0O00O.o00oOo0o(str, o00oo0.f17328o00oo00O)) {
            return o00oOoOO(context);
        }
        if (o0O00O.o00oOo0o(str, o00oo0.f17322o00oOoOo)) {
            return o00oOoOo(context);
        }
        if (o0O00O.o00oOo0o(str, o00oo0.f17323o00oOoo0)) {
            return o00oOoO(context);
        }
        if (o0O00O.o00oOo0o(str, o00oo0.f17325o00oOooo)) {
            return o00oOoo0(context);
        }
        if (o00oOo00.o00oOo0o() || !o0O00O.o00oOo0o(str, o00oo0.f17327o00oo0)) {
            return true;
        }
        return o00oOoOO(context);
    }

    @Override // oo0oO0.o00oo0O
    public boolean o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 String str) {
        return false;
    }

    @Override // oo0oO0.o00oo0O
    public Intent o00oOo00(@oo0oO0 Context context, @oo0oO0 String str) {
        return o0O00O.o00oOo0o(str, o00oo0.f17328o00oo00O) ? o00oOo0O(context) : o0O00O.o00oOo0o(str, o00oo0.f17322o00oOoOo) ? o00oOo0o(context) : o0O00O.o00oOo0o(str, o00oo0.f17323o00oOoo0) ? o00oOooO(context) : o0O00O.o00oOo0o(str, o00oo0.f17325o00oOooo) ? o00oOoO0(context) : (o00oOo00.o00oOo0o() || !o0O00O.o00oOo0o(str, o00oo0.f17327o00oo0)) ? o0O00O.o00oOoOo(context) : o00oOo0O(context);
    }
}
