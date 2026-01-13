package o0OOOOoO;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f13646o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f13647o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<Exception> f13648o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Path f13649o00oOooO;

    public o00oo0() {
        this(0, 1, null);
    }

    public o00oo0(int i) {
        this.f13646o00oOOo0 = i;
        this.f13648o00oOo00 = new ArrayList();
    }

    public /* synthetic */ o00oo0(int i, int i2, o0O00 o0o00) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final void o00oOOo0(@NotNull Exception exc) {
        o0ooO.o00oo0O0(exc, "exception");
        this.f13647o00oOOoO++;
        if (this.f13648o00oOo00.size() < this.f13646o00oOOo0) {
            if (this.f13649o00oOooO != null) {
                Throwable initCause = new FileSystemException(String.valueOf(this.f13649o00oOooO)).initCause(exc);
                o0ooO.o00oo0(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = (FileSystemException) initCause;
            }
            this.f13648o00oOo00.add(exc);
        }
    }

    public final void o00oOOoO(@NotNull Path path) {
        o0ooO.o00oo0O0(path, "name");
        Path path2 = this.f13649o00oOooO;
        this.f13649o00oOooO = path2 != null ? path2.resolve(path) : null;
    }

    public final void o00oOo00(@NotNull Path path) {
        o0ooO.o00oo0O0(path, "name");
        Path path2 = this.f13649o00oOooO;
        if (!o0ooO.o00oOoO0(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path3 = this.f13649o00oOooO;
        this.f13649o00oOooO = path3 != null ? path3.getParent() : null;
    }

    @Nullable
    public final Path o00oOo0O() {
        return this.f13649o00oOooO;
    }

    public final int o00oOo0o() {
        return this.f13647o00oOOoO;
    }

    public final void o00oOoO0(@Nullable Path path) {
        this.f13649o00oOooO = path;
    }

    @NotNull
    public final List<Exception> o00oOooO() {
        return this.f13648o00oOo00;
    }
}
