package o0OO0o0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o0OO0Ooo.o0OoO00O;
import o0OOOOO0.o0ooO;
/* loaded from: classes2.dex */
public final class o00oOo0O {
    public static final Drawable o00oOOo0(Drawable drawable, Context context, o0OoO00O o0ooo00o) {
        o0ooO.o00oo0O0(drawable, "<this>");
        o0ooO.o00oo0O0(context, "context");
        o0ooO.o00oo0O0(o0ooo00o, "size");
        Bitmap createBitmap = Bitmap.createBitmap(o0ooo00o.f13182o00oOOo0, o0ooo00o.f13183o00oOOoO, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, o0ooo00o.f13182o00oOOo0, o0ooo00o.f13183o00oOOoO);
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
