package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOoO extends o0OO0oO.o0O0O0Oo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13537o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final double[] f13538o00oo0O0;

    public o00oOoO(@NotNull double[] dArr) {
        o0ooO.o00oo0O0(dArr, "array");
        this.f13538o00oo0O0 = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13537o00oo0O < this.f13538o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O0O0Oo
    public double nextDouble() {
        try {
            double[] dArr = this.f13538o00oo0O0;
            int i = this.f13537o00oo0O;
            this.f13537o00oo0O = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13537o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
