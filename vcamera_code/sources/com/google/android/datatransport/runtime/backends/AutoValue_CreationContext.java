package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import android.support.v4.media.o00oOOoO;
import android.support.v4.media.o00oOo0O;
import com.google.android.datatransport.runtime.time.Clock;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
final class AutoValue_CreationContext extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.applicationContext = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.wallClock = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.monotonicClock = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.backendName = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreationContext) {
            CreationContext creationContext = (CreationContext) obj;
            return this.applicationContext.equals(creationContext.getApplicationContext()) && this.wallClock.equals(creationContext.getWallClock()) && this.monotonicClock.equals(creationContext.getMonotonicClock()) && this.backendName.equals(creationContext.getBackendName());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @oo0oO0
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CreationContext{applicationContext=");
        o00oOOo02.append(this.applicationContext);
        o00oOOo02.append(", wallClock=");
        o00oOOo02.append(this.wallClock);
        o00oOOo02.append(", monotonicClock=");
        o00oOOo02.append(this.monotonicClock);
        o00oOOo02.append(", backendName=");
        return o00oOOoO.o00oOOo0(o00oOOo02, this.backendName, "}");
    }
}
