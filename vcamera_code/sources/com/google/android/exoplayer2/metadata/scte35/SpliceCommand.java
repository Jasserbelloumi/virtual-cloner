package com.google.android.exoplayer2.metadata.scte35;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.metadata.Metadata;
/* loaded from: classes.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("SCTE-35 splice command: type=");
        o00oOOo02.append(getClass().getSimpleName());
        return o00oOOo02.toString();
    }
}
