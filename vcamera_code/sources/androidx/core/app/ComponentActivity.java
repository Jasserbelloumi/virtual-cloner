package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.o00ooO0;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O0O0O;
import androidx.lifecycle.o0O0oo0o;
import androidx.lifecycle.oooOO0;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
import o0O000oo.o0O0000O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements o0O0O0O, o0O0000O.o00oOOo0 {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00ooO0<Class<? extends o00oOOo0>, o00oOOo0> f2319o00oo0O0 = new o00ooO0<>();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O0oo0o f2318o00oo0O = new o0O0oo0o(this);

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static boolean o0O0o(@o0OO00OO String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Build.VERSION.SDK_INT >= 31;
            case 1:
            case 2:
                return o0O000.o00oOOo0.o00oOoo0();
            case 3:
                return Build.VERSION.SDK_INT >= 29;
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o0O0000O.o00oOooO(decorView, keyEvent)) {
            return o0O0000O.o00oOo0O(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o0O0000O.o00oOooO(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @oo0oO0
    public o0O00 getLifecycle() {
        return this.f2318o00oo0O;
    }

    @Override // o0O000oo.o0O0000O.o00oOOo0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOoOo(@oo0oO0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0o(o00oOOo0 o00oooo02) {
        this.f2319o00oo0O0.put(o00oooo02.getClass(), o00oooo02);
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public <T extends o00oOOo0> T o00oo0o0(Class<T> cls) {
        return (T) this.f2319o00oo0O0.get(cls);
    }

    public final boolean o00oo0oO(@o0OO00OO String[] strArr) {
        return !o0O0o(strArr);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        oooOO0.o00oOoO0(this);
    }

    @Override // android.app.Activity
    @o0O00O0
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        this.f2318o00oo0O.o00oo0(o0O00.o00oOOoO.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
