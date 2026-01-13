package o0O0Oo0o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0O0O implements o0O0oo0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOOo0 f11924o00oOOo0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends ViewGroup {

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static Method f11925o00oo0oO;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public View f11926o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public ViewGroup f11927o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public ArrayList<Drawable> f11928o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f11929o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public o0O0O0O f11930o00oo0o0;

        static {
            try {
                Class cls = Integer.TYPE;
                f11925o00oo0oO = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public o00oOOo0(Context context, ViewGroup viewGroup, View view, o0O0O0O o0o0o0o) {
            super(context);
            this.f11928o00oo0Oo = null;
            this.f11927o00oo0O0 = viewGroup;
            this.f11926o00oo0O = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f11930o00oo0o0 = o0o0o0o;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f11927o00oo0O0.getLocationOnScreen(iArr);
            this.f11926o00oo0O.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f11926o00oo0O.getWidth(), this.f11926o00oo0O.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f11928o00oo0Oo;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11928o00oo0Oo.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f11927o00oo0O0 != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f11927o00oo0O0 == null) {
                    invalidate(rect);
                    return null;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                o00oOo0O(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@oo0oO0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void o00oOOo0(Drawable drawable) {
            o00oOo00();
            if (this.f11928o00oo0Oo == null) {
                this.f11928o00oo0Oo = new ArrayList<>();
            }
            if (this.f11928o00oo0Oo.contains(drawable)) {
                return;
            }
            this.f11928o00oo0Oo.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void o00oOOoO(View view) {
            o00oOo00();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f11927o00oo0O0 && viewGroup.getParent() != null && o0O000oo.o0O0o00O.o0O0OOoo(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f11927o00oo0O0.getLocationOnScreen(iArr2);
                    view.offsetLeftAndRight(iArr[0] - iArr2[0]);
                    view.offsetTopAndBottom(iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void o00oOo00() {
            if (this.f11929o00oo0o) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void o00oOo0O(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f11927o00oo0O0.getLocationOnScreen(iArr2);
            this.f11926o00oo0O.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public ViewParent o00oOo0o(int i, int i2, Rect rect) {
            if (this.f11927o00oo0O0 == null || f11925o00oo0oO == null) {
                return null;
            }
            try {
                o00oOo0O(new int[2]);
                f11925o00oo0oO.invoke(this.f11927o00oo0O0, Integer.valueOf(i), Integer.valueOf(i2), rect);
                return null;
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                return null;
            }
        }

        public void o00oOoO(View view) {
            super.removeView(view);
            o00oOooO();
        }

        public void o00oOoO0(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f11928o00oo0Oo;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                o00oOooO();
            }
        }

        public final void o00oOooO() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f11928o00oo0Oo;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f11929o00oo0o = true;
                    this.f11927o00oo0O0.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@oo0oO0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f11928o00oo0Oo) != null && arrayList.contains(drawable));
        }
    }

    public o0O0O0O(Context context, ViewGroup viewGroup, View view) {
        this.f11924o00oOOo0 = new o00oOOo0(context, viewGroup, view, this);
    }

    public static o0O0O0O o00oOOo0(View view) {
        ViewGroup o00oOOoO2 = o00oOOoO(view);
        if (o00oOOoO2 != null) {
            int childCount = o00oOOoO2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = o00oOOoO2.getChildAt(i);
                if (childAt instanceof o00oOOo0) {
                    return ((o00oOOo0) childAt).f11930o00oo0o0;
                }
            }
            return new o0O00O(o00oOOoO2.getContext(), o00oOOoO2, view);
        }
        return null;
    }

    public static ViewGroup o00oOOoO(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void add(@oo0oO0 Drawable drawable) {
        this.f11924o00oOOo0.o00oOOo0(drawable);
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void remove(@oo0oO0 Drawable drawable) {
        this.f11924o00oOOo0.o00oOoO0(drawable);
    }
}
