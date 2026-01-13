package o00oOoo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o0.o00oOo00;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00ooO extends o00oo implements SubMenu {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo00 f7124o00oo0O0;

    public o00ooO(Context context, o00oOo00 o00ooo002) {
        super(context, o00ooo002);
        this.f7124o00oo0O0 = o00ooo002;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f7124o00oo0O0.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return o00oOo0O(this.f7124o00oo0O0.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f7124o00oo0O0.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f7124o00oo0O0.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f7124o00oo0O0.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f7124o00oo0O0.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f7124o00oo0O0.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f7124o00oo0O0.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f7124o00oo0O0.setIcon(drawable);
        return this;
    }
}
