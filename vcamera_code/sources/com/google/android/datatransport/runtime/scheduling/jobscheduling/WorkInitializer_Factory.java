package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final o0OO0o0o.o0O0o<Executor> executorProvider;
    private final o0OO0o0o.o0O0o<SynchronizationGuard> guardProvider;
    private final o0OO0o0o.o0O0o<WorkScheduler> schedulerProvider;
    private final o0OO0o0o.o0O0o<EventStore> storeProvider;

    public WorkInitializer_Factory(o0OO0o0o.o0O0o<Executor> o0o0o, o0OO0o0o.o0O0o<EventStore> o0o0o2, o0OO0o0o.o0O0o<WorkScheduler> o0o0o3, o0OO0o0o.o0O0o<SynchronizationGuard> o0o0o4) {
        this.executorProvider = o0o0o;
        this.storeProvider = o0o0o2;
        this.schedulerProvider = o0o0o3;
        this.guardProvider = o0o0o4;
    }

    public static WorkInitializer_Factory create(o0OO0o0o.o0O0o<Executor> o0o0o, o0OO0o0o.o0O0o<EventStore> o0o0o2, o0OO0o0o.o0O0o<WorkScheduler> o0o0o3, o0OO0o0o.o0O0o<SynchronizationGuard> o0o0o4) {
        return new WorkInitializer_Factory(o0o0o, o0o0o2, o0o0o3, o0o0o4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // o0OO0o0o.o0O0o
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
