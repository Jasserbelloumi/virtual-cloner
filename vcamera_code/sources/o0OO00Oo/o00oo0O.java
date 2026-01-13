package o0OO00Oo;

import android.content.Context;
/* loaded from: classes2.dex */
public class o00oo0O {
    public static int o00oOOo0(Context context) {
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int o00oOOoO(Context context) {
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int o00oOo00(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
