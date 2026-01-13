package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.o00oOo00;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOoO implements DrawerLayout.o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final InterfaceC0005o00oOOoO f373o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final DrawerLayout f374o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOoO0.o00oo00O f375o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Drawable f376o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f377o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final int f378o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f379o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int f380o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public View.OnClickListener f381o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f382o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f383o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o00oOOoO o00ooooo2 = o00oOOoO.this;
            if (o00ooooo2.f377o00oOo0o) {
                o00ooooo2.o0O0o();
                return;
            }
            View.OnClickListener onClickListener = o00ooooo2.f381o00oOoOo;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0005o00oOOoO {
        void o00oOOo0(Drawable drawable, @o0OOO0O int i);

        Drawable o00oOOoO();

        void o00oOo00(@o0OOO0O int i);

        boolean o00oOo0O();

        Context o00oOooO();
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        @o0OO00OO
        InterfaceC0005o00oOOoO o00oOOo0();
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O implements InterfaceC0005o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Activity f385o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOo00.o00oOOo0 f386o00oOOoO;

        @o0OOooO0(18)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            @o0O0O0Oo
            public static void o00oOOo0(ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @o0O0O0Oo
            public static void o00oOOoO(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public o00oOo0O(Activity activity) {
            this.f385o00oOOo0 = activity;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOOo0(Drawable drawable, int i) {
            ActionBar actionBar = this.f385o00oOOo0.getActionBar();
            if (actionBar != null) {
                o00oOOo0.o00oOOoO(actionBar, drawable);
                o00oOOo0.o00oOOo0(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Drawable o00oOOoO() {
            TypedArray obtainStyledAttributes = o00oOooO().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOo00(int i) {
            ActionBar actionBar = this.f385o00oOOo0.getActionBar();
            if (actionBar != null) {
                o00oOOo0.o00oOOo0(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public boolean o00oOo0O() {
            ActionBar actionBar = this.f385o00oOOo0.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Context o00oOooO() {
            ActionBar actionBar = this.f385o00oOOo0.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f385o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO implements InterfaceC0005o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Toolbar f387o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Drawable f388o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final CharSequence f389o00oOo00;

        public o00oOoO(Toolbar toolbar) {
            this.f387o00oOOo0 = toolbar;
            this.f388o00oOOoO = toolbar.getNavigationIcon();
            this.f389o00oOo00 = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOOo0(Drawable drawable, @o0OOO0O int i) {
            this.f387o00oOOo0.setNavigationIcon(drawable);
            o00oOo00(i);
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Drawable o00oOOoO() {
            return this.f388o00oOOoO;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOo00(@o0OOO0O int i) {
            if (i == 0) {
                this.f387o00oOOo0.setNavigationContentDescription(this.f389o00oOo00);
            } else {
                this.f387o00oOOo0.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public boolean o00oOo0O() {
            return true;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Context o00oOooO() {
            return this.f387o00oOOo0.getContext();
        }
    }

    public o00oOOoO(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, o00oOoO0.o00oo00O o00oo00o, @o0OOO0O int i, @o0OOO0O int i2) {
        this.f383o00oOooO = true;
        this.f377o00oOo0o = true;
        this.f382o00oOoo0 = false;
        if (toolbar != null) {
            this.f373o00oOOo0 = new o00oOoO(toolbar);
            toolbar.setNavigationOnClickListener(new o00oOOo0());
        } else if (activity instanceof o00oOo00) {
            this.f373o00oOOo0 = ((o00oOo00) activity).o00oOOo0();
        } else {
            this.f373o00oOOo0 = new o00oOo0O(activity);
        }
        this.f374o00oOOoO = drawerLayout;
        this.f378o00oOoO = i;
        this.f380o00oOoOO = i2;
        if (o00oo00o == null) {
            this.f375o00oOo00 = new o00oOoO0.o00oo00O(this.f373o00oOOo0.o00oOooO());
        } else {
            this.f375o00oOo00 = o00oo00o;
        }
        this.f376o00oOo0O = o00oOo0o();
    }

    public o00oOOoO(Activity activity, DrawerLayout drawerLayout, @o0OOO0O int i, @o0OOO0O int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    public o00oOOoO(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @o0OOO0O int i, @o0OOO0O int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOOo0(View view) {
        o00oo0o0(1.0f);
        if (this.f377o00oOo0o) {
            o00oOooo(this.f380o00oOoOO);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOOoO(View view) {
        o00oo0o0(0.0f);
        if (this.f377o00oOo0o) {
            o00oOooo(this.f378o00oOoO);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOo00(int i) {
    }

    @oo0oO0
    public o00oOoO0.o00oo00O o00oOo0O() {
        return this.f375o00oOo00;
    }

    public Drawable o00oOo0o() {
        return this.f373o00oOOo0.o00oOOoO();
    }

    public boolean o00oOoO() {
        return this.f377o00oOo0o;
    }

    public View.OnClickListener o00oOoO0() {
        return this.f381o00oOoOo;
    }

    public boolean o00oOoOO() {
        return this.f383o00oOooO;
    }

    public void o00oOoOo(Configuration configuration) {
        if (!this.f379o00oOoO0) {
            this.f376o00oOo0O = o00oOo0o();
        }
        o00oo0oO();
    }

    public boolean o00oOoo0(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f377o00oOo0o) {
            o0O0o();
            return true;
        }
        return false;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOooO(View view, float f) {
        if (this.f383o00oOooO) {
            o00oo0o0(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            o00oo0o0(0.0f);
        }
    }

    public void o00oOooo(int i) {
        this.f373o00oOOo0.o00oOo00(i);
    }

    public void o00oo0(@oo0oO0 o00oOoO0.o00oo00O o00oo00o) {
        this.f375o00oOo00 = o00oo00o;
        o00oo0oO();
    }

    public void o00oo00O(Drawable drawable, int i) {
        if (!this.f382o00oOoo0 && !this.f373o00oOOo0.o00oOo0O()) {
            this.f382o00oOoo0 = true;
        }
        this.f373o00oOOo0.o00oOOo0(drawable, i);
    }

    public void o00oo0O(int i) {
        o00oo0Oo(i != 0 ? this.f374o00oOOoO.getResources().getDrawable(i) : null);
    }

    public void o00oo0O0(boolean z) {
        this.f383o00oOooO = z;
        if (z) {
            return;
        }
        o00oo0o0(0.0f);
    }

    public void o00oo0OO(boolean z) {
        Drawable drawable;
        int i;
        if (z != this.f377o00oOo0o) {
            if (z) {
                drawable = this.f375o00oOo00;
                i = this.f374o00oOOoO.o00ooOO0(o0O000oo.o0.f10418o00oOOoO) ? this.f380o00oOoOO : this.f378o00oOoO;
            } else {
                drawable = this.f376o00oOo0O;
                i = 0;
            }
            o00oo00O(drawable, i);
            this.f377o00oOo0o = z;
        }
    }

    public void o00oo0Oo(Drawable drawable) {
        if (drawable == null) {
            this.f376o00oOo0O = o00oOo0o();
            this.f379o00oOoO0 = false;
        } else {
            this.f376o00oOo0O = drawable;
            this.f379o00oOoO0 = true;
        }
        if (this.f377o00oOo0o) {
            return;
        }
        o00oo00O(this.f376o00oOo0O, 0);
    }

    public void o00oo0o(View.OnClickListener onClickListener) {
        this.f381o00oOoOo = onClickListener;
    }

    public final void o00oo0o0(float f) {
        o00oOoO0.o00oo00O o00oo00o;
        boolean z;
        if (f != 1.0f) {
            if (f == 0.0f) {
                o00oo00o = this.f375o00oOo00;
                z = false;
            }
            this.f375o00oOo00.o00oo0o0(f);
        }
        o00oo00o = this.f375o00oOo00;
        z = true;
        o00oo00o.o00oo0oO(z);
        this.f375o00oOo00.o00oo0o0(f);
    }

    public void o00oo0oO() {
        o00oo0o0(this.f374o00oOOoO.o00ooOO0(o0O000oo.o0.f10418o00oOOoO) ? 1.0f : 0.0f);
        if (this.f377o00oOo0o) {
            o00oo00O(this.f375o00oOo00, this.f374o00oOOoO.o00ooOO0(o0O000oo.o0.f10418o00oOOoO) ? this.f380o00oOoOO : this.f378o00oOoO);
        }
    }

    public void o0O0o() {
        int o00oo0O2 = this.f374o00oOOoO.o00oo0O(o0O000oo.o0.f10418o00oOOoO);
        if (this.f374o00oOOoO.o00ooOo0(o0O000oo.o0.f10418o00oOOoO) && o00oo0O2 != 2) {
            this.f374o00oOOoO.o00oOooO(o0O000oo.o0.f10418o00oOOoO);
        } else if (o00oo0O2 != 1) {
            this.f374o00oOOoO.o00ooo0(o0O000oo.o0.f10418o00oOOoO);
        }
    }
}
