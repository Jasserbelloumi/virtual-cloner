package o0OOO0;

import o0OO.o00oo0;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oOo0O extends o00oOOo0 {
    @Nullable
    private final o0OO.o00oo0 _context;
    @Nullable
    private transient o0OO.o00oOo0O<Object> intercepted;

    public o00oOo0O(@Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
        this(o00ooo0o2, o00ooo0o2 != null ? o00ooo0o2.getContext() : null);
    }

    public o00oOo0O(@Nullable o0OO.o00oOo0O<Object> o00ooo0o2, @Nullable o0OO.o00oo0 o00oo0Var) {
        super(o00ooo0o2);
        this._context = o00oo0Var;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o0OO.o00oo0 getContext() {
        o0OO.o00oo0 o00oo0Var = this._context;
        o0ooO.o00oo00O(o00oo0Var);
        return o00oo0Var;
    }

    @NotNull
    public final o0OO.o00oOo0O<Object> intercepted() {
        o0OO.o00oOo0O<Object> o00ooo0o2 = this.intercepted;
        if (o00ooo0o2 == null) {
            o0OO.o00oOoO o00oooo2 = (o0OO.o00oOoO) getContext().get(o0OO.o00oOoO.f12926o00oOo0o);
            if (o00oooo2 == null || (o00ooo0o2 = o00oooo2.o00ooO0(this)) == null) {
                o00ooo0o2 = this;
            }
            this.intercepted = o00ooo0o2;
        }
        return o00ooo0o2;
    }

    @Override // o0OOO0.o00oOOo0
    public void releaseIntercepted() {
        o0OO.o00oOo0O<?> o00ooo0o2 = this.intercepted;
        if (o00ooo0o2 != null && o00ooo0o2 != this) {
            o00oo0.o00oOOoO o00ooooo2 = getContext().get(o0OO.o00oOoO.f12926o00oOo0o);
            o0ooO.o00oo00O(o00ooooo2);
            ((o0OO.o00oOoO) o00ooooo2).o0O0oO0(o00ooo0o2);
        }
        this.intercepted = o00oOo00.f13433o00oo0O0;
    }
}
