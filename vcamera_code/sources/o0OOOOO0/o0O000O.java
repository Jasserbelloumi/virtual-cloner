package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O000O extends o0OO000o<char[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final char[] f13561o00oOooO;

    public o0O000O(int i) {
        super(i);
        this.f13561o00oOooO = new char[i];
    }

    public final void o00oOoO(char c) {
        char[] cArr = this.f13561o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        cArr[i] = c;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull char[] cArr) {
        o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public final char[] o00oOoOo() {
        return o00oOoO0(this.f13561o00oOooO, new char[o00oOo0o()]);
    }
}
