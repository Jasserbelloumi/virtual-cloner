package com.github.nukc.stateview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.collection.o00oOo00;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.nukc.stateview.StateView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.Metadata;
import o00oOooO.oooOO0;
import o0O000oo.o0O00oO0;
import o0O000oo.o0O0O0Oo;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OooO0;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0OOO0;
import o0OO0oO0.o00oOOo0;
import o0OO0oO0.o00oOoO;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 _2\u00020\u0001:\u0004_`abB\u0011\b\u0016\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YB\u001b\b\u0016\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\bX\u0010\\B#\b\u0016\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010[\u001a\u0004\u0018\u00010Z\u0012\u0006\u0010]\u001a\u00020\u0003¢\u0006\u0004\bX\u0010^J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0001J\u0006\u0010\u001c\u001a\u00020\u0001J\u0006\u0010\u001d\u001a\u00020\u0001R\"\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R.\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00101\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R.\u00104\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR.\u0010P\u001a\u0004\u0018\u00010O2\b\u0010*\u001a\u0004\u0018\u00010O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006c"}, d2 = {"Lcom/github/nukc/stateview/StateView;", "Landroid/view/View;", "view", "", "visibility", "Lo0OO0o/oO0Ooooo;", "setVisibility", "viewType", "showView", "hideViews", "startAnimation", "reset", "setView", "layoutResource", "inflate", "Landroid/view/ViewGroup;", "viewParent", "addToParent", "setupRetryClickListener", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "draw", "dispatchDraw", "showContent", "showEmpty", "showRetry", "showLoading", "emptyResource", "I", "getEmptyResource", "()I", "setEmptyResource", "(I)V", "retryResource", "getRetryResource", "setRetryResource", "loadingResource", "getLoadingResource", "setLoadingResource", "value", "emptyView", "Landroid/view/View;", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "retryView", "getRetryView", "setRetryView", "loadingView", "getLoadingView", "setLoadingView", "Landroidx/collection/o00oOo00;", "addSet", "Landroidx/collection/o00oOo00;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "setInflater", "(Landroid/view/LayoutInflater;)V", "Lcom/github/nukc/stateview/StateView$OnRetryClickListener;", "onRetryClickListener", "Lcom/github/nukc/stateview/StateView$OnRetryClickListener;", "getOnRetryClickListener", "()Lcom/github/nukc/stateview/StateView$OnRetryClickListener;", "setOnRetryClickListener", "(Lcom/github/nukc/stateview/StateView$OnRetryClickListener;)V", "Lcom/github/nukc/stateview/StateView$OnInflateListener;", "onInflateListener", "Lcom/github/nukc/stateview/StateView$OnInflateListener;", "getOnInflateListener", "()Lcom/github/nukc/stateview/StateView$OnInflateListener;", "setOnInflateListener", "(Lcom/github/nukc/stateview/StateView$OnInflateListener;)V", "Lcom/github/nukc/stateview/AnimatorProvider;", "animatorProvider", "Lcom/github/nukc/stateview/AnimatorProvider;", "getAnimatorProvider", "()Lcom/github/nukc/stateview/AnimatorProvider;", "setAnimatorProvider", "(Lcom/github/nukc/stateview/AnimatorProvider;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnInflateListener", "OnRetryClickListener", "ViewType", "kotlin_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class StateView extends View {
    public static final Companion Companion = new Companion(null);
    public static final int EMPTY = 0;
    public static final int LOADING = 2;
    public static final int RETRY = 1;
    @NotNull
    private static final String TAG;
    private HashMap _$_findViewCache;
    private final o00oOo00<Integer> addSet;
    @Nullable
    private AnimatorProvider animatorProvider;
    private int emptyResource;
    @Nullable
    private View emptyView;
    @Nullable
    private LayoutInflater inflater;
    private int loadingResource;
    @Nullable
    private View loadingView;
    @Nullable
    private OnInflateListener onInflateListener;
    @Nullable
    private OnRetryClickListener onRetryClickListener;
    private int retryResource;
    @Nullable
    private View retryView;

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/github/nukc/stateview/StateView$Companion;", "", "()V", "EMPTY", "", "LOADING", "RETRY", "TAG", "", "getTAG$kotlin_release", "()Ljava/lang/String;", "inject", "Lcom/github/nukc/stateview/StateView;", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "viewGroup", "Landroid/view/ViewGroup;", "wrap", "kotlin_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o0O00 o0o00) {
            this();
        }

        @NotNull
        public final String getTAG$kotlin_release() {
            return StateView.TAG;
        }

        @o00ooO0
        @NotNull
        public final StateView inject(@NotNull Activity activity) {
            o0ooO.o00oo0O(activity, "activity");
            Window window = activity.getWindow();
            o0ooO.o00oOoO(window, "activity.window");
            View findViewById = window.getDecorView().findViewById(16908290);
            o0ooO.o00oOoO(findViewById, "activity.window.decorVie…ew>(android.R.id.content)");
            return inject(findViewById);
        }

        @o00ooO0
        @NotNull
        public final StateView inject(@NotNull View view) {
            o0ooO.o00oo0O(view, "view");
            return view instanceof ViewGroup ? inject((ViewGroup) view) : wrap(view);
        }

        @o00ooO0
        @NotNull
        public final StateView inject(@NotNull ViewGroup viewGroup) {
            o0ooO.o00oo0O(viewGroup, "viewGroup");
            if ((viewGroup instanceof LinearLayout) || (viewGroup instanceof ScrollView) || (viewGroup instanceof AdapterView) || (((viewGroup instanceof o0OooO0) && (viewGroup instanceof o0O00oO0)) || ((viewGroup instanceof o0O0O0Oo) && (viewGroup instanceof o0O00oO0)))) {
                return viewGroup.getParent() instanceof ViewGroup ? wrap(viewGroup) : Injector.INSTANCE.wrapChild(viewGroup);
            }
            Context context = viewGroup.getContext();
            o0ooO.o00oOoO(context, "viewGroup.context");
            StateView stateView = new StateView(context);
            viewGroup.addView(stateView, -1, -1);
            return stateView;
        }

        @o00ooO0
        @NotNull
        public final StateView wrap(@NotNull View view) {
            o0ooO.o00oo0O(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                Injector injector = Injector.INSTANCE;
                if (injector.getConstraintLayoutAvailable() && (parent instanceof ConstraintLayout)) {
                    return injector.matchViewIfParentIsConstraintLayout((ConstraintLayout) parent, view);
                }
                if (parent instanceof RelativeLayout) {
                    return injector.matchViewIfParentIsRelativeLayout((RelativeLayout) parent, view);
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                viewGroup.addView(frameLayout, view.getLayoutParams());
                frameLayout.addView(view, -1, -1);
                Context context = view.getContext();
                o0ooO.o00oOoO(context, "view.context");
                StateView stateView = new StateView(context);
                frameLayout.addView(stateView, -1, -1);
                injector.setStateListAnimator(stateView, view);
                return stateView;
            }
            throw new ClassCastException("view.getParent() must be ViewGroup");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/github/nukc/stateview/StateView$OnInflateListener;", "", "", "viewType", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onInflate", "kotlin_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface OnInflateListener {
        void onInflate(int i, @Nullable View view);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/github/nukc/stateview/StateView$OnRetryClickListener;", "", "Lo0OO0o/oO0Ooooo;", "onRetryClick", "kotlin_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface OnRetryClickListener {
        void onRetryClick();
    }

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/github/nukc/stateview/StateView$ViewType;", "", "kotlin_release"}, k = 1, mv = {1, 1, 16})
    @o00oOoO(o00oOOo0.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ViewType {
    }

    static {
        o0ooO.o00oOoO("StateView", "StateView::class.java.simpleName");
        TAG = "StateView";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateView(@NotNull Context context) {
        this(context, null);
        o0ooO.o00oo0O(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o0ooO.o00oo0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O(context, "context");
        this.addSet = new o00oOo00<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StateView);
        this.emptyResource = obtainStyledAttributes.getResourceId(R.styleable.StateView_emptyResource, 0);
        this.retryResource = obtainStyledAttributes.getResourceId(R.styleable.StateView_retryResource, 0);
        this.loadingResource = obtainStyledAttributes.getResourceId(R.styleable.StateView_loadingResource, 0);
        obtainStyledAttributes.recycle();
        if (this.emptyResource == 0) {
            this.emptyResource = R.layout.base_empty;
        }
        if (this.retryResource == 0) {
            this.retryResource = R.layout.base_retry;
        }
        if (this.loadingResource == 0) {
            this.loadingResource = R.layout.base_loading;
        }
        setVisibility(8);
        setWillNotDraw(true);
    }

    private final View addToParent(int i, ViewGroup viewGroup, View view) {
        ViewGroup.LayoutParams layoutParams;
        this.addSet.remove(Integer.valueOf(i));
        int indexOfChild = viewGroup.indexOfChild(this);
        view.setClickable(true);
        view.setVisibility(8);
        o0O0o00O.o00ooO0.o00ooO00(view, o0O0o00O.o0ooO(this));
        if (getLayoutParams() != null) {
            if (viewGroup instanceof RelativeLayout) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if (layoutParams2 == null) {
                    throw new o0OOO0("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
                layoutParams = new RelativeLayout.LayoutParams((RelativeLayout.LayoutParams) layoutParams2);
            } else if (Injector.INSTANCE.getConstraintLayoutAvailable() && (viewGroup instanceof ConstraintLayout)) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 == null) {
                    throw new o0OOO0("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) layoutParams3;
                ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                if (layoutParams4 == null) {
                    throw new o0OOO0("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                ConstraintLayout.o00oOOoO o00ooooo3 = new ConstraintLayout.o00oOOoO(layoutParams4);
                o00ooooo3.f1804o00oOooO = o00ooooo2.f1804o00oOooO;
                o00ooooo3.f1800o00oOoO0 = o00ooooo2.f1800o00oOoO0;
                o00ooooo3.f1799o00oOoO = o00ooooo2.f1799o00oOoO;
                o00ooooo3.f1803o00oOoo0 = o00ooooo2.f1803o00oOoo0;
                viewGroup.addView(view, indexOfChild, o00ooooo3);
            } else {
                layoutParams = getLayoutParams();
            }
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (this.loadingView != null && this.retryView != null && this.emptyView != null) {
            viewGroup.removeViewInLayout(this);
        }
        OnInflateListener onInflateListener = this.onInflateListener;
        if (onInflateListener != null) {
            onInflateListener.onInflate(i, view);
        }
        return view;
    }

    private final void hideViews(View view) {
        View view2;
        View view3 = this.emptyView;
        if (view3 == view) {
            setVisibility(this.loadingView, 8);
        } else {
            View view4 = this.loadingView;
            setVisibility(view3, 8);
            if (view4 != view) {
                view2 = this.loadingView;
                setVisibility(view2, 8);
            }
        }
        view2 = this.retryView;
        setVisibility(view2, 8);
    }

    private final View inflate(@oooOO0 int i, int i2) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (i != 0) {
                LayoutInflater layoutInflater = this.inflater;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                    o0ooO.o00oOoO(layoutInflater, "LayoutInflater.from(context)");
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                View inflate = layoutInflater.inflate(i, viewGroup, false);
                o0ooO.o00oOoO(inflate, "view");
                return addToParent(i2, viewGroup, inflate);
            }
            throw new IllegalArgumentException("StateView must have a valid layoutResource");
        }
        throw new IllegalStateException("StateView must have a non-null ViewGroup viewParent");
    }

    @o00ooO0
    @NotNull
    public static final StateView inject(@NotNull Activity activity) {
        return Companion.inject(activity);
    }

    @o00ooO0
    @NotNull
    public static final StateView inject(@NotNull View view) {
        return Companion.inject(view);
    }

    @o00ooO0
    @NotNull
    public static final StateView inject(@NotNull ViewGroup viewGroup) {
        return Companion.inject(viewGroup);
    }

    private final void reset(View view) {
        if (view != null) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
            view.setRotation(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    private final void setView(int i, View view) {
        View view2;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(view) > -1) {
                return;
            }
            if (i == 0) {
                view2 = this.emptyView;
            } else if (i == 1) {
                view2 = this.retryView;
            } else if (i != 2) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Invalid viewType: ", i));
            } else {
                view2 = this.loadingView;
            }
            if (view2 != null) {
                viewGroup.removeViewInLayout(view2);
            }
            this.addSet.add(Integer.valueOf(i));
        }
    }

    private final void setVisibility(View view, int i) {
        if (view == null || i == view.getVisibility()) {
            return;
        }
        if (this.animatorProvider != null) {
            startAnimation(view);
        } else {
            view.setVisibility(i);
        }
    }

    private final void setupRetryClickListener() {
        View view = this.retryView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.github.nukc.stateview.StateView$setupRetryClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (StateView.this.getOnRetryClickListener() != null) {
                        StateView.this.showLoading();
                        View retryView = StateView.this.getRetryView();
                        if (retryView == null) {
                            o0ooO.o00ooo0O();
                        }
                        retryView.postDelayed(new Runnable() { // from class: com.github.nukc.stateview.StateView$setupRetryClickListener$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                StateView.OnRetryClickListener onRetryClickListener = StateView.this.getOnRetryClickListener();
                                if (onRetryClickListener != null) {
                                    onRetryClickListener.onRetryClick();
                                }
                            }
                        }, 400L);
                    }
                }
            });
        }
    }

    private final View showView(int i) {
        View view;
        if (i == 0) {
            view = this.emptyView;
        } else if (i == 1) {
            view = this.retryView;
        } else if (i != 2) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Invalid viewType: ", i));
        } else {
            view = this.loadingView;
        }
        if (view == null) {
            view = inflate(i != 0 ? i != 1 ? i != 2 ? -1 : this.loadingResource : this.retryResource : this.emptyResource, i);
            if (i == 0) {
                setEmptyView(view);
            } else if (i == 1) {
                setRetryView(view);
            } else if (i == 2) {
                setLoadingView(view);
            }
        } else if (this.addSet.contains(Integer.valueOf(i))) {
            ViewParent parent = getParent();
            if (parent == null) {
                throw new o0OOO0("null cannot be cast to non-null type android.view.ViewGroup");
            }
            addToParent(i, (ViewGroup) parent, view);
        }
        setVisibility(view, 0);
        hideViews(view);
        return view;
    }

    private final void startAnimation(final View view) {
        Animator hideAnimation;
        final boolean z = view.getVisibility() == 8;
        AnimatorProvider animatorProvider = this.animatorProvider;
        if (z) {
            if (animatorProvider == null) {
                o0ooO.o00ooo0O();
            }
            hideAnimation = animatorProvider.showAnimation(view);
        } else {
            if (animatorProvider == null) {
                o0ooO.o00ooo0O();
            }
            hideAnimation = animatorProvider.hideAnimation(view);
        }
        if (hideAnimation == null) {
            view.setVisibility(z ? 0 : 8);
            return;
        }
        hideAnimation.addListener(new AnimatorListenerAdapter() { // from class: com.github.nukc.stateview.StateView$startAnimation$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                o0ooO.o00oo0O(animator, "animation");
                super.onAnimationEnd(animator);
                if (z) {
                    return;
                }
                view.setVisibility(8);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                o0ooO.o00oo0O(animator, "animation");
                super.onAnimationStart(animator);
                if (z) {
                    view.setVisibility(0);
                }
            }
        });
        hideAnimation.start();
    }

    @o00ooO0
    @NotNull
    public static final StateView wrap(@NotNull View view) {
        return Companion.wrap(view);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // android.view.View
    public void dispatchDraw(@Nullable Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@Nullable Canvas canvas) {
    }

    @Nullable
    public final AnimatorProvider getAnimatorProvider() {
        return this.animatorProvider;
    }

    public final int getEmptyResource() {
        return this.emptyResource;
    }

    @Nullable
    public final View getEmptyView() {
        return this.emptyView;
    }

    @Nullable
    public final LayoutInflater getInflater() {
        return this.inflater;
    }

    public final int getLoadingResource() {
        return this.loadingResource;
    }

    @Nullable
    public final View getLoadingView() {
        return this.loadingView;
    }

    @Nullable
    public final OnInflateListener getOnInflateListener() {
        return this.onInflateListener;
    }

    @Nullable
    public final OnRetryClickListener getOnRetryClickListener() {
        return this.onRetryClickListener;
    }

    public final int getRetryResource() {
        return this.retryResource;
    }

    @Nullable
    public final View getRetryView() {
        return this.retryView;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setAnimatorProvider(@Nullable AnimatorProvider animatorProvider) {
        this.animatorProvider = animatorProvider;
        reset(this.emptyView);
        reset(this.loadingView);
        reset(this.retryView);
    }

    public final void setEmptyResource(int i) {
        this.emptyResource = i;
    }

    public final void setEmptyView(@Nullable View view) {
        setView(0, view);
        this.emptyView = view;
    }

    public final void setInflater(@Nullable LayoutInflater layoutInflater) {
        this.inflater = layoutInflater;
    }

    public final void setLoadingResource(int i) {
        this.loadingResource = i;
    }

    public final void setLoadingView(@Nullable View view) {
        setView(2, view);
        this.loadingView = view;
    }

    public final void setOnInflateListener(@Nullable OnInflateListener onInflateListener) {
        this.onInflateListener = onInflateListener;
    }

    public final void setOnRetryClickListener(@Nullable OnRetryClickListener onRetryClickListener) {
        this.onRetryClickListener = onRetryClickListener;
    }

    public final void setRetryResource(int i) {
        this.retryResource = i;
    }

    public final void setRetryView(@Nullable View view) {
        setView(1, view);
        this.retryView = view;
        setupRetryClickListener();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(this.emptyView, i);
        setVisibility(this.retryView, i);
        setVisibility(this.loadingView, i);
    }

    public final void showContent() {
        setVisibility(8);
    }

    @NotNull
    public final View showEmpty() {
        return showView(0);
    }

    @NotNull
    public final View showLoading() {
        return showView(2);
    }

    @NotNull
    public final View showRetry() {
        return showView(1);
    }
}
