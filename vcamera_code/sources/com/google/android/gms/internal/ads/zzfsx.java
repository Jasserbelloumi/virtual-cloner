package com.google.android.gms.internal.ads;

import androidx.fragment.app.o0O00;
import com.google.common.util.concurrent.OverflowAvoidingLockSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract class zzfsx<V> extends zzfvm implements zzfut<V> {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    public static final boolean zzd;
    @CheckForNull
    private volatile zzd listeners;
    @CheckForNull
    private volatile Object value;
    @CheckForNull
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzfsw zzfswVar) {
        }

        public abstract zzd zza(zzfsx zzfsxVar, zzd zzdVar);

        public abstract zzk zzb(zzfsx zzfsxVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzb {
        @CheckForNull
        public static final zzb zza;
        @CheckForNull
        public static final zzb zzb;
        public final boolean zzc;
        @CheckForNull
        public final Throwable zzd;

        static {
            if (zzfsx.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfsx.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzd {
        public static final zzd zza = new zzd();
        @CheckForNull
        public zzd next;
        @CheckForNull
        public final Runnable zzb;
        @CheckForNull
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes2.dex */
    final class zze extends zza {
        public final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        public final AtomicReferenceFieldUpdater<zzfsx, zzk> zzc;
        public final AtomicReferenceFieldUpdater<zzfsx, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzfsx, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfsxVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfsxVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfsy.zza(this.zzd, zzfsxVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            return zzfsy.zza(this.zze, zzfsxVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfsy.zza(this.zzc, zzfsxVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        public final zzfsx<V> zza;
        public final zzfut<? extends V> zzb;

        public zzf(zzfsx zzfsxVar, zzfut zzfutVar) {
            this.zza = zzfsxVar;
            this.zzb = zzfutVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfsx) this.zza).value != this) {
                return;
            }
            if (zzfsx.zzba.zzf(this.zza, this, zzfsx.zzf(this.zzb))) {
                zzfsx.zzy(this.zza, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(zzfsz zzfszVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfsxVar) {
                zzdVar2 = zzfsxVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfsxVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfsxVar) {
                zzkVar2 = zzfsxVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfsxVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.listeners == zzdVar) {
                    zzfsxVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.value == obj) {
                    zzfsxVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfsxVar) {
                if (zzfsxVar.waiters == zzkVar) {
                    zzfsxVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends zzfut<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zzi<V> extends zzfsx<V> implements zzh<V> {
    }

    /* loaded from: classes2.dex */
    final class zzj extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfsx.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfsx.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(zzftb zzftbVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzd zza(zzfsx zzfsxVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfsxVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfsxVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final zzk zzb(zzfsx zzfsxVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfsxVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfsxVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zze(zzfsx zzfsxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfta.zza(zza, zzfsxVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzf(zzfsx zzfsxVar, @CheckForNull Object obj, Object obj2) {
            return zzfta.zza(zza, zzfsxVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfsx.zza
        public final boolean zzg(zzfsx zzfsxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfta.zza(zza, zzfsxVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzk {
        public static final zzk zza = new zzk(false);
        @CheckForNull
        public volatile zzk next;
        @CheckForNull
        public volatile Thread thread;

        public zzk() {
            zzfsx.zzba.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaZ = Logger.getLogger(zzfsx.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfsx.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzbd) {
                return null;
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzf(zzfut zzfutVar) {
        Throwable zzm;
        if (zzfutVar instanceof zzh) {
            Object obj = ((zzfsx) zzfutVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(zzfutVar instanceof zzfvm) || (zzm = ((zzfvm) zzfutVar).zzm()) == null) {
            boolean isCancelled = zzfutVar.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzg2 = zzg(zzfutVar);
                if (!isCancelled) {
                    return zzg2 == null ? zzbd : zzg2;
                }
                String valueOf = String.valueOf(zzfutVar);
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfutVar)), e2)) : new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfutVar)), e4)) : new zzc(e4.getCause());
            }
        } else {
            return new zzc(zzm);
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                hexString = "null";
            } else if (zzg2 == this) {
                hexString = "this future";
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(zzg2));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzw(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.value
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.zzfsx$zzf r1 = (com.google.android.gms.internal.ads.zzfsx.zzf) r1
            com.google.android.gms.internal.ads.zzfut<? extends V> r1 = r1.zzb
            r4.zzx(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.zza()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfoj.zza(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.zzv(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zzw(java.lang.StringBuilder):void");
    }

    private final void zzx(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzy(zzfsx zzfsxVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfsxVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzfsxVar.zzr();
            }
            zzfsxVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzba.zza(zzfsxVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfsxVar = zzfVar.zza;
                    if (zzfsxVar.value == zzfVar) {
                        if (zzba.zzf(zzfsxVar, zzfVar, zzf(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", o0O00.o00oOOo0("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzfsx.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = new com.google.android.gms.internal.ads.zzfsx$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfsx$zzb r1 = com.google.android.gms.internal.ads.zzfsx.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzfsx$zza r6 = com.google.android.gms.internal.ads.zzfsx.zzba
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzy(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzfsx$zzf r0 = (com.google.android.gms.internal.ads.zzfsx.zzf) r0
            com.google.android.gms.internal.ads.zzfut<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzfsx r4 = (com.google.android.gms.internal.ads.zzfsx) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfsx.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzB(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar == zzk.zza) {
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        zzk zzkVar2 = new zzk();
        do {
            zza zzaVar = zzba;
            zzaVar.zzc(zzkVar2, zzkVar);
            if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        zzA(zzkVar2);
                        throw new InterruptedException();
                    }
                    obj = this.value;
                } while (!((obj != null) & (!(obj instanceof zzf))));
                return zzB(obj);
            }
            zzkVar = this.waiters;
        } while (zzkVar != zzk.zza);
        Object obj32 = this.value;
        obj32.getClass();
        return zzB(obj32);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzB(obj);
        }
        long j2 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                while (true) {
                    zza zzaVar = zzba;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, (long) OverflowAvoidingLockSupport.MAX_NANOSECONDS_THRESHOLD));
                            if (Thread.interrupted()) {
                                zzA(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzB(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzA(zzkVar2);
                        j2 = 0;
                    } else {
                        zzkVar = this.waiters;
                        if (zzkVar == zzk.zza) {
                            break;
                        }
                    }
                }
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        while (nanos > j2) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzB(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
            j2 = 0;
        }
        String zzfsxVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            if (i != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (i > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.o00oOoO.o00oOOo0(str, " for ", zzfsxVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfnu.zzc(runnable, "Runnable was null.");
        zzfnu.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzba.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (zzba.zzf(this, null, obj)) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable th) {
        th.getClass();
        if (zzba.zzf(this, null, new zzc(th))) {
            zzy(this, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    @CheckForNull
    public final Throwable zzm() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfut zzfutVar) {
        zzc zzcVar;
        zzfutVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzfutVar.isDone()) {
                if (zzba.zzf(this, null, zzf(zzfutVar))) {
                    zzy(this, false);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzfutVar);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    zzfutVar.zzc(zzfVar, zzftx.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfutVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
