package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lo0OOo00O/o00oo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o00oOoO;", "", "state", "Lo0OO0o/oO0Ooooo;", "o0O0000O", "o0O0oOo", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "o00oo0Oo", "Ljava/lang/Thread;", "blockedThread", "Lo0OOo00O/o0OOo000;", "o00oo0o0", "Lo0OOo00O/o0OOo000;", "eventLoop", "", "o0O0OOO", "()Z", "isScopedCoroutine", "Lo0OO/o00oo0;", "parentContext", "<init>", "(Lo0OO/o00oo0;Ljava/lang/Thread;Lo0OOo00O/o0OOo000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00oo<T> extends o00oOoO<T> {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Thread f13977o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0OOo000 f13978o00oo0o0;

    public o00oo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Thread thread, @Nullable o0OOo000 o0ooo000) {
        super(o00oo0Var, true, true);
        this.f13977o00oo0Oo = thread;
        this.f13978o00oo0o0 = o0ooo000;
    }

    @Override // o0OOo00O.oOo00OO0
    public void o0O0000O(@Nullable Object obj) {
        o0OO0o.oO0Ooooo oo0ooooo;
        if (o0OOOOO0.o0ooO.o00oOoO0(Thread.currentThread(), this.f13977o00oo0Oo)) {
            return;
        }
        Thread thread = this.f13977o00oo0Oo;
        o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.o00oOoO0(thread);
            oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        } else {
            oo0ooooo = null;
        }
        if (oo0ooooo == null) {
            LockSupport.unpark(thread);
        }
    }

    @Override // o0OOo00O.oOo00OO0
    public boolean o0O0OOO() {
        return true;
    }

    public final T o0O0oOo() {
        o0OO0o.oO0Ooooo oo0ooooo;
        o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.o00oOooO();
        }
        try {
            o0OOo000 o0ooo000 = this.f13978o00oo0o0;
            if (o0ooo000 != null) {
                o0OOo000.o0O0oooo(o0ooo000, false, 1, null);
            }
            while (!Thread.interrupted()) {
                o0OOo000 o0ooo0002 = this.f13978o00oo0o0;
                long oo0oO02 = o0ooo0002 != null ? o0ooo0002.oo0oO0() : Long.MAX_VALUE;
                if (o00oOoO0()) {
                    o0OOo000 o0ooo0003 = this.f13978o00oo0o0;
                    if (o0ooo0003 != null) {
                        o0OOo000.o0O0ooO0(o0ooo0003, false, 1, null);
                    }
                    T t = (T) oO00O0oO.o00oo0OO(o0O0O0oO());
                    o0O0O0Oo o0o0o0oo = t instanceof o0O0O0Oo ? (o0O0O0Oo) t : null;
                    if (o0o0o0oo == null) {
                        return t;
                    }
                    throw o0o0o0oo.f14007o00oOOo0;
                }
                o00oo00O o00oo00o = o00oo0.f13979o00oOOo0;
                if (o00oo00o != null) {
                    o00oo00o.o00oOo00(this, oo0oO02);
                    oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                } else {
                    oo0ooooo = null;
                }
                if (oo0ooooo == null) {
                    LockSupport.parkNanos(this, oo0oO02);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            o0OoOoOO(interruptedException);
            throw interruptedException;
        } finally {
            o00oo00O o00oo00o2 = o00oo0.f13979o00oOOo0;
            if (o00oo00o2 != null) {
                o00oo00o2.o00oOoO();
            }
        }
    }
}
