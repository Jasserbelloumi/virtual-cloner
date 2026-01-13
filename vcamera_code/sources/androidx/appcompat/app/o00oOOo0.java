package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.fragment.app.o0O0oo0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOoOo.o00oo0;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oOOo0 {
    @Deprecated

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f363o00oOOo0 = 0;
    @Deprecated

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f364o00oOOoO = 1;
    @Deprecated

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f365o00oOo00 = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f366o00oOo0O = 2;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f367o00oOo0o = 4;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f368o00oOoO = 16;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f369o00oOoO0 = 8;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f370o00oOooO = 1;

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0004o00oOOo0 {
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends ViewGroup.MarginLayoutParams {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f371o00oOOo0;

        public o00oOOoO(int i) {
            this(-2, -1, i);
        }

        public o00oOOoO(int i, int i2) {
            super(i, i2);
            this.f371o00oOOo0 = 8388627;
        }

        public o00oOOoO(int i, int i2, int i3) {
            super(i, i2);
            this.f371o00oOOo0 = i3;
        }

        public o00oOOoO(@oo0oO0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f371o00oOOo0 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.f371o00oOOo0 = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public o00oOOoO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f371o00oOOo0 = 0;
        }

        public o00oOOoO(o00oOOoO o00ooooo2) {
            super((ViewGroup.MarginLayoutParams) o00ooooo2);
            this.f371o00oOOo0 = 0;
            this.f371o00oOOo0 = o00ooooo2.f371o00oOOo0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean onNavigationItemSelected(int i, long j);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oo0 {
        void o00oOOo0(o00oo00O o00oo00o, o0O0oo0o o0o0oo0o);

        void o00oOOoO(o00oo00O o00oo00o, o0O0oo0o o0o0oo0o);

        void o00oOo00(o00oo00O o00oo00o, o0O0oo0o o0o0oo0o);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f372o00oOOo0 = -1;

        public abstract CharSequence o00oOOo0();

        public abstract View o00oOOoO();

        public abstract Drawable o00oOo00();

        public abstract Object o00oOo0O();

        public abstract CharSequence o00oOo0o();

        public abstract o00oo00O o00oOoO(@o0OOO0O int i);

        public abstract void o00oOoO0();

        public abstract o00oo00O o00oOoOO(CharSequence charSequence);

        public abstract o00oo00O o00oOoOo(int i);

        public abstract o00oo00O o00oOoo0(View view);

        public abstract int o00oOooO();

        public abstract o00oo00O o00oOooo(@o0O0O0o0 int i);

        public abstract o00oo00O o00oo0(o00oo0 o00oo0Var);

        public abstract o00oo00O o00oo00O(Drawable drawable);

        public abstract o00oo00O o00oo0O(CharSequence charSequence);

        public abstract o00oo00O o00oo0O0(int i);

        public abstract o00oo00O o00oo0OO(Object obj);
    }

    public abstract void o0(View view);

    public abstract void o00oOo0o(o00oOo0O o00ooo0o2);

    @Deprecated
    public abstract void o00oOoO(o00oo00O o00oo00o, int i);

    @Deprecated
    public abstract void o00oOoO0(o00oo00O o00oo00o);

    @Deprecated
    public abstract void o00oOoOO(o00oo00O o00oo00o, int i, boolean z);

    @Deprecated
    public abstract void o00oOoOo(o00oo00O o00oo00o, boolean z);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOoo0() {
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOooo() {
        return false;
    }

    @o0OO00OO
    public abstract CharSequence o00oo();

    public abstract View o00oo0();

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo00O(boolean z) {
    }

    public abstract int o00oo0O();

    public float o00oo0O0() {
        return 0.0f;
    }

    public abstract int o00oo0OO();

    public int o00oo0Oo() {
        return 0;
    }

    @Deprecated
    public abstract int o00oo0o();

    @Deprecated
    public abstract int o00oo0o0();

    @Deprecated
    public abstract int o00oo0oO();

    public abstract void o00ooO();

    @Deprecated
    public abstract int o00ooO0();

    @Deprecated
    public abstract o00oo00O o00ooO00(int i);

    public Context o00ooO0O() {
        return null;
    }

    @o0OO00OO
    public abstract CharSequence o00ooO0o();

    public boolean o00ooOO() {
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooOO0() {
        return false;
    }

    public abstract boolean o00ooOOo();

    @Deprecated
    public abstract o00oo00O o00ooOo();

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooOo0() {
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00ooOoO(Configuration configuration) {
    }

    public void o00ooOoo() {
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooo0(KeyEvent keyEvent) {
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooo00(int i, KeyEvent keyEvent) {
        return false;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooo0O() {
        return false;
    }

    @Deprecated
    public abstract void o00ooo0o();

    public abstract void o00oooO(o00oOo0O o00ooo0o2);

    @Deprecated
    public abstract void o00oooOO(o00oo00O o00oo00o);

    @Deprecated
    public abstract void o00oooOo(int i);

    @Deprecated
    public abstract void o00oooo(o00oo00O o00oo00o);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oooo0() {
        return false;
    }

    public abstract void o00ooooO(@o0OO00OO Drawable drawable);

    public abstract void o00ooooo(int i);

    public void o0O00(@o0OOO0O int i) {
    }

    public abstract void o0O000(int i);

    public abstract void o0O00000(View view, o00oOOoO o00ooooo2);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O0000O(boolean z) {
    }

    public abstract void o0O0000o(boolean z);

    public abstract void o0O000O(int i, int i2);

    public abstract void o0O000Oo(boolean z);

    public void o0O000o(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void o0O000o0(boolean z);

    public void o0O000oo(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public void o0O00O(boolean z) {
    }

    public void o0O00O0(@o0OO00OO CharSequence charSequence) {
    }

    public void o0O00O0o(@o0OO00OO Drawable drawable) {
    }

    public abstract void o0O00OO(@o0O0O0o0 int i);

    public abstract void o0O00OOO(Drawable drawable);

    @Deprecated
    public abstract void o0O00Oo(SpinnerAdapter spinnerAdapter, o00oOoO o00oooo2);

    public abstract void o0O00OoO(Drawable drawable);

    @Deprecated
    public abstract void o0O00Ooo(int i);

    public void o0O00o(Drawable drawable) {
    }

    @Deprecated
    public abstract void o0O00o00(int i);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O00o0O(boolean z) {
    }

    public void o0O00o0o(Drawable drawable) {
    }

    public abstract void o0O00oO0(int i);

    public abstract void o0O0O0O(CharSequence charSequence);

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O0O0Oo(CharSequence charSequence) {
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOoOo.o00oo0 o0O0O0o(o00oo0.o00oOOo0 o00oooo02) {
        return null;
    }

    public abstract void o0O0O0o0();

    @o0OO00OO
    @Deprecated
    public abstract o00oo00O o0O0o();

    public abstract void o0O0oo0o(CharSequence charSequence);

    public void o0OoO00O(@o0O0O0o0 int i) {
    }

    public abstract void o0OoOoOO(boolean z);

    public abstract void o0OoOoOo(boolean z);

    public abstract void o0oO0O0o(@o0OOO0O int i);

    public abstract void o0oO0Ooo(@o0O0O0o0 int i);

    public void o0ooOoOO(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }
}
