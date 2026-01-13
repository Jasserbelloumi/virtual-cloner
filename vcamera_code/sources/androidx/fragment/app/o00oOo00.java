package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.o0OO;
import androidx.lifecycle.o0OOO0;
import java.util.Objects;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
/* loaded from: classes.dex */
public class o00oOo00 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    @o0OO00OO
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.o0OooO0<androidx.lifecycle.o0O0O0O> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            o00oOo00.this.mOnDismissListener.onDismiss(o00oOo00.this.mDialog);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements DialogInterface.OnCancelListener {
        public o00oOOoO() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@o0OO00OO DialogInterface dialogInterface) {
            if (o00oOo00.this.mDialog != null) {
                o00oOo00 o00ooo002 = o00oOo00.this;
                o00ooo002.onCancel(o00ooo002.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class DialogInterface$OnDismissListenerC0020o00oOo00 implements DialogInterface.OnDismissListener {
        public DialogInterface$OnDismissListenerC0020o00oOo00() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@o0OO00OO DialogInterface dialogInterface) {
            if (o00oOo00.this.mDialog != null) {
                o00oOo00 o00ooo002 = o00oOo00.this;
                o00ooo002.onDismiss(o00ooo002.mDialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements androidx.lifecycle.o0OooO0<androidx.lifecycle.o0O0O0O> {
        public o00oOo0O() {
        }

        @Override // androidx.lifecycle.o0OooO0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: o00oOOo0 */
        public void onChanged(androidx.lifecycle.o0O0O0O o0o0o0o) {
            if (o0o0o0o == null || !o00oOo00.this.mShowsDialog) {
                return;
            }
            View requireView = o00oOo00.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (o00oOo00.this.mDialog != null) {
                if (FragmentManager.oo0OOoo(3)) {
                    toString();
                    Objects.toString(o00oOo00.this.mDialog);
                }
                o00oOo00.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends o00oo0O {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0O f3020o00oo0O0;

        public o00oOoO(o00oo0O o00oo0o2) {
            this.f3020o00oo0O0 = o00oo0o2;
        }

        @Override // androidx.fragment.app.o00oo0O
        @o0OO00OO
        public View o00oOo0o(int i) {
            return this.f3020o00oo0O0.o00oOoO0() ? this.f3020o00oo0O0.o00oOo0o(i) : o00oOo00.this.onFindViewById(i);
        }

        @Override // androidx.fragment.app.o00oo0O
        public boolean o00oOoO0() {
            return this.f3020o00oo0O0.o00oOoO0() || o00oOo00.this.onHasView();
        }
    }

    public o00oOo00() {
        this.mDismissRunnable = new o00oOOo0();
        this.mOnCancelListener = new o00oOOoO();
        this.mOnDismissListener = new DialogInterface$OnDismissListenerC0020o00oOo00();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new o00oOo0O();
        this.mDialogCreated = false;
    }

    public o00oOo00(@oooOO0 int i) {
        super(i);
        this.mDismissRunnable = new o00oOOo0();
        this.mOnCancelListener = new o00oOOoO();
        this.mOnDismissListener = new DialogInterface$OnDismissListenerC0020o00oOo00();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new o00oOo0O();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().o0O0oOO(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().o0O0oO0o(this.mBackStackId, 1, z);
            }
            this.mBackStackId = -1;
            return;
        }
        o0O0oo0o o00oo0oO2 = getParentFragmentManager().o00oo0oO();
        o00oo0oO2.o00ooo0o(true);
        o00oo0oO2.o00ooO00(this);
        if (z3) {
            o00oo0oO2.o00oo0OO();
        } else if (z) {
            o00oo0oO2.o00oo0();
        } else {
            o00oo0oO2.o00oo00O();
        }
    }

    private void prepareDialog(@o0OO00OO Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @oo0oO0
    public o00oo0O createFragmentContainer() {
        return new o00oOoO(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    @o0O
    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @o0OO00OO
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @o0OOO0OO
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    @Deprecated
    public void onActivityCreated(@o0OO00OO Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onAttach(@oo0oO0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().o00oOooo(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@oo0oO0 DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @o0O
    @oo0oO0
    public Dialog onCreateDialog(@o0OO00OO Bundle bundle) {
        if (FragmentManager.oo0OOoo(3)) {
            toString();
        }
        return new androidx.activity.o00oo0O0(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().o00oo0O0(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@oo0oO0 DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.oo0OOoo(3)) {
            toString();
        }
        dismissInternal(true, true, false);
    }

    @o0OO00OO
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @oo0oO0
    public LayoutInflater onGetLayoutInflater(@o0OO00OO Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (FragmentManager.oo0OOoo(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
            }
            return onGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (FragmentManager.oo0OOoo(2)) {
            toString();
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            o0OO.o00oOOoO(decorView, this);
            o0OOO0.o00oOOoO(decorView, this);
            androidx.savedstate.o00oOOoO.o00oOOoO(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0O
    public void onViewStateRestored(@o0OO00OO Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @oo0oO0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, @o0OOO0OO int i2) {
        if (FragmentManager.oo0OOoo(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@oo0oO0 Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(@oo0oO0 o0O0oo0o o0o0oo0o, @o0OO00OO String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        o0o0oo0o.o00oOoO0(this, str);
        this.mViewDestroyed = false;
        int o00oo00O2 = o0o0oo0o.o00oo00O();
        this.mBackStackId = o00oo00O2;
        return o00oo00O2;
    }

    public void show(@oo0oO0 FragmentManager fragmentManager, @o0OO00OO String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o00oo0oO2.o00ooo0o(true);
        o00oo0oO2.o00oOoO0(this, str);
        o00oo0oO2.o00oo00O();
    }

    public void showNow(@oo0oO0 FragmentManager fragmentManager, @o0OO00OO String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o00oo0oO2.o00ooo0o(true);
        o00oo0oO2.o00oOoO0(this, str);
        o00oo0oO2.o00oo0OO();
    }
}
