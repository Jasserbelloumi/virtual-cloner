package o0OOOoO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0o0000<T, K> implements oO000<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000<T> f13772o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo<T, K> f13773o00oOOoO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0o0000(@NotNull oO000<? extends T> oo000, @NotNull o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        this.f13772o00oOOo0 = oo000;
        this.f13773o00oOOoO = o00ooVar;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<T> iterator() {
        return new o0OOo000(this.f13772o00oOOo0.iterator(), this.f13773o00oOOoO);
    }
}
