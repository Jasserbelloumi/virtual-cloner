package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00ooO extends o0OO000o<boolean[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final boolean[] f13547o00oOooO;

    public o00ooO(int i) {
        super(i);
        this.f13547o00oOooO = new boolean[i];
    }

    public final void o00oOoO(boolean z) {
        boolean[] zArr = this.f13547o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        zArr[i] = z;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull boolean[] zArr) {
        o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public final boolean[] o00oOoOo() {
        return o00oOoO0(this.f13547o00oOooO, new boolean[o00oOo0o()]);
    }
}
