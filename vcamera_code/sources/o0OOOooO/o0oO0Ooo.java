package o0OOOooO;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O00;
import o0OOOooO.o0O0O0O;
import o0OOOooO.o0O0o00;
import o0OOOooO.o0O0o00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O0OOO0
@o0O0o(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o0oO0Ooo implements o0O0o00O.o00oOo00 {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0O0o0 f13970o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0O0O0O {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0oO0Ooo f13971o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final double f13972o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final long f13973o00oo0Oo;

        public o00oOOo0(double d, o0oO0Ooo o0oo0ooo, long j) {
            o0OOOOO0.o0ooO.o00oo0O0(o0oo0ooo, "timeSource");
            this.f13972o00oo0O0 = d;
            this.f13971o00oo0O = o0oo0ooo;
            this.f13973o00oo0Oo = j;
        }

        public /* synthetic */ o00oOOo0(double d, o0oO0Ooo o0oo0ooo, long j, o0O00 o0o00) {
            this(d, o0oo0ooo, j);
        }

        @Override // java.lang.Comparable
        public int compareTo(o0O0O0O o0o0o0o) {
            return o0O0O0O.o00oOOo0.o00oOOo0(this, o0o0o0o);
        }

        @Override // o0OOOooO.o0O0O0O
        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f13971o00oo0O, ((o00oOOo0) obj).f13971o00oo0O)) {
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
            return Long.hashCode(o0oO0O0o.o0O00(o0O0O0Oo.o0O00O(this.f13972o00oo0O0, this.f13971o00oo0O.o00oOOoO()), this.f13973o00oo0Oo));
        }

        @Override // o0OOOooO.o0O0o00
        @NotNull
        public o0O0O0O o00oOOo0(long j) {
            return new o00oOOo0(this.f13972o00oo0O0, this.f13971o00oo0O, o0oO0O0o.o0O00(this.f13973o00oo0Oo, j));
        }

        @Override // o0OOOooO.o0O0o00
        public long o00oOOoO() {
            return o0oO0O0o.o0O000oo(o0O0O0Oo.o0O00O(this.f13971o00oo0O.o00oOo00() - this.f13972o00oo0O0, this.f13971o00oo0O.o00oOOoO()), this.f13973o00oo0Oo);
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

        @Override // o0OOOooO.o0O0O0O
        public long o00oOoO0(@NotNull o0O0O0O o0o0o0o) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "other");
            if (o0o0o0o instanceof o00oOOo0) {
                o00oOOo0 o00oooo02 = (o00oOOo0) o0o0o0o;
                if (o0OOOOO0.o0ooO.o00oOoO0(this.f13971o00oo0O, o00oooo02.f13971o00oo0O)) {
                    if (o0oO0O0o.o00oo0Oo(this.f13973o00oo0Oo, o00oooo02.f13973o00oo0Oo) && o0oO0O0o.o0O000o0(this.f13973o00oo0Oo)) {
                        o0oO0O0o.f13965o00oo0O.getClass();
                        return o0oO0O0o.f13966o00oo0Oo;
                    }
                    long o0O000oo2 = o0oO0O0o.o0O000oo(this.f13973o00oo0Oo, o00oooo02.f13973o00oo0Oo);
                    long o0O00O2 = o0O0O0Oo.o0O00O(this.f13972o00oo0O0 - o00oooo02.f13972o00oo0O0, this.f13971o00oo0O.o00oOOoO());
                    if (o0oO0O0o.o00oo0Oo(o0O00O2, o0oO0O0o.o0O0O0O(o0O000oo2))) {
                        o0oO0O0o.f13965o00oo0O.getClass();
                        return o0oO0O0o.f13966o00oo0Oo;
                    }
                    return o0oO0O0o.o0O00(o0O00O2, o0O000oo2);
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
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DoubleTimeMark(");
            o00oOOo02.append(this.f13972o00oo0O0);
            o00oOOo02.append(o0O0OO.o00oOoO(this.f13971o00oo0O.o00oOOoO()));
            o00oOOo02.append(" + ");
            o00oOOo02.append((Object) o0oO0O0o.o0O00o0o(this.f13973o00oo0Oo));
            o00oOOo02.append(", ");
            o00oOOo02.append(this.f13971o00oo0O);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    public o0oO0Ooo(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "unit");
        this.f13970o00oOOoO = o0o0o0o0;
    }

    @Override // o0OOOooO.o0O0o00O
    @NotNull
    public o0O0O0O o00oOOo0() {
        double o00oOo002 = o00oOo00();
        o0oO0O0o.f13965o00oo0O.getClass();
        return new o00oOOo0(o00oOo002, this, o0oO0O0o.f13966o00oo0Oo);
    }

    @NotNull
    public final o0O0O0o0 o00oOOoO() {
        return this.f13970o00oOOoO;
    }

    public abstract double o00oOo00();
}
