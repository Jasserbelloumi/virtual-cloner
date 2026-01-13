package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OoO00O extends o0OO000o<double[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final double[] f13635o00oOooO;

    public o0OoO00O(int i) {
        super(i);
        this.f13635o00oOooO = new double[i];
    }

    public final void o00oOoO(double d) {
        double[] dArr = this.f13635o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        dArr[i] = d;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull double[] dArr) {
        o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public final double[] o00oOoOo() {
        return o00oOoO0(this.f13635o00oOooO, new double[o00oOo0o()]);
    }
}
