package o0O00o0O;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0O;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o0O000oo.o0O0o00O;
@Deprecated
/* loaded from: classes.dex */
public class o00oOoO implements DrawerLayout.o00oOo0O {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int[] f11137o00oo0 = {16843531};

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f11138o00oo00O = "ActionBarDrawerToggle";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f11139o00oo0O0 = 16908332;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final float f11140o00oo0OO = 0.33333334f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Activity f11141o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOo0 f11142o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final DrawerLayout f11143o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f11144o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Drawable f11145o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o00oOo0O f11146o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Drawable f11147o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int f11148o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final int f11149o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final int f11150o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f11151o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public o00oOo00 f11152o00oOooo;

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0(Drawable drawable, @o0OOO0O int i);

        @o0OO00OO
        Drawable o00oOOoO();

        void o00oOo00(@o0OOO0O int i);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        @o0OO00OO
        o00oOOo0 o00oOOo0();
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Method f11153o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f11154o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ImageView f11155o00oOo00;

        public o00oOo00(Activity activity) {
            try {
                this.f11153o00oOOo0 = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f11154o00oOOoO = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(o00oOoO.f11139o00oo0O0);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f11155o00oOo00 = (ImageView) childAt;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends InsetDrawable implements Drawable.Callback {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Rect f11156o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final boolean f11157o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public float f11158o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public float f11160o00oo0o0;

        public o00oOo0O(Drawable drawable) {
            super(drawable, 0);
            this.f11157o00oo0O0 = true;
            this.f11156o00oo0O = new Rect();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@oo0oO0 Canvas canvas) {
            copyBounds(this.f11156o00oo0O);
            canvas.save();
            boolean z = o0O0o00O.o0O000O(o00oOoO.this.f11141o00oOOo0.getWindow().getDecorView()) == 1;
            int i = z ? -1 : 1;
            float width = this.f11156o00oo0O.width();
            canvas.translate((-this.f11160o00oo0o0) * width * this.f11158o00oo0Oo * i, 0.0f);
            if (z && !this.f11157o00oo0O0) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public float o00oOOo0() {
            return this.f11158o00oo0Oo;
        }

        public void o00oOOoO(float f) {
            this.f11160o00oo0o0 = f;
            invalidateSelf();
        }

        public void o00oOo00(float f) {
            this.f11158o00oo0Oo = f;
            invalidateSelf();
        }
    }

    public o00oOoO(Activity activity, DrawerLayout drawerLayout, @o0O0O0o0 int i, @o0OOO0O int i2, @o0OOO0O int i3) {
        this(activity, drawerLayout, !o00oOo0O(activity), i, i2, i3);
    }

    public o00oOoO(Activity activity, DrawerLayout drawerLayout, boolean z, @o0O0O0o0 int i, @o0OOO0O int i2, @o0OOO0O int i3) {
        this.f11151o00oOooO = true;
        this.f11141o00oOOo0 = activity;
        this.f11142o00oOOoO = activity instanceof o00oOOoO ? ((o00oOOoO) activity).o00oOOo0() : null;
        this.f11143o00oOo00 = drawerLayout;
        this.f11148o00oOoOO = i;
        this.f11149o00oOoOo = i2;
        this.f11150o00oOoo0 = i3;
        this.f11145o00oOo0o = o00oOo0o();
        this.f11147o00oOoO0 = o0.getDrawable(activity, i);
        o00oOo0O o00ooo0o2 = new o00oOo0O(this.f11147o00oOoO0);
        this.f11146o00oOoO = o00ooo0o2;
        o00ooo0o2.o00oOOoO(z ? 0.33333334f : 0.0f);
    }

    public static boolean o00oOo0O(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOOo0(View view) {
        this.f11146o00oOoO.o00oOo00(1.0f);
        if (this.f11151o00oOooO) {
            o00oOoOo(this.f11150o00oOoo0);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOOoO(View view) {
        this.f11146o00oOoO.o00oOo00(0.0f);
        if (this.f11151o00oOooO) {
            o00oOoOo(this.f11149o00oOoOo);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOo00(int i) {
    }

    public final Drawable o00oOo0o() {
        o00oOOo0 o00oooo02 = this.f11142o00oOOoO;
        if (o00oooo02 != null) {
            return o00oooo02.o00oOOoO();
        }
        ActionBar actionBar = this.f11141o00oOOo0.getActionBar();
        TypedArray obtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f11141o00oOOo0).obtainStyledAttributes(null, f11137o00oo0, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public void o00oOoO(Configuration configuration) {
        if (!this.f11144o00oOo0O) {
            this.f11145o00oOo0o = o00oOo0o();
        }
        this.f11147o00oOoO0 = o0.getDrawable(this.f11141o00oOOo0, this.f11148o00oOoOO);
        o00oo0OO();
    }

    public boolean o00oOoO0() {
        return this.f11151o00oOooO;
    }

    public boolean o00oOoOO(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f11151o00oOooO) {
            if (this.f11143o00oOo00.o00ooOo0(o0O000oo.o0.f10418o00oOOoO)) {
                this.f11143o00oOo00.o00oOooO(o0O000oo.o0.f10418o00oOOoO);
                return true;
            }
            this.f11143o00oOo00.o00ooo0(o0O000oo.o0.f10418o00oOOoO);
            return true;
        }
        return false;
    }

    public final void o00oOoOo(int i) {
        o00oOOo0 o00oooo02 = this.f11142o00oOOoO;
        if (o00oooo02 != null) {
            o00oooo02.o00oOo00(i);
            return;
        }
        ActionBar actionBar = this.f11141o00oOOo0.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public final void o00oOoo0(Drawable drawable, int i) {
        o00oOOo0 o00oooo02 = this.f11142o00oOOoO;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(drawable, i);
            return;
        }
        ActionBar actionBar = this.f11141o00oOOo0.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.o00oOo0O
    public void o00oOooO(View view, float f) {
        float o00oOOo02 = this.f11146o00oOoO.o00oOOo0();
        this.f11146o00oOoO.o00oOo00(f > 0.5f ? Math.max(o00oOOo02, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(o00oOOo02, f * 2.0f));
    }

    public void o00oOooo(boolean z) {
        Drawable drawable;
        int i;
        if (z != this.f11151o00oOooO) {
            if (z) {
                drawable = this.f11146o00oOoO;
                i = this.f11143o00oOo00.o00ooOO0(o0O000oo.o0.f10418o00oOOoO) ? this.f11150o00oOoo0 : this.f11149o00oOoOo;
            } else {
                drawable = this.f11145o00oOo0o;
                i = 0;
            }
            o00oOoo0(drawable, i);
            this.f11151o00oOooO = z;
        }
    }

    public void o00oo0(Drawable drawable) {
        if (drawable == null) {
            this.f11145o00oOo0o = o00oOo0o();
            this.f11144o00oOo0O = false;
        } else {
            this.f11145o00oOo0o = drawable;
            this.f11144o00oOo0O = true;
        }
        if (this.f11151o00oOooO) {
            return;
        }
        o00oOoo0(this.f11145o00oOo0o, 0);
    }

    public void o00oo00O(int i) {
        o00oo0(i != 0 ? o0.getDrawable(this.f11141o00oOOo0, i) : null);
    }

    public void o00oo0OO() {
        o00oOo0O o00ooo0o2;
        float f;
        if (this.f11143o00oOo00.o00ooOO0(o0O000oo.o0.f10418o00oOOoO)) {
            o00ooo0o2 = this.f11146o00oOoO;
            f = 1.0f;
        } else {
            o00ooo0o2 = this.f11146o00oOoO;
            f = 0.0f;
        }
        o00ooo0o2.o00oOo00(f);
        if (this.f11151o00oOooO) {
            o00oOoo0(this.f11146o00oOoO, this.f11143o00oOo00.o00ooOO0(o0O000oo.o0.f10418o00oOOoO) ? this.f11150o00oOoo0 : this.f11149o00oOoOo);
        }
    }
}
