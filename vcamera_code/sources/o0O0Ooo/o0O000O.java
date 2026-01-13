package o0O0Ooo;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o0O0Ooo.o0O00O0o;
import o0O0Ooo0.o0O0o;
import o0O0o0OO.o00oo0;
import o0O0o0o.o00ooO;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000O implements o0O0000O, o00oo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f12058o00ooO = "ProcessorForegroundLck";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f12059o00ooO0o = o0O0Ooo0.o0O00000.o00oOo0o("Processor");

    /* renamed from: o00oo  reason: collision with root package name */
    public List<o0OoOoOo> f12060o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Context f12061o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public androidx.work.o00oOOo0 f12063o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public WorkDatabase f12064o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public oO00O0oO f12065o00oo0o0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Map<String, o0O00O0o> f12070o0O0o = new HashMap();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Map<String, o0O00O0o> f12066o00oo0oO = new HashMap();

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Set<String> f12068o00ooO00 = new HashSet();

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final List<o0O0000O> f12067o00ooO0 = new ArrayList();
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public PowerManager.WakeLock f12062o00oo0O0 = null;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final Object f12069o00ooO0O = new Object();

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Runnable {
        @oo0oO0

        /* renamed from: o00oo0O  reason: collision with root package name */
        public String f12071o00oo0O;
        @oo0oO0

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o0O0000O f12072o00oo0O0;
        @oo0oO0

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public ListenableFuture<Boolean> f12073o00oo0Oo;

        public o00oOOo0(@oo0oO0 o0O0000O o0o0000o, @oo0oO0 String str, @oo0oO0 ListenableFuture<Boolean> listenableFuture) {
            this.f12072o00oo0O0 = o0o0000o;
            this.f12071o00oo0O = str;
            this.f12073o00oo0Oo = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f12073o00oo0Oo.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f12072o00oo0O0.o00oOo0O(this.f12071o00oo0O, z);
        }
    }

    public o0O000O(@oo0oO0 Context context, @oo0oO0 androidx.work.o00oOOo0 o00oooo02, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 WorkDatabase workDatabase, @oo0oO0 List<o0OoOoOo> list) {
        this.f12061o00oo0O = context;
        this.f12063o00oo0Oo = o00oooo02;
        this.f12065o00oo0o0 = oo00o0oo;
        this.f12064o00oo0o = workDatabase;
        this.f12060o00oo = list;
    }

    public static boolean o00oOo0o(@oo0oO0 String str, @o0OO00OO o0O00O0o o0o00o0o) {
        if (o0o00o0o == null) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        o0o00o0o.o00oOooO();
        o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // o0O0o0OO.o00oo0
    public void o00oOOo0(@oo0oO0 String str) {
        synchronized (this.f12069o00ooO0O) {
            this.f12066o00oo0oO.remove(str);
            o00oo0();
        }
    }

    @Override // o0O0o0OO.o00oo0
    public void o00oOOoO(@oo0oO0 String str, @oo0oO0 o0O0o o0o0o) {
        synchronized (this.f12069o00ooO0O) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOooO(f12059o00ooO0o, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o0O00O0o remove = this.f12070o0O0o.remove(str);
            if (remove != null) {
                if (this.f12062o00oo0O0 == null) {
                    PowerManager.WakeLock o00oOOoO2 = o0O0o0o0.o0O0000O.o00oOOoO(this.f12061o00oo0O, f12058o00ooO);
                    this.f12062o00oo0O0 = o00oOOoO2;
                    o00oOOoO2.acquire();
                }
                this.f12066o00oo0oO.put(str, remove);
                o0.startForegroundService(this.f12061o00oo0O, androidx.work.impl.foreground.o00oOOo0.o00oOooO(this.f12061o00oo0O, str, o0o0o));
            }
        }
    }

    public void o00oOo00(@oo0oO0 o0O0000O o0o0000o) {
        synchronized (this.f12069o00ooO0O) {
            this.f12067o00ooO0.add(o0o0000o);
        }
    }

    @Override // o0O0Ooo.o0O0000O
    public void o00oOo0O(@oo0oO0 String str, boolean z) {
        synchronized (this.f12069o00ooO0O) {
            this.f12070o0O0o.remove(str);
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (o0O0000O o0o0000o : this.f12067o00ooO0) {
                o0o0000o.o00oOo0O(str, z);
            }
        }
    }

    public boolean o00oOoO(@oo0oO0 String str) {
        boolean z;
        synchronized (this.f12069o00ooO0O) {
            z = this.f12070o0O0o.containsKey(str) || this.f12066o00oo0oO.containsKey(str);
        }
        return z;
    }

    public boolean o00oOoO0(@oo0oO0 String str) {
        boolean contains;
        synchronized (this.f12069o00ooO0O) {
            contains = this.f12068o00ooO00.contains(str);
        }
        return contains;
    }

    public boolean o00oOoOO(@oo0oO0 String str) {
        boolean containsKey;
        synchronized (this.f12069o00ooO0O) {
            containsKey = this.f12066o00oo0oO.containsKey(str);
        }
        return containsKey;
    }

    public void o00oOoOo(@oo0oO0 o0O0000O o0o0000o) {
        synchronized (this.f12069o00ooO0O) {
            this.f12067o00ooO0.remove(o0o0000o);
        }
    }

    public boolean o00oOoo0(@oo0oO0 String str) {
        return o00oOooo(str, null);
    }

    public boolean o00oOooO() {
        boolean z;
        synchronized (this.f12069o00ooO0O) {
            z = (this.f12070o0O0o.isEmpty() && this.f12066o00oo0oO.isEmpty()) ? false : true;
        }
        return z;
    }

    public boolean o00oOooo(@oo0oO0 String str, @o0OO00OO WorkerParameters.o00oOOo0 o00oooo02) {
        synchronized (this.f12069o00ooO0O) {
            if (o00oOoO(str)) {
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o0O00O0o.o00oOo00 o00ooo002 = new o0O00O0o.o00oOo00(this.f12061o00oo0O, this.f12063o00oo0Oo, this.f12065o00oo0o0, this, this.f12064o00oo0o, str);
            o00ooo002.f12138o00oOoO = this.f12060o00oo;
            if (o00oooo02 != null) {
                o00ooo002.f12140o00oOoOO = o00oooo02;
            }
            o0O00O0o o0o00o0o = new o0O00O0o(o00ooo002);
            o00ooO<Boolean> o00ooo = o0o00o0o.f12124o00ooOo0;
            o00ooo.addListener(new o00oOOo0(this, str, o00ooo), this.f12065o00oo0o0.o00oOOo0());
            this.f12070o0O0o.put(str, o0o00o0o);
            this.f12065o00oo0o0.o00oOooO().execute(o0o00o0o);
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void o00oo0() {
        synchronized (this.f12069o00ooO0O) {
            if (!(!this.f12066o00oo0oO.isEmpty())) {
                this.f12061o00oo0O.startService(androidx.work.impl.foreground.o00oOOo0.o00oOoO0(this.f12061o00oo0O));
                PowerManager.WakeLock wakeLock = this.f12062o00oo0O0;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f12062o00oo0O0 = null;
                }
            }
        }
    }

    public boolean o00oo00O(@oo0oO0 String str) {
        boolean o00oOo0o2;
        synchronized (this.f12069o00ooO0O) {
            boolean z = true;
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f12068o00ooO00.add(str);
            o0O00O0o remove = this.f12066o00oo0oO.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f12070o0O0o.remove(str);
            }
            o00oOo0o2 = o00oOo0o(str, remove);
            if (z) {
                o00oo0();
            }
        }
        return o00oOo0o2;
    }

    public boolean o00oo0O0(@oo0oO0 String str) {
        boolean o00oOo0o2;
        synchronized (this.f12069o00ooO0O) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("Processor stopping background work %s", str), new Throwable[0]);
            o00oOo0o2 = o00oOo0o(str, this.f12070o0O0o.remove(str));
        }
        return o00oOo0o2;
    }

    public boolean o00oo0OO(@oo0oO0 String str) {
        boolean o00oOo0o2;
        synchronized (this.f12069o00ooO0O) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(f12059o00ooO0o, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            o00oOo0o2 = o00oOo0o(str, this.f12066o00oo0oO.remove(str));
        }
        return o00oOo0o2;
    }
}
