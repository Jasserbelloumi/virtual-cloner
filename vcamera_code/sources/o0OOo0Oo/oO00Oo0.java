package o0OOo0Oo;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OO0o.oO0Ooooo;
import o0OOO00o.o00oOOo0;
import o0OOOOO0.o0O00;
import o0OOo0O0.o0O000;
import o0OOo0OO.o0OO0;
import o0OOo0OO.o0OO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lo0OOo0Oo/oO00Oo0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0Oo/oO00Oo00;", "Lo0OO/o00oo0;", "context", "", "capacity", "Lo0OOo0O0/o0O000;", "onBufferOverflow", "Lo0OOo0Oo/oO00OOO;", "o00oOoo0", "Lo0OOo0OO/o0OO00o;", "o00oOooo", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oo0o", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "flow", "<init>", "(Lo0OOo0OO/o0OO00o;Lo0OO/o00oo0;ILo0OOo0O0/o0O000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00Oo0<T> extends oO00Oo00<T, T> {
    public oO00Oo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var, int i, @NotNull o0O000 o0o000) {
        super(o0oo00o, o00oo0Var, i, o0o000);
    }

    public oO00Oo0(o0OO00o o0oo00o, o00oo0 o00oo0Var, int i, o0O000 o0o000, int i2, o0O00 o0o00) {
        super(o0oo00o, (i2 & 2) != 0 ? o00oo0O0.INSTANCE : o00oo0Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? o0O000.SUSPEND : o0o000);
    }

    @Override // o0OOo0Oo.oO00OOO
    @NotNull
    public oO00OOO<T> o00oOoo0(@NotNull o00oo0 o00oo0Var, int i, @NotNull o0O000 o0o000) {
        return new oO00Oo0(this.f14531o00oo0o0, o00oo0Var, i, o0o000);
    }

    @Override // o0OOo0Oo.oO00OOO
    @NotNull
    public o0OO00o<T> o00oOooo() {
        return (o0OO00o<T>) this.f14531o00oo0o0;
    }

    @Override // o0OOo0Oo.oO00Oo00
    @Nullable
    public Object o00oo0o(@NotNull o0OO0<? super T> o0oo0, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOOo02 = this.f14531o00oo0o0.o00oOOo0(o0oo0, o00ooo0o2);
        return o00oOOo02 == o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : oO0Ooooo.f13240o00oOOo0;
    }
}
