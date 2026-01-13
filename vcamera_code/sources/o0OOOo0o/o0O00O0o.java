package o0OOOo0o;

import java.util.NoSuchElementException;
import o0OO0oO.o0O00;
/* loaded from: classes3.dex */
public final class o0O00O0o extends o0O00 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f13702o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f13703o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f13704o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f13705o00oo0o0;

    public o0O00O0o(char c, char c2, int i) {
        this.f13703o00oo0O0 = i;
        this.f13702o00oo0O = c2;
        boolean z = true;
        if (i <= 0 ? o0OOOOO0.o0ooO.o00oo0o(c, c2) < 0 : o0OOOOO0.o0ooO.o00oo0o(c, c2) > 0) {
            z = false;
        }
        this.f13704o00oo0Oo = z;
        this.f13705o00oo0o0 = z ? c : c2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13704o00oo0Oo;
    }

    @Override // o0OO0oO.o0O00
    public char o00oOOoO() {
        int i = this.f13705o00oo0o0;
        if (i != this.f13702o00oo0O) {
            this.f13705o00oo0o0 = this.f13703o00oo0O0 + i;
        } else if (!this.f13704o00oo0Oo) {
            throw new NoSuchElementException();
        } else {
            this.f13704o00oo0Oo = false;
        }
        return (char) i;
    }

    public final int o00oOo00() {
        return this.f13703o00oo0O0;
    }
}
