package o0OO0oOO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0oO0Ooo<K, V> extends o0O00O0o<Map.Entry<K, V>, K, V> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00OOO<K, V> f13398o00oo0O0;

    public o0oO0Ooo(@NotNull o0O00OOO<K, V> o0o00ooo) {
        o0ooO.o00oo0O0(o0o00ooo, "backing");
        this.f13398o00oo0O0 = o0o00ooo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f13398o00oo0O0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        return this.f13398o00oo0O0.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // o0OO0oO.o00oo0OO
    public int getSize() {
        return this.f13398o00oo0O0.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f13398o00oo0O0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f13398o00oo0O0.entriesIterator$kotlin_stdlib();
    }

    @Override // o0OO0oOO.o0O00O0o
    public boolean o00oOOoO(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        o0ooO.o00oo0O0(entry, "element");
        return this.f13398o00oo0O0.containsEntry$kotlin_stdlib(entry);
    }

    @Override // o0OO0oOO.o0O00O0o
    public boolean o00oOo00(@NotNull Map.Entry entry) {
        o0ooO.o00oo0O0(entry, "element");
        return this.f13398o00oo0O0.removeEntry$kotlin_stdlib(entry);
    }

    @NotNull
    public final o0O00OOO<K, V> o00oOo0O() {
        return this.f13398o00oo0O0;
    }

    @Override // o0OO0oO.o00oo0OO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: o00oOooO */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        o0ooO.o00oo0O0(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13398o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        o0ooO.o00oo0O0(collection, "elements");
        this.f13398o00oo0O0.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
