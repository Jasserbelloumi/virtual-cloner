package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class ProviderOfLazy<T> implements o0O0o<Lazy<T>> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private final o0O0o<T> provider;

    private ProviderOfLazy(o0O0o<T> o0o0o) {
        this.provider = o0o0o;
    }

    public static <T> o0O0o<Lazy<T>> create(o0O0o<T> o0o0o) {
        return new ProviderOfLazy((o0O0o) Preconditions.checkNotNull(o0o0o));
    }

    @Override // o0OO0o0o.o0O0o
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
