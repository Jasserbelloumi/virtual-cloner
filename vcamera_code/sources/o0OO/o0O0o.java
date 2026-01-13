package o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o0OO0o.o0O;
import o0OO0o.o0OO00o0;
import o0OO0o.oo0oO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o0O0o<T> implements o00oOo0O<T>, o0OOO0.o00oOoO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o00oOOo0 f12930o00oo0O = new o00oOOo0(null);

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<o0O0o<?>, Object> f12931o00oo0Oo = AtomicReferenceFieldUpdater.newUpdater(o0O0o.class, Object.class, "result");
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O<T> f12932o00oo0O0;
    @Nullable
    private volatile Object result;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        public static /* synthetic */ void o00oOOo0() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0O
    public o0O0o(@NotNull o00oOo0O<? super T> o00ooo0o2) {
        this(o00ooo0o2, o0OOO00o.o00oOOo0.UNDECIDED);
        o0ooO.o00oo0O0(o00ooo0o2, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o(@NotNull o00oOo0O<? super T> o00ooo0o2, @Nullable Object obj) {
        o0ooO.o00oo0O0(o00ooo0o2, "delegate");
        this.f12932o00oo0O0 = o00ooo0o2;
        this.result = obj;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o0OOO0.o00oOoO getCallerFrame() {
        o00oOo0O<T> o00ooo0o2 = this.f12932o00oo0O0;
        if (o00ooo0o2 instanceof o0OOO0.o00oOoO) {
            return (o0OOO0.o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o00oo0 getContext() {
        return this.f12932o00oo0O0.getContext();
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @o0O
    @Nullable
    public final Object o00oOOoO() {
        Object obj = this.result;
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.UNDECIDED;
        if (obj == o00oooo02) {
            AtomicReferenceFieldUpdater<o0O0o<?>, Object> atomicReferenceFieldUpdater = f12931o00oo0Oo;
            o0OOO00o.o00oOOo0 o00oooo03 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, o00oooo02, o00oooo03)) {
                return o00oooo03;
            }
            obj = this.result;
        }
        if (obj == o0OOO00o.o00oOOo0.RESUMED) {
            return o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        }
        if (obj instanceof oo0oO0.o00oOOoO) {
            throw ((oo0oO0.o00oOOoO) obj).exception;
        }
        return obj;
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.UNDECIDED;
            if (obj2 != o00oooo02) {
                o0OOO00o.o00oOOo0 o00oooo03 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (obj2 != o00oooo03) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f12931o00oo0Oo, this, o00oooo03, o0OOO00o.o00oOOo0.RESUMED)) {
                    this.f12932o00oo0O0.resumeWith(obj);
                    return;
                }
            } else if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f12931o00oo0Oo, this, o00oooo02, obj)) {
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SafeContinuation for ");
        o00oOOo02.append(this.f12932o00oo0O0);
        return o00oOOo02.toString();
    }
}
