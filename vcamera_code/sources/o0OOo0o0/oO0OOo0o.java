package o0OOo0o0;

import android.support.v4.media.o00oOo0O;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import o0OOo00O.oO0O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lo0OOo0o0/oO0OOo0o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/oO0O000;", "Lo0OO/o00oo0;", "context", "o0O0Oooo", "(Lo0OO/o00oo0;)Ljava/lang/Object;", "oldState", "Lo0OO0o/oO0Ooooo;", "o0O0o00o", "(Lo0OO/o00oo0;Ljava/lang/Object;)V", "Lo0OO/o00oo0$o00oOo00;", "key", "minusKey", "Lo0OO/o00oo0$o00oOOoO;", "E", "get", "(Lo0OO/o00oo0$o00oOo00;)Lo0OO/o00oo0$o00oOOoO;", "", "toString", "o00oo0O0", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "o00oo0O", "Ljava/lang/ThreadLocal;", "threadLocal", "o00oo0Oo", "Lo0OO/o00oo0$o00oOo00;", "getKey", "()Lo0OO/o00oo0$o00oOo00;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0OOo0o<T> implements oO0O000<T> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ThreadLocal<T> f14655o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final T f14656o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00oo0.o00oOo00<?> f14657o00oo0Oo;

    public oO0OOo0o(T t, @NotNull ThreadLocal<T> threadLocal) {
        this.f14656o00oo0O0 = t;
        this.f14655o00oo0O = threadLocal;
        this.f14657o00oo0Oo = new oO000Oo0(threadLocal);
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(this, r, o0o00000);
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        if (o0ooO.o00oOoO0(this.f14657o00oo0Oo, o00ooo002)) {
            return this;
        }
        return null;
    }

    @Override // o0OO.o00oo0.o00oOOoO
    @NotNull
    public o00oo0.o00oOo00<?> getKey() {
        return this.f14657o00oo0Oo;
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @NotNull
    public o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        return o0ooO.o00oOoO0(this.f14657o00oo0Oo, o00ooo002) ? o00oo0O0.INSTANCE : this;
    }

    @Override // o0OOo00O.oO0O000
    public T o0O0Oooo(@NotNull o00oo0 o00oo0Var) {
        T t = this.f14655o00oo0O.get();
        this.f14655o00oo0O.set(this.f14656o00oo0O0);
        return t;
    }

    @Override // o0OOo00O.oO0O000
    public void o0O0o00o(@NotNull o00oo0 o00oo0Var, T t) {
        this.f14655o00oo0O.set(t);
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 plus(@NotNull o00oo0 o00oo0Var) {
        return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(this, o00oo0Var);
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ThreadLocal(value=");
        o00oOOo02.append(this.f14656o00oo0O0);
        o00oOOo02.append(", threadLocal = ");
        o00oOOo02.append(this.f14655o00oo0O);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
