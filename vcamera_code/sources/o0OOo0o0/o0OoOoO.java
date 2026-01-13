package o0OOo0o0;

import androidx.concurrent.futures.o00oOo00;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.oo0oO0;
import o0OOO0.o00oOoO;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O00;
import o0OOo00O.o0O000Oo;
import o0OOo00O.o0O000o0;
import o0OOo00O.o0O0O0o0;
import o0OOo00O.o0O0OOO;
import o0OOo00O.o0O0o000;
import o0OOo00O.oO0O00;
import o0OOo00O.oO0O0O0o;
import o0OOo00O.oo0OOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010:\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u001e\u0010>\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0010\u0010<\u0012\u0004\b=\u0010\u000fR\u0014\u0010?\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010<R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010D\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lo0OOo0o0/o0OoOoO;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0OO0oO0;", "Lo0OOO0/o00oOoO;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lo0OO/o00oOo0O;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "o00oo0o0", "()Z", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "()V", "o00oo0oO", "Lo0OOo00O/o0O00;", "o00oo00O", "()Lo0OOo00O/o0O00;", "Lo0OOo00O/o0O000Oo;", "continuation", "", "o00ooO0", "(Lo0OOo00O/o0O000Oo;)Ljava/lang/Throwable;", "cause", "o00oo0o", "(Ljava/lang/Throwable;)Z", "", "o00oOoo0", "()Ljava/lang/Object;", "Lo0OO0o/oo0oO0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "onCancellation", "o0O0o", "(Ljava/lang/Object;Lo0OOOO/o00oo;)V", "takenState", "o00oOo00", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "o00oo", "(Ljava/lang/Object;)Z", "o00ooO00", "Lo0OO/o00oo0;", "context", "value", "o00oo0", "(Lo0OO/o00oo0;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lo0OOo00O/o0O0o000;", "Lo0OOo00O/o0O0o000;", "dispatcher", "Lo0OO/o00oOo0O;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "getContext", "()Lo0OO/o00oo0;", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "o00oOooO", "()Lo0OO/o00oOo0O;", "delegate", "o00oo0O", "reusableCancellableContinuation", "<init>", "(Lo0OOo00O/o0O0o000;Lo0OO/o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OoOoO<T> extends o0OOo00O.o0OO0oO0<T> implements o00oOoO, o00oOo0O<T> {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14636o00oo = AtomicReferenceFieldUpdater.newUpdater(o0OoOoO.class, Object.class, "_reusableCancellableContinuation");
    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o00oOo0O<T> f14637o00oo0o;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o0O0o000 f14638o00oo0o0;
    @o0OOOO0o.o00oOoO
    @Nullable

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Object f14639o00oo0oO;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Object f14640o0O0o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOoO(@NotNull o0O0o000 o0o0o000, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        super(-1);
        this.f14638o00oo0o0 = o0o0o000;
        this.f14637o00oo0o = o00ooo0o2;
        this.f14639o00oo0oO = o0OO00o.o00oOOo0();
        this.f14640o0O0o = ooOOOOoo.o00oOOoO(getContext());
        this._reusableCancellableContinuation = null;
    }

    public static /* synthetic */ void o00oo0Oo() {
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o00oOoO getCallerFrame() {
        o00oOo0O<T> o00ooo0o2 = this.f14637o00oo0o;
        if (o00ooo0o2 instanceof o00oOoO) {
            return (o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o00oo0 getContext() {
        return this.f14637o00oo0o.getContext();
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o0OOo00O.o0OO0oO0
    public void o00oOo00(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof o0O0O0o0) {
            ((o0O0O0o0) obj).f14009o00oOOoO.invoke(th);
        }
    }

    @Override // o0OOo00O.o0OO0oO0
    @Nullable
    public Object o00oOoo0() {
        Object obj = this.f14639o00oo0oO;
        this.f14639o00oo0oO = o0OO00o.o00oOOo0();
        return obj;
    }

    @Override // o0OOo00O.o0OO0oO0
    @NotNull
    public o00oOo0O<T> o00oOooO() {
        return this;
    }

    public final void o00oOooo() {
        do {
        } while (this._reusableCancellableContinuation == o0OO00o.f14580o00oOOoO);
    }

    public final boolean o00oo(@Nullable Object obj) {
        o0OOo00O.ooOOOOoo oooooooo = (o0OOo00O.ooOOOOoo) getContext().get(o0OOo00O.ooOOOOoo.f14136o00oOoO);
        if (oooooooo == null || oooooooo.isActive()) {
            return false;
        }
        CancellationException o00ooOoO2 = oooooooo.o00ooOoO();
        o00oOo00(obj, o00ooOoO2);
        oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
        resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(o00ooOoO2)));
        return true;
    }

    public final void o00oo0(@NotNull o00oo0 o00oo0Var, T t) {
        this.f14639o00oo0oO = t;
        this.f14039o00oo0Oo = 1;
        this.f14638o00oo0o0.o0O0oOo(o00oo0Var, this);
    }

    @Nullable
    public final o0O00<T> o00oo00O() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = o0OO00o.f14580o00oOOoO;
                return null;
            } else if (obj instanceof o0O00) {
                if (o00oOo00.o00oOOo0(f14636o00oo, this, obj, o0OO00o.f14580o00oOOoO)) {
                    return (o0O00) obj;
                }
            } else if (obj != o0OO00o.f14580o00oOOoO && !(obj instanceof Throwable)) {
                throw new IllegalStateException(o0O000o0.o00oOOo0("Inconsistent state ", obj));
            }
        }
    }

    public final o0O00<?> o00oo0O() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof o0O00) {
            return (o0O00) obj;
        }
        return null;
    }

    public final boolean o00oo0o(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            oO0o0o oo0o0o = o0OO00o.f14580o00oOOoO;
            if (o0ooO.o00oOoO0(obj, oo0o0o)) {
                if (o00oOo00.o00oOOo0(f14636o00oo, this, oo0o0o, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (o00oOo00.o00oOOo0(f14636o00oo, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final boolean o00oo0o0() {
        return this._reusableCancellableContinuation != null;
    }

    public final void o00oo0oO() {
        o00oOooo();
        o0O00<?> o00oo0O2 = o00oo0O();
        if (o00oo0O2 != null) {
            o00oo0O2.o00oo0o();
        }
    }

    @Nullable
    public final Throwable o00ooO0(@NotNull o0O000Oo<?> o0o000oo) {
        oO0o0o oo0o0o;
        do {
            Object obj = this._reusableCancellableContinuation;
            oo0o0o = o0OO00o.f14580o00oOOoO;
            if (obj != oo0o0o) {
                if (obj instanceof Throwable) {
                    if (o00oOo00.o00oOOo0(f14636o00oo, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(o0O000o0.o00oOOo0("Inconsistent state ", obj));
            }
        } while (!o00oOo00.o00oOOo0(f14636o00oo, this, oo0o0o, o0o000oo));
        return null;
    }

    public final void o00ooO00(@NotNull Object obj) {
        o00oOo0O<T> o00ooo0o2 = this.f14637o00oo0o;
        Object obj2 = this.f14640o0O0o;
        o00oo0 context = o00ooo0o2.getContext();
        Object o00oOo002 = ooOOOOoo.o00oOo00(context, obj2);
        oO0O0O0o<?> o00oOoO02 = o00oOo002 != ooOOOOoo.f14672o00oOOo0 ? oo0OOoo.o00oOoO0(o00ooo0o2, context, o00oOo002) : null;
        try {
            this.f14637o00oo0o.resumeWith(obj);
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        } finally {
            if (o00oOoO02 == null || o00oOoO02.o0O0oOoO()) {
                ooOOOOoo.o00oOOo0(context, o00oOo002);
            }
        }
    }

    public final void o0O0o(@NotNull Object obj, @Nullable o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        boolean z;
        Object o00oOOoO2 = o0O0OOO.o00oOOoO(obj, o00ooVar);
        if (this.f14638o00oo0o0.o0O0oOoO(getContext())) {
            this.f14639o00oo0oO = o00oOOoO2;
            this.f14039o00oo0Oo = 1;
            this.f14638o00oo0o0.oo0oOOo(getContext(), this);
            return;
        }
        o0OOo00O.o0OOo000 o00oOOoO3 = oO0O00.f14094o00oOOo0.o00oOOoO();
        if (o00oOOoO3.o0OO000()) {
            this.f14639o00oo0oO = o00oOOoO2;
            this.f14039o00oo0Oo = 1;
            o00oOOoO3.o0O0ooo0(this);
            return;
        }
        o00oOOoO3.o0O0oooO(true);
        try {
            o0OOo00O.ooOOOOoo oooooooo = (o0OOo00O.ooOOOOoo) getContext().get(o0OOo00O.ooOOOOoo.f14136o00oOoO);
            if (oooooooo == null || oooooooo.isActive()) {
                z = false;
            } else {
                CancellationException o00ooOoO2 = oooooooo.o00ooOoO();
                o00oOo00(o00oOOoO2, o00ooOoO2);
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(o00ooOoO2)));
                z = true;
            }
            if (!z) {
                o00oOo0O<T> o00ooo0o2 = this.f14637o00oo0o;
                Object obj2 = this.f14640o0O0o;
                o00oo0 context = o00ooo0o2.getContext();
                Object o00oOo002 = ooOOOOoo.o00oOo00(context, obj2);
                oO0O0O0o<?> o00oOoO02 = o00oOo002 != ooOOOOoo.f14672o00oOOo0 ? oo0OOoo.o00oOoO0(o00ooo0o2, context, o00oOo002) : null;
                this.f14637o00oo0o.resumeWith(obj);
                o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                if (o00oOoO02 == null || o00oOoO02.o0O0oOoO()) {
                    ooOOOOoo.o00oOOo0(context, o00oOo002);
                }
            }
            do {
            } while (o00oOOoO3.oo0ooO());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        o00oo0 context = this.f14637o00oo0o.getContext();
        Object o00oOooO2 = o0O0OOO.o00oOooO(obj, null, 1, null);
        if (this.f14638o00oo0o0.o0O0oOoO(context)) {
            this.f14639o00oo0oO = o00oOooO2;
            this.f14039o00oo0Oo = 0;
            this.f14638o00oo0o0.oo0oOOo(context, this);
            return;
        }
        o0OOo00O.o0OOo000 o00oOOoO2 = oO0O00.f14094o00oOOo0.o00oOOoO();
        if (o00oOOoO2.o0OO000()) {
            this.f14639o00oo0oO = o00oOooO2;
            this.f14039o00oo0Oo = 0;
            o00oOOoO2.o0O0ooo0(this);
            return;
        }
        o00oOOoO2.o0O0oooO(true);
        try {
            o00oo0 context2 = getContext();
            Object o00oOo002 = ooOOOOoo.o00oOo00(context2, this.f14640o0O0o);
            this.f14637o00oo0o.resumeWith(obj);
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
            ooOOOOoo.o00oOOo0(context2, o00oOo002);
            do {
            } while (o00oOOoO2.oo0ooO());
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("DispatchedContinuation[");
        o00oOOo02.append(this.f14638o00oo0o0);
        o00oOOo02.append(", ");
        o00oOOo02.append(o0OOo00O.oo0ooO.o00oOo00(this.f14637o00oo0o));
        o00oOOo02.append(']');
        return o00oOOo02.toString();
    }
}
