package o0OOo00O;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OOO00o.o00oOOo0;
import o0OOO00o.o00oOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0O0Oo0 {
    @Nullable
    public static final Object o00oOOo0(@NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        Object obj;
        o0OO.o00oo0 context = o00ooo0o2.getContext();
        oO00O0o0.o00ooO00(context);
        o00oOo0O o00oOooO2 = o00oOo00.o00oOooO(o00ooo0o2);
        o0OOo0o0.o0OoOoO o0ooooo = o00oOooO2 instanceof o0OOo0o0.o0OoOoO ? (o0OOo0o0.o0OoOoO) o00oOooO2 : null;
        if (o0ooooo == null) {
            obj = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        } else {
            if (o0ooooo.f14638o00oo0o0.o0O0oOoO(context)) {
                o0ooooo.o00oo0(context, o0OO0o.oO0Ooooo.f13240o00oOOo0);
            } else {
                oOo0oooO ooo0oooo = new oOo0oooO();
                o0OO.o00oo0 plus = context.plus(ooo0oooo);
                o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                o0ooooo.o00oo0(plus, oo0ooooo);
                if (ooo0oooo.f14125o00oo0O && !o0OOo0o0.o0OO00o.o00oOoO(o0ooooo)) {
                    obj = oo0ooooo;
                }
            }
            obj = o00oOOo0.COROUTINE_SUSPENDED;
        }
        o00oOOo0 o00oooo02 = o00oOOo0.COROUTINE_SUSPENDED;
        if (obj == o00oooo02) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return obj == o00oooo02 ? obj : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }
}
