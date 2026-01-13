package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.o00oOOoO;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class AbstractService implements Service {
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_RUNNING_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_STARTING_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_NEW_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_RUNNING_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STARTING_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STOPPING_EVENT;
    private static final ListenerCallQueue.Event<Service.Listener> STARTING_EVENT = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.starting();
        }

        public String toString() {
            return "starting()";
        }
    };
    private static final ListenerCallQueue.Event<Service.Listener> RUNNING_EVENT = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Service.Listener listener) {
            listener.running();
        }

        public String toString() {
            return "running()";
        }
    };
    private final Monitor monitor = new Monitor();
    private final Monitor.Guard isStartable = new IsStartableGuard();
    private final Monitor.Guard isStoppable = new IsStoppableGuard();
    private final Monitor.Guard hasReachedRunning = new HasReachedRunningGuard();
    private final Monitor.Guard isStopped = new IsStoppedGuard();
    private final ListenerCallQueue<Service.Listener> listeners = new ListenerCallQueue<>();
    private volatile StateSnapshot snapshot = new StateSnapshot(Service.State.NEW);

    /* renamed from: com.google.common.util.concurrent.AbstractService$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State;

        static {
            int[] iArr = new int[Service.State.values().length];
            $SwitchMap$com$google$common$util$concurrent$Service$State = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$Service$State[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class HasReachedRunningGuard extends Monitor.Guard {
        public HasReachedRunningGuard() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    /* loaded from: classes2.dex */
    public final class IsStartableGuard extends Monitor.Guard {
        public IsStartableGuard() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state() == Service.State.NEW;
        }
    }

    /* loaded from: classes2.dex */
    public final class IsStoppableGuard extends Monitor.Guard {
        public IsStoppableGuard() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    /* loaded from: classes2.dex */
    public final class IsStoppedGuard extends Monitor.Guard {
        public IsStoppedGuard() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class StateSnapshot {
        @CheckForNull
        public final Throwable failure;
        public final boolean shutdownWhenStartupFinishes;
        public final Service.State state;

        public StateSnapshot(Service.State state) {
            this(state, false, null);
        }

        public StateSnapshot(Service.State state, boolean z, @CheckForNull Throwable th) {
            Preconditions.checkArgument(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument((th != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.state = state;
            this.shutdownWhenStartupFinishes = z;
            this.failure = th;
        }

        public Service.State externalState() {
            return (this.shutdownWhenStartupFinishes && this.state == Service.State.STARTING) ? Service.State.STOPPING : this.state;
        }

        public Throwable failureCause() {
            Service.State state = this.state;
            Preconditions.checkState(state == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", state);
            Throwable th = this.failure;
            Objects.requireNonNull(th);
            return th;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        STOPPING_FROM_STARTING_EVENT = stoppingEvent(state);
        Service.State state2 = Service.State.RUNNING;
        STOPPING_FROM_RUNNING_EVENT = stoppingEvent(state2);
        TERMINATED_FROM_NEW_EVENT = terminatedEvent(Service.State.NEW);
        TERMINATED_FROM_STARTING_EVENT = terminatedEvent(state);
        TERMINATED_FROM_RUNNING_EVENT = terminatedEvent(state2);
        TERMINATED_FROM_STOPPING_EVENT = terminatedEvent(Service.State.STOPPING);
    }

    @GuardedBy("monitor")
    private void checkCurrentState(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(state);
                StringBuilder o00oOOo02 = o00oOOoO.o00oOOo0(valueOf2.length() + valueOf.length() + 56, "Expected the service ", valueOf, " to be ", valueOf2);
                o00oOOo02.append(", but the service has FAILED");
                throw new IllegalStateException(o00oOOo02.toString(), failureCause());
            }
            String valueOf3 = String.valueOf(this);
            String valueOf4 = String.valueOf(state);
            String valueOf5 = String.valueOf(state2);
            throw new IllegalStateException(android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOoO.o00oOOo0(valueOf5.length() + valueOf4.length() + valueOf3.length() + 38, "Expected the service ", valueOf3, " to be ", valueOf4), ", but was ", valueOf5));
        }
    }

    private void dispatchListenerEvents() {
        if (this.monitor.isOccupiedByCurrentThread()) {
            return;
        }
        this.listeners.dispatch();
    }

    private void enqueueFailedEvent(final Service.State state, final Throwable th) {
        this.listeners.enqueue(new ListenerCallQueue.Event<Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.failed(state, th);
            }

            public String toString() {
                String valueOf = String.valueOf(state);
                String valueOf2 = String.valueOf(th);
                StringBuilder o00oOOo02 = o00oOOoO.o00oOOo0(valueOf2.length() + valueOf.length() + 27, "failed({from = ", valueOf, ", cause = ", valueOf2);
                o00oOOo02.append("})");
                return o00oOOo02.toString();
            }
        });
    }

    private void enqueueRunningEvent() {
        this.listeners.enqueue(RUNNING_EVENT);
    }

    private void enqueueStartingEvent() {
        this.listeners.enqueue(STARTING_EVENT);
    }

    private void enqueueStoppingEvent(Service.State state) {
        ListenerCallQueue<Service.Listener> listenerCallQueue;
        ListenerCallQueue.Event<Service.Listener> event;
        if (state == Service.State.STARTING) {
            listenerCallQueue = this.listeners;
            event = STOPPING_FROM_STARTING_EVENT;
        } else if (state != Service.State.RUNNING) {
            throw new AssertionError();
        } else {
            listenerCallQueue = this.listeners;
            event = STOPPING_FROM_RUNNING_EVENT;
        }
        listenerCallQueue.enqueue(event);
    }

    private void enqueueTerminatedEvent(Service.State state) {
        ListenerCallQueue<Service.Listener> listenerCallQueue;
        ListenerCallQueue.Event<Service.Listener> event;
        switch (AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
            case 1:
                listenerCallQueue = this.listeners;
                event = TERMINATED_FROM_NEW_EVENT;
                break;
            case 2:
                listenerCallQueue = this.listeners;
                event = TERMINATED_FROM_STARTING_EVENT;
                break;
            case 3:
                listenerCallQueue = this.listeners;
                event = TERMINATED_FROM_RUNNING_EVENT;
                break;
            case 4:
                listenerCallQueue = this.listeners;
                event = TERMINATED_FROM_STOPPING_EVENT;
                break;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
        listenerCallQueue.enqueue(event);
    }

    private static ListenerCallQueue.Event<Service.Listener> stoppingEvent(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.stopping(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 19, "stopping({from = ", valueOf, "})");
            }
        };
    }

    private static ListenerCallQueue.Event<Service.Listener> terminatedEvent(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public void call(Service.Listener listener) {
                listener.terminated(Service.State.this);
            }

            public String toString() {
                String valueOf = String.valueOf(Service.State.this);
                return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 21, "terminated({from = ", valueOf, "})");
            }
        };
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.listeners.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.monitor.enterWhenUninterruptibly(this.hasReachedRunning);
        try {
            checkCurrentState(Service.State.RUNNING);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        if (!this.monitor.enterWhenUninterruptibly(this.hasReachedRunning, j, timeUnit)) {
            String valueOf = String.valueOf(this);
            throw new TimeoutException(com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 50, "Timed out waiting for ", valueOf, " to reach the RUNNING state."));
        }
        try {
            checkCurrentState(Service.State.RUNNING);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.monitor.enterWhenUninterruptibly(this.isStopped);
        try {
            checkCurrentState(Service.State.TERMINATED);
        } finally {
            this.monitor.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.monitor.enterWhenUninterruptibly(this.isStopped, j, timeUnit)) {
            try {
                checkCurrentState(Service.State.TERMINATED);
                return;
            } finally {
                this.monitor.leave();
            }
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(state());
        throw new TimeoutException(com.google.common.base.o00oOOo0.o00oOOo0(valueOf2.length() + valueOf.length() + 65, "Timed out waiting for ", valueOf, " to reach a terminal state. Current state: ", valueOf2));
    }

    @Beta
    @ForOverride
    public void doCancelStart() {
    }

    @ForOverride
    public abstract void doStart();

    @ForOverride
    public abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.snapshot.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == Service.State.RUNNING;
    }

    public final void notifyFailed(Throwable th) {
        Preconditions.checkNotNull(th);
        this.monitor.enter();
        try {
            Service.State state = state();
            int i = AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.snapshot = new StateSnapshot(Service.State.FAILED, false, th);
                    enqueueFailedEvent(state, th);
                } else if (i != 5) {
                }
                return;
            }
            String valueOf = String.valueOf(state);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Failed while in state:");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), th);
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    public final void notifyStarted() {
        this.monitor.enter();
        try {
            if (this.snapshot.state == Service.State.STARTING) {
                if (this.snapshot.shutdownWhenStartupFinishes) {
                    this.snapshot = new StateSnapshot(Service.State.STOPPING);
                    doStop();
                } else {
                    this.snapshot = new StateSnapshot(Service.State.RUNNING);
                    enqueueRunningEvent();
                }
                return;
            }
            String valueOf = String.valueOf(this.snapshot.state);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(valueOf);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            notifyFailed(illegalStateException);
            throw illegalStateException;
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    public final void notifyStopped() {
        this.monitor.enter();
        try {
            Service.State state = state();
            switch (AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    String valueOf = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                case 2:
                case 3:
                case 4:
                    this.snapshot = new StateSnapshot(Service.State.TERMINATED);
                    enqueueTerminatedEvent(state);
                    break;
            }
        } finally {
            this.monitor.leave();
            dispatchListenerEvents();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        if (!this.monitor.enterIf(this.isStartable)) {
            String valueOf = String.valueOf(this);
            throw new IllegalStateException(com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 33, "Service ", valueOf, " has already been started"));
        }
        try {
            this.snapshot = new StateSnapshot(Service.State.STARTING);
            enqueueStartingEvent();
            doStart();
        } finally {
            try {
                return this;
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.snapshot.externalState();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        if (this.monitor.enterIf(this.isStoppable)) {
            try {
                Service.State state = state();
                switch (AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State[state.ordinal()]) {
                    case 1:
                        this.snapshot = new StateSnapshot(Service.State.TERMINATED);
                        enqueueTerminatedEvent(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state2 = Service.State.STARTING;
                        this.snapshot = new StateSnapshot(state2, true, null);
                        enqueueStoppingEvent(state2);
                        doCancelStart();
                        break;
                    case 3:
                        this.snapshot = new StateSnapshot(Service.State.STOPPING);
                        enqueueStoppingEvent(Service.State.RUNNING);
                        doStop();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        String valueOf = String.valueOf(state);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                        sb.append("isStoppable is incorrectly implemented, saw: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(state());
        return com.google.common.base.o00oOOo0.o00oOOo0(valueOf.length() + simpleName.length() + 3, simpleName, " [", valueOf, "]");
    }
}
