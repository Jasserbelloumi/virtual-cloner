package o0OOo00O;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lo0OOo00O/oO0OOo0o;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lo0OOo00O/o0OooO0;", "", "fillInStackTrace", "createCopy", "", "toString", "", "other", "", "equals", "", "hashCode", "Lo0OOo00O/ooOOOOoo;", "job", "Lo0OOo00O/ooOOOOoo;", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lo0OOo00O/ooOOOOoo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0OOo0o extends CancellationException implements o0OooO0<oO0OOo0o> {
    @o0OOOO0o.o00oOoO
    @NotNull
    public final transient ooOOOOoo job;

    public oO0OOo0o(@NotNull String str, @Nullable Throwable th, @NotNull ooOOOOoo oooooooo) {
        super(str);
        this.job = oooooooo;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // o0OOo00O.o0OooO0
    @Nullable
    public oO0OOo0o createCopy() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof oO0OOo0o) {
                oO0OOo0o oo0ooo0o = (oO0OOo0o) obj;
                if (!o0OOOOO0.o0ooO.o00oOoO0(oo0ooo0o.getMessage(), getMessage()) || !o0OOOOO0.o0ooO.o00oOoO0(oo0ooo0o.job, this.job) || !o0OOOOO0.o0ooO.o00oOoO0(oo0ooo0o.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        o0OOOOO0.o0ooO.o00oo00O(message);
        int hashCode = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
