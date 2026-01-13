package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O0O0o0 extends o0OO000o<int[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int[] f13594o00oOooO;

    public o0O0O0o0(int i) {
        super(i);
        this.f13594o00oOooO = new int[i];
    }

    public final void o00oOoO(int i) {
        int[] iArr = this.f13594o00oOooO;
        int i2 = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i2 + 1;
        iArr[i2] = i;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull int[] iArr) {
        o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public final int[] o00oOoOo() {
        return o00oOoO0(this.f13594o00oOooO, new int[o00oOo0o()]);
    }
}
