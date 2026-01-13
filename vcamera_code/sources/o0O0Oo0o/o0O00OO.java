package o0O0Oo0o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(18)
/* loaded from: classes.dex */
public class o0O00OO implements o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ViewGroupOverlay f11920o00oOOo0;

    public o0O00OO(@oo0oO0 ViewGroup viewGroup) {
        this.f11920o00oOOo0 = viewGroup.getOverlay();
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void add(@oo0oO0 Drawable drawable) {
        this.f11920o00oOOo0.add(drawable);
    }

    @Override // o0O0Oo0o.o0O00OOO
    public void add(@oo0oO0 View view) {
        this.f11920o00oOOo0.add(view);
    }

    @Override // o0O0Oo0o.o0O0oo0o
    public void remove(@oo0oO0 Drawable drawable) {
        this.f11920o00oOOo0.remove(drawable);
    }

    @Override // o0O0Oo0o.o0O00OOO
    public void remove(@oo0oO0 View view) {
        this.f11920o00oOOo0.remove(view);
    }
}
