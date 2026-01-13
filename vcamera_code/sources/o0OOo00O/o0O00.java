package o0OOo00O;

import androidx.concurrent.futures.o00oOo00;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OOOO.o00oOOo0;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0O
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010X\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bZ\u0010\u001fJ#\u0010[\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010TJ\u001b\u0010e\u001a\u00020\u000e*\u00020d2\u0006\u0010U\u001a\u00028\u0000H\u0016¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020\u000e*\u00020d2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020mH\u0014¢\u0006\u0004\bp\u0010oR \u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010|\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010{R\u0014\u0010~\u001a\u00020m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010oR\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010BR\u0016\u0010\u0080\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0082\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0086\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lo0OOo00O/o0O00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0OO0oO0;", "Lo0OOo00O/o0O000Oo;", "Lo0OOO0/o00oOoO;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "o00ooO", "()Z", "", "cause", "o00oo0o0", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lo0OO0o/oO0Ooooo;", "block", "o00oo0O", "(Lo0OOOO/o00oOOo0;)V", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "o00oo00O", "(Lo0OOOO/o00oo;Ljava/lang/Throwable;)V", "o00ooooO", "o00oooo0", "Lo0OOo00O/o0OOO0OO;", "o00ooO0o", "()Lo0OOo00O/o0OOO0OO;", "o00ooOoO", "()V", "", "state", "o00ooOOo", "(Lo0OOOO/o00oo;Ljava/lang/Object;)V", "Lo0OOo00O/o0O000O;", "o00ooOO0", "(Lo0OOOO/o00oo;)Lo0OOo00O/o0O000O;", "", "mode", "o0O0o", "(I)V", "Lo0OOo00O/oO00Oo00;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "o00oooOo", "(Lo0OOo00O/oO00Oo00;Ljava/lang/Object;ILo0OOOO/o00oo;Ljava/lang/Object;)Ljava/lang/Object;", "o00ooo0o", "(Ljava/lang/Object;ILo0OOOO/o00oo;)V", "Lo0OOo0o0/oO0o0o;", "o00oooo", "(Ljava/lang/Object;Ljava/lang/Object;Lo0OOOO/o00oo;)Lo0OOo0o0/oO0o0o;", "", "o00oOooo", "(Ljava/lang/Object;)Ljava/lang/Void;", "o00oo0oO", "o00ooo00", "o00ooo0", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "o00oOoo0", "()Ljava/lang/Object;", "takenState", "o00oOo00", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "o00oOOo0", "o00ooOo", "(Ljava/lang/Throwable;)V", "o00oo0", "(Lo0OOo00O/o0O000O;Ljava/lang/Throwable;)V", "o00oo0Oo", "Lo0OOo00O/ooOOOOoo;", "parent", "o00oo", "(Lo0OOo00O/ooOOOOoo;)Ljava/lang/Throwable;", "o00ooO00", "Lo0OO0o/oo0oO0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "o00ooOO", "(Ljava/lang/Object;Lo0OOOO/o00oo;)V", "o00ooOoo", "(Lo0OOOO/o00oo;)V", "o00oo0o", "o00oOoOO", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "o00oOoOo", "(Ljava/lang/Object;Ljava/lang/Object;Lo0OOOO/o00oo;)Ljava/lang/Object;", "exception", "o00oo0OO", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "o00oooOO", "Lo0OOo00O/o0O0o000;", "o00oo0O0", "(Lo0OOo00O/o0O0o000;Ljava/lang/Object;)V", "o00ooo0O", "(Lo0OOo00O/o0O0o000;Ljava/lang/Throwable;)V", "o00oOo0o", "(Ljava/lang/Object;)Ljava/lang/Object;", "o00oOo0O", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "o00ooOo0", "Lo0OO/o00oOo0O;", "Lo0OO/o00oOo0O;", "o00oOooO", "()Lo0OO/o00oOo0O;", "delegate", "Lo0OO/o00oo0;", "Lo0OO/o00oo0;", "getContext", "()Lo0OO/o00oo0;", "context", "Lo0OOo00O/o0OOO0OO;", "parentHandle", "o00ooO0O", "stateDebugRepresentation", "o00ooO0", "isActive", "o00oOoO0", "isCompleted", "isCancelled", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "<init>", "(Lo0OO/o00oOo0O;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0O00<T> extends o0OO0oO0<T> implements o0O000Oo<T>, o0OOO0.o00oOoO {
    @NotNull
    private volatile /* synthetic */ int _decision;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0OO.o00oo0 f13991o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o00oOo0O<T> f13992o00oo0o0;
    @Nullable

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o0OOO0OO f13993o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13990o0O0o = AtomicIntegerFieldUpdater.newUpdater(o0O00.class, "_decision");

    /* renamed from: o00oo  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13989o00oo = AtomicReferenceFieldUpdater.newUpdater(o0O00.class, Object.class, "_state");

    /* JADX WARN: Multi-variable type inference failed */
    public o0O00(@NotNull o00oOo0O<? super T> o00ooo0o2, int i) {
        super(i);
        this.f13992o00oo0o0 = o00ooo0o2;
        this.f13991o00oo0o = o00ooo0o2.getContext();
        this._decision = 0;
        this._state = o00oo0OO.f13987o00oo0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o00oooO(o0O00 o0o00, Object obj, int i, o0OOOO.o00oo o00ooVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            o00ooVar = null;
        }
        o0o00.o00ooo0o(obj, i, o00ooVar);
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public o0OOO0.o00oOoO getCallerFrame() {
        o00oOo0O<T> o00ooo0o2 = this.f13992o00oo0o0;
        if (o00ooo0o2 instanceof o0OOO0.o00oOoO) {
            return (o0OOO0.o00oOoO) o00ooo0o2;
        }
        return null;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o0OO.o00oo0 getContext() {
        return this.f13991o00oo0o;
    }

    @Override // o0OOO0.o00oOoO
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o0OOo00O.o0O000Oo
    public boolean isActive() {
        return o00ooO0() instanceof oO00Oo00;
    }

    @Override // o0OOo00O.o0O000Oo
    public boolean isCancelled() {
        return o00ooO0() instanceof o0O00O0o;
    }

    @Override // o0OOo00O.o0O000Oo
    public boolean o00oOOo0(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof oO00Oo00)) {
                return false;
            }
            z = obj instanceof o0O000O;
        } while (!o00oOo00.o00oOOo0(f13989o00oo, this, obj, new o0O00O0o(this, th, z)));
        o0O000O o0o000o = z ? (o0O000O) obj : null;
        if (o0o000o != null) {
            o00oo0(o0o000o, th);
        }
        o00oo0oO();
        o0O0o(this.f14039o00oo0Oo);
        return true;
    }

    @Override // o0OOo00O.o0OO0oO0
    public void o00oOo00(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof oO00Oo00) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof o0O0O0Oo) {
                return;
            }
            if (obj2 instanceof o0O0oo0o) {
                o0O0oo0o o0o0oo0o = (o0O0oo0o) obj2;
                if (!(!o0o0oo0o.o00oOoO())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (o00oOo00.o00oOOo0(f13989o00oo, this, obj2, o0O0oo0o.o00oOoO0(o0o0oo0o, null, null, null, null, th, 15, null))) {
                    o0o0oo0o.o00oOoOO(this, th);
                    return;
                }
            } else if (o00oOo00.o00oOOo0(f13989o00oo, this, obj2, new o0O0oo0o(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // o0OOo00O.o0OO0oO0
    @Nullable
    public Throwable o00oOo0O(@Nullable Object obj) {
        Throwable o00oOo0O2 = super.o00oOo0O(obj);
        if (o00oOo0O2 != null) {
            return o00oOo0O2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OOo00O.o0OO0oO0
    public <T> T o00oOo0o(@Nullable Object obj) {
        return obj instanceof o0O0oo0o ? (T) ((o0O0oo0o) obj).f14015o00oOOo0 : obj;
    }

    @Override // o0OOo00O.o0O000Oo
    public boolean o00oOoO0() {
        return !(o00ooO0() instanceof oO00Oo00);
    }

    @Override // o0OOo00O.o0O000Oo
    @Nullable
    public Object o00oOoOO(T t, @Nullable Object obj) {
        return o00oooo(t, obj, null);
    }

    @Override // o0OOo00O.o0O000Oo
    @Nullable
    public Object o00oOoOo(T t, @Nullable Object obj, @Nullable o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        return o00oooo(t, obj, o00ooVar);
    }

    @Override // o0OOo00O.o0OO0oO0
    @Nullable
    public Object o00oOoo0() {
        return o00ooO0();
    }

    @Override // o0OOo00O.o0OO0oO0
    @NotNull
    public final o00oOo0O<T> o00oOooO() {
        return this.f13992o00oo0o0;
    }

    public final Void o00oOooo(Object obj) {
        throw new IllegalStateException(o0O000o0.o00oOOo0("Already resumed, but proposed with update ", obj));
    }

    @NotNull
    public Throwable o00oo(@NotNull ooOOOOoo oooooooo) {
        return oooooooo.o00ooOoO();
    }

    public final void o00oo0(@NotNull o0O000O o0o000o, @Nullable Throwable th) {
        try {
            o0o000o.o00oOOo0(th);
        } catch (Throwable th2) {
            o0OO.o00oo0 context = getContext();
            o0O0o0.o00oOOoO(context, new o0O0OO0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o00oo00O(o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar, Throwable th) {
        try {
            o00ooVar.invoke(th);
        } catch (Throwable th2) {
            o0OO.o00oo0 context = getContext();
            o0O0o0.o00oOOoO(context, new o0O0OO0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o00oo0O(o00oOOo0<o0OO0o.oO0Ooooo> o00oooo02) {
        try {
            o00oooo02.invoke();
        } catch (Throwable th) {
            o0OO.o00oo0 context = getContext();
            o0O0o0.o00oOOoO(context, new o0O0OO0("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00oo0O0(@NotNull o0O0o000 o0o0o000, T t) {
        o00oOo0O<T> o00ooo0o2 = this.f13992o00oo0o0;
        o0OOo0o0.o0OoOoO o0ooooo = o00ooo0o2 instanceof o0OOo0o0.o0OoOoO ? (o0OOo0o0.o0OoOoO) o00ooo0o2 : null;
        o00oooO(this, t, (o0ooooo != null ? o0ooooo.f14638o00oo0o0 : null) == o0o0o000 ? 4 : this.f14039o00oo0Oo, null, 4, null);
    }

    @Override // o0OOo00O.o0O000Oo
    @Nullable
    public Object o00oo0OO(@NotNull Throwable th) {
        return o00oooo(new o0O0O0Oo(th, false, 2, null), null, null);
    }

    public final void o00oo0Oo(@NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar, @NotNull Throwable th) {
        try {
            o00ooVar.invoke(th);
        } catch (Throwable th2) {
            o0OO.o00oo0 context = getContext();
            o0O0o0.o00oOOoO(context, new o0O0OO0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void o00oo0o() {
        o0OOO0OO o0ooo0oo = this.f13993o00oo0oO;
        if (o0ooo0oo == null) {
            return;
        }
        o0ooo0oo.o00oOOoO();
        this.f13993o00oo0oO = oO00OOo0.f14087o00oo0O0;
    }

    public final boolean o00oo0o0(Throwable th) {
        if (o00ooO()) {
            return ((o0OOo0o0.o0OoOoO) this.f13992o00oo0o0).o00oo0o(th);
        }
        return false;
    }

    public final void o00oo0oO() {
        if (o00ooO()) {
            return;
        }
        o00oo0o();
    }

    public final boolean o00ooO() {
        return o0OO0oO.o00oOooO(this.f14039o00oo0Oo) && ((o0OOo0o0.o0OoOoO) this.f13992o00oo0o0).o00oo0o0();
    }

    @Nullable
    public final Object o00ooO0() {
        return this._state;
    }

    @o0OO0o.o0O
    @Nullable
    public final Object o00ooO00() {
        ooOOOOoo oooooooo;
        boolean o00ooO2 = o00ooO();
        if (o00ooooO()) {
            if (this.f13993o00oo0oO == null) {
                o00ooO0o();
            }
            if (o00ooO2) {
                o00ooOoO();
            }
            return o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        }
        if (o00ooO2) {
            o00ooOoO();
        }
        Object o00ooO02 = o00ooO0();
        if (o00ooO02 instanceof o0O0O0Oo) {
            throw ((o0O0O0Oo) o00ooO02).f14007o00oOOo0;
        }
        if (!o0OO0oO.o00oOo00(this.f14039o00oo0Oo) || (oooooooo = (ooOOOOoo) getContext().get(ooOOOOoo.f14136o00oOoO)) == null || oooooooo.isActive()) {
            return o00oOo0o(o00ooO02);
        }
        CancellationException o00ooOoO2 = oooooooo.o00ooOoO();
        o00oOo00(o00ooO02, o00ooOoO2);
        throw o00ooOoO2;
    }

    public final String o00ooO0O() {
        Object o00ooO02 = o00ooO0();
        return o00ooO02 instanceof oO00Oo00 ? "Active" : o00ooO02 instanceof o0O00O0o ? "Cancelled" : "Completed";
    }

    public final o0OOO0OO o00ooO0o() {
        ooOOOOoo oooooooo = (ooOOOOoo) getContext().get(ooOOOOoo.f14136o00oOoO);
        if (oooooooo == null) {
            return null;
        }
        o0OOO0OO o00oOo0o2 = ooOOOOoo.o00oOOo0.o00oOo0o(oooooooo, true, false, new o0O00O(this), 2, null);
        this.f13993o00oo0oO = o00oOo0o2;
        return o00oOo0o2;
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00ooOO(T t, @Nullable o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        o00ooo0o(t, this.f14039o00oo0Oo, o00ooVar);
    }

    public final o0O000O o00ooOO0(o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        return o00ooVar instanceof o0O000O ? (o0O000O) o00ooVar : new oO0OoOO0(o00ooVar);
    }

    public final void o00ooOOo(o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + o00ooVar + ", already has " + obj).toString());
    }

    public final void o00ooOo(@NotNull Throwable th) {
        if (o00oo0o0(th)) {
            return;
        }
        o00oOOo0(th);
        o00oo0oO();
    }

    @NotNull
    public String o00ooOo0() {
        return "CancellableContinuation";
    }

    public final void o00ooOoO() {
        Throwable o00ooO02;
        o00oOo0O<T> o00ooo0o2 = this.f13992o00oo0o0;
        o0OOo0o0.o0OoOoO o0ooooo = o00ooo0o2 instanceof o0OOo0o0.o0OoOoO ? (o0OOo0o0.o0OoOoO) o00ooo0o2 : null;
        if (o0ooooo == null || (o00ooO02 = o0ooooo.o00ooO0(this)) == null) {
            return;
        }
        o00oo0o();
        o00oOOo0(o00ooO02);
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00ooOoo(@NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        o0O000O o00ooOO02 = o00ooOO0(o00ooVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof o00oo0OO) {
                if (o00oOo00.o00oOOo0(f13989o00oo, this, obj, o00ooOO02)) {
                    return;
                }
            } else if (obj instanceof o0O000O) {
                o00ooOOo(o00ooVar, obj);
            } else {
                boolean z = obj instanceof o0O0O0Oo;
                if (z) {
                    o0O0O0Oo o0o0o0oo = (o0O0O0Oo) obj;
                    if (!o0o0o0oo.o00oOOoO()) {
                        o00ooOOo(o00ooVar, obj);
                    }
                    if (obj instanceof o0O00O0o) {
                        if (!z) {
                            o0o0o0oo = null;
                        }
                        o00oo00O(o00ooVar, o0o0o0oo != null ? o0o0o0oo.f14007o00oOOo0 : null);
                        return;
                    }
                    return;
                } else if (obj instanceof o0O0oo0o) {
                    o0O0oo0o o0o0oo0o = (o0O0oo0o) obj;
                    if (o0o0oo0o.f14016o00oOOoO != null) {
                        o00ooOOo(o00ooVar, obj);
                    }
                    if (o00ooOO02 instanceof o0O0o) {
                        return;
                    }
                    if (o0o0oo0o.o00oOoO()) {
                        o00oo00O(o00ooVar, o0o0oo0o.f14018o00oOo0O);
                        return;
                    } else {
                        if (o00oOo00.o00oOOo0(f13989o00oo, this, obj, o0O0oo0o.o00oOoO0(o0o0oo0o, null, o00ooOO02, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (o00ooOO02 instanceof o0O0o) {
                    return;
                } else {
                    if (o00oOo00.o00oOOo0(f13989o00oo, this, obj, new o0O0oo0o(obj, o00ooOO02, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @o0OOOO0o.o00oo0OO(name = "resetStateReusable")
    public final boolean o00ooo0() {
        Object obj = this._state;
        if ((obj instanceof o0O0oo0o) && ((o0O0oo0o) obj).f14019o00oOooO != null) {
            o00oo0o();
            return false;
        }
        this._decision = 0;
        this._state = o00oo0OO.f13987o00oo0O0;
        return true;
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00ooo00() {
        o0OOO0OO o00ooO0o2 = o00ooO0o();
        if (o00ooO0o2 != null && o00oOoO0()) {
            o00ooO0o2.o00oOOoO();
            this.f13993o00oo0oO = oO00OOo0.f14087o00oo0O0;
        }
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00ooo0O(@NotNull o0O0o000 o0o0o000, @NotNull Throwable th) {
        o00oOo0O<T> o00ooo0o2 = this.f13992o00oo0o0;
        o0OOo0o0.o0OoOoO o0ooooo = o00ooo0o2 instanceof o0OOo0o0.o0OoOoO ? (o0OOo0o0.o0OoOoO) o00ooo0o2 : null;
        o00oooO(this, new o0O0O0Oo(th, false, 2, null), (o0ooooo != null ? o0ooooo.f14638o00oo0o0 : null) == o0o0o000 ? 4 : this.f14039o00oo0Oo, null, 4, null);
    }

    public final void o00ooo0o(Object obj, int i, o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof oO00Oo00)) {
                if (obj2 instanceof o0O00O0o) {
                    o0O00O0o o0o00o0o = (o0O00O0o) obj2;
                    if (o0o00o0o.o00oOo00()) {
                        if (o00ooVar != null) {
                            o00oo0Oo(o00ooVar, o0o00o0o.f14007o00oOOo0);
                            return;
                        }
                        return;
                    }
                }
                o00oOooo(obj);
                throw new o0OO0o.o0OoO00O();
            }
        } while (!o00oOo00.o00oOOo0(f13989o00oo, this, obj2, o00oooOo((oO00Oo00) obj2, obj, i, o00ooVar, null)));
        o00oo0oO();
        o0O0o(i);
    }

    @Override // o0OOo00O.o0O000Oo
    public void o00oooOO(@NotNull Object obj) {
        o0O0o(this.f14039o00oo0Oo);
    }

    public final Object o00oooOo(oO00Oo00 oo00oo00, Object obj, int i, o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar, Object obj2) {
        if (obj instanceof o0O0O0Oo) {
            return obj;
        }
        if (o0OO0oO.o00oOo00(i) || obj2 != null) {
            if (o00ooVar != null || (((oo00oo00 instanceof o0O000O) && !(oo00oo00 instanceof o0O0o)) || obj2 != null)) {
                return new o0O0oo0o(obj, oo00oo00 instanceof o0O000O ? (o0O000O) oo00oo00 : null, o00ooVar, obj2, null, 16, null);
            }
            return obj;
        }
        return obj;
    }

    public final o0OOo0o0.oO0o0o o00oooo(Object obj, Object obj2, o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof oO00Oo00)) {
                if ((obj3 instanceof o0O0oo0o) && obj2 != null && ((o0O0oo0o) obj3).f14019o00oOooO == obj2) {
                    return o0O00O0.f14003o00oOooO;
                }
                return null;
            }
        } while (!o00oOo00.o00oOOo0(f13989o00oo, this, obj3, o00oooOo((oO00Oo00) obj3, obj, this.f14039o00oo0Oo, o00ooVar, obj2)));
        o00oo0oO();
        return o0O00O0.f14003o00oOooO;
    }

    public final boolean o00oooo0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f13990o0O0o.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean o00ooooO() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f13990o0O0o.compareAndSet(this, 0, 1));
        return true;
    }

    public final void o0O0o(int i) {
        if (o00oooo0()) {
            return;
        }
        o0OO0oO.o00oOOo0(this, i);
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        o00oooO(this, o0O0OOO.o00oOo00(obj, this), this.f14039o00oo0Oo, null, 4, null);
    }

    @NotNull
    public String toString() {
        return o00ooOo0() + '(' + oo0ooO.o00oOo00(this.f13992o00oo0o0) + "){" + o00ooO0O() + "}@" + oo0ooO.o00oOOoO(this);
    }
}
