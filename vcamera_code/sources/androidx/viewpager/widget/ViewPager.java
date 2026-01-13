package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
import o0O000oo.o0ooO;
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: o0O00o  reason: collision with root package name */
    public static final boolean f5220o0O00o = false;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public static final String f5221o0O00o0o = "ViewPager";

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public static final boolean f5222o0O00oO0 = false;

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public static final int f5223o0O0O0O = 1;

    /* renamed from: o0O0O0Oo  reason: collision with root package name */
    public static final int f5224o0O0O0Oo = 16;

    /* renamed from: o0O0O0o0  reason: collision with root package name */
    public static final int f5226o0O0O0o0 = 400;

    /* renamed from: o0O0OO  reason: collision with root package name */
    public static final int f5229o0O0OO = 1;

    /* renamed from: o0O0OO0  reason: collision with root package name */
    public static final int f5230o0O0OO0 = 2;

    /* renamed from: o0O0OO0O  reason: collision with root package name */
    public static final int f5231o0O0OO0O = 0;

    /* renamed from: o0O0OOO0  reason: collision with root package name */
    public static final int f5233o0O0OOO0 = 2;

    /* renamed from: o0O0OOOo  reason: collision with root package name */
    public static final int f5234o0O0OOOo = 0;

    /* renamed from: o0O0OOo  reason: collision with root package name */
    public static final int f5235o0O0OOo = 1;

    /* renamed from: o0O0OOoO  reason: collision with root package name */
    public static final int f5236o0O0OOoO = 2;

    /* renamed from: o0O0oo0o  reason: collision with root package name */
    public static final int f5237o0O0oo0o = 25;

    /* renamed from: o0oO0O0o  reason: collision with root package name */
    public static final int f5238o0oO0O0o = 600;

    /* renamed from: o0ooO  reason: collision with root package name */
    public static final int f5239o0ooO = -1;

    /* renamed from: o0  reason: collision with root package name */
    public float f5240o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public Parcelable f5241o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ArrayList<o00oo00O> f5242o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f5243o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00oo00O f5244o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public oo0OOoo.o00oOOo0 f5245o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Rect f5246o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f5247o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f5248o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Scroller f5249o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public ClassLoader f5250o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f5251o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oo f5252o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f5253o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public Drawable f5254o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f5255o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f5256o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f5257o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f5258o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f5259o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public boolean f5260o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f5261o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public boolean f5262o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f5263o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public boolean f5264o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public boolean f5265o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f5266o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public int f5267o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public int f5268o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public float f5269o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public float f5270o00ooooo;

    /* renamed from: o0O00  reason: collision with root package name */
    public boolean f5271o0O00;

    /* renamed from: o0O000  reason: collision with root package name */
    public int f5272o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public float f5273o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public int f5274o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public VelocityTracker f5275o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public int f5276o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public int f5277o0O000Oo;

    /* renamed from: o0O000o  reason: collision with root package name */
    public EdgeEffect f5278o0O000o;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public long f5279o0O000o0;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public boolean f5280o0O000oo;

    /* renamed from: o0O00O  reason: collision with root package name */
    public o00oo0O f5281o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public boolean f5282o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public List<o00oo0O> f5283o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public o00oo0O f5284o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public List<o00oo0O0> f5285o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public o0O0o f5286o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public int f5287o0O00OoO;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public ArrayList<View> f5288o0O00Ooo;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public final Runnable f5289o0O00o00;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public int f5290o0O00o0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f5291o0O0o;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public int f5292o0OoO00O;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public boolean f5293o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public int f5294o0OoOoOo;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public int f5295o0oO0Ooo;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public EdgeEffect f5296o0ooOoOO;

    /* renamed from: o0O0O0o  reason: collision with root package name */
    public static final int[] f5225o0O0O0o = {16842931};

    /* renamed from: o0O0O0oO  reason: collision with root package name */
    public static final Comparator<o00oo00O> f5227o0O0O0oO = new o00oOOo0();

    /* renamed from: o0O0O0oo  reason: collision with root package name */
    public static final Interpolator f5228o0O0O0oo = new o00oOOoO();

    /* renamed from: o0O0OOO  reason: collision with root package name */
    public static final o00ooO f5232o0O0OOO = new o00ooO();

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Parcelable f5297o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f5298o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public ClassLoader f5299o00oo0Oo;

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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5298o00oo0O0 = parcel.readInt();
            this.f5297o00oo0O = parcel.readParcelable(classLoader);
            this.f5299o00oo0Oo = classLoader;
        }

        public SavedState(@oo0oO0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("FragmentPager.SavedState{");
            o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
            o00oOOo02.append(" position=");
            return android.support.v4.media.o00oOo00.o00oOOo0(o00oOOo02, this.f5298o00oo0O0, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5298o00oo0O0);
            parcel.writeParcelable(this.f5297o00oo0O, i);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Comparator<o00oo00O> {
        @Override // java.util.Comparator
        public int compare(o00oo00O o00oo00o, o00oo00O o00oo00o2) {
            return o00oo00o.f5311o00oOOoO - o00oo00o2.f5311o00oOOoO;
        }

        public int o00oOOo0(o00oo00O o00oo00o, o00oo00O o00oo00o2) {
            return o00oo00o.f5311o00oOOoO - o00oo00o2.f5311o00oOOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.o00ooo00();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o0ooO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Rect f5301o00oOOo0 = new Rect();

        public o00oOo0O() {
        }

        @Override // o0O000oo.o0ooO
        public o0OOo000 onApplyWindowInsets(View view, o0OOo000 o0ooo000) {
            o0OOo000 o0O0o02 = o0O0o00O.o0O0o0(view, o0ooo000);
            if (o0O0o02.o00ooO0o()) {
                return o0O0o02;
            }
            Rect rect = this.f5301o00oOOo0;
            rect.left = o0O0o02.o00oo0O0();
            rect.top = o0O0o02.o00oo0Oo();
            rect.right = o0O0o02.o00oo0O();
            rect.bottom = o0O0o02.o00oo0OO();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                o0OOo000 o00oo0O02 = o0O0o00O.o00oo0O0(ViewPager.this.getChildAt(i), o0O0o02);
                rect.left = Math.min(o00oo0O02.o00oo0O0(), rect.left);
                rect.top = Math.min(o00oo0O02.o00oo0Oo(), rect.top);
                rect.right = Math.min(o00oo0O02.o00oo0O(), rect.right);
                rect.bottom = Math.min(o00oo0O02.o00oo0OO(), rect.bottom);
            }
            return o0O0o02.o00ooOO(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    /* loaded from: classes.dex */
    public class o00oo extends DataSetObserver {
        public o00oo() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.o00oOoOo();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.o00oOoOo();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends ViewGroup.LayoutParams {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f5304o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f5305o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f5306o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f5307o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f5308o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f5309o00oOooO;

        public o00oo0() {
            super(-1, -1);
            this.f5306o00oOo00 = 0.0f;
        }

        public o00oo0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5306o00oOo00 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f5225o0O0O0o);
            this.f5305o00oOOoO = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Object f5310o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f5311o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f5312o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f5313o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f5314o00oOooO;
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @o0OO0 int i2);

        void onPageSelected(int i);
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        void onAdapterChanged(@oo0oO0 ViewPager viewPager, @o0OO00OO oo0OOoo.o00oOOo0 o00oooo02, @o0OO00OO oo0OOoo.o00oOOo0 o00oooo03);
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends o0O000oo.o00oOOoO {
        public o00oo0OO() {
        }

        public final boolean o00oOOo0() {
            oo0OOoo.o00oOOo0 o00oooo02 = ViewPager.this.f5245o00oo0o;
            return o00oooo02 != null && o00oooo02.o00oOo0O() > 1;
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            oo0OOoo.o00oOOo0 o00oooo02;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(o00oOOo0());
            if (accessibilityEvent.getEventType() != 4096 || (o00oooo02 = ViewPager.this.f5245o00oo0o) == null) {
                return;
            }
            accessibilityEvent.setItemCount(o00oooo02.o00oOo0O());
            accessibilityEvent.setFromIndex(ViewPager.this.f5247o00oo0oO);
            accessibilityEvent.setToIndex(ViewPager.this.f5247o00oo0oO);
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o0O00.o00oo0O o00oo0o2) {
            super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
            o00oo0o2.o0O0Ooo0(ViewPager.class.getName());
            o00oo0o2.o0O0ooo0(o00oOOo0());
            if (ViewPager.this.canScrollHorizontally(1)) {
                o00oo0o2.o00oOOo0(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                o00oo0o2.o00oOOo0(8192);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f5247o00oo0oO - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f5247o00oo0oO + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(View view, View view2) {
            o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
            o00oo0 o00oo0Var2 = (o00oo0) view2.getLayoutParams();
            boolean z = o00oo0Var.f5304o00oOOo0;
            return z != o00oo0Var2.f5304o00oOOo0 ? z ? 1 : -1 : o00oo0Var.f5307o00oOo0O - o00oo0Var2.f5307o00oOo0O;
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 implements o00oo0O {
        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.o00oo0O
        public void onPageSelected(int i) {
        }
    }

    /* loaded from: classes.dex */
    public interface o0O0o {
        void o00oOOo0(@oo0oO0 View view, float f);
    }

    public ViewPager(@oo0oO0 Context context) {
        super(context);
        this.f5242o00oo0O = new ArrayList<>();
        this.f5244o00oo0Oo = new o00oo00O();
        this.f5246o00oo0o0 = new Rect();
        this.f5291o0O0o = -1;
        this.f5241o00oo = null;
        this.f5250o00ooO00 = null;
        this.f5257o00ooOo0 = -3.4028235E38f;
        this.f5256o00ooOo = Float.MAX_VALUE;
        this.f5263o00ooo0o = 1;
        this.f5274o0O0000O = -1;
        this.f5280o0O000oo = true;
        this.f5271o0O00 = false;
        this.f5289o0O00o00 = new o00oOo00();
        this.f5290o0O00o0O = 0;
        o00ooO0O();
    }

    public ViewPager(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5242o00oo0O = new ArrayList<>();
        this.f5244o00oo0Oo = new o00oo00O();
        this.f5246o00oo0o0 = new Rect();
        this.f5291o0O0o = -1;
        this.f5241o00oo = null;
        this.f5250o00ooO00 = null;
        this.f5257o00ooOo0 = -3.4028235E38f;
        this.f5256o00ooOo = Float.MAX_VALUE;
        this.f5263o00ooo0o = 1;
        this.f5274o0O0000O = -1;
        this.f5280o0O000oo = true;
        this.f5271o0O00 = false;
        this.f5289o0O00o00 = new o00oOo00();
        this.f5290o0O00o0O = 0;
        o00ooO0O();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public static boolean o00ooO0o(@oo0oO0 View view) {
        return view.getClass().getAnnotation(o00oOoO.class) != null;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f5260o00ooo0 != z) {
            this.f5260o00ooo0 = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        o00oo00O o00oo2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (o00oo2 = o00oo(childAt)) != null && o00oo2.f5311o00oOOoO == this.f5247o00oo0oO) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        o00oo00O o00oo2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (o00oo2 = o00oo(childAt)) != null && o00oo2.f5311o00oOOoO == this.f5247o00oo0oO) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        o00oo0 o00oo0Var = (o00oo0) layoutParams;
        boolean o00ooO0o2 = o00oo0Var.f5304o00oOOo0 | o00ooO0o(view);
        o00oo0Var.f5304o00oOOo0 = o00ooO0o2;
        if (!this.f5261o00ooo00) {
            super.addView(view, i, layoutParams);
        } else if (o00ooO0o2) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            o00oo0Var.f5309o00oOooO = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f5245o00oo0o == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5257o00ooOo0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f5256o00ooOo));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o00oo0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f5251o00ooO0O = true;
        if (this.f5249o00ooO0.isFinished() || !this.f5249o00ooO0.computeScrollOffset()) {
            o00oOoOO(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f5249o00ooO0.getCurrX();
        int currY = this.f5249o00ooO0.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o00ooOoO(currX)) {
                this.f5249o00ooO0.abortAnimation();
                scrollTo(0, currY);
            }
        }
        o0O0o00O.o0O0o0oO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o00oo0o0(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        o00oo00O o00oo2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (o00oo2 = o00oo(childAt)) != null && o00oo2.f5311o00oOOoO == this.f5247o00oo0oO && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        oo0OOoo.o00oOOo0 o00oooo02;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (o00oooo02 = this.f5245o00oo0o) != null && o00oooo02.o00oOo0O() > 1)) {
            if (!this.f5278o0O000o.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f5257o00ooOo0 * width);
                this.f5278o0O000o.setSize(height, width);
                z = false | this.f5278o0O000o.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5296o0ooOoOO.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f5256o00ooOo + 1.0f)) * width2);
                this.f5296o0ooOoOO.setSize(height2, width2);
                z |= this.f5296o0ooOoOO.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f5278o0O000o.finish();
            this.f5296o0ooOoOO.finish();
        }
        if (z) {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5254o00ooOO0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o00oo0();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o00oo0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @o0OO00OO
    public oo0OOoo.o00oOOo0 getAdapter() {
        return this.f5245o00oo0o;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f5287o0O00OoO == 2) {
            i2 = (i - 1) - i2;
        }
        return ((o00oo0) this.f5288o0O00Ooo.get(i2).getLayoutParams()).f5308o00oOo0o;
    }

    public int getCurrentItem() {
        return this.f5247o00oo0oO;
    }

    public int getOffscreenPageLimit() {
        return this.f5263o00ooo0o;
    }

    public int getPageMargin() {
        return this.f5248o00ooO;
    }

    public void o0(int i, boolean z, boolean z2, int i2) {
        oo0OOoo.o00oOOo0 o00oooo02 = this.f5245o00oo0o;
        if (o00oooo02 == null || o00oooo02.o00oOo0O() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f5247o00oo0oO != i || this.f5242o00oo0O.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f5245o00oo0o.o00oOo0O()) {
                i = this.f5245o00oo0o.o00oOo0O() - 1;
            }
            int i3 = this.f5263o00ooo0o;
            int i4 = this.f5247o00oo0oO;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f5242o00oo0O.size(); i5++) {
                    this.f5242o00oo0O.get(i5).f5312o00oOo00 = true;
                }
            }
            boolean z3 = this.f5247o00oo0oO != i;
            if (!this.f5280o0O000oo) {
                o00ooo0(i);
                o00oooo(i, z, i2, z3);
                return;
            }
            this.f5247o00oo0oO = i;
            if (z3) {
                o00oo00O(i);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public o00oo00O o00oOOo0(int i, int i2) {
        o00oo00O o00oo00o = new o00oo00O();
        o00oo00o.f5311o00oOOoO = i;
        o00oo00o.f5310o00oOOo0 = this.f5245o00oo0o.o00oOoOo(this, i);
        o00oo00o.f5314o00oOooO = this.f5245o00oo0o.o00oOoO(i);
        if (i2 < 0 || i2 >= this.f5242o00oo0O.size()) {
            this.f5242o00oo0O.add(o00oo00o);
        } else {
            this.f5242o00oo0O.add(i2, o00oo00o);
        }
        return o00oo00o;
    }

    public void o00oOOoO(@oo0oO0 o00oo0O0 o00oo0o02) {
        if (this.f5285o0O00OOO == null) {
            this.f5285o0O00OOO = new ArrayList();
        }
        this.f5285o0O00OOO.add(o00oo0o02);
    }

    public void o00oOo00(@oo0oO0 o00oo0O o00oo0o2) {
        if (this.f5283o0O00O0o == null) {
            this.f5283o0O00O0o = new ArrayList();
        }
        this.f5283o0O00O0o.add(o00oo0o2);
    }

    public boolean o00oOo0O() {
        if (this.f5264o00oooO) {
            return false;
        }
        this.f5293o0OoOoOO = true;
        setScrollState(1);
        this.f5269o00ooooO = 0.0f;
        this.f5240o0 = 0.0f;
        VelocityTracker velocityTracker = this.f5275o0O0000o;
        if (velocityTracker == null) {
            this.f5275o0O0000o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f5275o0O0000o.addMovement(obtain);
        obtain.recycle();
        this.f5279o0O000o0 = uptimeMillis;
        return true;
    }

    public final void o00oOo0o(o00oo00O o00oo00o, int i, o00oo00O o00oo00o2) {
        int i2;
        int i3;
        o00oo00O o00oo00o3;
        o00oo00O o00oo00o4;
        int o00oOo0O2 = this.f5245o00oo0o.o00oOo0O();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f5248o00ooO / clientWidth : 0.0f;
        if (o00oo00o2 != null) {
            int i4 = o00oo00o2.f5311o00oOOoO;
            int i5 = o00oo00o.f5311o00oOOoO;
            if (i4 < i5) {
                float f2 = o00oo00o2.f5313o00oOo0O + o00oo00o2.f5314o00oOooO + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= o00oo00o.f5311o00oOOoO && i7 < this.f5242o00oo0O.size()) {
                    while (true) {
                        o00oo00o4 = this.f5242o00oo0O.get(i7);
                        if (i6 <= o00oo00o4.f5311o00oOOoO || i7 >= this.f5242o00oo0O.size() - 1) {
                            break;
                        }
                        i7++;
                    }
                    while (i6 < o00oo00o4.f5311o00oOOoO) {
                        f2 += this.f5245o00oo0o.o00oOoO(i6) + f;
                        i6++;
                    }
                    o00oo00o4.f5313o00oOo0O = f2;
                    f2 += o00oo00o4.f5314o00oOooO + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f5242o00oo0O.size() - 1;
                float f3 = o00oo00o2.f5313o00oOo0O;
                while (true) {
                    i4--;
                    if (i4 < o00oo00o.f5311o00oOOoO || size < 0) {
                        break;
                    }
                    while (true) {
                        o00oo00o3 = this.f5242o00oo0O.get(size);
                        if (i4 >= o00oo00o3.f5311o00oOOoO || size <= 0) {
                            break;
                        }
                        size--;
                    }
                    while (i4 > o00oo00o3.f5311o00oOOoO) {
                        f3 -= this.f5245o00oo0o.o00oOoO(i4) + f;
                        i4--;
                    }
                    f3 -= o00oo00o3.f5314o00oOooO + f;
                    o00oo00o3.f5313o00oOo0O = f3;
                }
            }
        }
        int size2 = this.f5242o00oo0O.size();
        float f4 = o00oo00o.f5313o00oOo0O;
        int i8 = o00oo00o.f5311o00oOOoO;
        int i9 = i8 - 1;
        this.f5257o00ooOo0 = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = o00oOo0O2 - 1;
        this.f5256o00ooOo = i8 == i10 ? (o00oo00o.f5314o00oOooO + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            o00oo00O o00oo00o5 = this.f5242o00oo0O.get(i11);
            while (true) {
                i3 = o00oo00o5.f5311o00oOOoO;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f5245o00oo0o.o00oOoO(i9) + f;
                i9--;
            }
            f4 -= o00oo00o5.f5314o00oOooO + f;
            o00oo00o5.f5313o00oOo0O = f4;
            if (i3 == 0) {
                this.f5257o00ooOo0 = f4;
            }
            i11--;
            i9--;
        }
        float f5 = o00oo00o.f5313o00oOo0O + o00oo00o.f5314o00oOooO + f;
        int i12 = o00oo00o.f5311o00oOOoO + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            o00oo00O o00oo00o6 = this.f5242o00oo0O.get(i13);
            while (true) {
                i2 = o00oo00o6.f5311o00oOOoO;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f5245o00oo0o.o00oOoO(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f5256o00ooOo = (o00oo00o6.f5314o00oOooO + f5) - 1.0f;
            }
            o00oo00o6.f5313o00oOo0O = f5;
            f5 += o00oo00o6.f5314o00oOooO + f;
            i13++;
            i12++;
        }
        this.f5271o0O00 = false;
    }

    public void o00oOoO() {
        List<o00oo0O> list = this.f5283o0O00O0o;
        if (list != null) {
            list.clear();
        }
    }

    public boolean o00oOoO0(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && o00oOoO0(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public final void o00oOoOO(boolean z) {
        boolean z2 = this.f5290o0O00o0O == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f5249o00ooO0.isFinished()) {
                this.f5249o00ooO0.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5249o00ooO0.getCurrX();
                int currY = this.f5249o00ooO0.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o00ooOoO(currX);
                    }
                }
            }
        }
        this.f5262o00ooo0O = false;
        for (int i = 0; i < this.f5242o00oo0O.size(); i++) {
            o00oo00O o00oo00o = this.f5242o00oo0O.get(i);
            if (o00oo00o.f5312o00oOo00) {
                o00oo00o.f5312o00oOo00 = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                o0O0o00O.o0O0oo0O(this, this.f5289o0O00o00);
            } else {
                this.f5289o0O00o00.run();
            }
        }
    }

    public void o00oOoOo() {
        int o00oOo0O2 = this.f5245o00oo0o.o00oOo0O();
        this.f5243o00oo0O0 = o00oOo0O2;
        boolean z = this.f5242o00oo0O.size() < (this.f5263o00ooo0o * 2) + 1 && this.f5242o00oo0O.size() < o00oOo0O2;
        int i = this.f5247o00oo0oO;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f5242o00oo0O.size()) {
            o00oo00O o00oo00o = this.f5242o00oo0O.get(i2);
            int o00oOo0o2 = this.f5245o00oo0o.o00oOo0o(o00oo00o.f5310o00oOOo0);
            if (o00oOo0o2 != -1) {
                if (o00oOo0o2 == -2) {
                    this.f5242o00oo0O.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f5245o00oo0o.o00oo0o(this);
                        z2 = true;
                    }
                    this.f5245o00oo0o.o00oOOoO(this, o00oo00o.f5311o00oOOoO, o00oo00o.f5310o00oOOo0);
                    int i3 = this.f5247o00oo0oO;
                    if (i3 == o00oo00o.f5311o00oOOoO) {
                        i = Math.max(0, Math.min(i3, o00oOo0O2 - 1));
                    }
                } else {
                    int i4 = o00oo00o.f5311o00oOOoO;
                    if (i4 != o00oOo0o2) {
                        if (i4 == this.f5247o00oo0oO) {
                            i = o00oOo0o2;
                        }
                        o00oo00o.f5311o00oOOoO = o00oOo0o2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f5245o00oo0o.o00oOooO(this);
        }
        Collections.sort(this.f5242o00oo0O, f5227o0O0O0oO);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                o00oo0 o00oo0Var = (o00oo0) getChildAt(i5).getLayoutParams();
                if (!o00oo0Var.f5304o00oOOo0) {
                    o00oo0Var.f5306o00oOo00 = 0.0f;
                }
            }
            o00ooooo(i, false, true);
            requestLayout();
        }
    }

    public final int o00oOoo0(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f5294o0OoOoOo || Math.abs(i2) <= this.f5272o0O000) {
            i += (int) (f + (i >= this.f5247o00oo0oO ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f5242o00oo0O.size() > 0) {
            ArrayList<o00oo00O> arrayList = this.f5242o00oo0O;
            return Math.max(this.f5242o00oo0O.get(0).f5311o00oOOoO, Math.min(i, arrayList.get(arrayList.size() - 1).f5311o00oOOoO));
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00oOooO(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L31
        Lb:
            if (r0 == 0) goto L31
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L31
            android.view.ViewParent r0 = r0.getParent()
        L25:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L9
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L25
        L31:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L7d
            if (r3 == r0) goto L7d
            if (r7 != r5) goto L62
            android.graphics.Rect r1 = r6.f5246o00oo0o0
            android.graphics.Rect r1 = r6.o00oo0oO(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5246o00oo0o0
            android.graphics.Rect r2 = r6.o00oo0oO(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L5c
            if (r1 < r2) goto L5c
            boolean r0 = r6.o00ooOo0()
            goto L60
        L5c:
            boolean r0 = r3.requestFocus()
        L60:
            r2 = r0
            goto L90
        L62:
            if (r7 != r4) goto L90
            android.graphics.Rect r1 = r6.f5246o00oo0o0
            android.graphics.Rect r1 = r6.o00oo0oO(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5246o00oo0o0
            android.graphics.Rect r2 = r6.o00oo0oO(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L5c
            if (r1 > r2) goto L5c
            boolean r0 = r6.o00ooOo()
            goto L60
        L7d:
            if (r7 == r5) goto L8c
            if (r7 != r1) goto L82
            goto L8c
        L82:
            if (r7 == r4) goto L87
            r0 = 2
            if (r7 != r0) goto L90
        L87:
            boolean r2 = r6.o00ooOo()
            goto L90
        L8c:
            boolean r2 = r6.o00ooOo0()
        L90:
            if (r2 == 0) goto L99
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o00oOooO(int):boolean");
    }

    public final void o00oOooo(int i, float f, int i2) {
        o00oo0O o00oo0o2 = this.f5281o0O00O;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageScrolled(i, f, i2);
        }
        List<o00oo0O> list = this.f5283o0O00O0o;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                o00oo0O o00oo0o3 = this.f5283o0O00O0o.get(i3);
                if (o00oo0o3 != null) {
                    o00oo0o3.onPageScrolled(i, f, i2);
                }
            }
        }
        o00oo0O o00oo0o4 = this.f5284o0O00OO;
        if (o00oo0o4 != null) {
            o00oo0o4.onPageScrolled(i, f, i2);
        }
    }

    public o00oo00O o00oo(View view) {
        for (int i = 0; i < this.f5242o00oo0O.size(); i++) {
            o00oo00O o00oo00o = this.f5242o00oo0O.get(i);
            if (this.f5245o00oo0o.o00oOoo0(view, o00oo00o.f5310o00oOOo0)) {
                return o00oo00o;
            }
        }
        return null;
    }

    public final void o00oo0(int i) {
        o00oo0O o00oo0o2 = this.f5281o0O00O;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageScrollStateChanged(i);
        }
        List<o00oo0O> list = this.f5283o0O00O0o;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00oo0O o00oo0o3 = this.f5283o0O00O0o.get(i2);
                if (o00oo0o3 != null) {
                    o00oo0o3.onPageScrollStateChanged(i);
                }
            }
        }
        o00oo0O o00oo0o4 = this.f5284o0O00OO;
        if (o00oo0o4 != null) {
            o00oo0o4.onPageScrollStateChanged(i);
        }
    }

    public final void o00oo00O(int i) {
        o00oo0O o00oo0o2 = this.f5281o0O00O;
        if (o00oo0o2 != null) {
            o00oo0o2.onPageSelected(i);
        }
        List<o00oo0O> list = this.f5283o0O00O0o;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00oo0O o00oo0o3 = this.f5283o0O00O0o.get(i2);
                if (o00oo0o3 != null) {
                    o00oo0o3.onPageSelected(i);
                }
            }
        }
        o00oo0O o00oo0o4 = this.f5284o0O00OO;
        if (o00oo0o4 != null) {
            o00oo0o4.onPageSelected(i);
        }
    }

    public final void o00oo0O() {
        this.f5264o00oooO = false;
        this.f5265o00oooOO = false;
        VelocityTracker velocityTracker = this.f5275o0O0000o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5275o0O0000o = null;
        }
    }

    public final void o00oo0O0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f5295o0oO0Ooo : 0, null);
        }
    }

    public float o00oo0OO(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void o00oo0Oo() {
        if (!this.f5293o0OoOoOO) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f5245o00oo0o != null) {
            VelocityTracker velocityTracker = this.f5275o0O0000o;
            velocityTracker.computeCurrentVelocity(1000, this.f5276o0O000O);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5274o0O0000O);
            this.f5262o00ooo0O = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            o00oo00O o00ooO002 = o00ooO00();
            o0(o00oOoo0(o00ooO002.f5311o00oOOoO, ((scrollX / clientWidth) - o00ooO002.f5313o00oOo0O) / o00ooO002.f5314o00oOooO, xVelocity, (int) (this.f5269o00ooooO - this.f5240o0)), true, true, xVelocity);
        }
        o00oo0O();
        this.f5293o0OoOoOO = false;
    }

    public void o00oo0o(float f) {
        ArrayList<o00oo00O> arrayList;
        if (!this.f5293o0OoOoOO) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f5245o00oo0o == null) {
            return;
        }
        this.f5269o00ooooO += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.f5257o00ooOo0 * clientWidth;
        float f3 = this.f5256o00ooOo * clientWidth;
        o00oo00O o00oo00o = this.f5242o00oo0O.get(0);
        o00oo00O o00oo00o2 = this.f5242o00oo0O.get(arrayList.size() - 1);
        if (o00oo00o.f5311o00oOOoO != 0) {
            f2 = o00oo00o.f5313o00oOo0O * clientWidth;
        }
        if (o00oo00o2.f5311o00oOOoO != this.f5245o00oo0o.o00oOo0O() - 1) {
            f3 = o00oo00o2.f5313o00oOo0O * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f5269o00ooooO = (scrollX - i) + this.f5269o00ooooO;
        scrollTo(i, getScrollY());
        o00ooOoO(i);
        MotionEvent obtain = MotionEvent.obtain(this.f5279o0O000o0, SystemClock.uptimeMillis(), 2, this.f5269o00ooooO, 0.0f, 0);
        this.f5275o0O0000o.addMovement(obtain);
        obtain.recycle();
    }

    public boolean o00oo0o0(@oo0oO0 KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return o00oOooO(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return o00oOooO(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return o00ooOo();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return o00ooOo0();
            } else {
                i = 17;
            }
            return o00oOooO(i);
        }
        return false;
    }

    public final Rect o00oo0oO(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    public boolean o00ooO() {
        return this.f5293o0OoOoOO;
    }

    public o00oo00O o00ooO0(int i) {
        for (int i2 = 0; i2 < this.f5242o00oo0O.size(); i2++) {
            o00oo00O o00oo00o = this.f5242o00oo0O.get(i2);
            if (o00oo00o.f5311o00oOOoO == i) {
                return o00oo00o;
            }
        }
        return null;
    }

    public final o00oo00O o00ooO00() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f5248o00ooO / clientWidth : 0.0f;
        o00oo00O o00oo00o = null;
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        float f3 = 0.0f;
        while (i2 < this.f5242o00oo0O.size()) {
            o00oo00O o00oo00o2 = this.f5242o00oo0O.get(i2);
            if (!z && o00oo00o2.f5311o00oOOoO != (i = i3 + 1)) {
                o00oo00o2 = this.f5244o00oo0Oo;
                o00oo00o2.f5313o00oOo0O = f + f3 + f2;
                o00oo00o2.f5311o00oOOoO = i;
                o00oo00o2.f5314o00oOooO = this.f5245o00oo0o.o00oOoO(i);
                i2--;
            }
            f = o00oo00o2.f5313o00oOo0O;
            float f4 = o00oo00o2.f5314o00oOooO + f + f2;
            if (!z && scrollX < f) {
                return o00oo00o;
            }
            if (scrollX < f4 || i2 == this.f5242o00oo0O.size() - 1) {
                return o00oo00o2;
            }
            i3 = o00oo00o2.f5311o00oOOoO;
            f3 = o00oo00o2.f5314o00oOooO;
            i2++;
            z = false;
            o00oo00o = o00oo00o2;
        }
        return o00oo00o;
    }

    public void o00ooO0O() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5249o00ooO0 = new Scroller(context, f5228o0O0O0oo);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5267o00oooo = viewConfiguration.getScaledPagingTouchSlop();
        this.f5272o0O000 = (int) (400.0f * f);
        this.f5276o0O000O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5278o0O000o = new EdgeEffect(context);
        this.f5296o0ooOoOO = new EdgeEffect(context);
        this.f5294o0OoOoOo = (int) (25.0f * f);
        this.f5277o0O000Oo = (int) (2.0f * f);
        this.f5266o00oooOo = (int) (f * 16.0f);
        o0O0o00O.o0O0oOo(this, new o00oo0OO());
        if (o0O0o00O.o00oo0OO.o00oOo00(this) == 0) {
            o0O0o00O.o00oo0OO.o00oo0o0(this, 1);
        }
        o0O0o00O.o00ooO0.o00oo0oO(this, new o00oOo0O());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @o00oOooO.o0O00O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00ooOO(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f5292o0OoO00O
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$o00oo0 r9 = (androidx.viewpager.widget.ViewPager.o00oo0) r9
            boolean r10 = r9.f5304o00oOOo0
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f5305o00oOOoO
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.o00oOooo(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$o0O0o r13 = r12.f5286o0O00Oo
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$o00oo0 r0 = (androidx.viewpager.widget.ViewPager.o00oo0) r0
            boolean r0 = r0.f5304o00oOOo0
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$o0O0o r3 = r12.f5286o0O00Oo
            r3.o00oOOo0(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f5282o0O00O0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o00ooOO(int, float, int):void");
    }

    public final boolean o00ooOO0(float f, float f2) {
        return (f < ((float) this.f5268o00oooo0) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f5268o00oooo0)) && f2 < 0.0f);
    }

    public final void o00ooOOo(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5274o0O0000O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5269o00ooooO = motionEvent.getX(i);
            this.f5274o0O0000O = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5275o0O0000o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean o00ooOo() {
        oo0OOoo.o00oOOo0 o00oooo02 = this.f5245o00oo0o;
        if (o00oooo02 == null || this.f5247o00oo0oO >= o00oooo02.o00oOo0O() - 1) {
            return false;
        }
        o00ooooO(this.f5247o00oo0oO + 1, true);
        return true;
    }

    public boolean o00ooOo0() {
        int i = this.f5247o00oo0oO;
        if (i > 0) {
            o00ooooO(i - 1, true);
            return true;
        }
        return false;
    }

    public final boolean o00ooOoO(int i) {
        if (this.f5242o00oo0O.size() == 0) {
            if (this.f5280o0O000oo) {
                return false;
            }
            this.f5282o0O00O0 = false;
            o00ooOO(0, 0.0f, 0);
            if (this.f5282o0O00O0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        o00oo00O o00ooO002 = o00ooO00();
        int clientWidth = getClientWidth();
        int i2 = this.f5248o00ooO;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = o00ooO002.f5311o00oOOoO;
        float f2 = ((i / f) - o00ooO002.f5313o00oOo0O) / (o00ooO002.f5314o00oOooO + (i2 / f));
        this.f5282o0O00O0 = false;
        o00ooOO(i4, f2, (int) (i3 * f2));
        if (this.f5282o0O00O0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o00ooOoo(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f5269o00ooooO - f;
        this.f5269o00ooooO = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f5257o00ooOo0 * clientWidth;
        float f4 = this.f5256o00ooOo * clientWidth;
        boolean z3 = false;
        o00oo00O o00oo00o = this.f5242o00oo0O.get(0);
        ArrayList<o00oo00O> arrayList = this.f5242o00oo0O;
        o00oo00O o00oo00o2 = arrayList.get(arrayList.size() - 1);
        if (o00oo00o.f5311o00oOOoO != 0) {
            f3 = o00oo00o.f5313o00oOo0O * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (o00oo00o2.f5311o00oOOoO != this.f5245o00oo0o.o00oOo0O() - 1) {
            f4 = o00oo00o2.f5313o00oOo0O * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f5278o0O000o.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f5296o0ooOoOO.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f5269o00ooooO = (scrollX - i) + this.f5269o00ooooO;
        scrollTo(i, getScrollY());
        o00ooOoO(i);
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r5 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
        if (r6 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r6 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r6 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
        r7 = r14.f5242o00oo0O.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00ooo0(int r15) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o00ooo0(int):void");
    }

    public void o00ooo00() {
        o00ooo0(this.f5247o00oo0oO);
    }

    public final void o00ooo0O(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f5242o00oo0O.isEmpty()) {
            o00oo00O o00ooO02 = o00ooO0(this.f5247o00oo0oO);
            min = (int) ((o00ooO02 != null ? Math.min(o00ooO02.f5313o00oOo0O, this.f5256o00ooOo) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            o00oOoOO(false);
        } else if (!this.f5249o00ooO0.isFinished()) {
            this.f5249o00ooO0.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    public final void o00ooo0o() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((o00oo0) getChildAt(i).getLayoutParams()).f5304o00oOOo0) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public void o00oooO(@oo0oO0 o00oo0O0 o00oo0o02) {
        List<o00oo0O0> list = this.f5285o0O00OOO;
        if (list != null) {
            list.remove(o00oo0o02);
        }
    }

    public void o00oooOO(@oo0oO0 o00oo0O o00oo0o2) {
        List<o00oo0O> list = this.f5283o0O00O0o;
        if (list != null) {
            list.remove(o00oo0o2);
        }
    }

    public final void o00oooOo(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void o00oooo(int i, boolean z, int i2, boolean z2) {
        int i3;
        o00oo00O o00ooO02 = o00ooO0(i);
        if (o00ooO02 != null) {
            i3 = (int) (Math.max(this.f5257o00ooOo0, Math.min(o00ooO02.f5313o00oOo0O, this.f5256o00ooOo)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            o0O000O(i3, 0, i2);
            if (z2) {
                o00oo00O(i);
                return;
            }
            return;
        }
        if (z2) {
            o00oo00O(i);
        }
        o00oOoOO(false);
        scrollTo(i3, 0);
        o00ooOoO(i3);
    }

    public final boolean o00oooo0() {
        this.f5274o0O0000O = -1;
        o00oo0O();
        this.f5278o0O000o.onRelease();
        this.f5296o0ooOoOO.onRelease();
        return this.f5278o0O000o.isFinished() || this.f5296o0ooOoOO.isFinished();
    }

    public void o00ooooO(int i, boolean z) {
        this.f5262o00ooo0O = false;
        o00ooooo(i, z, false);
    }

    public void o00ooooo(int i, boolean z, boolean z2) {
        o0(i, z, z2, 0);
    }

    public void o0O000(int i, int i2) {
        o0O000O(i, i2, 0);
    }

    public o00oo0O o0O00000(o00oo0O o00oo0o2) {
        o00oo0O o00oo0o3 = this.f5284o0O00OO;
        this.f5284o0O00OO = o00oo0o2;
        return o00oo0o3;
    }

    public void o0O0000O(boolean z, @o0OO00OO o0O0o o0o0o) {
        o0O0000o(z, o0o0o, 2);
    }

    public void o0O0000o(boolean z, @o0OO00OO o0O0o o0o0o, int i) {
        boolean z2 = o0o0o != null;
        boolean z3 = z2 != (this.f5286o0O00Oo != null);
        this.f5286o0O00Oo = o0o0o;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f5287o0O00OoO = z ? 2 : 1;
            this.f5295o0oO0Ooo = i;
        } else {
            this.f5287o0O00OoO = 0;
        }
        if (z3) {
            o00ooo00();
        }
    }

    public void o0O000O(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5249o00ooO0;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f5251o00ooO0O ? this.f5249o00ooO0.getCurrX() : this.f5249o00ooO0.getStartX();
            this.f5249o00ooO0.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            o00oOoOO(false);
            o00ooo00();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float o00oo0OO2 = (o00oo0OO(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o00oo0OO2 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((this.f5245o00oo0o.o00oOoO(this.f5247o00oo0oO) * f) + this.f5248o00ooO)) + 1.0f) * 100.0f), 600);
        this.f5251o00ooO0O = false;
        this.f5249o00ooO0.startScroll(i4, scrollY, i5, i6, min);
        o0O0o00O.o0O0o0oO(this);
    }

    public o00oo00O o0O0o(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return o00oo(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public final void o0OoOoOo() {
        if (this.f5287o0O00OoO != 0) {
            ArrayList<View> arrayList = this.f5288o0O00Ooo;
            if (arrayList == null) {
                this.f5288o0O00Ooo = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5288o0O00Ooo.add(getChildAt(i));
            }
            Collections.sort(this.f5288o0O00Ooo, f5232o0O0OOO);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5280o0O000oo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5289o0O00o00);
        Scroller scroller = this.f5249o00ooO0;
        if (scroller != null && !scroller.isFinished()) {
            this.f5249o00ooO0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f5248o00ooO <= 0 || this.f5254o00ooOO0 == null || this.f5242o00oo0O.size() <= 0 || this.f5245o00oo0o == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f3 = this.f5248o00ooO / width2;
        int i2 = 0;
        o00oo00O o00oo00o = this.f5242o00oo0O.get(0);
        float f4 = o00oo00o.f5313o00oOo0O;
        int size = this.f5242o00oo0O.size();
        int i3 = o00oo00o.f5311o00oOOoO;
        int i4 = this.f5242o00oo0O.get(size - 1).f5311o00oOOoO;
        while (i3 < i4) {
            while (true) {
                i = o00oo00o.f5311o00oOOoO;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                o00oo00o = this.f5242o00oo0O.get(i2);
            }
            if (i3 == i) {
                float f5 = o00oo00o.f5313o00oOo0O;
                float f6 = o00oo00o.f5314o00oOooO;
                f = (f5 + f6) * width2;
                f4 = f5 + f6 + f3;
            } else {
                float o00oOoO2 = this.f5245o00oo0o.o00oOoO(i3);
                f = (f4 + o00oOoO2) * width2;
                f4 = o00oOoO2 + f3 + f4;
            }
            if (this.f5248o00ooO + f > scrollX) {
                f2 = f3;
                this.f5254o00ooOO0.setBounds(Math.round(f), this.f5253o00ooOO, Math.round(this.f5248o00ooO + f), this.f5255o00ooOOo);
                this.f5254o00ooOO0.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            o00oooo0();
            return false;
        }
        if (action != 0) {
            if (this.f5264o00oooO) {
                return true;
            }
            if (this.f5265o00oooOO) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f5240o0 = x;
            this.f5269o00ooooO = x;
            float y = motionEvent.getY();
            this.f5273o0O00000 = y;
            this.f5270o00ooooo = y;
            this.f5274o0O0000O = motionEvent.getPointerId(0);
            this.f5265o00oooOO = false;
            this.f5251o00ooO0O = true;
            this.f5249o00ooO0.computeScrollOffset();
            if (this.f5290o0O00o0O != 2 || Math.abs(this.f5249o00ooO0.getFinalX() - this.f5249o00ooO0.getCurrX()) <= this.f5277o0O000Oo) {
                o00oOoOO(false);
                this.f5264o00oooO = false;
            } else {
                this.f5249o00ooO0.abortAnimation();
                this.f5262o00ooo0O = false;
                o00ooo00();
                this.f5264o00oooO = true;
                o00oooOo(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f5274o0O0000O;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f5269o00ooooO;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f5273o0O00000);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !o00ooOO0(this.f5269o00ooooO, f) && o00oOoO0(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f5269o00ooooO = x2;
                    this.f5270o00ooooo = y2;
                    this.f5265o00oooOO = true;
                    return false;
                }
                int i3 = this.f5267o00oooo;
                if (abs > i3 && abs * 0.5f > abs2) {
                    this.f5264o00oooO = true;
                    o00oooOo(true);
                    setScrollState(1);
                    float f2 = this.f5240o0;
                    float f3 = this.f5267o00oooo;
                    this.f5269o00ooooO = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f5270o00ooooo = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i3) {
                    this.f5265o00oooOO = true;
                }
                if (this.f5264o00oooO && o00ooOoo(x2)) {
                    o0O0o00O.o0O0o0oO(this);
                }
            }
        } else if (action == 6) {
            o00ooOOo(motionEvent);
        }
        if (this.f5275o0O0000o == null) {
            this.f5275o0O0000o = VelocityTracker.obtain();
        }
        this.f5275o0O0000o.addMovement(motionEvent);
        return this.f5264o00oooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        o00oo0 o00oo0Var;
        o00oo0 o00oo0Var2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f5268o00oooo0 = Math.min(measuredWidth / 10, this.f5266o00oooOo);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (o00oo0Var2 = (o00oo0) childAt.getLayoutParams()) != null && o00oo0Var2.f5304o00oOOo0) {
                int i6 = o00oo0Var2.f5305o00oOOoO;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) o00oo0Var2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) o00oo0Var2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f5258o00ooOoO = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5259o00ooOoo = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5261o00ooo00 = true;
        o00ooo00();
        this.f5261o00ooo00 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((o00oo0Var = (o00oo0) childAt2.getLayoutParams()) == null || !o00oo0Var.f5304o00oOOo0)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * o00oo0Var.f5306o00oOo00), 1073741824), this.f5259o00ooOoo);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        o00oo00O o00oo2;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (o00oo2 = o00oo(childAt)) != null && o00oo2.f5311o00oOOoO == this.f5247o00oo0oO && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        oo0OOoo.o00oOOo0 o00oooo02 = this.f5245o00oo0o;
        if (o00oooo02 != null) {
            o00oooo02.o00oo0(savedState.f5297o00oo0O, savedState.f5299o00oo0Oo);
            o00ooooo(savedState.f5298o00oo0O0, false, true);
            return;
        }
        this.f5291o0O0o = savedState.f5298o00oo0O0;
        this.f5241o00oo = savedState.f5297o00oo0O;
        this.f5250o00ooO00 = savedState.f5299o00oo0Oo;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5298o00oo0O0 = this.f5247o00oo0oO;
        oo0OOoo.o00oOOo0 o00oooo02 = this.f5245o00oo0o;
        if (o00oooo02 != null) {
            savedState.f5297o00oo0O = o00oooo02.o00oo0OO();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f5248o00ooO;
            o00ooo0O(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5261o00ooo00) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@o0OO00OO oo0OOoo.o00oOOo0 o00oooo02) {
        oo0OOoo.o00oOOo0 o00oooo03 = this.f5245o00oo0o;
        if (o00oooo03 != null) {
            o00oooo03.o00oo0Oo(null);
            this.f5245o00oo0o.o00oo0o(this);
            for (int i = 0; i < this.f5242o00oo0O.size(); i++) {
                o00oo00O o00oo00o = this.f5242o00oo0O.get(i);
                this.f5245o00oo0o.o00oOOoO(this, o00oo00o.f5311o00oOOoO, o00oo00o.f5310o00oOOo0);
            }
            this.f5245o00oo0o.o00oOooO(this);
            this.f5242o00oo0O.clear();
            o00ooo0o();
            this.f5247o00oo0oO = 0;
            scrollTo(0, 0);
        }
        oo0OOoo.o00oOOo0 o00oooo04 = this.f5245o00oo0o;
        this.f5245o00oo0o = o00oooo02;
        this.f5243o00oo0O0 = 0;
        if (o00oooo02 != null) {
            if (this.f5252o00ooO0o == null) {
                this.f5252o00ooO0o = new o00oo();
            }
            this.f5245o00oo0o.o00oo0Oo(this.f5252o00ooO0o);
            this.f5262o00ooo0O = false;
            boolean z = this.f5280o0O000oo;
            this.f5280o0O000oo = true;
            this.f5243o00oo0O0 = this.f5245o00oo0o.o00oOo0O();
            if (this.f5291o0O0o >= 0) {
                this.f5245o00oo0o.o00oo0(this.f5241o00oo, this.f5250o00ooO00);
                o00ooooo(this.f5291o0O0o, false, true);
                this.f5291o0O0o = -1;
                this.f5241o00oo = null;
                this.f5250o00ooO00 = null;
            } else if (z) {
                requestLayout();
            } else {
                o00ooo00();
            }
        }
        List<o00oo0O0> list = this.f5285o0O00OOO;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f5285o0O00OOO.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5285o0O00OOO.get(i2).onAdapterChanged(this, o00oooo04, o00oooo02);
        }
    }

    public void setCurrentItem(int i) {
        this.f5262o00ooo0O = false;
        o00ooooo(i, !this.f5280o0O000oo, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f5263o00ooo0o) {
            this.f5263o00ooo0o = i;
            o00ooo00();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(o00oo0O o00oo0o2) {
        this.f5281o0O00O = o00oo0o2;
    }

    public void setPageMargin(int i) {
        int i2 = this.f5248o00ooO;
        this.f5248o00ooO = i;
        int width = getWidth();
        o00ooo0O(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@o0O0O0o0 int i) {
        setPageMarginDrawable(o0.getDrawable(getContext(), i));
    }

    public void setPageMarginDrawable(@o0OO00OO Drawable drawable) {
        this.f5254o00ooOO0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f5290o0O00o0O == i) {
            return;
        }
        this.f5290o0O00o0O = i;
        if (this.f5286o0O00Oo != null) {
            o00oo0O0(i != 0);
        }
        o00oo0(i);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5254o00ooOO0;
    }
}
