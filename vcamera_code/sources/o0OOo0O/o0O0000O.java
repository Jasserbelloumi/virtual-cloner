package o0OOo0O;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lo0OOo0O/o0O0000O;", "Lo0OOO0/o00oOoO;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "o00oo0O0", "Lo0OOO0/o00oOoO;", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "o00oo0O", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lo0OOO0/o00oOoO;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0000O implements o0OOO0.o00oOoO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final StackTraceElement f14204o00oo0O;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OOO0.o00oOoO f14205o00oo0O0;

    public o0O0000O(@Nullable o0OOO0.o00oOoO o00oooo2, @NotNull StackTraceElement stackTraceElement) {
        this.f14205o00oo0O0 = o00oooo2;
        this.f14204o00oo0O = stackTraceElement;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o0OOO0.o00oOoO getCallerFrame() {
        return this.f14205o00oo0O0;
    }

    @Override // o0OOO0.o00oOoO
    @NotNull
    public StackTraceElement getStackTraceElement() {
        return this.f14204o00oo0O;
    }
}
