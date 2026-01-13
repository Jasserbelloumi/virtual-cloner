package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOOo0;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0O0OOO;
import androidx.appcompat.widget.o0OoOoO;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o0O0oo0o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o00oOoOo.o00oo0;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OO;
import o0O000oo.o0OO0oO0;
import o0O000oo.o0OOO00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O00 extends androidx.appcompat.app.o00oOOo0 implements ActionBarOverlayLayout.o00oOo0O {

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f429o00oooO = "WindowDecorActionBar";

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final Interpolator f430o00oooOO = new AccelerateInterpolator();

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final Interpolator f431o00oooOo = new DecelerateInterpolator();

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final long f432o00oooo = 100;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f433o00oooo0 = -1;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final long f434o00ooooO = 200;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public Context f435o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public Context f436o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public Activity f437o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public ActionBarOverlayLayout f438o00oOooo;

    /* renamed from: o00oo  reason: collision with root package name */
    public o00oOoOo.o00oo0 f439o00oo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public o0O0OOO f440o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public ActionBarContainer f441o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0OoOoO f442o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public View f443o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public ActionBarContextView f444o00oo0OO;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oOoO f447o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f448o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f450o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o00oo0.o00oOOo0 f451o00ooO00;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f453o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f454o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public boolean f456o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f458o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public o00oOoOo.o00ooO f459o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f460o00ooOoo;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f462o00ooo00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOo0O f465o0O0o;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public ArrayList<o00oOoO> f445o00oo0Oo = new ArrayList<>();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f446o00oo0o = -1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public ArrayList<o00oOOo0.o00oOo0O> f452o00ooO0O = new ArrayList<>();

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f449o00ooO = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f455o00ooOO0 = true;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f457o00ooOo = true;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public final o0O000oo.o0OO0oO f461o00ooo0 = new o00oOOo0();

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public final o0O000oo.o0OO0oO f463o00ooo0O = new o00oOOoO();

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public final o0OOO00 f464o00ooo0o = new o00oOo00();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0OO {
        public o00oOOo0() {
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            View view2;
            o0O00 o0o00 = o0O00.this;
            if (o0o00.f455o00ooOO0 && (view2 = o0o00.f443o00oo0O0) != null) {
                view2.setTranslationY(0.0f);
                o0O00.this.f441o00oo00O.setTranslationY(0.0f);
            }
            o0O00.this.f441o00oo00O.setVisibility(8);
            o0O00.this.f441o00oo00O.setTransitioning(false);
            o0O00 o0o002 = o0O00.this;
            o0o002.f459o00ooOoO = null;
            o0o002.o0O0OO0();
            ActionBarOverlayLayout actionBarOverlayLayout = o0O00.this.f438o00oOooo;
            if (actionBarOverlayLayout != null) {
                o0O0o00O.o0O0oOO0(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0OO {
        public o00oOOoO() {
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            o0O00 o0o00 = o0O00.this;
            o0o00.f459o00ooOoO = null;
            o0o00.f441o00oo00O.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o0OOO00 {
        public o00oOo00() {
        }

        @Override // o0O000oo.o0OOO00
        public void o00oOOo0(View view) {
            ((View) o0O00.this.f441o00oo00O.getParent()).invalidate();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oOoOo.o00oo0 implements o00oOoO.o00oOOo0 {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final Context f469o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public o00oo0.o00oOOo0 f470o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final androidx.appcompat.view.menu.o00oOoO f471o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public WeakReference<View> f472o00oo0oO;

        public o00oOo0O(Context context, o00oo0.o00oOOo0 o00oooo02) {
            this.f469o00oo0Oo = context;
            this.f470o00oo0o = o00oooo02;
            androidx.appcompat.view.menu.o00oOoO defaultShowAsAction = new androidx.appcompat.view.menu.o00oOoO(context).setDefaultShowAsAction(1);
            this.f471o00oo0o0 = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // o00oOoOo.o00oo0
        public void o00oOOo0() {
            o0O00 o0o00 = o0O00.this;
            if (o0o00.f465o0O0o != this) {
                return;
            }
            if (o0O00.o0O0O0oo(o0o00.f454o00ooOO, o0o00.f456o00ooOOo, false)) {
                this.f470o00oo0o.o00oOOoO(this);
            } else {
                o0O00 o0o002 = o0O00.this;
                o0o002.f439o00oo = this;
                o0o002.f451o00ooO00 = this.f470o00oo0o;
            }
            this.f470o00oo0o = null;
            o0O00.this.o0O0O0oO(false);
            o0O00.this.f444o00oo0OO.o00oo0O0();
            o0O00 o0o003 = o0O00.this;
            o0o003.f438o00oOooo.setHideOnContentScrollEnabled(o0o003.f462o00ooo00);
            o0O00.this.f465o0O0o = null;
        }

        @Override // o00oOoOo.o00oo0
        public View o00oOOoO() {
            WeakReference<View> weakReference = this.f472o00oo0oO;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o00oOoOo.o00oo0
        public Menu o00oOo00() {
            return this.f471o00oo0o0;
        }

        @Override // o00oOoOo.o00oo0
        public CharSequence o00oOo0O() {
            return o0O00.this.f444o00oo0OO.getSubtitle();
        }

        @Override // o00oOoOo.o00oo0
        public CharSequence o00oOoO0() {
            return o0O00.this.f444o00oo0OO.getTitle();
        }

        @Override // o00oOoOo.o00oo0
        public void o00oOoOO() {
            if (o0O00.this.f465o0O0o != this) {
                return;
            }
            this.f471o00oo0o0.stopDispatchingItemsChanged();
            try {
                this.f470o00oo0o.o00oOo00(this, this.f471o00oo0o0);
            } finally {
                this.f471o00oo0o0.startDispatchingItemsChanged();
            }
        }

        @Override // o00oOoOo.o00oo0
        public boolean o00oOoOo() {
            return o0O00.this.f444o00oo0OO.o00oo0o0();
        }

        @Override // o00oOoOo.o00oo0
        public MenuInflater o00oOooO() {
            return new o00oOoOo.o00ooO0(this.f469o00oo0Oo);
        }

        @Override // o00oOoOo.o00oo0
        public void o00oOooo(View view) {
            o0O00.this.f444o00oo0OO.setCustomView(view);
            this.f472o00oo0oO = new WeakReference<>(view);
        }

        @Override // o00oOoOo.o00oo0
        public void o00oo0(CharSequence charSequence) {
            o0O00.this.f444o00oo0OO.setSubtitle(charSequence);
        }

        @Override // o00oOoOo.o00oo0
        public void o00oo00O(int i) {
            o00oo0(o0O00.this.f435o00oOoOO.getResources().getString(i));
        }

        @Override // o00oOoOo.o00oo0
        public void o00oo0O(CharSequence charSequence) {
            o0O00.this.f444o00oo0OO.setTitle(charSequence);
        }

        @Override // o00oOoOo.o00oo0
        public void o00oo0O0(int i) {
            o00oo0O(o0O00.this.f435o00oOoOO.getResources().getString(i));
        }

        @Override // o00oOoOo.o00oo0
        public void o00oo0Oo(boolean z) {
            this.f6998o00oo0O = z;
            o0O00.this.f444o00oo0OO.setTitleOptional(z);
        }

        public void o00oo0o(androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
        }

        public boolean o00oo0o0() {
            this.f471o00oo0o0.stopDispatchingItemsChanged();
            try {
                return this.f470o00oo0o.o00oOooO(this, this.f471o00oo0o0);
            } finally {
                this.f471o00oo0o0.startDispatchingItemsChanged();
            }
        }

        public void o00oo0oO(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
        }

        public boolean o0O0o(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
            if (this.f470o00oo0o == null) {
                return false;
            }
            if (o00ooo02.hasVisibleItems()) {
                new androidx.appcompat.view.menu.o00oo0O0(o0O00.this.o00ooO0O(), o00ooo02).o00oOooo();
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public boolean onMenuItemSelected(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
            o00oo0.o00oOOo0 o00oooo02 = this.f470o00oo0o;
            if (o00oooo02 != null) {
                return o00oooo02.o00oOOo0(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public void onMenuModeChange(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            if (this.f470o00oo0o == null) {
                return;
            }
            o00oOoOO();
            o0O00.this.f444o00oo0OO.o00oo0OO();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class o00oOoO extends o00oOOo0.o00oo00O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOOo0.o00oo0 f474o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Object f475o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public CharSequence f476o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public CharSequence f477o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public View f478o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f479o00oOoO0 = -1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Drawable f481o00oOooO;

        public o00oOoO() {
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public CharSequence o00oOOo0() {
            return this.f477o00oOo0o;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public View o00oOOoO() {
            return this.f478o00oOoO;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public Drawable o00oOo00() {
            return this.f481o00oOooO;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public Object o00oOo0O() {
            return this.f475o00oOo00;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public CharSequence o00oOo0o() {
            return this.f476o00oOo0O;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oOoO(int i) {
            return o00oOoOO(o0O00.this.f435o00oOoOO.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public void o00oOoO0() {
            o0O00.this.o00oooo(this);
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oOoOO(CharSequence charSequence) {
            this.f477o00oOo0o = charSequence;
            int i = this.f479o00oOoO0;
            if (i >= 0) {
                o0O00.this.f442o00oo0O.o00oo00O(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oOoOo(int i) {
            return o00oOoo0(LayoutInflater.from(o0O00.this.o00ooO0O()).inflate(i, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oOoo0(View view) {
            this.f478o00oOoO = view;
            int i = this.f479o00oOoO0;
            if (i >= 0) {
                o0O00.this.f442o00oo0O.o00oo00O(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public int o00oOooO() {
            return this.f479o00oOoO0;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oOooo(int i) {
            return o00oo00O(o00oOo0o.o00oOo00.o00oOOoO(o0O00.this.f435o00oOoOO, i));
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oo0(o00oOOo0.o00oo0 o00oo0Var) {
            this.f474o00oOOoO = o00oo0Var;
            return this;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oo00O(Drawable drawable) {
            this.f481o00oOooO = drawable;
            int i = this.f479o00oOoO0;
            if (i >= 0) {
                o0O00.this.f442o00oo0O.o00oo00O(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oo0O(CharSequence charSequence) {
            this.f476o00oOo0O = charSequence;
            int i = this.f479o00oOoO0;
            if (i >= 0) {
                o0O00.this.f442o00oo0O.o00oo00O(i);
            }
            return this;
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oo0O0(int i) {
            return o00oo0O(o0O00.this.f435o00oOoOO.getResources().getText(i));
        }

        @Override // androidx.appcompat.app.o00oOOo0.o00oo00O
        public o00oOOo0.o00oo00O o00oo0OO(Object obj) {
            this.f475o00oOo00 = obj;
            return this;
        }

        public o00oOOo0.o00oo0 o00oo0Oo() {
            return this.f474o00oOOoO;
        }

        public void o00oo0o0(int i) {
            this.f479o00oOoO0 = i;
        }
    }

    public o0O00(Activity activity, boolean z) {
        this.f437o00oOoo0 = activity;
        View decorView = activity.getWindow().getDecorView();
        o0OooO0(decorView);
        if (z) {
            return;
        }
        this.f443o00oo0O0 = decorView.findViewById(16908290);
    }

    public o0O00(Dialog dialog) {
        o0OooO0(dialog.getWindow().getDecorView());
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o0O00(View view) {
        o0OooO0(view);
    }

    public static boolean o0O0O0oo(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0(View view) {
        this.f440o00oo0.o00oooOo(view);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void o00oOOo0() {
        if (this.f456o00ooOOo) {
            this.f456o00ooOOo = false;
            o0O0Oo(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void o00oOOoO() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void o00oOo00(boolean z) {
        this.f455o00ooOO0 = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void o00oOo0O() {
        o00oOoOo.o00ooO o00ooo = this.f459o00ooOoO;
        if (o00ooo != null) {
            o00ooo.o00oOOo0();
            this.f459o00ooOoO = null;
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOo0o(o00oOOo0.o00oOo0O o00ooo0o2) {
        this.f452o00ooO0O.add(o00ooo0o2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoO(o00oOOo0.o00oo00O o00oo00o, int i) {
        o00oOoOO(o00oo00o, i, this.f445o00oo0Oo.isEmpty());
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoO0(o00oOOo0.o00oo00O o00oo00o) {
        o00oOoOo(o00oo00o, this.f445o00oo0Oo.isEmpty());
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoOO(o00oOOo0.o00oo00O o00oo00o, int i, boolean z) {
        o0O0OOO();
        this.f442o00oo0O.o00oOOo0(o00oo00o, i, z);
        o0O0OO0O(o00oo00o, i);
        if (z) {
            o00oooo(o00oo00o);
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oOoOo(o00oOOo0.o00oo00O o00oo00o, boolean z) {
        o0O0OOO();
        this.f442o00oo0O.o00oOOoO(o00oo00o, z);
        o0O0OO0O(o00oo00o, this.f445o00oo0Oo.size());
        if (z) {
            o00oooo(o00oo00o);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void o00oOooO() {
        if (this.f456o00ooOOo) {
            return;
        }
        this.f456o00ooOOo = true;
        o0O0Oo(true);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00oOooo() {
        o0O0OOO o0o0ooo = this.f440o00oo0;
        if (o0o0ooo == null || !o0o0ooo.o00oOoOo()) {
            return false;
        }
        this.f440o00oo0.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public CharSequence o00oo() {
        return this.f440o00oo0.o00oooO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public View o00oo0() {
        return this.f440o00oo0.o00ooOO0();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oo00O(boolean z) {
        if (z == this.f450o00ooO0) {
            return;
        }
        this.f450o00ooO0 = z;
        int size = this.f452o00ooO0O.size();
        for (int i = 0; i < size; i++) {
            this.f452o00ooO0O.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0O() {
        return this.f441o00oo00O.getHeight();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public float o00oo0O0() {
        return o0O0o00O.o00oooo(this.f441o00oo00O);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0OO() {
        return this.f440o00oo0.o00oooOO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0Oo() {
        return this.f438o00oOooo.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0o() {
        return this.f440o00oo0.o00oo0O();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0o0() {
        int o00oo0O2 = this.f440o00oo0.o00oo0O();
        if (o00oo0O2 != 1) {
            if (o00oo0O2 != 2) {
                return 0;
            }
            return this.f445o00oo0Oo.size();
        }
        return this.f440o00oo0.o00ooO0();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00oo0oO() {
        o00oOoO o00oooo2;
        int o00oo0O2 = this.f440o00oo0.o00oo0O();
        if (o00oo0O2 != 1) {
            if (o00oo0O2 == 2 && (o00oooo2 = this.f447o00oo0o0) != null) {
                return o00oooo2.o00oOooO();
            }
            return -1;
        }
        return this.f440o00oo0.o0O0o();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooO() {
        if (this.f454o00ooOO) {
            return;
        }
        this.f454o00ooOO = true;
        o0O0Oo(false);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public int o00ooO0() {
        return this.f445o00oo0Oo.size();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o00ooO00(int i) {
        return this.f445o00oo0Oo.get(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public Context o00ooO0O() {
        if (this.f436o00oOoOo == null) {
            TypedValue typedValue = new TypedValue();
            this.f435o00oOoOO.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f436o00oOoOo = new ContextThemeWrapper(this.f435o00oOoOO, i);
            } else {
                this.f436o00oOoOo = this.f435o00oOoOO;
            }
        }
        return this.f436o00oOoOo;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public CharSequence o00ooO0o() {
        return this.f440o00oo0.getTitle();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOO() {
        return this.f438o00oOooo.o00oo0oO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOOo() {
        int o00oo0O2 = o00oo0O();
        return this.f457o00ooOo && (o00oo0O2 == 0 || o00oo0Oo() < o00oo0O2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o00ooOo() {
        return new o00oOoO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooOo0() {
        o0O0OOO o0o0ooo = this.f440o00oo0;
        return o0o0ooo != null && o0o0ooo.o00oOoo0();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooOoO(Configuration configuration) {
        o0O0Oo0(new o00oOoOo.o00oo00O(this.f435o00oOoOO).o00oOoO0());
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00ooo00(int i, KeyEvent keyEvent) {
        Menu o00oOo002;
        o00oOo0O o00ooo0o2 = this.f465o0O0o;
        if (o00ooo0o2 == null || (o00oOo002 = o00ooo0o2.o00oOo00()) == null) {
            return false;
        }
        o00oOo002.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return o00oOo002.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooo0o() {
        o0ooO();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooO(o00oOOo0.o00oOo0O o00ooo0o2) {
        this.f452o00ooO0O.remove(o00ooo0o2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooOO(o00oOOo0.o00oo00O o00oo00o) {
        o00oooOo(o00oo00o.o00oOooO());
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooOo(int i) {
        if (this.f442o00oo0O == null) {
            return;
        }
        o00oOoO o00oooo2 = this.f447o00oo0o0;
        int o00oOooO2 = o00oooo2 != null ? o00oooo2.o00oOooO() : this.f446o00oo0o;
        this.f442o00oo0O.o00oOooo(i);
        o00oOoO remove = this.f445o00oo0Oo.remove(i);
        if (remove != null) {
            remove.o00oo0o0(-1);
        }
        int size = this.f445o00oo0Oo.size();
        for (int i2 = i; i2 < size; i2++) {
            this.f445o00oo0Oo.get(i2).o00oo0o0(i2);
        }
        if (o00oOooO2 == i) {
            o00oooo(this.f445o00oo0Oo.isEmpty() ? null : this.f445o00oo0Oo.get(Math.max(0, i - 1)));
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00oooo(o00oOOo0.o00oo00O o00oo00o) {
        if (o00oo0o() != 2) {
            this.f446o00oo0o = o00oo00o != null ? o00oo00o.o00oOooO() : -1;
            return;
        }
        o0O0oo0o o00oo0o02 = (!(this.f437o00oOoo0 instanceof FragmentActivity) || this.f440o00oo0.o00oo0o().isInEditMode()) ? null : ((FragmentActivity) this.f437o00oOoo0).o00ooo0().o00oo0oO().o00oo0o0();
        o00oOoO o00oooo2 = this.f447o00oo0o0;
        if (o00oooo2 != o00oo00o) {
            this.f442o00oo0O.setTabSelected(o00oo00o != null ? o00oo00o.o00oOooO() : -1);
            o00oOoO o00oooo3 = this.f447o00oo0o0;
            if (o00oooo3 != null) {
                o00oooo3.o00oo0Oo().o00oOOoO(this.f447o00oo0o0, o00oo0o02);
            }
            o00oOoO o00oooo4 = (o00oOoO) o00oo00o;
            this.f447o00oo0o0 = o00oooo4;
            if (o00oooo4 != null) {
                o00oooo4.o00oo0Oo().o00oOOo0(this.f447o00oo0o0, o00oo0o02);
            }
        } else if (o00oooo2 != null) {
            o00oooo2.o00oo0Oo().o00oOo00(this.f447o00oo0o0, o00oo0o02);
            this.f442o00oo0O.o00oOo00(o00oo00o.o00oOooO());
        }
        if (o00oo0o02 == null || o00oo0o02.o00oo()) {
            return;
        }
        o00oo0o02.o00oo00O();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public boolean o00oooo0() {
        ViewGroup o00oo0o2 = this.f440o00oo0.o00oo0o();
        if (o00oo0o2 == null || o00oo0o2.hasFocus()) {
            return false;
        }
        o00oo0o2.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooooO(Drawable drawable) {
        this.f441o00oo00O.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o00ooooo(int i) {
        o0(LayoutInflater.from(o00ooO0O()).inflate(i, this.f440o00oo0.o00oo0o(), false));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00(int i) {
        this.f440o00oo0.o00oo(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000(int i) {
        if ((i & 4) != 0) {
            this.f448o00oo0oO = true;
        }
        this.f440o00oo0.o00oOooo(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00000(View view, o00oOOo0.o00oOOoO o00ooooo2) {
        view.setLayoutParams(o00ooooo2);
        this.f440o00oo0.o00oooOo(view);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0000O(boolean z) {
        if (this.f448o00oo0oO) {
            return;
        }
        o0O0000o(z);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0000o(boolean z) {
        o0O000O(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000O(int i, int i2) {
        int o00oooOO2 = this.f440o00oo0.o00oooOO();
        if ((i2 & 4) != 0) {
            this.f448o00oo0oO = true;
        }
        this.f440o00oo0.o00oOooo((i & i2) | ((~i2) & o00oooOO2));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000Oo(boolean z) {
        o0O000O(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000o(float f) {
        o0O0o00O.o0OO000(this.f441o00oo00O, f);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000o0(boolean z) {
        o0O000O(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O000oo(boolean z) {
        if (z && !this.f438o00oOooo.o0O0o()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f462o00ooo00 = z;
        this.f438o00oOooo.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O(boolean z) {
        this.f440o00oo0.o00oo0oO(z);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O0(CharSequence charSequence) {
        this.f440o00oo0.o00oo00O(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00O0o(Drawable drawable) {
        this.f440o00oo0.o00oooo(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OO(int i) {
        this.f440o00oo0.setIcon(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OOO(Drawable drawable) {
        this.f440o00oo0.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00Oo(SpinnerAdapter spinnerAdapter, o00oOOo0.o00oOoO o00oooo2) {
        this.f440o00oo0.o00ooo0O(spinnerAdapter, new o0O000(o00oooo2));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00OoO(Drawable drawable) {
        this.f440o00oo0.o00ooOOo(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00Ooo(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int o00oo0O2 = this.f440o00oo0.o00oo0O();
        if (o00oo0O2 == 2) {
            this.f446o00oo0o = o00oo0oO();
            o00oooo(null);
            this.f442o00oo0O.setVisibility(8);
        }
        if (o00oo0O2 != i && !this.f453o00ooO0o && (actionBarOverlayLayout = this.f438o00oOooo) != null) {
            o0O0o00O.o0O0oOO0(actionBarOverlayLayout);
        }
        this.f440o00oo0.o00oo0o0(i);
        boolean z = false;
        if (i == 2) {
            o0O0OOO();
            this.f442o00oo0O.setVisibility(0);
            int i2 = this.f446o00oo0o;
            if (i2 != -1) {
                o0O00o00(i2);
                this.f446o00oo0o = -1;
            }
        }
        this.f440o00oo0.o00ooO0O(i == 2 && !this.f453o00ooO0o);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f438o00oOooo;
        if (i == 2 && !this.f453o00ooO0o) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o(Drawable drawable) {
        this.f441o00oo00O.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o00(int i) {
        int o00oo0O2 = this.f440o00oo0.o00oo0O();
        if (o00oo0O2 == 1) {
            this.f440o00oo0.o00oo0OO(i);
        } else if (o00oo0O2 != 2) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        } else {
            o00oooo(this.f445o00oo0Oo.get(i));
        }
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o0O(boolean z) {
        o00oOoOo.o00ooO o00ooo;
        this.f460o00ooOoo = z;
        if (z || (o00ooo = this.f459o00ooOoO) == null) {
            return;
        }
        o00ooo.o00oOOo0();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00o0o(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O00oO0(int i) {
        o0O0O0O(this.f435o00oOoOO.getString(i));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0O(CharSequence charSequence) {
        this.f440o00oo0.o00oo0(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0Oo(CharSequence charSequence) {
        this.f440o00oo0.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOoOo.o00oo0 o0O0O0o(o00oo0.o00oOOo0 o00oooo02) {
        o00oOo0O o00ooo0o2 = this.f465o0O0o;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOOo0();
        }
        this.f438o00oOooo.setHideOnContentScrollEnabled(false);
        this.f444o00oo0OO.o00oo0o();
        o00oOo0O o00ooo0o3 = new o00oOo0O(this.f444o00oo0OO.getContext(), o00oooo02);
        if (o00ooo0o3.o00oo0o0()) {
            this.f465o0O0o = o00ooo0o3;
            o00ooo0o3.o00oOoOO();
            this.f444o00oo0OO.o00oo0O(o00ooo0o3);
            o0O0O0oO(true);
            return o00ooo0o3;
        }
        return null;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0O0o0() {
        if (this.f454o00ooOO) {
            this.f454o00ooOO = false;
            o0O0Oo(false);
        }
    }

    public void o0O0O0oO(boolean z) {
        o0OO0oO0 o00oo0Oo2;
        o0OO0oO0 o00oo02;
        if (z) {
            o0O0Oo0o();
        } else {
            o0O0OOoo();
        }
        if (!o0O0Oo0O()) {
            if (z) {
                this.f440o00oo0.setVisibility(4);
                this.f444o00oo0OO.setVisibility(0);
                return;
            }
            this.f440o00oo0.setVisibility(0);
            this.f444o00oo0OO.setVisibility(8);
            return;
        }
        if (z) {
            o00oo02 = this.f440o00oo0.o00oo0Oo(4, 100L);
            o00oo0Oo2 = this.f444o00oo0OO.o00oo0(0, 200L);
        } else {
            o00oo0Oo2 = this.f440o00oo0.o00oo0Oo(0, 200L);
            o00oo02 = this.f444o00oo0OO.o00oo0(8, 100L);
        }
        o00oOoOo.o00ooO o00ooo = new o00oOoOo.o00ooO();
        o00ooo.o00oOooO(o00oo02, o00oo0Oo2);
        o00ooo.o00oOoO();
    }

    public void o0O0OO(boolean z) {
        View view;
        int[] iArr;
        o00oOoOo.o00ooO o00ooo = this.f459o00ooOoO;
        if (o00ooo != null) {
            o00ooo.o00oOOo0();
        }
        if (this.f449o00ooO != 0 || (!this.f460o00ooOoo && !z)) {
            this.f461o00ooo0.o00oOOoO(null);
            return;
        }
        this.f441o00oo00O.setAlpha(1.0f);
        this.f441o00oo00O.setTransitioning(true);
        o00oOoOo.o00ooO o00ooo2 = new o00oOoOo.o00ooO();
        float f = -this.f441o00oo00O.getHeight();
        if (z) {
            this.f441o00oo00O.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        o0OO0oO0 o00ooO2 = o0O0o00O.o00oOoO0(this.f441o00oo00O).o00ooO(f);
        o00ooO2.o00ooO00(this.f464o00ooo0o);
        o00ooo2.o00oOo00(o00ooO2);
        if (this.f455o00ooOO0 && (view = this.f443o00oo0O0) != null) {
            o00ooo2.o00oOo00(o0O0o00O.o00oOoO0(view).o00ooO(f));
        }
        o00ooo2.o00oOo0o(f430o00oooOO);
        o00ooo2.o00oOo0O(250L);
        o00ooo2.o00oOoO0(this.f461o00ooo0);
        this.f459o00ooOoO = o00ooo2;
        o00ooo2.o00oOoO();
    }

    public void o0O0OO0() {
        o00oo0.o00oOOo0 o00oooo02 = this.f451o00ooO00;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOoO(this.f439o00oo);
            this.f439o00oo = null;
            this.f451o00ooO00 = null;
        }
    }

    public final void o0O0OO0O(o00oOOo0.o00oo00O o00oo00o, int i) {
        o00oOoO o00oooo2 = (o00oOoO) o00oo00o;
        if (o00oooo2.o00oo0Oo() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        o00oooo2.o00oo0o0(i);
        this.f445o00oo0Oo.add(i, o00oooo2);
        int size = this.f445o00oo0Oo.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            }
            this.f445o00oo0Oo.get(i).o00oo0o0(i);
        }
    }

    public final void o0O0OOO() {
        if (this.f442o00oo0O != null) {
            return;
        }
        o0OoOoO o0ooooo = new o0OoOoO(this.f435o00oOoOO);
        if (this.f453o00ooO0o) {
            o0ooooo.setVisibility(0);
            this.f440o00oo0.o00ooOO(o0ooooo);
        } else {
            if (o00oo0o() == 2) {
                o0ooooo.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f438o00oOooo;
                if (actionBarOverlayLayout != null) {
                    o0O0o00O.o0O0oOO0(actionBarOverlayLayout);
                }
            } else {
                o0ooooo.setVisibility(8);
            }
            this.f441o00oo00O.setTabContainer(o0ooooo);
        }
        this.f442o00oo0O = o0ooooo;
    }

    public void o0O0OOO0(boolean z) {
        View view;
        View view2;
        int[] iArr;
        o00oOoOo.o00ooO o00ooo = this.f459o00ooOoO;
        if (o00ooo != null) {
            o00ooo.o00oOOo0();
        }
        this.f441o00oo00O.setVisibility(0);
        if (this.f449o00ooO == 0 && (this.f460o00ooOoo || z)) {
            this.f441o00oo00O.setTranslationY(0.0f);
            float f = -this.f441o00oo00O.getHeight();
            if (z) {
                this.f441o00oo00O.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f441o00oo00O.setTranslationY(f);
            o00oOoOo.o00ooO o00ooo2 = new o00oOoOo.o00ooO();
            o0OO0oO0 o00ooO2 = o0O0o00O.o00oOoO0(this.f441o00oo00O).o00ooO(0.0f);
            o00ooO2.o00ooO00(this.f464o00ooo0o);
            o00ooo2.o00oOo00(o00ooO2);
            if (this.f455o00ooOO0 && (view2 = this.f443o00oo0O0) != null) {
                view2.setTranslationY(f);
                o00ooo2.o00oOo00(o0O0o00O.o00oOoO0(this.f443o00oo0O0).o00ooO(0.0f));
            }
            o00ooo2.o00oOo0o(f431o00oooOo);
            o00ooo2.o00oOo0O(250L);
            o00ooo2.o00oOoO0(this.f463o00ooo0O);
            this.f459o00ooOoO = o00ooo2;
            o00ooo2.o00oOoO();
        } else {
            this.f441o00oo00O.setAlpha(1.0f);
            this.f441o00oo00O.setTranslationY(0.0f);
            if (this.f455o00ooOO0 && (view = this.f443o00oo0O0) != null) {
                view.setTranslationY(0.0f);
            }
            this.f463o00ooo0O.o00oOOoO(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f438o00oOooo;
        if (actionBarOverlayLayout != null) {
            o0O0o00O.o0O0oOO0(actionBarOverlayLayout);
        }
    }

    public final o0O0OOO o0O0OOOo(View view) {
        if (view instanceof o0O0OOO) {
            return (o0O0OOO) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Can't make a decor toolbar out of ");
        o00oOOo02.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public boolean o0O0OOo() {
        return this.f440o00oo0.o00oOOo0();
    }

    public boolean o0O0OOoO() {
        return this.f440o00oo0.o00oOoO();
    }

    public final void o0O0OOoo() {
        if (this.f458o00ooOo0) {
            this.f458o00ooOo0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f438o00oOooo;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            o0O0Oo(false);
        }
    }

    public final void o0O0Oo(boolean z) {
        if (o0O0O0oo(this.f454o00ooOO, this.f456o00ooOOo, this.f458o00ooOo0)) {
            if (this.f457o00ooOo) {
                return;
            }
            this.f457o00ooOo = true;
            o0O0OOO0(z);
        } else if (this.f457o00ooOo) {
            this.f457o00ooOo = false;
            o0O0OO(z);
        }
    }

    public final void o0O0Oo0(boolean z) {
        this.f453o00ooO0o = z;
        if (z) {
            this.f441o00oo00O.setTabContainer(null);
            this.f440o00oo0.o00ooOO(this.f442o00oo0O);
        } else {
            this.f440o00oo0.o00ooOO(null);
            this.f441o00oo00O.setTabContainer(this.f442o00oo0O);
        }
        boolean z2 = true;
        boolean z3 = o00oo0o() == 2;
        o0OoOoO o0ooooo = this.f442o00oo0O;
        if (o0ooooo != null) {
            if (z3) {
                o0ooooo.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f438o00oOooo;
                if (actionBarOverlayLayout != null) {
                    o0O0o00O.o0O0oOO0(actionBarOverlayLayout);
                }
            } else {
                o0ooooo.setVisibility(8);
            }
        }
        this.f440o00oo0.o00ooO0O(!this.f453o00ooO0o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f438o00oOooo;
        if (this.f453o00ooO0o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    public final boolean o0O0Oo0O() {
        return o0O0o00O.o0O0Oooo(this.f441o00oo00O);
    }

    public final void o0O0Oo0o() {
        if (this.f458o00ooOo0) {
            return;
        }
        this.f458o00ooOo0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f438o00oOooo;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        o0O0Oo(false);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public o00oOOo0.o00oo00O o0O0o() {
        return this.f447o00oo0o0;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0O0oo0o(CharSequence charSequence) {
        this.f440o00oo0.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoO00O(int i) {
        this.f440o00oo0.o00ooo00(i);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoOoOO(boolean z) {
        o0O000O(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0OoOoOo(boolean z) {
        o0O000O(z ? 16 : 0, 16);
    }

    public final void o0OooO0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f438o00oOooo = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f440o00oo0 = o0O0OOOo(view.findViewById(R.id.action_bar));
        this.f444o00oo0OO = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f441o00oo00O = actionBarContainer;
        o0O0OOO o0o0ooo = this.f440o00oo0;
        if (o0o0ooo == null || this.f444o00oo0OO == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f435o00oOoOO = o0o0ooo.getContext();
        boolean z = (this.f440o00oo0.o00oooOO() & 4) != 0;
        if (z) {
            this.f448o00oo0oO = true;
        }
        o00oOoOo.o00oo00O o00oo00o = new o00oOoOo.o00oo00O(this.f435o00oOoOO);
        o0O00O(o00oo00o.o00oOOo0() || z);
        o0O0Oo0(o00oo00o.o00oOoO0());
        TypedArray obtainStyledAttributes = this.f435o00oOoOO.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
            o0O000oo(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            o0O000o(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0oO0O0o(int i) {
        o0O0oo0o(this.f435o00oOoOO.getString(i));
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0oO0Ooo(int i) {
        this.f440o00oo0.setLogo(i);
    }

    public final void o0ooO() {
        if (this.f447o00oo0o0 != null) {
            o00oooo(null);
        }
        this.f445o00oo0Oo.clear();
        o0OoOoO o0ooooo = this.f442o00oo0O;
        if (o0ooooo != null) {
            o0ooooo.o00oOoo0();
        }
        this.f446o00oo0o = -1;
    }

    @Override // androidx.appcompat.app.o00oOOo0
    public void o0ooOoOO(int i) {
        if (i != 0 && !this.f438o00oOooo.o0O0o()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f438o00oOooo.setActionBarHideOffset(i);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.o00oOo0O
    public void onWindowVisibilityChanged(int i) {
        this.f449o00ooO = i;
    }
}
