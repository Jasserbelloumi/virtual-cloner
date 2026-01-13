package o0OOOOO0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oOo0oooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n442#3:215\n392#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O000Oo implements o0OOOo.o0O00OO<Object>, o0OoOoOo {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o00oOOo0 f13562o00oo0O = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final Map<Class<? extends o0OO0o.o0O000o0<?>>, Integer> f13563o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final HashMap<String, String> f13564o00oo0o;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final HashMap<String, String> f13565o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final HashMap<String, String> f13566o00oo0oO;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final Map<String, String> f13567o0O0o;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Class<?> f13568o00oo0O0;

    @o0OOO00({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @Nullable
        public final String o00oOOo0(@NotNull Class<?> cls) {
            String str;
            o0ooO.o00oo0O0(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) o0O000Oo.f13566o00oo0oO.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) o0O000Oo.f13566o00oo0oO.get(componentType.getName())) != null) {
                str2 = o00oOoOo.o00oo.o00oOOo0(str, "Array");
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        @Nullable
        public final String o00oOOoO(@NotNull Class<?> cls) {
            String str;
            o0ooO.o00oo0O0(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        o0ooO.o00oo0OO(simpleName, "name");
                        String o0o0o00O = oO0O0.o0o0o00O(simpleName, enclosingMethod.getName() + oOo0oooO.f13904o00oOo00, null, 2, null);
                        if (o0o0o00O != null) {
                            return o0o0o00O;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    o0ooO.o00oo0OO(simpleName, "name");
                    if (enclosingConstructor != null) {
                        return oO0O0.o0o0o00O(simpleName, enclosingConstructor.getName() + oOo0oooO.f13904o00oOo00, null, 2, null);
                    }
                    return oO0O0.o0o0000(simpleName, oOo0oooO.f13904o00oOo00, null, 2, null);
                } else if (!cls.isArray()) {
                    String str3 = (String) o0O000Oo.f13567o0O0o.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                } else {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) o0O000Oo.f13567o0O0o.get(componentType.getName())) != null) {
                        str2 = o00oOoOo.o00oo.o00oOOo0(str, "Array");
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }

        public final boolean o00oOo00(@Nullable Object obj, @NotNull Class<?> cls) {
            o0ooO.o00oo0O0(cls, "jClass");
            Map map = o0O000Oo.f13563o00oo0Oo;
            o0ooO.o00oo0(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return o0OOO0OO.o00ooO(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = o0OOOO0o.o00oOOo0.o00oOoO0(o0OOOO0o.o00oOOo0.o00oOoOO(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List o00ooo0O2 = o0OO0oO.o0O00O0o.o00ooo0O(o0OOOO.o00oOOo0.class, o0OOOO.o00oo.class, o0OOOO.o0O00000.class, o0OOOO.o0O0000O.class, o0OOOO.o0O000.class, o0OOOO.o0O000O.class, o0OOOO.o0OoOoOo.class, o0OOOO.o0O000Oo.class, o0OOOO.o0O000o0.class, o0OOOO.o0O00.class, o0OOOO.o00oOOoO.class, o0OOOO.o00oOo00.class, o0OOOO.o00oOo0O.class, o0OOOO.o00oOoO.class, o0OOOO.o00oo00O.class, o0OOOO.o00oo0.class, o0OOOO.o00oo0OO.class, o0OOOO.o00oo0O0.class, o0OOOO.o00oo0O.class, o0OOOO.o0O0o.class, o0OOOO.o00ooO0.class, o0OOOO.o00ooO.class, o0OOOO.o0.class);
        ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(o00ooo0O2, 10));
        for (Object obj : o00ooo0O2) {
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            arrayList.add(new o0OO0o.o0O0o00((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f13563o00oo0Oo = o0OO0oO.oo0ooO.o0O0O0o0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f13565o00oo0o0 = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f13564o00oo0o = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        o0ooO.o00oo0OO(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            o0ooO.o00oo0OO(str, "kotlinName");
            sb.append(oO0O0.o0o000O0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            o0OO0o.o0O0o00 o0o0o00 = new o0OO0o.o0O0o00(sb.toString(), o00oOoOo.o00oo.o00oOOo0(str, ".Companion"));
            hashMap3.put(o0o0o00.getFirst(), o0o0o00.getSecond());
        }
        for (Map.Entry<Class<? extends o0OO0o.o0O000o0<?>>, Integer> entry : f13563o00oo0Oo.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f13566o00oo0oO = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0OO0oO.oo0oO0.o00oOoOo(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), oO0O0.o0o000O0((String) entry2.getValue(), '.', null, 2, null));
        }
        f13567o0O0o = linkedHashMap;
    }

    public o0O000Oo(@NotNull Class<?> cls) {
        o0ooO.o00oo0O0(cls, "jClass");
        this.f13568o00oo0O0 = cls;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOO() {
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooOO0() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOOo() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOo() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOo0() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOoO() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooOoo() {
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static /* synthetic */ void o00ooo0() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooo00() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooo0O() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00ooo0o() {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static /* synthetic */ void o00oooO() {
    }

    @o0OO0o.o0OO00o0(version = "1.5")
    public static /* synthetic */ void o00oooOO() {
    }

    @Override // o0OOOo.o0O00OO
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o0O000Oo) && o0ooO.o00oOoO0(o0OOOO0o.o00oOOo0.o00oOoO0(this), o0OOOO0o.o00oOOo0.o00oOoO0((o0OOOo.o0O00OO) obj));
    }

    @Override // o0OOOo.o0O00O0o
    @NotNull
    public List<Annotation> getAnnotations() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @NotNull
    public List<o0OOOo.o0OooO0> getTypeParameters() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @Nullable
    public o0OOOo.o0O0o00 getVisibility() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public int hashCode() {
        return o0OOOO0o.o00oOOo0.o00oOoO0(this).hashCode();
    }

    @Override // o0OOOo.o0O00OO
    public boolean isAbstract() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean isFinal() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean isOpen() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO, o0OOOo.o0O00oO0
    @NotNull
    public Collection<o0OOOo.o0O00O<?>> o00oOOo0() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @NotNull
    public Collection<o0OOOo.o0O00OO<?>> o00oOOoO() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @NotNull
    public Collection<o0OOOo.o0O0O0O<Object>> o00oOo00() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @NotNull
    public List<o0OOOo.o0O00OO<? extends Object>> o00oOo0o() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00oOoO0() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @Nullable
    public Object o00oOoOO() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00oOoo0() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00oOooo() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @Nullable
    public String o00oo0O() {
        return f13562o00oo0O.o00oOOo0(this.f13568o00oo0O0);
    }

    @Override // o0OOOOO0.o0OoOoOo
    @NotNull
    public Class<?> o00oo0O0() {
        return this.f13568o00oo0O0;
    }

    @Override // o0OOOo.o0O00OO
    @o0OO0o.o0OO00o0(version = "1.1")
    public boolean o00oo0OO(@Nullable Object obj) {
        return f13562o00oo0O.o00oOo00(obj, this.f13568o00oo0O0);
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00oo0Oo() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00oo0o0() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @Nullable
    public String o00oo0oO() {
        return f13562o00oo0O.o00oOOoO(this.f13568o00oo0O0);
    }

    public final Void o00ooO() {
        throw new o0OOOO0o.o0O0000O();
    }

    @Override // o0OOOo.o0O00OO
    public boolean o00ooO0() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @Override // o0OOOo.o0O00OO
    @NotNull
    public List<o0OOOo.o0O0OOOo> o0O0o() {
        o00ooO();
        throw new o0OO0o.o0OoO00O();
    }

    @NotNull
    public String toString() {
        return this.f13568o00oo0O0.toString() + o0OOooO0.f13633o00oOOoO;
    }
}
