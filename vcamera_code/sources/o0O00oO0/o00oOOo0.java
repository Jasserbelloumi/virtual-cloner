package o0O00oO0;

import java.util.LinkedHashMap;
import java.util.Map;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public abstract class o00oOOo0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<o00oOOoO<?>, Object> f11161o00oOOo0 = new LinkedHashMap();

    /* renamed from: o0O00oO0.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0143o00oOOo0 extends o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final C0143o00oOOo0 f11162o00oOOoO = new C0143o00oOOo0();

        @Override // o0O00oO0.o00oOOo0
        @Nullable
        public <T> T o00oOOo0(@NotNull o00oOOoO<T> o00ooooo2) {
            o0ooO.o00oo0O0(o00ooooo2, "key");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO<T> {
    }

    @Nullable
    public abstract <T> T o00oOOo0(@NotNull o00oOOoO<T> o00ooooo2);

    @NotNull
    public final Map<o00oOOoO<?>, Object> o00oOOoO() {
        return this.f11161o00oOOo0;
    }
}
