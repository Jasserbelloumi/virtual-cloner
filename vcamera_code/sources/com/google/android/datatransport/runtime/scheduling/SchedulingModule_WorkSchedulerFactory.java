package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final o0O0o<Clock> clockProvider;
    private final o0O0o<SchedulerConfig> configProvider;
    private final o0O0o<Context> contextProvider;
    private final o0O0o<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(o0O0o<Context> o0o0o, o0O0o<EventStore> o0o0o2, o0O0o<SchedulerConfig> o0o0o3, o0O0o<Clock> o0o0o4) {
        this.contextProvider = o0o0o;
        this.eventStoreProvider = o0o0o2;
        this.configProvider = o0o0o3;
        this.clockProvider = o0o0o4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(o0O0o<Context> o0o0o, o0O0o<EventStore> o0o0o2, o0O0o<SchedulerConfig> o0o0o3, o0O0o<Clock> o0o0o4) {
        return new SchedulingModule_WorkSchedulerFactory(o0o0o, o0o0o2, o0o0o3, o0o0o4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o0OO0o0o.o0O0o
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
