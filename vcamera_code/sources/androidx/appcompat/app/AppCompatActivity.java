package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.o00oOOoO;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ooo0Oo0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.o0OO;
import androidx.lifecycle.o0OOO0;
import androidx.savedstate.o00oOOo0;
import o00oOoOo.o00oo0;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0oO0Ooo;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o00ooOoo.oO000O0O;
import o00ooOoo.oO00OO;
import o00ooOoo.oO0Oo0o0;
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements o00oOoO, oO0Oo0o0.o00oOOoO, o00oOOoO.o00oOo00 {

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f238o00oooo = "androidx:appcompat";

    /* renamed from: o00oooOo  reason: collision with root package name */
    public o00oo0OO f239o00oooOo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public Resources f240o00oooo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOOo0.o00oOo00 {
        public o00oOOo0() {
        }

        @Override // androidx.savedstate.o00oOOo0.o00oOo00
        @oo0oO0
        public Bundle o00oOOo0() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.o0O000o().o00oooOO(bundle);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOOoO.o00oOo0O {
        public o00oOOoO() {
        }

        @Override // o00oOOoO.o00oOo0O
        public void o00oOOo0(@oo0oO0 Context context) {
            o00oo0OO o0O000o2 = AppCompatActivity.this.o0O000o();
            o0O000o2.o00ooOO0();
            o0O000o2.o00ooo0(AppCompatActivity.this.getSavedStateRegistry().o00oOOoO(AppCompatActivity.f238o00oooo));
        }
    }

    public AppCompatActivity() {
        o0O000oo();
    }

    @o0oO0Ooo
    public AppCompatActivity(@oooOO0 int i) {
        super(i);
        o0O000oo();
    }

    private void o00ooO() {
        o0OO.o00oOOoO(getWindow().getDecorView(), this);
        o0OOO0.o00oOOoO(getWindow().getDecorView(), this);
        androidx.savedstate.o00oOOoO.o00oOOoO(getWindow().getDecorView(), this);
        androidx.activity.o0O000O.o00oOOoO(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o00ooO();
        o0O000o().o00oOooO(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(o0O000o().o00oOoo0(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2 = o0ooOoOO();
        if (getWindow().hasFeature(0)) {
            if (o0ooOoOO2 == null || !o0ooOoOO2.o00oOoo0()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2 = o0ooOoOO();
        if (keyCode == 82 && o0ooOoOO2 != null && o0ooOoOO2.o00ooo0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@oo0OOoo int i) {
        return (T) o0O000o().o00oo0O(i);
    }

    @Override // android.app.Activity
    @oo0oO0
    public MenuInflater getMenuInflater() {
        return o0O000o().o00ooO00();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f240o00oooo0 == null && ooo0Oo0.o00oOooO()) {
            this.f240o00oooo0 = new ooo0Oo0(this, super.getResources());
        }
        Resources resources = this.f240o00oooo0;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        o0O000o().o00ooOO();
    }

    @Override // androidx.appcompat.app.o00oOOoO.o00oOo00
    @o0OO00OO
    public o00oOOoO.InterfaceC0005o00oOOoO o00oOOo0() {
        return o0O000o().o00oo0oO();
    }

    @Override // o00ooOoo.oO0Oo0o0.o00oOOoO
    @o0OO00OO
    public Intent o00oOoOO() {
        return oO00OO.o00oOOo0(this);
    }

    public void o0O00(@oo0oO0 oO0Oo0o0 oo0oo0o0) {
        oo0oo0o0.o00oOo00(this);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void o0O000Oo() {
        o0O000o().o00ooOO();
    }

    @oo0oO0
    public o00oo0OO o0O000o() {
        if (this.f239o00oooOo == null) {
            this.f239o00oooOo = o00oo0OO.o00oOooo(this, this);
        }
        return this.f239o00oooOo;
    }

    public final void o0O000oo() {
        getSavedStateRegistry().o00oOoOo(f238o00oooo, new o00oOOo0());
        o00oOoO0(new o00oOOoO());
    }

    @Deprecated
    public void o0O00O() {
    }

    public void o0O00O0(@oo0oO0 o0O000.o00ooO0 o00ooo02) {
    }

    public void o0O00O0o(@oo0oO0 oO0Oo0o0 oo0oo0o0) {
    }

    public boolean o0O00OO() {
        Intent o00oOoOO2 = o00oOoOO();
        if (o00oOoOO2 != null) {
            if (!o0O00oO0(o00oOoOO2)) {
                o0O00o0o(o00oOoOO2);
                return true;
            }
            oO0Oo0o0 oo0oo0o0 = new oO0Oo0o0(this);
            o0O00(oo0oo0o0);
            o0O00O0o(oo0oo0o0);
            oo0oo0o0.o00oo0OO(null);
            try {
                oO000O0O.o00oOOoO(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public final boolean o0O00OOO(KeyEvent keyEvent) {
        return false;
    }

    public void o0O00Oo(@o0OO00OO Toolbar toolbar) {
        o0O000o().o0ooOoOO(toolbar);
    }

    @Deprecated
    public void o0O00OoO(boolean z) {
    }

    @Deprecated
    public void o0O00Ooo(boolean z) {
    }

    public boolean o0O00o(int i) {
        return o0O000o().o00ooooo(i);
    }

    @Deprecated
    public void o0O00o00(boolean z) {
    }

    @o0OO00OO
    public o00oOoOo.o00oo0 o0O00o0O(@oo0oO0 o00oo0.o00oOOo0 o00oooo02) {
        return o0O000o().o0O00O0(o00oooo02);
    }

    public void o0O00o0o(@oo0oO0 Intent intent) {
        oO00OO.o00oOOo0.o00oOOoO(this, intent);
    }

    public boolean o0O00oO0(@oo0oO0 Intent intent) {
        return oO00OO.o00oOOo0.o00oOo00(this, intent);
    }

    public void o0OoO00O(int i) {
    }

    @Deprecated
    public void o0oO0Ooo(int i) {
    }

    @o0OO00OO
    public androidx.appcompat.app.o00oOOo0 o0ooOoOO() {
        return o0O000o().o00ooO0o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@oo0oO0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o0O000o().o00ooo00(configuration);
        if (this.f240o00oooo0 != null) {
            this.f240o00oooo0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        o0O00O();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o0O000o().o00ooo0O();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (o0O00OOO(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @oo0oO0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2 = o0ooOoOO();
        if (menuItem.getItemId() != 16908332 || o0ooOoOO2 == null || (o0ooOoOO2.o00oo0OO() & 4) == 0) {
            return false;
        }
        return o0O00OO();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @oo0oO0 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@o0OO00OO Bundle bundle) {
        super.onPostCreate(bundle);
        o0O000o().o00ooo0o(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        o0O000o().o00oooO();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        o0O000o().o00oooOo();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        o0O000o().o00oooo0();
    }

    @Override // androidx.appcompat.app.o00oOoO
    @o0O00O0
    public void onSupportActionModeFinished(@oo0oO0 o00oOoOo.o00oo0 o00oo0Var) {
    }

    @Override // androidx.appcompat.app.o00oOoO
    @o0O00O0
    public void onSupportActionModeStarted(@oo0oO0 o00oOoOo.o00oo0 o00oo0Var) {
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        o0O000o().o0O00(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOoO
    @o0OO00OO
    public o00oOoOo.o00oo0 onWindowStartingSupportActionMode(@oo0oO0 o00oo0.o00oOOo0 o00oooo02) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2 = o0ooOoOO();
        if (getWindow().hasFeature(0)) {
            if (o0ooOoOO2 == null || !o0ooOoOO2.o00ooo0O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@oooOO0 int i) {
        o00ooO();
        o0O000o().o0O0000o(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        o00ooO();
        o0O000o().o0O000(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o00ooO();
        o0O000o().o0O000O(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@o0OOO0OO int i) {
        super.setTheme(i);
        o0O000o().o0O000oo(i);
    }
}
