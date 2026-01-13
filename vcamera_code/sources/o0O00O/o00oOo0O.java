package o0O00O;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o00oOo0O {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f10835o00ooO = 2;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f10836o00ooO0 = -1;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f10837o00ooO00 = "ViewDragHelper";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f10838o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f10839o00ooO0o = 1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f10840o00ooOO = 2;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f10841o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f10842o00ooOOo = 4;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f10843o00ooOo = 15;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f10844o00ooOo0 = 8;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f10845o00ooOoO = 1;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f10846o00ooOoo = 2;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f10847o00ooo0 = 20;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f10848o00ooo00 = 3;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f10849o00ooo0O = 256;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f10850o00ooo0o = 600;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final Interpolator f10851o00oooO = new o00oOOo0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f10852o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f10853o00oOOoO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float[] f10855o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float[] f10856o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int[] f10857o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float[] f10858o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int[] f10859o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int[] f10860o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f10861o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float[] f10862o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public VelocityTracker f10863o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public float f10865o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public float f10866o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f10867o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f10868o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f10869o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public OverScroller f10870o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public View f10871o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOo00 f10872o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f10873o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final ViewGroup f10874o0O0o;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f10854o00oOo00 = -1;

    /* renamed from: o00oo  reason: collision with root package name */
    public final Runnable f10864o00oo = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOo0O.this.o00oooo(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00 {
        public int clampViewPositionHorizontal(@oo0oO0 View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@oo0oO0 View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@oo0oO0 View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@oo0oO0 View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@oo0oO0 View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@oo0oO0 View view, int i, int i2, @o0OO0 int i3, @o0OO0 int i4) {
        }

        public void onViewReleased(@oo0oO0 View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@oo0oO0 View view, int i);
    }

    public o00oOo0O(@oo0oO0 Context context, @oo0oO0 ViewGroup viewGroup, @oo0oO0 o00oOo00 o00ooo002) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (o00ooo002 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10874o0O0o = viewGroup;
        this.f10872o00oo0o0 = o00ooo002;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10868o00oo0O0 = i;
        this.f10869o00oo0OO = i;
        this.f10853o00oOOoO = viewConfiguration.getScaledTouchSlop();
        this.f10866o00oo00O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10865o00oo0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10870o00oo0Oo = new OverScroller(context, f10851o00oooO);
    }

    public static o00oOo0O o00oo0O(@oo0oO0 ViewGroup viewGroup, @oo0oO0 o00oOo00 o00ooo002) {
        return new o00oOo0O(viewGroup.getContext(), viewGroup, o00ooo002);
    }

    public static o00oOo0O o00oo0O0(@oo0oO0 ViewGroup viewGroup, float f, @oo0oO0 o00oOo00 o00ooo002) {
        o00oOo0O o00oo0O2 = o00oo0O(viewGroup, o00ooo002);
        o00oo0O2.f10853o00oOOoO = (int) ((1.0f / f) * o00oo0O2.f10853o00oOOoO);
        return o00oo0O2;
    }

    public void o0(float f) {
        this.f10865o00oo0 = f;
    }

    public void o00oOOo0() {
        o00oOo00();
        if (this.f10852o00oOOo0 == 2) {
            int currX = this.f10870o00oo0Oo.getCurrX();
            int currY = this.f10870o00oo0Oo.getCurrY();
            this.f10870o00oo0Oo.abortAnimation();
            int currX2 = this.f10870o00oo0Oo.getCurrX();
            int currY2 = this.f10870o00oo0Oo.getCurrY();
            this.f10872o00oo0o0.onViewPositionChanged(this.f10871o00oo0o, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        o00oooo(0);
    }

    public boolean o00oOOoO(@oo0oO0 View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && o00oOOoO(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2));
    }

    public void o00oOo00() {
        this.f10854o00oOo00 = -1;
        o00oOoo0();
        VelocityTracker velocityTracker = this.f10863o00oOooo;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10863o00oOooo = null;
        }
    }

    public final boolean o00oOo0O(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f10857o00oOoO[i] & i2) != i2 || (this.f10867o00oo0O & i2) == 0 || (this.f10860o00oOoOo[i] & i2) == i2 || (this.f10859o00oOoOO[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f10853o00oOOoO;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.f10872o00oo0o0.onEdgeLock(i2)) {
                return (this.f10859o00oOoOO[i] & i2) == 0 && abs > ((float) this.f10853o00oOOoO);
            }
            int[] iArr = this.f10860o00oOoOo;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    public boolean o00oOo0o(int i) {
        int length = this.f10862o00oOooO.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (o00oOoO0(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean o00oOoO(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f10872o00oo0o0.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f10872o00oo0o0.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f10853o00oOOoO) : z2 && Math.abs(f2) > ((float) this.f10853o00oOOoO);
        }
        float f3 = f2 * f2;
        int i = this.f10853o00oOOoO;
        return f3 + (f * f) > ((float) (i * i));
    }

    public boolean o00oOoO0(int i, int i2) {
        if (o00ooo00(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f10856o00oOo0o[i2] - this.f10862o00oOooO[i2];
            float f2 = this.f10858o00oOoO0[i2] - this.f10855o00oOo0O[i2];
            if (!z || !z2) {
                return z ? Math.abs(f) > ((float) this.f10853o00oOOoO) : z2 && Math.abs(f2) > ((float) this.f10853o00oOOoO);
            }
            float f3 = f2 * f2;
            int i3 = this.f10853o00oOOoO;
            return f3 + (f * f) > ((float) (i3 * i3));
        }
        return false;
    }

    public final float o00oOoOO(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final int o00oOoOo(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void o00oOoo0() {
        float[] fArr = this.f10862o00oOooO;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f10855o00oOo0O, 0.0f);
        Arrays.fill(this.f10856o00oOo0o, 0.0f);
        Arrays.fill(this.f10858o00oOoO0, 0.0f);
        Arrays.fill(this.f10857o00oOoO, 0);
        Arrays.fill(this.f10859o00oOoOO, 0);
        Arrays.fill(this.f10860o00oOoOo, 0);
        this.f10861o00oOoo0 = 0;
    }

    public void o00oOooO(@oo0oO0 View view, int i) {
        if (view.getParent() != this.f10874o0O0o) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            o00oOOo02.append(this.f10874o0O0o);
            o00oOOo02.append(")");
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        this.f10871o00oo0o = view;
        this.f10854o00oOo00 = i;
        this.f10872o00oo0o0.onViewCaptured(view, i);
        o00oooo(1);
    }

    public final void o00oOooo(int i) {
        if (this.f10862o00oOooO == null || !o00ooo00(i)) {
            return;
        }
        this.f10862o00oOooO[i] = 0.0f;
        this.f10855o00oOo0O[i] = 0.0f;
        this.f10856o00oOo0o[i] = 0.0f;
        this.f10858o00oOoO0[i] = 0.0f;
        this.f10857o00oOoO[i] = 0;
        this.f10859o00oOoOO[i] = 0;
        this.f10860o00oOoOo[i] = 0;
        this.f10861o00oOoo0 = (~(1 << i)) & this.f10861o00oOoo0;
    }

    public void o00oo(int i, int i2, int i3, int i4) {
        if (!this.f10873o00oo0oO) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f10870o00oo0Oo.fling(this.f10871o00oo0o.getLeft(), this.f10871o00oo0o.getTop(), (int) this.f10863o00oOooo.getXVelocity(this.f10854o00oOo00), (int) this.f10863o00oOooo.getYVelocity(this.f10854o00oOo00), i, i3, i2, i4);
        o00oooo(2);
    }

    public final int o00oo0(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int o00oOoOo2 = o00oOoOo(i3, (int) this.f10865o00oo0, (int) this.f10866o00oo00O);
        int o00oOoOo3 = o00oOoOo(i4, (int) this.f10865o00oo0, (int) this.f10866o00oo00O);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(o00oOoOo2);
        int abs4 = Math.abs(o00oOoOo3);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (o00oOoOo2 != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (o00oOoOo3 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((o00oo00O(i2, o00oOoOo3, this.f10872o00oo0o0.getViewVerticalDragRange(view)) * (f3 / f4)) + (o00oo00O(i, o00oOoOo2, this.f10872o00oo0o0.getViewHorizontalDragRange(view)) * f5));
    }

    public final int o00oo00O(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f10874o0O0o.getWidth();
        float f = width / 2;
        float o00oo0o02 = (o00oo0o0(Math.min(1.0f, Math.abs(i) / width)) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(o00oo0o02 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public boolean o00oo0OO(boolean z) {
        if (this.f10852o00oOOo0 == 2) {
            boolean computeScrollOffset = this.f10870o00oo0Oo.computeScrollOffset();
            int currX = this.f10870o00oo0Oo.getCurrX();
            int currY = this.f10870o00oo0Oo.getCurrY();
            int left = currX - this.f10871o00oo0o.getLeft();
            int top = currY - this.f10871o00oo0o.getTop();
            if (left != 0) {
                o0O0o00O.o0O0o00O(this.f10871o00oo0o, left);
            }
            if (top != 0) {
                o0O0o00O.o0O0o00o(this.f10871o00oo0o, top);
            }
            if (left != 0 || top != 0) {
                this.f10872o00oo0o0.onViewPositionChanged(this.f10871o00oo0o, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f10870o00oo0Oo.getFinalX() && currY == this.f10870o00oo0Oo.getFinalY()) {
                this.f10870o00oo0Oo.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f10874o0O0o.post(this.f10864o00oo);
                } else {
                    o00oooo(0);
                }
            }
        }
        return this.f10852o00oOOo0 == 2;
    }

    public final void o00oo0Oo(float f, float f2) {
        this.f10873o00oo0oO = true;
        this.f10872o00oo0o0.onViewReleased(this.f10871o00oo0o, f, f2);
        this.f10873o00oo0oO = false;
        if (this.f10852o00oOOo0 == 1) {
            o00oooo(0);
        }
    }

    public final void o00oo0o(int i, int i2, int i3, int i4) {
        int left = this.f10871o00oo0o.getLeft();
        int top = this.f10871o00oo0o.getTop();
        if (i3 != 0) {
            i = this.f10872o00oo0o0.clampViewPositionHorizontal(this.f10871o00oo0o, i, i3);
            o0O0o00O.o0O0o00O(this.f10871o00oo0o, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f10872o00oo0o0.clampViewPositionVertical(this.f10871o00oo0o, i2, i4);
            o0O0o00O.o0O0o00o(this.f10871o00oo0o, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f10872o00oo0o0.onViewPositionChanged(this.f10871o00oo0o, i5, i6, i5 - left, i6 - top);
    }

    public final float o00oo0o0(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final void o00oo0oO(int i) {
        float[] fArr = this.f10862o00oOooO;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10855o00oOo0O;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10856o00oOo0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10858o00oOoO0;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10857o00oOoO;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10859o00oOoOO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10860o00oOoOo;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10862o00oOooO = fArr2;
            this.f10855o00oOo0O = fArr3;
            this.f10856o00oOo0o = fArr4;
            this.f10858o00oOoO0 = fArr5;
            this.f10857o00oOoO = iArr;
            this.f10859o00oOoOO = iArr2;
            this.f10860o00oOoOo = iArr3;
        }
    }

    @o0OO0
    public int o00ooO() {
        return this.f10869o00oo0OO;
    }

    public int o00ooO0() {
        return this.f10854o00oOo00;
    }

    public final boolean o00ooO00(int i, int i2, int i3, int i4) {
        int left = this.f10871o00oo0o.getLeft();
        int top = this.f10871o00oo0o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f10870o00oo0Oo.abortAnimation();
            o00oooo(0);
            return false;
        }
        this.f10870o00oo0Oo.startScroll(left, top, i5, i6, o00oo0(this.f10871o00oo0o, i5, i6, i3, i4));
        o00oooo(2);
        return true;
    }

    @o0OO00OO
    public View o00ooO0O() {
        return this.f10871o00oo0o;
    }

    @o0OO0
    public int o00ooO0o() {
        return this.f10868o00oo0O0;
    }

    public float o00ooOO() {
        return this.f10865o00oo0;
    }

    public final int o00ooOO0(int i, int i2) {
        int i3 = i < this.f10874o0O0o.getLeft() + this.f10869o00oo0OO ? 1 : 0;
        if (i2 < this.f10874o0O0o.getTop() + this.f10869o00oo0OO) {
            i3 |= 4;
        }
        if (i > this.f10874o0O0o.getRight() - this.f10869o00oo0OO) {
            i3 |= 2;
        }
        return i2 > this.f10874o0O0o.getBottom() - this.f10869o00oo0OO ? i3 | 8 : i3;
    }

    @o0OO0
    public int o00ooOOo() {
        return this.f10853o00oOOoO;
    }

    public boolean o00ooOo(int i, int i2) {
        return o00ooo0O(this.f10871o00oo0o, i, i2);
    }

    public int o00ooOo0() {
        return this.f10852o00oOOo0;
    }

    public boolean o00ooOoO(int i) {
        int length = this.f10857o00oOoO.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (o00ooOoo(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean o00ooOoo(int i, int i2) {
        return o00ooo00(i2) && (i & this.f10857o00oOoO[i2]) != 0;
    }

    public final boolean o00ooo0(int i) {
        return o00ooo00(i);
    }

    public boolean o00ooo00(int i) {
        return ((1 << i) & this.f10861o00oOoo0) != 0;
    }

    public boolean o00ooo0O(@o0OO00OO View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public void o00ooo0o(@oo0oO0 MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            o00oOo00();
        }
        if (this.f10863o00oOooo == null) {
            this.f10863o00oOooo = VelocityTracker.obtain();
        }
        this.f10863o00oOooo.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View o0O0o2 = o0O0o((int) x, (int) y);
            o00oooOo(x, y, pointerId);
            o0O000(o0O0o2, pointerId);
            int i3 = this.f10857o00oOoO[pointerId];
            int i4 = this.f10867o00oo0O;
            if ((i3 & i4) != 0) {
                this.f10872o00oo0o0.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f10852o00oOOo0 != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (o00ooo0(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f10862o00oOooO[pointerId2];
                            float f2 = y2 - this.f10855o00oOo0O[pointerId2];
                            o00oooOO(f, f2, pointerId2);
                            if (this.f10852o00oOOo0 != 1) {
                                View o0O0o3 = o0O0o((int) x2, (int) y2);
                                if (o00oOoO(o0O0o3, f, f2) && o0O000(o0O0o3, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else if (!o00ooo0(this.f10854o00oOo00)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f10854o00oOo00);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f10856o00oOo0o;
                    int i5 = this.f10854o00oOo00;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f10858o00oOoO0[i5]);
                    o00oo0o(this.f10871o00oo0o.getLeft() + i6, this.f10871o00oo0o.getTop() + i7, i6, i7);
                }
                o00oooo0(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    o00oooOo(x4, y4, pointerId3);
                    if (this.f10852o00oOOo0 != 0) {
                        if (o00ooOo((int) x4, (int) y4)) {
                            o0O000(this.f10871o00oo0o, pointerId3);
                            return;
                        }
                        return;
                    }
                    o0O000(o0O0o((int) x4, (int) y4), pointerId3);
                    int i8 = this.f10857o00oOoO[pointerId3];
                    int i9 = this.f10867o00oo0O;
                    if ((i8 & i9) != 0) {
                        this.f10872o00oo0o0.onEdgeTouched(i8 & i9, pointerId3);
                        return;
                    }
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f10852o00oOOo0 == 1 && pointerId4 == this.f10854o00oOo00) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f10854o00oOo00) {
                                View o0O0o4 = o0O0o((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f10871o00oo0o;
                                if (o0O0o4 == view && o0O000(view, pointerId5)) {
                                    i = this.f10854o00oOo00;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            o00oooO();
                        }
                    }
                    o00oOooo(pointerId4);
                    return;
                }
            } else if (this.f10852o00oOOo0 == 1) {
                o00oo0Oo(0.0f, 0.0f);
            }
        } else if (this.f10852o00oOOo0 == 1) {
            o00oooO();
        }
        o00oOo00();
    }

    public final void o00oooO() {
        this.f10863o00oOooo.computeCurrentVelocity(1000, this.f10866o00oo00O);
        o00oo0Oo(o00oOoOO(this.f10863o00oOooo.getXVelocity(this.f10854o00oOo00), this.f10865o00oo0, this.f10866o00oo00O), o00oOoOO(this.f10863o00oOooo.getYVelocity(this.f10854o00oOo00), this.f10865o00oo0, this.f10866o00oo00O));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0O00O.o00oOo0O$o00oOo00] */
    public final void o00oooOO(float f, float f2, int i) {
        boolean o00oOo0O2 = o00oOo0O(f, f2, i, 1);
        boolean z = o00oOo0O2;
        if (o00oOo0O(f2, f, i, 4)) {
            z = o00oOo0O2 | true;
        }
        boolean z2 = z;
        if (o00oOo0O(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (o00oOo0O(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.f10859o00oOoOO;
            iArr[i] = iArr[i] | r0;
            this.f10872o00oo0o0.onEdgeDragStarted(r0, i);
        }
    }

    public final void o00oooOo(float f, float f2, int i) {
        o00oo0oO(i);
        float[] fArr = this.f10862o00oOooO;
        this.f10856o00oOo0o[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f10855o00oOo0O;
        this.f10858o00oOoO0[i] = f2;
        fArr2[i] = f2;
        this.f10857o00oOoO[i] = o00ooOO0((int) f, (int) f2);
        this.f10861o00oOoo0 |= 1 << i;
    }

    public void o00oooo(int i) {
        this.f10874o0O0o.removeCallbacks(this.f10864o00oo);
        if (this.f10852o00oOOo0 != i) {
            this.f10852o00oOOo0 = i;
            this.f10872o00oo0o0.onViewDragStateChanged(i);
            if (this.f10852o00oOOo0 == 0) {
                this.f10871o00oo0o = null;
            }
        }
    }

    public final void o00oooo0(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (o00ooo0(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f10856o00oOo0o[pointerId] = x;
                this.f10858o00oOoO0[pointerId] = y;
            }
        }
    }

    public void o00ooooO(@o0OO0 @o00oOooO.o0O0o00O(from = 0) int i) {
        this.f10869o00oo0OO = i;
    }

    public void o00ooooo(int i) {
        this.f10867o00oo0O = i;
    }

    public boolean o0O000(View view, int i) {
        if (view == this.f10871o00oo0o && this.f10854o00oOo00 == i) {
            return true;
        }
        if (view == null || !this.f10872o00oo0o0.tryCaptureView(view, i)) {
            return false;
        }
        this.f10854o00oOo00 = i;
        o00oOooO(view, i);
        return true;
    }

    public boolean o0O00000(int i, int i2) {
        if (this.f10873o00oo0oO) {
            return o00ooO00(i, i2, (int) this.f10863o00oOooo.getXVelocity(this.f10854o00oOo00), (int) this.f10863o00oOooo.getYVelocity(this.f10854o00oOo00));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o0O0000O(@o00oOooO.oo0oO0 android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O00O.o00oOo0O.o0O0000O(android.view.MotionEvent):boolean");
    }

    public boolean o0O0000o(@oo0oO0 View view, int i, int i2) {
        this.f10871o00oo0o = view;
        this.f10854o00oOo00 = -1;
        boolean o00ooO002 = o00ooO00(i, i2, 0, 0);
        if (!o00ooO002 && this.f10852o00oOOo0 == 0 && this.f10871o00oo0o != null) {
            this.f10871o00oo0o = null;
        }
        return o00ooO002;
    }

    @o0OO00OO
    public View o0O0o(int i, int i2) {
        for (int childCount = this.f10874o0O0o.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f10874o0O0o.getChildAt(this.f10872o00oo0o0.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
