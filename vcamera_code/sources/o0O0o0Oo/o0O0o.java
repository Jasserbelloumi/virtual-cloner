package o0O0o0Oo;

import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOo0;
@o0O0OO.o00oo0OO
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O0o {
    @oo0oO0
    @o00oOOo0(name = "key")
    @o0O0OO.o0O000Oo

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public String f12457o00oOOo0;
    @o0OO00OO
    @o00oOOo0(name = "long_value")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Long f12458o00oOOoO;

    public o0O0o(@oo0oO0 String str, long j) {
        this.f12457o00oOOo0 = str;
        this.f12458o00oOOoO = Long.valueOf(j);
    }

    public o0O0o(@oo0oO0 String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0o) {
            o0O0o o0o0o = (o0O0o) obj;
            if (this.f12457o00oOOo0.equals(o0o0o.f12457o00oOOo0)) {
                Long l = this.f12458o00oOOoO;
                Long l2 = o0o0o.f12458o00oOOoO;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f12457o00oOOo0.hashCode() * 31;
        Long l = this.f12458o00oOOoO;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
