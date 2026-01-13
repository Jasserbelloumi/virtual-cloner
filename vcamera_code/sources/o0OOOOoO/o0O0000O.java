package o0OOOOoO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import o0OOOOO0.o0ooO;
/* loaded from: classes3.dex */
public final class o0O0000O {
    public static final boolean o00oOo00(o00ooO o00ooo) {
        Object obj;
        for (o00ooO o00ooo2 = o00ooo.f13660o00oOo00; o00ooo2 != null; o00ooo2 = o00ooo2.f13660o00oOo00) {
            Object obj2 = o00ooo2.f13659o00oOOoO;
            if (obj2 == null || (obj = o00ooo.f13659o00oOOoO) == null) {
                try {
                    if (Files.isSameFile(o00ooo2.f13658o00oOOo0, o00ooo.f13658o00oOOo0)) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (o0ooO.o00oOoO0(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Object o00oOooO(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            o0ooO.o00oo0OO(readAttributes, "readAttributes(this, A::class.java, *options)");
            return readAttributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
