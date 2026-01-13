package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final o0O0o<BackendRegistry> backendRegistryProvider;
    private final o0O0o<EventStore> eventStoreProvider;
    private final o0O0o<Executor> executorProvider;
    private final o0O0o<SynchronizationGuard> guardProvider;
    private final o0O0o<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(o0O0o<Executor> o0o0o, o0O0o<BackendRegistry> o0o0o2, o0O0o<WorkScheduler> o0o0o3, o0O0o<EventStore> o0o0o4, o0O0o<SynchronizationGuard> o0o0o5) {
        this.executorProvider = o0o0o;
        this.backendRegistryProvider = o0o0o2;
        this.workSchedulerProvider = o0o0o3;
        this.eventStoreProvider = o0o0o4;
        this.guardProvider = o0o0o5;
    }

    public static DefaultScheduler_Factory create(o0O0o<Executor> o0o0o, o0O0o<BackendRegistry> o0o0o2, o0O0o<WorkScheduler> o0o0o3, o0O0o<EventStore> o0o0o4, o0O0o<SynchronizationGuard> o0o0o5) {
        return new DefaultScheduler_Factory(o0o0o, o0o0o2, o0o0o3, o0o0o4, o0o0o5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // o0OO0o0o.o0O0o
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
