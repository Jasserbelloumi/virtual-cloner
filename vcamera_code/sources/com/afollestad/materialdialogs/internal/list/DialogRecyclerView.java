package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOo.o0O0OO;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0O0O;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOOo.o0O00oO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001d\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002RN\u0010\u001c\u001a:\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014j\u0004\u0018\u0001`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lo0O0oo0O/o0OO00OO;", "dialog", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "onAttachedToWindow", "onDetachedFromWindow", "", TtmlNode.LEFT, "top", "oldl", "oldt", "onScrollChanged", "", "o00oOo0o", "o00oOo0O", "o00oOoO0", "o00oOooO", "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", "scrolledDown", "atBottom", "Lcom/afollestad/materialdialogs/internal/list/InvalidateDividersDelegate;", "o00oo0O0", "Lo0OOOO/o0O00000;", "invalidateDividersDelegate", "com/afollestad/materialdialogs/internal/list/DialogRecyclerView$o00oOo00", "o00oo0O", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView$o00oOo00;", "scrollListeners", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DialogRecyclerView extends RecyclerView {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOo00 f5786o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O00000<? super Boolean, ? super Boolean, oO0Ooooo> f5787o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0006\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lo0OO0o/o0O0o00O;", "name", "showTop", "p1", "showBottom", "p2", "Lo0OO0o/oO0Ooooo;", "invoke", "(ZZ)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final /* synthetic */ class o00oOOo0 extends o0O0O0O implements o0O00000<Boolean, Boolean, oO0Ooooo> {
        public o00oOOo0(o0OO00OO o0oo00oo) {
            super(2, o0oo00oo);
        }

        @Override // o0OOOOO0.o0O0000O, o0OOOo.o0O00O
        public final String getName() {
            return "invalidateDividers";
        }

        @Override // o0OOOOO0.o0O0000O
        public final o0O00oO0 getOwner() {
            return o0OOooO0.o00oOoO(o0O0OO.class, "core");
        }

        @Override // o0OOOOO0.o0O0000O
        public final String getSignature() {
            return "invalidateDividers(Lcom/afollestad/materialdialogs/MaterialDialog;ZZ)V";
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Boolean bool, Boolean bool2) {
            invoke(bool.booleanValue(), bool2.booleanValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(boolean z, boolean z2) {
            o0O0OO.o00oOOoO((o0OO00OO) this.receiver, z, z2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o00oo<DialogRecyclerView, oO0Ooooo> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(DialogRecyclerView dialogRecyclerView) {
            invoke2(dialogRecyclerView);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DialogRecyclerView dialogRecyclerView) {
            o0ooO.o00oo0O(dialogRecyclerView, "$receiver");
            dialogRecyclerView.o00oOo00();
            dialogRecyclerView.o00oOooO();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/afollestad/materialdialogs/internal/list/DialogRecyclerView$o00oOo00", "Landroidx/recyclerview/widget/RecyclerView$o0O000Oo;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Lo0OO0o/oO0Ooooo;", "onScrolled", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends RecyclerView.o0O000Oo {
        public o00oOo00() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
        public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            o0ooO.o00oo0O(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            DialogRecyclerView.this.o00oOo00();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        this.f5786o00oo0O = new o00oOo00();
    }

    public /* synthetic */ DialogRecyclerView(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void o00oOOoO(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        this.f5787o00oo0O0 = new o00oOOo0(o0oo00oo);
    }

    public final void o00oOo00() {
        o0O00000<? super Boolean, ? super Boolean, oO0Ooooo> o0o00000;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || (o0o00000 = this.f5787o00oo0O0) == null) {
            return;
        }
        o0o00000.invoke(Boolean.valueOf(!o00oOo0o()), Boolean.valueOf(!o00oOo0O()));
    }

    public final boolean o00oOo0O() {
        RecyclerView.o00oo0OO adapter = getAdapter();
        if (adapter == null) {
            o0ooO.o00ooo0O();
        }
        o0ooO.o00oOoO(adapter, "adapter!!");
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.o0O00000 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
            return true;
        }
        return false;
    }

    public final boolean o00oOo0o() {
        RecyclerView.o0O00000 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
            return true;
        }
        return false;
    }

    public final boolean o00oOoO0() {
        return o00oOo0O() && o00oOo0o();
    }

    public final void o00oOooO() {
        int i = 2;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && !o00oOoO0()) {
            i = 1;
        }
        setOverScrollMode(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0OooO0.f12732o00oOOo0.o00ooo00(this, o00oOOoO.INSTANCE);
        addOnScrollListener(this.f5786o00oo0O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.f5786o00oo0O);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        o00oOo00();
    }
}
