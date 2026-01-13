package o0OOooO0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o00oOo00;
import java.util.HashMap;
import kotlin.Metadata;
import o00ooOoo.oOo000Oo;
import o0OO0o.o0O0oo0o;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001c\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lo0OOooO0/ooOOO00O;", "Landroidx/fragment/app/o00oOo00;", "Landroid/view/View$OnTouchListener;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onActivityCreated", "", "mCancelable", "setCancelable", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", oOo000Oo.f9217o0O00o0o, "onTouch", "o00oo0O0", "Z", "cancelable", "<init>", "()V", "catloadinglibrary_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public class ooOOO00O extends o00oOo00 implements View.OnTouchListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public HashMap f15381o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f15382o00oo0O0 = true;

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 implements DialogInterface.OnKeyListener {
        public o00oOOo0() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4 || i == 111) {
                ooOOO00O.this.dismiss();
                return true;
            }
            return false;
        }
    }

    public void o00oOo0o() {
        HashMap hashMap = this.f15381o00oo0O;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View o00oOoO0(int i) {
        if (this.f15381o00oo0O == null) {
            this.f15381o00oo0O = new HashMap();
        }
        View view = (View) this.f15381o00oo0O.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.f15381o00oo0O.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Bundle bundle2;
        Window window;
        View decorView;
        Dialog dialog;
        super.onActivityCreated(bundle);
        boolean showsDialog = getShowsDialog();
        setShowsDialog(false);
        setShowsDialog(showsDialog);
        View view = getView();
        if (view != null) {
            if (!(view.getParent() == null)) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view".toString());
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setContentView(view);
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (dialog = getDialog()) != null) {
            dialog.setOwnerActivity(activity);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnCancelListener(null);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setOnDismissListener(null);
        }
        Dialog dialog5 = getDialog();
        if (dialog5 != null) {
            dialog5.setCancelable(false);
        }
        Dialog dialog6 = getDialog();
        if (dialog6 != null && (window = dialog6.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setOnTouchListener(this);
        }
        Dialog dialog7 = getDialog();
        if (dialog7 != null) {
            dialog7.setOnKeyListener(new o00oOOo0());
        }
        if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        Dialog dialog8 = getDialog();
        o0ooO.o00oo00O(dialog8);
        dialog8.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        o00oOo0o();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
        if (this.f15382o00oo0O0) {
            Dialog dialog = getDialog();
            o0ooO.o00oo00O(dialog);
            o0ooO.o00oo0OO(dialog, "dialog!!");
            if (dialog.isShowing()) {
                dismiss();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.o00oOo00
    public void setCancelable(boolean z) {
        this.f15382o00oo0O0 = z;
    }
}
