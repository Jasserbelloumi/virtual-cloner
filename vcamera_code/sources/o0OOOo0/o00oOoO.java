package o0OOOo0;

import java.io.Serializable;
import java.util.Random;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOoO extends o00oOOoO implements Serializable {
    @NotNull
    private static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private final Random impl;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o00oOoO(@NotNull Random random) {
        o0ooO.o00oo0O0(random, "impl");
        this.impl = random;
    }

    @Override // o0OOOo0.o00oOOoO
    @NotNull
    public Random getImpl() {
        return this.impl;
    }
}
