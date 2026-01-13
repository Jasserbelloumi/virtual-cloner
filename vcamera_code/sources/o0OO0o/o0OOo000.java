package o0OO0o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo00O
@o0OoOoOo
@o0OOOOO0.o0OOO00({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public final class o0OOo000 implements Collection<o0OOOO>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int[] f13219o00oo0O0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Iterator<o0OOOO>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13220o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int[] f13221o00oo0O0;

        public o00oOOo0(@NotNull int[] iArr) {
            o0OOOOO0.o0ooO.o00oo0O0(iArr, "array");
            this.f13221o00oo0O0 = iArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13220o00oo0O < this.f13221o00oo0O0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ o0OOOO next() {
            return o0OOOO.o00oOooO(o00oOOo0());
        }

        public int o00oOOo0() {
            int i = this.f13220o00oo0O;
            int[] iArr = this.f13221o00oo0O0;
            if (i < iArr.length) {
                this.f13220o00oo0O = i + 1;
                return o0OOOO.o00oOooo(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f13220o00oo0O));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @o0O
    public /* synthetic */ o0OOo000(int[] iArr) {
        this.f13219o00oo0O0 = iArr;
    }

    public static final /* synthetic */ o0OOo000 o00oOOoO(int[] iArr) {
        return new o0OOo000(iArr);
    }

    @NotNull
    public static int[] o00oOo00(int i) {
        int[] iArr = new int[i];
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "storage");
        return iArr;
    }

    public static boolean o00oOoO(int[] iArr, @NotNull Collection<o0OOOO> collection) {
        boolean z;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if ((obj instanceof o0OOOO) && o0OO0oO.o0O000O.o0oooooO(iArr, ((o0OOOO) obj).f13218o00oo0O0)) {
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

    public static boolean o00oOoO0(int[] iArr, int i) {
        return o0OO0oO.o0O000O.o0oooooO(iArr, i);
    }

    public static boolean o00oOoOO(int[] iArr, Object obj) {
        return (obj instanceof o0OOo000) && o0OOOOO0.o0ooO.o00oOoO0(iArr, ((o0OOo000) obj).f13219o00oo0O0);
    }

    public static final boolean o00oOoOo(int[] iArr, int[] iArr2) {
        return o0OOOOO0.o0ooO.o00oOoO0(iArr, iArr2);
    }

    public static final int o00oOoo0(int[] iArr, int i) {
        return o0OOOO.o00oOooo(iArr[i]);
    }

    @o0O
    @NotNull
    public static int[] o00oOooO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "storage");
        return iArr;
    }

    @o0O
    public static /* synthetic */ void o00oo0() {
    }

    public static int o00oo00O(int[] iArr) {
        return iArr.length;
    }

    @NotNull
    public static Iterator<o0OOOO> o00oo0O(int[] iArr) {
        return new o00oOOo0(iArr);
    }

    public static boolean o00oo0O0(int[] iArr) {
        return iArr.length == 0;
    }

    public static int o00oo0OO(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void o00oo0Oo(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static String o00oo0o0(int[] iArr) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("UIntArray(storage=");
        o00oOOo02.append(Arrays.toString(iArr));
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(o0OOOO o0oooo) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o0OOOO> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof o0OOOO) {
            return o00oOo0O(((o0OOOO) obj).f13218o00oo0O0);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        return o00oOoO(this.f13219o00oo0O0, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return o00oOoOO(this.f13219o00oo0O0, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f13219o00oo0O0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return o00oo0O0(this.f13219o00oo0O0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<o0OOOO> iterator() {
        return new o00oOOo0(this.f13219o00oo0O0);
    }

    public boolean o00oOOo0(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean o00oOo0O(int i) {
        return o0OO0oO.o0O000O.o0oooooO(this.f13219o00oo0O0, i);
    }

    public int o00oOooo() {
        return this.f13219o00oo0O0.length;
    }

    public final /* synthetic */ int[] o00oo0o() {
        return this.f13219o00oo0O0;
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
        return this.f13219o00oo0O0.length;
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
        return o00oo0o0(this.f13219o00oo0O0);
    }
}
