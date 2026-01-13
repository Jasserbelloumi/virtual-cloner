package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o0O0o;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o00oOo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o00oo0OO implements o0.o00oOOoO {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f677o0 = 4;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f678o00oooo = 3;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f679o00oooo0 = "MenuItemImpl";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int f680o00ooooO = 1;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f681o00ooooo = 2;

    /* renamed from: o0O000  reason: collision with root package name */
    public static final int f682o0O000 = 0;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f683o0O00000 = 8;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f684o0O0000O = 16;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final int f685o0O0000o = 32;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final int f686o00oOooo;

    /* renamed from: o00oo  reason: collision with root package name */
    public Drawable f687o00oo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final int f688o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final int f689o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public CharSequence f690o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public CharSequence f691o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final int f692o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Intent f693o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public char f695o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public char f696o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f697o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oOoO f698o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o00ooO0 f700o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Runnable f701o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public CharSequence f702o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public CharSequence f703o00ooOO0;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f709o00ooo0;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public View f711o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public o0O000oo.o00oOo00 f712o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f713o00oooO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f715o00oooOo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f694o00oo0o = 4096;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f716o0O0o = 4096;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f699o00ooO00 = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public ColorStateList f704o00ooOOo = null;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public PorterDuff.Mode f706o00ooOo0 = null;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f705o00ooOo = false;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f707o00ooOoO = false;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f708o00ooOoo = false;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f710o00ooo00 = 16;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public boolean f714o00oooOO = false;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOo00.o00oOOoO {
        public o00oOOo0() {
        }

        @Override // o0O000oo.o00oOo00.o00oOOoO
        public void onActionProviderVisibilityChanged(boolean z) {
            o00oo0OO o00oo0oo = o00oo0OO.this;
            o00oo0oo.f698o00ooO0.onItemVisibleChanged(o00oo0oo);
        }
    }

    public o00oo0OO(o00oOoO o00oooo2, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f698o00ooO0 = o00oooo2;
        this.f686o00oOooo = i2;
        this.f689o00oo00O = i;
        this.f688o00oo0 = i3;
        this.f692o00oo0OO = i4;
        this.f691o00oo0O0 = charSequence;
        this.f709o00ooo0 = i5;
    }

    public static void o00oOo0o(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f709o00ooo0 & 8) == 0) {
            return false;
        }
        if (this.f711o00ooo0O == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f713o00oooO;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f698o00ooO0.collapseItemActionView(this);
        }
        return false;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean expandActionView() {
        if (o00oo00O()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f713o00oooO;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f698o00ooO0.expandItemActionView(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public View getActionView() {
        View view = this.f711o00ooo0O;
        if (view != null) {
            return view;
        }
        o0O000oo.o00oOo00 o00ooo002 = this.f712o00ooo0o;
        if (o00ooo002 != null) {
            View o00oOo0O2 = o00ooo002.o00oOo0O(this);
            this.f711o00ooo0O = o00oOo0O2;
            return o00oOo0O2;
        }
        return null;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f716o0O0o;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f696o00oo0oO;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f703o00ooOO0;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f689o00oo00O;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f687o00oo;
        if (drawable != null) {
            return o00oOoO0(drawable);
        }
        if (this.f699o00ooO00 != 0) {
            Drawable o00oOOoO2 = o00oOo0o.o00oOo00.o00oOOoO(this.f698o00ooO0.getContext(), this.f699o00ooO00);
            this.f699o00ooO00 = 0;
            this.f687o00oo = o00oOOoO2;
            return o00oOoO0(o00oOOoO2);
        }
        return null;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f704o00ooOOo;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f706o00ooOo0;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f693o00oo0Oo;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f686o00oOooo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f715o00oooOo;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f694o00oo0o;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f695o00oo0o0;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f688o00oo0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f700o00ooO0O;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f691o00oo0O0;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f690o00oo0O;
        return charSequence != null ? charSequence : this.f691o00oo0O0;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f702o00ooOO;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f700o00ooO0O != null;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f714o00oooOO;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f710o00ooo00 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f710o00ooo00 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f710o00ooo00 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        o0O000oo.o00oOo00 o00ooo002 = this.f712o00ooo0o;
        return (o00ooo002 == null || !o00ooo002.o00oOoO()) ? (this.f710o00ooo00 & 8) == 0 : (this.f710o00ooo00 & 8) == 0 && this.f712o00ooo0o.o00oOo00();
    }

    @Override // o0.o00oOOoO
    public o0O000oo.o00oOo00 o00oOOo0() {
        return this.f712o00ooo0o;
    }

    @Override // o0.o00oOOoO
    @oo0oO0
    public o0.o00oOOoO o00oOOoO(o0O000oo.o00oOo00 o00ooo002) {
        o0O000oo.o00oOo00 o00ooo003 = this.f712o00ooo0o;
        if (o00ooo003 != null) {
            o00ooo003.o00oOoOo();
        }
        this.f711o00ooo0O = null;
        this.f712o00ooo0o = o00ooo002;
        this.f698o00ooO0.onItemsChanged(true);
        o0O000oo.o00oOo00 o00ooo004 = this.f712o00ooo0o;
        if (o00ooo004 != null) {
            o00ooo004.o00oOooo(new o00oOOo0());
        }
        return this;
    }

    @Override // o0.o00oOOoO
    public boolean o00oOo00() {
        return (this.f709o00ooo0 & 2) == 2;
    }

    public void o00oOo0O() {
        this.f698o00ooO0.onItemActionRequestChanged(this);
    }

    public Runnable o00oOoO() {
        return this.f701o00ooO0o;
    }

    public final Drawable o00oOoO0(Drawable drawable) {
        if (drawable != null && this.f708o00ooOoo && (this.f705o00ooOo || this.f707o00ooOoO)) {
            drawable = drawable.mutate();
            if (this.f705o00ooOo) {
                o0O0O0Oo.o00oOOoO.o00oOoO(drawable, this.f704o00ooOOo);
            }
            if (this.f707o00ooOoO) {
                o0O0O0Oo.o00oOOoO.o00oOoOO(drawable, this.f706o00ooOo0);
            }
            this.f708o00ooOoo = false;
        }
        return drawable;
    }

    public int o00oOoOO() {
        return this.f692o00oo0OO;
    }

    public char o00oOoOo() {
        return this.f698o00ooO0.isQwertyMode() ? this.f696o00oo0oO : this.f695o00oo0o0;
    }

    public String o00oOoo0() {
        int i;
        char o00oOoOo2 = o00oOoOo();
        if (o00oOoOo2 == 0) {
            return "";
        }
        Resources resources = this.f698o00ooO0.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f698o00ooO0.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i2 = this.f698o00ooO0.isQwertyMode() ? this.f716o0O0o : this.f694o00oo0o;
        o00oOo0o(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        o00oOo0o(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        o00oOo0o(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        o00oOo0o(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        o00oOo0o(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        o00oOo0o(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (o00oOoOo2 == '\b') {
            i = R.string.abc_menu_delete_shortcut_label;
        } else if (o00oOoOo2 == '\n') {
            i = R.string.abc_menu_enter_shortcut_label;
        } else if (o00oOoOo2 != ' ') {
            sb.append(o00oOoOo2);
            return sb.toString();
        } else {
            i = R.string.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    @Override // o0.o00oOOoO
    public boolean o00oOooO() {
        return (o00oOo00() || o00oo0O()) ? false : true;
    }

    public CharSequence o00oOooo(o0O0o.o00oOOo0 o00oooo02) {
        return (o00oooo02 == null || !o00oooo02.prefersCondensedTitle()) ? this.f691o00oo0O0 : getTitleCondensed();
    }

    public void o00oo(boolean z) {
        this.f710o00ooo00 = (z ? 4 : 0) | (this.f710o00ooo00 & (-5));
    }

    public boolean o00oo0() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f697o00ooO;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            o00oOoO o00oooo2 = this.f698o00ooO0;
            if (o00oooo2.dispatchMenuItemSelected(o00oooo2, this)) {
                return true;
            }
            Runnable runnable = this.f701o00ooO0o;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f693o00oo0Oo != null) {
                try {
                    this.f698o00ooO0.getContext().startActivity(this.f693o00oo0Oo);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            o0O000oo.o00oOo00 o00ooo002 = this.f712o00ooo0o;
            return o00ooo002 != null && o00ooo002.o00oOo0o();
        }
        return true;
    }

    public boolean o00oo00O() {
        o0O000oo.o00oOo00 o00ooo002;
        if ((this.f709o00ooo0 & 8) != 0) {
            if (this.f711o00ooo0O == null && (o00ooo002 = this.f712o00ooo0o) != null) {
                this.f711o00ooo0O = o00ooo002.o00oOo0O(this);
            }
            return this.f711o00ooo0O != null;
        }
        return false;
    }

    public boolean o00oo0O() {
        return (this.f709o00ooo0 & 1) == 1;
    }

    public boolean o00oo0O0() {
        return (this.f710o00ooo00 & 4) != 0;
    }

    public boolean o00oo0OO() {
        return (this.f710o00ooo00 & 32) == 32;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    /* renamed from: o00oo0Oo */
    public o0.o00oOOoO setActionView(int i) {
        Context context = this.f698o00ooO0.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    public void o00oo0o(boolean z) {
        this.f714o00oooOO = z;
        this.f698o00ooO0.onItemsChanged(false);
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    /* renamed from: o00oo0o0 */
    public o0.o00oOOoO setActionView(View view) {
        int i;
        this.f711o00ooo0O = view;
        this.f712o00ooo0o = null;
        if (view != null && view.getId() == -1 && (i = this.f686o00oOooo) > 0) {
            view.setId(i);
        }
        this.f698o00ooO0.onItemActionRequestChanged(this);
        return this;
    }

    public MenuItem o00oo0oO(Runnable runnable) {
        this.f701o00ooO0o = runnable;
        return this;
    }

    public boolean o00ooO(boolean z) {
        int i = this.f710o00ooo00;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f710o00ooo00 = i2;
        return i != i2;
    }

    public void o00ooO0(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f715o00oooOo = contextMenuInfo;
    }

    public void o00ooO00(boolean z) {
        this.f710o00ooo00 = z ? this.f710o00ooo00 | 32 : this.f710o00ooo00 & (-33);
    }

    @oo0oO0
    public o0.o00oOOoO o00ooO0O(int i) {
        setShowAsAction(i);
        return this;
    }

    public void o00ooO0o(o00ooO0 o00ooo02) {
        this.f700o00ooO0O = o00ooo02;
        o00ooo02.setHeaderTitle(this.f691o00oo0O0);
    }

    public boolean o00ooOO() {
        return this.f698o00ooO0.isShortcutsVisible() && o00oOoOo() != 0;
    }

    public boolean o00ooOO0() {
        return this.f698o00ooO0.getOptionalIconsVisible();
    }

    public boolean o00ooOOo() {
        return (this.f709o00ooo0 & 4) == 4;
    }

    public void o0O0o(boolean z) {
        int i = this.f710o00ooo00;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f710o00ooo00 = i2;
        if (i != i2) {
            this.f698o00ooO0.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f696o00oo0oO == c) {
            return this;
        }
        this.f696o00oo0oO = Character.toLowerCase(c);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f696o00oo0oO == c && this.f716o0O0o == i) {
            return this;
        }
        this.f696o00oo0oO = Character.toLowerCase(c);
        this.f716o0O0o = KeyEvent.normalizeMetaState(i);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f710o00ooo00;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f710o00ooo00 = i2;
        if (i != i2) {
            this.f698o00ooO0.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f710o00ooo00 & 4) != 0) {
            this.f698o00ooO0.setExclusiveItemChecked(this);
        } else {
            o0O0o(z);
        }
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public o0.o00oOOoO setContentDescription(CharSequence charSequence) {
        this.f703o00ooOO0 = charSequence;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f710o00ooo00 = z ? this.f710o00ooo00 | 16 : this.f710o00ooo00 & (-17);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f687o00oo = null;
        this.f699o00ooO00 = i;
        this.f708o00ooOoo = true;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f699o00ooO00 = 0;
        this.f687o00oo = drawable;
        this.f708o00ooOoo = true;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setIconTintList(@o0OO00OO ColorStateList colorStateList) {
        this.f704o00ooOOo = colorStateList;
        this.f705o00ooOo = true;
        this.f708o00ooOoo = true;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f706o00ooOo0 = mode;
        this.f707o00ooOoO = true;
        this.f708o00ooOoo = true;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f693o00oo0Oo = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f695o00oo0o0 == c) {
            return this;
        }
        this.f695o00oo0o0 = c;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f695o00oo0o0 == c && this.f694o00oo0o == i) {
            return this;
        }
        this.f695o00oo0o0 = c;
        this.f694o00oo0o = KeyEvent.normalizeMetaState(i);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f713o00oooO = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f697o00ooO = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f695o00oo0o0 = c;
        this.f696o00oo0oO = Character.toLowerCase(c2);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f695o00oo0o0 = c;
        this.f694o00oo0o = KeyEvent.normalizeMetaState(i);
        this.f696o00oo0oO = Character.toLowerCase(c2);
        this.f716o0O0o = KeyEvent.normalizeMetaState(i2);
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f709o00ooo0 = i;
        this.f698o00ooO0.onItemActionRequestChanged(this);
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f698o00ooO0.getContext().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f691o00oo0O0 = charSequence;
        this.f698o00ooO0.onItemsChanged(false);
        o00ooO0 o00ooo02 = this.f700o00ooO0O;
        if (o00ooo02 != null) {
            o00ooo02.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f690o00oo0O = charSequence;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // o0.o00oOOoO, android.view.MenuItem
    @oo0oO0
    public o0.o00oOOoO setTooltipText(CharSequence charSequence) {
        this.f702o00ooOO = charSequence;
        this.f698o00ooO0.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (o00ooO(z)) {
            this.f698o00ooO0.onItemVisibleChanged(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f691o00oo0O0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
