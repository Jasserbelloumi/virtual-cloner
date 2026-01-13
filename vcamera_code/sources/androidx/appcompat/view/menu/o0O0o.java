package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o0O0o {

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        o00oo0OO getItemData();

        void initialize(o00oo0OO o00oo0oo, int i);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(o00oOoO o00oooo2);
}
