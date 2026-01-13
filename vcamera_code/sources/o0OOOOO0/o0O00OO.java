package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00OO extends o0OO000o<float[]> {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final float[] f13588o00oOooO;

    public o0O00OO(int i) {
        super(i);
        this.f13588o00oOooO = new float[i];
    }

    public final void o00oOoO(float f) {
        float[] fArr = this.f13588o00oOooO;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        fArr[i] = f;
    }

    @Override // o0OOOOO0.o0OO000o
    /* renamed from: o00oOoOO */
    public int o00oOo00(@NotNull float[] fArr) {
        o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public final float[] o00oOoOo() {
        return o00oOoO0(this.f13588o00oOooO, new float[o00oOo0o()]);
    }
}
