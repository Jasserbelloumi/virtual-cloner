package o0OOOOoO;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import o0OO0oO.o0O0OO;
import o0OO0oO.o0OO0oO0;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo f13641o00oOOo0 = new o00oo();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final LinkOption[] f13642o00oOOoO = {LinkOption.NOFOLLOW_LINKS};
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final LinkOption[] f13643o00oOo00 = new LinkOption[0];
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Set<FileVisitOption> f13645o00oOooO = o0O0OO.INSTANCE;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Set<FileVisitOption> f13644o00oOo0O = o0OO0oO0.o00oOo0o(FileVisitOption.FOLLOW_LINKS);

    @NotNull
    public final LinkOption[] o00oOOo0(boolean z) {
        return z ? f13643o00oOo00 : f13642o00oOOoO;
    }

    @NotNull
    public final Set<FileVisitOption> o00oOOoO(boolean z) {
        return z ? f13644o00oOo0O : f13645o00oOooO;
    }
}
