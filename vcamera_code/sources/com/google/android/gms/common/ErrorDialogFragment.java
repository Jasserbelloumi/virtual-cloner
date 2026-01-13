package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @o0OO00OO
    private Dialog zac;

    @oo0oO0
    public static ErrorDialogFragment newInstance(@oo0oO0 Dialog dialog) {
        return newInstance(dialog, null);
    }

    @oo0oO0
    public static ErrorDialogFragment newInstance(@oo0oO0 Dialog dialog, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.zab = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@oo0oO0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @oo0oO0
    public Dialog onCreateDialog(@o0OO00OO Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.zac == null) {
                this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getActivity())).create();
            }
            return this.zac;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(@oo0oO0 FragmentManager fragmentManager, @o0OO00OO String str) {
        super.show(fragmentManager, str);
    }
}
