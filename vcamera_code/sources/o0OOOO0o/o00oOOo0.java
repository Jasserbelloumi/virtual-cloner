package o0OOOO0o;

import java.lang.annotation.Annotation;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0OOooO0;
import o0OOOOO0.o0ooO;
import o0OOOo.o0O00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "JvmClassMappingKt")
/* loaded from: classes3.dex */
public final class o00oOOo0 {
    @NotNull
    public static final <T extends Annotation> o0O00OO<? extends T> o00oOOo0(@NotNull T t) {
        o0ooO.o00oo0O0(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        o0ooO.o00oo0OO(annotationType, "this as java.lang.annota…otation).annotationType()");
        o0O00OO<? extends T> o00oOoOO2 = o00oOoOO(annotationType);
        o0ooO.o00oo0(o00oOoOO2, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return o00oOoOO2;
    }

    public static final <E extends Enum<E>> Class<E> o00oOOoO(Enum<E> r1) {
        o0ooO.o00oo0O0(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        o0ooO.o00oo0OO(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.7")
    public static /* synthetic */ void o00oOo00(Enum r0) {
    }

    @o00oo0OO(name = "getJavaClass")
    @NotNull
    public static final <T> Class<T> o00oOo0O(@NotNull o0O00OO<T> o0o00oo) {
        o0ooO.o00oo0O0(o0o00oo, "<this>");
        Class<T> cls = (Class<T>) ((o0OOOOO0.o0OoOoOo) o0o00oo).o00oo0O0();
        o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void o00oOo0o(o0O00OO o0o00oo) {
    }

    @Nullable
    public static final <T> Class<T> o00oOoO(@NotNull o0O00OO<T> o0o00oo) {
        o0ooO.o00oo0O0(o0o00oo, "<this>");
        Class<T> cls = (Class<T>) ((o0OOOOO0.o0OoOoOo) o0o00oo).o00oo0O0();
        if (cls.isPrimitive()) {
            o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    @NotNull
    public static final <T> Class<T> o00oOoO0(@NotNull o0O00OO<T> o0o00oo) {
        o0ooO.o00oo0O0(o0o00oo, "<this>");
        Class<T> cls = (Class<T>) ((o0OOOOO0.o0OoOoOo) o0o00oo).o00oo0O0();
        if (!cls.isPrimitive()) {
            o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    @o00oo0OO(name = "getKotlinClass")
    @NotNull
    public static final <T> o0O00OO<T> o00oOoOO(@NotNull Class<T> cls) {
        o0ooO.o00oo0O0(cls, "<this>");
        return o0OOooO0.o00oOooO(cls);
    }

    @o00oo0OO(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final <T> Class<o0O00OO<T>> o00oOoOo(@NotNull o0O00OO<T> o0o00oo) {
        o0ooO.o00oo0O0(o0o00oo, "<this>");
        Class<o0O00OO<T>> cls = (Class<o0O00OO<T>>) o0o00oo.getClass();
        o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @o0OO000(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void o00oOoo0(o0O00OO o0o00oo) {
    }

    @NotNull
    public static final <T> Class<T> o00oOooO(@NotNull T t) {
        o0ooO.o00oo0O0(t, "<this>");
        Class<T> cls = (Class<T>) t.getClass();
        o0ooO.o00oo0(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    public static final boolean o00oOooo(Object[] objArr) {
        o0ooO.o00oo0O0(objArr, "<this>");
        o0ooO.o00oooOo();
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
