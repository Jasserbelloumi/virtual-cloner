package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.o00oo0OO;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0O0oo0o;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import o00oOoOo.o00oo;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.o00oo0OO<androidx.viewpager2.adapter.o00oOOo0> implements androidx.viewpager2.adapter.o00oOOoO {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f5337o00oOoOO = "f#";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f5338o00oOoOo = "s#";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final long f5339o00oOoo0 = 10000;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00 f5340o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final FragmentManager f5341o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo0OO<Fragment> f5342o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oo0OO<Integer> f5343o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public FragmentMaxLifecycleEnforcer f5344o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f5345o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f5346o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oo0OO<Fragment.SavedState> f5347o00oOooO;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ViewPager2.o00oo0O f5353o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public RecyclerView.o00oo0O f5354o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O00OOO f5355o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public long f5356o00oOo0O = -1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ViewPager2 f5358o00oOooO;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends ViewPager2.o00oo0O {
            public o00oOOo0() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.o00oOooO(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.o00oOooO(false);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO extends o00oOo0O {
            public o00oOOoO() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.o00oOo0O, androidx.recyclerview.widget.RecyclerView.o00oo0O
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.o00oOooO(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @oo0oO0
        public final ViewPager2 o00oOOo0(@oo0oO0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void o00oOOoO(@oo0oO0 RecyclerView recyclerView) {
            this.f5358o00oOooO = o00oOOo0(recyclerView);
            o00oOOo0 o00oooo02 = new o00oOOo0();
            this.f5353o00oOOo0 = o00oooo02;
            this.f5358o00oOooO.o00oo0(o00oooo02);
            o00oOOoO o00ooooo2 = new o00oOOoO();
            this.f5354o00oOOoO = o00ooooo2;
            FragmentStateAdapter.this.registerAdapterDataObserver(o00ooooo2);
            o0O00OOO o0o00ooo = new o0O00OOO() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.o0O00OOO
                public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo03) {
                    FragmentMaxLifecycleEnforcer.this.o00oOooO(false);
                }
            };
            this.f5355o00oOo00 = o0o00ooo;
            FragmentStateAdapter.this.f5340o00oOOo0.o00oOOo0(o0o00ooo);
        }

        public void o00oOo00(@oo0oO0 RecyclerView recyclerView) {
            o00oOOo0(recyclerView).o00ooO00(this.f5353o00oOOo0);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f5354o00oOOoO);
            FragmentStateAdapter.this.f5340o00oOOo0.o00oOooO(this.f5355o00oOo00);
            this.f5358o00oOooO = null;
        }

        public void o00oOooO(boolean z) {
            int currentItem;
            Fragment o00oOooo2;
            if (FragmentStateAdapter.this.o00oooOo() || this.f5358o00oOooO.getScrollState() != 0 || FragmentStateAdapter.this.f5342o00oOo00.o00oo0O0() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f5358o00oOooO.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f5356o00oOo0O || z) && (o00oOooo2 = FragmentStateAdapter.this.f5342o00oOo00.o00oOooo(itemId)) != null && o00oOooo2.isAdded()) {
                this.f5356o00oOo0O = itemId;
                o0O0oo0o o00oo0oO2 = FragmentStateAdapter.this.f5341o00oOOoO.o00oo0oO();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f5342o00oOo00.o00ooO0o(); i++) {
                    long o00oo0O2 = FragmentStateAdapter.this.f5342o00oOo00.o00oo0O(i);
                    Fragment o00ooO2 = FragmentStateAdapter.this.f5342o00oOo00.o00ooO(i);
                    if (o00ooO2.isAdded()) {
                        if (o00oo0O2 != this.f5356o00oOo0O) {
                            o00oo0oO2.o00ooo0(o00ooO2, o0O00.o00oOOoO.STARTED);
                        } else {
                            fragment = o00ooO2;
                        }
                        o00ooO2.setMenuVisibility(o00oo0O2 == this.f5356o00oOo0O);
                    }
                }
                if (fragment != null) {
                    o00oo0oO2.o00ooo0(fragment, o0O00.o00oOOoO.RESUMED);
                }
                if (o00oo0oO2.o00oo()) {
                    return;
                }
                o00oo0oO2.o00oo0OO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnLayoutChangeListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ androidx.viewpager2.adapter.o00oOOo0 f5362o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f5363o00oo0O0;

        public o00oOOo0(FrameLayout frameLayout, androidx.viewpager2.adapter.o00oOOo0 o00oooo02) {
            this.f5363o00oo0O0 = frameLayout;
            this.f5362o00oo0O = o00oooo02;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5363o00oo0O0.getParent() != null) {
                this.f5363o00oo0O0.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.o00ooo0O(this.f5362o00oo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends FragmentManager.o00ooO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Fragment f5365o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f5366o00oOOoO;

        public o00oOOoO(Fragment fragment, FrameLayout frameLayout) {
            this.f5365o00oOOo0 = fragment;
            this.f5366o00oOOoO = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.o00ooO0
        public void o00oo00O(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @oo0oO0 View view, @o0OO00OO Bundle bundle) {
            if (fragment == this.f5365o00oOOo0) {
                fragmentManager.o0OO0o0O(this);
                FragmentStateAdapter.this.o00oo(view, this.f5366o00oOOoO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f5346o00oOoO0 = false;
            fragmentStateAdapter.o00ooO();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O extends RecyclerView.o00oo0O {
        public o00oOo0O() {
        }

        public o00oOo0O(o00oOOo0 o00oooo02) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeChanged(int i, int i2, @o0OO00OO Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }
    }

    public FragmentStateAdapter(@oo0oO0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@oo0oO0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.o00ooo0(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 o0O00 o0o00) {
        this.f5342o00oOo00 = new o00oo0OO<>();
        this.f5347o00oOooO = new o00oo0OO<>();
        this.f5343o00oOo0O = new o00oo0OO<>();
        this.f5346o00oOoO0 = false;
        this.f5345o00oOoO = false;
        this.f5341o00oOOoO = fragmentManager;
        this.f5340o00oOOo0 = o0o00;
        super.setHasStableIds(true);
    }

    @oo0oO0
    public static String o00ooO0O(@oo0oO0 String str, long j) {
        return o0O0OO0.o00oOo0O.o00oOOo0(str, j);
    }

    public static boolean o00ooOO(@oo0oO0 String str, @oo0oO0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public static long o00ooo0(@oo0oO0 String str, @oo0oO0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager2.adapter.o00oOOoO
    @oo0oO0
    public final Parcelable o00oOOo0() {
        Bundle bundle = new Bundle(this.f5347o00oOooO.o00ooO0o() + this.f5342o00oOo00.o00ooO0o());
        for (int i = 0; i < this.f5342o00oOo00.o00ooO0o(); i++) {
            long o00oo0O2 = this.f5342o00oOo00.o00oo0O(i);
            Fragment o00oOooo2 = this.f5342o00oOo00.o00oOooo(o00oo0O2);
            if (o00oOooo2 != null && o00oOooo2.isAdded()) {
                this.f5341o00oOOoO.oo0oOOo(bundle, o00ooO0O(f5337o00oOoOO, o00oo0O2), o00oOooo2);
            }
        }
        for (int i2 = 0; i2 < this.f5347o00oOooO.o00ooO0o(); i2++) {
            long o00oo0O3 = this.f5347o00oOooO.o00oo0O(i2);
            if (o00ooO00(o00oo0O3)) {
                bundle.putParcelable(o00ooO0O(f5338o00oOoOo, o00oo0O3), this.f5347o00oOooO.o00oOooo(o00oo0O3));
            }
        }
        return bundle;
    }

    public void o00oo(@oo0oO0 View view, @oo0oO0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.viewpager2.adapter.o00oOOoO
    public final void o00oo00O(@oo0oO0 Parcelable parcelable) {
        long o00ooo02;
        Object o0O0O0oo2;
        o00oo0OO o00oo0oo;
        if (!this.f5347o00oOooO.o00oo0O0() || !this.f5342o00oOo00.o00oo0O0()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (o00ooOO(str, f5337o00oOoOO)) {
                o00ooo02 = o00ooo0(str, f5337o00oOoOO);
                o0O0O0oo2 = this.f5341o00oOOoO.o0O0O0oo(bundle, str);
                o00oo0oo = this.f5342o00oOo00;
            } else if (!o00ooOO(str, f5338o00oOoOo)) {
                throw new IllegalArgumentException(o00oo.o00oOOo0("Unexpected key in savedState: ", str));
            } else {
                o00ooo02 = o00ooo0(str, f5338o00oOoOo);
                o0O0O0oo2 = (Fragment.SavedState) bundle.getParcelable(str);
                if (o00ooO00(o00ooo02)) {
                    o00oo0oo = this.f5347o00oOooO;
                }
            }
            o00oo0oo.o00oo0Oo(o00ooo02, o0O0O0oo2);
        }
        if (this.f5342o00oOo00.o00oo0O0()) {
            return;
        }
        this.f5345o00oOoO = true;
        this.f5346o00oOoO0 = true;
        o00ooO();
        o00oooO();
    }

    public void o00ooO() {
        if (!this.f5345o00oOoO || o00oooOo()) {
            return;
        }
        androidx.collection.o00oOo00 o00ooo002 = new androidx.collection.o00oOo00();
        for (int i = 0; i < this.f5342o00oOo00.o00ooO0o(); i++) {
            long o00oo0O2 = this.f5342o00oOo00.o00oo0O(i);
            if (!o00ooO00(o00oo0O2)) {
                o00ooo002.add(Long.valueOf(o00oo0O2));
                this.f5343o00oOo0O.o00oo0oO(o00oo0O2);
            }
        }
        if (!this.f5346o00oOoO0) {
            this.f5345o00oOoO = false;
            for (int i2 = 0; i2 < this.f5342o00oOo00.o00ooO0o(); i2++) {
                long o00oo0O3 = this.f5342o00oOo00.o00oo0O(i2);
                if (!o00ooOO0(o00oo0O3)) {
                    o00ooo002.add(Long.valueOf(o00oo0O3));
                }
            }
        }
        Iterator it = o00ooo002.iterator();
        while (it.hasNext()) {
            o00ooo0o(((Long) it.next()).longValue());
        }
    }

    @oo0oO0
    public abstract Fragment o00ooO0(int i);

    public boolean o00ooO00(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public final void o00ooO0o(int i) {
        long itemId = getItemId(i);
        if (this.f5342o00oOo00.o00oOo0o(itemId)) {
            return;
        }
        Fragment o00ooO02 = o00ooO0(i);
        o00ooO02.setInitialSavedState(this.f5347o00oOooO.o00oOooo(itemId));
        this.f5342o00oOo00.o00oo0Oo(itemId, o00ooO02);
    }

    public final boolean o00ooOO0(long j) {
        View view;
        if (this.f5343o00oOo0O.o00oOo0o(j)) {
            return true;
        }
        Fragment o00oOooo2 = this.f5342o00oOo00.o00oOooo(j);
        return (o00oOooo2 == null || (view = o00oOooo2.getView()) == null || view.getParent() == null) ? false : true;
    }

    public final Long o00ooOOo(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5343o00oOo0O.o00ooO0o(); i2++) {
            if (this.f5343o00oOo0O.o00ooO(i2).intValue() == i) {
                if (l != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = Long.valueOf(this.f5343o00oOo0O.o00oo0O(i2));
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @oo0oO0
    /* renamed from: o00ooOo */
    public final androidx.viewpager2.adapter.o00oOOo0 onCreateViewHolder(@oo0oO0 ViewGroup viewGroup, int i) {
        return androidx.viewpager2.adapter.o00oOOo0.o00oOOo0(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooOo0 */
    public final void onBindViewHolder(@oo0oO0 androidx.viewpager2.adapter.o00oOOo0 o00oooo02, int i) {
        long itemId = o00oooo02.getItemId();
        int id = ((FrameLayout) o00oooo02.itemView).getId();
        Long o00ooOOo2 = o00ooOOo(id);
        if (o00ooOOo2 != null && o00ooOOo2.longValue() != itemId) {
            o00ooo0o(o00ooOOo2.longValue());
            this.f5343o00oOo0O.o00oo0oO(o00ooOOo2.longValue());
        }
        this.f5343o00oOo0O.o00oo0Oo(itemId, Integer.valueOf(id));
        o00ooO0o(i);
        FrameLayout frameLayout = (FrameLayout) o00oooo02.itemView;
        if (o0O0o00O.o0O0OOoo(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new o00oOOo0(frameLayout, o00oooo02));
        }
        o00ooO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooOoO */
    public final boolean onFailedToRecycleView(@oo0oO0 androidx.viewpager2.adapter.o00oOOo0 o00oooo02) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooOoo */
    public final void onViewAttachedToWindow(@oo0oO0 androidx.viewpager2.adapter.o00oOOo0 o00oooo02) {
        o00ooo0O(o00oooo02);
        o00ooO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooo00 */
    public final void onViewRecycled(@oo0oO0 androidx.viewpager2.adapter.o00oOOo0 o00oooo02) {
        Long o00ooOOo2 = o00ooOOo(((FrameLayout) o00oooo02.itemView).getId());
        if (o00ooOOo2 != null) {
            o00ooo0o(o00ooOOo2.longValue());
            this.f5343o00oOo0O.o00oo0oO(o00ooOOo2.longValue());
        }
    }

    public void o00ooo0O(@oo0oO0 final androidx.viewpager2.adapter.o00oOOo0 o00oooo02) {
        Fragment o00oOooo2 = this.f5342o00oOo00.o00oOooo(o00oooo02.getItemId());
        if (o00oOooo2 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) o00oooo02.itemView;
        View view = o00oOooo2.getView();
        if (!o00oOooo2.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (o00oOooo2.isAdded() && view == null) {
            o00oooOO(o00oOooo2, frameLayout);
        } else if (o00oOooo2.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                o00oo(view, frameLayout);
            }
        } else if (o00oOooo2.isAdded()) {
            o00oo(view, frameLayout);
        } else if (o00oooOo()) {
            if (this.f5341o00oOOoO.o0O0OoO0()) {
                return;
            }
            this.f5340o00oOOo0.o00oOOo0(new o0O00OOO() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.o0O00OOO
                public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo03) {
                    if (FragmentStateAdapter.this.o00oooOo()) {
                        return;
                    }
                    o0o0o0o.getLifecycle().o00oOooO(this);
                    if (o0O0o00O.o0O0OOoo((FrameLayout) o00oooo02.itemView)) {
                        FragmentStateAdapter.this.o00ooo0O(o00oooo02);
                    }
                }
            });
        } else {
            o00oooOO(o00oOooo2, frameLayout);
            o0O0oo0o o00oo0oO2 = this.f5341o00oOOoO.o00oo0oO();
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("f");
            o00oOOo02.append(o00oooo02.getItemId());
            o00oo0oO2.o00oOoO0(o00oOooo2, o00oOOo02.toString()).o00ooo0(o00oOooo2, o0O00.o00oOOoO.STARTED).o00oo0OO();
            this.f5344o00oOo0o.o00oOooO(false);
        }
    }

    public final void o00ooo0o(long j) {
        ViewParent parent;
        Fragment o00oOooo2 = this.f5342o00oOo00.o00oOooo(j);
        if (o00oOooo2 == null) {
            return;
        }
        if (o00oOooo2.getView() != null && (parent = o00oOooo2.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!o00ooO00(j)) {
            this.f5347o00oOooO.o00oo0oO(j);
        }
        if (!o00oOooo2.isAdded()) {
            this.f5342o00oOo00.o00oo0oO(j);
        } else if (o00oooOo()) {
            this.f5345o00oOoO = true;
        } else {
            if (o00oOooo2.isAdded() && o00ooO00(j)) {
                this.f5347o00oOooO.o00oo0Oo(j, this.f5341o00oOOoO.o0OO00Oo(o00oOooo2));
            }
            this.f5341o00oOOoO.o00oo0oO().o00ooO00(o00oOooo2).o00oo0OO();
            this.f5342o00oOo00.o00oo0oO(j);
        }
    }

    public final void o00oooO() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final o00oOo00 o00ooo002 = new o00oOo00();
        this.f5340o00oOOo0.o00oOOo0(new o0O00OOO() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
                    handler.removeCallbacks(o00ooo002);
                    o0o0o0o.getLifecycle().o00oOooO(this);
                }
            }
        });
        handler.postDelayed(o00ooo002, 10000L);
    }

    public final void o00oooOO(Fragment fragment, @oo0oO0 FrameLayout frameLayout) {
        this.f5341o00oOOoO.o0O0oOo(new o00oOOoO(fragment, frameLayout), false);
    }

    public boolean o00oooOo() {
        return this.f5341o00oOOoO.o0O0o00();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @o0O00O0
    public void onAttachedToRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        ooOOOOoo.o00oOOo0(this.f5344o00oOo0o == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f5344o00oOo0o = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.o00oOOoO(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @o0O00O0
    public void onDetachedFromRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        this.f5344o00oOo0o.o00oOo00(recyclerView);
        this.f5344o00oOo0o = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
