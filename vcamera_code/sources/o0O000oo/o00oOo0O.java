package o0O000oo;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@o00oOooO.o0OOooO0(16)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lo0O000oo/o00oOo0O;", "", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "action", "", "delayInMillis", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oOo0O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOo0O f10426o00oOOo0 = new o00oOo0O();

    @o00oOooO.o0O0O0Oo
    @o0OOOO0o.o00ooO0
    public static final void o00oOOo0(@NotNull View view, @NotNull Runnable runnable, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        o0OOOOO0.o0ooO.o00oo0O0(runnable, "action");
        view.postOnAnimationDelayed(runnable, j);
    }
}
