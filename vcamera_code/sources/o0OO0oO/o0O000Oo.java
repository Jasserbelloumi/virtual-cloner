package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O000Oo implements Iterator<Boolean>, o0OOOOO.o00oOOo0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(o00oOOoO());
    }

    @NotNull
    public final Boolean o00oOOo0() {
        return Boolean.valueOf(o00oOOoO());
    }

    public abstract boolean o00oOOoO();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
