package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo00O extends o0OO0oO.o0O0OOO0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13543o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final float[] f13544o00oo0O0;

    public o00oo00O(@NotNull float[] fArr) {
        o0ooO.o00oo0O0(fArr, "array");
        this.f13544o00oo0O0 = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13543o00oo0O < this.f13544o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O0OOO0
    public float o00oOOoO() {
        try {
            float[] fArr = this.f13544o00oo0O0;
            int i = this.f13543o00oo0O;
            this.f13543o00oo0O = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13543o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
