package androidx.window.layout;

import android.graphics.Rect;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/o0O00O0;", "", "", "toString", "other", "", "equals", "", "hashCode", "Lo0O0OoO/o00oo0;", "o00oOOo0", "Lo0O0OoO/o00oo0;", "_bounds", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "bounds", "<init>", "(Lo0O0OoO/o00oo0;)V", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0O00O0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OoO.o00oo0 f5538o00oOOo0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public o0O00O0(@NotNull Rect rect) {
        this(new o0O0OoO.o00oo0(rect));
        o0ooO.o00oo0O0(rect, "bounds");
    }

    public o0O00O0(@NotNull o0O0OoO.o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(o00oo0Var, "_bounds");
        this.f5538o00oOOo0 = o00oo0Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o0ooO.o00oOoO0(o0O00O0.class, obj.getClass())) {
            return false;
        }
        return o0ooO.o00oOoO0(this.f5538o00oOOo0, ((o0O00O0) obj).f5538o00oOOo0);
    }

    public int hashCode() {
        return this.f5538o00oOOo0.hashCode();
    }

    @NotNull
    public final Rect o00oOOo0() {
        return this.f5538o00oOOo0.o00oOoOO();
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("WindowMetrics { bounds: ");
        o00oOOo02.append(o00oOOo0());
        o00oOOo02.append(" }");
        return o00oOOo02.toString();
    }
}
