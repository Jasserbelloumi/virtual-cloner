package o0OOoo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.o00oOo00;
import o00oOooO.o0OO00OO;
/* loaded from: classes3.dex */
public abstract class oo0oO0 extends o00oOo00 {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Activity f14917o00oo0O0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements DialogInterface.OnKeyListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    public abstract View o00oOo0o(LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup);

    public int o00oOoO() {
        return -2;
    }

    public Activity o00oOoO0() {
        return this.f14917o00oo0O0;
    }

    public int o00oOoOO() {
        return -2;
    }

    public final void o00oOoOo() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
            Window window = dialog.getWindow();
            if (window != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setBackgroundDrawableResource(17170445);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.width = o00oOoOO();
                attributes.height = o00oOoO();
                window.setAttributes(attributes);
            }
        }
    }

    @Override // androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f14917o00oo0O0 = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    @o0OO00OO
    public View onCreateView(@o00oOooO.oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, Bundle bundle) {
        View o00oOo0o2 = o00oOo0o(layoutInflater, viewGroup);
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setOnKeyListener(new o00oOOo0());
        o00oOoOo();
        return o00oOo0o2;
    }

    @Override // androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        dismissAllowingStateLoss();
    }
}
