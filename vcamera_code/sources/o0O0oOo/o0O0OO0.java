package o0O0oOo;

import android.graphics.Color;
import kotlin.Metadata;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0OoO00O;
import o00ooO00.o00oo0;
import o0O0oo0O.o0OO00OO;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oOOo0;
import o0OOOO.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0001\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¨\u0006\u0012"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "res", "attr", "Lkotlin/Function0;", "fallback", o00oOOoO.f12961o00oOo00, "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/lang/Integer;Lo0OOOO/o00oOOo0;)I", "", "attrs", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "forAttr", "o00oOooO", "", o00oo0.f8113o00oOoO0, "o00oOOo0", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0OO0 {
    @o0O00O
    @o0OoO00O
    public static final int o00oOOo0(int i, float f) {
        return Color.argb((int) (255 * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @o0O00O
    @o0OoO00O
    public static final int o00oOOoO(@NotNull o0OO00OO o0oo00oo, @o0O00OOO @Nullable Integer num, @o0O000Oo @Nullable Integer num2, @Nullable o00oOOo0<Integer> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$resolveColor");
        return o0OooO0.f12732o00oOOo0.o00oo0O0(o0oo00oo.f12800o00ooOo, num, num2, o00oooo02);
    }

    public static /* synthetic */ int o00oOo00(o0OO00OO o0oo00oo, Integer num, Integer num2, o00oOOo0 o00oooo02, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            o00oooo02 = null;
        }
        return o00oOOoO(o0oo00oo, num, num2, o00oooo02);
    }

    public static /* synthetic */ int[] o00oOo0O(o0OO00OO o0oo00oo, int[] iArr, o00oo o00ooVar, int i, Object obj) {
        if ((i & 2) != 0) {
            o00ooVar = null;
        }
        return o00oOooO(o0oo00oo, iArr, o00ooVar);
    }

    @o0OoO00O
    @NotNull
    public static final int[] o00oOooO(@NotNull o0OO00OO o0oo00oo, @NotNull int[] iArr, @Nullable o00oo<? super Integer, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$resolveColors");
        o0OOOOO0.o0ooO.o00oo0O(iArr, "attrs");
        return o0OooO0.f12732o00oOOo0.o00oo0Oo(o0oo00oo.f12800o00ooOo, iArr, o00ooVar);
    }
}
