package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;
import o00oOooO.o0OO00OO;
@AutoValue
/* loaded from: classes.dex */
public abstract class BackendRequest {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract BackendRequest build();

        public abstract Builder setEvents(Iterable<EventInternal> iterable);

        public abstract Builder setExtras(@o0OO00OO byte[] bArr);
    }

    public static Builder builder() {
        return new AutoValue_BackendRequest.Builder();
    }

    public static BackendRequest create(Iterable<EventInternal> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<EventInternal> getEvents();

    @o0OO00OO
    public abstract byte[] getExtras();
}
