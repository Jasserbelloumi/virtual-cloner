package o0O00000;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o0O0oo0o {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final long f10232o00oOoO = Long.MAX_VALUE;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f10233o00oOoOO = 100;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f10234o00oOoOo = 102;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f10235o00oOoo0 = 104;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final long f10236o00oOooo = -1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f10237o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final long f10238o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final long f10239o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f10240o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final float f10241o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final long f10242o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final long f10243o00oOooO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static Class<?> f10244o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static Method f10245o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static Method f10246o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static Method f10247o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static Method f10248o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static Method f10249o00oOooO;

        public static Object o00oOOo0(o0O0oo0o o0o0oo0o, String str) {
            try {
                if (f10244o00oOOo0 == null) {
                    f10244o00oOOo0 = Class.forName("android.location.LocationRequest");
                }
                if (f10245o00oOOoO == null) {
                    Method declaredMethod = f10244o00oOOo0.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f10245o00oOOoO = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f10245o00oOOoO.invoke(null, str, Long.valueOf(o0o0oo0o.f10238o00oOOoO), Float.valueOf(o0o0oo0o.f10241o00oOo0o), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f10246o00oOo00 == null) {
                    Method declaredMethod2 = f10244o00oOOo0.getDeclaredMethod("setQuality", Integer.TYPE);
                    f10246o00oOo00 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f10246o00oOo00.invoke(invoke, Integer.valueOf(o0o0oo0o.f10237o00oOOo0));
                if (f10249o00oOooO == null) {
                    Method declaredMethod3 = f10244o00oOOo0.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f10249o00oOooO = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f10249o00oOooO.invoke(invoke, Long.valueOf(o0o0oo0o.o00oOo0o()));
                if (o0o0oo0o.f10240o00oOo0O < Integer.MAX_VALUE) {
                    if (f10247o00oOo0O == null) {
                        Method declaredMethod4 = f10244o00oOOo0.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f10247o00oOo0O = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f10247o00oOo0O.invoke(invoke, Integer.valueOf(o0o0oo0o.f10240o00oOo0O));
                }
                if (o0o0oo0o.f10243o00oOooO < Long.MAX_VALUE) {
                    if (f10248o00oOo0o == null) {
                        Method declaredMethod5 = f10244o00oOOo0.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f10248o00oOo0o = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f10248o00oOo0o.invoke(invoke, Long.valueOf(o0o0oo0o.f10243o00oOooO));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @o0OOooO0(31)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        /* JADX WARN: Type inference failed for: r0v0, types: [android.location.LocationRequest$Builder] */
        @o0O0O0Oo
        public static LocationRequest o00oOOo0(o0O0oo0o o0o0oo0o) {
            return new Object(o0o0oo0o.f10238o00oOOoO) { // from class: android.location.LocationRequest.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ LocationRequest build();

                @NonNull
                public native /* synthetic */ Builder setDurationMillis(long j);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdateDelayMillis(long j);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdates(int i);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateDistanceMeters(float f);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateIntervalMillis(long j);

                @NonNull
                public native /* synthetic */ Builder setQuality(int i);
            }.setQuality(o0o0oo0o.f10237o00oOOo0).setMinUpdateIntervalMillis(o0o0oo0o.o00oOo0o()).setDurationMillis(o0o0oo0o.f10243o00oOooO).setMaxUpdates(o0o0oo0o.f10240o00oOo0O).setMinUpdateDistanceMeters(o0o0oo0o.f10241o00oOo0o).setMaxUpdateDelayMillis(o0o0oo0o.f10242o00oOoO0).build();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public long f10250o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f10251o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public long f10252o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public long f10253o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f10254o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public long f10255o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f10256o00oOooO;

        public o00oOo00(long j) {
            o00oOooO(j);
            this.f10251o00oOOoO = 102;
            this.f10252o00oOo00 = Long.MAX_VALUE;
            this.f10256o00oOooO = Integer.MAX_VALUE;
            this.f10253o00oOo0O = -1L;
            this.f10254o00oOo0o = 0.0f;
            this.f10255o00oOoO0 = 0L;
        }

        public o00oOo00(@oo0oO0 o0O0oo0o o0o0oo0o) {
            this.f10250o00oOOo0 = o0o0oo0o.f10238o00oOOoO;
            this.f10251o00oOOoO = o0o0oo0o.f10237o00oOOo0;
            this.f10252o00oOo00 = o0o0oo0o.f10243o00oOooO;
            this.f10256o00oOooO = o0o0oo0o.f10240o00oOo0O;
            this.f10253o00oOo0O = o0o0oo0o.f10239o00oOo00;
            this.f10254o00oOo0o = o0o0oo0o.f10241o00oOo0o;
            this.f10255o00oOoO0 = o0o0oo0o.f10242o00oOoO0;
        }

        @oo0oO0
        public o0O0oo0o o00oOOo0() {
            ooOOOOoo.o00oo0OO((this.f10250o00oOOo0 == Long.MAX_VALUE && this.f10253o00oOo0O == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.f10250o00oOOo0;
            return new o0O0oo0o(j, this.f10251o00oOOoO, this.f10252o00oOo00, this.f10256o00oOooO, Math.min(this.f10253o00oOo0O, j), this.f10254o00oOo0o, this.f10255o00oOoO0);
        }

        @oo0oO0
        public o00oOo00 o00oOOoO() {
            this.f10253o00oOo0O = -1L;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo00(@o0O0o00O(from = 1) long j) {
            this.f10252o00oOo00 = ooOOOOoo.o00oOoO(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo0O(@o0O0o00O(from = 0) long j) {
            this.f10255o00oOoO0 = j;
            this.f10255o00oOoO0 = ooOOOOoo.o00oOoO(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOo0o(@o0O0o00O(from = 1, to = 2147483647L) int i) {
            this.f10256o00oOooO = ooOOOOoo.o00oOoO0(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOoO(@o0O0o00O(from = 0) long j) {
            this.f10253o00oOo0O = ooOOOOoo.o00oOoO(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOoO0(@o0O0OO0(from = 0.0d, to = 3.4028234663852886E38d) float f) {
            this.f10254o00oOo0o = f;
            this.f10254o00oOo0o = ooOOOOoo.o00oOo0o(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOoOO(int i) {
            ooOOOOoo.o00oOo00(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f10251o00oOOoO = i;
            return this;
        }

        @oo0oO0
        public o00oOo00 o00oOooO(@o0O0o00O(from = 0) long j) {
            this.f10250o00oOOo0 = ooOOOOoo.o00oOoO(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOo0O {
    }

    public o0O0oo0o(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f10238o00oOOoO = j;
        this.f10237o00oOOo0 = i;
        this.f10239o00oOo00 = j3;
        this.f10243o00oOooO = j2;
        this.f10240o00oOo0O = i2;
        this.f10241o00oOo0o = f;
        this.f10242o00oOoO0 = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0oo0o) {
            o0O0oo0o o0o0oo0o = (o0O0oo0o) obj;
            return this.f10237o00oOOo0 == o0o0oo0o.f10237o00oOOo0 && this.f10238o00oOOoO == o0o0oo0o.f10238o00oOOoO && this.f10239o00oOo00 == o0o0oo0o.f10239o00oOo00 && this.f10243o00oOooO == o0o0oo0o.f10243o00oOooO && this.f10240o00oOo0O == o0o0oo0o.f10240o00oOo0O && Float.compare(o0o0oo0o.f10241o00oOo0o, this.f10241o00oOo0o) == 0 && this.f10242o00oOoO0 == o0o0oo0o.f10242o00oOoO0;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f10238o00oOOoO;
        long j2 = this.f10239o00oOo00;
        return (((this.f10237o00oOOo0 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @o0O0o00O(from = 1)
    public long o00oOOo0() {
        return this.f10243o00oOooO;
    }

    @o0O0o00O(from = 0)
    public long o00oOOoO() {
        return this.f10238o00oOOoO;
    }

    @o0O0o00O(from = 0)
    public long o00oOo00() {
        return this.f10242o00oOoO0;
    }

    @o0O0OO0(from = 0.0d, to = 3.4028234663852886E38d)
    public float o00oOo0O() {
        return this.f10241o00oOo0o;
    }

    @o0O0o00O(from = 0)
    public long o00oOo0o() {
        long j = this.f10239o00oOo00;
        return j == -1 ? this.f10238o00oOOoO : j;
    }

    @o0OOooO0(31)
    @oo0oO0
    public LocationRequest o00oOoO() {
        return o00oOOoO.o00oOOo0(this);
    }

    public int o00oOoO0() {
        return this.f10237o00oOOo0;
    }

    @o0OOooO0(19)
    @o0OO00OO
    @SuppressLint({"NewApi"})
    public LocationRequest o00oOoOO(@oo0oO0 String str) {
        return Build.VERSION.SDK_INT >= 31 ? o00oOOoO.o00oOOo0(this) : (LocationRequest) o00oOOo0.o00oOOo0(this, str);
    }

    @o0O0o00O(from = 1, to = 2147483647L)
    public int o00oOooO() {
        return this.f10240o00oOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @o00oOooO.oo0oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.String r0 = "Request["
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
            long r1 = r5.f10238o00oOOoO
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.f10238o00oOOoO
            o0ooOoOO.oO00Oo00.o00oOo0O(r1, r0)
            int r1 = r5.f10237o00oOOo0
            r2 = 100
            if (r1 == r2) goto L30
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L2d
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L2a
            goto L38
        L2a:
            java.lang.String r1 = " LOW_POWER"
            goto L35
        L2d:
            java.lang.String r1 = " BALANCED"
            goto L35
        L30:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L35
        L33:
            java.lang.String r1 = "PASSIVE"
        L35:
            r0.append(r1)
        L38:
            long r1 = r5.f10243o00oOooO
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L48
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.f10243o00oOooO
            o0ooOoOO.oO00Oo00.o00oOo0O(r1, r0)
        L48:
            int r1 = r5.f10240o00oOo0O
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L59
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r5.f10240o00oOo0O
            r0.append(r1)
        L59:
            long r1 = r5.f10239o00oOo00
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L71
            long r3 = r5.f10238o00oOOoO
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L71
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.f10239o00oOo00
            o0ooOoOO.oO00Oo00.o00oOo0O(r1, r0)
        L71:
            float r1 = r5.f10241o00oOo0o
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L84
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r5.f10241o00oOo0o
            r0.append(r1)
        L84:
            long r1 = r5.f10242o00oOoO0
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.f10238o00oOOoO
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L99
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.f10242o00oOoO0
            o0ooOoOO.oO00Oo00.o00oOo0O(r1, r0)
        L99:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O00000.o0O0oo0o.toString():java.lang.String");
    }
}
