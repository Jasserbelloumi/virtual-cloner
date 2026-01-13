package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O0O0O;
import androidx.lifecycle.o0O0oo0o;
import androidx.lifecycle.o0OO;
import kotlin.Metadata;
import o00oOooO.o0O00O0;
import o00oOooO.o0OOO0OO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0003\u0010$\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015J\b\u0010\u000b\u001a\u00020\u0004H\u0015J\b\u0010\f\u001a\u00020\u0004H\u0015J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Landroidx/activity/o00oo0O0;", "Landroid/app/Dialog;", "Landroidx/lifecycle/o0O0O0O;", "Landroidx/activity/o0;", "Lo0OO0o/oO0Ooooo;", "initViewTreeOwners", "Landroidx/lifecycle/o0O00;", "getLifecycle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/o0O0oo0o;", "_lifecycleRegistry", "Landroidx/lifecycle/o0O0oo0o;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getLifecycleRegistry", "()Landroidx/lifecycle/o0O0oo0o;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class o00oo0O0 extends Dialog implements o0O0O0O, o0 {
    @Nullable
    private o0O0oo0o _lifecycleRegistry;
    @NotNull
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public o00oo0O0(@NotNull Context context) {
        this(context, 0, 2, null);
        o0ooO.o00oo0O0(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public o00oo0O0(@NotNull Context context, @o0OOO0OO int i) {
        super(context, i);
        o0ooO.o00oo0O0(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.o00oo0OO
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.m0onBackPressedDispatcher$lambda1(o00oo0O0.this);
            }
        });
    }

    public /* synthetic */ o00oo0O0(Context context, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    private final o0O0oo0o getLifecycleRegistry() {
        o0O0oo0o o0o0oo0o = this._lifecycleRegistry;
        if (o0o0oo0o == null) {
            o0O0oo0o o0o0oo0o2 = new o0O0oo0o(this);
            this._lifecycleRegistry = o0o0oo0o2;
            return o0o0oo0o2;
        }
        return o0o0oo0o;
    }

    private static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        o0ooO.o00oo00O(window);
        o0OO.o00oOOoO(window.getDecorView(), this);
        Window window2 = getWindow();
        o0ooO.o00oo00O(window2);
        View decorView = window2.getDecorView();
        o0ooO.o00oo0OO(decorView, "window!!.decorView");
        o0O000O.o00oOOoO(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBackPressedDispatcher$lambda-1  reason: not valid java name */
    public static final void m0onBackPressedDispatcher$lambda1(o00oo0O0 o00oo0o02) {
        o0ooO.o00oo0O0(o00oo0o02, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        o0ooO.o00oo0O0(view, "view");
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.o0O0O0O
    @NotNull
    public final androidx.lifecycle.o0O00 getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.o0
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    @o0O00O0
    public void onBackPressed() {
        this.onBackPressedDispatcher.o00oOoO0();
    }

    @Override // android.app.Dialog
    @o0O00O0
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.onBackPressedDispatcher.o00oOoO(getOnBackInvokedDispatcher());
        }
        getLifecycleRegistry().o00oOooo(o0O00.o00oOOo0.ON_CREATE);
    }

    @Override // android.app.Dialog
    @o0O00O0
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().o00oOooo(o0O00.o00oOOo0.ON_RESUME);
    }

    @Override // android.app.Dialog
    @o0O00O0
    public void onStop() {
        getLifecycleRegistry().o00oOooo(o0O00.o00oOOo0.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        o0ooO.o00oo0O0(view, "view");
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
