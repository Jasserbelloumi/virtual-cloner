package o00ooO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o00ooOO0.o0O00O0;
import o00ooOO0.o0oO0Ooo;
/* loaded from: classes.dex */
public class o00oo0O extends o00oOoO implements o00oo0O0 {

    /* renamed from: o0O0o0oo  reason: collision with root package name */
    public o00oOoO[] f7851o0O0o0oo = new o00oOoO[4];

    /* renamed from: o0O0oo0O  reason: collision with root package name */
    public int f7852o0O0oo0O = 0;

    @Override // o00ooO.o00oo0O0
    public void o00oOOo0(o00oOoO o00oooo2) {
        if (o00oooo2 == this || o00oooo2 == null) {
            return;
        }
        int i = this.f7852o0O0oo0O + 1;
        o00oOoO[] o00ooooArr = this.f7851o0O0o0oo;
        if (i > o00ooooArr.length) {
            this.f7851o0O0o0oo = (o00oOoO[]) Arrays.copyOf(o00ooooArr, o00ooooArr.length * 2);
        }
        o00oOoO[] o00ooooArr2 = this.f7851o0O0o0oo;
        int i2 = this.f7852o0O0oo0O;
        o00ooooArr2[i2] = o00oooo2;
        this.f7852o0O0oo0O = i2 + 1;
    }

    @Override // o00ooO.o00oo0O0
    public void o00oOOoO(o00oo00O o00oo00o) {
    }

    @Override // o00ooO.o00oo0O0
    public void o00oOo00() {
        this.f7852o0O0oo0O = 0;
        Arrays.fill(this.f7851o0O0o0oo, (Object) null);
    }

    @Override // o00ooO.o00oOoO
    public void o00oo0(o00oOoO o00oooo2, HashMap<o00oOoO, o00oOoO> hashMap) {
        super.o00oo0(o00oooo2, hashMap);
        o00oo0O o00oo0o2 = (o00oo0O) o00oooo2;
        this.f7852o0O0oo0O = 0;
        int i = o00oo0o2.f7852o0O0oo0O;
        for (int i2 = 0; i2 < i; i2++) {
            o00oOOo0(hashMap.get(o00oo0o2.f7851o0O0o0oo[i2]));
        }
    }

    public void o0OO000o(ArrayList<o0oO0Ooo> arrayList, int i, o0oO0Ooo o0oo0ooo) {
        for (int i2 = 0; i2 < this.f7852o0O0oo0O; i2++) {
            o0oo0ooo.o00oOOo0(this.f7851o0O0o0oo[i2]);
        }
        for (int i3 = 0; i3 < this.f7852o0O0oo0O; i3++) {
            o0O00O0.o00oOOo0(this.f7851o0O0o0oo[i3], i, arrayList, o0oo0ooo);
        }
    }

    public int oo0oO0(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f7852o0O0oo0O; i4++) {
            o00oOoO o00oooo2 = this.f7851o0O0o0oo[i4];
            if (i == 0 && (i3 = o00oooo2.f7746o0O0OOO) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = o00oooo2.f7748o0O0OOOo) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
