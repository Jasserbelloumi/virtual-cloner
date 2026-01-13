package o0OOo00O;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lo0OOo00O/o0O00O0o;", "Lo0OOo00O/o0O0O0Oo;", "", "o00oOo00", "()Z", "Lo0OO/o00oOo0O;", "continuation", "", "cause", "handled", "<init>", "(Lo0OO/o00oOo0O;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O00O0o extends o0O0O0Oo {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14004o00oOo00 = AtomicIntegerFieldUpdater.newUpdater(o0O00O0o.class, "_resumed");
    @NotNull
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o0O00O0o(@org.jetbrains.annotations.NotNull o0OO.o00oOo0O<?> r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o0O00O0o.<init>(o0OO.o00oOo0O, java.lang.Throwable, boolean):void");
    }

    public final boolean o00oOo00() {
        return f14004o00oOo00.compareAndSet(this, 0, 1);
    }
}
