package androidx.window.layout;

import java.util.List;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0OO0oO.o0O0oo0o;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/o0O00;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "Landroidx/window/layout/o00oo0;", "o00oOOo0", "Ljava/util/List;", "()Ljava/util/List;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0O00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<o00oo0> f5513o00oOOo0;

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public o0O00(@NotNull List<? extends o00oo0> list) {
        o0ooO.o00oo0O0(list, "displayFeatures");
        this.f5513o00oOOo0 = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o0ooO.o00oOoO0(o0O00.class, obj.getClass())) {
            return false;
        }
        return o0ooO.o00oOoO0(this.f5513o00oOOo0, ((o0O00) obj).f5513o00oOOo0);
    }

    public int hashCode() {
        return this.f5513o00oOOo0.hashCode();
    }

    @NotNull
    public final List<o00oo0> o00oOOo0() {
        return this.f5513o00oOOo0;
    }

    @NotNull
    public String toString() {
        return o0O0oo0o.o0OOo0o0(this.f5513o00oOOo0, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
