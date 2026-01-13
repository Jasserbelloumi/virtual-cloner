package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00oo;
import o0O0Ooo0.o0O000o0;
import o0O0Ooo0.o0O00OOO;
import o0oOo0O0.oO00O0oO;
/* loaded from: classes.dex */
public final class WorkerParameters {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public UUID f5549o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOoO f5550o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Set<String> f5551o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f5552o00oOo0O;
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Executor f5553o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o0O00OOO f5554o00oOoO;
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public oO00O0oO f5555o00oOoO0;
    @oo0oO0

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O000o0 f5556o00oOoOO;
    @oo0oO0

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oo f5557o00oOoOo;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oOOo0 f5558o00oOooO;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public List<String> f5559o00oOOo0 = Collections.emptyList();
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public List<Uri> f5560o00oOOoO = Collections.emptyList();
        @o0OOooO0(28)

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Network f5561o00oOo00;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public WorkerParameters(@oo0oO0 UUID uuid, @oo0oO0 o00oOOoO o00ooooo2, @oo0oO0 Collection<String> collection, @oo0oO0 o00oOOo0 o00oooo02, @o0O0o00O(from = 0) int i, @oo0oO0 Executor executor, @oo0oO0 oO00O0oO oo00o0oo, @oo0oO0 o0O00OOO o0o00ooo, @oo0oO0 o0O000o0 o0o000o0, @oo0oO0 o00oo o00ooVar) {
        this.f5549o00oOOo0 = uuid;
        this.f5550o00oOOoO = o00ooooo2;
        this.f5551o00oOo00 = new HashSet(collection);
        this.f5558o00oOooO = o00oooo02;
        this.f5552o00oOo0O = i;
        this.f5553o00oOo0o = executor;
        this.f5555o00oOoO0 = oo00o0oo;
        this.f5554o00oOoO = o0o00ooo;
        this.f5556o00oOoOO = o0o000o0;
        this.f5557o00oOoOo = o00ooVar;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public Executor o00oOOo0() {
        return this.f5553o00oOo0o;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oo o00oOOoO() {
        return this.f5557o00oOoOo;
    }

    @oo0oO0
    public UUID o00oOo00() {
        return this.f5549o00oOOo0;
    }

    @o0OOooO0(28)
    @o0OO00OO
    public Network o00oOo0O() {
        return this.f5558o00oOooO.f5561o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O000o0 o00oOo0o() {
        return this.f5556o00oOoOO;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oOOo0 o00oOoO() {
        return this.f5558o00oOooO;
    }

    @o0O0o00O(from = 0)
    public int o00oOoO0() {
        return this.f5552o00oOo0O;
    }

    @oo0oO0
    public Set<String> o00oOoOO() {
        return this.f5551o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public oO00O0oO o00oOoOo() {
        return this.f5555o00oOoO0;
    }

    @o0OOooO0(24)
    @oo0oO0
    public List<String> o00oOoo0() {
        return this.f5558o00oOooO.f5559o00oOOo0;
    }

    @oo0oO0
    public o00oOOoO o00oOooO() {
        return this.f5550o00oOOoO;
    }

    @o0OOooO0(24)
    @oo0oO0
    public List<Uri> o00oOooo() {
        return this.f5558o00oOooO.f5560o00oOOoO;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00OOO o00oo00O() {
        return this.f5554o00oOoO;
    }
}
