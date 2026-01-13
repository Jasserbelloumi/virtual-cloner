package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class o00oOOoO extends Drawable {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ActionBarContainer f1038o00oOOo0;

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static void o00oOOo0(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public o00oOOoO(ActionBarContainer actionBarContainer) {
        this.f1038o00oOOo0 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o00oOooO.oo0oO0 Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1038o00oOOo0;
        if (actionBarContainer.f718o00oo) {
            Drawable drawable = actionBarContainer.f727o0O0o;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f722o00oo0o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1038o00oOOo0;
        Drawable drawable3 = actionBarContainer2.f724o00oo0oO;
        if (drawable3 == null || !actionBarContainer2.f726o00ooO00) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @o00oOooO.o0OOooO0(21)
    public void getOutline(@o00oOooO.oo0oO0 Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1038o00oOOo0;
        if (!actionBarContainer.f718o00oo) {
            drawable = actionBarContainer.f722o00oo0o;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f727o0O0o == null) {
            return;
        } else {
            drawable = actionBarContainer.f722o00oo0o;
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
