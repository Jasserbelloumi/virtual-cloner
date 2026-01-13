package o0O0Ooo0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.o00oOOo0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o00oOooO.oo0oO0;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class o0O00O0o {
    @oo0oO0
    public static o0O00O0o o00oo0O0(@oo0oO0 Context context) {
        return o0O0Ooo.o0O00O0.o00ooOoO(context);
    }

    @oo0oO0
    @Deprecated
    public static o0O00O0o o00oo0OO() {
        o0O0Ooo.o0O00O0 o00ooOo2 = o0O0Ooo.o0O00O0.o00ooOo();
        if (o00ooOo2 != null) {
            return o00ooOo2;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void o00ooO0o(@oo0oO0 Context context, @oo0oO0 o00oOOo0 o00oooo02) {
        o0O0Ooo.o0O00O0.o00ooO0o(context, o00oooo02);
    }

    @oo0oO0
    public abstract o0O00O0 o00oOOo0(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O000> list);

    @oo0oO0
    public final o0O00O0 o00oOOoO(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 o0O000 o0o000) {
        return o00oOOo0(str, o00oo0o2, Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract o0O00O0 o00oOo00(@oo0oO0 List<o0O000> list);

    @oo0oO0
    public abstract o0O000O o00oOo0O();

    @oo0oO0
    public abstract o0O000O o00oOo0o(@oo0oO0 String str);

    @oo0oO0
    public abstract o0O000O o00oOoO(@oo0oO0 UUID uuid);

    @oo0oO0
    public abstract o0O000O o00oOoO0(@oo0oO0 String str);

    @oo0oO0
    public abstract PendingIntent o00oOoOO(@oo0oO0 UUID uuid);

    @oo0oO0
    public abstract o0O000O o00oOoOo(@oo0oO0 List<? extends o0O00OO> list);

    @oo0oO0
    public final o0O000O o00oOoo0(@oo0oO0 o0O00OO o0o00oo) {
        return o00oOoOo(Collections.singletonList(o0o00oo));
    }

    @oo0oO0
    public final o0O00O0 o00oOooO(@oo0oO0 o0O000 o0o000) {
        return o00oOo00(Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract o0O000O o00oOooo(@oo0oO0 String str, @oo0oO0 o00oo0O0 o00oo0o02, @oo0oO0 o0O000Oo o0o000oo);

    @oo0oO0
    public abstract LiveData<List<o0OoO00O>> o00oo(@oo0oO0 String str);

    @oo0oO0
    public o0O000O o00oo0(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 o0O000 o0o000) {
        return o00oo00O(str, o00oo0o2, Collections.singletonList(o0o000));
    }

    @oo0oO0
    public abstract o0O000O o00oo00O(@oo0oO0 String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<o0O000> list);

    @oo0oO0
    public abstract ListenableFuture<Long> o00oo0O();

    @oo0oO0
    public abstract LiveData<Long> o00oo0Oo();

    @oo0oO0
    public abstract LiveData<o0OoO00O> o00oo0o(@oo0oO0 UUID uuid);

    @oo0oO0
    public abstract ListenableFuture<o0OoO00O> o00oo0o0(@oo0oO0 UUID uuid);

    @oo0oO0
    public abstract ListenableFuture<List<o0OoO00O>> o00oo0oO(@oo0oO0 o0O00O o0o00o);

    @oo0oO0
    public abstract o0O000O o00ooO();

    @oo0oO0
    public abstract LiveData<List<o0OoO00O>> o00ooO0(@oo0oO0 String str);

    @oo0oO0
    public abstract ListenableFuture<List<o0OoO00O>> o00ooO00(@oo0oO0 String str);

    @oo0oO0
    public abstract LiveData<List<o0OoO00O>> o00ooO0O(@oo0oO0 o0O00O o0o00o);

    @oo0oO0
    public abstract ListenableFuture<List<o0OoO00O>> o0O0o(@oo0oO0 String str);
}
