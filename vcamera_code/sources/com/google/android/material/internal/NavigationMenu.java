package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenu extends o00oOoO {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO, android.view.Menu
    @oo0oO0
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o00oo0OO o00oo0oo = (o00oo0OO) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, o00oo0oo);
        o00oo0oo.o00ooO0o(navigationSubMenu);
        return navigationSubMenu;
    }
}
