package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00OO;
import androidx.viewpager2.R;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O00.o00ooO;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f5369o00ooo0 = 1;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f5370o00ooo00 = 0;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f5371o00ooo0O = 0;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f5372o00ooo0o = 1;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f5373o00oooO = 2;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f5374o00oooOO = -1;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static boolean f5375o00oooOo = true;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f5376o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Rect f5377o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Rect f5378o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public androidx.viewpager2.widget.o00oOOoO f5379o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f5380o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f5381o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public RecyclerView.o00oo0O f5382o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public androidx.viewpager2.widget.o00oOOoO f5383o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public RecyclerView f5384o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Parcelable f5385o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o0O00OO f5386o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public androidx.viewpager2.widget.o00oo0 f5387o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public androidx.viewpager2.widget.o00oo00O f5388o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public androidx.viewpager2.widget.o00oOo0O f5389o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public RecyclerView.o00ooO0 f5390o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f5391o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f5392o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f5393o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public o00oOoO f5394o00ooOoo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public LinearLayoutManager f5395o0O0o;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f5396o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f5397o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public Parcelable f5398o00oo0Oo;

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

        public SavedState(Parcel parcel) {
            super(parcel);
            o00oOOo0(parcel, null);
        }

        @o0OOooO0(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            o00oOOo0(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void o00oOOo0(Parcel parcel, ClassLoader classLoader) {
            this.f5397o00oo0O0 = parcel.readInt();
            this.f5396o00oo0O = parcel.readInt();
            this.f5398o00oo0Oo = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5397o00oo0O0);
            parcel.writeInt(this.f5396o00oo0O);
            parcel.writeParcelable(this.f5398o00oo0Oo, i);
        }
    }

    /* loaded from: classes.dex */
    public class o0 extends RecyclerView {
        public o0(@oo0oO0 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @o0OOooO0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f5394o00ooOoo.o00oOooO() ? ViewPager2.this.f5394o00ooOoo.o00oo0() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@oo0oO0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5381o00oo0o0);
            accessibilityEvent.setToIndex(ViewPager2.this.f5381o00oo0o0);
            ViewPager2.this.f5394o00ooOoo.o00oo0OO(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f5391o00ooOo && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f5391o00ooOo && super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo0 {
        public o00oOOo0() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oo0, androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5380o00oo0o = true;
            viewPager2.f5387o00ooO0o.f5448o00oOooo = true;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oo0O {
        public o00oOOoO() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.o00ooO0();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5381o00oo0o0 != i) {
                viewPager2.f5381o00oo0o0 = i;
                viewPager2.f5394o00ooOoo.o00oo0O();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oo0O {
        public o00oOo00() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5384o00ooO0.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements RecyclerView.o0O000 {
        public o00oOo0O() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000
        public void o00oOOoO(@oo0oO0 View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O000
        public void o00oOooO(@oo0oO0 View view) {
            RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) o0o0000o).width != -1 || ((ViewGroup.MarginLayoutParams) o0o0000o).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class o00oOoO {
        public o00oOoO() {
        }

        public /* synthetic */ o00oOoO(ViewPager2 viewPager2, o00oOOo0 o00oooo02) {
            this();
        }

        public boolean o00oOOo0() {
            return false;
        }

        public boolean o00oOOoO(int i) {
            return false;
        }

        public boolean o00oOo00(int i, Bundle bundle) {
            return false;
        }

        public void o00oOo0O(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
        }

        public void o00oOo0o(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
        }

        public void o00oOoO(@oo0oO0 androidx.viewpager2.widget.o00oOOoO o00ooooo2, @oo0oO0 RecyclerView recyclerView) {
        }

        public String o00oOoO0() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o00oOoOO(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void o00oOoOo(@oo0oO0 o0O00.o00oo0O o00oo0o2) {
        }

        public boolean o00oOoo0(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean o00oOooO() {
            return false;
        }

        public boolean o00oOooo(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public CharSequence o00oo0() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o00oo00O() {
        }

        public void o00oo0O() {
        }

        public void o00oo0O0() {
        }

        public void o00oo0OO(@oo0oO0 AccessibilityEvent accessibilityEvent) {
        }

        public void o00oo0Oo() {
        }

        public void o00oo0o0() {
        }
    }

    /* loaded from: classes.dex */
    public class o00oo extends o00oOoO {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O00.o00ooO f5405o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o0O00.o00ooO f5406o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public RecyclerView.o00oo0O f5408o00oOooO;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o0O00.o00ooO {
            public o00oOOo0() {
            }

            @Override // o0O00.o00ooO
            public boolean perform(@oo0oO0 View view, @o0OO00OO o00ooO.o00oOOo0 o00oooo02) {
                o00oo.this.o0O0o(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements o0O00.o00ooO {
            public o00oOOoO() {
            }

            @Override // o0O00.o00ooO
            public boolean perform(@oo0oO0 View view, @o0OO00OO o00ooO.o00oOOo0 o00oooo02) {
                o00oo.this.o0O0o(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 extends o00oo0 {
            public o00oOo00() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.o00oo0, androidx.recyclerview.widget.RecyclerView.o00oo0O
            public void onChanged() {
                o00oo.this.o00oo();
            }
        }

        public o00oo() {
            super();
            this.f5405o00oOOoO = new o00oOOo0();
            this.f5406o00oOo00 = new o00oOOoO();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOOo0() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOo00(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oOo0O(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
            o00oo();
            if (o00oo0oo != null) {
                o00oo0oo.registerAdapterDataObserver(this.f5408o00oOooO);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oOo0o(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
            if (o00oo0oo != null) {
                o00oo0oo.unregisterAdapterDataObserver(this.f5408o00oOooO);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oOoO(@oo0oO0 androidx.viewpager2.widget.o00oOOoO o00ooooo2, @oo0oO0 RecyclerView recyclerView) {
            o0O0o00O.o0OO00OO(recyclerView, 2);
            this.f5408o00oOooO = new o00oOo00();
            if (o0O0o00O.o00oo0OO.o00oOo00(ViewPager2.this) == 0) {
                o0O0o00O.o00oo0OO.o00oo0o0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public String o00oOoO0() {
            if (o00oOOo0()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oOoOO(AccessibilityNodeInfo accessibilityNodeInfo) {
            o00oo0o(accessibilityNodeInfo);
            o00oo0oO(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOooo(int i, Bundle bundle) {
            if (o00oOo00(i, bundle)) {
                o0O0o(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public void o00oo() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            o0O0o00O.o0O0oO0(viewPager2, 16908360);
            o0O0o00O.o0O0oO0(viewPager2, 16908361);
            o0O0o00O.o0O0oO0(viewPager2, 16908358);
            o0O0o00O.o0O0oO0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.f5391o00ooOo) {
                if (viewPager22.getOrientation() != 0) {
                    if (ViewPager2.this.f5381o00oo0o0 < itemCount - 1) {
                        o0O0o00O.o0O0oO(viewPager2, new o00oo0O.o00oOOo0(16908359, null), null, this.f5405o00oOOoO);
                    }
                    if (ViewPager2.this.f5381o00oo0o0 > 0) {
                        o0O0o00O.o0O0oO(viewPager2, new o00oo0O.o00oOOo0(16908358, null), null, this.f5406o00oOo00);
                        return;
                    }
                    return;
                }
                boolean o00oOoo02 = ViewPager2.this.o00oOoo0();
                int i = o00oOoo02 ? 16908360 : 16908361;
                int i2 = o00oOoo02 ? 16908361 : 16908360;
                if (ViewPager2.this.f5381o00oo0o0 < itemCount - 1) {
                    o0O0o00O.o0O0oO(viewPager2, new o00oo0O.o00oOOo0(i, null), null, this.f5405o00oOOoO);
                }
                if (ViewPager2.this.f5381o00oo0o0 > 0) {
                    o0O0o00O.o0O0oO(viewPager2, new o00oo0O.o00oOOo0(i2, null), null, this.f5406o00oOo00);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo00O() {
            o00oo();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo0O() {
            o00oo();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo0O0() {
            o00oo();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo0OO(@oo0oO0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(o00oOoO0());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo0Oo() {
            o00oo();
        }

        public final void o00oo0o(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i = 0;
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            } else {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
            }
            o0O00.o00oo0O.o0OO0Ooo(accessibilityNodeInfo).o0O0OooO(o00oo0O.o00oOo00.o00oOo0o(i, i2, false, 0));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oo0o0() {
            o00oo();
        }

        public final void o00oo0oO(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.o00oo0OO adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5391o00ooOo) {
                if (viewPager2.f5381o00oo0o0 > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f5381o00oo0o0 < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public void o0O0o(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5391o00ooOo) {
                viewPager2.o00oo0o(i, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0 extends RecyclerView.o00oo0O {
        public o00oo0() {
        }

        public o00oo0(o00oOOo0 o00oooo02) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeChanged(int i, int i2, @o0OO00OO Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o00oOoO {
        public o00oo00O() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOOoO(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.f5391o00ooOo;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public void o00oOoOo(@oo0oO0 o0O00.o00oo0O o00oo0o2) {
            if (ViewPager2.this.f5391o00ooOo) {
                return;
            }
            o00oo0o2.o0O0OOoO(o00oo0O.o00oOOo0.f10053o00oo0o0);
            o00oo0o2.o0O0OOoO(o00oo0O.o00oOOo0.f10051o00oo0Oo);
            o00oo0o2.o0O0ooo0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOoo0(int i) {
            if (o00oOOoO(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public boolean o00oOooO() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.o00oOoO
        public CharSequence o00oo0() {
            if (o00oOooO()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0O {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @o0OO0 int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    @o00oOooO.o0O0o00O(from = 1)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oo0O0 {
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends LinearLayoutManager {
        public o00oo0OO(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@oo0oO0 RecyclerView.o0O00OOO o0o00ooo, @oo0oO0 int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(o0o00ooo, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
        public void onInitializeAccessibilityNodeInfo(@oo0oO0 RecyclerView.o0O00O0 o0o00o0, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo, @oo0oO0 o0O00.o00oo0O o00oo0o2) {
            super.onInitializeAccessibilityNodeInfo(o0o00o0, o0o00ooo, o00oo0o2);
            ViewPager2.this.f5394o00ooOoo.o00oOoOo(o00oo0o2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
        public boolean performAccessibilityAction(@oo0oO0 RecyclerView.o0O00O0 o0o00o0, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo, int i, @o0OO00OO Bundle bundle) {
            return ViewPager2.this.f5394o00ooOoo.o00oOOoO(i) ? ViewPager2.this.f5394o00ooOoo.o00oOoo0(i) : super.performAccessibilityAction(o0o00o0, o0o00ooo, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
        public boolean requestChildRectangleOnScreen(@oo0oO0 RecyclerView recyclerView, @oo0oO0 View view, @oo0oO0 Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class o00ooO extends o0O00OO {
        public o00ooO() {
        }

        @Override // androidx.recyclerview.widget.o0O00OO, androidx.recyclerview.widget.o0O0O0O
        @o0OO00OO
        public View o00oOoO(RecyclerView.o0O00000 o0o00000) {
            if (ViewPager2.this.o00oOoOo()) {
                return null;
            }
            return super.o00oOoO(o0o00000);
        }
    }

    /* loaded from: classes.dex */
    public interface o00ooO0 {
        void o00oOOo0(@oo0oO0 View view, float f);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00000 {
    }

    /* loaded from: classes.dex */
    public static class o0O0000O implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final RecyclerView f5415o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int f5416o00oo0O0;

        public o0O0000O(int i, RecyclerView recyclerView) {
            this.f5416o00oo0O0 = i;
            this.f5415o00oo0O = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5415o00oo0O.smoothScrollToPosition(this.f5416o00oo0O0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O0o {
    }

    public ViewPager2(@oo0oO0 Context context) {
        super(context);
        this.f5378o00oo0O0 = new Rect();
        this.f5377o00oo0O = new Rect();
        this.f5379o00oo0Oo = new androidx.viewpager2.widget.o00oOOoO(3);
        this.f5380o00oo0o = false;
        this.f5382o00oo0oO = new o00oOOo0();
        this.f5376o00oo = -1;
        this.f5390o00ooOOo = null;
        this.f5392o00ooOo0 = false;
        this.f5391o00ooOo = true;
        this.f5393o00ooOoO = -1;
        o00oOoO(context, null);
    }

    public ViewPager2(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5378o00oo0O0 = new Rect();
        this.f5377o00oo0O = new Rect();
        this.f5379o00oo0Oo = new androidx.viewpager2.widget.o00oOOoO(3);
        this.f5380o00oo0o = false;
        this.f5382o00oo0oO = new o00oOOo0();
        this.f5376o00oo = -1;
        this.f5390o00ooOOo = null;
        this.f5392o00ooOo0 = false;
        this.f5391o00ooOo = true;
        this.f5393o00ooOoO = -1;
        o00oOoO(context, attributeSet);
    }

    public ViewPager2(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5378o00oo0O0 = new Rect();
        this.f5377o00oo0O = new Rect();
        this.f5379o00oo0Oo = new androidx.viewpager2.widget.o00oOOoO(3);
        this.f5380o00oo0o = false;
        this.f5382o00oo0oO = new o00oOOo0();
        this.f5376o00oo = -1;
        this.f5390o00ooOOo = null;
        this.f5392o00ooOo0 = false;
        this.f5391o00ooOo = true;
        this.f5393o00ooOoO = -1;
        o00oOoO(context, attributeSet);
    }

    @o0OOooO0(21)
    public ViewPager2(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5378o00oo0O0 = new Rect();
        this.f5377o00oo0O = new Rect();
        this.f5379o00oo0Oo = new androidx.viewpager2.widget.o00oOOoO(3);
        this.f5380o00oo0o = false;
        this.f5382o00oo0oO = new o00oOOo0();
        this.f5376o00oo = -1;
        this.f5390o00ooOOo = null;
        this.f5392o00ooOo0 = false;
        this.f5391o00ooOo = true;
        this.f5393o00ooOoO = -1;
        o00oOoO(context, attributeSet);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f5384o00ooO0.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f5384o00ooO0.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f5397o00oo0O0;
            sparseArray.put(this.f5384o00ooO0.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        o00oo0Oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    @o0OOooO0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f5394o00ooOoo.o00oOOo0() ? this.f5394o00ooOoo.o00oOoO0() : super.getAccessibilityClassName();
    }

    @o0OO00OO
    public RecyclerView.o00oo0OO getAdapter() {
        return this.f5384o00ooO0.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5381o00oo0o0;
    }

    public int getItemDecorationCount() {
        return this.f5384o00ooO0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5393o00ooOoO;
    }

    public int getOrientation() {
        return this.f5395o0O0o.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f5384o00ooO0;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5387o00ooO0o.f5441o00oOo0o;
    }

    public void o00oOOo0(@oo0oO0 RecyclerView.o0 o0Var) {
        this.f5384o00ooO0.addItemDecoration(o0Var);
    }

    public void o00oOOoO(@oo0oO0 RecyclerView.o0 o0Var, int i) {
        this.f5384o00ooO0.addItemDecoration(o0Var, i);
    }

    public boolean o00oOo00() {
        return this.f5389o00ooOO0.o00oOOoO();
    }

    public final RecyclerView.o0O000 o00oOo0O() {
        return new o00oOo0O();
    }

    public boolean o00oOo0o(@o0OO0 @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f5389o00ooOO0.o00oOo0O(f);
    }

    public final void o00oOoO(Context context, AttributeSet attributeSet) {
        this.f5394o00ooOoo = f5375o00oooOo ? new o00oo() : new o00oo00O();
        o0 o0Var = new o0(context);
        this.f5384o00ooO0 = o0Var;
        o0Var.setId(o0O0o00O.o00ooOO());
        this.f5384o00ooO0.setDescendantFocusability(131072);
        o00oo0OO o00oo0oo = new o00oo0OO(context);
        this.f5395o0O0o = o00oo0oo;
        this.f5384o00ooO0.setLayoutManager(o00oo0oo);
        this.f5384o00ooO0.setScrollingTouchSlop(1);
        o00oo0oO(context, attributeSet);
        this.f5384o00ooO0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5384o00ooO0.addOnChildAttachStateChangeListener(new o00oOo0O());
        androidx.viewpager2.widget.o00oo0 o00oo0Var = new androidx.viewpager2.widget.o00oo0(this);
        this.f5387o00ooO0o = o00oo0Var;
        this.f5389o00ooOO0 = new androidx.viewpager2.widget.o00oOo0O(this, o00oo0Var, this.f5384o00ooO0);
        o00ooO o00ooo = new o00ooO();
        this.f5386o00ooO0O = o00ooo;
        o00ooo.o00oOOoO(this.f5384o00ooO0);
        this.f5384o00ooO0.addOnScrollListener(this.f5387o00ooO0o);
        androidx.viewpager2.widget.o00oOOoO o00ooooo2 = new androidx.viewpager2.widget.o00oOOoO(3);
        this.f5383o00ooO = o00ooooo2;
        this.f5387o00ooO0o.f5437o00oOOo0 = o00ooooo2;
        o00oOOoO o00ooooo3 = new o00oOOoO();
        o00oOo00 o00ooo002 = new o00oOo00();
        this.f5383o00ooO.o00oOOo0(o00ooooo3);
        this.f5383o00ooO.o00oOOo0(o00ooo002);
        this.f5394o00ooOoo.o00oOoO(this.f5383o00ooO, this.f5384o00ooO0);
        this.f5383o00ooO.o00oOOo0(this.f5379o00oo0Oo);
        androidx.viewpager2.widget.o00oo00O o00oo00o = new androidx.viewpager2.widget.o00oo00O(this.f5395o0O0o);
        this.f5388o00ooOO = o00oo00o;
        this.f5383o00ooO.o00oOOo0(o00oo00o);
        RecyclerView recyclerView = this.f5384o00ooO0;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @oo0oO0
    public RecyclerView.o0 o00oOoO0(int i) {
        return this.f5384o00ooO0.getItemDecorationAt(i);
    }

    public void o00oOoOO() {
        this.f5384o00ooO0.invalidateItemDecorations();
    }

    public boolean o00oOoOo() {
        return this.f5389o00ooOO0.f5423o00oOOoO.f5449o00oo00O;
    }

    public boolean o00oOoo0() {
        return this.f5395o0O0o.getLayoutDirection() == 1;
    }

    public boolean o00oOooO() {
        return this.f5389o00ooOO0.o00oOooO();
    }

    public boolean o00oOooo() {
        return this.f5391o00ooOo;
    }

    public final void o00oo(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
        if (o00oo0oo != null) {
            o00oo0oo.unregisterAdapterDataObserver(this.f5382o00oo0oO);
        }
    }

    public void o00oo0(@oo0oO0 o00oo0O o00oo0o2) {
        this.f5379o00oo0Oo.o00oOOo0(o00oo0o2);
    }

    public final void o00oo00O(@o0OO00OO RecyclerView.o00oo0OO<?> o00oo0oo) {
        if (o00oo0oo != null) {
            o00oo0oo.registerAdapterDataObserver(this.f5382o00oo0oO);
        }
    }

    public void o00oo0O() {
        if (this.f5388o00ooOO.f5454o00oOOoO == null) {
            return;
        }
        double o00oOo0O2 = this.f5387o00ooO0o.o00oOo0O();
        int i = (int) o00oOo0O2;
        float f = (float) (o00oOo0O2 - i);
        this.f5388o00ooOO.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    public void o00oo0O0(int i) {
        this.f5384o00ooO0.removeItemDecorationAt(i);
    }

    public void o00oo0OO(@oo0oO0 RecyclerView.o0 o0Var) {
        this.f5384o00ooO0.removeItemDecoration(o0Var);
    }

    public final void o00oo0Oo() {
        RecyclerView.o00oo0OO adapter;
        if (this.f5376o00oo == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f5385o00ooO00;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.o00oOOoO) {
                ((androidx.viewpager2.adapter.o00oOOoO) adapter).o00oo00O(parcelable);
            }
            this.f5385o00ooO00 = null;
        }
        int max = Math.max(0, Math.min(this.f5376o00oo, adapter.getItemCount() - 1));
        this.f5381o00oo0o0 = max;
        this.f5376o00oo = -1;
        this.f5384o00ooO0.scrollToPosition(max);
        this.f5394o00ooOoo.o00oo00O();
    }

    public void o00oo0o(int i, boolean z) {
        RecyclerView.o00oo0OO adapter = getAdapter();
        if (adapter == null) {
            if (this.f5376o00oo != -1) {
                this.f5376o00oo = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.f5381o00oo0o0 && this.f5387o00ooO0o.o00oOoOO()) {
                return;
            }
            int i2 = this.f5381o00oo0o0;
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.f5381o00oo0o0 = min;
            this.f5394o00ooOoo.o00oo0O();
            if (!this.f5387o00ooO0o.o00oOoOO()) {
                d = this.f5387o00ooO0o.o00oOo0O();
            }
            this.f5387o00ooO0o.o00oo0(min, z);
            if (!z) {
                this.f5384o00ooO0.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) <= 3.0d) {
                this.f5384o00ooO0.smoothScrollToPosition(min);
                return;
            }
            this.f5384o00ooO0.scrollToPosition(d2 > d ? min - 3 : min + 3);
            RecyclerView recyclerView = this.f5384o00ooO0;
            recyclerView.post(new o0O0000O(min, recyclerView));
        }
    }

    public void o00oo0o0(int i, boolean z) {
        if (o00oOoOo()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        o00oo0o(i, z);
    }

    public final void o00oo0oO(Context context, AttributeSet attributeSet) {
        int[] iArr = R.styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void o00ooO0() {
        o0O00OO o0o00oo = this.f5386o00ooO0O;
        if (o0o00oo == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View o00oOoO2 = o0o00oo.o00oOoO(this.f5395o0O0o);
        if (o00oOoO2 == null) {
            return;
        }
        int position = this.f5395o0O0o.getPosition(o00oOoO2);
        if (position != this.f5381o00oo0o0 && getScrollState() == 0) {
            this.f5383o00ooO.onPageSelected(position);
        }
        this.f5380o00oo0o = false;
    }

    public void o00ooO00(@oo0oO0 o00oo0O o00oo0o2) {
        this.f5379o00oo0Oo.o00oOOoO(o00oo0o2);
    }

    public void o0O0o() {
        View o00oOoO2 = this.f5386o00ooO0O.o00oOoO(this.f5395o0O0o);
        if (o00oOoO2 == null) {
            return;
        }
        int[] o00oOo002 = this.f5386o00ooO0O.o00oOo00(this.f5395o0O0o, o00oOoO2);
        int i = o00oOo002[0];
        if (i == 0 && o00oOo002[1] == 0) {
            return;
        }
        this.f5384o00ooO0.smoothScrollBy(i, o00oOo002[1]);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5394o00ooOoo.o00oOoOO(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5384o00ooO0.getMeasuredWidth();
        int measuredHeight = this.f5384o00ooO0.getMeasuredHeight();
        this.f5378o00oo0O0.left = getPaddingLeft();
        this.f5378o00oo0O0.right = (i3 - i) - getPaddingRight();
        this.f5378o00oo0O0.top = getPaddingTop();
        this.f5378o00oo0O0.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.f5378o00oo0O0, this.f5377o00oo0O);
        RecyclerView recyclerView = this.f5384o00ooO0;
        Rect rect = this.f5377o00oo0O;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5380o00oo0o) {
            o00ooO0();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f5384o00ooO0, i, i2);
        int measuredWidth = this.f5384o00ooO0.getMeasuredWidth();
        int measuredHeight = this.f5384o00ooO0.getMeasuredHeight();
        int measuredState = this.f5384o00ooO0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5376o00oo = savedState.f5396o00oo0O;
        this.f5385o00ooO00 = savedState.f5398o00oo0Oo;
    }

    @Override // android.view.View
    @o0OO00OO
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5397o00oo0O0 = this.f5384o00ooO0.getId();
        int i = this.f5376o00oo;
        if (i == -1) {
            i = this.f5381o00oo0o0;
        }
        savedState.f5396o00oo0O = i;
        Parcelable parcelable = this.f5385o00ooO00;
        if (parcelable == null) {
            RecyclerView.o00oo0OO adapter = this.f5384o00ooO0.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.o00oOOoO) {
                parcelable = ((androidx.viewpager2.adapter.o00oOOoO) adapter).o00oOOo0();
            }
            return savedState;
        }
        savedState.f5398o00oo0Oo = parcelable;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    @o0OOooO0(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f5394o00ooOoo.o00oOo00(i, bundle) ? this.f5394o00ooOoo.o00oOooo(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(@o0OO00OO RecyclerView.o00oo0OO o00oo0oo) {
        RecyclerView.o00oo0OO adapter = this.f5384o00ooO0.getAdapter();
        this.f5394o00ooOoo.o00oOo0o(adapter);
        o00oo(adapter);
        this.f5384o00ooO0.setAdapter(o00oo0oo);
        this.f5381o00oo0o0 = 0;
        o00oo0Oo();
        this.f5394o00ooOoo.o00oOo0O(o00oo0oo);
        o00oo00O(o00oo0oo);
    }

    public void setCurrentItem(int i) {
        o00oo0o0(i, true);
    }

    @Override // android.view.View
    @o0OOooO0(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5394o00ooOoo.o00oo0O0();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5393o00ooOoO = i;
        this.f5384o00ooO0.requestLayout();
    }

    public void setOrientation(int i) {
        this.f5395o0O0o.setOrientation(i);
        this.f5394o00ooOoo.o00oo0Oo();
    }

    public void setPageTransformer(@o0OO00OO o00ooO0 o00ooo02) {
        boolean z = this.f5392o00ooOo0;
        if (o00ooo02 != null) {
            if (!z) {
                this.f5390o00ooOOo = this.f5384o00ooO0.getItemAnimator();
                this.f5392o00ooOo0 = true;
            }
            this.f5384o00ooO0.setItemAnimator(null);
        } else if (z) {
            this.f5384o00ooO0.setItemAnimator(this.f5390o00ooOOo);
            this.f5390o00ooOOo = null;
            this.f5392o00ooOo0 = false;
        }
        androidx.viewpager2.widget.o00oo00O o00oo00o = this.f5388o00ooOO;
        if (o00ooo02 == o00oo00o.f5454o00oOOoO) {
            return;
        }
        o00oo00o.f5454o00oOOoO = o00ooo02;
        o00oo0O();
    }

    public void setUserInputEnabled(boolean z) {
        this.f5391o00ooOo = z;
        this.f5394o00ooOoo.o00oo0o0();
    }
}
