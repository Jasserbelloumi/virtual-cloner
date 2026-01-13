package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O000o0 implements Iterator<Byte>, o0OOOOO.o00oOOo0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(o00oOOoO());
    }

    @NotNull
    public final Byte o00oOOo0() {
        return Byte.valueOf(o00oOOoO());
    }

    public abstract byte o00oOOoO();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
