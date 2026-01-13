package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final o0OO0o0o.o0O0o<BackendRegistry> backendRegistryProvider;
    private final o0OO0o0o.o0O0o<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final o0OO0o0o.o0O0o<Clock> clockProvider;
    private final o0OO0o0o.o0O0o<Context> contextProvider;
    private final o0OO0o0o.o0O0o<EventStore> eventStoreProvider;
    private final o0OO0o0o.o0O0o<Executor> executorProvider;
    private final o0OO0o0o.o0O0o<SynchronizationGuard> guardProvider;
    private final o0OO0o0o.o0O0o<Clock> uptimeClockProvider;
    private final o0OO0o0o.o0O0o<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(o0OO0o0o.o0O0o<Context> o0o0o, o0OO0o0o.o0O0o<BackendRegistry> o0o0o2, o0OO0o0o.o0O0o<EventStore> o0o0o3, o0OO0o0o.o0O0o<WorkScheduler> o0o0o4, o0OO0o0o.o0O0o<Executor> o0o0o5, o0OO0o0o.o0O0o<SynchronizationGuard> o0o0o6, o0OO0o0o.o0O0o<Clock> o0o0o7, o0OO0o0o.o0O0o<Clock> o0o0o8, o0OO0o0o.o0O0o<ClientHealthMetricsStore> o0o0o9) {
        this.contextProvider = o0o0o;
        this.backendRegistryProvider = o0o0o2;
        this.eventStoreProvider = o0o0o3;
        this.workSchedulerProvider = o0o0o4;
        this.executorProvider = o0o0o5;
        this.guardProvider = o0o0o6;
        this.clockProvider = o0o0o7;
        this.uptimeClockProvider = o0o0o8;
        this.clientHealthMetricsStoreProvider = o0o0o9;
    }

    public static Uploader_Factory create(o0OO0o0o.o0O0o<Context> o0o0o, o0OO0o0o.o0O0o<BackendRegistry> o0o0o2, o0OO0o0o.o0O0o<EventStore> o0o0o3, o0OO0o0o.o0O0o<WorkScheduler> o0o0o4, o0OO0o0o.o0O0o<Executor> o0o0o5, o0OO0o0o.o0O0o<SynchronizationGuard> o0o0o6, o0OO0o0o.o0O0o<Clock> o0o0o7, o0OO0o0o.o0O0o<Clock> o0o0o8, o0OO0o0o.o0O0o<ClientHealthMetricsStore> o0o0o9) {
        return new Uploader_Factory(o0o0o, o0o0o2, o0o0o3, o0o0o4, o0o0o5, o0o0o6, o0o0o7, o0o0o8, o0o0o9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // o0OO0o0o.o0O0o
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
