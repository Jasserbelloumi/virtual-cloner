package o0OOo00O;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R5\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lo0OOo00O/oO0Oo0oo;", "Lo0OOo00O/oO000Oo0;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o0O00", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "Lkotlinx/coroutines/CompletionHandler;", "o00oo0o", "Lo0OOOO/o00oo;", "handler", "<init>", "(Lo0OOOO/o00oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0Oo0oo extends oO000Oo0 {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14109o00oo0oO = AtomicIntegerFieldUpdater.newUpdater(oO0Oo0oo.class, "_invoked");
    @NotNull
    private volatile /* synthetic */ int _invoked = 0;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0OOOO.o00oo<Throwable, o0OO0o.oO0Ooooo> f14110o00oo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public oO0Oo0oo(@NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        this.f14110o00oo0o = o00ooVar;
    }

    @Override // o0OOOO.o00oo
    public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke(Throwable th) {
        o0O00(th);
        return o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    @Override // o0OOo00O.o0ooO
    public void o0O00(@Nullable Throwable th) {
        if (f14109o00oo0oO.compareAndSet(this, 0, 1)) {
            this.f14110o00oo0o.invoke(th);
        }
    }
}
