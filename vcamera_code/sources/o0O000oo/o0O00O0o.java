package o0O000oo;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public final class o0O00O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10530o00oOOo0 = "MenuItemCompat";
    @Deprecated

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10531o00oOOoO = 0;
    @Deprecated

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10532o00oOo00 = 1;
    @Deprecated

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10533o00oOo0O = 4;
    @Deprecated

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f10534o00oOo0o = 8;
    @Deprecated

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10535o00oOooO = 2;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements MenuItem.OnActionExpandListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f10536o00oOOo0;

        public o00oOOo0(o00oOo00 o00ooo002) {
            this.f10536o00oOOo0 = o00ooo002;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10536o00oOOo0.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10536o00oOOo0.onMenuItemActionExpand(menuItem);
        }
    }

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @o00oOooO.o0O0O0Oo
        public static CharSequence o00oOOoO(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @o00oOooO.o0O0O0Oo
        public static ColorStateList o00oOo00(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0O(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @o00oOooO.o0O0O0Oo
        public static CharSequence o00oOo0o(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOoO(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOoO0(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOoOO(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOoOo(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOoo0(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @o00oOooO.o0O0O0Oo
        public static PorterDuff.Mode o00oOooO(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oOooo(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @o00oOooO.o0O0O0Oo
        public static MenuItem o00oo00O(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oOo00 {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    public static boolean o00oOOo0(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean o00oOOoO(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @o00oOooO.o0OO00OO
    public static o0O000oo.o00oOo00 o00oOo00(@o00oOooO.oo0oO0 MenuItem menuItem) {
        if (menuItem instanceof o0.o00oOOoO) {
            return ((o0.o00oOOoO) menuItem).o00oOOo0();
        }
        return null;
    }

    public static int o00oOo0O(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getAlphabeticModifiers() : o00oOOoO.o00oOOo0(menuItem);
    }

    @o00oOooO.o0OO00OO
    public static CharSequence o00oOo0o(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getContentDescription() : o00oOOoO.o00oOOoO(menuItem);
    }

    @o00oOooO.o0OO00OO
    public static PorterDuff.Mode o00oOoO(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getIconTintMode() : o00oOOoO.o00oOooO(menuItem);
    }

    @o00oOooO.o0OO00OO
    public static ColorStateList o00oOoO0(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getIconTintList() : o00oOOoO.o00oOo00(menuItem);
    }

    public static int o00oOoOO(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getNumericModifiers() : o00oOOoO.o00oOo0O(menuItem);
    }

    @o00oOooO.o0OO00OO
    public static CharSequence o00oOoOo(@o00oOooO.oo0oO0 MenuItem menuItem) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).getTooltipText() : o00oOOoO.o00oOo0o(menuItem);
    }

    @Deprecated
    public static boolean o00oOoo0(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Deprecated
    public static View o00oOooO(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    @o00oOooO.o0OO00OO
    public static MenuItem o00oOooo(@o00oOooO.oo0oO0 MenuItem menuItem, @o00oOooO.o0OO00OO o0O000oo.o00oOo00 o00ooo002) {
        return menuItem instanceof o0.o00oOOoO ? ((o0.o00oOOoO) menuItem).o00oOOoO(o00ooo002) : menuItem;
    }

    public static void o00oo(@o00oOooO.oo0oO0 MenuItem menuItem, @o00oOooO.o0OO00OO CharSequence charSequence) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setTooltipText(charSequence);
        } else {
            o00oOOoO.o00oo00O(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem o00oo0(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    @Deprecated
    public static MenuItem o00oo00O(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    public static void o00oo0O(@o00oOooO.oo0oO0 MenuItem menuItem, @o00oOooO.o0OO00OO ColorStateList colorStateList) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setIconTintList(colorStateList);
        } else {
            o00oOOoO.o00oOoOO(menuItem, colorStateList);
        }
    }

    public static void o00oo0O0(@o00oOooO.oo0oO0 MenuItem menuItem, @o00oOooO.o0OO00OO CharSequence charSequence) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setContentDescription(charSequence);
        } else {
            o00oOOoO.o00oOoO(menuItem, charSequence);
        }
    }

    public static void o00oo0OO(@o00oOooO.oo0oO0 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setAlphabeticShortcut(c, i);
        } else {
            o00oOOoO.o00oOoO0(menuItem, c, i);
        }
    }

    public static void o00oo0Oo(@o00oOooO.oo0oO0 MenuItem menuItem, @o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setIconTintMode(mode);
        } else {
            o00oOOoO.o00oOoOo(menuItem, mode);
        }
    }

    @Deprecated
    public static MenuItem o00oo0o(MenuItem menuItem, o00oOo00 o00ooo002) {
        return menuItem.setOnActionExpandListener(new o00oOOo0(o00ooo002));
    }

    public static void o00oo0o0(@o00oOooO.oo0oO0 MenuItem menuItem, char c, int i) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setNumericShortcut(c, i);
        } else {
            o00oOOoO.o00oOoo0(menuItem, c, i);
        }
    }

    public static void o00oo0oO(@o00oOooO.oo0oO0 MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof o0.o00oOOoO) {
            ((o0.o00oOOoO) menuItem).setShortcut(c, c2, i, i2);
        } else {
            o00oOOoO.o00oOooo(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    public static void o0O0o(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
