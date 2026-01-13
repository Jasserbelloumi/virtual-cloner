package o0OOO0;

import java.io.Serializable;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oOOo0 implements o0OO.o00oOo0O<Object>, o00oOoO, Serializable {
    @Nullable
    private final o0OO.o00oOo0O<Object> completion;

    public o00oOOo0(@Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
        this.completion = o00ooo0o2;
    }

    @NotNull
    public o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public o0OO.o00oOo0O<oO0Ooooo> create(@NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o00oOoO getCallerFrame() {
        o0OO.o00oOo0O<Object> o00ooo0o2 = this.completion;
        if (o00ooo0o2 instanceof o00oOoO) {
            return (o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Nullable
    public final o0OO.o00oOo0O<Object> getCompletion() {
        return this.completion;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return o00oo0.o00oOo0O(this);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO.o00oOo0O
    public final void resumeWith(@NotNull Object obj) {
        Object invokeSuspend;
        o0OO.o00oOo0O o00ooo0o2 = this;
        while (true) {
            o00oo0OO.o00oOOoO(o00ooo0o2);
            o00oOOo0 o00oooo02 = (o00oOOo0) o00ooo0o2;
            o0OO.o00oOo0O o00ooo0o3 = o00oooo02.completion;
            o0ooO.o00oo00O(o00ooo0o3);
            try {
                invokeSuspend = o00oooo02.invokeSuspend(obj);
            } catch (Throwable th) {
                oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                obj = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
            }
            if (invokeSuspend == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
                return;
            }
            oo0oO0.o00oOOo0 o00oooo04 = oo0oO0.Companion;
            obj = oo0oO0.m7constructorimpl(invokeSuspend);
            o00oooo02.releaseIntercepted();
            if (!(o00ooo0o3 instanceof o00oOOo0)) {
                o00ooo0o3.resumeWith(obj);
                return;
            }
            o00ooo0o2 = o00ooo0o3;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        o00oOOo02.append(stackTraceElement);
        return o00oOOo02.toString();
    }
}
