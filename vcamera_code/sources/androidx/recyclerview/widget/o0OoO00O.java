package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O0O0Oo;
import androidx.recyclerview.widget.o0O0OOO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class o0OoO00O {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OOO0.o00oOo00 f4751o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0O0Oo.o00oOo0O f4752o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> f4753o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f4754o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public RecyclerView.o00oo0O f4755o00oOo0o = new o00oOOo0();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oOOoO f4756o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends RecyclerView.o00oo0O {
        public o00oOOo0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onChanged() {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4754o00oOo0O = o0ooo00o.f4753o00oOo00.getItemCount();
            o0OoO00O o0ooo00o2 = o0OoO00O.this;
            o0ooo00o2.f4756o00oOooO.o00oOo0o(o0ooo00o2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeChanged(int i, int i2) {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4756o00oOooO.o00oOOo0(o0ooo00o, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeChanged(int i, int i2, @o0OO00OO Object obj) {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4756o00oOooO.o00oOOo0(o0ooo00o, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeInserted(int i, int i2) {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4754o00oOo0O += i2;
            o0ooo00o.f4756o00oOooO.o00oOOoO(o0ooo00o, i, i2);
            o0OoO00O o0ooo00o2 = o0OoO00O.this;
            if (o0ooo00o2.f4754o00oOo0O <= 0 || o0ooo00o2.f4753o00oOo00.getStateRestorationPolicy() != RecyclerView.o00oo0OO.o00oOOo0.PREVENT_WHEN_EMPTY) {
                return;
            }
            o0OoO00O o0ooo00o3 = o0OoO00O.this;
            o0ooo00o3.f4756o00oOooO.o00oOooO(o0ooo00o3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeMoved(int i, int i2, int i3) {
            ooOOOOoo.o00oOOoO(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4756o00oOooO.o00oOo00(o0ooo00o, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onItemRangeRemoved(int i, int i2) {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4754o00oOo0O -= i2;
            o0ooo00o.f4756o00oOooO.o00oOoO0(o0ooo00o, i, i2);
            o0OoO00O o0ooo00o2 = o0OoO00O.this;
            if (o0ooo00o2.f4754o00oOo0O >= 1 || o0ooo00o2.f4753o00oOo00.getStateRestorationPolicy() != RecyclerView.o00oo0OO.o00oOOo0.PREVENT_WHEN_EMPTY) {
                return;
            }
            o0OoO00O o0ooo00o3 = o0OoO00O.this;
            o0ooo00o3.f4756o00oOooO.o00oOooO(o0ooo00o3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onStateRestorationPolicyChanged() {
            o0OoO00O o0ooo00o = o0OoO00O.this;
            o0ooo00o.f4756o00oOooO.o00oOooO(o0ooo00o);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2, @o0OO00OO Object obj);

        void o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2);

        void o00oOo00(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2);

        void o00oOo0O(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2);

        void o00oOo0o(@oo0oO0 o0OoO00O o0ooo00o);

        void o00oOoO0(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2);

        void o00oOooO(o0OoO00O o0ooo00o);
    }

    public o0OoO00O(RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo, o00oOOoO o00ooooo2, o0O0OOO0 o0o0ooo0, o0O0O0Oo.o00oOo0O o00ooo0o2) {
        this.f4753o00oOo00 = o00oo0oo;
        this.f4756o00oOooO = o00ooooo2;
        this.f4751o00oOOo0 = o0o0ooo0.o00oOOoO(this);
        this.f4752o00oOOoO = o00ooo0o2;
        this.f4754o00oOo0O = o00oo0oo.getItemCount();
        o00oo0oo.registerAdapterDataObserver(this.f4755o00oOo0o);
    }

    public void o00oOOo0() {
        this.f4753o00oOo00.unregisterAdapterDataObserver(this.f4755o00oOo0o);
        this.f4751o00oOOo0.o00oOOoO();
    }

    public int o00oOOoO() {
        return this.f4754o00oOo0O;
    }

    public long o00oOo00(int i) {
        return this.f4752o00oOOoO.o00oOOo0(this.f4753o00oOo00.getItemId(i));
    }

    public void o00oOo0O(RecyclerView.o0O00oO0 o0o00oo0, int i) {
        this.f4753o00oOo00.bindViewHolder(o0o00oo0, i);
    }

    public RecyclerView.o0O00oO0 o00oOo0o(ViewGroup viewGroup, int i) {
        return this.f4753o00oOo00.onCreateViewHolder(viewGroup, this.f4751o00oOOo0.o00oOo00(i));
    }

    public int o00oOooO(int i) {
        return this.f4751o00oOOo0.o00oOooO(this.f4753o00oOo00.getItemViewType(i));
    }
}
