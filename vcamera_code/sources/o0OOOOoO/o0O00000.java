package o0OOOOoO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import o0OOOoO0.oO000O0O;
import o0OOOoO0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO
/* loaded from: classes3.dex */
public final class o0O00000 implements oO000<Path> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Path f13662o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O000[] f13663o00oOOoO;

    @o0OOO00({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    @o0OOO0.o00oo00O(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super Path>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super Path> oo000o0o, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(oo000o0o, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e4 -> B:11:0x0074). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e6 -> B:11:0x0074). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOOoO.o0O00000.o00oOOo0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OOO00({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    @o0OOO0.o00oo00O(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super Path>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super Path> oo000o0o, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(oo000o0o, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01b9 -> B:36:0x0130). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01bb -> B:36:0x0130). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOOoO.o0O00000.o00oOOoO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o0O00000(@NotNull Path path, @NotNull o0O000[] o0o000Arr) {
        o0ooO.o00oo0O0(path, TtmlNode.START);
        o0ooO.o00oo0O0(o0o000Arr, "options");
        this.f13662o00oOOo0 = path;
        this.f13663o00oOOoO = o0o000Arr;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<Path> iterator() {
        return o00oOooo() ? o00oOoO0() : o00oOoO();
    }

    public final Iterator<Path> o00oOoO() {
        return oO0o0o.o00oOOo0(new o00oOOoO(null));
    }

    public final Iterator<Path> o00oOoO0() {
        return oO0o0o.o00oOOo0(new o00oOOo0(null));
    }

    public final boolean o00oOoOO() {
        return o0OO0oO.o0O000O.o(this.f13663o00oOOoO, o0O000.FOLLOW_LINKS);
    }

    public final boolean o00oOoOo() {
        return o0OO0oO.o0O000O.o(this.f13663o00oOOoO, o0O000.INCLUDE_DIRECTORIES);
    }

    public final LinkOption[] o00oOoo0() {
        return o00oo.f13641o00oOOo0.o00oOOo0(o00oOoOO());
    }

    public final boolean o00oOooo() {
        return o0OO0oO.o0O000O.o(this.f13663o00oOOoO, o0O000.BREADTH_FIRST);
    }

    public final Object o00oo00O(oO000O0O<? super Path> oo000o0o, o00ooO o00ooo, o00oo00O o00oo00o, o0OOOO.o00oo<? super List<o00ooO>, oO0Ooooo> o00ooVar, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Path path = o00ooo.f13658o00oOOo0;
        LinkOption[] o00oOoo02 = o00oOoo0();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(o00oOoo02, o00oOoo02.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (o0O0000O.o00oOo00(o00ooo)) {
                throw new FileSystemLoopException(path.toString());
            }
            if (o00oOoOo()) {
                oo000o0o.o00oOOoO(path, o00ooo0o2);
            }
            LinkOption[] o00oOoo03 = o00oOoo0();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(o00oOoo03, o00oOoo03.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                o00ooVar.invoke(o00oo00o.o00oOo00(o00ooo));
            }
        } else if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            oo000o0o.o00oOOoO(path, o00ooo0o2);
            return oO0Ooooo.f13240o00oOOo0;
        }
        return oO0Ooooo.f13240o00oOOo0;
    }
}
