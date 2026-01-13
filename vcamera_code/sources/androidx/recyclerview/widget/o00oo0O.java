package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oo0OO;
import androidx.recyclerview.widget.o0O0O0Oo;
import androidx.recyclerview.widget.o0O0OOO0;
import androidx.recyclerview.widget.o0OoO00O;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class o00oo0O implements o0OoO00O.o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0OO f4406o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OOO0 f4407o00oOOoO;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final o0O0O0Oo f4411o00oOoO;
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o00oo0OO.o00oOOo0.o00oOOoO f4412o00oOoO0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public List<WeakReference<RecyclerView>> f4408o00oOo00 = new ArrayList();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.o0O00oO0, o0OoO00O> f4413o00oOooO = new IdentityHashMap<>();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public List<o0OoO00O> f4409o00oOo0O = new ArrayList();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOOo0 f4410o00oOo0o = new o00oOOo0();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0OoO00O f4414o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4415o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4416o00oOo00;
    }

    public o00oo0O(o00oo0OO o00oo0oo, o00oo0OO.o00oOOo0 o00oooo02) {
        o0O0O0Oo o00ooo002;
        this.f4406o00oOOo0 = o00oo0oo;
        this.f4407o00oOOoO = o00oooo02.f4420o00oOOo0 ? new o0O0OOO0.o00oOOo0() : new o0O0OOO0.o00oOOoO();
        o00oo0OO.o00oOOo0.o00oOOoO o00ooooo2 = o00oooo02.f4421o00oOOoO;
        this.f4412o00oOoO0 = o00ooooo2;
        if (o00ooooo2 == o00oo0OO.o00oOOo0.o00oOOoO.NO_STABLE_IDS) {
            o00ooo002 = new o0O0O0Oo.o00oOOoO();
        } else if (o00ooooo2 == o00oo0OO.o00oOOo0.o00oOOoO.ISOLATED_STABLE_IDS) {
            o00ooo002 = new o0O0O0Oo.o00oOOo0();
        } else if (o00ooooo2 != o00oo0OO.o00oOOo0.o00oOOoO.SHARED_STABLE_IDS) {
            throw new IllegalArgumentException("unknown stable id mode");
        } else {
            o00ooo002 = new o0O0O0Oo.o00oOo00();
        }
        this.f4411o00oOoO = o00ooo002;
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOOo0(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2, @o0OO00OO Object obj) {
        this.f4406o00oOOo0.notifyItemRangeChanged(i + o00oo00O(o0ooo00o), i2, obj);
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2) {
        this.f4406o00oOOo0.notifyItemRangeInserted(i + o00oo00O(o0ooo00o), i2);
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOo00(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2) {
        int o00oo00O2 = o00oo00O(o0ooo00o);
        this.f4406o00oOOo0.notifyItemMoved(i + o00oo00O2, i2 + o00oo00O2);
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOo0O(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2) {
        this.f4406o00oOOo0.notifyItemRangeChanged(i + o00oo00O(o0ooo00o), i2);
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOo0o(@oo0oO0 o0OoO00O o0ooo00o) {
        this.f4406o00oOOo0.notifyDataSetChanged();
        o00oOoOo();
    }

    public boolean o00oOoO(int i, RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo) {
        if (i < 0 || i > this.f4409o00oOo0O.size()) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Index must be between 0 and ");
            o00oOOo02.append(this.f4409o00oOo0O.size());
            o00oOOo02.append(". Given:");
            o00oOOo02.append(i);
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        }
        if (o00oo()) {
            ooOOOOoo.o00oOOoO(o00oo0oo.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            o00oo0oo.hasStableIds();
        }
        if (o00oo0OO(o00oo0oo) != null) {
            return false;
        }
        o0OoO00O o0ooo00o = new o0OoO00O(o00oo0oo, this, this.f4407o00oOOoO, this.f4411o00oOoO.o00oOOo0());
        this.f4409o00oOo0O.add(i, o0ooo00o);
        for (WeakReference<RecyclerView> weakReference : this.f4408o00oOo00) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                o00oo0oo.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (o0ooo00o.f4754o00oOo0O > 0) {
            this.f4406o00oOOo0.notifyItemRangeInserted(o00oo00O(o0ooo00o), o0ooo00o.f4754o00oOo0O);
        }
        o00oOoOo();
        return true;
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOoO0(@oo0oO0 o0OoO00O o0ooo00o, int i, int i2) {
        this.f4406o00oOOo0.notifyItemRangeRemoved(i + o00oo00O(o0ooo00o), i2);
    }

    public boolean o00oOoOO(RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo) {
        return o00oOoO(this.f4409o00oOo0O.size(), o00oo0oo);
    }

    public final void o00oOoOo() {
        RecyclerView.o00oo0OO.o00oOOo0 o00oOooo2 = o00oOooo();
        if (o00oOooo2 != this.f4406o00oOOo0.getStateRestorationPolicy()) {
            this.f4406o00oOOo0.o00ooO0O(o00oOooo2);
        }
    }

    public boolean o00oOoo0() {
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            if (!o0ooo00o.f4753o00oOo00.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.o0OoO00O.o00oOOoO
    public void o00oOooO(o0OoO00O o0ooo00o) {
        o00oOoOo();
    }

    public final RecyclerView.o00oo0OO.o00oOOo0 o00oOooo() {
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            RecyclerView.o00oo0OO.o00oOOo0 stateRestorationPolicy = o0ooo00o.f4753o00oOo00.getStateRestorationPolicy();
            RecyclerView.o00oo0OO.o00oOOo0 o00oooo02 = RecyclerView.o00oo0OO.o00oOOo0.PREVENT;
            if (stateRestorationPolicy == o00oooo02) {
                return o00oooo02;
            }
            if (stateRestorationPolicy == RecyclerView.o00oo0OO.o00oOOo0.PREVENT_WHEN_EMPTY && o0ooo00o.o00oOOoO() == 0) {
                return o00oooo02;
            }
        }
        return RecyclerView.o00oo0OO.o00oOOo0.ALLOW;
    }

    public boolean o00oo() {
        return this.f4412o00oOoO0 != o00oo0OO.o00oOOo0.o00oOOoO.NO_STABLE_IDS;
    }

    @oo0oO0
    public final o00oOOo0 o00oo0(int i) {
        o00oOOo0 o00oooo02 = this.f4410o00oOo0o;
        if (o00oooo02.f4416o00oOo00) {
            o00oooo02 = new o00oOOo0();
        } else {
            o00oooo02.f4416o00oOo00 = true;
        }
        Iterator<o0OoO00O> it = this.f4409o00oOo0O.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o0OoO00O next = it.next();
            if (next.o00oOOoO() > i2) {
                o00oooo02.f4414o00oOOo0 = next;
                o00oooo02.f4415o00oOOoO = i2;
                break;
            }
            i2 -= next.o00oOOoO();
        }
        if (o00oooo02.f4414o00oOOo0 != null) {
            return o00oooo02;
        }
        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Cannot find wrapper for ", i));
    }

    public final int o00oo00O(o0OoO00O o0ooo00o) {
        o0OoO00O next;
        Iterator<o0OoO00O> it = this.f4409o00oOo0O.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != o0ooo00o) {
            i += next.o00oOOoO();
        }
        return i;
    }

    public List<RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0>> o00oo0O() {
        if (this.f4409o00oOo0O.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f4409o00oOo0O.size());
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            arrayList.add(o0ooo00o.f4753o00oOo00);
        }
        return arrayList;
    }

    @o0OO00OO
    public RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0O0(RecyclerView.o0O00oO0 o0o00oo0) {
        o0OoO00O o0ooo00o = this.f4413o00oOooO.get(o0o00oo0);
        if (o0ooo00o == null) {
            return null;
        }
        return o0ooo00o.f4753o00oOo00;
    }

    @o0OO00OO
    public final o0OoO00O o00oo0OO(RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo) {
        int o00ooO002 = o00ooO00(o00oo0oo);
        if (o00ooO002 == -1) {
            return null;
        }
        return this.f4409o00oOo0O.get(o00ooO002);
    }

    public long o00oo0Oo(int i) {
        o00oOOo0 o00oo02 = o00oo0(i);
        long o00oOo002 = o00oo02.f4414o00oOOo0.o00oOo00(o00oo02.f4415o00oOOoO);
        o00ooOoO(o00oo02);
        return o00oOo002;
    }

    public int o00oo0o(RecyclerView.o00oo0OO<? extends RecyclerView.o0O00oO0> o00oo0oo, RecyclerView.o0O00oO0 o0o00oo0, int i) {
        o0OoO00O o0ooo00o = this.f4413o00oOooO.get(o0o00oo0);
        if (o0ooo00o == null) {
            return -1;
        }
        int o00oo00O2 = i - o00oo00O(o0ooo00o);
        int itemCount = o0ooo00o.f4753o00oOo00.getItemCount();
        if (o00oo00O2 < 0 || o00oo00O2 >= itemCount) {
            StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("Detected inconsistent adapter updates. The local position of the view holder maps to ", o00oo00O2, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
            o00oOOo02.append(o0o00oo0);
            o00oOOo02.append("adapter:");
            o00oOOo02.append(o00oo0oo);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        return o0ooo00o.f4753o00oOo00.findRelativeAdapterPositionIn(o00oo0oo, o0o00oo0, o00oo00O2);
    }

    public int o00oo0o0(int i) {
        o00oOOo0 o00oo02 = o00oo0(i);
        int o00oOooO2 = o00oo02.f4414o00oOOo0.o00oOooO(o00oo02.f4415o00oOOoO);
        o00ooOoO(o00oo02);
        return o00oOooO2;
    }

    public int o00oo0oO() {
        int i = 0;
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            i += o0ooo00o.o00oOOoO();
        }
        return i;
    }

    public RecyclerView.o0O00oO0 o00ooO(ViewGroup viewGroup, int i) {
        return this.f4407o00oOOoO.o00oOOo0(i).o00oOo0o(viewGroup, i);
    }

    public final boolean o00ooO0(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.f4408o00oOo00) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public final int o00ooO00(RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo) {
        int size = this.f4409o00oOo0O.size();
        for (int i = 0; i < size; i++) {
            if (this.f4409o00oOo0O.get(i).f4753o00oOo00 == o00oo0oo) {
                return i;
            }
        }
        return -1;
    }

    public void o00ooO0O(RecyclerView recyclerView) {
        if (o00ooO0(recyclerView)) {
            return;
        }
        this.f4408o00oOo00.add(new WeakReference<>(recyclerView));
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            o0ooo00o.f4753o00oOo00.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void o00ooO0o(RecyclerView.o0O00oO0 o0o00oo0, int i) {
        o00oOOo0 o00oo02 = o00oo0(i);
        this.f4413o00oOooO.put(o0o00oo0, o00oo02.f4414o00oOOo0);
        o00oo02.f4414o00oOOo0.o00oOo0O(o0o00oo0, o00oo02.f4415o00oOOoO);
        o00ooOoO(o00oo02);
    }

    public boolean o00ooOO(RecyclerView.o0O00oO0 o0o00oo0) {
        o0OoO00O o0ooo00o = this.f4413o00oOooO.get(o0o00oo0);
        if (o0ooo00o != null) {
            boolean onFailedToRecycleView = o0ooo00o.f4753o00oOo00.onFailedToRecycleView(o0o00oo0);
            this.f4413o00oOooO.remove(o0o00oo0);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o00oo0 + ", seems like it is not bound by this adapter: " + this);
    }

    public void o00ooOO0(RecyclerView recyclerView) {
        int size = this.f4408o00oOo00.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f4408o00oOo00.get(size);
            if (weakReference.get() == null) {
                this.f4408o00oOo00.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f4408o00oOo00.remove(size);
                break;
            }
            size--;
        }
        for (o0OoO00O o0ooo00o : this.f4409o00oOo0O) {
            o0ooo00o.f4753o00oOo00.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public void o00ooOOo(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O0o(o0o00oo0).f4753o00oOo00.onViewAttachedToWindow(o0o00oo0);
    }

    public void o00ooOo(RecyclerView.o0O00oO0 o0o00oo0) {
        o0OoO00O o0ooo00o = this.f4413o00oOooO.get(o0o00oo0);
        if (o0ooo00o != null) {
            o0ooo00o.f4753o00oOo00.onViewRecycled(o0o00oo0);
            this.f4413o00oOooO.remove(o0o00oo0);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o00oo0 + ", seems like it is not bound by this adapter: " + this);
    }

    public void o00ooOo0(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O0o(o0o00oo0).f4753o00oOo00.onViewDetachedFromWindow(o0o00oo0);
    }

    public final void o00ooOoO(o00oOOo0 o00oooo02) {
        o00oooo02.f4416o00oOo00 = false;
        o00oooo02.f4414o00oOOo0 = null;
        o00oooo02.f4415o00oOOoO = -1;
        this.f4410o00oOo0o = o00oooo02;
    }

    public boolean o00ooOoo(RecyclerView.o00oo0OO<RecyclerView.o0O00oO0> o00oo0oo) {
        int o00ooO002 = o00ooO00(o00oo0oo);
        if (o00ooO002 == -1) {
            return false;
        }
        o0OoO00O o0ooo00o = this.f4409o00oOo0O.get(o00ooO002);
        int o00oo00O2 = o00oo00O(o0ooo00o);
        this.f4409o00oOo0O.remove(o00ooO002);
        this.f4406o00oOOo0.notifyItemRangeRemoved(o00oo00O2, o0ooo00o.o00oOOoO());
        for (WeakReference<RecyclerView> weakReference : this.f4408o00oOo00) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                o00oo0oo.onDetachedFromRecyclerView(recyclerView);
            }
        }
        o0ooo00o.o00oOOo0();
        o00oOoOo();
        return true;
    }

    @oo0oO0
    public final o0OoO00O o0O0o(RecyclerView.o0O00oO0 o0o00oo0) {
        o0OoO00O o0ooo00o = this.f4413o00oOooO.get(o0o00oo0);
        if (o0ooo00o != null) {
            return o0ooo00o;
        }
        throw new IllegalStateException("Cannot find wrapper for " + o0o00oo0 + ", seems like it is not bound by this adapter: " + this);
    }
}
