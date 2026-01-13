package o0OO0oO;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OoOoO<E> extends o00oOo00<E> implements RandomAccess {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f13384o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<E> f13385o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f13386o00oo0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOoO(@NotNull List<? extends E> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "list");
        this.f13385o00oo0O0 = list;
    }

    @Override // o0OO0oO.o00oOo00, java.util.List
    public E get(int i) {
        o00oOo00.Companion.o00oOOoO(i, this.f13386o00oo0Oo);
        return this.f13385o00oo0O0.get(this.f13384o00oo0O + i);
    }

    @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
    public int getSize() {
        return this.f13386o00oo0Oo;
    }

    public final void o00oOOo0(int i, int i2) {
        o00oOo00.Companion.o00oOooO(i, i2, this.f13385o00oo0O0.size());
        this.f13384o00oo0O = i;
        this.f13386o00oo0Oo = i2 - i;
    }
}
