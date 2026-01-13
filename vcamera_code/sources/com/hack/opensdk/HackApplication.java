package com.hack.opensdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import o0O0oooo.o0OO0o;
import o0O0oooo.o0OO0oO0;
import o0O0oooo.o0OOO00;
/* loaded from: classes2.dex */
public class HackApplication extends Application {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f6520o00oo0O = "HackApplication";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final boolean f6521o00oo0O0 = false;

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Context createPackageContext;
        super.attachBaseContext(context);
        if (TextUtils.equals(context.getPackageName(), "virtual.camera.app")) {
            context.getSharedPreferences("hack", 0).edit().putString("sp.assist.pkg", o0OO0o.f12838o00oOooO).commit();
        } else {
            try {
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            if (context.getPackageManager().getPackageInfo("virtual.camera.app", 0).applicationInfo.uid == Process.myUid()) {
                createPackageContext = context.createPackageContext("virtual.camera.app", 0);
                o0OOO00.o00oOooO(createPackageContext, "version", true);
                o0OO0oO0.o00oOOo0().o00oOOoO(1, this, context);
            }
        }
        createPackageContext = context;
        o0OOO00.o00oOooO(createPackageContext, "version", true);
        o0OO0oO0.o00oOOo0().o00oOOoO(1, this, context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        o0OO0oO0.o00oOOo0().o00oOOoO(2, new Object[0]);
    }
}
