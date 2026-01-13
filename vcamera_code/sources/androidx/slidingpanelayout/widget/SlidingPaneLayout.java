package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.o00oOOo0;
import androidx.transition.o0OoOoOo;
import androidx.window.layout.o00oo;
import androidx.window.layout.o0O000O;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00oooOo.oOO00o;
import o0O00.o00oo0O;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
import o0O00O.o00oOo0O;
import o0O00O0.o00oOOoO;
/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements o0O00O.o00oOo00 {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f4880o0 = 1;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f4881o00oooo = 400;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f4882o00oooo0 = "SlidingPaneLayout";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f4883o00ooooO = "androidx.slidingpanelayout.widget.SlidingPaneLayout";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f4884o00ooooo = 0;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f4885o0O00000 = 2;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f4886o0O0000O = 3;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static boolean f4887o0O0000o;

    /* renamed from: o00oo  reason: collision with root package name */
    public float f4888o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f4889o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f4890o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Drawable f4891o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f4892o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Drawable f4893o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public View f4894o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public float f4895o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f4896o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f4897o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f4898o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f4899o00ooO0o;
    @o0OO00OO

    /* renamed from: o00ooOO  reason: collision with root package name */
    public o00oo00O f4900o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final List<o00oo00O> f4901o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final o0O00O.o00oOo0O f4902o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f4903o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f4904o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final Rect f4905o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final ArrayList<o00oOo00> f4906o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public o00oo f4907o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f4908o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public o00oOOo0.InterfaceC0051o00oOOo0 f4909o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public androidx.slidingpanelayout.widget.o00oOOo0 f4910o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public Method f4911o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public Field f4912o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f4913o00oooOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public float f4914o0O0o;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f4915o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f4916o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: o00oOOoO */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOo00 */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4916o00oo0O0 = parcel.readInt() != 0;
            this.f4915o00oo0O = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4916o00oo0O0 ? 1 : 0);
            parcel.writeInt(this.f4915o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOOo0.InterfaceC0051o00oOOo0 {
        public o00oOOo0() {
        }

        @Override // androidx.slidingpanelayout.widget.o00oOOo0.InterfaceC0051o00oOOo0
        public void o00oOOo0(@oo0oO0 o00oo o00ooVar) {
            SlidingPaneLayout.this.f4907o00ooo0 = o00ooVar;
            androidx.transition.o00oOo00 o00ooo002 = new androidx.transition.o00oOo00();
            o00ooo002.setDuration(300L);
            o00ooo002.setInterpolator(o00oOOoO.o00oOOo0.o00oOOoO(0.2f, 0.0f, 0.0f, 1.0f));
            o0OoOoOo.o00oOOoO(SlidingPaneLayout.this, o00ooo002);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O000oo.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Rect f4918o00oOOo0 = new Rect();

        public o00oOOoO() {
        }

        public final void o00oOOo0(o00oo0O o00oo0o2, o00oo0O o00oo0o3) {
            Rect rect = this.f4918o00oOOo0;
            o00oo0o3.o00oo0o(rect);
            o00oo0o2.o0O0OoO0(rect);
            o00oo0o2.o0OO0OoO(o00oo0o3.o0O0O0oo());
            o00oo0o2.oo0oOOo(o00oo0o3.o00oooOO());
            o00oo0o2.o0O0Ooo0(o00oo0o3.o00oo());
            o00oo0o2.o0O0o00(o00oo0o3.o00ooO0o());
            o00oo0o2.o0O0o0Oo(o00oo0o3.o0O00OoO());
            o00oo0o2.o0O0Ooo(o00oo0o3.o0O00O());
            o00oo0o2.o0O0o0o(o00oo0o3.o0O00Ooo());
            o00oo0o2.o0oOo0O0(o00oo0o3.o0O00o00());
            o00oo0o2.o0O0Oo0O(o00oo0o3.o0O00O0());
            o00oo0o2.o0O0ooo(o00oo0o3.o0O0O0Oo());
            o00oo0o2.o0O0oOO(o00oo0o3.o0O00o());
            o00oo0o2.o00oOOo0(o00oo0o3.o00oo0O0());
            o00oo0o2.o0O0oOOO(o00oo0o3.o00ooo0o());
        }

        public boolean o00oOOoO(View view) {
            return SlidingPaneLayout.this.o00oo00O(view);
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.f4883o00ooooO);
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o00oo0O o00oo0o2) {
            o00oo0O o0O0OO2 = o00oo0O.o0O0OO(o00oo0o2);
            super.onInitializeAccessibilityNodeInfo(view, o0O0OO2);
            o00oOOo0(o00oo0o2, o0O0OO2);
            o0O0OO2.o0O0OOOo();
            o00oo0o2.o0O0Ooo0(SlidingPaneLayout.f4883o00ooooO);
            o00oo0o2.o0O0oooo(view);
            ViewParent o0O00O2 = o0O0o00O.o0O00O(view);
            if (o0O00O2 instanceof View) {
                o00oo0o2.o0O0oOoO((View) o0O00O2);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!o00oOOoO(childAt) && childAt.getVisibility() == 0) {
                    o0O0o00O.o00oo0OO.o00oo0o0(childAt, 1);
                    o00oo0o2.o00oOo00(childAt);
                }
            }
        }

        @Override // o0O000oo.o00oOOoO
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (o00oOOoO(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final View f4921o00oo0O0;

        public o00oOo00(View view) {
            this.f4921o00oo0O0 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4921o00oo0O0.getParent() == SlidingPaneLayout.this) {
                this.f4921o00oo0O0.setLayerType(0, null);
                SlidingPaneLayout.this.o00oOooo(this.f4921o00oo0O0);
            }
            SlidingPaneLayout.this.f4906o00ooOoo.remove(this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oOo0O.o00oOo00 {
        public o00oOo0O() {
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            o00oOoO o00oooo2 = (o00oOoO) SlidingPaneLayout.this.f4894o00oo0oO.getLayoutParams();
            if (!SlidingPaneLayout.this.o00oo0()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin;
                return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f4897o00ooO00 + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f4894o00oo0oO.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin));
            return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f4897o00ooO00);
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f4897o00ooO00;
        }

        public final boolean o00oOOo0() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f4896o00ooO0 || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onEdgeDragStarted(int i, int i2) {
            if (o00oOOo0()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f4902o00ooOOo.o00oOooO(slidingPaneLayout.f4894o00oo0oO, i2);
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onEdgeTouched(int i, int i2) {
            if (o00oOOo0()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f4902o00ooOOo.o00oOooO(slidingPaneLayout.f4894o00oo0oO, i2);
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.o0O0o();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewDragStateChanged(int i) {
            SlidingPaneLayout slidingPaneLayout;
            boolean z;
            if (SlidingPaneLayout.this.f4902o00ooOOo.o00ooOo0() == 0) {
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                if (slidingPaneLayout2.f4914o0O0o == 1.0f) {
                    slidingPaneLayout2.o00ooO0o(slidingPaneLayout2.f4894o00oo0oO);
                    SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                    slidingPaneLayout3.o00oOo0o(slidingPaneLayout3.f4894o00oo0oO);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = false;
                } else {
                    slidingPaneLayout2.o00oOoO0(slidingPaneLayout2.f4894o00oo0oO);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = true;
                }
                slidingPaneLayout.f4904o00ooOo0 = z;
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.o00oo0O(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
            if (SlidingPaneLayout.this.o00oo0()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f4914o0O0o > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f4897o00ooO00;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f4894o00oo0oO.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i > 0 || (i == 0 && SlidingPaneLayout.this.f4914o0O0o > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f4897o00ooO00;
                }
            }
            SlidingPaneLayout.this.f4902o00ooOOo.o0O00000(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public boolean tryCaptureView(View view, int i) {
            if (o00oOOo0()) {
                return ((o00oOoO) view.getLayoutParams()).f4925o00oOOoO;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends ViewGroup.MarginLayoutParams {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int[] f4923o00oOo0O = {16843137};

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public float f4924o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f4925o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4926o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Paint f4927o00oOooO;

        public o00oOoO() {
            super(-1, -1);
            this.f4924o00oOOo0 = 0.0f;
        }

        public o00oOoO(int i, int i2) {
            super(i, i2);
            this.f4924o00oOOo0 = 0.0f;
        }

        public o00oOoO(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4924o00oOOo0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4923o00oOo0O);
            this.f4924o00oOOo0 = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public o00oOoO(@oo0oO0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4924o00oOOo0 = 0.0f;
        }

        public o00oOoO(@oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4924o00oOOo0 = 0.0f;
        }

        public o00oOoO(@oo0oO0 o00oOoO o00oooo2) {
            super((ViewGroup.MarginLayoutParams) o00oooo2);
            this.f4924o00oOOo0 = 0.0f;
            this.f4924o00oOOo0 = o00oooo2.f4924o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 implements o00oo00O {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOOo0(@oo0oO0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOOoO(@oo0oO0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOo00(@oo0oO0 View view, float f) {
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        void o00oOOo0(@oo0oO0 View view);

        void o00oOOoO(@oo0oO0 View view);

        void o00oOo00(@oo0oO0 View view, float f);
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends FrameLayout {
        public o00oo0OO(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f4887o0O0000o = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@oo0oO0 Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4890o00oo0O0 = 0;
        this.f4914o0O0o = 1.0f;
        this.f4901o00ooOO0 = new CopyOnWriteArrayList();
        this.f4903o00ooOo = true;
        this.f4905o00ooOoO = new Rect();
        this.f4906o00ooOoo = new ArrayList<>();
        this.f4909o00ooo0O = new o00oOOo0();
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        o0O0o00O.o0O0oOo(this, new o00oOOoO());
        o0O0o00O.o00oo0OO.o00oo0o0(this, 1);
        o0O00O.o00oOo0O o00oo0O02 = o0O00O.o00oOo0O.o00oo0O0(this, 0.5f, new o00oOo0O());
        this.f4902o00ooOOo = o00oo0O02;
        o00oo0O02.o0(f * 400.0f);
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.o00oOOo0(o0O000O.o00oOOoO(context), o0.getMainExecutor(context)));
    }

    private oOO00o getSystemGestureInsets() {
        o0OOo000 o0O00Oo2;
        if (!f4887o0O0000o || (o0O00Oo2 = o0O0o00O.o0O00Oo(this)) == null) {
            return null;
        }
        return o0O00Oo2.o00oo0();
    }

    @o0OO00OO
    public static Activity o00oOoOO(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Rect o00oOoOo(@oo0oO0 o00oo o00ooVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, view.getWidth() + iArr[1]);
        Rect rect2 = new Rect(o00ooVar.getBounds());
        boolean intersect = rect2.intersect(rect);
        if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
            rect2.offset(-iArr[0], -iArr[1]);
            return rect2;
        }
        return null;
    }

    public static int o00oOoo0(View view) {
        return view instanceof o00oo0OO ? o0O0o00O.o0ooOoOO(((o00oo0OO) view).getChildAt(0)) : o0O0o00O.o0ooOoOO(view);
    }

    public static int o00oo0O0(@oo0oO0 View view, int i, int i2) {
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) o00oooo2).width == 0 && (o00oooo2.f4924o00oOOo0 > 0.0f ? 1 : (o00oooo2.f4924o00oOOo0 == 0.0f ? 0 : -1)) > 0 ? ViewGroup.getChildMeasureSpec(i, i2, ((ViewGroup.MarginLayoutParams) o00oooo2).height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    public static boolean o00ooO(View view) {
        return view.isOpaque();
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.o00oOOo0 o00oooo02) {
        this.f4910o00ooo0o = o00oooo02;
        o00oooo02.o00oOo0o(this.f4909o00ooo0O);
    }

    @Override // android.view.ViewGroup
    public void addView(@oo0oO0 View view, int i, @o0OO00OO ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new o00oo0OO(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o00oOoO) && super.checkLayoutParams(layoutParams);
    }

    @Override // o0O00O.o00oOo00
    public void close() {
        o00oOooO();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f4902o00ooOOo.o00oo0OO(true)) {
            if (this.f4892o00oo0o) {
                o0O0o00O.o0O0o0oO(this);
            } else {
                this.f4902o00ooOOo.o00oOOo0();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = o00oo0() ? this.f4893o00oo0o0 : this.f4891o00oo0Oo;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (o00oo0()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        o0O00O.o00oOo0O o00ooo0o2;
        int o00ooO0o2;
        int i;
        if (o00oo0() ^ isOpen()) {
            this.f4902o00ooOOo.o00ooooo(1);
            oOO00o systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                o00ooo0o2 = this.f4902o00ooOOo;
                o00ooO0o2 = o00ooo0o2.o00ooO0o();
                i = systemGestureInsets.f9791o00oOOo0;
                o00ooo0o2.o00ooooO(Math.max(o00ooO0o2, i));
            }
        } else {
            this.f4902o00ooOOo.o00ooooo(2);
            oOO00o systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                o00ooo0o2 = this.f4902o00ooOOo;
                o00ooO0o2 = o00ooo0o2.o00ooO0o();
                i = systemGestureInsets2.f9793o00oOo00;
                o00ooo0o2.o00ooooO(Math.max(o00ooO0o2, i));
            }
        }
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        int save = canvas.save();
        if (this.f4892o00oo0o && !o00oooo2.f4925o00oOOoO && this.f4894o00oo0oO != null) {
            canvas.getClipBounds(this.f4905o00ooOoO);
            if (o00oo0()) {
                Rect rect = this.f4905o00ooOoO;
                rect.left = Math.max(rect.left, this.f4894o00oo0oO.getRight());
            } else {
                Rect rect2 = this.f4905o00ooOoO;
                rect2.right = Math.min(rect2.right, this.f4894o00oo0oO.getLeft());
            }
            canvas.clipRect(this.f4905o00ooOoO);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o00oOoO();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOoO(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oOoO((ViewGroup.MarginLayoutParams) layoutParams) : new o00oOoO(layoutParams);
    }

    @o0O00O
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f4889o00oo0O;
    }

    public final int getLockMode() {
        return this.f4908o00ooo00;
    }

    @o0OO0
    public int getParallaxDistance() {
        return this.f4898o00ooO0O;
    }

    @o0O00O
    @Deprecated
    public int getSliderFadeColor() {
        return this.f4890o00oo0O0;
    }

    @Override // o0O00O.o00oOo00
    public boolean isOpen() {
        return !this.f4892o00oo0o || this.f4914o0O0o == 0.0f;
    }

    public void o00oOOo0(@oo0oO0 o00oo00O o00oo00o) {
        this.f4901o00ooOO0.add(o00oo00o);
    }

    public boolean o00oOOoO(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && o00oOOoO(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(o00oo0() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean o00oOo00() {
        return this.f4892o00oo0o;
    }

    public final boolean o00oOo0O(int i) {
        if (!this.f4892o00oo0o) {
            this.f4904o00ooOo0 = false;
        }
        if (this.f4903o00ooOo || o00ooO0(1.0f, i)) {
            this.f4904o00ooOo0 = false;
            return true;
        }
        return false;
    }

    public void o00oOo0o(@oo0oO0 View view) {
        for (o00oo00O o00oo00o : this.f4901o00ooOO0) {
            o00oo00o.o00oOOoO(view);
        }
        sendAccessibilityEvent(32);
    }

    public void o00oOoO(@oo0oO0 View view) {
        for (o00oo00O o00oo00o : this.f4901o00ooOO0) {
            o00oo00o.o00oOo00(view, this.f4914o0O0o);
        }
    }

    public void o00oOoO0(@oo0oO0 View view) {
        for (o00oo00O o00oo00o : this.f4901o00ooOO0) {
            o00oo00o.o00oOOo0(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean o00oOooO() {
        return o00oOo0O(0);
    }

    public void o00oOooo(View view) {
        o0O0o00O.o0OoOoO(view, ((o00oOoO) view.getLayoutParams()).f4927o00oOooO);
    }

    @Deprecated
    public void o00oo() {
        o00oOooO();
    }

    public boolean o00oo0() {
        return o0O0o00O.o0O000O(this) == 1;
    }

    public boolean o00oo00O(View view) {
        if (view == null) {
            return false;
        }
        return this.f4892o00oo0o && ((o00oOoO) view.getLayoutParams()).f4926o00oOo00 && this.f4914o0O0o > 0.0f;
    }

    public void o00oo0O(int i) {
        if (this.f4894o00oo0oO == null) {
            this.f4914o0O0o = 0.0f;
            return;
        }
        boolean o00oo02 = o00oo0();
        o00oOoO o00oooo2 = (o00oOoO) this.f4894o00oo0oO.getLayoutParams();
        int width = this.f4894o00oo0oO.getWidth();
        if (o00oo02) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((o00oo02 ? getPaddingRight() : getPaddingLeft()) + (o00oo02 ? ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin : ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin))) / this.f4897o00ooO00;
        this.f4914o0O0o = paddingRight;
        if (this.f4898o00ooO0O != 0) {
            o00oo0o(paddingRight);
        }
        o00oOoO(this.f4894o00oo0oO);
    }

    public boolean o00oo0OO() {
        return this.f4892o00oo0o;
    }

    public boolean o00oo0Oo() {
        return o00oo0o0(0);
    }

    public final void o00oo0o(float f) {
        boolean o00oo02 = o00oo0();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f4894o00oo0oO) {
                int i2 = this.f4898o00ooO0O;
                this.f4888o00oo = f;
                int i3 = ((int) ((1.0f - this.f4888o00oo) * i2)) - ((int) ((1.0f - f) * i2));
                if (o00oo02) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final boolean o00oo0o0(int i) {
        if (!this.f4892o00oo0o) {
            this.f4904o00ooOo0 = true;
        }
        if (this.f4903o00ooOo || o00ooO0(0.0f, i)) {
            this.f4904o00ooOo0 = true;
            return true;
        }
        return false;
    }

    public void o00oo0oO(@oo0oO0 o00oo00O o00oo00o) {
        this.f4901o00ooOO0.remove(o00oo00o);
    }

    public boolean o00ooO0(float f, int i) {
        int paddingLeft;
        if (this.f4892o00oo0o) {
            boolean o00oo02 = o00oo0();
            o00oOoO o00oooo2 = (o00oOoO) this.f4894o00oo0oO.getLayoutParams();
            if (o00oo02) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin;
                int width = this.f4894o00oo0oO.getWidth();
                paddingLeft = (int) (getWidth() - (((f * this.f4897o00ooO00) + paddingRight) + width));
            } else {
                paddingLeft = (int) ((f * this.f4897o00ooO00) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin);
            }
            o0O00O.o00oOo0O o00ooo0o2 = this.f4902o00ooOOo;
            View view = this.f4894o00oo0oO;
            if (o00ooo0o2.o0O0000o(view, paddingLeft, view.getTop())) {
                o0O0o();
                o0O0o00O.o0O0o0oO(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    public void o00ooO00() {
        o00oo0Oo();
    }

    public final ArrayList<Rect> o00ooO0O() {
        Rect o00oOoOo2;
        o00oo o00ooVar = this.f4907o00ooo0;
        if (o00ooVar == null || !o00ooVar.o00oOOo0() || this.f4907o00ooo0.getBounds().left == 0 || this.f4907o00ooo0.getBounds().top != 0 || (o00oOoOo2 = o00oOoOo(this.f4907o00ooo0, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), o00oOoOo2.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, o00oOoOo2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    public void o00ooO0o(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean o00oo02 = o00oo0();
        int width = o00oo02 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = o00oo02 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !o00ooO(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = o00oo02;
            } else {
                z = o00oo02;
                childAt.setVisibility((Math.max(o00oo02 ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(o00oo02 ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            o00oo02 = z;
        }
    }

    public void o0O0o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity o00oOoOO2;
        super.onAttachedToWindow();
        this.f4903o00ooOo = true;
        if (this.f4910o00ooo0o == null || (o00oOoOO2 = o00oOoOO(getContext())) == null) {
            return;
        }
        this.f4910o00ooo0o.o00oOo0O(o00oOoOO2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4903o00ooOo = true;
        androidx.slidingpanelayout.widget.o00oOOo0 o00oooo02 = this.f4910o00ooo0o;
        if (o00oooo02 != null) {
            o00oooo02.o00oOoO0();
        }
        int size = this.f4906o00ooOoo.size();
        for (int i = 0; i < size; i++) {
            this.f4906o00ooOoo.get(i).run();
        }
        this.f4906o00ooOoo.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f4892o00oo0o && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f4904o00ooOo0 = this.f4902o00ooOOo.o00ooo0O(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f4892o00oo0o || (this.f4896o00ooO0 && actionMasked != 0)) {
            this.f4902o00ooOOo.o00oOo00();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f4902o00ooOOo.o00oOo00();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f4896o00ooO0 = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4899o00ooO0o = x;
                this.f4895o00ooO = y;
                if (this.f4902o00ooOOo.o00ooo0O(this.f4894o00oo0oO, (int) x, (int) y) && o00oo00O(this.f4894o00oo0oO)) {
                    z = true;
                    return this.f4902o00ooOOo.o0O0000O(motionEvent) || z;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f4899o00ooO0o);
                float abs2 = Math.abs(y2 - this.f4895o00ooO);
                if (abs > this.f4902o00ooOOo.o00ooOOo() && abs2 > abs) {
                    this.f4902o00ooOOo.o00oOo00();
                    this.f4896o00ooO0 = true;
                    return false;
                }
            }
            z = false;
            if (this.f4902o00ooOOo.o0O0000O(motionEvent)) {
                return true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean o00oo02 = o00oo0();
        int i10 = i3 - i;
        int paddingRight = o00oo02 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = o00oo02 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4903o00ooOo) {
            this.f4914o0O0o = (this.f4892o00oo0o && this.f4904o00ooOo0) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i5 = i11;
            } else {
                o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (o00oooo2.f4925o00oOOoO) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin);
                    this.f4897o00ooO00 = min;
                    int i14 = o00oo02 ? ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin : ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin;
                    o00oooo2.f4926o00oOo00 = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    int i15 = (int) (min * this.f4914o0O0o);
                    i5 = i14 + i15 + i11;
                    this.f4914o0O0o = i15 / min;
                    i6 = 0;
                } else if (!this.f4892o00oo0o || (i7 = this.f4898o00ooO0O) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f4914o0O0o) * i7);
                    i5 = paddingRight;
                }
                if (o00oo02) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                o00oo o00ooVar = this.f4907o00ooo0;
                paddingRight = Math.abs((o00ooVar != null && o00ooVar.o00oOOoO() == o00oo.o00oOOoO.f5486o00oOo00 && this.f4907o00ooo0.o00oOOo0()) ? this.f4907o00ooo0.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
            }
            i12++;
            i11 = i5;
        }
        if (this.f4903o00ooOo) {
            if (this.f4892o00oo0o && this.f4898o00ooO0O != 0) {
                o00oo0o(this.f4914o0O0o);
            }
            o00ooO0o(this.f4894o00oo0oO);
        }
        this.f4903o00ooOo = false;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i3 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f4894o00oo0oO = null;
        int i7 = 0;
        boolean z = false;
        int i8 = max;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
            int i9 = size;
            if (childAt.getVisibility() == 8) {
                o00oooo2.f4926o00oOo00 = r8;
            } else {
                float f2 = o00oooo2.f4924o00oOOo0;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) o00oooo2).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin), (int) r8);
                int i10 = ((ViewGroup.MarginLayoutParams) o00oooo2).width;
                childAt.measure(i10 == -2 ? View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE) : i10 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) o00oooo2).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i3 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i3 = measuredHeight;
                    }
                }
                i8 -= measuredWidth;
                if (i7 != 0) {
                    boolean z2 = i8 < 0;
                    o00oooo2.f4925o00oOOoO = z2;
                    z |= z2;
                    if (z2) {
                        this.f4894o00oo0oO = childAt;
                    }
                }
            }
            i7++;
            size = i9;
            r8 = 0;
        }
        int i11 = size;
        int i12 = i8;
        if (z || f > 0.0f) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i4) {
                    o00oOoO o00oooo3 = (o00oOoO) childAt2.getLayoutParams();
                    int measuredWidth2 = ((ViewGroup.MarginLayoutParams) o00oooo3).width == 0 && (o00oooo3.f4924o00oOOo0 > 0.0f ? 1 : (o00oooo3.f4924o00oOOo0 == 0.0f ? 0 : -1)) > 0 ? 0 : childAt2.getMeasuredWidth();
                    if (z) {
                        i5 = max - (((ViewGroup.MarginLayoutParams) o00oooo3).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo3).rightMargin);
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (o00oooo3.f4924o00oOOo0 > 0.0f) {
                        i5 = measuredWidth2 + ((int) ((o00oooo3.f4924o00oOOo0 * Math.max(0, i12)) / f));
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        i5 = measuredWidth2;
                        i6 = 0;
                    }
                    int o00oo0O02 = o00oo0O0(childAt2, i2, getPaddingBottom() + getPaddingTop());
                    if (measuredWidth2 != i5) {
                        childAt2.measure(i6, o00oo0O02);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i3) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i3 = measuredHeight2;
                        }
                    }
                }
                i13++;
                i4 = 8;
            }
        }
        ArrayList<Rect> o00ooO0O2 = o00ooO0O();
        if (o00ooO0O2 != null && !z) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = o00ooO0O2.get(i14);
                    o00oOoO o00oooo4 = (o00oOoO) childAt3.getLayoutParams();
                    int i15 = ((ViewGroup.MarginLayoutParams) o00oooo4).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo4).rightMargin;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (o00oOoo0(childAt3) != 0 && rect.width() < o00oOoo0(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i15, 1073741824), makeMeasureSpec);
                        if (i14 != 0) {
                            o00oooo4.f4925o00oOOoO = true;
                            this.f4894o00oo0oO = childAt3;
                            z = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec);
                    }
                }
            }
        }
        setMeasuredDimension(i11, getPaddingBottom() + getPaddingTop() + i3);
        this.f4892o00oo0o = z;
        if (this.f4902o00ooOOo.o00ooOo0() == 0 || z) {
            return;
        }
        this.f4902o00ooOOo.o00oOOo0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f4916o00oo0O0) {
            o00oo0Oo();
        } else {
            o00oOooO();
        }
        this.f4904o00ooOo0 = savedState.f4916o00oo0O0;
        setLockMode(savedState.f4915o00oo0O);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4916o00oo0O0 = o00oo0OO() ? isOpen() : this.f4904o00ooOo0;
        savedState.f4915o00oo0O = this.f4908o00ooo00;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f4903o00ooOo = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4892o00oo0o) {
            this.f4902o00ooOOo.o00ooo0o(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4899o00ooO0o = x;
                this.f4895o00ooO = y;
            } else if (actionMasked == 1 && o00oo00O(this.f4894o00oo0oO)) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f4899o00ooO0o;
                float f2 = y2 - this.f4895o00ooO;
                int o00ooOOo2 = this.f4902o00ooOOo.o00ooOOo();
                if ((f2 * f2) + (f * f) < o00ooOOo2 * o00ooOOo2 && this.f4902o00ooOOo.o00ooo0O(this.f4894o00oo0oO, (int) x2, (int) y2)) {
                    o00oOo0O(0);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o0O00O.o00oOo00
    public void open() {
        o00oo0Oo();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@oo0oO0 View view) {
        if (view.getParent() instanceof o00oo0OO) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f4892o00oo0o) {
            return;
        }
        this.f4904o00ooOo0 = view == this.f4894o00oo0oO;
    }

    @Deprecated
    public void setCoveredFadeColor(@o0O00O int i) {
        this.f4889o00oo0O = i;
    }

    public final void setLockMode(int i) {
        this.f4908o00ooo00 = i;
    }

    @Deprecated
    public void setPanelSlideListener(@o0OO00OO o00oo00O o00oo00o) {
        o00oo00O o00oo00o2 = this.f4900o00ooOO;
        if (o00oo00o2 != null) {
            o00oo0oO(o00oo00o2);
        }
        if (o00oo00o != null) {
            o00oOOo0(o00oo00o);
        }
        this.f4900o00ooOO = o00oo00o;
    }

    public void setParallaxDistance(@o0OO0 int i) {
        this.f4898o00ooO0O = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@o0OO00OO Drawable drawable) {
        this.f4891o00oo0Oo = drawable;
    }

    public void setShadowDrawableRight(@o0OO00OO Drawable drawable) {
        this.f4893o00oo0o0 = drawable;
    }

    @Deprecated
    public void setShadowResource(@o0O0O0o0 int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(o0.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(o0.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(@o0O00O int i) {
        this.f4890o00oo0O0 = i;
    }
}
