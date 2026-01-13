package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class o0O00o00 {
    public static int o00oOOo0(RecyclerView.o0O00OOO o0o00ooo, o0O00O o0o00o, View view, View view2, RecyclerView.o0O00000 o0o00000, boolean z) {
        if (o0o00000.getChildCount() == 0 || o0o00ooo.o00oOooO() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(o0o00o.o00oo0OO(), o0o00o.o00oOooO(view2) - o0o00o.o00oOoO0(view));
        }
        return Math.abs(o0o00000.getPosition(view) - o0o00000.getPosition(view2)) + 1;
    }

    public static int o00oOOoO(RecyclerView.o0O00OOO o0o00ooo, o0O00O o0o00o, View view, View view2, RecyclerView.o0O00000 o0o00000, boolean z, boolean z2) {
        if (o0o00000.getChildCount() == 0 || o0o00ooo.o00oOooO() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (o0o00ooo.o00oOooO() - Math.max(o0o00000.getPosition(view), o0o00000.getPosition(view2))) - 1) : Math.max(0, Math.min(o0o00000.getPosition(view), o0o00000.getPosition(view2)));
        if (z) {
            return Math.round((max * (Math.abs(o0o00o.o00oOooO(view2) - o0o00o.o00oOoO0(view)) / (Math.abs(o0o00000.getPosition(view) - o0o00000.getPosition(view2)) + 1))) + (o0o00o.o00oo0() - o0o00o.o00oOoO0(view)));
        }
        return max;
    }

    public static int o00oOo00(RecyclerView.o0O00OOO o0o00ooo, o0O00O o0o00o, View view, View view2, RecyclerView.o0O00000 o0o00000, boolean z) {
        if (o0o00000.getChildCount() == 0 || o0o00ooo.o00oOooO() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((o0o00o.o00oOooO(view2) - o0o00o.o00oOoO0(view)) / (Math.abs(o0o00000.getPosition(view) - o0o00000.getPosition(view2)) + 1)) * o0o00ooo.o00oOooO());
        }
        return o0o00ooo.o00oOooO();
    }
}
