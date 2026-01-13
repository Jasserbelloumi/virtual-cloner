package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Path;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¨\u0006\f"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Lo00oooOo/oOO0O0O;", o00oOOoO.f12961o00oOo00, TtmlNode.TAG_P, "o00oOo0o", "o00oOooO", "o00oOo0O", "o00oOOo0", "o00oOoO0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class oOO0O0 {
    @o0OOooO0(19)
    @NotNull
    public static final Path o00oOOo0(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.TAG_P);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @o0OOooO0(26)
    @NotNull
    public static final Iterable<oOO0O0O> o00oOOoO(@NotNull Path path, float f) {
        o0ooO.o00oo0O0(path, "<this>");
        Collection<oOO0O0O> o00oOOoO2 = oOO0OO0O.o00oOOoO(path, f);
        o0ooO.o00oo0OO(o00oOOoO2, "flatten(this, error)");
        return o00oOOoO2;
    }

    public static /* synthetic */ Iterable o00oOo00(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return o00oOOoO(path, f);
    }

    @o0OOooO0(19)
    @NotNull
    public static final Path o00oOo0O(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @o0OOooO0(19)
    @NotNull
    public static final Path o00oOo0o(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @o0OOooO0(19)
    @NotNull
    public static final Path o00oOoO0(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }

    @o0OOooO0(19)
    @NotNull
    public static final Path o00oOooO(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }
}
