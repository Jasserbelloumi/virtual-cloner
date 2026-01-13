package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO000;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO;
import androidx.lifecycle.o0OO0oO0;
import androidx.lifecycle.oo0ooO;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0OO implements androidx.lifecycle.o0O000o0, o0O0OOo.o00oOo0O, o0OO0oO {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OO0oO0 f3099o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Fragment f3100o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0OO0o00.o00oOOoO f3101o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public androidx.lifecycle.o0O0oo0o f3103o00oo0o0 = null;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o0O0OOo.o00oOo00 f3102o00oo0o = null;

    public o0O0OO(@oo0oO0 Fragment fragment, @oo0oO0 o0OO0oO0 o0oo0oo0) {
        this.f3100o00oo0O0 = fragment;
        this.f3099o00oo0O = o0oo0oo0;
    }

    @Override // androidx.lifecycle.o0O000o0
    @o00oOooO.o0O00O0
    @oo0oO0
    public o0O00oO0.o00oOOo0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f3100o00oo0O0.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        o0O00oO0.o00oOoO o00oooo2 = new o0O00oO0.o00oOoO();
        if (application != null) {
            o00oooo2.o00oOo00(o0OO0o00.o00oOOo0.f3390o00oOoOO, application);
        }
        o00oooo2.o00oOo00(o0OO000.f3368o00oOo00, this);
        o00oooo2.o00oOo00(o0OO000.f3370o00oOooO, this);
        if (this.f3100o00oo0O0.getArguments() != null) {
            o00oooo2.o00oOo00(o0OO000.f3369o00oOo0O, this.f3100o00oo0O0.getArguments());
        }
        return o00oooo2;
    }

    @Override // androidx.lifecycle.o0O000o0
    @oo0oO0
    public o0OO0o00.o00oOOoO getDefaultViewModelProviderFactory() {
        o0OO0o00.o00oOOoO defaultViewModelProviderFactory = this.f3100o00oo0O0.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f3100o00oo0O0.mDefaultFactory)) {
            this.f3101o00oo0Oo = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f3101o00oo0Oo == null) {
            Application application = null;
            Context applicationContext = this.f3100o00oo0O0.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f3101o00oo0Oo = new oo0ooO(application, this, this.f3100o00oo0O0.getArguments());
        }
        return this.f3101o00oo0Oo;
    }

    @Override // androidx.lifecycle.o0O0O0O
    @oo0oO0
    public androidx.lifecycle.o0O00 getLifecycle() {
        o00oOOoO();
        return this.f3103o00oo0o0;
    }

    @Override // o0O0OOo.o00oOo0O
    @oo0oO0
    public androidx.savedstate.o00oOOo0 getSavedStateRegistry() {
        o00oOOoO();
        return this.f3102o00oo0o.f11516o00oOOoO;
    }

    @Override // androidx.lifecycle.o0OO0oO
    @oo0oO0
    public o0OO0oO0 getViewModelStore() {
        o00oOOoO();
        return this.f3099o00oo0O;
    }

    public void o00oOOo0(@oo0oO0 o0O00.o00oOOo0 o00oooo02) {
        this.f3103o00oo0o0.o00oOooo(o00oooo02);
    }

    public void o00oOOoO() {
        if (this.f3103o00oo0o0 == null) {
            this.f3103o00oo0o0 = new androidx.lifecycle.o0O0oo0o(this);
            o0O0OOo.o00oOo00 o00oOOo02 = o0O0OOo.o00oOo00.o00oOOo0(this);
            this.f3102o00oo0o = o00oOOo02;
            o00oOOo02.o00oOo00();
            o0OO000.o00oOo00(this);
        }
    }

    public boolean o00oOo00() {
        return this.f3103o00oo0o0 != null;
    }

    public void o00oOo0O(@oo0oO0 Bundle bundle) {
        this.f3102o00oo0o.o00oOo0O(bundle);
    }

    public void o00oOo0o(@oo0oO0 o0O00.o00oOOoO o00ooooo2) {
        this.f3103o00oo0o0.o00oo0o0(o00ooooo2);
    }

    public void o00oOooO(@o0OO00OO Bundle bundle) {
        this.f3102o00oo0o.o00oOooO(bundle);
    }
}
