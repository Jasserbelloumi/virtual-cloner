package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O0OOO extends Fragment {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f3110o00ooO = 16711682;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f3111o00ooO0o = 16711681;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f3112o00ooOO0 = 16711683;

    /* renamed from: o00oo  reason: collision with root package name */
    public View f3113o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public ListView f3117o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ListAdapter f3118o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public View f3119o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public CharSequence f3120o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public View f3121o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f3122o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public TextView f3123o0O0o;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Handler f3115o00oo0O0 = new Handler();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Runnable f3114o00oo0O = new o00oOOo0();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f3116o00oo0Oo = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = o0O0OOO.this.f3117o00oo0o;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements AdapterView.OnItemClickListener {
        public o00oOOoO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            o0O0OOO.this.o00oOoo0((ListView) adapterView, view, i, j);
        }
    }

    public final void o00oOo0o() {
        if (this.f3117o00oo0o != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f3117o00oo0o = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f3111o00ooO0o);
            this.f3123o0O0o = textView;
            if (textView == null) {
                this.f3119o00oo0oO = view.findViewById(16908292);
            } else {
                textView.setVisibility(8);
            }
            this.f3113o00oo = view.findViewById(f3110o00ooO);
            this.f3121o00ooO00 = view.findViewById(f3112o00ooOO0);
            View findViewById = view.findViewById(16908298);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f3117o00oo0o = listView;
            View view2 = this.f3119o00oo0oO;
            if (view2 == null) {
                CharSequence charSequence = this.f3120o00ooO0;
                if (charSequence != null) {
                    this.f3123o0O0o.setText(charSequence);
                    listView = this.f3117o00oo0o;
                    view2 = this.f3123o0O0o;
                }
            }
            listView.setEmptyView(view2);
        }
        this.f3122o00ooO0O = true;
        this.f3117o00oo0o.setOnItemClickListener(this.f3116o00oo0Oo);
        ListAdapter listAdapter = this.f3118o00oo0o0;
        if (listAdapter != null) {
            this.f3118o00oo0o0 = null;
            o00oo0(listAdapter);
        } else if (this.f3113o00oo != null) {
            o00oo0O0(false, false);
        }
        this.f3115o00oo0O0.post(this.f3114o00oo0O);
    }

    @oo0oO0
    public ListView o00oOoO() {
        o00oOo0o();
        return this.f3117o00oo0o;
    }

    @o0OO00OO
    public ListAdapter o00oOoO0() {
        return this.f3118o00oo0o0;
    }

    public long o00oOoOO() {
        o00oOo0o();
        return this.f3117o00oo0o.getSelectedItemId();
    }

    public int o00oOoOo() {
        o00oOo0o();
        return this.f3117o00oo0o.getSelectedItemPosition();
    }

    public void o00oOoo0(@oo0oO0 ListView listView, @oo0oO0 View view, int i, long j) {
    }

    @oo0oO0
    public final ListAdapter o00oOooo() {
        ListAdapter o00oOoO02 = o00oOoO0();
        if (o00oOoO02 != null) {
            return o00oOoO02;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void o00oo0(@o0OO00OO ListAdapter listAdapter) {
        boolean z = this.f3118o00oo0o0 != null;
        this.f3118o00oo0o0 = listAdapter;
        ListView listView = this.f3117o00oo0o;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f3122o00ooO0O || z) {
                return;
            }
            o00oo0O0(true, requireView().getWindowToken() != null);
        }
    }

    public void o00oo00O(@o0OO00OO CharSequence charSequence) {
        o00oOo0o();
        TextView textView = this.f3123o0O0o;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f3120o00ooO0 == null) {
            this.f3117o00oo0o.setEmptyView(this.f3123o0O0o);
        }
        this.f3120o00ooO0 = charSequence;
    }

    public void o00oo0O(boolean z) {
        o00oo0O0(z, false);
    }

    public final void o00oo0O0(boolean z, boolean z2) {
        o00oOo0o();
        View view = this.f3113o00oo;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f3122o00ooO0O == z) {
            return;
        }
        this.f3122o00ooO0O = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                this.f3121o00ooO00.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f3121o00ooO00.clearAnimation();
            }
            this.f3113o00oo.setVisibility(8);
            this.f3121o00ooO00.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.f3121o00ooO00.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
        } else {
            view.clearAnimation();
            this.f3121o00ooO00.clearAnimation();
        }
        this.f3113o00oo.setVisibility(0);
        this.f3121o00ooO00.setVisibility(8);
    }

    public void o00oo0OO(boolean z) {
        o00oo0O0(z, true);
    }

    public void o00oo0Oo(int i) {
        o00oOo0o();
        this.f3117o00oo0o.setSelection(i);
    }

    @Override // androidx.fragment.app.Fragment
    @o0OO00OO
    public View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f3110o00ooO);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f3112o00ooOO0);
        TextView textView = new TextView(requireContext);
        textView.setId(f3111o00ooO0o);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f3115o00oo0O0.removeCallbacks(this.f3114o00oo0O);
        this.f3117o00oo0o = null;
        this.f3122o00ooO0O = false;
        this.f3121o00ooO00 = null;
        this.f3113o00oo = null;
        this.f3119o00oo0oO = null;
        this.f3123o0O0o = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@oo0oO0 View view, @o0OO00OO Bundle bundle) {
        super.onViewCreated(view, bundle);
        o00oOo0o();
    }
}
