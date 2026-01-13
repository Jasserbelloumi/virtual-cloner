package o0ooOoOO;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.oo0oO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lo0ooOoOO/oO0000O;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lo0OO0o/oO0Ooooo;", "run", "", "toString", "Lo0OO/o00oOo0O;", "continuation", "Lo0OO/o00oOo0O;", "<init>", "(Lo0OO/o00oOo0O;)V", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oO0000O extends AtomicBoolean implements Runnable {
    @NotNull
    private final o00oOo0O<o0OO0o.oO0Ooooo> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0000O(@NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        super(false);
        o0ooO.o00oo0O0(o00ooo0o2, "continuation");
        this.continuation = o00ooo0o2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            o00oOo0O<o0OO0o.oO0Ooooo> o00ooo0o2 = this.continuation;
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ContinuationRunnable(ran = ");
        o00oOOo02.append(get());
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
