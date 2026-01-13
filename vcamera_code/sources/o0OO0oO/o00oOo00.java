package o0OO0oO;

import com.google.android.exoplayer2.text.CueDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oOo00<E> extends o0OO0oO.o00oOOo0<E> implements List<E>, o0OOOOO.o00oOOo0 {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        public final void o00oOOo0(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder o00oOOo02 = androidx.recyclerview.widget.o00oo0O0.o00oOOo0("startIndex: ", i, ", endIndex: ", i2, ", size: ");
                o00oOOo02.append(i3);
                throw new IndexOutOfBoundsException(o00oOOo02.toString());
            } else if (i > i2) {
                throw new IllegalArgumentException(o0O00Oo.o0oO0Ooo.o00oOOo0("startIndex: ", i, " > endIndex: ", i2));
            }
        }

        public final void o00oOOoO(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(o0O00Oo.o0oO0Ooo.o00oOOo0("index: ", i, ", size: ", i2));
            }
        }

        public final void o00oOo00(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(o0O00Oo.o0oO0Ooo.o00oOOo0("index: ", i, ", size: ", i2));
            }
        }

        public final boolean o00oOo0O(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            o0OOOOO0.o0ooO.o00oo0O0(collection, CueDecoder.BUNDLED_CUES);
            o0OOOOO0.o0ooO.o00oo0O0(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!o0OOOOO0.o0ooO.o00oOoO0(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int o00oOo0o(@NotNull Collection<?> collection) {
            o0OOOOO0.o0ooO.o00oo0O0(collection, CueDecoder.BUNDLED_CUES);
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final void o00oOooO(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder o00oOOo02 = androidx.recyclerview.widget.o00oo0O0.o00oOOo0("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                o00oOOo02.append(i3);
                throw new IndexOutOfBoundsException(o00oOOo02.toString());
            } else if (i > i2) {
                throw new IllegalArgumentException(o0O00Oo.o0oO0Ooo.o00oOOo0("fromIndex: ", i, " > toIndex: ", i2));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements Iterator<E>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f13305o00oo0O0;

        public o00oOOoO() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13305o00oo0O0 < o00oOo00.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                o00oOo00<E> o00ooo002 = o00oOo00.this;
                int i = this.f13305o00oo0O0;
                this.f13305o00oo0O0 = i + 1;
                return o00ooo002.get(i);
            }
            throw new NoSuchElementException();
        }

        public final int o00oOOo0() {
            return this.f13305o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f13305o00oo0O0 = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o0OO0oO.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0166o00oOo00 extends o00oOo00<E>.o00oOOoO implements ListIterator<E>, o0OOOOO.o00oOOo0 {
        public C0166o00oOo00(int i) {
            super();
            o00oOo00.Companion.o00oOo00(i, o00oOo00.this.size());
            o00oOOoO(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return o00oOOo0() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return o00oOOo0();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                o00oOo00<E> o00ooo002 = o00oOo00.this;
                o00oOOoO(o00oOOo0() - 1);
                return o00ooo002.get(o00oOOo0());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return o00oOOo0() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O<E> extends o00oOo00<E> implements RandomAccess {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final int f13307o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOo00<E> f13308o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f13309o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(@NotNull o00oOo00<? extends E> o00ooo002, int i, int i2) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooo002, "list");
            this.f13308o00oo0O0 = o00ooo002;
            this.f13307o00oo0O = i;
            o00oOo00.Companion.o00oOooO(i, i2, o00ooo002.size());
            this.f13309o00oo0Oo = i2 - i;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public E get(int i) {
            o00oOo00.Companion.o00oOOoO(i, this.f13309o00oo0Oo);
            return this.f13308o00oo0O0.get(this.f13307o00oo0O + i);
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13309o00oo0Oo;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.o00oOo0O(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // o0OO0oO.o00oOOo0
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.o00oOo0o(this);
    }

    @Override // java.util.List
    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (o0OOOOO0.o0ooO.o00oOoO0(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new o00oOOoO();
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o0OOOOO0.o0ooO.o00oOoO0(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new C0166o00oOo00(0);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new C0166o00oOo00(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return new o00oOo0O(this, i, i2);
    }
}
