package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOooO0(28)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/o00oo00O;", "", "Landroid/view/DisplayCutout;", "displayCutout", "", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOooO", "o00oOo00", "o00oOOo0", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oo00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo00O f5493o00oOOo0 = new o00oo00O();

    public final int o00oOOo0(@NotNull DisplayCutout displayCutout) {
        o0ooO.o00oo0O0(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int o00oOOoO(@NotNull DisplayCutout displayCutout) {
        o0ooO.o00oo0O0(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int o00oOo00(@NotNull DisplayCutout displayCutout) {
        o0ooO.o00oo0O0(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int o00oOooO(@NotNull DisplayCutout displayCutout) {
        o0ooO.o00oo0O0(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
