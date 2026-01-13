package o0O000O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.o00ooO0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oooOo.oOOO000;
import o0O000O.o00oo0OO;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final androidx.collection.o00oo0O<String, Typeface> f10289o00oOOo0 = new androidx.collection.o00oo0O<>(16);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ExecutorService f10290o00oOOoO = o00oo0O0.o00oOOo0("fonts-androidx", 10, 10000);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Object f10291o00oOo00 = new Object();
    @o0O0OOOo("LOCK")

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o00ooO0<String, ArrayList<o<o00oOoO>>> f10292o00oOooO = new o00ooO0<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Callable<o00oOoO> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ String f10293o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ Context f10294o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f10295o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f10296o00oOooO;

        public o00oOOo0(String str, Context context, o00oo00O o00oo00o, int i) {
            this.f10293o00oOOo0 = str;
            this.f10294o00oOOoO = context;
            this.f10295o00oOo00 = o00oo00o;
            this.f10296o00oOooO = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public o00oOoO call() {
            return o00oo0.o00oOo00(this.f10293o00oOOo0, this.f10294o00oOOoO, this.f10295o00oOo00, this.f10296o00oOooO);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o<o00oOoO> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O000O.o00oOOo0 f10297o00oo0O0;

        public o00oOOoO(o0O000O.o00oOOo0 o00oooo02) {
            this.f10297o00oo0O0 = o00oooo02;
        }

        @Override // o0ooOoOO.o
        /* renamed from: o00oOOo0 */
        public void accept(o00oOoO o00oooo2) {
            if (o00oooo2 == null) {
                o00oooo2 = new o00oOoO(-3);
            }
            this.f10297o00oo0O0.o00oOOoO(o00oooo2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Callable<o00oOoO> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ String f10298o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ Context f10299o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f10300o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f10301o00oOooO;

        public o00oOo00(String str, Context context, o00oo00O o00oo00o, int i) {
            this.f10298o00oOOo0 = str;
            this.f10299o00oOOoO = context;
            this.f10300o00oOo00 = o00oo00o;
            this.f10301o00oOooO = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: o00oOOo0 */
        public o00oOoO call() {
            try {
                return o00oo0.o00oOo00(this.f10298o00oOOo0, this.f10299o00oOOoO, this.f10300o00oOo00, this.f10301o00oOooO);
            } catch (Throwable unused) {
                return new o00oOoO(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o<o00oOoO> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ String f10302o00oo0O0;

        public o00oOo0O(String str) {
            this.f10302o00oo0O0 = str;
        }

        @Override // o0ooOoOO.o
        /* renamed from: o00oOOo0 */
        public void accept(o00oOoO o00oooo2) {
            synchronized (o00oo0.f10291o00oOo00) {
                o00ooO0<String, ArrayList<o<o00oOoO>>> o00ooo02 = o00oo0.f10292o00oOooO;
                ArrayList<o<o00oOoO>> arrayList = o00ooo02.get(this.f10302o00oo0O0);
                if (arrayList == null) {
                    return;
                }
                o00ooo02.remove(this.f10302o00oo0O0);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(o00oooo2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Typeface f10303o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f10304o00oOOoO;

        public o00oOoO(int i) {
            this.f10303o00oOOo0 = null;
            this.f10304o00oOOoO = i;
        }

        @SuppressLint({"WrongConstant"})
        public o00oOoO(@oo0oO0 Typeface typeface) {
            this.f10303o00oOOo0 = typeface;
            this.f10304o00oOOoO = 0;
        }

        @SuppressLint({"WrongConstant"})
        public boolean o00oOOo0() {
            return this.f10304o00oOOoO == 0;
        }
    }

    public static String o00oOOo0(@oo0oO0 o00oo00O o00oo00o, int i) {
        return o00oo00o.f10309o00oOo0o + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    public static int o00oOOoO(@oo0oO0 o00oo0OO.o00oOOoO o00ooooo2) {
        int i = 1;
        if (o00ooooo2.o00oOo00() != 0) {
            return o00ooooo2.o00oOo00() != 1 ? -3 : -2;
        }
        o00oo0OO.o00oOo00[] o00oOOoO2 = o00ooooo2.o00oOOoO();
        if (o00oOOoO2 != null && o00oOOoO2.length != 0) {
            i = 0;
            for (o00oo0OO.o00oOo00 o00ooo002 : o00oOOoO2) {
                int o00oOOoO3 = o00ooo002.o00oOOoO();
                if (o00oOOoO3 != 0) {
                    if (o00oOOoO3 < 0) {
                        return -3;
                    }
                    return o00oOOoO3;
                }
            }
        }
        return i;
    }

    @oo0oO0
    public static o00oOoO o00oOo00(@oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, int i) {
        androidx.collection.o00oo0O<String, Typeface> o00oo0o2 = f10289o00oOOo0;
        Typeface typeface = o00oo0o2.get(str);
        if (typeface != null) {
            return new o00oOoO(typeface);
        }
        try {
            o00oo0OO.o00oOOoO o00oOo0O2 = o0O000O.o00oOoO.o00oOo0O(context, o00oo00o, null);
            int o00oOOoO2 = o00oOOoO(o00oOo0O2);
            if (o00oOOoO2 != 0) {
                return new o00oOoO(o00oOOoO2);
            }
            Typeface o00oOooO2 = oOOO000.o00oOooO(context, null, o00oOo0O2.o00oOOoO(), i);
            if (o00oOooO2 != null) {
                o00oo0o2.put(str, o00oOooO2);
                return new o00oOoO(o00oOooO2);
            }
            return new o00oOoO(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new o00oOoO(-1);
        }
    }

    public static Typeface o00oOo0O(@oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, @oo0oO0 o0O000O.o00oOOo0 o00oooo02, int i, int i2) {
        String o00oOOo02 = o00oOOo0(o00oo00o, i);
        Typeface typeface = f10289o00oOOo0.get(o00oOOo02);
        if (typeface != null) {
            o00oooo02.o00oOOoO(new o00oOoO(typeface));
            return typeface;
        } else if (i2 == -1) {
            o00oOoO o00oOo002 = o00oOo00(o00oOOo02, context, o00oo00o, i);
            o00oooo02.o00oOOoO(o00oOo002);
            return o00oOo002.f10303o00oOOo0;
        } else {
            try {
                o00oOoO o00oooo2 = (o00oOoO) o00oo0O0.o00oOooO(f10290o00oOOoO, new o00oOOo0(o00oOOo02, context, o00oo00o, i), i2);
                o00oooo02.o00oOOoO(o00oooo2);
                return o00oooo2.f10303o00oOOo0;
            } catch (InterruptedException unused) {
                o00oooo02.o00oOOoO(new o00oOoO(-3));
                return null;
            }
        }
    }

    public static void o00oOo0o() {
        f10289o00oOOo0.evictAll();
    }

    public static Typeface o00oOooO(@oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, int i, @o0OO00OO Executor executor, @oo0oO0 o0O000O.o00oOOo0 o00oooo02) {
        String o00oOOo02 = o00oOOo0(o00oo00o, i);
        Typeface typeface = f10289o00oOOo0.get(o00oOOo02);
        if (typeface != null) {
            o00oooo02.o00oOOoO(new o00oOoO(typeface));
            return typeface;
        }
        o00oOOoO o00ooooo2 = new o00oOOoO(o00oooo02);
        synchronized (f10291o00oOo00) {
            o00ooO0<String, ArrayList<o<o00oOoO>>> o00ooo02 = f10292o00oOooO;
            ArrayList<o<o00oOoO>> arrayList = o00ooo02.get(o00oOOo02);
            if (arrayList != null) {
                arrayList.add(o00ooooo2);
                return null;
            }
            ArrayList<o<o00oOoO>> arrayList2 = new ArrayList<>();
            arrayList2.add(o00ooooo2);
            o00ooo02.put(o00oOOo02, arrayList2);
            o00oOo00 o00ooo002 = new o00oOo00(o00oOOo02, context, o00oo00o, i);
            if (executor == null) {
                executor = f10290o00oOOoO;
            }
            o00oo0O0.o00oOo00(executor, o00ooo002, new o00oOo0O(o00oOOo02));
            return null;
        }
    }
}
