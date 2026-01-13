package o0OOO0oO;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0OoOoOo extends o0O00OOO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(file, file2, str);
        o0OOOOO0.o0ooO.o00oo0O0(file, "file");
    }

    public /* synthetic */ o0OoOoOo(File file, File file2, String str, int i, o0OOOOO0.o0O00 o0o00) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
