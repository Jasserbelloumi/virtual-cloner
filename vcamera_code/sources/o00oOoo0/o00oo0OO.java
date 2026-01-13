package o00oOoo0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o0.o00oOOoO;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o00oOo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0OO implements o00oOOoO {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f7099o00ooOo = 2;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f7100o00ooOo0 = 1;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f7101o00ooOoO = 4;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f7102o00ooOoo = 8;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f7103o00ooo00 = 16;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final int f7104o00oOooo;

    /* renamed from: o00oo  reason: collision with root package name */
    public Context f7105o00oo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final int f7106o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final int f7107o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Intent f7108o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public CharSequence f7109o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public CharSequence f7110o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public char f7111o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public char f7112o00oo0o;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public CharSequence f7116o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f7117o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public CharSequence f7118o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Drawable f7123o0O0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f7113o00oo0o0 = 4096;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f7114o00oo0oO = 4096;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public ColorStateList f7119o00ooO0o = null;

    /* renamed from: o00ooO  reason: collision with root package name */
    public PorterDuff.Mode f7115o00ooO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f7121o00ooOO0 = false;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f7120o00ooOO = false;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f7122o00ooOOo = 16;

    public o00oo0OO(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f7105o00oo = context;
        this.f7104o00oOooo = i2;
        this.f7107o00oo00O = i;
        this.f7106o00oo0 = i4;
        this.f7110o00oo0OO = charSequence;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7114o00oo0oO;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7112o00oo0o;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7116o00ooO0;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7107o00oo00O;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f7123o0O0o;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f7119o00ooO0o;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f7115o00ooO;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7108o00oo0O;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7104o00oOooo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7113o00oo0o0;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7111o00oo0Oo;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7106o00oo0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7110o00oo0OO;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7109o00oo0O0;
        return charSequence != null ? charSequence : this.f7110o00oo0OO;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7118o00ooO0O;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f7122o00ooOOo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f7122o00ooOOo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f7122o00ooOOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f7122o00ooOOo & 8) == 0;
    }

    @Override // o0.o00oOOoO
    public o00oOo00 o00oOOo0() {
        return null;
    }

    @Override // o0.o00oOOoO
    @oo0oO0
    public o00oOOoO o00oOOoO(o00oOo00 o00ooo002) {
        throw new UnsupportedOperationException();
    }

    @Override // o0.o00oOOoO
    public boolean o00oOo00() {
        return true;
    }

    public final void o00oOo0O() {
        Drawable drawable = this.f7123o0O0o;
        if (drawable != null) {
            if (this.f7121o00ooOO0 || this.f7120o00ooOO) {
                this.f7123o0O0o = drawable;
                Drawable mutate = drawable.mutate();
                this.f7123o0O0o = mutate;
                if (this.f7121o00ooOO0) {
                    o0O0O0Oo.o00oOOoO.o00oOoO(mutate, this.f7119o00ooO0o);
                }
                if (this.f7120o00ooOO) {
                    o0O0O0Oo.o00oOOoO.o00oOoOO(this.f7123o0O0o, this.f7115o00ooO);
                }
            }
        }
    }

    public boolean o00oOo0o() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f7117o00ooO00;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            Intent intent = this.f7108o00oo0O;
            if (intent != null) {
                this.f7105o00oo.startActivity(intent);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    /* renamed from: o00oOoO */
    public o00oOOoO setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    /* renamed from: o00oOoO0 */
    public o00oOOoO setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public o00oo0OO o00oOoOO(boolean z) {
        this.f7122o00ooOOo = (z ? 4 : 0) | (this.f7122o00ooOOo & (-5));
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    /* renamed from: o00oOoOo */
    public o00oOOoO setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // o0.o00oOOoO
    public boolean o00oOooO() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f7112o00oo0o = Character.toLowerCase(c);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f7112o00oo0o = Character.toLowerCase(c);
        this.f7114o00oo0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f7122o00ooOOo = (z ? 1 : 0) | (this.f7122o00ooOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f7122o00ooOOo = (z ? 2 : 0) | (this.f7122o00ooOOo & (-3));
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public o00oOOoO setContentDescription(CharSequence charSequence) {
        this.f7116o00ooO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f7122o00ooOOo = (z ? 16 : 0) | (this.f7122o00ooOOo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f7123o0O0o = o0.getDrawable(this.f7105o00oo, i);
        o00oOo0O();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7123o0O0o = drawable;
        o00oOo0O();
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setIconTintList(@o0OO00OO ColorStateList colorStateList) {
        this.f7119o00ooO0o = colorStateList;
        this.f7121o00ooOO0 = true;
        o00oOo0O();
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7115o00ooO = mode;
        this.f7120o00ooOO = true;
        o00oOo0O();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7108o00oo0O = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f7111o00oo0Oo = c;
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setNumericShortcut(char c, int i) {
        this.f7111o00oo0Oo = c;
        this.f7113o00oo0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7117o00ooO00 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f7111o00oo0Oo = c;
        this.f7112o00oo0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f7111o00oo0Oo = c;
        this.f7113o00oo0o0 = KeyEvent.normalizeMetaState(i);
        this.f7112o00oo0o = Character.toLowerCase(c2);
        this.f7114o00oo0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f7110o00oo0OO = this.f7105o00oo.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7110o00oo0OO = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7109o00oo0O0 = charSequence;
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public o00oOOoO setTooltipText(CharSequence charSequence) {
        this.f7118o00ooO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f7122o00ooOOo = (this.f7122o00ooOOo & 8) | (z ? 0 : 8);
        return this;
    }
}
