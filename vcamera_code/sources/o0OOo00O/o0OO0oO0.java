package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.oo0oO0;
import o0OOo0oO.ooOOO00O;
import o0OOo0oO.ooo0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lo0OOo00O/o0OO0oO0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0oO/ooOOO00O;", "Lkotlinx/coroutines/SchedulerTask;", "", "o00oOoo0", "()Ljava/lang/Object;", "takenState", "", "cause", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "o00oOo0o", "(Ljava/lang/Object;)Ljava/lang/Object;", "o00oOo0O", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "o00oOoO", "", "o00oo0Oo", "I", "resumeMode", "Lo0OO/o00oOo0O;", "o00oOooO", "()Lo0OO/o00oOo0O;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0OO0oO0<T> extends ooOOO00O {
    @o0OOOO0o.o00oOoO

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f14039o00oo0Oo;

    public o0OO0oO0(int i) {
        this.f14039o00oo0Oo = i;
    }

    public void o00oOo00(@Nullable Object obj, @NotNull Throwable th) {
    }

    @Nullable
    public Throwable o00oOo0O(@Nullable Object obj) {
        o0O0O0Oo o0o0o0oo = obj instanceof o0O0O0Oo ? (o0O0O0Oo) obj : null;
        if (o0o0o0oo != null) {
            return o0o0o0oo.f14007o00oOOo0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T o00oOo0o(@Nullable Object obj) {
        return obj;
    }

    public final void o00oOoO(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            o0OO0o.o0O00000.o00oOOo0(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        o0OOOOO0.o0ooO.o00oo00O(th);
        o0O0o0.o00oOOoO(o00oOooO().getContext(), new o0OO000o("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object o00oOoo0();

    @NotNull
    public abstract o00oOo0O<T> o00oOooO();

    @Override // java.lang.Runnable
    public final void run() {
        Object m7constructorimpl;
        Object m7constructorimpl2;
        Object m7constructorimpl3;
        ooo0o ooo0oVar = this.f14757o00oo0O;
        try {
            o0OOo0o0.o0OoOoO o0ooooo = (o0OOo0o0.o0OoOoO) o00oOooO();
            o00oOo0O<T> o00ooo0o2 = o0ooooo.f14637o00oo0o;
            Object obj = o0ooooo.f14640o0O0o;
            o0OO.o00oo0 context = o00ooo0o2.getContext();
            Object o00oOo002 = o0OOo0o0.ooOOOOoo.o00oOo00(context, obj);
            oO0O0O0o<?> o00oOoO02 = o00oOo002 != o0OOo0o0.ooOOOOoo.f14672o00oOOo0 ? oo0OOoo.o00oOoO0(o00ooo0o2, context, o00oOo002) : null;
            o0OO.o00oo0 context2 = o00ooo0o2.getContext();
            Object o00oOoo02 = o00oOoo0();
            Throwable o00oOo0O2 = o00oOo0O(o00oOoo02);
            ooOOOOoo oooooooo = (o00oOo0O2 == null && o0OO0oO.o00oOo00(this.f14039o00oo0Oo)) ? (ooOOOOoo) context2.get(ooOOOOoo.f14136o00oOoO) : null;
            if (oooooooo != null && !oooooooo.isActive()) {
                CancellationException o00ooOoO2 = oooooooo.o00ooOoO();
                o00oOo00(o00oOoo02, o00ooOoO2);
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                m7constructorimpl2 = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(o00ooOoO2));
            } else if (o00oOo0O2 != null) {
                oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
                m7constructorimpl2 = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(o00oOo0O2));
            } else {
                oo0oO0.o00oOOo0 o00oooo04 = o0OO0o.oo0oO0.Companion;
                m7constructorimpl2 = o0OO0o.oo0oO0.m7constructorimpl(o00oOo0o(o00oOoo02));
            }
            o00ooo0o2.resumeWith(m7constructorimpl2);
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
            if (o00oOoO02 == null || o00oOoO02.o0O0oOoO()) {
                o0OOo0o0.ooOOOOoo.o00oOOo0(context, o00oOo002);
            }
            try {
                oo0oO0.o00oOOo0 o00oooo05 = o0OO0o.oo0oO0.Companion;
                ooo0oVar.o0ooO();
                m7constructorimpl3 = o0OO0o.oo0oO0.m7constructorimpl(oo0ooooo);
            } catch (Throwable th) {
                oo0oO0.o00oOOo0 o00oooo06 = o0OO0o.oo0oO0.Companion;
                m7constructorimpl3 = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th));
            }
            o00oOoO(null, o0OO0o.oo0oO0.m10exceptionOrNullimpl(m7constructorimpl3));
        } catch (Throwable th2) {
            try {
                oo0oO0.o00oOOo0 o00oooo07 = o0OO0o.oo0oO0.Companion;
                ooo0oVar.o0ooO();
                m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0);
            } catch (Throwable th3) {
                oo0oO0.o00oOOo0 o00oooo08 = o0OO0o.oo0oO0.Companion;
                m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th3));
            }
            o00oOoO(th2, o0OO0o.oo0oO0.m10exceptionOrNullimpl(m7constructorimpl));
        }
    }
}
