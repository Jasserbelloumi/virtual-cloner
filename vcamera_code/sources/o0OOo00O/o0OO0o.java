package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OOO00o.o00oOOo0;
import o0OOO00o.o00oOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0015"}, d2 = {"Lo0OOo00O/o0OO0o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/oO000;", "", "state", "Lo0OO0o/oO0Ooooo;", "o0O0000O", "(Ljava/lang/Object;)V", "o0O0oO", "o0O0oOoO", "()Ljava/lang/Object;", "", "o0O0oo0", "()Z", "o0O0oOoo", "Lo0OO/o00oo0;", "context", "Lo0OO/o00oOo0O;", "uCont", "<init>", "(Lo0OO/o00oo0;Lo0OO/o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO0o<T> extends o0OOo0o0.oO000<T> {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14033o00oo0o0 = AtomicIntegerFieldUpdater.newUpdater(o0OO0o.class, "_decision");
    @NotNull
    private volatile /* synthetic */ int _decision;

    public o0OO0o(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        super(o00oo0Var, o00ooo0o2);
        this._decision = 0;
    }

    @Override // o0OOo0o0.oO000, o0OOo00O.oOo00OO0
    public void o0O0000O(@Nullable Object obj) {
        o0O0oO(obj);
    }

    @Override // o0OOo0o0.oO000, o0OOo00O.o00oOoO
    public void o0O0oO(@Nullable Object obj) {
        if (o0O0oOoo()) {
            return;
        }
        o0OOo0o0.o0OO00o.o00oOoO0(o00oOo00.o00oOooO(this.f14644o00oo0Oo), o0O0OOO.o00oOOo0(obj, this.f14644o00oo0Oo), null, 2, null);
    }

    @Nullable
    public final Object o0O0oOoO() {
        if (o0O0oo0()) {
            return o00oOOo0.COROUTINE_SUSPENDED;
        }
        Object o00oo0OO2 = oO00O0oO.o00oo0OO(o0O0O0oO());
        if (o00oo0OO2 instanceof o0O0O0Oo) {
            throw ((o0O0O0Oo) o00oo0OO2).f14007o00oOOo0;
        }
        return o00oo0OO2;
    }

    public final boolean o0O0oOoo() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f14033o00oo0o0.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean o0O0oo0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f14033o00oo0o0.compareAndSet(this, 0, 1));
        return true;
    }
}
