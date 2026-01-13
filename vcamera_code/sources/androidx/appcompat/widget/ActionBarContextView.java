package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public View f728o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public CharSequence f729o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public CharSequence f730o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public View f731o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public LinearLayout f732o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public View f733o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public TextView f734o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public int f735o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public TextView f736o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f737o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f738o00ooOoo;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f739o00ooo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOoOo.o00oo0 f741o00oo0O0;

        public o00oOOo0(o00oOoOo.o00oo0 o00oo0Var) {
            this.f741o00oo0O0 = o00oo0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f741o00oo0O0.o00oOOo0();
        }
    }

    public ActionBarContextView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public ActionBarContextView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, R.styleable.ActionMode, i, 0);
        o0O000oo.o0O0o00O.o0O0ooo0(this, o00ooOo2.o00oOoO(R.styleable.ActionMode_background));
        this.f735o00ooOo = o00ooOo2.o00oo0oO(R.styleable.ActionMode_titleTextStyle, 0);
        this.f737o00ooOoO = o00ooOo2.o00oo0oO(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f1030o00oo0o = o00ooOo2.o00oo0O(R.styleable.ActionMode_height, 0);
        this.f739o00ooo00 = o00ooOo2.o00oo0oO(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        o00ooOo2.o00ooOoo();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f730o00ooO0O;
    }

    public CharSequence getTitle() {
        return this.f729o00ooO0;
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ void o00oOo00(int i) {
        super.o00oOo00(i);
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ void o00oOo0O() {
        super.o00oOo0O();
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public boolean o00oOo0o() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00oo0o();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public boolean o00oOoO() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00oo();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ boolean o00oOoO0() {
        return super.o00oOoO0();
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ boolean o00oOoOO() {
        return super.o00oOoOO();
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ boolean o00oOooO() {
        return super.o00oOooO();
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ o0O000oo.o0OO0oO0 o00oo0(int i, long j) {
        return super.o00oo0(i, j);
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public /* bridge */ /* synthetic */ void o00oo00O() {
        super.o00oo00O();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0O(o00oOoOo.o00oo0 r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f731o00ooO0o
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f739o00ooo00
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f731o00ooO0o = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f731o00ooO0o
            goto L15
        L22:
            android.view.View r0 = r3.f731o00ooO0o
            int r1 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f728o00ooO = r0
            androidx.appcompat.widget.ActionBarContextView$o00oOOo0 r1 = new androidx.appcompat.widget.ActionBarContextView$o00oOOo0
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.o00oOo00()
            androidx.appcompat.view.menu.o00oOoO r4 = (androidx.appcompat.view.menu.o00oOoO) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.f1031o00oo0o0
            if (r0 == 0) goto L41
            r0.o00oo0O()
        L41:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1031o00oo0o0 = r0
            r1 = 1
            r0.o00ooOO(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.f1031o00oo0o0
            android.content.Context r2 = r3.f1027o00oo0O
            r4.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.f1031o00oo0o0
            androidx.appcompat.view.menu.o0O0o r4 = r4.getMenuView(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1029o00oo0Oo = r4
            r1 = 0
            o0O000oo.o0O0o00O.o0O0ooo0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1029o00oo0Oo
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.o00oo0O(o00oOoOo.o00oo0):void");
    }

    public void o00oo0O0() {
        if (this.f731o00ooO0o == null) {
            o00oo0o();
        }
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public boolean o00oo0OO() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00ooOo0();
        }
        return false;
    }

    public final void o00oo0Oo() {
        if (this.f732o00ooOO == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f732o00ooOO = linearLayout;
            this.f734o00ooOOo = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f736o00ooOo0 = (TextView) this.f732o00ooOO.findViewById(R.id.action_bar_subtitle);
            if (this.f735o00ooOo != 0) {
                this.f734o00ooOOo.setTextAppearance(getContext(), this.f735o00ooOo);
            }
            if (this.f737o00ooOoO != 0) {
                this.f736o00ooOo0.setTextAppearance(getContext(), this.f737o00ooOoO);
            }
        }
        this.f734o00ooOOo.setText(this.f729o00ooO0);
        this.f736o00ooOo0.setText(this.f730o00ooO0O);
        boolean z = !TextUtils.isEmpty(this.f729o00ooO0);
        boolean z2 = !TextUtils.isEmpty(this.f730o00ooO0O);
        int i = 0;
        this.f736o00ooOo0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f732o00ooOO;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f732o00ooOO.getParent() == null) {
            addView(this.f732o00ooOO);
        }
    }

    public void o00oo0o() {
        removeAllViews();
        this.f733o00ooOO0 = null;
        this.f1029o00oo0Oo = null;
        this.f1031o00oo0o0 = null;
        View view = this.f728o00ooO;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean o00oo0o0() {
        return this.f738o00ooOoo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o00oo0o();
            this.f1031o00oo0o0.o00oo0oO();
        }
    }

    @Override // androidx.appcompat.widget.o00oOOo0, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean o00oOOoO2 = o.o00oOOoO(this);
        int paddingRight = o00oOOoO2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f731o00ooO0o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f731o00ooO0o.getLayoutParams();
            int i5 = o00oOOoO2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = o00oOOoO2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = o00oOOoO2 ? paddingRight - i5 : paddingRight + i5;
            int o00oOooo2 = i7 + o00oOooo(this.f731o00ooO0o, i7, paddingTop, paddingTop2, o00oOOoO2);
            paddingRight = o00oOOoO2 ? o00oOooo2 - i6 : o00oOooo2 + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f732o00ooOO;
        if (linearLayout != null && this.f733o00ooOO0 == null && linearLayout.getVisibility() != 8) {
            i8 += o00oOooo(this.f732o00ooOO, i8, paddingTop, paddingTop2, o00oOOoO2);
        }
        int i9 = i8;
        View view2 = this.f733o00ooOO0;
        if (view2 != null) {
            o00oOooo(view2, i9, paddingTop, paddingTop2, o00oOOoO2);
        }
        int paddingLeft = o00oOOoO2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1029o00oo0Oo;
        if (actionMenuView != null) {
            o00oOooo(actionMenuView, paddingLeft, paddingTop, paddingTop2, !o00oOOoO2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f1030o00oo0o;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            View view = this.f731o00ooO0o;
            if (view != null) {
                int o00oOoOo2 = o00oOoOo(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f731o00ooO0o.getLayoutParams();
                paddingLeft = o00oOoOo2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1029o00oo0Oo;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = o00oOoOo(this.f1029o00oo0Oo, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f732o00ooOO;
            if (linearLayout != null && this.f733o00ooOO0 == null) {
                if (this.f738o00ooOoo) {
                    this.f732o00ooOO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f732o00ooOO.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f732o00ooOO.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = o00oOoOo(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f733o00ooOO0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.f733o00ooOO0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.f1030o00oo0o <= 0) {
                int childCount = getChildCount();
                i3 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i3) {
                        i3 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i3);
        }
    }

    @Override // androidx.appcompat.widget.o00oOOo0, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.o00oOOo0
    public void setContentHeight(int i) {
        this.f1030o00oo0o = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f733o00ooOO0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f733o00ooOO0 = view;
        if (view != null && (linearLayout = this.f732o00ooOO) != null) {
            removeView(linearLayout);
            this.f732o00ooOO = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f730o00ooO0O = charSequence;
        o00oo0Oo();
    }

    public void setTitle(CharSequence charSequence) {
        this.f729o00ooO0 = charSequence;
        o00oo0Oo();
        o0O000oo.o0O0o00O.o0O0oo0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f738o00ooOoo) {
            requestLayout();
        }
        this.f738o00ooOoo = z;
    }

    @Override // androidx.appcompat.widget.o00oOOo0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
