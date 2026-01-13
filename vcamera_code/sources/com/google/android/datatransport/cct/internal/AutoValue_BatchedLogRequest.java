package com.google.android.datatransport.cct.internal;

import android.support.v4.media.o00oOo0O;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {
    private final List<LogRequest> logRequests;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.logRequests = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.logRequests.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @oo0oO0
    @Encodable.Field(name = "logRequest")
    public List<LogRequest> getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("BatchedLogRequest{logRequests=");
        o00oOOo02.append(this.logRequests);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
