package o0OOOo;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import o0OO0o.o0O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O000
/* loaded from: classes3.dex */
public final class o0OoO00O implements GenericArrayType, o0O0o0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Type f13687o00oo0O0;

    public o0OoO00O(@NotNull Type type) {
        o0OOOOO0.o0ooO.o00oo0O0(type, "elementType");
        this.f13687o00oo0O0 = type;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof GenericArrayType) && o0OOOOO0.o0ooO.o00oOoO0(this.f13687o00oo0O0, ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.f13687o00oo0O0;
    }

    @Override // java.lang.reflect.Type, o0OOOo.o0O0o0
    @NotNull
    public String getTypeName() {
        return o0O0oo00.o00oOoOo(this.f13687o00oo0O0) + o0Oo0Oo0.o0O0o00O.f15881o00oo0;
    }

    public int hashCode() {
        return this.f13687o00oo0O0.hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
