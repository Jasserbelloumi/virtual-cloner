package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0oO;
/* loaded from: classes.dex */
public class o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Comparator<o00oOo0O> f4355o00oOOo0 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<o00oOo0O> {
        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(o00oOo0O o00ooo0o2, o00oOo0O o00ooo0o3) {
            return o00ooo0o2.f4358o00oOOo0 - o00ooo0o3.f4358o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {
        public abstract boolean o00oOOo0(int i, int i2);

        public abstract boolean o00oOOoO(int i, int i2);

        @o0OO00OO
        public Object o00oOo00(int i, int i2) {
            return null;
        }

        public abstract int o00oOo0O();

        public abstract int o00oOooO();
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int[] f4356o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f4357o00oOOoO;

        public o00oOo00(int i) {
            int[] iArr = new int[i];
            this.f4356o00oOOo0 = iArr;
            this.f4357o00oOOoO = iArr.length / 2;
        }

        public int[] o00oOOo0() {
            return this.f4356o00oOOo0;
        }

        public void o00oOOoO(int i) {
            Arrays.fill(this.f4356o00oOOo0, i);
        }

        public int o00oOo00(int i) {
            return this.f4356o00oOOo0[i + this.f4357o00oOOoO];
        }

        public void o00oOooO(int i, int i2) {
            this.f4356o00oOOo0[i + this.f4357o00oOOoO] = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f4358o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f4359o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f4360o00oOo00;

        public o00oOo0O(int i, int i2, int i3) {
            this.f4358o00oOOo0 = i;
            this.f4359o00oOOoO = i2;
            this.f4360o00oOo00 = i3;
        }

        public int o00oOOo0() {
            return this.f4358o00oOOo0 + this.f4360o00oOo00;
        }

        public int o00oOOoO() {
            return this.f4359o00oOOoO + this.f4360o00oOo00;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4361o00oOoO = -1;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4362o00oOoOO = 1;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4363o00oOoOo = 2;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f4364o00oOoo0 = 4;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f4365o00oOooo = 8;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f4366o00oo0 = 4;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f4367o00oo00O = 12;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f4368o00oo0OO = 15;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<o00oOo0O> f4369o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int[] f4370o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int[] f4371o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f4372o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final int f4373o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final boolean f4374o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o00oOOoO f4375o00oOooO;

        public o00oOoO(o00oOOoO o00ooooo2, List<o00oOo0O> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4369o00oOOo0 = list;
            this.f4370o00oOOoO = iArr;
            this.f4371o00oOo00 = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4375o00oOooO = o00ooooo2;
            this.f4372o00oOo0O = o00ooooo2.o00oOo0O();
            this.f4373o00oOo0o = o00ooooo2.o00oOooO();
            this.f4374o00oOoO0 = z;
            o00oOOo0();
            o00oOoO0();
        }

        @o0OO00OO
        public static o00oo0 o00oOoOO(Collection<o00oo0> collection, int i, boolean z) {
            o00oo0 o00oo0Var;
            Iterator<o00oo0> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    o00oo0Var = null;
                    break;
                }
                o00oo0Var = it.next();
                if (o00oo0Var.f4376o00oOOo0 == i && o00oo0Var.f4378o00oOo00 == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                o00oo0 next = it.next();
                int i2 = next.f4377o00oOOoO;
                next.f4377o00oOOoO = z ? i2 - 1 : i2 + 1;
            }
            return o00oo0Var;
        }

        public final void o00oOOo0() {
            o00oOo0O o00ooo0o2 = this.f4369o00oOOo0.isEmpty() ? null : this.f4369o00oOOo0.get(0);
            if (o00ooo0o2 == null || o00ooo0o2.f4358o00oOOo0 != 0 || o00ooo0o2.f4359o00oOOoO != 0) {
                this.f4369o00oOOo0.add(0, new o00oOo0O(0, 0, 0));
            }
            this.f4369o00oOOo0.add(new o00oOo0O(this.f4372o00oOo0O, this.f4373o00oOo0o, 0));
        }

        public int o00oOOoO(@o0O0o00O(from = 0) int i) {
            if (i < 0 || i >= this.f4373o00oOo0o) {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index out of bounds - passed position = ", i, ", new list size = ");
                o00oOOo02.append(this.f4373o00oOo0o);
                throw new IndexOutOfBoundsException(o00oOOo02.toString());
            }
            int i2 = this.f4371o00oOo00[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public int o00oOo00(@o0O0o00O(from = 0) int i) {
            if (i < 0 || i >= this.f4372o00oOo0O) {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index out of bounds - passed position = ", i, ", old list size = ");
                o00oOOo02.append(this.f4372o00oOo0O);
                throw new IndexOutOfBoundsException(o00oOOo02.toString());
            }
            int i2 = this.f4370o00oOOoO[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public void o00oOo0O(@oo0oO0 RecyclerView.o00oo0OO o00oo0oo) {
            o00oOooO(new androidx.recyclerview.widget.o00oOOoO(o00oo0oo));
        }

        public final void o00oOo0o(int i) {
            int size = this.f4369o00oOOo0.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                o00oOo0O o00ooo0o2 = this.f4369o00oOOo0.get(i3);
                while (i2 < o00ooo0o2.f4359o00oOOoO) {
                    if (this.f4371o00oOo00[i2] == 0 && this.f4375o00oOooO.o00oOOoO(i, i2)) {
                        int i4 = this.f4375o00oOooO.o00oOOo0(i, i2) ? 8 : 4;
                        this.f4370o00oOOoO[i] = (i2 << 4) | i4;
                        this.f4371o00oOo00[i2] = (i << 4) | i4;
                        return;
                    }
                    i2++;
                }
                i2 = o00ooo0o2.o00oOOoO();
            }
        }

        public final void o00oOoO() {
            int i = 0;
            for (o00oOo0O o00ooo0o2 : this.f4369o00oOOo0) {
                while (i < o00ooo0o2.f4358o00oOOo0) {
                    if (this.f4370o00oOOoO[i] == 0) {
                        o00oOo0o(i);
                    }
                    i++;
                }
                i = o00ooo0o2.o00oOOo0();
            }
        }

        public final void o00oOoO0() {
            for (o00oOo0O o00ooo0o2 : this.f4369o00oOOo0) {
                for (int i = 0; i < o00ooo0o2.f4360o00oOo00; i++) {
                    int i2 = o00ooo0o2.f4358o00oOOo0 + i;
                    int i3 = o00ooo0o2.f4359o00oOOoO + i;
                    int i4 = this.f4375o00oOooO.o00oOOo0(i2, i3) ? 1 : 2;
                    this.f4370o00oOOoO[i2] = (i3 << 4) | i4;
                    this.f4371o00oOo00[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f4374o00oOoO0) {
                o00oOoO();
            }
        }

        public void o00oOooO(@oo0oO0 o0O00 o0o00) {
            int i;
            androidx.recyclerview.widget.o00oo00O o00oo00o = o0o00 instanceof androidx.recyclerview.widget.o00oo00O ? (androidx.recyclerview.widget.o00oo00O) o0o00 : new androidx.recyclerview.widget.o00oo00O(o0o00);
            int i2 = this.f4372o00oOo0O;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4372o00oOo0O;
            int i4 = this.f4373o00oOo0o;
            for (int size = this.f4369o00oOOo0.size() - 1; size >= 0; size--) {
                o00oOo0O o00ooo0o2 = this.f4369o00oOOo0.get(size);
                int o00oOOo02 = o00ooo0o2.o00oOOo0();
                int o00oOOoO2 = o00ooo0o2.o00oOOoO();
                while (true) {
                    if (i3 <= o00oOOo02) {
                        break;
                    }
                    i3--;
                    int i5 = this.f4370o00oOOoO[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        o00oo0 o00oOoOO2 = o00oOoOO(arrayDeque, i6, false);
                        if (o00oOoOO2 != null) {
                            int i7 = (i2 - o00oOoOO2.f4377o00oOOoO) - 1;
                            o00oo00o.o00oOooO(i3, i7);
                            if ((i5 & 4) != 0) {
                                o00oo00o.o00oOo00(i7, 1, this.f4375o00oOooO.o00oOo00(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new o00oo0(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        o00oo00o.o00oOOoO(i3, 1);
                        i2--;
                    }
                }
                while (i4 > o00oOOoO2) {
                    i4--;
                    int i8 = this.f4371o00oOo00[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        o00oo0 o00oOoOO3 = o00oOoOO(arrayDeque, i9, true);
                        if (o00oOoOO3 == null) {
                            arrayDeque.add(new o00oo0(i4, i2 - i3, false));
                        } else {
                            o00oo00o.o00oOooO((i2 - o00oOoOO3.f4377o00oOOoO) - 1, i3);
                            if ((i8 & 4) != 0) {
                                o00oo00o.o00oOo00(i3, 1, this.f4375o00oOooO.o00oOo00(i9, i4));
                            }
                        }
                    } else {
                        o00oo00o.o00oOOo0(i3, 1);
                        i2++;
                    }
                }
                int i10 = o00ooo0o2.f4358o00oOOo0;
                int i11 = o00ooo0o2.f4359o00oOOoO;
                for (i = 0; i < o00ooo0o2.f4360o00oOo00; i++) {
                    if ((this.f4370o00oOOoO[i10] & 15) == 2) {
                        o00oo00o.o00oOo00(i10, 1, this.f4375o00oOooO.o00oOo00(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = o00ooo0o2.f4358o00oOOo0;
                i4 = o00ooo0o2.f4359o00oOOoO;
            }
            o00oo00o.o00oOo0O();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4376o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4377o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4378o00oOo00;

        public o00oo0(int i, int i2, boolean z) {
            this.f4376o00oOOo0 = i;
            this.f4377o00oOOoO = i2;
            this.f4378o00oOo00 = z;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O<T> {
        public abstract boolean o00oOOo0(@oo0oO0 T t, @oo0oO0 T t2);

        public abstract boolean o00oOOoO(@oo0oO0 T t, @oo0oO0 T t2);

        @o0OO00OO
        public Object o00oOo00(@oo0oO0 T t, @oo0oO0 T t2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4379o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4380o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4381o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f4382o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4383o00oOooO;

        public int o00oOOo0() {
            return Math.min(this.f4381o00oOo00 - this.f4379o00oOOo0, this.f4383o00oOooO - this.f4380o00oOOoO);
        }

        public boolean o00oOOoO() {
            return this.f4383o00oOooO - this.f4380o00oOOoO != this.f4381o00oOo00 - this.f4379o00oOOo0;
        }

        public boolean o00oOo00() {
            return this.f4383o00oOooO - this.f4380o00oOOoO > this.f4381o00oOo00 - this.f4379o00oOOo0;
        }

        @oo0oO0
        public o00oOo0O o00oOooO() {
            if (o00oOOoO()) {
                return this.f4382o00oOo0O ? new o00oOo0O(this.f4379o00oOOo0, this.f4380o00oOOoO, o00oOOo0()) : o00oOo00() ? new o00oOo0O(this.f4379o00oOOo0, this.f4380o00oOOoO + 1, o00oOOo0()) : new o00oOo0O(this.f4379o00oOOo0 + 1, this.f4380o00oOOoO, o00oOOo0());
            }
            int i = this.f4379o00oOOo0;
            return new o00oOo0O(i, this.f4380o00oOOoO, this.f4381o00oOo00 - i);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4384o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4385o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4386o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4387o00oOooO;

        public o00oo0OO() {
        }

        public o00oo0OO(int i, int i2, int i3, int i4) {
            this.f4384o00oOOo0 = i;
            this.f4385o00oOOoO = i2;
            this.f4386o00oOo00 = i3;
            this.f4387o00oOooO = i4;
        }

        public int o00oOOo0() {
            return this.f4387o00oOooO - this.f4386o00oOo00;
        }

        public int o00oOOoO() {
            return this.f4385o00oOOoO - this.f4384o00oOOo0;
        }
    }

    @o0OO00OO
    public static o00oo0O0 o00oOOo0(o00oo0OO o00oo0oo, o00oOOoO o00ooooo2, o00oOo00 o00ooo002, o00oOo00 o00ooo003, int i) {
        int o00oOo002;
        int i2;
        int i3;
        boolean z = (o00oo0oo.o00oOOoO() - o00oo0oo.o00oOOo0()) % 2 == 0;
        int o00oOOoO2 = o00oo0oo.o00oOOoO() - o00oo0oo.o00oOOo0();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 == i4 || (i5 != i && o00ooo003.o00oOo00(i5 + 1) < o00ooo003.o00oOo00(i5 - 1))) {
                o00oOo002 = o00ooo003.o00oOo00(i5 + 1);
                i2 = o00oOo002;
            } else {
                o00oOo002 = o00ooo003.o00oOo00(i5 - 1);
                i2 = o00oOo002 - 1;
            }
            int i6 = o00oo0oo.f4387o00oOooO - ((o00oo0oo.f4385o00oOOoO - i2) - i5);
            int i7 = (i == 0 || i2 != o00oOo002) ? i6 : i6 + 1;
            while (i2 > o00oo0oo.f4384o00oOOo0 && i6 > o00oo0oo.f4386o00oOo00 && o00ooooo2.o00oOOoO(i2 - 1, i6 - 1)) {
                i2--;
                i6--;
            }
            o00ooo003.o00oOooO(i5, i2);
            if (z && (i3 = o00oOOoO2 - i5) >= i4 && i3 <= i && o00ooo002.o00oOo00(i3) >= i2) {
                o00oo0O0 o00oo0o02 = new o00oo0O0();
                o00oo0o02.f4379o00oOOo0 = i2;
                o00oo0o02.f4380o00oOOoO = i6;
                o00oo0o02.f4381o00oOo00 = o00oOo002;
                o00oo0o02.f4383o00oOooO = i7;
                o00oo0o02.f4382o00oOo0O = true;
                return o00oo0o02;
            }
        }
        return null;
    }

    @oo0oO0
    public static o00oOoO o00oOOoO(@oo0oO0 o00oOOoO o00ooooo2) {
        return o00oOo00(o00ooooo2, true);
    }

    @oo0oO0
    public static o00oOoO o00oOo00(@oo0oO0 o00oOOoO o00ooooo2, boolean z) {
        int o00oOo0O2 = o00ooooo2.o00oOo0O();
        int o00oOooO2 = o00ooooo2.o00oOooO();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new o00oo0OO(0, o00oOo0O2, 0, o00oOooO2));
        int i = ((((o00oOo0O2 + o00oOooO2) + 1) / 2) * 2) + 1;
        o00oOo00 o00ooo002 = new o00oOo00(i);
        o00oOo00 o00ooo003 = new o00oOo00(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            o00oo0OO o00oo0oo = (o00oo0OO) arrayList2.remove(arrayList2.size() - 1);
            o00oo0O0 o00oOo0O3 = o00oOo0O(o00oo0oo, o00ooooo2, o00ooo002, o00ooo003);
            if (o00oOo0O3 != null) {
                if (o00oOo0O3.o00oOOo0() > 0) {
                    arrayList.add(o00oOo0O3.o00oOooO());
                }
                o00oo0OO o00oo0oo2 = arrayList3.isEmpty() ? new o00oo0OO() : (o00oo0OO) arrayList3.remove(arrayList3.size() - 1);
                o00oo0oo2.f4384o00oOOo0 = o00oo0oo.f4384o00oOOo0;
                o00oo0oo2.f4386o00oOo00 = o00oo0oo.f4386o00oOo00;
                o00oo0oo2.f4385o00oOOoO = o00oOo0O3.f4379o00oOOo0;
                o00oo0oo2.f4387o00oOooO = o00oOo0O3.f4380o00oOOoO;
                arrayList2.add(o00oo0oo2);
                o00oo0oo.f4385o00oOOoO = o00oo0oo.f4385o00oOOoO;
                o00oo0oo.f4387o00oOooO = o00oo0oo.f4387o00oOooO;
                o00oo0oo.f4384o00oOOo0 = o00oOo0O3.f4381o00oOo00;
                o00oo0oo.f4386o00oOo00 = o00oOo0O3.f4383o00oOooO;
                arrayList2.add(o00oo0oo);
            } else {
                arrayList3.add(o00oo0oo);
            }
        }
        Collections.sort(arrayList, f4355o00oOOo0);
        return new o00oOoO(o00ooooo2, arrayList, o00ooo002.f4356o00oOOo0, o00ooo003.f4356o00oOOo0, z);
    }

    @o0OO00OO
    public static o00oo0O0 o00oOo0O(o00oo0OO o00oo0oo, o00oOOoO o00ooooo2, o00oOo00 o00ooo002, o00oOo00 o00ooo003) {
        if (o00oo0oo.o00oOOoO() >= 1 && o00oo0oo.o00oOOo0() >= 1) {
            int o00oOOo02 = ((o00oo0oo.o00oOOo0() + o00oo0oo.o00oOOoO()) + 1) / 2;
            o00ooo002.o00oOooO(1, o00oo0oo.f4384o00oOOo0);
            o00ooo003.o00oOooO(1, o00oo0oo.f4385o00oOOoO);
            for (int i = 0; i < o00oOOo02; i++) {
                o00oo0O0 o00oOooO2 = o00oOooO(o00oo0oo, o00ooooo2, o00ooo002, o00ooo003, i);
                if (o00oOooO2 != null) {
                    return o00oOooO2;
                }
                o00oo0O0 o00oOOo03 = o00oOOo0(o00oo0oo, o00ooooo2, o00ooo002, o00ooo003, i);
                if (o00oOOo03 != null) {
                    return o00oOOo03;
                }
            }
        }
        return null;
    }

    @o0OO00OO
    public static o00oo0O0 o00oOooO(o00oo0OO o00oo0oo, o00oOOoO o00ooooo2, o00oOo00 o00ooo002, o00oOo00 o00ooo003, int i) {
        int o00oOo002;
        int i2;
        int i3;
        boolean z = Math.abs(o00oo0oo.o00oOOoO() - o00oo0oo.o00oOOo0()) % 2 == 1;
        int o00oOOoO2 = o00oo0oo.o00oOOoO() - o00oo0oo.o00oOOo0();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 == i4 || (i5 != i && o00ooo002.o00oOo00(i5 + 1) > o00ooo002.o00oOo00(i5 - 1))) {
                o00oOo002 = o00ooo002.o00oOo00(i5 + 1);
                i2 = o00oOo002;
            } else {
                o00oOo002 = o00ooo002.o00oOo00(i5 - 1);
                i2 = o00oOo002 + 1;
            }
            int i6 = ((i2 - o00oo0oo.f4384o00oOOo0) + o00oo0oo.f4386o00oOo00) - i5;
            int i7 = (i == 0 || i2 != o00oOo002) ? i6 : i6 - 1;
            while (i2 < o00oo0oo.f4385o00oOOoO && i6 < o00oo0oo.f4387o00oOooO && o00ooooo2.o00oOOoO(i2, i6)) {
                i2++;
                i6++;
            }
            o00ooo002.o00oOooO(i5, i2);
            if (z && (i3 = o00oOOoO2 - i5) >= i4 + 1 && i3 <= i - 1 && o00ooo003.o00oOo00(i3) <= i2) {
                o00oo0O0 o00oo0o02 = new o00oo0O0();
                o00oo0o02.f4379o00oOOo0 = o00oOo002;
                o00oo0o02.f4380o00oOOoO = i7;
                o00oo0o02.f4381o00oOo00 = i2;
                o00oo0o02.f4383o00oOooO = i6;
                o00oo0o02.f4382o00oOo0O = false;
                return o00oo0o02;
            }
        }
        return null;
    }
}
