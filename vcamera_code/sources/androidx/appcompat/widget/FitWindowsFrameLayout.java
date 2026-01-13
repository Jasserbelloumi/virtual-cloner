package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.o0O0o00;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements o0O0o00 {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0O0o00.o00oOOo0 f917o00oo0O0;

    public FitWindowsFrameLayout(@o00oOooO.oo0oO0 Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        o0O0o00.o00oOOo0 o00oooo02 = this.f917o00oo0O0;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.o0O0o00
    public void setOnFitSystemWindowsListener(o0O0o00.o00oOOo0 o00oooo02) {
        this.f917o00oo0O0 = o00oooo02;
    }
}
