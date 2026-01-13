package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.profileinstaller.o00oOo00;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0OO0.o00oo00O;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f3997o00oOOo0 = "ProfileInstaller";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f3998o00oOOoO = "/data/misc/profiles/cur/0";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f3999o00oOo00 = "primary.prof";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f4000o00oOo0O = "dexopt/baseline.profm";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f4001o00oOo0o = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f4004o00oOoOO = 1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f4005o00oOoOo = 2;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f4006o00oOoo0 = 3;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f4007o00oOooO = "dexopt/baseline.prof";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f4008o00oOooo = 4;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f4009o00oo = 10;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f4010o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f4011o00oo00O = 5;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f4012o00oo0O = 4;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f4013o00oo0O0 = 3;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f4014o00oo0OO = 2;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f4015o00oo0Oo = 5;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f4016o00oo0o = 7;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f4017o00oo0o0 = 6;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f4018o00oo0oO = 8;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f4019o00ooO = 15;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f4020o00ooO0 = 12;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f4021o00ooO00 = 11;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f4022o00ooO0O = 13;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f4023o00ooO0o = 14;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f4024o00ooOO0 = 16;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f4025o0O0o = 9;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o00oOo0O f4003o00oOoO0 = new o00oOOo0();
    @oo0oO0

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o00oOo0O f4002o00oOoO = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOo0O {
        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOo0(int i, @o0OO00OO Object obj) {
        }

        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOoO(int i, @o0OO00OO Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final String f4026o00oOOo0 = "ProfileInstaller";

        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOo0(int i, @o0OO00OO Object obj) {
            if (i == 6 || i == 7 || i == 8) {
                Throwable th = (Throwable) obj;
            }
        }

        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOoO(int i, @o0OO00OO Object obj) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* renamed from: androidx.profileinstaller.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0036o00oOo00 {
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        void o00oOOo0(int i, @o0OO00OO Object obj);

        void o00oOOoO(int i, @o0OO00OO Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static boolean o00oOo00(@oo0oO0 File file) {
        return new File(file, f4001o00oOo0o).delete();
    }

    public static void o00oOo0O(@oo0oO0 Executor executor, @oo0oO0 final o00oOo0O o00ooo0o2, final int i, @o0OO00OO final Object obj) {
        executor.execute(new Runnable() { // from class: o0O0OO0.o00oo0OO
            @Override // java.lang.Runnable
            public final void run() {
                o00oOo00.o00oOo0O.this.o00oOOoO(i, obj);
            }
        });
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    @oO0Oo
    public static boolean o00oOo0o(PackageInfo packageInfo, File file, o00oOo0O o00ooo0o2) {
        File file2 = new File(file, f4001o00oOo0o);
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = readLong == packageInfo.lastUpdateTime;
                if (z) {
                    o00ooo0o2.o00oOOo0(2, null);
                }
                return z;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static void o00oOoOO(@oo0oO0 PackageInfo packageInfo, @oo0oO0 File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f4001o00oOo0o)));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void o00oOoOo(@oo0oO0 Executor executor, @oo0oO0 final o00oOo0O o00ooo0o2, final int i, @o0OO00OO final Object obj) {
        executor.execute(new Runnable() { // from class: o0O0OO0.o00oo0
            @Override // java.lang.Runnable
            public final void run() {
                o00oOo00.o00oOo0O.this.o00oOOo0(i, obj);
            }
        });
    }

    public static boolean o00oOoo0(@oo0oO0 AssetManager assetManager, @oo0oO0 String str, @oo0oO0 PackageInfo packageInfo, @oo0oO0 File file, @oo0oO0 String str2, @oo0oO0 Executor executor, @oo0oO0 o00oOo0O o00ooo0o2) {
        androidx.profileinstaller.o00oOOoO o00ooooo2 = new androidx.profileinstaller.o00oOOoO(assetManager, executor, o00ooo0o2, str2, f4007o00oOooO, f4000o00oOo0O, new File(new File(f3998o00oOOoO, str), "primary.prof"));
        if (o00ooooo2.o00oOo0O()) {
            boolean o00oo02 = o00ooooo2.o00oOoOO().o00oo00O().o00oo0();
            if (o00oo02) {
                o00oOoOO(packageInfo, file);
            }
            return o00oo02;
        }
        return false;
    }

    @oO0Oo
    public static void o00oOooO(@oo0oO0 Context context, @oo0oO0 Executor executor, @oo0oO0 o00oOo0O o00ooo0o2) {
        o00oOo00(context.getFilesDir());
        o00oOoOo(executor, o00ooo0o2, 11, null);
    }

    @oO0Oo
    public static void o00oOooo(@oo0oO0 Context context) {
        o00oo0(context, new o00oo00O(), f4003o00oOoO0, false);
    }

    @oO0Oo
    public static void o00oo0(@oo0oO0 Context context, @oo0oO0 Executor executor, @oo0oO0 o00oOo0O o00ooo0o2, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !o00oOo0o(packageInfo, filesDir, o00ooo0o2)) {
                context.getPackageName();
                if (o00oOoo0(assets, packageName, packageInfo, filesDir, name, executor, o00ooo0o2) && z) {
                    z2 = true;
                }
            } else {
                context.getPackageName();
            }
            androidx.profileinstaller.o00oOo0O.o00oOo0O(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            o00ooo0o2.o00oOOo0(7, e);
            androidx.profileinstaller.o00oOo0O.o00oOo0O(context, false);
        }
    }

    @oO0Oo
    public static void o00oo00O(@oo0oO0 Context context, @oo0oO0 Executor executor, @oo0oO0 o00oOo0O o00ooo0o2) {
        o00oo0(context, executor, o00ooo0o2, false);
    }

    @oO0Oo
    public static void o00oo0OO(@oo0oO0 Context context, @oo0oO0 Executor executor, @oo0oO0 o00oOo0O o00ooo0o2) {
        try {
            o00oOoOO(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            o00oOoOo(executor, o00ooo0o2, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            o00oOoOo(executor, o00ooo0o2, 7, e);
        }
    }
}
