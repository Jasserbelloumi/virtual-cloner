package o0OOo00O;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOo00O.o0O0o00;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lo0OO/o00oo0;", "context", "", "exception", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "originalException", "thrownException", "o00oOo00", "Lkotlin/Function2;", "handler", "Lo0OOo00O/o0O0o00;", "o00oOOo0", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0o0 {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"o0OOo00O/o0O0o0$o00oOOo0", "Lo0OO/o00oOOo0;", "Lo0OOo00O/o0O0o00;", "Lo0OO/o00oo0;", "context", "", "exception", "Lo0OO0o/oO0Ooooo;", "o0O0oOO0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OO.o00oOOo0 implements o0O0o00 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O00000<o0OO.o00oo0, Throwable, o0OO0o.oO0Ooooo> f14010o00oo0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o0O00000<? super o0OO.o00oo0, ? super Throwable, o0OO0o.oO0Ooooo> o0o00000, o0O0o00.o00oOOoO o00ooooo2) {
            super(o00ooooo2);
            this.f14010o00oo0O = o0o00000;
        }

        @Override // o0OOo00O.o0O0o00
        public void o0O0oOO0(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Throwable th) {
            this.f14010o00oo0O.invoke(o00oo0Var, th);
        }
    }

    @NotNull
    public static final o0O0o00 o00oOOo0(@NotNull o0OOOO.o0O00000<? super o0OO.o00oo0, ? super Throwable, o0OO0o.oO0Ooooo> o0o00000) {
        return new o00oOOo0(o0o00000, o0O0o00.f14011o00oOoO0);
    }

    @oO0o0o
    public static final void o00oOOoO(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Throwable th) {
        try {
            o0O0o00 o0o0o00 = (o0O0o00) o00oo0Var.get(o0O0o00.f14011o00oOoO0);
            if (o0o0o00 != null) {
                o0o0o00.o0O0oOO0(o00oo0Var, th);
            } else {
                o0O0o00O.o00oOOo0(o00oo0Var, th);
            }
        } catch (Throwable th2) {
            o0O0o00O.o00oOOo0(o00oo0Var, o00oOo00(th, th2));
        }
    }

    @NotNull
    public static final Throwable o00oOo00(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        o0OO0o.o0O00000.o00oOOo0(runtimeException, th);
        return runtimeException;
    }
}
