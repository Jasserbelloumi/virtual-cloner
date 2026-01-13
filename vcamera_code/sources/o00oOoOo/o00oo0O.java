package o00oOoOo;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o00oOoOo.o00oo0;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O extends o00oo0 implements o00oOoO.o00oOOo0 {

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f7001o00oo;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Context f7002o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oo0.o00oOOo0 f7003o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ActionBarContextView f7004o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public WeakReference<View> f7005o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o00oOoO f7006o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f7007o0O0o;

    public o00oo0O(Context context, ActionBarContextView actionBarContextView, o00oo0.o00oOOo0 o00oooo02, boolean z) {
        this.f7002o00oo0Oo = context;
        this.f7004o00oo0o0 = actionBarContextView;
        this.f7003o00oo0o = o00oooo02;
        o00oOoO defaultShowAsAction = new o00oOoO(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f7006o00ooO00 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f7001o00oo = z;
    }

    @Override // o00oOoOo.o00oo0
    public void o00oOOo0() {
        if (this.f7007o0O0o) {
            return;
        }
        this.f7007o0O0o = true;
        this.f7003o00oo0o.o00oOOoO(this);
    }

    @Override // o00oOoOo.o00oo0
    public View o00oOOoO() {
        WeakReference<View> weakReference = this.f7005o00oo0oO;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o00oOoOo.o00oo0
    public Menu o00oOo00() {
        return this.f7006o00ooO00;
    }

    @Override // o00oOoOo.o00oo0
    public CharSequence o00oOo0O() {
        return this.f7004o00oo0o0.getSubtitle();
    }

    @Override // o00oOoOo.o00oo0
    public CharSequence o00oOoO0() {
        return this.f7004o00oo0o0.getTitle();
    }

    @Override // o00oOoOo.o00oo0
    public void o00oOoOO() {
        this.f7003o00oo0o.o00oOo00(this, this.f7006o00ooO00);
    }

    @Override // o00oOoOo.o00oo0
    public boolean o00oOoOo() {
        return this.f7004o00oo0o0.o00oo0o0();
    }

    @Override // o00oOoOo.o00oo0
    public boolean o00oOoo0() {
        return this.f7001o00oo;
    }

    @Override // o00oOoOo.o00oo0
    public MenuInflater o00oOooO() {
        return new o00ooO0(this.f7004o00oo0o0.getContext());
    }

    @Override // o00oOoOo.o00oo0
    public void o00oOooo(View view) {
        this.f7004o00oo0o0.setCustomView(view);
        this.f7005o00oo0oO = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o00oOoOo.o00oo0
    public void o00oo0(CharSequence charSequence) {
        this.f7004o00oo0o0.setSubtitle(charSequence);
    }

    @Override // o00oOoOo.o00oo0
    public void o00oo00O(int i) {
        o00oo0(this.f7002o00oo0Oo.getString(i));
    }

    @Override // o00oOoOo.o00oo0
    public void o00oo0O(CharSequence charSequence) {
        this.f7004o00oo0o0.setTitle(charSequence);
    }

    @Override // o00oOoOo.o00oo0
    public void o00oo0O0(int i) {
        o00oo0O(this.f7002o00oo0Oo.getString(i));
    }

    @Override // o00oOoOo.o00oo0
    public void o00oo0Oo(boolean z) {
        this.f6998o00oo0O = z;
        this.f7004o00oo0o0.setTitleOptional(z);
    }

    public void o00oo0o(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
    }

    public void o00oo0o0(o00oOoO o00oooo2, boolean z) {
    }

    public boolean o00oo0oO(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
        if (o00ooo02.hasVisibleItems()) {
            new androidx.appcompat.view.menu.o00oo0O0(this.f7004o00oo0o0.getContext(), o00ooo02).o00oOooo();
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
    public boolean onMenuItemSelected(@oo0oO0 o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
        return this.f7003o00oo0o.o00oOOo0(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
    public void onMenuModeChange(@oo0oO0 o00oOoO o00oooo2) {
        o00oOoOO();
        this.f7004o00oo0o0.o00oo0OO();
    }
}
