package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.common.collect.LinkedHashMultimap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O00.o00ooO;
import o0O0000O.o00oOOo0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
import o0O00O.o00oOo0O;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.o00oOo00<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    public int activePointerId;
    @oo0oO0
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    public int collapsedOffset;
    private final o00oOo0O.o00oOo00 dragCallback;
    private boolean draggable;
    public float elevation;
    private int expandHalfwayActionId;
    public int expandedOffset;
    private boolean fitToContents;
    public int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public boolean hideable;
    private boolean ignoreEvents;
    @o0OO00OO
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    @o0OO00OO
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    @o0OO00OO
    public WeakReference<View> nestedScrollingChildRef;
    public int parentHeight;
    public int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    public int state;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    @o0OO00OO
    private VelocityTracker velocityTracker;
    @o0OO00OO
    public o00oOo0O viewDragHelper;
    @o0OO00OO
    public WeakReference<V> viewRef;

    /* loaded from: classes2.dex */
    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@oo0oO0 View view, float f);

        public abstract void onStateChanged(@oo0oO0 View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface SaveFlags {
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @o0OO00OO
            public SavedState createFromParcel(@oo0oO0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @oo0oO0
            public SavedState createFromParcel(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @oo0oO0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        public SavedState(@oo0oO0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        public SavedState(Parcelable parcelable, @oo0oO0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public class SettleRunnable implements Runnable {
        private boolean isPosted;
        public int targetState;
        private final View view;

        public SettleRunnable(View view, int i) {
            this.view = view;
            this.targetState = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O o00ooo0o2 = BottomSheetBehavior.this.viewDragHelper;
            if (o00ooo0o2 == null || !o00ooo0o2.o00oo0OO(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                o0O0o00O.o0O0oo0O(this.view, this);
            }
            this.isPosted = false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface State {
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new o00oOo0O.o00oOo00() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private boolean releasedLow(@oo0oO0 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int clampViewPositionHorizontal(@oo0oO0 View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int clampViewPositionVertical(@oo0oO0 View view, int i, int i2) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return o00oOOo0.o00oOo0O(i, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int getViewVerticalDragRange(@oo0oO0 View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public void onViewPositionChanged(@oo0oO0 View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
                if (java.lang.Math.abs(r7.getTop() - r6.this$0.expandedOffset) < java.lang.Math.abs(r7.getTop() - r6.this$0.halfExpandedOffset)) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
                r8 = r6.this$0.expandedOffset;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
                if (java.lang.Math.abs(r8 - r6.this$0.halfExpandedOffset) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
                if (java.lang.Math.abs(r8 - r6.this$0.fitToContentsOffset) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
                if (r8 < java.lang.Math.abs(r8 - r9.collapsedOffset)) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
                if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L31;
             */
            @Override // o0O00O.o00oOo0O.o00oOo00
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(@o00oOooO.oo0oO0 android.view.View r7, float r8, float r9) {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public boolean tryCaptureView(@oo0oO0 View view, int i) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    public BottomSheetBehavior(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new o00oOo0O.o00oOo00() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private boolean releasedLow(@oo0oO0 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int clampViewPositionHorizontal(@oo0oO0 View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int clampViewPositionVertical(@oo0oO0 View view, int i2, int i22) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return o00oOOo0.o00oOo0O(i2, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public int getViewVerticalDragRange(@oo0oO0 View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public void onViewPositionChanged(@oo0oO0 View view, int i2, int i22, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i22);
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(@o00oOooO.oo0oO0 android.view.View r7, float r8, float r9) {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // o0O00O.o00oOo0O.o00oOo00
            public boolean tryCaptureView(@oo0oO0 View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i22 = bottomSheetBehavior.state;
                if (i22 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i22 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, MaterialResources.getColorStateList(context, obtainStyledAttributes, i2));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i4 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        setExpandedOffset((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i4, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(V v, @o0OOO0O int i, int i2) {
        return o0O0o00O.o00oOo00(v, v.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) : (this.gestureInsetBottomIgnored || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private o00ooO createAccessibilityViewCommandForState(final int i) {
        return new o00ooO() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // o0O00.o00ooO
            public boolean perform(@oo0oO0 View view, @o0OO00OO o00ooO.o00oOOo0 o00oooo02) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawable(@oo0oO0 Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    private void createMaterialShapeDrawable(@oo0oO0 Context context, AttributeSet attributeSet, boolean z, @o0OO00OO ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@oo0oO0 ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @oo0oO0
    public static <V extends View> BottomSheetBehavior<V> from(@oo0oO0 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.o00oo0) {
            CoordinatorLayout.o00oOo00 o00oOo0o2 = ((CoordinatorLayout.o00oo0) layoutParams).o00oOo0o();
            if (o00oOo0o2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) o00oOo0o2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void replaceAccessibilityActionForState(V v, o00oo0O.o00oOOo0 o00oooo02, int i) {
        o0O0o00O.o0O0oO(v, o00oooo02, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@oo0oO0 SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void setSystemGestureInsets(@oo0oO0 View view) {
        if (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public o0OOo000 onApplyWindowInsets(View view2, o0OOo000 o0ooo000, ViewUtils.RelativePadding relativePadding) {
                BottomSheetBehavior.this.gestureInsetBottom = o0ooo000.o00oOoO().f9794o00oOooO;
                BottomSheetBehavior.this.updatePeekHeight(false);
                return o0ooo000;
            }
        });
    }

    private void settleToStatePendingLayout(final int i) {
        final V v = this.viewRef.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && o0O0o00O.o0O0OOoo(v)) {
            v.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.settleToState(v, i);
                }
            });
        } else {
            settleToState(v, i);
        }
    }

    private void updateAccessibilityActions() {
        V v;
        int i;
        o00oo0O.o00oOOo0 o00oooo02;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        o0O0o00O.o0O0oO0(v, 524288);
        o0O0o00O.o0O0oO0(v, 262144);
        o0O0o00O.o0O0oO0(v, 1048576);
        int i2 = this.expandHalfwayActionId;
        if (i2 != -1) {
            o0O0o00O.o0O0oO0(v, i2);
        }
        if (this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v, R.string.bottomsheet_action_expand_halfway, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v, o00oo0O.o00oOOo0.f10058o00ooO0O, 5);
        }
        int i3 = this.state;
        if (i3 == 3) {
            i = this.fitToContents ? 4 : 6;
            o00oooo02 = o00oo0O.o00oOOo0.f10056o00ooO0;
        } else if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            replaceAccessibilityActionForState(v, o00oo0O.o00oOOo0.f10056o00ooO0, 4);
            replaceAccessibilityActionForState(v, o00oo0O.o00oOOo0.f10057o00ooO00, 3);
            return;
        } else {
            i = this.fitToContents ? 3 : 6;
            o00oooo02 = o00oo0O.o00oOOo0.f10057o00ooO00;
        }
        replaceAccessibilityActionForState(v, o00oooo02, i);
    }

    private void updateDrawableForTargetState(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f, f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                }
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            intValue = 4;
                            o0O0o00O.o0OO00OO(childAt, intValue);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        o0O0o00O.o0OO00OO(childAt, intValue);
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                settleToStatePendingLayout(this.state);
            } else {
                v.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@oo0oO0 BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        float f;
        float f2;
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            f2 = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            f2 = i4 - getExpandedOffset();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
            this.callbacks.get(i5).onSlide(v, f3);
        }
    }

    @o0OO00OO
    @o0o0000
    public View findScrollingChild(View view) {
        if (o0O0o00O.oo0OOoo(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
            return null;
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @o0o0000
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public void onAttachedToLayoutParams(@oo0oO0 CoordinatorLayout.o00oo0 o00oo0Var) {
        super.onAttachedToLayoutParams(o00oo0Var);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onInterceptTouchEvent(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 MotionEvent motionEvent) {
        o00oOo0O o00ooo0o2;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (this.ignoreEvents || (o00ooo0o2 = this.viewDragHelper) == null || !o00ooo0o2.o0O0000O(motionEvent)) {
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.o00ooOOo())) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onLayoutChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, int i) {
        int i2;
        MaterialShapeDrawable materialShapeDrawable;
        if (o0O0o00O.o0(coordinatorLayout) && !o0O0o00O.o00oo0OO.o00oOOoO(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setSystemGestureInsets(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (materialShapeDrawable = this.materialShapeDrawable) != null) {
                o0O0o00O.o00oo0OO.o00oo0O(v, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            if (materialShapeDrawable2 != null) {
                float f = this.elevation;
                if (f == -1.0f) {
                    f = o0O0o00O.o00ooO0.o00oOoOO(v);
                }
                materialShapeDrawable2.setElevation(f);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (o0O0o00O.o00oo0OO.o00oOo00(v) == 0) {
                o0O0o00O.o00oo0OO.o00oo0o0(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = o00oOo0O.o00oo0O(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        this.fitToContentsOffset = Math.max(0, this.parentHeight - height);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i3 = this.state;
        if (i3 == 3) {
            i2 = getExpandedOffset();
        } else if (i3 == 6) {
            i2 = this.halfExpandedOffset;
        } else if (this.hideable && i3 == 5) {
            i2 = this.parentHeight;
        } else if (i3 != 4) {
            if (i3 == 1 || i3 == 2) {
                v.offsetTopAndBottom(top - v.getTop());
            }
            this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
            return true;
        } else {
            i2 = this.collapsedOffset;
        }
        v.offsetTopAndBottom(i2);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onNestedPreFling(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public void onNestedPreScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, @oo0oO0 int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                o0O0o00O.o0O0o00o(v, -expandedOffset);
                i4 = 3;
                setStateInternal(i4);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i2;
                o0O0o00O.o0O0o00o(v, -i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.collapsedOffset;
            if (i5 > i6 && !this.hideable) {
                int i7 = top - i6;
                iArr[1] = i7;
                o0O0o00O.o0O0o00o(v, -i7);
                i4 = 4;
                setStateInternal(i4);
            } else if (!this.draggable) {
                return;
            } else {
                iArr[1] = i2;
                o0O0o00O.o0O0o00o(v, -i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public void onNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, int i, int i2, int i3, int i4, int i5, @oo0oO0 int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public void onRestoreInstanceState(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        this.state = (i == 1 || i == 2) ? 4 : 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    @oo0oO0
    public Parcelable onSaveInstanceState(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onStartNestedScroll(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L40;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(@o00oOooO.oo0oO0 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @o00oOooO.oo0oO0 V r4, @o00oOooO.oo0oO0 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb1
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L1f
            goto Lb1
        L1f:
            int r3 = r2.lastNestedScrollDy
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2d
        L29:
            int r3 = r2.fitToContentsOffset
            goto Lab
        L2d:
            int r3 = r4.getTop()
            int r5 = r2.halfExpandedOffset
            if (r3 <= r5) goto L38
            r3 = r5
            goto Laa
        L38:
            int r3 = r2.expandedOffset
            goto Lab
        L3c:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L4e
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L4e
            int r3 = r2.parentHeight
            r0 = 5
            goto Lab
        L4e:
            int r3 = r2.lastNestedScrollDy
            if (r3 != 0) goto L8b
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L6c
            int r6 = r2.fitToContentsOffset
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L8f
            goto L29
        L6c:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7b
            int r5 = r2.collapsedOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto La8
            goto L38
        L7b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
            goto La8
        L8b:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L93
        L8f:
            int r3 = r2.collapsedOffset
            r0 = r5
            goto Lab
        L93:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
        La8:
            int r3 = r2.halfExpandedOffset
        Laa:
            r0 = r6
        Lab:
            r5 = 0
            r2.startSettlingAnimation(r4, r0, r3, r5)
            r2.nestedScrolled = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onTouchEvent(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.state == 1 && actionMasked == 0) {
                return true;
            }
            o00oOo0O o00ooo0o2 = this.viewDragHelper;
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00ooo0o(motionEvent);
            }
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (this.viewDragHelper != null && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.o00ooOOo()) {
                this.viewDragHelper.o00oOooO(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.ignoreEvents;
        }
        return false;
    }

    public void removeBottomSheetCallback(@oo0oO0 BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(@o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            }
            z2 = false;
        } else {
            if (this.peekHeightAuto || this.peekHeight != i) {
                this.peekHeightAuto = false;
                this.peekHeight = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            updatePeekHeight(z);
        }
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef != null) {
            settleToStatePendingLayout(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.state = i;
        }
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void settleToState(@oo0oO0 View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.collapsedOffset;
        } else if (i == 6) {
            int i4 = this.halfExpandedOffset;
            if (!this.fitToContents || i4 > (i3 = this.fitToContentsOffset)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (!this.hideable || i != 5) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Illegal state argument: ", i));
        } else {
            i2 = this.parentHeight;
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public boolean shouldHide(@oo0oO0 View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        o00oOo0O o00ooo0o2 = this.viewDragHelper;
        if (!(o00ooo0o2 != null && (!z ? !o00ooo0o2.o0O0000o(view, view.getLeft(), i2) : !o00ooo0o2.o0O00000(view.getLeft(), i2)))) {
            setStateInternal(i);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i);
        if (this.settleRunnable == null) {
            this.settleRunnable = new SettleRunnable(view, i);
        }
        if (((SettleRunnable) this.settleRunnable).isPosted) {
            this.settleRunnable.targetState = i;
            return;
        }
        BottomSheetBehavior<V>.SettleRunnable settleRunnable = this.settleRunnable;
        settleRunnable.targetState = i;
        o0O0o00O.o0O0oo0O(view, settleRunnable);
        ((SettleRunnable) this.settleRunnable).isPosted = true;
    }
}
