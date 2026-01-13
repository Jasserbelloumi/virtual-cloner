package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oOoO;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class oo0oO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f1562o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final androidx.appcompat.view.menu.o00oOoO f1563o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final View f1564o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oOoO f1565o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOo0O f1566o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public View.OnTouchListener f1567o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final androidx.appcompat.view.menu.o00oo0O0 f1568o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOoO.o00oOOo0 {
        public o00oOOo0() {
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public boolean onMenuItemSelected(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @o00oOooO.oo0oO0 MenuItem menuItem) {
            o00oOoO o00oooo3 = oo0oO0.this.f1565o00oOo0O;
            if (o00oooo3 != null) {
                return o00oooo3.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public void onMenuModeChange(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements PopupWindow.OnDismissListener {
        public o00oOOoO() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            oo0oO0 oo0oo0 = oo0oO0.this;
            o00oOo0O o00ooo0o2 = oo0oo0.f1566o00oOo0o;
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOOo0(oo0oo0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o0O0o00O {
        public o00oOo00(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public o00oOoo0.o00ooO0 o00oOOoO() {
            return oo0oO0.this.f1568o00oOooO.o00oOo0O();
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public boolean o00oOo00() {
            oo0oO0.this.o00oOooo();
            return true;
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public boolean o00oOooO() {
            oo0oO0.this.o00oOOo0();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        void o00oOOo0(oo0oO0 oo0oo0);
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public oo0oO0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 View view) {
        this(context, view, 0);
    }

    public oo0oO0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 View view, int i) {
        this(context, view, i, R.attr.popupMenuStyle, 0);
    }

    public oo0oO0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 View view, int i, @o00oOooO.o0O000Oo int i2, @o00oOooO.o0OOO0OO int i3) {
        this.f1562o00oOOo0 = context;
        this.f1564o00oOo00 = view;
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = new androidx.appcompat.view.menu.o00oOoO(context);
        this.f1563o00oOOoO = o00oooo2;
        o00oooo2.setCallback(new o00oOOo0());
        androidx.appcompat.view.menu.o00oo0O0 o00oo0o02 = new androidx.appcompat.view.menu.o00oo0O0(context, o00oooo2, view, false, i2, i3);
        this.f1568o00oOooO = o00oo0o02;
        o00oo0o02.o00oOoOo(i);
        o00oo0o02.o00oOoo0(new o00oOOoO());
    }

    public void o00oOOo0() {
        this.f1568o00oOooO.dismiss();
    }

    @o00oOooO.oo0oO0
    public View.OnTouchListener o00oOOoO() {
        if (this.f1567o00oOoO0 == null) {
            this.f1567o00oOoO0 = new o00oOo00(this.f1564o00oOo00);
        }
        return this.f1567o00oOoO0;
    }

    public int o00oOo00() {
        return this.f1568o00oOooO.o00oOo00();
    }

    @o00oOooO.oo0oO0
    public MenuInflater o00oOo0O() {
        return new o00oOoOo.o00ooO0(this.f1562o00oOOo0);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ListView o00oOo0o() {
        if (this.f1568o00oOooO.o00oOo0o()) {
            return this.f1568o00oOooO.o00oOooO();
        }
        return null;
    }

    public void o00oOoO(boolean z) {
        this.f1568o00oOooO.o00oOoOO(z);
    }

    public void o00oOoO0(@o00oOooO.o0OO000 int i) {
        o00oOo0O().inflate(i, this.f1563o00oOOoO);
    }

    public void o00oOoOO(int i) {
        this.f1568o00oOooO.o00oOoOo(i);
    }

    public void o00oOoOo(@o00oOooO.o0OO00OO o00oOo0O o00ooo0o2) {
        this.f1566o00oOo0o = o00ooo0o2;
    }

    public void o00oOoo0(@o00oOooO.o0OO00OO o00oOoO o00oooo2) {
        this.f1565o00oOo0O = o00oooo2;
    }

    @o00oOooO.oo0oO0
    public Menu o00oOooO() {
        return this.f1563o00oOOoO;
    }

    public void o00oOooo() {
        this.f1568o00oOooO.o00oOooo();
    }
}
