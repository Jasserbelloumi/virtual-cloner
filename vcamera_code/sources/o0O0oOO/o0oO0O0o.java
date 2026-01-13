package o0O0oOO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import o0OO0o.o0OOO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lo0O0oOO/o0oO0O0o;", "Landroidx/recyclerview/widget/RecyclerView$o0O00oO0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onClick", "Landroid/widget/TextView;", "o00oo0O0", "Landroid/widget/TextView;", "o00oOOo0", "()Landroid/widget/TextView;", "titleView", "Lo0O0oOO/o0O00oO0;", "o00oo0O", "Lo0O0oOO/o0O00oO0;", "adapter", "itemView", "<init>", "(Landroid/view/View;Lo0O0oOO/o0O00oO0;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0oO0O0o extends RecyclerView.o0O00oO0 implements View.OnClickListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00oO0 f12722o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final TextView f12723o00oo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(@NotNull View view, @NotNull o0O00oO0 o0o00oo0) {
        super(view);
        o0ooO.o00oo0O(view, "itemView");
        o0ooO.o00oo0O(o0o00oo0, "adapter");
        this.f12722o00oo0O = o0o00oo0;
        view.setOnClickListener(this);
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt == null) {
            throw new o0OOO0("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f12723o00oo0O0 = (TextView) childAt;
    }

    @NotNull
    public final TextView o00oOOo0() {
        return this.f12723o00oo0O0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        o0ooO.o00oo0O(view, "view");
        this.f12722o00oo0O.o00ooO0(getAdapterPosition());
    }
}
