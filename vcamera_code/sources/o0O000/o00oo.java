package o0O000;

import android.os.Handler;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lo0OO0o/oO0Ooooo;", "action", "Ljava/lang/Runnable;", "o00oOo00", "uptimeMillis", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oo {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<oO0Ooooo> f10102o00oo0O0;

        public o00oOOo0(o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
            this.f10102o00oo0O0 = o00oooo02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10102o00oo0O0.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<oO0Ooooo> f10103o00oo0O0;

        public o00oOOoO(o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
            this.f10103o00oo0O0 = o00oooo02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10103o00oo0O0.invoke();
        }
    }

    @NotNull
    public static final Runnable o00oOOo0(@NotNull Handler handler, long j, @Nullable Object obj, @NotNull o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        o0ooO.o00oo0O0(handler, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        o00oOOo0 o00oooo03 = new o00oOOo0(o00oooo02);
        handler.postAtTime(o00oooo03, obj, j);
        return o00oooo03;
    }

    public static /* synthetic */ Runnable o00oOOoO(Handler handler, long j, Object obj, o0OOOO.o00oOOo0 o00oooo02, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        o0ooO.o00oo0O0(handler, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        o00oOOo0 o00oooo03 = new o00oOOo0(o00oooo02);
        handler.postAtTime(o00oooo03, obj, j);
        return o00oooo03;
    }

    @NotNull
    public static final Runnable o00oOo00(@NotNull Handler handler, long j, @Nullable Object obj, @NotNull o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        o0ooO.o00oo0O0(handler, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        o00oOOoO o00ooooo2 = new o00oOOoO(o00oooo02);
        if (obj == null) {
            handler.postDelayed(o00ooooo2, j);
        } else {
            handler.postDelayed(o00ooooo2, obj, j);
        }
        return o00ooooo2;
    }

    public static Runnable o00oOooO(Handler handler, long j, Object obj, o0OOOO.o00oOOo0 o00oooo02, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        o0ooO.o00oo0O0(handler, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "action");
        o00oOOoO o00ooooo2 = new o00oOOoO(o00oooo02);
        if (obj == null) {
            handler.postDelayed(o00ooooo2, j);
        } else {
            handler.postDelayed(o00ooooo2, obj, j);
        }
        return o00ooooo2;
    }
}
