package com.google.android.datatransport.runtime.dagger.internal;

import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class SingleCheck<T> implements o0O0o<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile o0O0o<T> provider;

    private SingleCheck(o0O0o<T> o0o0o) {
        this.provider = o0o0o;
    }

    public static <P extends o0O0o<T>, T> o0O0o<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((o0O0o) Preconditions.checkNotNull(p));
    }

    @Override // o0OO0o0o.o0O0o
    public T get() {
        T t = (T) this.instance;
        if (t == UNINITIALIZED) {
            o0O0o<T> o0o0o = this.provider;
            if (o0o0o == null) {
                return (T) this.instance;
            }
            T t2 = o0o0o.get();
            this.instance = t2;
            this.provider = null;
            return t2;
        }
        return t;
    }
}
