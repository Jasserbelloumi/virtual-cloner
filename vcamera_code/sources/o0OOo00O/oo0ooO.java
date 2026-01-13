package o0OOo00O;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.oo0oO0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lo0OO/o00oOo0O;", "", "o00oOo00", "", o00oOOoO.f12961o00oOo00, "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "o00oOOo0", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oo0ooO {
    @NotNull
    public static final String o00oOOo0(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String o00oOOoO(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String o00oOo00(@NotNull o00oOo0O<?> o00ooo0o2) {
        String m7constructorimpl;
        if (o00ooo0o2 instanceof o0OOo0o0.o0OoOoO) {
            return o00ooo0o2.toString();
        }
        try {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o00ooo0o2 + '@' + o00oOOoO(o00ooo0o2));
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th));
        }
        if (o0OO0o.oo0oO0.m10exceptionOrNullimpl(m7constructorimpl) != null) {
            m7constructorimpl = o00ooo0o2.getClass().getName() + '@' + o00oOOoO(o00ooo0o2);
        }
        return (String) m7constructorimpl;
    }
}
