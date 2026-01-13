package o0OO0oO;

import java.util.AbstractList;
import java.util.List;
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oo00O<E> extends AbstractList<E> implements List<E>, o0OOOOO.o00oOoO {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
