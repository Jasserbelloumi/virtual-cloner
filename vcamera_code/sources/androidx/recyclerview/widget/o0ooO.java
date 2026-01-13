package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class o0ooO<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f4777o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final SparseArray<o00oOOo0<T>> f4778o00oOOoO = new SparseArray<>(10);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOo0<T> f4779o00oOo00;

    /* loaded from: classes.dex */
    public static class o00oOOo0<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final T[] f4780o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4781o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4782o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o00oOOo0<T> f4783o00oOooO;

        public o00oOOo0(Class<T> cls, int i) {
            this.f4780o00oOOo0 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        }

        public boolean o00oOOo0(int i) {
            int i2 = this.f4781o00oOOoO;
            return i2 <= i && i < i2 + this.f4782o00oOo00;
        }

        public T o00oOOoO(int i) {
            return this.f4780o00oOOo0[i - this.f4781o00oOOoO];
        }
    }

    public o0ooO(int i) {
        this.f4777o00oOOo0 = i;
    }

    public o00oOOo0<T> o00oOOo0(o00oOOo0<T> o00oooo02) {
        int indexOfKey = this.f4778o00oOOoO.indexOfKey(o00oooo02.f4781o00oOOoO);
        if (indexOfKey < 0) {
            this.f4778o00oOOoO.put(o00oooo02.f4781o00oOOoO, o00oooo02);
            return null;
        }
        o00oOOo0<T> valueAt = this.f4778o00oOOoO.valueAt(indexOfKey);
        this.f4778o00oOOoO.setValueAt(indexOfKey, o00oooo02);
        if (this.f4779o00oOo00 == valueAt) {
            this.f4779o00oOo00 = o00oooo02;
        }
        return valueAt;
    }

    public void o00oOOoO() {
        this.f4778o00oOOoO.clear();
    }

    public o00oOOo0<T> o00oOo00(int i) {
        if (i < 0 || i >= this.f4778o00oOOoO.size()) {
            return null;
        }
        return this.f4778o00oOOoO.valueAt(i);
    }

    public o00oOOo0<T> o00oOo0O(int i) {
        o00oOOo0<T> o00oooo02 = this.f4778o00oOOoO.get(i);
        if (this.f4779o00oOo00 == o00oooo02) {
            this.f4779o00oOo00 = null;
        }
        this.f4778o00oOOoO.delete(i);
        return o00oooo02;
    }

    public int o00oOo0o() {
        return this.f4778o00oOOoO.size();
    }

    public T o00oOooO(int i) {
        o00oOOo0<T> o00oooo02 = this.f4779o00oOo00;
        if (o00oooo02 == null || !o00oooo02.o00oOOo0(i)) {
            int indexOfKey = this.f4778o00oOOoO.indexOfKey(i - (i % this.f4777o00oOOo0));
            if (indexOfKey < 0) {
                return null;
            }
            this.f4779o00oOo00 = this.f4778o00oOOoO.valueAt(indexOfKey);
        }
        return this.f4779o00oOo00.o00oOOoO(i);
    }
}
