package o0OO0oO;

import java.util.Collection;
import o0OO0o.o0OOo000;
import o0OO0o.o0oo0000;
import o0OO0o.oO0000Oo;
import o0OO0o.oO0000o0;
import o0OO0o.oO0Oo0oo;
import o0OO0o.ooo0Oo0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0OOOO {
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUByte")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int o00oOOo0(@NotNull Iterable<o0OO0o.o0OOO0O> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        int i = 0;
        for (o0OO0o.o0OOO0O o0ooo0o : iterable) {
            i += o0OO0o.o0OOOO.o00oOooo(o0ooo0o.f13209o00oo0O0 & 255);
        }
        return i;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int o00oOOoO(@NotNull Iterable<o0OO0o.o0OOOO> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        int i = 0;
        for (o0OO0o.o0OOOO o0oooo : iterable) {
            i += o0oooo.f13218o00oo0O0;
        }
        return i;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long o00oOo00(@NotNull Iterable<o0oo0000> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        long j = 0;
        for (o0oo0000 o0oo0000Var : iterable) {
            j += o0oo0000Var.f13227o00oo0O0;
        }
        return j;
    }

    @o0OO0o.o0OoOoOo
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] o00oOo0O(@NotNull Collection<o0OO0o.o0OOO0O> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        byte[] o00oOo002 = o0OO0o.o0OOO0OO.o00oOo00(collection.size());
        int i = 0;
        for (o0OO0o.o0OOO0O o0ooo0o : collection) {
            o00oOo002[i] = o0ooo0o.f13209o00oo0O0;
            i++;
        }
        return o00oOo002;
    }

    @o0OO0o.o0OoOoOo
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final int[] o00oOo0o(@NotNull Collection<o0OO0o.o0OOOO> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        int[] o00oOo002 = o0OOo000.o00oOo00(collection.size());
        int i = 0;
        for (o0OO0o.o0OOOO o0oooo : collection) {
            o00oOo002[i] = o0oooo.f13218o00oo0O0;
            i++;
        }
        return o00oOo002;
    }

    @o0OO0o.o0OoOoOo
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final short[] o00oOoO(@NotNull Collection<oO0000Oo> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        short[] o00oOo002 = oO0000o0.o00oOo00(collection.size());
        int i = 0;
        for (oO0000Oo oo0000oo : collection) {
            o00oOo002[i] = oo0000oo.f13234o00oo0O0;
            i++;
        }
        return o00oOo002;
    }

    @o0OO0o.o0OoOoOo
    @o0OO0o.o0OO00o0(version = "1.3")
    @NotNull
    public static final long[] o00oOoO0(@NotNull Collection<o0oo0000> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "<this>");
        long[] o00oOo002 = ooo0Oo0.o00oOo00(collection.size());
        int i = 0;
        for (o0oo0000 o0oo0000Var : collection) {
            o00oOo002[i] = o0oo0000Var.f13227o00oo0O0;
            i++;
        }
        return o00oOo002;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUShort")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int o00oOooO(@NotNull Iterable<oO0000Oo> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        int i = 0;
        for (oO0000Oo oo0000oo : iterable) {
            i += o0OO0o.o0OOOO.o00oOooo(oo0000oo.f13234o00oo0O0 & oO0000Oo.f13232o00oo0o0);
        }
        return i;
    }
}
