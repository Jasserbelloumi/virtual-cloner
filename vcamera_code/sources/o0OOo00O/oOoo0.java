package o0OOo00O;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lo0OOo00O/oOoo0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lo0OOo00O/o0OooO0;", "createCopy", "Lo0OOo00O/ooOOOOoo;", "coroutine", "Lo0OOo00O/ooOOOOoo;", "", "message", "<init>", "(Ljava/lang/String;Lo0OOo00O/ooOOOOoo;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOoo0 extends CancellationException implements o0OooO0<oOoo0> {
    @o0OOOO0o.o00oOoO
    @Nullable
    public final transient ooOOOOoo coroutine;

    public oOoo0(@NotNull String str) {
        this(str, null);
    }

    public oOoo0(@NotNull String str, @Nullable ooOOOOoo oooooooo) {
        super(str);
        this.coroutine = oooooooo;
    }

    @Override // o0OOo00O.o0OooO0
    @NotNull
    public oOoo0 createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        oOoo0 oooo0 = new oOoo0(message, this.coroutine);
        oooo0.initCause(this);
        return oooo0;
    }
}
