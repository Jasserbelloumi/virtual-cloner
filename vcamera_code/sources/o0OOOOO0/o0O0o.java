package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O0o extends o0OO0oO.o0oOo0O0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13600o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long[] f13601o00oo0O0;

    public o0O0o(@NotNull long[] jArr) {
        o0ooO.o00oo0O0(jArr, "array");
        this.f13601o00oo0O0 = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13600o00oo0O < this.f13601o00oo0O0.length;
    }

    @Override // o0OO0oO.o0oOo0O0
    public long nextLong() {
        try {
            long[] jArr = this.f13601o00oo0O0;
            int i = this.f13600o00oo0O;
            this.f13600o00oo0O = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13600o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
