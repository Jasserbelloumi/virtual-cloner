package o0ooOoOO;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO.o00oOo0O;
import o0OO0o.oo0oO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOooO0(24)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lo0ooOoOO/oO00000o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "value", "Lo0OO0o/oO0Ooooo;", "accept", "(Ljava/lang/Object;)V", "", "toString", "Lo0OO/o00oOo0O;", "continuation", "Lo0OO/o00oOo0O;", "<init>", "(Lo0OO/o00oOo0O;)V", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oO00000o<T> extends AtomicBoolean implements Consumer<T> {
    @NotNull
    private final o00oOo0O<T> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO00000o(@NotNull o00oOo0O<? super T> o00ooo0o2) {
        super(false);
        o0ooO.o00oo0O0(o00ooo0o2, "continuation");
        this.continuation = o00ooo0o2;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            o00oOo0O<T> o00ooo0o2 = this.continuation;
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(t));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ContinuationConsumer(resultAccepted = ");
        o00oOOo02.append(get());
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
