package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0OOO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<String, Integer> f3345o00oOOo0 = new HashMap();

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOOo0(@NotNull String str, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "name");
        Integer num = this.f3345o00oOOo0.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.f3345o00oOOo0.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
