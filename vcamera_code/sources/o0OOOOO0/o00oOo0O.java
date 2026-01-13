package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOo0O extends o0OO0oO.o0O00 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13535o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final char[] f13536o00oo0O0;

    public o00oOo0O(@NotNull char[] cArr) {
        o0ooO.o00oo0O0(cArr, "array");
        this.f13536o00oo0O0 = cArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13535o00oo0O < this.f13536o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O00
    public char o00oOOoO() {
        try {
            char[] cArr = this.f13536o00oo0O0;
            int i = this.f13535o00oo0O;
            this.f13535o00oo0O = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13535o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
