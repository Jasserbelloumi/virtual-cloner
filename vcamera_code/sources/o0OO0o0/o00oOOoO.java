package o0OO0o0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import o00oOooO.o0O0O0o0;
import o00ooo0.o0;
import o0OOOOO0.o0ooO;
/* loaded from: classes2.dex */
public final class o00oOOoO {
    public static final /* synthetic */ Drawable o00oOOo0(Context context, @o0O0O0o0 int i) {
        o0ooO.o00oo0O0(context, "<this>");
        return o0.getDrawable(context, i);
    }

    public static final /* synthetic */ int o00oOOoO(Context context, float f) {
        o0ooO.o00oo0O0(context, "<this>");
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static final /* synthetic */ int o00oOo00(Context context, int i) {
        o0ooO.o00oo0O0(context, "<this>");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static final /* synthetic */ int o00oOo0O(View view, int i) {
        o0ooO.o00oo0O0(view, "<this>");
        Context context = view.getContext();
        o0ooO.o00oo0OO(context, "context");
        return o00oOo00(context, i);
    }

    public static final /* synthetic */ int o00oOooO(View view, float f) {
        o0ooO.o00oo0O0(view, "<this>");
        Context context = view.getContext();
        o0ooO.o00oo0OO(context, "context");
        return o00oOOoO(context, f);
    }
}
