package o0OOOo0o;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public final class o0O0oo0o extends o0OO0oO.o0O0o0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13740o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13741o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f13742o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f13743o00oo0o0;

    public o0O0oo0o(int i, int i2, int i3) {
        this.f13741o00oo0O0 = i3;
        this.f13740o00oo0O = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f13742o00oo0Oo = z;
        this.f13743o00oo0o0 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13742o00oo0Oo;
    }

    @Override // o0OO0oO.o0O0o0
    public int nextInt() {
        int i = this.f13743o00oo0o0;
        if (i != this.f13740o00oo0O) {
            this.f13743o00oo0o0 = this.f13741o00oo0O0 + i;
        } else if (!this.f13742o00oo0Oo) {
            throw new NoSuchElementException();
        } else {
            this.f13742o00oo0Oo = false;
        }
        return i;
    }

    public final int o00oOOo0() {
        return this.f13741o00oo0O0;
    }
}
