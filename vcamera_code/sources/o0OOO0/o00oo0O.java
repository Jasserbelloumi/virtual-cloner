package o0OOO0;

import o0OO0o.o0OO00o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oo0O extends o00oOOo0 {
    public o00oo0O(@Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
        super(o00ooo0o2);
        if (o00ooo0o2 != null) {
            if (!(o00ooo0o2.getContext() == o0OO.o00oo0O0.INSTANCE)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o0OO.o00oo0 getContext() {
        return o0OO.o00oo0O0.INSTANCE;
    }
}
