package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00000 extends o0OO000o<byte[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final byte[] f13560o00oOooO;

    public o0O00000(int i) {
        super(i);
        this.f13560o00oOooO = new byte[i];
    }

    public final void o00oOoO(byte b) {
        byte[] bArr = this.f13560o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        bArr[i] = b;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public final byte[] o00oOoOo() {
        return o00oOoO0(this.f13560o00oOooO, new byte[o00oOo0o()]);
    }
}
