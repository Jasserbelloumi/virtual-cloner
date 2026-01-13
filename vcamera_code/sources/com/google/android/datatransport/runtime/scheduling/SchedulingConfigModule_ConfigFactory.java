package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final o0O0o<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(o0O0o<Clock> o0o0o) {
        this.clockProvider = o0o0o;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(o0O0o<Clock> o0o0o) {
        return new SchedulingConfigModule_ConfigFactory(o0o0o);
    }

    @Override // o0OO0o0o.o0O0o
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
