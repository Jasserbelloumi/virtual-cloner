package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.o00oo0O;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o0O0OOO0 {
    CharSequence getTitle();

    boolean o00oOOo0();

    boolean o00oOOoO();

    boolean o00oOo00();

    void o00oOo0O(Menu menu, o00oo0O.o00oOOo0 o00oooo02);

    boolean o00oOo0o();

    boolean o00oOoO();

    void o00oOoO0();

    boolean o00oOoOO();

    void o00oOoOo(SparseArray<Parcelable> sparseArray);

    void o00oOoo0(int i);

    boolean o00oOooO();

    void o00oOooo();

    void o00oo00O(SparseArray<Parcelable> sparseArray);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
