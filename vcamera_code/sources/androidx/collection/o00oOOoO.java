package androidx.collection;

import kotlin.Metadata;
import o0OO0o.o0O0o00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0086\b\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"K", "V", "Landroidx/collection/o00oOOo0;", "o00oOOo0", "", "Lo0OO0o/o0O0o00;", "pairs", o0OO000o.o00oOOoO.f12961o00oOo00, "([Lo0OO0o/o0O0o00;)Landroidx/collection/o00oOOo0;", "collection-ktx"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o00oOOoO {
    @NotNull
    public static final <K, V> o00oOOo0<K, V> o00oOOo0() {
        return new o00oOOo0<>();
    }

    @NotNull
    public static final <K, V> o00oOOo0<K, V> o00oOOoO(@NotNull o0O0o00<? extends K, ? extends V>... o0o0o00Arr) {
        o0ooO.o00oo0O(o0o0o00Arr, "pairs");
        o00oOOo0<K, V> o00oooo02 = new o00oOOo0<>(o0o0o00Arr.length);
        for (o0O0o00<? extends K, ? extends V> o0o0o00 : o0o0o00Arr) {
            o00oooo02.put(o0o0o00.getFirst(), o0o0o00.getSecond());
        }
        return o00oooo02;
    }
}
