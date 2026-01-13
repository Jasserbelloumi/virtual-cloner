package o0OOo0O0;

import kotlin.Metadata;
import o0OOo00O.oO00Oo0;
import o0OOo0O0.o0O000O;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"E", "", "capacity", "Lo0OOo0O0/o00ooO;", "o00oOOo0", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0 {
    @oO00Oo0
    @NotNull
    public static final <E> o00ooO<E> o00oOOo0(int i) {
        if (i == -2) {
            o0O000O.f14273o00oOoOO.getClass();
            return new o00oo(o0O000O.o00oOOoO.f14285o00oOoO);
        } else if (i != -1) {
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    return new o00oo(i);
                }
                throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
            }
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else {
            return new o0O00o00();
        }
    }
}
