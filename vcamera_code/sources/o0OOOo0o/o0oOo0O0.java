package o0OOOo0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OO0o.o0OO00o0;
import o0OO0o.o0oo0000;
import o0OOOOO.o00oOOo0;
import o0OOOOO0.o0O00;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o0oOo0O0 implements Iterator<o0oo0000>, o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f13752o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final long f13753o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final long f13754o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public long f13755o00oo0o0;

    public o0oOo0O0(long j, long j2, long j3) {
        this.f13753o00oo0O0 = j2;
        boolean z = true;
        if (j3 <= 0 ? Long.compareUnsigned(j, j2) < 0 : Long.compareUnsigned(j, j2) > 0) {
            z = false;
        }
        this.f13752o00oo0O = z;
        this.f13754o00oo0Oo = o0oo0000.o00oOooo(j3);
        this.f13755o00oo0o0 = this.f13752o00oo0O ? j : j2;
    }

    public /* synthetic */ o0oOo0O0(long j, long j2, long j3, o0O00 o0o00) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13752o00oo0O;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ o0oo0000 next() {
        return o0oo0000.o00oOooO(o00oOOo0());
    }

    public long o00oOOo0() {
        long j = this.f13755o00oo0o0;
        if (j != this.f13753o00oo0O0) {
            this.f13755o00oo0o0 = o0oo0000.o00oOooo(this.f13754o00oo0Oo + j);
        } else if (!this.f13752o00oo0O) {
            throw new NoSuchElementException();
        } else {
            this.f13752o00oo0O = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
