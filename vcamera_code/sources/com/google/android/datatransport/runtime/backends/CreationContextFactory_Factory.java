package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final o0O0o<Context> applicationContextProvider;
    private final o0O0o<Clock> monotonicClockProvider;
    private final o0O0o<Clock> wallClockProvider;

    public CreationContextFactory_Factory(o0O0o<Context> o0o0o, o0O0o<Clock> o0o0o2, o0O0o<Clock> o0o0o3) {
        this.applicationContextProvider = o0o0o;
        this.wallClockProvider = o0o0o2;
        this.monotonicClockProvider = o0o0o3;
    }

    public static CreationContextFactory_Factory create(o0O0o<Context> o0o0o, o0O0o<Clock> o0o0o2, o0O0o<Clock> o0o0o3) {
        return new CreationContextFactory_Factory(o0o0o, o0o0o2, o0o0o3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // o0OO0o0o.o0O0o
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
