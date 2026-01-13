package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final o0OO0o0o.o0O0o<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(o0OO0o0o.o0O0o<Context> o0o0o) {
        this.contextProvider = o0o0o;
    }

    public static EventStoreModule_PackageNameFactory create(o0OO0o0o.o0O0o<Context> o0o0o) {
        return new EventStoreModule_PackageNameFactory(o0o0o);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // o0OO0o0o.o0O0o
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
