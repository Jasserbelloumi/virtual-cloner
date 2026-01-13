package o00oooo0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oooOo.oOooo;
import o0O000oo.o0;
/* loaded from: classes.dex */
public final class o0O0OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9889o00oOOo0 = "RoundedBitmapDrawableFa";

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O0OOO0 {
        public o00oOOo0(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // o00oooo0.o0O0OOO0
        public void o00oOo0o(int i, int i2, int i3, Rect rect, Rect rect2) {
            o0.o00oOOo0.o00oOOoO(i, i2, i3, rect, rect2, 0);
        }

        @Override // o00oooo0.o0O0OOO0
        public boolean o00oOoO() {
            Bitmap bitmap = this.f9891o00oOOo0;
            return bitmap != null && oOooo.o00oOOo0.o00oOOo0(bitmap);
        }

        @Override // o00oooo0.o0O0OOO0
        public void o00oo0OO(boolean z) {
            Bitmap bitmap = this.f9891o00oOOo0;
            if (bitmap != null) {
                oOooo.o00oOOo0.o00oOOoO(bitmap, z);
                invalidateSelf();
            }
        }
    }

    @oo0oO0
    public static o0O0OOO0 o00oOOo0(@oo0oO0 Resources resources, @o0OO00OO Bitmap bitmap) {
        return new o0O0OO(resources, bitmap);
    }

    @oo0oO0
    public static o0O0OOO0 o00oOOoO(@oo0oO0 Resources resources, @oo0oO0 InputStream inputStream) {
        o0O0OO o0o0oo = new o0O0OO(resources, BitmapFactory.decodeStream(inputStream));
        if (o0o0oo.f9891o00oOOo0 == null) {
            Objects.toString(inputStream);
        }
        return o0o0oo;
    }

    @oo0oO0
    public static o0O0OOO0 o00oOo00(@oo0oO0 Resources resources, @oo0oO0 String str) {
        return new o0O0OO(resources, BitmapFactory.decodeFile(str));
    }
}
