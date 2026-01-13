package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.o0;
import androidx.recyclerview.widget.o00oOOo0;
import androidx.recyclerview.widget.o00oo0;
import androidx.recyclerview.widget.o0O0OO;
import androidx.recyclerview.widget.o0O0OO0;
import androidx.recyclerview.widget.o0oO0Ooo;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0oO;
import o0O00.o00oOOoO;
import o0O00.o00oo0O;
import o0O000.o0O00OOO;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OoOoO;
import o0O000oo.o0OooO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o0OooO0, o0O000oo.o0oO0Ooo, o0O000oo.o0O00o00 {
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public androidx.recyclerview.widget.o0oO0Ooo mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public o00oo0OO mAdapter;
    public androidx.recyclerview.widget.o00oOOo0 mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private o0O0o mChildDrawingOrderCallback;
    public androidx.recyclerview.widget.o00oo0 mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @oo0oO0
    private o00oo mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    @o0o0000
    public boolean mFirstLayoutComplete;
    public androidx.recyclerview.widget.o0 mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private o0OoOoOo mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public o00ooO0 mItemAnimator;
    private o00ooO0.o00oOo00 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<o0> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    @o0o0000
    public o0O00000 mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final o0O00O0o mObserver;
    private List<o0O000> mOnChildAttachStateListeners;
    private o0O000O mOnFlingListener;
    private final ArrayList<o0OoOoOo> mOnItemTouchListeners;
    @o0o0000
    public final List<o0O00oO0> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public o0.o00oOOoO mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final o0O00O0 mRecycler;
    public o0OoO00O mRecyclerListener;
    public final List<o0OoO00O> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private o0O000Oo mScrollListener;
    private List<o0O000Oo> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private o0O000oo.o0O0O0O mScrollingChildHelper;
    public final o0O00OOO mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final o0O00o00 mViewFlinger;
    private final o0O0OO.o00oOOoO mViewInfoProcessCallback;
    public final o0O0OO mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Parcelable f4103o00oo0O0;

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
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOo00 */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4103o00oo0O0 = parcel.readParcelable(classLoader == null ? o0O00000.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void o00oOOo0(SavedState savedState) {
            this.f4103o00oo0O0 = savedState.f4103o00oo0O0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4103o00oo0O0, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o0 {
        @Deprecated
        public void getItemOffsets(@oo0oO0 Rect rect, int i, @oo0oO0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(@oo0oO0 Rect rect, @oo0oO0 View view, @oo0oO0 RecyclerView recyclerView, @oo0oO0 o0O00OOO o0o00ooo) {
            getItemOffsets(rect, ((o0O0000O) view.getLayoutParams()).o00oOooO(), recyclerView);
        }

        @Deprecated
        public void onDraw(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView) {
        }

        public void onDraw(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, @oo0oO0 o0O00OOO o0o00ooo) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView) {
        }

        public void onDrawOver(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, @oo0oO0 o0O00OOO o0o00ooo) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00ooO0 o00ooo02 = RecyclerView.this.mItemAnimator;
            if (o00ooo02 != null) {
                o00ooo02.o00ooO00();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o0O0OO.o00oOOoO {
        public o00oOo0O() {
        }

        @Override // androidx.recyclerview.widget.o0O0OO.o00oOOoO
        public void o00oOOo0(o0O00oO0 o0o00oo0, o00ooO0.o00oOo0O o00ooo0o2, o00ooO0.o00oOo0O o00ooo0o3) {
            RecyclerView.this.animateAppearance(o0o00oo0, o00ooo0o2, o00ooo0o3);
        }

        @Override // androidx.recyclerview.widget.o0O0OO.o00oOOoO
        public void o00oOOoO(o0O00oO0 o0o00oo0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(o0o00oo0.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.o0O0OO.o00oOOoO
        public void o00oOo00(o0O00oO0 o0o00oo0, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o2, @o0OO00OO o00ooO0.o00oOo0O o00ooo0o3) {
            RecyclerView.this.mRecycler.o00ooo0(o0o00oo0);
            RecyclerView.this.animateDisappearance(o0o00oo0, o00ooo0o2, o00ooo0o3);
        }

        @Override // androidx.recyclerview.widget.o0O0OO.o00oOOoO
        public void o00oOooO(o0O00oO0 o0o00oo0, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o3) {
            o0o00oo0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            o00ooO0 o00ooo02 = recyclerView.mItemAnimator;
            if (z) {
                if (!o00ooo02.o00oOOoO(o0o00oo0, o0o00oo0, o00ooo0o2, o00ooo0o3)) {
                    return;
                }
            } else if (!o00ooo02.o00oOooO(o0o00oo0, o00ooo0o2, o00ooo0o3)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements o00oo0.o00oOOoO {
        public o00oOoO() {
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public View o00oOOo0(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOOoO(View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public int o00oOo00() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOo0O(int i) {
            o0O00oO0 childViewHolderInt;
            View o00oOOo02 = o00oOOo0(i);
            if (o00oOOo02 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(o00oOOo02)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, sb));
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOo0o(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public int o00oOoO(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOoO0() {
            int o00oOo002 = o00oOo00();
            for (int i = 0; i < o00oOo002; i++) {
                View o00oOOo02 = o00oOOo0(i);
                RecyclerView.this.dispatchChildDetached(o00oOOo02);
                o00oOOo02.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOoOO(View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOoOo(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public void o00oOoo0(View view, int i, ViewGroup.LayoutParams layoutParams) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, sb));
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.o00oo0.o00oOOoO
        public o0O00oO0 o00oOooO(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f4108o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f4109o00oOOoO = 1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4110o00oOo00 = 2;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f4111o00oOooO = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        @oo0oO0
        public EdgeEffect o00oOOo0(@oo0oO0 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f4112o00oOOo0;

        static {
            int[] iArr = new int[o00oo0OO.o00oOOo0.values().length];
            f4112o00oOOo0 = iArr;
            try {
                iArr[o00oo0OO.o00oOOo0.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4112o00oOOo0[o00oo0OO.o00oOOo0.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements o00oOOo0.InterfaceC0037o00oOOo0 {
        public o00oo00O() {
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOOo0(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOOoO(o00oOOo0.o00oOOoO o00ooooo2) {
            o00oOoOO(o00ooooo2);
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOo00(o00oOOo0.o00oOOoO o00ooooo2) {
            o00oOoOO(o00ooooo2);
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOo0O(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public o0O00oO0 o00oOo0o(int i) {
            o0O00oO0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.o00oo0(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOoO(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f4180o00oOooO += i2;
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOoO0(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        public void o00oOoOO(o00oOOo0.o00oOOoO o00ooooo2) {
            int i = o00ooooo2.f4294o00oOOo0;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO, o00ooooo2.f4296o00oOo00);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO, 1);
            }
        }

        @Override // androidx.recyclerview.widget.o00oOOo0.InterfaceC0037o00oOOo0
        public void o00oOooO(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0O {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, @o0OO00OO Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends Observable<o00oo0O> {
        public boolean o00oOOo0() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void o00oOOoO() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void o00oOo00(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public void o00oOo0O(int i, int i2, @o0OO00OO Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public void o00oOo0o(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public void o00oOoO() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void o00oOoO0(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((o00oo0O) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public void o00oOooO(int i, int i2) {
            o00oOo0O(i, i2, null);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0OO<VH extends o0O00oO0> {
        private final o00oo0O0 mObservable = new o00oo0O0();
        private boolean mHasStableIds = false;
        private o00oOOo0 mStateRestorationPolicy = o00oOOo0.ALLOW;

        /* loaded from: classes.dex */
        public enum o00oOOo0 {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@oo0oO0 VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                o0O000.o0O00OOO.o00oOOoO(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof o0O0000O) {
                    ((o0O0000O) layoutParams).f4146o00oOo00 = true;
                }
                o0O000.o0O00OOO.o00oOooO();
            }
        }

        public boolean canRestoreState() {
            int i = o00oo0.f4112o00oOOo0[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        @oo0oO0
        public final VH createViewHolder(@oo0oO0 ViewGroup viewGroup, int i) {
            try {
                o0O000.o0O00OOO.o00oOOoO(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    o0O00OOO.o00oOOo0.o00oOOoO();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                o0O000.o0O00OOO.o00oOooO();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@oo0oO0 o00oo0OO<? extends o0O00oO0> o00oo0oo, @oo0oO0 o0O00oO0 o0o00oo0, int i) {
            if (o00oo0oo == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @oo0oO0
        public final o00oOOo0 getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.o00oOOo0();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.o00oOOoO();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.o00oOooO(i, 1);
        }

        public final void notifyItemChanged(int i, @o0OO00OO Object obj) {
            this.mObservable.o00oOo0O(i, 1, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.o00oOo0o(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.o00oOo00(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.o00oOooO(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, @o0OO00OO Object obj) {
            this.mObservable.o00oOo0O(i, i2, obj);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.o00oOo0o(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.o00oOoO0(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.o00oOoO0(i, 1);
        }

        public void onAttachedToRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@oo0oO0 VH vh, int i);

        public void onBindViewHolder(@oo0oO0 VH vh, int i, @oo0oO0 List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @oo0oO0
        public abstract VH onCreateViewHolder(@oo0oO0 ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@oo0oO0 VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@oo0oO0 VH vh) {
        }

        public void onViewDetachedFromWindow(@oo0oO0 VH vh) {
        }

        public void onViewRecycled(@oo0oO0 VH vh) {
        }

        public void registerAdapterDataObserver(@oo0oO0 o00oo0O o00oo0o2) {
            this.mObservable.registerObserver(o00oo0o2);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@oo0oO0 o00oOOo0 o00oooo02) {
            this.mStateRestorationPolicy = o00oooo02;
            this.mObservable.o00oOoO();
        }

        public void unregisterAdapterDataObserver(@oo0oO0 o00oo0O o00oo0o2) {
            this.mObservable.unregisterObserver(o00oo0o2);
        }
    }

    /* loaded from: classes.dex */
    public class o00ooO implements o00ooO0.o00oOo00 {
        public o00ooO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0.o00oOo00
        public void o00oOOo0(o0O00oO0 o0o00oo0) {
            o0o00oo0.setIsRecyclable(true);
            if (o0o00oo0.mShadowedHolder != null && o0o00oo0.mShadowingHolder == null) {
                o0o00oo0.mShadowedHolder = null;
            }
            o0o00oo0.mShadowingHolder = null;
            if (o0o00oo0.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(o0o00oo0.itemView) || !o0o00oo0.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(o0o00oo0.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00ooO0 {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4115o00oOoO = 8;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4116o00oOoO0 = 2;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4117o00oOoOO = 4;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4118o00oOoOo = 2048;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f4119o00oOoo0 = 4096;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo00 f4120o00oOOo0 = null;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f4121o00oOOoO = new ArrayList<>();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public long f4122o00oOo00 = 120;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public long f4125o00oOooO = 120;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public long f4123o00oOo0O = 250;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public long f4124o00oOo0o = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        /* loaded from: classes.dex */
        public interface o00oOOoO {
            void o00oOOo0();
        }

        /* loaded from: classes.dex */
        public interface o00oOo00 {
            void o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0);
        }

        /* loaded from: classes.dex */
        public static class o00oOo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public int f4126o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public int f4127o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public int f4128o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public int f4129o00oOo0O;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f4130o00oOooO;

            @oo0oO0
            public o00oOo0O o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0) {
                return o00oOOoO(o0o00oo0, 0);
            }

            @oo0oO0
            public o00oOo0O o00oOOoO(@oo0oO0 o0O00oO0 o0o00oo0, int i) {
                View view = o0o00oo0.itemView;
                this.f4126o00oOOo0 = view.getLeft();
                this.f4127o00oOOoO = view.getTop();
                this.f4128o00oOo00 = view.getRight();
                this.f4130o00oOooO = view.getBottom();
                return this;
            }
        }

        public static int o00oOo0O(o0O00oO0 o0o00oo0) {
            int i = o0o00oo0.mFlags & 14;
            if (o0o00oo0.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = o0o00oo0.getOldPosition();
                int absoluteAdapterPosition = o0o00oo0.getAbsoluteAdapterPosition();
                return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
            }
            return i;
        }

        public abstract boolean o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0, @o0OO00OO o00oOo0O o00ooo0o2, @oo0oO0 o00oOo0O o00ooo0o3);

        public abstract boolean o00oOOoO(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o0O00oO0 o0o00oo02, @oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 o00oOo0O o00ooo0o3);

        public abstract boolean o00oOo00(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o00oOo0O o00ooo0o2, @o0OO00OO o00oOo0O o00ooo0o3);

        public boolean o00oOo0o(@oo0oO0 o0O00oO0 o0o00oo0) {
            return true;
        }

        public final void o00oOoO(@oo0oO0 o0O00oO0 o0o00oo0) {
            o00oo0o(o0o00oo0);
            o00oOo00 o00ooo002 = this.f4120o00oOOo0;
            if (o00ooo002 != null) {
                o00ooo002.o00oOOo0(o0o00oo0);
            }
        }

        public boolean o00oOoO0(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 List<Object> list) {
            return o00oOo0o(o0o00oo0);
        }

        public final void o00oOoOO(@oo0oO0 o0O00oO0 o0o00oo0) {
            o00oo0oO(o0o00oo0);
        }

        public final void o00oOoOo() {
            int size = this.f4121o00oOOoO.size();
            for (int i = 0; i < size; i++) {
                this.f4121o00oOOoO.get(i).o00oOOo0();
            }
            this.f4121o00oOOoO.clear();
        }

        public abstract void o00oOoo0(@oo0oO0 o0O00oO0 o0o00oo0);

        public abstract boolean o00oOooO(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 o00oOo0O o00ooo0o3);

        public abstract void o00oOooo();

        @oo0oO0
        public o00oOo0O o00oo(@oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o0O00oO0 o0o00oo0, int i, @oo0oO0 List<Object> list) {
            return o00oo0o0().o00oOOo0(o0o00oo0);
        }

        public long o00oo0() {
            return this.f4124o00oOo0o;
        }

        public long o00oo00O() {
            return this.f4122o00oOo00;
        }

        public abstract boolean o00oo0O();

        public long o00oo0O0() {
            return this.f4125o00oOooO;
        }

        public long o00oo0OO() {
            return this.f4123o00oOo0O;
        }

        public final boolean o00oo0Oo(@o0OO00OO o00oOOoO o00ooooo2) {
            boolean o00oo0O2 = o00oo0O();
            if (o00ooooo2 != null) {
                if (o00oo0O2) {
                    this.f4121o00oOOoO.add(o00ooooo2);
                } else {
                    o00ooooo2.o00oOOo0();
                }
            }
            return o00oo0O2;
        }

        public void o00oo0o(@oo0oO0 o0O00oO0 o0o00oo0) {
        }

        @oo0oO0
        public o00oOo0O o00oo0o0() {
            return new o00oOo0O();
        }

        public void o00oo0oO(@oo0oO0 o0O00oO0 o0o00oo0) {
        }

        public void o00ooO(long j) {
            this.f4123o00oOo0O = j;
        }

        public void o00ooO0(long j) {
            this.f4122o00oOo00 = j;
        }

        public abstract void o00ooO00();

        public void o00ooO0O(long j) {
            this.f4124o00oOo0o = j;
        }

        public void o00ooO0o(o00oOo00 o00ooo002) {
            this.f4120o00oOOo0 = o00ooo002;
        }

        public void o00ooOO0(long j) {
            this.f4125o00oOooO = j;
        }

        @oo0oO0
        public o00oOo0O o0O0o(@oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o0O00oO0 o0o00oo0) {
            return o00oo0o0().o00oOOo0(o0o00oo0);
        }
    }

    /* loaded from: classes.dex */
    public static class o0O00 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4131o00oOo00 = 5;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public SparseArray<o00oOOo0> f4132o00oOOo0 = new SparseArray<>();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4133o00oOOoO = 0;

        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final ArrayList<o0O00oO0> f4134o00oOOo0 = new ArrayList<>();

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public int f4135o00oOOoO = 5;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public long f4136o00oOo00 = 0;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public long f4137o00oOooO = 0;
        }

        public void o00oOOo0() {
            this.f4133o00oOOoO++;
        }

        public void o00oOOoO() {
            for (int i = 0; i < this.f4132o00oOOo0.size(); i++) {
                this.f4132o00oOOo0.valueAt(i).f4134o00oOOo0.clear();
            }
        }

        public void o00oOo00() {
            this.f4133o00oOOoO--;
        }

        public void o00oOo0O(int i, long j) {
            o00oOOo0 o00oOoO2 = o00oOoO(i);
            o00oOoO2.f4136o00oOo00 = o00oOoo0(o00oOoO2.f4136o00oOo00, j);
        }

        @o0OO00OO
        public o0O00oO0 o00oOo0o(int i) {
            o00oOOo0 o00oooo02 = this.f4132o00oOOo0.get(i);
            if (o00oooo02 == null || o00oooo02.f4134o00oOOo0.isEmpty()) {
                return null;
            }
            ArrayList<o0O00oO0> arrayList = o00oooo02.f4134o00oOOo0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final o00oOOo0 o00oOoO(int i) {
            o00oOOo0 o00oooo02 = this.f4132o00oOOo0.get(i);
            if (o00oooo02 == null) {
                o00oOOo0 o00oooo03 = new o00oOOo0();
                this.f4132o00oOOo0.put(i, o00oooo03);
                return o00oooo03;
            }
            return o00oooo02;
        }

        public int o00oOoO0(int i) {
            return o00oOoO(i).f4134o00oOOo0.size();
        }

        public void o00oOoOO(o00oo0OO o00oo0oo, o00oo0OO o00oo0oo2, boolean z) {
            if (o00oo0oo != null) {
                o00oOo00();
            }
            if (!z && this.f4133o00oOOoO == 0) {
                o00oOOoO();
            }
            if (o00oo0oo2 != null) {
                o00oOOo0();
            }
        }

        public void o00oOoOo(o0O00oO0 o0o00oo0) {
            int itemViewType = o0o00oo0.getItemViewType();
            ArrayList<o0O00oO0> arrayList = o00oOoO(itemViewType).f4134o00oOOo0;
            if (this.f4132o00oOOo0.get(itemViewType).f4135o00oOOoO <= arrayList.size()) {
                return;
            }
            o0o00oo0.resetInternal();
            arrayList.add(o0o00oo0);
        }

        public long o00oOoo0(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public void o00oOooO(int i, long j) {
            o00oOOo0 o00oOoO2 = o00oOoO(i);
            o00oOoO2.f4137o00oOooO = o00oOoo0(o00oOoO2.f4137o00oOooO, j);
        }

        public void o00oOooo(int i, int i2) {
            o00oOOo0 o00oOoO2 = o00oOoO(i);
            o00oOoO2.f4135o00oOOoO = i2;
            ArrayList<o0O00oO0> arrayList = o00oOoO2.f4134o00oOOo0;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public boolean o00oo0(int i, long j, long j2) {
            long j3 = o00oOoO(i).f4137o00oOooO;
            return j3 == 0 || j + j3 < j2;
        }

        public int o00oo00O() {
            int i = 0;
            for (int i2 = 0; i2 < this.f4132o00oOOo0.size(); i2++) {
                ArrayList<o0O00oO0> arrayList = this.f4132o00oOOo0.valueAt(i2).f4134o00oOOo0;
                if (arrayList != null) {
                    i = arrayList.size() + i;
                }
            }
            return i;
        }

        public boolean o00oo0OO(int i, long j, long j2) {
            long j3 = o00oOoO(i).f4136o00oOo00;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public interface o0O000 {
        void o00oOOoO(@oo0oO0 View view);

        void o00oOooO(@oo0oO0 View view);
    }

    /* loaded from: classes.dex */
    public static abstract class o0O00000 {
        public boolean mAutoMeasure;
        public androidx.recyclerview.widget.o00oo0 mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public o0O0OO0 mHorizontalBoundCheck;
        private final o0O0OO0.o00oOOoO mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;
        @o0OO00OO
        public o0O00OO mSmoothScroller;
        public o0O0OO0 mVerticalBoundCheck;
        private final o0O0OO0.o00oOOoO mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o0O0OO0.o00oOOoO {
            public o00oOOo0() {
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public View o00oOOo0(int i) {
                return o0O00000.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOOoO(View view) {
                return o0O00000.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((o0O0000O) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOo00() {
                return o0O00000.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOo0O(View view) {
                return o0O00000.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((o0O0000O) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOooO() {
                return o0O00000.this.getWidth() - o0O00000.this.getPaddingRight();
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements o0O0OO0.o00oOOoO {
            public o00oOOoO() {
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public View o00oOOo0(int i) {
                return o0O00000.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOOoO(View view) {
                return o0O00000.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((o0O0000O) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOo00() {
                return o0O00000.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOo0O(View view) {
                return o0O00000.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((o0O0000O) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o0O0OO0.o00oOOoO
            public int o00oOooO() {
                return o0O00000.this.getHeight() - o0O00000.this.getPaddingBottom();
            }
        }

        /* loaded from: classes.dex */
        public interface o00oOo00 {
            void o00oOOo0(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class o00oOo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public int f4140o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public int f4141o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public boolean f4142o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public boolean f4143o00oOooO;
        }

        public o0O00000() {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            this.mHorizontalBoundCheckCallback = o00oooo02;
            o00oOOoO o00ooooo2 = new o00oOOoO();
            this.mVerticalBoundCheckCallback = o00ooooo2;
            this.mHorizontalBoundCheck = new o0O0OO0(o00oooo02);
            this.mVerticalBoundCheck = new o0O0OO0(o00ooooo2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.o00oOOoO(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.o00oo0O0(childViewHolderInt);
            }
            o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.o00oOo00(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int o00oo00O2 = this.mChildHelper.o00oo00O(view);
                if (i == -1) {
                    i = this.mChildHelper.o00oOoO0();
                }
                if (o00oo00O2 == -1) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    o00oOOo02.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this.mRecyclerView, o00oOOo02));
                } else if (o00oo00O2 != i) {
                    this.mRecyclerView.mLayout.moveView(o00oo00O2, i);
                }
            } else {
                this.mChildHelper.o00oOOo0(view, i, false);
                o0o0000o.f4146o00oOo00 = true;
                o0O00OO o0o00oo = this.mSmoothScroller;
                if (o0o00oo != null && o0o00oo.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (o0o0000o.f4147o00oOooO) {
                childViewHolderInt.itemView.invalidate();
                o0o0000o.f4147o00oOooO = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, @oo0oO0 View view) {
            this.mChildHelper.o00oOooO(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o0O00000.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o0O00000.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static o00oOo0O getProperties(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
            o00oOo0O o00ooo0o2 = new o00oOo0O();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
            o00ooo0o2.f4140o00oOOo0 = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            o00ooo0o2.f4141o00oOOoO = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            o00ooo0o2.f4142o00oOo00 = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            o00ooo0o2.f4143o00oOooO = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return o00ooo0o2;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        private void scrapOrRecycleView(o0O00O0 o0o00o0, int i, View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                o0o00o0.o00ooOO(childViewHolderInt);
                return;
            }
            detachViewAt(i);
            o0o00o0.o00ooOOo(view);
            this.mRecyclerView.mViewInfoStore.o00oOoo0(childViewHolderInt);
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@oo0oO0 View view) {
            attachView(view, -1);
        }

        public void attachView(@oo0oO0 View view, int i) {
            attachView(view, i, (o0O0000O) view.getLayoutParams());
        }

        public void attachView(@oo0oO0 View view, int i, o0O0000O o0o0000o) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.o00oOOoO(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.o00oo0O0(childViewHolderInt);
            }
            this.mChildHelper.o00oOo00(view, i, o0o0000o, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@oo0oO0 View view, @oo0oO0 Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(o0O0000O o0o0000o) {
            return o0o0000o != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, o0O00OOO o0o00ooo, o00oOo00 o00ooo002) {
        }

        public void collectInitialPrefetchPositions(int i, o00oOo00 o00ooo002) {
        }

        public int computeHorizontalScrollExtent(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int computeHorizontalScrollRange(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int computeVerticalScrollExtent(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int computeVerticalScrollOffset(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int computeVerticalScrollRange(@oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@oo0oO0 o0O00O0 o0o00o0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(o0o00o0, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@oo0oO0 View view, @oo0oO0 o0O00O0 o0o00o0) {
            scrapOrRecycleView(o0o00o0, this.mChildHelper.o00oo00O(view), view);
        }

        public void detachAndScrapViewAt(int i, @oo0oO0 o0O00O0 o0o00o0) {
            scrapOrRecycleView(o0o00o0, i, getChildAt(i));
        }

        public void detachView(@oo0oO0 View view) {
            int o00oo00O2 = this.mChildHelper.o00oo00O(view);
            if (o00oo00O2 >= 0) {
                detachViewInternal(o00oo00O2, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, o0O00O0 o0o00o0) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, o0o00o0);
        }

        public void endAnimation(View view) {
            o00ooO0 o00ooo02 = this.mRecyclerView.mItemAnimator;
            if (o00ooo02 != null) {
                o00ooo02.o00oOoo0(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @o0OO00OO
        public View findContainingItemView(@oo0oO0 View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.o00oo0(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @o0OO00OO
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.o00oOoOo() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract o0O0000O generateDefaultLayoutParams();

        public o0O0000O generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new o0O0000O(context, attributeSet);
        }

        public o0O0000O generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o0O0000O ? new o0O0000O((o0O0000O) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o0O0000O((ViewGroup.MarginLayoutParams) layoutParams) : new o0O0000O(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@oo0oO0 View view) {
            return ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO.bottom;
        }

        @o0OO00OO
        public View getChildAt(int i) {
            androidx.recyclerview.widget.o00oo0 o00oo0Var = this.mChildHelper;
            if (o00oo0Var != null) {
                return o00oo0Var.o00oOo0o(i);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.o00oo0 o00oo0Var = this.mChildHelper;
            if (o00oo0Var != null) {
                return o00oo0Var.o00oOoO0();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo) {
            return -1;
        }

        public int getDecoratedBottom(@oo0oO0 View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@oo0oO0 View view, @oo0oO0 Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@oo0oO0 View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@oo0oO0 View view) {
            Rect rect = ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@oo0oO0 View view) {
            Rect rect = ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@oo0oO0 View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@oo0oO0 View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @o0OO00OO
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.o00oo0(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @o0OO0
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            o00oo0OO adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@oo0oO0 View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return o0O0o00O.o0O000O(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@oo0oO0 View view) {
            return ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO.left;
        }

        @o0OO0
        public int getMinimumHeight() {
            return o0O0o00O.o0O000o(this.mRecyclerView);
        }

        @o0OO0
        public int getMinimumWidth() {
            return o0O0o00O.o0ooOoOO(this.mRecyclerView);
        }

        @o0OO0
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @o0OO0
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return o0O0o00O.o0OoO00O(recyclerView);
            }
            return 0;
        }

        @o0OO0
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @o0OO0
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @o0OO0
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return o0O0o00O.o0O00O0o(recyclerView);
            }
            return 0;
        }

        @o0OO0
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@oo0oO0 View view) {
            return ((o0O0000O) view.getLayoutParams()).o00oOooO();
        }

        public int getRightDecorationWidth(@oo0oO0 View view) {
            return ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO.right;
        }

        public int getRowCountForAccessibility(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo) {
            return 0;
        }

        public int getTopDecorationHeight(@oo0oO0 View view) {
            return ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO.top;
        }

        public void getTransformedBoundingBox(@oo0oO0 View view, boolean z, @oo0oO0 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @o0OO0
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@oo0oO0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this.mRecyclerView, android.support.v4.media.o00oOo0O.o00oOOo0("View should be fully attached to be ignored")));
            }
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.o00oo0O(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            o0O00OO o0o00oo = this.mSmoothScroller;
            return o0o00oo != null && o0o00oo.isRunning();
        }

        public boolean isViewPartiallyVisible(@oo0oO0 View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.o00oOOoO(view, 24579) && this.mVerticalBoundCheck.o00oOOoO(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@oo0oO0 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((o0O0000O) view.getLayoutParams()).f4145o00oOOoO;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@oo0oO0 View view, int i, int i2, int i3, int i4) {
            o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
            Rect rect = o0o0000o.f4145o00oOOoO;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) o0o0000o).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) o0o0000o).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) o0o0000o).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0o0000o).bottomMargin);
        }

        public void measureChild(@oo0oO0 View view, int i, int i2) {
            o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) o0o0000o).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) o0o0000o).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, o0o0000o)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@oo0oO0 View view, int i, int i2) {
            o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o0o0000o).leftMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).rightMargin + i3, ((ViewGroup.MarginLayoutParams) o0o0000o).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) o0o0000o).topMargin + ((ViewGroup.MarginLayoutParams) o0o0000o).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) o0o0000o).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, o0o0000o)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(@o0OO0 int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@o0OO0 int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(@o0OO00OO o00oo0OO o00oo0oo, @o0OO00OO o00oo0OO o00oo0oo2) {
        }

        public boolean onAddFocusables(@oo0oO0 RecyclerView recyclerView, @oo0oO0 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @o00oOooO.o0O00O0
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @o00oOooO.o0O00O0
        public void onDetachedFromWindow(RecyclerView recyclerView, o0O00O0 o0o00o0) {
            onDetachedFromWindow(recyclerView);
        }

        @o0OO00OO
        public View onFocusSearchFailed(@oo0oO0 View view, int i, @oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@oo0oO0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            o00oo0OO o00oo0oo = this.mRecyclerView.mAdapter;
            if (o00oo0oo != null) {
                accessibilityEvent.setItemCount(o00oo0oo.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o0O00.o00oo0O o00oo0o2) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                o00oo0o2.o00oOOo0(8192);
                o00oo0o2.o0O0ooo0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                o00oo0o2.o00oOOo0(4096);
                o00oo0o2.o0O0ooo0(true);
            }
            o00oo0o2.o0O0OooO(o00oo0O.o00oOo00.o00oOo0o(getRowCountForAccessibility(o0o00o0, o0o00ooo), getColumnCountForAccessibility(o0o00o0, o0o00ooo), isLayoutHierarchical(o0o00o0, o0o00ooo), getSelectionModeForAccessibility(o0o00o0, o0o00ooo)));
        }

        public void onInitializeAccessibilityNodeInfo(o0O00.o00oo0O o00oo0o2) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, o00oo0o2);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, o0O00.o00oo0O o00oo0o2) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.o00oo0(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, o00oo0o2);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 View view, @oo0oO0 o0O00.o00oo0O o00oo0o2) {
        }

        @o0OO00OO
        public View onInterceptFocusSearch(@oo0oO0 View view, int i) {
            return null;
        }

        public void onItemsAdded(@oo0oO0 RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@oo0oO0 RecyclerView recyclerView) {
        }

        public void onItemsMoved(@oo0oO0 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@oo0oO0 RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@oo0oO0 RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@oo0oO0 RecyclerView recyclerView, int i, int i2, @o0OO00OO Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onLayoutChildren(o0O00O0 o0o00o0, o0O00OOO o0o00ooo) {
        }

        public void onLayoutCompleted(o0O00OOO o0o00ooo) {
        }

        public void onMeasure(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@oo0oO0 RecyclerView recyclerView, @oo0oO0 View view, @o0OO00OO View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(@oo0oO0 RecyclerView recyclerView, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 View view, @o0OO00OO View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @o0OO00OO
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(o0O00OO o0o00oo) {
            if (this.mSmoothScroller == o0o00oo) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, @o0OO00OO Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityAction(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, int i, @o0OO00OO Bundle bundle) {
            int height;
            int width;
            int i2;
            int i3;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@oo0oO0 View view, int i, @o0OO00OO Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 View view, int i, @o0OO00OO Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                o0O0o00O.o0O0oo0O(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.o00oo0O(childCount);
            }
        }

        public void removeAndRecycleAllViews(@oo0oO0 o0O00O0 o0o00o0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, o0o00o0);
                }
            }
        }

        public void removeAndRecycleScrapInt(o0O00O0 o0o00o0) {
            int o00oOoo02 = o0o00o0.o00oOoo0();
            for (int i = o00oOoo02 - 1; i >= 0; i--) {
                View o00oo0OO2 = o0o00o0.o00oo0OO(i);
                o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(o00oo0OO2);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(o00oo0OO2, false);
                    }
                    o00ooO0 o00ooo02 = this.mRecyclerView.mItemAnimator;
                    if (o00ooo02 != null) {
                        o00ooo02.o00oOoo0(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    o0o00o0.o00ooO0O(o00oo0OO2);
                }
            }
            o0o00o0.o00oOo0o();
            if (o00oOoo02 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@oo0oO0 View view, @oo0oO0 o0O00O0 o0o00o0) {
            removeView(view);
            o0o00o0.o00ooOO0(view);
        }

        public void removeAndRecycleViewAt(int i, @oo0oO0 o0O00O0 o0o00o0) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            o0o00o0.o00ooOO0(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@oo0oO0 View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.o00oo0O0(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.o00oo0O(i);
            }
        }

        public boolean requestChildRectangleOnScreen(@oo0oO0 RecyclerView recyclerView, @oo0oO0 View view, @oo0oO0 Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(@oo0oO0 RecyclerView recyclerView, @oo0oO0 View view, @oo0oO0 Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((!z2 || isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, o0O00O0 o0o00o0, o0O00OOO o0o00ooo) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, o0O00O0 o0o00o0, o0O00OOO o0o00ooo) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.o00ooo0O();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i4, i5, i3, i6);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                height = 0;
                this.mWidth = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.mHeight = height;
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, o0O0000O o0o0000o) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) o0o0000o).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) o0o0000o).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, o0O0000O o0o0000o) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) o0o0000o).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) o0o0000o).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, o0O00OOO o0o00ooo, int i) {
        }

        public void startSmoothScroll(o0O00OO o0o00oo) {
            o0O00OO o0o00oo2 = this.mSmoothScroller;
            if (o0o00oo2 != null && o0o00oo != o0o00oo2 && o0o00oo2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = o0o00oo;
            o0o00oo.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@oo0oO0 View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            o0O00OO o0o00oo = this.mSmoothScroller;
            if (o0o00oo != null) {
                o0o00oo.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0000O extends ViewGroup.MarginLayoutParams {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O00oO0 f4144o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Rect f4145o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4146o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4147o00oOooO;

        public o0O0000O(int i, int i2) {
            super(i, i2);
            this.f4145o00oOOoO = new Rect();
            this.f4146o00oOo00 = true;
            this.f4147o00oOooO = false;
        }

        public o0O0000O(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4145o00oOOoO = new Rect();
            this.f4146o00oOo00 = true;
            this.f4147o00oOooO = false;
        }

        public o0O0000O(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4145o00oOOoO = new Rect();
            this.f4146o00oOo00 = true;
            this.f4147o00oOooO = false;
        }

        public o0O0000O(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4145o00oOOoO = new Rect();
            this.f4146o00oOo00 = true;
            this.f4147o00oOooO = false;
        }

        public o0O0000O(o0O0000O o0o0000o) {
            super((ViewGroup.LayoutParams) o0o0000o);
            this.f4145o00oOOoO = new Rect();
            this.f4146o00oOo00 = true;
            this.f4147o00oOooO = false;
        }

        public int o00oOOo0() {
            return this.f4144o00oOOo0.getAbsoluteAdapterPosition();
        }

        public int o00oOOoO() {
            return this.f4144o00oOOo0.getBindingAdapterPosition();
        }

        @Deprecated
        public int o00oOo00() {
            return this.f4144o00oOOo0.getBindingAdapterPosition();
        }

        @Deprecated
        public int o00oOo0O() {
            return this.f4144o00oOOo0.getPosition();
        }

        public boolean o00oOo0o() {
            return this.f4144o00oOOo0.isUpdated();
        }

        public boolean o00oOoO() {
            return this.f4144o00oOOo0.isInvalid();
        }

        public boolean o00oOoO0() {
            return this.f4144o00oOOo0.isRemoved();
        }

        public boolean o00oOoOO() {
            return this.f4144o00oOOo0.needsUpdate();
        }

        public int o00oOooO() {
            return this.f4144o00oOOo0.getLayoutPosition();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o0O000O {
        public abstract boolean o00oOOo0(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class o0O000Oo {
        public void onScrollStateChanged(@oo0oO0 RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@oo0oO0 RecyclerView recyclerView, int i, int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O000o0 {
    }

    /* loaded from: classes.dex */
    public static class o0O00O implements o0OoOoOo {
        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public void o00oOOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public boolean o00oOo00(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public void o00oOo0O(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public final class o0O00O0 {

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4148o00oOoOo = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ArrayList<o0O00oO0> f4149o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ArrayList<o0O00oO0> f4150o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ArrayList<o0O00oO0> f4151o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4152o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4153o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public o0oO0Ooo f4154o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o0O00 f4155o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final List<o0O00oO0> f4157o00oOooO;

        public o0O00O0() {
            ArrayList<o0O00oO0> arrayList = new ArrayList<>();
            this.f4149o00oOOo0 = arrayList;
            this.f4150o00oOOoO = null;
            this.f4151o00oOo00 = new ArrayList<>();
            this.f4157o00oOooO = Collections.unmodifiableList(arrayList);
            this.f4152o00oOo0O = 2;
            this.f4153o00oOo0o = 2;
        }

        public void o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(o0o00oo0);
            View view = o0o00oo0.itemView;
            androidx.recyclerview.widget.o0oO0Ooo o0oo0ooo = RecyclerView.this.mAccessibilityDelegate;
            if (o0oo0ooo != null) {
                o0O000oo.o00oOOoO itemDelegate = o0oo0ooo.getItemDelegate();
                o0O0o00O.o0O0oOo(view, itemDelegate instanceof o0oO0Ooo.o00oOOo0 ? ((o0oO0Ooo.o00oOOo0) itemDelegate).o00oOOo0(view) : null);
            }
            if (z) {
                o00oOoO(o0o00oo0);
            }
            o0o00oo0.mBindingAdapter = null;
            o0o00oo0.mOwnerRecyclerView = null;
            o00oOoOo().o00oOoOo(o0o00oo0);
        }

        public final void o00oOOoO(o0O00oO0 o0o00oo0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = o0o00oo0.itemView;
                if (o0O0o00O.o0O00000(view) == 0) {
                    o0O0o00O.o00oo0OO.o00oo0o0(view, 1);
                }
                androidx.recyclerview.widget.o0oO0Ooo o0oo0ooo = RecyclerView.this.mAccessibilityDelegate;
                if (o0oo0ooo == null) {
                    return;
                }
                o0O000oo.o00oOOoO itemDelegate = o0oo0ooo.getItemDelegate();
                if (itemDelegate instanceof o0oO0Ooo.o00oOOo0) {
                    ((o0oO0Ooo.o00oOOo0) itemDelegate).o00oOOoO(view);
                }
                o0O0o00O.o0O0oOo(view, itemDelegate);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void o00oOo00(@o00oOooO.oo0oO0 android.view.View r8, int r9) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView$o0O00oO0 r8 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r8)
                if (r8 == 0) goto L7f
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o00oOOo0 r0 = r0.mAdapterHelper
                r6 = 0
                int r2 = r0.o00oo0OO(r9, r6)
                if (r2 < 0) goto L5e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o00oo0OO r0 = r0.mAdapter
                int r0 = r0.getItemCount()
                if (r2 >= r0) goto L5e
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r7
                r1 = r8
                r3 = r9
                r0.o00ooOoo(r1, r2, r3, r4)
                android.view.View r9 = r8.itemView
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                if (r9 != 0) goto L35
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r9 = r9.generateDefaultLayoutParams()
                goto L43
            L35:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                boolean r0 = r0.checkLayoutParams(r9)
                if (r0 != 0) goto L4b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r9 = r0.generateLayoutParams(r9)
            L43:
                androidx.recyclerview.widget.RecyclerView$o0O0000O r9 = (androidx.recyclerview.widget.RecyclerView.o0O0000O) r9
                android.view.View r0 = r8.itemView
                r0.setLayoutParams(r9)
                goto L4d
            L4b:
                androidx.recyclerview.widget.RecyclerView$o0O0000O r9 = (androidx.recyclerview.widget.RecyclerView.o0O0000O) r9
            L4d:
                r0 = 1
                r9.f4146o00oOo00 = r0
                r9.f4144o00oOOo0 = r8
                android.view.View r8 = r8.itemView
                android.view.ViewParent r8 = r8.getParent()
                if (r8 != 0) goto L5b
                r6 = r0
            L5b:
                r9.f4147o00oOooO = r6
                return
            L5e:
                java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
                java.lang.String r0 = "Inconsistency detected. Invalid item position "
                java.lang.String r1 = "(offset:"
                java.lang.String r3 = ").state:"
                java.lang.StringBuilder r9 = androidx.recyclerview.widget.o00oo0O0.o00oOOo0(r0, r9, r1, r2, r3)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o0O00OOO r0 = r0.mState
                int r0 = r0.o00oOooO()
                r9.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r9 = androidx.recyclerview.widget.o0O00OOO.o00oOOo0(r0, r9)
                r8.<init>(r9)
                throw r8
            L7f:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                java.lang.StringBuilder r9 = android.support.v4.media.o00oOo0O.o00oOOo0(r9)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r9 = androidx.recyclerview.widget.o0O00OOO.o00oOOo0(r0, r9)
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o0O00O0.o00oOo00(android.view.View, int):void");
        }

        public void o00oOo0O() {
            int size = this.f4151o00oOo00.size();
            for (int i = 0; i < size; i++) {
                this.f4151o00oOo00.get(i).clearOldPosition();
            }
            int size2 = this.f4149o00oOOo0.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4149o00oOOo0.get(i2).clearOldPosition();
            }
            ArrayList<o0O00oO0> arrayList = this.f4150o00oOOoO;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4150o00oOOoO.get(i3).clearOldPosition();
                }
            }
        }

        public void o00oOo0o() {
            this.f4149o00oOOo0.clear();
            ArrayList<o0O00oO0> arrayList = this.f4150o00oOOoO;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public void o00oOoO(@oo0oO0 o0O00oO0 o0o00oo0) {
            o0OoO00O o0ooo00o = RecyclerView.this.mRecyclerListener;
            if (o0ooo00o != null) {
                o0ooo00o.o00oOOo0(o0o00oo0);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i).o00oOOo0(o0o00oo0);
            }
            o00oo0OO o00oo0oo = RecyclerView.this.mAdapter;
            if (o00oo0oo != null) {
                o00oo0oo.onViewRecycled(o0o00oo0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.o00oo0O(o0o00oo0);
            }
        }

        public int o00oOoO0(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.o00oOooO()) {
                return !RecyclerView.this.mState.o00oOoOo() ? i : RecyclerView.this.mAdapterHelper.o00oo0OO(i, 0);
            }
            StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("invalid position ", i, ". State item count is ");
            o00oOOo02.append(RecyclerView.this.mState.o00oOooO());
            throw new IndexOutOfBoundsException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, o00oOOo02));
        }

        public o0O00oO0 o00oOoOO(int i) {
            int size;
            int o00oo0OO2;
            ArrayList<o0O00oO0> arrayList = this.f4150o00oOOoO;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    o0O00oO0 o0o00oo0 = this.f4150o00oOOoO.get(i2);
                    if (!o0o00oo0.wasReturnedFromScrap() && o0o00oo0.getLayoutPosition() == i) {
                        o0o00oo0.addFlags(32);
                        return o0o00oo0;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (o00oo0OO2 = RecyclerView.this.mAdapterHelper.o00oo0OO(i, 0)) > 0 && o00oo0OO2 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(o00oo0OO2);
                    for (int i3 = 0; i3 < size; i3++) {
                        o0O00oO0 o0o00oo02 = this.f4150o00oOOoO.get(i3);
                        if (!o0o00oo02.wasReturnedFromScrap() && o0o00oo02.getItemId() == itemId) {
                            o0o00oo02.addFlags(32);
                            return o0o00oo02;
                        }
                    }
                }
            }
            return null;
        }

        public o0O00 o00oOoOo() {
            if (this.f4155o00oOoO0 == null) {
                this.f4155o00oOoO0 = new o0O00();
            }
            return this.f4155o00oOoO0;
        }

        public int o00oOoo0() {
            return this.f4149o00oOOo0.size();
        }

        public void o00oOooO() {
            this.f4149o00oOOo0.clear();
            o00ooO0o();
        }

        @oo0oO0
        public List<o0O00oO0> o00oOooo() {
            return this.f4157o00oOooO;
        }

        public void o00oo(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f4151o00oOo00.size();
            for (int i7 = 0; i7 < size; i7++) {
                o0O00oO0 o0o00oo0 = this.f4151o00oOo00.get(i7);
                if (o0o00oo0 != null && (i6 = o0o00oo0.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        o0o00oo0.offsetPosition(i2 - i, false);
                    } else {
                        o0o00oo0.offsetPosition(i3, false);
                    }
                }
            }
        }

        public o0O00oO0 o00oo0(int i, boolean z) {
            View o00oOo0O2;
            int size = this.f4149o00oOOo0.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0O00oO0 o0o00oo0 = this.f4149o00oOOo0.get(i2);
                if (!o0o00oo0.wasReturnedFromScrap() && o0o00oo0.getLayoutPosition() == i && !o0o00oo0.isInvalid() && (RecyclerView.this.mState.f4175o00oOoO || !o0o00oo0.isRemoved())) {
                    o0o00oo0.addFlags(32);
                    return o0o00oo0;
                }
            }
            if (z || (o00oOo0O2 = RecyclerView.this.mChildHelper.o00oOo0O(i)) == null) {
                int size2 = this.f4151o00oOo00.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    o0O00oO0 o0o00oo02 = this.f4151o00oOo00.get(i3);
                    if (!o0o00oo02.isInvalid() && o0o00oo02.getLayoutPosition() == i && !o0o00oo02.isAttachedToTransitionOverlay()) {
                        if (!z) {
                            this.f4151o00oOo00.remove(i3);
                        }
                        return o0o00oo02;
                    }
                }
                return null;
            }
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(o00oOo0O2);
            RecyclerView.this.mChildHelper.o00oo0o0(o00oOo0O2);
            int o00oo00O2 = RecyclerView.this.mChildHelper.o00oo00O(o00oOo0O2);
            if (o00oo00O2 != -1) {
                RecyclerView.this.mChildHelper.o00oOooO(o00oo00O2);
                o00ooOOo(o00oOo0O2);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("layout index should not be -1 after unhiding a view:");
            sb.append(childViewHolderInt);
            throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, sb));
        }

        public o0O00oO0 o00oo00O(long j, int i, boolean z) {
            for (int size = this.f4149o00oOOo0.size() - 1; size >= 0; size--) {
                o0O00oO0 o0o00oo0 = this.f4149o00oOOo0.get(size);
                if (o0o00oo0.getItemId() == j && !o0o00oo0.wasReturnedFromScrap()) {
                    if (i == o0o00oo0.getItemViewType()) {
                        o0o00oo0.addFlags(32);
                        if (o0o00oo0.isRemoved() && !RecyclerView.this.mState.o00oOoOo()) {
                            o0o00oo0.setFlags(2, 14);
                        }
                        return o0o00oo0;
                    } else if (!z) {
                        this.f4149o00oOOo0.remove(size);
                        RecyclerView.this.removeDetachedView(o0o00oo0.itemView, false);
                        o00ooO0O(o0o00oo0.itemView);
                    }
                }
            }
            int size2 = this.f4151o00oOo00.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                o0O00oO0 o0o00oo02 = this.f4151o00oOo00.get(size2);
                if (o0o00oo02.getItemId() == j && !o0o00oo02.isAttachedToTransitionOverlay()) {
                    if (i == o0o00oo02.getItemViewType()) {
                        if (!z) {
                            this.f4151o00oOo00.remove(size2);
                        }
                        return o0o00oo02;
                    } else if (!z) {
                        o00ooO(size2);
                        return null;
                    }
                }
            }
        }

        public View o00oo0O(int i, boolean z) {
            return o00ooo00(i, z, Long.MAX_VALUE).itemView;
        }

        @oo0oO0
        public View o00oo0O0(int i) {
            return o00oo0O(i, false);
        }

        public View o00oo0OO(int i) {
            return this.f4149o00oOOo0.get(i).itemView;
        }

        public final void o00oo0Oo(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    o00oo0Oo((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void o00oo0o() {
            int size = this.f4151o00oOo00.size();
            for (int i = 0; i < size; i++) {
                o0O0000O o0o0000o = (o0O0000O) this.f4151o00oOo00.get(i).itemView.getLayoutParams();
                if (o0o0000o != null) {
                    o0o0000o.f4146o00oOo00 = true;
                }
            }
        }

        public final void o00oo0o0(o0O00oO0 o0o00oo0) {
            View view = o0o00oo0.itemView;
            if (view instanceof ViewGroup) {
                o00oo0Oo((ViewGroup) view, false);
            }
        }

        public void o00oo0oO() {
            int size = this.f4151o00oOo00.size();
            for (int i = 0; i < size; i++) {
                o0O00oO0 o0o00oo0 = this.f4151o00oOo00.get(i);
                if (o0o00oo0 != null) {
                    o0o00oo0.addFlags(6);
                    o0o00oo0.addChangePayload(null);
                }
            }
            o00oo0OO o00oo0oo = RecyclerView.this.mAdapter;
            if (o00oo0oo == null || !o00oo0oo.hasStableIds()) {
                o00ooO0o();
            }
        }

        public void o00ooO(int i) {
            o00oOOo0(this.f4151o00oOo00.get(i), true);
            this.f4151o00oOo00.remove(i);
        }

        public void o00ooO0(o00oo0OO o00oo0oo, o00oo0OO o00oo0oo2, boolean z) {
            o00oOooO();
            o00oOoOo().o00oOoOO(o00oo0oo, o00oo0oo2, z);
        }

        public void o00ooO00(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4151o00oOo00.size() - 1; size >= 0; size--) {
                o0O00oO0 o0o00oo0 = this.f4151o00oOo00.get(size);
                if (o0o00oo0 != null) {
                    int i4 = o0o00oo0.mPosition;
                    if (i4 >= i3) {
                        o0o00oo0.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        o0o00oo0.addFlags(8);
                        o00ooO(size);
                    }
                }
            }
        }

        public void o00ooO0O(View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            o00ooOO(childViewHolderInt);
        }

        public void o00ooO0o() {
            for (int size = this.f4151o00oOo00.size() - 1; size >= 0; size--) {
                o00ooO(size);
            }
            this.f4151o00oOo00.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.o00oOOoO();
            }
        }

        public void o00ooOO(o0O00oO0 o0o00oo0) {
            boolean z;
            boolean z2;
            if (o0o00oo0.isScrap() || o0o00oo0.itemView.getParent() != null) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Scrapped or attached views may not be recycled. isScrap:");
                o00oOOo02.append(o0o00oo0.isScrap());
                o00oOOo02.append(" isAttached:");
                o00oOOo02.append(o0o00oo0.itemView.getParent() != null);
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, o00oOOo02));
            } else if (o0o00oo0.isTmpDetached()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(o0o00oo0);
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, sb));
            } else if (o0o00oo0.shouldIgnore()) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, android.support.v4.media.o00oOo0O.o00oOOo0("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            } else {
                boolean doesTransientStatePreventRecycling = o0o00oo0.doesTransientStatePreventRecycling();
                o00oo0OO o00oo0oo = RecyclerView.this.mAdapter;
                if ((o00oo0oo != null && doesTransientStatePreventRecycling && o00oo0oo.onFailedToRecycleView(o0o00oo0)) || o0o00oo0.isRecyclable()) {
                    if (this.f4153o00oOo0o <= 0 || o0o00oo0.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f4151o00oOo00.size();
                        if (size >= this.f4153o00oOo0o && size > 0) {
                            o00ooO(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.o00oOooO(o0o00oo0.mPosition)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (RecyclerView.this.mPrefetchRegistry.o00oOooO(this.f4151o00oOo00.get(size).mPosition));
                            size++;
                        }
                        this.f4151o00oOo00.add(size, o0o00oo0);
                        z = true;
                    }
                    if (!z) {
                        o00oOOo0(o0o00oo0, true);
                        r1 = true;
                    }
                    z2 = r1;
                    r1 = z;
                } else {
                    z2 = false;
                }
                RecyclerView.this.mViewInfoStore.o00oo0O(o0o00oo0);
                if (r1 || z2 || !doesTransientStatePreventRecycling) {
                    return;
                }
                o0o00oo0.mBindingAdapter = null;
                o0o00oo0.mOwnerRecyclerView = null;
            }
        }

        public void o00ooOO0(@oo0oO0 View view) {
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            o00ooOO(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.o00oOoo0(childViewHolderInt);
        }

        public void o00ooOOo(View view) {
            ArrayList<o0O00oO0> arrayList;
            o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f4150o00oOOoO == null) {
                    this.f4150o00oOOoO = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                arrayList = this.f4150o00oOOoO;
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, android.support.v4.media.o00oOo0O.o00oOOo0("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                arrayList = this.f4149o00oOOo0;
            }
            arrayList.add(childViewHolderInt);
        }

        public void o00ooOo(o0oO0Ooo o0oo0ooo) {
            this.f4154o00oOoO = o0oo0ooo;
        }

        public void o00ooOo0(o0O00 o0o00) {
            o0O00 o0o002 = this.f4155o00oOoO0;
            if (o0o002 != null) {
                o0o002.o00oOo00();
            }
            this.f4155o00oOoO0 = o0o00;
            if (o0o00 == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4155o00oOoO0.o00oOOo0();
        }

        public void o00ooOoO(int i) {
            this.f4152o00oOo0O = i;
            o00ooo0O();
        }

        public final boolean o00ooOoo(@oo0oO0 o0O00oO0 o0o00oo0, int i, int i2, long j) {
            o0o00oo0.mBindingAdapter = null;
            o0o00oo0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = o0o00oo0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.f4155o00oOoO0.o00oo0(itemViewType, nanoTime, j)) {
                RecyclerView.this.mAdapter.bindViewHolder(o0o00oo0, i);
                this.f4155o00oOoO0.o00oOooO(o0o00oo0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                o00oOOoO(o0o00oo0);
                if (RecyclerView.this.mState.o00oOoOo()) {
                    o0o00oo0.mPreLayoutPosition = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        public void o00ooo0(o0O00oO0 o0o00oo0) {
            (o0o00oo0.mInChangeScrap ? this.f4150o00oOOoO : this.f4149o00oOOo0).remove(o0o00oo0);
            o0o00oo0.mScrapContainer = null;
            o0o00oo0.mInChangeScrap = false;
            o0o00oo0.clearReturnedFromScrapFlag();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x01f4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01d1  */
        @o00oOooO.o0OO00OO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.o0O00oO0 o00ooo00(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o0O00O0.o00ooo00(int, boolean, long):androidx.recyclerview.widget.RecyclerView$o0O00oO0");
        }

        public void o00ooo0O() {
            o0O00000 o0o00000 = RecyclerView.this.mLayout;
            this.f4153o00oOo0o = this.f4152o00oOo0O + (o0o00000 != null ? o0o00000.mPrefetchMaxCountObserved : 0);
            for (int size = this.f4151o00oOo00.size() - 1; size >= 0 && this.f4151o00oOo00.size() > this.f4153o00oOo0o; size--) {
                o00ooO(size);
            }
        }

        public boolean o00ooo0o(o0O00oO0 o0o00oo0) {
            if (o0o00oo0.isRemoved()) {
                return RecyclerView.this.mState.o00oOoOo();
            }
            int i = o0o00oo0.mPosition;
            if (i < 0 || i >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(o0o00oo0);
                throw new IndexOutOfBoundsException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(RecyclerView.this, sb));
            } else if (RecyclerView.this.mState.o00oOoOo() || RecyclerView.this.mAdapter.getItemViewType(o0o00oo0.mPosition) == o0o00oo0.getItemViewType()) {
                return !RecyclerView.this.mAdapter.hasStableIds() || o0o00oo0.getItemId() == RecyclerView.this.mAdapter.getItemId(o0o00oo0.mPosition);
            } else {
                return false;
            }
        }

        public void o00oooO(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4151o00oOo00.size() - 1; size >= 0; size--) {
                o0O00oO0 o0o00oo0 = this.f4151o00oOo00.get(size);
                if (o0o00oo0 != null && (i3 = o0o00oo0.mPosition) >= i && i3 < i4) {
                    o0o00oo0.addFlags(2);
                    o00ooO(size);
                }
            }
        }

        public void o0O0o(int i, int i2) {
            int size = this.f4151o00oOo00.size();
            for (int i3 = 0; i3 < size; i3++) {
                o0O00oO0 o0o00oo0 = this.f4151o00oOo00.get(i3);
                if (o0o00oo0 != null && o0o00oo0.mPosition >= i) {
                    o0o00oo0.offsetPosition(i2, false);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o0O00O0o extends o00oo0O {
        public o0O00O0o() {
        }

        public void o00oOOo0() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    o0O0o00O.o0O0oo0O(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f4176o00oOoO0 = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.o00oo0O()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.o00oo0o0(i, i2, obj)) {
                o00oOOo0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.o00oo0o(i, i2)) {
                o00oOOo0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.o00oo0oO(i, i2, i3)) {
                o00oOOo0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.o0O0o(i, i2)) {
                o00oOOo0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onStateRestorationPolicyChanged() {
            o00oo0OO o00oo0oo;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (o00oo0oo = recyclerView.mAdapter) == null || !o00oo0oo.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o0O00OO {
        private o0O00000 mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final o00oOOo0 mRecyclingAction = new o00oOOo0(0, 0);

        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOoO  reason: collision with root package name */
            public static final int f4159o00oOoO = Integer.MIN_VALUE;

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public int f4160o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public int f4161o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public int f4162o00oOo00;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public Interpolator f4163o00oOo0O;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public boolean f4164o00oOo0o;

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public int f4165o00oOoO0;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f4166o00oOooO;

            public o00oOOo0(@o0OO0 int i, @o0OO0 int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public o00oOOo0(@o0OO0 int i, @o0OO0 int i2, int i3) {
                this(i, i2, i3, null);
            }

            public o00oOOo0(@o0OO0 int i, @o0OO0 int i2, int i3, @o0OO00OO Interpolator interpolator) {
                this.f4166o00oOooO = -1;
                this.f4164o00oOo0o = false;
                this.f4165o00oOoO0 = 0;
                this.f4160o00oOOo0 = i;
                this.f4161o00oOOoO = i2;
                this.f4162o00oOo00 = i3;
                this.f4163o00oOo0O = interpolator;
            }

            public int o00oOOo0() {
                return this.f4162o00oOo00;
            }

            @o0OO0
            public int o00oOOoO() {
                return this.f4160o00oOOo0;
            }

            @o0OO0
            public int o00oOo00() {
                return this.f4161o00oOOoO;
            }

            public boolean o00oOo0O() {
                return this.f4166o00oOooO >= 0;
            }

            public void o00oOo0o(int i) {
                this.f4166o00oOooO = i;
            }

            public void o00oOoO(int i) {
                this.f4164o00oOo0o = true;
                this.f4162o00oOo00 = i;
            }

            public void o00oOoO0(RecyclerView recyclerView) {
                int i = this.f4166o00oOooO;
                if (i >= 0) {
                    this.f4166o00oOooO = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f4164o00oOo0o = false;
                } else if (!this.f4164o00oOo0o) {
                    this.f4165o00oOoO0 = 0;
                } else {
                    o00oo00O();
                    recyclerView.mViewFlinger.o00oOo0O(this.f4160o00oOOo0, this.f4161o00oOOoO, this.f4162o00oOo00, this.f4163o00oOo0O);
                    this.f4165o00oOoO0++;
                    this.f4164o00oOo0o = false;
                }
            }

            public void o00oOoOO(@o0OO0 int i) {
                this.f4164o00oOo0o = true;
                this.f4160o00oOOo0 = i;
            }

            public void o00oOoOo(@o0OO0 int i) {
                this.f4164o00oOo0o = true;
                this.f4161o00oOOoO = i;
            }

            public void o00oOoo0(@o0OO00OO Interpolator interpolator) {
                this.f4164o00oOo0o = true;
                this.f4163o00oOo0O = interpolator;
            }

            @o0OO00OO
            public Interpolator o00oOooO() {
                return this.f4163o00oOo0O;
            }

            public void o00oOooo(@o0OO0 int i, @o0OO0 int i2, int i3, @o0OO00OO Interpolator interpolator) {
                this.f4160o00oOOo0 = i;
                this.f4161o00oOOoO = i2;
                this.f4162o00oOo00 = i3;
                this.f4163o00oOo0O = interpolator;
                this.f4164o00oOo0o = true;
            }

            public final void o00oo00O() {
                if (this.f4163o00oOo0O != null && this.f4162o00oOo00 < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4162o00oOo00 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* loaded from: classes.dex */
        public interface o00oOOoO {
            @o0OO00OO
            PointF computeScrollVectorForPosition(int i);
        }

        @o0OO00OO
        public PointF computeScrollVectorForPosition(int i) {
            o0O00000 layoutManager = getLayoutManager();
            if (layoutManager instanceof o00oOOoO) {
                return ((o00oOOoO) layoutManager).computeScrollVectorForPosition(i);
            }
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @o0OO00OO
        public o0O00000 getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@oo0oO0 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.o00oOoO0(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean o00oOo0O2 = this.mRecyclingAction.o00oOo0O();
                this.mRecyclingAction.o00oOoO0(recyclerView);
                if (o00oOo0O2 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.o00oOooO();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(@o0OO0 int i, @o0OO0 int i2, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o00oOOo0 o00oooo02);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@oo0oO0 View view, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o00oOOo0 o00oooo02);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, o0O00000 o0o00000) {
            recyclerView.mViewFlinger.o00oOo0o();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = o0o00000;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f4170o00oOOo0 = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.o00oOooO();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f4170o00oOOo0 = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o0O00OOO {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f4167o00oo0Oo = 1;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f4168o00oo0o = 4;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f4169o00oo0o0 = 2;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public SparseArray<Object> f4171o00oOOoO;

        /* renamed from: o00oo0  reason: collision with root package name */
        public long f4182o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f4183o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f4184o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f4185o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public int f4186o00oo0OO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4170o00oOOo0 = -1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4172o00oOo00 = 0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4180o00oOooO = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4173o00oOo0O = 1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4174o00oOo0o = 0;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f4176o00oOoO0 = false;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f4175o00oOoO = false;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f4177o00oOoOO = false;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public boolean f4178o00oOoOo = false;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public boolean f4179o00oOoo0 = false;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f4181o00oOooo = false;

        public void o00oOOo0(int i) {
            if ((this.f4173o00oOo0O & i) != 0) {
                return;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Layout state should be one of ");
            o00oOOo02.append(Integer.toBinaryString(i));
            o00oOOo02.append(" but it is ");
            o00oOOo02.append(Integer.toBinaryString(this.f4173o00oOo0O));
            throw new IllegalStateException(o00oOOo02.toString());
        }

        public boolean o00oOOoO() {
            return this.f4176o00oOoO0;
        }

        public <T> T o00oOo00(int i) {
            SparseArray<Object> sparseArray = this.f4171o00oOOoO;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public int o00oOo0O() {
            return this.f4185o00oo0O0;
        }

        public int o00oOo0o() {
            return this.f4184o00oo0O;
        }

        public boolean o00oOoO() {
            return this.f4170o00oOOo0 != -1;
        }

        public int o00oOoO0() {
            return this.f4170o00oOOo0;
        }

        public boolean o00oOoOO() {
            return this.f4178o00oOoOo;
        }

        public boolean o00oOoOo() {
            return this.f4175o00oOoO;
        }

        public void o00oOoo0(o00oo0OO o00oo0oo) {
            this.f4173o00oOo0O = 1;
            this.f4174o00oOo0o = o00oo0oo.getItemCount();
            this.f4175o00oOoO = false;
            this.f4177o00oOoOO = false;
            this.f4178o00oOoOo = false;
        }

        public int o00oOooO() {
            return this.f4175o00oOoO ? this.f4172o00oOo00 - this.f4180o00oOooO : this.f4174o00oOo0o;
        }

        public void o00oOooo(int i, Object obj) {
            if (this.f4171o00oOOoO == null) {
                this.f4171o00oOOoO = new SparseArray<>();
            }
            this.f4171o00oOOoO.put(i, obj);
        }

        public boolean o00oo0() {
            return this.f4181o00oOooo;
        }

        public void o00oo00O(int i) {
            SparseArray<Object> sparseArray = this.f4171o00oOOoO;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public boolean o00oo0OO() {
            return this.f4179o00oOoo0;
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("State{mTargetPosition=");
            o00oOOo02.append(this.f4170o00oOOo0);
            o00oOOo02.append(", mData=");
            o00oOOo02.append(this.f4171o00oOOoO);
            o00oOOo02.append(", mItemCount=");
            o00oOOo02.append(this.f4174o00oOo0o);
            o00oOOo02.append(", mIsMeasuring=");
            o00oOOo02.append(this.f4178o00oOoOo);
            o00oOOo02.append(", mPreviousLayoutItemCount=");
            o00oOOo02.append(this.f4172o00oOo00);
            o00oOOo02.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            o00oOOo02.append(this.f4180o00oOooO);
            o00oOOo02.append(", mStructureChanged=");
            o00oOOo02.append(this.f4176o00oOoO0);
            o00oOOo02.append(", mInPreLayout=");
            o00oOOo02.append(this.f4175o00oOoO);
            o00oOOo02.append(", mRunSimpleAnimations=");
            o00oOOo02.append(this.f4179o00oOoo0);
            o00oOOo02.append(", mRunPredictiveAnimations=");
            o00oOOo02.append(this.f4181o00oOooo);
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes.dex */
    public class o0O00o00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f4187o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f4188o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public OverScroller f4189o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f4190o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public Interpolator f4191o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f4192o00oo0oO;

        public o0O00o00() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f4191o00oo0o0 = interpolator;
            this.f4190o00oo0o = false;
            this.f4192o00oo0oO = false;
            this.f4189o00oo0Oo = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int o00oOOo0(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public void o00oOOoO(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4187o00oo0O = 0;
            this.f4188o00oo0O0 = 0;
            Interpolator interpolator = this.f4191o00oo0o0;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f4191o00oo0o0 = interpolator2;
                this.f4189o00oo0Oo = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4189o00oo0Oo.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            o00oOooO();
        }

        public final void o00oOo00() {
            RecyclerView.this.removeCallbacks(this);
            o0O0o00O.o0O0oo0O(RecyclerView.this, this);
        }

        public void o00oOo0O(int i, int i2, int i3, @o0OO00OO Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = o00oOOo0(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f4191o00oo0o0 != interpolator) {
                this.f4191o00oo0o0 = interpolator;
                this.f4189o00oo0Oo = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4187o00oo0O = 0;
            this.f4188o00oo0O0 = 0;
            RecyclerView.this.setScrollState(2);
            this.f4189o00oo0Oo.startScroll(0, 0, i, i2, i4);
            o00oOooO();
        }

        public void o00oOo0o() {
            RecyclerView.this.removeCallbacks(this);
            this.f4189o00oo0Oo.abortAnimation();
        }

        public void o00oOooO() {
            if (this.f4190o00oo0o) {
                this.f4192o00oo0oO = true;
            } else {
                o00oOo00();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                o00oOo0o();
                return;
            }
            this.f4192o00oo0oO = false;
            this.f4190o00oo0o = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f4189o00oo0Oo;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4188o00oo0O0;
                int i4 = currY - this.f4187o00oo0O;
                this.f4188o00oo0O0 = currX;
                this.f4187o00oo0O = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    o0O00OO o0o00oo = recyclerView4.mLayout.mSmoothScroller;
                    if (o0o00oo != null && !o0o00oo.isPendingInitialRun() && o0o00oo.isRunning()) {
                        int o00oOooO2 = RecyclerView.this.mState.o00oOooO();
                        if (o00oOooO2 == 0) {
                            o0o00oo.stop();
                        } else {
                            if (o0o00oo.getTargetPosition() >= o00oOooO2) {
                                o0o00oo.setTargetPosition(o00oOooO2 - 1);
                            }
                            o0o00oo.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                o0O00OO o0o00oo2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((o0o00oo2 != null && o0o00oo2.isPendingInitialRun()) || !z) {
                    o00oOooO();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.o0 o0Var = recyclerView7.mGapWorker;
                    if (o0Var != null) {
                        o0Var.o00oOo0o(recyclerView7, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.o00oOOoO();
                    }
                }
            }
            o0O00OO o0o00oo3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (o0o00oo3 != null && o0o00oo3.isPendingInitialRun()) {
                o0o00oo3.onAnimation(0, 0);
            }
            this.f4190o00oo0o = false;
            if (this.f4192o00oo0oO) {
                o00oOo00();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o0O00oO0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @oo0oO0
        public final View itemView;
        public o00oo0OO<? extends o0O00oO0> mBindingAdapter;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public o0O00oO0 mShadowedHolder = null;
        public o0O00oO0 mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public o0O00O0 mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @o0o0000
        public int mPendingAccessibilityState = -1;

        public o0O00oO0(@oo0oO0 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && o0O0o00O.o0O0OOo(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @o0OO00OO
        public final o00oo0OO<? extends o0O00oO0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            o00oo0OO adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !o0O0o00O.o0O0OOo(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((o0O0000O) this.itemView.getLayoutParams()).f4146o00oOo00 = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i == -1) {
                i = o0O0o00O.o0O00000(this.itemView);
            }
            this.mWasImportantForAccessibilityBeforeHidden = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                toString();
                return;
            }
            if (!z && i3 == 1) {
                i = this.mFlags | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.mFlags & (-17);
            }
            this.mFlags = i;
        }

        public void setScrapContainer(o0O00O0 o0o00o0, boolean z) {
            this.mScrapContainer = o0o00o0;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            o00oOOo02.append(Integer.toHexString(hashCode()));
            o00oOOo02.append(" position=");
            o00oOOo02.append(this.mPosition);
            o00oOOo02.append(" id=");
            o00oOOo02.append(this.mItemId);
            o00oOOo02.append(", oldPos=");
            o00oOOo02.append(this.mOldPosition);
            o00oOOo02.append(", pLpos:");
            o00oOOo02.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(o00oOOo02.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(" not recyclable(");
                o00oOOo03.append(this.mIsRecyclableCount);
                o00oOOo03.append(")");
                sb.append(o00oOOo03.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.o00ooo0(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public interface o0O0o {
        int o00oOOo0(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface o0OoO00O {
        void o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0);
    }

    /* loaded from: classes.dex */
    public interface o0OoOoOo {
        void o00oOOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent);

        boolean o00oOo00(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent);

        void o00oOo0O(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class o0oO0Ooo {
        @o0OO00OO
        public abstract View o00oOOo0(@oo0oO0 o0O00O0 o0o00o0, int i, int i2);
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new o00oOo00();
    }

    public RecyclerView(@oo0oO0 Context context) {
        this(context, null);
    }

    public RecyclerView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new o0O00O0o();
        this.mRecycler = new o0O00O0();
        this.mViewInfoStore = new o0O0OO();
        this.mUpdateChildViewsRunnable = new o00oOOo0();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new o00oo();
        this.mItemAnimator = new androidx.recyclerview.widget.o0O0o();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new o0O00o00();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new o0.o00oOOoO() : null;
        this.mState = new o0O00OOO();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new o00ooO();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new o00oOOoO();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new o00oOo0O();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = o0OoOoO.o00oOOoO(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = o0OoOoO.o00oOOo0.o00oOOoO(viewConfiguration);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.o00ooO0o(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (o0O0o00O.o0O00000(this) == 0) {
            o0O0o00O.o00oo0OO.o00oo0o0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.o0oO0Ooo(this));
        int[] iArr = R.styleable.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0O0o00O.o0O0oOo0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        o0O0o00O.o0O0oOo0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    private void addAnimatingView(o0O00oO0 o0o00oo0) {
        View view = o0o00oo0.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.o00ooo0(getChildViewHolder(view));
        if (o0o00oo0.isTmpDetached()) {
            this.mChildHelper.o00oOo00(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.o00oo0 o00oo0Var = this.mChildHelper;
        if (z) {
            o00oo0Var.o00oOoo0(view);
        } else {
            o00oo0Var.o00oOOoO(view, true);
        }
    }

    private void animateChange(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o0O00oO0 o0o00oo02, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o3, boolean z, boolean z2) {
        o0o00oo0.setIsRecyclable(false);
        if (z) {
            addAnimatingView(o0o00oo0);
        }
        if (o0o00oo0 != o0o00oo02) {
            if (z2) {
                addAnimatingView(o0o00oo02);
            }
            o0o00oo0.mShadowedHolder = o0o00oo02;
            addAnimatingView(o0o00oo0);
            this.mRecycler.o00ooo0(o0o00oo0);
            o0o00oo02.setIsRecyclable(false);
            o0o00oo02.mShadowingHolder = o0o00oo0;
        }
        if (this.mItemAnimator.o00oOOoO(o0o00oo0, o0o00oo02, o00ooo0o2, o00ooo0o3)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@oo0oO0 o0O00oO0 o0o00oo0) {
        WeakReference<RecyclerView> weakReference = o0o00oo0.mNestedRecyclerView;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == o0o00oo0.itemView) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                o0o00oo0.mNestedRecyclerView = null;
                return;
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o0O00000.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o0O00000) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        o00oOOoO.C0118o00oOOoO.o00oOOoO(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.o00oOOo0(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4178o00oOoOo = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.o00oOo0o();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        o0O00OOO o0o00ooo = this.mState;
        o0o00ooo.f4177o00oOoOO = (o0o00ooo.f4179o00oOoo0 && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        o0o00ooo.f4175o00oOoO = o0o00ooo.f4181o00oOooo;
        o0o00ooo.f4174o00oOo0o = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4179o00oOoo0) {
            int o00oOoO02 = this.mChildHelper.o00oOoO0();
            for (int i = 0; i < o00oOoO02; i++) {
                o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOo0o(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.o00oOo0O(childViewHolderInt, this.mItemAnimator.o00oo(this.mState, childViewHolderInt, o00ooO0.o00oOo0O(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f4177o00oOoOO && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.o00oOo00(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4181o00oOooo) {
            saveOldPositions();
            o0O00OOO o0o00ooo2 = this.mState;
            boolean z2 = o0o00ooo2.f4176o00oOoO0;
            o0o00ooo2.f4176o00oOoO0 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, o0o00ooo2);
            this.mState.f4176o00oOoO0 = z2;
            for (int i2 = 0; i2 < this.mChildHelper.o00oOoO0(); i2++) {
                o0O00oO0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.o00oOo0o(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.o00oOoOO(childViewHolderInt2)) {
                    int o00oOo0O2 = o00ooO0.o00oOo0O(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        o00oOo0O2 |= 4096;
                    }
                    o00ooO0.o00oOo0O o00oo2 = this.mItemAnimator.o00oo(this.mState, childViewHolderInt2, o00oOo0O2, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, o00oo2);
                    } else {
                        this.mViewInfoStore.o00oOOo0(childViewHolderInt2, o00oo2);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4173o00oOo0O = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.o00oOOo0(6);
        this.mAdapterHelper.o00oOoo0();
        this.mState.f4174o00oOo0o = this.mAdapter.getItemCount();
        this.mState.f4180o00oOooO = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f4103o00oo0O0;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        o0O00OOO o0o00ooo = this.mState;
        o0o00ooo.f4175o00oOoO = false;
        this.mLayout.onLayoutChildren(this.mRecycler, o0o00ooo);
        o0O00OOO o0o00ooo2 = this.mState;
        o0o00ooo2.f4176o00oOoO0 = false;
        o0o00ooo2.f4179o00oOoo0 = o0o00ooo2.f4179o00oOoo0 && this.mItemAnimator != null;
        o0o00ooo2.f4173o00oOo0O = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.o00oOOo0(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        o0O00OOO o0o00ooo = this.mState;
        o0o00ooo.f4173o00oOo0O = 1;
        if (o0o00ooo.f4179o00oOoo0) {
            for (int o00oOoO02 = this.mChildHelper.o00oOoO0() - 1; o00oOoO02 >= 0; o00oOoO02--) {
                o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOo0o(o00oOoO02));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    o00ooO0.o00oOo0O o0O0o2 = this.mItemAnimator.o0O0o(this.mState, childViewHolderInt);
                    o0O00oO0 o00oOoO03 = this.mViewInfoStore.o00oOoO0(changedHolderKey);
                    if (o00oOoO03 != null && !o00oOoO03.shouldIgnore()) {
                        boolean o00oOoO2 = this.mViewInfoStore.o00oOoO(o00oOoO03);
                        boolean o00oOoO3 = this.mViewInfoStore.o00oOoO(childViewHolderInt);
                        if (!o00oOoO2 || o00oOoO03 != childViewHolderInt) {
                            o00ooO0.o00oOo0O o00oo02 = this.mViewInfoStore.o00oo0(o00oOoO03);
                            this.mViewInfoStore.o00oOooO(childViewHolderInt, o0O0o2);
                            o00ooO0.o00oOo0O o00oo00O2 = this.mViewInfoStore.o00oo00O(childViewHolderInt);
                            if (o00oo02 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, o00oOoO03);
                            } else {
                                animateChange(o00oOoO03, childViewHolderInt, o00oo02, o00oo00O2, o00oOoO2, o00oOoO3);
                            }
                        }
                    }
                    this.mViewInfoStore.o00oOooO(childViewHolderInt, o0O0o2);
                }
            }
            this.mViewInfoStore.o00oo0OO(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        o0O00OOO o0o00ooo2 = this.mState;
        o0o00ooo2.f4172o00oOo00 = o0o00ooo2.f4174o00oOo0o;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        o0o00ooo2.f4179o00oOoo0 = false;
        o0o00ooo2.f4181o00oOooo = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<o0O00oO0> arrayList = this.mRecycler.f4150o00oOOoO;
        if (arrayList != null) {
            arrayList.clear();
        }
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000.mPrefetchMaxObservedInInitialPrefetch) {
            o0o00000.mPrefetchMaxCountObserved = 0;
            o0o00000.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o00ooo0O();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.o00oOo0o();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        o0OoOoOo o0oooooo = this.mInterceptingOnItemTouchListener;
        if (o0oooooo == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        o0oooooo.o00oOOo0(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            o0OoOoOo o0oooooo = this.mOnItemTouchListeners.get(i);
            if (o0oooooo.o00oOo00(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = o0oooooo;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        if (o00oOoO02 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < o00oOoO02; i3++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOo0o(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @o0OO00OO
    public static RecyclerView findNestedRecyclerView(@oo0oO0 View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    @o0OO00OO
    private View findNextViewToFocus() {
        o0O00oO0 findViewHolderForAdapterPosition;
        o0O00OOO o0o00ooo = this.mState;
        int i = o0o00ooo.f4183o00oo00O;
        if (i == -1) {
            i = 0;
        }
        int o00oOooO2 = o0o00ooo.o00oOooO();
        for (int i2 = i; i2 < o00oOooO2; i2++) {
            o0O00oO0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(o00oOooO2, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static o0O00oO0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((o0O0000O) view.getLayoutParams()).f4144o00oOOo0;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
        Rect rect2 = o0o0000o.f4145o00oOOoO;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0o0000o).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0o0000o).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0o0000o).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0o0000o).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private o0O000oo.o0O0O0O getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new o0O000oo.o0O0O0O(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, o0O00oO0 o0o00oo0, o0O00oO0 o0o00oo02) {
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        for (int i = 0; i < o00oOoO02; i++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOo0o(i));
            if (childViewHolderInt != o0o00oo0 && getChangedHolderKey(childViewHolderInt) == j) {
                o00oo0OO o00oo0oo = this.mAdapter;
                if (o00oo0oo == null || !o00oo0oo.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(o0o00oo0);
                    throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(o0o00oo0);
                throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, sb2));
            }
        }
        Objects.toString(o0o00oo02);
        Objects.toString(o0o00oo0);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        for (int i = 0; i < o00oOoO02; i++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOo0o(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (o0O0o00O.o0O0000O(this) == 0) {
            o0O0o00O.o0O00000.o00oOooo(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.o00oo0(new o00oOoO());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        } else if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        } else if (i == 17) {
            return i2 < 0;
        } else if (i == 33) {
            return c < 0;
        } else if (i == 66) {
            return i2 > 0;
        } else if (i == 130) {
            return c > 0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid direction: ");
            sb.append(i);
            throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, sb));
        }
    }

    private void nestedScrollByInternal(int i, int i2, @o0OO00OO MotionEvent motionEvent, int i3) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = o0o00000.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        startNestedScroll(canScrollVertically ? canScrollHorizontally | 2 : canScrollHorizontally, i3);
        if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? i : 0, canScrollVertically ? i2 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            i -= iArr2[0];
            i2 -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally != 0 ? i : 0, canScrollVertically ? i2 : 0, motionEvent, i3);
        androidx.recyclerview.widget.o0 o0Var = this.mGapWorker;
        if (o0Var != null && (i != 0 || i2 != 0)) {
            o0Var.o00oOo0o(this, i, i2);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.o00ooO0O();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.o00ooO00();
        } else {
            this.mAdapterHelper.o00oOoo0();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f4179o00oOoo0 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        o0O00OOO o0o00ooo = this.mState;
        if (o0o00ooo.f4179o00oOoo0 && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        o0o00ooo.f4181o00oOooo = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            androidx.core.widget.o00oo0O.o00oOOo0.o00oOOo0(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.o00oo0O.o00oOOo0.o00oOOo0(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.o00oo0O.o00oOOo0.o00oOOo0(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            o0O000oo.o0O0o00O.o0O0o0oO(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.o00oo0(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.o00oOoO0() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        o0O00oO0 findViewHolderForItemId = (this.mState.f4182o00oo0 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f4182o00oo0);
        if (findViewHolderForItemId != null && !this.mChildHelper.o00oo0(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.o00oOoO0() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i = this.mState.f4186o00oo0OO;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    private void requestChildOnScreen(@oo0oO0 View view, @o0OO00OO View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o0O0000O) {
            o0O0000O o0o0000o = (o0O0000O) layoutParams;
            if (!o0o0000o.f4146o00oOo00) {
                Rect rect = o0o0000o.f4145o00oOOoO;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        o0O00OOO o0o00ooo = this.mState;
        o0o00ooo.f4182o00oo0 = -1L;
        o0o00ooo.f4183o00oo00O = -1;
        o0o00ooo.f4186o00oo0OO = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        o0O00oO0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f4182o00oo0 = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f4183o00oo00O = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f4186o00oo0OO = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@o0OO00OO o00oo0OO o00oo0oo, boolean z, boolean z2) {
        o00oo0OO o00oo0oo2 = this.mAdapter;
        if (o00oo0oo2 != null) {
            o00oo0oo2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.o00ooO0O();
        o00oo0OO o00oo0oo3 = this.mAdapter;
        this.mAdapter = o00oo0oo;
        if (o00oo0oo != null) {
            o00oo0oo.registerAdapterDataObserver(this.mObserver);
            o00oo0oo.onAttachedToRecyclerView(this);
        }
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.onAdapterChanged(o00oo0oo3, this.mAdapter);
        }
        this.mRecycler.o00ooO0(o00oo0oo3, this.mAdapter, z);
        this.mState.f4176o00oOoO0 = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.o00oOo0o();
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        o0O0o00O.o0O0o0oO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null || !o0o00000.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@oo0oO0 o0 o0Var) {
        addItemDecoration(o0Var, -1);
    }

    public void addItemDecoration(@oo0oO0 o0 o0Var, int i) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(o0Var);
        } else {
            this.mItemDecorations.add(i, o0Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@oo0oO0 o0O000 o0o000) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(o0o000);
    }

    public void addOnItemTouchListener(@oo0oO0 o0OoOoOo o0oooooo) {
        this.mOnItemTouchListeners.add(o0oooooo);
    }

    public void addOnScrollListener(@oo0oO0 o0O000Oo o0o000oo) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(o0o000oo);
    }

    public void addRecyclerListener(@oo0oO0 o0OoO00O o0ooo00o) {
        ooOOOOoo.o00oOOoO(o0ooo00o != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(o0ooo00o);
    }

    public void animateAppearance(@oo0oO0 o0O00oO0 o0o00oo0, @o0OO00OO o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o3) {
        o0o00oo0.setIsRecyclable(false);
        if (this.mItemAnimator.o00oOOo0(o0o00oo0, o00ooo0o2, o00ooo0o3)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@oo0oO0 o0O00oO0 o0o00oo0, @oo0oO0 o00ooO0.o00oOo0O o00ooo0o2, @o0OO00OO o00ooO0.o00oOo0O o00ooo0o3) {
        addAnimatingView(o0o00oo0);
        o0o00oo0.setIsRecyclable(false);
        if (this.mItemAnimator.o00oOo00(o0o00oo0, o00ooo0o2, o00ooo0o3)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0(str)));
        }
        throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("")));
        }
    }

    public boolean canReuseUpdatedViewHolder(o0O00oO0 o0o00oo0) {
        o00ooO0 o00ooo02 = this.mItemAnimator;
        return o00ooo02 == null || o00ooo02.o00oOoO0(o0o00oo0, o0o00oo0.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o0O0000O) && this.mLayout.checkLayoutParams((o0O0000O) layoutParams);
    }

    public void clearOldPositions() {
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i = 0; i < o00oOoOo2; i++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.o00oOo0O();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<o0O000> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<o0O000Oo> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeHorizontalScrollExtent() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeHorizontalScrollOffset() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeHorizontalScrollRange() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeVerticalScrollExtent() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeVerticalScrollOffset() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    public int computeVerticalScrollRange() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null && o0o00000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            o0O000.o0O00OOO.o00oOOoO(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            o0O00OOO.o00oOOo0.o00oOOoO();
        } else if (this.mAdapterHelper.o00oo0O()) {
            if (this.mAdapterHelper.o00oo0O0(4) && !this.mAdapterHelper.o00oo0O0(11)) {
                o0O000.o0O00OOO.o00oOOoO(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.o00ooO00();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.o00oOoOo();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (!this.mAdapterHelper.o00oo0O()) {
                return;
            } else {
                o0O000.o0O00OOO.o00oOOoO(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            }
            o0O00OOO.o00oOOo0.o00oOOoO();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(o0O00000.chooseSize(i, getPaddingRight() + getPaddingLeft(), o0O0o00O.o0ooOoOO(this)), o0O00000.chooseSize(i2, getPaddingBottom() + getPaddingTop(), o0O0o00O.o00oo0OO.o00oOooO(this)));
    }

    public void dispatchChildAttached(View view) {
        o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        o00oo0OO o00oo0oo = this.mAdapter;
        if (o00oo0oo != null && childViewHolderInt != null) {
            o00oo0oo.onViewAttachedToWindow(childViewHolderInt);
        }
        List<o0O000> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).o00oOooO(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        o00oo0OO o00oo0oo = this.mAdapter;
        if (o00oo0oo != null && childViewHolderInt != null) {
            o00oo0oo.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<o0O000> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).o00oOOoO(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f4178o00oOoOo = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f4173o00oOo0O == 1) {
            dispatchLayoutStep1();
        } else if (!this.mAdapterHelper.o00oo0Oo() && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep3();
        }
        this.mLayout.setExactMeasureSpecsFrom(this);
        dispatchLayoutStep2();
        dispatchLayoutStep3();
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().o00oOOo0(f, f2, z);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().o00oOOoO(f, f2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().o00oOo00(i, i2, iArr, iArr2);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().o00oOooO(i, i2, iArr, iArr2, i3);
    }

    @Override // o0O000oo.o0O00o00
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @oo0oO0 int[] iArr2) {
        getScrollingChildHelper().o00oOo0O(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().o00oOo0o(i, i2, i3, i4, iArr);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().o00oOoO0(i, i2, i3, i4, iArr, i5);
    }

    public void dispatchOnScrollStateChanged(int i) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        o0O000Oo o0o000oo = this.mScrollListener;
        if (o0o000oo != null) {
            o0o000oo.onScrollStateChanged(this, i);
        }
        List<o0O000Oo> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        o0O000Oo o0o000oo = this.mScrollListener;
        if (o0o000oo != null) {
            o0o000oo.onScrolled(this, i, i2);
        }
        List<o0O000Oo> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            o0O00oO0 o0o00oo0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (o0o00oo0.itemView.getParent() == this && !o0o00oo0.shouldIgnore() && (i = o0o00oo0.mPendingAccessibilityState) != -1) {
                o0O0o00O.o0OO00OO(o0o00oo0.itemView, i);
                o0o00oo0.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.o00oo0O()) {
            z3 = z;
        }
        if (z3) {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect o00oOOo02 = this.mEdgeEffectFactory.o00oOOo0(this, 3);
        this.mBottomGlow = o00oOOo02;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        o00oOOo02.setSize(measuredWidth, measuredHeight);
    }

    public void ensureLeftGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect o00oOOo02 = this.mEdgeEffectFactory.o00oOOo0(this, 0);
        this.mLeftGlow = o00oOOo02;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        o00oOOo02.setSize(measuredHeight, measuredWidth);
    }

    public void ensureRightGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect o00oOOo02 = this.mEdgeEffectFactory.o00oOOo0(this, 2);
        this.mRightGlow = o00oOOo02;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        o00oOOo02.setSize(measuredHeight, measuredWidth);
    }

    public void ensureTopGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect o00oOOo02 = this.mEdgeEffectFactory.o00oOOo0(this, 1);
        this.mTopGlow = o00oOOo02;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        o00oOOo02.setSize(measuredWidth, measuredHeight);
    }

    public String exceptionLabel() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" ");
        o00oOOo02.append(super.toString());
        o00oOOo02.append(", adapter:");
        o00oOOo02.append(this.mAdapter);
        o00oOOo02.append(", layout:");
        o00oOOo02.append(this.mLayout);
        o00oOOo02.append(", context:");
        o00oOOo02.append(getContext());
        return o00oOOo02.toString();
    }

    public final void fillRemainingScrollValues(o0O00OOO o0o00ooo) {
        if (getScrollState() != 2) {
            o0o00ooo.f4185o00oo0O0 = 0;
            o0o00ooo.f4184o00oo0O = 0;
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f4189o00oo0Oo;
        o0o00ooo.f4185o00oo0O0 = overScroller.getFinalX() - overScroller.getCurrX();
        o0o00ooo.f4184o00oo0O = overScroller.getFinalY() - overScroller.getCurrY();
    }

    @o0OO00OO
    public View findChildViewUnder(float f, float f2) {
        for (int o00oOoO02 = this.mChildHelper.o00oOoO0() - 1; o00oOoO02 >= 0; o00oOoO02--) {
            View o00oOo0o2 = this.mChildHelper.o00oOo0o(o00oOoO02);
            float translationX = o00oOo0o2.getTranslationX();
            float translationY = o00oOo0o2.getTranslationY();
            if (f >= o00oOo0o2.getLeft() + translationX && f <= o00oOo0o2.getRight() + translationX && f2 >= o00oOo0o2.getTop() + translationY && f2 <= o00oOo0o2.getBottom() + translationY) {
                return o00oOo0o2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(@o00oOooO.oo0oO0 android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @o0OO00OO
    public o0O00oO0 findContainingViewHolder(@oo0oO0 View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @o0OO00OO
    public o0O00oO0 findViewHolderForAdapterPosition(int i) {
        o0O00oO0 o0o00oo0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i2 = 0; i2 < o00oOoOo2; i2++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.o00oo0(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                o0o00oo0 = childViewHolderInt;
            }
        }
        return o0o00oo0;
    }

    public o0O00oO0 findViewHolderForItemId(long j) {
        o00oo0OO o00oo0oo = this.mAdapter;
        o0O00oO0 o0o00oo0 = null;
        if (o00oo0oo != null && o00oo0oo.hasStableIds()) {
            int o00oOoOo2 = this.mChildHelper.o00oOoOo();
            for (int i = 0; i < o00oOoOo2; i++) {
                o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.o00oo0(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    o0o00oo0 = childViewHolderInt;
                }
            }
        }
        return o0o00oo0;
    }

    @o0OO00OO
    public o0O00oO0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @o0OO00OO
    @Deprecated
    public o0O00oO0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.o0O00oO0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.o00oo0 r0 = r5.mChildHelper
            int r0 = r0.o00oOoOo()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.o00oo0 r3 = r5.mChildHelper
            android.view.View r3 = r3.o00oOoOO(r2)
            androidx.recyclerview.widget.RecyclerView$o0O00oO0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.o00oo0 r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.o00oo0(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$o0O00oO0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null || this.mLayoutSuppressed) {
            return false;
        }
        int canScrollHorizontally = o0o00000.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!canScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = canScrollHorizontally != 0 || canScrollVertically;
            dispatchNestedFling(f, f2, z);
            o0O000O o0o000o = this.mOnFlingListener;
            if (o0o000o != null && o0o000o.o00oOOo0(i, i2)) {
                return true;
            }
            if (z) {
                if (canScrollVertically) {
                    canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(canScrollHorizontally, 1);
                int i3 = this.mMaxFlingVelocity;
                int max = Math.max(-i3, Math.min(i, i3));
                int i4 = this.mMaxFlingVelocity;
                this.mViewFlinger.o00oOOoO(max, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            return o0o00000.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            return o0o00000.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @o0OO00OO
    public o00oo0OO getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(o0O00oO0 o0o00oo0) {
        if (o0o00oo0.hasAnyOfTheFlags(524) || !o0o00oo0.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.o00oOo0o(o0o00oo0.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        o0O00000 o0o00000 = this.mLayout;
        return o0o00000 != null ? o0o00000.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(o0O00oO0 o0o00oo0) {
        return this.mAdapter.hasStableIds() ? o0o00oo0.getItemId() : o0o00oo0.mPosition;
    }

    public int getChildAdapterPosition(@oo0oO0 View view) {
        o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        o0O0o o0o0o = this.mChildDrawingOrderCallback;
        return o0o0o == null ? super.getChildDrawingOrder(i, i2) : o0o0o.o00oOOo0(i, i2);
    }

    public long getChildItemId(@oo0oO0 View view) {
        o0O00oO0 childViewHolderInt;
        o00oo0OO o00oo0oo = this.mAdapter;
        if (o00oo0oo == null || !o00oo0oo.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@oo0oO0 View view) {
        o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@oo0oO0 View view) {
        return getChildAdapterPosition(view);
    }

    public o0O00oO0 getChildViewHolder(@oo0oO0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @o0OO00OO
    public androidx.recyclerview.widget.o0oO0Ooo getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@oo0oO0 View view, @oo0oO0 Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @oo0oO0
    public o00oo getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @o0OO00OO
    public o00ooO0 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        o0O0000O o0o0000o = (o0O0000O) view.getLayoutParams();
        if (o0o0000o.f4146o00oOo00) {
            if (this.mState.o00oOoOo() && (o0o0000o.o00oOo0o() || o0o0000o.o00oOoO())) {
                return o0o0000o.f4145o00oOOoO;
            }
            Rect rect = o0o0000o.f4145o00oOOoO;
            rect.set(0, 0, 0, 0);
            int size = this.mItemDecorations.size();
            for (int i = 0; i < size; i++) {
                this.mTempRect.set(0, 0, 0, 0);
                this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
                int i2 = rect.left;
                Rect rect2 = this.mTempRect;
                rect.left = i2 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            o0o0000o.f4146o00oOo00 = false;
            return rect;
        }
        return o0o0000o.f4145o00oOOoO;
    }

    @oo0oO0
    public o0 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @o0OO00OO
    public o0O00000 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @o0OO00OO
    public o0O000O getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @oo0oO0
    public o0O00 getRecycledViewPool() {
        return this.mRecycler.o00oOoOo();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().o00oOoo0();
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().o00oOooo(i);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.o00oo0O();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.o00oOOo0(new o00oo00O(), false);
    }

    @o0o0000
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.o00ooO(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        o00ooO0 o00ooo02 = this.mItemAnimator;
        return o00ooo02 != null && o00ooo02.o00oo0O();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().o00oo00O();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i = 0; i < o00oOoOo2; i++) {
            ((o0O0000O) this.mChildHelper.o00oOoOO(i).getLayoutParams()).f4146o00oOo00 = true;
        }
        this.mRecycler.o00oo0o();
    }

    public void markKnownViewsInvalid() {
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i = 0; i < o00oOoOo2; i++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.o00oo0oO();
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(@o0OO0 int i) {
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        for (int i2 = 0; i2 < o00oOoO02; i2++) {
            this.mChildHelper.o00oOo0o(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@o0OO0 int i) {
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        for (int i2 = 0; i2 < o00oOoO02; i2++) {
            this.mChildHelper.o00oOo0o(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i3 = 0; i3 < o00oOoOo2; i3++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f4176o00oOoO0 = true;
            }
        }
        this.mRecycler.o0O0o(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < o00oOoOo2; i7++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f4176o00oOoO0 = true;
            }
        }
        this.mRecycler.o00oo(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i4 = 0; i4 < o00oOoOo2; i4++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                }
                this.mState.f4176o00oOoO0 = true;
            }
        }
        this.mRecycler.o00ooO00(i, i2, z);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.o0> threadLocal = androidx.recyclerview.widget.o0.f4262o00oo0o;
            androidx.recyclerview.widget.o0 o0Var = threadLocal.get();
            this.mGapWorker = o0Var;
            if (o0Var == null) {
                this.mGapWorker = new androidx.recyclerview.widget.o0();
                Display o00oooo02 = o0O0o00O.o00oooo0(this);
                float f = 60.0f;
                if (!isInEditMode() && o00oooo02 != null) {
                    float refreshRate = o00oooo02.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                androidx.recyclerview.widget.o0 o0Var2 = this.mGapWorker;
                o0Var2.f4266o00oo0Oo = 1.0E9f / f;
                threadLocal.set(o0Var2);
            }
            this.mGapWorker.o00oOOo0(this);
        }
    }

    public void onChildAttachedToWindow(@oo0oO0 View view) {
    }

    public void onChildDetachedFromWindow(@oo0oO0 View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.o0 o0Var;
        super.onDetachedFromWindow();
        o00ooO0 o00ooo02 = this.mItemAnimator;
        if (o00ooo02 != null) {
            o00ooo02.o00oOooo();
        }
        stopScroll();
        this.mIsAttached = false;
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.o00oOoOo();
        if (!ALLOW_THREAD_GAP_WORK || (o0Var = this.mGapWorker) == null) {
            return;
        }
        o0Var.o00oOoOo(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o0O00000 r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o0O00000 r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o0O00000 r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o0O00000 r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o0O00000 r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null) {
            return false;
        }
        boolean canScrollHorizontally = o0o00000.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = canScrollHorizontally;
            if (canScrollVertically) {
                i = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (canScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o0O000.o0O00OOO.o00oOOoO(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        o0O00OOO.o00oOOo0.o00oOOoO();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (o0o00000.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f4173o00oOo0O == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f4178o00oOoOo = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f4178o00oOoOo = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                o0O00OOO o0o00ooo = this.mState;
                if (o0o00ooo.f4181o00oOooo) {
                    o0o00ooo.f4175o00oOoO = true;
                } else {
                    this.mAdapterHelper.o00oOoo0();
                    this.mState.f4175o00oOoO = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f4181o00oOooo) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            o00oo0OO o00oo0oo = this.mAdapter;
            if (o00oo0oo != null) {
                this.mState.f4174o00oOo0o = o00oo0oo.getItemCount();
            } else {
                this.mState.f4174o00oOo0o = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f4175o00oOoO = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f4103o00oo0O0 = savedState2.f4103o00oo0O0;
        } else {
            o0O00000 o0o00000 = this.mLayout;
            savedState.f4103o00oo0O0 = o0o00000 != null ? o0o00000.onSaveInstanceState() : null;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@o0OO0 int i, @o0OO0 int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        o0O0o00O.o0O0oo0O(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(o0O00oO0 o0o00oo0, o00ooO0.o00oOo0O o00ooo0o2) {
        o0o00oo0.setFlags(0, 8192);
        if (this.mState.f4177o00oOoOO && o0o00oo0.isUpdated() && !o0o00oo0.isRemoved() && !o0o00oo0.shouldIgnore()) {
            this.mViewInfoStore.o00oOo00(getChangedHolderKey(o0o00oo0), o0o00oo0);
        }
        this.mViewInfoStore.o00oOo0O(o0o00oo0, o00ooo0o2);
    }

    public void removeAndRecycleViews() {
        o00ooO0 o00ooo02 = this.mItemAnimator;
        if (o00ooo02 != null) {
            o00ooo02.o00oOooo();
        }
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.o00oOooO();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean o00oo0Oo2 = this.mChildHelper.o00oo0Oo(view);
        if (o00oo0Oo2) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.o00ooo0(childViewHolderInt);
            this.mRecycler.o00ooOO(childViewHolderInt);
        }
        stopInterceptRequestLayout(!o00oo0Oo2);
        return o00oo0Oo2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        o0O00oO0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@oo0oO0 o0 o0Var) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            o0o00000.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(o0Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@oo0oO0 o0O000 o0o000) {
        List<o0O000> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(o0o000);
    }

    public void removeOnItemTouchListener(@oo0oO0 o0OoOoOo o0oooooo) {
        this.mOnItemTouchListeners.remove(o0oooooo);
        if (this.mInterceptingOnItemTouchListener == o0oooooo) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@oo0oO0 o0O000Oo o0o000oo) {
        List<o0O000Oo> list = this.mScrollListeners;
        if (list != null) {
            list.remove(o0o000oo);
        }
    }

    public void removeRecyclerListener(@oo0oO0 o0OoO00O o0ooo00o) {
        this.mRecyclerListeners.remove(o0ooo00o);
    }

    public void repositionShadowingViews() {
        o0O00oO0 o0o00oo0;
        int o00oOoO02 = this.mChildHelper.o00oOoO0();
        for (int i = 0; i < o00oOoO02; i++) {
            View o00oOo0o2 = this.mChildHelper.o00oOo0o(i);
            o0O00oO0 childViewHolder = getChildViewHolder(o00oOo0o2);
            if (childViewHolder != null && (o0o00oo0 = childViewHolder.mShadowingHolder) != null) {
                View view = o0o00oo0.itemView;
                int left = o00oOo0o2.getLeft();
                int top = o00oOo0o2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).o00oOo0O(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        for (int i = 0; i < o00oOoOo2; i++) {
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.o00oOoOO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = o0o00000.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !o0O000oo.o0O00OOO.o00oOooo(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, @o0OO00OO int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        o0O000.o0O00OOO.o00oOOoO(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        o0O00OOO.o00oOOo0.o00oOOoO();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null) {
            return;
        }
        o0o00000.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@o0OO00OO androidx.recyclerview.widget.o0oO0Ooo o0oo0ooo) {
        this.mAccessibilityDelegate = o0oo0ooo;
        o0O0o00O.o0O0oOo(this, o0oo0ooo);
    }

    public void setAdapter(@o0OO00OO o00oo0OO o00oo0oo) {
        setLayoutFrozen(false);
        setAdapterInternal(o00oo0oo, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@o0OO00OO o0O0o o0o0o) {
        if (o0o0o == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = o0o0o;
        setChildrenDrawingOrderEnabled(o0o0o != null);
    }

    @o0o0000
    public boolean setChildImportantForAccessibilityInternal(o0O00oO0 o0o00oo0, int i) {
        if (!isComputingLayout()) {
            o0O0o00O.o0OO00OO(o0o00oo0.itemView, i);
            return true;
        }
        o0o00oo0.mPendingAccessibilityState = i;
        this.mPendingAccessibilityImportanceChange.add(o0o00oo0);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@oo0oO0 o00oo o00ooVar) {
        o00ooVar.getClass();
        this.mEdgeEffectFactory = o00ooVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@o0OO00OO o00ooO0 o00ooo02) {
        o00ooO0 o00ooo03 = this.mItemAnimator;
        if (o00ooo03 != null) {
            o00ooo03.o00oOooo();
            this.mItemAnimator.o00ooO0o(null);
        }
        this.mItemAnimator = o00ooo02;
        if (o00ooo02 != null) {
            o00ooo02.o00ooO0o(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.o00ooOoO(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@o0OO00OO o0O00000 o0o00000) {
        if (o0o00000 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            o00ooO0 o00ooo02 = this.mItemAnimator;
            if (o00ooo02 != null) {
                o00ooo02.o00oOooo();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.o00oOooO();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.o00oOooO();
        }
        this.mChildHelper.o00oo0OO();
        this.mLayout = o0o00000;
        if (o0o00000 != null) {
            if (o0o00000.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(o0o00000);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(o0o00000.mRecyclerView, sb));
            }
            o0o00000.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.o00ooo0O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().o00oo0O0(z);
    }

    public void setOnFlingListener(@o0OO00OO o0O000O o0o000o) {
        this.mOnFlingListener = o0o000o;
    }

    @Deprecated
    public void setOnScrollListener(@o0OO00OO o0O000Oo o0o000oo) {
        this.mScrollListener = o0o000oo;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@o0OO00OO o0O00 o0o00) {
        this.mRecycler.o00ooOo0(o0o00);
    }

    @Deprecated
    public void setRecyclerListener(@o0OO00OO o0OoO00O o0ooo00o) {
        this.mRecyclerListener = o0ooo00o;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = (i == 0 || i != 1) ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(@o0OO00OO o0oO0Ooo o0oo0ooo) {
        this.mRecycler.f4154o00oOoO = o0oo0ooo;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int o00oOOo02 = accessibilityEvent != null ? o00oOOoO.C0118o00oOOoO.o00oOOo0(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= o00oOOo02 != 0 ? o00oOOo02 : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(@o0OO0 int i, @o0OO0 int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(@o0OO0 int i, @o0OO0 int i2, @o0OO00OO Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(@o0OO0 int i, @o0OO0 int i2, @o0OO00OO Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(@o0OO0 int i, @o0OO0 int i2, @o0OO00OO Interpolator interpolator, int i3, boolean z) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 == null || this.mLayoutSuppressed) {
            return;
        }
        if (!o0o00000.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.o00oOo0O(i, i2, i3, interpolator);
    }

    public void smoothScrollToPosition(int i) {
        o0O00000 o0o00000;
        if (this.mLayoutSuppressed || (o0o00000 = this.mLayout) == null) {
            return;
        }
        o0o00000.smoothScrollToPosition(this, this.mState, i);
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().o00oo0Oo(i);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().o00oo0o0(i, i2);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void stopNestedScroll() {
        getScrollingChildHelper().o00oo0o();
    }

    @Override // o0O000oo.o0oO0Ooo
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().o00oo0oO(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@o0OO00OO o00oo0OO o00oo0oo, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(o00oo0oo, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int o00oOoOo2 = this.mChildHelper.o00oOoOo();
        int i4 = i + i2;
        for (int i5 = 0; i5 < o00oOoOo2; i5++) {
            View o00oOoOO2 = this.mChildHelper.o00oOoOO(i5);
            o0O00oO0 childViewHolderInt = getChildViewHolderInt(o00oOoOO2);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((o0O0000O) o00oOoOO2.getLayoutParams()).f4146o00oOo00 = true;
            }
        }
        this.mRecycler.o00oooO(i, i2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o0O00000 o0o00000 = this.mLayout;
        if (o0o00000 != null) {
            return o0o00000.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(androidx.recyclerview.widget.o0O00OOO.o00oOOo0(this, android.support.v4.media.o00oOo0O.o00oOOo0("RecyclerView has no LayoutManager")));
    }
}
