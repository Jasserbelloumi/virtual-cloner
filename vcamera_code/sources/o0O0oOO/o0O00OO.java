package o0O0oOO;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003J)\u0010\b\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0013H&J\b\u0010\u0018\u001a\u00020\u0007H&¨\u0006\u0019"}, d2 = {"Lo0O0oOO/o0O00OO;", "IT", "SL", "", "", FirebaseAnalytics.Param.ITEMS, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lo0OO0o/oO0Ooooo;", "o00oOoOo", "(Ljava/util/List;Ljava/lang/Object;)V", "", "indices", "o00oo0OO", "o00oo0o", "o00oOoo0", "o00oo0Oo", "o00oOoO", "o00oo0", "o00oOo00", "", FirebaseAnalytics.Param.INDEX, "", "o00oo0oO", "getItemCount", "o00oo0O0", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface o0O00OO<IT, SL> {

    @o0OO0o.o0O0oo0o(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void o00oOOo0(o0O00OO o0o00oo, List list, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceItems");
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            o0o00oo.o00oOoOo(list, obj);
        }
    }

    int getItemCount();

    void o00oOo00();

    void o00oOoO();

    void o00oOoOo(@NotNull List<? extends IT> list, @Nullable SL sl);

    void o00oOoo0(@NotNull int[] iArr);

    void o00oo0();

    void o00oo0O0();

    void o00oo0OO(@NotNull int[] iArr);

    void o00oo0Oo(@NotNull int[] iArr);

    void o00oo0o(@NotNull int[] iArr);

    boolean o00oo0oO(int i);
}
