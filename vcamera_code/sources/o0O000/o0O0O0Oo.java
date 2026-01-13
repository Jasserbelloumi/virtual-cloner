package o0O000;

import android.content.Context;
import android.os.UserManager;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0O0Oo {

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean o00oOOo0(@oo0oO0 Context context) {
        return o00oOOo0.o00oOOo0(context);
    }
}
