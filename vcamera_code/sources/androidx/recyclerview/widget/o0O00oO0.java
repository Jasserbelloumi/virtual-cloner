package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O00oO0 extends RecyclerView.o00ooO0 {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f4631o00oo0 = "SimpleItemAnimator";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final boolean f4632o00oo00O = false;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f4633o00oOooo = true;

    public void o0(RecyclerView.o0O00oO0 o0o00oo0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOOo0(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @o0OO00OO RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o3) {
        int i;
        int i2;
        return (o00ooo0o2 == null || ((i = o00ooo0o2.f4126o00oOOo0) == (i2 = o00ooo0o3.f4126o00oOOo0) && o00ooo0o2.f4127o00oOOoO == o00ooo0o3.f4127o00oOOoO)) ? o00ooOO(o0o00oo0) : o00ooOo0(o0o00oo0, i, o00ooo0o2.f4127o00oOOoO, i2, o00ooo0o3.f4127o00oOOoO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOOoO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo02, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o3) {
        int i;
        int i2;
        int i3 = o00ooo0o2.f4126o00oOOo0;
        int i4 = o00ooo0o2.f4127o00oOOoO;
        if (o0o00oo02.shouldIgnore()) {
            int i5 = o00ooo0o2.f4126o00oOOo0;
            i2 = o00ooo0o2.f4127o00oOOoO;
            i = i5;
        } else {
            i = o00ooo0o3.f4126o00oOOo0;
            i2 = o00ooo0o3.f4127o00oOOoO;
        }
        return o00ooOOo(o0o00oo0, o0o00oo02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOo00(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @o0OO00OO RecyclerView.o00ooO0.o00oOo0O o00ooo0o3) {
        int i = o00ooo0o2.f4126o00oOOo0;
        int i2 = o00ooo0o2.f4127o00oOOoO;
        View view = o0o00oo0.itemView;
        int left = o00ooo0o3 == null ? view.getLeft() : o00ooo0o3.f4126o00oOOo0;
        int top = o00ooo0o3 == null ? view.getTop() : o00ooo0o3.f4127o00oOOoO;
        if (o0o00oo0.isRemoved() || (i == left && i2 == top)) {
            return o00ooOo(o0o00oo0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return o00ooOo0(o0o00oo0, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOo0o(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        return !this.f4633o00oOooo || o0o00oo0.isInvalid();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOooO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o3) {
        int i = o00ooo0o2.f4126o00oOOo0;
        int i2 = o00ooo0o3.f4126o00oOOo0;
        if (i == i2 && o00ooo0o2.f4127o00oOOoO == o00ooo0o3.f4127o00oOOoO) {
            o00ooo0O(o0o00oo0);
            return false;
        }
        return o00ooOo0(o0o00oo0, i, o00ooo0o2.f4127o00oOOoO, i2, o00ooo0o3.f4127o00oOOoO);
    }

    public abstract boolean o00ooOO(RecyclerView.o0O00oO0 o0o00oo0);

    public abstract boolean o00ooOOo(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o0O00oO0 o0o00oo02, int i, int i2, int i3, int i4);

    public abstract boolean o00ooOo(RecyclerView.o0O00oO0 o0o00oo0);

    public abstract boolean o00ooOo0(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, int i3, int i4);

    public final void o00ooOoO(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oooo0(o0o00oo0);
        o00oOoO(o0o00oo0);
    }

    public final void o00ooOoo(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oooo(o0o00oo0);
    }

    public final void o00ooo0(RecyclerView.o0O00oO0 o0o00oo0, boolean z) {
        o00ooooo(o0o00oo0, z);
    }

    public final void o00ooo00(RecyclerView.o0O00oO0 o0o00oo0, boolean z) {
        o00ooooO(o0o00oo0, z);
        o00oOoO(o0o00oo0);
    }

    public final void o00ooo0O(RecyclerView.o0O00oO0 o0o00oo0) {
        o0(o0o00oo0);
        o00oOoO(o0o00oo0);
    }

    public final void o00ooo0o(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O00000(o0o00oo0);
    }

    public final void o00oooO(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O0000O(o0o00oo0);
        o00oOoO(o0o00oo0);
    }

    public final void o00oooOO(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O0000o(o0o00oo0);
    }

    public boolean o00oooOo() {
        return this.f4633o00oOooo;
    }

    public void o00oooo(RecyclerView.o0O00oO0 o0o00oo0) {
    }

    public void o00oooo0(RecyclerView.o0O00oO0 o0o00oo0) {
    }

    public void o00ooooO(RecyclerView.o0O00oO0 o0o00oo0, boolean z) {
    }

    public void o00ooooo(RecyclerView.o0O00oO0 o0o00oo0, boolean z) {
    }

    public void o0O000(boolean z) {
        this.f4633o00oOooo = z;
    }

    public void o0O00000(RecyclerView.o0O00oO0 o0o00oo0) {
    }

    public void o0O0000O(RecyclerView.o0O00oO0 o0o00oo0) {
    }

    public void o0O0000o(RecyclerView.o0O00oO0 o0o00oo0) {
    }
}
