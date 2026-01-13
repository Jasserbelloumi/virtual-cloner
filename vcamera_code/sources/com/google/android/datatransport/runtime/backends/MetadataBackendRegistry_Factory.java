package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final o0O0o<Context> applicationContextProvider;
    private final o0O0o<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(o0O0o<Context> o0o0o, o0O0o<CreationContextFactory> o0o0o2) {
        this.applicationContextProvider = o0o0o;
        this.creationContextFactoryProvider = o0o0o2;
    }

    public static MetadataBackendRegistry_Factory create(o0O0o<Context> o0o0o, o0O0o<CreationContextFactory> o0o0o2) {
        return new MetadataBackendRegistry_Factory(o0o0o, o0o0o2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // o0OO0o0o.o0O0o
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
