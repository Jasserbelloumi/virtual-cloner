package androidx.fragment.app;

import androidx.lifecycle.o0OO0oO0;
import java.util.Collection;
import java.util.Map;
import o00oOooO.o0OO00OO;
@Deprecated
/* loaded from: classes.dex */
public class o0O00O0o {
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Collection<Fragment> f3060o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<String, o0O00O0o> f3061o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, o0OO0oO0> f3062o00oOo00;

    public o0O00O0o(@o0OO00OO Collection<Fragment> collection, @o0OO00OO Map<String, o0O00O0o> map, @o0OO00OO Map<String, o0OO0oO0> map2) {
        this.f3060o00oOOo0 = collection;
        this.f3061o00oOOoO = map;
        this.f3062o00oOo00 = map2;
    }

    @o0OO00OO
    public Map<String, o0O00O0o> o00oOOo0() {
        return this.f3061o00oOOoO;
    }

    @o0OO00OO
    public Collection<Fragment> o00oOOoO() {
        return this.f3060o00oOOo0;
    }

    @o0OO00OO
    public Map<String, o0OO0oO0> o00oOo00() {
        return this.f3062o00oOo00;
    }

    public boolean o00oOooO(Fragment fragment) {
        Collection<Fragment> collection = this.f3060o00oOOo0;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
