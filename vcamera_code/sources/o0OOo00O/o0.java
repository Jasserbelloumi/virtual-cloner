package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO/o00oo0;", "context", "Lkotlin/Function2;", "Lo0OOo00O/o0O0oo00;", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "block", "o00oOOo0", "(Lo0OO/o00oo0;Lo0OOOO/o0O00000;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 {
    public static final <T> T o00oOOo0(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O00000<? super o0O0oo00, ? super o00oOo0O<? super T>, ? extends Object> o0o00000) throws InterruptedException {
        o0OOo000 o00oOOo02;
        oO000 oo000;
        Thread currentThread = Thread.currentThread();
        o0OO.o00oOoO o00oooo2 = (o0OO.o00oOoO) o00oo0Var.get(o0OO.o00oOoO.f12926o00oOo0o);
        if (o00oooo2 == null) {
            o00oOOo02 = oO0O00.f14094o00oOOo0.o00oOOoO();
            oo000 = oO000.f14062o00oo0O0;
            o00oo0Var = o00oo0Var.plus(o00oOOo02);
        } else {
            o0OOo000 o0ooo000 = o00oooo2 instanceof o0OOo000 ? (o0OOo000) o00oooo2 : null;
            if (o0ooo000 != null) {
                o0OOo000 o0ooo0002 = o0ooo000.o0OO00OO() ? o0ooo000 : null;
                if (o0ooo0002 != null) {
                    o00oOOo02 = o0ooo0002;
                    oo000 = oO000.f14062o00oo0O0;
                }
            }
            o00oOOo02 = oO0O00.f14094o00oOOo0.o00oOOo0();
            oo000 = oO000.f14062o00oo0O0;
        }
        o00oo o00ooVar = new o00oo(oo0OOoo.o00oOo0O(oo000, o00oo0Var), currentThread, o00oOOo02);
        o0OO000.DEFAULT.invoke(o0o00000, o00ooVar, o00ooVar);
        return (T) o00ooVar.o0O0oOo();
    }

    public static Object o00oOOoO(o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        return o00oOOo0(o00oo0Var, o0o00000);
    }
}
