package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOo0O;
import androidx.appcompat.view.menu.o00oo0O;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo00O implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o00oo0O.o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public androidx.appcompat.app.o00oOo0O f659o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOoO f660o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oOo00 f661o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f662o00oo0o0;

    public o00oo00O(o00oOoO o00oooo2) {
        this.f660o00oo0O0 = o00oooo2;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
    public boolean o00oOOo0(@oo0oO0 o00oOoO o00oooo2) {
        o00oo0O.o00oOOo0 o00oooo02 = this.f662o00oo0o0;
        if (o00oooo02 != null) {
            return o00oooo02.o00oOOo0(o00oooo2);
        }
        return false;
    }

    public void o00oOOoO() {
        androidx.appcompat.app.o00oOo0O o00ooo0o2 = this.f659o00oo0O;
        if (o00ooo0o2 != null) {
            o00ooo0o2.dismiss();
        }
    }

    public void o00oOo00(o00oo0O.o00oOOo0 o00oooo02) {
        this.f662o00oo0o0 = o00oooo02;
    }

    public void o00oOooO(IBinder iBinder) {
        o00oOoO o00oooo2 = this.f660o00oo0O0;
        o00oOo0O.o00oOOo0 o00oooo02 = new o00oOo0O.o00oOOo0(o00oooo2.getContext());
        o00oOo00 o00ooo002 = new o00oOo00(o00oooo02.getContext(), R.layout.abc_list_menu_item_layout);
        this.f661o00oo0Oo = o00ooo002;
        o00ooo002.setCallback(this);
        this.f660o00oo0O0.addMenuPresenter(this.f661o00oo0Oo);
        o00oooo02.setAdapter(this.f661o00oo0Oo.o00oOOo0(), this);
        View headerView = o00oooo2.getHeaderView();
        if (headerView != null) {
            o00oooo02.setCustomTitle(headerView);
        } else {
            o00oooo02.setIcon(o00oooo2.getHeaderIcon()).setTitle(o00oooo2.getHeaderTitle());
        }
        o00oooo02.setOnKeyListener(this);
        androidx.appcompat.app.o00oOo0O create = o00oooo02.create();
        this.f659o00oo0O = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f659o00oo0O.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f659o00oo0O.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f660o00oo0O0.performItemAction((o00oo0OO) this.f661o00oo0Oo.o00oOOo0().getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
    public void onCloseMenu(@oo0oO0 o00oOoO o00oooo2, boolean z) {
        if (z || o00oooo2 == this.f660o00oo0O0) {
            o00oOOoO();
        }
        o00oo0O.o00oOOo0 o00oooo02 = this.f662o00oo0o0;
        if (o00oooo02 != null) {
            o00oooo02.onCloseMenu(o00oooo2, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f661o00oo0Oo.onCloseMenu(this.f660o00oo0O0, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f659o00oo0O.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f659o00oo0O.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f660o00oo0O0.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f660o00oo0O0.performShortcut(i, keyEvent, 0);
    }
}
