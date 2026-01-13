package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0OO.o0O000;
import o0O0OO.o0O00O0o;
import o0O0OOoO.o00oo;
import o0O0OOoO.o0O0000O;
import o0O0OOoO.o0O0o;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f4798o00oo0 = "room_table_modification_log";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String[] f4799o00oo00O = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f4800o00oo0O = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f4801o00oo0O0 = "invalidated";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f4802o00oo0OO = "table_id";
    @o0o0000

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f4803o00oo0Oo = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    @o0o0000

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f4804o00oo0o0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final HashMap<String, Integer> f4805o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String[] f4806o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Map<String, Set<String>> f4807o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public AtomicBoolean f4808o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public volatile boolean f4809o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o00oOOoO f4810o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public volatile o0O0000O f4811o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final o0O000 f4812o00oOoOO;
    @o0o0000
    @SuppressLint({"RestrictedApi"})

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final o00oo00O.o00oOOoO<AbstractC0046o00oOo00, o00oOo0O> f4813o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public androidx.room.o00oOo0O f4814o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00O0o f4815o00oOooO;
    @o0o0000

    /* renamed from: o00oOooo  reason: collision with root package name */
    public Runnable f4816o00oOooo;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        public final Set<Integer> o00oOOo0() {
            HashSet hashSet = new HashSet();
            Cursor o00oo2 = o00oOo00.this.f4815o00oOooO.o00oo(new o0O0o(o00oOo00.f4804o00oo0o0, null));
            while (o00oo2.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(o00oo2.getInt(0)));
                } catch (Throwable th) {
                    o00oo2.close();
                    throw th;
                }
            }
            o00oo2.close();
            if (!hashSet.isEmpty()) {
                o00oOo00.this.f4811o00oOoO0.o00oo0oO();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock o00oOoo02 = o00oOo00.this.f4815o00oOooO.o00oOoo0();
            Set<Integer> set = null;
            try {
                o00oOoo02.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                o00oOoo02.unlock();
                throw th;
            }
            if (!o00oOo00.this.o00oOo0o()) {
                o00oOoo02.unlock();
            } else if (!o00oOo00.this.f4808o00oOo0O.compareAndSet(true, false)) {
                o00oOoo02.unlock();
            } else if (o00oOo00.this.f4815o00oOooO.o00oo0O()) {
                o00oOoo02.unlock();
            } else {
                o0O00O0o o0o00o0o = o00oOo00.this.f4815o00oOooO;
                if (o0o00o0o.f11327o00oOoO0) {
                    o00oo writableDatabase = o0o00o0o.o00oo00O().getWritableDatabase();
                    writableDatabase.o00oOoOo();
                    try {
                        set = o00oOOo0();
                        writableDatabase.o00ooo0O();
                        writableDatabase.o0();
                    } catch (Throwable th2) {
                        writableDatabase.o0();
                        throw th2;
                    }
                } else {
                    set = o00oOOo0();
                }
                o00oOoo02.unlock();
                if (set == null || set.isEmpty()) {
                    return;
                }
                synchronized (o00oOo00.this.f4813o00oOoOo) {
                    Iterator<Map.Entry<AbstractC0046o00oOo00, o00oOo0O>> it = o00oOo00.this.f4813o00oOoOo.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().o00oOOo0(set);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f4818o00oOo0o = 0;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4819o00oOoO = 2;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4820o00oOoO0 = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final long[] f4821o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean[] f4822o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int[] f4823o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f4824o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4825o00oOooO;

        public o00oOOoO(int i) {
            long[] jArr = new long[i];
            this.f4821o00oOOo0 = jArr;
            boolean[] zArr = new boolean[i];
            this.f4822o00oOOoO = zArr;
            this.f4823o00oOo00 = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @o0OO00OO
        public int[] o00oOOo0() {
            synchronized (this) {
                if (this.f4825o00oOooO && !this.f4824o00oOo0O) {
                    int length = this.f4821o00oOOo0.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f4824o00oOo0O = true;
                            this.f4825o00oOooO = false;
                            return this.f4823o00oOo00;
                        }
                        boolean z = this.f4821o00oOOo0[i] > 0;
                        boolean[] zArr = this.f4822o00oOOoO;
                        if (z != zArr[i]) {
                            int[] iArr = this.f4823o00oOo00;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f4823o00oOo00[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }

        public boolean o00oOOoO(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4821o00oOOo0;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f4825o00oOooO = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean o00oOo00(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4821o00oOOo0;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f4825o00oOooO = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public void o00oOooO() {
            synchronized (this) {
                this.f4824o00oOo0O = false;
            }
        }
    }

    /* renamed from: androidx.room.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0046o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String[] f4826o00oOOo0;

        public AbstractC0046o00oOo00(@oo0oO0 String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.f4826o00oOOo0 = strArr2;
            strArr2[strArr.length] = str;
        }

        public AbstractC0046o00oOo00(@oo0oO0 String[] strArr) {
            this.f4826o00oOOo0 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean o00oOOo0() {
            return false;
        }

        public abstract void o00oOOoO(@oo0oO0 Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int[] f4827o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String[] f4828o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final AbstractC0046o00oOo00 f4829o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Set<String> f4830o00oOooO;

        public o00oOo0O(AbstractC0046o00oOo00 abstractC0046o00oOo00, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f4829o00oOo00 = abstractC0046o00oOo00;
            this.f4827o00oOOo0 = iArr;
            this.f4828o00oOOoO = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f4830o00oOooO = set;
        }

        public void o00oOOo0(Set<Integer> set) {
            int length = this.f4827o00oOOo0.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f4827o00oOOo0[i]))) {
                    if (length == 1) {
                        set2 = this.f4830o00oOooO;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f4828o00oOOoO[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f4829o00oOo00.o00oOOoO(set2);
            }
        }

        public void o00oOOoO(String[] strArr) {
            Set<String> set = null;
            if (this.f4828o00oOOoO.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f4828o00oOOoO[0])) {
                        set = this.f4830o00oOooO;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4828o00oOOoO;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4829o00oOo00.o00oOOoO(set);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends AbstractC0046o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOo00 f4831o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final WeakReference<AbstractC0046o00oOo00> f4832o00oOo00;

        public o00oOoO(o00oOo00 o00ooo002, AbstractC0046o00oOo00 abstractC0046o00oOo00) {
            super(abstractC0046o00oOo00.f4826o00oOOo0);
            this.f4831o00oOOoO = o00ooo002;
            this.f4832o00oOo00 = new WeakReference<>(abstractC0046o00oOo00);
        }

        @Override // androidx.room.o00oOo00.AbstractC0046o00oOo00
        public void o00oOOoO(@oo0oO0 Set<String> set) {
            AbstractC0046o00oOo00 abstractC0046o00oOo00 = this.f4832o00oOo00.get();
            if (abstractC0046o00oOo00 == null) {
                this.f4831o00oOOoO.o00oOoo0(this);
            } else {
                abstractC0046o00oOo00.o00oOOoO(set);
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo00(o0O00O0o o0o00o0o, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4808o00oOo0O = new AtomicBoolean(false);
        this.f4809o00oOo0o = false;
        this.f4813o00oOoOo = new o00oo00O.o00oOOoO<>();
        this.f4816o00oOooo = new o00oOOo0();
        this.f4815o00oOooO = o0o00o0o;
        this.f4810o00oOoO = new o00oOOoO(strArr.length);
        this.f4805o00oOOo0 = new HashMap<>();
        this.f4807o00oOo00 = map2;
        this.f4812o00oOoOO = new o0O000(o0o00o0o);
        int length = strArr.length;
        this.f4806o00oOOoO = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4805o00oOOo0.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f4806o00oOOoO[i] = str2.toLowerCase(locale);
            } else {
                this.f4806o00oOOoO[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f4805o00oOOo0.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4805o00oOOo0;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo00(o0O00O0o o0o00o0o, String... strArr) {
        this(o0o00o0o, new HashMap(), Collections.emptyMap(), strArr);
    }

    public static void o00oOo00(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    @oO0Oo
    public void o00oOOo0(@oo0oO0 AbstractC0046o00oOo00 abstractC0046o00oOo00) {
        o00oOo0O o00oOo0o2;
        String[] o00oOooo2 = o00oOooo(abstractC0046o00oOo00.f4826o00oOOo0);
        int[] iArr = new int[o00oOooo2.length];
        int length = o00oOooo2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f4805o00oOOo0.get(o00oOooo2[i].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("There is no table with name ");
                o00oOOo02.append(o00oOooo2[i]);
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
            iArr[i] = num.intValue();
        }
        o00oOo0O o00ooo0o2 = new o00oOo0O(abstractC0046o00oOo00, iArr, o00oOooo2);
        synchronized (this.f4813o00oOoOo) {
            o00oOo0o2 = this.f4813o00oOoOo.o00oOo0o(abstractC0046o00oOo00, o00ooo0o2);
        }
        if (o00oOo0o2 == null && this.f4810o00oOoO.o00oOOoO(iArr)) {
            o00oo0O();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOOoO(AbstractC0046o00oOo00 abstractC0046o00oOo00) {
        o00oOOo0(new o00oOoO(this, abstractC0046o00oOo00));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> o00oOo0O(String[] strArr, boolean z, Callable<T> callable) {
        return this.f4812o00oOoOO.o00oOOo0(o00oo0o0(strArr), z, callable);
    }

    public boolean o00oOo0o() {
        if (this.f4815o00oOooO.o00oo0oO()) {
            if (!this.f4809o00oOo0o) {
                this.f4815o00oOooO.o00oo00O().getWritableDatabase();
            }
            return this.f4809o00oOo0o;
        }
        return false;
    }

    @o0o0000(otherwise = 3)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOoO(String... strArr) {
        synchronized (this.f4813o00oOoOo) {
            Iterator<Map.Entry<AbstractC0046o00oOo00, o00oOo0O>> it = this.f4813o00oOoOo.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC0046o00oOo00, o00oOo0O> next = it.next();
                if (!next.getKey().o00oOOo0()) {
                    next.getValue().o00oOOoO(strArr);
                }
            }
        }
    }

    public void o00oOoO0(o00oo o00ooVar) {
        synchronized (this) {
            if (this.f4809o00oOo0o) {
                return;
            }
            o00ooVar.o00oo0O0("PRAGMA temp_store = MEMORY;");
            o00ooVar.o00oo0O0("PRAGMA recursive_triggers='ON';");
            o00ooVar.o00oo0O0(f4800o00oo0O);
            o00oo0Oo(o00ooVar);
            this.f4811o00oOoO0 = o00ooVar.o0O0oo0o(f4803o00oo0Oo);
            this.f4809o00oOo0o = true;
        }
    }

    public void o00oOoOO() {
        if (this.f4808o00oOo0O.compareAndSet(false, true)) {
            this.f4815o00oOooO.o00oo0().execute(this.f4816o00oOooo);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    @oO0Oo
    public void o00oOoOo() {
        o00oo0O();
        this.f4816o00oOooo.run();
    }

    @SuppressLint({"RestrictedApi"})
    @oO0Oo
    public void o00oOoo0(@oo0oO0 AbstractC0046o00oOo00 abstractC0046o00oOo00) {
        o00oOo0O o00oOoO02;
        synchronized (this.f4813o00oOoOo) {
            o00oOoO02 = this.f4813o00oOoOo.o00oOoO0(abstractC0046o00oOo00);
        }
        if (o00oOoO02 == null || !this.f4810o00oOoO.o00oOo00(o00oOoO02.f4827o00oOOo0)) {
            return;
        }
        o00oo0O();
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> o00oOooO(String[] strArr, Callable<T> callable) {
        return o00oOo0O(strArr, false, callable);
    }

    public final String[] o00oOooo(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4807o00oOo00.containsKey(lowerCase)) {
                hashSet.addAll(this.f4807o00oOo00.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final void o00oo0(o00oo o00ooVar, int i) {
        String[] strArr;
        o00ooVar.o00oo0O0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f4806o00oOOoO[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4799o00oo00O) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            o00oOo00(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append(f4798o00oo0);
            sb.append(" SET ");
            sb.append(f4801o00oo0O0);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append(f4802o00oo0OO);
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(f4801o00oo0O0);
            sb.append(" = 0");
            sb.append("; END");
            o00ooVar.o00oo0O0(sb.toString());
        }
    }

    public void o00oo00O(Context context, String str) {
        this.f4814o00oOoo0 = new androidx.room.o00oOo0O(context, str, this, this.f4815o00oOooO.o00oo0());
    }

    public void o00oo0O() {
        if (this.f4815o00oOooO.o00oo0oO()) {
            o00oo0Oo(this.f4815o00oOooO.o00oo00O().getWritableDatabase());
        }
    }

    public final void o00oo0O0(o00oo o00ooVar, int i) {
        String[] strArr;
        String str = this.f4806o00oOOoO[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4799o00oo00O) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            o00oOo00(sb, str, str2);
            o00ooVar.o00oo0O0(sb.toString());
        }
    }

    public void o00oo0OO() {
        androidx.room.o00oOo0O o00ooo0o2 = this.f4814o00oOoo0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOOo0();
            this.f4814o00oOoo0 = null;
        }
    }

    public void o00oo0Oo(o00oo o00ooVar) {
        if (o00ooVar.o0O0o0Oo()) {
            return;
        }
        while (true) {
            try {
                Lock o00oOoo02 = this.f4815o00oOooO.o00oOoo0();
                o00oOoo02.lock();
                int[] o00oOOo02 = this.f4810o00oOoO.o00oOOo0();
                if (o00oOOo02 == null) {
                    o00oOoo02.unlock();
                    return;
                }
                int length = o00oOOo02.length;
                o00ooVar.o00oOoOo();
                for (int i = 0; i < length; i++) {
                    int i2 = o00oOOo02[i];
                    if (i2 == 1) {
                        o00oo0(o00ooVar, i);
                    } else if (i2 == 2) {
                        o00oo0O0(o00ooVar, i);
                    }
                }
                o00ooVar.o00ooo0O();
                o00ooVar.o0();
                this.f4810o00oOoO.o00oOooO();
                o00oOoo02.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }

    public final String[] o00oo0o0(String[] strArr) {
        String[] o00oOooo2 = o00oOooo(strArr);
        for (String str : o00oOooo2) {
            if (!this.f4805o00oOOo0.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(o00oOoOo.o00oo.o00oOOo0("There is no table with name ", str));
            }
        }
        return o00oOooo2;
    }
}
