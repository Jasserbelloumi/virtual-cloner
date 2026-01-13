package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
/* loaded from: classes.dex */
public abstract class o00oOOo0 extends ViewGroup {

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f1025o00ooO00 = 200;

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f1026o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f1027o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOOoO f1028o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public ActionMenuView f1029o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f1030o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ActionMenuPresenter f1031o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o0O000oo.o0OO0oO0 f1032o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f1033o0O0o;

    /* renamed from: androidx.appcompat.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0007o00oOOo0 implements Runnable {
        public RunnableC0007o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOOo0.this.o00oo0OO();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o0O000oo.o0OO0oO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f1035o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f1036o00oOOoO;

        public o00oOOoO() {
        }

        @Override // o0O000oo.o0OO0oO
        public void o00oOOo0(View view) {
            this.f1035o00oOOo0 = true;
        }

        @Override // o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            if (this.f1035o00oOOo0) {
                return;
            }
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.f1032o00oo0oO = null;
            o00oOOo0.super.setVisibility(this.f1036o00oOOoO);
        }

        @Override // o0O000oo.o0OO0oO
        public void o00oOo00(View view) {
            o00oOOo0.super.setVisibility(0);
            this.f1035o00oOOo0 = false;
        }

        public o00oOOoO o00oOooO(o0O000oo.o0OO0oO0 o0oo0oo0, int i) {
            o00oOOo0.this.f1032o00oo0oO = o0oo0oo0;
            this.f1036o00oOOoO = i;
            return this;
        }
    }

    public o00oOOo0(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1028o00oo0O0 = new o00oOOoO();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1027o00oo0O = context;
        } else {
            this.f1027o00oo0O = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int o00oOoo0(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        return this.f1032o00oo0oO != null ? this.f1028o00oo0O0.f1036o00oOOoO : getVisibility();
    }

    public int getContentHeight() {
        return this.f1030o00oo0o;
    }

    public void o00oOo00(int i) {
        o00oo0(i, 200L).o00ooO0();
    }

    public void o00oOo0O() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o00oo0O();
        }
    }

    public boolean o00oOo0o() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00oo0o();
        }
        return false;
    }

    public boolean o00oOoO() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00oo();
        }
        return false;
    }

    public boolean o00oOoO0() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o0O0o();
        }
        return false;
    }

    public boolean o00oOoOO() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        return actionMenuPresenter != null && actionMenuPresenter.o00ooO00();
    }

    public int o00oOoOo(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public boolean o00oOooO() {
        return o00oOoOO() && getVisibility() == 0;
    }

    public int o00oOooo(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public o0O000oo.o0OO0oO0 o00oo0(int i, long j) {
        o0O000oo.o0OO0oO0 o00oOOoO2;
        o0O000oo.o0OO0oO0 o0oo0oo0 = this.f1032o00oo0oO;
        if (o0oo0oo0 != null) {
            o0oo0oo0.o00oOooO();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            o00oOOoO2 = o0O000oo.o0O0o00O.o00oOoO0(this).o00oOOoO(1.0f);
        } else {
            o00oOOoO2 = o0O000oo.o0O0o00O.o00oOoO0(this).o00oOOoO(0.0f);
        }
        o00oOOoO2.o00oo0o0(j);
        o00oOOoO2.o00oo0oO(this.f1028o00oo0O0.o00oOooO(o00oOOoO2, i));
        return o00oOOoO2;
    }

    public void o00oo00O() {
        post(new RunnableC0007o00oOOo0());
    }

    public boolean o00oo0OO() {
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.o00ooOo0();
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1031o00oo0o0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o00ooO0(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1026o00oo = false;
        }
        if (!this.f1026o00oo) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1026o00oo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1026o00oo = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1033o0O0o = false;
        }
        if (!this.f1033o0O0o) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1033o0O0o = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1033o0O0o = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1030o00oo0o = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            o0O000oo.o0OO0oO0 o0oo0oo0 = this.f1032o00oo0oO;
            if (o0oo0oo0 != null) {
                o0oo0oo0.o00oOooO();
            }
            super.setVisibility(i);
        }
    }
}
