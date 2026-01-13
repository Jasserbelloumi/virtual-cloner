package o0OO0oO;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import o00ooOoo.oO00O0oO;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
/* loaded from: classes3.dex */
public final class o0OO0o00<T> extends o00oOo00<T> implements RandomAccess {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13371o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Object[] f13372o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f13373o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f13374o00oo0o0;

    @o0OOOOO0.o0OOO00({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOOoO<T> {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f13375o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final /* synthetic */ o0OO0o00<T> f13376o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f13377o00oo0o0;

        public o00oOOo0(o0OO0o00<T> o0oo0o00) {
            this.f13376o00oo0o = o0oo0o00;
            this.f13375o00oo0Oo = o0oo0o00.size();
            this.f13377o00oo0o0 = o0oo0o00.f13373o00oo0Oo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OO0oO.o00oOOoO
        public void o00oOOo0() {
            if (this.f13375o00oo0Oo == 0) {
                this.f13302o00oo0O0 = o0OOO0O.Done;
                return;
            }
            o00oOo00(this.f13376o00oo0o.f13372o00oo0O0[this.f13377o00oo0o0]);
            this.f13377o00oo0o0 = (this.f13377o00oo0o0 + 1) % this.f13376o00oo0o.f13371o00oo0O;
            this.f13375o00oo0Oo--;
        }
    }

    public o0OO0o00(int i) {
        this(new Object[i], 0);
    }

    public o0OO0o00(@NotNull Object[] objArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "buffer");
        this.f13372o00oo0O0 = objArr;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("ring buffer filled size should not be negative but it is ", i).toString());
        }
        if (i <= objArr.length) {
            this.f13371o00oo0O = objArr.length;
            this.f13374o00oo0o0 = i;
            return;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
        o00oOOo02.append(objArr.length);
        throw new IllegalArgumentException(o00oOOo02.toString().toString());
    }

    @Override // o0OO0oO.o00oOo00, java.util.List
    public T get(int i) {
        o00oOo00.Companion.o00oOOoO(i, size());
        return (T) this.f13372o00oo0O0[(this.f13373o00oo0Oo + i) % this.f13371o00oo0O];
    }

    @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
    public int getSize() {
        return this.f13374o00oo0o0;
    }

    @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new o00oOOo0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o0OO0o00<T> o00oOo0O(int i) {
        Object[] array;
        int i2 = this.f13371o00oo0O;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        if (this.f13373o00oo0Oo == 0) {
            array = Arrays.copyOf(this.f13372o00oo0O0, i);
            o0OOOOO0.o0ooO.o00oo0OO(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[i]);
        }
        return new o0OO0o00<>(array, size());
    }

    public final boolean o00oOoO() {
        return size() == this.f13371o00oo0O;
    }

    public final int o00oOoO0(int i, int i2) {
        return (i + i2) % this.f13371o00oo0O;
    }

    public final void o00oOoOO(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("n shouldn't be negative but it is ", i).toString());
        }
        if (!(i <= size())) {
            StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            o00oOOo02.append(size());
            throw new IllegalArgumentException(o00oOOo02.toString().toString());
        } else if (i > 0) {
            int i2 = this.f13373o00oo0Oo;
            int i3 = this.f13371o00oo0O;
            int i4 = (i2 + i) % i3;
            if (i2 > i4) {
                o0O00000.o0OO0oo0(this.f13372o00oo0O0, null, i2, i3);
                o0O00000.o0OO0oo0(this.f13372o00oo0O0, null, 0, i4);
            } else {
                o0O00000.o0OO0oo0(this.f13372o00oo0O0, null, i2, i4);
            }
            this.f13373o00oo0Oo = i4;
            this.f13374o00oo0o0 = size() - i;
        }
    }

    public final void o00oOooO(T t) {
        if (o00oOoO()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f13372o00oo0O0[(size() + this.f13373o00oo0Oo) % this.f13371o00oo0O] = t;
        this.f13374o00oo0o0 = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO0oO.o00oOOo0, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO0oO.o00oOOo0, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            o0OOOOO0.o0ooO.o00oo0OO(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f13373o00oo0Oo; i2 < size && i3 < this.f13371o00oo0O; i3++) {
            tArr[i2] = this.f13372o00oo0O0[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.f13372o00oo0O0[i];
            i2++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
