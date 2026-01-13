package o0OOO0oO;

import android.support.v4.media.o00oOo0O;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00OO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final File f13457o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<File> f13458o00oOOoO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O00OO(@NotNull File file, @NotNull List<? extends File> list) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "root");
        o0OOOOO0.o0ooO.o00oo0O0(list, "segments");
        this.f13457o00oOOo0 = file;
        this.f13458o00oOOoO = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0O00OO o00oOooO(o0O00OO o0o00oo, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = o0o00oo.f13457o00oOOo0;
        }
        if ((i & 2) != 0) {
            list = o0o00oo.f13458o00oOOoO;
        }
        return o0o00oo.o00oOo00(file, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00OO) {
            o0O00OO o0o00oo = (o0O00OO) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f13457o00oOOo0, o0o00oo.f13457o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f13458o00oOOoO, o0o00oo.f13458o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        return this.f13458o00oOOoO.hashCode() + (this.f13457o00oOOo0.hashCode() * 31);
    }

    @NotNull
    public final File o00oOOo0() {
        return this.f13457o00oOOo0;
    }

    @NotNull
    public final List<File> o00oOOoO() {
        return this.f13458o00oOOoO;
    }

    @NotNull
    public final o0O00OO o00oOo00(@NotNull File file, @NotNull List<? extends File> list) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "root");
        o0OOOOO0.o0ooO.o00oo0O0(list, "segments");
        return new o0O00OO(file, list);
    }

    @NotNull
    public final File o00oOo0O() {
        return this.f13457o00oOOo0;
    }

    @NotNull
    public final String o00oOo0o() {
        String path = this.f13457o00oOOo0.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path, "root.path");
        return path;
    }

    public final int o00oOoO() {
        return this.f13458o00oOOoO.size();
    }

    @NotNull
    public final List<File> o00oOoO0() {
        return this.f13458o00oOOoO;
    }

    public final boolean o00oOoOO() {
        String path = this.f13457o00oOOo0.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path, "root.path");
        return path.length() > 0;
    }

    @NotNull
    public final File o00oOoOo(int i, int i2) {
        if (i < 0 || i > i2 || i2 > o00oOoO()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f13458o00oOOoO.subList(i, i2);
        String str = File.separator;
        o0OOOOO0.o0ooO.o00oo0OO(str, "separator");
        return new File(o0OO0oO.o0O0oo0o.o0OOo0o0(subList, str, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("FilePathComponents(root=");
        o00oOOo02.append(this.f13457o00oOOo0);
        o00oOOo02.append(", segments=");
        o00oOOo02.append(this.f13458o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
