package o0OOOOoO;

import java.nio.file.Path;
import java.util.Iterator;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00ooO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Path f13658o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object f13659o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00ooO f13660o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Iterator<o00ooO> f13661o00oOooO;

    public o00ooO(@NotNull Path path, @Nullable Object obj, @Nullable o00ooO o00ooo) {
        o0ooO.o00oo0O0(path, "path");
        this.f13658o00oOOo0 = path;
        this.f13659o00oOOoO = obj;
        this.f13660o00oOo00 = o00ooo;
    }

    @Nullable
    public final Iterator<o00ooO> o00oOOo0() {
        return this.f13661o00oOooO;
    }

    @Nullable
    public final Object o00oOOoO() {
        return this.f13659o00oOOoO;
    }

    @Nullable
    public final o00ooO o00oOo00() {
        return this.f13660o00oOo00;
    }

    public final void o00oOo0O(@Nullable Iterator<o00ooO> it) {
        this.f13661o00oOooO = it;
    }

    @NotNull
    public final Path o00oOooO() {
        return this.f13658o00oOOo0;
    }
}
