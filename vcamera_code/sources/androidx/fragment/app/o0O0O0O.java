package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0O00;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class o0O0O0O extends oo0OOoo.o00oOOo0 {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f3086o00oOooo = "FragmentStatePagerAdapt";
    @Deprecated

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f3087o00oo0 = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final boolean f3088o00oo00O = false;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f3089o00oo0OO = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final FragmentManager f3090o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int f3091o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public ArrayList<Fragment.SavedState> f3092o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O0oo0o f3093o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public ArrayList<Fragment> f3094o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public Fragment f3095o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f3096o00oOoo0;

    @Deprecated
    public o0O0O0O(@oo0oO0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public o0O0O0O(@oo0oO0 FragmentManager fragmentManager, int i) {
        this.f3093o00oOoO0 = null;
        this.f3092o00oOoO = new ArrayList<>();
        this.f3094o00oOoOO = new ArrayList<>();
        this.f3095o00oOoOo = null;
        this.f3090o00oOo0O = fragmentManager;
        this.f3091o00oOo0o = i;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oOOoO(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3093o00oOoO0 == null) {
            this.f3093o00oOoO0 = this.f3090o00oOo0O.o00oo0oO();
        }
        while (this.f3092o00oOoO.size() <= i) {
            this.f3092o00oOoO.add(null);
        }
        this.f3092o00oOoO.set(i, fragment.isAdded() ? this.f3090o00oOo0O.o0OO00Oo(fragment) : null);
        this.f3094o00oOoOO.set(i, null);
        this.f3093o00oOoO0.o00ooO00(fragment);
        if (fragment.equals(this.f3095o00oOoOo)) {
            this.f3095o00oOoOo = null;
        }
    }

    @Override // oo0OOoo.o00oOOo0
    @oo0oO0
    public Object o00oOoOo(@oo0oO0 ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3094o00oOoOO.size() <= i || (fragment = this.f3094o00oOoOO.get(i)) == null) {
            if (this.f3093o00oOoO0 == null) {
                this.f3093o00oOoO0 = this.f3090o00oOo0O.o00oo0oO();
            }
            Fragment o0O0o2 = o0O0o(i);
            if (this.f3092o00oOoO.size() > i && (savedState = this.f3092o00oOoO.get(i)) != null) {
                o0O0o2.setInitialSavedState(savedState);
            }
            while (this.f3094o00oOoOO.size() <= i) {
                this.f3094o00oOoOO.add(null);
            }
            o0O0o2.setMenuVisibility(false);
            if (this.f3091o00oOo0o == 0) {
                o0O0o2.setUserVisibleHint(false);
            }
            this.f3094o00oOoOO.set(i, o0O0o2);
            this.f3093o00oOoO0.o00oOOoO(viewGroup.getId(), o0O0o2);
            if (this.f3091o00oOo0o == 1) {
                this.f3093o00oOoO0.o00ooo0(o0O0o2, o0O00.o00oOOoO.STARTED);
            }
            return o0O0o2;
        }
        return fragment;
    }

    @Override // oo0OOoo.o00oOOo0
    public boolean o00oOoo0(@oo0oO0 View view, @oo0oO0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oOooO(@oo0oO0 ViewGroup viewGroup) {
        o0O0oo0o o0o0oo0o = this.f3093o00oOoO0;
        if (o0o0oo0o != null) {
            if (!this.f3096o00oOoo0) {
                try {
                    this.f3096o00oOoo0 = true;
                    o0o0oo0o.o00oo0O0();
                } finally {
                    this.f3096o00oOoo0 = false;
                }
            }
            this.f3093o00oOoO0 = null;
        }
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oo0(@o0OO00OO Parcelable parcelable, @o0OO00OO ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3092o00oOoO.clear();
            this.f3094o00oOoOO.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3092o00oOoO.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment o0O0O0oo2 = this.f3090o00oOo0O.o0O0O0oo(bundle, str);
                    if (o0O0O0oo2 != null) {
                        while (this.f3094o00oOoOO.size() <= parseInt) {
                            this.f3094o00oOoOO.add(null);
                        }
                        o0O0O0oo2.setMenuVisibility(false);
                        this.f3094o00oOoOO.set(parseInt, o0O0O0oo2);
                    }
                }
            }
        }
    }

    @Override // oo0OOoo.o00oOOo0
    public void o00oo0O(@oo0oO0 ViewGroup viewGroup, int i, @oo0oO0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3095o00oOoOo;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3091o00oOo0o == 1) {
                    if (this.f3093o00oOoO0 == null) {
                        this.f3093o00oOoO0 = this.f3090o00oOo0O.o00oo0oO();
                    }
                    this.f3093o00oOoO0.o00ooo0(this.f3095o00oOoOo, o0O00.o00oOOoO.STARTED);
                } else {
                    this.f3095o00oOoOo.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3091o00oOo0o == 1) {
                if (this.f3093o00oOoO0 == null) {
                    this.f3093o00oOoO0 = this.f3090o00oOo0O.o00oo0oO();
                }
                this.f3093o00oOoO0.o00ooo0(fragment, o0O00.o00oOOoO.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3095o00oOoOo = fragment;
        }
    }

    @Override // oo0OOoo.o00oOOo0
    @o0OO00OO
    public Parcelable o00oo0OO() {
        Bundle bundle;
        if (this.f3092o00oOoO.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3092o00oOoO.size()];
            this.f3092o00oOoO.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3094o00oOoOO.size(); i++) {
            Fragment fragment = this.f3094o00oOoOO.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3090o00oOo0O.oo0oOOo(bundle, android.support.v4.media.o00oOOo0.o00oOOo0("f", i), fragment);
            }
        }
        return bundle;
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
