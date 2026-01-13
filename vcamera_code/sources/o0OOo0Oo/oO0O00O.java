package o0OOo0Oo;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OOO0.o00oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lo0OOo0Oo/oO0O00O;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO/o00oOo0O;", "Lo0OOO0/o00oOoO;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lo0OO0o/oo0oO0;", "result", "Lo0OO0o/oO0Ooooo;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "o00oo0O0", "Lo0OO/o00oOo0O;", "uCont", "Lo0OO/o00oo0;", "o00oo0O", "Lo0OO/o00oo0;", "getContext", "()Lo0OO/o00oo0;", "context", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "<init>", "(Lo0OO/o00oOo0O;Lo0OO/o00oo0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O00O<T> implements o00oOo0O<T>, o00oOoO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0 f14538o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOo0O<T> f14539o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public oO0O00O(@NotNull o00oOo0O<? super T> o00ooo0o2, @NotNull o00oo0 o00oo0Var) {
        this.f14539o00oo0O0 = o00ooo0o2;
        this.f14538o00oo0O = o00oo0Var;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o00oOoO getCallerFrame() {
        o00oOo0O<T> o00ooo0o2 = this.f14539o00oo0O0;
        if (o00ooo0o2 instanceof o00oOoO) {
            return (o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o00oo0 getContext() {
        return this.f14538o00oo0O;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        this.f14539o00oo0O0.resumeWith(obj);
    }
}
