package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.o0O00oO0;
import androidx.recyclerview.widget.o00oOo00;
import androidx.recyclerview.widget.o00oOo0O;
import androidx.recyclerview.widget.o00oo;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O000o0<T, VH extends RecyclerView.o0O00oO0> extends RecyclerView.o00oo0OO<VH> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOo0O<T> f4586o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOo0O.o00oOOoO<T> f4587o00oOOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOo0O.o00oOOoO<T> {
        public o00oOOo0() {
        }

        @Override // androidx.recyclerview.widget.o00oOo0O.o00oOOoO
        public void o00oOOo0(@oo0oO0 List<T> list, @oo0oO0 List<T> list2) {
            o0O000o0.this.o00ooO0(list, list2);
        }
    }

    public o0O000o0(@oo0oO0 o00oOo00<T> o00ooo002) {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f4587o00oOOoO = o00oooo02;
        o00oOo0O<T> o00ooo0o2 = new o00oOo0O<>(new o00oOOoO(this), o00ooo002);
        this.f4586o00oOOo0 = o00ooo0o2;
        o00ooo0o2.o00oOOo0(o00oooo02);
    }

    public o0O000o0(@oo0oO0 o00oo.o00oo00O<T> o00oo00o) {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f4587o00oOOoO = o00oooo02;
        o00oOo0O<T> o00ooo0o2 = new o00oOo0O<>(new o00oOOoO(this), new o00oOo00.o00oOOo0(o00oo00o).o00oOOo0());
        this.f4586o00oOOo0 = o00ooo0o2;
        o00ooo0o2.o00oOOo0(o00oooo02);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f4586o00oOOo0.o00oOOoO().size();
    }

    @oo0oO0
    public List<T> o00oo() {
        return this.f4586o00oOOo0.o00oOOoO();
    }

    public void o00ooO0(@oo0oO0 List<T> list, @oo0oO0 List<T> list2) {
    }

    public T o00ooO00(int i) {
        return this.f4586o00oOOo0.o00oOOoO().get(i);
    }

    public void o00ooO0O(@o0OO00OO List<T> list) {
        this.f4586o00oOOo0.o00oOo0o(list);
    }

    public void o00ooO0o(@o0OO00OO List<T> list, @o0OO00OO Runnable runnable) {
        this.f4586o00oOOo0.o00oOoO0(list, runnable);
    }
}
