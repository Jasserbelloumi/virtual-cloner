package com.google.android.datatransport;

import android.support.v4.media.o00oOOoO;
import android.support.v4.media.o00oOo0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class Encoding {
    private final String name;

    private Encoding(@oo0oO0 String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.name = str;
    }

    public static Encoding of(@oo0oO0 String str) {
        return new Encoding(str);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @oo0oO0
    public String toString() {
        return o00oOOoO.o00oOOo0(o00oOo0O.o00oOOo0("Encoding{name=\""), this.name, "\"}");
    }
}
