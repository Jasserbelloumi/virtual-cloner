package o0OOOo0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0O0OOO0 implements o0O0OOO<Float> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final float f13724o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final float f13725o00oo0O0;

    public o0O0OOO0(float f, float f2) {
        this.f13725o00oo0O0 = f;
        this.f13724o00oo0O = f2;
    }

    @Override // o0OOOo0o.o0O0OOO
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return o00oOOoO(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0OOO0) {
            if (isEmpty() && ((o0O0OOO0) obj).isEmpty()) {
                return true;
            }
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) obj;
            if (this.f13725o00oo0O0 == o0o0ooo0.f13725o00oo0O0) {
                if (this.f13724o00oo0O == o0o0ooo0.f13724o00oo0O) {
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
        return (Float.hashCode(this.f13725o00oo0O0) * 31) + Float.hashCode(this.f13724o00oo0O);
    }

    @Override // o0OOOo0o.o0O0OOO
    public boolean isEmpty() {
        return this.f13725o00oo0O0 >= this.f13724o00oo0O;
    }

    public boolean o00oOOoO(float f) {
        return f >= this.f13725o00oo0O0 && f < this.f13724o00oo0O;
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo00 */
    public Float o00oOooO() {
        return Float.valueOf(this.f13724o00oo0O);
    }

    @Override // o0OOOo0o.o0O0OOO
    @NotNull
    /* renamed from: o00oOo0O */
    public Float o00oOOo0() {
        return Float.valueOf(this.f13725o00oo0O0);
    }

    public final boolean o00oOo0o(float f, float f2) {
        return f <= f2;
    }

    @NotNull
    public String toString() {
        return this.f13725o00oo0O0 + "..<" + this.f13724o00oo0O;
    }
}
