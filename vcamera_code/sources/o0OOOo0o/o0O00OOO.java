package o0OOOo0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O00OOO implements o0oO0Ooo<Float> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final float f13708o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final float f13709o00oo0O0;

    public o0O00OOO(float f, float f2) {
        this.f13709o00oo0O0 = f;
        this.f13708o00oo0O = f2;
    }

    @Override // o0OOOo0o.o0oO0Ooo, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOooO(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00OOO) {
            if (isEmpty() && ((o0O00OOO) obj).isEmpty()) {
                return true;
            }
            o0O00OOO o0o00ooo = (o0O00OOO) obj;
            if (this.f13709o00oo0O0 == o0o00ooo.f13709o00oo0O0) {
                if (this.f13708o00oo0O == o0o00ooo.f13708o00oo0O) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f13709o00oo0O0) * 31) + Float.hashCode(this.f13708o00oo0O);
    }

    @Override // o0OOOo0o.o0oO0Ooo, o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13709o00oo0O0 > this.f13708o00oo0O;
    }

    @Override // o0OOOo0o.o0oO0Ooo
    public /* bridge */ /* synthetic */ boolean o00oOOoO(Float f, Float f2) {
        return o00oOoO0(f.floatValue(), f2.floatValue());
    }

    @Override // o0OOOo0o.o0O00o00
    @NotNull
    /* renamed from: o00oOo0O */
    public Float o00oOo00() {
        return Float.valueOf(this.f13708o00oo0O);
    }

    @Override // o0OOOo0o.o0O00o00, o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo0o */
    public Float o00oOOo0() {
        return Float.valueOf(this.f13709o00oo0O0);
    }

    public boolean o00oOoO0(float f, float f2) {
        return f <= f2;
    }

    public boolean o00oOooO(float f) {
        return f >= this.f13709o00oo0O0 && f <= this.f13708o00oo0O;
    }

    @NotNull
    public String toString() {
        return this.f13709o00oo0O0 + ".." + this.f13708o00oo0O;
    }
}
