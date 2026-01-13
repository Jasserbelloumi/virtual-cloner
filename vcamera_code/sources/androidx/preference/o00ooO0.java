package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.o0O000O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00ooO0 extends Fragment implements o0O000O.o00oOo00, o0O000O.o00oOOo0, o0O000O.o00oOOoO, DialogPreference.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f3895o00ooO = "androidx.preference.PreferenceFragment.DIALOG";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f3896o00ooO0 = "PreferenceFragment";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f3897o00ooO0O = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f3898o00ooO0o = "android:preferences";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f3899o00ooOO0 = 1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0O000O f3901o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public RecyclerView f3903o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f3904o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f3905o00oo0o0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Runnable f3908o0O0o;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O f3902o00oo0O0 = new o00oOo0O();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f3906o00oo0oO = R.layout.preference_list_fragment;

    /* renamed from: o00oo  reason: collision with root package name */
    public final Handler f3900o00oo = new o00oOOo0(Looper.getMainLooper());

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final Runnable f3907o00ooO00 = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Handler {
        public o00oOOo0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            o00ooO0.this.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o00ooO0.this.f3903o00oo0Oo;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f3911o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Preference f3912o00oo0O0;

        public o00oOo00(Preference preference, String str) {
            this.f3912o00oo0O0 = preference;
            this.f3911o00oo0O = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.o00oo0OO adapter = o00ooO0.this.f3903o00oo0Oo.getAdapter();
            if (!(adapter instanceof PreferenceGroup.o00oOo00)) {
                if (adapter != null) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f3912o00oo0O0;
            int o00oOo0O2 = preference != null ? ((PreferenceGroup.o00oOo00) adapter).o00oOo0O(preference) : ((PreferenceGroup.o00oOo00) adapter).o00oo0o0(this.f3911o00oo0O);
            if (o00oOo0O2 != -1) {
                o00ooO0.this.f3903o00oo0Oo.scrollToPosition(o00oOo0O2);
            } else {
                adapter.registerAdapterDataObserver(new o00oo0OO(adapter, o00ooO0.this.f3903o00oo0Oo, this.f3912o00oo0O0, this.f3911o00oo0O));
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends RecyclerView.o0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Drawable f3914o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f3915o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f3916o00oOo00 = true;

        public o00oOo0O() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0
        public void getItemOffsets(@oo0oO0 Rect rect, @oo0oO0 View view, @oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo) {
            if (o00oOoOO(view, recyclerView)) {
                rect.bottom = this.f3915o00oOOoO;
            }
        }

        public void o00oOo0o(boolean z) {
            this.f3916o00oOo00 = z;
        }

        public void o00oOoO(int i) {
            this.f3915o00oOOoO = i;
            o00ooO0.this.f3903o00oo0Oo.invalidateItemDecorations();
        }

        public void o00oOoO0(Drawable drawable) {
            this.f3915o00oOOoO = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.f3914o00oOOo0 = drawable;
            o00ooO0.this.f3903o00oo0Oo.invalidateItemDecorations();
        }

        public final boolean o00oOoOO(View view, RecyclerView recyclerView) {
            RecyclerView.o0O00oO0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z = false;
            if ((childViewHolder instanceof o0O000Oo) && ((o0O000Oo) childViewHolder).o00oOooO()) {
                boolean z2 = this.f3916o00oOo00;
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
            if (this.f3914o00oOOo0 == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (o00oOoOO(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f3914o00oOOo0.setBounds(0, height, width, this.f3915o00oOOoO + height);
                    this.f3914o00oOOo0.draw(canvas);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean o00oOOo0(@oo0oO0 o00ooO0 o00ooo02, @oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public interface o00oo0 {
        boolean o00oOOo0(@oo0oO0 o00ooO0 o00ooo02, @oo0oO0 PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        boolean o00oOo00(@oo0oO0 o00ooO0 o00ooo02, @oo0oO0 Preference preference);
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends RecyclerView.o00oo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final RecyclerView.o00oo0OO<?> f3918o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final RecyclerView f3919o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Preference f3920o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final String f3921o00oOooO;

        public o00oo0OO(RecyclerView.o00oo0OO<?> o00oo0oo, RecyclerView recyclerView, Preference preference, String str) {
            this.f3918o00oOOo0 = o00oo0oo;
            this.f3919o00oOOoO = recyclerView;
            this.f3920o00oOo00 = preference;
            this.f3921o00oOooO = str;
        }

        public final void o00oOOo0() {
            this.f3918o00oOOo0.unregisterAdapterDataObserver(this);
            Preference preference = this.f3920o00oOo00;
            int o00oOo0O2 = preference != null ? ((PreferenceGroup.o00oOo00) this.f3918o00oOOo0).o00oOo0O(preference) : ((PreferenceGroup.o00oOo00) this.f3918o00oOOo0).o00oo0o0(this.f3921o00oOooO);
            if (o00oOo0O2 != -1) {
                this.f3919o00oOOoO.scrollToPosition(o00oOo0O2);
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
    public void o00oOOo0(@oo0oO0 PreferenceScreen preferenceScreen) {
        boolean o00oOOo02 = o00oOoO() instanceof o00oo0 ? ((o00oo0) o00oOoO()).o00oOOo0(this, preferenceScreen) : false;
        for (Fragment fragment = this; !o00oOOo02 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof o00oo0) {
                o00oOOo02 = ((o00oo0) fragment).o00oOOo0(this, preferenceScreen);
            }
        }
        if (!o00oOOo02 && (getContext() instanceof o00oo0)) {
            o00oOOo02 = ((o00oo0) getContext()).o00oOOo0(this, preferenceScreen);
        }
        if (o00oOOo02 || !(getActivity() instanceof o00oo0)) {
            return;
        }
        ((o00oo0) getActivity()).o00oOOo0(this, preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.o00oOOo0
    @o0OO00OO
    public <T extends Preference> T o00oOOoO(@oo0oO0 CharSequence charSequence) {
        o0O000O o0o000o = this.f3901o00oo0O;
        if (o0o000o == null) {
            return null;
        }
        return (T) o0o000o.o00oOOoO(charSequence);
    }

    @Override // androidx.preference.o0O000O.o00oOo00
    public boolean o00oOo0O(@oo0oO0 Preference preference) {
        if (preference.o00oo0O() != null) {
            boolean o00oOo002 = o00oOoO() instanceof o00oo00O ? ((o00oo00O) o00oOoO()).o00oOo00(this, preference) : false;
            for (Fragment fragment = this; !o00oOo002 && fragment != null; fragment = fragment.getParentFragment()) {
                if (fragment instanceof o00oo00O) {
                    o00oOo002 = ((o00oo00O) fragment).o00oOo00(this, preference);
                }
            }
            if (!o00oOo002 && (getContext() instanceof o00oo00O)) {
                o00oOo002 = ((o00oo00O) getContext()).o00oOo00(this, preference);
            }
            if (!o00oOo002 && (getActivity() instanceof o00oo00O)) {
                o00oOo002 = ((o00oo00O) getActivity()).o00oOo00(this, preference);
            }
            if (o00oOo002) {
                return true;
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Bundle o00oo0OO2 = preference.o00oo0OO();
            Fragment o00oOOo02 = parentFragmentManager.o0O0OO0().o00oOOo0(requireActivity().getClassLoader(), preference.o00oo0O());
            o00oOOo02.setArguments(o00oo0OO2);
            o00oOOo02.setTargetFragment(this, 0);
            parentFragmentManager.o00oo0oO().o00ooO0(((View) requireView().getParent()).getId(), o00oOOo02).o00oOoo0(null).o00oo00O();
            return true;
        }
        return false;
    }

    public void o00oOo0o(@o0oo0000 int i) {
        o00oo0o0();
        o00ooO0(this.f3901o00oo0O.o00oo0Oo(requireContext(), i, o00oOoo0()));
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public Fragment o00oOoO() {
        return null;
    }

    public void o00oOoO0() {
        PreferenceScreen o00oOoo02 = o00oOoo0();
        if (o00oOoo02 != null) {
            o00oOoOO().setAdapter(o00oo00O(o00oOoo02));
            o00oOoo02.o0OoOoOo();
        }
        o00oOooo();
    }

    public final RecyclerView o00oOoOO() {
        return this.f3903o00oo0Oo;
    }

    public o0O000O o00oOoOo() {
        return this.f3901o00oo0O;
    }

    public PreferenceScreen o00oOoo0() {
        return this.f3901o00oo0O.o00oo0();
    }

    @Override // androidx.preference.o0O000O.o00oOOo0
    public void o00oOooO(@oo0oO0 Preference preference) {
        androidx.fragment.app.o00oOo00 o00oo0OO2;
        boolean o00oOOo02 = o00oOoO() instanceof o00oOoO ? ((o00oOoO) o00oOoO()).o00oOOo0(this, preference) : false;
        for (Fragment fragment = this; !o00oOOo02 && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof o00oOoO) {
                o00oOOo02 = ((o00oOoO) fragment).o00oOOo0(this, preference);
            }
        }
        if (!o00oOOo02 && (getContext() instanceof o00oOoO)) {
            o00oOOo02 = ((o00oOoO) getContext()).o00oOOo0(this, preference);
        }
        if (!o00oOOo02 && (getActivity() instanceof o00oOoO)) {
            o00oOOo02 = ((o00oOoO) getActivity()).o00oOOo0(this, preference);
        }
        if (!o00oOOo02 && getParentFragmentManager().o0O00o00("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                o00oo0OO2 = androidx.preference.o00oOo00.o00oo0O0(preference.o00oo0oO());
            } else if (preference instanceof ListPreference) {
                o00oo0OO2 = androidx.preference.o00oo00O.o00oo0OO(preference.o00oo0oO());
            } else if (!(preference instanceof MultiSelectListPreference)) {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot display dialog for an unknown Preference type: ");
                o00oOOo03.append(preference.getClass().getSimpleName());
                o00oOOo03.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(o00oOOo03.toString());
            } else {
                o00oo0OO2 = androidx.preference.o00oo0OO.o00oo0OO(preference.o00oo0oO());
            }
            o00oo0OO2.setTargetFragment(this, 0);
            o00oo0OO2.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOooo() {
    }

    public void o00oo(@o0OO00OO Drawable drawable) {
        this.f3902o00oo0O0.o00oOoO0(drawable);
    }

    @oo0oO0
    public RecyclerView.o0O00000 o00oo0() {
        return new LinearLayoutManager(requireContext());
    }

    @oo0oO0
    public RecyclerView.o00oo0OO o00oo00O(@oo0oO0 PreferenceScreen preferenceScreen) {
        return new o00ooO(preferenceScreen);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0O() {
    }

    @oo0oO0
    public RecyclerView o00oo0O0(@oo0oO0 LayoutInflater layoutInflater, @oo0oO0 ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        RecyclerView recyclerView;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
            recyclerView2.setLayoutManager(o00oo0());
            recyclerView2.setAccessibilityDelegateCompat(new o0OoOoOo(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    public abstract void o00oo0OO(@o0OO00OO Bundle bundle, @o0OO00OO String str);

    public final void o00oo0Oo() {
        if (this.f3900o00oo.hasMessages(1)) {
            return;
        }
        this.f3900o00oo.obtainMessage(1).sendToTarget();
    }

    public void o00oo0o(@oo0oO0 Preference preference) {
        o0O0o(preference, null);
    }

    public final void o00oo0o0() {
        if (this.f3901o00oo0O == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void o00oo0oO(@oo0oO0 String str) {
        o0O0o(null, str);
    }

    public void o00ooO0(PreferenceScreen preferenceScreen) {
        if (!this.f3901o00oo0O.o00ooOO0(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        o00oo0O();
        this.f3905o00oo0o0 = true;
        if (this.f3904o00oo0o) {
            o00oo0Oo();
        }
    }

    public void o00ooO00(int i) {
        this.f3902o00oo0O0.o00oOoO(i);
    }

    public void o00ooO0O(@o0oo0000 int i, @o0OO00OO String str) {
        o00oo0o0();
        PreferenceScreen o00oo0Oo2 = this.f3901o00oo0O.o00oo0Oo(requireContext(), i, null);
        Object obj = o00oo0Oo2;
        if (str != null) {
            Object o0O0o0oo2 = o00oo0Oo2.o0O0o0oo(str);
            boolean z = o0O0o0oo2 instanceof PreferenceScreen;
            obj = o0O0o0oo2;
            if (!z) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        o00ooO0((PreferenceScreen) obj);
    }

    public final void o00ooO0o() {
        o00oOoOO().setAdapter(null);
        PreferenceScreen o00oOoo02 = o00oOoo0();
        if (o00oOoo02 != null) {
            o00oOoo02.o0O000oo();
        }
        o00oo0O();
    }

    public final void o0O0o(@o0OO00OO Preference preference, @o0OO00OO String str) {
        o00oOo00 o00ooo002 = new o00oOo00(preference, str);
        if (this.f3903o00oo0Oo == null) {
            this.f3908o0O0o = o00ooo002;
        } else {
            o00ooo002.run();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        o0O000O o0o000o = new o0O000O(requireContext());
        this.f3901o00oo0O = o0o000o;
        o0o000o.o00ooO0(this);
        o00oo0OO(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    @oo0oO0
    public View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, R.styleable.PreferenceFragmentCompat, R.attr.preferenceFragmentCompatStyle, 0);
        this.f3906o00oo0oO = obtainStyledAttributes.getResourceId(R.styleable.PreferenceFragmentCompat_android_layout, this.f3906o00oo0oO);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f3906o00oo0oO, viewGroup, false);
        View findViewById = inflate.findViewById(androidx.preference.o00oOOo0.f3791o00oOOoO);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView o00oo0O02 = o00oo0O0(cloneInContext, viewGroup2, bundle);
            if (o00oo0O02 != null) {
                this.f3903o00oo0Oo = o00oo0O02;
                o00oo0O02.addItemDecoration(this.f3902o00oo0O0);
                o00oo(drawable);
                if (dimensionPixelSize != -1) {
                    o00ooO00(dimensionPixelSize);
                }
                this.f3902o00oo0O0.o00oOo0o(z);
                if (this.f3903o00oo0Oo.getParent() == null) {
                    viewGroup2.addView(this.f3903o00oo0Oo);
                }
                this.f3900o00oo.post(this.f3907o00ooO00);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f3900o00oo.removeCallbacks(this.f3907o00ooO00);
        this.f3900o00oo.removeMessages(1);
        if (this.f3905o00oo0o0) {
            o00ooO0o();
        }
        this.f3903o00oo0Oo = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen o00oOoo02 = o00oOoo0();
        if (o00oOoo02 != null) {
            Bundle bundle2 = new Bundle();
            o00oOoo02.o00oOoOo(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3901o00oo0O.o00ooO0O(this);
        this.f3901o00oo0O.o00ooO00(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3901o00oo0O.o00ooO0O(null);
        this.f3901o00oo0O.o00ooO00(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@oo0oO0 View view, @o0OO00OO Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen o00oOoo02;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (o00oOoo02 = o00oOoo0()) != null) {
            o00oOoo02.o00oOoO(bundle2);
        }
        if (this.f3905o00oo0o0) {
            o00oOoO0();
            Runnable runnable = this.f3908o0O0o;
            if (runnable != null) {
                runnable.run();
                this.f3908o0O0o = null;
            }
        }
        this.f3904o00oo0o = true;
    }
}
