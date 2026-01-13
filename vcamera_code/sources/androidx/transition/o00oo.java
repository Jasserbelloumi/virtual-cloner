package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O0O0Oo;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class o00oo extends ViewGroup implements o0O0Oo0o.o00oo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public View f5016o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ViewGroup f5017o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final View f5018o00oo0Oo;
    @o0OO00OO

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Matrix f5019o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f5020o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f5021o00oo0oO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ViewTreeObserver.OnPreDrawListener {
        public o00oOOo0() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            o0O0o00O.o0O0o0oO(o00oo.this);
            o00oo o00ooVar = o00oo.this;
            ViewGroup viewGroup = o00ooVar.f5017o00oo0O0;
            if (viewGroup == null || (view = o00ooVar.f5016o00oo0O) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            o0O0o00O.o00oo0OO.o00oOoo0(o00oo.this.f5017o00oo0O0);
            o00oo o00ooVar2 = o00oo.this;
            o00ooVar2.f5017o00oo0O0 = null;
            o00ooVar2.f5016o00oo0O = null;
            return true;
        }
    }

    public o00oo(View view) {
        super(view.getContext());
        this.f5021o00oo0oO = new o00oOOo0();
        this.f5018o00oo0Oo = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static o00oo o00oOOoO(View view, ViewGroup viewGroup, Matrix matrix) {
        o0O0o o0o0o;
        if (view.getParent() instanceof ViewGroup) {
            o0O0o o00oOOoO2 = o0O0o.o00oOOoO(viewGroup);
            o00oo o00oOo0O2 = o00oOo0O(view);
            int i = 0;
            if (o00oOo0O2 != null && (o0o0o = (o0O0o) o00oOo0O2.getParent()) != o00oOOoO2) {
                i = o00oOo0O2.f5020o00oo0o0;
                o0o0o.removeView(o00oOo0O2);
                o00oOo0O2 = null;
            }
            if (o00oOo0O2 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    o00oOo00(view, viewGroup, matrix);
                }
                o00oOo0O2 = new o00oo(view);
                o00oOo0O2.f5019o00oo0o = matrix;
                if (o00oOOoO2 == null) {
                    o00oOOoO2 = new o0O0o(viewGroup);
                } else {
                    o00oOOoO2.o00oOoO0();
                }
                o00oOooO(viewGroup, o00oOOoO2);
                o00oOooO(viewGroup, o00oOo0O2);
                o00oOOoO2.o00oOOo0(o00oOo0O2);
                o00oOo0O2.f5020o00oo0o0 = i;
            } else if (matrix != null) {
                o00oOo0O2.o00oOoO(matrix);
            }
            o00oOo0O2.f5020o00oo0o0++;
            return o00oOo0O2;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void o00oOo00(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        o0O0O0Oo.o00oOoOo(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        o0O0O0Oo.o00oOoo0(viewGroup, matrix);
    }

    public static o00oo o00oOo0O(View view) {
        return (o00oo) view.getTag(R.id.ghost_view);
    }

    public static void o00oOo0o(View view) {
        o00oo o00oOo0O2 = o00oOo0O(view);
        if (o00oOo0O2 != null) {
            int i = o00oOo0O2.f5020o00oo0o0 - 1;
            o00oOo0O2.f5020o00oo0o0 = i;
            if (i <= 0) {
                ((o0O0o) o00oOo0O2.getParent()).removeView(o00oOo0O2);
            }
        }
    }

    public static void o00oOoO0(@oo0oO0 View view, @o0OO00OO o00oo o00ooVar) {
        view.setTag(R.id.ghost_view, o00ooVar);
    }

    public static void o00oOooO(View view, View view2) {
        o0O0O0Oo.o00oOoO0(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    @Override // o0O0Oo0o.o00oo
    public void o00oOOo0(ViewGroup viewGroup, View view) {
        this.f5017o00oo0O0 = viewGroup;
        this.f5016o00oo0O = view;
    }

    public void o00oOoO(@oo0oO0 Matrix matrix) {
        this.f5019o00oo0o = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00oOoO0(this.f5018o00oo0Oo, this);
        this.f5018o00oo0Oo.getViewTreeObserver().addOnPreDrawListener(this.f5021o00oo0oO);
        o0O0O0Oo.o00oOoOO(this.f5018o00oo0Oo, 4);
        if (this.f5018o00oo0Oo.getParent() != null) {
            ((View) this.f5018o00oo0Oo.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f5018o00oo0Oo.getViewTreeObserver().removeOnPreDrawListener(this.f5021o00oo0oO);
        o0O0O0Oo.o00oOoOO(this.f5018o00oo0Oo, 0);
        o00oOoO0(this.f5018o00oo0Oo, null);
        if (this.f5018o00oo0Oo.getParent() != null) {
            ((View) this.f5018o00oo0Oo.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o0O0Oo0o.o00oo0O0.o00oOOo0(canvas, true);
        canvas.setMatrix(this.f5019o00oo0o);
        o0O0O0Oo.o00oOoOO(this.f5018o00oo0Oo, 0);
        this.f5018o00oo0Oo.invalidate();
        o0O0O0Oo.o00oOoOO(this.f5018o00oo0Oo, 4);
        drawChild(canvas, this.f5018o00oo0Oo, getDrawingTime());
        o0O0Oo0o.o00oo0O0.o00oOOo0(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, o0O0Oo0o.o00oo
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (o00oOo0O(this.f5018o00oo0Oo) == this) {
            o0O0O0Oo.o00oOoOO(this.f5018o00oo0Oo, i == 0 ? 4 : 0);
        }
    }
}
