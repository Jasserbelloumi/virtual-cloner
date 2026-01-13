package o00ooo0O;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0O.o0O00O0o;
import o00ooo0O.o0OoO00O;
/* loaded from: classes.dex */
public class o0oO0Ooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9693o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9694o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9695o00oOo00 = 4;
    @o0o0000

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9696o00oOo0O = "com.android.launcher.action.INSTALL_SHORTCUT";
    @o0o0000

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9697o00oOo0o = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f9698o00oOoO = 48;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9699o00oOoO0 = 96;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f9700o00oOoOO = "android.intent.extra.shortcut.ID";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static volatile o0O00O0o<?> f9701o00oOoOo = null;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static volatile List<o0O000O> f9702o00oOoo0 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f9703o00oOooO = 8;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f9704o00oOooo = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f9705o00oo00O = "androidx.core.content.pm.shortcut_listener_impl";

    /* loaded from: classes.dex */
    public class o00oOOo0 extends BroadcastReceiver {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ IntentSender f9706o00oOOo0;

        public o00oOOo0(IntentSender intentSender) {
            this.f9706o00oOOo0 = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f9706o00oOOo0.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @o0OOooO0(25)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public static String o00oOOo0(@oo0oO0 List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    public static boolean o00oOOo0(@oo0oO0 Context context, @oo0oO0 List<o0OoO00O> list) {
        List<o0OoO00O> o00oo2 = o00oo(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            o00oOo00(context, o00oo2);
        }
        ArrayList arrayList = new ArrayList();
        for (o0OoO00O o0ooo00o : o00oo2) {
            arrayList.add(o0ooo00o.o00ooOoO());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            o00oo0OO(context).o00oOOo0(o00oo2);
            for (o0O000O o0o000o : o00oo0(context)) {
                o0o000o.o00oOOoO(list);
            }
            return true;
        }
        return false;
    }

    @o0o0000
    public static boolean o00oOOoO(@oo0oO0 Context context, @oo0oO0 o0OoO00O o0ooo00o) {
        Bitmap decodeStream;
        IconCompat iconCompat = o0ooo00o.f9667o00oOoOO;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f2403o00oOOo0;
        if (i == 6 || i == 4) {
            InputStream o00ooOO2 = iconCompat.o00ooOO(context);
            if (o00ooOO2 == null || (decodeStream = BitmapFactory.decodeStream(o00ooOO2)) == null) {
                return false;
            }
            o0ooo00o.f9667o00oOoOO = i == 6 ? IconCompat.o00oo0OO(decodeStream) : IconCompat.o00oo0Oo(decodeStream);
            return true;
        }
        return true;
    }

    @o0o0000
    public static void o00oOo00(@oo0oO0 Context context, @oo0oO0 List<o0OoO00O> list) {
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            o0OoO00O o0ooo00o = (o0OoO00O) it.next();
            if (!o00oOOoO(context, o0ooo00o)) {
                list.remove(o0ooo00o);
            }
        }
    }

    public static void o00oOo0O(@oo0oO0 Context context, @oo0oO0 List<String> list, @o0OO00OO CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        o00oo0OO(context).o00oOooO(list);
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOo00(list);
        }
    }

    public static void o00oOo0o(@oo0oO0 Context context, @oo0oO0 List<o0OoO00O> list) {
        List<o0OoO00O> o00oo2 = o00oo(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        for (o0OoO00O o0ooo00o : o00oo2) {
            arrayList.add(o0ooo00o.f9661o00oOOoO);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        o00oo0OO(context).o00oOOo0(o00oo2);
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOOoO(list);
        }
    }

    public static int o00oOoO(@oo0oO0 Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (max * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    @oo0oO0
    public static List<o0OoO00O> o00oOoO0(@oo0oO0 Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
            arrayList.add(new o0OoO00O.o00oOOo0(context, shortcutInfo).o00oOo00());
        }
        return arrayList;
    }

    public static int o00oOoOO(@oo0oO0 Context context) {
        context.getClass();
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int o00oOoOo(@oo0oO0 Context context) {
        context.getClass();
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int o00oOoo0(@oo0oO0 Context context) {
        context.getClass();
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @oo0oO0
    public static Intent o00oOooO(@oo0oO0 Context context, @oo0oO0 o0OoO00O o0ooo00o) {
        Intent createShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(o0ooo00o.o00ooOoO());
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return o0ooo00o.o00oOOo0(createShortcutResultIntent);
    }

    @o0o0000
    public static List<o0O000O> o00oOooo() {
        return f9702o00oOoo0;
    }

    @oo0oO0
    public static List<o0OoO00O> o00oo(@oo0oO0 List<o0OoO00O> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (o0OoO00O o0ooo00o : list) {
            if (o0ooo00o.o00ooOOo(i)) {
                arrayList.remove(o0ooo00o);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<o00ooo0O.o0O000O> o00oo0(android.content.Context r8) {
        /*
            java.util.List<o00ooo0O.o0O000O> r0 = o00ooo0O.o0oO0Ooo.f9702o00oOoo0
            if (r0 != 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<o00ooo0O.o0oO0Ooo> r3 = o00ooo0O.o0oO0Ooo.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: java.lang.Exception -> L25
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L25
            r5[r4] = r8     // Catch: java.lang.Exception -> L25
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch: java.lang.Exception -> L25
            o00ooo0O.o0O000O r2 = (o00ooo0O.o0O000O) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6b:
            java.util.List<o00ooo0O.o0O000O> r8 = o00ooo0O.o0oO0Ooo.f9702o00oOoo0
            if (r8 != 0) goto L71
            o00ooo0O.o0oO0Ooo.f9702o00oOoo0 = r0
        L71:
            java.util.List<o00ooo0O.o0O000O> r8 = o00ooo0O.o0oO0Ooo.f9702o00oOoo0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooo0O.o0oO0Ooo.o00oo0(android.content.Context):java.util.List");
    }

    public static String o00oo00O(@oo0oO0 List<o0OoO00O> list) {
        int i = -1;
        String str = null;
        for (o0OoO00O o0ooo00o : list) {
            if (o0ooo00o.o0O0o() > i) {
                str = o0ooo00o.o00oOoo0();
                i = o0ooo00o.o0O0o();
            }
        }
        return str;
    }

    public static boolean o00oo0O(@oo0oO0 Context context) {
        context.getClass();
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    @oo0oO0
    public static List<o0OoO00O> o00oo0O0(@oo0oO0 Context context, int i) {
        List shortcuts;
        if (Build.VERSION.SDK_INT >= 30) {
            shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i);
            return o0OoO00O.o00oOo00(context, shortcuts);
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return o0OoO00O.o00oOo00(context, arrayList);
    }

    public static o0O00O0o<?> o00oo0OO(Context context) {
        if (f9701o00oOoOo == null) {
            try {
                f9701o00oOoOo = (o0O00O0o) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, o0oO0Ooo.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f9701o00oOoOo == null) {
                f9701o00oOoOo = new o0O00O0o.o00oOOo0();
            }
        }
        return f9701o00oOoOo;
    }

    public static boolean o00oo0Oo(@oo0oO0 Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static void o00oo0o(@oo0oO0 Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        o00oo0OO(context).o00oOo00();
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOOo0();
        }
    }

    public static boolean o00oo0o0(@oo0oO0 Context context, @oo0oO0 o0OoO00O o0ooo00o) {
        context.getClass();
        o0ooo00o.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i <= 31 && o0ooo00o.o00ooOOo(1)) {
            for (o0O000O o0o000o : o00oo0(context)) {
                o0o000o.o00oOOoO(Collections.singletonList(o0ooo00o));
            }
            return true;
        }
        int o00oOoo02 = o00oOoo0(context);
        if (o00oOoo02 == 0) {
            return false;
        }
        if (i <= 29) {
            o00oOOoO(context, o0ooo00o);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(o0ooo00o.o00ooOoO());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= o00oOoo02) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(o00oOOoO.o00oOOo0(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(o0ooo00o.o00ooOoO()));
        }
        o0O00O0o<?> o00oo0OO2 = o00oo0OO(context);
        try {
            List<o0OoO00O> o00oOOoO2 = o00oo0OO2.o00oOOoO();
            if (o00oOOoO2.size() >= o00oOoo02) {
                o00oo0OO2.o00oOooO(Arrays.asList(o00oo00O(o00oOOoO2)));
            }
            o00oo0OO2.o00oOOo0(Arrays.asList(o0ooo00o));
            for (o0O000O o0o000o2 : o00oo0(context)) {
                o0o000o2.o00oOOoO(Collections.singletonList(o0ooo00o));
            }
            o00ooO00(context, o0ooo00o.o00oOoo0());
            return true;
        } catch (Exception unused) {
            for (o0O000O o0o000o3 : o00oo0(context)) {
                o0o000o3.o00oOOoO(Collections.singletonList(o0ooo00o));
            }
            o00ooO00(context, o0ooo00o.o00oOoo0());
            return false;
        } catch (Throwable th) {
            for (o0O000O o0o000o4 : o00oo0(context)) {
                o0o000o4.o00oOOoO(Collections.singletonList(o0ooo00o));
            }
            o00ooO00(context, o0ooo00o.o00oOoo0());
            throw th;
        }
    }

    public static void o00oo0oO(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        o00oo0OO(context).o00oOooO(list);
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOo00(list);
        }
    }

    @o0o0000
    public static void o00ooO(o0O00O0o<Void> o0o00o0o) {
        f9701o00oOoOo = o0o00o0o;
    }

    public static boolean o00ooO0(@oo0oO0 Context context, @oo0oO0 o0OoO00O o0ooo00o, @o0OO00OO IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 31 || !o0ooo00o.o00ooOOo(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(o0ooo00o.o00ooOoO(), intentSender);
        }
        return false;
    }

    public static void o00ooO00(@oo0oO0 Context context, @oo0oO0 String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOo0O(Collections.singletonList(str));
        }
    }

    public static boolean o00ooO0O(@oo0oO0 Context context, @oo0oO0 List<o0OoO00O> list) {
        context.getClass();
        list.getClass();
        List<o0OoO00O> o00oo2 = o00oo(list, 1);
        ArrayList arrayList = new ArrayList(o00oo2.size());
        for (o0OoO00O o0ooo00o : o00oo2) {
            arrayList.add(o0ooo00o.o00ooOoO());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            o00oo0OO(context).o00oOo00();
            o00oo0OO(context).o00oOOo0(o00oo2);
            for (o0O000O o0o000o : o00oo0(context)) {
                o0o000o.o00oOOo0();
                o0o000o.o00oOOoO(list);
            }
            return true;
        }
        return false;
    }

    @o0o0000
    public static void o00ooO0o(List<o0O000O> list) {
        f9702o00oOoo0 = list;
    }

    public static boolean o00ooOO0(@oo0oO0 Context context, @oo0oO0 List<o0OoO00O> list) {
        List<o0OoO00O> o00oo2 = o00oo(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            o00oOo00(context, o00oo2);
        }
        ArrayList arrayList = new ArrayList();
        for (o0OoO00O o0ooo00o : o00oo2) {
            arrayList.add(o0ooo00o.o00ooOoO());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            o00oo0OO(context).o00oOOo0(o00oo2);
            for (o0O000O o0o000o : o00oo0(context)) {
                o0o000o.o00oOooO(list);
            }
            return true;
        }
        return false;
    }

    public static void o0O0o(@oo0oO0 Context context, @oo0oO0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            o00oo0oO(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o00oo0OO(context).o00oOooO(list);
        for (o0O000O o0o000o : o00oo0(context)) {
            o0o000o.o00oOo00(list);
        }
    }
}
