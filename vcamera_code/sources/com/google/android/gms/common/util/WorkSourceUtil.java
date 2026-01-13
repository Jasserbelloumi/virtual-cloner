package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:47|48|7|8|9|10|11|12|13|(12:39|40|16|(9:35|36|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r5[r3] = r6     // Catch: java.lang.Exception -> L1a
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r6 = 2
            if (r5 == 0) goto L33
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L33
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r5[r3] = r7     // Catch: java.lang.Exception -> L33
            r5[r2] = r0     // Catch: java.lang.Exception -> L33
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r1 = r4
        L34:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r1 = r4
        L42:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L53
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r1[r3] = r5     // Catch: java.lang.Exception -> L53
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r1 = r4
        L54:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r1 == 0) goto L6b
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r1[r3] = r5     // Catch: java.lang.Exception -> L6b
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L7f
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L7f
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L7f
            goto L80
        L7f:
            r1 = r4
        L80:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L9d
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L9d
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L9d
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9d
            r5[r3] = r6     // Catch: java.lang.Exception -> L9d
            r5[r2] = r0     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L9d
            goto L9e
        L9d:
            r0 = r4
        L9e:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb3
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Method r4 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lb3
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lb3
        Lb3:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@oo0oO0 WorkSource workSource, int i, @oo0oO0 String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @oo0oO0
    @KeepForSdk
    public static WorkSource fromPackage(@oo0oO0 Context context, @oo0oO0 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    @o00oOooO.oo0oO0
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@o00oOooO.oo0oO0 android.content.Context r8, @o00oOooO.oo0oO0 java.lang.String r9, @o00oOooO.oo0oO0 java.lang.String r10) {
        /*
            r0 = 0
            if (r8 == 0) goto L61
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            if (r1 == 0) goto L61
            if (r10 == 0) goto L61
            if (r9 != 0) goto Le
            goto L61
        Le:
            r1 = -1
            r2 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r8 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r9, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r8 != 0) goto L1d
            java.lang.String r8 = "Could not get applicationInfo from package: "
            goto L22
        L1d:
            int r1 = r8.uid
            goto L25
        L20:
            java.lang.String r8 = "Could not find package: "
        L22:
            r8.concat(r9)
        L25:
            if (r1 >= 0) goto L28
            return r0
        L28:
            android.os.WorkSource r8 = new android.os.WorkSource
            r8.<init>()
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r0 == 0) goto L5d
            java.lang.reflect.Method r3 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r3 != 0) goto L36
            goto L5d
        L36:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r0.invoke(r8, r4)     // Catch: java.lang.Exception -> L60
            int r4 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L60
            r5 = 1
            r6 = 2
            if (r1 == r4) goto L4f
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L60
            r7[r2] = r1     // Catch: java.lang.Exception -> L60
            r7[r5] = r9     // Catch: java.lang.Exception -> L60
            r3.invoke(r0, r7)     // Catch: java.lang.Exception -> L60
        L4f:
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L60
            r9[r2] = r1     // Catch: java.lang.Exception -> L60
            r9[r5] = r10     // Catch: java.lang.Exception -> L60
            r3.invoke(r0, r9)     // Catch: java.lang.Exception -> L60
            goto L60
        L5d:
            add(r8, r1, r9)
        L60:
            return r8
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @KeepForSdk
    public static int get(@oo0oO0 WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @oo0oO0
    @KeepForSdk
    public static String getName(@oo0oO0 WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    @oo0oO0
    @KeepForSdk
    public static List<String> getNames(@oo0oO0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@oo0oO0 Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    public static boolean isEmpty(@oo0oO0 WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@oo0oO0 WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
