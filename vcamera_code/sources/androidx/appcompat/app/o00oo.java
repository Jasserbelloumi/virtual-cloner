package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
/* loaded from: classes.dex */
public class o00oo extends androidx.fragment.app.o00oOo00 {
    public o00oo() {
    }

    public o00oo(@oooOO0 int i) {
        super(i);
    }

    @Override // androidx.fragment.app.o00oOo00
    @oo0oO0
    public Dialog onCreateDialog(@o0OO00OO Bundle bundle) {
        return new o0O0o(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.o00oOo00
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@oo0oO0 Dialog dialog, int i) {
        if (!(dialog instanceof o0O0o)) {
            super.setupDialog(dialog, i);
            return;
        }
        o0O0o o0o0o = (o0O0o) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        o0o0o.supportRequestWindowFeature(1);
    }
}
