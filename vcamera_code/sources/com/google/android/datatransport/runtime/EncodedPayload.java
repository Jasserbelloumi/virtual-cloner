package com.google.android.datatransport.runtime;

import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final Encoding encoding;

    public EncodedPayload(@oo0oO0 Encoding encoding, @oo0oO0 byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EncodedPayload) {
            EncodedPayload encodedPayload = (EncodedPayload) obj;
            if (this.encoding.equals(encodedPayload.encoding)) {
                return Arrays.equals(this.bytes, encodedPayload.bytes);
            }
            return false;
        }
        return false;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bytes);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("EncodedPayload{encoding=");
        o00oOOo02.append(this.encoding);
        o00oOOo02.append(", bytes=[...]}");
        return o00oOOo02.toString();
    }
}
