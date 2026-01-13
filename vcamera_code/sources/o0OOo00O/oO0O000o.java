package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/ThreadLocal;", "value", "Lo0OOo00O/oO0O000;", "o00oOOo0", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lo0OOo00O/oO0O000;", "", "o00oOo0O", "(Ljava/lang/ThreadLocal;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O000o {
    @NotNull
    public static final <T> oO0O000<T> o00oOOo0(@NotNull ThreadLocal<T> threadLocal, T t) {
        return new o0OOo0o0.oO0OOo0o(t, threadLocal);
    }

    public static oO0O000 o00oOOoO(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return new o0OOo0o0.oO0OOo0o(obj, threadLocal);
    }

    @Nullable
    public static final Object o00oOo00(@NotNull ThreadLocal<?> threadLocal, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        if (o00ooo0o2.getContext().get(new o0OOo0o0.oO000Oo0(threadLocal)) != null) {
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + o00ooo0o2.getContext()).toString());
    }

    @Nullable
    public static final Object o00oOo0O(@NotNull ThreadLocal<?> threadLocal, @NotNull o00oOo0O<? super Boolean> o00ooo0o2) {
        return Boolean.valueOf(o00ooo0o2.getContext().get(new o0OOo0o0.oO000Oo0(threadLocal)) != null);
    }

    public static final Object o00oOo0o(ThreadLocal<?> threadLocal, o00oOo0O<? super Boolean> o00ooo0o2) {
        throw null;
    }

    public static final Object o00oOooO(ThreadLocal<?> threadLocal, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        throw null;
    }
}
