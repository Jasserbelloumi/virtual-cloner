package o0OO0o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo00O
@o0OoOoOo
@o0OOOOO0.o0OOO00({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public final class oO0000o0 implements Collection<oO0000Oo>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final short[] f13235o00oo0O0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Iterator<oO0000Oo>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13236o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final short[] f13237o00oo0O0;

        public o00oOOo0(@NotNull short[] sArr) {
            o0OOOOO0.o0ooO.o00oo0O0(sArr, "array");
            this.f13237o00oo0O0 = sArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13236o00oo0O < this.f13237o00oo0O0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ oO0000Oo next() {
            return oO0000Oo.o00oOooO(o00oOOo0());
        }

        public short o00oOOo0() {
            int i = this.f13236o00oo0O;
            short[] sArr = this.f13237o00oo0O0;
            if (i < sArr.length) {
                this.f13236o00oo0O = i + 1;
                return oO0000Oo.o00oOooo(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f13236o00oo0O));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @o0O
    public /* synthetic */ oO0000o0(short[] sArr) {
        this.f13235o00oo0O0 = sArr;
    }

    public static final /* synthetic */ oO0000o0 o00oOOoO(short[] sArr) {
        return new oO0000o0(sArr);
    }

    @NotNull
    public static short[] o00oOo00(int i) {
        short[] sArr = new short[i];
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "storage");
        return sArr;
    }

    public static boolean o00oOoO(short[] sArr, @NotNull Collection<oO0000Oo> collection) {
        boolean z;
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if ((obj instanceof oO0000Oo) && o0OO0oO.o0O000O.oO00000(sArr, ((oO0000Oo) obj).f13234o00oo0O0)) {
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

    public static boolean o00oOoO0(short[] sArr, short s) {
        return o0OO0oO.o0O000O.oO00000(sArr, s);
    }

    public static boolean o00oOoOO(short[] sArr, Object obj) {
        return (obj instanceof oO0000o0) && o0OOOOO0.o0ooO.o00oOoO0(sArr, ((oO0000o0) obj).f13235o00oo0O0);
    }

    public static final boolean o00oOoOo(short[] sArr, short[] sArr2) {
        return o0OOOOO0.o0ooO.o00oOoO0(sArr, sArr2);
    }

    public static final short o00oOoo0(short[] sArr, int i) {
        return oO0000Oo.o00oOooo(sArr[i]);
    }

    @o0O
    @NotNull
    public static short[] o00oOooO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "storage");
        return sArr;
    }

    @o0O
    public static /* synthetic */ void o00oo0() {
    }

    public static int o00oo00O(short[] sArr) {
        return sArr.length;
    }

    @NotNull
    public static Iterator<oO0000Oo> o00oo0O(short[] sArr) {
        return new o00oOOo0(sArr);
    }

    public static boolean o00oo0O0(short[] sArr) {
        return sArr.length == 0;
    }

    public static int o00oo0OO(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static final void o00oo0Oo(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static String o00oo0o0(short[] sArr) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("UShortArray(storage=");
        o00oOOo02.append(Arrays.toString(sArr));
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(oO0000Oo oo0000oo) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends oO0000Oo> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof oO0000Oo) {
            return o00oOo0O(((oO0000Oo) obj).f13234o00oo0O0);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "elements");
        return o00oOoO(this.f13235o00oo0O0, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return o00oOoOO(this.f13235o00oo0O0, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f13235o00oo0O0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return o00oo0O0(this.f13235o00oo0O0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<oO0000Oo> iterator() {
        return new o00oOOo0(this.f13235o00oo0O0);
    }

    public boolean o00oOOo0(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean o00oOo0O(short s) {
        return o0OO0oO.o0O000O.oO00000(this.f13235o00oo0O0, s);
    }

    public int o00oOooo() {
        return this.f13235o00oo0O0.length;
    }

    public final /* synthetic */ short[] o00oo0o() {
        return this.f13235o00oo0O0;
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
        return this.f13235o00oo0O0.length;
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
        return o00oo0o0(this.f13235o00oo0O0);
    }
}
