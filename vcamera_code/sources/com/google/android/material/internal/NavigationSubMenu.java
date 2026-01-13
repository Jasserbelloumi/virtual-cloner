package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0OO;
import androidx.appcompat.view.menu.o00ooO0;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationSubMenu extends o00ooO0 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, o00oo0OO o00oo0oo) {
        super(context, navigationMenu, o00oo0oo);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((o00oOoO) getParentMenu()).onItemsChanged(z);
    }
}
