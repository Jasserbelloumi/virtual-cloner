package o0O000oo;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o0O0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f10597o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f10598o00oOOoO;

    public o0O0O0o0(@o00oOooO.oo0oO0 ViewGroup viewGroup) {
    }

    public int o00oOOo0() {
        return this.f10597o00oOOo0 | this.f10598o00oOOoO;
    }

    public void o00oOOoO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i) {
        o00oOo00(view, view2, i, 0);
    }

    public void o00oOo00(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i, int i2) {
        if (i2 == 1) {
            this.f10598o00oOOoO = i;
        } else {
            this.f10597o00oOOo0 = i;
        }
    }

    public void o00oOo0O(@o00oOooO.oo0oO0 View view, int i) {
        if (i == 1) {
            this.f10598o00oOOoO = 0;
        } else {
            this.f10597o00oOOo0 = 0;
        }
    }

    public void o00oOooO(@o00oOooO.oo0oO0 View view) {
        o00oOo0O(view, 0);
    }
}
