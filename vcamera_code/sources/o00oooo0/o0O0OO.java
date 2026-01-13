package o00oooo0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0O0OO extends o0O0OOO0 {
    public o0O0OO(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@oo0oO0 Outline outline) {
        o00oo0o();
        outline.setRoundRect(this.f9896o00oOoO, o00oOo00());
    }

    @Override // o00oooo0.o0O0OOO0
    public void o00oOo0o(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // o00oooo0.o0O0OOO0
    public boolean o00oOoO() {
        Bitmap bitmap = this.f9891o00oOOo0;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // o00oooo0.o0O0OOO0
    public void o00oo0OO(boolean z) {
        Bitmap bitmap = this.f9891o00oOOo0;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
