package o00oo0Oo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oo0O.o00oOOo0;
import o00oo0O.o00oOo0O;
import o00oo0Oo.o0;
/* loaded from: classes.dex */
public class o0O0000O {
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f7504o00oOoOO = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    @SuppressLint({"ActionValue"})

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f7505o00oOoOo = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f7506o00oOoo0 = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f7507o00oOooo = "androidx.browser.trusted.extra.SHARE_DATA";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f7508o00oo0 = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f7509o00oo00O = "androidx.browser.trusted.extra.DISPLAY_MODE";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Uri f7510o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public List<String> f7512o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oo0o0.o00oo00O f7513o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oo0o0.o00oo0 f7514o00oOo0o;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Bundle f7517o00oOooO;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOo0O.o00oOOo0 f7511o00oOOoO = new o00oOo0O.o00oOOo0();
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0 f7516o00oOoO0 = new o0.o00oOOo0();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f7515o00oOoO = 0;

    public o0O0000O(@oo0oO0 Uri uri) {
        this.f7510o00oOOo0 = uri;
    }

    @oo0oO0
    public o0O00000 o00oOOo0(@oo0oO0 o00oo0O.o00oo0 o00oo0Var) {
        if (o00oo0Var != null) {
            this.f7511o00oOOoO.o00oo0o(o00oo0Var);
            Intent intent = this.f7511o00oOOoO.o00oOooO().f7356o00oOOo0;
            intent.setData(this.f7510o00oOOo0);
            intent.putExtra(o00oo0O.o0O0o.f7389o00oOOo0, true);
            if (this.f7512o00oOo00 != null) {
                intent.putExtra(f7505o00oOoOo, new ArrayList(this.f7512o00oOo00));
            }
            Bundle bundle = this.f7517o00oOooO;
            if (bundle != null) {
                intent.putExtra(f7504o00oOoOO, bundle);
            }
            List<Uri> emptyList = Collections.emptyList();
            o00oo0o0.o00oo0 o00oo0Var2 = this.f7514o00oOo0o;
            if (o00oo0Var2 != null && this.f7513o00oOo0O != null) {
                intent.putExtra(f7506o00oOoo0, o00oo0Var2.o00oOOoO());
                intent.putExtra(f7507o00oOooo, this.f7513o00oOo0O.o00oOOoO());
                List<Uri> list = this.f7513o00oOo0O.f7560o00oOo00;
                if (list != null) {
                    emptyList = list;
                }
            }
            intent.putExtra(f7509o00oo00O, this.f7516o00oOoO0.toBundle());
            intent.putExtra(f7508o00oo0, this.f7515o00oOoO);
            return new o0O00000(intent, emptyList);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    @oo0oO0
    public o00oo0O.o00oOo0O o00oOOoO() {
        return this.f7511o00oOOoO.o00oOooO();
    }

    @oo0oO0
    public o0 o00oOo00() {
        return this.f7516o00oOoO0;
    }

    @oo0oO0
    public o0O0000O o00oOo0O(@oo0oO0 List<String> list) {
        this.f7512o00oOo00 = list;
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOo0o(int i) {
        this.f7511o00oOOoO.o00oOoOO(i);
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOoO(@oo0oO0 o00oOOo0 o00oooo02) {
        this.f7511o00oOOoO.o00oOoo0(o00oooo02);
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOoO0(int i, @oo0oO0 o00oOOo0 o00oooo02) {
        this.f7511o00oOOoO.o00oOoOo(i, o00oooo02);
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOoOO(@oo0oO0 o0 o0Var) {
        this.f7516o00oOoO0 = o0Var;
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOoOo(@o0O00O int i) {
        this.f7511o00oOOoO.o00oo0OO(i);
        return this;
    }

    @oo0oO0
    public o0O0000O o00oOoo0(@o0O00O int i) {
        this.f7511o00oOOoO.o00oo0O0(i);
        return this;
    }

    @oo0oO0
    public Uri o00oOooO() {
        return this.f7510o00oOOo0;
    }

    @oo0oO0
    public o0O0000O o00oOooo(int i) {
        this.f7515o00oOoO = i;
        return this;
    }

    @oo0oO0
    public o0O0000O o00oo0(@oo0oO0 Bundle bundle) {
        this.f7517o00oOooO = bundle;
        return this;
    }

    @oo0oO0
    public o0O0000O o00oo00O(@oo0oO0 o00oo0o0.o00oo0 o00oo0Var, @oo0oO0 o00oo0o0.o00oo00O o00oo00o) {
        this.f7514o00oOo0o = o00oo0Var;
        this.f7513o00oOo0O = o00oo00o;
        return this;
    }

    @oo0oO0
    public o0O0000O o00oo0OO(@o0O00O int i) {
        this.f7511o00oOOoO.o00ooO0(i);
        return this;
    }
}
