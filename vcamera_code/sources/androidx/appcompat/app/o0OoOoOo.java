package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.o00oOOo0;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0O0OOO;
import androidx.appcompat.widget.o0OOOO0o;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0OoOoOo extends androidx.appcompat.app.o00oOOo0 {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final o0O0OOO f516o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final Window.Callback f517o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final AppCompatDelegateImpl.o00oo0O0 f518o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f519o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f520o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public boolean f521o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Toolbar.o00oo0OO f522o00oo0O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public ArrayList<o00oOOo0.o00oOo0O> f524o00oo0OO = new ArrayList<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Runnable f523o00oo0O0 = new o00oOOo0();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OoOoOo.this.o0O0O0oo();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Toolbar.o00oo0OO {
        public o00oOOoO() {
        }

        @Override // androidx.appcompat.widget.Toolbar.o00oo0OO
        public boolean onMenuItemClick(MenuItem menuItem) {
            return o0OoOoOo.this.f517o00oOoOo.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOo00 implements o00oo0O.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f528o00oo0O0;

        public o00oOo00() {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public boolean o00oOOo0(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            o0OoOoOo.this.f517o00oOoOo.onMenuOpened(108, o00oooo2);
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public void onCloseMenu(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
            if (this.f528o00oo0O0) {
                return;
            }
            this.f528o00oo0O0 = true;
            o0OoOoOo.this.f516o00oOoOO.o00ooO();
            o0OoOoOo.this.f517o00oOoOo.onPanelClosed(108, o00oooo2);
            this.f528o00oo0O0 = false;
        }
    }

    /* loaded from: classes.dex */
    public final class o00oOo0O implements o00oOoO.o00oOOo0 {
        public o00oOo0O() {
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public boolean onMenuItemSelected(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public void onMenuModeChange(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            if (o0OoOoOo.this.f516o00oOoOO.o00oOo0o()) {
                o0OoOoOo.this.f517o00oOoOo.onPanelClosed(108, o00oooo2);
            } else if (o0OoOoOo.this.f517o00oOoOo.onPreparePanel(0, null, o00oooo2)) {
                o0OoOoOo.this.f517o00oOoOo.onMenuOpened(108, o00oooo2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements AppCompatDelegateImpl.o00oo0O0 {
        public o00oOoO() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o00oo0O0
        public boolean o00oOOo0(int i) {
            if (i == 0) {
                o0OoOoOo o0oooooo = o0OoOoOo.this;
                if (o0oooooo.f519o00oOooo) {
                    return false;
                }
                o0oooooo.f516o00oOoOO.o00oOoO0();
                o0OoOoOo.this.f519o00oOooo = true;
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o00oo0O0
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(o0OoOoOo.this.f516o00oOoOO.getContext());
            }
            return null;
        }
    }

    public o0OoOoOo(@oo0oO0 Toolbar toolbar, @o0OO00OO CharSequence charSequence, @oo0oO0 Window.Callback callback) {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f522o00oo0O = o00ooooo2;
        toolbar.getClass();
        o0OOOO0o o0oooo0o = new o0OOOO0o(toolbar, false);
        this.f516o00oOoOO = o0oooo0o;
        callback.getClass();
        this.f517o00oOoOo = callback;
        o0oooo0o.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(o00ooooo2);
        o0oooo0o.setWindowTitle(charSequence);
        this.f518o00oOoo0 = new o00oOoO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0(View view) {
        o0O00000(view, new o00oOOo0.o00oOOoO(-2, -2));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOo0o(o00oOOo0.o00oOo0O o00ooo0o2) {
        this.f524o00oo0OO.add(o00ooo0o2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoO(o00oOOo0.o00oo00O o00oo00o, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoO0(o00oOOo0.o00oo00O o00oo00o) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoOO(o00oOOo0.o00oo00O o00oo00o, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoOo(o00oOOo0.o00oo00O o00oo00o, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00oOoo0() {
        return this.f516o00oOoOO.o00oOo00();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00oOooo() {
        if (this.f516o00oOoOO.o00oOoOo()) {
            this.f516o00oOoOO.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public CharSequence o00oo() {
        return this.f516o00oOoOO.o00oooO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public View o00oo0() {
        return this.f516o00oOoOO.o00ooOO0();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oo00O(boolean z) {
        if (z == this.f520o00oo0) {
            return;
        }
        this.f520o00oo0 = z;
        int size = this.f524o00oo0OO.size();
        for (int i = 0; i < size; i++) {
            this.f524o00oo0OO.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0O() {
        return this.f516o00oOoOO.getHeight();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public float o00oo0O0() {
        return o0O0o00O.o00oooo(this.f516o00oOoOO.o00oo0o());
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0OO() {
        return this.f516o00oOoOO.o00oooOO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0o() {
        return 0;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0o0() {
        return 0;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0oO() {
        return -1;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooO() {
        this.f516o00oOoOO.setVisibility(8);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00ooO0() {
        return 0;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o00ooO00(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public Context o00ooO0O() {
        return this.f516o00oOoOO.getContext();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public CharSequence o00ooO0o() {
        return this.f516o00oOoOO.getTitle();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOO0() {
        this.f516o00oOoOO.o00oo0o().removeCallbacks(this.f523o00oo0O0);
        o0O0o00O.o0O0oo0O(this.f516o00oOoOO.o00oo0o(), this.f523o00oo0O0);
        return true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOOo() {
        return this.f516o00oOoOO.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o00ooOo() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOo0() {
        return false;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooOoO(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooOoo() {
        this.f516o00oOoOO.o00oo0o().removeCallbacks(this.f523o00oo0O0);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooo0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            o00ooo0O();
        }
        return true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooo00(int i, KeyEvent keyEvent) {
        Menu o0O0O0oO2 = o0O0O0oO();
        if (o0O0O0oO2 != null) {
            o0O0O0oO2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return o0O0O0oO2.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooo0O() {
        return this.f516o00oOoOO.o00oOooO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooo0o() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooO(o00oOOo0.o00oOo0O o00ooo0o2) {
        this.f524o00oo0OO.remove(o00ooo0o2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooOO(o00oOOo0.o00oo00O o00oo00o) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooOo(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooo(o00oOOo0.o00oo00O o00oo00o) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00oooo0() {
        ViewGroup o00oo0o2 = this.f516o00oOoOO.o00oo0o();
        if (o00oo0o2 == null || o00oo0o2.hasFocus()) {
            return false;
        }
        o00oo0o2.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooooO(@o0OO00OO Drawable drawable) {
        this.f516o00oOoOO.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooooo(int i) {
        o0(LayoutInflater.from(this.f516o00oOoOO.getContext()).inflate(i, this.f516o00oOoOO.o00oo0o(), false));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00(int i) {
        this.f516o00oOoOO.o00oo(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    @SuppressLint({"WrongConstant"})
    public void o0O000(int i) {
        o0O000O(i, -1);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00000(View view, o00oOOo0.o00oOOoO o00ooooo2) {
        if (view != null) {
            view.setLayoutParams(o00ooooo2);
        }
        this.f516o00oOoOO.o00oooOo(view);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0000O(boolean z) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0000o(boolean z) {
        o0O000O(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000O(int i, int i2) {
        this.f516o00oOoOO.o00oOooo((i & i2) | ((~i2) & this.f516o00oOoOO.o00oooOO()));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000Oo(boolean z) {
        o0O000O(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000o(float f) {
        o0O0o00O.o0OO000(this.f516o00oOoOO.o00oo0o(), f);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000o0(boolean z) {
        o0O000O(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O(boolean z) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O0(CharSequence charSequence) {
        this.f516o00oOoOO.o00oo00O(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O0o(Drawable drawable) {
        this.f516o00oOoOO.o00oooo(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OO(int i) {
        this.f516o00oOoOO.setIcon(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OOO(Drawable drawable) {
        this.f516o00oOoOO.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00Oo(SpinnerAdapter spinnerAdapter, o00oOOo0.o00oOoO o00oooo2) {
        this.f516o00oOoOO.o00ooo0O(spinnerAdapter, new o0O000(o00oooo2));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OoO(Drawable drawable) {
        this.f516o00oOoOO.o00ooOOo(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00Ooo(int i) {
        if (i == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f516o00oOoOO.o00oo0o0(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o00(int i) {
        if (this.f516o00oOoOO.o00oo0O() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f516o00oOoOO.o00oo0OO(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o0O(boolean z) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o0o(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00oO0(int i) {
        o0O0OOO o0o0ooo = this.f516o00oOoOO;
        o0o0ooo.o00oo0(i != 0 ? o0o0ooo.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0O(CharSequence charSequence) {
        this.f516o00oOoOO.o00oo0(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0Oo(CharSequence charSequence) {
        this.f516o00oOoOO.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0o0() {
        this.f516o00oOoOO.setVisibility(0);
    }

    public final Menu o0O0O0oO() {
        if (!this.f521o00oo00O) {
            this.f516o00oOoOO.o00ooo0(new o00oOo00(), new o00oOo0O());
            this.f521o00oo00O = true;
        }
        return this.f516o00oOoOO.o00oo0O0();
    }

    public void o0O0O0oo() {
        Menu o0O0O0oO2 = o0O0O0oO();
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = o0O0O0oO2 instanceof androidx.appcompat.view.menu.o00oOoO ? (androidx.appcompat.view.menu.o00oOoO) o0O0O0oO2 : null;
        if (o00oooo2 != null) {
            o00oooo2.stopDispatchingItemsChanged();
        }
        try {
            o0O0O0oO2.clear();
            if (!this.f517o00oOoOo.onCreatePanelMenu(0, o0O0O0oO2) || !this.f517o00oOoOo.onPreparePanel(0, null, o0O0O0oO2)) {
                o0O0O0oO2.clear();
            }
        } finally {
            if (o00oooo2 != null) {
                o00oooo2.startDispatchingItemsChanged();
            }
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o0O0o() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0oo0o(CharSequence charSequence) {
        this.f516o00oOoOO.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoO00O(int i) {
        this.f516o00oOoOO.o00ooo00(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoOoOO(boolean z) {
        o0O000O(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoOoOo(boolean z) {
        o0O000O(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0oO0O0o(int i) {
        o0O0OOO o0o0ooo = this.f516o00oOoOO;
        o0o0ooo.setTitle(i != 0 ? o0o0ooo.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0oO0Ooo(int i) {
        this.f516o00oOoOO.setLogo(i);
    }
}
