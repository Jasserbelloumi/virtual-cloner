package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oOo00;
import androidx.recyclerview.widget.o00oo;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo0O<T> {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final Executor f4307o00oOoO = new o00oOo00();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00 f4308o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final androidx.recyclerview.widget.o00oOo00<T> f4309o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Executor f4310o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public List<T> f4311o00oOo0O;
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public List<T> f4312o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f4313o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<o00oOOoO<T>> f4314o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ List f4315o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ List f4316o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f4317o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ Runnable f4319o00oo0o0;

        /* renamed from: androidx.recyclerview.widget.o00oOo0O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0038o00oOOo0 extends o00oo.o00oOOoO {
            public C0038o00oOOo0() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
            public boolean o00oOOo0(int i, int i2) {
                Object obj = o00oOOo0.this.f4316o00oo0O0.get(i);
                Object obj2 = o00oOOo0.this.f4315o00oo0O.get(i2);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return o00oOo0O.this.f4309o00oOOoO.f4301o00oOo00.o00oOOo0(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
            public boolean o00oOOoO(int i, int i2) {
                Object obj = o00oOOo0.this.f4316o00oo0O0.get(i);
                Object obj2 = o00oOOo0.this.f4315o00oo0O.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : o00oOo0O.this.f4309o00oOOoO.f4301o00oOo00.o00oOOoO(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
            @o0OO00OO
            public Object o00oOo00(int i, int i2) {
                Object obj = o00oOOo0.this.f4316o00oo0O0.get(i);
                Object obj2 = o00oOOo0.this.f4315o00oo0O.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return o00oOo0O.this.f4309o00oOOoO.f4301o00oOo00.o00oOo00(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
            public int o00oOo0O() {
                return o00oOOo0.this.f4316o00oo0O0.size();
            }

            @Override // androidx.recyclerview.widget.o00oo.o00oOOoO
            public int o00oOooO() {
                return o00oOOo0.this.f4315o00oo0O.size();
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00oo.o00oOoO f4322o00oo0O0;

            public o00oOOoO(o00oo.o00oOoO o00oooo2) {
                this.f4322o00oo0O0 = o00oooo2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOo0 o00oooo02 = o00oOOo0.this;
                o00oOo0O o00ooo0o2 = o00oOo0O.this;
                if (o00ooo0o2.f4313o00oOoO0 == o00oooo02.f4317o00oo0Oo) {
                    o00ooo0o2.o00oOo00(o00oooo02.f4315o00oo0O, this.f4322o00oo0O0, o00oooo02.f4319o00oo0o0);
                }
            }
        }

        public o00oOOo0(List list, List list2, int i, Runnable runnable) {
            this.f4316o00oo0O0 = list;
            this.f4315o00oo0O = list2;
            this.f4317o00oo0Oo = i;
            this.f4319o00oo0o0 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O.this.f4310o00oOo00.execute(new o00oOOoO(o00oo.o00oOOoO(new C0038o00oOOo0())));
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO<T> {
        void o00oOOo0(@oo0oO0 List<T> list, @oo0oO0 List<T> list2);
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements Executor {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Handler f4323o00oo0O0 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            this.f4323o00oo0O0.post(runnable);
        }
    }

    public o00oOo0O(@oo0oO0 RecyclerView.o00oo0OO o00oo0oo, @oo0oO0 o00oo.o00oo00O<T> o00oo00o) {
        this(new androidx.recyclerview.widget.o00oOOoO(o00oo0oo), new o00oOo00.o00oOOo0(o00oo00o).o00oOOo0());
    }

    public o00oOo0O(@oo0oO0 o0O00 o0o00, @oo0oO0 androidx.recyclerview.widget.o00oOo00<T> o00ooo002) {
        this.f4314o00oOooO = new CopyOnWriteArrayList();
        this.f4312o00oOo0o = Collections.emptyList();
        this.f4308o00oOOo0 = o0o00;
        this.f4309o00oOOoO = o00ooo002;
        Executor executor = o00ooo002.f4299o00oOOo0;
        this.f4310o00oOo00 = executor == null ? f4307o00oOoO : executor;
    }

    public void o00oOOo0(@oo0oO0 o00oOOoO<T> o00ooooo2) {
        this.f4314o00oOooO.add(o00ooooo2);
    }

    @oo0oO0
    public List<T> o00oOOoO() {
        return this.f4312o00oOo0o;
    }

    public void o00oOo00(@oo0oO0 List<T> list, @oo0oO0 o00oo.o00oOoO o00oooo2, @o0OO00OO Runnable runnable) {
        List<T> list2 = this.f4312o00oOo0o;
        this.f4311o00oOo0O = list;
        this.f4312o00oOo0o = Collections.unmodifiableList(list);
        o00oooo2.o00oOooO(this.f4308o00oOOo0);
        o00oOooO(list2, runnable);
    }

    public void o00oOo0O(@oo0oO0 o00oOOoO<T> o00ooooo2) {
        this.f4314o00oOooO.remove(o00ooooo2);
    }

    public void o00oOo0o(@o0OO00OO List<T> list) {
        o00oOoO0(list, null);
    }

    public void o00oOoO0(@o0OO00OO List<T> list, @o0OO00OO Runnable runnable) {
        int i = this.f4313o00oOoO0 + 1;
        this.f4313o00oOoO0 = i;
        List<T> list2 = this.f4311o00oOo0O;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f4312o00oOo0o;
        if (list == null) {
            int size = list2.size();
            this.f4311o00oOo0O = null;
            this.f4312o00oOo0o = Collections.emptyList();
            this.f4308o00oOOo0.o00oOOoO(0, size);
            o00oOooO(list3, runnable);
        } else if (list2 != null) {
            this.f4309o00oOOoO.f4300o00oOOoO.execute(new o00oOOo0(list2, list, i, runnable));
        } else {
            this.f4311o00oOo0O = list;
            this.f4312o00oOo0o = Collections.unmodifiableList(list);
            this.f4308o00oOOo0.o00oOOo0(0, list.size());
            o00oOooO(list3, runnable);
        }
    }

    public final void o00oOooO(@oo0oO0 List<T> list, @o0OO00OO Runnable runnable) {
        for (o00oOOoO<T> o00ooooo2 : this.f4314o00oOooO) {
            o00ooooo2.o00oOOo0(list, this.f4312o00oOo0o);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
