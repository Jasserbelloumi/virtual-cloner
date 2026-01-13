package o00ooO0;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import o00oOoOo.o00oo;
import o00ooO.o00oOo0O;
import o00ooO0.o00oo0O;
/* loaded from: classes.dex */
public class o00oo00O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static boolean f7968o00oo = true;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final boolean f7969o00oo0Oo = false;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final boolean f7970o00oo0o = false;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final boolean f7971o00oo0o0 = false;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final boolean f7972o00oo0oO = false;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static int f7973o00ooO = 1000;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static boolean f7974o00ooO0 = true;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static boolean f7975o00ooO00 = true;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static boolean f7976o00ooO0O = true;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static boolean f7977o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static long f7978o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static o00oo0 f7979o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static long f7980o00ooOOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static boolean f7981o0O0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00ooO0.o00oOOoO[] f7988o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOOo0 f7992o00oOooO;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final o00oOo00 f7994o00oo0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOOo0 f7996o00oo0O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f7982o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f7983o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public HashMap<String, o00oo0O> f7984o00oOo00 = null;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f7985o00oOo0O = 32;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f7986o00oOo0o = 32;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f7987o00oOoO = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f7989o00oOoOO = false;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean[] f7990o00oOoOo = new boolean[32];

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f7991o00oOoo0 = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f7993o00oOooo = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f7995o00oo00O = 32;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public o00oo0O[] f7998o00oo0OO = new o00oo0O[f7973o00ooO];

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f7997o00oo0O0 = 0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void clear();

        o00oo0O getKey();

        boolean isEmpty();

        void o00oOOo0(o00oOOo0 o00oooo02);

        o00oo0O o00oOOoO(o00oo00O o00oo00o, boolean[] zArr);

        void o00oOo00(o00oo00O o00oo00o, o00ooO0.o00oOOoO o00ooooo2, boolean z);

        void o00oOo0O(o00oo00O o00oo00o);

        void o00oOo0o(o00oo00O o00oo00o, o00oo0O o00oo0o2, boolean z);

        void o00oOooO(o00oo0O o00oo0o2);
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00ooO0.o00oOOoO {
        public o00oOOoO(o00oOo00 o00ooo002) {
            this.f7918o00oOo0O = new o0O0o(this, o00ooo002);
        }
    }

    public o00oo00O() {
        this.f7988o00oOoO0 = null;
        this.f7988o00oOoO0 = new o00ooO0.o00oOOoO[32];
        o0O0000O();
        o00oOo00 o00ooo002 = new o00oOo00();
        this.f7994o00oo0 = o00ooo002;
        this.f7992o00oOooO = new o00oo0O0(o00ooo002);
        this.f7996o00oo0O = f7977o00ooO0o ? new o00oOOoO(o00ooo002) : new o00ooO0.o00oOOoO(o00ooo002);
    }

    public static o00ooO0.o00oOOoO o00oo(o00oo00O o00oo00o, o00oo0O o00oo0o2, o00oo0O o00oo0o3, float f) {
        return o00oo00o.o0O0o().o00oo00O(o00oo0o2, o00oo0o3, f);
    }

    public static o00oo0 o00ooo0O() {
        return f7979o00ooOO0;
    }

    public void o0(o00oOOo0 o00oooo02) throws Exception {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7950o00ooO0O++;
            o00oo0Var.f7951o00ooO0o = Math.max(o00oo0Var.f7951o00ooO0o, this.f7991o00oOoo0);
            o00oo0 o00oo0Var2 = f7979o00ooOO0;
            o00oo0Var2.f7947o00ooO = Math.max(o00oo0Var2.f7947o00ooO, this.f7993o00oOooo);
        }
        o00ooOOo(o00oooo02);
        o0O00000(o00oooo02, false);
        o00oo0Oo();
    }

    public final o00oo0O o00oOOo0(o00oo0O.o00oOOoO o00ooooo2, String str) {
        o00oo0O acquire = this.f7994o00oo0.f7923o00oOo00.acquire();
        if (acquire == null) {
            acquire = new o00oo0O(o00ooooo2, str);
            acquire.f8025o00oOoOo = o00ooooo2;
        } else {
            acquire.o00oOoO0();
            acquire.o00oOoo0(o00ooooo2, str);
        }
        int i = this.f7997o00oo0O0;
        int i2 = f7973o00ooO;
        if (i >= i2) {
            int i3 = i2 * 2;
            f7973o00ooO = i3;
            this.f7998o00oo0OO = (o00oo0O[]) Arrays.copyOf(this.f7998o00oo0OO, i3);
        }
        o00oo0O[] o00oo0oArr = this.f7998o00oo0OO;
        int i4 = this.f7997o00oo0O0;
        this.f7997o00oo0O0 = i4 + 1;
        o00oo0oArr[i4] = acquire;
        return acquire;
    }

    public void o00oOOoO(o00ooO.o00oOoO o00oooo2, o00ooO.o00oOoO o00oooo3, float f, int i) {
        o00oOo0O.o00oOOoO o00ooooo2 = o00oOo0O.o00oOOoO.LEFT;
        o00oo0O o00oo0oO2 = o00oo0oO(o00oooo2.o00oo0Oo(o00ooooo2));
        o00oOo0O.o00oOOoO o00ooooo3 = o00oOo0O.o00oOOoO.TOP;
        o00oo0O o00oo0oO3 = o00oo0oO(o00oooo2.o00oo0Oo(o00ooooo3));
        o00oOo0O.o00oOOoO o00ooooo4 = o00oOo0O.o00oOOoO.RIGHT;
        o00oo0O o00oo0oO4 = o00oo0oO(o00oooo2.o00oo0Oo(o00ooooo4));
        o00oOo0O.o00oOOoO o00ooooo5 = o00oOo0O.o00oOOoO.BOTTOM;
        o00oo0O o00oo0oO5 = o00oo0oO(o00oooo2.o00oo0Oo(o00ooooo5));
        o00oo0O o00oo0oO6 = o00oo0oO(o00oooo3.o00oo0Oo(o00ooooo2));
        o00oo0O o00oo0oO7 = o00oo0oO(o00oooo3.o00oo0Oo(o00ooooo3));
        o00oo0O o00oo0oO8 = o00oo0oO(o00oooo3.o00oo0Oo(o00ooooo4));
        o00oo0O o00oo0oO9 = o00oo0oO(o00oooo3.o00oo0Oo(o00ooooo5));
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        double d = f;
        double d2 = i;
        o0O0o2.o0O0o(o00oo0oO3, o00oo0oO5, o00oo0oO7, o00oo0oO9, (float) (Math.sin(d) * d2));
        o00oOooO(o0O0o2);
        o00ooO0.o00oOOoO o0O0o3 = o0O0o();
        o0O0o3.o0O0o(o00oo0oO2, o00oo0oO4, o00oo0oO6, o00oo0oO8, (float) (Math.cos(d) * d2));
        o00oOooO(o0O0o3);
    }

    public void o00oOo00(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, float f, o00oo0O o00oo0o4, o00oo0O o00oo0o5, int i2, int i3) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o0O0o2.o00oOoo0(o00oo0o2, o00oo0o3, i, f, o00oo0o4, o00oo0o5, i2);
        if (i3 != 8) {
            o0O0o2.o00oOoO0(this, i3);
        }
        o00oOooO(o0O0o2);
    }

    public o00ooO0.o00oOOoO o00oOo0O(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, int i2) {
        if (f7968o00oo && i2 == 8 && o00oo0o3.f8023o00oOoO0 && o00oo0o2.f8027o00oOooO == -1) {
            o00oo0o2.o00oOoO(this, o00oo0o3.f8021o00oOo0o + i);
            return null;
        }
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o0O0o2.o00oo0Oo(o00oo0o2, o00oo0o3, i);
        if (i2 != 8) {
            o0O0o2.o00oOoO0(this, i2);
        }
        o00oOooO(o0O0o2);
        return o0O0o2;
    }

    public void o00oOo0o(o00oo0O o00oo0o2, int i) {
        o00ooO0.o00oOOoO o0O0o2;
        if (f7968o00oo && o00oo0o2.f8027o00oOooO == -1) {
            float f = i;
            o00oo0o2.o00oOoO(this, f);
            for (int i2 = 0; i2 < this.f7983o00oOOoO + 1; i2++) {
                o00oo0O o00oo0o3 = this.f7994o00oo0.f7924o00oOooO[i2];
                if (o00oo0o3 != null && o00oo0o3.f8029o00oo0 && o00oo0o3.f8033o00oo0OO == o00oo0o2.f8019o00oOo00) {
                    o00oo0o3.o00oOoO(this, o00oo0o3.f8032o00oo0O0 + f);
                }
            }
            return;
        }
        int i3 = o00oo0o2.f8027o00oOooO;
        if (i3 != -1) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i3];
            if (!o00ooooo2.f7919o00oOo0o) {
                if (o00ooooo2.f7918o00oOo0O.o00oOoO() == 0) {
                    o00ooooo2.f7919o00oOo0o = true;
                } else {
                    o0O0o2 = o0O0o();
                    o0O0o2.o00oo0O(o00oo0o2, i);
                }
            }
            o00ooooo2.f7916o00oOOoO = i;
            return;
        }
        o0O0o2 = o0O0o();
        o0O0o2.o00oOooo(o00oo0o2, i);
        o00oOooO(o0O0o2);
    }

    public void o00oOoO(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, boolean z) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o00oo0O o00ooO002 = o00ooO00();
        o00ooO002.f8020o00oOo0O = 0;
        o0O0o2.o00oo0o(o00oo0o2, o00oo0o3, o00ooO002, i);
        o00oOooO(o0O0o2);
    }

    public final void o00oOoO0(o00ooO0.o00oOOoO o00ooooo2) {
        o00ooooo2.o00oOoO0(this, 0);
    }

    public void o00oOoOO(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, int i2) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o00oo0O o00ooO002 = o00ooO00();
        o00ooO002.f8020o00oOo0O = 0;
        o0O0o2.o00oo0o(o00oo0o2, o00oo0o3, o00ooO002, i);
        if (i2 != 8) {
            o00oo0OO(o0O0o2, (int) (o0O0o2.f7918o00oOo0O.o00oOooO(o00ooO002) * (-1.0f)), i2);
        }
        o00oOooO(o0O0o2);
    }

    public void o00oOoOo(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, boolean z) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o00oo0O o00ooO002 = o00ooO00();
        o00ooO002.f8020o00oOo0O = 0;
        o0O0o2.o00oo0oO(o00oo0o2, o00oo0o3, o00ooO002, i);
        o00oOooO(o0O0o2);
    }

    public void o00oOoo0(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, int i2) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o00oo0O o00ooO002 = o00ooO00();
        o00ooO002.f8020o00oOo0O = 0;
        o0O0o2.o00oo0oO(o00oo0o2, o00oo0o3, o00ooO002, i);
        if (i2 != 8) {
            o00oo0OO(o0O0o2, (int) (o0O0o2.f7918o00oOo0O.o00oOooO(o00ooO002) * (-1.0f)), i2);
        }
        o00oOooO(o0O0o2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOooO(o00ooO0.o00oOOoO r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            o00ooO0.o00oo0 r0 = o00ooO0.o00oo00O.f7979o00ooOO0
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f7933o00oOoOo
            long r3 = r3 + r1
            r0.f7933o00oOoOo = r3
            boolean r3 = r8.f7919o00oOo0o
            if (r3 == 0) goto L17
            long r3 = r0.f7934o00oOoo0
            long r3 = r3 + r1
            r0.f7934o00oOoo0 = r3
        L17:
            int r0 = r7.f7993o00oOooo
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f7995o00oo00O
            if (r0 >= r4) goto L26
            int r0 = r7.f7991o00oOoo0
            int r0 = r0 + r3
            int r4 = r7.f7986o00oOo0o
            if (r0 < r4) goto L29
        L26:
            r7.o00ooooO()
        L29:
            r0 = 0
            boolean r4 = r8.f7919o00oOo0o
            if (r4 != 0) goto L9e
            r8.o00oOo0O(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.o00oo()
            boolean r4 = r8.o00oOoOO(r7)
            if (r4 == 0) goto L95
            o00ooO0.o00oo0O r4 = r7.o00oo0o()
            r8.f7915o00oOOo0 = r4
            int r5 = r7.f7993o00oOooo
            r7.o00oo00O(r8)
            int r6 = r7.f7993o00oOooo
            int r5 = r5 + r3
            if (r6 != r5) goto L95
            o00ooO0.o00oo00O$o00oOOo0 r0 = r7.f7996o00oo0O
            r0.o00oOOo0(r8)
            o00ooO0.o00oo00O$o00oOOo0 r0 = r7.f7996o00oo0O
            r7.o0O00000(r0, r3)
            int r0 = r4.f8027o00oOooO
            r5 = -1
            if (r0 != r5) goto L96
            o00ooO0.o00oo0O r0 = r8.f7915o00oOOo0
            if (r0 != r4) goto L76
            o00ooO0.o00oo0O r0 = r8.o00ooO0o(r4)
            if (r0 == 0) goto L76
            o00ooO0.o00oo0 r4 = o00ooO0.o00oo00O.f7979o00ooOO0
            if (r4 == 0) goto L73
            long r5 = r4.f7938o00oo0
            long r5 = r5 + r1
            r4.f7938o00oo0 = r5
        L73:
            r8.o00ooOO0(r0)
        L76:
            boolean r0 = r8.f7919o00oOo0o
            if (r0 != 0) goto L7f
            o00ooO0.o00oo0O r0 = r8.f7915o00oOOo0
            r0.o00oo00O(r7, r8)
        L7f:
            boolean r0 = o00ooO0.o00oo00O.f7977o00ooO0o
            if (r0 == 0) goto L88
            o00ooO0.o00oOo00 r0 = r7.f7994o00oo0
            o00ooO0.o00oo0OO$o00oOOo0<o00ooO0.o00oOOoO> r0 = r0.f7921o00oOOo0
            goto L8c
        L88:
            o00ooO0.o00oOo00 r0 = r7.f7994o00oo0
            o00ooO0.o00oo0OO$o00oOOo0<o00ooO0.o00oOOoO> r0 = r0.f7922o00oOOoO
        L8c:
            r0.o00oOOo0(r8)
            int r0 = r7.f7993o00oOooo
            int r0 = r0 - r3
            r7.f7993o00oOooo = r0
            goto L96
        L95:
            r3 = r0
        L96:
            boolean r0 = r8.o00ooO00()
            if (r0 != 0) goto L9d
            return
        L9d:
            r0 = r3
        L9e:
            if (r0 != 0) goto La3
            r7.o00oo00O(r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO0.o00oo00O.o00oOooO(o00ooO0.o00oOOoO):void");
    }

    public void o00oOooo(o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, o00oo0O o00oo0o5, float f, int i) {
        o00ooO0.o00oOOoO o0O0o2 = o0O0o();
        o0O0o2.o00oo0(o00oo0o2, o00oo0o3, o00oo0o4, o00oo0o5, f);
        if (i != 8) {
            o0O0o2.o00oOoO0(this, i);
        }
        o00oOooO(o0O0o2);
    }

    public final void o00oo0(o00ooO0.o00oOOoO o00ooooo2, int i) {
        o00oo0OO(o00ooooo2, i, 0);
    }

    public final void o00oo00O(o00ooO0.o00oOOoO o00ooooo2) {
        int i;
        if (f7975o00ooO00 && o00ooooo2.f7919o00oOo0o) {
            o00ooooo2.f7915o00oOOo0.o00oOoO(this, o00ooooo2.f7916o00oOOoO);
        } else {
            o00ooO0.o00oOOoO[] o00oooooArr = this.f7988o00oOoO0;
            int i2 = this.f7993o00oOooo;
            o00oooooArr[i2] = o00ooooo2;
            o00oo0O o00oo0o2 = o00ooooo2.f7915o00oOOo0;
            o00oo0o2.f8027o00oOooO = i2;
            this.f7993o00oOooo = i2 + 1;
            o00oo0o2.o00oo00O(this, o00ooooo2);
        }
        if (f7975o00ooO00 && this.f7982o00oOOo0) {
            int i3 = 0;
            while (i3 < this.f7993o00oOooo) {
                if (this.f7988o00oOoO0[i3] == null) {
                    System.out.println("WTF");
                }
                o00ooO0.o00oOOoO o00ooooo3 = this.f7988o00oOoO0[i3];
                if (o00ooooo3 != null && o00ooooo3.f7919o00oOo0o) {
                    o00ooooo3.f7915o00oOOo0.o00oOoO(this, o00ooooo3.f7916o00oOOoO);
                    (f7977o00ooO0o ? this.f7994o00oo0.f7921o00oOOo0 : this.f7994o00oo0.f7922o00oOOoO).o00oOOo0(o00ooooo3);
                    this.f7988o00oOoO0[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f7993o00oOooo;
                        if (i4 >= i) {
                            break;
                        }
                        o00ooO0.o00oOOoO[] o00oooooArr2 = this.f7988o00oOoO0;
                        int i6 = i4 - 1;
                        o00ooO0.o00oOOoO o00ooooo4 = o00oooooArr2[i4];
                        o00oooooArr2[i6] = o00ooooo4;
                        o00oo0O o00oo0o3 = o00ooooo4.f7915o00oOOo0;
                        if (o00oo0o3.f8027o00oOooO == i4) {
                            o00oo0o3.f8027o00oOooO = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f7988o00oOoO0[i5] = null;
                    }
                    this.f7993o00oOooo = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f7982o00oOOo0 = false;
        }
    }

    public final void o00oo0O() {
        int i;
        int i2 = 0;
        while (i2 < this.f7993o00oOooo) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i2];
            if (o00ooooo2.f7918o00oOo0O.o00oOoO() == 0) {
                o00ooooo2.f7919o00oOo0o = true;
            }
            if (o00ooooo2.f7919o00oOo0o) {
                o00oo0O o00oo0o2 = o00ooooo2.f7915o00oOOo0;
                o00oo0o2.f8021o00oOo0o = o00ooooo2.f7916o00oOOoO;
                o00oo0o2.o00oOo0o(o00ooooo2);
                int i3 = i2;
                while (true) {
                    i = this.f7993o00oOooo;
                    if (i3 >= i - 1) {
                        break;
                    }
                    o00ooO0.o00oOOoO[] o00oooooArr = this.f7988o00oOoO0;
                    int i4 = i3 + 1;
                    o00oooooArr[i3] = o00oooooArr[i4];
                    i3 = i4;
                }
                this.f7988o00oOoO0[i - 1] = null;
                this.f7993o00oOooo = i - 1;
                i2--;
                (f7977o00ooO0o ? this.f7994o00oo0.f7921o00oOOo0 : this.f7994o00oo0.f7922o00oOOoO).o00oOOo0(o00ooooo2);
            }
            i2++;
        }
    }

    public void o00oo0O0(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i) {
        if (o00oo0o2.f8027o00oOooO != -1 || i != 0) {
            o00oOo0O(o00oo0o2, o00oo0o3, i, 8);
            return;
        }
        if (o00oo0o3.f8029o00oo0) {
            o00oo0o3 = this.f7994o00oo0.f7924o00oOooO[o00oo0o3.f8033o00oo0OO];
        }
        if (o00oo0o2.f8029o00oo0) {
            o00oo0O o00oo0o4 = this.f7994o00oo0.f7924o00oOooO[o00oo0o2.f8033o00oo0OO];
        } else {
            o00oo0o2.o00oOoOo(this, o00oo0o3, 0.0f);
        }
    }

    public void o00oo0OO(o00ooO0.o00oOOoO o00ooooo2, int i, int i2) {
        o00ooooo2.o00oOoO(o00oo0o0(i2, null), i);
    }

    public final void o00oo0Oo() {
        for (int i = 0; i < this.f7993o00oOooo; i++) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i];
            o00ooooo2.f7915o00oOOo0.f8021o00oOo0o = o00ooooo2.f7916o00oOOoO;
        }
    }

    public o00oo0O o00oo0o() {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7945o00oo0o0++;
        }
        if (this.f7991o00oOoo0 + 1 >= this.f7986o00oOo0o) {
            o00ooooO();
        }
        o00oo0O o00oOOo02 = o00oOOo0(o00oo0O.o00oOOoO.SLACK, null);
        int i = this.f7983o00oOOoO + 1;
        this.f7983o00oOOoO = i;
        this.f7991o00oOoo0++;
        o00oOOo02.f8019o00oOo00 = i;
        this.f7994o00oo0.f7924o00oOooO[i] = o00oOOo02;
        return o00oOOo02;
    }

    public o00oo0O o00oo0o0(int i, String str) {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7940o00oo0O++;
        }
        if (this.f7991o00oOoo0 + 1 >= this.f7986o00oOo0o) {
            o00ooooO();
        }
        o00oo0O o00oOOo02 = o00oOOo0(o00oo0O.o00oOOoO.ERROR, str);
        int i2 = this.f7983o00oOOoO + 1;
        this.f7983o00oOOoO = i2;
        this.f7991o00oOoo0++;
        o00oOOo02.f8019o00oOo00 = i2;
        o00oOOo02.f8020o00oOo0O = i;
        this.f7994o00oo0.f7924o00oOooO[i2] = o00oOOo02;
        this.f7992o00oOooO.o00oOooO(o00oOOo02);
        return o00oOOo02;
    }

    public o00oo0O o00oo0oO(Object obj) {
        o00oo0O o00oo0o2 = null;
        if (obj == null) {
            return null;
        }
        if (this.f7991o00oOoo0 + 1 >= this.f7986o00oOo0o) {
            o00ooooO();
        }
        if (obj instanceof o00ooO.o00oOo0O) {
            o00ooO.o00oOo0O o00ooo0o2 = (o00ooO.o00oOo0O) obj;
            o00oo0o2 = o00ooo0o2.o00oOoOo();
            if (o00oo0o2 == null) {
                o00ooo0o2.o00ooO0O(this.f7994o00oo0);
                o00oo0o2 = o00ooo0o2.o00oOoOo();
            }
            int i = o00oo0o2.f8019o00oOo00;
            if (i == -1 || i > this.f7983o00oOOoO || this.f7994o00oo0.f7924o00oOooO[i] == null) {
                if (i != -1) {
                    o00oo0o2.o00oOoO0();
                }
                int i2 = this.f7983o00oOOoO + 1;
                this.f7983o00oOOoO = i2;
                this.f7991o00oOoo0++;
                o00oo0o2.f8019o00oOo00 = i2;
                o00oo0o2.f8025o00oOoOo = o00oo0O.o00oOOoO.UNRESTRICTED;
                this.f7994o00oo0.f7924o00oOooO[i2] = o00oo0o2;
            }
        }
        return o00oo0o2;
    }

    public final void o00ooO() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Display Rows (");
        o00oOOo02.append(this.f7993o00oOooo);
        o00oOOo02.append("x");
        System.out.println(android.support.v4.media.o00oOo00.o00oOOo0(o00oOOo02, this.f7991o00oOoo0, ")\n"));
    }

    public final o00oo0O o00ooO0(String str, o00oo0O.o00oOOoO o00ooooo2) {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7941o00oo0O0++;
        }
        if (this.f7991o00oOoo0 + 1 >= this.f7986o00oOo0o) {
            o00ooooO();
        }
        o00oo0O o00oOOo02 = o00oOOo0(o00ooooo2, null);
        o00oOOo02.o00oOoOO(str);
        int i = this.f7983o00oOOoO + 1;
        this.f7983o00oOOoO = i;
        this.f7991o00oOoo0++;
        o00oOOo02.f8019o00oOo00 = i;
        if (this.f7984o00oOo00 == null) {
            this.f7984o00oOo00 = new HashMap<>();
        }
        this.f7984o00oOo00.put(str, o00oOOo02);
        this.f7994o00oo0.f7924o00oOooO[this.f7983o00oOOoO] = o00oOOo02;
        return o00oOOo02;
    }

    public o00oo0O o00ooO00() {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7943o00oo0Oo++;
        }
        if (this.f7991o00oOoo0 + 1 >= this.f7986o00oOo0o) {
            o00ooooO();
        }
        o00oo0O o00oOOo02 = o00oOOo0(o00oo0O.o00oOOoO.SLACK, null);
        int i = this.f7983o00oOOoO + 1;
        this.f7983o00oOOoO = i;
        this.f7991o00oOoo0++;
        o00oOOo02.f8019o00oOo00 = i;
        this.f7994o00oo0.f7924o00oOooO[i] = o00oOOo02;
        return o00oOOo02;
    }

    public void o00ooO0O() {
        o00ooO();
        StringBuilder sb = new StringBuilder();
        sb.append(" num vars ");
        String o00oOOo02 = android.support.v4.media.o00oOo00.o00oOOo0(sb, this.f7983o00oOOoO, "\n");
        for (int i = 0; i < this.f7983o00oOOoO + 1; i++) {
            o00oo0O o00oo0o2 = this.f7994o00oo0.f7924o00oOooO[i];
            if (o00oo0o2 != null && o00oo0o2.f8023o00oOoO0) {
                o00oOOo02 = o00oOOo02 + " $[" + i + "] => " + o00oo0o2 + " = " + o00oo0o2.f8021o00oOo0o + "\n";
            }
        }
        String o00oOOo03 = o00oo.o00oOOo0(o00oOOo02, "\n");
        for (int i2 = 0; i2 < this.f7983o00oOOoO + 1; i2++) {
            o00oo0O[] o00oo0oArr = this.f7994o00oo0.f7924o00oOooO;
            o00oo0O o00oo0o3 = o00oo0oArr[i2];
            if (o00oo0o3 != null && o00oo0o3.f8029o00oo0) {
                o00oOOo03 = o00oOOo03 + " ~[" + i2 + "] => " + o00oo0o3 + " = " + o00oo0oArr[o00oo0o3.f8033o00oo0OO] + " + " + o00oo0o3.f8032o00oo0O0 + "\n";
            }
        }
        String o00oOOo04 = o00oo.o00oOOo0(o00oOOo03, "\n\n #  ");
        for (int i3 = 0; i3 < this.f7993o00oOooo; i3++) {
            StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0(o00oOOo04);
            o00oOOo05.append(this.f7988o00oOoO0[i3].o00ooOo0());
            o00oOOo04 = o00oo.o00oOOo0(o00oOOo05.toString(), "\n #  ");
        }
        if (this.f7992o00oOooO != null) {
            StringBuilder o00oOOo06 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo04, "Goal: ");
            o00oOOo06.append(this.f7992o00oOooO);
            o00oOOo06.append("\n");
            o00oOOo04 = o00oOOo06.toString();
        }
        System.out.println(o00oOOo04);
    }

    public final void o00ooO0o() {
        o00ooO();
        String str = "";
        for (int i = 0; i < this.f7993o00oOooo; i++) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
            o00oOOo02.append(this.f7988o00oOoO0[i]);
            str = o00oo.o00oOOo0(o00oOOo02.toString(), "\n");
        }
        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
        o00oOOo03.append(this.f7992o00oOooO);
        o00oOOo03.append("\n");
        System.out.println(o00oOOo03.toString());
    }

    public void o00ooOO() {
        o00ooO();
        String str = "";
        for (int i = 0; i < this.f7993o00oOooo; i++) {
            if (this.f7988o00oOoO0[i].f7915o00oOOo0.f8025o00oOoOo == o00oo0O.o00oOOoO.UNRESTRICTED) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
                o00oOOo02.append(this.f7988o00oOoO0[i].o00ooOo0());
                str = o00oo.o00oOOo0(o00oOOo02.toString(), "\n");
            }
        }
        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
        o00oOOo03.append(this.f7992o00oOooO);
        o00oOOo03.append("\n");
        System.out.println(o00oOOo03.toString());
    }

    public void o00ooOO0() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7985o00oOo0O; i2++) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i2];
            if (o00ooooo2 != null) {
                i += o00ooooo2.o00ooOOo();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f7993o00oOooo; i4++) {
            o00ooO0.o00oOOoO o00ooooo3 = this.f7988o00oOoO0[i4];
            if (o00ooooo3 != null) {
                i3 += o00ooooo3.o00ooOOo();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Linear System -> Table size: ");
        o00oOOo02.append(this.f7985o00oOo0O);
        o00oOOo02.append(" (");
        int i5 = this.f7985o00oOo0O;
        o00oOOo02.append(o00ooOoO(i5 * i5));
        o00oOOo02.append(") -- row sizes: ");
        o00oOOo02.append(o00ooOoO(i));
        o00oOOo02.append(", actual size: ");
        o00oOOo02.append(o00ooOoO(i3));
        o00oOOo02.append(" rows: ");
        o00oOOo02.append(this.f7993o00oOooo);
        o00oOOo02.append("/");
        o00oOOo02.append(this.f7995o00oo00O);
        o00oOOo02.append(" cols: ");
        o00oOOo02.append(this.f7991o00oOoo0);
        o00oOOo02.append("/");
        o00oOOo02.append(this.f7986o00oOo0o);
        o00oOOo02.append(" ");
        o00oOOo02.append(0);
        o00oOOo02.append(" occupied cells, ");
        o00oOOo02.append(o00ooOoO(0));
        printStream.println(o00oOOo02.toString());
    }

    public final int o00ooOOo(o00oOOo0 o00oooo02) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f7993o00oOooo) {
                z = false;
                break;
            }
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i];
            if (o00ooooo2.f7915o00oOOo0.f8025o00oOoOo != o00oo0O.o00oOOoO.UNRESTRICTED && o00ooooo2.f7916o00oOOoO < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                o00oo0 o00oo0Var = f7979o00ooOO0;
                if (o00oo0Var != null) {
                    o00oo0Var.f7942o00oo0OO++;
                }
                i2++;
                float f = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f7993o00oOooo; i6++) {
                    o00ooO0.o00oOOoO o00ooooo3 = this.f7988o00oOoO0[i6];
                    if (o00ooooo3.f7915o00oOOo0.f8025o00oOoOo != o00oo0O.o00oOOoO.UNRESTRICTED && !o00ooooo3.f7919o00oOo0o && o00ooooo3.f7916o00oOOoO < 0.0f) {
                        int i7 = 9;
                        if (f7976o00ooO0O) {
                            int o00oOoO2 = o00ooooo3.f7918o00oOo0O.o00oOoO();
                            int i8 = 0;
                            while (i8 < o00oOoO2) {
                                o00oo0O o00oOOoO2 = o00ooooo3.f7918o00oOo0O.o00oOOoO(i8);
                                float o00oOooO2 = o00ooooo3.f7918o00oOo0O.o00oOooO(o00oOOoO2);
                                if (o00oOooO2 > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f2 = o00oOOoO2.f8022o00oOoO[i9] / o00oOooO2;
                                        if ((f2 < f && i9 == i5) || i9 > i5) {
                                            i4 = o00oOOoO2.f8019o00oOo00;
                                            i5 = i9;
                                            i3 = i6;
                                            f = f2;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.f7991o00oOoo0; i10++) {
                                o00oo0O o00oo0o2 = this.f7994o00oo0.f7924o00oOooO[i10];
                                float o00oOooO3 = o00ooooo3.f7918o00oOo0O.o00oOooO(o00oo0o2);
                                if (o00oOooO3 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f3 = o00oo0o2.f8022o00oOoO[i11] / o00oOooO3;
                                        if ((f3 < f && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i5 = i11;
                                            i3 = i6;
                                            f = f3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    o00ooO0.o00oOOoO o00ooooo4 = this.f7988o00oOoO0[i3];
                    o00ooooo4.f7915o00oOOo0.f8027o00oOooO = -1;
                    o00oo0 o00oo0Var2 = f7979o00ooOO0;
                    if (o00oo0Var2 != null) {
                        o00oo0Var2.f7938o00oo0++;
                    }
                    o00ooooo4.o00ooOO0(this.f7994o00oo0.f7924o00oOooO[i4]);
                    o00oo0O o00oo0o3 = o00ooooo4.f7915o00oOOo0;
                    o00oo0o3.f8027o00oOooO = i3;
                    o00oo0o3.o00oo00O(this, o00ooooo4);
                } else {
                    z2 = true;
                }
                if (i2 > this.f7991o00oOoo0 / 2) {
                    z2 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    public o00oOo00 o00ooOo() {
        return this.f7994o00oo0;
    }

    public void o00ooOo0(o00oo0 o00oo0Var) {
        f7979o00ooOO0 = o00oo0Var;
    }

    public final String o00ooOoO(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        return i4 > 0 ? o00oOoO.o00oOOo0("", i4, " Mb") : i3 > 0 ? o00oOoO.o00oOOo0("", i3, " Kb") : o00oOoO.o00oOOo0("", i2, " bytes");
    }

    public final String o00ooOoo(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 8 ? "FIXED" : i == 6 ? "BARRIER" : "NONE";
    }

    public int o00ooo0() {
        int i = 0;
        for (int i2 = 0; i2 < this.f7993o00oOooo; i2++) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i2];
            if (o00ooooo2 != null) {
                i = o00ooooo2.o00ooOOo() + i;
            }
        }
        return i;
    }

    public o00oOOo0 o00ooo00() {
        return this.f7992o00oOooO;
    }

    public int o00ooo0o() {
        return this.f7993o00oOooo;
    }

    public int o00oooO() {
        return this.f7983o00oOOoO;
    }

    public int o00oooOO(Object obj) {
        o00oo0O o00oOoOo2 = ((o00ooO.o00oOo0O) obj).o00oOoOo();
        if (o00oOoOo2 != null) {
            return (int) (o00oOoOo2.f8021o00oOo0o + 0.5f);
        }
        return 0;
    }

    public o00ooO0.o00oOOoO o00oooOo(int i) {
        return this.f7988o00oOoO0[i];
    }

    public o00oo0O o00oooo(String str, o00oo0O.o00oOOoO o00ooooo2) {
        if (this.f7984o00oOo00 == null) {
            this.f7984o00oOo00 = new HashMap<>();
        }
        o00oo0O o00oo0o2 = this.f7984o00oOo00.get(str);
        return o00oo0o2 == null ? o00ooO0(str, o00ooooo2) : o00oo0o2;
    }

    public float o00oooo0(String str) {
        o00oo0O o00oooo2 = o00oooo(str, o00oo0O.o00oOOoO.UNRESTRICTED);
        if (o00oooo2 == null) {
            return 0.0f;
        }
        return o00oooo2.f8021o00oOo0o;
    }

    public final void o00ooooO() {
        int i = this.f7985o00oOo0O * 2;
        this.f7985o00oOo0O = i;
        this.f7988o00oOoO0 = (o00ooO0.o00oOOoO[]) Arrays.copyOf(this.f7988o00oOoO0, i);
        o00oOo00 o00ooo002 = this.f7994o00oo0;
        o00ooo002.f7924o00oOooO = (o00oo0O[]) Arrays.copyOf(o00ooo002.f7924o00oOooO, this.f7985o00oOo0O);
        int i2 = this.f7985o00oOo0O;
        this.f7990o00oOoOo = new boolean[i2];
        this.f7986o00oOo0o = i2;
        this.f7995o00oo00O = i2;
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7930o00oOoO++;
            o00oo0Var.f7944o00oo0o = Math.max(o00oo0Var.f7944o00oo0o, i2);
            o00oo0 o00oo0Var2 = f7979o00ooOO0;
            o00oo0Var2.f7960o00ooo00 = o00oo0Var2.f7944o00oo0o;
        }
    }

    public void o00ooooo() throws Exception {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7932o00oOoOO++;
        }
        if (this.f7992o00oOooO.isEmpty()) {
            o00oo0Oo();
            return;
        }
        if (this.f7987o00oOoO || this.f7989o00oOoOO) {
            o00oo0 o00oo0Var2 = f7979o00ooOO0;
            if (o00oo0Var2 != null) {
                o00oo0Var2.f7967o0O0o++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f7993o00oOooo) {
                    z = true;
                    break;
                } else if (!this.f7988o00oOoO0[i].f7919o00oOo0o) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                o00oo0 o00oo0Var3 = f7979o00ooOO0;
                if (o00oo0Var3 != null) {
                    o00oo0Var3.f7946o00oo0oO++;
                }
                o00oo0Oo();
                return;
            }
        }
        o0(this.f7992o00oOooO);
    }

    public void o0O000() {
        o00oOo00 o00ooo002;
        int i = 0;
        while (true) {
            o00ooo002 = this.f7994o00oo0;
            o00oo0O[] o00oo0oArr = o00ooo002.f7924o00oOooO;
            if (i >= o00oo0oArr.length) {
                break;
            }
            o00oo0O o00oo0o2 = o00oo0oArr[i];
            if (o00oo0o2 != null) {
                o00oo0o2.o00oOoO0();
            }
            i++;
        }
        o00ooo002.f7923o00oOo00.o00oOOoO(this.f7998o00oo0OO, this.f7997o00oo0O0);
        this.f7997o00oo0O0 = 0;
        Arrays.fill(this.f7994o00oo0.f7924o00oOooO, (Object) null);
        HashMap<String, o00oo0O> hashMap = this.f7984o00oOo00;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f7983o00oOOoO = 0;
        this.f7992o00oOooO.clear();
        this.f7991o00oOoo0 = 1;
        for (int i2 = 0; i2 < this.f7993o00oOooo; i2++) {
            o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i2];
            if (o00ooooo2 != null) {
                o00ooooo2.f7917o00oOo00 = false;
            }
        }
        o0O0000O();
        this.f7993o00oOooo = 0;
        this.f7996o00oo0O = f7977o00ooO0o ? new o00oOOoO(this.f7994o00oo0) : new o00ooO0.o00oOOoO(this.f7994o00oo0);
    }

    public final int o0O00000(o00oOOo0 o00oooo02, boolean z) {
        o00oo0 o00oo0Var = f7979o00ooOO0;
        if (o00oo0Var != null) {
            o00oo0Var.f7936o00oOooo++;
        }
        for (int i = 0; i < this.f7991o00oOoo0; i++) {
            this.f7990o00oOoOo[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            o00oo0 o00oo0Var2 = f7979o00ooOO0;
            if (o00oo0Var2 != null) {
                o00oo0Var2.f7939o00oo00O++;
            }
            i2++;
            if (i2 >= this.f7991o00oOoo0 * 2) {
                return i2;
            }
            if (o00oooo02.getKey() != null) {
                this.f7990o00oOoOo[o00oooo02.getKey().f8019o00oOo00] = true;
            }
            o00oo0O o00oOOoO2 = o00oooo02.o00oOOoO(this, this.f7990o00oOoOo);
            if (o00oOOoO2 != null) {
                boolean[] zArr = this.f7990o00oOoOo;
                int i3 = o00oOOoO2.f8019o00oOo00;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (o00oOOoO2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f7993o00oOooo; i5++) {
                    o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i5];
                    if (o00ooooo2.f7915o00oOOo0.f8025o00oOoOo != o00oo0O.o00oOOoO.UNRESTRICTED && !o00ooooo2.f7919o00oOo0o && o00ooooo2.o00ooO0(o00oOOoO2)) {
                        float o00oOooO2 = o00ooooo2.f7918o00oOo0O.o00oOooO(o00oOOoO2);
                        if (o00oOooO2 < 0.0f) {
                            float f2 = (-o00ooooo2.f7916o00oOOoO) / o00oOooO2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    o00ooO0.o00oOOoO o00ooooo3 = this.f7988o00oOoO0[i4];
                    o00ooooo3.f7915o00oOOo0.f8027o00oOooO = -1;
                    o00oo0 o00oo0Var3 = f7979o00ooOO0;
                    if (o00oo0Var3 != null) {
                        o00oo0Var3.f7938o00oo0++;
                    }
                    o00ooooo3.o00ooOO0(o00oOOoO2);
                    o00oo0O o00oo0o2 = o00ooooo3.f7915o00oOOo0;
                    o00oo0o2.f8027o00oOooO = i4;
                    o00oo0o2.o00oo00O(this, o00ooooo3);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    public final void o0O0000O() {
        int i = 0;
        if (f7977o00ooO0o) {
            while (i < this.f7993o00oOooo) {
                o00ooO0.o00oOOoO o00ooooo2 = this.f7988o00oOoO0[i];
                if (o00ooooo2 != null) {
                    this.f7994o00oo0.f7921o00oOOo0.o00oOOo0(o00ooooo2);
                }
                this.f7988o00oOoO0[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f7993o00oOooo) {
            o00ooO0.o00oOOoO o00ooooo3 = this.f7988o00oOoO0[i];
            if (o00ooooo3 != null) {
                this.f7994o00oo0.f7922o00oOOoO.o00oOOo0(o00ooooo3);
            }
            this.f7988o00oOoO0[i] = null;
            i++;
        }
    }

    public void o0O0000o(o00ooO0.o00oOOoO o00ooooo2) {
        o00oo0O o00oo0o2;
        int i;
        if (!o00ooooo2.f7919o00oOo0o || (o00oo0o2 = o00ooooo2.f7915o00oOOo0) == null) {
            return;
        }
        int i2 = o00oo0o2.f8027o00oOooO;
        if (i2 != -1) {
            while (true) {
                i = this.f7993o00oOooo;
                if (i2 >= i - 1) {
                    break;
                }
                o00ooO0.o00oOOoO[] o00oooooArr = this.f7988o00oOoO0;
                int i3 = i2 + 1;
                o00ooO0.o00oOOoO o00ooooo3 = o00oooooArr[i3];
                o00oo0O o00oo0o3 = o00ooooo3.f7915o00oOOo0;
                if (o00oo0o3.f8027o00oOooO == i3) {
                    o00oo0o3.f8027o00oOooO = i2;
                }
                o00oooooArr[i2] = o00ooooo3;
                i2 = i3;
            }
            this.f7993o00oOooo = i - 1;
        }
        o00oo0O o00oo0o4 = o00ooooo2.f7915o00oOOo0;
        if (!o00oo0o4.f8023o00oOoO0) {
            o00oo0o4.o00oOoO(this, o00ooooo2.f7916o00oOOoO);
        }
        (f7977o00ooO0o ? this.f7994o00oo0.f7921o00oOOo0 : this.f7994o00oo0.f7922o00oOOoO).o00oOOo0(o00ooooo2);
    }

    public o00ooO0.o00oOOoO o0O0o() {
        o00ooO0.o00oOOoO acquire;
        if (f7977o00ooO0o) {
            acquire = this.f7994o00oo0.f7921o00oOOo0.acquire();
            if (acquire == null) {
                acquire = new o00oOOoO(this.f7994o00oo0);
                f7980o00ooOOo++;
            }
            acquire.o00ooOO();
        } else {
            acquire = this.f7994o00oo0.f7922o00oOOoO.acquire();
            if (acquire == null) {
                acquire = new o00ooO0.o00oOOoO(this.f7994o00oo0);
                f7978o00ooOO++;
            }
            acquire.o00ooOO();
        }
        o00oo0O.o00oOo0O();
        return acquire;
    }
}
