package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.o0OO000;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public final class o00oo extends o00oOoo0.o0O0o implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o00oo0O, View.OnKeyListener {

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f636o00ooo0 = R.layout.abc_popup_menu_item_layout;

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f637o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f638o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00oOoO f639o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final boolean f640o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOo0O f641o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f642o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public View f643o00ooO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final o0OO000 f645o00ooO00;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public PopupWindow.OnDismissListener f647o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f648o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public View f649o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public ViewTreeObserver f650o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f651o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f652o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public int f653o00ooOoO;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f655o00ooo00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f656o0O0o;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f644o00ooO0 = new o00oOOo0();

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f646o00ooO0O = new o00oOOoO();

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f654o00ooOoo = 0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public o00oOOo0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!o00oo.this.o00oOOo0() || o00oo.this.f645o00ooO00.o00ooo00()) {
                return;
            }
            View view = o00oo.this.f649o00ooOO0;
            if (view == null || !view.isShown()) {
                o00oo.this.dismiss();
            } else {
                o00oo.this.f645o00ooO00.show();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements View.OnAttachStateChangeListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = o00oo.this.f650o00ooOOo;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    o00oo.this.f650o00ooOOo = view.getViewTreeObserver();
                }
                o00oo o00ooVar = o00oo.this;
                o00ooVar.f650o00ooOOo.removeGlobalOnLayoutListener(o00ooVar.f644o00ooO0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public o00oo(Context context, o00oOoO o00oooo2, View view, int i, int i2, boolean z) {
        this.f638o00oo0O = context;
        this.f639o00oo0Oo = o00oooo2;
        this.f640o00oo0o = z;
        this.f641o00oo0o0 = new o00oOo0O(o00oooo2, LayoutInflater.from(context), z, f636o00ooo0);
        this.f656o0O0o = i;
        this.f637o00oo = i2;
        Resources resources = context.getResources();
        this.f642o00oo0oO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f643o00ooO = view;
        this.f645o00ooO00 = new o0OO000(context, null, i, i2);
        o00oooo2.addMenuPresenter(this, context);
    }

    @Override // o00oOoo0.o00ooO0
    public void dismiss() {
        if (o00oOOo0()) {
            this.f645o00ooO00.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean flagActionItems() {
        return false;
    }

    @Override // o00oOoo0.o00ooO0
    public boolean o00oOOo0() {
        return !this.f652o00ooOo0 && this.f645o00ooO00.o00oOOo0();
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOOoO(o00oOoO o00oooo2) {
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOo0o(View view) {
        this.f643o00ooO = view;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoO(boolean z) {
        this.f641o00oo0o0.o00oOo0O(z);
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoOO(int i) {
        this.f654o00ooOoo = i;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoOo(int i) {
        this.f645o00ooO00.o00oOooO(i);
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoo0(PopupWindow.OnDismissListener onDismissListener) {
        this.f647o00ooO0o = onDismissListener;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOooo(boolean z) {
        this.f655o00ooo00 = z;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oo00O(int i) {
        this.f645o00ooO00.o00oOoO(i);
    }

    public final boolean o00oo0O() {
        View view;
        if (o00oOOo0()) {
            return true;
        }
        if (this.f652o00ooOo0 || (view = this.f643o00ooO) == null) {
            return false;
        }
        this.f649o00ooOO0 = view;
        this.f645o00ooO00.o0OoOoOO(this);
        this.f645o00ooO00.o0O000o0(this);
        this.f645o00ooO00.o0O000Oo(true);
        View view2 = this.f649o00ooOO0;
        boolean z = this.f650o00ooOOo == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f650o00ooOOo = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f644o00ooO0);
        }
        view2.addOnAttachStateChangeListener(this.f646o00ooO0O);
        this.f645o00ooO00.o00oooo0(view2);
        this.f645o00ooO00.o0(this.f654o00ooOoo);
        if (!this.f651o00ooOo) {
            this.f653o00ooOoO = o00oOoo0.o0O0o.o00oOo0O(this.f641o00oo0o0, null, this.f638o00oo0O, this.f642o00oo0oO);
            this.f651o00ooOo = true;
        }
        this.f645o00ooO00.o00ooooO(this.f653o00ooOoO);
        this.f645o00ooO00.o0O000(2);
        this.f645o00ooO00.o0O00000(this.f7125o00oo0O0);
        this.f645o00ooO00.show();
        ListView o00oo0OO2 = this.f645o00ooO00.o00oo0OO();
        o00oo0OO2.setOnKeyListener(this);
        if (this.f655o00ooo00 && this.f639o00oo0Oo.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f638o00oo0O).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o00oo0OO2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f639o00oo0Oo.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            o00oo0OO2.addHeaderView(frameLayout, null, false);
        }
        this.f645o00ooO00.o00oo00O(this.f641o00oo0o0);
        this.f645o00ooO00.show();
        return true;
    }

    @Override // o00oOoo0.o00ooO0
    public ListView o00oo0OO() {
        return this.f645o00ooO00.o00oo0OO();
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(o00oOoO o00oooo2, boolean z) {
        if (o00oooo2 != this.f639o00oo0Oo) {
            return;
        }
        dismiss();
        o00oo0O.o00oOOo0 o00oooo02 = this.f648o00ooOO;
        if (o00oooo02 != null) {
            o00oooo02.onCloseMenu(o00oooo2, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f652o00ooOo0 = true;
        this.f639o00oo0Oo.close();
        ViewTreeObserver viewTreeObserver = this.f650o00ooOOo;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f650o00ooOOo = this.f649o00ooOO0.getViewTreeObserver();
            }
            this.f650o00ooOOo.removeGlobalOnLayoutListener(this.f644o00ooO0);
            this.f650o00ooOOo = null;
        }
        this.f649o00ooOO0.removeOnAttachStateChangeListener(this.f646o00ooO0O);
        PopupWindow.OnDismissListener onDismissListener = this.f647o00ooO0o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(o00ooO0 o00ooo02) {
        if (o00ooo02.hasVisibleItems()) {
            o00oo0O0 o00oo0o02 = new o00oo0O0(this.f638o00oo0O, o00ooo02, this.f649o00ooOO0, this.f640o00oo0o, this.f656o0O0o, this.f637o00oo);
            o00oo0o02.o00oOOo0(this.f648o00ooOO);
            o00oo0o02.o00oOoOO(o00oOoo0.o0O0o.o00oo0(o00ooo02));
            o00oo0o02.f673o00oOoo0 = this.f647o00ooO0o;
            this.f647o00ooO0o = null;
            this.f639o00oo0Oo.close(false);
            int o00oOOoO2 = this.f645o00ooO00.o00oOOoO();
            int o00oOoo02 = this.f645o00ooO00.o00oOoo0();
            if ((Gravity.getAbsoluteGravity(this.f654o00ooOoo, o0O0o00O.o0O000O(this.f643o00ooO)) & 7) == 5) {
                o00oOOoO2 += this.f643o00ooO.getWidth();
            }
            if (o00oo0o02.o00oo0O0(o00oOOoO2, o00oOoo02)) {
                o00oo0O.o00oOOo0 o00oooo02 = this.f648o00ooOO;
                if (o00oooo02 != null) {
                    o00oooo02.o00oOOo0(o00ooo02);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
        this.f648o00ooOO = o00oooo02;
    }

    @Override // o00oOoo0.o00ooO0
    public void show() {
        if (!o00oo0O()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        this.f651o00ooOo = false;
        o00oOo0O o00ooo0o2 = this.f641o00oo0o0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.notifyDataSetChanged();
        }
    }
}
