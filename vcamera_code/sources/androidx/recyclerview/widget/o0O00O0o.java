package androidx.recyclerview.widget;

import androidx.recyclerview.widget.o00oOOo0;
import java.util.List;
/* loaded from: classes.dex */
public class o0O00O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOo0 f4626o00oOOo0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        o00oOOo0.o00oOOoO o00oOOo0(int i, int i2, int i3, Object obj);

        void o00oOOoO(o00oOOo0.o00oOOoO o00ooooo2);
    }

    public o0O00O0o(o00oOOo0 o00oooo02) {
        this.f4626o00oOOo0 = o00oooo02;
    }

    public final int o00oOOo0(List<o00oOOo0.o00oOOoO> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4294o00oOOo0 != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    public void o00oOOoO(List<o00oOOo0.o00oOOoO> list) {
        while (true) {
            int o00oOOo02 = o00oOOo0(list);
            if (o00oOOo02 == -1) {
                return;
            }
            o00oOooO(list, o00oOOo02, o00oOOo02 + 1);
        }
    }

    public final void o00oOo00(List<o00oOOo0.o00oOOoO> list, int i, o00oOOo0.o00oOOoO o00ooooo2, int i2, o00oOOo0.o00oOOoO o00ooooo3) {
        int i3 = o00ooooo2.f4297o00oOooO;
        int i4 = o00ooooo3.f4295o00oOOoO;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = o00ooooo2.f4295o00oOOoO;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            o00ooooo2.f4295o00oOOoO = i6 + o00ooooo3.f4297o00oOooO;
        }
        int i7 = o00ooooo3.f4295o00oOOoO;
        if (i7 <= i3) {
            o00ooooo2.f4297o00oOooO = i3 + o00ooooo3.f4297o00oOooO;
        }
        o00ooooo3.f4295o00oOOoO = i7 + i5;
        list.set(i, o00ooooo3);
        list.set(i2, o00ooooo2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (r0 > r14.f4295o00oOOoO) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
        if (r0 >= r14.f4295o00oOOoO) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
        r12.f4297o00oOooO = r0 - r14.f4297o00oOooO;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOo0O(java.util.List<androidx.recyclerview.widget.o00oOOo0.o00oOOoO> r10, int r11, androidx.recyclerview.widget.o00oOOo0.o00oOOoO r12, int r13, androidx.recyclerview.widget.o00oOOo0.o00oOOoO r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o0O00O0o.o00oOo0O(java.util.List, int, androidx.recyclerview.widget.o00oOOo0$o00oOOoO, int, androidx.recyclerview.widget.o00oOOo0$o00oOOoO):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOo0o(java.util.List<androidx.recyclerview.widget.o00oOOo0.o00oOOoO> r9, int r10, androidx.recyclerview.widget.o00oOOo0.o00oOOoO r11, int r12, androidx.recyclerview.widget.o00oOOo0.o00oOOoO r13) {
        /*
            r8 = this;
            int r0 = r11.f4297o00oOooO
            int r1 = r13.f4295o00oOOoO
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f4295o00oOOoO = r1
            goto L20
        Ld:
            int r5 = r13.f4297o00oOooO
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f4297o00oOooO = r5
            androidx.recyclerview.widget.o0O00O0o$o00oOOo0 r0 = r8.f4626o00oOOo0
            int r1 = r11.f4295o00oOOoO
            java.lang.Object r5 = r13.f4296o00oOo00
            androidx.recyclerview.widget.o00oOOo0$o00oOOoO r0 = r0.o00oOOo0(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f4295o00oOOoO
            int r5 = r13.f4295o00oOOoO
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f4295o00oOOoO = r5
            goto L41
        L2b:
            int r6 = r13.f4297o00oOooO
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.o0O00O0o$o00oOOo0 r3 = r8.f4626o00oOOo0
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4296o00oOo00
            androidx.recyclerview.widget.o00oOOo0$o00oOOoO r3 = r3.o00oOOo0(r2, r1, r5, r4)
            int r1 = r13.f4297o00oOooO
            int r1 = r1 - r5
            r13.f4297o00oOooO = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4297o00oOooO
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.o0O00O0o$o00oOOo0 r11 = r8.f4626o00oOOo0
            r11.o00oOOoO(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o0O00O0o.o00oOo0o(java.util.List, int, androidx.recyclerview.widget.o00oOOo0$o00oOOoO, int, androidx.recyclerview.widget.o00oOOo0$o00oOOoO):void");
    }

    public final void o00oOooO(List<o00oOOo0.o00oOOoO> list, int i, int i2) {
        o00oOOo0.o00oOOoO o00ooooo2 = list.get(i);
        o00oOOo0.o00oOOoO o00ooooo3 = list.get(i2);
        int i3 = o00ooooo3.f4294o00oOOo0;
        if (i3 == 1) {
            o00oOo00(list, i, o00ooooo2, i2, o00ooooo3);
        } else if (i3 == 2) {
            o00oOo0O(list, i, o00ooooo2, i2, o00ooooo3);
        } else if (i3 != 4) {
        } else {
            o00oOo0o(list, i, o00ooooo2, i2, o00ooooo3);
        }
    }
}
