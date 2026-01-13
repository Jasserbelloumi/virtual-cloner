package o0OOOo;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "KClasses")
@o0OOO00({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O00OOO {
    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo0OO
    @NotNull
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    public static final <T> T o00oOOo0(@NotNull o0O00OO<T> o0o00oo, @Nullable Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo, "<this>");
        if (o0o00oo.o00oo0OO(obj)) {
            o0OOOOO0.o0ooO.o00oo0(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Value cannot be cast to ");
        o00oOOo02.append(o0o00oo.o00oo0O());
        throw new ClassCastException(o00oOOo02.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo0OO
    @Nullable
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    public static final <T> T o00oOOoO(@NotNull o0O00OO<T> o0o00oo, @Nullable Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo, "<this>");
        if (o0o00oo.o00oo0OO(obj)) {
            o0OOOOO0.o0ooO.o00oo0(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}
