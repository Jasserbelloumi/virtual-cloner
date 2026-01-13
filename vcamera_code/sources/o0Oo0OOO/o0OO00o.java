package o0Oo0OOO;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class o0OO00o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static HashMap<String, Typeface> f15742o00oOOo0 = new HashMap<>();

    public static Typeface o00oOOo0(String str, Context context) {
        Typeface typeface = f15742o00oOOo0.get(str);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), str);
                f15742o00oOOo0.put(str, typeface);
            } catch (Exception unused) {
                return null;
            }
        }
        return typeface;
    }
}
