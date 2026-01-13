package o0OOOOoO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0O0Oo.o0O0OOO;
import o0OO0o.o0O;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OoO00O;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O0OO;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.o0OO0oO0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1132:1\n26#2:1133\n26#2:1137\n1#3:1134\n1855#4,2:1135\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1133\n574#1:1137\n440#1:1135,2\n*E\n"})
/* loaded from: classes3.dex */
public class o0O000o0 extends o0O000Oo {
    public static /* synthetic */ Path o0O00(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(copy, "copy(this, target, *options)");
        return copy;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O000Oo(String str) {
        o0ooO.o00oo0O0(str, "path");
        Path path = Paths.get(str, new String[0]);
        o0ooO.o00oo0OO(path, "get(path)");
        return path;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o0O000o(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O000o0(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        o0ooO.o00oo0OO(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O000oo(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        o0ooO.o00oo0O0(copyOptionArr, "options");
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(copy, "copy(this, target, *options)");
        return copy;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O00O(Path path, Path path2) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        Path createLink = Files.createLink(path, path2);
        o0ooO.o00oo0OO(createLink, "createLink(this, target)");
        return createLink;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00O0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00O0o(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00OO(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00OOO(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @NotNull
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00Oo(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempDirectory;
        String str2;
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        if (path != null) {
            createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(dire…ory, prefix, *attributes)";
        } else {
            createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(prefix, *attributes)";
        }
        o0ooO.o00oo0OO(createTempDirectory, str2);
        return createTempDirectory;
    }

    public static /* synthetic */ Path o0O00OoO(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return o0O00Oo(path, str, fileAttributeArr);
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00Ooo(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final void o0O00o(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        Files.delete(path);
    }

    @NotNull
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O00o00(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempFile;
        String str3;
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        if (path != null) {
            createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(directory…fix, suffix, *attributes)";
        } else {
            createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(prefix, suffix, *attributes)";
        }
        o0ooO.o00oo0OO(createTempFile, str3);
        return createTempFile;
    }

    public static /* synthetic */ Path o0O00o0O(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    public static /* synthetic */ Path o0O00o0o(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return o0O00o00(path, str, str2, fileAttributeArr);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O00oO0(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0O0O(Path path, String str) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "other");
        Path resolve = path.resolve(str);
        o0ooO.o00oo0OO(resolve, "this.resolve(other)");
        return resolve;
    }

    @o0O
    @NotNull
    public static final Void o0O0O0Oo(@NotNull Path path, @NotNull Class<?> cls) {
        o0ooO.o00oo0O0(path, "path");
        o0ooO.o00oo0O0(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final <V extends FileAttributeView> V o0O0O0o(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        o0ooO.o00oooOo();
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final <V extends FileAttributeView> V o0O0O0o0(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        o0ooO.o00oooOo();
        V v = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v != null) {
            return v;
        }
        o0ooO.o00oooOo();
        o0O0O0Oo(path, FileAttributeView.class);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final long o0O0O0oO(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.size(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final FileStore o0O0O0oo(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        o0ooO.o00oo0OO(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Object o0O0OO(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "attribute");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final void o0O0OO0(Path path, String str, o0OOOO.o00oo<? super Path, oO0Ooooo> o00ooVar) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "glob");
        o0ooO.o00oo0O0(o00ooVar, "action");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            o0ooO.o00oo0OO(newDirectoryStream, "it");
            for (Path path2 : newDirectoryStream) {
                o00ooVar.invoke(path2);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0OOO0oO.o0O000o0.o00oOOo0(newDirectoryStream, null);
        } finally {
        }
    }

    public static void o0O0OO0O(Path path, String str, o0OOOO.o00oo o00ooVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "glob");
        o0ooO.o00oo0O0(o00ooVar, "action");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            o0ooO.o00oo0OO(newDirectoryStream, "it");
            for (Path path2 : newDirectoryStream) {
                o00ooVar.invoke(path2);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o0OOO0oO.o0O000o0.o00oOOo0(newDirectoryStream, null);
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static /* synthetic */ void o0O0OOO(Path path) {
    }

    @NotNull
    public static final String o0O0OOO0(@NotNull Path path) {
        String obj;
        String o0o0000o;
        o0ooO.o00oo0O0(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (o0o0000o = oO0O0.o0o0000o(obj, '.', "")) == null) ? "" : o0o0000o;
    }

    public static final String o0O0OOOo(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return o0O0OOoO(path);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @o0OO000(expression = "invariantSeparatorsPathString", imports = {}))
    @o00oo0OO
    @o0OO00o0(version = "1.4")
    public static /* synthetic */ void o0O0OOo(Path path) {
    }

    @NotNull
    public static final String o0O0OOoO(@NotNull Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (o0ooO.o00oOoO0(separator, "/")) {
            return path.toString();
        }
        String obj = path.toString();
        o0ooO.o00oo0OO(separator, "separator");
        return oO0O00o0.o0OOoooO(obj, separator, "/", false, 4, null);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static /* synthetic */ void o0O0OOoo(Path path) {
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static /* synthetic */ void o0O0Oo(Path path) {
    }

    @NotNull
    public static final String o0O0Oo0(@NotNull Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static /* synthetic */ void o0O0Oo0O(Path path) {
    }

    @NotNull
    public static final String o0O0Oo0o(@NotNull Path path) {
        String obj;
        String o0o00O0;
        o0ooO.o00oo0O0(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (o0o00O0 = oO0O0.o0o00O0(obj, ".", null, 2, null)) == null) ? "" : o0o00O0;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Set<PosixFilePermission> o0O0OoO(Path path, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        o0ooO.o00oo0OO(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    public static final String o0O0OoO0(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return path.toString();
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0OoOo(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0Ooo(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.isHidden(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0Ooo0(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.isExecutable(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0OooO(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.isReadable(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final UserPrincipal o0O0Oooo(Path path, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @NotNull
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final List<Path> o0O0o0(@NotNull Path path, @NotNull String str) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "glob");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            o0ooO.o00oo0OO(newDirectoryStream, "it");
            List<Path> o0o00o = o0O0oo0o.o0o00o(newDirectoryStream);
            o0OOO0oO.o0O000o0.o00oOOo0(newDirectoryStream, null);
            return o0o00o;
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o00(Path path, Path path2) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o000(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o00O(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o00o(Path path) {
        o0ooO.o00oo0O0(path, "<this>");
        return Files.isWritable(path);
    }

    public static /* synthetic */ List o0O0o0O(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return o0O0o0(path, str);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0o0OO(Path path, Path path2, boolean z) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(move, "move(this, target, *options)");
        return move;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0o0Oo(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        o0ooO.o00oo0O0(copyOptionArr, "options");
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(move, "move(this, target, *options)");
        return move;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o0o(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static /* synthetic */ Path o0O0o0o0(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(move, "move(this, target, *options)");
        return move;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Map<String, Object> o0O0o0oO(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "attributes");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        o0ooO.o00oo0OO(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0o0oo(Path path) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        o0ooO.o00oo0OO(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0oO(Path path, UserPrincipal userPrincipal) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        o0ooO.o00oo0OO(owner, "setOwner(this, value)");
        return owner;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final Path o0O0oO0(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.RUBY_BASE);
        Path oooOO02 = oooOO0(path, path2);
        return oooOO02 == null ? path : oooOO02;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0oO0O(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "attribute");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        o0ooO.o00oo0OO(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0oO0o(Path path, FileTime fileTime) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        o0ooO.o00oo0OO(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0O0oOO(URI uri) {
        o0ooO.o00oo0O0(uri, "<this>");
        Path path = Paths.get(uri);
        o0ooO.o00oo0OO(path, "get(this)");
        return path;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0O0oOO0(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        o0ooO.o00oo0OO(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    public static Object o0O0oOOO(Path path, String str, o0OOOO.o00oo o00ooVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "glob");
        o0ooO.o00oo0O0(o00ooVar, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            o0ooO.o00oo0OO(newDirectoryStream, "it");
            Object invoke = o00ooVar.invoke(o0O0oo0o.o0O0oOO0(newDirectoryStream));
            o0OOO0oO.o0O000o0.o00oOOo0(newDirectoryStream, null);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ void o0O0oOo(Path path, int i, boolean z, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        o0O0oOo0(path, i, z, o00ooVar);
    }

    @o0OO00o0(version = "1.7")
    @o00oo0OO
    public static final void o0O0oOo0(@NotNull Path path, int i, boolean z, @NotNull o0OOOO.o00oo<? super o00oo0O0, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "builderAction");
        oo0oOOo(path, o0ooO(o00ooVar), i, z);
    }

    public static /* synthetic */ void o0O0oOoO(Path path, FileVisitor fileVisitor, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        oo0oOOo(path, fileVisitor, i, z);
    }

    @o0OO00o0(version = "1.7")
    @o00oo0OO
    @NotNull
    public static final oO000<Path> o0O0oOoo(@NotNull Path path, @NotNull o0O000... o0o000Arr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(o0o000Arr, "options");
        return new o0O00000(path, o0o000Arr);
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final <T> T o0O0oo00(Path path, String str, o0OOOO.o00oo<? super oO000<? extends Path>, ? extends T> o00ooVar) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(str, "glob");
        o0ooO.o00oo0O0(o00ooVar, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            o0ooO.o00oo0OO(newDirectoryStream, "it");
            T invoke = o00ooVar.invoke(o0O0oo0o.o0O0oOO0(newDirectoryStream));
            o0OOO0oO.o0O000o0.o00oOOo0(newDirectoryStream, null);
            return invoke;
        } finally {
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final Path o0O0oo0O(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.RUBY_BASE);
        try {
            return o0.f13637o00oOOo0.o00oOOo0(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0oo0o(Path path, LinkOption... linkOptionArr) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final Path o0OoO00O(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0OoOoOO(String str, String... strArr) {
        o0ooO.o00oo0O0(str, TtmlNode.RUBY_BASE);
        o0ooO.o00oo0O0(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        o0ooO.o00oo0OO(path, "get(base, *subpaths)");
        return path;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final FileTime o0OooO0(Path path, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        o0ooO.o00oo0OO(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0oO0O0o(Path path, Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, "other");
        Path resolve = path.resolve(path2);
        o0ooO.o00oo0OO(resolve, "this.resolve(other)");
        return resolve;
    }

    public static /* synthetic */ Path o0oO0Ooo(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        o0ooO.o00oo0O0(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        o0ooO.o00oo0OO(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @o0OOO0OO.o00oo00O
    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    public static final <A extends BasicFileAttributes> A o0oOo0O0(Path path, LinkOption... linkOptionArr) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(linkOptionArr, "options");
        o0ooO.o00oooOo();
        A a = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        o0ooO.o00oo0OO(a, "readAttributes(this, A::class.java, *options)");
        return a;
    }

    @o0OO00o0(version = "1.7")
    @o00oo0OO
    @NotNull
    public static final FileVisitor<Path> o0ooO(@NotNull o0OOOO.o00oo<? super o00oo0O0, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "builderAction");
        o00oo0O o00oo0o2 = new o00oo0O();
        o00ooVar.invoke(o00oo0o2);
        return o00oo0o2.o00oOo0O();
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final Path o0ooOoOO(Path path, Path path2, boolean z) throws IOException {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, o0O0OOO.f11641o00ooO0O);
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        o0ooO.o00oo0OO(copy, "copy(this, target, *options)");
        return copy;
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static /* synthetic */ void oo0OOoo(Path path) {
    }

    @o0OO00o0(version = "1.7")
    @o00oo0OO
    public static final void oo0oOOo(@NotNull Path path, @NotNull FileVisitor<Path> fileVisitor, int i, boolean z) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(fileVisitor, "visitor");
        Files.walkFileTree(path, z ? o0OO0oO0.o00oOo0o(FileVisitOption.FOLLOW_LINKS) : o0O0OO.INSTANCE, i, fileVisitor);
    }

    @oO0Oo0oo(markerClass = {o00oo0OO.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final Path oooOO0(@NotNull Path path, @NotNull Path path2) {
        o0ooO.o00oo0O0(path, "<this>");
        o0ooO.o00oo0O0(path2, TtmlNode.RUBY_BASE);
        try {
            return o0.f13637o00oOOo0.o00oOOo0(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
