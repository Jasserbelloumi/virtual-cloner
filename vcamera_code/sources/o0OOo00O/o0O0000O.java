package o0OOo00O;

import android.support.v4.media.o00oOo0O;
import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo00O/o0O0000O;", "Lo0OOo00O/o0O000O;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "", "toString", "Ljava/util/concurrent/Future;", "o00oo0O0", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0000O extends o0O000O {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Future<?> f13998o00oo0O0;

    public o0O0000O(@NotNull Future<?> future) {
        this.f13998o00oo0O0 = future;
    }

    @Override // o0OOOO.o00oo
    public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke(Throwable th) {
        o00oOOo0(th);
        return o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    @Override // o0OOo00O.o0OoOoOo
    public void o00oOOo0(@Nullable Throwable th) {
        if (th != null) {
            this.f13998o00oo0O0.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CancelFutureOnCancel[");
        o00oOOo02.append(this.f13998o00oo0O0);
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }
}
