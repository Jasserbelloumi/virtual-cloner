package o0OOo0o0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lo0OOo0o0/o0oOo0O0;", "", "Lo0OOo0o0/o0O0oo00;", "op", "o00oOo00", "failure", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0OOo0o0/o0O0oo00;", o00oOOoO.f12961o00oOo00, "()Lo0OOo0o0/o0O0oo00;", "o00oOooO", "(Lo0OOo0o0/o0O0oo00;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0oOo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0O0oo00<?> f14641o00oOOo0;

    public abstract void o00oOOo0(@NotNull o0O0oo00<?> o0o0oo00, @Nullable Object obj);

    @NotNull
    public final o0O0oo00<?> o00oOOoO() {
        o0O0oo00<?> o0o0oo00 = this.f14641o00oOOo0;
        if (o0o0oo00 != null) {
            return o0o0oo00;
        }
        o0ooO.o00ooooO("atomicOp");
        return null;
    }

    @Nullable
    public abstract Object o00oOo00(@NotNull o0O0oo00<?> o0o0oo00);

    public final void o00oOooO(@NotNull o0O0oo00<?> o0o0oo00) {
        this.f14641o00oOOo0 = o0o0oo00;
    }
}
