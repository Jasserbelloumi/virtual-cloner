package o0O000;

import android.os.PersistableBundle;
import java.util.Map;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO0o.o0O0o00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\b\u0010\b\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0007¨\u0006\u000b"}, d2 = {"", "Lo0OO0o/o0O0o00;", "", "", "pairs", "Landroid/os/PersistableBundle;", o0OO000o.o00oOOoO.f12961o00oOo00, "([Lo0OO0o/o0O0o00;)Landroid/os/PersistableBundle;", "o00oOOo0", "", "o00oOo00", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O00O {
    @o0OOooO0(21)
    @NotNull
    public static final PersistableBundle o00oOOo0() {
        return o0OoO00O.o00oOOo0(0);
    }

    @o0OOooO0(21)
    @NotNull
    public static final PersistableBundle o00oOOoO(@NotNull o0O0o00<String, ? extends Object>... o0o0o00Arr) {
        o0ooO.o00oo0O0(o0o0o00Arr, "pairs");
        PersistableBundle o00oOOo02 = o0OoO00O.o00oOOo0(o0o0o00Arr.length);
        for (o0O0o00<String, ? extends Object> o0o0o00 : o0o0o00Arr) {
            o0OoO00O.o00oOOoO(o00oOOo02, o0o0o00.component1(), o0o0o00.component2());
        }
        return o00oOOo02;
    }

    @o0OOooO0(21)
    @NotNull
    public static final PersistableBundle o00oOo00(@NotNull Map<String, ? extends Object> map) {
        o0ooO.o00oo0O0(map, "<this>");
        PersistableBundle o00oOOo02 = o0OoO00O.o00oOOo0(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            o0OoO00O.o00oOOoO(o00oOOo02, entry.getKey(), entry.getValue());
        }
        return o00oOOo02;
    }
}
