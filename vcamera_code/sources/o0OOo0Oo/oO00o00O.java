package o0OOo0Oo;

import kotlin.Metadata;
import o0OO.o00oo0;
import o0OOOO.o0O00000;
import o0OOOO0o.o00oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lo0OOo0Oo/oO00o00O;", "Lo0OO/o00oo0;", "R", "initial", "Lkotlin/Function2;", "Lo0OO/o00oo0$o00oOOoO;", "operation", "fold", "(Ljava/lang/Object;Lo0OOOO/o0O00000;)Ljava/lang/Object;", "E", "Lo0OO/o00oo0$o00oOo00;", "key", "get", "(Lo0OO/o00oo0$o00oOo00;)Lo0OO/o00oo0$o00oOOoO;", "minusKey", "context", "plus", "", "o00oo0O0", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lo0OO/o00oo0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00o00O implements o00oo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final /* synthetic */ o00oo0 f14533o00oo0O;
    @o00oOoO
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Throwable f14534o00oo0O0;

    public oO00o00O(@NotNull Throwable th, @NotNull o00oo0 o00oo0Var) {
        this.f14534o00oo0O0 = th;
        this.f14533o00oo0O = o00oo0Var;
    }

    @Override // o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        return (R) this.f14533o00oo0O.fold(r, o0o00000);
    }

    @Override // o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        return (E) this.f14533o00oo0O.get(o00ooo002);
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        return this.f14533o00oo0O.minusKey(o00ooo002);
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 plus(@NotNull o00oo0 o00oo0Var) {
        return this.f14533o00oo0O.plus(o00oo0Var);
    }
}
