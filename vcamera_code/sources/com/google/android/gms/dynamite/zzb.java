package com.google.android.gms.dynamite;

import android.os.Looper;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class zzb {
    @o0O0OOOo("DynamiteLoaderV2ClassLoader.class")
    @o0OO00OO
    private static volatile ClassLoader zza;
    @o0O0OOOo("DynamiteLoaderV2ClassLoader.class")
    @o0OO00OO
    private static volatile Thread zzb;

    @o0OO00OO
    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    @o0OO00OO
    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e) {
                    e.getMessage();
                }
            }
            return classLoader;
        }
    }

    @o0OO00OO
    private static synchronized Thread zzc() {
        SecurityException e;
        zza zzaVar;
        zza zzaVar2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            zzaVar2 = null;
                            break;
                        }
                        zzaVar2 = threadArr[i];
                        if ("GmsDynamite".equals(zzaVar2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    zzaVar = null;
                }
                if (zzaVar2 == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                        try {
                            zzaVar.setContextClassLoader(null);
                            zzaVar.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            e.getMessage();
                            zzaVar2 = zzaVar;
                            return zzaVar2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        zzaVar = zzaVar2;
                    }
                    zzaVar2 = zzaVar;
                }
            }
            return zzaVar2;
        }
    }
}
