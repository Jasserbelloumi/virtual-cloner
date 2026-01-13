package o00ooOO0;

import java.util.ArrayList;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO.o00oo0O;
import o00ooO.o00oo0OO;
/* loaded from: classes.dex */
public class o0O00O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f8900o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f8901o00oOOoO = false;

    public static o0oO0Ooo o00oOOo0(o00oOoO o00oooo2, int i, ArrayList<o0oO0Ooo> arrayList, o0oO0Ooo o0oo0ooo) {
        o00oOo0O o00ooo0o2;
        int oo0oO02;
        int i2 = i == 0 ? o00oooo2.f7746o0O0OOO : o00oooo2.f7748o0O0OOOo;
        if (i2 != -1 && (o0oo0ooo == null || i2 != o0oo0ooo.f8940o00oOOoO)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                o0oO0Ooo o0oo0ooo2 = arrayList.get(i3);
                if (o0oo0ooo2.o00oOo0o() == i2) {
                    if (o0oo0ooo != null) {
                        o0oo0ooo.o00oo00O(i, o0oo0ooo2);
                        arrayList.remove(o0oo0ooo);
                    }
                    o0oo0ooo = o0oo0ooo2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return o0oo0ooo;
        }
        if (o0oo0ooo == null) {
            if ((o00oooo2 instanceof o00oo0O) && (oo0oO02 = ((o00oo0O) o00oooo2).oo0oO0(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    o0oO0Ooo o0oo0ooo3 = arrayList.get(i4);
                    if (o0oo0ooo3.o00oOo0o() == oo0oO02) {
                        o0oo0ooo = o0oo0ooo3;
                        break;
                    }
                    i4++;
                }
            }
            if (o0oo0ooo == null) {
                o0oo0ooo = new o0oO0Ooo(i);
            }
            arrayList.add(o0oo0ooo);
        }
        if (o0oo0ooo.o00oOOo0(o00oooo2)) {
            if (o00oooo2 instanceof o00oo0OO) {
                o00oo0OO o00oo0oo = (o00oo0OO) o00oooo2;
                o00oo0oo.oo0oO0().o00oOooO(o00oo0oo.oo0ooO() == 0 ? 1 : 0, arrayList, o0oo0ooo);
            }
            int o00oOo0o2 = o0oo0ooo.o00oOo0o();
            if (i == 0) {
                o00oooo2.f7746o0O0OOO = o00oOo0o2;
                o00oooo2.f7704o00ooo00.o00oOooO(i, arrayList, o0oo0ooo);
                o00ooo0o2 = o00oooo2.f7705o00ooo0O;
            } else {
                o00oooo2.f7748o0O0OOOo = o00oOo0o2;
                o00oooo2.f7703o00ooo0.o00oOooO(i, arrayList, o0oo0ooo);
                o00oooo2.f7707o00oooO.o00oOooO(i, arrayList, o0oo0ooo);
                o00ooo0o2 = o00oooo2.f7706o00ooo0o;
            }
            o00ooo0o2.o00oOooO(i, arrayList, o0oo0ooo);
            o00oooo2.f7711o00oooo0.o00oOooO(i, arrayList, o0oo0ooo);
        }
        return o0oo0ooo;
    }

    public static o0oO0Ooo o00oOOoO(ArrayList<o0oO0Ooo> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0oO0Ooo o0oo0ooo = arrayList.get(i2);
            if (i == o0oo0ooo.f8940o00oOOoO) {
                return o0oo0ooo;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x038d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o00oOo00(o00ooO.o00oo00O r16, o00ooOO0.o0O00000.o00oOOoO r17) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O00O0.o00oOo00(o00ooO.o00oo00O, o00ooOO0.o0O00000$o00oOOoO):boolean");
    }

    public static boolean o00oOooO(o00oOoO.o00oOOoO o00ooooo2, o00oOoO.o00oOOoO o00ooooo3, o00oOoO.o00oOOoO o00ooooo4, o00oOoO.o00oOOoO o00ooooo5) {
        o00oOoO.o00oOOoO o00ooooo6;
        o00oOoO.o00oOOoO o00ooooo7;
        o00oOoO.o00oOOoO o00ooooo8 = o00oOoO.o00oOOoO.FIXED;
        return (o00ooooo4 == o00ooooo8 || o00ooooo4 == (o00ooooo7 = o00oOoO.o00oOOoO.WRAP_CONTENT) || (o00ooooo4 == o00oOoO.o00oOOoO.MATCH_PARENT && o00ooooo2 != o00ooooo7)) || (o00ooooo5 == o00ooooo8 || o00ooooo5 == (o00ooooo6 = o00oOoO.o00oOOoO.WRAP_CONTENT) || (o00ooooo5 == o00oOoO.o00oOOoO.MATCH_PARENT && o00ooooo3 != o00ooooo6));
    }
}
