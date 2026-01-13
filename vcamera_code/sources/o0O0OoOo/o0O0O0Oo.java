package o0O0OoOo;

import android.annotation.SuppressLint;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0O0OoOo.o0oO0O0o;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lo0O0OoOo/o0O0O0Oo;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0O0OoOo/o0oO0O0o$o00oOOo0;", "o00oo0O0", "Lo0O0OoOo/o0oO0O0o$o00oOOo0;", "callback", "Lo0O0OoOo/o0O00o00;", "o00oo0O", "Lo0O0OoOo/o0O00o00;", "adapter", "<init>", "(Lo0O0OoOo/o0oO0O0o$o00oOOo0;Lo0O0OoOo/o0O00o00;)V", "window_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"NewApi"})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O0O0Oo implements Consumer<List<? extends SplitInfo>> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00o00 f12004o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0oO0O0o.o00oOOo0 f12005o00oo0O0;

    public o0O0O0Oo(@NotNull o0oO0O0o.o00oOOo0 o00oooo02, @NotNull o0O00o00 o0o00o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "callback");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "adapter");
        this.f12005o00oo0O0 = o00oooo02;
        this.f12004o00oo0O = o0o00o00;
    }

    @Override // java.util.function.Consumer
    /* renamed from: o00oOOo0 */
    public void accept(@NotNull List<? extends SplitInfo> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "splitInfoList");
        this.f12005o00oo0O0.o00oOOo0(this.f12004o00oo0O.o00oOoO(list));
    }
}
