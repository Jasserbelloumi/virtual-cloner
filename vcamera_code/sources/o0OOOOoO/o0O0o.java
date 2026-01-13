package o0OOOOoO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0o extends SimpleFileVisitor<Path> {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> f13666o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> f13667o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0OOOO.o0O00000<Path, IOException, FileVisitResult> f13668o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OOOO.o0O00000<Path, IOException, FileVisitResult> f13669o00oOooO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o(@Nullable o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> o0o00000, @Nullable o0OOOO.o0O00000<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> o0o000002, @Nullable o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> o0o000003, @Nullable o0OOOO.o0O00000<? super Path, ? super IOException, ? extends FileVisitResult> o0o000004) {
        this.f13666o00oOOo0 = o0o00000;
        this.f13667o00oOOoO = o0o000002;
        this.f13668o00oOo00 = o0o000003;
        this.f13669o00oOooO = o0o000004;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOOo0 */
    public FileVisitResult postVisitDirectory(@NotNull Path path, @Nullable IOException iOException) {
        FileVisitResult invoke;
        o0ooO.o00oo0O0(path, "dir");
        o0OOOO.o0O00000<Path, IOException, FileVisitResult> o0o00000 = this.f13669o00oOooO;
        if (o0o00000 == null || (invoke = o0o00000.invoke(path, iOException)) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
            o0ooO.o00oo0OO(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
            return postVisitDirectory;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOOoO */
    public FileVisitResult preVisitDirectory(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        FileVisitResult invoke;
        o0ooO.o00oo0O0(path, "dir");
        o0ooO.o00oo0O0(basicFileAttributes, "attrs");
        o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> o0o00000 = this.f13666o00oOOo0;
        if (o0o00000 == null || (invoke = o0o00000.invoke(path, basicFileAttributes)) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
            o0ooO.o00oo0OO(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
            return preVisitDirectory;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOo00 */
    public FileVisitResult visitFile(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        FileVisitResult invoke;
        o0ooO.o00oo0O0(path, "file");
        o0ooO.o00oo0O0(basicFileAttributes, "attrs");
        o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> o0o00000 = this.f13667o00oOOoO;
        if (o0o00000 == null || (invoke = o0o00000.invoke(path, basicFileAttributes)) == null) {
            FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
            o0ooO.o00oo0OO(visitFile, "super.visitFile(file, attrs)");
            return visitFile;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOooO */
    public FileVisitResult visitFileFailed(@NotNull Path path, @NotNull IOException iOException) {
        FileVisitResult invoke;
        o0ooO.o00oo0O0(path, "file");
        o0ooO.o00oo0O0(iOException, "exc");
        o0OOOO.o0O00000<Path, IOException, FileVisitResult> o0o00000 = this.f13668o00oOo00;
        if (o0o00000 == null || (invoke = o0o00000.invoke(path, iOException)) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
            o0ooO.o00oo0OO(visitFileFailed, "super.visitFileFailed(file, exc)");
            return visitFileFailed;
        }
        return invoke;
    }
}
