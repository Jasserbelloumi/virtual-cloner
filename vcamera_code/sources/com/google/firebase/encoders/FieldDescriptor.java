package com.google.firebase.encoders;

import android.support.v4.media.o00oOo0O;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map<Class<?>, Object> properties;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final String name;
        private Map<Class<?>, Object> properties = null;

        public Builder(String str) {
            this.name = str;
        }

        @oo0oO0
        public FieldDescriptor build() {
            return new FieldDescriptor(this.name, this.properties == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.properties)));
        }

        @oo0oO0
        public <T extends Annotation> Builder withProperty(@oo0oO0 T t) {
            if (this.properties == null) {
                this.properties = new HashMap();
            }
            this.properties.put(t.annotationType(), t);
            return this;
        }
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.name = str;
        this.properties = map;
    }

    @oo0oO0
    public static Builder builder(@oo0oO0 String str) {
        return new Builder(str);
    }

    @oo0oO0
    public static FieldDescriptor of(@oo0oO0 String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldDescriptor) {
            FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
            return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
        }
        return false;
    }

    @oo0oO0
    public String getName() {
        return this.name;
    }

    @o0OO00OO
    public <T extends Annotation> T getProperty(@oo0oO0 Class<T> cls) {
        return (T) this.properties.get(cls);
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.name.hashCode() * 31);
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("FieldDescriptor{name=");
        o00oOOo02.append(this.name);
        o00oOOo02.append(", properties=");
        o00oOOo02.append(this.properties.values());
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
