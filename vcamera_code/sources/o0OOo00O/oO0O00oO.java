package o0OOo00O;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lo0OOo00O/oO0O00oO;", "Lkotlin/Function1;", "", "Lo0OO0o/o0O0o00O;", "name", "cause", "Lo0OO0o/oO0Ooooo;", "Lkotlinx/coroutines/CompletionHandler;", "o00oOooO", "()V", "o00oOOo0", "o00oOo00", "(Ljava/lang/Throwable;)V", "", "state", "", o00oOOoO.f12961o00oOo00, "(I)Ljava/lang/Void;", "Lo0OOo00O/ooOOOOoo;", "o00oo0O0", "Lo0OOo00O/ooOOOOoo;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "o00oo0O", "Ljava/lang/Thread;", "targetThread", "Lo0OOo00O/o0OOO0OO;", "o00oo0Oo", "Lo0OOo00O/o0OOO0OO;", "cancelHandle", "<init>", "(Lo0OOo00O/ooOOOOoo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O00oO implements o0OOOO.o00oo<Throwable, o0OO0o.oO0Ooooo> {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14099o00oo0o0 = AtomicIntegerFieldUpdater.newUpdater(oO0O00oO.class, "_state");
    @NotNull
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Thread f14100o00oo0O = Thread.currentThread();
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ooOOOOoo f14101o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0OOO0OO f14102o00oo0Oo;

    public oO0O00oO(@NotNull ooOOOOoo oooooooo) {
        this.f14101o00oo0O0 = oooooooo;
    }

    @Override // o0OOOO.o00oo
    public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke(Throwable th) {
        o00oOo00(th);
        return o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public final void o00oOOo0() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        o00oOOoO(i);
                        throw new o0OO0o.o0OoO00O();
                    }
                }
            } else if (f14099o00oo0o0.compareAndSet(this, i, 1)) {
                o0OOO0OO o0ooo0oo = this.f14102o00oo0Oo;
                if (o0ooo0oo != null) {
                    o0ooo0oo.o00oOOoO();
                    return;
                }
                return;
            }
        }
    }

    public final Void o00oOOoO(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public void o00oOo00(@Nullable Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                o00oOOoO(i);
                throw new o0OO0o.o0OoO00O();
            }
        } while (!f14099o00oo0o0.compareAndSet(this, i, 2));
        this.f14100o00oo0O.interrupt();
        this._state = 3;
    }

    public final void o00oOooO() {
        int i;
        this.f14102o00oo0Oo = this.f14101o00oo0O0.o0O0OO0(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                o00oOOoO(i);
                throw new o0OO0o.o0OoO00O();
            }
        } while (!f14099o00oo0o0.compareAndSet(this, i, 0));
    }
}
