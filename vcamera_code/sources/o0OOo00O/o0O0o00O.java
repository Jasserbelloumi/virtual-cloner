package o0OOo00O;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import o0OO0o.oo0oO0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lo0OO/o00oo0;", "context", "", "exception", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "", "Lo0OOo00O/o0O0o00;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0o00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final List<o0O0o00> f14014o00oOOo0 = o0OOOoO0.ooOOOOoo.o0OOo0O0(o0OOOoO0.oO0OoOO0.o00oOo0O(ServiceLoader.load(o0O0o00.class, o0O0o00.class.getClassLoader()).iterator()));

    public static final void o00oOOo0(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Throwable th) {
        for (o0O0o00 o0o0o00 : f14014o00oOOo0) {
            try {
                o0o0o00.o0O0oOO0(o00oo0Var, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, o0O0o0.o00oOo00(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            o0OO0o.o0O00000.o00oOOo0(th, new o0OO0o00(o00oo0Var));
            o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        } catch (Throwable th3) {
            oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
            o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
