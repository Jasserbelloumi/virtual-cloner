package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oo0O;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000oo.o0;
import o0O000oo.o0O0o00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O0 implements o00oo0 {

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f663o00oo00O = 48;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f664o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOoO f665o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final boolean f666o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f667o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public View f668o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f669o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f670o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f671o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oOoo0.o0O0o f672o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f673o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f674o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f675o00oOooo;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements PopupWindow.OnDismissListener {
        public o00oOOo0() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            o00oo0O0.this.o00oOoO0();
        }
    }

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 o00oOoO o00oooo2) {
        this(context, o00oooo2, null, false, R.attr.popupMenuStyle, 0);
    }

    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 o00oOoO o00oooo2, @oo0oO0 View view) {
        this(context, o00oooo2, view, false, R.attr.popupMenuStyle, 0);
    }

    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 o00oOoO o00oooo2, @oo0oO0 View view, boolean z, @o0O000Oo int i) {
        this(context, o00oooo2, view, z, i, 0);
    }

    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 o00oOoO o00oooo2, @oo0oO0 View view, boolean z, @o0O000Oo int i, @o0OOO0OO int i2) {
        this.f670o00oOoO0 = o0.f10418o00oOOoO;
        this.f675o00oOooo = new o00oOOo0();
        this.f664o00oOOo0 = context;
        this.f665o00oOOoO = o00oooo2;
        this.f668o00oOo0o = view;
        this.f666o00oOo00 = z;
        this.f674o00oOooO = i;
        this.f667o00oOo0O = i2;
    }

    @Override // androidx.appcompat.view.menu.o00oo0
    public void dismiss() {
        if (o00oOo0o()) {
            this.f672o00oOoOo.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0
    public void o00oOOo0(@o0OO00OO o00oo0O.o00oOOo0 o00oooo02) {
        this.f671o00oOoOO = o00oooo02;
        o00oOoo0.o0O0o o0o0o = this.f672o00oOoOo;
        if (o0o0o != null) {
            o0o0o.setCallback(o00oooo02);
        }
    }

    @oo0oO0
    public final o00oOoo0.o0O0o o00oOOoO() {
        Display defaultDisplay = ((WindowManager) this.f664o00oOOo0.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        o00oOOoO.o00oOOo0(defaultDisplay, point);
        o00oOoo0.o0O0o o00ooooo2 = Math.min(point.x, point.y) >= this.f664o00oOOo0.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new androidx.appcompat.view.menu.o00oOOoO(this.f664o00oOOo0, this.f668o00oOo0o, this.f674o00oOooO, this.f667o00oOo0O, this.f666o00oOo00) : new o00oo(this.f664o00oOOo0, this.f665o00oOOoO, this.f668o00oOo0o, this.f674o00oOooO, this.f667o00oOo0O, this.f666o00oOo00);
        o00ooooo2.o00oOOoO(this.f665o00oOOoO);
        o00ooooo2.o00oOoo0(this.f675o00oOooo);
        o00ooooo2.o00oOo0o(this.f668o00oOo0o);
        o00ooooo2.setCallback(this.f671o00oOoOO);
        o00ooooo2.o00oOoO(this.f669o00oOoO);
        o00ooooo2.o00oOoOO(this.f670o00oOoO0);
        return o00ooooo2;
    }

    public int o00oOo00() {
        return this.f670o00oOoO0;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oOoo0.o0O0o o00oOo0O() {
        if (this.f672o00oOoOo == null) {
            this.f672o00oOoOo = o00oOOoO();
        }
        return this.f672o00oOoOo;
    }

    public boolean o00oOo0o() {
        o00oOoo0.o0O0o o0o0o = this.f672o00oOoOo;
        return o0o0o != null && o0o0o.o00oOOo0();
    }

    public void o00oOoO(@oo0oO0 View view) {
        this.f668o00oOo0o = view;
    }

    public void o00oOoO0() {
        this.f672o00oOoOo = null;
        PopupWindow.OnDismissListener onDismissListener = this.f673o00oOoo0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void o00oOoOO(boolean z) {
        this.f669o00oOoO = z;
        o00oOoo0.o0O0o o0o0o = this.f672o00oOoOo;
        if (o0o0o != null) {
            o0o0o.o00oOoO(z);
        }
    }

    public void o00oOoOo(int i) {
        this.f670o00oOoO0 = i;
    }

    public void o00oOoo0(@o0OO00OO PopupWindow.OnDismissListener onDismissListener) {
        this.f673o00oOoo0 = onDismissListener;
    }

    public ListView o00oOooO() {
        return o00oOo0O().o00oo0OO();
    }

    public void o00oOooo() {
        if (!o00oo0OO()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void o00oo0(int i, int i2, boolean z, boolean z2) {
        o00oOoo0.o0O0o o00oOo0O2 = o00oOo0O();
        o00oOo0O2.o00oOooo(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f670o00oOoO0, o0O0o00O.o0O000O(this.f668o00oOo0o)) & 7) == 5) {
                i -= this.f668o00oOo0o.getWidth();
            }
            o00oOo0O2.o00oOoOo(i);
            o00oOo0O2.o00oo00O(i2);
            int i3 = (int) ((this.f664o00oOOo0.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            o00oOo0O2.o00oOoO0(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        o00oOo0O2.show();
    }

    public void o00oo00O(int i, int i2) {
        if (!o00oo0O0(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o00oo0O0(int i, int i2) {
        if (o00oOo0o()) {
            return true;
        }
        if (this.f668o00oOo0o == null) {
            return false;
        }
        o00oo0(i, i2, true, true);
        return true;
    }

    public boolean o00oo0OO() {
        if (o00oOo0o()) {
            return true;
        }
        if (this.f668o00oOo0o == null) {
            return false;
        }
        o00oo0(0, 0, false, false);
        return true;
    }
}
