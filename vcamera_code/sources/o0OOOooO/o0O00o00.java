package o0OOOooO;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import o0OOOooO.o0O0O0O;
import o0OOOooO.o0O0o00;
import o0OOOooO.o0O0o00O;
import o0OOOooO.o0oO0O0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O0OOO0
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o0O00o00 implements o0O0o00O.o00oOo00 {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0O0o0 f13944o00oOOoO;

    @o0OOO00({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,180:1\n720#2,2:181\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n66#1:181,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0O0O0O {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0O00o00 f13945o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final long f13946o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final long f13947o00oo0Oo;

        public o00oOOo0(long j, o0O00o00 o0o00o00, long j2) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "timeSource");
            this.f13946o00oo0O0 = j;
            this.f13945o00oo0O = o0o00o00;
            this.f13947o00oo0Oo = j2;
        }

        public /* synthetic */ o00oOOo0(long j, o0O00o00 o0o00o00, long j2, o0O00 o0o00) {
            this(j, o0o00o00, j2);
        }

        @Override // java.lang.Comparable
        public int compareTo(o0O0O0O o0o0o0o) {
            return o0O0O0O.o00oOOo0.o00oOOo0(this, o0o0o0o);
        }

        @Override // o0OOOooO.o0O0O0O
        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f13945o00oo0O, ((o00oOOo0) obj).f13945o00oo0O)) {
                long o00oOoO02 = o00oOoO0((o0O0O0O) obj);
                o0oO0O0o.f13965o00oo0O.getClass();
                if (o0oO0O0o.o00oo0Oo(o00oOoO02, o0oO0O0o.f13966o00oo0Oo)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o0OOOooO.o0O0O0O
        public int hashCode() {
            return o0oO0O0o.o0O000O(o00oOo0o());
        }

        @Override // o0OOOooO.o0O0o00
        @NotNull
        public o0O0O0O o00oOOo0(long j) {
            return new o00oOOo0(this.f13946o00oo0O0, this.f13945o00oo0O, o0oO0O0o.o0O00(this.f13947o00oo0Oo, j));
        }

        @Override // o0OOOooO.o0O0o00
        public long o00oOOoO() {
            return o0oO0O0o.o0O000o0(this.f13947o00oo0Oo) ? o0oO0O0o.o0O0O0O(this.f13947o00oo0Oo) : o0oO0O0o.o0O000oo(o0O0O0Oo.o0O00OOO(this.f13945o00oo0O.o00oOo00() - this.f13946o00oo0O0, this.f13945o00oo0O.o00oOOoO()), this.f13947o00oo0Oo);
        }

        @Override // o0OOOooO.o0O0O0O, o0OOOooO.o0O0o00
        @NotNull
        public o0O0O0O o00oOo00(long j) {
            return o0O0O0O.o00oOOo0.o00oOooO(this, j);
        }

        @Override // o0OOOooO.o0O0o00
        public o0O0o00 o00oOo00(long j) {
            return o0O0O0O.o00oOOo0.o00oOooO(this, j);
        }

        @Override // o0OOOooO.o0O0o00
        public boolean o00oOo0O() {
            return o0O0o00.o00oOOo0.o00oOOo0(this);
        }

        public final long o00oOo0o() {
            long o0O002;
            long o0O00OOO2;
            if (o0oO0O0o.o0O000o0(this.f13947o00oo0Oo)) {
                return this.f13947o00oo0Oo;
            }
            o0O0O0o0 o00oOOoO2 = this.f13945o00oo0O.o00oOOoO();
            o0O0O0o0 o0o0o0o0 = o0O0O0o0.MILLISECONDS;
            if (o00oOOoO2.compareTo(o0o0o0o0) >= 0) {
                o0O002 = o0O0O0Oo.o0O00OOO(this.f13946o00oo0O0, o00oOOoO2);
                o0O00OOO2 = this.f13947o00oo0Oo;
            } else {
                long o00oOOoO3 = o0O0OO0.o00oOOoO(1L, o0o0o0o0, o00oOOoO2);
                long j = this.f13946o00oo0O0;
                long j2 = j / o00oOOoO3;
                long j3 = j % o00oOOoO3;
                long j4 = this.f13947o00oo0Oo;
                long o00oooOo2 = o0oO0O0o.o00oooOo(j4);
                int o00ooooo2 = o0oO0O0o.o00ooooo(j4);
                long o0O00OOO3 = o0O0O0Oo.o0O00OOO(j3, o00oOOoO2);
                o0oO0O0o.o00oOOo0 o00oooo02 = o0oO0O0o.f13965o00oo0O;
                o0O002 = o0oO0O0o.o0O00(o0oO0O0o.o0O00(o0O00OOO3, o0O0O0Oo.o0O00OO(o00ooooo2 % 1000000, o0O0O0o0.NANOSECONDS)), o0O0O0Oo.o0O00OOO(j2 + (o00ooooo2 / 1000000), o0o0o0o0));
                o0O00OOO2 = o0O0O0Oo.o0O00OOO(o00oooOo2, o0O0O0o0.SECONDS);
            }
            return o0oO0O0o.o0O00(o0O002, o0O00OOO2);
        }

        @Override // o0OOOooO.o0O0O0O
        public long o00oOoO0(@NotNull o0O0O0O o0o0o0o) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "other");
            if (o0o0o0o instanceof o00oOOo0) {
                o00oOOo0 o00oooo02 = (o00oOOo0) o0o0o0o;
                if (o0OOOOO0.o0ooO.o00oOoO0(this.f13945o00oo0O, o00oooo02.f13945o00oo0O)) {
                    if (o0oO0O0o.o00oo0Oo(this.f13947o00oo0Oo, o00oooo02.f13947o00oo0Oo) && o0oO0O0o.o0O000o0(this.f13947o00oo0Oo)) {
                        o0oO0O0o.f13965o00oo0O.getClass();
                        return o0oO0O0o.f13966o00oo0Oo;
                    }
                    long o0O000oo2 = o0oO0O0o.o0O000oo(this.f13947o00oo0Oo, o00oooo02.f13947o00oo0Oo);
                    long o0O00OOO2 = o0O0O0Oo.o0O00OOO(this.f13946o00oo0O0 - o00oooo02.f13946o00oo0O0, this.f13945o00oo0O.o00oOOoO());
                    if (o0oO0O0o.o00oo0Oo(o0O00OOO2, o0oO0O0o.o0O0O0O(o0O000oo2))) {
                        o0oO0O0o.f13965o00oo0O.getClass();
                        return o0oO0O0o.f13966o00oo0Oo;
                    }
                    return o0oO0O0o.o0O00(o0O00OOO2, o0O000oo2);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + o0o0o0o);
        }

        @Override // o0OOOooO.o0O0O0O
        public int o00oOoOO(@NotNull o0O0O0O o0o0o0o) {
            return o0O0O0O.o00oOOo0.o00oOOo0(this, o0o0o0o);
        }

        @Override // o0OOOooO.o0O0o00
        public boolean o00oOooO() {
            return o0O0o00.o00oOOo0.o00oOOoO(this);
        }

        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("LongTimeMark(");
            o00oOOo02.append(this.f13946o00oo0O0);
            o00oOOo02.append(o0O0OO.o00oOoO(this.f13945o00oo0O.o00oOOoO()));
            o00oOOo02.append(" + ");
            o00oOOo02.append((Object) o0oO0O0o.o0O00o0o(this.f13947o00oo0Oo));
            o00oOOo02.append(" (=");
            o00oOOo02.append((Object) o0oO0O0o.o0O00o0o(o00oOo0o()));
            o00oOOo02.append("), ");
            o00oOOo02.append(this.f13945o00oo0O);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    public o0O00o00(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "unit");
        this.f13944o00oOOoO = o0o0o0o0;
    }

    @Override // o0OOOooO.o0O0o00O
    @NotNull
    public o0O0O0O o00oOOo0() {
        long o00oOo002 = o00oOo00();
        o0oO0O0o.f13965o00oo0O.getClass();
        return new o00oOOo0(o00oOo002, this, o0oO0O0o.f13966o00oo0Oo);
    }

    @NotNull
    public final o0O0O0o0 o00oOOoO() {
        return this.f13944o00oOOoO;
    }

    public abstract long o00oOo00();
}
