package o0OOo00O;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import o0OOo00O.o0o0000;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo0OOo00O/oO0Oo;", "Lo0OOo00O/o0OOo000;", "Lo0OO0o/oO0Ooooo;", "o0OO00o0", "", "now", "Lo0OOo00O/o0o0000$o00oOo00;", "delayedTask", "o0OO00Oo", "Ljava/lang/Thread;", "o0OO00oo", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oO0Oo extends o0OOo000 {
    public void o0OO00Oo(long j, @NotNull o0o0000.o00oOo00 o00ooo002) {
        o0OO00OO.f14022o00oo.o0OO0Ooo(j, o00ooo002);
    }

    public final void o0OO00o0() {
        o0OO0o.oO0Ooooo oo0ooooo;
        Thread o0OO00oo2 = o0OO00oo();
        if (Thread.currentThread() != o0OO00oo2) {
            o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
            if (o00oOOoO2 != null) {
                o00oOOoO2.o00oOoO0(o0OO00oo2);
                oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
            } else {
                oo0ooooo = null;
            }
            if (oo0ooooo == null) {
                LockSupport.unpark(o0OO00oo2);
            }
        }
    }

    @NotNull
    public abstract Thread o0OO00oo();
}
