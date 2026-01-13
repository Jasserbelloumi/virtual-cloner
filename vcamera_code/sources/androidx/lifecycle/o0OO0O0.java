package androidx.lifecycle;

import o0OOo00O.oO0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0OO0O0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f3383o00oOOo0 = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final o0OOo00O.o0O0oo00 o00oOOo0(@NotNull o0OO0 o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0, "<this>");
        o0OOo00O.o0O0oo00 o0o0oo00 = (o0OOo00O.o0O0oo00) o0oo0.getTag(f3383o00oOOo0);
        if (o0o0oo00 != null) {
            return o0o0oo00;
        }
        Object tagIfAbsent = o0oo0.setTagIfAbsent(f3383o00oOOo0, new o00oo00O(oO0.o00oOo00(null, 1, null).plus(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo())));
        o0OOOOO0.o0ooO.o00oo0OO(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (o0OOo00O.o0O0oo00) tagIfAbsent;
    }
}
