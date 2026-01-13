package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    @oo0oO0
    T get(int i);

    int getCount();

    @o0OO00OO
    @KeepForSdk
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @oo0oO0
    Iterator<T> iterator();

    void release();

    @oo0oO0
    Iterator<T> singleRefIterator();
}
