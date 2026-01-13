package o0OOOOoO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.nio.file.Path;
import java.nio.file.Paths;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO0O00o0;
import o0OOOoo0.oO0O0O0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0 f13637o00oOOo0 = new o0();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Path f13638o00oOOoO = Paths.get("", new String[0]);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Path f13639o00oOo00 = Paths.get("..", new String[0]);

    @NotNull
    public final Path o00oOOo0(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "path");
        o0ooO.o00oo0O0(path2, TtmlNode.RUBY_BASE);
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i = 0; i < min; i++) {
            Path name = normalize.getName(i);
            Path path3 = f13639o00oOo00;
            if (!o0ooO.o00oOoO0(name, path3)) {
                break;
            } else if (!o0ooO.o00oOoO0(normalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (o0ooO.o00oOoO0(normalize2, normalize) || !o0ooO.o00oOoO0(normalize, f13638o00oOOoO)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            o0ooO.o00oo0OO(separator, "rn.fileSystem.separator");
            normalize2 = oO0O00o0.o0O0oooO(obj, separator, false, 2, null) ? relativize.getFileSystem().getPath(oO0O0O0.o0o0Oo0O(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        o0ooO.o00oo0OO(normalize2, "r");
        return normalize2;
    }
}
