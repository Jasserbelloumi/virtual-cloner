package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;
import o00oOooO.oo0oO0;
@AutoValue
@Encodable
/* loaded from: classes.dex */
public abstract class BatchedLogRequest {
    @oo0oO0
    public static BatchedLogRequest create(@oo0oO0 List<LogRequest> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    @oo0oO0
    public static DataEncoder createDataEncoder() {
        return new JsonDataEncoderBuilder().configureWith(AutoBatchedLogRequestEncoder.CONFIG).ignoreNullValues(true).build();
    }

    @oo0oO0
    @Encodable.Field(name = "logRequest")
    public abstract List<LogRequest> getLogRequests();
}
