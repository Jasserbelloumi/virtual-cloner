package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: o00oo  reason: collision with root package name */
    public o00oOOo0 f909o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public TypedValue f910o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public TypedValue f911o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public TypedValue f912o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public TypedValue f913o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public TypedValue f914o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public TypedValue f915o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Rect f916o0O0o;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public ContentFrameLayout(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f916o0O0o = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f913o00oo0o == null) {
            this.f913o00oo0o = new TypedValue();
        }
        return this.f913o00oo0o;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f915o00oo0oO == null) {
            this.f915o00oo0oO = new TypedValue();
        }
        return this.f915o00oo0oO;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f912o00oo0Oo == null) {
            this.f912o00oo0Oo = new TypedValue();
        }
        return this.f912o00oo0Oo;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f914o00oo0o0 == null) {
            this.f914o00oo0o0 = new TypedValue();
        }
        return this.f914o00oo0o0;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f911o00oo0O0 == null) {
            this.f911o00oo0O0 = new TypedValue();
        }
        return this.f911o00oo0O0;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f910o00oo0O == null) {
            this.f910o00oo0O = new TypedValue();
        }
        return this.f910o00oo0O;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOOo0(Rect rect) {
        fitSystemWindows(rect);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOOoO(int i, int i2, int i3, int i4) {
        this.f916o0O0o.set(i, i2, i3, i4);
        if (o0O000oo.o0O0o00O.o0O0Oooo(this)) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00oOOo0 o00oooo02 = this.f909o00oo;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oOOo0 o00oooo02 = this.f909o00oo;
        if (o00oooo02 != null) {
            o00oooo02.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(o00oOOo0 o00oooo02) {
        this.f909o00oo = o00oooo02;
    }
}
