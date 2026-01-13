package o0OOOo;

import android.support.v4.media.o00oOo0O;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import o0OO0o.o0O000;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
@o0O000
/* loaded from: classes3.dex */
public final class o0O implements WildcardType, o0O0o0 {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o00oOOo0 f13679o00oo0Oo = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final o0O f13680o00oo0o0 = new o0O(null, null);
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Type f13681o00oo0O;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Type f13682o00oo0O0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @NotNull
        public final o0O o00oOOo0() {
            return o0O.f13680o00oo0o0;
        }
    }

    public o0O(@Nullable Type type, @Nullable Type type2) {
        this.f13682o00oo0O0 = type;
        this.f13681o00oo0O = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.f13681o00oo0O;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, o0OOOo.o0O0o0
    @NotNull
    public String getTypeName() {
        StringBuilder o00oOOo02;
        Type type;
        if (this.f13681o00oo0O != null) {
            o00oOOo02 = o00oOo0O.o00oOOo0("? super ");
            type = this.f13681o00oo0O;
        } else {
            Type type2 = this.f13682o00oo0O0;
            if (type2 == null || o0OOOOO0.o0ooO.o00oOoO0(type2, Object.class)) {
                return "?";
            }
            o00oOOo02 = o00oOo0O.o00oOOo0("? extends ");
            type = this.f13682o00oo0O0;
        }
        o00oOOo02.append(o0O0oo00.o00oOoOo(type));
        return o00oOOo02.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f13682o00oo0O0;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
