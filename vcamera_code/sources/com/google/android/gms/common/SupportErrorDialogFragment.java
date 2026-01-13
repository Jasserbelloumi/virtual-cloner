package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00oOo00;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends o00oOo00 {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    @o0OO00OO
    private Dialog zac;

    @oo0oO0
    public static SupportErrorDialogFragment newInstance(@oo0oO0 Dialog dialog) {
        return newInstance(dialog, null);
    }

    @oo0oO0
    public static SupportErrorDialogFragment newInstance(@oo0oO0 Dialog dialog, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.o00oOo00, android.content.DialogInterface.OnCancelListener
    public void onCancel(@oo0oO0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.o00oOo00
    @oo0oO0
    public Dialog onCreateDialog(@o0OO00OO Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.zac == null) {
                this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
            }
            return this.zac;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.o00oOo00
    public void show(@oo0oO0 FragmentManager fragmentManager, @o0OO00OO String str) {
        super.show(fragmentManager, str);
    }
}
