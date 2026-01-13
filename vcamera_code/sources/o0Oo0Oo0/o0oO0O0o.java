package o0Oo0Oo0;

import android.support.v4.media.o00oOOoO;
import javax.annotation.Nullable;
import o0O0OOOo.o00oo0O0;
/* loaded from: classes3.dex */
public final class o0oO0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f16110o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f16111o00oOOoO;

    public o0oO0O0o(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 == null) {
            throw new NullPointerException("realm == null");
        }
        this.f16110o00oOOo0 = str;
        this.f16111o00oOOoO = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0oO0O0o) {
            o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
            if (o0oo0o0o.f16110o00oOOo0.equals(this.f16110o00oOOo0) && o0oo0o0o.f16111o00oOOoO.equals(this.f16111o00oOOoO)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16110o00oOOo0.hashCode() + o00oo0O0.o00oOOo0(this.f16111o00oOOoO, 899, 31);
    }

    public String o00oOOo0() {
        return this.f16111o00oOOoO;
    }

    public String o00oOOoO() {
        return this.f16110o00oOOo0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16110o00oOOo0);
        sb.append(" realm=\"");
        return o00oOOoO.o00oOOo0(sb, this.f16111o00oOOoO, "\"");
    }
}
