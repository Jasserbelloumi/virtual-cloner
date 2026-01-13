package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o0O00;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class o0O00OOO extends oo0OOoo.o00oOOo0 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f3063o00oOoOo = "FragmentPagerAdapter";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final boolean f3064o00oOoo0 = false;
    @Deprecated

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f3065o00oOooo = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f3066o00oo00O = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final FragmentManager f3067o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int f3068o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public Fragment f3069o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O0oo0o f3070o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f3071o00oOoOO;

    @Deprecated
    public o0O00OOO(@oo0oO0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public o0O00OOO(@oo0oO0 FragmentManager fragmentManager, int i) {
        this.f3070o00oOoO0 = null;
        this.f3069o00oOoO = null;
        this.f3067o00oOo0O = fragmentManager;
        this.f3068o00oOo0o = i;
    }

    public static String o00ooO00(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oOOoO(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3070o00oOoO0 == null) {
            this.f3070o00oOoO0 = this.f3067o00oOo0O.o00oo0oO();
        }
        this.f3070o00oOoO0.o00oo0Oo(fragment);
        if (fragment.equals(this.f3069o00oOoO)) {
            this.f3069o00oOoO = null;
        }
    }

    @Override // oo0OOoo.o00oOOo0
    @oo0oO0
    public Object o00oOoOo(@oo0oO0 ViewGroup viewGroup, int i) {
        if (this.f3070o00oOoO0 == null) {
            this.f3070o00oOoO0 = this.f3067o00oOo0O.o00oo0oO();
        }
        long o00oo2 = o00oo(i);
        Fragment o0O00o002 = this.f3067o00oOo0O.o0O00o00(o00ooO00(viewGroup.getId(), o00oo2));
        if (o0O00o002 != null) {
            this.f3070o00oOoO0.o00oOooo(o0O00o002);
        } else {
            o0O00o002 = o0O0o(i);
            this.f3070o00oOoO0.o00oOo00(viewGroup.getId(), o0O00o002, o00ooO00(viewGroup.getId(), o00oo2));
        }
        if (o0O00o002 != this.f3069o00oOoO) {
            o0O00o002.setMenuVisibility(false);
            if (this.f3068o00oOo0o == 1) {
                this.f3070o00oOoO0.o00ooo0(o0O00o002, o0O00.o00oOOoO.STARTED);
            } else {
                o0O00o002.setUserVisibleHint(false);
            }
        }
        return o0O00o002;
    }

    @Override // oo0OOoo.o00oOOo0
    public boolean o00oOoo0(@oo0oO0 View view, @oo0oO0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oOooO(@oo0oO0 ViewGroup viewGroup) {
        o0O0oo0o o0o0oo0o = this.f3070o00oOoO0;
        if (o0o0oo0o != null) {
            if (!this.f3071o00oOoOO) {
                try {
                    this.f3071o00oOoOO = true;
                    o0o0oo0o.o00oo0O0();
                } finally {
                    this.f3071o00oOoOO = false;
                }
            }
            this.f3070o00oOoO0 = null;
        }
    }

    public long o00oo(int i) {
        return i;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oo0(@o0OO00OO Parcelable parcelable, @o0OO00OO ClassLoader classLoader) {
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oo0O(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3069o00oOoO;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3068o00oOo0o == 1) {
                    if (this.f3070o00oOoO0 == null) {
                        this.f3070o00oOoO0 = this.f3067o00oOo0O.o00oo0oO();
                    }
                    this.f3070o00oOoO0.o00ooo0(this.f3069o00oOoO, o0O00.o00oOOoO.STARTED);
                } else {
                    this.f3069o00oOoO.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3068o00oOo0o == 1) {
                if (this.f3070o00oOoO0 == null) {
                    this.f3070o00oOoO0 = this.f3067o00oOo0O.o00oo0oO();
                }
                this.f3070o00oOoO0.o00ooo0(fragment, o0O00.o00oOOoO.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3069o00oOoO = fragment;
        }
    }

    @Override // oo0OOoo.o00oOOo0
    @o0OO00OO
    public Parcelable o00oo0OO() {
        return null;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oo0o(@oo0oO0 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @oo0oO0
    public abstract Fragment o0O0o(int i);
}
