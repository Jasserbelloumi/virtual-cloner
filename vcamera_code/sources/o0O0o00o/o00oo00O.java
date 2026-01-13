package o0O0o00o;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f12337o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f12338o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f12339o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f12340o00oOooO;

    public o00oo00O(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12337o00oOOo0 = z;
        this.f12338o00oOOoO = z2;
        this.f12339o00oOo00 = z3;
        this.f12340o00oOooO = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oo00O) {
            o00oo00O o00oo00o = (o00oo00O) obj;
            return this.f12337o00oOOo0 == o00oo00o.f12337o00oOOo0 && this.f12338o00oOOoO == o00oo00o.f12338o00oOOoO && this.f12339o00oOo00 == o00oo00o.f12339o00oOo00 && this.f12340o00oOooO == o00oo00o.f12340o00oOooO;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.f12337o00oOOo0;
        int i = r0;
        if (this.f12338o00oOOoO) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f12339o00oOo00) {
            i2 = i + 256;
        }
        return this.f12340o00oOooO ? i2 + 4096 : i2;
    }

    public boolean o00oOOo0() {
        return this.f12337o00oOOo0;
    }

    public boolean o00oOOoO() {
        return this.f12339o00oOo00;
    }

    public boolean o00oOo00() {
        return this.f12340o00oOooO;
    }

    public boolean o00oOooO() {
        return this.f12338o00oOOoO;
    }

    @oo0oO0
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f12337o00oOOo0), Boolean.valueOf(this.f12338o00oOOoO), Boolean.valueOf(this.f12339o00oOo00), Boolean.valueOf(this.f12340o00oOooO));
    }
}
