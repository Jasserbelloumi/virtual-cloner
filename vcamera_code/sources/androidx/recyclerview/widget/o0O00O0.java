package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.o0O0O0o0;
import androidx.recyclerview.widget.o0ooO;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class o0O00O0<T> implements o0O0O0o0<T> {

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0O0O0o0.o00oOOoO<T> {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f4595o00oOo0o = 1;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4596o00oOoO = 3;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4597o00oOoO0 = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo00 f4598o00oOOo0 = new o00oOo00();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Handler f4599o00oOOoO = new Handler(Looper.getMainLooper());

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Runnable f4600o00oOo00 = new RunnableC0040o00oOOo0();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0O0O0o0.o00oOOoO f4602o00oOooO;

        /* renamed from: androidx.recyclerview.widget.o0O00O0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0040o00oOOo0 implements Runnable {
            public RunnableC0040o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    o00oOo0O o00oOOo02 = o00oOOo0.this.f4598o00oOOo0.o00oOOo0();
                    if (o00oOOo02 == null) {
                        return;
                    }
                    int i = o00oOOo02.f4619o00oOOoO;
                    if (i == 1) {
                        o00oOOo0.this.f4602o00oOooO.o00oOo00(o00oOOo02.f4620o00oOo00, o00oOOo02.f4625o00oOooO);
                    } else if (i == 2) {
                        o00oOOo0.this.f4602o00oOooO.o00oOOoO(o00oOOo02.f4620o00oOo00, (o0ooO.o00oOOo0) o00oOOo02.f4623o00oOoO);
                    } else if (i == 3) {
                        o00oOOo0.this.f4602o00oOooO.o00oOOo0(o00oOOo02.f4620o00oOo00, o00oOOo02.f4625o00oOooO);
                    }
                }
            }
        }

        public o00oOOo0(o0O0O0o0.o00oOOoO o00ooooo2) {
            this.f4602o00oOooO = o00ooooo2;
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOOo0(int i, int i2) {
            o00oOooO(o00oOo0O.o00oOOo0(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOOoO(int i, o0ooO.o00oOOo0<T> o00oooo02) {
            o00oOooO(o00oOo0O.o00oOo00(2, i, o00oooo02));
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOoO
        public void o00oOo00(int i, int i2) {
            o00oOooO(o00oOo0O.o00oOOo0(1, i, i2));
        }

        public final void o00oOooO(o00oOo0O o00ooo0o2) {
            this.f4598o00oOOo0.o00oOo00(o00ooo0o2);
            this.f4599o00oOOoO.post(this.f4600o00oOo00);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o0O0O0o0.o00oOOo0<T> {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4604o00oOoO = 2;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4605o00oOoO0 = 1;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4606o00oOoOO = 3;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4607o00oOoOo = 4;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0O0o0.o00oOOo0 f4611o00oOo0O;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOo00 f4608o00oOOo0 = new o00oOo00();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f4609o00oOOoO = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public AtomicBoolean f4610o00oOo00 = new AtomicBoolean(false);

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Runnable f4613o00oOooO = new o00oOOo0();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    o00oOo0O o00oOOo02 = o00oOOoO.this.f4608o00oOOo0.o00oOOo0();
                    if (o00oOOo02 == null) {
                        o00oOOoO.this.f4610o00oOo00.set(false);
                        return;
                    }
                    int i = o00oOOo02.f4619o00oOOoO;
                    if (i == 1) {
                        o00oOOoO.this.f4608o00oOOo0.o00oOOoO(1);
                        o00oOOoO.this.f4611o00oOo0O.o00oOo00(o00oOOo02.f4620o00oOo00);
                    } else if (i == 2) {
                        o00oOOoO.this.f4608o00oOOo0.o00oOOoO(2);
                        o00oOOoO.this.f4608o00oOOo0.o00oOOoO(3);
                        o00oOOoO.this.f4611o00oOo0O.o00oOOo0(o00oOOo02.f4620o00oOo00, o00oOOo02.f4625o00oOooO, o00oOOo02.f4621o00oOo0O, o00oOOo02.f4622o00oOo0o, o00oOOo02.f4624o00oOoO0);
                    } else if (i == 3) {
                        o00oOOoO.this.f4611o00oOo0O.o00oOOoO(o00oOOo02.f4620o00oOo00, o00oOOo02.f4625o00oOooO);
                    } else if (i == 4) {
                        o00oOOoO.this.f4611o00oOo0O.o00oOooO((o0ooO.o00oOOo0) o00oOOo02.f4623o00oOoO);
                    }
                }
            }
        }

        public o00oOOoO(o0O0O0o0.o00oOOo0 o00oooo02) {
            this.f4611o00oOo0O = o00oooo02;
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOOo0(int i, int i2, int i3, int i4, int i5) {
            o00oOoO0(o00oOo0O.o00oOOoO(2, i, i2, i3, i4, i5, null));
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOOoO(int i, int i2) {
            o00oOo0o(o00oOo0O.o00oOOo0(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOo00(int i) {
            o00oOoO0(o00oOo0O.o00oOo00(1, i, null));
        }

        public final void o00oOo0O() {
            if (this.f4610o00oOo00.compareAndSet(false, true)) {
                this.f4609o00oOOoO.execute(this.f4613o00oOooO);
            }
        }

        public final void o00oOo0o(o00oOo0O o00ooo0o2) {
            this.f4608o00oOOo0.o00oOo00(o00ooo0o2);
            o00oOo0O();
        }

        public final void o00oOoO0(o00oOo0O o00ooo0o2) {
            this.f4608o00oOOo0.o00oOooO(o00ooo0o2);
            o00oOo0O();
        }

        @Override // androidx.recyclerview.widget.o0O0O0o0.o00oOOo0
        public void o00oOooO(o0ooO.o00oOOo0<T> o00oooo02) {
            o00oOo0o(o00oOo0O.o00oOo00(4, 0, o00oooo02));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo0O f4615o00oOOo0;

        public synchronized o00oOo0O o00oOOo0() {
            o00oOo0O o00ooo0o2 = this.f4615o00oOOo0;
            if (o00ooo0o2 == null) {
                return null;
            }
            this.f4615o00oOOo0 = o00ooo0o2.f4618o00oOOo0;
            return o00ooo0o2;
        }

        public synchronized void o00oOOoO(int i) {
            o00oOo0O o00ooo0o2;
            while (true) {
                o00ooo0o2 = this.f4615o00oOOo0;
                if (o00ooo0o2 == null || o00ooo0o2.f4619o00oOOoO != i) {
                    break;
                }
                this.f4615o00oOOo0 = o00ooo0o2.f4618o00oOOo0;
                o00ooo0o2.o00oOooO();
            }
            if (o00ooo0o2 != null) {
                o00oOo0O o00ooo0o3 = o00ooo0o2.f4618o00oOOo0;
                while (o00ooo0o3 != null) {
                    o00oOo0O o00ooo0o4 = o00ooo0o3.f4618o00oOOo0;
                    if (o00ooo0o3.f4619o00oOOoO == i) {
                        o00ooo0o2.f4618o00oOOo0 = o00ooo0o4;
                        o00ooo0o3.o00oOooO();
                    } else {
                        o00ooo0o2 = o00ooo0o3;
                    }
                    o00ooo0o3 = o00ooo0o4;
                }
            }
        }

        public synchronized void o00oOo00(o00oOo0O o00ooo0o2) {
            o00oOo0O o00ooo0o3 = this.f4615o00oOOo0;
            if (o00ooo0o3 == null) {
                this.f4615o00oOOo0 = o00ooo0o2;
                return;
            }
            while (true) {
                o00oOo0O o00ooo0o4 = o00ooo0o3.f4618o00oOOo0;
                if (o00ooo0o4 == null) {
                    o00ooo0o3.f4618o00oOOo0 = o00ooo0o2;
                    return;
                }
                o00ooo0o3 = o00ooo0o4;
            }
        }

        public synchronized void o00oOooO(o00oOo0O o00ooo0o2) {
            o00ooo0o2.f4618o00oOOo0 = this.f4615o00oOOo0;
            this.f4615o00oOOo0 = o00ooo0o2;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static o00oOo0O f4616o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final Object f4617o00oOoOo = new Object();

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo0O f4618o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4619o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4620o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4621o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4622o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public Object f4623o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f4624o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4625o00oOooO;

        public static o00oOo0O o00oOOo0(int i, int i2, int i3) {
            return o00oOOoO(i, i2, i3, 0, 0, 0, null);
        }

        public static o00oOo0O o00oOOoO(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            o00oOo0O o00ooo0o2;
            synchronized (f4617o00oOoOo) {
                o00ooo0o2 = f4616o00oOoOO;
                if (o00ooo0o2 == null) {
                    o00ooo0o2 = new o00oOo0O();
                } else {
                    f4616o00oOoOO = o00ooo0o2.f4618o00oOOo0;
                    o00ooo0o2.f4618o00oOOo0 = null;
                }
                o00ooo0o2.f4619o00oOOoO = i;
                o00ooo0o2.f4620o00oOo00 = i2;
                o00ooo0o2.f4625o00oOooO = i3;
                o00ooo0o2.f4621o00oOo0O = i4;
                o00ooo0o2.f4622o00oOo0o = i5;
                o00ooo0o2.f4624o00oOoO0 = i6;
                o00ooo0o2.f4623o00oOoO = obj;
            }
            return o00ooo0o2;
        }

        public static o00oOo0O o00oOo00(int i, int i2, Object obj) {
            return o00oOOoO(i, i2, 0, 0, 0, 0, obj);
        }

        public void o00oOooO() {
            this.f4618o00oOOo0 = null;
            this.f4624o00oOoO0 = 0;
            this.f4622o00oOo0o = 0;
            this.f4621o00oOo0O = 0;
            this.f4625o00oOooO = 0;
            this.f4620o00oOo00 = 0;
            this.f4619o00oOOoO = 0;
            this.f4623o00oOoO = null;
            synchronized (f4617o00oOoOo) {
                o00oOo0O o00ooo0o2 = f4616o00oOoOO;
                if (o00ooo0o2 != null) {
                    this.f4618o00oOOo0 = o00ooo0o2;
                }
                f4616o00oOoOO = this;
            }
        }
    }

    @Override // androidx.recyclerview.widget.o0O0O0o0
    public o0O0O0o0.o00oOOo0<T> o00oOOo0(o0O0O0o0.o00oOOo0<T> o00oooo02) {
        return new o00oOOoO(o00oooo02);
    }

    @Override // androidx.recyclerview.widget.o0O0O0o0
    public o0O0O0o0.o00oOOoO<T> o00oOOoO(o0O0O0o0.o00oOOoO<T> o00ooooo2) {
        return new o00oOOo0(o00ooooo2);
    }
}
