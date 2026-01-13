package o0O0Ooo0;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import androidx.work.o00oOOoO;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0OoO00O;
/* loaded from: classes.dex */
public abstract class o0O00OO {
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final long f12185o00oOo0O = 18000000;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final long f12186o00oOo0o = 10000;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final long f12187o00oOooO = 30000;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public UUID f12188o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0O0o0Oo.o0OoO00O f12189o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Set<String> f12190o00oOo00;

    /* loaded from: classes.dex */
    public static abstract class o00oOOo0<B extends o00oOOo0<?, ?>, W extends o0O00OO> {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O0o0Oo.o0OoO00O f12193o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Class<? extends ListenableWorker> f12194o00oOo0O;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f12191o00oOOo0 = false;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Set<String> f12195o00oOooO = new HashSet();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public UUID f12192o00oOOoO = UUID.randomUUID();

        public o00oOOo0(@oo0oO0 Class<? extends ListenableWorker> cls) {
            this.f12194o00oOo0O = cls;
            this.f12193o00oOo00 = new o0O0o0Oo.o0OoO00O(this.f12192o00oOOoO.toString(), cls.getName());
            o00oOOo0(cls.getName());
        }

        @oo0oO0
        public final B o00oOOo0(@oo0oO0 String str) {
            this.f12195o00oOooO.add(str);
            return o00oOooO();
        }

        @oo0oO0
        public final W o00oOOoO() {
            W o00oOo002 = o00oOo00();
            o00oo00O o00oo00o = this.f12193o00oOo00.f12470o00oOoOo;
            boolean z = o00oo00o.o00oOo0O() || o00oo00o.f12155o00oOooO || o00oo00o.f12149o00oOOoO || o00oo00o.f12150o00oOo00;
            if (this.f12193o00oOo00.f12476o00oo0O && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f12192o00oOOoO = UUID.randomUUID();
            o0O0o0Oo.o0OoO00O o0ooo00o = new o0O0o0Oo.o0OoO00O(this.f12193o00oOo00);
            this.f12193o00oOo00 = o0ooo00o;
            o0ooo00o.f12462o00oOOo0 = this.f12192o00oOOoO.toString();
            return o00oOo002;
        }

        @oo0oO0
        public abstract W o00oOo00();

        @oo0oO0
        public final B o00oOo0O(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12193o00oOo00.f12478o00oo0OO = timeUnit.toMillis(j);
            return o00oOooO();
        }

        @o0OOooO0(26)
        @oo0oO0
        public final B o00oOo0o(@oo0oO0 Duration duration) {
            this.f12193o00oOo00.f12478o00oo0OO = duration.toMillis();
            return o00oOooO();
        }

        @o0OOooO0(26)
        @oo0oO0
        public final B o00oOoO(@oo0oO0 o00oOoO o00oooo2, @oo0oO0 Duration duration) {
            this.f12191o00oOOo0 = true;
            o0O0o0Oo.o0OoO00O o0ooo00o = this.f12193o00oOo00;
            o0ooo00o.f12473o00oOooo = o00oooo2;
            o0ooo00o.o00oOo0O(duration.toMillis());
            return o00oOooO();
        }

        @oo0oO0
        public final B o00oOoO0(@oo0oO0 o00oOoO o00oooo2, long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12191o00oOOo0 = true;
            o0O0o0Oo.o0OoO00O o0ooo00o = this.f12193o00oOo00;
            o0ooo00o.f12473o00oOooo = o00oooo2;
            o0ooo00o.o00oOo0O(timeUnit.toMillis(j));
            return o00oOooO();
        }

        @oo0oO0
        public final B o00oOoOO(@oo0oO0 o00oo00O o00oo00o) {
            this.f12193o00oOo00.f12470o00oOoOo = o00oo00o;
            return o00oOooO();
        }

        @oo0oO0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B o00oOoOo(@oo0oO0 o0OoOoOo o0oooooo) {
            o0O0o0Oo.o0OoO00O o0ooo00o = this.f12193o00oOo00;
            o0ooo00o.f12476o00oo0O = true;
            o0ooo00o.f12479o00oo0Oo = o0oooooo;
            return o00oOooO();
        }

        @oo0oO0
        public B o00oOoo0(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12193o00oOo00.f12468o00oOoO0 = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f12193o00oOo00.f12468o00oOoO0) {
                return o00oOooO();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @oo0oO0
        public abstract B o00oOooO();

        @o0OOooO0(26)
        @oo0oO0
        public B o00oOooo(@oo0oO0 Duration duration) {
            this.f12193o00oOo00.f12468o00oOoO0 = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f12193o00oOo00.f12468o00oOoO0) {
                return o00oOooO();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @oo0oO0
        @o0o0000
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final B o00oo0(@oo0oO0 o0OoO00O.o00oOOo0 o00oooo02) {
            this.f12193o00oOo00.f12463o00oOOoO = o00oooo02;
            return o00oOooO();
        }

        @oo0oO0
        @o0o0000
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final B o00oo00O(int i) {
            this.f12193o00oOo00.f12471o00oOoo0 = i;
            return o00oOooO();
        }

        @oo0oO0
        @o0o0000
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final B o00oo0O(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12193o00oOo00.f12477o00oo0O0 = timeUnit.toMillis(j);
            return o00oOooO();
        }

        @oo0oO0
        @o0o0000
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final B o00oo0O0(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12193o00oOo00.f12474o00oo0 = timeUnit.toMillis(j);
            return o00oOooO();
        }

        @oo0oO0
        public final B o00oo0OO(@oo0oO0 o00oOOoO o00ooooo2) {
            this.f12193o00oOo00.f12465o00oOo0O = o00ooooo2;
            return o00oOooO();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O00OO(@oo0oO0 UUID uuid, @oo0oO0 o0O0o0Oo.o0OoO00O o0ooo00o, @oo0oO0 Set<String> set) {
        this.f12188o00oOOo0 = uuid;
        this.f12189o00oOOoO = o0ooo00o;
        this.f12190o00oOo00 = set;
    }

    @oo0oO0
    public UUID o00oOOo0() {
        return this.f12188o00oOOo0;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public String o00oOOoO() {
        return this.f12188o00oOOo0.toString();
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public Set<String> o00oOo00() {
        return this.f12190o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o0O0o0Oo.o0OoO00O o00oOooO() {
        return this.f12189o00oOOoO;
    }
}
