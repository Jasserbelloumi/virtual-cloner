package o0OO0oo0;

import java.util.Comparator;
import o0O0Oooo.oooOO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00000 implements Comparator<Comparable<? super Object>> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o0O00000 f13428o00oo0O0 = new o0O00000();

    @Override // java.util.Comparator
    /* renamed from: o00oOOo0 */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        o0ooO.o00oo0O0(comparable, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return o0O0000O.f13429o00oo0O0;
    }
}
