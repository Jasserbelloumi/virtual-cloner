package o00ooOO0;

import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o00oOoOo.o00oo;
import o00ooO.o00oOOo0;
import o00ooO.o00oOoO;
import o00ooO.o00oo00O;
import o00ooO.o00oo0O;
import o00ooO.o00oo0OO;
import o00ooOO0.o0O00000;
/* loaded from: classes.dex */
public class o0OoOoOo {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final boolean f8927o00oOoOo = true;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo00O f8928o00oOOo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oo00O f8936o00oOooO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f8929o00oOOoO = true;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f8930o00oOo00 = true;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<o0O00o00> f8931o00oOo0O = new ArrayList<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public ArrayList<o0O00OO> f8932o00oOo0o = new ArrayList<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O00000.o00oOOoO f8934o00oOoO0 = null;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o0O00000.o00oOOo0 f8933o00oOoO = new o0O00000.o00oOOo0();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public ArrayList<o0O00OO> f8935o00oOoOO = new ArrayList<>();

    public o0OoOoOo(o00oo00O o00oo00o) {
        this.f8928o00oOOo0 = o00oo00o;
        this.f8936o00oOooO = o00oo00o;
    }

    public final void o00oOOo0(o0O000Oo o0o000oo, int i, int i2, o0O000Oo o0o000oo2, ArrayList<o0O00OO> arrayList, o0O00OO o0o00oo) {
        o0O00o00 o0o00o00 = o0o000oo.f8895o00oOooO;
        if (o0o00o00.f8918o00oOo00 == null) {
            o00oo00O o00oo00o = this.f8928o00oOOo0;
            if (o0o00o00 == o00oo00o.f7672o00oOo0O || o0o00o00 == o00oo00o.f7673o00oOo0o) {
                return;
            }
            if (o0o00oo == null) {
                o0o00oo = new o0O00OO(o0o00o00, i2);
                arrayList.add(o0o00oo);
            }
            o0o00o00.f8918o00oOo00 = o0o00oo;
            o0o00oo.o00oOOo0(o0o00o00);
            for (o0O000 o0o000 : o0o00o00.f8921o00oOoO.f8894o00oOoo0) {
                if (o0o000 instanceof o0O000Oo) {
                    o00oOOo0((o0O000Oo) o0o000, i, 0, o0o000oo2, arrayList, o0o00oo);
                }
            }
            for (o0O000 o0o0002 : o0o00o00.f8923o00oOoOO.f8894o00oOoo0) {
                if (o0o0002 instanceof o0O000Oo) {
                    o00oOOo0((o0O000Oo) o0o0002, i, 1, o0o000oo2, arrayList, o0o00oo);
                }
            }
            if (i == 1 && (o0o00o00 instanceof o0O00OOO)) {
                for (o0O000 o0o0003 : ((o0O00OOO) o0o00o00).f8913o00oOoo0.f8894o00oOoo0) {
                    if (o0o0003 instanceof o0O000Oo) {
                        o00oOOo0((o0O000Oo) o0o0003, i, 2, o0o000oo2, arrayList, o0o00oo);
                    }
                }
            }
            for (o0O000Oo o0o000oo3 : o0o00o00.f8921o00oOoO.f8896o00oOooo) {
                if (o0o000oo3 == o0o000oo2) {
                    o0o00oo.f8907o00oOOoO = true;
                }
                o00oOOo0(o0o000oo3, i, 0, o0o000oo2, arrayList, o0o00oo);
            }
            for (o0O000Oo o0o000oo4 : o0o00o00.f8923o00oOoOO.f8896o00oOooo) {
                if (o0o000oo4 == o0o000oo2) {
                    o0o00oo.f8907o00oOOoO = true;
                }
                o00oOOo0(o0o000oo4, i, 1, o0o000oo2, arrayList, o0o00oo);
            }
            if (i == 1 && (o0o00o00 instanceof o0O00OOO)) {
                for (o0O000Oo o0o000oo5 : ((o0O00OOO) o0o00o00).f8913o00oOoo0.f8896o00oOooo) {
                    o00oOOo0(o0o000oo5, i, 2, o0o000oo2, arrayList, o0o00oo);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r2.f7684o00oo0O == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o00oOOoO(o00ooO.o00oo00O r17) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0OoOoOo.o00oOOoO(o00ooO.o00oo00O):boolean");
    }

    public void o00oOo00() {
        o00oOooO(this.f8931o00oOo0O);
        this.f8935o00oOoOO.clear();
        o0O00OO.f8905o00oOoo0 = 0;
        o00oOoo0(this.f8928o00oOOo0.f7672o00oOo0O, 0, this.f8935o00oOoOO);
        o00oOoo0(this.f8928o00oOOo0.f7673o00oOo0o, 1, this.f8935o00oOoOO);
        this.f8929o00oOOoO = false;
    }

    public final int o00oOo0O(o00oo00O o00oo00o, int i) {
        int size = this.f8935o00oOoOO.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f8935o00oOoOO.get(i2).o00oOOoO(o00oo00o, i));
        }
        return (int) j;
    }

    public void o00oOo0o(o00oOoO.o00oOOoO o00ooooo2, o00oOoO.o00oOOoO o00ooooo3) {
        if (this.f8929o00oOOoO) {
            o00oOo00();
            Iterator<o00oOoO> it = this.f8928o00oOOo0.f7867o0O0o0oo.iterator();
            boolean z = false;
            while (it.hasNext()) {
                o00oOoO next = it.next();
                boolean[] zArr = next.f7675o00oOoO0;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof o00oOOo0) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Iterator<o0O00OO> it2 = this.f8935o00oOoOO.iterator();
            while (it2.hasNext()) {
                o0O00OO next2 = it2.next();
                o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.WRAP_CONTENT;
                next2.o00oOooO(o00ooooo2 == o00ooooo4, o00ooooo3 == o00ooooo4);
            }
        }
    }

    public boolean o00oOoO(boolean z) {
        if (this.f8929o00oOOoO) {
            Iterator<o00oOoO> it = this.f8928o00oOOo0.f7867o0O0o0oo.iterator();
            while (it.hasNext()) {
                o00oOoO next = it.next();
                next.o00oo0O();
                next.f7669o00oOOo0 = false;
                o0O00O o0o00o = next.f7672o00oOo0O;
                o0o00o.f8919o00oOo0O.f8893o00oOoOo = false;
                o0o00o.f8922o00oOoO0 = false;
                o0o00o.o00oo0();
                o0O00OOO o0o00ooo = next.f7673o00oOo0o;
                o0o00ooo.f8919o00oOo0O.f8893o00oOoOo = false;
                o0o00ooo.f8922o00oOoO0 = false;
                o0o00ooo.o00oo0();
            }
            this.f8928o00oOOo0.o00oo0O();
            o00oo00O o00oo00o = this.f8928o00oOOo0;
            o00oo00o.f7669o00oOOo0 = false;
            o0O00O o0o00o2 = o00oo00o.f7672o00oOo0O;
            o0o00o2.f8919o00oOo0O.f8893o00oOoOo = false;
            o0o00o2.f8922o00oOoO0 = false;
            o0o00o2.o00oo0();
            o0O00OOO o0o00ooo2 = this.f8928o00oOOo0.f7673o00oOo0o;
            o0o00ooo2.f8919o00oOo0O.f8893o00oOoOo = false;
            o0o00ooo2.f8922o00oOoO0 = false;
            o0o00ooo2.o00oo0();
            o00oOo00();
        }
        if (o00oOOoO(this.f8936o00oOooO)) {
            return false;
        }
        this.f8928o00oOOo0.o0O0ooo(0);
        this.f8928o00oOOo0.o0O0oooO(0);
        this.f8928o00oOOo0.f7672o00oOo0O.f8921o00oOoO.o00oOo0O(0);
        this.f8928o00oOOo0.f7673o00oOo0o.f8921o00oOoO.o00oOo0O(0);
        return true;
    }

    public boolean o00oOoO0(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f8929o00oOOoO || this.f8930o00oOo00) {
            Iterator<o00oOoO> it = this.f8928o00oOOo0.f7867o0O0o0oo.iterator();
            while (it.hasNext()) {
                o00oOoO next = it.next();
                next.o00oo0O();
                next.f7669o00oOOo0 = false;
                next.f7672o00oOo0O.o00oo0();
                next.f7673o00oOo0o.o00oo0();
            }
            this.f8928o00oOOo0.o00oo0O();
            o00oo00O o00oo00o = this.f8928o00oOOo0;
            o00oo00o.f7669o00oOOo0 = false;
            o00oo00o.f7672o00oOo0O.o00oo0();
            this.f8928o00oOOo0.f7673o00oOo0o.o00oo0();
            this.f8930o00oOo00 = false;
        }
        if (o00oOOoO(this.f8936o00oOooO)) {
            return false;
        }
        this.f8928o00oOOo0.o0O0ooo(0);
        this.f8928o00oOOo0.o0O0oooO(0);
        o00oOoO.o00oOOoO o00ooO0O2 = this.f8928o00oOOo0.o00ooO0O(0);
        o00oOoO.o00oOOoO o00ooO0O3 = this.f8928o00oOOo0.o00ooO0O(1);
        if (this.f8929o00oOOoO) {
            o00oOo00();
        }
        int o0O00O0o2 = this.f8928o00oOOo0.o0O00O0o();
        int o0O00O2 = this.f8928o00oOOo0.o0O00O();
        this.f8928o00oOOo0.f7672o00oOo0O.f8921o00oOoO.o00oOo0O(o0O00O0o2);
        this.f8928o00oOOo0.f7673o00oOo0o.f8921o00oOoO.o00oOo0O(o0O00O2);
        o00oo0o0();
        o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.WRAP_CONTENT;
        if (o00ooO0O2 == o00ooooo2 || o00ooO0O3 == o00ooooo2) {
            if (z4) {
                Iterator<o0O00o00> it2 = this.f8931o00oOo0O.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().o00oo0O0()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && o00ooO0O2 == o00oOoO.o00oOOoO.WRAP_CONTENT) {
                this.f8928o00oOOo0.o0O0o0OO(o00oOoO.o00oOOoO.FIXED);
                o00oo00O o00oo00o2 = this.f8928o00oOOo0;
                o00oo00o2.o0O0ooOO(o00oOo0O(o00oo00o2, 0));
                o00oo00O o00oo00o3 = this.f8928o00oOOo0;
                o00oo00o3.f7672o00oOo0O.f8919o00oOo0O.o00oOo0O(o00oo00o3.o0OoO00O());
            }
            if (z4 && o00ooO0O3 == o00oOoO.o00oOOoO.WRAP_CONTENT) {
                this.f8928o00oOOo0.o0O0oOoo(o00oOoO.o00oOOoO.FIXED);
                o00oo00O o00oo00o4 = this.f8928o00oOOo0;
                o00oo00o4.o0O0o00(o00oOo0O(o00oo00o4, 1));
                o00oo00O o00oo00o5 = this.f8928o00oOOo0;
                o00oo00o5.f7673o00oOo0o.f8919o00oOo0O.o00oOo0O(o00oo00o5.o00ooOO());
            }
        }
        o00oo00O o00oo00o6 = this.f8928o00oOOo0;
        o00oOoO.o00oOOoO o00ooooo3 = o00oo00o6.f7668o0[0];
        o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.FIXED;
        if (o00ooooo3 == o00ooooo4 || o00ooooo3 == o00oOoO.o00oOOoO.MATCH_PARENT) {
            int o0OoO00O2 = o00oo00o6.o0OoO00O() + o0O00O0o2;
            this.f8928o00oOOo0.f7672o00oOo0O.f8923o00oOoOO.o00oOo0O(o0OoO00O2);
            this.f8928o00oOOo0.f7672o00oOo0O.f8919o00oOo0O.o00oOo0O(o0OoO00O2 - o0O00O0o2);
            o00oo0o0();
            o00oo00O o00oo00o7 = this.f8928o00oOOo0;
            o00oOoO.o00oOOoO o00ooooo5 = o00oo00o7.f7668o0[1];
            if (o00ooooo5 == o00ooooo4 || o00ooooo5 == o00oOoO.o00oOOoO.MATCH_PARENT) {
                int o00ooOO2 = o00oo00o7.o00ooOO() + o0O00O2;
                this.f8928o00oOOo0.f7673o00oOo0o.f8923o00oOoOO.o00oOo0O(o00ooOO2);
                this.f8928o00oOOo0.f7673o00oOo0o.f8919o00oOo0O.o00oOo0O(o00ooOO2 - o0O00O2);
            }
            o00oo0o0();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<o0O00o00> it3 = this.f8931o00oOo0O.iterator();
        while (it3.hasNext()) {
            o0O00o00 next2 = it3.next();
            if (next2.f8917o00oOOoO != this.f8928o00oOOo0 || next2.f8922o00oOoO0) {
                next2.o00oOo0O();
            }
        }
        Iterator<o0O00o00> it4 = this.f8931o00oOo0O.iterator();
        while (it4.hasNext()) {
            o0O00o00 next3 = it4.next();
            if (z2 || next3.f8917o00oOOoO != this.f8928o00oOOo0) {
                if (!next3.f8921o00oOoO.f8893o00oOoOo || ((!next3.f8923o00oOoOO.f8893o00oOoOo && !(next3 instanceof o0OoO00O)) || (!next3.f8919o00oOo0O.f8893o00oOoOo && !(next3 instanceof o0O0000O) && !(next3 instanceof o0OoO00O)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f8928o00oOOo0.o0O0o0OO(o00ooO0O2);
        this.f8928o00oOOo0.o0O0oOoo(o00ooO0O3);
        return z3;
    }

    public boolean o00oOoOO(boolean z, int i) {
        boolean z2;
        o00oOoO.o00oOOoO o00ooooo2;
        o0O000o0 o0o000o0;
        int o00ooOO2;
        boolean z3 = true;
        boolean z4 = z & true;
        o00oOoO.o00oOOoO o00ooO0O2 = this.f8928o00oOOo0.o00ooO0O(0);
        o00oOoO.o00oOOoO o00ooO0O3 = this.f8928o00oOOo0.o00ooO0O(1);
        int o0O00O0o2 = this.f8928o00oOOo0.o0O00O0o();
        int o0O00O2 = this.f8928o00oOOo0.o0O00O();
        if (z4 && (o00ooO0O2 == (o00ooooo2 = o00oOoO.o00oOOoO.WRAP_CONTENT) || o00ooO0O3 == o00ooooo2)) {
            Iterator<o0O00o00> it = this.f8931o00oOo0O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o0O00o00 next = it.next();
                if (next.f8920o00oOo0o == i && !next.o00oo0O0()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && o00ooO0O2 == o00oOoO.o00oOOoO.WRAP_CONTENT) {
                    this.f8928o00oOOo0.o0O0o0OO(o00oOoO.o00oOOoO.FIXED);
                    o00oo00O o00oo00o = this.f8928o00oOOo0;
                    o00oo00o.o0O0ooOO(o00oOo0O(o00oo00o, 0));
                    o00oo00O o00oo00o2 = this.f8928o00oOOo0;
                    o0o000o0 = o00oo00o2.f7672o00oOo0O.f8919o00oOo0O;
                    o00ooOO2 = o00oo00o2.o0OoO00O();
                    o0o000o0.o00oOo0O(o00ooOO2);
                }
            } else if (z4 && o00ooO0O3 == o00oOoO.o00oOOoO.WRAP_CONTENT) {
                this.f8928o00oOOo0.o0O0oOoo(o00oOoO.o00oOOoO.FIXED);
                o00oo00O o00oo00o3 = this.f8928o00oOOo0;
                o00oo00o3.o0O0o00(o00oOo0O(o00oo00o3, 1));
                o00oo00O o00oo00o4 = this.f8928o00oOOo0;
                o0o000o0 = o00oo00o4.f7673o00oOo0o.f8919o00oOo0O;
                o00ooOO2 = o00oo00o4.o00ooOO();
                o0o000o0.o00oOo0O(o00ooOO2);
            }
        }
        o00oo00O o00oo00o5 = this.f8928o00oOOo0;
        if (i == 0) {
            o00oOoO.o00oOOoO o00ooooo3 = o00oo00o5.f7668o0[0];
            if (o00ooooo3 == o00oOoO.o00oOOoO.FIXED || o00ooooo3 == o00oOoO.o00oOOoO.MATCH_PARENT) {
                int o0OoO00O2 = o00oo00o5.o0OoO00O() + o0O00O0o2;
                this.f8928o00oOOo0.f7672o00oOo0O.f8923o00oOoOO.o00oOo0O(o0OoO00O2);
                this.f8928o00oOOo0.f7672o00oOo0O.f8919o00oOo0O.o00oOo0O(o0OoO00O2 - o0O00O0o2);
                z2 = true;
            }
            z2 = false;
        } else {
            o00oOoO.o00oOOoO o00ooooo4 = o00oo00o5.f7668o0[1];
            if (o00ooooo4 == o00oOoO.o00oOOoO.FIXED || o00ooooo4 == o00oOoO.o00oOOoO.MATCH_PARENT) {
                int o00ooOO3 = o00oo00o5.o00ooOO() + o0O00O2;
                this.f8928o00oOOo0.f7673o00oOo0o.f8923o00oOoOO.o00oOo0O(o00ooOO3);
                this.f8928o00oOOo0.f7673o00oOo0o.f8919o00oOo0O.o00oOo0O(o00ooOO3 - o0O00O2);
                z2 = true;
            }
            z2 = false;
        }
        o00oo0o0();
        Iterator<o0O00o00> it2 = this.f8931o00oOo0O.iterator();
        while (it2.hasNext()) {
            o0O00o00 next2 = it2.next();
            if (next2.f8920o00oOo0o == i && (next2.f8917o00oOOoO != this.f8928o00oOOo0 || next2.f8922o00oOoO0)) {
                next2.o00oOo0O();
            }
        }
        Iterator<o0O00o00> it3 = this.f8931o00oOo0O.iterator();
        while (it3.hasNext()) {
            o0O00o00 next3 = it3.next();
            if (next3.f8920o00oOo0o == i && (z2 || next3.f8917o00oOOoO != this.f8928o00oOOo0)) {
                if (!next3.f8921o00oOoO.f8893o00oOoOo || !next3.f8923o00oOoOO.f8893o00oOoOo || (!(next3 instanceof o0O0000O) && !next3.f8919o00oOo0O.f8893o00oOoOo)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f8928o00oOOo0.o0O0o0OO(o00ooO0O2);
        this.f8928o00oOOo0.o0O0oOoo(o00ooO0O3);
        return z3;
    }

    public final void o00oOoOo() {
        Iterator<o0O00o00> it = this.f8931o00oOo0O.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = o00oo00O(it.next(), str);
        }
        String o00oOOo02 = o00oo.o00oOOo0(str, "\n}\n");
        PrintStream printStream = System.out;
        printStream.println("content:<<\n" + o00oOOo02 + "\n>>");
    }

    public final void o00oOoo0(o0O00o00 o0o00o00, int i, ArrayList<o0O00OO> arrayList) {
        for (o0O000 o0o000 : o0o00o00.f8921o00oOoO.f8894o00oOoo0) {
            if (o0o000 instanceof o0O000Oo) {
                o00oOOo0((o0O000Oo) o0o000, i, 0, o0o00o00.f8923o00oOoOO, arrayList, null);
            } else if (o0o000 instanceof o0O00o00) {
                o00oOOo0(((o0O00o00) o0o000).f8921o00oOoO, i, 0, o0o00o00.f8923o00oOoOO, arrayList, null);
            }
        }
        for (o0O000 o0o0002 : o0o00o00.f8923o00oOoOO.f8894o00oOoo0) {
            if (o0o0002 instanceof o0O000Oo) {
                o00oOOo0((o0O000Oo) o0o0002, i, 1, o0o00o00.f8921o00oOoO, arrayList, null);
            } else if (o0o0002 instanceof o0O00o00) {
                o00oOOo0(((o0O00o00) o0o0002).f8923o00oOoOO, i, 1, o0o00o00.f8921o00oOoO, arrayList, null);
            }
        }
        if (i == 1) {
            for (o0O000 o0o0003 : ((o0O00OOO) o0o00o00).f8913o00oOoo0.f8894o00oOoo0) {
                if (o0o0003 instanceof o0O000Oo) {
                    o00oOOo0((o0O000Oo) o0o0003, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void o00oOooO(ArrayList<o0O00o00> arrayList) {
        o0O00o00 o0ooo00o;
        arrayList.clear();
        this.f8936o00oOooO.f7672o00oOo0O.o00oOo0o();
        this.f8936o00oOooO.f7673o00oOo0o.o00oOo0o();
        arrayList.add(this.f8936o00oOooO.f7672o00oOo0O);
        arrayList.add(this.f8936o00oOooO.f7673o00oOo0o);
        Iterator<o00oOoO> it = this.f8936o00oOooO.f7867o0O0o0oo.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o00oOoO next = it.next();
            if (next instanceof o00oo0OO) {
                o0ooo00o = new o0OoO00O(next);
            } else {
                if (next.o0O00o00()) {
                    if (next.f7671o00oOo00 == null) {
                        next.f7671o00oOo00 = new o0O0000O(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7671o00oOo00);
                } else {
                    arrayList.add(next.f7672o00oOo0O);
                }
                if (next.o0O00o0o()) {
                    if (next.f7679o00oOooO == null) {
                        next.f7679o00oOooO = new o0O0000O(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7679o00oOooO);
                } else {
                    arrayList.add(next.f7673o00oOo0o);
                }
                if (next instanceof o00oo0O) {
                    o0ooo00o = new o0O00O0o(next);
                }
            }
            arrayList.add(o0ooo00o);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o0O00o00> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().o00oOo0o();
        }
        Iterator<o0O00o00> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o0O00o00 next2 = it3.next();
            if (next2.f8917o00oOOoO != this.f8936o00oOooO) {
                next2.o00oOooO();
            }
        }
    }

    public final String o00oOooo(o0O0000O o0o0000o, String str) {
        int i = o0o0000o.f8920o00oOo0o;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("cluster_");
        o00oOOo02.append(o0o0000o.f8917o00oOOoO.o00ooO0());
        String sb = o00oOOo02.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.append(i == 0 ? "_h" : "_v");
        String o00oOOo03 = android.support.v4.media.o00oOoO.o00oOOo0("subgraph ", sb2.toString(), " {\n");
        Iterator<o0O00o00> it = o0o0000o.f8883o00oOoo0.iterator();
        String str2 = "";
        while (it.hasNext()) {
            o0O00o00 next = it.next();
            String o00ooO02 = next.f8917o00oOOoO.o00ooO0();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(o00ooO02);
            sb3.append(i == 0 ? "_HORIZONTAL" : "_VERTICAL");
            o00oOOo03 = android.support.v4.media.o00oOoO.o00oOOo0(o00oOOo03, sb3.toString(), ";\n");
            str2 = o00oo00O(next, str2);
        }
        return android.support.v4.media.o00oOoO.o00oOOo0(str, str2, o00oo.o00oOOo0(o00oOOo03, "}\n"));
    }

    public final String o00oo0(o0O000Oo o0o000oo, boolean z, String str) {
        for (o0O000Oo o0o000oo2 : o0o000oo.f8896o00oOooo) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("\n");
            o00oOOo02.append(o0o000oo.o00oOooO());
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo02.toString(), " -> ");
            o00oOOo03.append(o0o000oo2.o00oOooO());
            String sb = o00oOOo03.toString();
            if (o0o000oo.f8889o00oOo0o > 0 || z || (o0o000oo.f8895o00oOooO instanceof o0O00O0o)) {
                String o00oOOo04 = o00oo.o00oOOo0(sb, "[");
                if (o0o000oo.f8889o00oOo0o > 0) {
                    o00oOOo04 = o00oOo00.o00oOOo0(androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo04, "label=\""), o0o000oo.f8889o00oOo0o, "\"");
                    if (z) {
                        o00oOOo04 = o00oo.o00oOOo0(o00oOOo04, ",");
                    }
                }
                if (z) {
                    o00oOOo04 = o00oo.o00oOOo0(o00oOOo04, " style=dashed ");
                }
                if (o0o000oo.f8895o00oOooO instanceof o0O00O0o) {
                    o00oOOo04 = o00oo.o00oOOo0(o00oOOo04, " style=bold,color=gray ");
                }
                sb = o00oo.o00oOOo0(o00oOOo04, "]");
            }
            str = o00oo.o00oOOo0(str, o00oo.o00oOOo0(sb, "\n"));
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r9.f8917o00oOOoO.o00ooO0o() > 0.0f) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
        if (r9.f8917o00oOOoO.o00ooO0o() > 0.0f) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
        r9.f8917o00oOOoO.o00ooO0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o00oo00O(o00ooOO0.o0O00o00 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0OoOoOo.o00oo00O(o00ooOO0.o0O00o00, java.lang.String):java.lang.String");
    }

    public final boolean o00oo0O(o0O000Oo o0o000oo, o0O000Oo o0o000oo2) {
        int i = 0;
        for (o0O000Oo o0o000oo3 : o0o000oo.f8896o00oOooo) {
            if (o0o000oo3 != o0o000oo2) {
                i++;
            }
        }
        int i2 = 0;
        for (o0O000Oo o0o000oo4 : o0o000oo2.f8896o00oOooo) {
            if (o0o000oo4 != o0o000oo) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    public void o00oo0O0() {
        this.f8930o00oOo00 = true;
    }

    public void o00oo0OO() {
        this.f8929o00oOOoO = true;
    }

    public final void o00oo0Oo(o00oOoO o00oooo2, o00oOoO.o00oOOoO o00ooooo2, int i, o00oOoO.o00oOOoO o00ooooo3, int i2) {
        o0O00000.o00oOOo0 o00oooo02 = this.f8933o00oOoO;
        o00oooo02.f8873o00oOOo0 = o00ooooo2;
        o00oooo02.f8874o00oOOoO = o00ooooo3;
        o00oooo02.f8875o00oOo00 = i;
        o00oooo02.f8882o00oOooO = i2;
        this.f8934o00oOoO0.o00oOOoO(o00oooo2, o00oooo02);
        o00oooo2.o0O0ooOO(this.f8933o00oOoO.f8876o00oOo0O);
        o00oooo2.o0O0o00(this.f8933o00oOoO.f8877o00oOo0o);
        o00oooo2.o0O0o000(this.f8933o00oOoO.f8878o00oOoO);
        o00oooo2.o0O0OOOo(this.f8933o00oOoO.f8879o00oOoO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o00oo0o(o00ooOO0.o0O00o00 r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0OoOoOo.o00oo0o(o00ooOO0.o0O00o00):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0o0() {
        /*
            r12 = this;
            o00ooO.o00oo00O r0 = r12.f8928o00oOOo0
            java.util.ArrayList<o00ooO.o00oOoO> r0 = r0.f7867o0O0o0oo
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            o00ooO.o00oOoO r1 = (o00ooO.o00oOoO) r1
            boolean r2 = r1.f7669o00oOOo0
            if (r2 == 0) goto L19
            goto L8
        L19:
            o00ooO.o00oOoO$o00oOOoO[] r2 = r1.f7668o0
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f7685o00oo0O0
            int r4 = r1.f7684o00oo0O
            o00ooO.o00oOoO$o00oOOoO r6 = o00ooO.o00oOoO.o00oOOoO.WRAP_CONTENT
            if (r8 == r6) goto L32
            o00ooO.o00oOoO$o00oOOoO r5 = o00ooO.o00oOoO.o00oOOoO.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            if (r10 == r6) goto L3b
            o00ooO.o00oOoO$o00oOOoO r5 = o00ooO.o00oOoO.o00oOOoO.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            o00ooOO0.o0O00O r4 = r1.f7672o00oOo0O
            o00ooOO0.o0O000o0 r4 = r4.f8919o00oOo0O
            boolean r5 = r4.f8893o00oOoOo
            o00ooOO0.o0O00OOO r7 = r1.f7673o00oOo0o
            o00ooOO0.o0O000o0 r7 = r7.f8919o00oOo0O
            boolean r11 = r7.f8893o00oOoOo
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            o00ooO.o00oOoO$o00oOOoO r6 = o00ooO.o00oOoO.o00oOOoO.FIXED
            int r5 = r4.f8891o00oOoO0
            int r7 = r7.f8891o00oOoO0
            r2 = r12
            r3 = r1
            r4 = r6
            r2.o00oo0Oo(r3, r4, r5, r6, r7)
        L58:
            r1.f7669o00oOOo0 = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            o00ooO.o00oOoO$o00oOOoO r5 = o00ooO.o00oOoO.o00oOOoO.FIXED
            int r8 = r4.f8891o00oOoO0
            int r7 = r7.f8891o00oOoO0
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.o00oo0Oo(r3, r4, r5, r6, r7)
            o00ooO.o00oOoO$o00oOOoO r2 = o00ooO.o00oOoO.o00oOOoO.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            o00ooOO0.o0O00OOO r2 = r1.f7673o00oOo0o
            o00ooOO0.o0O000o0 r2 = r2.f8919o00oOo0O
            int r3 = r1.o00ooOO()
        L78:
            r2.f8897o00oo00O = r3
            goto Lae
        L7b:
            o00ooOO0.o0O00OOO r2 = r1.f7673o00oOo0o
            o00ooOO0.o0O000o0 r2 = r2.f8919o00oOo0O
            int r3 = r1.o00ooOO()
        L83:
            r2.o00oOo0O(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f8891o00oOoO0
            o00ooO.o00oOoO$o00oOOoO r10 = o00ooO.o00oOoO.o00oOOoO.FIXED
            int r7 = r7.f8891o00oOoO0
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.o00oo0Oo(r3, r4, r5, r6, r7)
            o00ooO.o00oOoO$o00oOOoO r2 = o00ooO.o00oOoO.o00oOOoO.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            o00ooOO0.o0O00O r2 = r1.f7672o00oOo0O
            o00ooOO0.o0O000o0 r2 = r2.f8919o00oOo0O
            int r3 = r1.o0OoO00O()
            goto L78
        La5:
            o00ooOO0.o0O00O r2 = r1.f7672o00oOo0O
            o00ooOO0.o0O000o0 r2 = r2.f8919o00oOo0O
            int r3 = r1.o0OoO00O()
            goto L83
        Lae:
            boolean r2 = r1.f7669o00oOOo0
            if (r2 == 0) goto L8
            o00ooOO0.o0O00OOO r2 = r1.f7673o00oOo0o
            o00ooOO0.o0O000o0 r2 = r2.f8914o00oOooo
            if (r2 == 0) goto L8
            int r1 = r1.o00oo0o()
            r2.o00oOo0O(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0OoOoOo.o00oo0o0():void");
    }

    public void o00oo0oO(o0O00000.o00oOOoO o00ooooo2) {
        this.f8934o00oOoO0 = o00ooooo2;
    }
}
