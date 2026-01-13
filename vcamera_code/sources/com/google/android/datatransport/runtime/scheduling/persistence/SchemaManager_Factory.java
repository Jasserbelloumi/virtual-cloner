package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
/* loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final o0OO0o0o.o0O0o<Context> contextProvider;
    private final o0OO0o0o.o0O0o<String> dbNameProvider;
    private final o0OO0o0o.o0O0o<Integer> schemaVersionProvider;

    public SchemaManager_Factory(o0OO0o0o.o0O0o<Context> o0o0o, o0OO0o0o.o0O0o<String> o0o0o2, o0OO0o0o.o0O0o<Integer> o0o0o3) {
        this.contextProvider = o0o0o;
        this.dbNameProvider = o0o0o2;
        this.schemaVersionProvider = o0o0o3;
    }

    public static SchemaManager_Factory create(o0OO0o0o.o0O0o<Context> o0o0o, o0OO0o0o.o0O0o<String> o0o0o2, o0OO0o0o.o0O0o<Integer> o0o0o3) {
        return new SchemaManager_Factory(o0o0o, o0o0o2, o0o0o3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // o0OO0o0o.o0O0o
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
