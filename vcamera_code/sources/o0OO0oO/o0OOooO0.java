package o0OO0oO;

import java.util.List;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0OOooO0<T> extends o00oOo00<T> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<T> f13383o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOooO0(@NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "delegate");
        this.f13383o00oo0O0 = list;
    }

    @Override // o0OO0oO.o00oOo00, java.util.List
    public T get(int i) {
        return this.f13383o00oo0O0.get(o0O00oO0.o0O0OoOo(this, i));
    }

    @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
    public int getSize() {
        return this.f13383o00oo0O0.size();
    }
}
