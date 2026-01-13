package o0OO0o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo00O
@o0OoOoOo
@o0OOOOO0.o0OOO00({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public final class ooo0Oo0 implements Collection<o0oo0000>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long[] f13241o00oo0O0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Iterator<o0oo0000>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13242o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final long[] f13243o00oo0O0;

        public o00oOOo0(@NotNull long[] jArr) {
            o0OOOOO0.o0ooO.o00oo0O0(jArr, "array");
            this.f13243o00oo0O0 = jArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13242o00oo0O < this.f13243o00oo0O0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ o0oo0000 next() {
            return o0oo0000.o00oOooO(o00oOOo0());
        }

        public long o00oOOo0() {
            int i = this.f13242o00oo0O;
            long[] jArr = this.f13243o00oo0O0;
            if (i < jArr.length) {
                this.f13242o00oo0O = i + 1;
                return o0oo0000.o00oOooo(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f13242o00oo0O));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @o0O
    public /* synthetic */ ooo0Oo0(long[] jArr) {
        this.f13241o00oo0O0 = jArr;
    }

    public static final /* synthetic */ ooo0Oo0 o00oOOoO(long[] jArr) {
        return new ooo0Oo0(jArr);
    }

    @NotNull
    public static long[] o00oOo00(int i) {
        long[] jArr = new long[i];
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "storage");
        return jArr;
    }

    public static boolean o00oOoO(long[] jArr, @NotNull Collection<o0oo0000> collection) {
        boolean z;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if ((obj instanceof o0oo0000) && o0OO0oO.o0O000O.o0oooooo(jArr, ((o0oo0000) obj).f13227o00oo0O0)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean o00oOoO0(long[] jArr, long j) {
        return o0OO0oO.o0O000O.o0oooooo(jArr, j);
    }

    public static boolean o00oOoOO(long[] jArr, Object obj) {
        return (obj instanceof ooo0Oo0) && o0OOOOO0.o0ooO.o00oOoO0(jArr, ((ooo0Oo0) obj).f13241o00oo0O0);
    }

    public static final boolean o00oOoOo(long[] jArr, long[] jArr2) {
        return o0OOOOO0.o0ooO.o00oOoO0(jArr, jArr2);
    }

    public static final long o00oOoo0(long[] jArr, int i) {
        return o0oo0000.o00oOooo(jArr[i]);
    }

    @o0O
    @NotNull
    public static long[] o00oOooO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "storage");
        return jArr;
    }

    @o0O
    public static /* synthetic */ void o00oo0() {
    }

    public static int o00oo00O(long[] jArr) {
        return jArr.length;
    }

    @NotNull
    public static Iterator<o0oo0000> o00oo0O(long[] jArr) {
        return new o00oOOo0(jArr);
    }

    public static boolean o00oo0O0(long[] jArr) {
        return jArr.length == 0;
    }

    public static int o00oo0OO(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static final void o00oo0Oo(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static String o00oo0o0(long[] jArr) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ULongArray(storage=");
        o00oOOo02.append(Arrays.toString(jArr));
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(o0oo0000 o0oo0000Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o0oo0000> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof o0oo0000) {
            return o00oOo0O(((o0oo0000) obj).f13227o00oo0O0);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        return o00oOoO(this.f13241o00oo0O0, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return o00oOoOO(this.f13241o00oo0O0, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f13241o00oo0O0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return o00oo0O0(this.f13241o00oo0O0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<o0oo0000> iterator() {
        return new o00oOOo0(this.f13241o00oo0O0);
    }

    public boolean o00oOOo0(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean o00oOo0O(long j) {
        return o0OO0oO.o0O000O.o0oooooo(this.f13241o00oo0O0, j);
    }

    public int o00oOooo() {
        return this.f13241o00oo0O0.length;
    }

    public final /* synthetic */ long[] o00oo0o() {
        return this.f13241o00oo0O0;
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
    public int size() {
        return this.f13241o00oo0O0.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return o0OOOOO0.o0O000o0.o00oOOo0(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        return (T[]) o0OOOOO0.o0O000o0.o00oOOoO(this, tArr);
    }

    public String toString() {
        return o00oo0o0(this.f13241o00oo0O0);
    }
}
