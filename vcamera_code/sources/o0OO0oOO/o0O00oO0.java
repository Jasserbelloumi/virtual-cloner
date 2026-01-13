package o0OO0oOO;

import java.util.Collection;
import java.util.Iterator;
import o0OO0oO.o00oOoO;
import o0OOOOO.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00oO0<V> extends o00oOoO<V> implements Collection<V>, o00oOOoO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00OOO<?, V> f13397o00oo0O0;

    public o0O00oO0(@NotNull o0O00OOO<?, V> o0o00ooo) {
        o0ooO.o00oo0O0(o0o00ooo, "backing");
        this.f13397o00oo0O0 = o0o00ooo;
    }

    @Override // o0OO0oO.o00oOoO, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f13397o00oo0O0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f13397o00oo0O0.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f13397o00oo0O0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return this.f13397o00oo0O0.valuesIterator$kotlin_stdlib();
    }

    @Override // o0OO0oO.o00oOoO
    public int o00oOOo0() {
        return this.f13397o00oo0O0.size();
    }

    @NotNull
    public final o0O00OOO<?, V> o00oOOoO() {
        return this.f13397o00oo0O0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f13397o00oo0O0.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13397o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13397o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
