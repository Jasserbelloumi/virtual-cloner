package o0OOOOoO;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import o0O0Oo.o0O0OOO;
import o0OO0o.o0O0O0Oo;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0oO0O0o;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
/* loaded from: classes3.dex */
public class o0O000Oo extends o0OoOoOo {

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13664o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final /* synthetic */ int[] f13665o00oOOoO;

        static {
            int[] iArr = new int[o0OOOOoO.o00oOo0O.values().length];
            try {
                iArr[o0OOOOoO.o00oOo0O.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0OOOOoO.o00oOo0O.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0OOOOoO.o00oOo0O.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13664o00oOOo0 = iArr;
            int[] iArr2 = new int[o00ooO0.values().length];
            try {
                iArr2[o00ooO0.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o00ooO0.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f13665o00oOOoO = iArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o0O0000O {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        @NotNull
        public final Void invoke(@NotNull Path path, @NotNull Path path2, @NotNull Exception exc) {
            o0ooO.o00oo0O0(path, "<anonymous parameter 0>");
            o0ooO.o00oo0O0(path2, "<anonymous parameter 1>");
            o0ooO.o00oo0O0(exc, "exception");
            throw exc;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o0O0000O<o0OOOOoO.o00oOo00, Path, Path, o0OOOOoO.o00oOo0O> {
        public final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(boolean z) {
            super(3);
            this.$followLinks = z;
        }

        @Override // o0OOOO.o0O0000O
        @NotNull
        public final o0OOOOoO.o00oOo0O invoke(@NotNull o0OOOOoO.o00oOo00 o00ooo002, @NotNull Path path, @NotNull Path path2) {
            o0ooO.o00oo0O0(o00ooo002, "$this$copyToRecursively");
            o0ooO.o00oo0O0(path, "src");
            o0ooO.o00oo0O0(path2, "dst");
            LinkOption[] o00oOOo02 = o00oo.f13641o00oOOo0.o00oOOo0(this.$followLinks);
            boolean isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(o00oOOo02, o00oOOo02.length);
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
                if (isDirectory) {
                    o0O000Oo.o00oooo(path2);
                }
                o0OOO0 o0ooo0 = new o0OOO0(2);
                o0ooo0.o00oOOoO(o00oOOo02);
                o0ooo0.o00oOOo0(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) o0ooo0.o00oOooO(new CopyOption[o0ooo0.o00oOo00()]);
                o0ooO.o00oo0OO(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
            }
            return o0OOOOoO.o00oOo0O.CONTINUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o0O0000O {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(3);
        }

        @Override // o0OOOO.o0O0000O
        @NotNull
        public final Void invoke(@NotNull Path path, @NotNull Path path2, @NotNull Exception exc) {
            o0ooO.o00oo0O0(path, "<anonymous parameter 0>");
            o0ooO.o00oo0O0(path2, "<anonymous parameter 1>");
            o0ooO.o00oo0O0(exc, "exception");
            throw exc;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o0O0000O<o0OOOOoO.o00oOo00, Path, Path, o0OOOOoO.o00oOo0O> {
        public final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(boolean z) {
            super(3);
            this.$followLinks = z;
        }

        @Override // o0OOOO.o0O0000O
        @NotNull
        public final o0OOOOoO.o00oOo0O invoke(@NotNull o0OOOOoO.o00oOo00 o00ooo002, @NotNull Path path, @NotNull Path path2) {
            o0ooO.o00oo0O0(o00ooo002, "$this$null");
            o0ooO.o00oo0O0(path, "src");
            o0ooO.o00oo0O0(path2, "dst");
            return o00ooo002.o00oOOo0(path, path2, this.$followLinks);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oo<o00oo0O0, oO0Ooooo> {
        public final /* synthetic */ o0OOOO.o0O0000O<o0OOOOoO.o00oOo00, Path, Path, o0OOOOoO.o00oOo0O> $copyAction;
        public final /* synthetic */ o0OOOO.o0O0000O<Path, Path, Exception, o00ooO0> $onError;
        public final /* synthetic */ Path $target;
        public final /* synthetic */ Path $this_copyToRecursively;

        /* loaded from: classes3.dex */
        public /* synthetic */ class o00oOOo0 extends o0oO0O0o implements o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> {
            public final /* synthetic */ o0OOOO.o0O0000O<o0OOOOoO.o00oOo00, Path, Path, o0OOOOoO.o00oOo0O> $copyAction;
            public final /* synthetic */ o0OOOO.o0O0000O<Path, Path, Exception, o00ooO0> $onError;
            public final /* synthetic */ Path $target;
            public final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(o0OOOO.o0O0000O<? super o0OOOOoO.o00oOo00, ? super Path, ? super Path, ? extends o0OOOOoO.o00oOo0O> o0o0000o, Path path, Path path2, o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o2) {
                super(2, o0ooO.o00oOOo0.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = o0o0000o;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = o0o0000o2;
            }

            @Override // o0OOOO.o0O00000
            @NotNull
            public final FileVisitResult invoke(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
                o0ooO.o00oo0O0(path, "p0");
                o0ooO.o00oo0O0(basicFileAttributes, "p1");
                return o0O000Oo.o00ooo0o(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, path, basicFileAttributes);
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class o00oOOoO extends o0oO0O0o implements o0OOOO.o0O00000<Path, BasicFileAttributes, FileVisitResult> {
            public final /* synthetic */ o0OOOO.o0O0000O<o0OOOOoO.o00oOo00, Path, Path, o0OOOOoO.o00oOo0O> $copyAction;
            public final /* synthetic */ o0OOOO.o0O0000O<Path, Path, Exception, o00ooO0> $onError;
            public final /* synthetic */ Path $target;
            public final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOoO(o0OOOO.o0O0000O<? super o0OOOOoO.o00oOo00, ? super Path, ? super Path, ? extends o0OOOOoO.o00oOo0O> o0o0000o, Path path, Path path2, o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o2) {
                super(2, o0ooO.o00oOOo0.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = o0o0000o;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = o0o0000o2;
            }

            @Override // o0OOOO.o0O00000
            @NotNull
            public final FileVisitResult invoke(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
                o0ooO.o00oo0O0(path, "p0");
                o0ooO.o00oo0O0(basicFileAttributes, "p1");
                return o0O000Oo.o00ooo0o(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, path, basicFileAttributes);
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class o00oOo00 extends o0oO0O0o implements o0OOOO.o0O00000<Path, Exception, FileVisitResult> {
            public final /* synthetic */ o0OOOO.o0O0000O<Path, Path, Exception, o00ooO0> $onError;
            public final /* synthetic */ Path $target;
            public final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOo00(o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o, Path path, Path path2) {
                super(2, o0ooO.o00oOOo0.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.$onError = o0o0000o;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // o0OOOO.o0O00000
            @NotNull
            public final FileVisitResult invoke(@NotNull Path path, @NotNull Exception exc) {
                o0ooO.o00oo0O0(path, "p0");
                o0ooO.o00oo0O0(exc, "p1");
                return o0O000Oo.o00oooo0(this.$onError, this.$this_copyToRecursively, this.$target, path, exc);
            }
        }

        /* loaded from: classes3.dex */
        public static final class o00oOo0O extends o0O0OO implements o0OOOO.o0O00000<Path, IOException, FileVisitResult> {
            public final /* synthetic */ o0OOOO.o0O0000O<Path, Path, Exception, o00ooO0> $onError;
            public final /* synthetic */ Path $target;
            public final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOo0O(o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o, Path path, Path path2) {
                super(2);
                this.$onError = o0o0000o;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // o0OOOO.o0O00000
            @NotNull
            public final FileVisitResult invoke(@NotNull Path path, @Nullable IOException iOException) {
                o0ooO.o00oo0O0(path, "directory");
                return iOException == null ? FileVisitResult.CONTINUE : o0O000Oo.o00oooo0(this.$onError, this.$this_copyToRecursively, this.$target, path, iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo00O(o0OOOO.o0O0000O<? super o0OOOOoO.o00oOo00, ? super Path, ? super Path, ? extends o0OOOOoO.o00oOo0O> o0o0000o, Path path, Path path2, o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o2) {
            super(1);
            this.$copyAction = o0o0000o;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = o0o0000o2;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(o00oo0O0 o00oo0o02) {
            invoke2(o00oo0o02);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull o00oo0O0 o00oo0o02) {
            o0ooO.o00oo0O0(o00oo0o02, "$this$visitFileTree");
            o00oo0o02.o00oOooO(new o00oOOo0(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            o00oo0o02.o00oOOoO(new o00oOOoO(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            o00oo0o02.o00oOOo0(new o00oOo00(this.$onError, this.$this_copyToRecursively, this.$target));
            o00oo0o02.o00oOo00(new o00oOo0O(this.$onError, this.$this_copyToRecursively, this.$target));
        }
    }

    public static final void o0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, o00oo0 o00oo0Var) {
        o00oo0Var.o00oOOoO(path);
        try {
        } catch (Exception e) {
            o00oo0Var.o00oOOo0(e);
        }
        if (o0O0000o(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int i = o00oo0Var.f13647o00oOOoO;
            o00ooooo(secureDirectoryStream, path, o00oo0Var);
            if (i == o00oo0Var.f13647o00oOOoO) {
                secureDirectoryStream.deleteDirectory(path);
            }
            o00oo0Var.o00oOo00(path);
        }
        secureDirectoryStream.deleteFile(path);
        oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        o00oo0Var.o00oOo00(path);
    }

    @o0OO00o0(version = "1.8")
    @o00oo0OO
    @NotNull
    public static final Path o00ooo0(@NotNull Path path, @NotNull Path path2, @NotNull o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o, boolean z, @NotNull o0OOOO.o0O0000O<? super o0OOOOoO.o00oOo00, ? super Path, ? super Path, ? extends o0OOOOoO.o00oOo0O> o0o0000o2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        o0ooO.o00oo0O0(o0o0000o, "onError");
        o0ooO.o00oo0O0(o0o0000o2, "copyAction");
        LinkOption[] o00oOOo02 = o00oo.f13641o00oOOo0.o00oOOo0(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(o00oOOo02, o00oOOo02.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z2 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z || !Files.isSymbolicLink(path))) {
                boolean z3 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
                if (!z3 || !Files.isSameFile(path, path2)) {
                    if (o0ooO.o00oOoO0(path.getFileSystem(), path2.getFileSystem())) {
                        if (z3) {
                            z2 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path parent = path2.getParent();
                            if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        throw new FileSystemException(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            o0O000o0.o0O0oOo(path, 0, z, new o00oo00O(o0o0000o2, path, path2, o0o0000o), 1, null);
            return path2;
        }
        throw new NoSuchFileException(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    public static final void o00ooo00(o00oo0 o00oo0Var, o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        try {
            o00oooo02.invoke();
        } catch (Exception e) {
            o00oo0Var.o00oOOo0(e);
        }
    }

    @o0OO00o0(version = "1.8")
    @o00oo0OO
    @NotNull
    public static final Path o00ooo0O(@NotNull Path path, @NotNull Path path2, @NotNull o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o, boolean z, boolean z2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        o0ooO.o00oo0O0(o0o0000o, "onError");
        return z2 ? o00ooo0(path, path2, o0o0000o, z, new o00oOo00(z)) : o00oooO(path, path2, o0o0000o, z, null, 8, null);
    }

    public static final FileVisitResult o00ooo0o(o0OOOO.o0O0000O<? super o0OOOOoO.o00oOo00, ? super Path, ? super Path, ? extends o0OOOOoO.o00oOo0O> o0o0000o, Path path, Path path2, o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return o0O000(o0o0000o.invoke(o0OOOOoO.o00oOoO.f13640o00oOOo0, path3, o00oooOo(path, path2, path3)));
        } catch (Exception e) {
            return o00oooo0(o0o0000o2, path, path2, path3, e);
        }
    }

    public static /* synthetic */ Path o00oooO(Path path, Path path2, o0OOOO.o0O0000O o0o0000o, boolean z, o0OOOO.o0O0000O o0o0000o2, int i, Object obj) {
        if ((i & 2) != 0) {
            o0o0000o = o00oOo0O.INSTANCE;
        }
        if ((i & 8) != 0) {
            o0o0000o2 = new o00oOoO(z);
        }
        return o00ooo0(path, path2, o0o0000o, z, o0o0000o2);
    }

    public static /* synthetic */ Path o00oooOO(Path path, Path path2, o0OOOO.o0O0000O o0o0000o, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            o0o0000o = o00oOOoO.INSTANCE;
        }
        return o00ooo0O(path, path2, o0o0000o, z, z2);
    }

    public static final Path o00oooOo(Path path, Path path2, Path path3) {
        Path resolve = path2.resolve(o0O000o0.o0O0oo0O(path3, path).toString());
        o0ooO.o00oo0OO(resolve, "target.resolve(relativePath.pathString)");
        return resolve;
    }

    @o0OO00o0(version = "1.8")
    @o00oo0OO
    public static final void o00oooo(@NotNull Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        List<Exception> o00ooooO2 = o00ooooO(path);
        if (!o00ooooO2.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception exc : o00ooooO2) {
                o0OO0o.o0O00000.o00oOOo0(fileSystemException, exc);
            }
            throw fileSystemException;
        }
    }

    public static final FileVisitResult o00oooo0(o0OOOO.o0O0000O<? super Path, ? super Path, ? super Exception, ? extends o00ooO0> o0o0000o, Path path, Path path2, Path path3, Exception exc) {
        return o0O000O(o0o0000o.invoke(path3, o00oooOo(path, path2, path3), exc));
    }

    public static final List<Exception> o00ooooO(Path path) {
        DirectoryStream<Path> directoryStream;
        boolean z = false;
        boolean z2 = true;
        o00oo0 o00oo0Var = new o00oo0(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    if (directoryStream instanceof SecureDirectoryStream) {
                        o00oo0Var.f13649o00oOooO = parent;
                        Path fileName = path.getFileName();
                        o0ooO.o00oo0OO(fileName, "this.fileName");
                        o0((SecureDirectoryStream) directoryStream, fileName, o00oo0Var);
                    } else {
                        z = true;
                    }
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                    o0OOO0oO.o0O000o0.o00oOOo0(directoryStream, null);
                    z2 = z;
                } finally {
                }
            }
        }
        if (z2) {
            o0O0000O(path, o00oo0Var);
        }
        return o00oo0Var.f13648o00oOo00;
    }

    public static final void o00ooooo(SecureDirectoryStream<Path> secureDirectoryStream, Path path, o00oo0 o00oo0Var) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e) {
                o00oo0Var.o00oOOo0(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 != null) {
            for (Path path2 : secureDirectoryStream2) {
                Path fileName = path2.getFileName();
                o0ooO.o00oo0OO(fileName, "entry.fileName");
                o0(secureDirectoryStream2, fileName, o00oo0Var);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0OOO0oO.o0O000o0.o00oOOo0(secureDirectoryStream2, null);
        }
    }

    @o00oo0OO
    public static final FileVisitResult o0O000(o0OOOOoO.o00oOo0O o00ooo0o2) {
        int i = o00oOOo0.f13664o00oOOo0[o00ooo0o2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                throw new o0O0O0Oo();
            }
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    public static final void o0O00000(Path path, o00oo0 o00oo0Var) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                for (Path path2 : directoryStream) {
                    o0ooO.o00oo0OO(path2, "entry");
                    o0O0000O(path2, o00oo0Var);
                }
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                o0OOO0oO.o0O000o0.o00oOOo0(directoryStream, null);
            }
        } catch (Exception e) {
            o00oo0Var.o00oOOo0(e);
        }
    }

    public static final void o0O0000O(Path path, o00oo0 o00oo0Var) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int i = o00oo0Var.f13647o00oOOoO;
                o0O00000(path, o00oo0Var);
                if (i != o00oo0Var.f13647o00oOOoO) {
                    return;
                }
            }
            Files.deleteIfExists(path);
        } catch (Exception e) {
            o00oo0Var.o00oOOo0(e);
        }
    }

    public static final boolean o0O0000o(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @o00oo0OO
    public static final FileVisitResult o0O000O(o00ooO0 o00ooo02) {
        int i = o00oOOo0.f13665o00oOOoO[o00ooo02.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            throw new o0O0O0Oo();
        }
        return FileVisitResult.TERMINATE;
    }

    public static final <R> R o0OoOoOo(o0OOOO.o00oOOo0<? extends R> o00oooo02) {
        try {
            return o00oooo02.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
