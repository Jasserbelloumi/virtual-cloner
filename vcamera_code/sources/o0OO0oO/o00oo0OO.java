package o0OO0oO;

import java.util.AbstractSet;
import java.util.Set;
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oo0OO<E> extends AbstractSet<E> implements Set<E>, o0OOOOO.o00oo0OO {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
