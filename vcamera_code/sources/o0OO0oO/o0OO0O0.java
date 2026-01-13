package o0OO0oO;

import java.util.List;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OO0O0<T> extends o00oo00O<T> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<T> f13370o00oo0O0;

    public o0OO0O0(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "delegate");
        this.f13370o00oo0O0 = list;
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.f13370o00oo0O0.add(o0O00oO0.o0O0Ooo0(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f13370o00oo0O0.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.f13370o00oo0O0.get(o0O00oO0.o0O0OoOo(this, i));
    }

    @Override // o0OO0oO.o00oo00O
    public int getSize() {
        return this.f13370o00oo0O0.size();
    }

    @Override // o0OO0oO.o00oo00O
    public T removeAt(int i) {
        return this.f13370o00oo0O0.remove(o0O00oO0.o0O0OoOo(this, i));
    }

    @Override // o0OO0oO.o00oo00O, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.f13370o00oo0O0.set(o0O00oO0.o0O0OoOo(this, i), t);
    }
}
