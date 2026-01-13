package o00oo0O;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsService;
import androidx.core.content.FileProvider;
import java.io.File;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0o0;
/* loaded from: classes.dex */
public class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f7389o00oOOo0 = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f7390o00oOOoO = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    public static boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(CustomTabsService.f1613o00oo0Oo).setPackage(str), 64);
        if (resolveService == null || (intentFilter = resolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void o00oOOoO(@oo0oO0 Context context, @oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 Uri uri) {
        if (oO00O0o0.o00oOOo0.o00oOOo0(o00ooo0o2.f7356o00oOOo0.getExtras(), o00oOo0O.f7323o00oOooO) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        o00ooo0o2.f7356o00oOOo0.putExtra(f7389o00oOOo0, true);
        o00ooo0o2.o00oOo00(context, uri);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static void o00oOo00(@oo0oO0 Context context, @oo0oO0 o00oo0 o00oo0Var, @oo0oO0 Uri uri) {
        Intent intent = new Intent(f7390o00oOOoO);
        intent.setPackage(o00oo0Var.f7374o00oOooO.getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        oO00O0o0.o00oOOo0.o00oOOoO(bundle, o00oOo0O.f7323o00oOooO, o00oo0Var.o00oOooO());
        intent.putExtras(bundle);
        PendingIntent pendingIntent = o00oo0Var.f7373o00oOo0O;
        if (pendingIntent != null) {
            intent.putExtra(o00oOo0O.f7316o00oOo0O, pendingIntent);
        }
        context.startActivity(intent);
    }

    @oO0Oo
    public static boolean o00oOooO(@oo0oO0 Context context, @oo0oO0 File file, @oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 o00oo0 o00oo0Var) {
        Uri o00oOo0o2 = FileProvider.o00oOo0o(context, str, file);
        context.grantUriPermission(str2, o00oOo0o2, 1);
        return o00oo0Var.o00oOoOO(o00oOo0o2, 1, null);
    }
}
