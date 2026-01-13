package androidx.core.widget;

import android.widget.ListView;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O00000 {

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @o0O0O0Oo
        public static void o00oOOoO(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static boolean o00oOOo0(@oo0oO0 ListView listView, int i) {
        return o00oOOo0.o00oOOo0(listView, i);
    }

    public static void o00oOOoO(@oo0oO0 ListView listView, int i) {
        o00oOOo0.o00oOOoO(listView, i);
    }
}
