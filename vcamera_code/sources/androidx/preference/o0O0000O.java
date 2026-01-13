package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0O0oo0o;
import androidx.lifecycle.o0O0O0O;
import androidx.preference.o00ooO0;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0O00O0;
import o0O000oo.o0O0o00O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0015\u001a\u00020\u0003H&J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0012\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/preference/o0O0000O;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/o00ooO0$o00oo00O;", "Landroidx/preference/o00ooO0;", "caller", "Landroidx/preference/Preference;", "pref", "", "o00oOo00", "Landroid/content/Context;", "context", "Lo0OO0o/oO0Ooooo;", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "o00oOoo0", "view", "onViewCreated", "onViewStateRestored", "o00oOoOo", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "o00oOoO", "header", "o00oo0", "Landroid/content/Intent;", "intent", "o00oo00O", "Landroidx/activity/o00oo0O;", "o00oo0O0", "Landroidx/activity/o00oo0O;", "onBackPressedCallback", "o00oOoOO", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "<init>", "()V", "o00oOOo0", "preference_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class o0O0000O extends Fragment implements o00ooO0.o00oo00O {
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public androidx.activity.o00oo0O f3931o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/preference/o0O0000O$o00oOOo0;", "Landroidx/activity/o00oo0O;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$o00oo00O;", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "Landroid/view/View;", "panel", "", "slideOffset", "o00oOo00", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroidx/preference/o0O0000O;", "o00oOooO", "Landroidx/preference/o0O0000O;", "caller", "<init>", "(Landroidx/preference/o0O0000O;)V", "preference_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends androidx.activity.o00oo0O implements SlidingPaneLayout.o00oo00O {
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o0O0000O f3932o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(@NotNull o0O0000O o0o0000o) {
            super(true);
            o0ooO.o00oo0O0(o0o0000o, "caller");
            this.f3932o00oOooO = o0o0000o;
            o0o0000o.o00oOoOO().o00oOOo0(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOOo0(@NotNull View view) {
            o0ooO.o00oo0O0(view, "panel");
            o00oOoOO(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "panel");
            o00oOoOO(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.o00oo00O
        public void o00oOo00(@NotNull View view, float f) {
            o0ooO.o00oo0O0(view, "panel");
        }

        @Override // androidx.activity.o00oo0O
        public void o00oOo0O() {
            this.f3932o00oOooO.o00oOoOO().o00oOooO();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lo0OO0o/oO0Ooooo;", "onLayoutChange", "core-ktx_release", "o0O000oo/o0OOooO0$o00oOoO"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements View.OnLayoutChangeListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o0ooO.o00oo0O(view, "view");
            view.removeOnLayoutChangeListener(this);
            androidx.activity.o00oo0O o00oo0o2 = o0O0000O.this.f3931o00oo0O0;
            o0ooO.o00oo00O(o00oo0o2);
            o00oo0o2.o00oOoOO(o0O0000O.this.o00oOoOO().o00oo0OO() && o0O0000O.this.o00oOoOO().isOpen());
        }
    }

    public static final void o00oOooo(o0O0000O o0o0000o) {
        o0ooO.o00oo0O0(o0o0000o, "this$0");
        androidx.activity.o00oo0O o00oo0o2 = o0o0000o.f3931o00oo0O0;
        o0ooO.o00oo00O(o00oo0o2);
        o00oo0o2.o00oOoOO(o0o0000o.getChildFragmentManager().o0O0O0o0() == 0);
    }

    @Override // androidx.preference.o00ooO0.o00oo00O
    @o0O00O0
    public boolean o00oOo00(@NotNull o00ooO0 o00ooo02, @NotNull Preference preference) {
        o0ooO.o00oo0O0(o00ooo02, "caller");
        o0ooO.o00oo0O0(preference, "pref");
        if (o00ooo02.getId() == R.id.preferences_header) {
            o00oo0(preference);
            return true;
        }
        int id = o00ooo02.getId();
        int i = R.id.preferences_detail;
        if (id == i) {
            androidx.fragment.app.o00oo o0O0OO02 = getChildFragmentManager().o0O0OO0();
            ClassLoader classLoader = requireContext().getClassLoader();
            String o00oo0O2 = preference.o00oo0O();
            o0ooO.o00oo00O(o00oo0O2);
            Fragment o00oOOo02 = o0O0OO02.o00oOOo0(classLoader, o00oo0O2);
            o0ooO.o00oo0OO(o00oOOo02, "childFragmentManager.fra….fragment!!\n            )");
            o00oOOo02.setArguments(preference.o00oo0OO());
            FragmentManager childFragmentManager = getChildFragmentManager();
            o0ooO.o00oo0OO(childFragmentManager, "childFragmentManager");
            o0O0oo0o o00oo0oO2 = childFragmentManager.o00oo0oO();
            o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
            o00oo0oO2.o00ooo0o(true);
            o00oo0oO2.o00ooO0(i, o00oOOo02);
            o00oo0oO2.o00oooO(4099);
            o00oo0oO2.o00oOoo0(null);
            o00oo0oO2.o00oo00O();
            return true;
        }
        return false;
    }

    public final SlidingPaneLayout o00oOoO(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(R.id.preferences_header);
        SlidingPaneLayout.o00oOoO o00oooo2 = new SlidingPaneLayout.o00oOoO(getResources().getDimensionPixelSize(R.dimen.preferences_header_width), -1);
        o00oooo2.f4924o00oOOo0 = getResources().getInteger(R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, o00oooo2);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(R.id.preferences_detail);
        SlidingPaneLayout.o00oOoO o00oooo3 = new SlidingPaneLayout.o00oOoO(getResources().getDimensionPixelSize(R.dimen.preferences_detail_width), -1);
        o00oooo3.f4924o00oOOo0 = getResources().getInteger(R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, o00oooo3);
        return slidingPaneLayout;
    }

    @NotNull
    public final SlidingPaneLayout o00oOoOO() {
        return (SlidingPaneLayout) requireView();
    }

    @Nullable
    public Fragment o00oOoOo() {
        Fragment o0O00Ooo2 = getChildFragmentManager().o0O00Ooo(R.id.preferences_header);
        if (o0O00Ooo2 != null) {
            o00ooO0 o00ooo02 = (o00ooO0) o0O00Ooo2;
            if (o00ooo02.o00oOoo0().o0O0oO0O() <= 0) {
                return null;
            }
            int i = 0;
            int o0O0oO0O2 = o00ooo02.o00oOoo0().o0O0oO0O();
            while (i < o0O0oO0O2) {
                int i2 = i + 1;
                Preference o0O0oO02 = o00ooo02.o00oOoo0().o0O0oO0(i);
                o0ooO.o00oo0OO(o0O0oO02, "headerFragment.preferenc…reen.getPreference(index)");
                if (o0O0oO02.o00oo0O() != null) {
                    String o00oo0O2 = o0O0oO02.o00oo0O();
                    if (o00oo0O2 == null) {
                        return null;
                    }
                    return getChildFragmentManager().o0O0OO0().o00oOOo0(requireContext().getClassLoader(), o00oo0O2);
                }
                i = i2;
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
    }

    @NotNull
    public abstract o00ooO0 o00oOoo0();

    public final void o00oo0(Preference preference) {
        if (preference.o00oo0O() == null) {
            o00oo00O(preference.o00oo0o());
            return;
        }
        String o00oo0O2 = preference.o00oo0O();
        Fragment o00oOOo02 = o00oo0O2 == null ? null : getChildFragmentManager().o0O0OO0().o00oOOo0(requireContext().getClassLoader(), o00oo0O2);
        if (o00oOOo02 != null) {
            o00oOOo02.setArguments(preference.o00oo0OO());
        }
        if (getChildFragmentManager().o0O0O0o0() > 0) {
            FragmentManager.o00oo0O o0O0O0Oo2 = getChildFragmentManager().o0O0O0Oo(0);
            o0ooO.o00oo0OO(o0O0O0Oo2, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().o0O0oO0O(o0O0O0Oo2.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o0ooO.o00oo0OO(childFragmentManager, "childFragmentManager");
        o0O0oo0o o00oo0oO2 = childFragmentManager.o00oo0oO();
        o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00oo0oO2.o00ooo0o(true);
        int i = R.id.preferences_detail;
        o0ooO.o00oo00O(o00oOOo02);
        o00oo0oO2.o00ooO0(i, o00oOOo02);
        if (o00oOoOO().isOpen()) {
            o00oo0oO2.o00oooO(4099);
        }
        o00oOoOO().o00oo0Oo();
        o00oo0oO2.o00oo00O();
    }

    public final void o00oo00O(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    @o0O00O0
    public void onAttach(@NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        o0ooO.o00oo0OO(parentFragmentManager, "parentFragmentManager");
        o0O0oo0o o00oo0oO2 = parentFragmentManager.o00oo0oO();
        o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00oo0oO2.o00ooo0O(this);
        o00oo0oO2.o00oo00O();
    }

    @Override // androidx.fragment.app.Fragment
    @o0O00O0
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        o0ooO.o00oo0O0(layoutInflater, "inflater");
        SlidingPaneLayout o00oOoO2 = o00oOoO(layoutInflater);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i = R.id.preferences_header;
        if (childFragmentManager.o0O00Ooo(i) == null) {
            o00ooO0 o00oOoo02 = o00oOoo0();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            o0ooO.o00oo0OO(childFragmentManager2, "childFragmentManager");
            o0O0oo0o o00oo0oO2 = childFragmentManager2.o00oo0oO();
            o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
            o00oo0oO2.o00ooo0o(true);
            o00oo0oO2.o00oOOoO(i, o00oOoo02);
            o00oo0oO2.o00oo00O();
        }
        o00oOoO2.setLockMode(3);
        return o00oOoO2;
    }

    @Override // androidx.fragment.app.Fragment
    @o0O00O0
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        o0ooO.o00oo0O0(view, "view");
        super.onViewCreated(view, bundle);
        this.f3931o00oo0O0 = new o00oOOo0(this);
        SlidingPaneLayout o00oOoOO2 = o00oOoOO();
        if (!o0O0o00O.o0O0Oooo(o00oOoOO2) || o00oOoOO2.isLayoutRequested()) {
            o00oOoOO2.addOnLayoutChangeListener(new o00oOOoO());
        } else {
            androidx.activity.o00oo0O o00oo0o2 = this.f3931o00oo0O0;
            o0ooO.o00oo00O(o00oo0o2);
            o00oo0o2.o00oOoOO(o00oOoOO().o00oo0OO() && o00oOoOO().isOpen());
        }
        getChildFragmentManager().o00oo0O0(new FragmentManager.o0() { // from class: androidx.preference.o0O00000
            @Override // androidx.fragment.app.FragmentManager.o0
            public final void onBackStackChanged() {
                o0O0000O.o00oOooo(o0O0000O.this);
            }
        });
        Context requireContext = requireContext();
        androidx.activity.o0 o0Var = requireContext instanceof androidx.activity.o0 ? (androidx.activity.o0) requireContext : null;
        if (o0Var == null) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = o0Var.getOnBackPressedDispatcher();
        o0O0O0O viewLifecycleOwner = getViewLifecycleOwner();
        androidx.activity.o00oo0O o00oo0o3 = this.f3931o00oo0O0;
        o0ooO.o00oo00O(o00oo0o3);
        onBackPressedDispatcher.o00oOo00(viewLifecycleOwner, o00oo0o3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Fragment o00oOoOo2;
        super.onViewStateRestored(bundle);
        if (bundle != null || (o00oOoOo2 = o00oOoOo()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o0ooO.o00oo0OO(childFragmentManager, "childFragmentManager");
        o0O0oo0o o00oo0oO2 = childFragmentManager.o00oo0oO();
        o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00oo0oO2.o00ooo0o(true);
        o00oo0oO2.o00ooO0(R.id.preferences_detail, o00oOoOo2);
        o00oo0oO2.o00oo00O();
    }
}
