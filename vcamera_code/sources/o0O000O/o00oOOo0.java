package o0O000O;

import android.graphics.Typeface;
import android.os.Handler;
import o00oOooO.oo0oO0;
import o0O000O.o00oo0;
import o0O000O.o00oo0OO;
/* loaded from: classes.dex */
public class o00oOOo0 {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0OO.o00oOo0O f10278o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Handler f10279o00oOOoO;

    /* renamed from: o0O000O.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0125o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Typeface f10280o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO.o00oOo0O f10281o00oo0O0;

        public RunnableC0125o00oOOo0(o00oo0OO.o00oOo0O o00ooo0o2, Typeface typeface) {
            this.f10281o00oo0O0 = o00ooo0o2;
            this.f10280o00oo0O = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10281o00oo0O0.o00oOOoO(this.f10280o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f10283o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO.o00oOo0O f10284o00oo0O0;

        public o00oOOoO(o00oo0OO.o00oOo0O o00ooo0o2, int i) {
            this.f10284o00oo0O0 = o00ooo0o2;
            this.f10283o00oo0O = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10284o00oo0O0.o00oOOo0(this.f10283o00oo0O);
        }
    }

    public o00oOOo0(@oo0oO0 o00oo0OO.o00oOo0O o00ooo0o2) {
        this.f10278o00oOOo0 = o00ooo0o2;
        this.f10279o00oOOoO = o0O000O.o00oOOoO.o00oOOo0();
    }

    public o00oOOo0(@oo0oO0 o00oo0OO.o00oOo0O o00ooo0o2, @oo0oO0 Handler handler) {
        this.f10278o00oOOo0 = o00ooo0o2;
        this.f10279o00oOOoO = handler;
    }

    public final void o00oOOo0(int i) {
        this.f10279o00oOOoO.post(new o00oOOoO(this.f10278o00oOOo0, i));
    }

    public void o00oOOoO(@oo0oO0 o00oo0.o00oOoO o00oooo2) {
        if (o00oooo2.o00oOOo0()) {
            o00oOo00(o00oooo2.f10303o00oOOo0);
        } else {
            o00oOOo0(o00oooo2.f10304o00oOOoO);
        }
    }

    public final void o00oOo00(@oo0oO0 Typeface typeface) {
        this.f10279o00oOOoO.post(new RunnableC0125o00oOOo0(this.f10278o00oOOo0, typeface));
    }
}
