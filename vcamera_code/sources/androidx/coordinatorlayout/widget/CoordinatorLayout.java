package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.common.collect.LinkedHashMultimap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOoOo.o00oo;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooOo0.o0O00oO0;
import o00ooOo0.o0O0O0O;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o0;
import o0O000oo.o0O0O0o0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0O0oo0o;
import o0O000oo.o0OOo000;
import o0O000oo.o0oO0O0o;
import o0O000oo.o0ooO;
import o0ooOoOO.oO000OOo;
import o0ooOoOO.oO0Ooooo;
import org.videolan.libvlc.MediaDiscoverer;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o0oO0O0o, o0O0oo0o {
    public static final Class<?>[] CONSTRUCTOR_PARAMS;
    public static final int EVENT_NESTED_SCROLL = 1;
    public static final int EVENT_PRE_DRAW = 0;
    public static final int EVENT_VIEW_REMOVED = 2;
    public static final String TAG = "CoordinatorLayout";
    public static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    public static final String WIDGET_PACKAGE_NAME;
    public static final ThreadLocal<Map<String, Constructor<o00oOo00>>> sConstructors;
    private static final oO000OOo.o00oOOo0<Rect> sRectPool;
    private o0ooO mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final o0O00oO0<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private o0OOo000 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final o0O0O0o0 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private o00oo0OO mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public SparseArray<Parcelable> f2296o00oo0O0;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState o00oOOoO(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] o00oOo00(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2296o00oo0O0 = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2296o00oo0O0.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2296o00oo0O0;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2296o00oo0O0.keyAt(i2);
                parcelableArr[i2] = this.f2296o00oo0O0.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0ooO {
        public o00oOOo0() {
        }

        @Override // o0O000oo.o0ooO
        public o0OOo000 onApplyWindowInsets(View view, o0OOo000 o0ooo000) {
            return CoordinatorLayout.this.setWindowInsets(o0ooo000);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        @oo0oO0
        o00oOo00 getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00<V extends View> {
        public o00oOo00() {
        }

        public o00oOo00(Context context, AttributeSet attributeSet) {
        }

        @o0OO00OO
        public static Object getTag(@oo0oO0 View view) {
            return ((o00oo0) view.getLayoutParams()).f2315o00oo0Oo;
        }

        public static void setTag(@oo0oO0 View view, @o0OO00OO Object obj) {
            ((o00oo0) view.getLayoutParams()).f2315o00oo0Oo = obj;
        }

        public boolean blocksInteractionBelow(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 Rect rect) {
            return false;
        }

        @o0O00O
        public int getScrimColor(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v) {
            return -16777216;
        }

        @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        public float getScrimOpacity(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view) {
            return false;
        }

        @oo0oO0
        public o0OOo000 onApplyWindowInsets(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 o0OOo000 o0ooo000) {
            return o0ooo000;
        }

        public void onAttachedToLayoutParams(@oo0oO0 o00oo0 o00oo0Var) {
        }

        public boolean onDependentViewChanged(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view) {
            return false;
        }

        public void onDependentViewRemoved(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, @oo0oO0 int[] iArr) {
        }

        public void onNestedPreScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, @oo0oO0 int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, int i3, int i4, int i5, @oo0oO0 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void onNestedScrollAccepted(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, @oo0oO0 View view2, int i) {
        }

        public void onNestedScrollAccepted(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 Parcelable parcelable) {
        }

        @o0OO00OO
        public Parcelable onSaveInstanceState(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, @oo0oO0 View view2, int i) {
            return false;
        }

        public boolean onStartNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view) {
        }

        public void onStopNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public boolean onTouchEvent(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface o00oOo0O {
        Class<? extends o00oOo00> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends ViewGroup.MarginLayoutParams {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo00 f2298o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f2299o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2300o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f2301o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f2302o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f2303o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f2304o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f2305o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f2306o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public View f2307o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f2308o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public View f2309o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public boolean f2310o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public boolean f2311o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Rect f2312o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f2313o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f2314o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public Object f2315o00oo0Oo;

        public o00oo0(int i, int i2) {
            super(i, i2);
            this.f2299o00oOOoO = false;
            this.f2300o00oOo00 = 0;
            this.f2308o00oOooO = 0;
            this.f2301o00oOo0O = -1;
            this.f2302o00oOo0o = -1;
            this.f2304o00oOoO0 = 0;
            this.f2303o00oOoO = 0;
            this.f2312o00oo0O = new Rect();
        }

        public o00oo0(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2299o00oOOoO = false;
            this.f2300o00oOo00 = 0;
            this.f2308o00oOooO = 0;
            this.f2301o00oOo0O = -1;
            this.f2302o00oOo0o = -1;
            this.f2304o00oOoO0 = 0;
            this.f2303o00oOoO = 0;
            this.f2312o00oo0O = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.f2300o00oOo00 = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2302o00oOo0o = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2308o00oOooO = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2301o00oOo0O = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2304o00oOoO0 = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2303o00oOoO = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f2299o00oOOoO = hasValue;
            if (hasValue) {
                this.f2298o00oOOo0 = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            o00oOo00 o00ooo002 = this.f2298o00oOOo0;
            if (o00ooo002 != null) {
                o00ooo002.onAttachedToLayoutParams(this);
            }
        }

        public o00oo0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2299o00oOOoO = false;
            this.f2300o00oOo00 = 0;
            this.f2308o00oOooO = 0;
            this.f2301o00oOo0O = -1;
            this.f2302o00oOo0o = -1;
            this.f2304o00oOoO0 = 0;
            this.f2303o00oOoO = 0;
            this.f2312o00oo0O = new Rect();
        }

        public o00oo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2299o00oOOoO = false;
            this.f2300o00oOo00 = 0;
            this.f2308o00oOooO = 0;
            this.f2301o00oOo0O = -1;
            this.f2302o00oOo0o = -1;
            this.f2304o00oOoO0 = 0;
            this.f2303o00oOoO = 0;
            this.f2312o00oo0O = new Rect();
        }

        public o00oo0(o00oo0 o00oo0Var) {
            super((ViewGroup.MarginLayoutParams) o00oo0Var);
            this.f2299o00oOOoO = false;
            this.f2300o00oOo00 = 0;
            this.f2308o00oOooO = 0;
            this.f2301o00oOo0O = -1;
            this.f2302o00oOo0o = -1;
            this.f2304o00oOoO0 = 0;
            this.f2303o00oOoO = 0;
            this.f2312o00oo0O = new Rect();
        }

        public boolean o00oOOo0() {
            return this.f2307o00oOoo0 == null && this.f2302o00oOo0o != -1;
        }

        public boolean o00oOOoO(CoordinatorLayout coordinatorLayout, View view, View view2) {
            o00oOo00 o00ooo002;
            return view2 == this.f2309o00oOooo || o00oo0oO(view2, o0O0o00O.o0O000O(coordinatorLayout)) || ((o00ooo002 = this.f2298o00oOOo0) != null && o00ooo002.layoutDependsOn(coordinatorLayout, view, view2));
        }

        public boolean o00oOo00() {
            if (this.f2298o00oOOo0 == null) {
                this.f2311o00oo00O = false;
            }
            return this.f2311o00oo00O;
        }

        @oo0OOoo
        public int o00oOo0O() {
            return this.f2302o00oOo0o;
        }

        @o0OO00OO
        public o00oOo00 o00oOo0o() {
            return this.f2298o00oOOo0;
        }

        public Rect o00oOoO() {
            return this.f2312o00oo0O;
        }

        public boolean o00oOoO0() {
            return this.f2313o00oo0O0;
        }

        public void o00oOoOO() {
            this.f2309o00oOooo = null;
            this.f2307o00oOoo0 = null;
        }

        public boolean o00oOoOo(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2311o00oo00O;
            if (z) {
                return true;
            }
            o00oOo00 o00ooo002 = this.f2298o00oOOo0;
            boolean blocksInteractionBelow = (o00ooo002 != null ? o00ooo002.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.f2311o00oo00O = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        public boolean o00oOoo0(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f2314o00oo0OO;
            }
            return this.f2310o00oo0;
        }

        public View o00oOooO(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2302o00oOo0o == -1) {
                this.f2309o00oOooo = null;
                this.f2307o00oOoo0 = null;
                return null;
            }
            if (this.f2307o00oOoo0 == null || !o0O0o(view, coordinatorLayout)) {
                o00oo0OO(view, coordinatorLayout);
            }
            return this.f2307o00oOoo0;
        }

        public void o00oOooo() {
            this.f2313o00oo0O0 = false;
        }

        public void o00oo0() {
            this.f2311o00oo00O = false;
        }

        public void o00oo00O(int i) {
            o00oo0o(i, false);
        }

        public void o00oo0O(@o0OO00OO o00oOo00 o00ooo002) {
            o00oOo00 o00ooo003 = this.f2298o00oOOo0;
            if (o00ooo003 != o00ooo002) {
                if (o00ooo003 != null) {
                    o00ooo003.onDetachedFromLayoutParams();
                }
                this.f2298o00oOOo0 = o00ooo002;
                this.f2315o00oo0Oo = null;
                this.f2299o00oOOoO = true;
                if (o00ooo002 != null) {
                    o00ooo002.onAttachedToLayoutParams(this);
                }
            }
        }

        public void o00oo0O0(@oo0OOoo int i) {
            o00oOoOO();
            this.f2302o00oOo0o = i;
        }

        public final void o00oo0OO(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2302o00oOo0o);
            this.f2307o00oOoo0 = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2309o00oOooo = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Could not find CoordinatorLayout descendant view with id ");
                o00oOOo02.append(coordinatorLayout.getResources().getResourceName(this.f2302o00oOo0o));
                o00oOOo02.append(" to anchor view ");
                o00oOOo02.append(view);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            this.f2309o00oOooo = null;
            this.f2307o00oOoo0 = null;
        }

        public void o00oo0Oo(boolean z) {
            this.f2313o00oo0O0 = z;
        }

        public void o00oo0o(int i, boolean z) {
            if (i == 0) {
                this.f2310o00oo0 = z;
            } else if (i != 1) {
            } else {
                this.f2314o00oo0OO = z;
            }
        }

        public void o00oo0o0(Rect rect) {
            this.f2312o00oo0O.set(rect);
        }

        public final boolean o00oo0oO(View view, int i) {
            int absoluteGravity = Gravity.getAbsoluteGravity(((o00oo0) view.getLayoutParams()).f2304o00oOoO0, i);
            return absoluteGravity != 0 && (Gravity.getAbsoluteGravity(this.f2303o00oOoO, i) & absoluteGravity) == absoluteGravity;
        }

        public final boolean o0O0o(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2307o00oOoo0.getId() != this.f2302o00oOo0o) {
                return false;
            }
            View view2 = this.f2307o00oOoo0;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2309o00oOooo = null;
                    this.f2307o00oOoo0 = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2309o00oOooo = view2;
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements ViewGroup.OnHierarchyChangeListener {
        public o00oo00O() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(View view, View view2) {
            float o0ooO2 = o0O0o00O.o0ooO(view);
            float o00oo00O2 = o0O0o00O.o00ooO0.o00oo00O(view2);
            if (o0ooO2 > o00oo00O2) {
                return -1;
            }
            return o0ooO2 < o00oo00O2 ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements ViewTreeObserver.OnPreDrawListener {
        public o00oo0OO() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new o00oo0O0();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new oO000OOo.o00oOo00(12);
    }

    public CoordinatorLayout(@oo0oO0 Context context) {
        this(context, null);
    }

    public CoordinatorLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, @o0O000Oo int i) {
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new o0O00oO0<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new o0O0O0o0(this);
        int[] iArr = R.styleable.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = R.styleable.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.mKeylines;
                iArr3[i2] = (int) (iArr3[i2] * f);
            }
        }
        this.mStatusBarBackground = obtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new o00oo00O());
        if (o0O0o00O.o0O00000(this) == 0) {
            o0O0o00O.o00oo0OO.o00oo0o0(this, 1);
        }
    }

    @oo0oO0
    private static Rect acquireTempRect() {
        Rect acquire = sRectPool.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void constrainChildRect(o00oo0 o00oo0Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private o0OOo000 dispatchApplyWindowInsetsToBehaviors(o0OOo000 o0ooo000) {
        o00oOo00 o00oOo0o2;
        if (o0ooo000.o00ooO0o()) {
            return o0ooo000;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (o0O0o00O.o0(childAt) && (o00oOo0o2 = ((o00oo0) childAt.getLayoutParams()).o00oOo0o()) != null) {
                o0ooo000 = o00oOo0o2.onApplyWindowInsets(this, childAt, o0ooo000);
                if (o0ooo000.o00ooO0o()) {
                    break;
                }
            }
        }
        return o0ooo000;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, o00oo0 o00oo0Var, int i2, int i3) {
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(o00oo0Var.f2300o00oOo00), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(o00oo0Var.f2308o00oOooO), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            toString();
            return 0;
        } else {
            return iArr[i];
        }
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.o00oOoOo(view);
    }

    private void layoutChild(View view, int i) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin);
        if (this.mLastInsets != null && o0O0o00O.o0(this) && !o0O0o00O.o00oo0OO.o00oOOoO(view)) {
            acquireTempRect.left = this.mLastInsets.o00oo0O0() + acquireTempRect.left;
            acquireTempRect.top = this.mLastInsets.o00oo0Oo() + acquireTempRect.top;
            acquireTempRect.right -= this.mLastInsets.o00oo0O();
            acquireTempRect.bottom -= this.mLastInsets.o00oo0OO();
        }
        Rect acquireTempRect2 = acquireTempRect();
        o0.o00oOOo0.o00oOOoO(resolveGravity(o00oo0Var.f2300o00oOo00), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(o00oo0Var.f2300o00oOo00), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (o0O0o00O.o0O0Oooo(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
            o00oOo00 o00oOo0o2 = o00oo0Var.o00oOo0o();
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (o00oOo0o2 == null || !o00oOo0o2.getInsetDodgeRect(this, view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Rect should be within the child's bounds. Rect:");
                o00oOOo02.append(acquireTempRect.toShortString());
                o00oOOo02.append(" | Bounds:");
                o00oOOo02.append(acquireTempRect2.toShortString());
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(o00oo0Var.f2303o00oOoO, i);
            boolean z3 = true;
            if ((absoluteGravity & 48) != 48 || (i6 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin) - o00oo0Var.f2306o00oOoOo) >= (i7 = rect.top)) {
                z = false;
            } else {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin) + o00oo0Var.f2306o00oOoOo) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i3 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin) - o00oo0Var.f2305o00oOoOO) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin) + o00oo0Var.f2305o00oOoOO) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - i2);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o00oOo00 parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<o00oOo00>>> threadLocal = sConstructors;
            Map<String, Constructor<o00oOo00>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<o00oOo00> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(o00oo.o00oOOo0("Could not inflate Behavior subclass ", str), e);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
            o00oOo00 o00oOo0o2 = o00oo0Var.o00oOo0o();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && o00oOo0o2 != null) {
                    if (i == 0) {
                        z = o00oOo0o2.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        z = o00oOo0o2.onTouchEvent(this, view, motionEvent);
                    }
                    if (z) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean o00oOo002 = o00oo0Var.o00oOo00();
                boolean o00oOoOo2 = o00oo0Var.o00oOoOo(this, view);
                z2 = o00oOoOo2 && !o00oOo002;
                if (o00oOoOo2 && !z2) {
                    break;
                }
            } else if (o00oOo0o2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    o00oOo0o2.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i == 1) {
                    o00oOo0o2.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.o00oOo00();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o00oo0 resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.o00oOooO(this, childAt);
            this.mChildDag.o00oOOoO(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.o00oOOoO(this, childAt, childAt2)) {
                        if (!this.mChildDag.o00oOooO(childAt2)) {
                            this.mChildDag.o00oOOoO(childAt2);
                        }
                        this.mChildDag.o00oOOo0(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.o00oOoOO());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(@oo0oO0 Rect rect) {
        rect.setEmpty();
        sRectPool.o00oOOo0(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o00oOo00 o00oOo0o2 = ((o00oo0) childAt.getLayoutParams()).o00oOo0o();
            if (o00oOo0o2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    o00oOo0o2.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    o00oOo0o2.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((o00oo0) getChildAt(i2).getLayoutParams()).o00oo0();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= o0.f10418o00oOOoO;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        return i == 0 ? BadgeDrawable.TOP_END : i;
    }

    private void setInsetOffsetX(View view, int i) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int i2 = o00oo0Var.f2305o00oOoOO;
        if (i2 != i) {
            o0O0o00O.o0O0o00O(view, i - i2);
            o00oo0Var.f2305o00oOoOO = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int i2 = o00oo0Var.f2306o00oOoOo;
        if (i2 != i) {
            o0O0o00O.o0O0o00o(view, i - i2);
            o00oo0Var.f2306o00oOoOo = i;
        }
    }

    private void setupForInsets() {
        if (!o0O0o00O.o0(this)) {
            o0O0o00O.o00ooO0.o00oo0oO(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new o00oOOo0();
        }
        o0O0o00O.o00ooO0.o00oo0oO(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(MediaDiscoverer.Event.Started);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new o00oo0OO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o00oo0) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@oo0oO0 View view) {
        List o00oOoO02 = this.mChildDag.o00oOoO0(view);
        if (o00oOoO02 == null || o00oOoO02.isEmpty()) {
            return;
        }
        for (int i = 0; i < o00oOoO02.size(); i++) {
            View view2 = (View) o00oOoO02.get(i);
            o00oOo00 o00oOo0o2 = ((o00oo0) view2.getLayoutParams()).o00oOo0o();
            if (o00oOo0o2 != null) {
                o00oOo0o2.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@oo0oO0 View view, @oo0oO0 View view2) {
        boolean z = false;
        if (view.getVisibility() == 0 && view2.getVisibility() == 0) {
            Rect acquireTempRect = acquireTempRect();
            getChildRect(view, view.getParent() != this, acquireTempRect);
            Rect acquireTempRect2 = acquireTempRect();
            getChildRect(view2, view2.getParent() != this, acquireTempRect2);
            try {
                if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                    if (acquireTempRect.bottom >= acquireTempRect2.top) {
                        z = true;
                    }
                }
                return z;
            } finally {
                releaseTempRect(acquireTempRect);
                releaseTempRect(acquireTempRect2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        o00oOo00 o00ooo002 = o00oo0Var.f2298o00oOOo0;
        if (o00ooo002 != null) {
            float scrimOpacity = o00ooo002.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(o00oo0Var.f2298o00oOOo0.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateDefaultLayoutParams() {
        return new o00oo0(-2, -2);
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateLayoutParams(AttributeSet attributeSet) {
        return new o00oo0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oo0 ? new o00oo0((o00oo0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oo0((ViewGroup.MarginLayoutParams) layoutParams) : new o00oo0(layoutParams);
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @oo0oO0
    public List<View> getDependencies(@oo0oO0 View view) {
        List<View> o00oOoO2 = this.mChildDag.o00oOoO(view);
        this.mTempDependenciesList.clear();
        if (o00oOoO2 != null) {
            this.mTempDependenciesList.addAll(o00oOoO2);
        }
        return this.mTempDependenciesList;
    }

    @o0o0000
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @oo0oO0
    public List<View> getDependents(@oo0oO0 View view) {
        List o00oOoO02 = this.mChildDag.o00oOoO0(view);
        this.mTempDependenciesList.clear();
        if (o00oOoO02 != null) {
            this.mTempDependenciesList.addAll(o00oOoO02);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        o0O0O0O.o00oOOo0(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, o00oo0Var, measuredWidth, measuredHeight);
        constrainChildRect(o00oo0Var, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((o00oo0) view.getLayoutParams()).o00oOoO());
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public final o0OOo000 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, o0O000oo.o0O0O0Oo
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.o00oOOo0();
    }

    public o00oo0 getResolvedLayoutParams(View view) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        if (!o00oo0Var.f2299o00oOOoO) {
            if (view instanceof o00oOOoO) {
                o00oo0Var.o00oo0O(((o00oOOoO) view).getBehavior());
            } else {
                o00oOo0O o00ooo0o2 = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    o00ooo0o2 = (o00oOo0O) cls.getAnnotation(o00oOo0O.class);
                    if (o00ooo0o2 != null) {
                        break;
                    }
                }
                if (o00ooo0o2 != null) {
                    try {
                        o00oo0Var.o00oo0O(o00ooo0o2.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        o00ooo0o2.value().getName();
                    }
                }
            }
            o00oo0Var.f2299o00oOOoO = true;
        }
        return o00oo0Var;
    }

    @o0OO00OO
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(@oo0oO0 View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        o00oOo00 o00oOo0o2;
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        if (o00oo0Var.f2307o00oOoo0 != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(o00oo0Var.f2307o00oOoo0, acquireTempRect);
            boolean z = false;
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i, acquireTempRect, acquireTempRect3, o00oo0Var, measuredWidth, measuredHeight);
            z = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? true : true;
            constrainChildRect(o00oo0Var, acquireTempRect3, measuredWidth, measuredHeight);
            int i2 = acquireTempRect3.left - acquireTempRect2.left;
            int i3 = acquireTempRect3.top - acquireTempRect2.top;
            if (i2 != 0) {
                o0O0o00O.o0O0o00O(view, i2);
            }
            if (i3 != 0) {
                o0O0o00O.o0O0o00o(view, i3);
            }
            if (z && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                o00oOo0o2.onDependentViewChanged(this, view, o00oo0Var.f2307o00oOoo0);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new o00oo0OO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && o0O0o00O.o0(this)) {
            o0O0o00O.o00oo.o00oOo00(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i) {
        boolean z;
        int o0O000O2 = o0O0o00O.o0O000O(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mDependencySortedChildren.get(i2);
            o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (o00oo0Var.f2309o00oOooo == this.mDependencySortedChildren.get(i3)) {
                        offsetChildToAnchor(view, o0O000O2);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (o00oo0Var.f2304o00oOoO0 != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(o00oo0Var.f2304o00oOoO0, o0O000O2);
                    int i4 = absoluteGravity & 112;
                    if (i4 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i4 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i5 = absoluteGravity & 7;
                    if (i5 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i5 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (o00oo0Var.f2303o00oOoO != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, o0O000O2);
                }
                if (i != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.mDependencySortedChildren.get(i6);
                    o00oo0 o00oo0Var2 = (o00oo0) view2.getLayoutParams();
                    o00oOo00 o00oOo0o2 = o00oo0Var2.o00oOo0o();
                    if (o00oOo0o2 != null && o00oOo0o2.layoutDependsOn(this, view2, view)) {
                        if (i == 0 && o00oo0Var2.o00oOoO0()) {
                            o00oo0Var2.o00oOooo();
                        } else {
                            if (i != 2) {
                                z = o00oOo0o2.onDependentViewChanged(this, view2, view);
                            } else {
                                o00oOo0o2.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                o00oo0Var2.o00oo0Oo(z);
                            }
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        o0OOo000 o0ooo000 = this.mLastInsets;
        int o00oo0Oo2 = o0ooo000 != null ? o0ooo000.o00oo0Oo() : 0;
        if (o00oo0Oo2 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), o00oo0Oo2);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o00oOo00 o00oOo0o2;
        int o0O000O2 = o0O0o00O.o0O000O(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((o00oOo0o2 = ((o00oo0) view.getLayoutParams()).o00oOo0o()) == null || !o00oOo0o2.onLayoutChild(this, view, o0O000O2))) {
                onLayoutChild(view, o0O000O2);
            }
        }
    }

    public void onLayoutChild(@oo0oO0 View view, int i) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        if (o00oo0Var.o00oOOo0()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = o00oo0Var.f2307o00oOoo0;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i);
            return;
        }
        int i2 = o00oo0Var.f2301o00oOo0O;
        if (i2 >= 0) {
            layoutChildWithKeyline(view, i2, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        o00oOo00 o00oOo0o2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                if (o00oo0Var.o00oOoo0(0) && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                    z2 |= o00oOo0o2.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedPreFling(View view, float f, float f2) {
        o00oOo00 o00oOo0o2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                if (o00oo0Var.o00oOoo0(0) && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                    z |= o00oOo0o2.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        o00oOo00 o00oOo0o2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                if (o00oo0Var.o00oOoo0(i3) && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    o00oOo0o2.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // o0O000oo.o0O0oo0o
    public void onNestedScroll(@oo0oO0 View view, int i, int i2, int i3, int i4, int i5, @oo0oO0 int[] iArr) {
        o00oOo00 o00oOo0o2;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                if (o00oo0Var.o00oOoo0(i5) && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    o00oOo0o2.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        min = Math.max(i7, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        min = Math.min(i7, this.mBehaviorConsumed[1]);
                    }
                    i7 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        o00oOo00 o00oOo0o2;
        this.mNestedScrollingParentHelper.o00oOo00(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
            if (o00oo0Var.o00oOoo0(i2) && (o00oOo0o2 = o00oo0Var.o00oOo0o()) != null) {
                o00oOo0o2.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f2296o00oo0O0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            o00oOo00 o00oOo0o2 = getResolvedLayoutParams(childAt).o00oOo0o();
            if (id != -1 && o00oOo0o2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                o00oOo0o2.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            o00oOo00 o00oOo0o2 = ((o00oo0) childAt.getLayoutParams()).o00oOo0o();
            if (id != -1 && o00oOo0o2 != null && (onSaveInstanceState = o00oOo0o2.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f2296o00oo0O0 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                o00oOo00 o00oOo0o2 = o00oo0Var.o00oOo0o();
                if (o00oOo0o2 != null) {
                    boolean onStartNestedScroll = o00oOo0o2.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    o00oo0Var.o00oo0o(i2, onStartNestedScroll);
                } else {
                    o00oo0Var.o00oo0o(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.o00oOo0O(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
            if (o00oo0Var.o00oOoo0(i)) {
                o00oOo00 o00oOo0o2 = o00oo0Var.o00oOo0o();
                if (o00oOo0o2 != null) {
                    o00oOo0o2.onStopNestedScroll(this, childAt, view, i);
                }
                o00oo0Var.o00oo00O(i);
                o00oo0Var.o00oOooo();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$o00oo0 r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.o00oo0) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$o00oOo00 r6 = r6.o00oOo0o()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.resetTouchBehaviors(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((o00oo0) view.getLayoutParams()).o00oo0o0(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        o00oOo00 o00oOo0o2 = ((o00oo0) view.getLayoutParams()).o00oOo0o();
        if (o00oOo0o2 == null || !o00oOo0o2.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@o0OO00OO Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                o0O0O0Oo.o00oOo00.o00oOOoO(this.mStatusBarBackground, o0O0o00O.o0O000O(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            o0O0o00O.o0O0o0oO(this);
        }
    }

    public void setStatusBarBackgroundColor(@o0O00O int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        setStatusBarBackground(i != 0 ? o00ooo0.o0.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final o0OOo000 setWindowInsets(o0OOo000 o0ooo000) {
        if (oO0Ooooo.o00oOOo0.o00oOOo0(this.mLastInsets, o0ooo000)) {
            return o0ooo000;
        }
        this.mLastInsets = o0ooo000;
        boolean z = true;
        boolean z2 = o0ooo000 != null && o0ooo000.o00oo0Oo() > 0;
        this.mDrawStatusBarBackground = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        o0OOo000 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(o0ooo000);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }
}
