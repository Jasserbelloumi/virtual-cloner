package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00000;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o0O00000 implements o0O00000.o00oo0O, RecyclerView.o0O00OO.o00oOOoO {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final o00oOOo0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final o00oOOoO mLayoutChunkResult;
    private o00oOo00 mLayoutState;
    public int mOrientation;
    public o0O00O mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f4071o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f4072o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f4073o00oo0Oo;

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

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f4072o00oo0O0 = parcel.readInt();
            this.f4071o00oo0O = parcel.readInt();
            this.f4073o00oo0Oo = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f4072o00oo0O0 = savedState.f4072o00oo0O0;
            this.f4071o00oo0O = savedState.f4071o00oo0O;
            this.f4073o00oo0Oo = savedState.f4073o00oo0Oo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean o00oOOo0() {
            return this.f4072o00oo0O0 >= 0;
        }

        public void o00oOOoO() {
            this.f4072o00oo0O0 = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4072o00oo0O0);
            parcel.writeInt(this.f4071o00oo0O);
            parcel.writeInt(this.f4073o00oo0Oo ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O00O f4074o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4075o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4076o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f4077o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4078o00oOooO;

        public o00oOOo0() {
            o00oOo0O();
        }

        public void o00oOOo0() {
            this.f4076o00oOo00 = this.f4078o00oOooO ? this.f4074o00oOOo0.o00oOoOO() : this.f4074o00oOOo0.o00oo0();
        }

        public void o00oOOoO(View view, int i) {
            if (this.f4078o00oOooO) {
                this.f4076o00oOo00 = this.f4074o00oOOo0.o00oo0O0() + this.f4074o00oOOo0.o00oOooO(view);
            } else {
                this.f4076o00oOo00 = this.f4074o00oOOo0.o00oOoO0(view);
            }
            this.f4075o00oOOoO = i;
        }

        public void o00oOo00(View view, int i) {
            int min;
            int o00oo0O02 = this.f4074o00oOOo0.o00oo0O0();
            if (o00oo0O02 >= 0) {
                o00oOOoO(view, i);
                return;
            }
            this.f4075o00oOOoO = i;
            if (this.f4078o00oOooO) {
                int o00oOoOO2 = (this.f4074o00oOOo0.o00oOoOO() - o00oo0O02) - this.f4074o00oOOo0.o00oOooO(view);
                this.f4076o00oOo00 = this.f4074o00oOOo0.o00oOoOO() - o00oOoOO2;
                if (o00oOoOO2 <= 0) {
                    return;
                }
                int o00oOo0O2 = this.f4076o00oOo00 - this.f4074o00oOOo0.o00oOo0O(view);
                int o00oo02 = this.f4074o00oOOo0.o00oo0();
                int min2 = o00oOo0O2 - (Math.min(this.f4074o00oOOo0.o00oOoO0(view) - o00oo02, 0) + o00oo02);
                if (min2 >= 0) {
                    return;
                }
                min = Math.min(o00oOoOO2, -min2) + this.f4076o00oOo00;
            } else {
                int o00oOoO02 = this.f4074o00oOOo0.o00oOoO0(view);
                int o00oo03 = o00oOoO02 - this.f4074o00oOOo0.o00oo0();
                this.f4076o00oOo00 = o00oOoO02;
                if (o00oo03 <= 0) {
                    return;
                }
                int o00oOoOO3 = (this.f4074o00oOOo0.o00oOoOO() - Math.min(0, (this.f4074o00oOOo0.o00oOoOO() - o00oo0O02) - this.f4074o00oOOo0.o00oOooO(view))) - (this.f4074o00oOOo0.o00oOo0O(view) + o00oOoO02);
                if (o00oOoOO3 >= 0) {
                    return;
                }
                min = this.f4076o00oOo00 - Math.min(o00oo03, -o00oOoOO3);
            }
            this.f4076o00oOo00 = min;
        }

        public void o00oOo0O() {
            this.f4075o00oOOoO = -1;
            this.f4076o00oOo00 = Integer.MIN_VALUE;
            this.f4078o00oOooO = false;
            this.f4077o00oOo0O = false;
        }

        public boolean o00oOooO(View view, RecyclerView.o0O00OOO o0o00ooo) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            return !o0o0000o.o00oOoO0() && o0o0000o.o00oOooO() >= 0 && o0o0000o.o00oOooO() < o0o00ooo.o00oOooO();
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("AnchorInfo{mPosition=");
            o00oOOo02.append(this.f4075o00oOOoO);
            o00oOOo02.append(", mCoordinate=");
            o00oOOo02.append(this.f4076o00oOo00);
            o00oOOo02.append(", mLayoutFromEnd=");
            o00oOOo02.append(this.f4078o00oOooO);
            o00oOOo02.append(", mValid=");
            o00oOOo02.append(this.f4077o00oOo0O);
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4079o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f4080o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4081o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4082o00oOooO;

        public void o00oOOo0() {
            this.f4079o00oOOo0 = 0;
            this.f4080o00oOOoO = false;
            this.f4081o00oOo00 = false;
            this.f4082o00oOooO = false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final String f4083o00oo0 = "LLM#LayoutState";

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f4084o00oo0O = Integer.MIN_VALUE;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f4085o00oo0O0 = 1;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f4086o00oo0OO = -1;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f4087o00oo0Oo = -1;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f4088o00oo0o = Integer.MIN_VALUE;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f4089o00oo0o0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4091o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4092o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4093o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4094o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f4096o00oOoO0;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f4099o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4100o00oOooO;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public boolean f4102o00oo00O;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4090o00oOOo0 = true;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f4095o00oOoO = 0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f4097o00oOoOO = 0;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public boolean f4098o00oOoOo = false;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public List<RecyclerView.o0O00oO0> f4101o00oOooo = null;

        public void o00oOOo0() {
            o00oOOoO(null);
        }

        public void o00oOOoO(View view) {
            View o00oOoO02 = o00oOoO0(view);
            this.f4100o00oOooO = o00oOoO02 == null ? -1 : ((RecyclerView.o0O0000O) o00oOoO02.getLayoutParams()).o00oOooO();
        }

        public boolean o00oOo00(RecyclerView.o0O00OOO o0o00ooo) {
            int i = this.f4100o00oOooO;
            return i >= 0 && i < o0o00ooo.o00oOooO();
        }

        public View o00oOo0O(RecyclerView.o0O00O0 o0o00o0) {
            if (this.f4101o00oOooo != null) {
                return o00oOo0o();
            }
            View o00oo0O2 = o0o00o0.o00oo0O(this.f4100o00oOooO, false);
            this.f4100o00oOooO += this.f4093o00oOo0O;
            return o00oo0O2;
        }

        public final View o00oOo0o() {
            int size = this.f4101o00oOooo.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4101o00oOooo.get(i).itemView;
                RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
                if (!o0o0000o.o00oOoO0() && this.f4100o00oOooO == o0o0000o.o00oOooO()) {
                    o00oOOoO(view);
                    return view;
                }
            }
            return null;
        }

        public View o00oOoO0(View view) {
            int o00oOooO2;
            int size = this.f4101o00oOooo.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4101o00oOooo.get(i2).itemView;
                RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view3.getLayoutParams();
                if (view3 != view && !o0o0000o.o00oOoO0() && (o00oOooO2 = (o0o0000o.o00oOooO() - this.f4100o00oOooO) * this.f4093o00oOo0O) >= 0 && o00oOooO2 < i) {
                    view2 = view3;
                    if (o00oOooO2 == 0) {
                        break;
                    }
                    i = o00oOooO2;
                }
            }
            return view2;
        }

        public void o00oOooO() {
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new o00oOOo0();
        this.mLayoutChunkResult = new o00oOOoO();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new o00oOOo0();
        this.mLayoutChunkResult = new o00oOOoO();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.o0O00000.o00oOo0O properties = RecyclerView.o0O00000.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f4140o00oOOo0);
        setReverseLayout(properties.f4142o00oOo00);
        setStackFromEnd(properties.f4143o00oOooO);
    }

    private int computeScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o0O00o00.o00oOOo0(o0o00ooo, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o0O00o00.o00oOOoO(o0o00ooo, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o0O00o00.o00oOo00(o0o00ooo, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z) {
        int o00oOoOO2;
        int o00oOoOO3 = this.mOrientationHelper.o00oOoOO() - i;
        if (o00oOoOO3 > 0) {
            int i2 = -scrollBy(-o00oOoOO3, o0o00o0, o0o00ooo);
            int i3 = i + i2;
            if (!z || (o00oOoOO2 = this.mOrientationHelper.o00oOoOO() - i3) <= 0) {
                return i2;
            }
            this.mOrientationHelper.o00oo0o(o00oOoOO2);
            return o00oOoOO2 + i2;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z) {
        int o00oo02;
        int o00oo03 = i - this.mOrientationHelper.o00oo0();
        if (o00oo03 > 0) {
            int i2 = -scrollBy(o00oo03, o0o00o0, o0o00ooo);
            int i3 = i + i2;
            if (!z || (o00oo02 = i3 - this.mOrientationHelper.o00oo0()) <= 0) {
                return i2;
            }
            this.mOrientationHelper.o00oo0o(-o00oo02);
            return i2 - o00oo02;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, int i, int i2) {
        if (!o0o00ooo.o00oo0() || getChildCount() == 0 || o0o00ooo.o00oOoOo() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.o0O00oO0> list = o0o00o0.f4157o00oOooO;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.o0O00oO0 o0o00oo0 = list.get(i5);
            if (!o0o00oo0.isRemoved()) {
                boolean z = (o0o00oo0.getLayoutPosition() < position) != this.mShouldReverseLayout ? true : true;
                int o00oOo0O2 = this.mOrientationHelper.o00oOo0O(o0o00oo0.itemView);
                if (z) {
                    i3 += o00oOo0O2;
                } else {
                    i4 += o00oOo0O2;
                }
            }
        }
        this.mLayoutState.f4101o00oOooo = list;
        if (i3 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            o00oOo00 o00ooo002 = this.mLayoutState;
            o00ooo002.f4095o00oOoO = i3;
            o00ooo002.f4092o00oOo00 = 0;
            o00ooo002.o00oOOo0();
            fill(o0o00o0, this.mLayoutState, o0o00ooo, false);
        }
        if (i4 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            o00oOo00 o00ooo003 = this.mLayoutState;
            o00ooo003.f4095o00oOoO = i4;
            o00ooo003.f4092o00oOo00 = 0;
            o00ooo003.o00oOOo0();
            fill(o0o00o0, this.mLayoutState, o0o00ooo, false);
        }
        this.mLayoutState.f4101o00oOooo = null;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.o00oOoO0(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.o0O00O0 o0o00o0, o00oOo00 o00ooo002) {
        if (!o00ooo002.f4090o00oOOo0 || o00ooo002.f4102o00oo00O) {
            return;
        }
        int i = o00ooo002.f4096o00oOoO0;
        int i2 = o00ooo002.f4097o00oOoOO;
        if (o00ooo002.f4094o00oOo0o == -1) {
            recycleViewsFromEnd(o0o00o0, i, i2);
        } else {
            recycleViewsFromStart(o0o00o0, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.o0O00O0 o0o00o0, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, o0o00o0);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            removeAndRecycleViewAt(i3, o0o00o0);
        }
    }

    private void recycleViewsFromEnd(RecyclerView.o0O00O0 o0o00o0, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int o00oOoO2 = (this.mOrientationHelper.o00oOoO() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.o00oOoO0(childAt) < o00oOoO2 || this.mOrientationHelper.o00oo0Oo(childAt) < o00oOoO2) {
                    recycleChildren(o0o00o0, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.o00oOoO0(childAt2) < o00oOoO2 || this.mOrientationHelper.o00oo0Oo(childAt2) < o00oOoO2) {
                recycleChildren(o0o00o0, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.o0O00O0 o0o00o0, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.o00oOooO(childAt) > i3 || this.mOrientationHelper.o00oo0O(childAt) > i3) {
                    recycleChildren(o0o00o0, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.o00oOooO(childAt2) > i3 || this.mOrientationHelper.o00oo0O(childAt2) > i3) {
                recycleChildren(o0o00o0, i5, i6);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = (this.mOrientation == 1 || !isLayoutRTL()) ? this.mReverseLayout : !this.mReverseLayout;
    }

    private boolean updateAnchorFromChildren(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, o00oOOo0 o00oooo02) {
        View findReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && o00oooo02.o00oOooO(focusedChild, o0o00ooo)) {
            o00oooo02.o00oOo00(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 == z3 && (findReferenceChild = findReferenceChild(o0o00o0, o0o00ooo, o00oooo02.f4078o00oOooO, z3)) != null) {
            o00oooo02.o00oOOoO(findReferenceChild, getPosition(findReferenceChild));
            if (!o0o00ooo.o00oOoOo() && supportsPredictiveItemAnimations()) {
                int o00oOoO02 = this.mOrientationHelper.o00oOoO0(findReferenceChild);
                int o00oOooO2 = this.mOrientationHelper.o00oOooO(findReferenceChild);
                int o00oo02 = this.mOrientationHelper.o00oo0();
                int o00oOoOO2 = this.mOrientationHelper.o00oOoOO();
                boolean z4 = o00oOooO2 <= o00oo02 && o00oOoO02 < o00oo02;
                if (o00oOoO02 >= o00oOoOO2 && o00oOooO2 > o00oOoOO2) {
                    z = true;
                }
                if (z4 || z) {
                    if (o00oooo02.f4078o00oOooO) {
                        o00oo02 = o00oOoOO2;
                    }
                    o00oooo02.f4076o00oOo00 = o00oo02;
                }
            }
            return true;
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.o0O00OOO o0o00ooo, o00oOOo0 o00oooo02) {
        int i;
        if (!o0o00ooo.o00oOoOo() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < o0o00ooo.o00oOooO()) {
                o00oooo02.f4075o00oOOoO = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.o00oOOo0()) {
                    boolean z = this.mPendingSavedState.f4073o00oo0Oo;
                    o00oooo02.f4078o00oOooO = z;
                    o00oooo02.f4076o00oOo00 = z ? this.mOrientationHelper.o00oOoOO() - this.mPendingSavedState.f4071o00oo0O : this.mOrientationHelper.o00oo0() + this.mPendingSavedState.f4071o00oo0O;
                    return true;
                } else if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    o00oooo02.f4078o00oOooO = z2;
                    o00oooo02.f4076o00oOo00 = z2 ? this.mOrientationHelper.o00oOoOO() - this.mPendingScrollPositionOffset : this.mOrientationHelper.o00oo0() + this.mPendingScrollPositionOffset;
                    return true;
                } else {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            o00oooo02.f4078o00oOooO = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        o00oooo02.o00oOOo0();
                    } else if (this.mOrientationHelper.o00oOo0O(findViewByPosition) > this.mOrientationHelper.o00oo0OO()) {
                        o00oooo02.o00oOOo0();
                        return true;
                    } else if (this.mOrientationHelper.o00oOoO0(findViewByPosition) - this.mOrientationHelper.o00oo0() < 0) {
                        o00oooo02.f4076o00oOo00 = this.mOrientationHelper.o00oo0();
                        o00oooo02.f4078o00oOooO = false;
                        return true;
                    } else if (this.mOrientationHelper.o00oOoOO() - this.mOrientationHelper.o00oOooO(findViewByPosition) < 0) {
                        o00oooo02.f4076o00oOo00 = this.mOrientationHelper.o00oOoOO();
                        o00oooo02.f4078o00oOooO = true;
                        return true;
                    } else {
                        o00oooo02.f4076o00oOo00 = o00oooo02.f4078o00oOooO ? this.mOrientationHelper.o00oo0O0() + this.mOrientationHelper.o00oOooO(findViewByPosition) : this.mOrientationHelper.o00oOoO0(findViewByPosition);
                    }
                    return true;
                }
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, o00oOOo0 o00oooo02) {
        if (updateAnchorFromPendingData(o0o00ooo, o00oooo02) || updateAnchorFromChildren(o0o00o0, o0o00ooo, o00oooo02)) {
            return;
        }
        o00oooo02.o00oOOo0();
        o00oooo02.f4075o00oOOoO = this.mStackFromEnd ? o0o00ooo.o00oOooO() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.o0O00OOO o0o00ooo) {
        int o00oo02;
        this.mLayoutState.f4102o00oo00O = resolveIsInfinite();
        this.mLayoutState.f4094o00oOo0o = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(o0o00ooo, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        o00oOo00 o00ooo002 = this.mLayoutState;
        int i3 = z2 ? max2 : max;
        o00ooo002.f4095o00oOoO = i3;
        if (!z2) {
            max = max2;
        }
        o00ooo002.f4097o00oOoOO = max;
        if (z2) {
            o00ooo002.f4095o00oOoO = this.mOrientationHelper.o00oOoOo() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            o00oOo00 o00ooo003 = this.mLayoutState;
            o00ooo003.f4093o00oOo0O = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            o00oOo00 o00ooo004 = this.mLayoutState;
            o00ooo003.f4100o00oOooO = position + o00ooo004.f4093o00oOo0O;
            o00ooo004.f4091o00oOOoO = this.mOrientationHelper.o00oOooO(childClosestToEnd);
            o00oo02 = this.mOrientationHelper.o00oOooO(childClosestToEnd) - this.mOrientationHelper.o00oOoOO();
        } else {
            View childClosestToStart = getChildClosestToStart();
            o00oOo00 o00ooo005 = this.mLayoutState;
            o00ooo005.f4095o00oOoO = this.mOrientationHelper.o00oo0() + o00ooo005.f4095o00oOoO;
            o00oOo00 o00ooo006 = this.mLayoutState;
            o00ooo006.f4093o00oOo0O = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            o00oOo00 o00ooo007 = this.mLayoutState;
            o00ooo006.f4100o00oOooO = position2 + o00ooo007.f4093o00oOo0O;
            o00ooo007.f4091o00oOOoO = this.mOrientationHelper.o00oOoO0(childClosestToStart);
            o00oo02 = (-this.mOrientationHelper.o00oOoO0(childClosestToStart)) + this.mOrientationHelper.o00oo0();
        }
        o00oOo00 o00ooo008 = this.mLayoutState;
        o00ooo008.f4092o00oOo00 = i2;
        if (z) {
            o00ooo008.f4092o00oOo00 = i2 - o00oo02;
        }
        o00ooo008.f4096o00oOoO0 = o00oo02;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f4092o00oOo00 = this.mOrientationHelper.o00oOoOO() - i2;
        o00oOo00 o00ooo002 = this.mLayoutState;
        o00ooo002.f4093o00oOo0O = this.mShouldReverseLayout ? -1 : 1;
        o00ooo002.f4100o00oOooO = i;
        o00ooo002.f4094o00oOo0o = 1;
        o00ooo002.f4091o00oOOoO = i2;
        o00ooo002.f4096o00oOoO0 = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillEnd(o00oOOo0 o00oooo02) {
        updateLayoutStateToFillEnd(o00oooo02.f4075o00oOOoO, o00oooo02.f4076o00oOo00);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f4092o00oOo00 = i2 - this.mOrientationHelper.o00oo0();
        o00oOo00 o00ooo002 = this.mLayoutState;
        o00ooo002.f4100o00oOooO = i;
        o00ooo002.f4093o00oOo0O = this.mShouldReverseLayout ? 1 : -1;
        o00ooo002.f4094o00oOo0o = -1;
        o00ooo002.f4091o00oOOoO = i2;
        o00ooo002.f4096o00oOoO0 = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(o00oOOo0 o00oooo02) {
        updateLayoutStateToFillStart(o00oooo02.f4075o00oOOoO, o00oooo02.f4076o00oOo00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@oo0oO0 RecyclerView.o0O00OOO o0o00ooo, @oo0oO0 int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(o0o00ooo);
        if (this.mLayoutState.f4094o00oOo0o == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.o0O00OOO o0o00ooo, RecyclerView.o0O00000.o00oOo00 o00ooo002) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, o0o00ooo);
        collectPrefetchPositionsForLayoutState(o0o00ooo, this.mLayoutState, o00ooo002);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void collectInitialPrefetchPositions(int i, RecyclerView.o0O00000.o00oOo00 o00ooo002) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.o00oOOo0()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.f4073o00oo0Oo;
            i2 = savedState2.f4072o00oo0O0;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            o00ooo002.o00oOOo0(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.o0O00OOO o0o00ooo, o00oOo00 o00ooo002, RecyclerView.o0O00000.o00oOo00 o00ooo003) {
        int i = o00ooo002.f4100o00oOooO;
        if (i < 0 || i >= o0o00ooo.o00oOooO()) {
            return;
        }
        o00ooo003.o00oOOo0(i, Math.max(0, o00ooo002.f4096o00oOoO0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollExtent(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollRange(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00OO.o00oOOoO
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollExtent(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollExtent(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return computeScrollRange(o0o00ooo);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public o00oOo00 createLayoutState() {
        return new o00oOo00();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.o0O00O0 o0o00o0, o00oOo00 o00ooo002, RecyclerView.o0O00OOO o0o00ooo, boolean z) {
        int i = o00ooo002.f4092o00oOo00;
        int i2 = o00ooo002.f4096o00oOoO0;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                o00ooo002.f4096o00oOoO0 = i2 + i;
            }
            recycleByLayoutState(o0o00o0, o00ooo002);
        }
        int i3 = o00ooo002.f4092o00oOo00 + o00ooo002.f4095o00oOoO;
        o00oOOoO o00ooooo2 = this.mLayoutChunkResult;
        while (true) {
            if ((!o00ooo002.f4102o00oo00O && i3 <= 0) || !o00ooo002.o00oOo00(o0o00ooo)) {
                break;
            }
            o00ooooo2.o00oOOo0();
            layoutChunk(o0o00o0, o0o00ooo, o00ooo002, o00ooooo2);
            if (!o00ooooo2.f4080o00oOOoO) {
                o00ooo002.f4091o00oOOoO = (o00ooooo2.f4079o00oOOo0 * o00ooo002.f4094o00oOo0o) + o00ooo002.f4091o00oOOoO;
                if (!o00ooooo2.f4081o00oOo00 || o00ooo002.f4101o00oOooo != null || !o0o00ooo.o00oOoOo()) {
                    int i4 = o00ooo002.f4092o00oOo00;
                    int i5 = o00ooooo2.f4079o00oOOo0;
                    o00ooo002.f4092o00oOo00 = i4 - i5;
                    i3 -= i5;
                }
                int i6 = o00ooo002.f4096o00oOoO0;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + o00ooooo2.f4079o00oOOo0;
                    o00ooo002.f4096o00oOoO0 = i7;
                    int i8 = o00ooo002.f4092o00oOo00;
                    if (i8 < 0) {
                        o00ooo002.f4096o00oOoO0 = i7 + i8;
                    }
                    recycleByLayoutState(o0o00o0, o00ooo002);
                }
                if (z && o00ooooo2.f4082o00oOooO) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - o00ooo002.f4092o00oOo00;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        int childCount;
        int i;
        if (this.mShouldReverseLayout) {
            childCount = 0;
            i = getChildCount();
        } else {
            childCount = getChildCount() - 1;
            i = -1;
        }
        return findOneVisibleChild(childCount, i, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        int i;
        int childCount;
        if (this.mShouldReverseLayout) {
            i = getChildCount() - 1;
            childCount = -1;
        } else {
            i = 0;
            childCount = getChildCount();
        }
        return findOneVisibleChild(i, childCount, z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.o00oOoO0(getChildAt(i)) < this.mOrientationHelper.o00oo0()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).o00oOOo0(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).o00oOOo0(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    public View findReferenceChild(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z, boolean z2) {
        int i;
        int i2;
        ensureLayoutState();
        int childCount = getChildCount();
        int i3 = -1;
        if (z2) {
            i = getChildCount() - 1;
            i2 = -1;
        } else {
            i3 = childCount;
            i = 0;
            i2 = 1;
        }
        int o00oOooO2 = o0o00ooo.o00oOooO();
        int o00oo02 = this.mOrientationHelper.o00oo0();
        int o00oOoOO2 = this.mOrientationHelper.o00oOoOO();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            int o00oOoO02 = this.mOrientationHelper.o00oOoO0(childAt);
            int o00oOooO3 = this.mOrientationHelper.o00oOooO(childAt);
            if (position >= 0 && position < o00oOooO2) {
                if (!((RecyclerView.o0O0000O) childAt.getLayoutParams()).o00oOoO0()) {
                    boolean z3 = o00oOooO3 <= o00oo02 && o00oOoO02 < o00oo02;
                    boolean z4 = o00oOoO02 >= o00oOoOO2 && o00oOooO3 > o00oOoOO2;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateDefaultLayoutParams() {
        return new RecyclerView.o0O0000O(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.o0O00OOO o0o00ooo) {
        if (o0o00ooo.o00oOoO()) {
            return this.mOrientationHelper.o00oo0OO();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, o00oOo00 o00ooo002, o00oOOoO o00ooooo2) {
        int i;
        int i2;
        int i3;
        int i4;
        int o00oOo0o2;
        View o00oOo0O2 = o00ooo002.o00oOo0O(o0o00o0);
        if (o00oOo0O2 == null) {
            o00ooooo2.f4080o00oOOoO = true;
            return;
        }
        RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) o00oOo0O2.getLayoutParams();
        if (o00ooo002.f4101o00oOooo == null) {
            if (this.mShouldReverseLayout == (o00ooo002.f4094o00oOo0o == -1)) {
                addView(o00oOo0O2);
            } else {
                addView(o00oOo0O2, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (o00ooo002.f4094o00oOo0o == -1)) {
                addDisappearingView(o00oOo0O2);
            } else {
                addDisappearingView(o00oOo0O2, 0);
            }
        }
        measureChildWithMargins(o00oOo0O2, 0, 0);
        o00ooooo2.f4079o00oOOo0 = this.mOrientationHelper.o00oOo0O(o00oOo0O2);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                o00oOo0o2 = getWidth() - getPaddingRight();
                i4 = o00oOo0o2 - this.mOrientationHelper.o00oOo0o(o00oOo0O2);
            } else {
                i4 = getPaddingLeft();
                o00oOo0o2 = this.mOrientationHelper.o00oOo0o(o00oOo0O2) + i4;
            }
            int i5 = o00ooo002.f4094o00oOo0o;
            int i6 = o00ooo002.f4091o00oOOoO;
            if (i5 == -1) {
                i3 = i6;
                i2 = o00oOo0o2;
                i = i6 - o00ooooo2.f4079o00oOOo0;
            } else {
                i = i6;
                i2 = o00oOo0o2;
                i3 = o00ooooo2.f4079o00oOOo0 + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int o00oOo0o3 = this.mOrientationHelper.o00oOo0o(o00oOo0O2) + paddingTop;
            int i7 = o00ooo002.f4094o00oOo0o;
            int i8 = o00ooo002.f4091o00oOOoO;
            if (i7 == -1) {
                i2 = i8;
                i = paddingTop;
                i3 = o00oOo0o3;
                i4 = i8 - o00ooooo2.f4079o00oOOo0;
            } else {
                i = paddingTop;
                i2 = o00ooooo2.f4079o00oOOo0 + i8;
                i3 = o00oOo0o3;
                i4 = i8;
            }
        }
        layoutDecoratedWithMargins(o00oOo0O2, i4, i, i2, i3);
        if (o0o0000o.o00oOoO0() || o0o0000o.o00oOo0o()) {
            o00ooooo2.f4081o00oOo00 = true;
        }
        o00ooooo2.f4082o00oOooO = o00oOo0O2.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, o00oOOo0 o00oooo02, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o0O00O0 o0o00o0) {
        super.onDetachedFromWindow(recyclerView, o0o00o0);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(o0o00o0);
            o0o00o0.o00oOooO();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public View onFocusSearchFailed(View view, int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        int convertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o00oo0OO() * 0.33333334f), false, o0o00ooo);
        o00oOo00 o00ooo002 = this.mLayoutState;
        o00ooo002.f4096o00oOoO0 = Integer.MIN_VALUE;
        o00ooo002.f4090o00oOOo0 = false;
        fill(o0o00o0, o00ooo002, o0o00ooo, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (childClosestToStart.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
                return null;
            }
            return childClosestToStart;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutChildren(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        int i;
        int i2;
        int i3;
        int i4;
        int fixLayoutEndGap;
        int i5;
        View findViewByPosition;
        int o00oOoO02;
        int i6;
        int i7 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && o0o00ooo.o00oOooO() == 0) {
            removeAndRecycleAllViews(o0o00o0);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.o00oOOo0()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f4072o00oo0O0;
        }
        ensureLayoutState();
        this.mLayoutState.f4090o00oOOo0 = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        o00oOOo0 o00oooo02 = this.mAnchorInfo;
        if (!o00oooo02.f4077o00oOo0O || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            o00oooo02.o00oOo0O();
            o00oOOo0 o00oooo03 = this.mAnchorInfo;
            o00oooo03.f4078o00oOooO = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(o0o00o0, o0o00ooo, o00oooo03);
            this.mAnchorInfo.f4077o00oOo0O = true;
        } else if (focusedChild != null && (this.mOrientationHelper.o00oOoO0(focusedChild) >= this.mOrientationHelper.o00oOoOO() || this.mOrientationHelper.o00oOooO(focusedChild) <= this.mOrientationHelper.o00oo0())) {
            this.mAnchorInfo.o00oOo00(focusedChild, getPosition(focusedChild));
        }
        o00oOo00 o00ooo002 = this.mLayoutState;
        o00ooo002.f4094o00oOo0o = o00ooo002.f4099o00oOoo0 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(o0o00ooo, iArr);
        int o00oo02 = this.mOrientationHelper.o00oo0() + Math.max(0, this.mReusableIntPair[0]);
        int o00oOoOo2 = this.mOrientationHelper.o00oOoOo() + Math.max(0, this.mReusableIntPair[1]);
        if (o0o00ooo.o00oOoOo() && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                i6 = this.mOrientationHelper.o00oOoOO() - this.mOrientationHelper.o00oOooO(findViewByPosition);
                o00oOoO02 = this.mPendingScrollPositionOffset;
            } else {
                o00oOoO02 = this.mOrientationHelper.o00oOoO0(findViewByPosition) - this.mOrientationHelper.o00oo0();
                i6 = this.mPendingScrollPositionOffset;
            }
            int i8 = i6 - o00oOoO02;
            if (i8 > 0) {
                o00oo02 += i8;
            } else {
                o00oOoOo2 -= i8;
            }
        }
        o00oOOo0 o00oooo04 = this.mAnchorInfo;
        if (!o00oooo04.f4078o00oOooO ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(o0o00o0, o0o00ooo, o00oooo04, i7);
        detachAndScrapAttachedViews(o0o00o0);
        this.mLayoutState.f4102o00oo00O = resolveIsInfinite();
        this.mLayoutState.f4098o00oOoOo = o0o00ooo.o00oOoOo();
        this.mLayoutState.f4097o00oOoOO = 0;
        o00oOOo0 o00oooo05 = this.mAnchorInfo;
        if (o00oooo05.f4078o00oOooO) {
            updateLayoutStateToFillStart(o00oooo05);
            o00oOo00 o00ooo003 = this.mLayoutState;
            o00ooo003.f4095o00oOoO = o00oo02;
            fill(o0o00o0, o00ooo003, o0o00ooo, false);
            o00oOo00 o00ooo004 = this.mLayoutState;
            i2 = o00ooo004.f4091o00oOOoO;
            int i9 = o00ooo004.f4100o00oOooO;
            int i10 = o00ooo004.f4092o00oOo00;
            if (i10 > 0) {
                o00oOoOo2 += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            o00oOo00 o00ooo005 = this.mLayoutState;
            o00ooo005.f4095o00oOoO = o00oOoOo2;
            o00ooo005.f4100o00oOooO += o00ooo005.f4093o00oOo0O;
            fill(o0o00o0, o00ooo005, o0o00ooo, false);
            o00oOo00 o00ooo006 = this.mLayoutState;
            i = o00ooo006.f4091o00oOOoO;
            int i11 = o00ooo006.f4092o00oOo00;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i2);
                o00oOo00 o00ooo007 = this.mLayoutState;
                o00ooo007.f4095o00oOoO = i11;
                fill(o0o00o0, o00ooo007, o0o00ooo, false);
                i2 = this.mLayoutState.f4091o00oOOoO;
            }
        } else {
            updateLayoutStateToFillEnd(o00oooo05);
            o00oOo00 o00ooo008 = this.mLayoutState;
            o00ooo008.f4095o00oOoO = o00oOoOo2;
            fill(o0o00o0, o00ooo008, o0o00ooo, false);
            o00oOo00 o00ooo009 = this.mLayoutState;
            i = o00ooo009.f4091o00oOOoO;
            int i12 = o00ooo009.f4100o00oOooO;
            int i13 = o00ooo009.f4092o00oOo00;
            if (i13 > 0) {
                o00oo02 += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            o00oOo00 o00ooo0010 = this.mLayoutState;
            o00ooo0010.f4095o00oOoO = o00oo02;
            o00ooo0010.f4100o00oOooO += o00ooo0010.f4093o00oOo0O;
            fill(o0o00o0, o00ooo0010, o0o00ooo, false);
            o00oOo00 o00ooo0011 = this.mLayoutState;
            int i14 = o00ooo0011.f4091o00oOOoO;
            int i15 = o00ooo0011.f4092o00oOo00;
            if (i15 > 0) {
                updateLayoutStateToFillEnd(i12, i);
                o00oOo00 o00ooo0012 = this.mLayoutState;
                o00ooo0012.f4095o00oOoO = i15;
                fill(o0o00o0, o00ooo0012, o0o00ooo, false);
                i = this.mLayoutState.f4091o00oOOoO;
            }
            i2 = i14;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i, o0o00o0, o0o00ooo, true);
                i3 = i2 + fixLayoutEndGap2;
                i4 = i + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i3, o0o00o0, o0o00ooo, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i2, o0o00o0, o0o00ooo, true);
                i3 = i2 + fixLayoutStartGap;
                i4 = i + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i4, o0o00o0, o0o00ooo, false);
            }
            i2 = i3 + fixLayoutEndGap;
            i = i4 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(o0o00o0, o0o00ooo, i2, i);
        if (o0o00ooo.o00oOoOo()) {
            this.mAnchorInfo.o00oOo0O();
        } else {
            this.mOrientationHelper.o00oo0oO();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutCompleted(RecyclerView.o0O00OOO o0o00ooo) {
        super.onLayoutCompleted(o0o00ooo);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.o00oOo0O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.o00oOOoO();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f4073o00oo0Oo = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f4071o00oo0O = this.mOrientationHelper.o00oOoOO() - this.mOrientationHelper.o00oOooO(childClosestToEnd);
                savedState.f4072o00oo0O0 = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f4072o00oo0O0 = getPosition(childClosestToStart);
                savedState.f4071o00oo0O = this.mOrientationHelper.o00oOoO0(childClosestToStart) - this.mOrientationHelper.o00oo0();
            }
        } else {
            savedState.f4072o00oo0O0 = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.o0O00000.o00oo0O
    public void prepareForDrop(@oo0oO0 View view, @oo0oO0 View view2, int i, int i2) {
        int o00oOoO02;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z = position < position2 ? true : true;
        if (this.mShouldReverseLayout) {
            if (z) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.o00oOoOO() - (this.mOrientationHelper.o00oOo0O(view) + this.mOrientationHelper.o00oOoO0(view2)));
                return;
            }
            o00oOoO02 = this.mOrientationHelper.o00oOoOO() - this.mOrientationHelper.o00oOooO(view2);
        } else if (!z) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.o00oOooO(view2) - this.mOrientationHelper.o00oOo0O(view));
            return;
        } else {
            o00oOoO02 = this.mOrientationHelper.o00oOoO0(view2);
        }
        scrollToPositionWithOffset(position2, o00oOoO02);
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.o00oOooo() == 0 && this.mOrientationHelper.o00oOoO() == 0;
    }

    public int scrollBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f4090o00oOOo0 = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, o0o00ooo);
        o00oOo00 o00ooo002 = this.mLayoutState;
        int fill = fill(o0o00o0, o00ooo002, o0o00ooo, false) + o00ooo002.f4096o00oOoO0;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.o00oo0o(-i);
        this.mLayoutState.f4099o00oOoo0 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollHorizontallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, o0o00o0, o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.o00oOOoO();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.o00oOOoO();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollVerticallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, o0o00o0, o0o00ooo);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("invalid orientation:", i));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            o0O00O o00oOOoO2 = o0O00O.o00oOOoO(this, i);
            this.mOrientationHelper = o00oOOoO2;
            this.mAnchorInfo.f4074o00oOOo0 = o00oOOoO2;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo, int i) {
        o0OoOoOo o0oooooo = new o0OoOoOo(recyclerView.getContext());
        o0oooooo.setTargetPosition(i);
        startSmoothScroll(o0oooooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int o00oOoO02 = this.mOrientationHelper.o00oOoO0(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int o00oOoO03 = this.mOrientationHelper.o00oOoO0(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("detected invalid position. loc invalid? ");
                    o00oOOo02.append(o00oOoO03 < o00oOoO02);
                    throw new RuntimeException(o00oOOo02.toString());
                } else if (o00oOoO03 > o00oOoO02) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int o00oOoO04 = this.mOrientationHelper.o00oOoO0(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("detected invalid position. loc invalid? ");
                o00oOOo03.append(o00oOoO04 < o00oOoO02);
                throw new RuntimeException(o00oOOo03.toString());
            } else if (o00oOoO04 < o00oOoO02) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }
}
