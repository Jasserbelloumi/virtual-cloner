package oo0oO0;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface o00oOo0O {
    default void o00oOOo0(@oo0oO0 Activity activity, @oo0oO0 List<String> list, boolean z, @o0OO00OO o00oOoO o00oooo2) {
    }

    default void o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 List<String> list, @o0OO00OO o00oOoO o00oooo2) {
        o0O00.o00oOo00(activity, new ArrayList(list), this, o00oooo2);
    }

    default void o00oOo00(@oo0oO0 Activity activity, @oo0oO0 List<String> list, @oo0oO0 List<String> list2, boolean z, @o0OO00OO o00oOoO o00oooo2) {
        if (o00oooo2 == null) {
            return;
        }
        o00oooo2.o00oOOoO(list2, z);
    }

    default void o00oOooO(@oo0oO0 Activity activity, @oo0oO0 List<String> list, @oo0oO0 List<String> list2, boolean z, @o0OO00OO o00oOoO o00oooo2) {
        if (o00oooo2 == null) {
            return;
        }
        o00oooo2.o00oOOo0(list2, z);
    }
}
