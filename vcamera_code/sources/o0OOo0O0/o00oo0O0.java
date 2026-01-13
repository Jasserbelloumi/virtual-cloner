package o0OOo0O0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OOo00O.o;
import o0OOo00O.o0O0o0;
import o0OOo00O.oo0ooO;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lo0OOo0O0/o00oo0O0;", "E", "Lo0OOo0O0/o0OoOoOo;", "Lo0OOo0O0/o0O0o;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o0O0OoOo", "exception", "", "o0O0O0oo", "Lo0OO/o00oo0;", "parentContext", "Lo0OOo0O0/o0O000O;", "channel", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lo0OO/o00oo0;Lo0OOo0O0/o0O000O;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o00oo0O0<E> extends o0OoOoOo<E> implements o0O0o<E> {
    public o00oo0O0(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0O000O<E> o0o000o, boolean z) {
        super(o00oo0Var, o0o000o, false, z);
        o0O0OO0O((ooOOOOoo) o00oo0Var.get(ooOOOOoo.f14136o00oOoO));
    }

    @Override // o0OOo00O.oOo00OO0
    public boolean o0O0O0oo(@NotNull Throwable th) {
        o0O0o0.o00oOOoO(getContext(), th);
        return true;
    }

    @Override // o0OOo00O.oOo00OO0
    public void o0O0OoOo(@Nullable Throwable th) {
        o0O000O<E> o0O0oOo2 = o0O0oOo();
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = o.o00oOOo0(oo0ooO.o00oOOo0(this) + " was cancelled", th);
            }
        }
        o0O0oOo2.o00oOOoO(r1);
    }
}
