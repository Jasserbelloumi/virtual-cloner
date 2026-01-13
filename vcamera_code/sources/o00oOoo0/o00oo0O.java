package o00oOoo0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o0O000oo.o00oOo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O extends o00oo0O0 implements MenuItem {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f7084o00oo0O = "MenuItemWrapper";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Method f7085o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final o0.o00oOOoO f7086o00oo0OO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O000oo.o00oOo00 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final ActionProvider f7087o00oOo0O;

        public o00oOOo0(Context context, ActionProvider actionProvider) {
            super(context);
            this.f7087o00oOo0O = actionProvider;
        }

        @Override // o0O000oo.o00oOo00
        public boolean o00oOOoO() {
            return this.f7087o00oOo0O.hasSubMenu();
        }

        @Override // o0O000oo.o00oOo00
        public boolean o00oOo0o() {
            return this.f7087o00oOo0O.onPerformDefaultAction();
        }

        @Override // o0O000oo.o00oOo00
        public void o00oOoO0(SubMenu subMenu) {
            this.f7087o00oOo0O.onPrepareSubMenu(o00oo0O.this.o00oOo0o(subMenu));
        }

        @Override // o0O000oo.o00oOo00
        public View o00oOooO() {
            return this.f7087o00oOo0O.onCreateActionView();
        }
    }

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oOOo0 implements ActionProvider.VisibilityListener {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o00oOo00.o00oOOoO f7090o00oOoO0;

        public o00oOOoO(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // o0O000oo.o00oOo00
        public boolean o00oOo00() {
            return this.f7087o00oOo0O.isVisible();
        }

        @Override // o0O000oo.o00oOo00
        public View o00oOo0O(MenuItem menuItem) {
            return this.f7087o00oOo0O.onCreateActionView(menuItem);
        }

        @Override // o0O000oo.o00oOo00
        public boolean o00oOoO() {
            return this.f7087o00oOo0O.overridesItemVisibility();
        }

        @Override // o0O000oo.o00oOo00
        public void o00oOoOO() {
            this.f7087o00oOo0O.refreshVisibility();
        }

        @Override // o0O000oo.o00oOo00
        public void o00oOooo(o00oOo00.o00oOOoO o00ooooo2) {
            this.f7090o00oOoO0 = o00ooooo2;
            this.f7087o00oOo0O.setVisibilityListener(o00ooooo2 != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            o00oOo00.o00oOOoO o00ooooo2 = this.f7090o00oOoO0;
            if (o00ooooo2 != null) {
                o00ooooo2.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends FrameLayout implements o00oOoOo.o00oo0OO {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final CollapsibleActionView f7091o00oo0O0;

        public o00oOo00(View view) {
            super(view.getContext());
            this.f7091o00oo0O0 = (CollapsibleActionView) view;
            addView(view);
        }

        public View o00oOOo0() {
            return (View) this.f7091o00oo0O0;
        }

        @Override // o00oOoOo.o00oo0OO
        public void onActionViewCollapsed() {
            this.f7091o00oo0O0.onActionViewCollapsed();
        }

        @Override // o00oOoOo.o00oo0OO
        public void onActionViewExpanded() {
            this.f7091o00oo0O0.onActionViewExpanded();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements MenuItem.OnActionExpandListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f7092o00oOOo0;

        public o00oOo0O(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f7092o00oOOo0 = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f7092o00oOOo0.onMenuItemActionCollapse(o00oo0O.this.o00oOo0O(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f7092o00oOOo0.onMenuItemActionExpand(o00oo0O.this.o00oOo0O(menuItem));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements MenuItem.OnMenuItemClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f7095o00oo0O0;

        public o00oOoO(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f7095o00oo0O0 = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f7095o00oo0O0.onMenuItemClick(o00oo0O.this.o00oOo0O(menuItem));
        }
    }

    public o00oo0O(Context context, o0.o00oOOoO o00ooooo2) {
        super(context);
        if (o00ooooo2 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7086o00oo0OO = o00ooooo2;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f7086o00oo0OO.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f7086o00oo0OO.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        o0O000oo.o00oOo00 o00oOOo02 = this.f7086o00oo0OO.o00oOOo0();
        if (o00oOOo02 instanceof o00oOOo0) {
            return ((o00oOOo0) o00oOOo02).f7087o00oOo0O;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f7086o00oo0OO.getActionView();
        return actionView instanceof o00oOo00 ? ((o00oOo00) actionView).o00oOOo0() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7086o00oo0OO.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7086o00oo0OO.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7086o00oo0OO.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7086o00oo0OO.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f7086o00oo0OO.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f7086o00oo0OO.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f7086o00oo0OO.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7086o00oo0OO.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7086o00oo0OO.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7086o00oo0OO.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7086o00oo0OO.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7086o00oo0OO.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7086o00oo0OO.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return o00oOo0o(this.f7086o00oo0OO.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7086o00oo0OO.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f7086o00oo0OO.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7086o00oo0OO.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f7086o00oo0OO.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f7086o00oo0OO.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f7086o00oo0OO.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f7086o00oo0OO.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f7086o00oo0OO.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f7086o00oo0OO.isVisible();
    }

    public void o00oOoOo(boolean z) {
        try {
            if (this.f7085o00oo0O0 == null) {
                this.f7085o00oo0O0 = this.f7086o00oo0OO.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f7085o00oo0O0.invoke(this.f7086o00oo0OO, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        o00oOOoO o00ooooo2 = new o00oOOoO(this.f7096o00oOooo, actionProvider);
        o0.o00oOOoO o00ooooo3 = this.f7086o00oo0OO;
        if (actionProvider == null) {
            o00ooooo2 = null;
        }
        o00ooooo3.o00oOOoO(o00ooooo2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f7086o00oo0OO.setActionView(i);
        View actionView = this.f7086o00oo0OO.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f7086o00oo0OO.setActionView(new o00oOo00(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o00oOo00(view);
        }
        this.f7086o00oo0OO.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f7086o00oo0OO.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f7086o00oo0OO.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f7086o00oo0OO.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f7086o00oo0OO.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f7086o00oo0OO.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f7086o00oo0OO.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f7086o00oo0OO.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7086o00oo0OO.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7086o00oo0OO.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7086o00oo0OO.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7086o00oo0OO.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f7086o00oo0OO.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f7086o00oo0OO.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7086o00oo0OO.setOnActionExpandListener(onActionExpandListener != null ? new o00oOo0O(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7086o00oo0OO.setOnMenuItemClickListener(onMenuItemClickListener != null ? new o00oOoO(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f7086o00oo0OO.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f7086o00oo0OO.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f7086o00oo0OO.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f7086o00oo0OO.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f7086o00oo0OO.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7086o00oo0OO.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7086o00oo0OO.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f7086o00oo0OO.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f7086o00oo0OO.setVisible(z);
    }
}
