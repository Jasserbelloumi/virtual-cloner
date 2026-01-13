package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OO extends o0OO000o<short[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final short[] f13602o00oOooO;

    public o0OO(int i) {
        super(i);
        this.f13602o00oOooO = new short[i];
    }

    public final void o00oOoO(short s) {
        short[] sArr = this.f13602o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        sArr[i] = s;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull short[] sArr) {
        o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public final short[] o00oOoOo() {
        return o00oOoO0(this.f13602o00oOooO, new short[o00oOo0o()]);
    }
}
