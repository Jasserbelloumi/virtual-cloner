package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo extends o0OO0oO.o0OOO00 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13539o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final short[] f13540o00oo0O0;

    public o00oo(@NotNull short[] sArr) {
        o0ooO.o00oo0O0(sArr, "array");
        this.f13540o00oo0O0 = sArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13539o00oo0O < this.f13540o00oo0O0.length;
    }

    @Override // o0OO0oO.o0OOO00
    public short o00oOOoO() {
        try {
            short[] sArr = this.f13540o00oo0O0;
            int i = this.f13539o00oo0O;
            this.f13539o00oo0O = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13539o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
