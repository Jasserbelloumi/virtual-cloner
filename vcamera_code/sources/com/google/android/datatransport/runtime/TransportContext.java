package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
@AutoValue
/* loaded from: classes.dex */
public abstract class TransportContext {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(@o0OO00OO byte[] bArr);

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    @o0OO00OO
    public abstract byte[] getExtras();

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getBackendName();
        objArr[1] = getPriority();
        objArr[2] = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
