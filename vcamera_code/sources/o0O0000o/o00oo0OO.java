package o0O0000o;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/net/Uri;", "o00oOo00", "Ljava/io/File;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oo0OO {
    @NotNull
    public static final File o00oOOo0(@NotNull Uri uri) {
        o0ooO.o00oo0O0(uri, "<this>");
        if (!o0ooO.o00oOoO0(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @NotNull
    public static final Uri o00oOOoO(@NotNull File file) {
        o0ooO.o00oo0O0(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        o0ooO.o00oo0OO(fromFile, "fromFile(this)");
        return fromFile;
    }

    @NotNull
    public static final Uri o00oOo00(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        Uri parse = Uri.parse(str);
        o0ooO.o00oo0OO(parse, "parse(this)");
        return parse;
    }
}
