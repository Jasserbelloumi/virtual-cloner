package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00oooo0.o0O0O0Oo;
import o0O00.o00oo0O;
import o0O000oo.o0O0o00O;
import o0O00O.o00oOo0O;
import org.videolan.libvlc.MediaDiscoverer;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: o0O00  reason: collision with root package name */
    public static final int f2553o0O00 = 2;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f2555o0O000o = 2;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f2556o0O000o0 = 1;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f2557o0O000oo = 1;

    /* renamed from: o0O00O  reason: collision with root package name */
    public static final int f2558o0O00O = -1728053248;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static final int f2559o0O00O0 = 3;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static final int f2560o0O00O0o = 10;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public static final int f2561o0O00OO = 160;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public static final int f2562o0O00OOO = 400;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public static final boolean f2563o0O00Oo = false;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public static final float f2564o0O00OoO = 1.0f;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final int f2568o0OoO00O = 64;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final int f2569o0OoOoOO = 0;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final String f2570o0OoOoOo = "DrawerLayout";

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public static final boolean f2571o0oO0Ooo = true;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final int f2572o0ooOoOO = 0;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f2573o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public final o0O00O.o00oOo0O f2574o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public float f2575o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo00 f2576o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f2577o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f2578o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f2579o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Paint f2580o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f2581o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final o00oo0 f2582o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final o00oo0 f2583o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f2584o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f2585o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f2586o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f2587o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f2588o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f2589o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f2590o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f2591o00ooOoO;
    @o0OO00OO

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public o00oOo0O f2592o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f2593o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public List<o00oOo0O> f2594o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public float f2595o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public Drawable f2596o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public Drawable f2597o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public Drawable f2598o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public CharSequence f2599o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public Object f2600o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public CharSequence f2601o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public boolean f2602o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public Drawable f2603o00ooooo;

    /* renamed from: o0O000  reason: collision with root package name */
    public Rect f2604o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public Drawable f2605o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public Drawable f2606o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public final ArrayList<View> f2607o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public Matrix f2608o0O000O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final o0O00O.o00oOo0O f2609o0O0o;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final int[] f2554o0O000Oo = {16843828};

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public static final int[] f2565o0O00Ooo = {16842931};

    /* renamed from: o0O00o00  reason: collision with root package name */
    public static final boolean f2566o0O00o00 = true;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public static final boolean f2567o0O00o0O = true;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f2610o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f2611o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f2612o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f2613o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f2614o00oo0o0;

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

        public SavedState(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2611o00oo0O0 = 0;
            this.f2611o00oo0O0 = parcel.readInt();
            this.f2610o00oo0O = parcel.readInt();
            this.f2612o00oo0Oo = parcel.readInt();
            this.f2614o00oo0o0 = parcel.readInt();
            this.f2613o00oo0o = parcel.readInt();
        }

        public SavedState(@oo0oO0 Parcelable parcelable) {
            super(parcelable);
            this.f2611o00oo0O0 = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2611o00oo0O0);
            parcel.writeInt(this.f2610o00oo0O);
            parcel.writeInt(this.f2612o00oo0Oo);
            parcel.writeInt(this.f2614o00oo0o0);
            parcel.writeInt(this.f2613o00oo0o);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnApplyWindowInsetsListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).o00ooooO(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O000oo.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Rect f2616o00oOOo0 = new Rect();

        public o00oOOoO() {
        }

        @Override // o0O000oo.o00oOOoO
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View o00oo0O02 = DrawerLayout.this.o00oo0O0();
                if (o00oo0O02 != null) {
                    CharSequence o00oo0o02 = DrawerLayout.this.o00oo0o0(DrawerLayout.this.o00oo0o(o00oo0O02));
                    if (o00oo0o02 != null) {
                        text.add(o00oo0o02);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final void o00oOOo0(o00oo0O o00oo0o2, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.o00ooO0o(childAt)) {
                    o00oo0o2.o00oOo00(childAt);
                }
            }
        }

        public final void o00oOOoO(o00oo0O o00oo0o2, o00oo0O o00oo0o3) {
            Rect rect = this.f2616o00oOOo0;
            o00oo0o3.o00oo0o0(rect);
            o00oo0o2.o0O0Oooo(rect);
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
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o00oo0O o00oo0o2) {
            if (DrawerLayout.f2566o0O00o00) {
                super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
            } else {
                o00oo0O o0O0OO2 = o00oo0O.o0O0OO(o00oo0o2);
                super.onInitializeAccessibilityNodeInfo(view, o0O0OO2);
                o00oo0o2.o0O0oooo(view);
                ViewParent o0O00O2 = o0O0o00O.o0O00O(view);
                if (o0O00O2 instanceof View) {
                    o00oo0o2.o0O0oOoO((View) o0O00O2);
                }
                o00oOOoO(o00oo0o2, o0O0OO2);
                o0O0OO2.o0O0OOOo();
                o00oOOo0(o00oo0o2, (ViewGroup) view);
            }
            o00oo0o2.o0O0Ooo0(DrawerLayout.class.getName());
            o00oo0o2.o0O0o0o(false);
            o00oo0o2.o0oOo0O0(false);
            o00oo0o2.o0O0OOoO(o00oo0O.o00oOOo0.f10038o00oOo0o);
            o00oo0o2.o0O0OOoO(o00oo0O.o00oOOo0.f10040o00oOoO0);
        }

        @Override // o0O000oo.o00oOOoO
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2566o0O00o00 || DrawerLayout.o00ooO0o(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O000oo.o00oOOoO {
        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o00oo0O o00oo0o2) {
            super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
            if (DrawerLayout.o00ooO0o(view)) {
                return;
            }
            o00oo0o2.o0O0oOoO(null);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        void o00oOOo0(@oo0oO0 View view);

        void o00oOOoO(@oo0oO0 View view);

        void o00oOo00(int i);

        void o00oOooO(@oo0oO0 View view, float f);
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends ViewGroup.MarginLayoutParams {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f2618o00oOo0O = 1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f2619o00oOo0o = 2;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f2620o00oOoO0 = 4;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2621o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f2622o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f2623o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f2624o00oOooO;

        public o00oOoO(int i, int i2) {
            super(i, i2);
            this.f2621o00oOOo0 = 0;
        }

        public o00oOoO(int i, int i2, int i3) {
            this(i, i2);
            this.f2621o00oOOo0 = i3;
        }

        public o00oOoO(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2621o00oOOo0 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2565o0O00Ooo);
            this.f2621o00oOOo0 = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public o00oOoO(@oo0oO0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2621o00oOOo0 = 0;
        }

        public o00oOoO(@oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2621o00oOOo0 = 0;
        }

        public o00oOoO(@oo0oO0 o00oOoO o00oooo2) {
            super((ViewGroup.MarginLayoutParams) o00oooo2);
            this.f2621o00oOOo0 = 0;
            this.f2621o00oOOo0 = o00oooo2.f2621o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends o00oOo0O.o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f2625o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0O00O.o00oOo0O f2626o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Runnable f2627o00oOo00 = new o00oOOo0();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oo0.this.o00oOOoO();
            }
        }

        public o00oo0(int i) {
            this.f2625o00oOOo0 = i;
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.o00oOo00(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.o00ooOOo(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final void o00oOOo0() {
            View o00oo02 = DrawerLayout.this.o00oo0(this.f2625o00oOOo0 == 3 ? 5 : 3);
            if (o00oo02 != null) {
                DrawerLayout.this.o00oOo0o(o00oo02);
            }
        }

        public void o00oOOoO() {
            View o00oo02;
            int width;
            int o00ooO2 = this.f2626o00oOOoO.o00ooO();
            boolean z = this.f2625o00oOOo0 == 3;
            if (z) {
                o00oo02 = DrawerLayout.this.o00oo0(3);
                width = (o00oo02 != null ? -o00oo02.getWidth() : 0) + o00ooO2;
            } else {
                o00oo02 = DrawerLayout.this.o00oo0(5);
                width = DrawerLayout.this.getWidth() - o00ooO2;
            }
            if (o00oo02 != null) {
                if (((!z || o00oo02.getLeft() >= width) && (z || o00oo02.getLeft() <= width)) || DrawerLayout.this.o00oo0Oo(o00oo02) != 0) {
                    return;
                }
                this.f2626o00oOOoO.o0O0000o(o00oo02, width, o00oo02.getTop());
                ((o00oOoO) o00oo02.getLayoutParams()).f2623o00oOo00 = true;
                DrawerLayout.this.invalidate();
                o00oOOo0();
                DrawerLayout.this.o00oOOoO();
            }
        }

        public void o00oOo00() {
            DrawerLayout.this.removeCallbacks(this.f2627o00oOo00);
        }

        public void o00oOooO(o0O00O.o00oOo0O o00ooo0o2) {
            this.f2626o00oOOoO = o00ooo0o2;
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onEdgeDragStarted(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View o00oo02 = drawerLayout.o00oo0(i3);
            if (o00oo02 == null || DrawerLayout.this.o00oo0Oo(o00oo02) != 0) {
                return;
            }
            this.f2626o00oOOoO.o00oOooO(o00oo02, i2);
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f2627o00oOo00, 160L);
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewCaptured(View view, int i) {
            ((o00oOoO) view.getLayoutParams()).f2623o00oOo00 = false;
            o00oOOo0();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.o0OoOoOo(this.f2625o00oOOo0, i, this.f2626o00oOOoO.o00ooO0O());
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.o00oOo00(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.o0O000(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float o00oo0oO2 = DrawerLayout.this.o00oo0oO(view);
            int width = view.getWidth();
            if (DrawerLayout.this.o00oOo00(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && o00oo0oO2 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && o00oo0oO2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f2626o00oOOoO.o0O00000(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.o00ooOOo(view) && DrawerLayout.this.o00oOo00(view, this.f2625o00oOOo0) && DrawerLayout.this.o00oo0Oo(view) == 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O implements o00oOo0O {
        @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
        public void o00oOOo0(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
        public void o00oOOoO(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
        public void o00oOo00(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
        public void o00oOooO(View view, float f) {
        }
    }

    public DrawerLayout(@oo0oO0 Context context) {
        this(context, null);
    }

    public DrawerLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2576o00oo0O0 = new o00oOo00();
        this.f2579o00oo0o0 = f2558o0O00O;
        this.f2580o00oo0oO = new Paint();
        this.f2581o00ooO = true;
        this.f2587o00ooOO0 = 3;
        this.f2586o00ooOO = 3;
        this.f2588o00ooOOo = 3;
        this.f2590o00ooOo0 = 3;
        this.f2603o00ooooo = null;
        this.f2573o0 = null;
        this.f2605o0O00000 = null;
        this.f2606o0O0000O = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2577o00oo0Oo = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        o00oo0 o00oo0Var = new o00oo0(3);
        this.f2583o00ooO00 = o00oo0Var;
        o00oo0 o00oo0Var2 = new o00oo0(5);
        this.f2582o00ooO0 = o00oo0Var2;
        o0O00O.o00oOo0O o00oo0O02 = o0O00O.o00oOo0O.o00oo0O0(this, 1.0f, o00oo0Var);
        this.f2609o0O0o = o00oo0O02;
        o00oo0O02.o00ooooo(1);
        o00oo0O02.o0(f2);
        o00oo0Var.o00oOooO(o00oo0O02);
        o0O00O.o00oOo0O o00oo0O03 = o0O00O.o00oOo0O.o00oo0O0(this, 1.0f, o00oo0Var2);
        this.f2574o00oo = o00oo0O03;
        o00oo0O03.o00ooooo(2);
        o00oo0O03.o0(f2);
        o00oo0Var2.o00oOooO(o00oo0O03);
        setFocusableInTouchMode(true);
        o0O0o00O.o0OO00OO(this, 1);
        o0O0o00O.o0O0oOo(this, new o00oOOoO());
        setMotionEventSplittingEnabled(false);
        if (o0O0o00O.o00oo0OO.o00oOOoO(this)) {
            setOnApplyWindowInsetsListener(new o00oOOo0());
            setSystemUiVisibility(MediaDiscoverer.Event.Started);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2554o0O000Oo);
            try {
                this.f2596o00ooo0o = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f2575o00oo0O = f * 10.0f;
        this.f2607o0O0000o = new ArrayList<>();
    }

    public static String o00oo(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean o00ooO00(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public static boolean o00ooO0o(View view) {
        return (o0O0o00O.o0O00000(view) == 4 || o0O0o00O.o00oo0OO.o00oOo00(view) == 2) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!o00ooOOo(childAt)) {
                this.f2607o0O0000o.add(childAt);
            } else if (o00ooOO(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f2607o0O0000o.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f2607o0O0000o.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f2607o0O0000o.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        o0O0o00O.o0OO00OO(view, (o00oo0OO() != null || o00ooOOo(view)) ? 4 : 1);
        if (f2566o0O00o00) {
            return;
        }
        o0O0o00O.o0O0oOo(view, this.f2576o00oo0O0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o00oOoO) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((o00oOoO) getChildAt(i).getLayoutParams()).f2622o00oOOoO);
        }
        this.f2578o00oo0o = f;
        boolean o00oo0OO2 = this.f2609o0O0o.o00oo0OO(true);
        boolean o00oo0OO3 = this.f2574o00oo.o00oo0OO(true);
        if (o00oo0OO2 || o00oo0OO3) {
            o0O0o00O.o0O0o0oO(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2578o00oo0o <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (o00ooOoO(x, y, childAt) && !o00ooO(childAt) && o00oo00O(motionEvent, childAt)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int i;
        int height = getHeight();
        boolean o00ooO2 = o00ooO(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (o00ooO2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && o00ooO00(childAt) && o00ooOOo(childAt) && childAt.getHeight() >= height) {
                    if (o00oOo00(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f2578o00oo0o;
        if (f <= 0.0f || !o00ooO2) {
            if (this.f2597o00oooO != null && o00oOo00(view, 3)) {
                int intrinsicWidth = this.f2597o00oooO.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f2609o0O0o.o00ooO(), 1.0f));
                this.f2597o00oooO.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f2597o00oooO.setAlpha((int) (max * 255.0f));
                drawable = this.f2597o00oooO;
            } else if (this.f2598o00oooOO != null && o00oOo00(view, 5)) {
                int intrinsicWidth2 = this.f2598o00oooOO.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2574o00oo.o00ooO(), 1.0f));
                this.f2598o00oooOO.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f2598o00oooOO.setAlpha((int) (max2 * 255.0f));
                drawable = this.f2598o00oooOO;
            }
            drawable.draw(canvas);
        } else {
            this.f2580o00oo0oO.setColor((this.f2579o00oo0o0 & 16777215) | (((int) ((((-16777216) & i) >>> 24) * f)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f2580o00oo0oO);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o00oOoO(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOoO(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oOoO ? new o00oOoO((o00oOoO) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oOoO((ViewGroup.MarginLayoutParams) layoutParams) : new o00oOoO(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2567o0O00o0O) {
            return this.f2575o00oo0O;
        }
        return 0.0f;
    }

    @o0OO00OO
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2596o00ooo0o;
    }

    public void o0(int i, @oo0oO0 View view) {
        if (o00ooOOo(view)) {
            o00ooooo(i, ((o00oOoO) view.getLayoutParams()).f2621o00oOOo0);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void o00oOOo0(@oo0oO0 o00oOo0O o00ooo0o2) {
        if (o00ooo0o2 == null) {
            return;
        }
        if (this.f2594o00ooo00 == null) {
            this.f2594o00ooo00 = new ArrayList();
        }
        this.f2594o00ooo00.add(o00ooo0o2);
    }

    public void o00oOOoO() {
        if (this.f2591o00ooOoO) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f2591o00ooOoO = true;
    }

    public boolean o00oOo00(View view, int i) {
        return (o00oo0o(view) & i) == i;
    }

    public void o00oOo0O(int i, boolean z) {
        View o00oo02 = o00oo0(i);
        if (o00oo02 != null) {
            o00oOoO0(o00oo02, z);
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("No drawer view found with gravity ");
        o00oOOo02.append(o00oo(i));
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public void o00oOo0o(@oo0oO0 View view) {
        o00oOoO0(view, true);
    }

    public void o00oOoO() {
        o00oOoOO(false);
    }

    public void o00oOoO0(@oo0oO0 View view, boolean z) {
        o0O00O.o00oOo0O o00ooo0o2;
        int width;
        if (!o00ooOOo(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        if (this.f2581o00ooO) {
            o00oooo2.f2622o00oOOoO = 0.0f;
            o00oooo2.f2624o00oOooO = 0;
        } else if (z) {
            o00oooo2.f2624o00oOooO |= 4;
            if (o00oOo00(view, 3)) {
                o00ooo0o2 = this.f2609o0O0o;
                width = -view.getWidth();
            } else {
                o00ooo0o2 = this.f2574o00oo;
                width = getWidth();
            }
            o00ooo0o2.o0O0000o(view, width, view.getTop());
        } else {
            o00ooo00(view, 0.0f);
            o0OoOoOo(o00oooo2.f2621o00oOOo0, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void o00oOoOO(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
            if (o00ooOOo(childAt) && (!z || o00oooo2.f2623o00oOo00)) {
                z2 |= o00oOo00(childAt, 3) ? this.f2609o0O0o.o0O0000o(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2574o00oo.o0O0000o(childAt, getWidth(), childAt.getTop());
                o00oooo2.f2623o00oOo00 = false;
            }
        }
        this.f2583o00ooO00.o00oOo00();
        this.f2582o00ooO0.o00oOo00();
        if (z2) {
            invalidate();
        }
    }

    public void o00oOoOo(View view) {
        View rootView;
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        if ((o00oooo2.f2624o00oOooO & 1) == 1) {
            o00oooo2.f2624o00oOooO = 0;
            List<o00oOo0O> list = this.f2594o00ooo00;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2594o00ooo00.get(size).o00oOOoO(view);
                }
            }
            o0O000O(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void o00oOoo0(View view) {
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        if ((o00oooo2.f2624o00oOooO & 1) == 0) {
            o00oooo2.f2624o00oOooO = 1;
            List<o00oOo0O> list = this.f2594o00ooo00;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2594o00ooo00.get(size).o00oOOo0(view);
                }
            }
            o0O000O(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void o00oOooO(int i) {
        o00oOo0O(i, true);
    }

    public void o00oOooo(View view, float f) {
        List<o00oOo0O> list = this.f2594o00ooo00;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2594o00ooo00.get(size).o00oOooO(view, f);
            }
        }
    }

    public View o00oo0(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, o0O0o00O.o0O000O(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((o00oo0o(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean o00oo00O(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent o0O0o2 = o0O0o(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(o0O0o2);
            o0O0o2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public int o00oo0O(int i) {
        int o0O000O2 = o0O0o00O.o0O000O(this);
        if (i == 3) {
            int i2 = this.f2587o00ooOO0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = o0O000O2 == 0 ? this.f2588o00ooOOo : this.f2590o00ooOo0;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f2586o00ooOO;
            if (i4 != 3) {
                return i4;
            }
            int i5 = o0O000O2 == 0 ? this.f2590o00ooOo0 : this.f2588o00ooOOo;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f2588o00ooOOo;
            if (i6 != 3) {
                return i6;
            }
            int i7 = o0O000O2 == 0 ? this.f2587o00ooOO0 : this.f2586o00ooOO;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f2590o00ooOo0;
            if (i8 != 3) {
                return i8;
            }
            int i9 = o0O000O2 == 0 ? this.f2586o00ooOO : this.f2587o00ooOO0;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    public View o00oo0O0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (o00ooOOo(childAt) && o00ooOo(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public View o00oo0OO() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((o00oOoO) childAt.getLayoutParams()).f2624o00oOooO & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public int o00oo0Oo(@oo0oO0 View view) {
        if (o00ooOOo(view)) {
            return o00oo0O(((o00oOoO) view.getLayoutParams()).f2621o00oOOo0);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public int o00oo0o(View view) {
        return Gravity.getAbsoluteGravity(((o00oOoO) view.getLayoutParams()).f2621o00oOOo0, o0O0o00O.o0O000O(this));
    }

    @o0OO00OO
    public CharSequence o00oo0o0(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, o0O0o00O.o0O000O(this));
        if (absoluteGravity == 3) {
            return this.f2599o00oooOo;
        }
        if (absoluteGravity == 5) {
            return this.f2601o00oooo0;
        }
        return null;
    }

    public float o00oo0oO(View view) {
        return ((o00oOoO) view.getLayoutParams()).f2622o00oOOoO;
    }

    public boolean o00ooO(View view) {
        return ((o00oOoO) view.getLayoutParams()).f2621o00oOOo0 == 0;
    }

    public final boolean o00ooO0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((o00oOoO) getChildAt(i).getLayoutParams()).f2623o00oOo00) {
                return true;
            }
        }
        return false;
    }

    public final boolean o00ooO0O() {
        return o00oo0O0() != null;
    }

    public boolean o00ooOO(@oo0oO0 View view) {
        if (o00ooOOo(view)) {
            return (((o00oOoO) view.getLayoutParams()).f2624o00oOooO & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean o00ooOO0(int i) {
        View o00oo02 = o00oo0(i);
        if (o00oo02 != null) {
            return o00ooOO(o00oo02);
        }
        return false;
    }

    public boolean o00ooOOo(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((o00oOoO) view.getLayoutParams()).f2621o00oOOo0, o0O0o00O.o0O000O(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean o00ooOo(@oo0oO0 View view) {
        if (o00ooOOo(view)) {
            return ((o00oOoO) view.getLayoutParams()).f2622o00oOOoO > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean o00ooOo0(int i) {
        View o00oo02 = o00oo0(i);
        if (o00oo02 != null) {
            return o00ooOo(o00oo02);
        }
        return false;
    }

    public final boolean o00ooOoO(float f, float f2, View view) {
        if (this.f2604o0O000 == null) {
            this.f2604o0O000 = new Rect();
        }
        view.getHitRect(this.f2604o0O000);
        return this.f2604o0O000.contains((int) f, (int) f2);
    }

    public final boolean o00ooOoo(Drawable drawable, int i) {
        if (drawable == null || !o0O0O0Oo.o00oOOo0.o00oOooO(drawable)) {
            return false;
        }
        o0O0O0Oo.o00oOo00.o00oOOoO(drawable, i);
        return true;
    }

    public void o00ooo0(int i) {
        o00ooo0O(i, true);
    }

    public void o00ooo00(View view, float f) {
        float o00oo0oO2 = o00oo0oO(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (o00oo0oO2 * width));
        if (!o00oOo00(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        o0O000(view, f);
    }

    public void o00ooo0O(int i, boolean z) {
        View o00oo02 = o00oo0(i);
        if (o00oo02 != null) {
            o00oooO(o00oo02, z);
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("No drawer view found with gravity ");
        o00oOOo02.append(o00oo(i));
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public void o00ooo0o(@oo0oO0 View view) {
        o00oooO(view, true);
    }

    public void o00oooO(@oo0oO0 View view, boolean z) {
        if (!o00ooOOo(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        if (this.f2581o00ooO) {
            o00oooo2.f2622o00oOOoO = 1.0f;
            o00oooo2.f2624o00oOooO = 1;
            o0O000O(view, true);
        } else if (z) {
            o00oooo2.f2624o00oOooO |= 2;
            if (o00oOo00(view, 3)) {
                this.f2609o0O0o.o0O0000o(view, 0, view.getTop());
            } else {
                this.f2574o00oo.o0O0000o(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            o00ooo00(view, 1.0f);
            o0OoOoOo(o00oooo2.f2621o00oOOo0, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void o00oooOO(@oo0oO0 o00oOo0O o00ooo0o2) {
        List<o00oOo0O> list;
        if (o00ooo0o2 == null || (list = this.f2594o00ooo00) == null) {
            return;
        }
        list.remove(o00ooo0o2);
    }

    public final Drawable o00oooOo() {
        int o0O000O2 = o0O0o00O.o0O000O(this);
        if (o0O000O2 == 0) {
            Drawable drawable = this.f2603o00ooooo;
            if (drawable != null) {
                o00ooOoo(drawable, o0O000O2);
                return this.f2603o00ooooo;
            }
        } else {
            Drawable drawable2 = this.f2573o0;
            if (drawable2 != null) {
                o00ooOoo(drawable2, o0O000O2);
                return this.f2573o0;
            }
        }
        return this.f2605o0O00000;
    }

    public final void o00oooo() {
        if (f2567o0O00o0O) {
            return;
        }
        this.f2597o00oooO = o00oooOo();
        this.f2598o00oooOO = o00oooo0();
    }

    public final Drawable o00oooo0() {
        int o0O000O2 = o0O0o00O.o0O000O(this);
        if (o0O000O2 == 0) {
            Drawable drawable = this.f2573o0;
            if (drawable != null) {
                o00ooOoo(drawable, o0O000O2);
                return this.f2573o0;
            }
        } else {
            Drawable drawable2 = this.f2603o00ooooo;
            if (drawable2 != null) {
                o00ooOoo(drawable2, o0O000O2);
                return this.f2603o00ooooo;
            }
        }
        return this.f2606o0O0000O;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00ooooO(Object obj, boolean z) {
        this.f2600o00oooo = obj;
        this.f2602o00ooooO = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void o00ooooo(int i, int i2) {
        View o00oo02;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, o0O0o00O.o0O000O(this));
        if (i2 == 3) {
            this.f2587o00ooOO0 = i;
        } else if (i2 == 5) {
            this.f2586o00ooOO = i;
        } else if (i2 == 8388611) {
            this.f2588o00ooOOo = i;
        } else if (i2 == 8388613) {
            this.f2590o00ooOo0 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f2609o0O0o : this.f2574o00oo).o00oOo00();
        }
        if (i != 1) {
            if (i == 2 && (o00oo02 = o00oo0(absoluteGravity)) != null) {
                o00ooo0o(o00oo02);
                return;
            }
            return;
        }
        View o00oo03 = o00oo0(absoluteGravity);
        if (o00oo03 != null) {
            o00oOo0o(o00oo03);
        }
    }

    public void o0O000(View view, float f) {
        o00oOoO o00oooo2 = (o00oOoO) view.getLayoutParams();
        if (f == o00oooo2.f2622o00oOOoO) {
            return;
        }
        o00oooo2.f2622o00oOOoO = f;
        o00oOooo(view, f);
    }

    public void o0O00000(@o0O0O0o0 int i, int i2) {
        o0O0000O(o0.getDrawable(getContext(), i), i2);
    }

    public void o0O0000O(Drawable drawable, int i) {
        if (f2567o0O00o0O) {
            return;
        }
        if ((i & o0O000oo.o0.f10418o00oOOoO) == 8388611) {
            this.f2603o00ooooo = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.f2573o0 = drawable;
        } else if ((i & 3) == 3) {
            this.f2605o0O00000 = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.f2606o0O0000O = drawable;
        }
        o00oooo();
        invalidate();
    }

    public void o0O0000o(int i, @o0OO00OO CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, o0O0o00O.o0O000O(this));
        if (absoluteGravity == 3) {
            this.f2599o00oooOo = charSequence;
        } else if (absoluteGravity == 5) {
            this.f2601o00oooo0 = charSequence;
        }
    }

    public final void o0O000O(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o0O0o00O.o0OO00OO(childAt, ((z || o00ooOOo(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    public final MotionEvent o0O0o(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2608o0O000O == null) {
                this.f2608o0O000O = new Matrix();
            }
            matrix.invert(this.f2608o0O000O);
            obtain.transform(this.f2608o0O000O);
        }
        return obtain;
    }

    public void o0OoOoOo(int i, int i2, View view) {
        int o00ooOo02 = this.f2609o0O0o.o00ooOo0();
        int o00ooOo03 = this.f2574o00oo.o00ooOo0();
        int i3 = 2;
        if (o00ooOo02 == 1 || o00ooOo03 == 1) {
            i3 = 1;
        } else if (o00ooOo02 != 2 && o00ooOo03 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((o00oOoO) view.getLayoutParams()).f2622o00oOOoO;
            if (f == 0.0f) {
                o00oOoOo(view);
            } else if (f == 1.0f) {
                o00oOoo0(view);
            }
        }
        if (i3 != this.f2584o00ooO0O) {
            this.f2584o00ooO0O = i3;
            List<o00oOo0O> list = this.f2594o00ooo00;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2594o00ooo00.get(size).o00oOo00(i3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2581o00ooO = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2581o00ooO = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2602o00ooooO || this.f2596o00ooo0o == null) {
            return;
        }
        Object obj = this.f2600o00oooo;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2596o00ooo0o.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2596o00ooo0o.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            o0O00O.o00oOo0O r1 = r6.f2609o0O0o
            boolean r1 = r1.o0O0000O(r7)
            o0O00O.o00oOo0O r2 = r6.f2574o00oo
            boolean r2 = r2.o0O0000O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            o0O00O.o00oOo0O r7 = r6.f2609o0O0o
            boolean r7 = r7.o00oOo0o(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$o00oo0 r7 = r6.f2583o00ooO00
            r7.o00oOo00()
            androidx.drawerlayout.widget.DrawerLayout$o00oo0 r7 = r6.f2582o00ooO0
            r7.o00oOo00()
            goto L38
        L31:
            r6.o00oOoOO(r2)
            r6.f2589o00ooOo = r3
            r6.f2591o00ooOoO = r3
        L38:
            r7 = r3
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2593o00ooo0 = r0
            r6.f2595o00ooo0O = r7
            float r4 = r6.f2578o00oo0o
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            o0O00O.o00oOo0O r4 = r6.f2609o0O0o
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.o0O0o(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.o00ooO(r7)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r3
        L60:
            r6.f2589o00ooOo = r3
            r6.f2591o00ooOoO = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.o00ooO0()
            if (r7 != 0) goto L74
            boolean r7 = r6.f2591o00ooOoO
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && o00ooO0O()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View o00oo0O02 = o00oo0O0();
            if (o00oo0O02 != null && o00oo0Oo(o00oo0O02) == 0) {
                o00oOoO();
            }
            return o00oo0O02 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        boolean z2 = true;
        this.f2585o00ooO0o = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
                if (o00ooO(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (o00oOo00(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (o00oooo2.f2622o00oOOoO * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i9 - i5) / f3;
                        i6 = i9 - ((int) (o00oooo2.f2622o00oOOoO * f3));
                    }
                    boolean z3 = f != o00oooo2.f2622o00oOOoO ? z2 : false;
                    int i12 = o00oooo2.f2621o00oOOo0 & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i13 - ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight2 + i15);
                    }
                    if (z3) {
                        o0O000(childAt, f);
                    }
                    int i19 = o00oooo2.f2622o00oOOoO > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
            i10++;
            z2 = true;
        }
        this.f2585o00ooO0o = false;
        this.f2581o00ooO = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2600o00oooo != null && o0O0o00O.o0(this);
        int o0O000O2 = o0O0o00O.o0O000O(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                o00oOoO o00oooo2 = (o00oOoO) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(o00oooo2.f2621o00oOOo0, o0O000O2);
                    boolean o00oOOoO2 = o0O0o00O.o00oo0OO.o00oOOoO(childAt);
                    WindowInsets windowInsets = (WindowInsets) this.f2600o00oooo;
                    if (o00oOOoO2) {
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin = windowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin = windowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin = windowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (o00ooO(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin) - ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin) - ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin, 1073741824));
                } else if (!o00ooOOo(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (f2567o0O00o0O) {
                        float o00oOoOO2 = o0O0o00O.o00ooO0.o00oOoOO(childAt);
                        float f = this.f2575o00oo0O;
                        if (o00oOoOO2 != f) {
                            o0O0o00O.o00ooO0.o00oo0o0(childAt, f);
                        }
                    }
                    int o00oo0o2 = o00oo0o(childAt) & 7;
                    if (o00oo0o2 == 3) {
                        i4 = 1;
                    }
                    if ((i4 != 0 && z2) || (i4 == 0 && z3)) {
                        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Child drawer has absolute gravity ");
                        o00oOOo02.append(o00oo(o00oo0o2));
                        o00oOOo02.append(" but this ");
                        o00oOOo02.append(f2570o0OoOoOo);
                        o00oOOo02.append(" already has a ");
                        o00oOOo02.append("drawer view along that edge");
                        throw new IllegalStateException(o00oOOo02.toString());
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f2577o00oo0Oo + ((ViewGroup.MarginLayoutParams) o00oooo2).leftMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).rightMargin, ((ViewGroup.MarginLayoutParams) o00oooo2).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) o00oooo2).topMargin + ((ViewGroup.MarginLayoutParams) o00oooo2).bottomMargin, ((ViewGroup.MarginLayoutParams) o00oooo2).height));
                    i3++;
                    i4 = 0;
                }
            }
            i3++;
            i4 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View o00oo02;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f2611o00oo0O0;
        if (i != 0 && (o00oo02 = o00oo0(i)) != null) {
            o00ooo0o(o00oo02);
        }
        int i2 = savedState.f2610o00oo0O;
        if (i2 != 3) {
            o00ooooo(i2, 3);
        }
        int i3 = savedState.f2612o00oo0Oo;
        if (i3 != 3) {
            o00ooooo(i3, 5);
        }
        int i4 = savedState.f2614o00oo0o0;
        if (i4 != 3) {
            o00ooooo(i4, o0O000oo.o0.f10418o00oOOoO);
        }
        int i5 = savedState.f2613o00oo0o;
        if (i5 != 3) {
            o00ooooo(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        o00oooo();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            o00oOoO o00oooo2 = (o00oOoO) getChildAt(i).getLayoutParams();
            int i2 = o00oooo2.f2624o00oOooO;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f2611o00oo0O0 = o00oooo2.f2621o00oOOo0;
                break;
            }
        }
        savedState.f2610o00oo0O = this.f2587o00ooOO0;
        savedState.f2612o00oo0Oo = this.f2586o00ooOO;
        savedState.f2614o00oo0o0 = this.f2588o00ooOOo;
        savedState.f2613o00oo0o = this.f2590o00ooOo0;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View o00oo0OO2;
        this.f2609o0O0o.o00ooo0o(motionEvent);
        this.f2574o00oo.o00ooo0o(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View o0O0o2 = this.f2609o0O0o.o0O0o((int) x, (int) y);
                if (o0O0o2 != null && o00ooO(o0O0o2)) {
                    float f = x - this.f2593o00ooo0;
                    float f2 = y - this.f2595o00ooo0O;
                    int o00ooOOo2 = this.f2609o0O0o.o00ooOOo();
                    if ((f2 * f2) + (f * f) < o00ooOOo2 * o00ooOOo2 && (o00oo0OO2 = o00oo0OO()) != null && o00oo0Oo(o00oo0OO2) != 2) {
                        z = false;
                        o00oOoOO(z);
                        this.f2589o00ooOo = false;
                    }
                }
                z = true;
                o00oOoOO(z);
                this.f2589o00ooOo = false;
            } else if (action == 3) {
                o00oOoOO(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f2593o00ooo0 = x2;
        this.f2595o00ooo0O = y2;
        this.f2589o00ooOo = false;
        this.f2591o00ooOoO = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f2589o00ooOo = z;
        if (z) {
            o00oOoOO(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2585o00ooO0o) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f2575o00oo0O = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (o00ooOOo(childAt)) {
                o0O0o00O.o0OO000(childAt, this.f2575o00oo0O);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(o00oOo0O o00ooo0o2) {
        o00oOo0O o00ooo0o3 = this.f2592o00ooOoo;
        if (o00ooo0o3 != null) {
            o00oooOO(o00ooo0o3);
        }
        if (o00ooo0o2 != null) {
            o00oOOo0(o00ooo0o2);
        }
        this.f2592o00ooOoo = o00ooo0o2;
    }

    public void setDrawerLockMode(int i) {
        o00ooooo(i, 3);
        o00ooooo(i, 5);
    }

    public void setScrimColor(@o0O00O int i) {
        this.f2579o00oo0o0 = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2596o00ooo0o = i != 0 ? o0.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(@o0OO00OO Drawable drawable) {
        this.f2596o00ooo0o = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@o0O00O int i) {
        this.f2596o00ooo0o = new ColorDrawable(i);
        invalidate();
    }
}
