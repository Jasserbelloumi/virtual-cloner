package o00oo0oO;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0O000Oo implements o0O00O0 {
    @Override // o00oo0oO.o0O00O0
    public void o00oOOo0(o0O00 o0o00) {
        o00oOoOo(o0o00, o00oOo0O(o0o00));
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOOoO(o0O00 o0o00) {
        return o00oOoO(o0o00) * 2.0f;
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOo00(o0O00 o0o00) {
        return o00oOoO(o0o00) * 2.0f;
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOo0O(o0O00 o0o00) {
        return o00oo0O0(o0o00).o00oOo00();
    }

    @Override // o00oo0oO.o0O00O0
    public ColorStateList o00oOo0o(o0O00 o0o00) {
        return o00oo0O0(o0o00).o00oOOoO();
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOoO(o0O00 o0o00) {
        return o00oo0O0(o0o00).o00oOooO();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoO0(o0O00 o0o00, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        o0o00.o00oOOo0(new o0OoO00O(colorStateList, f));
        View o00oOo0o2 = o0o00.o00oOo0o();
        o00oOo0o2.setClipToOutline(true);
        o00oOo0o2.setElevation(f2);
        o00oOoOo(o0o00, f3);
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOoOO(o0O00 o0o00) {
        return o0o00.o00oOo0o().getElevation();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoOo(o0O00 o0o00, float f) {
        o00oo0O0(o0o00).o00oOoO0(f, o0o00.o00oOOoO(), o0o00.o00oOo0O());
        o00oOooo(o0o00);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoo0(o0O00 o0o00, float f) {
        o00oo0O0(o0o00).o00oOoO(f);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOooO(o0O00 o0o00, float f) {
        o0o00.o00oOo0o().setElevation(f);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOooo(o0O00 o0o00) {
        if (!o0o00.o00oOOoO()) {
            o0o00.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float o00oOo0O2 = o00oOo0O(o0o00);
        float o00oOoO2 = o00oOoO(o0o00);
        int ceil = (int) Math.ceil(o0O00O0o.o00oOo00(o00oOo0O2, o00oOoO2, o0o00.o00oOo0O()));
        int ceil2 = (int) Math.ceil(o0O00O0o.o00oOooO(o00oOo0O2, o00oOoO2, o0o00.o00oOo0O()));
        o0o00.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo0() {
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo00O(o0O00 o0o00, @o0OO00OO ColorStateList colorStateList) {
        o00oo0O0(o0o00).o00oOo0o(colorStateList);
    }

    public final o0OoO00O o00oo0O0(o0O00 o0o00) {
        return (o0OoO00O) o0o00.o00oOo00();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo0OO(o0O00 o0o00) {
        o00oOoOo(o0o00, o00oOo0O(o0o00));
    }
}
