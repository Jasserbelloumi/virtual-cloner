package o0OOO0oO;

import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00O0o extends ByteArrayOutputStream {
    public o0O00O0o(int i) {
        super(i);
    }

    @NotNull
    public final byte[] o00oOOo0() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        o0OOOOO0.o0ooO.o00oo0OO(bArr, "buf");
        return bArr;
    }
}
