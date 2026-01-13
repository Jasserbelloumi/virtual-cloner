package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO0oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public class o0OO0oO0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<String, o0OO0> f3399o00oOOo0 = new LinkedHashMap();

    public final void o00oOOo0() {
        for (o0OO0 o0oo0 : this.f3399o00oOOo0.values()) {
            o0oo0.clear();
        }
        this.f3399o00oOOo0.clear();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @Nullable
    public final o0OO0 o00oOOoO(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        return this.f3399o00oOOo0.get(str);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final Set<String> o00oOo00() {
        return new HashSet(this.f3399o00oOOo0.keySet());
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void o00oOooO(@NotNull String str, @NotNull o0OO0 o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "viewModel");
        o0OO0 put = this.f3399o00oOOo0.put(str, o0oo0);
        if (put != null) {
            put.onCleared();
        }
    }
}
