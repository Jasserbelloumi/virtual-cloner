package o0OOo0oO;

import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import o0OOOO0o.o00oOoO;
import o0OOo00O.oo0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lo0OOo0oO/oO0OO00;", "Lo0OOo0oO/ooOOO00O;", "Lo0OO0o/oO0Ooooo;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "o00oo0Oo", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lo0OOo0oO/ooo0o;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLo0OOo0oO/ooo0o;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0OO00 extends ooOOO00O {
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Runnable f14690o00oo0Oo;

    public oO0OO00(@NotNull Runnable runnable, long j, @NotNull ooo0o ooo0oVar) {
        super(j, ooo0oVar);
        this.f14690o00oo0Oo = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f14690o00oo0Oo.run();
        } finally {
            this.f14757o00oo0O.o0ooO();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Task[");
        o00oOOo02.append(oo0ooO.o00oOOo0(this.f14690o00oo0Oo));
        o00oOOo02.append('@');
        o00oOOo02.append(oo0ooO.o00oOOoO(this.f14690o00oo0Oo));
        o00oOOo02.append(", ");
        o00oOOo02.append(this.f14758o00oo0O0);
        o00oOOo02.append(", ");
        o00oOOo02.append(this.f14757o00oo0O);
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }
}
