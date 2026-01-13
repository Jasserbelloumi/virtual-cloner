package o0O0Ooo0;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o00oo00O f12147o00oOoOO = new o00oo00O(new o00oOOo0());
    @o0O0OO.o00oOOo0(name = "required_network_type")

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0O0000O f12148o00oOOo0;
    @o0O0OO.o00oOOo0(name = "requires_charging")

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f12149o00oOOoO;
    @o0O0OO.o00oOOo0(name = "requires_device_idle")

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f12150o00oOo00;
    @o0O0OO.o00oOOo0(name = "requires_storage_not_low")

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f12151o00oOo0O;
    @o0O0OO.o00oOOo0(name = "trigger_content_update_delay")

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public long f12152o00oOo0o;
    @o0O0OO.o00oOOo0(name = "content_uri_triggers")

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o00oo0 f12153o00oOoO;
    @o0O0OO.o00oOOo0(name = "trigger_max_content_delay")

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public long f12154o00oOoO0;
    @o0O0OO.o00oOOo0(name = "requires_battery_not_low")

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f12155o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f12156o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f12157o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O0000O f12158o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f12159o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public long f12160o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public o00oo0 f12161o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public long f12162o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f12163o00oOooO;

        public o00oOOo0() {
            this.f12156o00oOOo0 = false;
            this.f12157o00oOOoO = false;
            this.f12158o00oOo00 = o0O0000O.NOT_REQUIRED;
            this.f12163o00oOooO = false;
            this.f12159o00oOo0O = false;
            this.f12160o00oOo0o = -1L;
            this.f12162o00oOoO0 = -1L;
            this.f12161o00oOoO = new o00oo0();
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public o00oOOo0(@oo0oO0 o00oo00O o00oo00o) {
            this.f12156o00oOOo0 = false;
            this.f12157o00oOOoO = false;
            this.f12158o00oOo00 = o0O0000O.NOT_REQUIRED;
            this.f12163o00oOooO = false;
            this.f12159o00oOo0O = false;
            this.f12160o00oOo0o = -1L;
            this.f12162o00oOoO0 = -1L;
            this.f12161o00oOoO = new o00oo0();
            this.f12156o00oOOo0 = o00oo00o.f12149o00oOOoO;
            this.f12157o00oOOoO = o00oo00o.f12150o00oOo00;
            this.f12158o00oOo00 = o00oo00o.f12148o00oOOo0;
            this.f12163o00oOooO = o00oo00o.f12155o00oOooO;
            this.f12159o00oOo0O = o00oo00o.f12151o00oOo0O;
            this.f12160o00oOo0o = o00oo00o.f12152o00oOo0o;
            this.f12162o00oOoO0 = o00oo00o.f12154o00oOoO0;
            this.f12161o00oOoO = o00oo00o.f12153o00oOoO;
        }

        @o0OOooO0(24)
        @oo0oO0
        public o00oOOo0 o00oOOo0(@oo0oO0 Uri uri, boolean z) {
            this.f12161o00oOoO.o00oOOo0(uri, z);
            return this;
        }

        @oo0oO0
        public o00oo00O o00oOOoO() {
            return new o00oo00O(this);
        }

        @oo0oO0
        public o00oOOo0 o00oOo00(@oo0oO0 o0O0000O o0o0000o) {
            this.f12158o00oOo00 = o0o0000o;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0O(boolean z) {
            this.f12156o00oOOo0 = z;
            return this;
        }

        @o0OOooO0(23)
        @oo0oO0
        public o00oOOo0 o00oOo0o(boolean z) {
            this.f12157o00oOOoO = z;
            return this;
        }

        @o0OOooO0(24)
        @oo0oO0
        public o00oOOo0 o00oOoO(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12162o00oOoO0 = timeUnit.toMillis(j);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO0(boolean z) {
            this.f12159o00oOo0O = z;
            return this;
        }

        @o0OOooO0(26)
        @oo0oO0
        public o00oOOo0 o00oOoOO(Duration duration) {
            this.f12162o00oOoO0 = duration.toMillis();
            return this;
        }

        @o0OOooO0(24)
        @oo0oO0
        public o00oOOo0 o00oOoOo(long j, @oo0oO0 TimeUnit timeUnit) {
            this.f12160o00oOo0o = timeUnit.toMillis(j);
            return this;
        }

        @o0OOooO0(26)
        @oo0oO0
        public o00oOOo0 o00oOoo0(Duration duration) {
            this.f12160o00oOo0o = duration.toMillis();
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOooO(boolean z) {
            this.f12163o00oOooO = z;
            return this;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oo00O() {
        this.f12148o00oOOo0 = o0O0000O.NOT_REQUIRED;
        this.f12152o00oOo0o = -1L;
        this.f12154o00oOoO0 = -1L;
        this.f12153o00oOoO = new o00oo0();
    }

    public o00oo00O(o00oOOo0 o00oooo02) {
        this.f12148o00oOOo0 = o0O0000O.NOT_REQUIRED;
        this.f12152o00oOo0o = -1L;
        this.f12154o00oOoO0 = -1L;
        this.f12153o00oOoO = new o00oo0();
        this.f12149o00oOOoO = o00oooo02.f12156o00oOOo0;
        this.f12150o00oOo00 = o00oooo02.f12157o00oOOoO;
        this.f12148o00oOOo0 = o00oooo02.f12158o00oOo00;
        this.f12155o00oOooO = o00oooo02.f12163o00oOooO;
        this.f12151o00oOo0O = o00oooo02.f12159o00oOo0O;
        this.f12153o00oOoO = o00oooo02.f12161o00oOoO;
        this.f12152o00oOo0o = o00oooo02.f12160o00oOo0o;
        this.f12154o00oOoO0 = o00oooo02.f12162o00oOoO0;
    }

    public o00oo00O(@oo0oO0 o00oo00O o00oo00o) {
        this.f12148o00oOOo0 = o0O0000O.NOT_REQUIRED;
        this.f12152o00oOo0o = -1L;
        this.f12154o00oOoO0 = -1L;
        this.f12153o00oOoO = new o00oo0();
        this.f12149o00oOOoO = o00oo00o.f12149o00oOOoO;
        this.f12150o00oOo00 = o00oo00o.f12150o00oOo00;
        this.f12148o00oOOo0 = o00oo00o.f12148o00oOOo0;
        this.f12155o00oOooO = o00oo00o.f12155o00oOooO;
        this.f12151o00oOo0O = o00oo00o.f12151o00oOo0O;
        this.f12153o00oOoO = o00oo00o.f12153o00oOoO;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00oo00O.class != obj.getClass()) {
            return false;
        }
        o00oo00O o00oo00o = (o00oo00O) obj;
        if (this.f12149o00oOOoO == o00oo00o.f12149o00oOOoO && this.f12150o00oOo00 == o00oo00o.f12150o00oOo00 && this.f12155o00oOooO == o00oo00o.f12155o00oOooO && this.f12151o00oOo0O == o00oo00o.f12151o00oOo0O && this.f12152o00oOo0o == o00oo00o.f12152o00oOo0o && this.f12154o00oOoO0 == o00oo00o.f12154o00oOoO0 && this.f12148o00oOOo0 == o00oo00o.f12148o00oOOo0) {
            return this.f12153o00oOoO.equals(o00oo00o.f12153o00oOoO);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f12152o00oOo0o;
        long j2 = this.f12154o00oOoO0;
        return this.f12153o00oOoO.hashCode() + (((((((((((((this.f12148o00oOOo0.hashCode() * 31) + (this.f12149o00oOOoO ? 1 : 0)) * 31) + (this.f12150o00oOo00 ? 1 : 0)) * 31) + (this.f12155o00oOooO ? 1 : 0)) * 31) + (this.f12151o00oOo0O ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    @o0OOooO0(24)
    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public o00oo0 o00oOOo0() {
        return this.f12153o00oOoO;
    }

    @oo0oO0
    public o0O0000O o00oOOoO() {
        return this.f12148o00oOOo0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public long o00oOo00() {
        return this.f12152o00oOo0o;
    }

    @o0OOooO0(24)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean o00oOo0O() {
        return this.f12153o00oOoO.o00oOo00() > 0;
    }

    public boolean o00oOo0o() {
        return this.f12155o00oOooO;
    }

    @o0OOooO0(23)
    public boolean o00oOoO() {
        return this.f12150o00oOo00;
    }

    public boolean o00oOoO0() {
        return this.f12149o00oOOoO;
    }

    public boolean o00oOoOO() {
        return this.f12151o00oOo0O;
    }

    @o0OOooO0(24)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOoOo(@o0OO00OO o00oo0 o00oo0Var) {
        this.f12153o00oOoO = o00oo0Var;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOoo0(@oo0oO0 o0O0000O o0o0000o) {
        this.f12148o00oOOo0 = o0o0000o;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public long o00oOooO() {
        return this.f12154o00oOoO0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOooo(boolean z) {
        this.f12155o00oOooO = z;
    }

    @o0OOooO0(23)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oo0(boolean z) {
        this.f12150o00oOo00 = z;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oo00O(boolean z) {
        this.f12149o00oOOoO = z;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oo0O(long j) {
        this.f12154o00oOoO0 = j;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oo0O0(long j) {
        this.f12152o00oOo0o = j;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oo0OO(boolean z) {
        this.f12151o00oOo0O = z;
    }
}
