package o0O0OO;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0OOoO.o00ooO0;
/* loaded from: classes.dex */
public abstract class o0O00O0o {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f11319o00oOooo = "_Impl";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f11320o00oo00O = 999;
    @Deprecated

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public volatile o0O0OOoO.o00oo f11321o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Executor f11322o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Executor f11323o00oOo00;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f11325o00oOo0o;
    @o0OO00OO
    @Deprecated

    /* renamed from: o00oOoO  reason: collision with root package name */
    public List<o00oOOoO> f11326o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f11327o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O0OOoO.o00ooO0 f11331o00oOooO;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final ReentrantReadWriteLock f11328o00oOoOO = new ReentrantReadWriteLock();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final ThreadLocal<Integer> f11329o00oOoOo = new ThreadLocal<>();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final Map<String, Object> f11330o00oOoo0 = new ConcurrentHashMap();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final androidx.room.o00oOo00 f11324o00oOo0O = o00oOoO0();

    /* loaded from: classes.dex */
    public static class o00oOOo0<T extends o0O00O0o> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Class<T> f11332o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f11333o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Context f11334o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Executor f11335o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Executor f11336o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f11337o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o00ooO0.o00oOo00 f11338o00oOoO0;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public boolean f11340o00oOoOo;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f11342o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f11343o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public Set<Integer> f11344o00oo0;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public File f11346o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f11347o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public Set<Integer> f11348o00oo0OO;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public o00oOo00 f11339o00oOoOO = o00oOo00.AUTOMATIC;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public boolean f11341o00oOoo0 = true;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public final o00oOo0O f11345o00oo00O = new o00oOo0O();

        public o00oOOo0(@oo0oO0 Context context, @oo0oO0 Class<T> cls, @o0OO00OO String str) {
            this.f11334o00oOo00 = context;
            this.f11332o00oOOo0 = cls;
            this.f11333o00oOOoO = str;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2) {
            if (this.f11342o00oOooO == null) {
                this.f11342o00oOooO = new ArrayList<>();
            }
            this.f11342o00oOooO.add(o00ooooo2);
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOOoO(@oo0oO0 o0O0OOO0.o00oOOo0... o00oooo0Arr) {
            if (this.f11348o00oo0OO == null) {
                this.f11348o00oo0OO = new HashSet();
            }
            for (o0O0OOO0.o00oOOo0 o00oooo02 : o00oooo0Arr) {
                this.f11348o00oo0OO.add(Integer.valueOf(o00oooo02.f11472o00oOOo0));
                this.f11348o00oo0OO.add(Integer.valueOf(o00oooo02.f11473o00oOOoO));
            }
            this.f11345o00oo00O.o00oOOoO(o00oooo0Arr);
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOo00() {
            this.f11337o00oOoO = true;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOo0O(@oo0oO0 String str) {
            this.f11347o00oo0O0 = str;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOo0o(@oo0oO0 File file) {
            this.f11346o00oo0O = file;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOoO() {
            this.f11341o00oOoo0 = false;
            this.f11343o00oOooo = true;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOoO0() {
            this.f11340o00oOoOo = this.f11333o00oOOoO != null;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOoOO(int... iArr) {
            if (this.f11344o00oo0 == null) {
                this.f11344o00oo0 = new HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.f11344o00oo0.add(Integer.valueOf(i));
            }
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOoOo() {
            this.f11341o00oOoo0 = true;
            this.f11343o00oOooo = true;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oOoo0(@o0OO00OO o00ooO0.o00oOo00 o00ooo002) {
            this.f11338o00oOoO0 = o00ooo002;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        @o00oOooO.oo0oO0
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T o00oOooO() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O0OO.o0O00O0o.o00oOOo0.o00oOooO():o0O0OO.o0O00O0o");
        }

        @oo0oO0
        public o00oOOo0<T> o00oOooo(@oo0oO0 o00oOo00 o00ooo002) {
            this.f11339o00oOoOO = o00ooo002;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oo0(@oo0oO0 Executor executor) {
            this.f11336o00oOo0o = executor;
            return this;
        }

        @oo0oO0
        public o00oOOo0<T> o00oo00O(@oo0oO0 Executor executor) {
            this.f11335o00oOo0O = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {
        public void o00oOOo0(@oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        }

        public void o00oOOoO(@oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        }

        public void o00oOo00(@oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOo00 {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(@oo0oO0 ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public o00oOo00 resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, o0O0OOO0.o00oOOo0>> f11349o00oOOo0 = new HashMap<>();

        public final void o00oOOo0(o0O0OOO0.o00oOOo0 o00oooo02) {
            int i = o00oooo02.f11472o00oOOo0;
            int i2 = o00oooo02.f11473o00oOOoO;
            TreeMap<Integer, o0O0OOO0.o00oOOo0> treeMap = this.f11349o00oOOo0.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f11349o00oOOo0.put(Integer.valueOf(i), treeMap);
            }
            o0O0OOO0.o00oOOo0 o00oooo03 = treeMap.get(Integer.valueOf(i2));
            if (o00oooo03 != null) {
                o00oooo03.toString();
                o00oooo02.toString();
            }
            treeMap.put(Integer.valueOf(i2), o00oooo02);
        }

        public void o00oOOoO(@oo0oO0 o0O0OOO0.o00oOOo0... o00oooo0Arr) {
            for (o0O0OOO0.o00oOOo0 o00oooo02 : o00oooo0Arr) {
                o00oOOo0(o00oooo02);
            }
        }

        @o0OO00OO
        public List<o0O0OOO0.o00oOOo0> o00oOo00(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return o00oOooO(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<o0O0OOO0.o00oOOo0> o00oOooO(java.util.List<o0O0OOO0.o00oOOo0> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, o0O0OOO0.o00oOOo0>> r0 = r6.f11349o00oOOo0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = r5
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O0OO.o0O00O0o.o00oOo0O.o00oOooO(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean o00oo0o() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOOo0() {
        if (!this.f11325o00oOo0o && o00oo0o()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOOoO() {
        if (!o00oo0O() && this.f11329o00oOoOo.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void o00oOo00() {
        o00oOOo0();
        o0O0OOoO.o00oo writableDatabase = this.f11331o00oOooO.getWritableDatabase();
        this.f11324o00oOo0O.o00oo0Oo(writableDatabase);
        writableDatabase.o00oOoOo();
    }

    public void o00oOo0O() {
        if (o00oo0oO()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f11328o00oOoOO.writeLock();
            try {
                writeLock.lock();
                this.f11324o00oOo0O.o00oo0OO();
                this.f11331o00oOooO.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public o0O0OOoO.o0O0000O o00oOo0o(@oo0oO0 String str) {
        o00oOOo0();
        o00oOOoO();
        return this.f11331o00oOooO.getWritableDatabase().o0O0oo0o(str);
    }

    @oo0oO0
    public abstract o0O0OOoO.o00ooO0 o00oOoO(o0O0OO.o00oOo0O o00ooo0o2);

    @oo0oO0
    public abstract androidx.room.o00oOo00 o00oOoO0();

    @Deprecated
    public void o00oOoOO() {
        this.f11331o00oOooO.getWritableDatabase().o0();
        if (o00oo0O()) {
            return;
        }
        this.f11324o00oOo0O.o00oOoOO();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public Map<String, Object> o00oOoOo() {
        return this.f11330o00oOoo0;
    }

    public Lock o00oOoo0() {
        return this.f11328o00oOoOO.readLock();
    }

    @oO0Oo
    public abstract void o00oOooO();

    @oo0oO0
    public androidx.room.o00oOo00 o00oOooo() {
        return this.f11324o00oOo0O;
    }

    @oo0oO0
    public Cursor o00oo(@oo0oO0 o0O0OOoO.o0 o0Var) {
        return o00ooO00(o0Var, null);
    }

    @oo0oO0
    public Executor o00oo0() {
        return this.f11322o00oOOoO;
    }

    @oo0oO0
    public o0O0OOoO.o00ooO0 o00oo00O() {
        return this.f11331o00oOooO;
    }

    public boolean o00oo0O() {
        return this.f11331o00oOooO.getWritableDatabase().o0O0o0Oo();
    }

    @oo0oO0
    public Executor o00oo0O0() {
        return this.f11323o00oOo00;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public ThreadLocal<Integer> o00oo0OO() {
        return this.f11329o00oOoOo;
    }

    @o00oOooO.o0O00O0
    public void o00oo0Oo(@oo0oO0 o0O0OO.o00oOo0O o00ooo0o2) {
        o0O0OOoO.o00ooO0 o00oOoO2 = o00oOoO(o00ooo0o2);
        this.f11331o00oOooO = o00oOoO2;
        if (o00oOoO2 instanceof o0O00o00) {
            ((o0O00o00) o00oOoO2).o00oOOoO(o00ooo0o2);
        }
        boolean z = o00ooo0o2.f11297o00oOoO0 == o00oOo00.WRITE_AHEAD_LOGGING;
        this.f11331o00oOooO.setWriteAheadLoggingEnabled(z);
        this.f11326o00oOoO = o00ooo0o2.f11294o00oOo0O;
        this.f11322o00oOOoO = o00ooo0o2.f11296o00oOoO;
        this.f11323o00oOo00 = new o0O0O0Oo(o00ooo0o2.f11298o00oOoOO);
        this.f11325o00oOo0o = o00ooo0o2.f11295o00oOo0o;
        this.f11327o00oOoO0 = z;
        if (o00ooo0o2.f11299o00oOoOo) {
            this.f11324o00oOo0O.o00oo00O(o00ooo0o2.f11292o00oOOoO, o00ooo0o2.f11293o00oOo00);
        }
    }

    public void o00oo0o0(@oo0oO0 o0O0OOoO.o00oo o00ooVar) {
        this.f11324o00oOo0O.o00oOoO0(o00ooVar);
    }

    public boolean o00oo0oO() {
        o0O0OOoO.o00oo o00ooVar = this.f11321o00oOOo0;
        return o00ooVar != null && o00ooVar.isOpen();
    }

    public <V> V o00ooO0(@oo0oO0 Callable<V> callable) {
        o00oOo00();
        try {
            try {
                V call = callable.call();
                o00ooO0o();
                return call;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            o00oOoOO();
        }
    }

    @oo0oO0
    public Cursor o00ooO00(@oo0oO0 o0O0OOoO.o0 o0Var, @o0OO00OO CancellationSignal cancellationSignal) {
        o00oOOo0();
        o00oOOoO();
        return cancellationSignal != null ? this.f11331o00oOooO.getWritableDatabase().o0O0OOO(o0Var, cancellationSignal) : this.f11331o00oOooO.getWritableDatabase().o0O00o0o(o0Var);
    }

    public void o00ooO0O(@oo0oO0 Runnable runnable) {
        o00oOo00();
        try {
            runnable.run();
            o00ooO0o();
        } finally {
            o00oOoOO();
        }
    }

    @Deprecated
    public void o00ooO0o() {
        this.f11331o00oOooO.getWritableDatabase().o00ooo0O();
    }

    @oo0oO0
    public Cursor o0O0o(@oo0oO0 String str, @o0OO00OO Object[] objArr) {
        return this.f11331o00oOooO.getWritableDatabase().o0O00o0o(new o0O0OOoO.o0O0o(str, objArr));
    }
}
