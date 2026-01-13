package com.google.android.gms.maps;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    @GuardedBy("MapsInitializer.class")
    private static boolean zzb;
    @GuardedBy("MapsInitializer.class")
    private static Renderer zzc = Renderer.LEGACY;

    /* loaded from: classes2.dex */
    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@oo0oO0 Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|12|13|14|15|16|(10:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29)|30|31)|34|22|23|(0)|26|27|(0)|30|31) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[Catch: RemoteException -> 0x0054, all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0018, B:10:0x001f, B:11:0x0023, B:13:0x0032, B:15:0x0037, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:25:0x0054, B:27:0x0061, B:31:0x0069, B:32:0x006e, B:34:0x0070), top: B:41:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0018, B:10:0x001f, B:11:0x0023, B:13:0x0032, B:15:0x0037, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:25:0x0054, B:27:0x0061, B:31:0x0069, B:32:0x006e, B:34:0x0070), top: B:41:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int initialize(@o00oOooO.oo0oO0 android.content.Context r5, @o00oOooO.o0OO00OO com.google.android.gms.maps.MapsInitializer.Renderer r6, @o00oOooO.o0OO00OO com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "preferredRenderer: "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L74
            r1.concat(r2)     // Catch: java.lang.Throwable -> L74
            boolean r1 = com.google.android.gms.maps.MapsInitializer.zzb     // Catch: java.lang.Throwable -> L74
            r2 = 0
            if (r1 == 0) goto L1f
            if (r7 == 0) goto L1d
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L74
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L74
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcb.zza(r5, r6)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L6f java.lang.Throwable -> L74
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch: android.os.RemoteException -> L68 java.lang.Throwable -> L74
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch: android.os.RemoteException -> L68 java.lang.Throwable -> L74
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: android.os.RemoteException -> L68 java.lang.Throwable -> L74
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch: android.os.RemoteException -> L68 java.lang.Throwable -> L74
            r3 = 1
            com.google.android.gms.maps.MapsInitializer.zzb = r3     // Catch: java.lang.Throwable -> L74
            r4 = 2
            if (r6 == 0) goto L42
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L43
            if (r6 == r3) goto L40
            goto L42
        L40:
            r3 = r4
            goto L43
        L42:
            r3 = r2
        L43:
            int r6 = r1.zzd()     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L74
            if (r6 != r4) goto L4d
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L74
            com.google.android.gms.maps.MapsInitializer.zzc = r6     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L74
        L4d:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L74
            r1.zzl(r5, r3)     // Catch: android.os.RemoteException -> L54 java.lang.Throwable -> L74
        L54:
            java.lang.String r5 = "loadedRenderer: "
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L74
            r5.concat(r6)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L66
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L74
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L74
        L66:
            monitor-exit(r0)
            return r2
        L68:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L74
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L74
        L6f:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch: java.lang.Throwable -> L74
            monitor-exit(r0)
            return r5
        L74:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
