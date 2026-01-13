package o0OOo00o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O000Oo;
import o0OOo00O.o0OO0;
import o0OOo00O.o0OOO00;
import o0OOo00O.o0OOO0OO;
import o0OOo00O.oO00O0o0;
import o0OOo00O.oO00OO;
import o0OOo00O.oO00OOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lo0OOo00o/ooo0o;", "Lo0OOo00o/oO0O;", "Lo0OOo00O/o0OO0;", "Lo0OO/o00oo0;", "context", "", "o0O0oOoO", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo0OO0o/oO0Ooooo;", "oo0oOOo", "", "timeMillis", "Lo0OOo00O/o0O000Oo;", "continuation", "o00oOo0O", "Lo0OOo00O/o0OOO0OO;", "o0O000O", "", "toString", "", "other", "equals", "", "hashCode", "o0O0oooO", "Landroid/os/Handler;", "o00oo0Oo", "Landroid/os/Handler;", "handler", "o00oo0o0", "Ljava/lang/String;", "name", "o00oo0o", "Z", "invokeImmediately", "_immediate", "Lo0OOo00o/ooo0o;", "o00oo0oO", "o0O0oooo", "()Lo0OOo00o/ooo0o;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ooo0o extends oO0O implements o0OO0 {
    @Nullable
    private volatile ooo0o _immediate;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Handler f14154o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final boolean f14155o00oo0o;
    @Nullable

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final String f14156o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final ooo0o f14157o00oo0oO;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "o0OOo00O/oO00o0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ ooo0o f14158o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O000Oo f14159o00oo0O0;

        public o00oOOo0(o0O000Oo o0o000oo, ooo0o ooo0oVar) {
            this.f14159o00oo0O0 = o0o000oo;
            this.f14158o00oo0O = ooo0oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14159o00oo0O0.o00oo0O0(this.f14158o00oo0O, oO0Ooooo.f13240o00oOOo0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o00oo<Throwable, oO0Ooooo> {
        public final /* synthetic */ Runnable $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(Runnable runnable) {
            super(1);
            this.$block = runnable;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            invoke2(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            ooo0o.this.f14154o00oo0Oo.removeCallbacks(this.$block);
        }
    }

    public ooo0o(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    public ooo0o(Handler handler, String str, int i, o0O00 o0o00) {
        this(handler, (i & 2) != 0 ? null : str, false);
    }

    public static final void o0O(ooo0o ooo0oVar, Runnable runnable) {
        ooo0oVar.f14154o00oo0Oo.removeCallbacks(runnable);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ooo0o) && ((ooo0o) obj).f14154o00oo0Oo == this.f14154o00oo0Oo;
    }

    public int hashCode() {
        return System.identityHashCode(this.f14154o00oo0Oo);
    }

    @Override // o0OOo00O.o0OO0
    public void o00oOo0O(long j, @NotNull o0O000Oo<? super oO0Ooooo> o0o000oo) {
        o00oOOo0 o00oooo02 = new o00oOOo0(o0o000oo, this);
        Handler handler = this.f14154o00oo0Oo;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(o00oooo02, j)) {
            o0o000oo.o00ooOoo(new o00oOOoO(o00oooo02));
        } else {
            o0O0oooO(o0o000oo.getContext(), o00oooo02);
        }
    }

    @Override // o0OOo00o.oO0O, o0OOo00O.o0OO0
    @NotNull
    public o0OOO0OO o0O000O(long j, @NotNull final Runnable runnable, @NotNull o00oo0 o00oo0Var) {
        Handler handler = this.f14154o00oo0Oo;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new o0OOO0OO() { // from class: o0OOo00o.ooOOO00O
                @Override // o0OOo00O.o0OOO0OO
                public final void o00oOOoO() {
                    ooo0o.o0O(ooo0o.this, runnable);
                }
            };
        }
        o0O0oooO(o00oo0Var, runnable);
        return oO00OOo0.f14087o00oo0O0;
    }

    @Override // o0OOo00O.o0O0o000
    public boolean o0O0oOoO(@NotNull o00oo0 o00oo0Var) {
        return (this.f14155o00oo0o && o0ooO.o00oOoO0(Looper.myLooper(), this.f14154o00oo0Oo.getLooper())) ? false : true;
    }

    @Override // o0OOo00O.oO00OO
    public oO00OO o0O0oo() {
        return this.f14157o00oo0oO;
    }

    @Override // o0OOo00o.oO0O
    public oO0O o0O0ooOO() {
        return this.f14157o00oo0oO;
    }

    public final void o0O0oooO(o00oo0 o00oo0Var, Runnable runnable) {
        oO00O0o0.o00oOo0o(o00oo0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0OOO00.o00oOo00().oo0oOOo(o00oo0Var, runnable);
    }

    @NotNull
    public ooo0o o0O0oooo() {
        return this.f14157o00oo0oO;
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        if (this.f14154o00oo0Oo.post(runnable)) {
            return;
        }
        o0O0oooO(o00oo0Var, runnable);
    }

    @Override // o0OOo00O.oO00OO, o0OOo00O.o0O0o000
    @NotNull
    public String toString() {
        String o0O0ooO02 = o0O0ooO0();
        if (o0O0ooO02 == null) {
            String str = this.f14156o00oo0o0;
            if (str == null) {
                str = this.f14154o00oo0Oo.toString();
            }
            return this.f14155o00oo0o ? o00oOoOo.o00oo.o00oOOo0(str, ".immediate") : str;
        }
        return o0O0ooO02;
    }

    public ooo0o(Handler handler, String str, boolean z) {
        this.f14154o00oo0Oo = handler;
        this.f14156o00oo0o0 = str;
        this.f14155o00oo0o = z;
        this._immediate = z ? this : null;
        ooo0o ooo0oVar = this._immediate;
        if (ooo0oVar == null) {
            ooo0oVar = new ooo0o(handler, str, true);
            this._immediate = ooo0oVar;
        }
        this.f14157o00oo0oO = ooo0oVar;
    }
}
