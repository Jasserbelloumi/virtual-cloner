package o0O0o0oO;

import android.content.Context;
import androidx.work.o00oOOoO;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o00oo0O;
import o0O0Ooo0.o00oo0O0;
import o0O0Ooo0.o0O000;
import o0O0Ooo0.o0O000Oo;
import o0O0Ooo0.o0O00O;
import o0O0Ooo0.o0O00OO;
import o0O0Ooo0.o0OoO00O;
/* loaded from: classes.dex */
public abstract class o0O0O0o0 {
    @oo0oO0
    public static o0O0O0o0 o00oo0OO(@oo0oO0 Context context) {
        o0O0O0o0 o00ooo02 = o0O00O0.o00ooOoO(context).o00ooo0();
        if (o00ooo02 != null) {
            return o00ooo02;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @oo0oO0
    public abstract o0O0O0Oo o00oOOo0(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O000> list);

    @oo0oO0
    public final o0O0O0Oo o00oOOoO(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 o0O000 o0o000) {
        return o00oOOo0(str, o00oo0o2, Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract o0O0O0Oo o00oOo00(@oo0oO0 List<o0O000> list);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOo0O();

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOo0o(@oo0oO0 String str);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOoO(@oo0oO0 UUID uuid);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOoO0(@oo0oO0 String str);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOoOO(@oo0oO0 List<o0O00OO> list);

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public abstract ListenableFuture<Void> o00oOoOo(@oo0oO0 o0O0Ooo0.o0O00O0 o0o00o0);

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOoo0(@oo0oO0 o0O00OO o0o00oo);

    @oo0oO0
    public final o0O0O0Oo o00oOooO(@oo0oO0 o0O000 o0o000) {
        return o00oOo00(Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract ListenableFuture<Void> o00oOooo(@oo0oO0 String str, @oo0oO0 o00oo0O0 o00oo0o02, @oo0oO0 o0O000Oo o0o000oo);

    @oo0oO0
    public final ListenableFuture<Void> o00oo0(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 o0O000 o0o000) {
        return o00oo00O(str, o00oo0o2, Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract ListenableFuture<Void> o00oo00O(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O000> list);

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public abstract ListenableFuture<Void> o00oo0O(@oo0oO0 UUID uuid, @oo0oO0 o00oOOoO o00ooooo2);

    @oo0oO0
    public abstract ListenableFuture<List<o0OoO00O>> o00oo0O0(@oo0oO0 o0O00O o0o00o);
}
