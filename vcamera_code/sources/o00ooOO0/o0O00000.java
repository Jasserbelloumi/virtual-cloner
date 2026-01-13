package o00ooOO0;

import java.util.ArrayList;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO.o00oo00O;
import o00ooO.o00oo0O0;
import o00ooO.o00oo0OO;
import o00ooO.o00ooO0;
import o00ooO.o0O0o;
import o00ooO0.o00oo0;
/* loaded from: classes.dex */
public class o0O00000 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f8859o00oOo0O = 30;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f8860o00oOo0o = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f8861o00oOoO = Integer.MIN_VALUE;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f8862o00oOoO0 = 1073741824;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f8863o00oOoOO = -1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f8864o00oOoOo = -2;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f8865o00oOoo0 = -3;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final boolean f8866o00oOooO = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ArrayList<o00oOoO> f8867o00oOOo0 = new ArrayList<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOo0 f8868o00oOOoO = new o00oOOo0();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo00O f8869o00oOo00;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static int f8870o00oOoo0 = 0;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static int f8871o00oOooo = 1;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static int f8872o00oo00O = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOoO.o00oOOoO f8873o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOoO.o00oOOoO f8874o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f8875o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f8876o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f8877o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f8878o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f8879o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f8880o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f8881o00oOoOo;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f8882o00oOooO;
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0();

        void o00oOOoO(o00oOoO o00oooo2, o00oOOo0 o00oooo02);
    }

    public o0O00000(o00oo00O o00oo00o) {
        this.f8869o00oOo00 = o00oo00o;
    }

    public final boolean o00oOOo0(o00oOOoO o00ooooo2, o00oOoO o00oooo2, int i) {
        this.f8868o00oOOoO.f8873o00oOOo0 = o00oooo2.o00ooOoO();
        this.f8868o00oOOoO.f8874o00oOOoO = o00oooo2.o0O000oo();
        this.f8868o00oOOoO.f8875o00oOo00 = o00oooo2.o0OoO00O();
        this.f8868o00oOOoO.f8882o00oOooO = o00oooo2.o00ooOO();
        o00oOOo0 o00oooo02 = this.f8868o00oOOoO;
        o00oooo02.f8880o00oOoOO = false;
        o00oooo02.f8881o00oOoOo = i;
        o00oOoO.o00oOOoO o00ooooo3 = o00oooo02.f8873o00oOOo0;
        o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
        boolean z = o00ooooo3 == o00ooooo4;
        boolean z2 = o00oooo02.f8874o00oOOoO == o00ooooo4;
        boolean z3 = z && o00oooo2.f7715o0O000 > 0.0f;
        boolean z4 = z2 && o00oooo2.f7715o0O000 > 0.0f;
        if (z3 && o00oooo2.f7687o00oo0Oo[0] == 4) {
            o00oooo02.f8873o00oOOo0 = o00oOoO.o00oOOoO.FIXED;
        }
        if (z4 && o00oooo2.f7687o00oo0Oo[1] == 4) {
            o00oooo02.f8874o00oOOoO = o00oOoO.o00oOOoO.FIXED;
        }
        o00ooooo2.o00oOOoO(o00oooo2, o00oooo02);
        o00oooo2.o0O0ooOO(this.f8868o00oOOoO.f8876o00oOo0O);
        o00oooo2.o0O0o00(this.f8868o00oOOoO.f8877o00oOo0o);
        o00oooo2.o0O0o000(this.f8868o00oOOoO.f8878o00oOoO);
        o00oooo2.o0O0OOOo(this.f8868o00oOOoO.f8879o00oOoO0);
        o00oOOo0 o00oooo03 = this.f8868o00oOOoO;
        o00oooo03.f8881o00oOoOo = o00oOOo0.f8870o00oOoo0;
        return o00oooo03.f8880o00oOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.f7715o0O000 <= 0.0f) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oOOoO(o00ooO.o00oo00O r13) {
        /*
            r12 = this;
            java.util.ArrayList<o00ooO.o00oOoO> r0 = r13.f7867o0O0o0oo
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.o0OOO0OO(r1)
            o00ooOO0.o0O00000$o00oOOoO r2 = r13.o0OO0oOO()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<o00ooO.o00oOoO> r5 = r13.f7867o0O0o0oo
            java.lang.Object r5 = r5.get(r4)
            o00ooO.o00oOoO r5 = (o00ooO.o00oOoO) r5
            boolean r6 = r5 instanceof o00ooO.o00oo0OO
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof o00ooO.o00oOOo0
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.o0O00o()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            o00ooOO0.o0O00O r6 = r5.f7672o00oOo0O
            if (r6 == 0) goto L48
            o00ooOO0.o0O00OOO r7 = r5.f7673o00oOo0o
            if (r7 == 0) goto L48
            o00ooOO0.o0O000o0 r6 = r6.f8919o00oOo0O
            boolean r6 = r6.f8893o00oOoOo
            if (r6 == 0) goto L48
            o00ooOO0.o0O000o0 r6 = r7.f8919o00oOo0O
            boolean r6 = r6.f8893o00oOoOo
            if (r6 == 0) goto L48
            goto Lac
        L48:
            o00ooO.o00oOoO$o00oOOoO r6 = r5.o00ooO0O(r3)
            r7 = 1
            o00ooO.o00oOoO$o00oOOoO r8 = r5.o00ooO0O(r7)
            o00ooO.o00oOoO$o00oOOoO r9 = o00ooO.o00oOoO.o00oOOoO.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f7685o00oo0O0
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f7684o00oo0O
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.o0OOO0OO(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof o00ooO.o00ooO0
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f7685o00oo0O0
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.o0O00o00()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f7684o00oo0O
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.o0O00o00()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.f7715o0O000
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = o00ooOO0.o0O00000.o00oOOo0.f8870o00oOoo0
            r12.o00oOOo0(r2, r5, r6)
            o00ooO0.o00oo0 r5 = r13.f7826o0O0oO0o
            if (r5 == 0) goto Lac
            long r6 = r5.f7927o00oOo00
            r8 = 1
            long r6 = r6 + r8
            r5.f7927o00oOo00 = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.o00oOOo0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O00000.o00oOOoO(o00ooO.o00oo00O):void");
    }

    public final void o00oOo00(o00oo00O o00oo00o, String str, int i, int i2) {
        int o00oooo02 = o00oo00o.o00oooo0();
        int o00oooOo2 = o00oo00o.o00oooOo();
        o00oo00o.o0O0oO(0);
        o00oo00o.o0O0oO0o(0);
        o00oo00o.o0O0ooOO(i);
        o00oo00o.o0O0o00(i2);
        o00oo00o.o0O0oO(o00oooo02);
        o00oo00o.o0O0oO0o(o00oooOo2);
        this.f8869o00oOo00.o0OO00OO();
    }

    public void o00oOo0O(o00oo00O o00oo00o) {
        this.f8867o00oOOo0.clear();
        int size = o00oo00o.f7867o0O0o0oo.size();
        for (int i = 0; i < size; i++) {
            o00oOoO o00oooo2 = o00oo00o.f7867o0O0o0oo.get(i);
            o00oOoO.o00oOOoO o00ooOoO2 = o00oooo2.o00ooOoO();
            o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
            if (o00ooOoO2 == o00ooooo2 || o00oooo2.o0O000oo() == o00ooooo2) {
                this.f8867o00oOOo0.add(o00oooo2);
            }
        }
        o00oo00o.o0OO0ooo();
    }

    public long o00oOooO(o00oo00O o00oo00o, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        int i12;
        o00oOOoO o00ooooo2;
        int i13;
        int i14;
        int i15;
        boolean z5;
        o00oo0 o00oo0Var;
        o00oOOoO o0OO0oOO2 = o00oo00o.o0OO0oOO();
        int size = o00oo00o.f7867o0O0o0oo.size();
        int o0OoO00O2 = o00oo00o.o0OoO00O();
        int o00ooOO2 = o00oo00o.o00ooOO();
        boolean o00oOOoO2 = o0O0o.o00oOOoO(i, 128);
        boolean z6 = o00oOOoO2 || o0O0o.o00oOOoO(i, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                o00oOoO o00oooo2 = o00oo00o.f7867o0O0o0oo.get(i16);
                o00oOoO.o00oOOoO o00ooOoO2 = o00oooo2.o00ooOoO();
                o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                boolean z7 = (o00ooOoO2 == o00ooooo3) && (o00oooo2.o0O000oo() == o00ooooo3) && o00oooo2.o00ooO0o() > 0.0f;
                if ((o00oooo2.o0O00o00() && z7) || ((o00oooo2.o0O00o0o() && z7) || (o00oooo2 instanceof o00ooO0) || o00oooo2.o0O00o00() || o00oooo2.o0O00o0o())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && (o00oo0Var = o00ooO0.o00oo00O.f7979o00ooOO0) != null) {
            o00oo0Var.f7928o00oOo0O++;
        }
        boolean z8 = z6 & ((i4 == 1073741824 && i6 == 1073741824) || o00oOOoO2);
        int i17 = 2;
        if (z8) {
            int min = Math.min(o00oo00o.o00oooOO(), i5);
            int min2 = Math.min(o00oo00o.o00oooO(), i7);
            if (i4 == 1073741824 && o00oo00o.o0OoO00O() != min) {
                o00oo00o.o0O0ooOO(min);
                o00oo00o.o0OO0ooo();
            }
            if (i6 == 1073741824 && o00oo00o.o00ooOO() != min2) {
                o00oo00o.o0O0o00(min2);
                o00oo00o.o0OO0ooo();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = o00oo00o.o0OO0o0O(o00oOOoO2);
                i10 = 2;
            } else {
                boolean o0OO0o0o2 = o00oo00o.o0OO0o0o(o00oOOoO2);
                if (i4 == 1073741824) {
                    o0OO0o0o2 &= o00oo00o.o0OO0o(o00oOOoO2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = o00oo00o.o0OO0o(o00oOOoO2, 1) & o0OO0o0o2;
                    i10++;
                } else {
                    z = o0OO0o0o2;
                }
            }
            if (z) {
                o00oo00o.o0O(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        int o0OOoooO2 = o00oo00o.o0OOoooO();
        if (size > 0) {
            o00oOOoO(o00oo00o);
        }
        o00oOo0O(o00oo00o);
        int size2 = this.f8867o00oOOo0.size();
        if (size > 0) {
            o00oOo00(o00oo00o, "First pass", o0OoO00O2, o00ooOO2);
        }
        if (size2 > 0) {
            o00oOoO.o00oOOoO o00ooOoO3 = o00oo00o.o00ooOoO();
            o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.WRAP_CONTENT;
            boolean z9 = o00ooOoO3 == o00ooooo4;
            boolean z10 = o00oo00o.o0O000oo() == o00ooooo4;
            int max = Math.max(o00oo00o.o0OoO00O(), this.f8869o00oOo00.o00oooo0());
            int max2 = Math.max(o00oo00o.o00ooOO(), this.f8869o00oOo00.o00oooOo());
            int i18 = 0;
            boolean z11 = false;
            while (i18 < size2) {
                o00oOoO o00oooo3 = this.f8867o00oOOo0.get(i18);
                if (o00oooo3 instanceof o00ooO0) {
                    int o0OoO00O3 = o00oooo3.o0OoO00O();
                    i13 = o0OOoooO2;
                    int o00ooOO3 = o00oooo3.o00ooOO();
                    i14 = o0OoO00O2;
                    boolean o00oOOo02 = o00oOOo0(o0OO0oOO2, o00oooo3, o00oOOo0.f8871o00oOooo) | z11;
                    o00oo0 o00oo0Var2 = o00oo00o.f7826o0O0oO0o;
                    i15 = o00ooOO2;
                    if (o00oo0Var2 != null) {
                        o00oo0Var2.f7935o00oOooO++;
                    }
                    int o0OoO00O4 = o00oooo3.o0OoO00O();
                    int o00ooOO4 = o00oooo3.o00ooOO();
                    if (o0OoO00O4 != o0OoO00O3) {
                        o00oooo3.o0O0ooOO(o0OoO00O4);
                        if (z9 && o00oooo3.o0O0000o() > max) {
                            max = Math.max(max, o00oooo3.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT).o00oOoO0() + o00oooo3.o0O0000o());
                        }
                        z5 = true;
                    } else {
                        z5 = o00oOOo02;
                    }
                    if (o00ooOO4 != o00ooOO3) {
                        o00oooo3.o0O0o00(o00ooOO4);
                        if (z10 && o00oooo3.o0O0o() > max2) {
                            max2 = Math.max(max2, o00oooo3.o00oo0Oo(o00oOo0O.o00oOOoO.BOTTOM).o00oOoO0() + o00oooo3.o0O0o());
                        }
                        z5 = true;
                    }
                    z11 = z5 | ((o00ooO0) o00oooo3).o0OOooO0();
                } else {
                    i13 = o0OOoooO2;
                    i14 = o0OoO00O2;
                    i15 = o00ooOO2;
                }
                i18++;
                o0OOoooO2 = i13;
                o0OoO00O2 = i14;
                o00ooOO2 = i15;
                i17 = 2;
            }
            int i19 = o0OOoooO2;
            int i20 = o0OoO00O2;
            int i21 = o00ooOO2;
            int i22 = i17;
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < size2) {
                    o00oOoO o00oooo4 = this.f8867o00oOOo0.get(i24);
                    if (((o00oooo4 instanceof o00oo0O0) && !(o00oooo4 instanceof o00ooO0)) || (o00oooo4 instanceof o00oo0OO) || o00oooo4.o0O00O0() == 8 || ((z8 && o00oooo4.f7672o00oOo0O.f8919o00oOo0O.f8893o00oOoOo && o00oooo4.f7673o00oOo0o.f8919o00oOo0O.f8893o00oOoOo) || (o00oooo4 instanceof o00ooO0))) {
                        z4 = z8;
                        i12 = size2;
                        o00ooooo2 = o0OO0oOO2;
                    } else {
                        int o0OoO00O5 = o00oooo4.o0OoO00O();
                        int o00ooOO5 = o00oooo4.o00ooOO();
                        int o00oo0o2 = o00oooo4.o00oo0o();
                        int i25 = o00oOOo0.f8871o00oOooo;
                        z4 = z8;
                        if (i23 == 1) {
                            i25 = o00oOOo0.f8872o00oo00O;
                        }
                        boolean o00oOOo03 = o00oOOo0(o0OO0oOO2, o00oooo4, i25) | z11;
                        o00oo0 o00oo0Var3 = o00oo00o.f7826o0O0oO0o;
                        i12 = size2;
                        o00ooooo2 = o0OO0oOO2;
                        if (o00oo0Var3 != null) {
                            o00oo0Var3.f7935o00oOooO++;
                        }
                        int o0OoO00O6 = o00oooo4.o0OoO00O();
                        int o00ooOO6 = o00oooo4.o00ooOO();
                        if (o0OoO00O6 != o0OoO00O5) {
                            o00oooo4.o0O0ooOO(o0OoO00O6);
                            if (z9 && o00oooo4.o0O0000o() > max) {
                                max = Math.max(max, o00oooo4.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT).o00oOoO0() + o00oooo4.o0O0000o());
                            }
                            o00oOOo03 = true;
                        }
                        if (o00ooOO6 != o00ooOO5) {
                            o00oooo4.o0O0o00(o00ooOO6);
                            if (z10 && o00oooo4.o0O0o() > max2) {
                                max2 = Math.max(max2, o00oooo4.o00oo0Oo(o00oOo0O.o00oOOoO.BOTTOM).o00oOoO0() + o00oooo4.o0O0o());
                            }
                            o00oOOo03 = true;
                        }
                        z11 = (!o00oooo4.o0O00OO() || o00oo0o2 == o00oooo4.o00oo0o()) ? o00oOOo03 : true;
                    }
                    i24++;
                    size2 = i12;
                    o0OO0oOO2 = o00ooooo2;
                    z8 = z4;
                }
                boolean z12 = z8;
                int i26 = size2;
                o00oOOoO o00ooooo5 = o0OO0oOO2;
                if (!z11) {
                    break;
                }
                o00oOo00(o00oo00o, "intermediate pass", i20, i21);
                i23++;
                o0OO0oOO2 = o00ooooo5;
                z8 = z12;
                i22 = 2;
                z11 = false;
                size2 = i26;
            }
            if (z11) {
                o00oOo00(o00oo00o, "2nd pass", i20, i21);
                if (o00oo00o.o0OoO00O() < max) {
                    o00oo00o.o0O0ooOO(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (o00oo00o.o00ooOO() < max2) {
                    o00oo00o.o0O0o00(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    o00oOo00(o00oo00o, "3rd pass", i20, i21);
                }
            }
            i11 = i19;
        } else {
            i11 = o0OOoooO2;
        }
        o00oo00o.o0OOO0oO(i11);
        return 0L;
    }
}
