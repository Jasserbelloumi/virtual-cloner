package o0OOO0;

import java.lang.reflect.Field;
import java.util.ArrayList;
import o00ooOoo.oO0O0O0;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f13435o00oOOo0 = 1;

    public static final void o00oOOo0(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    public static final o00oo00O o00oOOoO(o00oOOo0 o00oooo02) {
        return (o00oo00O) o00oooo02.getClass().getAnnotation(o00oo00O.class);
    }

    public static final int o00oOo00(o00oOOo0 o00oooo02) {
        try {
            Field declaredField = o00oooo02.getClass().getDeclaredField(oO0O0O0.f9051o00oOoo0);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(o00oooo02);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @o0OOOO0o.o00oo0OO(name = "getStackTraceElement")
    @o0OO00o0(version = "1.3")
    @Nullable
    public static final StackTraceElement o00oOo0O(@NotNull o00oOOo0 o00oooo02) {
        String str;
        o0ooO.o00oo0O0(o00oooo02, "<this>");
        o00oo00O o00oOOoO2 = o00oOOoO(o00oooo02);
        if (o00oOOoO2 == null) {
            return null;
        }
        o00oOOo0(1, o00oOOoO2.v());
        int o00oOo002 = o00oOo00(o00oooo02);
        int i = o00oOo002 < 0 ? -1 : o00oOOoO2.l()[o00oOo002];
        String o00oOOoO3 = o00oo0O0.f13436o00oOOo0.o00oOOoO(o00oooo02);
        if (o00oOOoO3 == null) {
            str = o00oOOoO2.c();
        } else {
            str = o00oOOoO3 + '/' + o00oOOoO2.c();
        }
        return new StackTraceElement(str, o00oOOoO2.m(), o00oOOoO2.f(), i);
    }

    @o0OOOO0o.o00oo0OO(name = "getSpilledVariableFieldMapping")
    @o0OO00o0(version = "1.3")
    @Nullable
    public static final String[] o00oOooO(@NotNull o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "<this>");
        o00oo00O o00oOOoO2 = o00oOOoO(o00oooo02);
        if (o00oOOoO2 == null) {
            return null;
        }
        o00oOOo0(1, o00oOOoO2.v());
        ArrayList arrayList = new ArrayList();
        int o00oOo002 = o00oOo00(o00oooo02);
        int[] i = o00oOOoO2.i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == o00oOo002) {
                arrayList.add(o00oOOoO2.s()[i2]);
                arrayList.add(o00oOOoO2.n()[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
