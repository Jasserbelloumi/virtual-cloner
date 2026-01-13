package o0OOOo;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo0OO;
import o0OOOO.o00oo;
import o0OOOOO0.o0OOO00;
import o0OOOoO0.oO000;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.ooOOOOoo;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0oo00 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13686o00oOOo0;

        static {
            int[] iArr = new int[o0O0o000.values().length];
            try {
                iArr[o0O0o000.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0O0o000.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0O0o000.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13686o00oOOo0 = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOoO extends o0OOOOO0.o0oO0O0o implements o00oo<Class<?>, Class<?>> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // o0OOOO.o00oo
        public final Class<?> invoke(@NotNull Class<?> cls) {
            o0OOOOO0.o0ooO.o00oo0O0(cls, "p0");
            return cls.getComponentType();
        }
    }

    @o0O000
    public static final Type o00oOo00(o0O0OOOo o0o0oooo, boolean z) {
        o0O00o00 o00oo02 = o0o0oooo.o00oo0();
        if (o00oo02 instanceof o0OooO0) {
            return new oooOO0((o0OooO0) o00oo02);
        }
        if (!(o00oo02 instanceof o0O00OO)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + o0o0oooo);
        }
        o0O00OO o0o00oo = (o0O00OO) o00oo02;
        Class o00oOoO02 = z ? o0OOOO0o.o00oOOo0.o00oOoO0(o0o00oo) : o0OOOO0o.o00oOOo0.o00oOo0O(o0o00oo);
        List<oo0OOoo> arguments = o0o0oooo.getArguments();
        if (arguments.isEmpty()) {
            return o00oOoO02;
        }
        if (o00oOoO02.isArray()) {
            if (o00oOoO02.getComponentType().isPrimitive()) {
                return o00oOoO02;
            }
            oo0OOoo oo0oooo = (oo0OOoo) o0OO0oO.o0O0oo0o.o0Ooo(arguments);
            if (oo0oooo == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + o0o0oooo);
            }
            o0O0o000 o0o0o000 = oo0oooo.f13690o00oOOo0;
            o0O0OOOo o0o0oooo2 = oo0oooo.f13691o00oOOoO;
            int i = o0o0o000 == null ? -1 : o00oOOo0.f13686o00oOOo0[o0o0o000.ordinal()];
            if (i == -1 || i == 1) {
                return o00oOoO02;
            }
            if (i == 2 || i == 3) {
                o0OOOOO0.o0ooO.o00oo00O(o0o0oooo2);
                Type o00oOooO2 = o00oOooO(o0o0oooo2, false, 1, null);
                return o00oOooO2 instanceof Class ? o00oOoO02 : new o0OoO00O(o00oOooO2);
            }
            throw new o0OO0o.o0O0O0Oo();
        }
        return o00oOo0O(o00oOoO02, arguments);
    }

    @o0O000
    public static final Type o00oOo0O(Class<?> cls, List<oo0OOoo> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(list, 10));
            for (oo0OOoo oo0oooo : list) {
                arrayList.add(o00oOoO0(oo0oooo));
            }
            return new o0O0o00O(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(o0OO0oO.o0O00O.o0O000(list, 10));
            for (oo0OOoo oo0oooo2 : list) {
                arrayList2.add(o00oOoO0(oo0oooo2));
            }
            return new o0O0o00O(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type o00oOo0O2 = o00oOo0O(declaringClass, list.subList(length, list.size()));
            List<oo0OOoo> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(o0OO0oO.o0O00O.o0O000(subList, 10));
            for (oo0OOoo oo0oooo3 : subList) {
                arrayList3.add(o00oOoO0(oo0oooo3));
            }
            return new o0O0o00O(cls, o00oOo0O2, arrayList3);
        }
    }

    @NotNull
    public static final Type o00oOo0o(@NotNull o0O0OOOo o0o0oooo) {
        Type o00oOoOo2;
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oooo, "<this>");
        return (!(o0o0oooo instanceof o0OOOOO0.o0O0OO0) || (o00oOoOo2 = ((o0OOOOO0.o0O0OO0) o0o0oooo).o00oOoOo()) == null) ? o00oOooO(o0o0oooo, false, 1, null) : o00oOoOo2;
    }

    @o00oo0OO
    @o0O000
    @o0OO00o0(version = "1.4")
    public static /* synthetic */ void o00oOoO(o0O0OOOo o0o0oooo) {
    }

    public static final Type o00oOoO0(oo0OOoo oo0oooo) {
        o0O0o000 o0o0o000 = oo0oooo.f13690o00oOOo0;
        if (o0o0o000 == null) {
            o0O.f13679o00oo0Oo.getClass();
            return o0O.f13680o00oo0o0;
        }
        o0O0OOOo o0o0oooo = oo0oooo.f13691o00oOOoO;
        o0OOOOO0.o0ooO.o00oo00O(o0o0oooo);
        int i = o00oOOo0.f13686o00oOOo0[o0o0o000.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new o0O(o00oOo00(o0o0oooo, true), null);
                }
                throw new o0OO0o.o0O0O0Oo();
            }
            return o00oOo00(o0o0oooo, true);
        }
        return new o0O(null, o00oOo00(o0o0oooo, true));
    }

    @o0O000
    public static /* synthetic */ void o00oOoOO(oo0OOoo oo0oooo) {
    }

    public static final String o00oOoOo(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                oO000 o00oOooo2 = oO0OoOO0.o00oOooo(type, o00oOOoO.INSTANCE);
                name = ((Class) ooOOOOoo.o0O0o00o(o00oOooo2)).getName() + oO0O00o0.o0OO0o(o0Oo0Oo0.o0O0o00O.f15881o00oo0, ooOOOOoo.o0O000oo(o00oOooo2));
            } else {
                name = cls.getName();
            }
            o0OOOOO0.o0ooO.o00oo0OO(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }

    public static /* synthetic */ Type o00oOooO(o0O0OOOo o0o0oooo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return o00oOo00(o0o0oooo, z);
    }
}
