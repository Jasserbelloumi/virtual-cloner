package androidx.lifecycle;

import o0OOo00O.oO0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0O00o00 {
    @NotNull
    public static final o0O00O0o o00oOOo0(@NotNull o0O00 o0o00) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) o0o00.o00oOo00().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(o0o00, oO0.o00oOo00(null, 1, null).plus(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo()));
        } while (!o0oO0Ooo.o00oOOo0(o0o00.o00oOo00(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.o00oo00O();
        return lifecycleCoroutineScopeImpl;
    }
}
