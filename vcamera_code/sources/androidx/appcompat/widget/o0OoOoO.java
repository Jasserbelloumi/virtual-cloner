package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOOo0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.o0OOOO;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OoOoO extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final Interpolator f1408o00ooO = new DecelerateInterpolator();

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f1409o00ooO0o = "ScrollingTabContainerView";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f1410o00ooOO0 = 200;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f1411o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOo00 f1412o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Runnable f1413o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public LinearLayoutCompat f1414o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f1415o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Spinner f1416o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f1417o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public ViewPropertyAnimator f1418o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f1419o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final o00oOoO f1420o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f1421o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f1423o00oo0O0;

        public o00oOOo0(View view) {
            this.f1423o00oo0O0 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OoOoO.this.smoothScrollTo(this.f1423o00oo0O0.getLeft() - ((o0OoOoO.this.getWidth() - this.f1423o00oo0O0.getWidth()) / 2), 0);
            o0OoOoO.this.f1413o00oo0O0 = null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends BaseAdapter {
        public o00oOOoO() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return o0OoOoO.this.f1414o00oo0Oo.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((o00oOo0O) o0OoOoO.this.f1414o00oo0Oo.getChildAt(i)).o00oOOoO();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return o0OoOoO.this.o00oOoO0((o00oOOo0.o00oo00O) getItem(i), true);
            }
            ((o00oOo0O) view).o00oOOo0((o00oOOo0.o00oo00O) getItem(i));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements View.OnClickListener {
        public o00oOo00() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((o00oOo0O) view).o00oOOoO().o00oOoO0();
            int childCount = o0OoOoO.this.f1414o00oo0Oo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = o0OoOoO.this.f1414o00oo0Oo.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends LinearLayout {

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final String f1426o0O0o = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oOOo0.o00oo00O f1427o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int[] f1428o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public TextView f1429o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public View f1430o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public ImageView f1431o00oo0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o00oOo0O(android.content.Context r6, androidx.appcompat.app.o00oOOo0.o00oo00O r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.o0OoOoO.this = r5
                int r5 = androidx.appcompat.R.attr.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1428o00oo0O0 = r1
                r4.f1427o00oo0O = r7
                androidx.appcompat.widget.o0OOO0 r5 = androidx.appcompat.widget.o0OOO0.o00ooOo(r6, r0, r1, r5, r3)
                boolean r6 = r5.o00ooOO0(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.o00oOoO(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.o00ooOoo()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.o00oOo00()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0OoOoO.o00oOo0O.<init>(androidx.appcompat.widget.o0OoOoO, android.content.Context, androidx.appcompat.app.o00oOOo0$o00oo00O, boolean):void");
        }

        public void o00oOOo0(o00oOOo0.o00oo00O o00oo00o) {
            this.f1427o00oo0O = o00oo00o;
            o00oOo00();
        }

        public o00oOOo0.o00oo00O o00oOOoO() {
            return this.f1427o00oo0O;
        }

        public void o00oOo00() {
            o00oOOo0.o00oo00O o00oo00o = this.f1427o00oo0O;
            View o00oOOoO2 = o00oo00o.o00oOOoO();
            if (o00oOOoO2 != null) {
                ViewParent parent = o00oOOoO2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(o00oOOoO2);
                    }
                    addView(o00oOOoO2);
                }
                this.f1430o00oo0o = o00oOOoO2;
                TextView textView = this.f1429o00oo0Oo;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1431o00oo0o0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1431o00oo0o0.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1430o00oo0o;
            if (view != null) {
                removeView(view);
                this.f1430o00oo0o = null;
            }
            Drawable o00oOo002 = o00oo00o.o00oOo00();
            CharSequence o00oOo0o2 = o00oo00o.o00oOo0o();
            if (o00oOo002 != null) {
                if (this.f1431o00oo0o0 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1431o00oo0o0 = appCompatImageView;
                }
                this.f1431o00oo0o0.setImageDrawable(o00oOo002);
                this.f1431o00oo0o0.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1431o00oo0o0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1431o00oo0o0.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(o00oOo0o2);
            if (z) {
                if (this.f1429o00oo0Oo == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1429o00oo0Oo = appCompatTextView;
                }
                this.f1429o00oo0Oo.setText(o00oOo0o2);
                this.f1429o00oo0Oo.setVisibility(0);
            } else {
                TextView textView2 = this.f1429o00oo0Oo;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1429o00oo0Oo.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1431o00oo0o0;
            if (imageView3 != null) {
                imageView3.setContentDescription(o00oo00o.o00oOOo0());
            }
            o0OOOO.o00oOOo0.o00oOOo0(this, z ? null : o00oo00o.o00oOOo0());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f1426o0O0o);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f1426o0O0o);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (o0OoOoO.this.f1417o00oo0oO > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = o0OoOoO.this.f1417o00oo0oO;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f1433o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f1434o00oOOoO;

        public o00oOoO() {
        }

        public o00oOoO o00oOOo0(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f1434o00oOOoO = i;
            o0OoOoO.this.f1418o00ooO0 = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1433o00oOOo0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1433o00oOOo0) {
                return;
            }
            o0OoOoO o0ooooo = o0OoOoO.this;
            o0ooooo.f1418o00ooO0 = null;
            o0ooooo.setVisibility(this.f1434o00oOOoO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0OoOoO.this.setVisibility(0);
            this.f1433o00oOOo0 = false;
        }
    }

    public o0OoOoO(@o00oOooO.oo0oO0 Context context) {
        super(context);
        this.f1420o00ooO0O = new o00oOoO();
        setHorizontalScrollBarEnabled(false);
        o00oOoOo.o00oo00O o00oo00o = new o00oOoOo.o00oo00O(context);
        setContentHeight(o00oo00o.o00oOo0o());
        this.f1421o0O0o = o00oo00o.o00oOo0O();
        LinearLayoutCompat o00oOo0o2 = o00oOo0o();
        this.f1414o00oo0Oo = o00oOo0o2;
        addView(o00oOo0o2, new ViewGroup.LayoutParams(-2, -1));
    }

    public void o00oOOo0(o00oOOo0.o00oo00O o00oo00o, int i, boolean z) {
        o00oOo0O o00oOoO02 = o00oOoO0(o00oo00o, false);
        this.f1414o00oo0Oo.addView(o00oOoO02, i, new LinearLayoutCompat.o00oOOoO(0, -1, 1.0f));
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner != null) {
            ((o00oOOoO) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            o00oOoO02.setSelected(true);
        }
        if (this.f1415o00oo0o) {
            requestLayout();
        }
    }

    public void o00oOOoO(o00oOOo0.o00oo00O o00oo00o, boolean z) {
        o00oOo0O o00oOoO02 = o00oOoO0(o00oo00o, false);
        this.f1414o00oo0Oo.addView(o00oOoO02, new LinearLayoutCompat.o00oOOoO(0, -1, 1.0f));
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner != null) {
            ((o00oOOoO) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            o00oOoO02.setSelected(true);
        }
        if (this.f1415o00oo0o) {
            requestLayout();
        }
    }

    public void o00oOo00(int i) {
        View childAt = this.f1414o00oo0Oo.getChildAt(i);
        Runnable runnable = this.f1413o00oo0O0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        o00oOOo0 o00oooo02 = new o00oOOo0(childAt);
        this.f1413o00oo0O0 = o00oooo02;
        post(o00oooo02);
    }

    public final Spinner o00oOo0O() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.o00oOOoO(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat o00oOo0o() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.o00oOOoO(-2, -1));
        return linearLayoutCompat;
    }

    public final boolean o00oOoO() {
        Spinner spinner = this.f1416o00oo0o0;
        return spinner != null && spinner.getParent() == this;
    }

    public o00oOo0O o00oOoO0(o00oOOo0.o00oo00O o00oo00o, boolean z) {
        o00oOo0O o00ooo0o2 = new o00oOo0O(getContext(), o00oo00o, z);
        if (z) {
            o00ooo0o2.setBackgroundDrawable(null);
            o00ooo0o2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1411o00oo));
        } else {
            o00ooo0o2.setFocusable(true);
            if (this.f1412o00oo0O == null) {
                this.f1412o00oo0O = new o00oOo00();
            }
            o00ooo0o2.setOnClickListener(this.f1412o00oo0O);
        }
        return o00ooo0o2;
    }

    public final void o00oOoOO() {
        if (o00oOoO()) {
            return;
        }
        if (this.f1416o00oo0o0 == null) {
            this.f1416o00oo0o0 = o00oOo0O();
        }
        removeView(this.f1414o00oo0Oo);
        addView(this.f1416o00oo0o0, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1416o00oo0o0.getAdapter() == null) {
            this.f1416o00oo0o0.setAdapter((SpinnerAdapter) new o00oOOoO());
        }
        Runnable runnable = this.f1413o00oo0O0;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1413o00oo0O0 = null;
        }
        this.f1416o00oo0o0.setSelection(this.f1419o00ooO00);
    }

    public final boolean o00oOoOo() {
        if (o00oOoO()) {
            removeView(this.f1416o00oo0o0);
            addView(this.f1414o00oo0Oo, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1416o00oo0o0.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void o00oOoo0() {
        this.f1414o00oo0Oo.removeAllViews();
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner != null) {
            ((o00oOOoO) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1415o00oo0o) {
            requestLayout();
        }
    }

    public void o00oOooO(int i) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator viewPropertyAnimator = this.f1418o00ooO0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            alpha = animate().alpha(1.0f);
        } else {
            alpha = animate().alpha(0.0f);
        }
        alpha.setDuration(200L);
        alpha.setInterpolator(f1408o00ooO);
        alpha.setListener(this.f1420o00ooO0O.o00oOOo0(alpha, i));
        alpha.start();
    }

    public void o00oOooo(int i) {
        this.f1414o00oo0Oo.removeViewAt(i);
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner != null) {
            ((o00oOOoO) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1415o00oo0o) {
            requestLayout();
        }
    }

    public void o00oo00O(int i) {
        ((o00oOo0O) this.f1414o00oo0Oo.getChildAt(i)).o00oOo00();
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner != null) {
            ((o00oOOoO) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1415o00oo0o) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1413o00oo0O0;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o00oOoOo.o00oo00O o00oo00o = new o00oOoOo.o00oo00O(getContext());
        setContentHeight(o00oo00o.o00oOo0o());
        this.f1421o0O0o = o00oo00o.o00oOo0O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1413o00oo0O0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((o00oOo0O) view).o00oOOoO().o00oOoO0();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1414o00oo0Oo.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1417o00oo0oO = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1417o00oo0oO = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1417o00oo0oO, this.f1421o0O0o);
        }
        this.f1417o00oo0oO = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1411o00oo, 1073741824);
        if (z2 || !this.f1415o00oo0o) {
            z = false;
        }
        if (z) {
            this.f1414o00oo0Oo.measure(0, makeMeasureSpec);
            if (this.f1414o00oo0Oo.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                o00oOoOO();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1419o00ooO00);
                return;
            }
        }
        o00oOoOo();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1415o00oo0o = z;
    }

    public void setContentHeight(int i) {
        this.f1411o00oo = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1419o00ooO00 = i;
        int childCount = this.f1414o00oo0Oo.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1414o00oo0Oo.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                o00oOo00(i);
            }
            i2++;
        }
        Spinner spinner = this.f1416o00oo0o0;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
