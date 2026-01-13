package o00ooOO0;

import java.util.ArrayList;
import java.util.Iterator;
import o00oOoO0.o00oOoO;
import o00ooO.o00oo00O;
/* loaded from: classes.dex */
public class o0O00OO {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f8902o00oOoO = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f8903o00oOoOO = 1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f8904o00oOoOo = 2;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static int f8905o00oOoo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O00o00 f8908o00oOo00;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8910o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f8911o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O00o00 f8912o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f8906o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f8907o00oOOoO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<o0O00o00> f8909o00oOo0O = new ArrayList<>();

    public o0O00OO(o0O00o00 o0o00o00, int i) {
        this.f8908o00oOo00 = null;
        this.f8912o00oOooO = null;
        int i2 = f8905o00oOoo0;
        this.f8910o00oOo0o = i2;
        f8905o00oOoo0 = i2 + 1;
        this.f8908o00oOo00 = o0o00o00;
        this.f8912o00oOooO = o0o00o00;
        this.f8911o00oOoO0 = i;
    }

    public void o00oOOo0(o0O00o00 o0o00o00) {
        this.f8909o00oOo0O.add(o0o00o00);
        this.f8912o00oOooO = o0o00o00;
    }

    public long o00oOOoO(o00oo00O o00oo00o, int i) {
        long j;
        long j2;
        o0O00o00 o0o00o00 = this.f8908o00oOo00;
        if (o0o00o00 instanceof o0O0000O) {
            if (((o0O0000O) o0o00o00).f8920o00oOo0o != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(o0o00o00 instanceof o0O00O)) {
                return 0L;
            }
        } else if (!(o0o00o00 instanceof o0O00OOO)) {
            return 0L;
        }
        o0O000Oo o0o000oo = (i == 0 ? o00oo00o.f7672o00oOo0O : o00oo00o.f7673o00oOo0o).f8921o00oOoO;
        o0O000Oo o0o000oo2 = (i == 0 ? o00oo00o.f7672o00oOo0O : o00oo00o.f7673o00oOo0o).f8923o00oOoOO;
        boolean contains = o0o00o00.f8921o00oOoO.f8896o00oOooo.contains(o0o000oo);
        boolean contains2 = this.f8908o00oOo00.f8923o00oOoOO.f8896o00oOooo.contains(o0o000oo2);
        long o00oOoOo2 = this.f8908o00oOo00.o00oOoOo();
        if (!contains || !contains2) {
            if (contains) {
                o0O000Oo o0o000oo3 = this.f8908o00oOo00.f8921o00oOoO;
                j2 = o00oOo0o(o0o000oo3, o0o000oo3.f8889o00oOo0o);
                j = this.f8908o00oOo00.f8921o00oOoO.f8889o00oOo0o + o00oOoOo2;
            } else if (!contains2) {
                o0O00o00 o0o00o002 = this.f8908o00oOo00;
                return (o0o00o002.o00oOoOo() + o0o00o002.f8921o00oOoO.f8889o00oOo0o) - this.f8908o00oOo00.f8923o00oOoOO.f8889o00oOo0o;
            } else {
                o0O000Oo o0o000oo4 = this.f8908o00oOo00.f8923o00oOoOO;
                long o00oOo0O2 = o00oOo0O(o0o000oo4, o0o000oo4.f8889o00oOo0o);
                j = (-this.f8908o00oOo00.f8923o00oOoOO.f8889o00oOo0o) + o00oOoOo2;
                j2 = -o00oOo0O2;
            }
            return Math.max(j2, j);
        }
        long o00oOo0o2 = o00oOo0o(this.f8908o00oOo00.f8921o00oOoO, 0L);
        long o00oOo0O3 = o00oOo0O(this.f8908o00oOo00.f8923o00oOoOO, 0L);
        long j3 = o00oOo0o2 - o00oOoOo2;
        o0O00o00 o0o00o003 = this.f8908o00oOo00;
        int i2 = o0o00o003.f8923o00oOoOO.f8889o00oOo0o;
        if (j3 >= (-i2)) {
            j3 += i2;
        }
        int i3 = o0o00o003.f8921o00oOoO.f8889o00oOo0o;
        long j4 = ((-o00oOo0O3) - o00oOoOo2) - i3;
        if (j4 >= i3) {
            j4 -= i3;
        }
        float o00oo0oO2 = o0o00o003.f8917o00oOOoO.o00oo0oO(i);
        float f = (float) (o00oo0oO2 > 0.0f ? (((float) j3) / (1.0f - o00oo0oO2)) + (((float) j4) / o00oo0oO2) : 0L);
        long o00oOOo02 = (f * o00oo0oO2) + 0.5f + o00oOoOo2 + o00oOoO.o00oOOo0(1.0f, o00oo0oO2, f, 0.5f);
        o0O00o00 o0o00o004 = this.f8908o00oOo00;
        return (o0o00o004.f8921o00oOoO.f8889o00oOo0o + o00oOOo02) - o0o00o004.f8923o00oOoOO.f8889o00oOo0o;
    }

    public final boolean o00oOo00(o0O00o00 o0o00o00, int i) {
        o0O000Oo o0o000oo;
        o0O00o00 o0o00o002;
        o0O000Oo o0o000oo2;
        o0O00o00 o0o00o003;
        if (o0o00o00.f8917o00oOOoO.f7675o00oOoO0[i]) {
            for (o0O000 o0o000 : o0o00o00.f8921o00oOoO.f8894o00oOoo0) {
                if ((o0o000 instanceof o0O000Oo) && (o0o00o003 = (o0o000oo2 = (o0O000Oo) o0o000).f8895o00oOooO) != o0o00o00 && o0o000oo2 == o0o00o003.f8921o00oOoO) {
                    if (o0o00o00 instanceof o0O0000O) {
                        Iterator<o0O00o00> it = ((o0O0000O) o0o00o00).f8883o00oOoo0.iterator();
                        while (it.hasNext()) {
                            o00oOo00(it.next(), i);
                        }
                    } else if (!(o0o00o00 instanceof o0O00O0o)) {
                        o0o00o00.f8917o00oOOoO.f7675o00oOoO0[i] = false;
                    }
                    o00oOo00(o0o000oo2.f8895o00oOooO, i);
                }
            }
            for (o0O000 o0o0002 : o0o00o00.f8923o00oOoOO.f8894o00oOoo0) {
                if ((o0o0002 instanceof o0O000Oo) && (o0o00o002 = (o0o000oo = (o0O000Oo) o0o0002).f8895o00oOooO) != o0o00o00 && o0o000oo == o0o00o002.f8921o00oOoO) {
                    if (o0o00o00 instanceof o0O0000O) {
                        Iterator<o0O00o00> it2 = ((o0O0000O) o0o00o00).f8883o00oOoo0.iterator();
                        while (it2.hasNext()) {
                            o00oOo00(it2.next(), i);
                        }
                    } else if (!(o0o00o00 instanceof o0O00O0o)) {
                        o0o00o00.f8917o00oOOoO.f7675o00oOoO0[i] = false;
                    }
                    o00oOo00(o0o000oo.f8895o00oOooO, i);
                }
            }
            return false;
        }
        return false;
    }

    public final long o00oOo0O(o0O000Oo o0o000oo, long j) {
        o0O00o00 o0o00o00 = o0o000oo.f8895o00oOooO;
        if (o0o00o00 instanceof o0O00O0o) {
            return j;
        }
        int size = o0o000oo.f8894o00oOoo0.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            o0O000 o0o000 = o0o000oo.f8894o00oOoo0.get(i);
            if (o0o000 instanceof o0O000Oo) {
                o0O000Oo o0o000oo2 = (o0O000Oo) o0o000;
                if (o0o000oo2.f8895o00oOooO != o0o00o00) {
                    j2 = Math.min(j2, o00oOo0O(o0o000oo2, o0o000oo2.f8889o00oOo0o + j));
                }
            }
        }
        if (o0o000oo == o0o00o00.f8923o00oOoOO) {
            long o00oOoOo2 = j - o0o00o00.o00oOoOo();
            return Math.min(Math.min(j2, o00oOo0O(o0o00o00.f8921o00oOoO, o00oOoOo2)), o00oOoOo2 - o0o00o00.f8921o00oOoO.f8889o00oOo0o);
        }
        return j2;
    }

    public final long o00oOo0o(o0O000Oo o0o000oo, long j) {
        o0O00o00 o0o00o00 = o0o000oo.f8895o00oOooO;
        if (o0o00o00 instanceof o0O00O0o) {
            return j;
        }
        int size = o0o000oo.f8894o00oOoo0.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            o0O000 o0o000 = o0o000oo.f8894o00oOoo0.get(i);
            if (o0o000 instanceof o0O000Oo) {
                o0O000Oo o0o000oo2 = (o0O000Oo) o0o000;
                if (o0o000oo2.f8895o00oOooO != o0o00o00) {
                    j2 = Math.max(j2, o00oOo0o(o0o000oo2, o0o000oo2.f8889o00oOo0o + j));
                }
            }
        }
        if (o0o000oo == o0o00o00.f8921o00oOoO) {
            long o00oOoOo2 = j + o0o00o00.o00oOoOo();
            return Math.max(Math.max(j2, o00oOo0o(o0o00o00.f8923o00oOoOO, o00oOoOo2)), o00oOoOo2 - o0o00o00.f8923o00oOoOO.f8889o00oOo0o);
        }
        return j2;
    }

    public void o00oOooO(boolean z, boolean z2) {
        if (z) {
            o0O00o00 o0o00o00 = this.f8908o00oOo00;
            if (o0o00o00 instanceof o0O00O) {
                o00oOo00(o0o00o00, 0);
            }
        }
        if (z2) {
            o0O00o00 o0o00o002 = this.f8908o00oOo00;
            if (o0o00o002 instanceof o0O00OOO) {
                o00oOo00(o0o00o002, 1);
            }
        }
    }
}
