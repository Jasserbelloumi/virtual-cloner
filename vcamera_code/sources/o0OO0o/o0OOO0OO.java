package o0OO0o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo00O
@o0OoOoOo
@o0OOOOO0.o0OOO00({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public final class o0OOO0OO implements Collection<o0OOO0O>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final byte[] f13210o00oo0O0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Iterator<o0OOO0O>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13211o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final byte[] f13212o00oo0O0;

        public o00oOOo0(@NotNull byte[] bArr) {
            o0OOOOO0.o0ooO.o00oo0O0(bArr, "array");
            this.f13212o00oo0O0 = bArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13211o00oo0O < this.f13212o00oo0O0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ o0OOO0O next() {
            return o0OOO0O.o00oOooO(o00oOOo0());
        }

        public byte o00oOOo0() {
            int i = this.f13211o00oo0O;
            byte[] bArr = this.f13212o00oo0O0;
            if (i < bArr.length) {
                this.f13211o00oo0O = i + 1;
                return o0OOO0O.o00oOooo(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f13211o00oo0O));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @o0O
    public /* synthetic */ o0OOO0OO(byte[] bArr) {
        this.f13210o00oo0O0 = bArr;
    }

    public static final /* synthetic */ o0OOO0OO o00oOOoO(byte[] bArr) {
        return new o0OOO0OO(bArr);
    }

    @NotNull
    public static byte[] o00oOo00(int i) {
        byte[] bArr = new byte[i];
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "storage");
        return bArr;
    }

    public static boolean o00oOoO(byte[] bArr, @NotNull Collection<o0OOO0O> collection) {
        boolean z;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if ((obj instanceof o0OOO0O) && o0OO0oO.o0O000O.o0ooooOo(bArr, ((o0OOO0O) obj).f13209o00oo0O0)) {
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

    public static boolean o00oOoO0(byte[] bArr, byte b) {
        return o0OO0oO.o0O000O.o0ooooOo(bArr, b);
    }

    public static boolean o00oOoOO(byte[] bArr, Object obj) {
        return (obj instanceof o0OOO0OO) && o0OOOOO0.o0ooO.o00oOoO0(bArr, ((o0OOO0OO) obj).f13210o00oo0O0);
    }

    public static final boolean o00oOoOo(byte[] bArr, byte[] bArr2) {
        return o0OOOOO0.o0ooO.o00oOoO0(bArr, bArr2);
    }

    public static final byte o00oOoo0(byte[] bArr, int i) {
        return o0OOO0O.o00oOooo(bArr[i]);
    }

    @o0O
    @NotNull
    public static byte[] o00oOooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "storage");
        return bArr;
    }

    @o0O
    public static /* synthetic */ void o00oo0() {
    }

    public static int o00oo00O(byte[] bArr) {
        return bArr.length;
    }

    @NotNull
    public static Iterator<o0OOO0O> o00oo0O(byte[] bArr) {
        return new o00oOOo0(bArr);
    }

    public static boolean o00oo0O0(byte[] bArr) {
        return bArr.length == 0;
    }

    public static int o00oo0OO(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static final void o00oo0Oo(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static String o00oo0o0(byte[] bArr) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("UByteArray(storage=");
        o00oOOo02.append(Arrays.toString(bArr));
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(o0OOO0O o0ooo0o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o0OOO0O> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof o0OOO0O) {
            return o00oOo0O(((o0OOO0O) obj).f13209o00oo0O0);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        return o00oOoO(this.f13210o00oo0O0, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return o00oOoOO(this.f13210o00oo0O0, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f13210o00oo0O0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return o00oo0O0(this.f13210o00oo0O0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<o0OOO0O> iterator() {
        return new o00oOOo0(this.f13210o00oo0O0);
    }

    public boolean o00oOOo0(byte b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean o00oOo0O(byte b) {
        return o0OO0oO.o0O000O.o0ooooOo(this.f13210o00oo0O0, b);
    }

    public int o00oOooo() {
        return this.f13210o00oo0O0.length;
    }

    public final /* synthetic */ byte[] o00oo0o() {
        return this.f13210o00oo0O0;
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
        return this.f13210o00oo0O0.length;
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
        return o00oo0o0(this.f13210o00oo0O0);
    }
}
