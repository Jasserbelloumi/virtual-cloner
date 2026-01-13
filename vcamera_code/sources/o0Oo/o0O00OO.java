package o0Oo;

import java.util.AbstractList;
import java.util.RandomAccess;
/* loaded from: classes3.dex */
public final class o0O00OO extends AbstractList<o0O0000O> implements RandomAccess {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0000O[] f15475o00oo0O0;

    public o0O00OO(o0O0000O[] o0o0000oArr) {
        this.f15475o00oo0O0 = o0o0000oArr;
    }

    public static o0O00OO o00oOOoO(o0O0000O... o0o0000oArr) {
        return new o0O00OO((o0O0000O[]) o0o0000oArr.clone());
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.f15475o00oo0O0[i];
    }

    public o0O0000O o00oOOo0(int i) {
        return this.f15475o00oo0O0[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15475o00oo0O0.length;
    }
}
