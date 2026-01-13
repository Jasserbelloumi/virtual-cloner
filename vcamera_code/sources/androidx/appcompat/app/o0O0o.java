package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import o00oOoOo.o00oo0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o0O000oo.o0O0000O;
/* loaded from: classes.dex */
public class o0O0o extends androidx.activity.o00oo0O0 implements o00oOoO {
    private o00oo0OO mDelegate;
    private final o0O0000O.o00oOOo0 mKeyDispatcher;

    public o0O0o(@oo0oO0 Context context) {
        this(context, 0);
    }

    public o0O0o(@oo0oO0 Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new o0O0000O.o00oOOo0() { // from class: androidx.appcompat.app.o00oo0O
            @Override // o0O000oo.o0O0000O.o00oOOo0
            public final boolean o00oOoOo(KeyEvent keyEvent) {
                return o0O0o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        o00oo0OO delegate = getDelegate();
        delegate.o0O000oo(getThemeResId(context, i));
        delegate.o00ooo0(null);
    }

    public o0O0o(@oo0oO0 Context context, boolean z, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new o0O0000O.o00oOOo0() { // from class: androidx.appcompat.app.o00oo0O
            @Override // o0O000oo.o0O0000O.o00oOOo0
            public final boolean o00oOoOo(KeyEvent keyEvent) {
                return o0O0o.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void addContentView(@oo0oO0 View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().o00oOooO(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().o00ooo0O();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o0O000oo.o0O0000O.o00oOo0O(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @o0OO00OO
    public <T extends View> T findViewById(@oo0OOoo int i) {
        return (T) getDelegate().o00oo0O(i);
    }

    @oo0oO0
    public o00oo0OO getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = o00oo0OO.o00oo00O(this, this);
        }
        return this.mDelegate;
    }

    public o00oOOo0 getSupportActionBar() {
        return getDelegate().o00ooO0o();
    }

    @Override // android.app.Dialog
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().o00ooOO();
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().o00ooOO0();
        super.onCreate(bundle);
        getDelegate().o00ooo0(bundle);
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().o00oooo0();
    }

    @Override // androidx.appcompat.app.o00oOoO
    public void onSupportActionModeFinished(o00oOoOo.o00oo0 o00oo0Var) {
    }

    @Override // androidx.appcompat.app.o00oOoO
    public void onSupportActionModeStarted(o00oOoOo.o00oo0 o00oo0Var) {
    }

    @Override // androidx.appcompat.app.o00oOoO
    @o0OO00OO
    public o00oOoOo.o00oo0 onWindowStartingSupportActionMode(o00oo0.o00oOOo0 o00oooo02) {
        return null;
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void setContentView(@oooOO0 int i) {
        getDelegate().o0O0000o(i);
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void setContentView(@oo0oO0 View view) {
        getDelegate().o0O000(view);
    }

    @Override // androidx.activity.o00oo0O0, android.app.Dialog
    public void setContentView(@oo0oO0 View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().o0O000O(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().o0O00(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().o0O00(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().o00ooooo(i);
    }
}
