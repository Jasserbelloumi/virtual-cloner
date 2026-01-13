package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOOoO extends o0OO0oO.o0O000Oo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13531o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final boolean[] f13532o00oo0O0;

    public o00oOOoO(@NotNull boolean[] zArr) {
        o0ooO.o00oo0O0(zArr, "array");
        this.f13532o00oo0O0 = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13531o00oo0O < this.f13532o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O000Oo
    public boolean o00oOOoO() {
        try {
            boolean[] zArr = this.f13532o00oo0O0;
            int i = this.f13531o00oo0O;
            this.f13531o00oo0O = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13531o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
