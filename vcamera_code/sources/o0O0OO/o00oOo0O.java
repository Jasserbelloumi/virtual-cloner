package o0O0OO;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o0O00O0o;
import o0O0OOoO.o00ooO0;
/* loaded from: classes.dex */
public class o00oOo0O {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00ooO0.o00oOo00 f11291o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Context f11292o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f11293o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final List<o0O00O0o.o00oOOoO> f11294o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f11295o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Executor f11296o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O00O0o.o00oOo00 f11297o00oOoO0;
    @oo0oO0

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final Executor f11298o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final boolean f11299o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final boolean f11300o00oOoo0;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00O0o.o00oOo0O f11301o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final boolean f11302o00oOooo;
    @o0OO00OO

    /* renamed from: o00oo0  reason: collision with root package name */
    public final String f11303o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final Set<Integer> f11304o00oo00O;
    @o0OO00OO

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final File f11305o00oo0OO;

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo0O(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00ooO0.o00oOo00 o00ooo002, @oo0oO0 o0O00O0o.o00oOo0O o00ooo0o2, @o0OO00OO List<o0O00O0o.o00oOOoO> list, boolean z, o0O00O0o.o00oOo00 o00ooo003, @oo0oO0 Executor executor, @oo0oO0 Executor executor2, boolean z2, boolean z3, boolean z4, @o0OO00OO Set<Integer> set) {
        this(context, str, o00ooo002, o00ooo0o2, list, z, o00ooo003, executor, executor2, z2, z3, z4, set, null, null);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo0O(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00ooO0.o00oOo00 o00ooo002, @oo0oO0 o0O00O0o.o00oOo0O o00ooo0o2, @o0OO00OO List<o0O00O0o.o00oOOoO> list, boolean z, o0O00O0o.o00oOo00 o00ooo003, @oo0oO0 Executor executor, @oo0oO0 Executor executor2, boolean z2, boolean z3, boolean z4, @o0OO00OO Set<Integer> set, @o0OO00OO String str2, @o0OO00OO File file) {
        this.f11291o00oOOo0 = o00ooo002;
        this.f11292o00oOOoO = context;
        this.f11293o00oOo00 = str;
        this.f11301o00oOooO = o00ooo0o2;
        this.f11294o00oOo0O = list;
        this.f11295o00oOo0o = z;
        this.f11297o00oOoO0 = o00ooo003;
        this.f11296o00oOoO = executor;
        this.f11298o00oOoOO = executor2;
        this.f11299o00oOoOo = z2;
        this.f11300o00oOoo0 = z3;
        this.f11302o00oOooo = z4;
        this.f11304o00oo00O = set;
        this.f11303o00oo0 = str2;
        this.f11305o00oo0OO = file;
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo0O(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00ooO0.o00oOo00 o00ooo002, @oo0oO0 o0O00O0o.o00oOo0O o00ooo0o2, @o0OO00OO List<o0O00O0o.o00oOOoO> list, boolean z, o0O00O0o.o00oOo00 o00ooo003, @oo0oO0 Executor executor, boolean z2, @o0OO00OO Set<Integer> set) {
        this(context, str, o00ooo002, o00ooo0o2, list, z, o00ooo003, executor, executor, false, z2, false, set, null, null);
    }

    public boolean o00oOOo0(int i, int i2) {
        Set<Integer> set;
        if ((i > i2) && this.f11302o00oOooo) {
            return false;
        }
        return this.f11300o00oOoo0 && ((set = this.f11304o00oo00O) == null || !set.contains(Integer.valueOf(i)));
    }

    @Deprecated
    public boolean o00oOOoO(int i) {
        return o00oOOo0(i, i + 1);
    }
}
