package o0OOo0O;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import o0OO0o.o0O;
import o0OOo00O.o0oOo0O0;
import o0OOo00O.oooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lo0OOo0O/o00ooO;", "Ljava/io/Serializable;", "", "coroutineId", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "name", "getName", "state", "getState", "lastObservedThreadState", "getLastObservedThreadState", "lastObservedThreadName", "getLastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "sequenceNumber", "J", "getSequenceNumber", "()J", "Lo0OOo0O/o00oo0O0;", FirebaseAnalytics.Param.SOURCE, "Lo0OO/o00oo0;", "context", "<init>", "(Lo0OOo0O/o00oo0O0;Lo0OO/o00oo0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00ooO implements Serializable {
    @Nullable
    private final Long coroutineId;
    @Nullable
    private final String dispatcher;
    @NotNull
    private final List<StackTraceElement> lastObservedStackTrace;
    @Nullable
    private final String lastObservedThreadName;
    @Nullable
    private final String lastObservedThreadState;
    @Nullable
    private final String name;
    private final long sequenceNumber;
    @NotNull
    private final String state;

    public o00ooO(@NotNull o00oo0O0 o00oo0o02, @NotNull o0OO.o00oo0 o00oo0Var) {
        Thread.State state;
        o0oOo0O0 o0ooo0o0 = (o0oOo0O0) o00oo0Var.get(o0oOo0O0.f14060o00oo0Oo);
        this.coroutineId = o0ooo0o0 != null ? Long.valueOf(o0ooo0o0.f14061o00oo0O) : null;
        o0OO.o00oOoO o00oooo2 = (o0OO.o00oOoO) o00oo0Var.get(o0OO.o00oOoO.f12926o00oOo0o);
        this.dispatcher = o00oooo2 != null ? o00oooo2.toString() : null;
        oooOO0 ooooo0 = (oooOO0) o00oo0Var.get(oooOO0.f14146o00oo0Oo);
        this.name = ooooo0 != null ? ooooo0.f14147o00oo0O : null;
        this.state = o00oo0o02.f14194o00oOooO;
        Thread thread = o00oo0o02.f14192o00oOo0O;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = o00oo0o02.f14192o00oOo0O;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = o00oo0o02.o00oOoO();
        this.sequenceNumber = o00oo0o02.f14190o00oOOoO;
    }

    @Nullable
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @Nullable
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    @Nullable
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @Nullable
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }
}
