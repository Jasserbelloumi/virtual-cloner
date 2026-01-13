package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO implements o0O00 {
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final RecyclerView.o00oo0OO f4298o00oo0O0;

    public o00oOOoO(@oo0oO0 RecyclerView.o00oo0OO o00oo0oo) {
        this.f4298o00oo0O0 = o00oo0oo;
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOOo0(int i, int i2) {
        this.f4298o00oo0O0.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOOoO(int i, int i2) {
        this.f4298o00oo0O0.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOo00(int i, int i2, Object obj) {
        this.f4298o00oo0O0.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.o0O00
    public void o00oOooO(int i, int i2) {
        this.f4298o00oo0O0.notifyItemMoved(i, i2);
    }
}
