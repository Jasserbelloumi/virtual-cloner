package o0OOo00O;

import android.support.v4.media.o00oOo0O;
import java.util.concurrent.Future;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lo0OOo00O/o0OOO0O;", "Lo0OOo00O/o0OOO0OO;", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "", "toString", "Ljava/util/concurrent/Future;", "o00oo0O0", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OOO0O implements o0OOO0OO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Future<?> f14045o00oo0O0;

    public o0OOO0O(@NotNull Future<?> future) {
        this.f14045o00oo0O0 = future;
    }

    @Override // o0OOo00O.o0OOO0OO
    public void o00oOOoO() {
        this.f14045o00oo0O0.cancel(false);
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DisposableFutureHandle[");
        o00oOOo02.append(this.f14045o00oo0O0);
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }
}
