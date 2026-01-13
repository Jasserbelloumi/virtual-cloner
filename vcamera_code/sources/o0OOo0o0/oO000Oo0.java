package o0OOo0o0;

import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0O
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\r\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lo0OOo0o0/oO000Oo0;", "Lo0OO/o00oo0$o00oOo00;", "Lo0OOo0o0/oO0OOo0o;", "Ljava/lang/ThreadLocal;", "threadLocal", o00oOOoO.f12961o00oOo00, "", "toString", "", "hashCode", "", "other", "", "equals", "o00oOOo0", "o00oo0O0", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO000Oo0 implements o00oo0.o00oOo00<oO0OOo0o<?>> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ThreadLocal<?> f14649o00oo0O0;

    public oO000Oo0(@NotNull ThreadLocal<?> threadLocal) {
        this.f14649o00oo0O0 = threadLocal;
    }

    public static oO000Oo0 o00oOo00(oO000Oo0 oo000oo0, ThreadLocal threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = oo000oo0.f14649o00oo0O0;
        }
        oo000oo0.getClass();
        return new oO000Oo0(threadLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oO000Oo0) && o0ooO.o00oOoO0(this.f14649o00oo0O0, ((oO000Oo0) obj).f14649o00oo0O0);
    }

    public int hashCode() {
        return this.f14649o00oo0O0.hashCode();
    }

    public final ThreadLocal<?> o00oOOo0() {
        return this.f14649o00oo0O0;
    }

    @NotNull
    public final oO000Oo0 o00oOOoO(@NotNull ThreadLocal<?> threadLocal) {
        return new oO000Oo0(threadLocal);
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ThreadLocalKey(threadLocal=");
        o00oOOo02.append(this.f14649o00oo0O0);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
