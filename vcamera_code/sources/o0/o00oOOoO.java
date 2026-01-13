package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o00oOOoO extends MenuItem {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f6869o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f6870o00oOoO0 = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f6871o00oOoOO = 2;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f6872o00oOoOo = 4;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f6873o00oOoo0 = 8;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @o0OO00OO
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @o0OO00OO
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @o0OO00OO
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @o0OO00OO
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @o0OO00OO
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @o0OO00OO
    o0O000oo.o00oOo00 o00oOOo0();

    @oo0oO0
    o00oOOoO o00oOOoO(@o0OO00OO o0O000oo.o00oOo00 o00ooo002);

    boolean o00oOo00();

    boolean o00oOooO();

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setActionView(@o0OO00OO View view);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    @oo0oO0
    o00oOOoO setContentDescription(@o0OO00OO CharSequence charSequence);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setIconTintList(@o0OO00OO ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setIconTintMode(@o0OO00OO PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    @oo0oO0
    MenuItem setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    @oo0oO0
    o00oOOoO setTooltipText(@o0OO00OO CharSequence charSequence);
}
