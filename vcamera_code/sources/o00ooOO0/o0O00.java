package o00ooOO0;

import java.util.ArrayList;
import java.util.Iterator;
import o00ooO.o00oOOo0;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO.o00oo00O;
import o00ooO.o00oo0OO;
import o00ooOO0.o0O00000;
/* loaded from: classes.dex */
public class o0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f8856o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f8857o00oOOoO = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o0O00000.o00oOOo0 f8858o00oOo00 = new o0O00000.o00oOOo0();

    public static boolean o00oOOo0(o00oOoO o00oooo2) {
        o00oOoO.o00oOOoO o00ooOoO2 = o00oooo2.o00ooOoO();
        o00oOoO.o00oOOoO o0O000oo2 = o00oooo2.o0O000oo();
        o00oo00O o00oo00o = o00oooo2.o0() != null ? (o00oo00O) o00oooo2.o0() : null;
        if (o00oo00o != null) {
            o00oo00o.o00ooOoO();
            o00oOoO.o00oOOoO o00ooooo2 = o00oOoO.o00oOOoO.FIXED;
        }
        if (o00oo00o != null) {
            o00oo00o.o0O000oo();
            o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.FIXED;
        }
        o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.FIXED;
        boolean z = o00ooOoO2 == o00ooooo4 || o00ooOoO2 == o00oOoO.o00oOOoO.WRAP_CONTENT || (o00ooOoO2 == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && o00oooo2.f7685o00oo0O0 == 0 && o00oooo2.f7715o0O000 == 0.0f && o00oooo2.o0O00OOO(0)) || o00oooo2.o0O0O0O();
        boolean z2 = o0O000oo2 == o00ooooo4 || o0O000oo2 == o00oOoO.o00oOOoO.WRAP_CONTENT || (o0O000oo2 == o00oOoO.o00oOOoO.MATCH_CONSTRAINT && o00oooo2.f7684o00oo0O == 0 && o00oooo2.f7715o0O000 == 0.0f && o00oooo2.o0O00OOO(1)) || o00oooo2.o0oO0O0o();
        if (o00oooo2.f7715o0O000 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void o00oOOoO(o00oOoO o00oooo2, o0O00000.o00oOOoO o00ooooo2, boolean z) {
        o00oOo0O o00ooo0o2;
        o00oOo0O o00ooo0o3;
        o00oOo0O o00ooo0o4;
        o00oOo0O o00ooo0o5;
        o00oOo0O o00ooo0o6;
        if (!(o00oooo2 instanceof o00oo00O) && o00oooo2.o0O00oO0() && o00oOOo0(o00oooo2)) {
            o00oo00O.o0OOO0O(o00oooo2, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
        }
        o00oOo0O o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.LEFT);
        o00oOo0O o00oo0Oo3 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.RIGHT);
        int o00oOo0o2 = o00oo0Oo2.o00oOo0o();
        int o00oOo0o3 = o00oo0Oo3.o00oOo0o();
        if (o00oo0Oo2.o00oOo0O() != null && o00oo0Oo2.o00oo0OO()) {
            Iterator<o00oOo0O> it = o00oo0Oo2.o00oOo0O().iterator();
            while (it.hasNext()) {
                o00oOo0O next = it.next();
                o00oOoO o00oooo3 = next.f7638o00oOooO;
                boolean o00oOOo02 = o00oOOo0(o00oooo3);
                if (o00oooo3.o0O00oO0() && o00oOOo02) {
                    o00oo00O.o0OOO0O(o00oooo3, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
                }
                o00oOoO.o00oOOoO o00ooOoO2 = o00oooo3.o00ooOoO();
                o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o00ooOoO2 != o00ooooo3 || o00oOOo02) {
                    if (!o00oooo3.o0O00oO0()) {
                        o00oOo0O o00ooo0o7 = o00oooo3.f7704o00ooo00;
                        if (next == o00ooo0o7 && o00oooo3.f7705o00ooo0O.f7634o00oOo0o == null) {
                            int o00oOoO02 = o00ooo0o7.o00oOoO0() + o00oOo0o2;
                            o00oooo3.o0O0OoO0(o00oOoO02, o00oooo3.o0OoO00O() + o00oOoO02);
                        } else {
                            o00oOo0O o00ooo0o8 = o00oooo3.f7705o00ooo0O;
                            if (next == o00ooo0o8 && o00ooo0o7.f7634o00oOo0o == null) {
                                int o00oOoO03 = o00oOo0o2 - o00ooo0o8.o00oOoO0();
                                o00oooo3.o0O0OoO0(o00oOoO03 - o00oooo3.o0OoO00O(), o00oOoO03);
                            } else if (next == o00ooo0o7 && (o00ooo0o4 = o00ooo0o8.f7634o00oOo0o) != null && o00ooo0o4.o00oo0OO() && !o00oooo3.o0O00o00()) {
                                o00oOo0O(o00ooooo2, o00oooo3, z);
                            }
                        }
                        o00oOOoO(o00oooo3, o00ooooo2, z);
                    }
                } else if (o00oooo3.o00ooOoO() == o00ooooo3 && o00oooo3.f7688o00oo0o >= 0 && o00oooo3.f7689o00oo0o0 >= 0 && (o00oooo3.o0O00O0() == 8 || (o00oooo3.f7685o00oo0O0 == 0 && o00oooo3.o00ooO0o() == 0.0f))) {
                    if (!o00oooo3.o0O00o00() && !o00oooo3.o0O00o()) {
                        if (((next == o00oooo3.f7704o00ooo00 && (o00ooo0o6 = o00oooo3.f7705o00ooo0O.f7634o00oOo0o) != null && o00ooo0o6.o00oo0OO()) || (next == o00oooo3.f7705o00ooo0O && (o00ooo0o5 = o00oooo3.f7704o00ooo00.f7634o00oOo0o) != null && o00ooo0o5.o00oo0OO())) && !o00oooo3.o0O00o00()) {
                            o00oOo0o(o00oooo2, o00ooooo2, o00oooo3, z);
                        }
                    }
                }
            }
        }
        if ((o00oooo2 instanceof o00oo0OO) || o00oo0Oo3.o00oOo0O() == null || !o00oo0Oo3.o00oo0OO()) {
            return;
        }
        Iterator<o00oOo0O> it2 = o00oo0Oo3.o00oOo0O().iterator();
        while (it2.hasNext()) {
            o00oOo0O next2 = it2.next();
            o00oOoO o00oooo4 = next2.f7638o00oOooO;
            boolean o00oOOo03 = o00oOOo0(o00oooo4);
            if (o00oooo4.o0O00oO0() && o00oOOo03) {
                o00oo00O.o0OOO0O(o00oooo4, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
            }
            boolean z2 = (next2 == o00oooo4.f7704o00ooo00 && (o00ooo0o3 = o00oooo4.f7705o00ooo0O.f7634o00oOo0o) != null && o00ooo0o3.o00oo0OO()) || (next2 == o00oooo4.f7705o00ooo0O && (o00ooo0o2 = o00oooo4.f7704o00ooo00.f7634o00oOo0o) != null && o00ooo0o2.o00oo0OO());
            o00oOoO.o00oOOoO o00ooOoO3 = o00oooo4.o00ooOoO();
            o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
            if (o00ooOoO3 != o00ooooo4 || o00oOOo03) {
                if (!o00oooo4.o0O00oO0()) {
                    o00oOo0O o00ooo0o9 = o00oooo4.f7704o00ooo00;
                    if (next2 == o00ooo0o9 && o00oooo4.f7705o00ooo0O.f7634o00oOo0o == null) {
                        int o00oOoO04 = o00ooo0o9.o00oOoO0() + o00oOo0o3;
                        o00oooo4.o0O0OoO0(o00oOoO04, o00oooo4.o0OoO00O() + o00oOoO04);
                    } else {
                        o00oOo0O o00ooo0o10 = o00oooo4.f7705o00ooo0O;
                        if (next2 == o00ooo0o10 && o00ooo0o9.f7634o00oOo0o == null) {
                            int o00oOoO05 = o00oOo0o3 - o00ooo0o10.o00oOoO0();
                            o00oooo4.o0O0OoO0(o00oOoO05 - o00oooo4.o0OoO00O(), o00oOoO05);
                        } else if (z2 && !o00oooo4.o0O00o00()) {
                            o00oOo0O(o00ooooo2, o00oooo4, z);
                        }
                    }
                    o00oOOoO(o00oooo4, o00ooooo2, z);
                }
            } else if (o00oooo4.o00ooOoO() == o00ooooo4 && o00oooo4.f7688o00oo0o >= 0 && o00oooo4.f7689o00oo0o0 >= 0 && (o00oooo4.o0O00O0() == 8 || (o00oooo4.f7685o00oo0O0 == 0 && o00oooo4.o00ooO0o() == 0.0f))) {
                if (!o00oooo4.o0O00o00() && !o00oooo4.o0O00o() && z2 && !o00oooo4.o0O00o00()) {
                    o00oOo0o(o00oooo2, o00ooooo2, o00oooo4, z);
                }
            }
        }
    }

    public static void o00oOo00(o00oOOo0 o00oooo02, o0O00000.o00oOOoO o00ooooo2, int i, boolean z) {
        if (o00oooo02.oo0ooO()) {
            if (i == 0) {
                o00oOOoO(o00oooo02, o00ooooo2, z);
            } else {
                o00oOoOo(o00oooo02, o00ooooo2);
            }
        }
    }

    public static void o00oOo0O(o0O00000.o00oOOoO o00ooooo2, o00oOoO o00oooo2, boolean z) {
        float o00ooOOo2 = o00oooo2.o00ooOOo();
        int o00oOo0o2 = o00oooo2.f7704o00ooo00.f7634o00oOo0o.o00oOo0o();
        int o00oOo0o3 = o00oooo2.f7705o00ooo0O.f7634o00oOo0o.o00oOo0o();
        int o00oOoO02 = o00oooo2.f7704o00ooo00.o00oOoO0() + o00oOo0o2;
        int o00oOoO03 = o00oOo0o3 - o00oooo2.f7705o00ooo0O.o00oOoO0();
        if (o00oOo0o2 == o00oOo0o3) {
            o00ooOOo2 = 0.5f;
        } else {
            o00oOo0o2 = o00oOoO02;
            o00oOo0o3 = o00oOoO03;
        }
        int o0OoO00O2 = o00oooo2.o0OoO00O();
        int i = (o00oOo0o3 - o00oOo0o2) - o0OoO00O2;
        if (o00oOo0o2 > o00oOo0o3) {
            i = (o00oOo0o2 - o00oOo0o3) - o0OoO00O2;
        }
        int i2 = ((int) ((o00ooOOo2 * i) + 0.5f)) + o00oOo0o2;
        int i3 = i2 + o0OoO00O2;
        if (o00oOo0o2 > o00oOo0o3) {
            i3 = i2 - o0OoO00O2;
        }
        o00oooo2.o0O0OoO0(i2, i3);
        o00oOOoO(o00oooo2, o00ooooo2, z);
    }

    public static void o00oOo0o(o00oOoO o00oooo2, o0O00000.o00oOOoO o00ooooo2, o00oOoO o00oooo3, boolean z) {
        float o00ooOOo2 = o00oooo3.o00ooOOo();
        int o00oOoO02 = o00oooo3.f7704o00ooo00.o00oOoO0() + o00oooo3.f7704o00ooo00.f7634o00oOo0o.o00oOo0o();
        int o00oOo0o2 = o00oooo3.f7705o00ooo0O.f7634o00oOo0o.o00oOo0o() - o00oooo3.f7705o00ooo0O.o00oOoO0();
        if (o00oOo0o2 >= o00oOoO02) {
            int o0OoO00O2 = o00oooo3.o0OoO00O();
            if (o00oooo3.o0O00O0() != 8) {
                int i = o00oooo3.f7685o00oo0O0;
                if (i == 2) {
                    if (!(o00oooo2 instanceof o00oo00O)) {
                        o00oooo2 = o00oooo2.o0();
                    }
                    o0OoO00O2 = (int) (o00oooo3.o00ooOOo() * 0.5f * o00oooo2.o0OoO00O());
                } else if (i == 0) {
                    o0OoO00O2 = o00oOo0o2 - o00oOoO02;
                }
                o0OoO00O2 = Math.max(o00oooo3.f7689o00oo0o0, o0OoO00O2);
                int i2 = o00oooo3.f7688o00oo0o;
                if (i2 > 0) {
                    o0OoO00O2 = Math.min(i2, o0OoO00O2);
                }
            }
            int i3 = o00oOoO02 + ((int) ((o00ooOOo2 * ((o00oOo0o2 - o00oOoO02) - o0OoO00O2)) + 0.5f));
            o00oooo3.o0O0OoO0(i3, o0OoO00O2 + i3);
            o00oOOoO(o00oooo3, o00ooooo2, z);
        }
    }

    public static void o00oOoO(o00oOoO o00oooo2, o0O00000.o00oOOoO o00ooooo2, o00oOoO o00oooo3) {
        float o0O000o02 = o00oooo3.o0O000o0();
        int o00oOoO02 = o00oooo3.f7703o00ooo0.o00oOoO0() + o00oooo3.f7703o00ooo0.f7634o00oOo0o.o00oOo0o();
        int o00oOo0o2 = o00oooo3.f7706o00ooo0o.f7634o00oOo0o.o00oOo0o() - o00oooo3.f7706o00ooo0o.o00oOoO0();
        if (o00oOo0o2 >= o00oOoO02) {
            int o00ooOO2 = o00oooo3.o00ooOO();
            if (o00oooo3.o0O00O0() != 8) {
                int i = o00oooo3.f7684o00oo0O;
                if (i == 2) {
                    if (!(o00oooo2 instanceof o00oo00O)) {
                        o00oooo2 = o00oooo2.o0();
                    }
                    o00ooOO2 = (int) (o0O000o02 * 0.5f * o00oooo2.o00ooOO());
                } else if (i == 0) {
                    o00ooOO2 = o00oOo0o2 - o00oOoO02;
                }
                o00ooOO2 = Math.max(o00oooo3.f7749o0O0o, o00ooOO2);
                int i2 = o00oooo3.f7681o00oo;
                if (i2 > 0) {
                    o00ooOO2 = Math.min(i2, o00ooOO2);
                }
            }
            int i3 = o00oOoO02 + ((int) ((o0O000o02 * ((o00oOo0o2 - o00oOoO02) - o00ooOO2)) + 0.5f));
            o00oooo3.o0O0OoOo(i3, o00ooOO2 + i3);
            o00oOoOo(o00oooo3, o00ooooo2);
        }
    }

    public static void o00oOoO0(o0O00000.o00oOOoO o00ooooo2, o00oOoO o00oooo2) {
        float o0O000o02 = o00oooo2.o0O000o0();
        int o00oOo0o2 = o00oooo2.f7703o00ooo0.f7634o00oOo0o.o00oOo0o();
        int o00oOo0o3 = o00oooo2.f7706o00ooo0o.f7634o00oOo0o.o00oOo0o();
        int o00oOoO02 = o00oooo2.f7703o00ooo0.o00oOoO0() + o00oOo0o2;
        int o00oOoO03 = o00oOo0o3 - o00oooo2.f7706o00ooo0o.o00oOoO0();
        if (o00oOo0o2 == o00oOo0o3) {
            o0O000o02 = 0.5f;
        } else {
            o00oOo0o2 = o00oOoO02;
            o00oOo0o3 = o00oOoO03;
        }
        int o00ooOO2 = o00oooo2.o00ooOO();
        int i = (o00oOo0o3 - o00oOo0o2) - o00ooOO2;
        if (o00oOo0o2 > o00oOo0o3) {
            i = (o00oOo0o2 - o00oOo0o3) - o00ooOO2;
        }
        int i2 = (int) ((o0O000o02 * i) + 0.5f);
        int i3 = o00oOo0o2 + i2;
        int i4 = i3 + o00ooOO2;
        if (o00oOo0o2 > o00oOo0o3) {
            i3 = o00oOo0o2 - i2;
            i4 = i3 - o00ooOO2;
        }
        o00oooo2.o0O0OoOo(i3, i4);
        o00oOoOo(o00oooo2, o00ooooo2);
    }

    public static void o00oOoOO(o00oo00O o00oo00o, o0O00000.o00oOOoO o00ooooo2) {
        int o0OO00o02;
        int o0OO00o03;
        o00oOoO.o00oOOoO o00ooOoO2 = o00oo00o.o00ooOoO();
        o00oOoO.o00oOOoO o0O000oo2 = o00oo00o.o0O000oo();
        o00oo00o.o0O0OOO0();
        ArrayList<o00oOoO> oo0oO02 = o00oo00o.oo0oO0();
        int size = oo0oO02.size();
        for (int i = 0; i < size; i++) {
            oo0oO02.get(i).o0O0OOO0();
        }
        boolean o0OOO00o2 = o00oo00o.o0OOO00o();
        if (o00ooOoO2 == o00oOoO.o00oOOoO.FIXED) {
            o00oo00o.o0O0OoO0(0, o00oo00o.o0OoO00O());
        } else {
            o00oo00o.oo0OOoo(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o00oOoO o00oooo2 = oo0oO02.get(i2);
            if (o00oooo2 instanceof o00oo0OO) {
                o00oo0OO o00oo0oo = (o00oo0OO) o00oooo2;
                if (o00oo0oo.oo0ooO() == 1) {
                    if (o00oo0oo.o0OO00OO() != -1) {
                        o0OO00o03 = o00oo0oo.o0OO00OO();
                    } else if (o00oo0oo.o0OO00Oo() == -1 || !o00oo00o.o0O0O0O()) {
                        if (o00oo00o.o0O0O0O()) {
                            o0OO00o03 = (int) ((o00oo0oo.o0OO00o0() * o00oo00o.o0OoO00O()) + 0.5f);
                        }
                        z = true;
                    } else {
                        o0OO00o03 = o00oo00o.o0OoO00O() - o00oo0oo.o0OO00Oo();
                    }
                    o00oo0oo.o0OO0O0O(o0OO00o03);
                    z = true;
                }
            } else if ((o00oooo2 instanceof o00oOOo0) && ((o00oOOo0) o00oooo2).o0OO00o0() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                o00oOoO o00oooo3 = oo0oO02.get(i3);
                if (o00oooo3 instanceof o00oo0OO) {
                    o00oo0OO o00oo0oo2 = (o00oo0OO) o00oooo3;
                    if (o00oo0oo2.oo0ooO() == 1) {
                        o00oOOoO(o00oo0oo2, o00ooooo2, o0OOO00o2);
                    }
                }
            }
        }
        o00oOOoO(o00oo00o, o00ooooo2, o0OOO00o2);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                o00oOoO o00oooo4 = oo0oO02.get(i4);
                if (o00oooo4 instanceof o00oOOo0) {
                    o00oOOo0 o00oooo02 = (o00oOOo0) o00oooo4;
                    if (o00oooo02.o0OO00o0() == 0) {
                        o00oOo00(o00oooo02, o00ooooo2, 0, o0OOO00o2);
                    }
                }
            }
        }
        if (o0O000oo2 == o00oOoO.o00oOOoO.FIXED) {
            o00oo00o.o0O0OoOo(0, o00oo00o.o00ooOO());
        } else {
            o00oo00o.o0O0OoO(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o00oOoO o00oooo5 = oo0oO02.get(i5);
            if (o00oooo5 instanceof o00oo0OO) {
                o00oo0OO o00oo0oo3 = (o00oo0OO) o00oooo5;
                if (o00oo0oo3.oo0ooO() == 0) {
                    if (o00oo0oo3.o0OO00OO() != -1) {
                        o0OO00o02 = o00oo0oo3.o0OO00OO();
                    } else if (o00oo0oo3.o0OO00Oo() == -1 || !o00oo00o.o0oO0O0o()) {
                        if (o00oo00o.o0oO0O0o()) {
                            o0OO00o02 = (int) ((o00oo0oo3.o0OO00o0() * o00oo00o.o00ooOO()) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        o0OO00o02 = o00oo00o.o00ooOO() - o00oo0oo3.o0OO00Oo();
                    }
                    o00oo0oo3.o0OO0O0O(o0OO00o02);
                    z3 = true;
                }
            } else if ((o00oooo5 instanceof o00oOOo0) && ((o00oOOo0) o00oooo5).o0OO00o0() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                o00oOoO o00oooo6 = oo0oO02.get(i6);
                if (o00oooo6 instanceof o00oo0OO) {
                    o00oo0OO o00oo0oo4 = (o00oo0OO) o00oooo6;
                    if (o00oo0oo4.oo0ooO() == 0) {
                        o00oOoOo(o00oo0oo4, o00ooooo2);
                    }
                }
            }
        }
        o00oOoOo(o00oo00o, o00ooooo2);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                o00oOoO o00oooo7 = oo0oO02.get(i7);
                if (o00oooo7 instanceof o00oOOo0) {
                    o00oOOo0 o00oooo03 = (o00oOOo0) o00oooo7;
                    if (o00oooo03.o0OO00o0() == 1) {
                        o00oOo00(o00oooo03, o00ooooo2, 1, o0OOO00o2);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            o00oOoO o00oooo8 = oo0oO02.get(i8);
            if (o00oooo8.o0O00oO0() && o00oOOo0(o00oooo8)) {
                o00oo00O.o0OOO0O(o00oooo8, o00ooooo2, f8858o00oOo00, o0O00000.o00oOOo0.f8870o00oOoo0);
                o00oOOoO(o00oooo8, o00ooooo2, o0OOO00o2);
                o00oOoOo(o00oooo8, o00ooooo2);
            }
        }
    }

    public static void o00oOoOo(o00oOoO o00oooo2, o0O00000.o00oOOoO o00ooooo2) {
        o00oOo0O o00ooo0o2;
        o00oOo0O o00ooo0o3;
        o00oOo0O o00ooo0o4;
        o00oOo0O o00ooo0o5;
        o00oOo0O o00ooo0o6;
        if (!(o00oooo2 instanceof o00oo00O) && o00oooo2.o0O00oO0() && o00oOOo0(o00oooo2)) {
            o00oo00O.o0OOO0O(o00oooo2, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
        }
        o00oOo0O o00oo0Oo2 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.TOP);
        o00oOo0O o00oo0Oo3 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.BOTTOM);
        int o00oOo0o2 = o00oo0Oo2.o00oOo0o();
        int o00oOo0o3 = o00oo0Oo3.o00oOo0o();
        if (o00oo0Oo2.o00oOo0O() != null && o00oo0Oo2.o00oo0OO()) {
            Iterator<o00oOo0O> it = o00oo0Oo2.o00oOo0O().iterator();
            while (it.hasNext()) {
                o00oOo0O next = it.next();
                o00oOoO o00oooo3 = next.f7638o00oOooO;
                boolean o00oOOo02 = o00oOOo0(o00oooo3);
                if (o00oooo3.o0O00oO0() && o00oOOo02) {
                    o00oo00O.o0OOO0O(o00oooo3, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
                }
                o00oOoO.o00oOOoO o0O000oo2 = o00oooo3.o0O000oo();
                o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o0O000oo2 != o00ooooo3 || o00oOOo02) {
                    if (!o00oooo3.o0O00oO0()) {
                        o00oOo0O o00ooo0o7 = o00oooo3.f7703o00ooo0;
                        if (next == o00ooo0o7 && o00oooo3.f7706o00ooo0o.f7634o00oOo0o == null) {
                            int o00oOoO02 = o00ooo0o7.o00oOoO0() + o00oOo0o2;
                            o00oooo3.o0O0OoOo(o00oOoO02, o00oooo3.o00ooOO() + o00oOoO02);
                        } else {
                            o00oOo0O o00ooo0o8 = o00oooo3.f7706o00ooo0o;
                            if (next == o00ooo0o8 && o00ooo0o8.f7634o00oOo0o == null) {
                                int o00oOoO03 = o00oOo0o2 - o00ooo0o8.o00oOoO0();
                                o00oooo3.o0O0OoOo(o00oOoO03 - o00oooo3.o00ooOO(), o00oOoO03);
                            } else if (next == o00ooo0o7 && (o00ooo0o4 = o00ooo0o8.f7634o00oOo0o) != null && o00ooo0o4.o00oo0OO()) {
                                o00oOoO0(o00ooooo2, o00oooo3);
                            }
                        }
                        o00oOoOo(o00oooo3, o00ooooo2);
                    }
                } else if (o00oooo3.o0O000oo() == o00ooooo3 && o00oooo3.f7681o00oo >= 0 && o00oooo3.f7749o0O0o >= 0 && (o00oooo3.o0O00O0() == 8 || (o00oooo3.f7684o00oo0O == 0 && o00oooo3.o00ooO0o() == 0.0f))) {
                    if (!o00oooo3.o0O00o0o() && !o00oooo3.o0O00o()) {
                        if (((next == o00oooo3.f7703o00ooo0 && (o00ooo0o6 = o00oooo3.f7706o00ooo0o.f7634o00oOo0o) != null && o00ooo0o6.o00oo0OO()) || (next == o00oooo3.f7706o00ooo0o && (o00ooo0o5 = o00oooo3.f7703o00ooo0.f7634o00oOo0o) != null && o00ooo0o5.o00oo0OO())) && !o00oooo3.o0O00o0o()) {
                            o00oOoO(o00oooo2, o00ooooo2, o00oooo3);
                        }
                    }
                }
            }
        }
        if (o00oooo2 instanceof o00oo0OO) {
            return;
        }
        if (o00oo0Oo3.o00oOo0O() != null && o00oo0Oo3.o00oo0OO()) {
            Iterator<o00oOo0O> it2 = o00oo0Oo3.o00oOo0O().iterator();
            while (it2.hasNext()) {
                o00oOo0O next2 = it2.next();
                o00oOoO o00oooo4 = next2.f7638o00oOooO;
                boolean o00oOOo03 = o00oOOo0(o00oooo4);
                if (o00oooo4.o0O00oO0() && o00oOOo03) {
                    o00oo00O.o0OOO0O(o00oooo4, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
                }
                boolean z = (next2 == o00oooo4.f7703o00ooo0 && (o00ooo0o3 = o00oooo4.f7706o00ooo0o.f7634o00oOo0o) != null && o00ooo0o3.o00oo0OO()) || (next2 == o00oooo4.f7706o00ooo0o && (o00ooo0o2 = o00oooo4.f7703o00ooo0.f7634o00oOo0o) != null && o00ooo0o2.o00oo0OO());
                o00oOoO.o00oOOoO o0O000oo3 = o00oooo4.o0O000oo();
                o00oOoO.o00oOOoO o00ooooo4 = o00oOoO.o00oOOoO.MATCH_CONSTRAINT;
                if (o0O000oo3 != o00ooooo4 || o00oOOo03) {
                    if (!o00oooo4.o0O00oO0()) {
                        o00oOo0O o00ooo0o9 = o00oooo4.f7703o00ooo0;
                        if (next2 == o00ooo0o9 && o00oooo4.f7706o00ooo0o.f7634o00oOo0o == null) {
                            int o00oOoO04 = o00ooo0o9.o00oOoO0() + o00oOo0o3;
                            o00oooo4.o0O0OoOo(o00oOoO04, o00oooo4.o00ooOO() + o00oOoO04);
                        } else {
                            o00oOo0O o00ooo0o10 = o00oooo4.f7706o00ooo0o;
                            if (next2 == o00ooo0o10 && o00ooo0o9.f7634o00oOo0o == null) {
                                int o00oOoO05 = o00oOo0o3 - o00ooo0o10.o00oOoO0();
                                o00oooo4.o0O0OoOo(o00oOoO05 - o00oooo4.o00ooOO(), o00oOoO05);
                            } else if (z && !o00oooo4.o0O00o0o()) {
                                o00oOoO0(o00ooooo2, o00oooo4);
                            }
                        }
                        o00oOoOo(o00oooo4, o00ooooo2);
                    }
                } else if (o00oooo4.o0O000oo() == o00ooooo4 && o00oooo4.f7681o00oo >= 0 && o00oooo4.f7749o0O0o >= 0 && (o00oooo4.o0O00O0() == 8 || (o00oooo4.f7684o00oo0O == 0 && o00oooo4.o00ooO0o() == 0.0f))) {
                    if (!o00oooo4.o0O00o0o() && !o00oooo4.o0O00o() && z && !o00oooo4.o0O00o0o()) {
                        o00oOoO(o00oooo2, o00ooooo2, o00oooo4);
                    }
                }
            }
        }
        o00oOo0O o00oo0Oo4 = o00oooo2.o00oo0Oo(o00oOo0O.o00oOOoO.BASELINE);
        if (o00oo0Oo4.o00oOo0O() == null || !o00oo0Oo4.o00oo0OO()) {
            return;
        }
        int o00oOo0o4 = o00oo0Oo4.o00oOo0o();
        Iterator<o00oOo0O> it3 = o00oo0Oo4.o00oOo0O().iterator();
        while (it3.hasNext()) {
            o00oOo0O next3 = it3.next();
            o00oOoO o00oooo5 = next3.f7638o00oOooO;
            boolean o00oOOo04 = o00oOOo0(o00oooo5);
            if (o00oooo5.o0O00oO0() && o00oOOo04) {
                o00oo00O.o0OOO0O(o00oooo5, o00ooooo2, new o0O00000.o00oOOo0(), o0O00000.o00oOOo0.f8870o00oOoo0);
            }
            if (o00oooo5.o0O000oo() != o00oOoO.o00oOOoO.MATCH_CONSTRAINT || o00oOOo04) {
                if (!o00oooo5.o0O00oO0() && next3 == o00oooo5.f7707o00oooO) {
                    o00oooo5.o0O0Oo(o00oOo0o4);
                    o00oOoOo(o00oooo5, o00ooooo2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cf, code lost:
        if (r6.f7638o00oOooO == r2) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o00oOooO(o00ooO.o00oo00O r18, o00ooO0.o00oo00O r19, int r20, int r21, o00ooO.o00oOo00 r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O00.o00oOooO(o00ooO.o00oo00O, o00ooO0.o00oo00O, int, int, o00ooO.o00oOo00, boolean, boolean, boolean):boolean");
    }
}
