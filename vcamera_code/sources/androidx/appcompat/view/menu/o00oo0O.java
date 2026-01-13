package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o00oo0O {

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOOo0(@oo0oO0 o00oOoO o00oooo2);

        void onCloseMenu(@oo0oO0 o00oOoO o00oooo2, boolean z);
    }

    boolean collapseItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo);

    boolean expandItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo);

    boolean flagActionItems();

    int getId();

    o0O0o getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, o00oOoO o00oooo2);

    void onCloseMenu(o00oOoO o00oooo2, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(o00ooO0 o00ooo02);

    void setCallback(o00oOOo0 o00oooo02);

    void updateMenuView(boolean z);
}
