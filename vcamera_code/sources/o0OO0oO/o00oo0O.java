package o0OO0oO;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1726#2,3:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:472,3\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0O<T> implements Collection<T>, o0OOOOO.o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final boolean f13317o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final T[] f13318o00oo0O0;

    public o00oo0O(@NotNull T[] tArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, androidx.lifecycle.o0O.f3319o00oOoO0);
        this.f13318o00oo0O0 = tArr;
        this.f13317o00oo0O = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return o0O000O.o(this.f13318o00oo0O0, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f13318o00oo0O0.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return o0OOOOO0.o00oo0O0.o00oOOo0(this.f13318o00oo0O0);
    }

    public int o00oOOo0() {
        return this.f13318o00oo0O0.length;
    }

    @NotNull
    public final T[] o00oOOoO() {
        return this.f13318o00oo0O0;
    }

    public final boolean o00oOo00() {
        return this.f13317o00oo0O;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13318o00oo0O0.length;
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        return o0OoO00O.o00oOoO(this.f13318o00oo0O0, this.f13317o00oo0O);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        return (T[]) o0OOOOO0.o0O000o0.o00oOOoO(this, tArr);
    }
}
