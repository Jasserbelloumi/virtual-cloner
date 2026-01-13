package o0OOo0O0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OOO00o.o00oOOo0;
import o0OOo00O.o00oOoO;
import o0OOo00O.oO0000Oo;
import o0OOo00O.oO0OOo0o;
import o0OOo00O.oOo00OO0;
import o0OOo0oo.oO;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010@\u001a\u00020?\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010A\u001a\u00020\u0007\u0012\u0006\u0010B\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0014J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010#\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b/\u0010+R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017008\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b4\u00102R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000008VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00102R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000009088\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Lo0OOo0O0/o0OoOoOo;", "E", "Lo0OOo00O/o00oOoO;", "Lo0OO0o/oO0Ooooo;", "Lo0OOo0O0/o0O000O;", "", "cause", "", "o00ooo0", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "handler", "o00oOooO", "Lo0OOo0O0/o0O000Oo;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "o00oo00O", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00;", "o00ooo0o", "o00oo0oO", "o00ooOo", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00ooOo0", "o00oo0o0", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", o00oOOoO.f12961o00oOo00, "o0O000o", "o00oo0Oo", "Lo0OOo0O0/o0O000O;", "o0O0oOo", "()Lo0OOo0O0/o0O000O;", "_channel", "o00oOo00", "()Z", "isClosedForReceive", "o00oooO", "isClosedForSend", "isEmpty", "Lo0OOo0oo/oO;", "o00oo", "()Lo0OOo0oo/oO;", "onReceive", "o00ooO", "onReceiveCatching", "o00ooOO0", "onReceiveOrNull", "Lo0OOo0oo/oOO00000;", "Lo0OOo0O0/o0OooO0;", "o00oo0O", "()Lo0OOo0oo/oOO00000;", "onSend", "o00oOo0O", "channel", "Lo0OO/o00oo0;", "parentContext", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lo0OO/o00oo0;Lo0OOo0O0/o0O000O;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0OoOoOo<E> extends o00oOoO<oO0Ooooo> implements o0O000O<E> {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O000O<E> f14308o00oo0Oo;

    public o0OoOoOo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0O000O<E> o0o000o, boolean z, boolean z2) {
        super(o00oo0Var, z, z2);
        this.f14308o00oo0Oo = o0o000o;
    }

    @Override // o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    public /* synthetic */ void cancel() {
        o0O000o(new oO0OOo0o(o0O00O0(), null, this));
    }

    @Override // o0OOo0O0.o0O0OO
    public boolean isEmpty() {
        return this.f14308o00oo0Oo.isEmpty();
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public o0O000Oo<E> iterator() {
        return this.f14308o00oo0Oo.iterator();
    }

    @Override // o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean o00oOOo0(Throwable th) {
        o0O000o(new oO0OOo0o(o0O00O0(), null, this));
        return true;
    }

    @Override // o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    public final void o00oOOoO(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new oO0OOo0o(o0O00O0(), null, this);
        }
        o0O000o(cancellationException);
    }

    @Override // o0OOo0O0.o0O0OO
    public boolean o00oOo00() {
        return this.f14308o00oo0Oo.o00oOo00();
    }

    @NotNull
    public final o0O000O<E> o00oOo0O() {
        return this;
    }

    @Override // o0OOo0O0.o0OooO0
    @oO0000Oo
    public void o00oOooO(@NotNull o0OOOO.o00oo<? super Throwable, oO0Ooooo> o00ooVar) {
        this.f14308o00oo0Oo.o00oOooO(o00ooVar);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public oO<E> o00oo() {
        return this.f14308o00oo0Oo.o00oo();
    }

    @Override // o0OOo0O0.o0O0OO
    @Nullable
    public Object o00oo00O(@NotNull o00oOo0O<? super E> o00ooo0o2) {
        return this.f14308o00oo0Oo.o00oo00O(o00ooo0o2);
    }

    @NotNull
    public oOO00000<E, o0OooO0<E>> o00oo0O() {
        return this.f14308o00oo0Oo.o00oo0O();
    }

    @NotNull
    public Object o00oo0o0(E e) {
        return this.f14308o00oo0Oo.o00oo0o0(e);
    }

    @Override // o0OOo0O0.o0O0OO
    @o0OOO0OO.o00oo0OO
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @o0OO000(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object o00oo0oO(@NotNull o00oOo0O<? super E> o00ooo0o2) {
        return this.f14308o00oo0Oo.o00oo0oO(o00ooo0o2);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public oO<o0O00<E>> o00ooO() {
        return this.f14308o00oo0Oo.o00ooO();
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public oO<E> o00ooOO0() {
        return this.f14308o00oo0Oo.o00ooOO0();
    }

    @Nullable
    public Object o00ooOo(E e, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        return this.f14308o00oo0Oo.o00ooOo(e, o00ooo0o2);
    }

    @Override // o0OOo0O0.o0O0OO
    @NotNull
    public Object o00ooOo0() {
        return this.f14308o00oo0Oo.o00ooOo0();
    }

    public boolean o00ooo0(@Nullable Throwable th) {
        return this.f14308o00oo0Oo.o00ooo0(th);
    }

    @Override // o0OOo0O0.o0O0OO
    @Nullable
    public Object o00ooo0o(@NotNull o00oOo0O<? super o0O00<? extends E>> o00ooo0o2) {
        Object o00ooo0o3 = this.f14308o00oo0Oo.o00ooo0o(o00ooo0o2);
        o00oOOo0 o00oooo02 = o00oOOo0.COROUTINE_SUSPENDED;
        return o00ooo0o3;
    }

    @Override // o0OOo0O0.o0OooO0
    public boolean o00oooO() {
        return this.f14308o00oo0Oo.o00oooO();
    }

    @Override // o0OOo00O.oOo00OO0
    public void o0O000o(@NotNull Throwable th) {
        CancellationException o0oOo0O02 = oOo00OO0.o0oOo0O0(this, th, null, 1, null);
        this.f14308o00oo0Oo.o00oOOoO(o0oOo0O02);
        o0O000Oo(o0oOo0O02);
    }

    @NotNull
    public final o0O000O<E> o0O0oOo() {
        return this.f14308o00oo0Oo;
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f14308o00oo0Oo.offer(e);
    }

    @Override // o0OOo0O0.o0O0OO
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @o0OO000(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return this.f14308o00oo0Oo.poll();
    }
}
