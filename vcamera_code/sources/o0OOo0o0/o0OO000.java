package o0OOo0o0;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000H\u0000\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0080\b\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\"\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015*\f\b\u0000\u0010\u0017\"\u00020\u00052\u00020\u0005¨\u0006\u0018"}, d2 = {"E", "", "Lkotlinx/coroutines/internal/SubscribersList;", "o00oOooO", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "o00oOo0O", "(Ljava/util/concurrent/locks/ReentrantLock;Lo0OOOO/o00oOOo0;)Ljava/lang/Object;", "", "expectedSize", "", o00oOOoO.f12961o00oOo00, "Ljava/util/concurrent/Executor;", "executor", "", "o00oOo00", "Ljava/lang/reflect/Method;", "o00oOOo0", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO000 {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Method f14575o00oOOo0;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f14575o00oOOo0 = method;
    }

    public static /* synthetic */ void o00oOOo0() {
    }

    @NotNull
    public static final <E> Set<E> o00oOOoO(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    public static final boolean o00oOo00(@NotNull Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f14575o00oOOo0) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T o00oOo0O(@NotNull ReentrantLock reentrantLock, @NotNull o00oOOo0<? extends T> o00oooo02) {
        reentrantLock.lock();
        try {
            return o00oooo02.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public static final <E> List<E> o00oOooO() {
        return new CopyOnWriteArrayList();
    }
}
