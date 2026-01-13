package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes2.dex */
public final class ExecutionList {
    private static final Logger log = Logger.getLogger(ExecutionList.class.getName());
    @GuardedBy("this")
    private boolean executed;
    @CheckForNull
    @GuardedBy("this")
    private RunnableExecutorPair runnables;

    /* loaded from: classes2.dex */
    public static final class RunnableExecutorPair {
        public final Executor executor;
        @CheckForNull
        public RunnableExecutorPair next;
        public final Runnable runnable;

        public RunnableExecutorPair(Runnable runnable, Executor executor, @CheckForNull RunnableExecutorPair runnableExecutorPair) {
            this.runnable = runnable;
            this.executor = executor;
            this.next = runnableExecutorPair;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = log;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, com.google.common.base.o00oOOo0.o00oOOo0(valueOf2.length() + valueOf.length() + 57, "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            if (this.executed) {
                executeListener(runnable, executor);
            } else {
                this.runnables = new RunnableExecutorPair(runnable, executor, this.runnables);
            }
        }
    }

    public void execute() {
        synchronized (this) {
            if (this.executed) {
                return;
            }
            this.executed = true;
            RunnableExecutorPair runnableExecutorPair = this.runnables;
            RunnableExecutorPair runnableExecutorPair2 = null;
            this.runnables = null;
            while (runnableExecutorPair != null) {
                RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.next;
                runnableExecutorPair.next = runnableExecutorPair2;
                runnableExecutorPair2 = runnableExecutorPair;
                runnableExecutorPair = runnableExecutorPair3;
            }
            while (runnableExecutorPair2 != null) {
                executeListener(runnableExecutorPair2.runnable, runnableExecutorPair2.executor);
                runnableExecutorPair2 = runnableExecutorPair2.next;
            }
        }
    }
}
