package o0O0Oo0o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(18)
/* loaded from: classes.dex */
public class o0oO0O0o implements o0O0oo0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ViewOverlay f11953o00oOOo0;

    public o0oO0O0o(@oo0oO0 View view) {
        this.f11953o00oOOo0 = view.getOverlay();
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void add(@oo0oO0 Drawable drawable) {
        this.f11953o00oOOo0.add(drawable);
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void remove(@oo0oO0 Drawable drawable) {
        this.f11953o00oOOo0.remove(drawable);
    }
}
