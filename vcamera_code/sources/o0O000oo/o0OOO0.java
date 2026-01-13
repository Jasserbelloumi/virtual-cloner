package o0O000oo;

import android.os.Build;
import android.view.View;
import android.view.Window;
import o0OoOoOO.o0OO000o;
/* loaded from: classes.dex */
public final class o0OOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10711o00oOOo0 = 8;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10712o00oOOoO = 9;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10713o00oOo00 = 10;

    @o00oOooO.o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | o0OO000o.o00oOOoO.f16831o00oOo0o);
        }
    }

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static <T> T o00oOOo0(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @o00oOooO.oo0oO0
    public static oO000O0 o00oOOo0(@o00oOooO.oo0oO0 Window window, @o00oOooO.oo0oO0 View view) {
        return new oO000O0(window, view);
    }

    @o00oOooO.oo0oO0
    public static <T extends View> T o00oOOoO(@o00oOooO.oo0oO0 Window window, @o00oOooO.oo0OOoo int i) {
        return (T) o00oOOoO.o00oOOo0(window, i);
    }

    public static void o00oOo00(@o00oOooO.oo0oO0 Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            o00oOo00.o00oOOo0(window, z);
        } else {
            o00oOOo0.o00oOOo0(window, z);
        }
    }
}
