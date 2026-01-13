package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO0oO;
import androidx.lifecycle.o0OO0oO0;
import androidx.savedstate.o00oOOo0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o00ooOoo.oO000O0O;
import o00ooOoo.oO00OO0O;
import o00ooOoo.oO0OOO0;
import o00ooOoo.oOo0o0oO;
import o00ooOoo.oOo0oooO;
import o00ooOoo.ooOOO00O;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements oO000O0O.o00oo0O0, oO000O0O.o0O0o {

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final String f2835o00oooOO = "android:support:lifecycle";

    /* renamed from: o00ooo0  reason: collision with root package name */
    public final androidx.lifecycle.o0O0oo0o f2836o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public final o0O0o f2837o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public boolean f2838o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public boolean f2839o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public boolean f2840o00oooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00ooO0<FragmentActivity> implements o00ooo0.o0O0OOO, o00ooo0.o0O0OOOo, oOo0oooO, oOo0o0oO, o0OO0oO, androidx.activity.o0, androidx.activity.result.o00oo0O, o0O0OOo.o00oOo0O, o0O00OO, o0O000oo.o0O000o0 {
        public o00oOOo0() {
            super(FragmentActivity.this);
        }

        @Override // o0O000oo.o0O000o0
        public void addMenuProvider(@oo0oO0 o0O000oo.o0O00OO o0o00oo) {
            FragmentActivity.this.addMenuProvider(o0o00oo);
        }

        @Override // o0O000oo.o0O000o0
        public void addMenuProvider(@oo0oO0 o0O000oo.o0O00OO o0o00oo, @oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o) {
            FragmentActivity.this.addMenuProvider(o0o00oo, o0o0o0o);
        }

        @Override // o0O000oo.o0O000o0
        public void addMenuProvider(@oo0oO0 o0O000oo.o0O00OO o0o00oo, @oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOoO o00ooooo2) {
            FragmentActivity.this.addMenuProvider(o0o00oo, o0o0o0o, o00ooooo2);
        }

        @Override // androidx.lifecycle.o0O0O0O
        @oo0oO0
        public androidx.lifecycle.o0O00 getLifecycle() {
            return FragmentActivity.this.f2836o00ooo0;
        }

        @Override // androidx.activity.o0
        @oo0oO0
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // o0O0OOo.o00oOo0O
        @oo0oO0
        public androidx.savedstate.o00oOOo0 getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.o0OO0oO
        @oo0oO0
        public o0OO0oO0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // o0O000oo.o0O000o0
        public void invalidateMenu() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.o0O00OO
        public void o00oOOo0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
            FragmentActivity.this.o00ooooo(fragment);
        }

        @Override // o00ooOoo.oOo0oooO
        public void o00oOOoO(@oo0oO0 o<oO00OO0O> oVar) {
            FragmentActivity.this.o00oOOoO(oVar);
        }

        @Override // o00ooOoo.oOo0oooO
        public void o00oOo00(@oo0oO0 o<oO00OO0O> oVar) {
            FragmentActivity.this.o00oOo00(oVar);
        }

        @Override // o00ooo0.o0O0OOO
        public void o00oOo0O(@oo0oO0 o<Configuration> oVar) {
            FragmentActivity.this.o00oOo0O(oVar);
        }

        @Override // androidx.fragment.app.o00ooO0, androidx.fragment.app.o00oo0O
        @o0OO00OO
        public View o00oOo0o(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.activity.result.o00oo0O
        @oo0oO0
        public ActivityResultRegistry o00oOoO() {
            return FragmentActivity.this.o00oOoO();
        }

        @Override // androidx.fragment.app.o00ooO0, androidx.fragment.app.o00oo0O
        public boolean o00oOoO0() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // o00ooOoo.oOo0o0oO
        public void o00oOoo0(@oo0oO0 o<ooOOO00O> oVar) {
            FragmentActivity.this.o00oOoo0(oVar);
        }

        @Override // androidx.fragment.app.o00ooO0
        public boolean o00oo(@oo0oO0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.o00ooO0
        public void o00oo0(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // o00ooo0.o0O0OOO
        public void o00oo00O(@oo0oO0 o<Configuration> oVar) {
            FragmentActivity.this.o00oo00O(oVar);
        }

        @Override // o00ooo0.o0O0OOOo
        public void o00oo0O(@oo0oO0 o<Integer> oVar) {
            FragmentActivity.this.o00oo0O(oVar);
        }

        @Override // o00ooOoo.oOo0o0oO
        public void o00oo0OO(@oo0oO0 o<ooOOO00O> oVar) {
            FragmentActivity.this.o00oo0OO(oVar);
        }

        @Override // o00ooo0.o0O0OOOo
        public void o00oo0Oo(@oo0oO0 o<Integer> oVar) {
            FragmentActivity.this.o00oo0Oo(oVar);
        }

        @Override // androidx.fragment.app.o00ooO0
        public int o00oo0o() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.o00ooO0
        @oo0oO0
        public LayoutInflater o00oo0o0() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.o00ooO0
        public boolean o00oo0oO() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.o00ooO0
        public void o00ooO() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.o00ooO0
        public boolean o00ooO00(@oo0oO0 String str) {
            return oO000O0O.o00oo0Oo(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.o00ooO0
        /* renamed from: o00ooOO0 */
        public FragmentActivity o00oo0O0() {
            return FragmentActivity.this;
        }

        @Override // o0O000oo.o0O000o0
        public void removeMenuProvider(@oo0oO0 o0O000oo.o0O00OO o0o00oo) {
            FragmentActivity.this.removeMenuProvider(o0o00oo);
        }
    }

    public FragmentActivity() {
        this.f2837o00ooo00 = o0O0o.o00oOOoO(new o00oOOo0());
        this.f2836o00ooo0 = new androidx.lifecycle.o0O0oo0o(this);
        this.f2840o00oooO = true;
        o00ooo0o();
    }

    @o00oOooO.o0oO0Ooo
    public FragmentActivity(@oooOO0 int i) {
        super(i);
        this.f2837o00ooo00 = o0O0o.o00oOOoO(new o00oOOo0());
        this.f2836o00ooo0 = new androidx.lifecycle.o0O0oo0o(this);
        this.f2840o00oooO = true;
        o00ooo0o();
    }

    private void o00ooo0o() {
        getSavedStateRegistry().o00oOoOo(f2835o00oooOO, new o00oOOo0.o00oOo00() { // from class: androidx.fragment.app.o00oOoO
            @Override // androidx.savedstate.o00oOOo0.o00oOo00
            public final Bundle o00oOOo0() {
                Bundle o00oooO2;
                o00oooO2 = FragmentActivity.this.o00oooO();
                return o00oooO2;
            }
        });
        o00oo00O(new o() { // from class: androidx.fragment.app.o00oo00O
            @Override // o0ooOoOO.o
            public final void accept(Object obj) {
                FragmentActivity.this.o00oooOO((Configuration) obj);
            }
        });
        o00oo0(new o() { // from class: androidx.fragment.app.o00oo0
            @Override // o0ooOoOO.o
            public final void accept(Object obj) {
                FragmentActivity.this.o00oooOo((Intent) obj);
            }
        });
        o00oOoO0(new o00oOOoO.o00oOo0O() { // from class: androidx.fragment.app.o00oo0OO
            @Override // o00oOOoO.o00oOo0O
            public final void o00oOOo0(Context context) {
                FragmentActivity.this.o00oooo0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle o00oooO() {
        o00oooo();
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oooOO(Configuration configuration) {
        this.f2837o00ooo00.o00ooOo0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oooOo(Intent intent) {
        this.f2837o00ooo00.o00ooOo0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oooo0(Context context) {
        this.f2837o00ooo00.o00oOOo0(null);
    }

    public static boolean o00ooooO(FragmentManager fragmentManager, o0O00.o00oOOoO o00ooooo2) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.o0O0OO()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= o00ooooO(fragment.getChildFragmentManager(), o00ooooo2);
                }
                o0O0OO o0o0oo = fragment.mViewLifecycleOwner;
                if (o0o0oo != null && o0o0oo.getLifecycle().o00oOOoO().isAtLeast(o0O00.o00oOOoO.STARTED)) {
                    fragment.mViewLifecycleOwner.o00oOo0o(o00ooooo2);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.o00oOOoO().isAtLeast(o0O00.o00oOOoO.STARTED)) {
                    fragment.mLifecycleRegistry.o00oo0o0(o00ooooo2);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (o00oo0oO(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f2838o00ooo0O);
            printWriter.print(" mResumed=");
            printWriter.print(this.f2839o00ooo0o);
            printWriter.print(" mStopped=");
            printWriter.print(this.f2840o00oooO);
            if (getApplication() != null) {
                o0O0O0O.o00oOOo0.o00oOooO(this).o00oOOoO(str2, fileDescriptor, printWriter, strArr);
            }
            this.f2837o00ooo00.o00ooOO().o0O000o(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void o0() {
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_RESUME);
        this.f2837o00ooo00.o00oo0Oo();
    }

    @Override // o00ooOoo.oO000O0O.o0O0o
    @Deprecated
    public final void o00oOooo(int i) {
    }

    @oo0oO0
    public FragmentManager o00ooo0() {
        return this.f2837o00ooo00.o00ooOO();
    }

    @o0OO00OO
    public final View o00ooo00(@o0OO00OO View view, @oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        return this.f2837o00ooo00.o00ooOo(view, str, context, attributeSet);
    }

    @oo0oO0
    @Deprecated
    public o0O0O0O.o00oOOo0 o00ooo0O() {
        return o0O0O0O.o00oOOo0.o00oOooO(this);
    }

    public void o00oooo() {
        do {
        } while (o00ooooO(o00ooo0(), o0O00.o00oOOoO.CREATED));
    }

    @o0O
    @Deprecated
    public void o00ooooo(@oo0oO0 Fragment fragment) {
    }

    public void o0O000(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @o0OO00OO Bundle bundle) {
        if (i == -1) {
            oO000O0O.o00oo0o0(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public void o0O00000(@o0OO00OO oO0OOO0 oo0ooo0) {
        oO000O0O.o00oo0(this, oo0ooo0);
    }

    public void o0O0000O(@o0OO00OO oO0OOO0 oo0ooo0) {
        oO000O0O.o00oo0OO(this, oo0ooo0);
    }

    public void o0O0000o(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        o0O000(fragment, intent, i, null);
    }

    @Deprecated
    public void o0O000O(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            oO000O0O.o00oo0o(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @Deprecated
    public void o0O000Oo() {
        invalidateOptionsMenu();
    }

    public void o0O000o0() {
        oO000O0O.o00oo0oO(this);
    }

    public void o0OoOoOO() {
        oO000O0O.o00oOoOO(this);
    }

    public void o0OoOoOo() {
        oO000O0O.o00oOo00(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @o00oOooO.o0O00O0
    public void onActivityResult(int i, int i2, @o0OO00OO Intent intent) {
        this.f2837o00ooo00.o00ooOo0();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_CREATE);
        this.f2837o00ooo00.o00oOo0o();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @o0OO00OO
    public View onCreateView(@o0OO00OO View view, @oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        View o00ooo002 = o00ooo00(view, str, context, attributeSet);
        return o00ooo002 == null ? super.onCreateView(view, str, context, attributeSet) : o00ooo002;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @o0OO00OO
    public View onCreateView(@oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        View o00ooo002 = o00ooo00(null, str, context, attributeSet);
        return o00ooo002 == null ? super.onCreateView(str, context, attributeSet) : o00ooo002;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2837o00ooo00.o00oOoO();
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @oo0oO0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f2837o00ooo00.o00oOo0O(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2839o00ooo0o = false;
        this.f2837o00ooo00.o00oo0();
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        o0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @o00oOooO.o0O00O0
    public void onRequestPermissionsResult(int i, @oo0oO0 String[] strArr, @oo0oO0 int[] iArr) {
        this.f2837o00ooo00.o00ooOo0();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f2837o00ooo00.o00ooOo0();
        super.onResume();
        this.f2839o00ooo0o = true;
        this.f2837o00ooo00.o00ooO0O();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f2837o00ooo00.o00ooOo0();
        super.onStart();
        this.f2840o00oooO = false;
        if (!this.f2838o00ooo0O) {
            this.f2838o00ooo0O = true;
            this.f2837o00ooo00.o00oOo00();
        }
        this.f2837o00ooo00.o00ooO0O();
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_START);
        this.f2837o00ooo00.o00oo0o0();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2837o00ooo00.o00ooOo0();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2840o00oooO = true;
        o00oooo();
        this.f2837o00ooo00.o00oo0o();
        this.f2836o00ooo0.o00oOooo(o0O00.o00oOOo0.ON_STOP);
    }
}
