package com.google.firebase.encoders;

import java.io.IOException;
import java.io.Writer;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface DataEncoder {
    @oo0oO0
    String encode(@oo0oO0 Object obj);

    void encode(@oo0oO0 Object obj, @oo0oO0 Writer writer) throws IOException;
}
