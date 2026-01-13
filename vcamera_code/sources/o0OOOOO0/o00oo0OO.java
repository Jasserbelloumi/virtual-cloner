package o0OOOOO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo0OO<T> implements Iterator<T>, o0OOOOO.o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13545o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final T[] f13546o00oo0O0;

    public o00oo0OO(@NotNull T[] tArr) {
        o0ooO.o00oo0O0(tArr, "array");
        this.f13546o00oo0O0 = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13545o00oo0O < this.f13546o00oo0O0.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f13546o00oo0O0;
            int i = this.f13545o00oo0O;
            this.f13545o00oo0O = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13545o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    public final T[] o00oOOo0() {
        return this.f13546o00oo0O0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
