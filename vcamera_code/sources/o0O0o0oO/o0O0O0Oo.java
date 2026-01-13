package o0O0o0oO;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O000;
/* loaded from: classes.dex */
public abstract class o0O0O0Oo {
    @oo0oO0
    public static o0O0O0Oo o00oOOo0(@oo0oO0 List<o0O0O0Oo> list) {
        return list.get(0).o00oOOoO(list);
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public abstract o0O0O0Oo o00oOOoO(@oo0oO0 List<o0O0O0Oo> list);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOo00();

    @oo0oO0
    public final o0O0O0Oo o00oOo0O(@oo0oO0 o0O000 o0o000) {
        return o00oOooO(Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract o0O0O0Oo o00oOooO(@oo0oO0 List<o0O000> list);
}
