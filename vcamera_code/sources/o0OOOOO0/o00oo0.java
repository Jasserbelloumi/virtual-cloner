package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo0 extends o0OO0oO.o0O0o0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13541o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int[] f13542o00oo0O0;

    public o00oo0(@NotNull int[] iArr) {
        o0ooO.o00oo0O0(iArr, "array");
        this.f13542o00oo0O0 = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13541o00oo0O < this.f13542o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O0o0
    public int nextInt() {
        try {
            int[] iArr = this.f13542o00oo0O0;
            int i = this.f13541o00oo0O;
            this.f13541o00oo0O = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13541o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
