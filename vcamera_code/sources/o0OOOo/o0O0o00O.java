package o0OOOo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import o0OO0o.o0O000;
import o0OO0oO.o0O000O;
import o0OOOO.o00oo;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@o0O000
/* loaded from: classes3.dex */
public final class o0O0o00O implements ParameterizedType, o0O0o0 {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Type f13683o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Class<?> f13684o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Type[] f13685o00oo0Oo;

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 extends o0OOOOO0.o0oO0O0o implements o00oo<Type, String> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1, o0O0oo00.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final String invoke(@NotNull Type type) {
            o0OOOOO0.o0ooO.o00oo0O0(type, "p0");
            return o0O0oo00.o00oOoOo(type);
        }
    }

    public o0O0o00O(@NotNull Class<?> cls, @Nullable Type type, @NotNull List<? extends Type> list) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "rawType");
        o0OOOOO0.o0ooO.o00oo0O0(list, "typeArguments");
        this.f13684o00oo0O0 = cls;
        this.f13683o00oo0O = type;
        this.f13685o00oo0Oo = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (o0OOOOO0.o0ooO.o00oOoO0(this.f13684o00oo0O0, parameterizedType.getRawType()) && o0OOOOO0.o0ooO.o00oOoO0(this.f13683o00oo0O, parameterizedType.getOwnerType()) && Arrays.equals(this.f13685o00oo0Oo, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.f13685o00oo0Oo;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.f13683o00oo0O;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.f13684o00oo0O0;
    }

    @Override // java.lang.reflect.Type, o0OOOo.o0O0o0
    @NotNull
    public String getTypeName() {
        String o00oOoOo2;
        StringBuilder sb = new StringBuilder();
        Type type = this.f13683o00oo0O;
        if (type != null) {
            sb.append(o0O0oo00.o00oOoOo(type));
            sb.append("$");
            o00oOoOo2 = this.f13684o00oo0O0.getSimpleName();
        } else {
            o00oOoOo2 = o0O0oo00.o00oOoOo(this.f13684o00oo0O0);
        }
        sb.append(o00oOoOo2);
        Type[] typeArr = this.f13685o00oo0Oo;
        if (!(typeArr.length == 0)) {
            o0O000O.oOOO0ooO(typeArr, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) == 0 ? ">" : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : o00oOOo0.INSTANCE);
        }
        String sb2 = sb.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f13684o00oo0O0.hashCode();
        Type type = this.f13683o00oo0O;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f13685o00oo0Oo);
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
