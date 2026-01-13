package o0OOO0oO;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o0OO0o.o0O0o;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO00;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1266#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes3.dex */
public class o0O0O0Oo extends o0O0oo0o {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0O00000 {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final Void invoke(@NotNull File file, @NotNull IOException iOException) {
            o0OOOOO0.o0ooO.o00oo0O0(file, "<anonymous parameter 0>");
            o0OOOOO0.o0ooO.o00oo0O0(iOException, "exception");
            throw iOException;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0O00000<File, IOException, oO0Ooooo> {
        public final /* synthetic */ o0O00000<File, IOException, o0O0OO> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0O00000<? super File, ? super IOException, ? extends o0O0OO> o0o00000) {
            super(2);
            this.$onError = o0o00000;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(File file, IOException iOException) {
            invoke2(file, iOException);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull File file, @NotNull IOException iOException) {
            o0OOOOO0.o0ooO.o00oo0O0(file, "f");
            o0OOOOO0.o0ooO.o00oo0O0(iOException, "e");
            if (this.$onError.invoke(file, iOException) == o0O0OO.TERMINATE) {
                throw new o0O0OOOo(file);
            }
        }
    }

    public static /* synthetic */ File o0(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return o00ooooo(str, str2, file);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean o00oooO(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull java.io.File r12, boolean r13, @org.jetbrains.annotations.NotNull o0OOOO.o0O00000<? super java.io.File, ? super java.io.IOException, ? extends o0OOO0oO.o0O0OO> r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOO0oO.o0O0O0Oo.o00oooO(java.io.File, java.io.File, boolean, o0OOOO.o0O00000):boolean");
    }

    public static /* synthetic */ boolean o00oooOO(File file, File file2, boolean z, o0O00000 o0o00000, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            o0o00000 = o00oOOo0.INSTANCE;
        }
        return o00oooO(file, file2, z, o0o00000);
    }

    @NotNull
    public static final File o00oooOo(@NotNull File file, @NotNull File file2, boolean z, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, o0O0Oo.o0O0OOO.f11641o00ooO0O);
        if (file.exists()) {
            if (file2.exists()) {
                if (!z) {
                    throw new o0O00O(file, file2, "The destination file already exists.");
                }
                if (!file2.delete()) {
                    throw new o0O00O(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (!file.isDirectory()) {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    o0O000Oo.o00oOoo0(fileInputStream, fileOutputStream, i);
                    o0O000o0.o00oOOo0(fileOutputStream, null);
                    o0O000o0.o00oOOo0(fileInputStream, null);
                } finally {
                }
            } else if (!file2.mkdirs()) {
                throw new o0O00OOO(file, file2, "Failed to create target directory.");
            }
            return file2;
        }
        throw new o0O0OO0(file, null, "The source file doesn't exist.", 2, null);
    }

    @o0O0o(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File o00oooo(@NotNull String str, @Nullable String str2, @Nullable File file) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            o0OOOOO0.o0ooO.o00oo0OO(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File o00oooo0(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return o00oooOo(file, file2, z, i);
    }

    public static /* synthetic */ File o00ooooO(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return o00oooo(str, str2, file);
    }

    @o0O0o(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File o00ooooo(@NotNull String str, @Nullable String str2, @Nullable File file) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        o0OOOOO0.o0ooO.o00oo0OO(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    @NotNull
    public static final File o0O00(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, "relative");
        if (o0O0O0O.o00oOooO(file2)) {
            return file2;
        }
        String file3 = file.toString();
        o0OOOOO0.o0ooO.o00oo0OO(file3, "this.toString()");
        if ((file3.length() == 0) || oO0O0.o0OOo00o(file3, File.separatorChar, false, 2, null)) {
            return new File(file3 + file2);
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(file3);
        o00oOOo02.append(File.separatorChar);
        o00oOOo02.append(file2);
        return new File(o00oOOo02.toString());
    }

    @NotNull
    public static final String o0O000(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        String name = file.getName();
        o0OOOOO0.o0ooO.o00oo0OO(name, "name");
        return oO0O0.o0o0000o(name, '.', "");
    }

    public static final boolean o0O00000(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : o0O0oo0o.o00ooo0O(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean o0O0000O(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, "other");
        o0O00OO o00oOo0o2 = o0O0O0O.o00oOo0o(file);
        o0O00OO o00oOo0o3 = o0O0O0O.o00oOo0o(file2);
        if (o00oOo0o3.o00oOoOO()) {
            return o0OOOOO0.o0ooO.o00oOoO0(file, file2);
        }
        int o00oOoO2 = o00oOo0o2.o00oOoO() - o00oOo0o3.o00oOoO();
        if (o00oOoO2 < 0) {
            return false;
        }
        return o00oOo0o2.f13458o00oOOoO.subList(o00oOoO2, o00oOo0o2.o00oOoO()).equals(o00oOo0o3.f13458o00oOOoO);
    }

    public static final boolean o0O0000o(@NotNull File file, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "other");
        return o0O0000O(file, new File(str));
    }

    @NotNull
    public static final String o0O000O(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            o0OOOOO0.o0ooO.o00oo0OO(path, "path");
            return oO0O00o0.o0OO0oOO(path, File.separatorChar, '/', false, 4, null);
        }
        String path2 = file.getPath();
        o0OOOOO0.o0ooO.o00oo0OO(path2, "path");
        return path2;
    }

    @NotNull
    public static final File o0O000Oo(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0O00OO o00oOo0o2 = o0O0O0O.o00oOo0o(file);
        File file2 = o00oOo0o2.f13457o00oOOo0;
        List<File> o0OoOoOO2 = o0OoOoOO(o00oOo0o2.f13458o00oOOoO);
        String str = File.separator;
        o0OOOOO0.o0ooO.o00oo0OO(str, "separator");
        return o0O00O0(file2, o0OO0oO.o0O0oo0o.o0OOo0o0(o0OoOoOO2, str, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final File o0O000o(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, TtmlNode.RUBY_BASE);
        return new File(o0O00OOO(file, file2));
    }

    public static final o0O00OO o0O000o0(o0O00OO o0o00oo) {
        return new o0O00OO(o0o00oo.f13457o00oOOo0, o0OoOoOO(o0o00oo.f13458o00oOOoO));
    }

    @NotNull
    public static final File o0O000oo(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, TtmlNode.RUBY_BASE);
        String o0O00Oo2 = o0O00Oo(file, file2);
        return o0O00Oo2 != null ? new File(o0O00Oo2) : file;
    }

    public static final boolean o0O00O(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, "other");
        o0O00OO o00oOo0o2 = o0O0O0O.o00oOo0o(file);
        o0O00OO o00oOo0o3 = o0O0O0O.o00oOo0o(file2);
        if (o0OOOOO0.o0ooO.o00oOoO0(o00oOo0o2.f13457o00oOOo0, o00oOo0o3.f13457o00oOOo0) && o00oOo0o2.o00oOoO() >= o00oOo0o3.o00oOoO()) {
            return o00oOo0o2.f13458o00oOOoO.subList(0, o00oOo0o3.o00oOoO()).equals(o00oOo0o3.f13458o00oOOoO);
        }
        return false;
    }

    @NotNull
    public static final File o0O00O0(@NotNull File file, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "relative");
        return o0O00(file, new File(str));
    }

    @NotNull
    public static final File o0O00O0o(@NotNull File file, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "relative");
        return o0OoO00O(file, new File(str));
    }

    public static final boolean o0O00OO(@NotNull File file, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(str, "other");
        return o0O00O(file, new File(str));
    }

    @NotNull
    public static final String o0O00OOO(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, TtmlNode.RUBY_BASE);
        String o0O00Oo2 = o0O00Oo(file, file2);
        if (o0O00Oo2 != null) {
            return o0O00Oo2;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final String o0O00Oo(File file, File file2) {
        o0O00OO o0O000o02 = o0O000o0(o0O0O0O.o00oOo0o(file));
        o0O00OO o0O000o03 = o0O000o0(o0O0O0O.o00oOo0o(file2));
        if (o0OOOOO0.o0ooO.o00oOoO0(o0O000o02.f13457o00oOOo0, o0O000o03.f13457o00oOOo0)) {
            int o00oOoO2 = o0O000o03.o00oOoO();
            int o00oOoO3 = o0O000o02.o00oOoO();
            int i = 0;
            int min = Math.min(o00oOoO3, o00oOoO2);
            while (i < min && o0OOOOO0.o0ooO.o00oOoO0(o0O000o02.f13458o00oOOoO.get(i), o0O000o03.f13458o00oOOoO.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = o00oOoO2 - 1;
            if (i <= i2) {
                while (!o0OOOOO0.o0ooO.o00oOoO0(o0O000o03.f13458o00oOOoO.get(i2).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
                return null;
            }
            if (i < o00oOoO3) {
                if (i < o00oOoO2) {
                    sb.append(File.separatorChar);
                }
                List o0OO02 = o0OO0oO.o0O0oo0o.o0OO0(o0O000o02.f13458o00oOOoO, i);
                String str = File.separator;
                o0OOOOO0.o0ooO.o00oo0OO(str, "separator");
                o0OO0oO.o0O0oo0o.o0OOo0O(o0OO02, sb, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            }
            return sb.toString();
        }
        return null;
    }

    @NotNull
    public static final File o0OoO00O(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, "relative");
        o0O00OO o00oOo0o2 = o0O0O0O.o00oOo0o(file);
        return o0O00(o0O00(o00oOo0o2.f13457o00oOOo0, o00oOo0o2.o00oOoO() == 0 ? new File("..") : o00oOo0o2.o00oOoOo(0, o00oOo0o2.o00oOoO() - 1)), file2);
    }

    public static final List<File> o0OoOoOO(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!o0OOOOO0.o0ooO.o00oOoO0(name, ".")) {
                if (!o0OOOOO0.o0ooO.o00oOoO0(name, "..") || arrayList.isEmpty() || o0OOOOO0.o0ooO.o00oOoO0(((File) o0OO0oO.o0O0oo0o.o0OOo0oo(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String o0OoOoOo(@NotNull File file) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        String name = file.getName();
        o0OOOOO0.o0ooO.o00oo0OO(name, "name");
        return oO0O0.o0o00O0(name, ".", null, 2, null);
    }

    @Nullable
    public static final File o0ooOoOO(@NotNull File file, @NotNull File file2) {
        o0OOOOO0.o0ooO.o00oo0O0(file, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(file2, TtmlNode.RUBY_BASE);
        String o0O00Oo2 = o0O00Oo(file, file2);
        if (o0O00Oo2 != null) {
            return new File(o0O00Oo2);
        }
        return null;
    }
}
