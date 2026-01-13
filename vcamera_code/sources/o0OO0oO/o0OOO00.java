package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0OOO00 implements Iterator<Short>, o0OOOOO.o00oOOo0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(o00oOOoO());
    }

    @NotNull
    public final Short o00oOOo0() {
        return Short.valueOf(o00oOOoO());
    }

    public abstract short o00oOOoO();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
