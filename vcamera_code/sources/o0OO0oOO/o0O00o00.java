package o0OO0oOO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o0OO0oO.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00o00<E> extends o00oo0OO<E> implements Set<E>, o0OOOOO.o00oo0OO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00OOO<E, ?> f13396o00oo0O0;

    public o0O00o00(@NotNull o0O00OOO<E, ?> o0o00ooo) {
        o0ooO.o00oo0O0(o0o00ooo, "backing");
        this.f13396o00oo0O0 = o0o00ooo;
    }

    @Override // o0OO0oO.o00oo0OO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f13396o00oo0O0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f13396o00oo0O0.containsKey(obj);
    }

    @Override // o0OO0oO.o00oo0OO
    public int getSize() {
        return this.f13396o00oo0O0.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f13396o00oo0O0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.f13396o00oo0O0.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f13396o00oo0O0.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13396o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13396o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
