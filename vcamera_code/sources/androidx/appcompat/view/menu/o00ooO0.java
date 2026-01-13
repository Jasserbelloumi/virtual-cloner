package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.o00oOoO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00ooO0 extends o00oOoO implements SubMenu {
    private o00oo0OO mItem;
    private o00oOoO mParentMenu;

    public o00ooO0(Context context, o00oOoO o00oooo2, o00oo0OO o00oo0oo) {
        super(context);
        this.mParentMenu = o00oooo2;
        this.mItem = o00oo0oo;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean collapseItemActionView(o00oo0OO o00oo0oo) {
        return this.mParentMenu.collapseItemActionView(o00oo0oo);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean dispatchMenuItemSelected(@oo0oO0 o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
        return super.dispatchMenuItemSelected(o00oooo2, menuItem) || this.mParentMenu.dispatchMenuItemSelected(o00oooo2, menuItem);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean expandItemActionView(o00oo0OO o00oo0oo) {
        return this.mParentMenu.expandItemActionView(o00oo0oo);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public String getActionViewStatesKey() {
        o00oo0OO o00oo0oo = this.mItem;
        int i = o00oo0oo != null ? o00oo0oo.f686o00oOooo : 0;
        if (i == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + i;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public o00oOoO getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public void setCallback(o00oOoO.o00oOOo0 o00oooo02) {
        this.mParentMenu.setCallback(o00oooo02);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO, o0.o00oOOo0, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }
}
