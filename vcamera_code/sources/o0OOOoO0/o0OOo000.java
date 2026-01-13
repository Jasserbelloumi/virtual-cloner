package o0OOOoO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Iterator;
import o0OO0oO.o00oOOoO;
import o0OO0oO.o0OOO0O;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OOo000<T, K> extends o00oOOoO<T> {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Iterator<T> f13769o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final HashSet<K> f13770o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oo<T, K> f13771o00oo0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOo000(@NotNull Iterator<? extends T> it, @NotNull o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(it, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        this.f13769o00oo0Oo = it;
        this.f13771o00oo0o0 = o00ooVar;
        this.f13770o00oo0o = new HashSet<>();
    }

    @Override // o0OO0oO.o00oOOoO
    public void o00oOOo0() {
        while (this.f13769o00oo0Oo.hasNext()) {
            T next = this.f13769o00oo0Oo.next();
            if (this.f13770o00oo0o.add(this.f13771o00oo0o0.invoke(next))) {
                o00oOo00(next);
                return;
            }
        }
        this.f13302o00oo0O0 = o0OOO0O.Done;
    }
}
