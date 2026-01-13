package multispace.multiapp.clone.view.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.LoadingActivity;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOooO0.oO0O;
import o0Oo0oo0.o0OO0o00;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmultispace/multiapp/clone/view/base/LoadingActivity;", "Lmultispace/multiapp/clone/view/base/BaseActivity;", "Lo0OO0o/oO0Ooooo;", "o0O0O0oo", "o0O0O0oO", "Lo0OOooO0/oO0O;", "o00ooooO", "Lo0OOooO0/oO0O;", "loadingView", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class LoadingActivity extends BaseActivity {

    /* renamed from: o00ooooO  reason: collision with root package name */
    public oO0O f6718o00ooooO;

    public static final boolean o0ooO(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 || i == 111;
    }

    public final void o0O0O0oO() {
        oO0O oo0o = this.f6718o00ooooO;
        if (oo0o != null) {
            if (oo0o == null) {
                o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-84, -31, 6, -90, Ascii.VT, -80, -28, 40, -87, -21, Ascii.DLE}, new byte[]{-64, -114, 103, -62, 98, -34, -125, 126}));
                oo0o = null;
            }
            oo0o.dismiss();
        }
    }

    public final void o0O0O0oo() {
        if (this.f6718o00ooooO == null) {
            this.f6718o00ooooO = new oO0O();
        }
        oO0O oo0o = this.f6718o00ooooO;
        oO0O oo0o2 = null;
        if (oo0o == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-84, -87, -13, -3, 9, 60, 94, 68, -87, -93, -27}, new byte[]{-64, -58, -110, -103, 96, 82, 57, Ascii.DC2}));
            oo0o = null;
        }
        if (oo0o.isAdded()) {
            return;
        }
        oO0O oo0o3 = this.f6718o00ooooO;
        if (oo0o3 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-106, -40, 91, 35, 35, Ascii.FS, 113, -60, -109, -46, 77}, new byte[]{-6, -73, 58, 71, 74, 114, Ascii.SYN, -110}));
            oo0o3 = null;
        }
        oo0o3.f15377o00ooOO0 = R.color.primary;
        oO0O oo0o4 = this.f6718o00ooooO;
        if (oo0o4 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-1, 93, -4, -11, 10, -74, 92, Ascii.RS, -6, 87, -22}, new byte[]{-109, 50, -99, -111, 99, -40, 59, 72}));
            oo0o4 = null;
        }
        oo0o4.show(o00ooo0(), "");
        o00ooo0().o0O00OOO();
        oO0O oo0o5 = this.f6718o00ooooO;
        if (oo0o5 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{Ascii.NAK, -61, 88, 2, -7, -57, -55, -75, Ascii.DLE, -55, 78}, new byte[]{121, -84, 57, 102, -112, -87, -82, -29}));
            oo0o5 = null;
        }
        oo0o5.f15382o00oo0O0 = false;
        oO0O oo0o6 = this.f6718o00ooooO;
        if (oo0o6 == null) {
            o0ooO.o00ooooO(o00oo.o00oOOo0(new byte[]{-79, 80, SignedBytes.MAX_POWER_OF_TWO, 100, -8, 63, -115, -65, -76, 90, 86}, new byte[]{-35, 63, o0OO0o00.f16655o00oOoOO, 0, -111, 81, -22, -23}));
        } else {
            oo0o2 = oo0o6;
        }
        Dialog dialog = oo0o2.getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o0Oo0O0O.o0O0000O
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    boolean o0ooO2;
                    o0ooO2 = LoadingActivity.o0ooO(dialogInterface, i, keyEvent);
                    return o0ooO2;
                }
            });
        }
    }
}
