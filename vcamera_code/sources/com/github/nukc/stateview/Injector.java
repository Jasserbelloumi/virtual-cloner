package com.github.nukc.stateview;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import o0O000oo.o0O00oO0;
import o0O000oo.o0O0O0Oo;
import o0O000oo.o0OooO0;
import o0O0Oo.o0O0OOO;
import o0OO0o.o0OOO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/github/nukc/stateview/Injector;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/github/nukc/stateview/StateView;", "wrapChild", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "matchViewIfParentIsConstraintLayout", "Landroid/widget/RelativeLayout;", "matchViewIfParentIsRelativeLayout", "stateView", o0O0OOO.f11641o00ooO0O, "Lo0OO0o/oO0Ooooo;", "setStateListAnimator", "", "constraintLayoutAvailable", "Z", "getConstraintLayoutAvailable", "()Z", "<init>", "()V", "kotlin_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class Injector {
    public static final Injector INSTANCE = new Injector();
    private static final boolean constraintLayoutAvailable;

    static {
        boolean z;
        try {
            Class.forName("androidx.constraintlayout.widget.ConstraintLayout");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        constraintLayoutAvailable = z;
    }

    private Injector() {
    }

    public final boolean getConstraintLayoutAvailable() {
        return constraintLayoutAvailable;
    }

    @NotNull
    public final StateView matchViewIfParentIsConstraintLayout(@NotNull ConstraintLayout constraintLayout, @NotNull View view) {
        o0ooO.o00oo0O(constraintLayout, "parent");
        o0ooO.o00oo0O(view, "view");
        Context context = constraintLayout.getContext();
        o0ooO.o00oOoO(context, "parent.context");
        StateView stateView = new StateView(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.o00oOOoO o00ooooo2 = new ConstraintLayout.o00oOOoO(layoutParams);
            o00ooooo2.f1804o00oOooO = view.getId();
            o00ooooo2.f1800o00oOoO0 = view.getId();
            o00ooooo2.f1799o00oOoO = view.getId();
            o00ooooo2.f1803o00oOoo0 = view.getId();
            constraintLayout.addView(stateView, o00ooooo2);
            return stateView;
        }
        throw new o0OOO0("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @NotNull
    public final StateView matchViewIfParentIsRelativeLayout(@NotNull RelativeLayout relativeLayout, @NotNull View view) {
        o0ooO.o00oo0O(relativeLayout, "parent");
        o0ooO.o00oo0O(view, "view");
        Context context = relativeLayout.getContext();
        o0ooO.o00oOoO(context, "parent.context");
        StateView stateView = new StateView(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            relativeLayout.addView(stateView, new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) layoutParams));
            setStateListAnimator(stateView, view);
            return stateView;
        }
        throw new o0OOO0("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void setStateListAnimator(@NotNull StateView stateView, @NotNull View view) {
        o0ooO.o00oo0O(stateView, "stateView");
        o0ooO.o00oo0O(view, o0O0OOO.f11641o00ooO0O);
        if (view instanceof Button) {
            StateView.Companion.getTAG$kotlin_release();
            stateView.setStateListAnimator(((Button) view).getStateListAnimator());
        }
    }

    @NotNull
    public final StateView wrapChild(@NotNull ViewGroup viewGroup) {
        o0ooO.o00oo0O(viewGroup, "parent");
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        frameLayout.setLayoutParams(layoutParams);
        int i = 0;
        if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = layoutParams2;
            }
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setOrientation(linearLayout.getOrientation());
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(0);
                o0ooO.o00oOoO(childAt, "parent.getChildAt(0)");
                viewGroup.removeView(childAt);
                linearLayout2.addView(childAt);
            }
            frameLayout.addView(linearLayout2);
        } else if ((viewGroup instanceof ScrollView) || (viewGroup instanceof o0OooO0)) {
            if (viewGroup.getChildCount() != 1) {
                throw new IllegalStateException("the ScrollView does not have one direct child");
            }
            View childAt2 = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt2);
            frameLayout.addView(childAt2);
            Object systemService = viewGroup.getContext().getSystemService("window");
            if (systemService == null) {
                throw new o0OOO0("null cannot be cast to non-null type android.view.WindowManager");
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
        } else if (!(viewGroup instanceof o0O0O0Oo) || !(viewGroup instanceof o0O00oO0)) {
            throw new IllegalStateException("the view does not have parent, view = " + viewGroup);
        } else if (viewGroup.getChildCount() == 2) {
            View childAt3 = viewGroup.getChildAt(1);
            viewGroup.removeView(childAt3);
            frameLayout.addView(childAt3);
        } else if (viewGroup.getChildCount() > 2) {
            throw new IllegalStateException("the view is not refresh layout? view = " + viewGroup);
        }
        viewGroup.addView(frameLayout);
        Context context = viewGroup.getContext();
        o0ooO.o00oOoO(context, "parent.context");
        StateView stateView = new StateView(context);
        if (i > 0) {
            frameLayout.addView(stateView, new ViewGroup.LayoutParams(-1, i));
        } else {
            frameLayout.addView(stateView);
        }
        return stateView;
    }
}
