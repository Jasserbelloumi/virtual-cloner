package o0OOO0oO;

import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O00OOO extends IOException {
    @NotNull
    private final File file;
    @Nullable
    private final File other;
    @Nullable
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(o0OoO00O.o00oOOoO(file, file2, str));
        o0OOOOO0.o0ooO.o00oo0O0(file, "file");
        this.file = file;
        this.other = file2;
        this.reason = str;
    }

    public /* synthetic */ o0O00OOO(File file, File file2, String str, int i, o0OOOOO0.o0O00 o0o00) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final File getOther() {
        return this.other;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }
}
