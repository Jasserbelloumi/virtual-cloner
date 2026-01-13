package o0OOOooO;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0OO00o0;
import o0OOOO0o.o00oo00O;
import o0OOOooO.o0O0O0O;
import org.jetbrains.annotations.NotNull;
@o0O0OOO0
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public interface o0O0o00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOOo0 f13959o00oOOo0 = o00oOOo0.f13960o00oOOo0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ o00oOOo0 f13960o00oOOo0 = new o00oOOo0();
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements o00oOo00 {
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOOoO f13961o00oOOoO = new o00oOOoO();

        @o00oo00O
        @o0O0OOO0
        @o0OO00o0(version = "1.7")
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 implements o0O0O0O {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final long f13962o00oo0O0;

            public /* synthetic */ o00oOOo0(long j) {
                this.f13962o00oo0O0 = j;
            }

            public static final /* synthetic */ o00oOOo0 o00oOo0o(long j) {
                return new o00oOOo0(j);
            }

            public static final int o00oOoO(long j, long j2) {
                long o00oo0Oo2 = o00oo0Oo(j, j2);
                o0oO0O0o.f13965o00oo0O.getClass();
                return o0oO0O0o.o00oOooo(o00oo0Oo2, o0oO0O0o.f13966o00oo0Oo);
            }

            public static int o00oOoOo(long j, @NotNull o0O0O0O o0o0o0o) {
                o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "other");
                return o0O0O0O.o00oOOo0.o00oOOo0(new o00oOOo0(j), o0o0o0o);
            }

            public static long o00oOoo0(long j) {
                return j;
            }

            public static long o00oOooo(long j) {
                return oo0OOoo.f13974o00oOOoO.o00oOooO(j);
            }

            public static long o00oo(long j, long j2) {
                oo0OOoo.f13974o00oOOoO.getClass();
                return o0O0OOO.o00oOo00(j, j2);
            }

            public static final boolean o00oo0(long j, long j2) {
                return j == j2;
            }

            public static boolean o00oo00O(long j, Object obj) {
                return (obj instanceof o00oOOo0) && j == ((o00oOOo0) obj).f13962o00oo0O0;
            }

            public static int o00oo0O(long j) {
                return Long.hashCode(j);
            }

            public static boolean o00oo0O0(long j) {
                return !o0oO0O0o.o0O000o(o00oOooo(j));
            }

            public static boolean o00oo0OO(long j) {
                return o0oO0O0o.o0O000o(o00oOooo(j));
            }

            public static final long o00oo0Oo(long j, long j2) {
                oo0OOoo.f13974o00oOOoO.getClass();
                return o0O0OOO.o00oOoO0(j, j2);
            }

            public static long o00oo0o(long j, long j2) {
                oo0OOoo oo0oooo = oo0OOoo.f13974o00oOOoO;
                long o0O0O0O2 = o0oO0O0o.o0O0O0O(j2);
                oo0oooo.getClass();
                return o0O0OOO.o00oOo00(j, o0O0O0O2);
            }

            public static long o00oo0oO(long j, @NotNull o0O0O0O o0o0o0o) {
                o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "other");
                if (o0o0o0o instanceof o00oOOo0) {
                    return o00oo0Oo(j, ((o00oOOo0) o0o0o0o).f13962o00oo0O0);
                }
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Subtracting or comparing time marks from different time sources is not possible: ");
                o00oOOo02.append((Object) o00ooO00(j));
                o00oOOo02.append(" and ");
                o00oOOo02.append(o0o0o0o);
                throw new IllegalArgumentException(o00oOOo02.toString());
            }

            public static String o00ooO00(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // java.lang.Comparable
            public int compareTo(o0O0O0O o0o0o0o) {
                return o0O0O0O.o00oOOo0.o00oOOo0(this, o0o0o0o);
            }

            @Override // o0OOOooO.o0O0O0O
            public boolean equals(Object obj) {
                return o00oo00O(this.f13962o00oo0O0, obj);
            }

            @Override // o0OOOooO.o0O0O0O
            public int hashCode() {
                return Long.hashCode(this.f13962o00oo0O0);
            }

            @Override // o0OOOooO.o0O0O0O, o0OOOooO.o0O0o00
            public /* synthetic */ o0O0O0O o00oOOo0(long j) {
                return new o00oOOo0(o0O0o(j));
            }

            @Override // o0OOOooO.o0O0o00
            public long o00oOOoO() {
                return o00oOooo(this.f13962o00oo0O0);
            }

            @Override // o0OOOooO.o0O0O0O, o0OOOooO.o0O0o00
            public /* synthetic */ o0O0O0O o00oOo00(long j) {
                return new o00oOOo0(o00oo0o0(j));
            }

            @Override // o0OOOooO.o0O0o00
            public boolean o00oOo0O() {
                return o00oo0OO(this.f13962o00oo0O0);
            }

            @Override // o0OOOooO.o0O0O0O
            public long o00oOoO0(@NotNull o0O0O0O o0o0o0o) {
                o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "other");
                return o00oo0oO(this.f13962o00oo0O0, o0o0o0o);
            }

            @Override // o0OOOooO.o0O0O0O
            public int o00oOoOO(@NotNull o0O0O0O o0o0o0o) {
                return o0O0O0O.o00oOOo0.o00oOOo0(this, o0o0o0o);
            }

            @Override // o0OOOooO.o0O0o00
            public boolean o00oOooO() {
                return o00oo0O0(this.f13962o00oo0O0);
            }

            public long o00oo0o0(long j) {
                return o00oo0o(this.f13962o00oo0O0, j);
            }

            public final /* synthetic */ long o00ooO0() {
                return this.f13962o00oo0O0;
            }

            public long o0O0o(long j) {
                return o00oo(this.f13962o00oo0O0, j);
            }

            public String toString() {
                return o00ooO00(this.f13962o00oo0O0);
            }

            @Override // o0OOOooO.o0O0o00
            public /* synthetic */ o0O0o00 o00oOOo0(long j) {
                return new o00oOOo0(o0O0o(j));
            }

            @Override // o0OOOooO.o0O0o00
            public /* synthetic */ o0O0o00 o00oOo00(long j) {
                return new o00oOOo0(o00oo0o0(j));
            }
        }

        @Override // o0OOOooO.o0O0o00O.o00oOo00, o0OOOooO.o0O0o00O
        public /* synthetic */ o0O0O0O o00oOOo0() {
            return new o00oOOo0(o00oOOoO());
        }

        public long o00oOOoO() {
            return oo0OOoo.f13974o00oOOoO.o00oOo0o();
        }

        @NotNull
        public String toString() {
            oo0OOoo.f13974o00oOOoO.getClass();
            return "TimeSource(System.nanoTime())";
        }

        @Override // o0OOOooO.o0O0o00O
        public /* synthetic */ o0O0o00 o00oOOo0() {
            return new o00oOOo0(o00oOOoO());
        }
    }

    @o0O0OOO0
    @o0OO00o0(version = "1.8")
    /* loaded from: classes3.dex */
    public interface o00oOo00 extends o0O0o00O {
        @Override // o0OOOooO.o0O0o00O
        @NotNull
        o0O0O0O o00oOOo0();
    }

    @NotNull
    o0O0o00 o00oOOo0();
}
