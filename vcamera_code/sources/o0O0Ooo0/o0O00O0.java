package o0O0Ooo0;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O00O0 {
    @oo0oO0
    public static o0O00O0 o00oOOo0(@oo0oO0 List<o0O00O0> list) {
        return list.get(0).o00oOOoO(list);
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public abstract o0O00O0 o00oOOoO(@oo0oO0 List<o0O00O0> list);

    @oo0oO0
    public abstract o0O000O o00oOo00();

    @oo0oO0
    public abstract LiveData<List<o0OoO00O>> o00oOo0O();

    @oo0oO0
    public abstract o0O00O0 o00oOo0o(@oo0oO0 List<o0O000> list);

    @oo0oO0
    public final o0O00O0 o00oOoO0(@oo0oO0 o0O000 o0o000) {
        return o00oOo0o(Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract ListenableFuture<List<o0OoO00O>> o00oOooO();
}
