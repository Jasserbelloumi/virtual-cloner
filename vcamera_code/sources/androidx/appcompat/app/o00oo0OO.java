package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.o0;
import androidx.appcompat.app.o00oOOoO;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ooo0Oo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import o00oOoOo.o00oo0;
import o00oOooO.o0O00O0;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
/* loaded from: classes.dex */
public abstract class o00oo0OO {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f402o00oo = 2;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f403o00oo0O = "AppCompatDelegate";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final boolean f404o00oo0O0 = false;
    @Deprecated

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f406o00oo0o = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f407o00oo0o0 = -1;
    @Deprecated

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f408o00oo0oO = 0;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f410o00ooO0 = -100;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f411o00ooO00 = 3;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f419o00ooOoO = 108;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f420o00ooOoo = 109;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f421o00ooo00 = 10;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f422o0O0o = 1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static o0.o00oOOo0 f405o00oo0Oo = new o0.o00oOOo0(new o0.o00oOOoO());

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static int f412o00ooO0O = -100;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static o0O000.o00ooO0 f413o00ooO0o = null;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static o0O000.o00ooO0 f409o00ooO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static Boolean f415o00ooOO0 = null;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static boolean f414o00ooOO = false;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final androidx.collection.o00oOo00<WeakReference<o00oo0OO>> f416o00ooOOo = new androidx.collection.o00oOo00<>();

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final Object f418o00ooOo0 = new Object();

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final Object f417o00ooOo = new Object();

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static LocaleList o00oOOo0(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static LocaleList o00oOOo0(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    @o0o0000
    public static void o0() {
        f413o00ooO0o = null;
        f409o00ooO = null;
    }

    public static void o00oOo00(@oo0oO0 o00oo0OO o00oo0oo) {
        synchronized (f418o00ooOo0) {
            o00ooooO(o00oo0oo);
            f416o00ooOOo.add(new WeakReference<>(o00oo0oo));
        }
    }

    public static void o00oOoO() {
        Iterator<WeakReference<o00oo0OO>> it = f416o00ooOOo.iterator();
        while (it.hasNext()) {
            o00oo0OO o00oo0oo = it.next().get();
            if (o00oo0oo != null) {
                o00oo0oo.o00oOo0O();
            }
        }
    }

    public static void o00oOoO0() {
        synchronized (f418o00ooOo0) {
            Iterator<WeakReference<o00oo0OO>> it = f416o00ooOOo.iterator();
            while (it.hasNext()) {
                o00oo0OO o00oo0oo = it.next().get();
                if (o00oo0oo != null) {
                    o00oo0oo.o00oOo0o();
                }
            }
        }
    }

    @oo0oO0
    public static o00oo0OO o00oOooo(@oo0oO0 Activity activity, @o0OO00OO o00oOoO o00oooo2) {
        return new AppCompatDelegateImpl(activity, null, o00oooo2, activity);
    }

    @o0OOooO0(33)
    public static Object o00oo() {
        Context o00oo0o02;
        Iterator<WeakReference<o00oo0OO>> it = f416o00ooOOo.iterator();
        while (it.hasNext()) {
            o00oo0OO o00oo0oo = it.next().get();
            if (o00oo0oo != null && (o00oo0o02 = o00oo0oo.o00oo0o0()) != null) {
                return o00oo0o02.getSystemService("locale");
            }
        }
        return null;
    }

    @oo0oO0
    public static o00oo0OO o00oo0(@oo0oO0 Context context, @oo0oO0 Activity activity, @o0OO00OO o00oOoO o00oooo2) {
        return new AppCompatDelegateImpl(context, null, o00oooo2, activity);
    }

    @oo0oO0
    public static o00oo0OO o00oo00O(@oo0oO0 Dialog dialog, @o0OO00OO o00oOoO o00oooo2) {
        return new AppCompatDelegateImpl(dialog, o00oooo2);
    }

    @oo0oO0
    public static o00oo0OO o00oo0OO(@oo0oO0 Context context, @oo0oO0 Window window, @o0OO00OO o00oOoO o00oooo2) {
        return new AppCompatDelegateImpl(context, window, o00oooo2, context);
    }

    @oo0oO0
    @o00oOooO.o0O000O
    public static o0O000.o00ooO0 o00oo0Oo() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object o00oo2 = o00oo();
            if (o00oo2 != null) {
                return o0O000.o00ooO0.o00oo0OO(o00oOOoO.o00oOOo0(o00oo2));
            }
        } else {
            o0O000.o00ooO0 o00ooo02 = f413o00ooO0o;
            if (o00ooo02 != null) {
                return o00ooo02;
            }
        }
        return o0O000.o00ooO0.o00oOoO0();
    }

    public static int o00oo0o() {
        return f412o00ooO0O;
    }

    @o0OO00OO
    public static o0O000.o00ooO0 o00ooO0() {
        return f413o00ooO0o;
    }

    @o0OO00OO
    public static o0O000.o00ooO0 o00ooO0O() {
        return f409o00ooO;
    }

    public static boolean o00ooOOo(Context context) {
        if (f415o00ooOO0 == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.o00oOOo0(context).metaData;
                if (bundle != null) {
                    f415o00ooOO0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f415o00ooOO0 = Boolean.FALSE;
            }
        }
        return f415o00ooOO0.booleanValue();
    }

    public static boolean o00ooOo0() {
        return ooo0Oo0.o00oOOoO();
    }

    public static /* synthetic */ void o00ooOoo(Context context) {
        o0.o00oOo00(context);
        f414o00ooOO = true;
    }

    public static void o00oooo(@oo0oO0 o00oo0OO o00oo0oo) {
        synchronized (f418o00ooOo0) {
            o00ooooO(o00oo0oo);
        }
    }

    public static void o00ooooO(@oo0oO0 o00oo0OO o00oo0oo) {
        synchronized (f418o00ooOo0) {
            Iterator<WeakReference<o00oo0OO>> it = f416o00ooOOo.iterator();
            while (it.hasNext()) {
                o00oo0OO o00oo0oo2 = it.next().get();
                if (o00oo0oo2 == o00oo0oo || o00oo0oo2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void o0O00000(@oo0oO0 o0O000.o00ooO0 o00ooo02) {
        Objects.requireNonNull(o00ooo02);
        if (Build.VERSION.SDK_INT >= 33) {
            Object o00oo2 = o00oo();
            if (o00oo2 != null) {
                o00oOOoO.o00oOOoO(o00oo2, o00oOOo0.o00oOOo0(o00ooo02.o00oo00O()));
            }
        } else if (o00ooo02.equals(f413o00ooO0o)) {
        } else {
            synchronized (f418o00ooOo0) {
                f413o00ooO0o = o00ooo02;
                o00oOoO();
            }
        }
    }

    public static void o0O0000O(boolean z) {
        ooo0Oo0.o00oOo00(z);
    }

    public static void o0OoO00O(final Context context) {
        if (o00ooOOo(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f414o00ooOO) {
                    return;
                }
                f405o00oo0Oo.execute(new Runnable() { // from class: androidx.appcompat.app.o00oo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo0OO.o00ooOoo(context);
                    }
                });
                return;
            }
            synchronized (f417o00ooOo) {
                o0O000.o00ooO0 o00ooo02 = f413o00ooO0o;
                if (o00ooo02 == null) {
                    if (f409o00ooO == null) {
                        f409o00ooO = o0O000.o00ooO0.o00oOo00(o0.o00oOOoO(context));
                    }
                    if (f409o00ooO.o00oOoOo()) {
                        return;
                    }
                    f413o00ooO0o = f409o00ooO;
                } else if (!o00ooo02.equals(f409o00ooO)) {
                    o0O000.o00ooO0 o00ooo03 = f413o00ooO0o;
                    f409o00ooO = o00ooo03;
                    o0.o00oOOo0(context, o00ooo03.o00oo00O());
                }
            }
        }
    }

    @o0o0000
    public static void o0OoOoOO(boolean z) {
        f415o00ooOO0 = Boolean.valueOf(z);
    }

    public static void o0OoOoOo(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f412o00ooO0O != i) {
            f412o00ooO0O = i;
            o00oOoO0();
        }
    }

    public boolean o00oOo0O() {
        return false;
    }

    public abstract boolean o00oOo0o();

    public void o00oOoOO(final Context context) {
        f405o00oo0Oo.execute(new Runnable() { // from class: androidx.appcompat.app.o00oo00O
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0OO.o0OoO00O(context);
            }
        });
    }

    @Deprecated
    public void o00oOoOo(Context context) {
    }

    @o0O00O0
    @oo0oO0
    public Context o00oOoo0(@oo0oO0 Context context) {
        o00oOoOo(context);
        return context;
    }

    public abstract void o00oOooO(View view, ViewGroup.LayoutParams layoutParams);

    @o0OO00OO
    public abstract <T extends View> T o00oo0O(@oo0OOoo int i);

    public abstract View o00oo0O0(@o0OO00OO View view, String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet);

    @o0OO00OO
    public Context o00oo0o0() {
        return null;
    }

    @o0OO00OO
    public abstract o00oOOoO.InterfaceC0005o00oOOoO o00oo0oO();

    public abstract boolean o00ooO(int i);

    public abstract MenuInflater o00ooO00();

    @o0OO00OO
    public abstract androidx.appcompat.app.o00oOOo0 o00ooO0o();

    public abstract void o00ooOO();

    public abstract void o00ooOO0();

    public abstract boolean o00ooOo();

    public abstract void o00ooo0(Bundle bundle);

    public abstract void o00ooo00(Configuration configuration);

    public abstract void o00ooo0O();

    public abstract void o00ooo0o(Bundle bundle);

    public abstract void o00oooO();

    public abstract void o00oooOO(Bundle bundle);

    public abstract void o00oooOo();

    public abstract void o00oooo0();

    public abstract boolean o00ooooo(int i);

    public abstract void o0O00(@o0OO00OO CharSequence charSequence);

    public abstract void o0O000(View view);

    public abstract void o0O0000o(@oooOO0 int i);

    public abstract void o0O000O(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o0O000Oo(boolean z);

    @o0O00O0
    @o0OOooO0(33)
    public void o0O000o(@o0OO00OO OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    @o0OOooO0(17)
    public abstract void o0O000o0(int i);

    public void o0O000oo(@o0OOO0OO int i) {
    }

    @o0OO00OO
    public abstract o00oOoOo.o00oo0 o0O00O0(@oo0oO0 o00oo0.o00oOOo0 o00oooo02);

    public int o0O0o() {
        return -100;
    }

    public abstract void o0ooOoOO(@o0OO00OO Toolbar toolbar);
}
