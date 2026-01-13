package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oooo0.o0O0O0Oo;
import o0O000.o00oOOo0;
/* loaded from: classes.dex */
public class oo0OOoo extends ListView {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f1540o00ooOO = -1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f1541o00ooOO0 = -1;

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f1542o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1543o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Rect f1544o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f1545o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f1546o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f1547o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f1548o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public o00oo00O f1549o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f1550o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f1551o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o0O000oo.o0OO0oO0 f1552o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public androidx.core.widget.o0 f1553o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOo0O f1554o0O0o;

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Method f1555o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f1556o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static Method f1557o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static boolean f1558o00oOooO;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1555o00oOOo0 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1556o00oOOoO = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1557o00oOo00 = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1558o00oOooO = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean o00oOOo0() {
            return f1558o00oOooO;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void o00oOOoO(oo0OOoo oo0oooo, int i, View view) {
            try {
                f1555o00oOOo0.invoke(oo0oooo, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f1556o00oOOoO.invoke(oo0oooo, Integer.valueOf(i));
                f1557o00oOo00.invoke(oo0oooo, Integer.valueOf(i));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    @o00oOooO.o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOoO0.o00oOo0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f1559o00oo0O;

        public o00oOo0O(Drawable drawable) {
            super(drawable);
            this.f1559o00oo0O = true;
        }

        @Override // o00oOoO0.o00oOo0O, android.graphics.drawable.Drawable
        public void draw(@o00oOooO.oo0oO0 Canvas canvas) {
            if (this.f1559o00oo0O) {
                super.draw(canvas);
            }
        }

        public void o00oOo00(boolean z) {
            this.f1559o00oo0O = z;
        }

        @Override // o00oOoO0.o00oOo0O, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1559o00oo0O) {
                super.setHotspot(f, f2);
            }
        }

        @Override // o00oOoO0.o00oOo0O, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1559o00oo0O) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // o00oOoO0.o00oOo0O, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1559o00oo0O) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // o00oOoO0.o00oOo0O, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1559o00oo0O) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final Field f1560o00oOOo0;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f1560o00oOOo0 = field;
        }

        public static boolean o00oOOo0(AbsListView absListView) {
            Field field = f1560o00oOOo0;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static void o00oOOoO(AbsListView absListView, boolean z) {
            Field field = f1560o00oOOo0;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements Runnable {
        public o00oo00O() {
        }

        public void o00oOOo0() {
            oo0OOoo oo0oooo = oo0OOoo.this;
            oo0oooo.f1549o00ooO = null;
            oo0oooo.removeCallbacks(this);
        }

        public void o00oOOoO() {
            oo0OOoo.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            oo0OOoo oo0oooo = oo0OOoo.this;
            oo0oooo.f1549o00ooO = null;
            oo0oooo.drawableStateChanged();
        }
    }

    public oo0OOoo(@o00oOooO.oo0oO0 Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1544o00oo0O0 = new Rect();
        this.f1543o00oo0O = 0;
        this.f1545o00oo0Oo = 0;
        this.f1547o00oo0o0 = 0;
        this.f1546o00oo0o = 0;
        this.f1551o00ooO00 = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        o00oOo0O o00ooo0o2 = this.f1554o0O0o;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOo00(z);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        o00oOo00(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1549o00ooO != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        o00oo0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1551o00ooO00 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1551o00ooO00 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1551o00ooO00 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1551o00ooO00 && this.f1542o00oo) || super.isInTouchMode();
    }

    public final void o00oOOo0() {
        this.f1550o00ooO0 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1548o00oo0oO - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        o0O000oo.o0OO0oO0 o0oo0oo0 = this.f1552o00ooO0O;
        if (o0oo0oo0 != null) {
            o0oo0oo0.o00oOooO();
            this.f1552o00ooO0O = null;
        }
    }

    public final void o00oOOoO(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void o00oOo00(Canvas canvas) {
        Drawable selector;
        if (this.f1544o00oo0O0.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1544o00oo0O0);
        selector.draw(canvas);
    }

    public int o00oOo0O(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00oOo0o(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.o00oOoOo(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.o00oOOoO(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.o00oOOo0()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.o0 r9 = r7.f1553o00ooO0o
            if (r9 != 0) goto L5a
            androidx.core.widget.o0 r9 = new androidx.core.widget.o0
            r9.<init>(r7)
            r7.f1553o00ooO0o = r9
        L5a:
            androidx.core.widget.o0 r9 = r7.f1553o00ooO0o
            r9.o00oo0OO(r2)
            androidx.core.widget.o0 r9 = r7.f1553o00ooO0o
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.o0 r8 = r7.f1553o00ooO0o
            if (r8 == 0) goto L6c
            r8.o00oo0OO(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.oo0OOoo.o00oOo0o(android.view.MotionEvent, int):boolean");
    }

    public final void o00oOoO(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        o00oOoO0(i, view);
        if (z) {
            Rect rect = this.f1544o00oo0O0;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            o0O0O0Oo.o00oOOoO.o00oOo0O(selector, exactCenterX, exactCenterY);
        }
    }

    public final void o00oOoO0(int i, View view) {
        Rect rect = this.f1544o00oo0O0;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1543o00oo0O;
        rect.top -= this.f1545o00oo0Oo;
        rect.right += this.f1547o00oo0o0;
        rect.bottom += this.f1546o00oo0o;
        boolean o00oOoo02 = o00oOoo0();
        if (view.isEnabled() != o00oOoo02) {
            o00oOooo(!o00oOoo02);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void o00oOoOO(int i, View view, float f, float f2) {
        o00oOoO(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        o0O0O0Oo.o00oOOoO.o00oOo0O(selector, f, f2);
    }

    public final void o00oOoOo(View view, int i, float f, float f2) {
        View childAt;
        this.f1550o00ooO0 = true;
        o00oOOo0.o00oOOo0(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1548o00oo0oO;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1548o00oo0oO = i;
        o00oOOo0.o00oOOo0(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        o00oOoOO(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @o00oOooO.o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public final boolean o00oOoo0() {
        return o0O000.o00oOOo0.o00oOoo0() ? o00oOo00.o00oOOo0(this) : o00oOoO.o00oOOo0(this);
    }

    public int o00oOooO(int i, boolean z) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    min = Math.max(0, i);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            } else if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    @o00oOooO.o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public final void o00oOooo(boolean z) {
        if (o0O000.o00oOOo0.o00oOoo0()) {
            o00oOo00.o00oOOoO(this, z);
        } else {
            o00oOoO.o00oOOoO(this, z);
        }
    }

    public final void o00oo0() {
        Drawable selector = getSelector();
        if (selector != null && o00oo00O() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public final boolean o00oo00O() {
        return this.f1550o00ooO0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1549o00ooO = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@o00oOooO.oo0oO0 MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1549o00ooO == null) {
            o00oo00O o00oo00o = new o00oo00O();
            this.f1549o00ooO = o00oo00o;
            o00oo00o.o00oOOoO();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !o00oOOoO.o00oOOo0()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        o00oOOoO.o00oOOoO(this, pointToPosition, childAt);
                    }
                }
                o00oo0();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1548o00oo0oO = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o00oo00O o00oo00o = this.f1549o00ooO;
        if (o00oo00o != null) {
            o00oo00o.o00oOOo0();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1542o00oo = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        o00oOo0O o00ooo0o2 = drawable != null ? new o00oOo0O(drawable) : null;
        this.f1554o0O0o = o00ooo0o2;
        super.setSelector(o00ooo0o2);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1543o00oo0O = rect.left;
        this.f1545o00oo0Oo = rect.top;
        this.f1547o00oo0o0 = rect.right;
        this.f1546o00oo0o = rect.bottom;
    }
}
