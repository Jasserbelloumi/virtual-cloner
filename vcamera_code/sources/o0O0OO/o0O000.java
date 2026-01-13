package o0O0OO;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import o00oOooO.o0o0000;
/* loaded from: classes.dex */
public class o0O000 {
    @o0o0000

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<LiveData> f11310o00oOOo0 = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00O0o f11311o00oOOoO;

    public o0O000(o0O00O0o o0o00o0o) {
        this.f11311o00oOOoO = o0o00o0o;
    }

    public <T> LiveData<T> o00oOOo0(String[] strArr, boolean z, Callable<T> callable) {
        return new androidx.room.o00oOoO(this.f11311o00oOOoO, this, z, callable, strArr);
    }

    public void o00oOOoO(LiveData liveData) {
        this.f11310o00oOOo0.add(liveData);
    }

    public void o00oOo00(LiveData liveData) {
        this.f11310o00oOOo0.remove(liveData);
    }
}
