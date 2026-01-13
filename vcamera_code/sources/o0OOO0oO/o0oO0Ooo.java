package o0OOO0oO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0OOO0O;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO00;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0oO0Ooo implements oO000<File> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final File f13468o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00o00 f13469o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo<File, Boolean> f13470o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0O00000<File, IOException, oO0Ooooo> f13471o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int f13472o00oOo0o;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oo<File, oO0Ooooo> f13473o00oOooO;

    @o0OOO00({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* loaded from: classes3.dex */
    public static abstract class o00oOOo0 extends o00oOo00 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(@NotNull File file) {
            super(file);
            o0OOOOO0.o0ooO.o00oo0O0(file, "rootDir");
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOOoO extends o0OO0oO.o00oOOoO<File> {
        @NotNull

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final ArrayDeque<o00oOo00> f13474o00oo0Oo;

        /* loaded from: classes3.dex */
        public final class o00oOOo0 extends o00oOOo0 {

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public boolean f13476o00oOOoO;
            @Nullable

            /* renamed from: o00oOo00  reason: collision with root package name */
            public File[] f13477o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public boolean f13478o00oOo0O;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public final /* synthetic */ o00oOOoO f13479o00oOo0o;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f13480o00oOooO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(@NotNull o00oOOoO o00ooooo2, File file) {
                super(file);
                o0OOOOO0.o0ooO.o00oo0O0(file, "rootDir");
                this.f13479o00oOo0o = o00ooooo2;
            }

            @Override // o0OOO0oO.o0oO0Ooo.o00oOo00
            @Nullable
            public File o00oOOoO() {
                if (!this.f13478o00oOo0O && this.f13477o00oOo00 == null) {
                    o00oo<File, Boolean> o00ooVar = o0oO0Ooo.this.f13470o00oOo00;
                    boolean z = false;
                    if (o00ooVar != null && !o00ooVar.invoke(this.f13488o00oOOo0).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = this.f13488o00oOOo0.listFiles();
                    this.f13477o00oOo00 = listFiles;
                    if (listFiles == null) {
                        o0O00000<File, IOException, oO0Ooooo> o0o00000 = o0oO0Ooo.this.f13471o00oOo0O;
                        if (o0o00000 != null) {
                            o0o00000.invoke(this.f13488o00oOOo0, new o0OoOoOo(this.f13488o00oOOo0, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f13478o00oOo0O = true;
                    }
                }
                File[] fileArr = this.f13477o00oOo00;
                if (fileArr != null) {
                    int i = this.f13480o00oOooO;
                    o0OOOOO0.o0ooO.o00oo00O(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f13477o00oOo00;
                        o0OOOOO0.o0ooO.o00oo00O(fileArr2);
                        int i2 = this.f13480o00oOooO;
                        this.f13480o00oOooO = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f13476o00oOOoO) {
                    this.f13476o00oOOoO = true;
                    return this.f13488o00oOOo0;
                }
                o00oo<File, oO0Ooooo> o00ooVar2 = o0oO0Ooo.this.f13473o00oOooO;
                if (o00ooVar2 != null) {
                    o00ooVar2.invoke(this.f13488o00oOOo0);
                }
                return null;
            }
        }

        @o0OOO00({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: o0OOO0oO.o0oO0Ooo$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0170o00oOOoO extends o00oOo00 {

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public boolean f13481o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final /* synthetic */ o00oOOoO f13482o00oOo00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0170o00oOOoO(@NotNull o00oOOoO o00ooooo2, File file) {
                super(file);
                o0OOOOO0.o0ooO.o00oo0O0(file, "rootFile");
                this.f13482o00oOo00 = o00ooooo2;
            }

            @Override // o0OOO0oO.o0oO0Ooo.o00oOo00
            @Nullable
            public File o00oOOoO() {
                if (this.f13481o00oOOoO) {
                    return null;
                }
                this.f13481o00oOOoO = true;
                return this.f13488o00oOOo0;
            }
        }

        /* loaded from: classes3.dex */
        public final class o00oOo00 extends o00oOOo0 {

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public boolean f13483o00oOOoO;
            @Nullable

            /* renamed from: o00oOo00  reason: collision with root package name */
            public File[] f13484o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public final /* synthetic */ o00oOOoO f13485o00oOo0O;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f13486o00oOooO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOo00(@NotNull o00oOOoO o00ooooo2, File file) {
                super(file);
                o0OOOOO0.o0ooO.o00oo0O0(file, "rootDir");
                this.f13485o00oOo0O = o00ooooo2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // o0OOO0oO.o0oO0Ooo.o00oOo00
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File o00oOOoO() {
                /*
                    r10 = this;
                    boolean r0 = r10.f13483o00oOOoO
                    r1 = 0
                    if (r0 != 0) goto L26
                    o0OOO0oO.o0oO0Ooo$o00oOOoO r0 = r10.f13485o00oOo0O
                    o0OOO0oO.o0oO0Ooo r0 = o0OOO0oO.o0oO0Ooo.this
                    o0OOOO.o00oo<java.io.File, java.lang.Boolean> r0 = r0.f13470o00oOo00
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L1e
                    java.io.File r4 = r10.f13488o00oOOo0
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L1e
                    r2 = r3
                L1e:
                    if (r2 == 0) goto L21
                    return r1
                L21:
                    r10.f13483o00oOOoO = r3
                    java.io.File r0 = r10.f13488o00oOOo0
                    return r0
                L26:
                    java.io.File[] r0 = r10.f13484o00oOo00
                    if (r0 == 0) goto L41
                    int r2 = r10.f13486o00oOooO
                    o0OOOOO0.o0ooO.o00oo00O(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L33
                    goto L41
                L33:
                    o0OOO0oO.o0oO0Ooo$o00oOOoO r0 = r10.f13485o00oOo0O
                    o0OOO0oO.o0oO0Ooo r0 = o0OOO0oO.o0oO0Ooo.this
                    o0OOOO.o00oo<java.io.File, o0OO0o.oO0Ooooo> r0 = r0.f13473o00oOooO
                    if (r0 == 0) goto L40
                    java.io.File r2 = r10.f13488o00oOOo0
                    r0.invoke(r2)
                L40:
                    return r1
                L41:
                    java.io.File[] r0 = r10.f13484o00oOo00
                    if (r0 != 0) goto L81
                    java.io.File r0 = r10.f13488o00oOOo0
                    java.io.File[] r0 = r0.listFiles()
                    r10.f13484o00oOo00 = r0
                    if (r0 != 0) goto L69
                    o0OOO0oO.o0oO0Ooo$o00oOOoO r0 = r10.f13485o00oOo0O
                    o0OOO0oO.o0oO0Ooo r0 = o0OOO0oO.o0oO0Ooo.this
                    o0OOOO.o0O00000<java.io.File, java.io.IOException, o0OO0o.oO0Ooooo> r0 = r0.f13471o00oOo0O
                    if (r0 == 0) goto L69
                    java.io.File r2 = r10.f13488o00oOOo0
                    o0OOO0oO.o0OoOoOo r9 = new o0OOO0oO.o0OoOoOo
                    java.io.File r4 = r10.f13488o00oOOo0
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L69:
                    java.io.File[] r0 = r10.f13484o00oOo00
                    if (r0 == 0) goto L73
                    o0OOOOO0.o0ooO.o00oo00O(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L81
                L73:
                    o0OOO0oO.o0oO0Ooo$o00oOOoO r0 = r10.f13485o00oOo0O
                    o0OOO0oO.o0oO0Ooo r0 = o0OOO0oO.o0oO0Ooo.this
                    o0OOOO.o00oo<java.io.File, o0OO0o.oO0Ooooo> r0 = r0.f13473o00oOooO
                    if (r0 == 0) goto L80
                    java.io.File r2 = r10.f13488o00oOOo0
                    r0.invoke(r2)
                L80:
                    return r1
                L81:
                    java.io.File[] r0 = r10.f13484o00oOo00
                    o0OOOOO0.o0ooO.o00oo00O(r0)
                    int r1 = r10.f13486o00oOooO
                    int r2 = r1 + 1
                    r10.f13486o00oOooO = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOO0oO.o0oO0Ooo.o00oOOoO.o00oOo00.o00oOOoO():java.io.File");
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class o00oOo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final /* synthetic */ int[] f13487o00oOOo0;

            static {
                int[] iArr = new int[o0O00o00.values().length];
                try {
                    iArr[o0O00o00.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o0O00o00.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13487o00oOOo0 = iArr;
            }
        }

        public o00oOOoO() {
            ArrayDeque<o00oOo00> arrayDeque = new ArrayDeque<>();
            this.f13474o00oo0Oo = arrayDeque;
            if (o0oO0Ooo.this.f13468o00oOOo0.isDirectory()) {
                arrayDeque.push(o00oOo0O(o0oO0Ooo.this.f13468o00oOOo0));
            } else if (o0oO0Ooo.this.f13468o00oOOo0.isFile()) {
                arrayDeque.push(new C0170o00oOOoO(this, o0oO0Ooo.this.f13468o00oOOo0));
            } else {
                this.f13302o00oo0O0 = o0OOO0O.Done;
            }
        }

        @Override // o0OO0oO.o00oOOoO
        public void o00oOOo0() {
            File o00oOoO02 = o00oOoO0();
            if (o00oOoO02 != null) {
                o00oOo00(o00oOoO02);
            } else {
                this.f13302o00oo0O0 = o0OOO0O.Done;
            }
        }

        public final o00oOOo0 o00oOo0O(File file) {
            int i = o00oOo0O.f13487o00oOOo0[o0oO0Ooo.this.f13469o00oOOoO.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new o00oOOo0(this, file);
                }
                throw new o0OO0o.o0O0O0Oo();
            }
            return new o00oOo00(this, file);
        }

        public final File o00oOoO0() {
            File o00oOOoO2;
            while (true) {
                o00oOo00 peek = this.f13474o00oo0Oo.peek();
                if (peek == null) {
                    return null;
                }
                o00oOOoO2 = peek.o00oOOoO();
                if (o00oOOoO2 == null) {
                    this.f13474o00oo0Oo.pop();
                } else if (o0OOOOO0.o0ooO.o00oOoO0(o00oOOoO2, peek.o00oOOo0()) || !o00oOOoO2.isDirectory() || this.f13474o00oo0Oo.size() >= o0oO0Ooo.this.f13472o00oOo0o) {
                    break;
                } else {
                    this.f13474o00oo0Oo.push(o00oOo0O(o00oOOoO2));
                }
            }
            return o00oOOoO2;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class o00oOo00 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final File f13488o00oOOo0;

        public o00oOo00(@NotNull File file) {
            o0OOOOO0.o0ooO.o00oo0O0(file, "root");
            this.f13488o00oOOo0 = file;
        }

        @NotNull
        public final File o00oOOo0() {
            return this.f13488o00oOOo0;
        }

        @Nullable
        public abstract File o00oOOoO();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(@NotNull File file, @NotNull o0O00o00 o0o00o00) {
        this(file, o0o00o00, null, null, null, 0, 32, null);
        o0OOOOO0.o0ooO.o00oo0O0(file, TtmlNode.START);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "direction");
    }

    public /* synthetic */ o0oO0Ooo(File file, o0O00o00 o0o00o00, int i, o0OOOOO0.o0O00 o0o00) {
        this(file, (i & 2) != 0 ? o0O00o00.TOP_DOWN : o0o00o00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0oO0Ooo(File file, o0O00o00 o0o00o00, o00oo<? super File, Boolean> o00ooVar, o00oo<? super File, oO0Ooooo> o00ooVar2, o0O00000<? super File, ? super IOException, oO0Ooooo> o0o00000, int i) {
        this.f13468o00oOOo0 = file;
        this.f13469o00oOOoO = o0o00o00;
        this.f13470o00oOo00 = o00ooVar;
        this.f13473o00oOooO = o00ooVar2;
        this.f13471o00oOo0O = o0o00000;
        this.f13472o00oOo0o = i;
    }

    public /* synthetic */ o0oO0Ooo(File file, o0O00o00 o0o00o00, o00oo o00ooVar, o00oo o00ooVar2, o0O00000 o0o00000, int i, int i2, o0OOOOO0.o0O00 o0o00) {
        this(file, (i2 & 2) != 0 ? o0O00o00.TOP_DOWN : o0o00o00, o00ooVar, o00ooVar2, o0o00000, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<File> iterator() {
        return new o00oOOoO();
    }

    @NotNull
    public final o0oO0Ooo o00oOoOO(int i) {
        if (i > 0) {
            return new o0oO0Ooo(this.f13468o00oOOo0, this.f13469o00oOOoO, this.f13470o00oOo00, this.f13473o00oOooO, this.f13471o00oOo0O, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @NotNull
    public final o0oO0Ooo o00oOoOo(@NotNull o00oo<? super File, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "function");
        return new o0oO0Ooo(this.f13468o00oOOo0, this.f13469o00oOOoO, o00ooVar, this.f13473o00oOooO, this.f13471o00oOo0O, this.f13472o00oOo0o);
    }

    @NotNull
    public final o0oO0Ooo o00oOoo0(@NotNull o0O00000<? super File, ? super IOException, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "function");
        return new o0oO0Ooo(this.f13468o00oOOo0, this.f13469o00oOOoO, this.f13470o00oOo00, this.f13473o00oOooO, o0o00000, this.f13472o00oOo0o);
    }

    @NotNull
    public final o0oO0Ooo o00oOooo(@NotNull o00oo<? super File, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "function");
        return new o0oO0Ooo(this.f13468o00oOOo0, this.f13469o00oOOoO, this.f13470o00oOo00, o00ooVar, this.f13471o00oOo0O, this.f13472o00oOo0o);
    }
}
