package o0O0o0o0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0o0Oo.o0OoO00O;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000 implements Runnable {

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f12576o0O0o = o0O0Ooo0.o0O00000.o00oOo0o("WorkForegroundRunnable");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f12577o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0o0o.o00ooO<Void> f12578o00oo0O0 = o0O0o0o.o00ooO.o00oo0oO();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0OoO00O f12579o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O0Ooo0.o00oo f12580o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final ListenableWorker f12581o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final oO00O0oO f12582o00oo0oO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0o0o.o00ooO f12584o00oo0O0;

        public o00oOOo0(o0O0o0o.o00ooO o00ooo) {
            this.f12584o00oo0O0 = o00ooo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12584o00oo0O0.o00oo0Oo(o0O000.this.f12581o00oo0o0.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0o0o.o00ooO f12586o00oo0O0;

        public o00oOOoO(o0O0o0o.o00ooO o00ooo) {
            this.f12586o00oo0O0 = o00ooo;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0O0Ooo0.o0O0o o0o0o = (o0O0Ooo0.o0O0o) this.f12586o00oo0O0.get();
                if (o0o0o == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o0O000.this.f12579o00oo0Oo.f12464o00oOo00));
                }
                o0O0Ooo0.o0O00000.o00oOo00().o00oOOo0(o0O000.f12576o0O0o, String.format("Updating notification for %s", o0O000.this.f12579o00oo0Oo.f12464o00oOo00), new Throwable[0]);
                o0O000.this.f12581o00oo0o0.setRunInForeground(true);
                o0O000 o0o000 = o0O000.this;
                o0o000.f12578o00oo0O0.o00oo0Oo(o0o000.f12580o00oo0o.o00oOOo0(o0o000.f12577o00oo0O, o0o000.f12581o00oo0o0.getId(), o0o0o));
            } catch (Throwable th) {
                o0O000.this.f12578o00oo0O0.o00oo0O(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o0O000(@oo0oO0 Context context, @oo0oO0 o0OoO00O o0ooo00o, @oo0oO0 ListenableWorker listenableWorker, @oo0oO0 o0O0Ooo0.o00oo o00ooVar, @oo0oO0 oO00O0oO oo00o0oo) {
        this.f12577o00oo0O = context;
        this.f12579o00oo0Oo = o0ooo00o;
        this.f12581o00oo0o0 = listenableWorker;
        this.f12580o00oo0o = o00ooVar;
        this.f12582o00oo0oO = oo00o0oo;
    }

    @oo0oO0
    public ListenableFuture<Void> o00oOOo0() {
        return this.f12578o00oo0O0;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f12579o00oo0Oo.f12476o00oo0O || o0O000.o00oOOo0.o00oOoOO()) {
            this.f12578o00oo0O0.o00oo0O0(null);
            return;
        }
        o0O0o0o.o00ooO o00oo0oO2 = o0O0o0o.o00ooO.o00oo0oO();
        this.f12582o00oo0oO.o00oOOo0().execute(new o00oOOo0(o00oo0oO2));
        o00oo0oO2.addListener(new o00oOOoO(o00oo0oO2), this.f12582o00oo0oO.o00oOOo0());
    }
}
