package o0O0Oo0o;

import android.graphics.Rect;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o0O00 extends o0O0o0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f11910o00oOooO = 3.0f;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f11909o00oOo0O = 80;

    @Override // o0O0Oo0o.o0O00O0
    public long o00oOo00(ViewGroup viewGroup, androidx.transition.o0O0000O o0o0000o, o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        int i;
        int i2;
        int i3;
        o0OoO00O o0ooo00o3 = o0ooo00o;
        if (o0ooo00o3 == null && o0ooo00o2 == null) {
            return 0L;
        }
        Rect epicenter = o0o0000o.getEpicenter();
        if (o0ooo00o2 == null || o00oOo0O(o0ooo00o3) == 0) {
            i = -1;
        } else {
            o0ooo00o3 = o0ooo00o2;
            i = 1;
        }
        int o00oOo0o2 = o00oOo0o(o0ooo00o3);
        int o00oOoO02 = o00oOoO0(o0ooo00o3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (epicenter != null) {
            i2 = epicenter.centerX();
            i3 = epicenter.centerY();
        } else {
            i2 = (round + width) / 2;
            i3 = (round2 + height) / 2;
        }
        float o00oOoO2 = o00oOoO(viewGroup, o00oOo0o2, o00oOoO02, i2, i3, round, round2, width, height) / o00oOoOO(viewGroup);
        long duration = o0o0000o.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.f11910o00oOooO) * o00oOoO2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if ((o0O000oo.o0O0o00O.o0O000O(r7) == 1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((o0O000oo.o0O0o00O.o0O000O(r7) == 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o00oOoO(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f11909o00oOo0O
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L19
            int r7 = o0O000oo.o0O0o00O.o0O000O(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = r3
        L13:
            if (r4 == 0) goto L17
        L15:
            r0 = r1
            goto L29
        L17:
            r0 = r2
            goto L29
        L19:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L29
            int r7 = o0O000oo.o0O0o00O.o0O000O(r7)
            if (r7 != r4) goto L25
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L15
            goto L17
        L29:
            if (r0 == r2) goto L51
            if (r0 == r1) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r7 + r9
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r7 + r15
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r7 + r8
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r7 + r14
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0Oo0o.o0O00.o00oOoO(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public final int o00oOoOO(ViewGroup viewGroup) {
        int i = this.f11909o00oOo0O;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void o00oOoOo(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f11910o00oOooO = f;
    }

    public void o00oOoo0(int i) {
        this.f11909o00oOo0O = i;
    }
}
