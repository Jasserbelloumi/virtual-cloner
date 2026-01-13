package o0oO0O0o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000.o0O000;
import o0ooOoOO.oO00Oo00;
/* loaded from: classes.dex */
public abstract class o0oO0O0o<D> extends o0O0O0Oo<D> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final boolean f16937o00oo0O = false;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f16938o00oo0O0 = "AsyncTaskLoader";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final Executor f16939o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public volatile o0oO0O0o<D>.o00oOOo0 f16940o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public volatile o0oO0O0o<D>.o00oOOo0 f16941o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public long f16942o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public long f16943o00oo00O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public Handler f16944o00oo0OO;

    /* loaded from: classes.dex */
    public final class o00oOOo0 extends o0O0O0o0<Void, Void, D> implements Runnable {

        /* renamed from: o00ooOo  reason: collision with root package name */
        public boolean f16945o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public final CountDownLatch f16946o00ooOo0 = new CountDownLatch(1);

        public o00oOOo0() {
        }

        @Override // o0oO0O0o.o0O0O0o0
        public void o00oo0(D d) {
            try {
                o0oO0O0o.this.o00ooOo0(this, d);
            } finally {
                this.f16946o00ooOo0.countDown();
            }
        }

        @Override // o0oO0O0o.o0O0O0o0
        public void o00oo00O(D d) {
            try {
                o0oO0O0o.this.o00ooOOo(this, d);
            } finally {
                this.f16946o00ooOo0.countDown();
            }
        }

        @Override // o0oO0O0o.o0O0O0o0
        /* renamed from: o00oo0oO */
        public D o00oOOoO(Void... voidArr) {
            try {
                return (D) o0oO0O0o.this.o00ooo0();
            } catch (o0O000 e) {
                if (o00oOoo0()) {
                    return null;
                }
                throw e;
            }
        }

        public void o0O0o() {
            try {
                this.f16946o00ooOo0.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16945o00ooOo = false;
            o0oO0O0o.this.o00ooOo();
        }
    }

    public o0oO0O0o(@oo0oO0 Context context) {
        this(context, o0O0O0o0.f16912o00ooO0o);
    }

    public o0oO0O0o(@oo0oO0 Context context, @oo0oO0 Executor executor) {
        super(context);
        this.f16942o00oo0 = -10000L;
        this.f16939o00oOoOo = executor;
    }

    @Override // o0oO0O0o.o0O0O0Oo
    @Deprecated
    public void o00oOoO0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.o00oOoO0(str, fileDescriptor, printWriter, strArr);
        if (this.f16940o00oOoo0 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f16940o00oOoo0);
            printWriter.print(" waiting=");
            printWriter.println(this.f16940o00oOoo0.f16945o00ooOo);
        }
        if (this.f16941o00oOooo != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f16941o00oOooo);
            printWriter.print(" waiting=");
            printWriter.println(this.f16941o00oOooo.f16945o00ooOo);
        }
        if (this.f16943o00oo00O != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            oO00Oo00.o00oOo00(this.f16943o00oo00O, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            oO00Oo00.o00oOOoO(this.f16942o00oo0, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // o0oO0O0o.o0O0O0Oo
    public void o00oo0O() {
        o00oOOoO();
        this.f16940o00oOoo0 = new o00oOOo0();
        o00ooOo();
    }

    @Override // o0oO0O0o.o0O0O0Oo
    public boolean o00oo0OO() {
        if (this.f16940o00oOoo0 != null) {
            if (!this.f16899o00oOo0O) {
                this.f16901o00oOoO = true;
            }
            if (this.f16941o00oOooo != null) {
                if (this.f16940o00oOoo0.f16945o00ooOo) {
                    this.f16940o00oOoo0.f16945o00ooOo = false;
                    this.f16944o00oo0OO.removeCallbacks(this.f16940o00oOoo0);
                }
                this.f16940o00oOoo0 = null;
                return false;
            } else if (this.f16940o00oOoo0.f16945o00ooOo) {
                this.f16940o00oOoo0.f16945o00ooOo = false;
                this.f16944o00oo0OO.removeCallbacks(this.f16940o00oOoo0);
                this.f16940o00oOoo0 = null;
                return false;
            } else {
                boolean o00oOOo02 = this.f16940o00oOoo0.o00oOOo0(false);
                if (o00oOOo02) {
                    this.f16941o00oOooo = this.f16940o00oOoo0;
                    o00ooOO();
                }
                this.f16940o00oOoo0 = null;
                return o00oOOo02;
            }
        }
        return false;
    }

    public void o00ooOO() {
    }

    public void o00ooOOo(o0oO0O0o<D>.o00oOOo0 o00oooo02, D d) {
        o00ooo00(d);
        if (this.f16941o00oOooo == o00oooo02) {
            o00ooO00();
            this.f16942o00oo0 = SystemClock.uptimeMillis();
            this.f16941o00oOooo = null;
            o00oOo0O();
            o00ooOo();
        }
    }

    public void o00ooOo() {
        if (this.f16941o00oOooo != null || this.f16940o00oOoo0 == null) {
            return;
        }
        if (this.f16940o00oOoo0.f16945o00ooOo) {
            this.f16940o00oOoo0.f16945o00ooOo = false;
            this.f16944o00oo0OO.removeCallbacks(this.f16940o00oOoo0);
        }
        if (this.f16943o00oo00O <= 0 || SystemClock.uptimeMillis() >= this.f16942o00oo0 + this.f16943o00oo00O) {
            this.f16940o00oOoo0.o00oOo0O(this.f16939o00oOoOo, null);
            return;
        }
        this.f16940o00oOoo0.f16945o00ooOo = true;
        this.f16944o00oo0OO.postAtTime(this.f16940o00oOoo0, this.f16942o00oo0 + this.f16943o00oo00O);
    }

    public void o00ooOo0(o0oO0O0o<D>.o00oOOo0 o00oooo02, D d) {
        if (this.f16940o00oOoo0 != o00oooo02) {
            o00ooOOo(o00oooo02, d);
        } else if (o00oOoo0()) {
            o00ooo00(d);
        } else {
            o00oOo00();
            this.f16942o00oo0 = SystemClock.uptimeMillis();
            this.f16940o00oOoo0 = null;
            o00oOo0o(d);
        }
    }

    public boolean o00ooOoO() {
        return this.f16941o00oOooo != null;
    }

    @o0OO00OO
    public abstract D o00ooOoo();

    @o0OO00OO
    public D o00ooo0() {
        return o00ooOoo();
    }

    public void o00ooo00(@o0OO00OO D d) {
    }

    public void o00ooo0O(long j) {
        this.f16943o00oo00O = j;
        if (j != 0) {
            this.f16944o00oo0OO = new Handler();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00ooo0o() {
        o0oO0O0o<D>.o00oOOo0 o00oooo02 = this.f16940o00oOoo0;
        if (o00oooo02 != null) {
            o00oooo02.o0O0o();
        }
    }
}
