package o0OOo0oo;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo0OOo0oo/oOO00;", "", "", "o00oOOo0", "()J", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14759o00oOOo0 = AtomicLongFieldUpdater.newUpdater(oOO00.class, "number");
    @NotNull
    private volatile /* synthetic */ long number = 1;

    public final long o00oOOo0() {
        return f14759o00oOOo0.incrementAndGet(this);
    }
}
