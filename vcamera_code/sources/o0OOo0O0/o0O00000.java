package o0OOo0O0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OOo00O.o00oOoO;
import o0OOo00O.o0O0o0;
import o0OOo00O.oO0000Oo;
import o0OOo00O.oO0OOo0o;
import o0OOo00O.oOo00OO0;
import o0OOo00O.ooOOOOoo;
import o0OOo0O0.o0OooO0;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00105\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010(R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lo0OOo0O0/o0O00000;", "E", "Lo0OOo00O/o00oOoO;", "Lo0OO0o/oO0Ooooo;", "Lo0OOo0O0/o0ooO;", "Lo0OOo0O0/o00ooO;", "Lkotlin/Function1;", "", "Lo0OO0o/o0O0o00O;", "name", "cause", "handler", "o00oOooO", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lo0OOo0O0/o0O0OO;", "o00oo0Oo", "o00ooOo", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00;", "o00oo0o0", "(Ljava/lang/Object;)Ljava/lang/Object;", "o00oOOo0", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", o00oOOoO.f12961o00oOo00, "o0O000o", "value", "o0O0oOoO", "(Lo0OO0o/oO0Ooooo;)V", "handled", "o0O0oOOO", "o00ooo0", "Lo0OOo0O0/o00ooO;", "o0O0oOo", "()Lo0OOo0O0/o00ooO;", "_channel", "o00oooO", "()Z", "isClosedForSend", "Lo0OOo0oo/oOO00000;", "Lo0OOo0O0/o0OooO0;", "o00oo0O", "()Lo0OOo0oo/oOO00000;", "onSend", "isActive", "o00oOo0O", "()Lo0OOo0O0/o0OooO0;", "channel", "Lo0OO/o00oo0;", "parentContext", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lo0OO/o00oo0;Lo0OOo0O0/o00ooO;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0O00000<E> extends o00oOoO<oO0Ooooo> implements o0ooO<E>, o00ooO<E> {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00ooO<E> f14272o00oo0Oo;

    public o0O00000(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o00ooO<E> o00ooo, boolean z) {
        super(o00oo0Var, false, z);
        this.f14272o00oo0Oo = o00ooo;
        o0O0OO0O((ooOOOOoo) o00oo0Var.get(ooOOOOoo.f14136o00oOoO));
    }

    @Override // o0OOo00O.o00oOoO, o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    public boolean isActive() {
        return super.isActive();
    }

    @Override // o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean o00oOOo0(Throwable th) {
        if (th == null) {
            th = new oO0OOo0o(o0O00O0(), null, this);
        }
        o0O000o(th);
        return true;
    }

    @Override // o0OOo00O.oOo00OO0, o0OOo00O.ooOOOOoo
    public final void o00oOOoO(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new oO0OOo0o(o0O00O0(), null, this);
        }
        o0O000o(cancellationException);
    }

    @Override // o0OOo0O0.o0ooO
    @NotNull
    public o0OooO0<E> o00oOo0O() {
        return this;
    }

    @Override // o0OOo0O0.o0OooO0
    @oO0000Oo
    public void o00oOooO(@NotNull o0OOOO.o00oo<? super Throwable, oO0Ooooo> o00ooVar) {
        this.f14272o00oo0Oo.o00oOooO(o00ooVar);
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public oOO00000<E, o0OooO0<E>> o00oo0O() {
        return this.f14272o00oo0Oo.o00oo0O();
    }

    @Override // o0OOo0O0.o00ooO
    @NotNull
    public o0O0OO<E> o00oo0Oo() {
        return this.f14272o00oo0Oo.o00oo0Oo();
    }

    @Override // o0OOo0O0.o0OooO0
    @NotNull
    public Object o00oo0o0(E e) {
        return this.f14272o00oo0Oo.o00oo0o0(e);
    }

    @Override // o0OOo0O0.o0OooO0
    @Nullable
    public Object o00ooOo(E e, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        return this.f14272o00oo0Oo.o00ooOo(e, o00ooo0o2);
    }

    @Override // o0OOo0O0.o0OooO0
    public boolean o00ooo0(@Nullable Throwable th) {
        boolean o00ooo02 = this.f14272o00oo0Oo.o00ooo0(th);
        start();
        return o00ooo02;
    }

    @Override // o0OOo0O0.o0OooO0
    public boolean o00oooO() {
        return this.f14272o00oo0Oo.o00oooO();
    }

    @Override // o0OOo00O.oOo00OO0
    public void o0O000o(@NotNull Throwable th) {
        CancellationException o0oOo0O02 = oOo00OO0.o0oOo0O0(this, th, null, 1, null);
        this.f14272o00oo0Oo.o00oOOoO(o0oOo0O02);
        o0O000Oo(o0oOo0O02);
    }

    @Override // o0OOo00O.o00oOoO
    public void o0O0oOOO(@NotNull Throwable th, boolean z) {
        if (this.f14272o00oo0Oo.o00ooo0(th) || z) {
            return;
        }
        o0O0o0.o00oOOoO(getContext(), th);
    }

    @NotNull
    public final o00ooO<E> o0O0oOo() {
        return this.f14272o00oo0Oo;
    }

    @Override // o0OOo00O.o00oOoO
    /* renamed from: o0O0oOoO */
    public void o0O0oOo0(@NotNull oO0Ooooo oo0ooooo) {
        o0OooO0.o00oOOo0.o00oOOo0(this.f14272o00oo0Oo, null, 1, null);
    }

    @Override // o0OOo0O0.o0OooO0
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f14272o00oo0Oo.offer(e);
    }
}
