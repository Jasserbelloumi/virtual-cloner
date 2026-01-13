package o0OOo0oO;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00oo0OO;
import o0OOo0oO.oOoo0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "o00oOOo0", o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0 {
    @o00oo0OO(name = "isSchedulerWorker")
    public static final boolean o00oOOo0(@NotNull Thread thread) {
        return thread instanceof oOoo0.o00oOo00;
    }

    @o00oo0OO(name = "mayNotBlock")
    public static final boolean o00oOOoO(@NotNull Thread thread) {
        return (thread instanceof oOoo0.o00oOo00) && ((oOoo0.o00oOo00) thread).f14750o00oo0O == oOoo0.o00oOo0O.CPU_ACQUIRED;
    }
}
