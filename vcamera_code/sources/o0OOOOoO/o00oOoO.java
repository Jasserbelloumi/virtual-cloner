package o0OOOOoO;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import o0O0Oo.o0O0OOO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o00oo0OO
/* loaded from: classes3.dex */
public final class o00oOoO implements o00oOo00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOoO f13640o00oOOo0 = new o00oOoO();

    @Override // o0OOOOoO.o00oOo00
    @NotNull
    public o00oOo0O o00oOOo0(@NotNull Path path, @NotNull Path path2, boolean z) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        LinkOption[] o00oOOo02 = o00oo.f13641o00oOOo0.o00oOOo0(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(o00oOOo02, o00oOOo02.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(o00oOOo02, o00oOOo02.length);
            o0ooO.o00oo0OO(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return o00oOo0O.CONTINUE;
    }
}
