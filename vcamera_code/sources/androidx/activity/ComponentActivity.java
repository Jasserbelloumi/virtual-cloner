package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O000o0;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import androidx.lifecycle.o0O0oo0o;
import androidx.lifecycle.o0OO;
import androidx.lifecycle.o0OO000;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO;
import androidx.lifecycle.o0OO0oO0;
import androidx.lifecycle.o0OOO0;
import androidx.lifecycle.oo0ooO;
import androidx.savedstate.o00oOOo0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOo00.o00oOOo0;
import o00oOo00.o00oOOoO;
import o00oOooO.o0O;
import o00oOooO.o0O00O0;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.o0oO0Ooo;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o00ooOoo.oO000O0O;
import o00ooOoo.oO000OOo;
import o00ooOoo.oO00OO0O;
import o00ooOoo.oO0O0Oo0;
import o00ooOoo.oOo0o0oO;
import o00ooOoo.oOo0oooO;
import o00ooOoo.ooOOO00O;
import o00ooo0.o0O0OOO;
import o00ooo0.o0O0OOOo;
import o0O000.o00oOOo0;
import o0O000oo.o0O00OO;
import o0O000oo.o0OoO00O;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements o00oOOoO.o00oOOo0, o0O0O0O, o0OO0oO, o0O000o0, o0O0OOo.o00oOo0O, o0, androidx.activity.result.o00oo0O, androidx.activity.result.o00oOOoO, o0O0OOO, o0O0OOOo, oO0O0Oo0, oOo0oooO, oOo0o0oO, o0O000oo.o0O000o0 {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f1o00ooOoo = "android:support:activity-result";

    /* renamed from: o00oo  reason: collision with root package name */
    public o0OO0o00.o00oOOoO f2o00oo;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00oOOoO.o00oOOoO f3o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O0oo0o f4o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0OoO00O f5o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final o0O0OOo.o00oOo00 f6o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o<Configuration>> f7o00ooO;
    @oooOO0

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f8o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final OnBackPressedDispatcher f9o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final AtomicInteger f10o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final ActivityResultRegistry f11o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o<Intent>> f12o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final CopyOnWriteArrayList<o<Integer>> f13o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final CopyOnWriteArrayList<o<oO00OO0O>> f14o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f15o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final CopyOnWriteArrayList<o<ooOOO00O>> f16o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f17o00ooOoO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o0OO0oO0 f18o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o00oOOo0.C0096o00oOOo0 f24o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ int f25o00oo0O0;

            public o00oOOo0(int i, o00oOOo0.C0096o00oOOo0 c0096o00oOOo0) {
                this.f25o00oo0O0 = i;
                this.f24o00oo0O = c0096o00oOOo0;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.o00oOo00(this.f25o00oo0O0, this.f24o00oo0O.f6878o00oOOo0);
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000o00oOOoO implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f27o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ int f28o00oo0O0;

            public RunnableC0000o00oOOoO(int i, IntentSender.SendIntentException sendIntentException) {
                this.f28o00oo0O0 = i;
                this.f27o00oo0O = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOOoO.this.o00oOOoO(this.f28o00oo0O0, 0, new Intent().setAction(o00oOOoO.o0.f6880o00oOOoO).putExtra(o00oOOoO.o0.f6882o00oOooO, this.f27o00oo0O));
            }
        }

        public o00oOOoO() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void o00oOo0o(int i, @oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, I i2, @o0OO00OO oO000OOo oo000ooo) {
            ComponentActivity componentActivity = ComponentActivity.this;
            o00oOOo0.C0096o00oOOo0<O> o00oOOoO2 = o00oooo02.o00oOOoO(componentActivity, i2);
            if (o00oOOoO2 != null) {
                new Handler(Looper.getMainLooper()).post(new o00oOOo0(i, o00oOOoO2));
                return;
            }
            Intent o00oOOo02 = o00oooo02.o00oOOo0(componentActivity, i2);
            Bundle bundle = null;
            if (o00oOOo02.getExtras() != null && o00oOOo02.getExtras().getClassLoader() == null) {
                o00oOOo02.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (o00oOOo02.hasExtra(o00oOOoO.o00ooO.f6893o00oOOoO)) {
                bundle = o00oOOo02.getBundleExtra(o00oOOoO.o00ooO.f6893o00oOOoO);
                o00oOOo02.removeExtra(o00oOOoO.o00ooO.f6893o00oOOoO);
            } else if (oo000ooo != null) {
                bundle = oo000ooo.o00oOooo();
            }
            Bundle bundle2 = bundle;
            if (o00oOOoO.o00oo.f6887o00oOOoO.equals(o00oOOo02.getAction())) {
                String[] stringArrayExtra = o00oOOo02.getStringArrayExtra(o00oOOoO.o00oo.f6888o00oOo00);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                oO000O0O.o00oOooo(componentActivity, stringArrayExtra, i);
            } else if (!o00oOOoO.o0.f6880o00oOOoO.equals(o00oOOo02.getAction())) {
                oO000O0O.o00oo0o0(componentActivity, o00oOOo02, i, bundle2);
            } else {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) o00oOOo02.getParcelableExtra(o00oOOoO.o0.f6881o00oOo00);
                try {
                    oO000O0O.o00oo0o(componentActivity, intentSenderRequest.f105o00oo0O0, i, intentSenderRequest.f104o00oo0O, intentSenderRequest.f106o00oo0Oo, intentSenderRequest.f107o00oo0o0, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0000o00oOOoO(i, e));
                }
            }
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        public static void o00oOOo0(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static OnBackInvokedDispatcher o00oOOo0(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Object f30o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0OO0oO0 f31o00oOOoO;
    }

    public ComponentActivity() {
        this.f3o00oo0Oo = new o00oOOoO.o00oOOoO();
        this.f5o00oo0o0 = new o0OoO00O(new Runnable() { // from class: androidx.activity.o00oOoO
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.f4o00oo0o = new o0O0oo0o(this);
        o0O0OOo.o00oOo00 o00oOOo02 = o0O0OOo.o00oOo00.o00oOOo0(this);
        this.f6o00oo0oO = o00oOOo02;
        this.f9o00ooO00 = new OnBackPressedDispatcher(new o00oOOo0());
        this.f10o00ooO0O = new AtomicInteger();
        this.f11o00ooO0o = new o00oOOoO();
        this.f7o00ooO = new CopyOnWriteArrayList<>();
        this.f13o00ooOO0 = new CopyOnWriteArrayList<>();
        this.f12o00ooOO = new CopyOnWriteArrayList<>();
        this.f14o00ooOOo = new CopyOnWriteArrayList<>();
        this.f16o00ooOo0 = new CopyOnWriteArrayList<>();
        this.f15o00ooOo = false;
        this.f17o00ooOoO = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().o00oOOo0(new o0O00OOO() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                if (o00oooo02 == o0O00.o00oOOo0.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().o00oOOo0(new o0O00OOO() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
                    ComponentActivity.this.f3o00oo0Oo.f6875o00oOOoO = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().o00oOOo0();
                }
            }
        });
        getLifecycle().o00oOOo0(new o0O00OOO() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                ComponentActivity.this.o00ooO0O();
                ComponentActivity.this.getLifecycle().o00oOooO(this);
            }
        });
        o00oOOo02.o00oOo00();
        o0OO000.o00oOo00(this);
        getSavedStateRegistry().o00oOoOo(f1o00ooOoo, new o00oOOo0.o00oOo00() { // from class: androidx.activity.o00oo00O
            @Override // androidx.savedstate.o00oOOo0.o00oOo00
            public final Bundle o00oOOo0() {
                Bundle o00ooOO02;
                o00ooOO02 = ComponentActivity.this.o00ooOO0();
                return o00ooOO02;
            }
        });
        o00oOoO0(new o00oOOoO.o00oOo0O() { // from class: androidx.activity.o00oo0
            @Override // o00oOOoO.o00oOo0O
            public final void o00oOOo0(Context context) {
                ComponentActivity.this.o00ooOO(context);
            }
        });
    }

    @o0oO0Ooo
    public ComponentActivity(@oooOO0 int i) {
        this();
        this.f8o00ooO0 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00ooOO(Context context) {
        Bundle o00oOOoO2 = getSavedStateRegistry().o00oOOoO(f1o00ooOoo);
        if (o00oOOoO2 != null) {
            this.f11o00ooO0o.o00oOoO0(o00oOOoO2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle o00ooOO0() {
        Bundle bundle = new Bundle();
        this.f11o00ooO0o.o00oOoO(bundle);
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o00ooO();
        super.addContentView(view, layoutParams);
    }

    @Override // o0O000oo.o0O000o0
    public void addMenuProvider(@oo0oO0 o0O00OO o0o00oo) {
        this.f5o00oo0o0.o00oOo00(o0o00oo);
    }

    @Override // o0O000oo.o0O000o0
    public void addMenuProvider(@oo0oO0 o0O00OO o0o00oo, @oo0oO0 o0O0O0O o0o0o0o) {
        this.f5o00oo0o0.o00oOooO(o0o00oo, o0o0o0o);
    }

    @Override // o0O000oo.o0O000o0
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@oo0oO0 o0O00OO o0o00oo, @oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOoO o00ooooo2) {
        this.f5o00oo0o0.o00oOo0O(o0o00oo, o0o0o0o, o00ooooo2);
    }

    @Override // androidx.lifecycle.o0O000o0
    @o0O00O0
    @oo0oO0
    public o0O00oO0.o00oOOo0 getDefaultViewModelCreationExtras() {
        o0O00oO0.o00oOoO o00oooo2 = new o0O00oO0.o00oOoO();
        if (getApplication() != null) {
            o00oooo2.o00oOo00(o0OO0o00.o00oOOo0.f3390o00oOoOO, getApplication());
        }
        o00oooo2.o00oOo00(o0OO000.f3368o00oOo00, this);
        o00oooo2.o00oOo00(o0OO000.f3370o00oOooO, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            o00oooo2.o00oOo00(o0OO000.f3369o00oOo0O, getIntent().getExtras());
        }
        return o00oooo2;
    }

    @Override // androidx.lifecycle.o0O000o0
    @oo0oO0
    public o0OO0o00.o00oOOoO getDefaultViewModelProviderFactory() {
        if (this.f2o00oo == null) {
            this.f2o00oo = new oo0ooO(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f2o00oo;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.o0O0O0O
    @oo0oO0
    public o0O00 getLifecycle() {
        return this.f4o00oo0o;
    }

    @Override // androidx.activity.o0
    @oo0oO0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f9o00ooO00;
    }

    @Override // o0O0OOo.o00oOo0O
    @oo0oO0
    public final androidx.savedstate.o00oOOo0 getSavedStateRegistry() {
        return this.f6o00oo0oO.f11516o00oOOoO;
    }

    @Override // androidx.lifecycle.o0OO0oO
    @oo0oO0
    public o0OO0oO0 getViewModelStore() {
        if (getApplication() != null) {
            o00ooO0O();
            return this.f18o0O0o;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // o0O000oo.o0O000o0
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // o00ooOoo.oOo0oooO
    public final void o00oOOoO(@oo0oO0 o<oO00OO0O> oVar) {
        this.f14o00ooOOo.add(oVar);
    }

    @Override // o00ooOoo.oOo0oooO
    public final void o00oOo00(@oo0oO0 o<oO00OO0O> oVar) {
        this.f14o00ooOOo.remove(oVar);
    }

    @Override // o00ooo0.o0O0OOO
    public final void o00oOo0O(@oo0oO0 o<Configuration> oVar) {
        this.f7o00ooO.remove(oVar);
    }

    @Override // o00oOOoO.o00oOOo0
    @o0OO00OO
    public Context o00oOo0o() {
        return this.f3o00oo0Oo.f6875o00oOOoO;
    }

    @Override // androidx.activity.result.o00oo0O
    @oo0oO0
    public final ActivityResultRegistry o00oOoO() {
        return this.f11o00ooO0o;
    }

    @Override // o00oOOoO.o00oOOo0
    public final void o00oOoO0(@oo0oO0 o00oOOoO.o00oOo0O o00ooo0o2) {
        this.f3o00oo0Oo.o00oOOo0(o00ooo0o2);
    }

    @Override // o00ooOoo.oOo0o0oO
    public final void o00oOoo0(@oo0oO0 o<ooOOO00O> oVar) {
        this.f16o00ooOo0.add(oVar);
    }

    @Override // o00oOOoO.o00oOOo0
    public final void o00oOooO(@oo0oO0 o00oOOoO.o00oOo0O o00ooo0o2) {
        this.f3o00oo0Oo.o00oOo0O(o00ooo0o2);
    }

    @Override // o00ooOoo.oO0O0Oo0
    public final void o00oo0(@oo0oO0 o<Intent> oVar) {
        this.f12o00ooOO.add(oVar);
    }

    @Override // o00ooo0.o0O0OOO
    public final void o00oo00O(@oo0oO0 o<Configuration> oVar) {
        this.f7o00ooO.add(oVar);
    }

    @Override // o00ooo0.o0O0OOOo
    public final void o00oo0O(@oo0oO0 o<Integer> oVar) {
        this.f13o00ooOO0.remove(oVar);
    }

    @Override // o00ooOoo.oO0O0Oo0
    public final void o00oo0O0(@oo0oO0 o<Intent> oVar) {
        this.f12o00ooOO.remove(oVar);
    }

    @Override // o00ooOoo.oOo0o0oO
    public final void o00oo0OO(@oo0oO0 o<ooOOO00O> oVar) {
        this.f16o00ooOo0.remove(oVar);
    }

    @Override // o00ooo0.o0O0OOOo
    public final void o00oo0Oo(@oo0oO0 o<Integer> oVar) {
        this.f13o00ooOO0.add(oVar);
    }

    public final void o00ooO() {
        o0OO.o00oOOoO(getWindow().getDecorView(), this);
        o0OOO0.o00oOOoO(getWindow().getDecorView(), this);
        androidx.savedstate.o00oOOoO.o00oOOoO(getWindow().getDecorView(), this);
        o0O000O.o00oOOoO(getWindow().getDecorView(), this);
    }

    public void o00ooO0O() {
        if (this.f18o0O0o == null) {
            o00oOoO o00oooo2 = (o00oOoO) getLastNonConfigurationInstance();
            if (o00oooo2 != null) {
                this.f18o0O0o = o00oooo2.f31o00oOOoO;
            }
            if (this.f18o0O0o == null) {
                this.f18o0O0o = new o0OO0oO0();
            }
        }
    }

    @o0OO00OO
    @Deprecated
    public Object o00ooO0o() {
        o00oOoO o00oooo2 = (o00oOoO) getLastNonConfigurationInstance();
        if (o00oooo2 != null) {
            return o00oooo2.f30o00oOOo0;
        }
        return null;
    }

    @o0OO00OO
    @Deprecated
    public Object o00ooOOo() {
        return null;
    }

    @Override // android.app.Activity
    @o0O00O0
    @Deprecated
    public void onActivityResult(int i, int i2, @o0OO00OO Intent intent) {
        if (this.f11o00ooO0o.o00oOOoO(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @o0O
    public void onBackPressed() {
        this.f9o00ooO00.o00oOoO0();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @o0O00O0
    public void onConfigurationChanged(@oo0oO0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<o<Configuration>> it = this.f7o00ooO.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public void onCreate(@o0OO00OO Bundle bundle) {
        this.f6o00oo0oO.o00oOooO(bundle);
        this.f3o00oo0Oo.o00oOo00(this);
        super.onCreate(bundle);
        androidx.lifecycle.oooOO0.o00oOoO0(this);
        if (o0O000.o00oOOo0.o00oOoo0()) {
            this.f9o00ooO00.o00oOoO(o00oOo0O.o00oOOo0(this));
        }
        int i = this.f8o00ooO0;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @oo0oO0 Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.f5o00oo0o0.o00oOoO(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @oo0oO0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f5o00oo0o0.o00oOoOo(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @o0O00O0
    public void onMultiWindowModeChanged(boolean z) {
        if (this.f15o00ooOo) {
            return;
        }
        Iterator<o<oO00OO0O>> it = this.f14o00ooOOo.iterator();
        while (it.hasNext()) {
            it.next().accept(new oO00OO0O(z));
        }
    }

    @Override // android.app.Activity
    @o0O00O0
    @o0OOooO0(api = 26)
    public void onMultiWindowModeChanged(boolean z, @oo0oO0 Configuration configuration) {
        this.f15o00ooOo = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f15o00ooOo = false;
            Iterator<o<oO00OO0O>> it = this.f14o00ooOOo.iterator();
            while (it.hasNext()) {
                it.next().accept(new oO00OO0O(z, configuration));
            }
        } catch (Throwable th) {
            this.f15o00ooOo = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @o0O00O0
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<o<Intent>> it = this.f12o00ooOO.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @oo0oO0 Menu menu) {
        this.f5o00oo0o0.o00oOoOO(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @o0O00O0
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.f17o00ooOoO) {
            return;
        }
        Iterator<o<ooOOO00O>> it = this.f16o00ooOo0.iterator();
        while (it.hasNext()) {
            it.next().accept(new ooOOO00O(z));
        }
    }

    @Override // android.app.Activity
    @o0O00O0
    @o0OOooO0(api = 26)
    public void onPictureInPictureModeChanged(boolean z, @oo0oO0 Configuration configuration) {
        this.f17o00ooOoO = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f17o00ooOoO = false;
            Iterator<o<ooOOO00O>> it = this.f16o00ooOo0.iterator();
            while (it.hasNext()) {
                it.next().accept(new ooOOO00O(z, configuration));
            }
        } catch (Throwable th) {
            this.f17o00ooOoO = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @o0OO00OO View view, @oo0oO0 Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.f5o00oo0o0.o00oOoo0(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @o0O00O0
    @Deprecated
    public void onRequestPermissionsResult(int i, @oo0oO0 String[] strArr, @oo0oO0 int[] iArr) {
        if (this.f11o00ooO0o.o00oOOoO(i, -1, new Intent().putExtra(o00oOOoO.o00oo.f6888o00oOo00, strArr).putExtra(o00oOOoO.o00oo.f6889o00oOooO, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    @o0OO00OO
    public final Object onRetainNonConfigurationInstance() {
        o00oOoO o00oooo2;
        Object o00ooOOo2 = o00ooOOo();
        o0OO0oO0 o0oo0oo0 = this.f18o0O0o;
        if (o0oo0oo0 == null && (o00oooo2 = (o00oOoO) getLastNonConfigurationInstance()) != null) {
            o0oo0oo0 = o00oooo2.f31o00oOOoO;
        }
        if (o0oo0oo0 == null && o00ooOOo2 == null) {
            return null;
        }
        o00oOoO o00oooo3 = new o00oOoO();
        o00oooo3.f30o00oOOo0 = o00ooOOo2;
        o00oooo3.f31o00oOOoO = o0oo0oo0;
        return o00oooo3;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @o0O00O0
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        o0O00 lifecycle = getLifecycle();
        if (lifecycle instanceof o0O0oo0o) {
            ((o0O0oo0o) lifecycle).o00oo0o0(o0O00.o00oOOoO.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f6o00oo0oO.o00oOo0O(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @o0O00O0
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<o<Integer>> it = this.f13o00ooOO0.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // androidx.activity.result.o00oOOoO
    @oo0oO0
    public final <I, O> androidx.activity.result.o00oo0OO<I> registerForActivityResult(@oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 ActivityResultRegistry activityResultRegistry, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo03) {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("activity_rq#");
        o00oOOo02.append(this.f10o00ooO0O.getAndIncrement());
        return activityResultRegistry.o00oOoOO(o00oOOo02.toString(), this, o00oooo02, o00oooo03);
    }

    @Override // androidx.activity.result.o00oOOoO
    @oo0oO0
    public final <I, O> androidx.activity.result.o00oo0OO<I> registerForActivityResult(@oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo03) {
        return registerForActivityResult(o00oooo02, this.f11o00ooO0o, o00oooo03);
    }

    @Override // o0O000oo.o0O000o0
    public void removeMenuProvider(@oo0oO0 o0O00OO o0o00oo) {
        this.f5o00oo0o0.o00oOooo(o0o00oo);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (o0O0Oo0O.o00oOo00.o00oOoO()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@oooOO0 int i) {
        o00ooO();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        o00ooO();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o00ooO();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@oo0oO0 Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@oo0oO0 Intent intent, int i, @o0OO00OO Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@oo0oO0 IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@oo0oO0 IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
