package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00ooO {

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static View.OnTouchListener o00oOOo0(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    @o0OO00OO
    public static View.OnTouchListener o00oOOo0(@oo0oO0 ListPopupWindow listPopupWindow, @oo0oO0 View view) {
        return o00oOOo0.o00oOOo0(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener o00oOOoO(Object obj, View view) {
        return o00oOOo0.o00oOOo0((ListPopupWindow) obj, view);
    }
}
