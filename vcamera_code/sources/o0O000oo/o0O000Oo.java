package o0O000oo;

import android.view.Menu;
import android.view.MenuItem;
/* loaded from: classes.dex */
public final class o0O000Oo {

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    public static void o00oOOo0(@o00oOooO.oo0oO0 Menu menu, boolean z) {
        if (menu instanceof o0.o00oOOo0) {
            ((o0.o00oOOo0) menu).setGroupDividerEnabled(z);
        } else {
            o00oOOo0.o00oOOo0(menu, z);
        }
    }

    @Deprecated
    public static void o00oOOoO(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
