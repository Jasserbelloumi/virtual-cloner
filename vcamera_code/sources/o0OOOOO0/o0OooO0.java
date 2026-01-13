package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OooO0 extends o0OO000o<long[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final long[] f13636o00oOooO;

    public o0OooO0(int i) {
        super(i);
        this.f13636o00oOooO = new long[i];
    }

    public final void o00oOoO(long j) {
        long[] jArr = this.f13636o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        jArr[i] = j;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull long[] jArr) {
        o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public final long[] o00oOoOo() {
        return o00oOoO0(this.f13636o00oOooO, new long[o00oOo0o()]);
    }
}
