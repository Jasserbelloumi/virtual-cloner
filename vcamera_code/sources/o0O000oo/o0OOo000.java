package o0O000oo;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO00o;
import o0O000oo.o0O0o00O;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public class o0OOo000 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f10752o00oOOoO = "WindowInsetsCompat";
    @o00oOooO.oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0OOo000 f10753o00oOo00;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo f10754o00oOOo0;

    @o00oOooO.o0OOooO0(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Field f10755o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Field f10756o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static Field f10757o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static boolean f10758o00oOooO;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f10755o00oOOo0 = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f10756o00oOOoO = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f10757o00oOo00 = declaredField3;
                declaredField3.setAccessible(true);
                f10758o00oOooO = true;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }

        @o00oOooO.o0OO00OO
        public static o0OOo000 o00oOOo0(@o00oOooO.oo0oO0 View view) {
            if (f10758o00oOooO && view.isAttachedToWindow()) {
                try {
                    Object obj = f10755o00oOOo0.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f10756o00oOOoO.get(obj);
                        Rect rect2 = (Rect) f10757o00oOo00.get(obj);
                        if (rect != null && rect2 != null) {
                            o00oOOoO o00ooooo2 = new o00oOOoO();
                            o00ooooo2.f10759o00oOOo0.o00oOoO0(oOO00o.o00oOo0O(rect));
                            o00ooooo2.f10759o00oOOo0.o00oOoOO(oOO00o.o00oOo0O(rect2));
                            o0OOo000 o00oOOo02 = o00ooooo2.o00oOOo0();
                            o00oOOo02.o00ooOoO(o00oOOo02);
                            o00oOOo02.o00oOooO(view.getRootView());
                            return o00oOOo02;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo00O f10759o00oOOo0;

        public o00oOOoO() {
            int i = Build.VERSION.SDK_INT;
            this.f10759o00oOOo0 = i >= 30 ? new o00oOoO() : i >= 29 ? new o00oOo0O() : new o00oOo00();
        }

        public o00oOOoO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            int i = Build.VERSION.SDK_INT;
            this.f10759o00oOOo0 = i >= 30 ? new o00oOoO(o0ooo000) : i >= 29 ? new o00oOo0O(o0ooo000) : new o00oOo00(o0ooo000);
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOo0() {
            return this.f10759o00oOOo0.o00oOOoO();
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOOoO(@o00oOooO.o0OO00OO o0O000oo.o00oo0OO o00oo0oo) {
            this.f10759o00oOOo0.o00oOo00(o00oo0oo);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOo00(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOooO(i, ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        @Deprecated
        public o00oOOoO o00oOo0O(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOo0o(ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        @Deprecated
        public o00oOOoO o00oOo0o(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOoO0(ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        @Deprecated
        public o00oOOoO o00oOoO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOoOO(ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        @Deprecated
        public o00oOOoO o00oOoO0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOoO(ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        @Deprecated
        public o00oOOoO o00oOoOO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOoOo(ooo00o);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOoOo(int i, boolean z) {
            this.f10759o00oOOo0.o00oOoo0(i, z);
            return this;
        }

        @o00oOooO.oo0oO0
        public o00oOOoO o00oOooO(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10759o00oOOo0.o00oOo0O(i, ooo00o);
            return this;
        }
    }

    @o00oOooO.o0OOooO0(api = 20)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oo00O {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static Field f10760o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static boolean f10761o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static boolean f10762o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static Constructor<WindowInsets> f10763o00oOoO0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public WindowInsets f10764o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oOO00o f10765o00oOooO;

        public o00oOo00() {
            this.f10764o00oOo00 = o00oOooo();
        }

        public o00oOo00(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            super(o0ooo000);
            this.f10764o00oOo00 = o0ooo000.o00ooo00();
        }

        @o00oOooO.o0OO00OO
        private static WindowInsets o00oOooo() {
            if (!f10761o00oOo0o) {
                try {
                    f10760o00oOo0O = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f10761o00oOo0o = true;
            }
            Field field = f10760o00oOo0O;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f10762o00oOoO) {
                try {
                    f10763o00oOoO0 = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f10762o00oOoO = true;
            }
            Constructor<WindowInsets> constructor = f10763o00oOoO0;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOoO() {
            o00oOOo0();
            o0OOo000 o00ooo02 = o0OOo000.o00ooo0(this.f10764o00oOo00);
            o00ooo02.o00ooOo0(this.f10780o00oOOoO);
            o00ooo02.o00ooOoo(this.f10765o00oOooO);
            return o00ooo02;
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoO0(@o00oOooO.o0OO00OO oOO00o ooo00o) {
            this.f10765o00oOooO = ooo00o;
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoOO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            WindowInsets windowInsets = this.f10764o00oOo00;
            if (windowInsets != null) {
                this.f10764o00oOo00 = windowInsets.replaceSystemWindowInsets(ooo00o.f9791o00oOOo0, ooo00o.f9792o00oOOoO, ooo00o.f9793o00oOo00, ooo00o.f9794o00oOooO);
            }
        }
    }

    @o00oOooO.o0OOooO0(api = 29)
    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oo00O {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final WindowInsets$Builder f10766o00oOo00;

        public o00oOo0O() {
            this.f10766o00oOo00 = new WindowInsets$Builder();
        }

        public o00oOo0O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            super(o0ooo000);
            WindowInsets o00ooo002 = o0ooo000.o00ooo00();
            this.f10766o00oOo00 = o00ooo002 != null ? new WindowInsets$Builder(o00ooo002) : new WindowInsets$Builder();
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOoO() {
            o00oOOo0();
            o0OOo000 o00ooo02 = o0OOo000.o00ooo0(this.f10766o00oOo00.build());
            o00ooo02.o00ooOo0(this.f10780o00oOOoO);
            return o00ooo02;
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOo00(@o00oOooO.o0OO00OO o0O000oo.o00oo0OO o00oo0oo) {
            this.f10766o00oOo00.setDisplayCutout(o00oo0oo != null ? o00oo0oo.f10456o00oOOo0 : null);
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOo0o(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setMandatorySystemGestureInsets(ooo00o.o00oOoO());
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setSystemGestureInsets(ooo00o.o00oOoO());
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoO0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setStableInsets(ooo00o.o00oOoO());
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoOO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setSystemWindowInsets(ooo00o.o00oOoO());
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoOo(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setTappableElementInsets(ooo00o.o00oOoO());
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo0O {
        public o00oOoO() {
        }

        public o00oOoO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            super(o0ooo000);
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOo0O(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setInsetsIgnoringVisibility(o00ooO.o00oOOo0(i), ooo00o.o00oOoO());
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOoo0(int i, boolean z) {
            this.f10766o00oOo00.setVisible(o00ooO.o00oOOo0(i), z);
        }

        @Override // o0O000oo.o0OOo000.o00oo00O
        public void o00oOooO(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10766o00oOo00.setInsets(o00ooO.o00oOOo0(i), ooo00o.o00oOoO());
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o0OOo000 f10767o00oOOoO = new o00oOOoO().o00oOOo0().o00oOOo0().o00oOOoO().o00oOo00();

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OOo000 f10768o00oOOo0;

        public o00oo(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            this.f10768o00oOOo0 = o0ooo000;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oo) {
                o00oo o00ooVar = (o00oo) obj;
                return o00oo0O0() == o00ooVar.o00oo0O0() && o00oo0OO() == o00ooVar.o00oo0OO() && oO0Ooooo.o00oOOo0.o00oOOo0(o00oOooo(), o00ooVar.o00oOooo()) && oO0Ooooo.o00oOOo0.o00oOOo0(o00oOoOo(), o00ooVar.o00oOoOo()) && oO0Ooooo.o00oOOo0.o00oOOo0(o00oOo0o(), o00ooVar.o00oOo0o());
            }
            return false;
        }

        public int hashCode() {
            return oO0Ooooo.o00oOOo0.o00oOOoO(Boolean.valueOf(o00oo0O0()), Boolean.valueOf(o00oo0OO()), o00oOooo(), o00oOoOo(), o00oOo0o());
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOo0() {
            return this.f10768o00oOOo0;
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOoO() {
            return this.f10768o00oOOo0;
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oOo00() {
            return this.f10768o00oOOo0;
        }

        public void o00oOo0O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
        }

        @o00oOooO.o0OO00OO
        public o0O000oo.o00oo0OO o00oOo0o() {
            return null;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOoO(int i) {
            if ((i & 8) == 0) {
                return oOO00o.f9790o00oOo0O;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOoO0(int i) {
            return oOO00o.f9790o00oOo0O;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOoOO() {
            return o00oOooo();
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOoOo() {
            return oOO00o.f9790o00oOo0O;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOoo0() {
            return o00oOooo();
        }

        public void o00oOooO(@o00oOooO.oo0oO0 View view) {
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oOooo() {
            return oOO00o.f9790o00oOo0O;
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oo0(int i, int i2, int i3, int i4) {
            return f10767o00oOOoO;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oo00O() {
            return o00oOooo();
        }

        public boolean o00oo0O(int i) {
            return true;
        }

        public boolean o00oo0O0() {
            return false;
        }

        public boolean o00oo0OO() {
            return false;
        }

        public void o00oo0Oo(oOO00o[] ooo00oArr) {
        }

        public void o00oo0o(@o00oOooO.o0OO00OO o0OOo000 o0ooo000) {
        }

        public void o00oo0o0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oo0oO(oOO00o ooo00o) {
        }
    }

    @o00oOooO.o0OOooO0(20)
    /* loaded from: classes.dex */
    public static class o00oo0 extends o00oo {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static boolean f10769o00oOoO;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static Method f10770o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static Class<?> f10771o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static Field f10772o00oOoo0;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static Field f10773o00oOooo;
        @o00oOooO.oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final WindowInsets f10774o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public oOO00o f10775o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public o0OOo000 f10776o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public oOO00o f10777o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oOO00o[] f10778o00oOooO;

        public o00oo0(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            super(o0ooo000);
            this.f10775o00oOo0O = null;
            this.f10774o00oOo00 = windowInsets;
        }

        public o00oo0(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o00oo0 o00oo0Var) {
            this(o0ooo000, new WindowInsets(o00oo0Var.f10774o00oOo00));
        }

        @o00oOooO.o0OO00OO
        private oOO00o o00ooO0(@o00oOooO.oo0oO0 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f10769o00oOoO) {
                    o00ooO0o();
                }
                Method method = f10770o00oOoOO;
                if (method != null && f10771o00oOoOo != null && f10772o00oOoo0 != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f10772o00oOoo0.get(f10773o00oOooo.get(invoke));
                        if (rect != null) {
                            return oOO00o.o00oOo0O(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private oOO00o o00ooO00() {
            o0OOo000 o0ooo000 = this.f10776o00oOo0o;
            return o0ooo000 != null ? o0ooo000.o00oo00O() : oOO00o.f9790o00oOo0O;
        }

        @SuppressLint({"PrivateApi"})
        private static void o00ooO0o() {
            try {
                f10770o00oOoOO = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f10771o00oOoOo = cls;
                f10772o00oOoo0 = cls.getDeclaredField("mVisibleInsets");
                f10773o00oOooo = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f10772o00oOoo0.setAccessible(true);
                f10773o00oOooo.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            f10769o00oOoO = true;
        }

        @o00oOooO.oo0oO0
        @SuppressLint({"WrongConstant"})
        private oOO00o o0O0o(int i, boolean z) {
            oOO00o ooo00o = oOO00o.f9790o00oOo0O;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    ooo00o = oOO00o.o00oOOoO(ooo00o, o00oo(i2, z));
                }
            }
            return ooo00o;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f10777o00oOoO0, ((o00oo0) obj).f10777o00oOoO0);
            }
            return false;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oOo0O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            o0ooo000.o00ooOoO(this.f10776o00oOo0o);
            o0ooo000.o00ooOo(this.f10777o00oOoO0);
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoO(int i) {
            return o0O0o(i, true);
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoO0(int i) {
            return o0O0o(i, false);
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oOooO(@o00oOooO.oo0oO0 View view) {
            oOO00o o00ooO02 = o00ooO0(view);
            if (o00ooO02 == null) {
                o00ooO02 = oOO00o.f9790o00oOo0O;
            }
            o00oo0o0(o00ooO02);
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public final oOO00o o00oOooo() {
            if (this.f10775o00oOo0O == null) {
                this.f10775o00oOo0O = oOO00o.o00oOooO(this.f10774o00oOo00.getSystemWindowInsetLeft(), this.f10774o00oOo00.getSystemWindowInsetTop(), this.f10774o00oOo00.getSystemWindowInsetRight(), this.f10774o00oOo00.getSystemWindowInsetBottom());
            }
            return this.f10775o00oOo0O;
        }

        @o00oOooO.oo0oO0
        public oOO00o o00oo(int i, boolean z) {
            oOO00o o00oo00O2;
            int i2;
            if (i == 1) {
                return z ? oOO00o.o00oOooO(0, Math.max(o00ooO00().f9792o00oOOoO, o00oOooo().f9792o00oOOoO), 0, 0) : oOO00o.o00oOooO(0, o00oOooo().f9792o00oOOoO, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    oOO00o o00ooO002 = o00ooO00();
                    oOO00o o00oOoOo2 = o00oOoOo();
                    return oOO00o.o00oOooO(Math.max(o00ooO002.f9791o00oOOo0, o00oOoOo2.f9791o00oOOo0), 0, Math.max(o00ooO002.f9793o00oOo00, o00oOoOo2.f9793o00oOo00), Math.max(o00ooO002.f9794o00oOooO, o00oOoOo2.f9794o00oOooO));
                }
                oOO00o o00oOooo2 = o00oOooo();
                o0OOo000 o0ooo000 = this.f10776o00oOo0o;
                o00oo00O2 = o0ooo000 != null ? o0ooo000.o00oo00O() : null;
                int i3 = o00oOooo2.f9794o00oOooO;
                if (o00oo00O2 != null) {
                    i3 = Math.min(i3, o00oo00O2.f9794o00oOooO);
                }
                return oOO00o.o00oOooO(o00oOooo2.f9791o00oOOo0, 0, o00oOooo2.f9793o00oOo00, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return oOO00o.f9790o00oOo0O;
                            }
                            o0OOo000 o0ooo0002 = this.f10776o00oOo0o;
                            o0O000oo.o00oo0OO o00oOo0O2 = o0ooo0002 != null ? o0ooo0002.o00oOo0O() : o00oOo0o();
                            return o00oOo0O2 != null ? oOO00o.o00oOooO(o00oOo0O2.o00oOooO(), o00oOo0O2.o00oOo0o(), o00oOo0O2.o00oOo0O(), o00oOo0O2.o00oOo00()) : oOO00o.f9790o00oOo0O;
                        }
                        return o00oo00O();
                    }
                    return o00oOoOO();
                }
                return o00oOoo0();
            } else {
                oOO00o[] ooo00oArr = this.f10778o00oOooO;
                o00oo00O2 = ooo00oArr != null ? ooo00oArr[o00ooO0.o00oOo0O(8)] : null;
                if (o00oo00O2 != null) {
                    return o00oo00O2;
                }
                oOO00o o00oOooo3 = o00oOooo();
                oOO00o o00ooO003 = o00ooO00();
                int i4 = o00oOooo3.f9794o00oOooO;
                if (i4 > o00ooO003.f9794o00oOooO) {
                    return oOO00o.o00oOooO(0, 0, 0, i4);
                }
                oOO00o ooo00o = this.f10777o00oOoO0;
                return (ooo00o == null || ooo00o.equals(oOO00o.f9790o00oOo0O) || (i2 = this.f10777o00oOoO0.f9794o00oOooO) <= o00ooO003.f9794o00oOooO) ? oOO00o.f9790o00oOo0O : oOO00o.o00oOooO(0, 0, 0, i2);
            }
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public o0OOo000 o00oo0(int i, int i2, int i3, int i4) {
            o00oOOoO o00ooooo2 = new o00oOOoO(o0OOo000.o00ooo0(this.f10774o00oOo00));
            o00ooooo2.o00oOoO(o0OOo000.o00ooO0O(o00oOooo(), i, i2, i3, i4));
            o00ooooo2.o00oOo0o(o0OOo000.o00ooO0O(o00oOoOo(), i, i2, i3, i4));
            return o00ooooo2.o00oOOo0();
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @SuppressLint({"WrongConstant"})
        public boolean o00oo0O(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !o00ooO0O(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public boolean o00oo0O0() {
            return this.f10774o00oOo00.isRound();
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oo0Oo(oOO00o[] ooo00oArr) {
            this.f10778o00oOooO = ooo00oArr;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oo0o(@o00oOooO.o0OO00OO o0OOo000 o0ooo000) {
            this.f10776o00oOo0o = o0ooo000;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oo0o0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
            this.f10777o00oOoO0 = ooo00o;
        }

        public boolean o00ooO0O(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !o00oo(i, false).equals(oOO00o.f9790o00oOo0O);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OOo000 f10779o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public oOO00o[] f10780o00oOOoO;

        public o00oo00O() {
            this(new o0OOo000((o0OOo000) null));
        }

        public o00oo00O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
            this.f10779o00oOOo0 = o0ooo000;
        }

        public final void o00oOOo0() {
            oOO00o[] ooo00oArr = this.f10780o00oOOoO;
            if (ooo00oArr != null) {
                oOO00o ooo00o = ooo00oArr[o00ooO0.o00oOo0O(1)];
                oOO00o ooo00o2 = this.f10780o00oOOoO[o00ooO0.o00oOo0O(2)];
                if (ooo00o2 == null) {
                    ooo00o2 = this.f10779o00oOOo0.o00oOo0o(2);
                }
                if (ooo00o == null) {
                    ooo00o = this.f10779o00oOOo0.o00oOo0o(1);
                }
                o00oOoOO(oOO00o.o00oOOoO(ooo00o, ooo00o2));
                oOO00o ooo00o3 = this.f10780o00oOOoO[o00ooO0.o00oOo0O(16)];
                if (ooo00o3 != null) {
                    o00oOoO(ooo00o3);
                }
                oOO00o ooo00o4 = this.f10780o00oOOoO[o00ooO0.o00oOo0O(32)];
                if (ooo00o4 != null) {
                    o00oOo0o(ooo00o4);
                }
                oOO00o ooo00o5 = this.f10780o00oOOoO[o00ooO0.o00oOo0O(64)];
                if (ooo00o5 != null) {
                    o00oOoOo(ooo00o5);
                }
            }
        }

        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOoO() {
            o00oOOo0();
            return this.f10779o00oOOo0;
        }

        public void o00oOo00(@o00oOooO.o0OO00OO o0O000oo.o00oo0OO o00oo0oo) {
        }

        public void o00oOo0O(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void o00oOo0o(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oOoO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oOoO0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oOoOO(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oOoOo(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        }

        public void o00oOoo0(int i, boolean z) {
        }

        public void o00oOooO(int i, @o00oOooO.oo0oO0 oOO00o ooo00o) {
            if (this.f10780o00oOOoO == null) {
                this.f10780o00oOOoO = new oOO00o[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f10780o00oOOoO[o00ooO0.o00oOo0O(i2)] = ooo00o;
                }
            }
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oo0O extends o00oo0O0 {

        /* renamed from: o00oo0  reason: collision with root package name */
        public oOO00o f10781o00oo0;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public oOO00o f10782o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public oOO00o f10783o00oo0OO;

        public o00oo0O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            super(o0ooo000, windowInsets);
            this.f10781o00oo0 = null;
            this.f10783o00oo0OO = null;
            this.f10782o00oo0O0 = null;
        }

        public o00oo0O(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o00oo0O o00oo0o2) {
            super(o0ooo000, o00oo0o2);
            this.f10781o00oo0 = null;
            this.f10783o00oo0OO = null;
            this.f10782o00oo0O0 = null;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoOO() {
            Insets mandatorySystemGestureInsets;
            if (this.f10783o00oo0OO == null) {
                mandatorySystemGestureInsets = this.f10774o00oOo00.getMandatorySystemGestureInsets();
                this.f10783o00oo0OO = oOO00o.o00oOoO0(mandatorySystemGestureInsets);
            }
            return this.f10783o00oo0OO;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoo0() {
            Insets systemGestureInsets;
            if (this.f10781o00oo0 == null) {
                systemGestureInsets = this.f10774o00oOo00.getSystemGestureInsets();
                this.f10781o00oo0 = oOO00o.o00oOoO0(systemGestureInsets);
            }
            return this.f10781o00oo0;
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public o0OOo000 o00oo0(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f10774o00oOo00.inset(i, i2, i3, i4);
            return o0OOo000.o00ooo0(inset);
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oo00O() {
            Insets tappableElementInsets;
            if (this.f10782o00oo0O0 == null) {
                tappableElementInsets = this.f10774o00oOo00.getTappableElementInsets();
                this.f10782o00oo0O0 = oOO00o.o00oOoO0(tappableElementInsets);
            }
            return this.f10782o00oo0O0;
        }

        @Override // o0O000oo.o0OOo000.o00oo0OO, o0O000oo.o0OOo000.o00oo
        public void o00oo0oO(@o00oOooO.o0OO00OO oOO00o ooo00o) {
        }
    }

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o00oo0OO {
        public o00oo0O0(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            super(o0ooo000, windowInsets);
        }

        public o00oo0O0(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o00oo0O0 o00oo0o02) {
            super(o0ooo000, o00oo0o02);
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oo0O0) {
                o00oo0O0 o00oo0o02 = (o00oo0O0) obj;
                return Objects.equals(this.f10774o00oOo00, o00oo0o02.f10774o00oOo00) && Objects.equals(this.f10777o00oOoO0, o00oo0o02.f10777o00oOoO0);
            }
            return false;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public int hashCode() {
            return this.f10774o00oOo00.hashCode();
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOo0() {
            return o0OOo000.o00ooo0(this.f10774o00oOo00.consumeDisplayCutout());
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.o0OO00OO
        public o0O000oo.o00oo0OO o00oOo0o() {
            return o0O000oo.o00oo0OO.o00oOoOO(this.f10774o00oOo00.getDisplayCutout());
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oo0OO extends o00oo0 {

        /* renamed from: o00oo00O  reason: collision with root package name */
        public oOO00o f10784o00oo00O;

        public o00oo0OO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            super(o0ooo000, windowInsets);
            this.f10784o00oo00O = null;
        }

        public o00oo0OO(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o00oo0OO o00oo0oo) {
            super(o0ooo000, o00oo0oo);
            this.f10784o00oo00O = null;
            this.f10784o00oo00O = o00oo0oo.f10784o00oo00O;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public o0OOo000 o00oOOoO() {
            return o0OOo000.o00ooo0(this.f10774o00oOo00.consumeStableInsets());
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public o0OOo000 o00oOo00() {
            return o0OOo000.o00ooo0(this.f10774o00oOo00.consumeSystemWindowInsets());
        }

        @Override // o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public final oOO00o o00oOoOo() {
            if (this.f10784o00oo00O == null) {
                this.f10784o00oo00O = oOO00o.o00oOooO(this.f10774o00oOo00.getStableInsetLeft(), this.f10774o00oOo00.getStableInsetTop(), this.f10774o00oOo00.getStableInsetRight(), this.f10774o00oOo00.getStableInsetBottom());
            }
            return this.f10784o00oo00O;
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public boolean o00oo0OO() {
            return this.f10774o00oOo00.isConsumed();
        }

        @Override // o0O000oo.o0OOo000.o00oo
        public void o00oo0oO(@o00oOooO.o0OO00OO oOO00o ooo00o) {
            this.f10784o00oo00O = ooo00o;
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static final class o00ooO {
        private o00ooO() {
        }

        public static int o00oOOo0(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets$Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets$Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets$Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets$Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets$Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets$Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets$Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00ooO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f10785o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f10786o00oOOoO = 1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10787o00oOo00 = 2;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f10788o00oOo0O = 8;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f10789o00oOo0o = 16;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f10790o00oOoO = 64;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f10791o00oOoO0 = 32;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f10792o00oOoOO = 128;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f10793o00oOoOo = 256;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f10794o00oOoo0 = 9;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10795o00oOooO = 4;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f10796o00oOooo = 256;

        @Retention(RetentionPolicy.SOURCE)
        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        @SuppressLint({"WrongConstant"})
        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public static int o00oOOo0() {
            return -1;
        }

        public static int o00oOOoO() {
            return 4;
        }

        public static int o00oOo00() {
            return 128;
        }

        public static int o00oOo0O(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("type needs to be >= FIRST and <= LAST, type=", i));
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int o00oOo0o() {
            return 32;
        }

        public static int o00oOoO() {
            return 1;
        }

        public static int o00oOoO0() {
            return 2;
        }

        public static int o00oOoOO() {
            return 7;
        }

        public static int o00oOoOo() {
            return 16;
        }

        public static int o00oOoo0() {
            return 64;
        }

        public static int o00oOooO() {
            return 8;
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o0O0o extends o00oo0O {
        @o00oOooO.oo0oO0

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final o0OOo000 f10797o00oo0O = o0OOo000.o00ooo0(WindowInsets.CONSUMED);

        public o0O0o(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 WindowInsets windowInsets) {
            super(o0ooo000, windowInsets);
        }

        public o0O0o(@o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 o0O0o o0o0o) {
            super(o0ooo000, o0o0o);
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoO(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f10774o00oOo00.getInsetsIgnoringVisibility(o00ooO.o00oOOo0(i));
            return oOO00o.o00oOoO0(insetsIgnoringVisibility);
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        @o00oOooO.oo0oO0
        public oOO00o o00oOoO0(int i) {
            Insets insets;
            insets = this.f10774o00oOo00.getInsets(o00ooO.o00oOOo0(i));
            return oOO00o.o00oOoO0(insets);
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        public final void o00oOooO(@o00oOooO.oo0oO0 View view) {
        }

        @Override // o0O000oo.o0OOo000.o00oo0, o0O000oo.o0OOo000.o00oo
        public boolean o00oo0O(int i) {
            boolean isVisible;
            isVisible = this.f10774o00oOo00.isVisible(o00ooO.o00oOOo0(i));
            return isVisible;
        }
    }

    static {
        f10753o00oOo00 = Build.VERSION.SDK_INT >= 30 ? o0O0o.f10797o00oo0O : o00oo.f10767o00oOOoO;
    }

    @o00oOooO.o0OOooO0(20)
    public o0OOo000(@o00oOooO.oo0oO0 WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f10754o00oOOo0 = i >= 30 ? new o0O0o(this, windowInsets) : i >= 29 ? new o00oo0O(this, windowInsets) : new o00oo0O0(this, windowInsets);
    }

    public o0OOo000(@o00oOooO.o0OO00OO o0OOo000 o0ooo000) {
        if (o0ooo000 == null) {
            this.f10754o00oOOo0 = new o00oo(this);
            return;
        }
        o00oo o00ooVar = o0ooo000.f10754o00oOOo0;
        int i = Build.VERSION.SDK_INT;
        this.f10754o00oOOo0 = (i < 30 || !(o00ooVar instanceof o0O0o)) ? (i < 29 || !(o00ooVar instanceof o00oo0O)) ? o00ooVar instanceof o00oo0O0 ? new o00oo0O0(this, (o00oo0O0) o00ooVar) : o00ooVar instanceof o00oo0OO ? new o00oo0OO(this, (o00oo0OO) o00ooVar) : o00ooVar instanceof o00oo0 ? new o00oo0(this, (o00oo0) o00ooVar) : new o00oo(this) : new o00oo0O(this, (o00oo0O) o00ooVar) : new o0O0o(this, (o0O0o) o00ooVar);
        o00ooVar.o00oOo0O(this);
    }

    public static oOO00o o00ooO0O(@o00oOooO.oo0oO0 oOO00o ooo00o, int i, int i2, int i3, int i4) {
        int max = Math.max(0, ooo00o.f9791o00oOOo0 - i);
        int max2 = Math.max(0, ooo00o.f9792o00oOOoO - i2);
        int max3 = Math.max(0, ooo00o.f9793o00oOo00 - i3);
        int max4 = Math.max(0, ooo00o.f9794o00oOooO - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? ooo00o : oOO00o.o00oOooO(max, max2, max3, max4);
    }

    @o00oOooO.o0OOooO0(20)
    @o00oOooO.oo0oO0
    public static o0OOo000 o00ooo0(@o00oOooO.oo0oO0 WindowInsets windowInsets) {
        return o00ooo0O(windowInsets, null);
    }

    @o00oOooO.o0OOooO0(20)
    @o00oOooO.oo0oO0
    public static o0OOo000 o00ooo0O(@o00oOooO.oo0oO0 WindowInsets windowInsets, @o00oOooO.o0OO00OO View view) {
        windowInsets.getClass();
        o0OOo000 o0ooo000 = new o0OOo000(windowInsets);
        if (view != null && o0O0o00O.o0O0OOoo(view)) {
            o0ooo000.o00ooOoO(o0O0o00O.o00ooO.o00oOOo0(view));
            o0ooo000.o00oOooO(view.getRootView());
        }
        return o0ooo000;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OOo000) {
            return oO0Ooooo.o00oOOo0.o00oOOo0(this.f10754o00oOOo0, ((o0OOo000) obj).f10754o00oOOo0);
        }
        return false;
    }

    public int hashCode() {
        o00oo o00ooVar = this.f10754o00oOOo0;
        if (o00ooVar == null) {
            return 0;
        }
        return o00ooVar.hashCode();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public o0OOo000 o00oOOo0() {
        return this.f10754o00oOOo0.o00oOOo0();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public o0OOo000 o00oOOoO() {
        return this.f10754o00oOOo0.o00oOOoO();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public o0OOo000 o00oOo00() {
        return this.f10754o00oOOo0.o00oOo00();
    }

    @o00oOooO.o0OO00OO
    public o0O000oo.o00oo0OO o00oOo0O() {
        return this.f10754o00oOOo0.o00oOo0o();
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOo0o(int i) {
        return this.f10754o00oOOo0.o00oOoO0(i);
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public oOO00o o00oOoO() {
        return this.f10754o00oOOo0.o00oOoOO();
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOoO0(int i) {
        return this.f10754o00oOOo0.o00oOoO(i);
    }

    @Deprecated
    public int o00oOoOO() {
        return this.f10754o00oOOo0.o00oOoOo().f9794o00oOooO;
    }

    @Deprecated
    public int o00oOoOo() {
        return this.f10754o00oOOo0.o00oOoOo().f9791o00oOOo0;
    }

    @Deprecated
    public int o00oOoo0() {
        return this.f10754o00oOOo0.o00oOoOo().f9793o00oOo00;
    }

    public void o00oOooO(@o00oOooO.oo0oO0 View view) {
        this.f10754o00oOOo0.o00oOooO(view);
    }

    @Deprecated
    public int o00oOooo() {
        return this.f10754o00oOOo0.o00oOoOo().f9792o00oOOoO;
    }

    @Deprecated
    public boolean o00oo() {
        return !this.f10754o00oOOo0.o00oOooo().equals(oOO00o.f9790o00oOo0O);
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public oOO00o o00oo0() {
        return this.f10754o00oOOo0.o00oOoo0();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public oOO00o o00oo00O() {
        return this.f10754o00oOOo0.o00oOoOo();
    }

    @Deprecated
    public int o00oo0O() {
        return this.f10754o00oOOo0.o00oOooo().f9793o00oOo00;
    }

    @Deprecated
    public int o00oo0O0() {
        return this.f10754o00oOOo0.o00oOooo().f9791o00oOOo0;
    }

    @Deprecated
    public int o00oo0OO() {
        return this.f10754o00oOOo0.o00oOooo().f9794o00oOooO;
    }

    @Deprecated
    public int o00oo0Oo() {
        return this.f10754o00oOOo0.o00oOooo().f9792o00oOOoO;
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public oOO00o o00oo0o() {
        return this.f10754o00oOOo0.o00oo00O();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public oOO00o o00oo0o0() {
        return this.f10754o00oOOo0.o00oOooo();
    }

    public boolean o00oo0oO() {
        oOO00o o00oOo0o2 = o00oOo0o(-1);
        oOO00o ooo00o = oOO00o.f9790o00oOo0O;
        return (o00oOo0o2.equals(ooo00o) && o00oOoO0(-9).equals(ooo00o) && o00oOo0O() == null) ? false : true;
    }

    public boolean o00ooO() {
        return this.f10754o00oOOo0.o00oo0O0();
    }

    @o00oOooO.oo0oO0
    public o0OOo000 o00ooO0(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        return o00ooO00(ooo00o.f9791o00oOOo0, ooo00o.f9792o00oOOoO, ooo00o.f9793o00oOo00, ooo00o.f9794o00oOooO);
    }

    @o00oOooO.oo0oO0
    public o0OOo000 o00ooO00(@o00oOooO.o0O0o00O(from = 0) int i, @o00oOooO.o0O0o00O(from = 0) int i2, @o00oOooO.o0O0o00O(from = 0) int i3, @o00oOooO.o0O0o00O(from = 0) int i4) {
        return this.f10754o00oOOo0.o00oo0(i, i2, i3, i4);
    }

    public boolean o00ooO0o() {
        return this.f10754o00oOOo0.o00oo0OO();
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public o0OOo000 o00ooOO(int i, int i2, int i3, int i4) {
        o00oOOoO o00ooooo2 = new o00oOOoO(this);
        o00ooooo2.f10759o00oOOo0.o00oOoOO(oOO00o.o00oOooO(i, i2, i3, i4));
        return o00ooooo2.o00oOOo0();
    }

    public boolean o00ooOO0(int i) {
        return this.f10754o00oOOo0.o00oo0O(i);
    }

    @o00oOooO.oo0oO0
    @Deprecated
    public o0OOo000 o00ooOOo(@o00oOooO.oo0oO0 Rect rect) {
        o00oOOoO o00ooooo2 = new o00oOOoO(this);
        o00ooooo2.f10759o00oOOo0.o00oOoOO(oOO00o.o00oOo0O(rect));
        return o00ooooo2.o00oOOo0();
    }

    public void o00ooOo(@o00oOooO.oo0oO0 oOO00o ooo00o) {
        this.f10754o00oOOo0.o00oo0o0(ooo00o);
    }

    public void o00ooOo0(oOO00o[] ooo00oArr) {
        this.f10754o00oOOo0.o00oo0Oo(ooo00oArr);
    }

    public void o00ooOoO(@o00oOooO.o0OO00OO o0OOo000 o0ooo000) {
        this.f10754o00oOOo0.o00oo0o(o0ooo000);
    }

    public void o00ooOoo(@o00oOooO.o0OO00OO oOO00o ooo00o) {
        this.f10754o00oOOo0.o00oo0oO(ooo00o);
    }

    @o00oOooO.o0OOooO0(20)
    @o00oOooO.o0OO00OO
    public WindowInsets o00ooo00() {
        o00oo o00ooVar = this.f10754o00oOOo0;
        if (o00ooVar instanceof o00oo0) {
            return ((o00oo0) o00ooVar).f10774o00oOo00;
        }
        return null;
    }

    @Deprecated
    public boolean o0O0o() {
        return !this.f10754o00oOOo0.o00oOoOo().equals(oOO00o.f9790o00oOo0O);
    }
}
