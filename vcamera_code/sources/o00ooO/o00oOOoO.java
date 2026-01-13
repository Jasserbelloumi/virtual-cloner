package o00ooO;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f7604o00oOOo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f7605o00oOOoO = false;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r7 == 2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r7 == 2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o00oOOo0(o00ooO.o00oo00O r37, o00ooO0.o00oo00O r38, int r39, int r40, o00ooO.o00oOo00 r41) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO.o00oOOoO.o00oOOo0(o00ooO.o00oo00O, o00ooO0.o00oo00O, int, int, o00ooO.o00oOo00):void");
    }

    public static void o00oOOoO(o00oo00O o00oo00o, o00ooO0.o00oo00O o00oo00o2, ArrayList<o00oOoO> arrayList, int i) {
        o00oOo00[] o00ooo00Arr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = o00oo00o.f7831o0O0oOo0;
            o00ooo00Arr = o00oo00o.f7832o0O0oOoO;
            i2 = 0;
        } else {
            int i4 = o00oo00o.f7848oo0oOOo;
            o00ooo00Arr = o00oo00o.f7830o0O0oOo;
            i2 = 2;
            i3 = i4;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            o00oOo00 o00ooo002 = o00ooo00Arr[i5];
            o00ooo002.o00oOOo0();
            if (arrayList == null || arrayList.contains(o00ooo002.f7606o00oOOo0)) {
                o00oOOo0(o00oo00o, o00oo00o2, i, i2, o00ooo002);
            }
        }
    }
}
