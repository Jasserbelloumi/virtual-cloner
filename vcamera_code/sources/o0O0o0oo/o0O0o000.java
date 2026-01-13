package o0O0o0oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import o00oOooO.oooOO0;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001H\u0016J*\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001H&R\"\u0010\u0014\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0O0o0oo/o0O0o000;", "", "", "layoutRes", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o00oOooO", "position", "item", "o00oOo00", "viewType", "Lo0O0o0oo/oo0OOoo;", "o00oOOo0", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", o00oOOoO.f12961o00oOo00, "()Landroid/view/LayoutInflater;", "o00oOo0O", "(Landroid/view/LayoutInflater;)V", "inflater", "<init>", "()V", "adapter_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class o0O0o000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public LayoutInflater f12651o00oOOo0;

    @NotNull
    public abstract oo0OOoo<? extends Object> o00oOOo0(@Nullable ViewGroup viewGroup, int i, @NotNull Object obj);

    @NotNull
    public final LayoutInflater o00oOOoO() {
        LayoutInflater layoutInflater = this.f12651o00oOOo0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        o0OOOOO0.o0ooO.o00ooooO("inflater");
        throw null;
    }

    public int o00oOo00(int i, @NotNull Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(obj, "item");
        return -1;
    }

    public final void o00oOo0O(@NotNull LayoutInflater layoutInflater) {
        o0OOOOO0.o0ooO.o00oo0O0(layoutInflater, "<set-?>");
        this.f12651o00oOOo0 = layoutInflater;
    }

    @NotNull
    public final View o00oOooO(@oooOO0 int i, @Nullable ViewGroup viewGroup) {
        View inflate = o00oOOoO().inflate(i, viewGroup, false);
        o0OOOOO0.o0ooO.o00oo0OO(inflate, "inflater.inflate(layoutRes, parent, false)");
        return inflate;
    }
}
