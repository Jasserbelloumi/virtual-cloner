package o0O000;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOooO0(31)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lo0O000/o00oo0;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "Lo0OO0o/oO0Ooooo;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lo0OO/o00oOo0O;", "continuation", "Lo0OO/o00oOo0O;", "<init>", "(Lo0OO/o00oOo0O;)V", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oo0<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    @NotNull
    private final o0OO.o00oOo0O<R> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oo0(@NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        super(false);
        o0ooO.o00oo0O0(o00ooo0o2, "continuation");
        this.continuation = o00ooo0o2;
    }

    public void onError(@NotNull E e) {
        o0ooO.o00oo0O0(e, "error");
        if (compareAndSet(false, true)) {
            o0OO.o00oOo0O<R> o00ooo0o2 = this.continuation;
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            o0OO.o00oOo0O<R> o00ooo0o2 = this.continuation;
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ContinuationOutcomeReceiver(outcomeReceived = ");
        o00oOOo02.append(get());
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
