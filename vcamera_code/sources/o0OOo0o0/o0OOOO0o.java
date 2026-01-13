package o0OOo0o0;

import androidx.concurrent.futures.o00oOo00;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lo0OOo0o0/o0OOOO0o;", "", "E", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "()V", "element", "", "o00oOOo0", "(Ljava/lang/Object;)Z", "o00oOoO0", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "o00oOo0o", "(Lo0OOOO/o00oo;)Ljava/util/List;", "o00oOooO", "()Z", "o00oOo0O", "isEmpty", "", "o00oOo00", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0OOOO0o<E> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14634o00oOOo0 = AtomicReferenceFieldUpdater.newUpdater(o0OOOO0o.class, Object.class, "_cur");
    @NotNull
    private volatile /* synthetic */ Object _cur;

    public o0OOOO0o(boolean z) {
        this._cur = new o0OOOO(8, z);
    }

    public final boolean o00oOOo0(@NotNull E e) {
        while (true) {
            o0OOOO o0oooo = (o0OOOO) this._cur;
            int o00oOOo02 = o0oooo.o00oOOo0(e);
            if (o00oOOo02 == 0) {
                return true;
            }
            if (o00oOOo02 == 1) {
                o00oOo00.o00oOOo0(f14634o00oOOo0, this, o0oooo, o0oooo.o00oOoo0());
            } else if (o00oOOo02 == 2) {
                return false;
            }
        }
    }

    public final void o00oOOoO() {
        while (true) {
            o0OOOO o0oooo = (o0OOOO) this._cur;
            if (o0oooo.o00oOooO()) {
                return;
            }
            o00oOo00.o00oOOo0(f14634o00oOOo0, this, o0oooo, o0oooo.o00oOoo0());
        }
    }

    public final int o00oOo00() {
        return ((o0OOOO) this._cur).o00oOo0o();
    }

    public final boolean o00oOo0O() {
        return ((o0OOOO) this._cur).o00oOoO();
    }

    @NotNull
    public final <R> List<R> o00oOo0o(@NotNull o00oo<? super E, ? extends R> o00ooVar) {
        return ((o0OOOO) this._cur).o00oOoOO(o00ooVar);
    }

    @Nullable
    public final E o00oOoO0() {
        while (true) {
            o0OOOO o0oooo = (o0OOOO) this._cur;
            E e = (E) o0oooo.o00oOooo();
            if (e != o0OOOO.f14624o00oo0o) {
                return e;
            }
            o00oOo00.o00oOOo0(f14634o00oOOo0, this, o0oooo, o0oooo.o00oOoo0());
        }
    }

    public final boolean o00oOooO() {
        return ((o0OOOO) this._cur).o00oOoO0();
    }
}
