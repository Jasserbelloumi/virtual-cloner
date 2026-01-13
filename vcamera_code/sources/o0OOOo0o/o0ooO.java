package o0OOOo0o;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public final class o0ooO extends o0OO0oO.o0oOo0O0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final long f13756o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long f13757o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f13758o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public long f13759o00oo0o0;

    public o0ooO(long j, long j2, long j3) {
        this.f13757o00oo0O0 = j3;
        this.f13756o00oo0O = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f13758o00oo0Oo = z;
        this.f13759o00oo0o0 = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13758o00oo0Oo;
    }

    @Override // o0OO0oO.o0oOo0O0
    public long nextLong() {
        long j = this.f13759o00oo0o0;
        if (j != this.f13756o00oo0O) {
            this.f13759o00oo0o0 = this.f13757o00oo0O0 + j;
        } else if (!this.f13758o00oo0Oo) {
            throw new NoSuchElementException();
        } else {
            this.f13758o00oo0Oo = false;
        }
        return j;
    }

    public final long o00oOOo0() {
        return this.f13757o00oo0O0;
    }
}
