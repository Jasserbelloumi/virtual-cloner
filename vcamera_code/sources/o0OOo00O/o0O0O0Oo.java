package o0OOo00O;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, d2 = {"Lo0OOo00O/o0O0O0Oo;", "", "", o00oOOoO.f12961o00oOo00, "()Z", "", "toString", "()Ljava/lang/String;", "", "o00oOOo0", "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0O0O0Oo {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14006o00oOOoO = AtomicIntegerFieldUpdater.newUpdater(o0O0O0Oo.class, "_handled");
    @NotNull
    private volatile /* synthetic */ int _handled;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Throwable f14007o00oOOo0;

    public o0O0O0Oo(@NotNull Throwable th, boolean z) {
        this.f14007o00oOOo0 = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ o0O0O0Oo(Throwable th, boolean z, int i, o0OOOOO0.o0O00 o0o00) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean o00oOOo0() {
        return this._handled;
    }

    public final boolean o00oOOoO() {
        return f14006o00oOOoO.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return oo0ooO.o00oOOo0(this) + '[' + this.f14007o00oOOo0 + ']';
    }
}
