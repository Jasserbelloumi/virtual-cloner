package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o0O0o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0O0o00O;
import androidx.appcompat.widget.o0OOOO;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements o0O0o.o00oOOo0, View.OnClickListener, ActionMenuView.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f531o00ooO = 32;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f532o00ooO0o = "ActionMenuItemView";

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f533o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public CharSequence f534o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo0OO f535o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Drawable f536o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o0O0o00O f537o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oOoO.o00oOOoO f538o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oOOoO f539o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f540o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f541o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f542o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f543o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0o00O {
        public o00oOOo0() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public o00oOoo0.o00ooO0 o00oOOoO() {
            o00oOOoO o00ooooo2 = ActionMenuItemView.this.f539o00oo0oO;
            if (o00ooooo2 != null) {
                return o00ooooo2.o00oOOo0();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public boolean o00oOo00() {
            o00oOoo0.o00ooO0 o00oOOoO2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            o00oOoO.o00oOOoO o00ooooo2 = actionMenuItemView.f538o00oo0o0;
            return o00ooooo2 != null && o00ooooo2.o00oOOo0(actionMenuItemView.f535o00oo0O0) && (o00oOOoO2 = o00oOOoO()) != null && o00oOOoO2.o00oOOo0();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {
        public abstract o00oOoo0.o00ooO0 o00oOOo0();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f543o0O0o = o00oOoo0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i, 0);
        this.f541o00ooO00 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f542o00ooO0O = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f540o00ooO0 = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public o00oo0OO getItemData() {
        return this.f535o00oo0O0;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void initialize(o00oo0OO o00oo0oo, int i) {
        this.f535o00oo0O0 = o00oo0oo;
        setIcon(o00oo0oo.getIcon());
        setTitle(o00oo0oo.o00oOooo(this));
        setId(o00oo0oo.f686o00oOooo);
        setVisibility(o00oo0oo.isVisible() ? 0 : 8);
        setEnabled(o00oo0oo.isEnabled());
        if (o00oo0oo.hasSubMenu() && this.f537o00oo0o == null) {
            this.f537o00oo0o = new o00oOOo0();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.o00oOOo0
    public boolean o00oOo00() {
        return o00oOo0O();
    }

    public boolean o00oOo0O() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean o00oOoo0() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.o00oOOo0
    public boolean o00oOooO() {
        return o00oOo0O() && this.f535o00oo0O0.getIcon() == null;
    }

    public final void o00oOooo() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f534o00oo0O);
        if (this.f536o00oo0Oo != null && (!this.f535o00oo0O0.o00ooOOo() || (!this.f543o0O0o && !this.f533o00oo))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f534o00oo0O : null);
        CharSequence charSequence = this.f535o00oo0O0.f703o00ooOO0;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f535o00oo0O0.f691o00oo0O0;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f535o00oo0O0.f702o00ooOO;
        if (TextUtils.isEmpty(charSequence2)) {
            o0OOOO.o00oOOo0.o00oOOo0(this, z3 ? null : this.f535o00oo0O0.f691o00oo0O0);
        } else {
            o0OOOO.o00oOOo0.o00oOOo0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o00oOoO.o00oOOoO o00ooooo2 = this.f538o00oo0o0;
        if (o00ooooo2 != null) {
            o00ooooo2.o00oOOo0(this.f535o00oo0O0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f543o0O0o = o00oOoo0();
        o00oOooo();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean o00oOo0O2 = o00oOo0O();
        if (o00oOo0O2 && (i3 = this.f540o00ooO0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f541o00ooO00) : this.f541o00ooO00;
        if (mode != 1073741824 && this.f541o00ooO00 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (o00oOo0O2 || this.f536o00oo0Oo == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f536o00oo0Oo.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o0O0o00O o0o0o00o;
        if (this.f535o00oo0O0.hasSubMenu() && (o0o0o00o = this.f537o00oo0o) != null && o0o0o00o.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f533o00oo != z) {
            this.f533o00oo = z;
            o00oo0OO o00oo0oo = this.f535o00oo0O0;
            if (o00oo0oo != null) {
                o00oo0oo.o00oOo0O();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setIcon(Drawable drawable) {
        this.f536o00oo0Oo = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f542o00ooO0O;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        o00oOooo();
    }

    public void setItemInvoker(o00oOoO.o00oOOoO o00ooooo2) {
        this.f538o00oo0o0 = o00ooooo2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f540o00ooO0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(o00oOOoO o00ooooo2) {
        this.f539o00oo0oO = o00ooooo2;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setTitle(CharSequence charSequence) {
        this.f534o00oo0O = charSequence;
        o00oOooo();
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean showsIcon() {
        return true;
    }
}
