package o00ooOO0;

import android.support.v4.media.o00oOo0O;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOoOo.o00oo;
import o00ooO.o00oOoO;
import o00ooO.o00oo00O;
/* loaded from: classes.dex */
public class o0O0000O extends o0O00o00 {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public ArrayList<o0O00o00> f8883o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f8884o00oOooo;

    public o0O0000O(o00oOoO o00oooo2, int i) {
        super(o00oooo2);
        this.f8883o00oOoo0 = new ArrayList<>();
        this.f8920o00oOo0o = i;
        o00oo0oO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x019f, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c5, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c7, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ca, code lost:
        r9.f8919o00oOo0O.o00oOo0O(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03e9, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // o00ooOO0.o0O00o00, o00ooOO0.o0O000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOOo0(o00ooOO0.o0O000 r26) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O0000O.o00oOOo0(o00ooOO0.o0O000):void");
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0O() {
        for (int i = 0; i < this.f8883o00oOoo0.size(); i++) {
            this.f8883o00oOoo0.get(i).o00oOo0O();
        }
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oOo0o() {
        this.f8918o00oOo00 = null;
        Iterator<o0O00o00> it = this.f8883o00oOoo0.iterator();
        while (it.hasNext()) {
            it.next().o00oOo0o();
        }
    }

    @Override // o00ooOO0.o0O00o00
    public long o00oOoOo() {
        int size = this.f8883o00oOoo0.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            o0O00o00 o0o00o00 = this.f8883o00oOoo0.get(i);
            j = o0o00o00.f8923o00oOoOO.f8889o00oOo0o + o0o00o00.o00oOoOo() + j + o0o00o00.f8921o00oOoO.f8889o00oOo0o;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        o00oOOoO(r5.f8923o00oOoOO, r1, -r0);
     */
    @Override // o00ooOO0.o0O00o00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOooO() {
        /*
            r5 = this;
            java.util.ArrayList<o00ooOO0.o0O00o00> r0 = r5.f8883o00oOoo0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            o00ooOO0.o0O00o00 r1 = (o00ooOO0.o0O00o00) r1
            r1.o00oOooO()
            goto L6
        L16:
            java.util.ArrayList<o00ooOO0.o0O00o00> r0 = r5.f8883o00oOoo0
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<o00ooOO0.o0O00o00> r2 = r5.f8883o00oOoo0
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            o00ooOO0.o0O00o00 r2 = (o00ooOO0.o0O00o00) r2
            o00ooO.o00oOoO r2 = r2.f8917o00oOOoO
            java.util.ArrayList<o00ooOO0.o0O00o00> r4 = r5.f8883o00oOoo0
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            o00ooOO0.o0O00o00 r0 = (o00ooOO0.o0O00o00) r0
            o00ooO.o00oOoO r0 = r0.f8917o00oOOoO
            int r4 = r5.f8920o00oOo0o
            if (r4 != 0) goto L70
            o00ooO.o00oOo0O r1 = r2.f7704o00ooo00
            o00ooO.o00oOo0O r0 = r0.f7705o00ooo0O
            o00ooOO0.o0O000Oo r2 = r5.o00oOoOO(r1, r3)
            int r1 = r1.o00oOoO0()
            o00ooO.o00oOoO r4 = r5.o0O0o()
            if (r4 == 0) goto L52
            o00ooO.o00oOo0O r1 = r4.f7704o00ooo00
            int r1 = r1.o00oOoO0()
        L52:
            if (r2 == 0) goto L59
            o00ooOO0.o0O000Oo r4 = r5.f8921o00oOoO
            r5.o00oOOoO(r4, r2, r1)
        L59:
            o00ooOO0.o0O000Oo r1 = r5.o00oOoOO(r0, r3)
            int r0 = r0.o00oOoO0()
            o00ooO.o00oOoO r2 = r5.o00oo()
            if (r2 == 0) goto L6d
            o00ooO.o00oOo0O r0 = r2.f7705o00ooo0O
            int r0 = r0.o00oOoO0()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            o00ooO.o00oOo0O r2 = r2.f7703o00ooo0
            o00ooO.o00oOo0O r0 = r0.f7706o00ooo0o
            o00ooOO0.o0O000Oo r3 = r5.o00oOoOO(r2, r1)
            int r2 = r2.o00oOoO0()
            o00ooO.o00oOoO r4 = r5.o0O0o()
            if (r4 == 0) goto L88
            o00ooO.o00oOo0O r2 = r4.f7703o00ooo0
            int r2 = r2.o00oOoO0()
        L88:
            if (r3 == 0) goto L8f
            o00ooOO0.o0O000Oo r4 = r5.f8921o00oOoO
            r5.o00oOOoO(r4, r3, r2)
        L8f:
            o00ooOO0.o0O000Oo r1 = r5.o00oOoOO(r0, r1)
            int r0 = r0.o00oOoO0()
            o00ooO.o00oOoO r2 = r5.o00oo()
            if (r2 == 0) goto La3
            o00ooO.o00oOo0O r0 = r2.f7706o00ooo0o
            int r0 = r0.o00oOoO0()
        La3:
            if (r1 == 0) goto Lab
        La5:
            o00ooOO0.o0O000Oo r2 = r5.f8923o00oOoOO
            int r0 = -r0
            r5.o00oOOoO(r2, r1, r0)
        Lab:
            o00ooOO0.o0O000Oo r0 = r5.f8921o00oOoO
            r0.f8885o00oOOo0 = r5
            o00ooOO0.o0O000Oo r0 = r5.f8923o00oOoOO
            r0.f8885o00oOOo0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooOO0.o0O0000O.o00oOooO():void");
    }

    public final o00oOoO o00oo() {
        for (int size = this.f8883o00oOoo0.size() - 1; size >= 0; size--) {
            o0O00o00 o0o00o00 = this.f8883o00oOoo0.get(size);
            if (o0o00o00.f8917o00oOOoO.o0O00O0() != 8) {
                return o0o00o00.f8917o00oOOoO;
            }
        }
        return null;
    }

    @Override // o00ooOO0.o0O00o00
    public void o00oo0() {
        this.f8921o00oOoO.f8893o00oOoOo = false;
        this.f8923o00oOoOO.f8893o00oOoOo = false;
    }

    @Override // o00ooOO0.o0O00o00
    public boolean o00oo0O0() {
        int size = this.f8883o00oOoo0.size();
        for (int i = 0; i < size; i++) {
            if (!this.f8883o00oOoo0.get(i).o00oo0O0()) {
                return false;
            }
        }
        return true;
    }

    public final void o00oo0oO() {
        o00oOoO o00oooo2;
        o00oOoO o00oooo3 = this.f8917o00oOOoO;
        do {
            o00oooo2 = o00oooo3;
            o00oooo3 = o00oooo3.o0O00000(this.f8920o00oOo0o);
        } while (o00oooo3 != null);
        this.f8917o00oOOoO = o00oooo2;
        this.f8883o00oOoo0.add(o00oooo2.o0OoOoOo(this.f8920o00oOo0o));
        o00oOoO o00oooo4 = o00oooo2.o00oooo(this.f8920o00oOo0o);
        while (o00oooo4 != null) {
            this.f8883o00oOoo0.add(o00oooo4.o0OoOoOo(this.f8920o00oOo0o));
            o00oooo4 = o00oooo4.o00oooo(this.f8920o00oOo0o);
        }
        Iterator<o0O00o00> it = this.f8883o00oOoo0.iterator();
        while (it.hasNext()) {
            o0O00o00 next = it.next();
            int i = this.f8920o00oOo0o;
            if (i == 0) {
                next.f8917o00oOOoO.f7671o00oOo00 = this;
            } else if (i == 1) {
                next.f8917o00oOOoO.f7679o00oOooO = this;
            }
        }
        if ((this.f8920o00oOo0o == 0 && ((o00oo00O) this.f8917o00oOOoO.o0()).o0OOO00o()) && this.f8883o00oOoo0.size() > 1) {
            ArrayList<o0O00o00> arrayList = this.f8883o00oOoo0;
            this.f8917o00oOOoO = arrayList.get(arrayList.size() - 1).f8917o00oOOoO;
        }
        this.f8884o00oOooo = this.f8920o00oOo0o == 0 ? this.f8917o00oOOoO.o00ooOo() : this.f8917o00oOOoO.o0ooOoOO();
    }

    public final o00oOoO o0O0o() {
        for (int i = 0; i < this.f8883o00oOoo0.size(); i++) {
            o0O00o00 o0o00o00 = this.f8883o00oOoo0.get(i);
            if (o0o00o00.f8917o00oOOoO.o0O00O0() != 8) {
                return o0o00o00.f8917o00oOOoO;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ChainRun ");
        o00oOOo02.append(this.f8920o00oOo0o == 0 ? "horizontal : " : "vertical : ");
        String sb = o00oOOo02.toString();
        Iterator<o0O00o00> it = this.f8883o00oOoo0.iterator();
        while (it.hasNext()) {
            String o00oOOo03 = o00oo.o00oOOo0(sb, "<");
            sb = o00oo.o00oOOo0(o00oOOo03 + it.next(), "> ");
        }
        return sb;
    }
}
