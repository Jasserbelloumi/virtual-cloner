package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0oO;
/* loaded from: classes.dex */
public class o0oO0O0o<T> {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f4758o00oOoOo = -1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f4759o00oOoo0 = 10;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f4760o00oOooo = 10;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f4761o00oo0 = 2;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f4762o00oo00O = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f4763o00oo0OO = 4;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public T[] f4764o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public T[] f4765o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f4766o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f4767o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOOoO f4768o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f4769o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oOOo0 f4770o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final Class<T> f4771o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f4772o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0<T2> extends o00oOOoO<T2> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o00oo00O f4773o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOOoO<T2> f4774o00oo0O0;

        public o00oOOo0(o00oOOoO<T2> o00ooooo2) {
            this.f4774o00oo0O0 = o00ooooo2;
            this.f4773o00oo0O = new o00oo00O(o00ooooo2);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f4774o00oo0O0.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.o0O00
        public void o00oOOo0(int i, int i2) {
            this.f4773o00oo0O.o00oOOo0(i, i2);
        }

        @Override // androidx.recyclerview.widget.o0O00
        public void o00oOOoO(int i, int i2) {
            this.f4773o00oo0O.o00oOOoO(i, i2);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO, androidx.recyclerview.widget.o0O00
        public void o00oOo00(int i, int i2, Object obj) {
            this.f4773o00oo0O.o00oOo00(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO
        public boolean o00oOo0O(T2 t2, T2 t22) {
            return this.f4774o00oo0O0.o00oOo0O(t2, t22);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO
        public boolean o00oOo0o(T2 t2, T2 t22) {
            return this.f4774o00oo0O0.o00oOo0o(t2, t22);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO
        public void o00oOoO(int i, int i2) {
            this.f4773o00oo0O.o00oOo00(i, i2, null);
        }

        @Override // androidx.recyclerview.widget.o0oO0O0o.o00oOOoO
        @o0OO00OO
        public Object o00oOoO0(T2 t2, T2 t22) {
            return this.f4774o00oo0O0.o00oOoO0(t2, t22);
        }

        public void o00oOoOO() {
            this.f4773o00oo0O.o00oOo0O();
        }

        @Override // androidx.recyclerview.widget.o0O00
        public void o00oOooO(int i, int i2) {
            this.f4773o00oo0O.o00oOooO(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO<T2> implements Comparator<T2>, o0O00 {
        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public void o00oOo00(int i, int i2, Object obj) {
            o00oOoO(i, i2);
        }

        public abstract boolean o00oOo0O(T2 t2, T2 t22);

        public abstract boolean o00oOo0o(T2 t2, T2 t22);

        public abstract void o00oOoO(int i, int i2);

        @o0OO00OO
        public Object o00oOoO0(T2 t2, T2 t22) {
            return null;
        }
    }

    public o0oO0O0o(@oo0oO0 Class<T> cls, @oo0oO0 o00oOOoO<T> o00ooooo2) {
        this(cls, o00ooooo2, 10);
    }

    public o0oO0O0o(@oo0oO0 Class<T> cls, @oo0oO0 o00oOOoO<T> o00ooooo2, int i) {
        this.f4771o00oOoOO = cls;
        this.f4764o00oOOo0 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.f4768o00oOo0o = o00ooooo2;
        this.f4769o00oOoO = 0;
    }

    public int o00oOOo0(T t) {
        o00ooOOo();
        return o00oOOoO(t, true);
    }

    public final int o00oOOoO(T t, boolean z) {
        int o00oOooo2 = o00oOooo(t, this.f4764o00oOOo0, 0, this.f4769o00oOoO, 1);
        if (o00oOooo2 == -1) {
            o00oOooo2 = 0;
        } else if (o00oOooo2 < this.f4769o00oOoO) {
            T t2 = this.f4764o00oOOo0[o00oOooo2];
            if (this.f4768o00oOo0o.o00oOo0o(t2, t)) {
                if (this.f4768o00oOo0o.o00oOo0O(t2, t)) {
                    this.f4764o00oOOo0[o00oOooo2] = t;
                    return o00oOooo2;
                }
                this.f4764o00oOOo0[o00oOooo2] = t;
                o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
                o00ooooo2.o00oOo00(o00oOooo2, 1, o00ooooo2.o00oOoO0(t2, t));
                return o00oOooo2;
            }
        }
        o00oOoO0(o00oOooo2, t);
        if (z) {
            this.f4768o00oOo0o.o00oOOo0(o00oOooo2, 1);
        }
        return o00oOooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o00oOo00(@oo0oO0 Collection<T> collection) {
        o00oOo0O(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, collection.size())), true);
    }

    public void o00oOo0O(@oo0oO0 T[] tArr, boolean z) {
        o00ooOOo();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            o00oOo0o(tArr);
        } else {
            o00oOo0o(o00oOoOo(tArr));
        }
    }

    public final void o00oOo0o(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int o00ooOO2 = o00ooOO(tArr);
        if (this.f4769o00oOoO != 0) {
            o00oo0O(tArr, o00ooOO2);
            return;
        }
        this.f4764o00oOOo0 = tArr;
        this.f4769o00oOoO = o00ooOO2;
        this.f4768o00oOo0o.o00oOOo0(0, o00ooOO2);
    }

    public void o00oOoO() {
        o00ooOOo();
        o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
        if (o00ooooo2 instanceof o00oOOo0) {
            return;
        }
        if (this.f4770o00oOoO0 == null) {
            this.f4770o00oOoO0 = new o00oOOo0(o00ooooo2);
        }
        this.f4768o00oOo0o = this.f4770o00oOoO0;
    }

    public final void o00oOoO0(int i, T t) {
        int i2 = this.f4769o00oOoO;
        if (i > i2) {
            StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("cannot add item to ", i, " because size is ");
            o00oOOo02.append(this.f4769o00oOoO);
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        }
        T[] tArr = this.f4764o00oOOo0;
        if (i2 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, tArr.length + 10));
            System.arraycopy(this.f4764o00oOOo0, 0, tArr2, 0, i);
            tArr2[i] = t;
            System.arraycopy(this.f4764o00oOOo0, i, tArr2, i + 1, this.f4769o00oOoO - i);
            this.f4764o00oOOo0 = tArr2;
        } else {
            System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
            this.f4764o00oOOo0[i] = t;
        }
        this.f4769o00oOoO++;
    }

    public void o00oOoOO() {
        o00ooOOo();
        int i = this.f4769o00oOoO;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.f4764o00oOOo0, 0, i, (Object) null);
        this.f4769o00oOoO = 0;
        this.f4768o00oOo0o.o00oOOoO(0, i);
    }

    public final T[] o00oOoOo(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void o00oOoo0() {
        o00ooOOo();
        o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
        if (o00ooooo2 instanceof o00oOOo0) {
            ((o00oOOo0) o00ooooo2).o00oOoOO();
        }
        o00oOOoO o00ooooo3 = this.f4768o00oOo0o;
        o00oOOo0 o00oooo02 = this.f4770o00oOoO0;
        if (o00ooooo3 == o00oooo02) {
            this.f4768o00oOo0o = o00oooo02.f4774o00oo0O0;
        }
    }

    public void o00oOooO(@oo0oO0 T... tArr) {
        o00oOo0O(tArr, false);
    }

    public final int o00oOooo(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f4768o00oOo0o.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare == 0) {
                if (this.f4768o00oOo0o.o00oOo0o(t2, t)) {
                    return i4;
                }
                int o00oo0O02 = o00oo0O0(t, i4, i, i2);
                return (i3 == 1 && o00oo0O02 == -1) ? i4 : o00oo0O02;
            } else {
                i2 = i4;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o00oo(@oo0oO0 Collection<T> collection) {
        o00ooO0(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, collection.size())), true);
    }

    public T o00oo0(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.f4769o00oOoO && i >= 0) {
            T[] tArr = this.f4765o00oOOoO;
            return (tArr == null || i < (i2 = this.f4767o00oOo0O)) ? this.f4764o00oOOo0[i] : tArr[(i - i2) + this.f4766o00oOo00];
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Asked to get item at ", i, " but size is ");
        o00oOOo02.append(this.f4769o00oOoO);
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    public final int o00oo00O(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f4768o00oOo0o.o00oOo0o(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void o00oo0O(T[] tArr, int i) {
        boolean z = !(this.f4768o00oOo0o instanceof o00oOOo0);
        if (z) {
            o00oOoO();
        }
        this.f4765o00oOOoO = this.f4764o00oOOo0;
        int i2 = 0;
        this.f4766o00oOo00 = 0;
        int i3 = this.f4769o00oOoO;
        this.f4772o00oOooO = i3;
        this.f4764o00oOOo0 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, i3 + i + 10));
        this.f4767o00oOo0O = 0;
        while (true) {
            int i4 = this.f4766o00oOo00;
            int i5 = this.f4772o00oOooO;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f4764o00oOOo0, this.f4767o00oOo0O, i6);
                int i7 = this.f4767o00oOo0O + i6;
                this.f4767o00oOo0O = i7;
                this.f4769o00oOoO += i6;
                this.f4768o00oOo0o.o00oOOo0(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f4765o00oOOoO, i4, this.f4764o00oOOo0, this.f4767o00oOo0O, i8);
                this.f4767o00oOo0O += i8;
                break;
            } else {
                T t = this.f4765o00oOOoO[i4];
                T t2 = tArr[i2];
                int compare = this.f4768o00oOo0o.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f4764o00oOOo0;
                    int i9 = this.f4767o00oOo0O;
                    int i10 = i9 + 1;
                    this.f4767o00oOo0O = i10;
                    tArr2[i9] = t2;
                    this.f4769o00oOoO++;
                    i2++;
                    this.f4768o00oOo0o.o00oOOo0(i10 - 1, 1);
                } else if (compare == 0 && this.f4768o00oOo0o.o00oOo0o(t, t2)) {
                    T[] tArr3 = this.f4764o00oOOo0;
                    int i11 = this.f4767o00oOo0O;
                    this.f4767o00oOo0O = i11 + 1;
                    tArr3[i11] = t2;
                    i2++;
                    this.f4766o00oOo00++;
                    if (!this.f4768o00oOo0o.o00oOo0O(t, t2)) {
                        o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
                        o00ooooo2.o00oOo00(this.f4767o00oOo0O - 1, 1, o00ooooo2.o00oOoO0(t, t2));
                    }
                } else {
                    T[] tArr4 = this.f4764o00oOOo0;
                    int i12 = this.f4767o00oOo0O;
                    this.f4767o00oOo0O = i12 + 1;
                    tArr4[i12] = t;
                    this.f4766o00oOo00++;
                }
            }
        }
        this.f4765o00oOOoO = null;
        if (z) {
            o00oOoo0();
        }
    }

    public final int o00oo0O0(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.f4764o00oOOo0[i4];
            if (this.f4768o00oOo0o.compare(t3, t) != 0) {
                break;
            } else if (this.f4768o00oOo0o.o00oOo0o(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.f4764o00oOOo0[i];
            if (this.f4768o00oOo0o.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f4768o00oOo0o.o00oOo0o(t2, t));
        return i;
    }

    public int o00oo0OO(T t) {
        if (this.f4765o00oOOoO != null) {
            int o00oOooo2 = o00oOooo(t, this.f4764o00oOOo0, 0, this.f4767o00oOo0O, 4);
            if (o00oOooo2 != -1) {
                return o00oOooo2;
            }
            int o00oOooo3 = o00oOooo(t, this.f4765o00oOOoO, this.f4766o00oOo00, this.f4772o00oOooO, 4);
            if (o00oOooo3 != -1) {
                return (o00oOooo3 - this.f4766o00oOo00) + this.f4767o00oOo0O;
            }
            return -1;
        }
        return o00oOooo(t, this.f4764o00oOOo0, 0, this.f4769o00oOoO, 4);
    }

    public void o00oo0Oo(int i) {
        o00ooOOo();
        T o00oo02 = o00oo0(i);
        o0O0o(i, false);
        int o00oOOoO2 = o00oOOoO(o00oo02, false);
        if (i != o00oOOoO2) {
            this.f4768o00oOo0o.o00oOooO(i, o00oOOoO2);
        }
    }

    public final boolean o00oo0o(T t, boolean z) {
        int o00oOooo2 = o00oOooo(t, this.f4764o00oOOo0, 0, this.f4769o00oOoO, 2);
        if (o00oOooo2 == -1) {
            return false;
        }
        o0O0o(o00oOooo2, z);
        return true;
    }

    public boolean o00oo0o0(T t) {
        o00ooOOo();
        return o00oo0o(t, true);
    }

    public T o00oo0oO(int i) {
        o00ooOOo();
        T o00oo02 = o00oo0(i);
        o0O0o(i, true);
        return o00oo02;
    }

    public final void o00ooO() {
        this.f4769o00oOoO--;
        this.f4766o00oOo00++;
        this.f4768o00oOo0o.o00oOOoO(this.f4767o00oOo0O, 1);
    }

    public void o00ooO0(@oo0oO0 T[] tArr, boolean z) {
        o00ooOOo();
        if (z) {
            o00ooO0o(tArr);
        } else {
            o00ooO0o(o00oOoOo(tArr));
        }
    }

    public void o00ooO00(@oo0oO0 T... tArr) {
        o00ooO0(tArr, false);
    }

    public final void o00ooO0O(T t) {
        T[] tArr = this.f4764o00oOOo0;
        int i = this.f4767o00oOo0O;
        tArr[i] = t;
        int i2 = i + 1;
        this.f4767o00oOo0O = i2;
        this.f4769o00oOoO++;
        this.f4768o00oOo0o.o00oOOo0(i2 - 1, 1);
    }

    public final void o00ooO0o(@oo0oO0 T[] tArr) {
        boolean z = !(this.f4768o00oOo0o instanceof o00oOOo0);
        if (z) {
            o00oOoO();
        }
        this.f4766o00oOo00 = 0;
        this.f4772o00oOooO = this.f4769o00oOoO;
        this.f4765o00oOOoO = this.f4764o00oOOo0;
        this.f4767o00oOo0O = 0;
        int o00ooOO2 = o00ooOO(tArr);
        this.f4764o00oOOo0 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f4771o00oOoOO, o00ooOO2));
        while (true) {
            int i = this.f4767o00oOo0O;
            if (i >= o00ooOO2 && this.f4766o00oOo00 >= this.f4772o00oOooO) {
                break;
            }
            int i2 = this.f4766o00oOo00;
            int i3 = this.f4772o00oOooO;
            if (i2 >= i3) {
                int i4 = o00ooOO2 - i;
                System.arraycopy(tArr, i, this.f4764o00oOOo0, i, i4);
                this.f4767o00oOo0O += i4;
                this.f4769o00oOoO += i4;
                this.f4768o00oOo0o.o00oOOo0(i, i4);
                break;
            } else if (i >= o00ooOO2) {
                int i5 = i3 - i2;
                this.f4769o00oOoO -= i5;
                this.f4768o00oOo0o.o00oOOoO(i, i5);
                break;
            } else {
                T t = this.f4765o00oOOoO[i2];
                T t2 = tArr[i];
                int compare = this.f4768o00oOo0o.compare(t, t2);
                if (compare < 0) {
                    o00ooO();
                } else {
                    if (compare <= 0) {
                        if (this.f4768o00oOo0o.o00oOo0o(t, t2)) {
                            T[] tArr2 = this.f4764o00oOOo0;
                            int i6 = this.f4767o00oOo0O;
                            tArr2[i6] = t2;
                            this.f4766o00oOo00++;
                            this.f4767o00oOo0O = i6 + 1;
                            if (!this.f4768o00oOo0o.o00oOo0O(t, t2)) {
                                o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
                                o00ooooo2.o00oOo00(this.f4767o00oOo0O - 1, 1, o00ooooo2.o00oOoO0(t, t2));
                            }
                        } else {
                            o00ooO();
                        }
                    }
                    o00ooO0O(t2);
                }
            }
        }
        this.f4765o00oOOoO = null;
        if (z) {
            o00oOoo0();
        }
    }

    public final int o00ooOO(@oo0oO0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f4768o00oOo0o);
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f4768o00oOo0o.compare(tArr[i], t) == 0) {
                int o00oo00O2 = o00oo00O(t, tArr, i, i2);
                if (o00oo00O2 != -1) {
                    tArr[o00oo00O2] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    public int o00ooOO0() {
        return this.f4769o00oOoO;
    }

    public final void o00ooOOo() {
        if (this.f4765o00oOOoO != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void o00ooOo0(int i, T t) {
        o00ooOOo();
        T o00oo02 = o00oo0(i);
        boolean z = o00oo02 == t || !this.f4768o00oOo0o.o00oOo0O(o00oo02, t);
        if (o00oo02 != t && this.f4768o00oOo0o.compare(o00oo02, t) == 0) {
            this.f4764o00oOOo0[i] = t;
            if (z) {
                o00oOOoO o00ooooo2 = this.f4768o00oOo0o;
                o00ooooo2.o00oOo00(i, 1, o00ooooo2.o00oOoO0(o00oo02, t));
                return;
            }
            return;
        }
        if (z) {
            o00oOOoO o00ooooo3 = this.f4768o00oOo0o;
            o00ooooo3.o00oOo00(i, 1, o00ooooo3.o00oOoO0(o00oo02, t));
        }
        o0O0o(i, false);
        int o00oOOoO2 = o00oOOoO(t, false);
        if (i != o00oOOoO2) {
            this.f4768o00oOo0o.o00oOooO(i, o00oOOoO2);
        }
    }

    public final void o0O0o(int i, boolean z) {
        T[] tArr = this.f4764o00oOOo0;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f4769o00oOoO - i) - 1);
        int i2 = this.f4769o00oOoO - 1;
        this.f4769o00oOoO = i2;
        this.f4764o00oOOo0[i2] = null;
        if (z) {
            this.f4768o00oOo0o.o00oOOoO(i, 1);
        }
    }
}
