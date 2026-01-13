package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o00oo00O<V> extends o00oOOoO<V> {
    public static <V> o00oo00O<V> o00oOOoO() {
        return new o00oo00O<>();
    }

    @Override // androidx.concurrent.futures.o00oOOoO
    public boolean set(@o0OO00OO V v) {
        return super.set(v);
    }

    @Override // androidx.concurrent.futures.o00oOOoO
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.o00oOOoO
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
