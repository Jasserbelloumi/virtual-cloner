package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
@TargetApi(24)
/* loaded from: classes2.dex */
public final class zzbt {
    @o0OO00OO
    private static final Method zza;
    @o0OO00OO
    private static final Method zzb;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
        }
        zzb = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r8 == 0) goto L5b
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L18
            goto L5b
        L18:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.zzbt.zzb
            r8 = 0
            if (r5 == 0) goto L2e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L2e
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r5 = r8
        L2f:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "UploadAlarm"
            if (r0 == 0) goto L56
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r8] = r6     // Catch: java.lang.Throwable -> L56
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Throwable -> L56
            r1 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L56
            r3[r1] = r5     // Catch: java.lang.Throwable -> L56
            r5 = 3
            r3[r5] = r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r5 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L5a
            int r8 = r5.intValue()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            int r8 = r7.schedule(r6)
        L5a:
            return r8
        L5b:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
