package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O00 implements Iterator<Character>, o0OOOOO.o00oOOo0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(o00oOOoO());
    }

    @NotNull
    public final Character o00oOOo0() {
        return Character.valueOf(o00oOOoO());
    }

    public abstract char o00oOOoO();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
