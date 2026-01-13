package o00ooo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oOOoO;
/* loaded from: classes.dex */
public final class o0O000 {
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9571o00oOOo0 = "android.intent.action.CREATE_REMINDER";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9572o00oOOoO = "android.intent.extra.HTML_TEXT";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9573o00oOo00 = "android.intent.extra.START_PLAYBACK";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9574o00oOo0O = "android.intent.category.LEANBACK_LAUNCHER";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9575o00oOooO = "android.intent.extra.TIME";

    @o0OOooO0(15)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static Intent o00oOOo0(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    @oo0oO0
    public static Intent o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        if (o0O0o000.o00oOOo0(context.getPackageManager())) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(o00oOOoO.f17287o00oOooo, str, null));
            }
            Intent data = new Intent(o0O0o000.f9623o00oOOoO).setData(Uri.fromParts(o00oOOoO.f17287o00oOooo, str, null));
            if (i >= 30) {
                return data;
            }
            String o00oOOoO2 = o0O0o000.o00oOOoO(context.getPackageManager());
            o00oOOoO2.getClass();
            return data.setPackage(o00oOOoO2);
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @oo0oO0
    public static Intent o00oOOoO(@oo0oO0 String str, @oo0oO0 String str2) {
        return o00oOOo0.o00oOOo0(str, str2);
    }
}
