package o0OOo0Oo;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO000o.o00oOOoO;
import o0OOO0.o00oo0OO;
import o0OOO00o.o00oOOo0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO0OO;
import o0OOo0OO.o0OO0;
import o0OOo0OO.o0OO00o;
import o0OOo0o0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lo0OOo0Oo/oO00OOO;", o00oOOoO.f12961o00oOo00, "Lo0OOo0OO/o0OO0;", "Lo0OO/o00oo0;", "emitContext", "o00oOo0O", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "block", "o00oOo00", "(Lo0OO/o00oo0;Ljava/lang/Object;Ljava/lang/Object;Lo0OOOO/o0O00000;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00OOOo {
    @NotNull
    public static final <T> oO00OOO<T> o00oOOoO(@NotNull o0OO00o<? extends T> o0oo00o) {
        oO00OOO<T> oo00ooo = o0oo00o instanceof oO00OOO ? (oO00OOO) o0oo00o : null;
        return oo00ooo == null ? new oO00Oo0(o0oo00o, null, 0, null, 14, null) : oo00ooo;
    }

    @Nullable
    public static final <T, V> Object o00oOo00(@NotNull o00oo0 o00oo0Var, V v, @NotNull Object obj, @NotNull o0O00000<? super V, ? super o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        Object o00oOo002 = ooOOOOoo.o00oOo00(o00oo0Var, obj);
        try {
            Object invoke = ((o0O00000) o0OOO0OO.o00oo0O(o0o00000, 2)).invoke(v, new oO0O00O(o00ooo0o2, o00oo0Var));
            ooOOOOoo.o00oOOo0(o00oo0Var, o00oOo002);
            if (invoke == o00oOOo0.COROUTINE_SUSPENDED) {
                o00oo0OO.o00oOo00(o00ooo0o2);
            }
            return invoke;
        } catch (Throwable th) {
            ooOOOOoo.o00oOOo0(o00oo0Var, o00oOo002);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> o0OO0<T> o00oOo0O(o0OO0<? super T> o0oo0, o00oo0 o00oo0Var) {
        return o0oo0 instanceof oO0O00 ? true : o0oo0 instanceof oOo0000O ? o0oo0 : new oO0O00oO(o0oo0, o00oo0Var);
    }

    public static /* synthetic */ Object o00oOooO(o00oo0 o00oo0Var, Object obj, Object obj2, o0O00000 o0o00000, o00oOo0O o00ooo0o2, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ooOOOOoo.o00oOOoO(o00oo0Var);
        }
        return o00oOo00(o00oo0Var, obj, obj2, o0o00000, o00ooo0o2);
    }
}
