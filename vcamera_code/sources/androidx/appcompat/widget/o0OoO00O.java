package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.o0O000;
/* loaded from: classes.dex */
public class o0OoO00O extends PopupWindow {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f1406o00oOOoO = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f1407o00oOOo0;

    public o0OoO00O(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.o0O000Oo int i) {
        super(context, attributeSet, i);
        o00oOOo0(context, attributeSet, i, 0);
    }

    public o0OoO00O(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.o0O000Oo int i, @o00oOooO.o0OOO0OO int i2) {
        super(context, attributeSet, i, i2);
        o00oOOo0(context, attributeSet, i, i2);
    }

    public final void o00oOOo0(Context context, AttributeSet attributeSet, int i, int i2) {
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, R.styleable.PopupWindow, i, i2);
        int i3 = R.styleable.PopupWindow_overlapAnchor;
        if (o00ooOo2.o00ooOO0(i3)) {
            o00oOOoO(o00ooOo2.o00oOOo0(i3, false));
        }
        setBackgroundDrawable(o00ooOo2.o00oOoO(R.styleable.PopupWindow_android_popupBackground));
        o00ooOo2.o00ooOoo();
    }

    public final void o00oOOoO(boolean z) {
        if (f1406o00oOOoO) {
            this.f1407o00oOOo0 = z;
        } else {
            o0O000.o00oOOoO.o00oOo00(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1406o00oOOoO && this.f1407o00oOOo0) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1406o00oOOoO && this.f1407o00oOOo0) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1406o00oOOoO && this.f1407o00oOOo0) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
