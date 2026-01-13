package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0000O {

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static View.OnTouchListener o00oOOo0(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    @o0OO00OO
    public static View.OnTouchListener o00oOOo0(@oo0oO0 Object obj) {
        return o00oOOo0.o00oOOo0((PopupMenu) obj);
    }
}
