package com.google.android.gms.common.data;

import android.support.v4.media.o00oOOo0;
import android.support.v4.media.o00oOoO;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@oo0oO0 DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @oo0oO0
    public final Object next() {
        if (hasNext()) {
            int i = this.zab + 1;
            this.zab = i;
            if (i == 0) {
                Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = checkNotNull;
                if (!(checkNotNull instanceof DataBufferRef)) {
                    throw new IllegalStateException(o00oOoO.o00oOOo0("DataBuffer reference of type ", String.valueOf(checkNotNull.getClass()), " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException(o00oOOo0.o00oOOo0("Cannot advance the iterator beyond ", this.zab));
    }
}
