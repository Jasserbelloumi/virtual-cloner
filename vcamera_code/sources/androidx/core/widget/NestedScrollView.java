package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O00.o00ooO0;
import o0O000oo.o0O00o00;
import o0O000oo.o0O0O0O;
import o0O000oo.o0O0O0o0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0O0oo0o;
import o0O000oo.o0OooO0;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o0O0oo0o, o0O00o00, o0OooO0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final float f2413o0 = 0.015f;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final float f2414o00oooo = 0.5f;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f2415o00oooo0 = 250;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f2416o00ooooO = "NestedScrollView";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f2417o00ooooo = 250;

    /* renamed from: o0O000  reason: collision with root package name */
    public static final int f2418o0O000 = -1;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final float f2419o0O00000 = 0.35f;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final float f2421o0O0000o = 4.0f;

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f2424o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public long f2425o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final float f2426o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Rect f2427o00oo0Oo;
    @oo0oO0
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oo0o  reason: collision with root package name */
    public EdgeEffect f2428o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public OverScroller f2429o00oo0o0;
    @oo0oO0
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public EdgeEffect f2430o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f2431o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public View f2432o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f2433o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f2434o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public VelocityTracker f2435o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f2436o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f2437o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f2438o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public int f2439o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f2440o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final int[] f2441o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final int[] f2442o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f2443o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f2444o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public SavedState f2445o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public final o0O0O0o0 f2446o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public final o0O0O0O f2447o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public float f2448o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public o00oOo00 f2449o00oooOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f2450o0O0o;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final float f2420o0O0000O = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final o00oOOo0 f2422o0O000O = new o00oOOo0();

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final int[] f2423o0OoOoOo = {16843130};

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f2451o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2451o00oo0O0 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @oo0oO0
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("HorizontalScrollView.SavedState{");
            o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
            o00oOOo02.append(" scrollPosition=");
            return android.support.v4.media.o00oOo00.o00oOOo0(o00oOOo02, this.f2451o00oo0O0, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2451o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O000oo.o00oOOoO {
        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            o00ooO0.o00oOOo0.o00oOo00(accessibilityEvent, nestedScrollView.getScrollX());
            o00ooO0.o00oOOo0.o00oOooO(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o0O00.o00oo0O o00oo0o2) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            o00oo0o2.o0O0Ooo0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            o00oo0o2.o0O0ooo0(true);
            if (nestedScrollView.getScrollY() > 0) {
                o00oo0o2.o00oOOoO(o00oo0O.o00oOOo0.f10053o00oo0o0);
                o00oo0o2.o00oOOoO(o00oo0O.o00oOOo0.f10060o00ooOO);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                o00oo0o2.o00oOOoO(o00oo0O.o00oOOo0.f10051o00oo0Oo);
                o00oo0o2.o00oOOoO(o00oo0O.o00oOOo0.f10064o00ooOo0);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.o00oooOo(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.o00oooOo(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static boolean o00oOOo0(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        void o00oOOo0(@oo0oO0 NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(@oo0oO0 Context context) {
        this(context, null);
    }

    public NestedScrollView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2427o00oo0Oo = new Rect();
        this.f2424o00oo = true;
        this.f2433o00ooO00 = false;
        this.f2432o00ooO0 = null;
        this.f2434o00ooO0O = false;
        this.f2437o00ooOO0 = true;
        this.f2439o00ooOo = -1;
        this.f2441o00ooOoO = new int[2];
        this.f2442o00ooOoo = new int[2];
        this.f2428o00oo0o = o00oo0O.o00oOOo0(context, attributeSet);
        this.f2430o00oo0oO = o00oo0O.o00oOOo0(context, attributeSet);
        this.f2426o00oo0O0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        o00oo0Oo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2423o0OoOoOo, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2446o00ooo0o = new o0O0O0o0(this);
        this.f2447o00oooO = new o0O0O0O(this);
        setNestedScrollingEnabled(true);
        o0O0o00O.o0O0oOo(this, f2422o0O000O);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2448o00oooOO == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2448o00oooOO = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2448o00oooOO;
    }

    public static int o00oOo0O(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public static boolean o00oo(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && o00oo((View) parent, view2);
    }

    @Override // android.view.ViewGroup
    public void addView(@oo0oO0 View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2429o00oo0o0.isFinished()) {
            return;
        }
        this.f2429o00oo0o0.computeScrollOffset();
        int currY = this.f2429o00oo0o0.getCurrY();
        int o00oOoO02 = o00oOoO0(currY - this.f2443o00ooo0);
        this.f2443o00ooo0 = currY;
        int[] iArr = this.f2442o00ooOoo;
        boolean z = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, o00oOoO02, iArr, null, 1);
        int i = o00oOoO02 - this.f2442o00ooOoo[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            o00ooO0o(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.f2442o00ooOoo;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i2, this.f2441o00ooOoO, 1, iArr2);
            i = i2 - this.f2442o00ooOoo[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (this.f2428o00oo0o.isFinished()) {
                        edgeEffect = this.f2428o00oo0o;
                        edgeEffect.onAbsorb((int) this.f2429o00oo0o0.getCurrVelocity());
                    }
                } else if (this.f2430o00oo0oO.isFinished()) {
                    edgeEffect = this.f2430o00oo0oO;
                    edgeEffect.onAbsorb((int) this.f2429o00oo0o0.getCurrVelocity());
                }
            }
            o00oOOo0();
        }
        if (this.f2429o00oo0o0.isFinished()) {
            stopNestedScroll(1);
        } else {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, o0O000oo.o0OooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o00oOoo0(keyEvent);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2447o00oooO.o00oOOo0(f, f2, z);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2447o00oooO.o00oOOoO(f, f2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedPreScroll(int i, int i2, @o0OO00OO int[] iArr, @o0OO00OO int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean dispatchNestedPreScroll(int i, int i2, @o0OO00OO int[] iArr, @o0OO00OO int[] iArr2, int i3) {
        return this.f2447o00oooO.o00oOooO(i, i2, iArr, iArr2, i3);
    }

    @Override // o0O000oo.o0O00o00
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @o0OO00OO int[] iArr, int i5, @oo0oO0 int[] iArr2) {
        this.f2447o00oooO.o00oOo0O(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @o0OO00OO int[] iArr) {
        return this.f2447o00oooO.o00oOo0o(i, i2, i3, i4, iArr);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @o0OO00OO int[] iArr, int i5) {
        return this.f2447o00oooO.o00oOoO0(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.view.View
    public void draw(@oo0oO0 Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f2428o00oo0o.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (o00oOOoO.o00oOOo0(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (o00oOOoO.o00oOOo0(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.f2428o00oo0o.setSize(width, height);
            if (this.f2428o00oo0o.draw(canvas)) {
                o0O0o00O.o0O0o0oO(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f2430o00oo0oO.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (o00oOOoO.o00oOOo0(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = 0 + getPaddingLeft();
        }
        if (o00oOOoO.o00oOOo0(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2430o00oo0oO.setSize(width2, height2);
        if (this.f2430o00oo0oO.draw(canvas)) {
            o0O0o00O.o0O0o0oO(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, o0O000oo.o0O0O0Oo
    public int getNestedScrollAxes() {
        return this.f2446o00ooo0o.o00oOOo0();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean hasNestedScrollingParent(int i) {
        return this.f2447o00oooO.o00oOooo(i);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean isNestedScrollingEnabled() {
        return this.f2447o00oooO.o00oo00O();
    }

    @Override // android.view.ViewGroup
    public void measureChild(@oo0oO0 View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void o00oOOo0() {
        this.f2429o00oo0o0.abortAnimation();
        stopNestedScroll(1);
    }

    public boolean o00oOOoO(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !o00ooO00(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            o00oOoO(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2427o00oo0Oo);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2427o00oo0Oo);
            o00oOoO(o00oOo0o(this.f2427o00oo0Oo));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && o00oo0oO(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    public final boolean o00oOo00() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public int o00oOo0o(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void o00oOoO(int i) {
        if (i != 0) {
            if (this.f2437o00ooOO0) {
                o00ooo00(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public int o00oOoO0(int i) {
        int height = getHeight();
        if (i > 0 && o00oo0O.o00oOooO(this.f2428o00oo0o) != 0.0f) {
            int round = Math.round(o00oo0O.o00oOoOo(this.f2428o00oo0o, ((-i) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i) {
                this.f2428o00oo0o.finish();
            }
            return i - round;
        } else if (i >= 0 || o00oo0O.o00oOooO(this.f2430o00oo0oO) == 0.0f) {
            return i;
        } else {
            float f = height;
            int round2 = Math.round(o00oo0O.o00oOoOo(this.f2430o00oo0oO, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                this.f2430o00oo0oO.finish();
            }
            return i - round2;
        }
    }

    public final boolean o00oOoOO(int i) {
        EdgeEffect edgeEffect;
        if (o00oo0O.o00oOooO(this.f2428o00oo0o) != 0.0f) {
            if (o00ooOoo(this.f2428o00oo0o, i)) {
                edgeEffect = this.f2428o00oo0o;
                edgeEffect.onAbsorb(i);
            } else {
                i = -i;
                o00oo00O(i);
            }
        } else if (o00oo0O.o00oOooO(this.f2430o00oo0oO) == 0.0f) {
            return false;
        } else {
            i = -i;
            if (o00ooOoo(this.f2430o00oo0oO, i)) {
                edgeEffect = this.f2430o00oo0oO;
                edgeEffect.onAbsorb(i);
            }
            o00oo00O(i);
        }
        return true;
    }

    public final void o00oOoOo() {
        this.f2434o00ooO0O = false;
        o00ooOO0();
        stopNestedScroll(0);
        this.f2428o00oo0o.onRelease();
        this.f2430o00oo0oO.onRelease();
    }

    public boolean o00oOoo0(@oo0oO0 KeyEvent keyEvent) {
        this.f2427o00oo0Oo.setEmpty();
        boolean o00oOooO2 = o00oOooO();
        int i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (!o00oOooO2) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? o00oOOoO(33) : o00oo0(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? o00oOOoO(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) : o00oo0(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            } else if (keyCode != 62) {
                return false;
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                o00ooO(i);
                return false;
            }
        } else {
            return false;
        }
    }

    public final boolean o00oOooO() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    public final View o00oOooo(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public boolean o00oo0(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2427o00oo0Oo;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2427o00oo0Oo.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f2427o00oo0Oo;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2427o00oo0Oo;
        return o00ooOo0(i, rect3.top, rect3.bottom);
    }

    public void o00oo00O(int i) {
        if (getChildCount() > 0) {
            this.f2429o00oo0o0.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            o00ooOOo(true);
        }
    }

    public final void o00oo0O() {
        VelocityTracker velocityTracker = this.f2435o00ooO0o;
        if (velocityTracker == null) {
            this.f2435o00ooO0o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final boolean o00oo0O0(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    public final float o00oo0OO(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.f2426o00oo0O0 * 0.015f));
        float f = f2420o0O0000O;
        return (float) (Math.exp((f / (f - 1.0d)) * log) * this.f2426o00oo0O0 * 0.015f);
    }

    public final void o00oo0Oo() {
        this.f2429o00oo0o0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2436o00ooOO = viewConfiguration.getScaledTouchSlop();
        this.f2438o00ooOOo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2440o00ooOo0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public boolean o00oo0o() {
        return this.f2431o00ooO;
    }

    public final void o00oo0o0() {
        if (this.f2435o00ooO0o == null) {
            this.f2435o00ooO0o = VelocityTracker.obtain();
        }
    }

    public final boolean o00oo0oO(View view) {
        return !o00ooO00(view, 0, getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r0.top < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00ooO(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r5 != r2) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            int r3 = r4.getHeight()
            if (r2 == 0) goto L3e
            android.graphics.Rect r1 = r4.f2427o00oo0Oo
            int r2 = r4.getScrollY()
            int r2 = r2 + r3
            r1.top = r2
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L4f
            int r1 = r1 - r0
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r1 = r1 + r0
            android.graphics.Rect r0 = r4.f2427o00oo0Oo
            int r2 = r0.top
            int r2 = r2 + r3
            if (r2 <= r1) goto L4f
            int r1 = r1 - r3
            goto L4d
        L3e:
            android.graphics.Rect r0 = r4.f2427o00oo0Oo
            int r2 = r4.getScrollY()
            int r2 = r2 - r3
            r0.top = r2
            android.graphics.Rect r0 = r4.f2427o00oo0Oo
            int r2 = r0.top
            if (r2 >= 0) goto L4f
        L4d:
            r0.top = r1
        L4f:
            android.graphics.Rect r0 = r4.f2427o00oo0Oo
            int r1 = r0.top
            int r3 = r3 + r1
            r0.bottom = r3
            boolean r5 = r4.o00ooOo0(r5, r1, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.o00ooO(int):boolean");
    }

    public final void o00ooO0(int i, int i2, @o0OO00OO int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2447o00oooO.o00oOo0O(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final boolean o00ooO00(View view, int i, int i2) {
        view.getDrawingRect(this.f2427o00oo0Oo);
        offsetDescendantRectToMyCoords(view, this.f2427o00oo0Oo);
        return this.f2427o00oo0Oo.bottom + i >= getScrollY() && this.f2427o00oo0Oo.top - i <= getScrollY() + i2;
    }

    public final void o00ooO0O(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2439o00ooOo) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2450o0O0o = (int) motionEvent.getY(i);
            this.f2439o00ooOo = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2435o00ooO0o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean o00ooO0o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !hasNestedScrollingParent(1)) {
            this.f2429o00oo0o0.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    public final int o00ooOO(int i, float f) {
        float o00oOoOo2;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (o00oo0O.o00oOooO(this.f2428o00oo0o) != 0.0f) {
            o00oOoOo2 = -o00oo0O.o00oOoOo(this.f2428o00oo0o, -height, width);
            if (o00oo0O.o00oOooO(this.f2428o00oo0o) == 0.0f) {
                edgeEffect = this.f2428o00oo0o;
                edgeEffect.onRelease();
            }
            f2 = o00oOoOo2;
        } else if (o00oo0O.o00oOooO(this.f2430o00oo0oO) != 0.0f) {
            o00oOoOo2 = o00oo0O.o00oOoOo(this.f2430o00oo0oO, height, 1.0f - width);
            if (o00oo0O.o00oOooO(this.f2430o00oo0oO) == 0.0f) {
                edgeEffect = this.f2430o00oo0oO;
                edgeEffect.onRelease();
            }
            f2 = o00oOoOo2;
        }
        int round = Math.round(f2 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    public final void o00ooOO0() {
        VelocityTracker velocityTracker = this.f2435o00ooO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2435o00ooO0o = null;
        }
    }

    public final void o00ooOOo(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f2443o00ooo0 = getScrollY();
        o0O0o00O.o0O0o0oO(this);
    }

    public final void o00ooOo(View view) {
        view.getDrawingRect(this.f2427o00oo0Oo);
        offsetDescendantRectToMyCoords(view, this.f2427o00oo0Oo);
        int o00oOo0o2 = o00oOo0o(this.f2427o00oo0Oo);
        if (o00oOo0o2 != 0) {
            scrollBy(0, o00oOo0o2);
        }
    }

    public final boolean o00ooOo0(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View o00oOooo2 = o00oOooo(z2, i2, i3);
        if (o00oOooo2 == null) {
            o00oOooo2 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            o00oOoO(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (o00oOooo2 != findFocus()) {
            o00oOooo2.requestFocus(i);
        }
        return z;
    }

    public final boolean o00ooOoO(Rect rect, boolean z) {
        int o00oOo0o2 = o00oOo0o(rect);
        boolean z2 = o00oOo0o2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, o00oOo0o2);
            } else {
                o00ooo00(0, o00oOo0o2);
            }
        }
        return z2;
    }

    public final boolean o00ooOoo(@oo0oO0 EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return o00oo0OO(-i) < o00oo0O.o00oOooO(edgeEffect) * ((float) getHeight());
    }

    public final void o00ooo0(int i, int i2, int i3) {
        o00ooo0O(i, i2, i3, false);
    }

    public final void o00ooo00(int i, int i2) {
        o00ooo0O(i, i2, 250, false);
    }

    public final void o00ooo0O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2425o00oo0O > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2429o00oo0o0;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            o00ooOOo(z);
        } else {
            if (!this.f2429o00oo0o0.isFinished()) {
                o00oOOo0();
            }
            scrollBy(i, i2);
        }
        this.f2425o00oo0O = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void o00ooo0o(int i, int i2) {
        o00oooOO(i, i2, 250, false);
    }

    public final void o00oooO(int i, int i2, int i3) {
        o00oooOO(i, i2, i3, false);
    }

    public void o00oooOO(int i, int i2, int i3, boolean z) {
        o00ooo0O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void o00oooOo(int i, int i2, boolean z) {
        o00oooOO(i, i2, 250, z);
    }

    public final boolean o00oooo0(MotionEvent motionEvent) {
        boolean z;
        if (o00oo0O.o00oOooO(this.f2428o00oo0o) != 0.0f) {
            o00oo0O.o00oOoOo(this.f2428o00oo0o, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (o00oo0O.o00oOooO(this.f2430o00oo0oO) != 0.0f) {
            o00oo0O.o00oOoOo(this.f2430o00oo0oO, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public boolean o0O0o() {
        return this.f2437o00ooOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2433o00ooO00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(@o00oOooO.oo0oO0 android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto La6
            boolean r0 = r8.f2434o00ooO0O
            if (r0 != 0) goto La6
            r0 = 2
            boolean r0 = o0O000oo.o0O00OOO.o00oOooo(r9, r0)
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 9
        L17:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = o0O000oo.o0O00OOO.o00oOooo(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
            goto L17
        L27:
            r0 = r2
        L28:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto La6
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L6d
            boolean r2 = r8.o00oOo00()
            if (r2 == 0) goto L51
            boolean r9 = o0O000oo.o0O00OOO.o00oOooo(r9, r5)
            if (r9 != 0) goto L51
            r9 = r6
            goto L52
        L51:
            r9 = r1
        L52:
            if (r9 == 0) goto L6b
            android.widget.EdgeEffect r9 = r8.f2428o00oo0o
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.o00oo0O.o00oOoOo(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2428o00oo0o
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L9b
        L6b:
            r9 = r1
            goto L9b
        L6d:
            if (r0 <= r2) goto L99
            boolean r7 = r8.o00oOo00()
            if (r7 == 0) goto L7d
            boolean r9 = o0O000oo.o0O00OOO.o00oOooo(r9, r5)
            if (r9 != 0) goto L7d
            r9 = r6
            goto L7e
        L7d:
            r9 = r1
        L7e:
            if (r9 == 0) goto L96
            android.widget.EdgeEffect r9 = r8.f2430o00oo0oO
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.o00oo0O.o00oOoOo(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2430o00oo0oO
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L96:
            r9 = r1
            r1 = r2
            goto L9b
        L99:
            r9 = r1
            r1 = r0
        L9b:
            if (r1 == r3) goto La5
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        La5:
            return r9
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@oo0oO0 MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f2434o00ooO0O) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2439o00ooOo;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.f2450o0O0o) > this.f2436o00ooOO && (2 & getNestedScrollAxes()) == 0) {
                            this.f2434o00ooO0O = true;
                            this.f2450o0O0o = y;
                            o00oo0o0();
                            this.f2435o00ooO0o.addMovement(motionEvent);
                            this.f2444o00ooo00 = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        o00ooO0O(motionEvent);
                    }
                }
            }
            this.f2434o00ooO0O = false;
            this.f2439o00ooOo = -1;
            o00ooOO0();
            if (this.f2429o00oo0o0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                o0O0o00O.o0O0o0oO(this);
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (o00oo0O0((int) motionEvent.getX(), y2)) {
                this.f2450o0O0o = y2;
                this.f2439o00ooOo = motionEvent.getPointerId(0);
                o00oo0O();
                this.f2435o00ooO0o.addMovement(motionEvent);
                this.f2429o00oo0o0.computeScrollOffset();
                if (!o00oooo0(motionEvent) && this.f2429o00oo0o0.isFinished()) {
                    z = false;
                }
                this.f2434o00ooO0O = z;
                startNestedScroll(2, 0);
            } else {
                if (!o00oooo0(motionEvent) && this.f2429o00oo0o0.isFinished()) {
                    z = false;
                }
                this.f2434o00ooO0O = z;
                o00ooOO0();
            }
        }
        return this.f2434o00ooO0O;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2424o00oo = false;
        View view = this.f2432o00ooO0;
        if (view != null && o00oo(view, this)) {
            o00ooOo(this.f2432o00ooO0);
        }
        this.f2432o00ooO0 = null;
        if (!this.f2433o00ooO00) {
            if (this.f2445o00ooo0O != null) {
                scrollTo(getScrollX(), this.f2445o00ooo0O.f2451o00oo0O0);
                this.f2445o00ooo0O = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int o00oOo0O2 = o00oOo0O(scrollY, paddingTop, i5);
            if (o00oOo0O2 != scrollY) {
                scrollTo(getScrollX(), o00oOo0O2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2433o00ooO00 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2431o00ooO && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedFling(@oo0oO0 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        o00oo00O((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onNestedPreFling(@oo0oO0 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedPreScroll(@oo0oO0 View view, int i, int i2, @oo0oO0 int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedPreScroll(@oo0oO0 View view, int i, int i2, @oo0oO0 int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScroll(@oo0oO0 View view, int i, int i2, int i3, int i4) {
        o00ooO0(i4, 0, null);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScroll(@oo0oO0 View view, int i, int i2, int i3, int i4, int i5) {
        o00ooO0(i4, i5, null);
    }

    @Override // o0O000oo.o0O0oo0o
    public void onNestedScroll(@oo0oO0 View view, int i, int i2, int i3, int i4, int i5, @oo0oO0 int[] iArr) {
        o00ooO0(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onNestedScrollAccepted(@oo0oO0 View view, @oo0oO0 View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onNestedScrollAccepted(@oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
        this.f2446o00ooo0o.o00oOo00(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || o00oo0oO(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2445o00ooo0O = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @oo0oO0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2451o00oo0O0 = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        o00oOo00 o00ooo002 = this.f2449o00oooOo;
        if (o00ooo002 != null) {
            o00ooo002.o00oOOo0(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !o00ooO00(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f2427o00oo0Oo);
        offsetDescendantRectToMyCoords(findFocus, this.f2427o00oo0Oo);
        o00oOoO(o00oOo0o(this.f2427o00oo0Oo));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public boolean onStartNestedScroll(@oo0oO0 View view, @oo0oO0 View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public boolean onStartNestedScroll(@oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o0O000oo.o0O0O0Oo
    public void onStopNestedScroll(@oo0oO0 View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // o0O000oo.o0oO0O0o
    public void onStopNestedScroll(@oo0oO0 View view, int i) {
        this.f2446o00ooo0o.o00oOo0O(view, i);
        stopNestedScroll(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r23.f2429o00oo0o0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        o0O000oo.o0O0o00O.o0O0o0oO(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0203, code lost:
        if (r23.f2429o00oo0o0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@o00oOooO.oo0oO0 android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2424o00oo) {
            this.f2432o00ooO0 = view2;
        } else {
            o00ooOo(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@oo0oO0 View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return o00ooOoO(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            o00ooOO0();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2424o00oo = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int o00oOo0O2 = o00oOo0O(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int o00oOo0O3 = o00oOo0O(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (o00oOo0O2 == getScrollX() && o00oOo0O3 == getScrollY()) {
                return;
            }
            super.scrollTo(o00oOo0O2, o00oOo0O3);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2431o00ooO) {
            this.f2431o00ooO = z;
            requestLayout();
        }
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void setNestedScrollingEnabled(boolean z) {
        this.f2447o00oooO.o00oo0O0(z);
    }

    public void setOnScrollChangeListener(@o0OO00OO o00oOo00 o00ooo002) {
        this.f2449o00oooOo = o00ooo002;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2437o00ooOO0 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // o0O000oo.o0oO0Ooo
    public boolean startNestedScroll(int i, int i2) {
        return this.f2447o00oooO.o00oo0o0(i, i2);
    }

    @Override // android.view.View, o0O000oo.o0O00oO0
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // o0O000oo.o0oO0Ooo
    public void stopNestedScroll(int i) {
        this.f2447o00oooO.o00oo0oO(i);
    }
}
