package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class o00oo0O extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f3855o00ooO = "PreferenceDialogFragment.message";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f3856o00ooO0 = "PreferenceDialogFragment.title";
    @Deprecated

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f3857o00ooO00 = "key";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f3858o00ooO0O = "PreferenceDialogFragment.positiveText";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f3859o00ooO0o = "PreferenceDialogFragment.negativeText";

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f3860o00ooOO = "PreferenceDialogFragment.icon";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f3861o00ooOO0 = "PreferenceDialogFragment.layout";

    /* renamed from: o00oo  reason: collision with root package name */
    public int f3862o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public CharSequence f3863o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public DialogPreference f3864o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public CharSequence f3865o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public CharSequence f3866o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public CharSequence f3867o00oo0o0;
    @oooOO0

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f3868o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public BitmapDrawable f3869o0O0o;

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(@oo0oO0 Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets$Type.ime());
        }
    }

    @Deprecated
    public DialogPreference o00oOOo0() {
        if (this.f3864o00oo0O0 == null) {
            this.f3864o00oo0O0 = (DialogPreference) ((DialogPreference.o00oOOo0) getTargetFragment()).o00oOOoO(getArguments().getString("key"));
        }
        return this.f3864o00oo0O0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOOoO() {
        return false;
    }

    @Deprecated
    public void o00oOo00(@oo0oO0 View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f3866o00oo0o;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Deprecated
    public abstract void o00oOo0O(boolean z);

    @Deprecated
    public void o00oOo0o(@oo0oO0 AlertDialog.Builder builder) {
    }

    public final void o00oOoO0(@oo0oO0 Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            o00oOOo0.o00oOOo0(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @o0OO00OO
    @Deprecated
    public View o00oOooO(@oo0oO0 Context context) {
        int i = this.f3868o00oo0oO;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@oo0oO0 DialogInterface dialogInterface, int i) {
        this.f3862o00oo = i;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.o00oOOo0)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.o00oOOo0 o00oooo02 = (DialogPreference.o00oOOo0) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f3863o00oo0O = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3865o00oo0Oo = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3867o00oo0o0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3866o00oo0o = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3868o00oo0oO = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3869o0O0o = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) o00oooo02.o00oOOoO(string);
        this.f3864o00oo0O0 = dialogPreference;
        this.f3863o00oo0O = dialogPreference.o0O0oo0O();
        this.f3865o00oo0Oo = this.f3864o00oo0O0.o0O0oO0();
        this.f3867o00oo0o0 = this.f3864o00oo0O0.oooOO0();
        this.f3866o00oo0o = this.f3864o00oo0O0.o0O0o0oo();
        this.f3868o00oo0oO = this.f3864o00oo0O0.o0O0o0oO();
        Drawable o0oOo0O02 = this.f3864o00oo0O0.o0oOo0O0();
        if (o0oOo0O02 == null || (o0oOo0O02 instanceof BitmapDrawable)) {
            bitmapDrawable = (BitmapDrawable) o0oOo0O02;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(o0oOo0O02.getIntrinsicWidth(), o0oOo0O02.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            o0oOo0O02.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            o0oOo0O02.draw(canvas);
            bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
        }
        this.f3869o0O0o = bitmapDrawable;
    }

    @Override // android.app.DialogFragment
    @oo0oO0
    public Dialog onCreateDialog(@o0OO00OO Bundle bundle) {
        Activity activity = getActivity();
        this.f3862o00oo = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f3863o00oo0O).setIcon(this.f3869o0O0o).setPositiveButton(this.f3865o00oo0Oo, this).setNegativeButton(this.f3867o00oo0o0, this);
        View o00oOooO2 = o00oOooO(activity);
        if (o00oOooO2 != null) {
            o00oOo00(o00oOooO2);
            negativeButton.setView(o00oOooO2);
        } else {
            negativeButton.setMessage(this.f3866o00oo0o);
        }
        o00oOo0o(negativeButton);
        AlertDialog create = negativeButton.create();
        if (o00oOOoO()) {
            o00oOoO0(create);
        }
        return create;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@oo0oO0 DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        o00oOo0O(this.f3862o00oo == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3863o00oo0O);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3865o00oo0Oo);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3867o00oo0o0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3866o00oo0o);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3868o00oo0oO);
        BitmapDrawable bitmapDrawable = this.f3869o0O0o;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
