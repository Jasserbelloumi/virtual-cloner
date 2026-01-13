package o0OOoooO;

import java.util.Map;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO0OO;
import o0OOOOO0.o0ooO;
@o00oo0OO(name = "CollectionsJDK8Kt")
/* loaded from: classes3.dex */
public final class o0OO000 {
    /* JADX WARN: Multi-variable type inference failed */
    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final <K, V> V o00oOOo0(Map<? extends K, ? extends V> map, K k, V v) {
        o0ooO.o00oo0O0(map, "<this>");
        return map.getOrDefault(k, v);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final <K, V> boolean o00oOOoO(Map<? extends K, ? extends V> map, K k, V v) {
        o0ooO.o00oo0O0(map, "<this>");
        return o0OOO0OO.o00oOoo0(map).remove(k, v);
    }
}
