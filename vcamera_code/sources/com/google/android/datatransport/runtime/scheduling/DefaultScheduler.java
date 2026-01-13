package com.google.android.datatransport.runtime.scheduling;

import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o0OO0o0o.o00oo0O0;
/* loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    @o00oo0O0
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String format = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(format);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(format));
                return;
            }
            final EventInternal decorate = transportBackend.decorate(eventInternal);
            this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: o0O0oo.o0O0oo00
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    Object lambda$schedule$0;
                    lambda$schedule$0 = DefaultScheduler.this.lambda$schedule$0(transportContext, decorate);
                    return lambda$schedule$0;
                }
            });
            transportScheduleCallback.onSchedule(null);
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Error scheduling event ");
            o00oOOo02.append(e.getMessage());
            logger.warning(o00oOOo02.toString());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new Runnable() { // from class: o0O0oo.o0O
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.this.lambda$schedule$1(transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }
}
