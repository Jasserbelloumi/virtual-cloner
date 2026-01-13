package androidx.preference;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.o0O000O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
@Deprecated
/* loaded from: classes.dex */
public abstract class o00oo extends Fragment implements o0O000O.o00oOo00, o0O000O.o00oOOo0, o0O000O.o00oOOoO, DialogPreference.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f3812o00ooO = "androidx.preference.PreferenceFragment.DIALOG";
    @Deprecated

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f3813o00ooO0O = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f3814o00ooO0o = "android:preferences";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f3815o00ooOO0 = 1;

    /* renamed from: o00oo  reason: collision with root package name */
    public Runnable f3816o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O000O f3817o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public RecyclerView f3819o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f3820o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f3821o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Context f3822o00oo0oO;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O f3818o00oo0O0 = new o00oOo0O();

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f3825o0O0o = R.layout.preference_list_fragment;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final Handler f3824o00ooO00 = new o00oOOo0();

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final Runnable f3823o00ooO0 = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Handler {
        public o00oOOo0() {
        }

        @Override // android.os.Handler
        public void handleMessage(@oo0oO0 Message message) {
            if (message.what != 1) {
                return;
            }
            o00oo.this.o00oOo0o();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o00oo.this.f3819o00oo0Oo;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f3828o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Preference f3829o00oo0O0;

        public o00oOo00(Preference preference, String str) {
            this.f3829o00oo0O0 = preference;
            this.f3828o00oo0O = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.o00oo0OO adapter = o00oo.this.f3819o00oo0Oo.getAdapter();
            if (!(adapter instanceof PreferenceGroup.o00oOo00)) {
                if (adapter != null) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f3829o00oo0O0;
            int o00oOo0O2 = preference != null ? ((PreferenceGroup.o00oOo00) adapter).o00oOo0O(preference) : ((PreferenceGroup.o00oOo00) adapter).o00oo0o0(this.f3828o00oo0O);
            if (o00oOo0O2 != -1) {
                o00oo.this.f3819o00oo0Oo.scrollToPosition(o00oOo0O2);
            } else {
                adapter.registerAdapterDataObserver(new o00oo0OO(adapter, o00oo.this.f3819o00oo0Oo, this.f3829o00oo0O0, this.f3828o00oo0O));
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends RecyclerView.o0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Drawable f3831o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f3832o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f3833o00oOo00 = true;

        public o00oOo0O() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0
        public void getItemOffsets(@oo0oO0 Rect rect, @oo0oO0 View view, @oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo) {
            if (o00oOoOO(view, recyclerView)) {
                rect.bottom = this.f3832o00oOOoO;
            }
        }

        public void o00oOo0o(boolean z) {
            this.f3833o00oOo00 = z;
        }

        public void o00oOoO(int i) {
            this.f3832o00oOOoO = i;
            o00oo.this.f3819o00oo0Oo.invalidateItemDecorations();
        }

        public void o00oOoO0(@o0OO00OO Drawable drawable) {
            this.f3832o00oOOoO = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.f3831o00oOOo0 = drawable;
            o00oo.this.f3819o00oo0Oo.invalidateItemDecorations();
        }

        public final boolean o00oOoOO(@oo0oO0 View view, @oo0oO0 RecyclerView recyclerView) {
            RecyclerView.o0O00oO0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if ((childViewHolder instanceof o0O000Oo) && ((o0O000Oo) childViewHolder).o00oOooO()) {
                boolean z2 = this.f3833o00oOo00;
                int indexOfChild = recyclerView.indexOfChild(view);
                if (indexOfChild < recyclerView.getChildCount() - 1) {
                    RecyclerView.o0O00oO0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
                    if ((childViewHolder2 instanceof o0O000Oo) && ((o0O000Oo) childViewHolder2).o00oOo00()) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0
        public void onDrawOver(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo) {
            if (this.f3831o00oOOo0 == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (o00oOoOO(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f3831o00oOOo0.setBounds(0, height, width, this.f3832o00oOOoO + height);
                    this.f3831o00oOOo0.draw(canvas);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean o00oOOo0(@oo0oO0 o00oo o00ooVar, @oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public interface o00oo0 {
        boolean o00oOOo0(@oo0oO0 o00oo o00ooVar, @oo0oO0 PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        boolean o00oOOo0(@oo0oO0 o00oo o00ooVar, @oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends RecyclerView.o00oo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final RecyclerView.o00oo0OO<?> f3835o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final RecyclerView f3836o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Preference f3837o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final String f3838o00oOooO;

        public o00oo0OO(@oo0oO0 RecyclerView.o00oo0OO<?> o00oo0oo, @oo0oO0 RecyclerView recyclerView, Preference preference, String str) {
            this.f3835o00oOOo0 = o00oo0oo;
            this.f3836o00oOOoO = recyclerView;
            this.f3837o00oOo00 = preference;
            this.f3838o00oOooO = str;
        }

        public final void o00oOOo0() {
            this.f3835o00oOOo0.unregisterAdapterDataObserver(this);
            Preference preference = this.f3837o00oOo00;
            int o00oOo0O2 = preference != null ? ((PreferenceGroup.o00oOo00) this.f3835o00oOOo0).o00oOo0O(preference) : ((PreferenceGroup.o00oOo00) this.f3835o00oOOo0).o00oo0o0(this.f3838o00oOooO);
            if (o00oOo0O2 != -1) {
                this.f3836o00oOOoO.scrollToPosition(o00oOo0O2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onChanged() {
            o00oOOo0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeChanged(int i, int i2) {
            o00oOOo0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeChanged(int i, int i2, Object obj) {
            o00oOOo0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeInserted(int i, int i2) {
            o00oOOo0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeMoved(int i, int i2, int i3) {
            o00oOOo0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeRemoved(int i, int i2) {
            o00oOOo0();
        }
    }

    @Override // androidx.preference.o0O000O.o00oOOoO
    @Deprecated
    public void o00oOOo0(@oo0oO0 PreferenceScreen preferenceScreen) {
        if ((o00oOoO0() instanceof o00oo0 ? ((o00oo0) o00oOoO0()).o00oOOo0(this, preferenceScreen) : false) || !(getActivity() instanceof o00oo0)) {
            return;
        }
        ((o00oo0) getActivity()).o00oOOo0(this, preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.o00oOOo0
    @Deprecated
    public <T extends Preference> T o00oOOoO(@oo0oO0 CharSequence charSequence) {
        o0O000O o0o000o = this.f3817o00oo0O;
        if (o0o000o == null) {
            return null;
        }
        return (T) o0o000o.o00oOOoO(charSequence);
    }

    @Deprecated
    public void o00oOo00(@o0oo0000 int i) {
        o00oo0Oo();
        o00ooO00(this.f3817o00oo0O.o00oo0Oo(this.f3822o00oo0oO, i, o00oOoOo()));
    }

    @Override // androidx.preference.o0O000O.o00oOo00
    @Deprecated
    public boolean o00oOo0O(@oo0oO0 Preference preference) {
        if (preference.o00oo0O() != null) {
            boolean o00oOOo02 = o00oOoO0() instanceof o00oo00O ? ((o00oo00O) o00oOoO0()).o00oOOo0(this, preference) : false;
            return (o00oOOo02 || !(getActivity() instanceof o00oo00O)) ? o00oOOo02 : ((o00oo00O) getActivity()).o00oOOo0(this, preference);
        }
        return false;
    }

    public void o00oOo0o() {
        PreferenceScreen o00oOoOo2 = o00oOoOo();
        if (o00oOoOo2 != null) {
            o00oOoO().setAdapter(o00oOooo(o00oOoOo2));
            o00oOoOo2.o0OoOoOo();
        }
        o00oOoo0();
    }

    @Deprecated
    public final RecyclerView o00oOoO() {
        return this.f3819o00oo0Oo;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Fragment o00oOoO0() {
        return null;
    }

    @Deprecated
    public o0O000O o00oOoOO() {
        return this.f3817o00oo0O;
    }

    @Deprecated
    public PreferenceScreen o00oOoOo() {
        return this.f3817o00oo0O.o00oo0();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOoo0() {
    }

    @Override // androidx.preference.o0O000O.o00oOOo0
    @Deprecated
    public void o00oOooO(@oo0oO0 Preference preference) {
        DialogFragment o00oOoOO2;
        boolean o00oOOo02 = o00oOoO0() instanceof o00oOoO ? ((o00oOoO) o00oOoO0()).o00oOOo0(this, preference) : false;
        if (!o00oOOo02 && (getActivity() instanceof o00oOoO)) {
            o00oOOo02 = ((o00oOoO) getActivity()).o00oOOo0(this, preference);
        }
        if (!o00oOOo02 && getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                o00oOoOO2 = androidx.preference.o00oOOoO.o00oOoOO(preference.o00oo0oO());
            } else if (preference instanceof ListPreference) {
                o00oOoOO2 = androidx.preference.o00oOoO.o00oOoOO(preference.o00oo0oO());
            } else if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            } else {
                o00oOoOO2 = androidx.preference.o00oo0.o00oOoOO(preference.o00oo0oO());
            }
            o00oOoOO2.setTargetFragment(this, 0);
            o00oOoOO2.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @oo0oO0
    @Deprecated
    public RecyclerView.o00oo0OO o00oOooo(@oo0oO0 PreferenceScreen preferenceScreen) {
        return new o00ooO(preferenceScreen);
    }

    @Deprecated
    public void o00oo(int i) {
        this.f3818o00oo0O0.o00oOoO(i);
    }

    @Deprecated
    public abstract void o00oo0(@o0OO00OO Bundle bundle, String str);

    @oo0oO0
    @Deprecated
    public RecyclerView.o0O00000 o00oo00O() {
        return new LinearLayoutManager(getActivity());
    }

    public final void o00oo0O() {
        if (this.f3824o00ooO00.hasMessages(1)) {
            return;
        }
        this.f3824o00ooO00.obtainMessage(1).sendToTarget();
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oo0O0() {
    }

    @oo0oO0
    @Deprecated
    public RecyclerView o00oo0OO(@oo0oO0 LayoutInflater layoutInflater, @oo0oO0 ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        RecyclerView recyclerView;
        if (!this.f3822o00oo0oO.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
            recyclerView2.setLayoutManager(o00oo00O());
            recyclerView2.setAccessibilityDelegateCompat(new o0OoOoOo(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    public final void o00oo0Oo() {
        if (this.f3817o00oo0O == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    @Deprecated
    public void o00oo0o(@oo0oO0 String str) {
        o00oo0oO(null, str);
    }

    @Deprecated
    public void o00oo0o0(@oo0oO0 Preference preference) {
        o00oo0oO(preference, null);
    }

    public final void o00oo0oO(Preference preference, String str) {
        o00oOo00 o00ooo002 = new o00oOo00(preference, str);
        if (this.f3819o00oo0Oo == null) {
            this.f3816o00oo = o00ooo002;
        } else {
            o00ooo002.run();
        }
    }

    @Deprecated
    public void o00ooO0(@o0oo0000 int i, @o0OO00OO String str) {
        o00oo0Oo();
        PreferenceScreen o00oo0Oo2 = this.f3817o00oo0O.o00oo0Oo(this.f3822o00oo0oO, i, null);
        Object obj = o00oo0Oo2;
        if (str != null) {
            Object o0O0o0oo2 = o00oo0Oo2.o0O0o0oo(str);
            boolean z = o0O0o0oo2 instanceof PreferenceScreen;
            obj = o0O0o0oo2;
            if (!z) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        o00ooO00((PreferenceScreen) obj);
    }

    @Deprecated
    public void o00ooO00(PreferenceScreen preferenceScreen) {
        if (!this.f3817o00oo0O.o00ooOO0(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        o00oo0O0();
        this.f3821o00oo0o0 = true;
        if (this.f3820o00oo0o) {
            o00oo0O();
        }
    }

    public final void o00ooO0O() {
        PreferenceScreen o00oOoOo2 = o00oOoOo();
        if (o00oOoOo2 != null) {
            o00oOoOo2.o0O000oo();
        }
        o00oo0O0();
    }

    @Deprecated
    public void o0O0o(@o0OO00OO Drawable drawable) {
        this.f3818o00oo0O0.o00oOoO0(drawable);
    }

    @Override // android.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.f3822o00oo0oO = contextThemeWrapper;
        o0O000O o0o000o = new o0O000O(contextThemeWrapper);
        this.f3817o00oo0O = o0o000o;
        o0o000o.o00ooO0(this);
        o00oo0(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    @oo0oO0
    public View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        Context context = this.f3822o00oo0oO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.PreferenceFragment, o0O0o00.o00oOOo0(context, R.attr.preferenceFragmentStyle, androidx.preference.o00oOOo0.f3793o00oOooO), 0);
        this.f3825o0O0o = obtainStyledAttributes.getResourceId(R.styleable.PreferenceFragment_android_layout, this.f3825o0O0o);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f3822o00oo0oO);
        View inflate = cloneInContext.inflate(this.f3825o0O0o, viewGroup, false);
        View findViewById = inflate.findViewById(androidx.preference.o00oOOo0.f3791o00oOOoO);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView o00oo0OO2 = o00oo0OO(cloneInContext, viewGroup2, bundle);
            if (o00oo0OO2 != null) {
                this.f3819o00oo0Oo = o00oo0OO2;
                o00oo0OO2.addItemDecoration(this.f3818o00oo0O0);
                o0O0o(drawable);
                if (dimensionPixelSize != -1) {
                    o00oo(dimensionPixelSize);
                }
                this.f3818o00oo0O0.o00oOo0o(z);
                if (this.f3819o00oo0Oo.getParent() == null) {
                    viewGroup2.addView(this.f3819o00oo0Oo);
                }
                this.f3824o00ooO00.post(this.f3823o00ooO0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f3824o00ooO00.removeCallbacks(this.f3823o00ooO0);
        this.f3824o00ooO00.removeMessages(1);
        if (this.f3821o00oo0o0) {
            o00ooO0O();
        }
        this.f3819o00oo0Oo = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen o00oOoOo2 = o00oOoOo();
        if (o00oOoOo2 != null) {
            Bundle bundle2 = new Bundle();
            o00oOoOo2.o00oOoOo(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3817o00oo0O.o00ooO0O(this);
        this.f3817o00oo0O.o00ooO00(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3817o00oo0O.o00ooO0O(null);
        this.f3817o00oo0O.o00ooO00(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@oo0oO0 View view, @o0OO00OO Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen o00oOoOo2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (o00oOoOo2 = o00oOoOo()) != null) {
            o00oOoOo2.o00oOoO(bundle2);
        }
        if (this.f3821o00oo0o0) {
            o00oOo0o();
            Runnable runnable = this.f3816o00oo;
            if (runnable != null) {
                runnable.run();
                this.f3816o00oo = null;
            }
        }
        this.f3820o00oo0o = true;
    }
}
