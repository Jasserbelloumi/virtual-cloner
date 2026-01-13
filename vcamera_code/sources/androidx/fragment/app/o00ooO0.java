package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO000O0O;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public abstract class o00ooO0<E> extends o00oo0O {
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f3034o00oo0O;
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Activity f3035o00oo0O0;
    @oo0oO0

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Handler f3036o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final FragmentManager f3037o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f3038o00oo0o0;

    public o00ooO0(@o0OO00OO Activity activity, @oo0oO0 Context context, @oo0oO0 Handler handler, int i) {
        this.f3037o00oo0o = new o0O00O0();
        this.f3035o00oo0O0 = activity;
        this.f3034o00oo0O = (Context) ooOOOOoo.o00oo00O(context, "context == null");
        this.f3036o00oo0Oo = (Handler) ooOOOOoo.o00oo00O(handler, "handler == null");
        this.f3038o00oo0o0 = i;
    }

    public o00ooO0(@oo0oO0 Context context, @oo0oO0 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    public o00ooO0(@oo0oO0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.o00oo0O
    @o0OO00OO
    public View o00oOo0o(int i) {
        return null;
    }

    @Override // androidx.fragment.app.o00oo0O
    public boolean o00oOoO0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @o0OO00OO
    public Activity o00oOoOO() {
        return this.f3035o00oo0O0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @oo0oO0
    public Context o00oOoOo() {
        return this.f3034o00oo0O;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Handler o00oOooo() {
        return this.f3036o00oo0Oo;
    }

    public boolean o00oo(@oo0oO0 Fragment fragment) {
        return true;
    }

    public void o00oo0(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
    }

    @o0OO00OO
    public abstract E o00oo0O0();

    public int o00oo0o() {
        return this.f3038o00oo0o0;
    }

    @oo0oO0
    public LayoutInflater o00oo0o0() {
        return LayoutInflater.from(this.f3034o00oo0O);
    }

    public boolean o00oo0oO() {
        return true;
    }

    public void o00ooO() {
    }

    public void o00ooO0(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        o00ooO0O(fragment, intent, i, null);
    }

    public boolean o00ooO00(@oo0oO0 String str) {
        return false;
    }

    public void o00ooO0O(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @o0OO00OO Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        o00ooo0.o0.startActivity(this.f3034o00oo0O, intent, bundle);
    }

    @Deprecated
    public void o00ooO0o(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        oO000O0O.o00oo0o(this.f3035o00oo0O0, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    public void o0O0o(@oo0oO0 Fragment fragment, @oo0oO0 String[] strArr, int i) {
    }
}
