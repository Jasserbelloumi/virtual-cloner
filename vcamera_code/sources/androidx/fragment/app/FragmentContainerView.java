package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
import o0OOOoo0.oOo0oooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B%\b\u0017\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010?\u001a\u00020\u001b¢\u0006\u0004\b;\u0010@B!\b\u0010\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\b;\u0010CJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0001J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010H\u0002R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006D"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", o00oOoO0.o00oOOoO.f6900o00oooOO, "Lo0OO0o/oO0Ooooo;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", TtmlNode.START, "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "v", "o00oOOo0", "", "o00oo0O0", "Ljava/util/List;", "disappearingFragmentChildren", "o00oo0O", "transitioningFragmentViews", "o00oo0Oo", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "o00oo0o0", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final List<View> f2842o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<View> f2843o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2844o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f2845o00oo0o0;

    @o0OOooO0(20)
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$o00oOOo0;", "", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "o00oOOo0", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f2846o00oOOo0 = new o00oOOo0();

        @NotNull
        public final WindowInsets o00oOOo0(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @NotNull View view, @NotNull WindowInsets windowInsets) {
            o0OOOOO0.o0ooO.o00oo0O0(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            o0OOOOO0.o0ooO.o00oo0O0(view, "v");
            o0OOOOO0.o0ooO.o00oo0O0(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            o0OOOOO0.o0ooO.o00oo0OO(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        this.f2843o00oo0O0 = new ArrayList();
        this.f2842o00oo0O = new ArrayList();
        this.f2845o00oo0o0 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        this.f2843o00oo0O0 = new ArrayList();
        this.f2842o00oo0O = new ArrayList();
        this.f2845o00oo0o0 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = R.styleable.FragmentContainerView;
            o0OOOOO0.o0ooO.o00oo0OO(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + oOo0oooO.f13903o00oOOoO);
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, o0OOOOO0.o0O00 o0o00) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attributeSet, @NotNull FragmentManager fragmentManager) {
        super(context, attributeSet);
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        o0OOOOO0.o0ooO.o00oo0O0(attributeSet, "attrs");
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "fm");
        this.f2843o00oo0O0 = new ArrayList();
        this.f2842o00oo0O = new ArrayList();
        this.f2845o00oo0o0 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R.styleable.FragmentContainerView;
        o0OOOOO0.o0ooO.o00oo0OO(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment o0O00Ooo2 = fragmentManager.o0O00Ooo(id);
        if (classAttribute != null && o0O00Ooo2 == null) {
            if (id == -1) {
                throw new IllegalStateException(android.support.v4.media.o00oOoO.o00oOOo0("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? o00oOoOo.o00oo.o00oOOo0(" with tag ", string) : ""));
            }
            Fragment o00oOOo02 = fragmentManager.o0O0OO0().o00oOOo0(context.getClassLoader(), classAttribute);
            o0OOOOO0.o0ooO.o00oo0OO(o00oOOo02, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            o00oOOo02.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.o00oo0oO().o00ooo0o(true).o00oOo0o(this, o00oOOo02, string).o00oo0O0();
        }
        fragmentManager.o0O0o0oo(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "child");
        if (FragmentManager.o0O0Oo0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @o0OOooO0(20)
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets windowInsets) {
        o0OOo000 o0O0o02;
        o0OOOOO0.o0ooO.o00oo0O0(windowInsets, "insets");
        o0OOo000 o00ooo02 = o0OOo000.o00ooo0(windowInsets);
        o0OOOOO0.o0ooO.o00oo0OO(o00ooo02, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2844o00oo0Oo;
        if (onApplyWindowInsetsListener != null) {
            o00oOOo0 o00oooo02 = o00oOOo0.f2846o00oOOo0;
            o0OOOOO0.o0ooO.o00oo00O(onApplyWindowInsetsListener);
            o0O0o02 = o0OOo000.o00ooo0O(o00oooo02.o00oOOo0(onApplyWindowInsetsListener, this, windowInsets), null);
        } else {
            o0O0o02 = o0O0o00O.o0O0o0(this, o00ooo02);
        }
        o0OOOOO0.o0ooO.o00oo0OO(o0O0o02, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!o0O0o02.o00ooO0o()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                o0O0o00O.o00oo0O0(getChildAt(i), o0O0o02);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        o0OOOOO0.o0ooO.o00oo0O0(canvas, "canvas");
        if (this.f2845o00oo0o0) {
            for (View view : this.f2843o00oo0O0) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View view, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(canvas, "canvas");
        o0OOOOO0.o0ooO.o00oo0O0(view, "child");
        if (this.f2845o00oo0o0 && (!this.f2843o00oo0O0.isEmpty()) && this.f2843o00oo0O0.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        this.f2842o00oo0O.remove(view);
        if (this.f2843o00oo0O0.remove(view)) {
            this.f2845o00oo0o0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.o0O00o0o(this).o0O00Ooo(getId());
    }

    public final void o00oOOo0(View view) {
        if (this.f2842o00oo0O.contains(view)) {
            this.f2843o00oo0O0.add(view);
        }
    }

    @Override // android.view.View
    @o0OOooO0(20)
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets windowInsets) {
        o0OOOOO0.o0ooO.o00oo0O0(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            o0OOOOO0.o0ooO.o00oo0OO(childAt, "view");
            o00oOOo0(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        o00oOOo0(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        o0OOOOO0.o0ooO.o00oo0OO(childAt, "view");
        o00oOOo0(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        o00oOOo0(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            o0OOOOO0.o0ooO.o00oo0OO(childAt, "view");
            o00oOOo0(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            o0OOOOO0.o0ooO.o00oo0OO(childAt, "view");
            o00oOOo0(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @o0OOOO0o.o00oo0OO(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f2845o00oo0o0 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        o0OOOOO0.o0ooO.o00oo0O0(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2844o00oo0Oo = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        if (view.getParent() == this) {
            this.f2842o00oo0O.add(view);
        }
        super.startViewTransition(view);
    }
}
