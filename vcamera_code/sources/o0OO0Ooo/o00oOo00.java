package o0OO0Ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.util.ArrayList;
import java.util.List;
import o0OO0Ooo.o00oOo00;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nDefaultSpinnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpinnerAdapter.kt\ncom/skydoves/powerspinner/DefaultSpinnerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes2.dex */
public final class o00oOo00 extends RecyclerView.o00oo0OO<o00oOOo0> implements o00oo0O<CharSequence> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f13145o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final PowerSpinnerView f13146o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo0OO<CharSequence> f13147o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<CharSequence> f13148o00oOooO;

    /* loaded from: classes2.dex */
    public static final class o00oOOo0 extends RecyclerView.o0O00oO0 {
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0OO0o00.o00oOOo0 f13149o00oo0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(@NotNull o0OO0o00.o00oOOo0 o00oooo02) {
            super(o00oooo02.getRoot());
            o0ooO.o00oo0O0(o00oooo02, "binding");
            this.f13149o00oo0O0 = o00oooo02;
        }

        public final void o00oOOo0(@NotNull PowerSpinnerView powerSpinnerView, @NotNull CharSequence charSequence, boolean z) {
            o0ooO.o00oo0O0(powerSpinnerView, "spinnerView");
            o0ooO.o00oo0O0(charSequence, "item");
            AppCompatTextView appCompatTextView = this.f13149o00oo0O0.itemDefaultText;
            appCompatTextView.setText(charSequence);
            appCompatTextView.setTypeface(powerSpinnerView.getTypeface());
            appCompatTextView.setGravity(powerSpinnerView.getGravity());
            appCompatTextView.setTextSize(0, powerSpinnerView.getTextSize());
            appCompatTextView.setTextColor(powerSpinnerView.getCurrentTextColor());
            this.f13149o00oo0O0.getRoot().setPadding(powerSpinnerView.getPaddingLeft(), powerSpinnerView.getPaddingTop(), powerSpinnerView.getPaddingRight(), powerSpinnerView.getPaddingBottom());
            if (powerSpinnerView.getSpinnerItemHeight() != Integer.MIN_VALUE) {
                this.f13149o00oo0O0.getRoot().setHeight(powerSpinnerView.getSpinnerItemHeight());
            }
            if (powerSpinnerView.getSpinnerSelectedItemBackground() == null || !z) {
                this.f13149o00oo0O0.getRoot().setBackground(null);
            } else {
                this.f13149o00oo0O0.getRoot().setBackground(powerSpinnerView.getSpinnerSelectedItemBackground());
            }
        }
    }

    public o00oOo00(@NotNull PowerSpinnerView powerSpinnerView) {
        o0ooO.o00oo0O0(powerSpinnerView, "powerSpinnerView");
        this.f13145o00oOOo0 = powerSpinnerView.getSelectedIndex();
        this.f13146o00oOOoO = powerSpinnerView;
        this.f13148o00oOooO = new ArrayList();
    }

    public static final void o00ooO0O(o00oOOo0 o00oooo02, o00oOo00 o00ooo002, View view) {
        o0ooO.o00oo0O0(o00oooo02, "$this_apply");
        o0ooO.o00oo0O0(o00ooo002, "this$0");
        Integer valueOf = Integer.valueOf(o00oooo02.getBindingAdapterPosition());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            o00ooo002.o00oo0O(valueOf.intValue());
        }
    }

    @Override // o0OO0Ooo.o00oo0O
    public int getIndex() {
        return this.f13145o00oOOo0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f13148o00oOooO.size();
    }

    @Override // o0OO0Ooo.o00oo0O
    @NotNull
    public PowerSpinnerView o00oOOoO() {
        return this.f13146o00oOOoO;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oOo0o(@Nullable o00oo0OO<CharSequence> o00oo0oo) {
        this.f13147o00oOo00 = o00oo0oo;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oOoOO(@NotNull List<? extends CharSequence> list) {
        o0ooO.o00oo0O0(list, "itemList");
        this.f13148o00oOooO.clear();
        this.f13148o00oOooO.addAll(list);
        this.f13145o00oOOo0 = -1;
        notifyDataSetChanged();
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oo0O(int i) {
        if (i == -1) {
            return;
        }
        int i2 = this.f13145o00oOOo0;
        this.f13145o00oOOo0 = i;
        this.f13146o00oOOoO.o00ooOo0(i, this.f13148o00oOooO.get(i));
        notifyDataSetChanged();
        o00oo0OO<CharSequence> o00oo0oo = this.f13147o00oOo00;
        if (o00oo0oo != null) {
            Integer valueOf = Integer.valueOf(i2);
            CharSequence charSequence = null;
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                charSequence = this.f13148o00oOooO.get(i2);
            }
            o00oo0oo.o00oOOo0(i2, charSequence, i, this.f13148o00oOooO.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o00ooO0 */
    public o00oOOo0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0ooO.o00oo0O0(viewGroup, "parent");
        o0OO0o00.o00oOOo0 inflate = o0OO0o00.o00oOOo0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        o0ooO.o00oo0OO(inflate, "inflate(\n        LayoutI…nt,\n        false\n      )");
        final o00oOOo0 o00oooo02 = new o00oOOo0(inflate);
        inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o0OO0Ooo.o00oOOoO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00oOo00.o00ooO0O(o00oOo00.o00oOOo0.this, this, view);
            }
        });
        return o00oooo02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO00 */
    public void onBindViewHolder(@NotNull o00oOOo0 o00oooo02, int i) {
        o0ooO.o00oo0O0(o00oooo02, "holder");
        o00oooo02.o00oOOo0(this.f13146o00oOOoO, this.f13148o00oOooO.get(i), this.f13145o00oOOo0 == i);
    }

    @Override // o0OO0Ooo.o00oo0O
    @Nullable
    public o00oo0OO<CharSequence> o0O0o() {
        return this.f13147o00oOo00;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void setIndex(int i) {
        this.f13145o00oOOo0 = i;
    }
}
