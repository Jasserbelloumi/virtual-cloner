package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOo.o0OooO0;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Landroid/widget/ScrollView;", "Lo0OO0o/oO0Ooooo;", "onAttachedToWindow", "", TtmlNode.LEFT, "top", "oldl", "oldt", "onScrollChanged", o00oOOoO.f12961o00oOo00, "o00oOo00", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "o00oo0O0", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "setRootView", "(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;)V", "rootView", "", "o00oOooO", "()Z", "isScrollable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DialogScrollView extends ScrollView {
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public DialogLayout f5804o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o00oo<DialogScrollView, oO0Ooooo> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(DialogScrollView dialogScrollView) {
            invoke2(dialogScrollView);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DialogScrollView dialogScrollView) {
            o0ooO.o00oo0O(dialogScrollView, "$receiver");
            dialogScrollView.o00oOOoO();
            dialogScrollView.o00oOo00();
        }
    }

    public DialogScrollView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ DialogScrollView(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    @Nullable
    public final DialogLayout getRootView() {
        return this.f5804o00oo0O0;
    }

    public final void o00oOOoO() {
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || !o00oOooO()) {
            DialogLayout dialogLayout = this.f5804o00oo0O0;
            if (dialogLayout != null) {
                dialogLayout.o00oOoO0(false, false);
                return;
            }
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        o0ooO.o00oOoO(childAt, "view");
        int bottom = childAt.getBottom() - (getScrollY() + getMeasuredHeight());
        DialogLayout dialogLayout2 = this.f5804o00oo0O0;
        if (dialogLayout2 != null) {
            dialogLayout2.o00oOoO0(getScrollY() > 0, bottom > 0);
        }
    }

    public final void o00oOo00() {
        setOverScrollMode((getChildCount() == 0 || getMeasuredHeight() == 0 || !o00oOooO()) ? 2 : 1);
    }

    public final boolean o00oOooO() {
        View childAt = getChildAt(0);
        o0ooO.o00oOoO(childAt, "getChildAt(0)");
        return childAt.getMeasuredHeight() > getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0OooO0.f12732o00oOOo0.o00ooo00(this, o00oOOo0.INSTANCE);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        o00oOOoO();
    }

    public final void setRootView(@Nullable DialogLayout dialogLayout) {
        this.f5804o00oo0O0 = dialogLayout;
    }
}
