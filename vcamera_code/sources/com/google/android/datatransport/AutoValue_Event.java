package com.google.android.datatransport;

import android.support.v4.media.o00oOo0O;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class AutoValue_Event<T> extends Event<T> {
    private final Integer code;
    private final T payload;
    private final Priority priority;

    public AutoValue_Event(@o0OO00OO Integer num, T t, Priority priority) {
        this.code = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.payload = t;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.priority = priority;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Event) {
            Event event = (Event) obj;
            Integer num = this.code;
            if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
                if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @o0OO00OO
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        Integer num = this.code;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode();
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Event{code=");
        o00oOOo02.append(this.code);
        o00oOOo02.append(", payload=");
        o00oOOo02.append(this.payload);
        o00oOOo02.append(", priority=");
        o00oOOo02.append(this.priority);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
