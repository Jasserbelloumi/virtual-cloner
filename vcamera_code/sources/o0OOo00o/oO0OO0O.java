package o0OOo00o;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import o00oOooO.o0o0000;
import o0OO.o00oOo0O;
import o0OO.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OO0o.o00ooO0;
import o0OO0o.o0O0o;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOO0.o00oo0OO;
import o0OOO00o.o00oOo00;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O00;
import o0OOo00O.o0O000Oo;
import o0OOo00O.o0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lo0OOo00o/oO0O;", "o00oOoO0", "(Landroid/os/Handler;Ljava/lang/String;)Lo0OOo00o/oO0O;", "Landroid/os/Looper;", "", "async", "o00oOooO", "", "o00oOo0O", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo00O/o0O000Oo;", "cont", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "Landroid/view/Choreographer;", "choreographer", "o00oOoOo", "o00oOOo0", "J", "MAX_DELAY", o00oOOoO.f12961o00oOo00, "Lo0OOo00o/oO0O;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0OO0O {
    @Nullable
    private static volatile Choreographer choreographer = null;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f14149o00oOOo0 = 4611686018427387903L;
    @o00oOoO
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final oO0O f14150o00oOOoO;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "o0OOo00O/oO00o0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O000Oo f14151o00oo0O0;

        public o00oOOo0(o0O000Oo o0o000oo) {
            this.f14151o00oo0O0 = o0o000oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oO0OO0O.o00oOooo(this.f14151o00oo0O0);
        }
    }

    static {
        Object m7constructorimpl;
        try {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            m7constructorimpl = oo0oO0.m7constructorimpl(new ooo0o(o00oOooO(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            m7constructorimpl = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
        }
        f14150o00oOOoO = oo0oO0.m13isFailureimpl(m7constructorimpl) ? null : m7constructorimpl;
    }

    @Nullable
    public static final Object o00oOo0O(@NotNull o00oOo0O<? super Long> o00ooo0o2) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            o0O00 o0o00 = new o0O00(o00oOo00.o00oOooO(o00ooo0o2), 1);
            o0o00.o00ooo00();
            o00oOoOo(choreographer2, o0o00);
            Object o00ooO002 = o0o00.o00ooO00();
            if (o00ooO002 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
                o00oo0OO.o00oOo00(o00ooo0o2);
            }
            return o00ooO002;
        }
        o0O00 o0o002 = new o0O00(o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o002.o00ooo00();
        o0OOO00.o00oOo0O().oo0oOOo(o00oo0O0.INSTANCE, new o00oOOo0(o0o002));
        Object o00ooO003 = o0o002.o00ooO00();
        if (o00ooO003 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
            o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO003;
    }

    @o0OOOO0o.o00oo0O0
    @o0OOOO0o.o00oo0OO(name = "from")
    @NotNull
    public static final oO0O o00oOo0o(@NotNull Handler handler) {
        return o00oOoO(handler, null, 1, null);
    }

    public static /* synthetic */ oO0O o00oOoO(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return o00oOoO0(handler, str);
    }

    @o0OOOO0o.o00oo0O0
    @o0OOOO0o.o00oo0OO(name = "from")
    @NotNull
    public static final oO0O o00oOoO0(@NotNull Handler handler, @Nullable String str) {
        return new ooo0o(handler, str, false);
    }

    @o0O0o(level = o00ooO0.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void o00oOoOO() {
    }

    public static final void o00oOoOo(Choreographer choreographer2, final o0O000Oo<? super Long> o0o000oo) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: o0OOo00o.oO0OO00
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                oO0OO0O.o00oOoo0(o0O000Oo.this, j);
            }
        });
    }

    public static final void o00oOoo0(o0O000Oo o0o000oo, long j) {
        o0o000oo.o00oo0O0(o0OOO00.o00oOo0O(), Long.valueOf(j));
    }

    @o0o0000
    @NotNull
    public static final Handler o00oOooO(@NotNull Looper looper, boolean z) {
        if (z) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        return new Handler(looper);
    }

    public static final void o00oOooo(o0O000Oo<? super Long> o0o000oo) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            o0ooO.o00oo00O(choreographer2);
            choreographer = choreographer2;
        }
        o00oOoOo(choreographer2, o0o000oo);
    }
}
