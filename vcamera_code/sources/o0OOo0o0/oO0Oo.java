package o0OOo0o0;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00oOoO;
import o0OOo00O.oO00OO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lo0OOo0o0/oO0Oo;", "", "Lo0OOo00O/oO00OO;", "o00oOOo0", "", o00oOOoO.f12961o00oOo00, "Z", "FAST_SERVICE_LOADER_ENABLED", "o00oOo00", "Lo0OOo00O/oO00OO;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0Oo {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO0Oo f14658o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f14659o00oOOoO;
    @o00oOoO
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final oO00OO f14660o00oOo00;

    static {
        oO0Oo oo0oo = new oO0Oo();
        f14658o00oOOo0 = oo0oo;
        f14659o00oOOoO = oO000OOo.o00oOo00(o0oo0000.f14642o00oOOo0, true);
        f14660o00oOo00 = oo0oo.o00oOOo0();
    }

    public final oO00OO o00oOOo0() {
        Object next;
        oO00OO o00oOo0o2;
        try {
            List<o0o0000> o00oOooO2 = f14659o00oOOoO ? o0OO0O0.f14581o00oOOo0.o00oOooO() : o0OOOoO0.ooOOOOoo.o0OOo0O0(o0OOOoO0.oO0OoOO0.o00oOo0O(ServiceLoader.load(o0o0000.class, o0o0000.class.getClassLoader()).iterator()));
            Iterator<T> it = o00oOooO2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int o00oOo002 = ((o0o0000) next).o00oOo00();
                    do {
                        Object next2 = it.next();
                        int o00oOo003 = ((o0o0000) next2).o00oOo00();
                        if (o00oOo002 < o00oOo003) {
                            next = next2;
                            o00oOo002 = o00oOo003;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            o0o0000 o0o0000Var = (o0o0000) next;
            return (o0o0000Var == null || (o00oOo0o2 = o0oo0000.o00oOo0o(o0o0000Var, o00oOooO2)) == null) ? o0oo0000.o00oOOoO(null, null, 3, null) : o00oOo0o2;
        } catch (Throwable th) {
            return o0oo0000.o00oOOoO(th, null, 2, null);
        }
    }
}
