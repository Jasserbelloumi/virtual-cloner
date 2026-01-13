package o00oOoo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import o0.o00oOOo0;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo extends o00oo0O0 implements Menu {

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final o00oOOo0 f7083o00oo0OO;

    public o00oo(Context context, o00oOOo0 o00oooo02) {
        super(context);
        if (o00oooo02 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7083o00oo0OO = o00oooo02;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return o00oOo0O(this.f7083o00oo0OO.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return o00oOo0O(this.f7083o00oo0OO.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return o00oOo0O(this.f7083o00oo0OO.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return o00oOo0O(this.f7083o00oo0OO.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f7083o00oo0OO.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = o00oOo0O(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return o00oOo0o(this.f7083o00oo0OO.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return o00oOo0o(this.f7083o00oo0OO.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return o00oOo0o(this.f7083o00oo0OO.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return o00oOo0o(this.f7083o00oo0OO.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        o00oOoO0();
        this.f7083o00oo0OO.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f7083o00oo0OO.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return o00oOo0O(this.f7083o00oo0OO.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return o00oOo0O(this.f7083o00oo0OO.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f7083o00oo0OO.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f7083o00oo0OO.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f7083o00oo0OO.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f7083o00oo0OO.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        o00oOoO(i);
        this.f7083o00oo0OO.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        o00oOoOO(i);
        this.f7083o00oo0OO.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f7083o00oo0OO.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f7083o00oo0OO.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f7083o00oo0OO.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f7083o00oo0OO.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f7083o00oo0OO.size();
    }
}
