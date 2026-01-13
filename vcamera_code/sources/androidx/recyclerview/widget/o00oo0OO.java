package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0OO extends RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f4417o00oOOoO = "ConcatAdapter";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0O f4418o00oOOo0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oOOo0 f4419o00oOo00 = new o00oOOo0(true, o00oOOoO.NO_STABLE_IDS);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f4420o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOoO f4421o00oOOoO;

        /* renamed from: androidx.recyclerview.widget.o00oo0OO$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0039o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public boolean f4422o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public o00oOOoO f4423o00oOOoO;

            public C0039o00oOOo0() {
                o00oOOo0 o00oooo02 = o00oOOo0.f4419o00oOo00;
                this.f4422o00oOOo0 = o00oooo02.f4420o00oOOo0;
                this.f4423o00oOOoO = o00oooo02.f4421o00oOOoO;
            }

            @oo0oO0
            public o00oOOo0 o00oOOo0() {
                return new o00oOOo0(this.f4422o00oOOo0, this.f4423o00oOOoO);
            }

            @oo0oO0
            public C0039o00oOOo0 o00oOOoO(boolean z) {
                this.f4422o00oOOo0 = z;
                return this;
            }

            @oo0oO0
            public C0039o00oOOo0 o00oOo00(@oo0oO0 o00oOOoO o00ooooo2) {
                this.f4423o00oOOoO = o00ooooo2;
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum o00oOOoO {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public o00oOOo0(boolean z, @oo0oO0 o00oOOoO o00ooooo2) {
            this.f4420o00oOOo0 = z;
            this.f4421o00oOOoO = o00ooooo2;
        }
    }

    public o00oo0OO(@oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 List<? extends RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>> list) {
        this.f4418o00oOOo0 = new o00oo0O(this, o00oooo02);
        for (RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo : list) {
            o00ooO00(o00oo0oo);
        }
        super.setHasStableIds(this.f4418o00oOOo0.o00oo());
    }

    @SafeVarargs
    public o00oo0OO(@oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>... o00oo0ooArr) {
        this(o00oooo02, Arrays.asList(o00oo0ooArr));
    }

    public o00oo0OO(@oo0oO0 List<? extends RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>> list) {
        this(o00oOOo0.f4419o00oOo00, list);
    }

    @SafeVarargs
    public o00oo0OO(@oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>... o00oo0ooArr) {
        this(o00oOOo0.f4419o00oOo00, o00oo0ooArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int findRelativeAdapterPositionIn(@oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, int i) {
        return this.f4418o00oOOo0.o00oo0o(o00oo0oo, o0o00oo0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f4418o00oOOo0.o00oo0oO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public long getItemId(int i) {
        return this.f4418o00oOOo0.o00oo0Oo(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemViewType(int i) {
        return this.f4418o00oOOo0.o00oo0o0(i);
    }

    public boolean o00oo(int i, @oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo) {
        return this.f4418o00oOOo0.o00oOoO(i, o00oo0oo);
    }

    @oo0oO0
    public List<? extends RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>> o00ooO0() {
        return Collections.unmodifiableList(this.f4418o00oOOo0.o00oo0O());
    }

    public boolean o00ooO00(@oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo) {
        return this.f4418o00oOOo0.o00oOoOO(o00oo0oo);
    }

    public void o00ooO0O(@oo0oO0 RecyclerView.o00oo0OO.o00oOOo0 o00oooo02) {
        super.setStateRestorationPolicy(o00oooo02);
    }

    public boolean o00ooO0o(@oo0oO0 RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo) {
        return this.f4418o00oOOo0.o00ooOoo(o00oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onAttachedToRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        this.f4418o00oOOo0.o00ooO0O(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onBindViewHolder(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, int i) {
        this.f4418o00oOOo0.o00ooO0o(o0o00oo0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @oo0oO0
    public RecyclerView.o0O00oO0 onCreateViewHolder(@oo0oO0 ViewGroup viewGroup, int i) {
        return this.f4418o00oOOo0.o00ooO(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onDetachedFromRecyclerView(@oo0oO0 RecyclerView recyclerView) {
        this.f4418o00oOOo0.o00ooOO0(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public boolean onFailedToRecycleView(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        return this.f4418o00oOOo0.o00ooOO(o0o00oo0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onViewAttachedToWindow(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        this.f4418o00oOOo0.o00ooOOo(o0o00oo0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onViewDetachedFromWindow(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        this.f4418o00oOOo0.o00ooOo0(o0o00oo0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void onViewRecycled(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        this.f4418o00oOOo0.o00ooOo(o0o00oo0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public void setStateRestorationPolicy(@oo0oO0 RecyclerView.o00oo0OO.o00oOOo0 o00oooo02) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
