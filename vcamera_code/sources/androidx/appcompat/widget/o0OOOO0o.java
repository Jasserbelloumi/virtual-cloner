package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.badge.BadgeDrawable;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OOOO0o implements o0O0OOO {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f1353o00oo0o = 3;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f1354o00oo0o0 = "ToolbarWidgetWrapper";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final long f1355o00oo0oO = 200;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Toolbar f1356o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1357o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public View f1358o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public View f1359o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Drawable f1360o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public Drawable f1361o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Drawable f1362o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f1363o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public CharSequence f1364o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public CharSequence f1365o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Spinner f1366o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public CharSequence f1367o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f1368o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public Window.Callback f1369o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1370o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f1371o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public ActionMenuPresenter f1372o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Drawable f1373o00oo0Oo;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o00oOoo0.o00oo0OO f1375o00oo0O0;

        public o00oOOo0() {
            this.f1375o00oo0O0 = new o00oOoo0.o00oo0OO(o0OOOO0o.this.f1356o00oOOo0.getContext(), 0, o0O00o0O.o00oOoO.f11139o00oo0O0, 0, 0, o0OOOO0o.this.f1364o00oOoOo);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0OOOO0o o0oooo0o = o0OOOO0o.this;
            Window.Callback callback = o0oooo0o.f1369o00oo00O;
            if (callback == null || !o0oooo0o.f1368o00oo0) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1375o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o0O000oo.o0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f1376o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f1377o00oOOoO;

        public o00oOOoO(int i) {
            this.f1377o00oOOoO = i;
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOo0(View view) {
            this.f1376o00oOOo0 = true;
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            if (this.f1376o00oOOo0) {
                return;
            }
            o0OOOO0o.this.f1356o00oOOo0.setVisibility(this.f1377o00oOOoO);
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOo00(View view) {
            o0OOOO0o.this.f1356o00oOOo0.setVisibility(0);
        }
    }

    public o0OOOO0o(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    public o0OOOO0o(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1371o00oo0O0 = 0;
        this.f1370o00oo0O = 0;
        this.f1356o00oOOo0 = toolbar;
        this.f1364o00oOoOo = toolbar.getTitle();
        this.f1365o00oOoo0 = toolbar.getSubtitle();
        this.f1363o00oOoOO = this.f1364o00oOoOo != null;
        this.f1361o00oOoO = toolbar.getNavigationIcon();
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.f1373o00oo0Oo = o00ooOo2.o00oOoO(R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence o00ooO002 = o00ooOo2.o00ooO00(R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(o00ooO002)) {
                setTitle(o00ooO002);
            }
            CharSequence o00ooO003 = o00ooOo2.o00ooO00(R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(o00ooO003)) {
                o00oo0(o00ooO003);
            }
            Drawable o00oOoO2 = o00ooOo2.o00oOoO(R.styleable.ActionBar_logo);
            if (o00oOoO2 != null) {
                o00ooOOo(o00oOoO2);
            }
            Drawable o00oOoO3 = o00ooOo2.o00oOoO(R.styleable.ActionBar_icon);
            if (o00oOoO3 != null) {
                setIcon(o00oOoO3);
            }
            if (this.f1361o00oOoO == null && (drawable = this.f1373o00oo0Oo) != null) {
                o00oooo(drawable);
            }
            o00oOooo(o00ooOo2.o00oo0OO(R.styleable.ActionBar_displayOptions, 0));
            int o00oo0oO2 = o00ooOo2.o00oo0oO(R.styleable.ActionBar_customNavigationLayout, 0);
            if (o00oo0oO2 != 0) {
                o00oooOo(LayoutInflater.from(this.f1356o00oOOo0.getContext()).inflate(o00oo0oO2, (ViewGroup) this.f1356o00oOOo0, false));
                o00oOooo(this.f1357o00oOOoO | 16);
            }
            int o00oo0O2 = o00ooOo2.o00oo0O(R.styleable.ActionBar_height, 0);
            if (o00oo0O2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1356o00oOOo0.getLayoutParams();
                layoutParams.height = o00oo0O2;
                this.f1356o00oOOo0.setLayoutParams(layoutParams);
            }
            int o00oOo0o2 = o00ooOo2.o00oOo0o(R.styleable.ActionBar_contentInsetStart, -1);
            int o00oOo0o3 = o00ooOo2.o00oOo0o(R.styleable.ActionBar_contentInsetEnd, -1);
            if (o00oOo0o2 >= 0 || o00oOo0o3 >= 0) {
                this.f1356o00oOOo0.setContentInsetsRelative(Math.max(o00oOo0o2, 0), Math.max(o00oOo0o3, 0));
            }
            int o00oo0oO3 = o00ooOo2.o00oo0oO(R.styleable.ActionBar_titleTextStyle, 0);
            if (o00oo0oO3 != 0) {
                Toolbar toolbar2 = this.f1356o00oOOo0;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), o00oo0oO3);
            }
            int o00oo0oO4 = o00ooOo2.o00oo0oO(R.styleable.ActionBar_subtitleTextStyle, 0);
            if (o00oo0oO4 != 0) {
                Toolbar toolbar3 = this.f1356o00oOOo0;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), o00oo0oO4);
            }
            int o00oo0oO5 = o00ooOo2.o00oo0oO(R.styleable.ActionBar_popupTheme, 0);
            if (o00oo0oO5 != 0) {
                this.f1356o00oOOo0.setPopupTheme(o00oo0oO5);
            }
        } else {
            this.f1357o00oOOoO = o00ooooO();
        }
        o00ooOo2.o00ooOoo();
        o00ooO0o(i);
        this.f1367o00oOooo = this.f1356o00oOOo0.getNavigationContentDescription();
        this.f1356o00oOOo0.setNavigationOnClickListener(new o00oOOo0());
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void collapseActionView() {
        this.f1356o00oOOo0.collapseActionView();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public Context getContext() {
        return this.f1356o00oOOo0.getContext();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int getHeight() {
        return this.f1356o00oOOo0.getHeight();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public CharSequence getTitle() {
        return this.f1356o00oOOo0.getTitle();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int getVisibility() {
        return this.f1356o00oOOo0.getVisibility();
    }

    public final void o0(CharSequence charSequence) {
        this.f1364o00oOoOo = charSequence;
        if ((this.f1357o00oOOoO & 8) != 0) {
            this.f1356o00oOOo0.setTitle(charSequence);
            if (this.f1363o00oOoOO) {
                o0O000oo.o0O0o00O.o0O0oo0(this.f1356o00oOOo0.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOOo0() {
        return this.f1360o00oOo0o != null;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOOoO() {
        return this.f1356o00oOOo0.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOo00() {
        return this.f1356o00oOOo0.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oOo0O(Menu menu, o00oo0O.o00oOOo0 o00oooo02) {
        if (this.f1372o00oo0OO == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1356o00oOOo0.getContext());
            this.f1372o00oo0OO = actionMenuPresenter;
            actionMenuPresenter.o00oOoO(R.id.action_menu_presenter);
        }
        this.f1372o00oo0OO.setCallback(o00oooo02);
        this.f1356o00oOOo0.setMenu((androidx.appcompat.view.menu.o00oOoO) menu, this.f1372o00oo0OO);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOo0o() {
        return this.f1356o00oOOo0.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOoO() {
        return this.f1362o00oOoO0 != null;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oOoO0() {
        this.f1368o00oo0 = true;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOoOO() {
        return this.f1356o00oOOo0.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOoOo() {
        return this.f1356o00oOOo0.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOoo0() {
        return this.f1356o00oOOo0.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00oOooO() {
        return this.f1356o00oOOo0.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oOooo(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1357o00oOOoO ^ i;
        this.f1357o00oOOoO = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    o0O00000();
                }
                o0O0000O();
            }
            if ((i2 & 3) != 0) {
                o0O0000o();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1356o00oOOo0.setTitle(this.f1364o00oOoOo);
                    toolbar = this.f1356o00oOOo0;
                    charSequence = this.f1365o00oOoo0;
                } else {
                    charSequence = null;
                    this.f1356o00oOOo0.setTitle((CharSequence) null);
                    toolbar = this.f1356o00oOOo0;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1359o00oOo0O) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1356o00oOOo0.addView(view);
            } else {
                this.f1356o00oOOo0.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oo(int i) {
        o00oo00O(i == 0 ? null : getContext().getString(i));
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oo0(CharSequence charSequence) {
        this.f1365o00oOoo0 = charSequence;
        if ((this.f1357o00oOOoO & 8) != 0) {
            this.f1356o00oOOo0.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oo00O(CharSequence charSequence) {
        this.f1367o00oOooo = charSequence;
        o0O00000();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int o00oo0O() {
        return this.f1371o00oo0O0;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public Menu o00oo0O0() {
        return this.f1356o00oOOo0.getMenu();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oo0OO(int i) {
        Spinner spinner = this.f1366o00oOooO;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public o0O000oo.o0OO0oO0 o00oo0Oo(int i, long j) {
        return o0O000oo.o0O0o00O.o00oOoO0(this.f1356o00oOOo0).o00oOOoO(i == 0 ? 1.0f : 0.0f).o00oo0o0(j).o00oo0oO(new o00oOOoO(i));
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public ViewGroup o00oo0o() {
        return this.f1356o00oOOo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.o0O0OOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0o0(int r5) {
        /*
            r4 = this;
            int r0 = r4.f1371o00oo0O0
            if (r5 == r0) goto L66
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L1a
            if (r0 == r1) goto Lb
            goto L2b
        Lb:
            android.view.View r0 = r4.f1358o00oOo00
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1356o00oOOo0
            if (r0 != r3) goto L2b
            android.view.View r0 = r4.f1358o00oOo00
            goto L28
        L1a:
            android.widget.Spinner r0 = r4.f1366o00oOooO
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1356o00oOOo0
            if (r0 != r3) goto L2b
            android.widget.Spinner r0 = r4.f1366o00oOooO
        L28:
            r3.removeView(r0)
        L2b:
            r4.f1371o00oo0O0 = r5
            if (r5 == 0) goto L66
            r0 = 0
            if (r5 == r2) goto L5c
            if (r5 != r1) goto L50
            android.view.View r5 = r4.f1358o00oOo00
            if (r5 == 0) goto L66
            androidx.appcompat.widget.Toolbar r1 = r4.f1356o00oOOo0
            r1.addView(r5, r0)
            android.view.View r5 = r4.f1358o00oOo00
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$o00oo0 r5 = (androidx.appcompat.widget.Toolbar.o00oo0) r5
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r5.f371o00oOOo0 = r0
            goto L66
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid navigation mode "
            java.lang.String r5 = android.support.v4.media.o00oOOo0.o00oOOo0(r1, r5)
            r0.<init>(r5)
            throw r0
        L5c:
            r4.o00ooooo()
            androidx.appcompat.widget.Toolbar r5 = r4.f1356o00oOOo0
            android.widget.Spinner r1 = r4.f1366o00oOooO
            r5.addView(r1, r0)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0OOOO0o.o00oo0o0(int):void");
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oo0oO(boolean z) {
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooO() {
        this.f1356o00oOOo0.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int o00ooO0() {
        Spinner spinner = this.f1366o00oOooO;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooO00() {
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooO0O(boolean z) {
        this.f1356o00oOOo0.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooO0o(int i) {
        if (i == this.f1370o00oo0O) {
            return;
        }
        this.f1370o00oo0O = i;
        if (TextUtils.isEmpty(this.f1356o00oOOo0.getNavigationContentDescription())) {
            o00oo(this.f1370o00oo0O);
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooOO(o0OoOoO o0ooooo) {
        View view = this.f1358o00oOo00;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1356o00oOOo0;
            if (parent == toolbar) {
                toolbar.removeView(this.f1358o00oOo00);
            }
        }
        this.f1358o00oOo00 = o0ooooo;
        if (o0ooooo == null || this.f1371o00oo0O0 != 2) {
            return;
        }
        this.f1356o00oOOo0.addView(o0ooooo, 0);
        Toolbar.o00oo0 o00oo0Var = (Toolbar.o00oo0) this.f1358o00oOo00.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) o00oo0Var).width = -2;
        ((ViewGroup.MarginLayoutParams) o00oo0Var).height = -2;
        o00oo0Var.f371o00oOOo0 = BadgeDrawable.BOTTOM_START;
        o0ooooo.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public View o00ooOO0() {
        return this.f1359o00oOo0O;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooOOo(Drawable drawable) {
        this.f1362o00oOoO0 = drawable;
        o0O0000o();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooOo(SparseArray<Parcelable> sparseArray) {
        this.f1356o00oOOo0.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooOo0(Drawable drawable) {
        if (this.f1373o00oo0Oo != drawable) {
            this.f1373o00oo0Oo = drawable;
            o0O0000O();
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public boolean o00ooOoO() {
        return this.f1358o00oOo00 != null;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooOoo(int i) {
        o0O000oo.o0OO0oO0 o00oo0Oo2 = o00oo0Oo(i, 200L);
        if (o00oo0Oo2 != null) {
            o00oo0Oo2.o00ooO0();
        }
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooo0(o00oo0O.o00oOOo0 o00oooo02, o00oOoO.o00oOOo0 o00oooo03) {
        this.f1356o00oOOo0.setMenuCallbacks(o00oooo02, o00oooo03);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooo00(int i) {
        o00oooo(i != 0 ? o00oOo0o.o00oOo00.o00oOOoO(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooo0O(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        o00ooooo();
        this.f1366o00oOooO.setAdapter(spinnerAdapter);
        this.f1366o00oOooO.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00ooo0o(SparseArray<Parcelable> sparseArray) {
        this.f1356o00oOOo0.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public CharSequence o00oooO() {
        return this.f1356o00oOOo0.getSubtitle();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int o00oooOO() {
        return this.f1357o00oOOoO;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oooOo(View view) {
        View view2 = this.f1359o00oOo0O;
        if (view2 != null && (this.f1357o00oOOoO & 16) != 0) {
            this.f1356o00oOOo0.removeView(view2);
        }
        this.f1359o00oOo0O = view;
        if (view == null || (this.f1357o00oOOoO & 16) == 0) {
            return;
        }
        this.f1356o00oOOo0.addView(view);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oooo(Drawable drawable) {
        this.f1361o00oOoO = drawable;
        o0O0000O();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void o00oooo0() {
    }

    public final int o00ooooO() {
        if (this.f1356o00oOOo0.getNavigationIcon() != null) {
            this.f1373o00oo0Oo = this.f1356o00oOOo0.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public final void o00ooooo() {
        if (this.f1366o00oOooO == null) {
            this.f1366o00oOooO = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
            this.f1366o00oOooO.setLayoutParams(new Toolbar.o00oo0(-2, -2, 8388627));
        }
    }

    public final void o0O00000() {
        if ((this.f1357o00oOOoO & 4) != 0) {
            if (TextUtils.isEmpty(this.f1367o00oOooo)) {
                this.f1356o00oOOo0.setNavigationContentDescription(this.f1370o00oo0O);
            } else {
                this.f1356o00oOOo0.setNavigationContentDescription(this.f1367o00oOooo);
            }
        }
    }

    public final void o0O0000O() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1357o00oOOoO & 4) != 0) {
            toolbar = this.f1356o00oOOo0;
            drawable = this.f1361o00oOoO;
            if (drawable == null) {
                drawable = this.f1373o00oo0Oo;
            }
        } else {
            toolbar = this.f1356o00oOOo0;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void o0O0000o() {
        Drawable drawable;
        int i = this.f1357o00oOOoO;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1362o00oOoO0) == null) {
            drawable = this.f1360o00oOo0o;
        }
        this.f1356o00oOOo0.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public int o0O0o() {
        Spinner spinner = this.f1366o00oOooO;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setBackgroundDrawable(Drawable drawable) {
        o0O000oo.o0O0o00O.o0O0ooo0(this.f1356o00oOOo0, drawable);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setIcon(int i) {
        setIcon(i != 0 ? o00oOo0o.o00oOo00.o00oOOoO(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setIcon(Drawable drawable) {
        this.f1360o00oOo0o = drawable;
        o0O0000o();
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setLogo(int i) {
        o00ooOOo(i != 0 ? o00oOo0o.o00oOo00.o00oOOoO(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setTitle(CharSequence charSequence) {
        this.f1363o00oOoOO = true;
        o0(charSequence);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setVisibility(int i) {
        this.f1356o00oOOo0.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setWindowCallback(Window.Callback callback) {
        this.f1369o00oo00O = callback;
    }

    @Override // androidx.appcompat.widget.o0O0OOO
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1363o00oOoOO) {
            return;
        }
        o0(charSequence);
    }
}
