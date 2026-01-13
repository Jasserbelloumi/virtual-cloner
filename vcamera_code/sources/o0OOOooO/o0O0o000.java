package o0OOOooO;

import android.support.v4.media.o00oOo0O;
import o0OO0o.o0OO00o0;
@o0O0OOO0
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o0O0o000 extends o0O00o00 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f13958o00oOo00;

    public o0O0o000() {
        super(o0O0O0o0.NANOSECONDS);
    }

    @Override // o0OOOooO.o0O00o00
    public long o00oOo00() {
        return this.f13958o00oOo00;
    }

    public final void o00oOo0O(long j) {
        long j2;
        long o0O00Ooo2 = o0oO0O0o.o0O00Ooo(j, this.f13944o00oOOoO);
        if (o0O00Ooo2 == Long.MIN_VALUE || o0O00Ooo2 == Long.MAX_VALUE) {
            double o0O00Oo2 = this.f13958o00oOo00 + o0oO0O0o.o0O00Oo(j, this.f13944o00oOOoO);
            if (o0O00Oo2 > 9.223372036854776E18d || o0O00Oo2 < -9.223372036854776E18d) {
                o00oOooO(j);
            }
            j2 = (long) o0O00Oo2;
        } else {
            long j3 = this.f13958o00oOo00;
            j2 = j3 + o0O00Ooo2;
            if ((o0O00Ooo2 ^ j3) >= 0 && (j3 ^ j2) < 0) {
                o00oOooO(j);
            }
        }
        this.f13958o00oOo00 = j2;
    }

    public final void o00oOooO(long j) {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("TestTimeSource will overflow if its reading ");
        o00oOOo02.append(this.f13958o00oOo00);
        o00oOOo02.append(o0O0OO.o00oOoO(this.f13944o00oOOoO));
        o00oOOo02.append(" is advanced by ");
        o00oOOo02.append((Object) o0oO0O0o.o0O00o0o(j));
        o00oOOo02.append('.');
        throw new IllegalStateException(o00oOOo02.toString());
    }
}
