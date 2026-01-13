package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzcb {
    private static final String zza = "zzcb";
    @o0OO00OO
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, @o0OO00OO MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        zzf zzeVar;
        Preconditions.checkNotNull(context);
        "preferredRenderer: ".concat(String.valueOf(renderer));
        zzf zzfVar = zzc;
        if (zzfVar == null) {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (isGooglePlayServicesAvailable == 0) {
                try {
                    IBinder iBinder = (IBinder) zzd(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        zzeVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        zzeVar = queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zze(iBinder);
                    }
                    zzc = zzeVar;
                    try {
                        Context zzc2 = zzc(context, renderer);
                        zzc2.getClass();
                        zzeVar.zzk(ObjectWrapper.wrap(zzc2.getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        return zzc;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        return zzfVar;
    }

    private static Context zzb(Exception exc, Context context) {
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        r2 = com.google.android.gms.dynamite.DynamiteModule.load(r2, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
        r2 = zzb(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = zzb(r1, r2);
     */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Context zzc(android.content.Context r2, @o00oOooO.o0OO00OO com.google.android.gms.maps.MapsInitializer.Renderer r3) {
        /*
            android.content.Context r0 = com.google.android.gms.maps.internal.zzcb.zzb
            if (r0 != 0) goto L46
            r2.getApplicationContext()
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            if (r3 == 0) goto L1b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L18
            r1 = 1
            if (r3 == r1) goto L15
            goto L1b
        L15:
            java.lang.String r3 = "com.google.android.gms.maps_core_dynamite"
            goto L1c
        L18:
            java.lang.String r3 = "com.google.android.gms.maps_legacy_dynamite"
            goto L1c
        L1b:
            r3 = r0
        L1c:
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r1 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L27
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r1, r3)     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = r1.getModuleContext()     // Catch: java.lang.Exception -> L27
            goto L43
        L27:
            r1 = move-exception
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3f
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r3 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L39
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.load(r2, r3, r0)     // Catch: java.lang.Exception -> L39
            android.content.Context r2 = r3.getModuleContext()     // Catch: java.lang.Exception -> L39
            goto L43
        L39:
            r3 = move-exception
            android.content.Context r2 = zzb(r3, r2)
            goto L43
        L3f:
            android.content.Context r2 = zzb(r1, r2)
        L43:
            com.google.android.gms.maps.internal.zzcb.zzb = r2
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzcb.zzc(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):android.content.Context");
    }

    private static Object zzd(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException unused) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        } catch (InstantiationException unused2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        }
    }
}
