package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOooO0(30)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Landroidx/window/layout/o00oOo0O;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oOo0O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOo0O f5479o00oOOo0 = new o00oOo0O();

    @NotNull
    public final Rect o00oOOo0(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        o0ooO.o00oo0OO(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @NotNull
    public final Rect o00oOOoO(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        o0ooO.o00oo0OO(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
