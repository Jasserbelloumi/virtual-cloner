package o0OOOo0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOOO;
import o0OOOOO.o00oOOo0;
import o0OOOOO0.o0O00;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o0O0o00 implements Iterator<o0OOOO>, o00oOOo0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f13730o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13731o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f13732o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f13733o00oo0o0;

    public o0O0o00(int i, int i2, int i3) {
        this.f13731o00oo0O0 = i2;
        boolean z = true;
        int compareUnsigned = Integer.compareUnsigned(i, i2);
        if (i3 <= 0 ? compareUnsigned < 0 : compareUnsigned > 0) {
            z = false;
        }
        this.f13730o00oo0O = z;
        this.f13732o00oo0Oo = o0OOOO.o00oOooo(i3);
        this.f13733o00oo0o0 = this.f13730o00oo0O ? i : i2;
    }

    public /* synthetic */ o0O0o00(int i, int i2, int i3, o0O00 o0o00) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13730o00oo0O;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ o0OOOO next() {
        return o0OOOO.o00oOooO(o00oOOo0());
    }

    public int o00oOOo0() {
        int i = this.f13733o00oo0o0;
        if (i != this.f13731o00oo0O0) {
            this.f13733o00oo0o0 = o0OOOO.o00oOooo(this.f13732o00oo0Oo + i);
        } else if (!this.f13730o00oo0O) {
            throw new NoSuchElementException();
        } else {
            this.f13730o00oo0O = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
