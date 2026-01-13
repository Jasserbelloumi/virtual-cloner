package o0OO0Ooo;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.util.ArrayList;
import java.util.List;
import o0OO0Ooo.o00oOoO;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nIconSpinnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconSpinnerAdapter.kt\ncom/skydoves/powerspinner/IconSpinnerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
/* loaded from: classes2.dex */
public final class o00oOoO extends RecyclerView.o00oo0OO<o00oOOo0> implements o00oo0O<o00oo00O> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f13152o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final PowerSpinnerView f13153o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo0OO<o00oo00O> f13154o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final List<o00oo00O> f13155o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f13156o00oOooO;

    @o0OOO00({"SMAP\nIconSpinnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconSpinnerAdapter.kt\ncom/skydoves/powerspinner/IconSpinnerAdapter$IconSpinnerViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
    /* loaded from: classes2.dex */
    public final class o00oOOo0 extends RecyclerView.o0O00oO0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oOoO f13157o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0OO0o00.o00oOOo0 f13158o00oo0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(@NotNull o00oOoO o00oooo2, o0OO0o00.o00oOOo0 o00oooo02) {
            super(o00oooo02.getRoot());
            o0ooO.o00oo0O0(o00oooo02, "binding");
            this.f13157o00oo0O = o00oooo2;
            this.f13158o00oo0O0 = o00oooo02;
        }

        public final void o00oOOo0(@NotNull PowerSpinnerView powerSpinnerView, @NotNull o00oo00O o00oo00o, boolean z) {
            oO0Ooooo oo0ooooo;
            o0ooO.o00oo0O0(powerSpinnerView, "spinnerView");
            o0ooO.o00oo0O0(o00oo00o, "item");
            AppCompatTextView appCompatTextView = this.f13158o00oo0O0.itemDefaultText;
            o00oOoO o00oooo2 = this.f13157o00oo0O;
            appCompatTextView.setText(o00oo00o.f13160o00oOOo0);
            Typeface typeface = o00oo00o.f13166o00oOoO0;
            if (typeface != null) {
                appCompatTextView.setTypeface(typeface);
                oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            } else {
                oo0ooooo = null;
            }
            if (oo0ooooo == null) {
                appCompatTextView.setTypeface(appCompatTextView.getTypeface(), o00oo00o.f13164o00oOo0o);
            }
            Integer num = o00oo00o.f13165o00oOoO;
            appCompatTextView.setGravity(num != null ? num.intValue() : powerSpinnerView.getGravity());
            Float f = o00oo00o.f13167o00oOoOO;
            appCompatTextView.setTextSize(0, f != null ? f.floatValue() : powerSpinnerView.getTextSize());
            Integer num2 = o00oo00o.f13168o00oOoOo;
            appCompatTextView.setTextColor(num2 != null ? num2.intValue() : powerSpinnerView.getCurrentTextColor());
            Integer num3 = o00oo00o.f13169o00oOooO;
            appCompatTextView.setCompoundDrawablePadding(num3 != null ? num3.intValue() : powerSpinnerView.getCompoundDrawablePadding());
            o0ooO.o00oo0OO(appCompatTextView, "bind$lambda$1");
            o00oooo2.o00ooO00(appCompatTextView, powerSpinnerView, o00oo00o);
            this.f13158o00oo0O0.getRoot().setPadding(powerSpinnerView.getPaddingLeft(), powerSpinnerView.getPaddingTop(), powerSpinnerView.getPaddingRight(), powerSpinnerView.getPaddingBottom());
            if (powerSpinnerView.getSpinnerItemHeight() != Integer.MIN_VALUE) {
                this.f13158o00oo0O0.getRoot().setHeight(powerSpinnerView.getSpinnerItemHeight());
            }
            if (powerSpinnerView.getSpinnerSelectedItemBackground() == null || !z) {
                this.f13158o00oo0O0.getRoot().setBackground(null);
            } else {
                this.f13158o00oo0O0.getRoot().setBackground(powerSpinnerView.getSpinnerSelectedItemBackground());
            }
        }
    }

    public o00oOoO(@NotNull PowerSpinnerView powerSpinnerView) {
        o0ooO.o00oo0O0(powerSpinnerView, "powerSpinnerView");
        this.f13152o00oOOo0 = powerSpinnerView.getSelectedIndex();
        this.f13153o00oOOoO = powerSpinnerView;
        this.f13156o00oOooO = 12;
        this.f13155o00oOo0O = new ArrayList();
        powerSpinnerView.setCompoundDrawablePadding(12);
    }

    public static final void o00ooO0o(o00oOOo0 o00oooo02, o00oOoO o00oooo2, View view) {
        o0ooO.o00oo0O0(o00oooo02, "$this_apply");
        o0ooO.o00oo0O0(o00oooo2, "this$0");
        Integer valueOf = Integer.valueOf(o00oooo02.getBindingAdapterPosition());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            o00oooo2.o00oo0O(valueOf.intValue());
        }
    }

    @Override // o0OO0Ooo.o00oo0O
    public int getIndex() {
        return this.f13152o00oOOo0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f13155o00oOo0O.size();
    }

    @Override // o0OO0Ooo.o00oo0O
    @NotNull
    public PowerSpinnerView o00oOOoO() {
        return this.f13153o00oOOoO;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oOo0o(@Nullable o00oo0OO<o00oo00O> o00oo0oo) {
        this.f13154o00oOo00 = o00oo0oo;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oOoOO(@NotNull List<? extends o00oo00O> list) {
        o0ooO.o00oo0O0(list, "itemList");
        this.f13155o00oOo0O.clear();
        this.f13155o00oOo0O.addAll(list);
        this.f13152o00oOOo0 = -1;
        notifyDataSetChanged();
    }

    @Override // o0OO0Ooo.o00oo0O
    public void o00oo0O(int i) {
        if (i == -1) {
            return;
        }
        o00oo00O o00oo00o = this.f13155o00oOo0O.get(i);
        PowerSpinnerView powerSpinnerView = this.f13153o00oOOoO;
        Integer num = o00oo00o.f13169o00oOooO;
        powerSpinnerView.setCompoundDrawablePadding(num != null ? num.intValue() : powerSpinnerView.getCompoundDrawablePadding());
        PowerSpinnerView powerSpinnerView2 = this.f13153o00oOOoO;
        o00ooO00(powerSpinnerView2, powerSpinnerView2, o00oo00o);
        int i2 = this.f13152o00oOOo0;
        this.f13152o00oOOo0 = i;
        this.f13153o00oOOoO.o00ooOo0(i, o00oo00o.f13160o00oOOo0);
        notifyDataSetChanged();
        o00oo0OO<o00oo00O> o00oo0oo = this.f13154o00oOo00;
        if (o00oo0oo != null) {
            Integer valueOf = Integer.valueOf(i2);
            o00oo00O o00oo00o2 = null;
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                o00oo00o2 = this.f13155o00oOo0O.get(i2);
            }
            o00oo0oo.o00oOOo0(i2, o00oo00o2, i, o00oo00o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0 */
    public void onBindViewHolder(@NotNull o00oOOo0 o00oooo02, int i) {
        o0ooO.o00oo0O0(o00oooo02, "holder");
        o00oooo02.o00oOOo0(this.f13153o00oOOoO, this.f13155o00oOo0O.get(i), this.f13152o00oOOo0 == i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r7 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00ooO00(androidx.appcompat.widget.AppCompatTextView r6, com.skydoves.powerspinner.PowerSpinnerView r7, o0OO0Ooo.o00oo00O r8) {
        /*
            r5 = this;
            java.lang.String r0 = "<this>"
            o0OOOOO0.o0ooO.o00oo0O0(r6, r0)
            java.lang.String r0 = "spinnerView"
            o0OOOOO0.o0ooO.o00oo0O0(r7, r0)
            java.lang.String r0 = "item"
            o0OOOOO0.o0ooO.o00oo0O0(r8, r0)
            java.lang.Integer r0 = r8.f13162o00oOo00
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            android.content.res.Resources r7 = r7.getResources()
            r1 = 0
            android.graphics.drawable.Drawable r7 = o00ooo0o.o0O0OO.o00oOoO0(r7, r0, r1)
            if (r7 != 0) goto L24
        L22:
            android.graphics.drawable.Drawable r7 = r8.f13161o00oOOoO
        L24:
            android.graphics.drawable.Drawable[] r0 = r6.getCompoundDrawablesRelative()
            r1 = 0
            r0 = r0[r1]
            android.graphics.drawable.Drawable[] r1 = r6.getCompoundDrawablesRelative()
            r2 = 1
            r1 = r1[r2]
            android.graphics.drawable.Drawable[] r2 = r6.getCompoundDrawablesRelative()
            r3 = 2
            r2 = r2[r3]
            android.graphics.drawable.Drawable[] r3 = r6.getCompoundDrawablesRelative()
            r4 = 3
            r3 = r3[r4]
            int r8 = r8.f13163o00oOo0O
            r4 = 48
            if (r8 == r4) goto L61
            r4 = 80
            if (r8 == r4) goto L5d
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r8 == r4) goto L59
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r8 == r2) goto L55
            goto L64
        L55:
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r1, r7, r3)
            goto L64
        L59:
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r1, r2, r3)
            goto L64
        L5d:
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r1, r2, r7)
            goto L64
        L61:
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r7, r2, r3)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO0Ooo.o00oOoO.o00ooO00(androidx.appcompat.widget.AppCompatTextView, com.skydoves.powerspinner.PowerSpinnerView, o0OO0Ooo.o00oo00O):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o00ooO0O */
    public o00oOOo0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0ooO.o00oo0O0(viewGroup, "parent");
        o0OO0o00.o00oOOo0 inflate = o0OO0o00.o00oOOo0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        o0ooO.o00oo0OO(inflate, "inflate(\n        LayoutI…nt,\n        false\n      )");
        final o00oOOo0 o00oooo02 = new o00oOOo0(this, inflate);
        inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o0OO0Ooo.o00oOo0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00oOoO.o00ooO0o(o00oOoO.o00oOOo0.this, this, view);
            }
        });
        return o00oooo02;
    }

    @Override // o0OO0Ooo.o00oo0O
    @Nullable
    public o00oo0OO<o00oo00O> o0O0o() {
        return this.f13154o00oOo00;
    }

    @Override // o0OO0Ooo.o00oo0O
    public void setIndex(int i) {
        this.f13152o00oOOo0 = i;
    }
}
