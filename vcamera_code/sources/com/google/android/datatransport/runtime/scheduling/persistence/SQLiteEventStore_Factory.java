package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
/* loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final o0OO0o0o.o0O0o<Clock> clockProvider;
    private final o0OO0o0o.o0O0o<EventStoreConfig> configProvider;
    private final o0OO0o0o.o0O0o<String> packageNameProvider;
    private final o0OO0o0o.o0O0o<SchemaManager> schemaManagerProvider;
    private final o0OO0o0o.o0O0o<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(o0OO0o0o.o0O0o<Clock> o0o0o, o0OO0o0o.o0O0o<Clock> o0o0o2, o0OO0o0o.o0O0o<EventStoreConfig> o0o0o3, o0OO0o0o.o0O0o<SchemaManager> o0o0o4, o0OO0o0o.o0O0o<String> o0o0o5) {
        this.wallClockProvider = o0o0o;
        this.clockProvider = o0o0o2;
        this.configProvider = o0o0o3;
        this.schemaManagerProvider = o0o0o4;
        this.packageNameProvider = o0o0o5;
    }

    public static SQLiteEventStore_Factory create(o0OO0o0o.o0O0o<Clock> o0o0o, o0OO0o0o.o0O0o<Clock> o0o0o2, o0OO0o0o.o0O0o<EventStoreConfig> o0o0o3, o0OO0o0o.o0O0o<SchemaManager> o0o0o4, o0OO0o0o.o0O0o<String> o0o0o5) {
        return new SQLiteEventStore_Factory(o0o0o, o0o0o2, o0o0o3, o0o0o4, o0o0o5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, o0OO0o0o.o0O0o<String> o0o0o) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, o0o0o);
    }

    @Override // o0OO0o0o.o0O0o
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
