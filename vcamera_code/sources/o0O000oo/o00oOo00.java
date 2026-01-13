package o0O000oo;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public abstract class o00oOo00 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f10422o00oOooO = "ActionProvider(support)";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f10423o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOo0 f10424o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOoO f10425o00oOo00;

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(boolean z);
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public o00oOo00(@o00oOooO.oo0oO0 Context context) {
        this.f10423o00oOOo0 = context;
    }

    @o00oOooO.oo0oO0
    public Context o00oOOo0() {
        return this.f10423o00oOOo0;
    }

    public boolean o00oOOoO() {
        return false;
    }

    public boolean o00oOo00() {
        return true;
    }

    @o00oOooO.oo0oO0
    public View o00oOo0O(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return o00oOooO();
    }

    public boolean o00oOo0o() {
        return false;
    }

    public boolean o00oOoO() {
        return false;
    }

    public void o00oOoO0(@o00oOooO.oo0oO0 SubMenu subMenu) {
    }

    public void o00oOoOO() {
        if (this.f10425o00oOo00 == null || !o00oOoO()) {
            return;
        }
        this.f10425o00oOo00.onActionProviderVisibilityChanged(o00oOo00());
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoOo() {
        this.f10425o00oOo00 = null;
        this.f10424o00oOOoO = null;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoo0(@o00oOooO.o0OO00OO o00oOOo0 o00oooo02) {
        this.f10424o00oOOoO = o00oooo02;
    }

    @o00oOooO.oo0oO0
    public abstract View o00oOooO();

    public void o00oOooo(@o00oOooO.o0OO00OO o00oOOoO o00ooooo2) {
        o00oOOoO o00ooooo3 = this.f10425o00oOo00;
        this.f10425o00oOo00 = o00ooooo2;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo00O(boolean z) {
        o00oOOo0 o00oooo02 = this.f10424o00oOOoO;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(z);
        }
    }
}
