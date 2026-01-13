package o00ooO;

import o00ooO.o00oOoO;
/* loaded from: classes.dex */
public class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f7881o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f7882o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f7883o00oOo00 = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f7884o00oOo0O = 8;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f7885o00oOo0o = 16;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f7886o00oOoO = 64;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f7887o00oOoO0 = 32;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f7888o00oOoOO = 128;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f7889o00oOoOo = 256;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f7890o00oOoo0 = 512;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f7891o00oOooO = 4;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f7892o00oOooo = 1024;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static boolean[] f7893o00oo0 = new boolean[3];

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f7894o00oo00O = 257;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f7895o00oo0O = 2;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f7896o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f7897o00oo0OO = 0;

    public static void o00oOOo0(o00oo00O o00oo00o, o00ooO0.o00oo00O o00oo00o2, o00oOoO o00oooo2) {
        o00oooo2.f7682o00oo0 = -1;
        o00oooo2.f7686o00oo0OO = -1;
        o00oOoO.o00oOOoO o00ooooo2 = o00oo00o.f7668o0[0];
        o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.WRAP_CONTENT;
        if (o00ooooo2 != o00ooooo3 && o00oooo2.f7668o0[0] == o00oOoO.o00oOOoO.MATCH_PARENT) {
            int i = o00oooo2.f7704o00ooo00.f7636o00oOoO0;
            int o0OoO00O2 = o00oo00o.o0OoO00O() - o00oooo2.f7705o00ooo0O.f7636o00oOoO0;
            o00oOo0O o00ooo0o2 = o00oooo2.f7704o00ooo00;
            o00ooo0o2.f7637o00oOoOO = o00oo00o2.o00oo0oO(o00ooo0o2);
            o00oOo0O o00ooo0o3 = o00oooo2.f7705o00ooo0O;
            o00ooo0o3.f7637o00oOoOO = o00oo00o2.o00oo0oO(o00ooo0o3);
            o00oo00o2.o00oOo0o(o00oooo2.f7704o00ooo00.f7637o00oOoOO, i);
            o00oo00o2.o00oOo0o(o00oooo2.f7705o00ooo0O.f7637o00oOoOO, o0OoO00O2);
            o00oooo2.f7682o00oo0 = 2;
            o00oooo2.o0O0o0O(i, o0OoO00O2);
        }
        if (o00oo00o.f7668o0[1] == o00ooooo3 || o00oooo2.f7668o0[1] != o00oOoO.o00oOOoO.MATCH_PARENT) {
            return;
        }
        int i2 = o00oooo2.f7703o00ooo0.f7636o00oOoO0;
        int o00ooOO2 = o00oo00o.o00ooOO() - o00oooo2.f7706o00ooo0o.f7636o00oOoO0;
        o00oOo0O o00ooo0o4 = o00oooo2.f7703o00ooo0;
        o00ooo0o4.f7637o00oOoOO = o00oo00o2.o00oo0oO(o00ooo0o4);
        o00oOo0O o00ooo0o5 = o00oooo2.f7706o00ooo0o;
        o00ooo0o5.f7637o00oOoOO = o00oo00o2.o00oo0oO(o00ooo0o5);
        o00oo00o2.o00oOo0o(o00oooo2.f7703o00ooo0.f7637o00oOoOO, i2);
        o00oo00o2.o00oOo0o(o00oooo2.f7706o00ooo0o.f7637o00oOoOO, o00ooOO2);
        if (o00oooo2.f7723o0O000oo > 0 || o00oooo2.o0O00O0() == 8) {
            o00oOo0O o00ooo0o6 = o00oooo2.f7707o00oooO;
            o00ooo0o6.f7637o00oOoOO = o00oo00o2.o00oo0oO(o00ooo0o6);
            o00oo00o2.o00oOo0o(o00oooo2.f7707o00oooO.f7637o00oOoOO, o00oooo2.f7723o0O000oo + i2);
        }
        o00oooo2.f7686o00oo0OO = 2;
        o00oooo2.o0O0oOoO(i2, o00ooOO2);
    }

    public static final boolean o00oOOoO(int i, int i2) {
        return (i & i2) == i2;
    }
}
