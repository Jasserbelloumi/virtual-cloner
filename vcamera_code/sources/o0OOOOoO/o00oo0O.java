package o0OOOOoO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO
/* loaded from: classes3.dex */
public final class o00oo0O implements o00oo0O0 {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f13653o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f13654o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> f13655o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f13656o00oOo0O;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> f13657o00oOooO;

    @Override // o0OOOOoO.o00oo0O0
    public void o00oOOo0(@NotNull o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "function");
        o00oOo0o();
        o00oOoO0(this.f13655o00oOo00, "onVisitFileFailed");
        this.f13655o00oOo00 = o0o00000;
    }

    @Override // o0OOOOoO.o00oo0O0
    public void o00oOOoO(@NotNull o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "function");
        o00oOo0o();
        o00oOoO0(this.f13654o00oOOoO, "onVisitFile");
        this.f13654o00oOOoO = o0o00000;
    }

    @Override // o0OOOOoO.o00oo0O0
    public void o00oOo00(@NotNull o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "function");
        o00oOo0o();
        o00oOoO0(this.f13657o00oOooO, "onPostVisitDirectory");
        this.f13657o00oOooO = o0o00000;
    }

    @NotNull
    public final FileVisitor<Path> o00oOo0O() {
        o00oOo0o();
        this.f13656o00oOo0O = true;
        return new o0O0o(this.f13653o00oOOo0, this.f13654o00oOOoO, this.f13655o00oOo00, this.f13657o00oOooO);
    }

    public final void o00oOo0o() {
        if (this.f13656o00oOo0O) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void o00oOoO0(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(o00oOoOo.o00oo.o00oOOo0(str, " was already defined"));
        }
    }

    @Override // o0OOOOoO.o00oo0O0
    public void o00oOooO(@NotNull o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "function");
        o00oOo0o();
        o00oOoO0(this.f13653o00oOOo0, "onPreVisitDirectory");
        this.f13653o00oOOo0 = o0o00000;
    }
}
