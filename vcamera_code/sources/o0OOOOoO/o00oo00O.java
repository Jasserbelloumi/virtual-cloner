package o0OOOOoO;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo00O extends SimpleFileVisitor<Path> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f13650o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00ooO f13651o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OO0oO.o0O0o<o00ooO> f13652o00oOo00 = new o0OO0oO.o0O0o<>();

    public o00oo00O(boolean z) {
        this.f13650o00oOOo0 = z;
    }

    public final boolean o00oOOo0() {
        return this.f13650o00oOOo0;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOOoO */
    public FileVisitResult preVisitDirectory(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        o0ooO.o00oo0O0(path, "dir");
        o0ooO.o00oo0O0(basicFileAttributes, "attrs");
        this.f13652o00oOo00.addLast(new o00ooO(path, basicFileAttributes.fileKey(), this.f13651o00oOOoO));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        o0ooO.o00oo0OO(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @NotNull
    public final List<o00ooO> o00oOo00(@NotNull o00ooO o00ooo) {
        o0ooO.o00oo0O0(o00ooo, "directoryNode");
        this.f13651o00oOOoO = o00ooo;
        Files.walkFileTree(o00ooo.f13658o00oOOo0, o00oo.f13641o00oOOo0.o00oOOoO(this.f13650o00oOOo0), 1, this);
        this.f13652o00oOo00.removeFirst();
        o0OO0oO.o0O0o<o00ooO> o0o0o = this.f13652o00oOo00;
        this.f13652o00oOo00 = new o0OO0oO.o0O0o<>();
        return o0o0o;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    /* renamed from: o00oOooO */
    public FileVisitResult visitFile(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        o0ooO.o00oo0O0(path, "file");
        o0ooO.o00oo0O0(basicFileAttributes, "attrs");
        this.f13652o00oOo00.addLast(new o00ooO(path, null, this.f13651o00oOOoO));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        o0ooO.o00oo0OO(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
