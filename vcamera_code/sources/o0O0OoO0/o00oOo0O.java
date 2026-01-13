package o0O0OoO0;

import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0OOoo;
/* loaded from: classes.dex */
public class o00oOo0O {
    @o0OO00OO
    public static <T extends View> T o00oOOo0(View view, @oo0OOoo int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                T t = (T) viewGroup.getChildAt(i2).findViewById(i);
                if (t != null) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }
}
