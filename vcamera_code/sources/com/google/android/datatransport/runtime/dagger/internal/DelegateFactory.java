package com.google.android.datatransport.runtime.dagger.internal;

import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private o0O0o<T> delegate;

    public static <T> void setDelegate(o0O0o<T> o0o0o, o0O0o<T> o0o0o2) {
        Preconditions.checkNotNull(o0o0o2);
        DelegateFactory delegateFactory = (DelegateFactory) o0o0o;
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = o0o0o2;
    }

    @Override // o0OO0o0o.o0O0o
    public T get() {
        o0O0o<T> o0o0o = this.delegate;
        if (o0o0o != null) {
            return o0o0o.get();
        }
        throw new IllegalStateException();
    }

    public o0O0o<T> getDelegate() {
        return (o0O0o) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(o0O0o<T> o0o0o) {
        setDelegate(this, o0o0o);
    }
}
