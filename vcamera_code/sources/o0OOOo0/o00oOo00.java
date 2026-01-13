package o0OOOo0;

import java.util.Random;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOo00 extends o00oOOoO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOOo0 f13694o00oo0O0 = new o00oOOo0();

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }

        @NotNull
        public Random o00oOOo0() {
            return new Random();
        }
    }

    @Override // o0OOOo0.o00oOOoO
    @NotNull
    public Random getImpl() {
        Random random = this.f13694o00oo0O0.get();
        o0ooO.o00oo0OO(random, "implStorage.get()");
        return random;
    }
}
