package o0OOOOO0;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOo00 extends o0OO0oO.o0O000o0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13533o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final byte[] f13534o00oo0O0;

    public o00oOo00(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "array");
        this.f13534o00oo0O0 = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13533o00oo0O < this.f13534o00oo0O0.length;
    }

    @Override // o0OO0oO.o0O000o0
    public byte o00oOOoO() {
        try {
            byte[] bArr = this.f13534o00oo0O0;
            int i = this.f13533o00oo0O;
            this.f13533o00oo0O = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13533o00oo0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
