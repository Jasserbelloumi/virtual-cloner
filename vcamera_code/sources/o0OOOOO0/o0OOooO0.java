package o0OOOOO0;

import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes3.dex */
public class o0OOooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OO0o00 f13632o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f13633o00oOOoO = " (Kotlin reflection is not available)";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0OOOo.o0O00OO[] f13634o00oOo00;

    static {
        o0OO0o00 o0oo0o00 = null;
        try {
            o0oo0o00 = (o0OO0o00) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o0oo0o00 == null) {
            o0oo0o00 = new o0OO0o00();
        }
        f13632o00oOOo0 = o0oo0o00;
        f13634o00oOo00 = new o0OOOo.o0O00OO[0];
    }

    public static o0OOOo.o0O00OO o00oOOo0(Class cls) {
        return f13632o00oOOo0.o00oOOo0(cls);
    }

    public static o0OOOo.o0O00OO o00oOOoO(Class cls, String str) {
        return f13632o00oOOo0.o00oOOoO(cls, str);
    }

    public static o0OOOo.o0O0O0O o00oOo00(o0O0O0O o0o0o0o) {
        return f13632o00oOOo0.o00oOo00(o0o0o0o);
    }

    public static o0OOOo.o0O00OO o00oOo0O(Class cls, String str) {
        return f13632o00oOOo0.o00oOo0O(cls, str);
    }

    public static o0OOOo.o0O00OO[] o00oOo0o(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f13634o00oOo00;
        }
        o0OOOo.o0O00OO[] o0o00ooArr = new o0OOOo.o0O00OO[length];
        for (int i = 0; i < length; i++) {
            o0o00ooArr[i] = o00oOooO(clsArr[i]);
        }
        return o0o00ooArr;
    }

    public static o0OOOo.o0O00oO0 o00oOoO(Class cls, String str) {
        return f13632o00oOOo0.o00oOo0o(cls, str);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O00oO0 o00oOoO0(Class cls) {
        return f13632o00oOOo0.o00oOo0o(cls, "");
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public static o0OOOo.o0O0OOOo o00oOoOO(o0OOOo.o0O0OOOo o0o0oooo) {
        return f13632o00oOOo0.o00oOoO0(o0o0oooo);
    }

    public static o0OOOo.o0O0oo0o o00oOoOo(o0O0o00 o0o0o00) {
        return f13632o00oOOo0.o00oOoO(o0o0o00);
    }

    public static o0OOOo.o0O0O0Oo o00oOoo0(o0O0o0 o0o0o0) {
        return f13632o00oOOo0.o00oOoOO(o0o0o0);
    }

    public static o0OOOo.o0O00OO o00oOooO(Class cls) {
        return f13632o00oOOo0.o00oOooO(cls);
    }

    public static o0OOOo.o0O0O0o0 o00oOooo(oooOO0 ooooo0) {
        return f13632o00oOOo0.o00oOoOo(ooooo0);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static String o00oo(o0O00o00 o0o00o00) {
        return f13632o00oOOo0.o00oo0O0(o0o00o00);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00oo0(Class cls) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Collections.emptyList(), true);
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public static o0OOOo.o0O0OOOo o00oo00O(o0OOOo.o0O0OOOo o0o0oooo) {
        return f13632o00oOOo0.o00oOoo0(o0o0oooo);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00oo0O(Class cls, o0OOOo.oo0OOoo... oo0ooooArr) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), o0OO0oO.o0O000O.oooO0O0O(oo0ooooArr), true);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00oo0O0(Class cls, o0OOOo.oo0OOoo oo0oooo, o0OOOo.oo0OOoo oo0oooo2) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Arrays.asList(oo0oooo, oo0oooo2), true);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00oo0OO(Class cls, o0OOOo.oo0OOoo oo0oooo) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Collections.singletonList(oo0oooo), true);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00oo0Oo(o0OOOo.o0O00o00 o0o00o00) {
        return f13632o00oOOo0.o00oo0o0(o0o00o00, Collections.emptyList(), true);
    }

    public static o0OOOo.o0O0OO o00oo0o(oo0oO0 oo0oo0) {
        return f13632o00oOOo0.o00oo00O(oo0oo0);
    }

    @o0OO0o.o0OO00o0(version = "1.6")
    public static o0OOOo.o0O0OOOo o00oo0o0(o0OOOo.o0O0OOOo o0o0oooo, o0OOOo.o0O0OOOo o0o0oooo2) {
        return f13632o00oOOo0.o00oOooo(o0o0oooo, o0o0oooo2);
    }

    public static o0OOOo.o0O0OOO0 o00oo0oO(o0OO00OO o0oo00oo) {
        return f13632o00oOOo0.o00oo0(o0oo00oo);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00ooO(Class cls, o0OOOo.oo0OOoo oo0oooo) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Collections.singletonList(oo0oooo), false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static void o00ooO0(o0OOOo.o0OooO0 o0oooo0, o0OOOo.o0O0OOOo o0o0oooo) {
        f13632o00oOOo0.o00oo0Oo(o0oooo0, Collections.singletonList(o0o0oooo));
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static String o00ooO00(o0O0OO o0o0oo) {
        return f13632o00oOOo0.o00oo0O(o0o0oo);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static void o00ooO0O(o0OOOo.o0OooO0 o0oooo0, o0OOOo.o0O0OOOo... o0o0ooooArr) {
        f13632o00oOOo0.o00oo0Oo(o0oooo0, o0OO0oO.o0O000O.oooO0O0O(o0o0ooooArr));
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00ooO0o(Class cls) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Collections.emptyList(), false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00ooOO(Class cls, o0OOOo.oo0OOoo... oo0ooooArr) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), o0OO0oO.o0O000O.oooO0O0O(oo0ooooArr), false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00ooOO0(Class cls, o0OOOo.oo0OOoo oo0oooo, o0OOOo.oo0OOoo oo0oooo2) {
        return f13632o00oOOo0.o00oo0o0(o00oOooO(cls), Arrays.asList(oo0oooo, oo0oooo2), false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0O0OOOo o00ooOOo(o0OOOo.o0O00o00 o0o00o00) {
        return f13632o00oOOo0.o00oo0o0(o0o00o00, Collections.emptyList(), false);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static o0OOOo.o0OooO0 o00ooOo0(Object obj, String str, o0OOOo.o0O0o000 o0o0o000, boolean z) {
        return f13632o00oOOo0.o00oo0o(obj, str, o0o0o000, z);
    }

    public static o0OOOo.o0O0OOO o0O0o(o0OoOoO o0ooooo) {
        return f13632o00oOOo0.o00oo0OO(o0ooooo);
    }
}
