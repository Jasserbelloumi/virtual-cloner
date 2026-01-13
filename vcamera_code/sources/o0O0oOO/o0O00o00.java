package o0O0oOO;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lo0O0oOO/o0O00o00;", "Landroidx/recyclerview/widget/RecyclerView$o0O00oO0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onClick", "Landroidx/appcompat/widget/AppCompatCheckBox;", "o00oo0O0", "Landroidx/appcompat/widget/AppCompatCheckBox;", "o00oOOo0", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "controlView", "Landroid/widget/TextView;", "o00oo0O", "Landroid/widget/TextView;", o00oOOoO.f12961o00oOo00, "()Landroid/widget/TextView;", "titleView", "Lo0O0oOO/o0oO0Ooo;", "o00oo0Oo", "Lo0O0oOO/o0oO0Ooo;", "adapter", "", "value", "o00oOo00", "()Z", "o00oOooO", "(Z)V", "isEnabled", "itemView", "<init>", "(Landroid/view/View;Lo0O0oOO/o0oO0Ooo;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O00o00 extends RecyclerView.o0O00oO0 implements View.OnClickListener {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final TextView f12703o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final AppCompatCheckBox f12704o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0oO0Ooo f12705o00oo0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(@NotNull View view, @NotNull o0oO0Ooo o0oo0ooo) {
        super(view);
        o0ooO.o00oo0O(view, "itemView");
        o0ooO.o00oo0O(o0oo0ooo, "adapter");
        this.f12705o00oo0Oo = o0oo0ooo;
        view.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.md_control);
        o0ooO.o00oOoO(findViewById, "itemView.findViewById(R.id.md_control)");
        this.f12704o00oo0O0 = (AppCompatCheckBox) findViewById;
        View findViewById2 = view.findViewById(R.id.md_title);
        o0ooO.o00oOoO(findViewById2, "itemView.findViewById(R.id.md_title)");
        this.f12703o00oo0O = (TextView) findViewById2;
    }

    @NotNull
    public final AppCompatCheckBox o00oOOo0() {
        return this.f12704o00oo0O0;
    }

    @NotNull
    public final TextView o00oOOoO() {
        return this.f12703o00oo0O;
    }

    public final boolean o00oOo00() {
        View view = this.itemView;
        o0ooO.o00oOoO(view, "itemView");
        return view.isEnabled();
    }

    public final void o00oOooO(boolean z) {
        View view = this.itemView;
        o0ooO.o00oOoO(view, "itemView");
        view.setEnabled(z);
        this.f12704o00oo0O0.setEnabled(z);
        this.f12703o00oo0O.setEnabled(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        o0ooO.o00oo0O(view, "view");
        if (getAdapterPosition() < 0) {
            return;
        }
        this.f12705o00oo0Oo.o00ooO0(getAdapterPosition());
    }
}
