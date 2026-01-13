package o0OO0oO;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O0OOO0 implements Iterator<Float>, o0OOOOO.o00oOOo0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(o00oOOoO());
    }

    @NotNull
    public final Float o00oOOo0() {
        return Float.valueOf(o00oOOoO());
    }

    public abstract float o00oOOoO();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
