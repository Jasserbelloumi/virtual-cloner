package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
@Module
/* loaded from: classes.dex */
public abstract class EventStoreModule {
    @Provides
    @o0OO0o0o.o00oo0O("SQLITE_DB_NAME")
    public static String dbName() {
        return SchemaManager.DB_NAME;
    }

    @Provides
    @o0OO0o0o.o00ooO
    @o0OO0o0o.o00oo0O("PACKAGE_NAME")
    public static String packageName(Context context) {
        return context.getPackageName();
    }

    @Provides
    @o0OO0o0o.o00oo0O("SCHEMA_VERSION")
    public static int schemaVersion() {
        return SchemaManager.SCHEMA_VERSION;
    }

    @Provides
    public static EventStoreConfig storeConfig() {
        return EventStoreConfig.DEFAULT;
    }

    @Binds
    public abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract EventStore eventStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore sQLiteEventStore);
}
