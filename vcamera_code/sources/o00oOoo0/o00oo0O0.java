package o00oOoo0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o0.o00oOOoO;
import o0.o00oOo00;
/* loaded from: classes.dex */
public abstract class o00oo0O0 {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final Context f7096o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public androidx.collection.o00ooO0<o00oOo00, SubMenu> f7097o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public androidx.collection.o00ooO0<o00oOOoO, MenuItem> f7098o00oo00O;

    public o00oo0O0(Context context) {
        this.f7096o00oOooo = context;
    }

    public final MenuItem o00oOo0O(MenuItem menuItem) {
        if (menuItem instanceof o00oOOoO) {
            o00oOOoO o00ooooo2 = (o00oOOoO) menuItem;
            if (this.f7098o00oo00O == null) {
                this.f7098o00oo00O = new androidx.collection.o00ooO0<>();
            }
            MenuItem menuItem2 = this.f7098o00oo00O.get(o00ooooo2);
            if (menuItem2 == null) {
                o00oo0O o00oo0o2 = new o00oo0O(this.f7096o00oOooo, o00ooooo2);
                this.f7098o00oo00O.put(o00ooooo2, o00oo0o2);
                return o00oo0o2;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu o00oOo0o(SubMenu subMenu) {
        if (subMenu instanceof o00oOo00) {
            o00oOo00 o00ooo002 = (o00oOo00) subMenu;
            if (this.f7097o00oo0 == null) {
                this.f7097o00oo0 = new androidx.collection.o00ooO0<>();
            }
            SubMenu subMenu2 = this.f7097o00oo0.get(o00ooo002);
            if (subMenu2 == null) {
                o00ooO o00ooo = new o00ooO(this.f7096o00oOooo, o00ooo002);
                this.f7097o00oo0.put(o00ooo002, o00ooo);
                return o00ooo;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void o00oOoO(int i) {
        if (this.f7098o00oo00O == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f7098o00oo00O.size()) {
            if (this.f7098o00oo00O.o00oOoOo(i2).getGroupId() == i) {
                this.f7098o00oo00O.o00oOooo(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void o00oOoO0() {
        androidx.collection.o00ooO0<o00oOOoO, MenuItem> o00ooo02 = this.f7098o00oo00O;
        if (o00ooo02 != null) {
            o00ooo02.clear();
        }
        androidx.collection.o00ooO0<o00oOo00, SubMenu> o00ooo03 = this.f7097o00oo0;
        if (o00ooo03 != null) {
            o00ooo03.clear();
        }
    }

    public final void o00oOoOO(int i) {
        if (this.f7098o00oo00O == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f7098o00oo00O.size(); i2++) {
            if (this.f7098o00oo00O.o00oOoOo(i2).getItemId() == i) {
                this.f7098o00oo00O.o00oOooo(i2);
                return;
            }
        }
    }
}
