package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.oooOO0;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0O0oo0O.o0OO00OO;
import o0OO000o.o00oOOoO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0OOO0;
import o0OO0o.o0oO0Ooo;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OO00o0;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOOo.o0O0OO0;
import oo0oOOo.o00oOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bZ\u0010[JP\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J;\u0010\u001c\u001a\u00020\u00162\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0018J\u001a\u0010!\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004J\u001a\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004J\u0018\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0014J0\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0014J\u0010\u0010*\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006\\"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "Lo0O0oo0O/o0OO00OO;", "dialog", "", "res", "", "text", "Landroid/graphics/Typeface;", "typeface", "Lkotlin/Function1;", "Loo0oOOo/o00oOo00;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "applySettings", "o00oOoOO", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lo0OOOO/o00oo;)V", "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$o0O00000;", "layoutManager", "o00oOo00", "Landroid/view/View;", "view", "", "scrollable", "noVerticalPadding", "horizontalPadding", o00oOOoO.f12961o00oOo00, "(Ljava/lang/Integer;Landroid/view/View;ZZZ)Landroid/view/View;", "o00oOooO", "top", "bottom", "o00oOo0O", "o00oOoO0", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", TtmlNode.LEFT, TtmlNode.RIGHT, "onLayout", "o00oOOo0", "Landroid/view/ViewGroup;", "o00oo0O0", "Landroid/view/ViewGroup;", "scrollFrame", "Landroid/widget/TextView;", "o00oo0O", "Landroid/widget/TextView;", "messageTextView", "o00oo0Oo", "Z", "useHorizontalPadding", "o00oo0o0", "Lo0OO0o/o0oO0Ooo;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "o00oo0o", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "scrollView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "o00oo0oO", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "recyclerView", "o0O0o", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DialogContentLayout extends FrameLayout {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final /* synthetic */ o0O0OO0[] f5813o00oo = {o0OOooO0.o00oo0oO(new o0OO00o0(o0OOooO0.o00oOooO(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};

    /* renamed from: o00oo0O  reason: collision with root package name */
    public TextView f5814o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ViewGroup f5815o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f5816o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public DialogScrollView f5817o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0oO0Ooo f5818o00oo0o0;
    @Nullable

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public DialogRecyclerView f5819o00oo0oO;
    @Nullable

    /* renamed from: o0O0o  reason: collision with root package name */
    public View f5820o0O0o;

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<Integer> {
        public o00oOOo0() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return DialogContentLayout.this.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        this.f5818o00oo0o0 = o0O00oO0.o00oOo00(new o00oOOo0());
    }

    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int getFrameHorizontalMargin() {
        o0oO0Ooo o0oo0ooo = this.f5818o00oo0o0;
        o0O0OO0 o0o0oo0 = f5813o00oo[0];
        return ((Number) o0oo0ooo.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new o0OOO0("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public static /* synthetic */ void o00oOo0o(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.o00oOo0O(i, i2);
    }

    public static /* synthetic */ void o00oOoO(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.o00oOoO0(i, i2);
    }

    @Nullable
    public final View getCustomView() {
        return this.f5820o0O0o;
    }

    @Nullable
    public final DialogRecyclerView getRecyclerView() {
        return this.f5819o00oo0oO;
    }

    @Nullable
    public final DialogScrollView getScrollView() {
        return this.f5817o00oo0o;
    }

    public final void o00oOOo0(boolean z) {
        if (this.f5817o00oo0o == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) oo0OOoo.o00oOo00(this, R.layout.md_dialog_stub_scrollview, null, 2, null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt == null) {
                throw new o0OOO0("null cannot be cast to non-null type android.view.ViewGroup");
            }
            this.f5815o00oo0O0 = (ViewGroup) childAt;
            if (!z) {
                o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
                o0OooO0.o00ooOoO(o0oooo0, dialogScrollView, 0, 0, 0, o0oooo0.o00oOo0O(dialogScrollView, R.dimen.md_dialog_frame_margin_vertical), 7, null);
            }
            this.f5817o00oo0o = dialogScrollView;
            addView(dialogScrollView);
        }
    }

    @NotNull
    public final View o00oOOoO(@oooOO0 @Nullable Integer num, @Nullable View view, boolean z, boolean z2, boolean z3) {
        if (this.f5820o0O0o == null) {
            View view2 = null;
            if (view != null && view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            if (z) {
                this.f5816o00oo0Oo = false;
                o00oOOo0(z2);
                if (view == null) {
                    if (num == null) {
                        o0ooO.o00ooo0O();
                    }
                    view = (View) oo0OOoo.o00oOOo0(this, num.intValue(), this.f5815o00oo0O0);
                }
                this.f5820o0O0o = view;
                ViewGroup viewGroup2 = this.f5815o00oo0O0;
                if (viewGroup2 == null) {
                    o0ooO.o00ooo0O();
                }
                View view3 = this.f5820o0O0o;
                if (view3 != null) {
                    if (z3) {
                        o0OooO0.o00ooOoO(o0OooO0.f12732o00oOOo0, view3, getFrameHorizontalMargin(), 0, getFrameHorizontalMargin(), 0, 10, null);
                    }
                    view2 = view3;
                }
                viewGroup2.addView(view2);
            } else {
                this.f5816o00oo0Oo = z3;
                if (view == null) {
                    if (num == null) {
                        o0ooO.o00ooo0O();
                    }
                    view = (View) oo0OOoo.o00oOo00(this, num.intValue(), null, 2, null);
                }
                this.f5820o0O0o = view;
                addView(view);
            }
            View view4 = this.f5820o0O0o;
            if (view4 == null) {
                o0ooO.o00ooo0O();
            }
            return view4;
        }
        throw new IllegalStateException("Custom view already set.".toString());
    }

    public final void o00oOo00(@NotNull o0OO00OO o0oo00oo, @NotNull RecyclerView.o00oo0OO<?> o00oo0oo, @Nullable RecyclerView.o0O00000 o0o00000) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        o0ooO.o00oo0O(o00oo0oo, "adapter");
        if (this.f5819o00oo0oO == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) oo0OOoo.o00oOo00(this, R.layout.md_dialog_stub_recyclerview, null, 2, null);
            dialogRecyclerView.o00oOOoO(o0oo00oo);
            if (o0o00000 == null) {
                o0o00000 = new LinearLayoutManager(o0oo00oo.f12800o00ooOo);
            }
            dialogRecyclerView.setLayoutManager(o0o00000);
            this.f5819o00oo0oO = dialogRecyclerView;
            addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = this.f5819o00oo0oO;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(o00oo0oo);
        }
    }

    public final void o00oOo0O(int i, int i2) {
        if (i != -1) {
            o0OooO0.o00ooOoO(o0OooO0.f12732o00oOOo0, getChildAt(0), 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            o0OooO0.o00ooOoO(o0OooO0.f12732o00oOOo0, getChildAt(getChildCount() - 1), 0, 0, 0, i2, 7, null);
        }
    }

    public final void o00oOoO0(int i, int i2) {
        View view = this.f5817o00oo0o;
        if (view == null) {
            view = this.f5819o00oo0oO;
        }
        if (i != -1) {
            o0OooO0.o00ooOoO(o0OooO0.f12732o00oOOo0, view, 0, i, 0, 0, 13, null);
        }
        if (i2 != -1) {
            o0OooO0.o00ooOoO(o0OooO0.f12732o00oOOo0, view, 0, 0, 0, i2, 7, null);
        }
    }

    public final void o00oOoOO(@NotNull o0OO00OO o0oo00oo, @o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @Nullable Typeface typeface, @Nullable o00oo<? super o00oOo00, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        o00oOOo0(false);
        if (this.f5814o00oo0O == null) {
            int i = R.layout.md_dialog_stub_message;
            ViewGroup viewGroup = this.f5815o00oo0O0;
            if (viewGroup == null) {
                o0ooO.o00ooo0O();
            }
            TextView textView = (TextView) oo0OOoo.o00oOOo0(this, i, viewGroup);
            ViewGroup viewGroup2 = this.f5815o00oo0O0;
            if (viewGroup2 == null) {
                o0ooO.o00ooo0O();
            }
            viewGroup2.addView(textView);
            this.f5814o00oo0O = textView;
        }
        TextView textView2 = this.f5814o00oo0O;
        if (textView2 == null) {
            o0ooO.o00ooo0O();
        }
        o00oOo00 o00ooo002 = new o00oOo00(o0oo00oo, textView2);
        if (o00ooVar != null) {
            o00ooVar.invoke(o00ooo002);
        }
        TextView textView3 = this.f5814o00oo0O;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            o0OooO0.o00oo0OO(o0OooO0.f12732o00oOOo0, textView3, o0oo00oo.f12800o00ooOo, Integer.valueOf(R.attr.md_color_content), null, 4, null);
            o00ooo002.o00oOo0o(num, charSequence);
        }
    }

    public final boolean o00oOooO() {
        return getChildCount() > 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            o0ooO.o00oOoO(childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i7;
            if (o0ooO.o00oOoO0(childAt, this.f5820o0O0o) && this.f5816o00oo0Oo) {
                i5 = getFrameHorizontalMargin();
                measuredWidth = getMeasuredWidth() - getFrameHorizontalMargin();
            } else {
                measuredWidth = getMeasuredWidth();
                i5 = 0;
            }
            childAt.layout(i5, i7, measuredWidth, measuredHeight);
            i6++;
            i7 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.f5817o00oo0o;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.f5817o00oo0o;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i3 = size2 - measuredHeight;
        int childCount = this.f5817o00oo0o != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i4 = i3 / childCount;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = getChildAt(i5);
            o0ooO.o00oOoO(childAt, "currentChild");
            int id = childAt.getId();
            DialogScrollView dialogScrollView3 = this.f5817o00oo0o;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                childAt.measure((o0ooO.o00oOoO0(childAt, this.f5820o0O0o) && this.f5816o00oo0Oo) ? View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824) : View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(@Nullable View view) {
        this.f5820o0O0o = view;
    }

    public final void setRecyclerView(@Nullable DialogRecyclerView dialogRecyclerView) {
        this.f5819o00oo0oO = dialogRecyclerView;
    }

    public final void setScrollView(@Nullable DialogScrollView dialogScrollView) {
        this.f5817o00oo0o = dialogScrollView;
    }
}
