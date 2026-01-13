package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00O0oO;
/* loaded from: classes.dex */
public interface o0O0OOO0 {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O0OOO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public SparseArray<o0OoO00O> f4689o00oOOo0 = new SparseArray<>();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4690o00oOOoO = 0;

        /* renamed from: androidx.recyclerview.widget.o0O0OOO0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0042o00oOOo0 implements o00oOo00 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public SparseIntArray f4691o00oOOo0 = new SparseIntArray(1);

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public SparseIntArray f4692o00oOOoO = new SparseIntArray(1);

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final o0OoO00O f4693o00oOo00;

            public C0042o00oOOo0(o0OoO00O o0ooo00o) {
                this.f4693o00oOo00 = o0ooo00o;
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public void o00oOOoO() {
                o00oOOo0.this.o00oOooO(this.f4693o00oOo00);
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public int o00oOo00(int i) {
                int indexOfKey = this.f4692o00oOOoO.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f4692o00oOOoO.valueAt(indexOfKey);
                }
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("requested global type ", i, " does not belong to the adapter:");
                o00oOOo02.append(this.f4693o00oOo00.f4753o00oOo00);
                throw new IllegalStateException(o00oOOo02.toString());
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public int o00oOooO(int i) {
                int indexOfKey = this.f4691o00oOOo0.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f4691o00oOOo0.valueAt(indexOfKey);
                }
                int o00oOo002 = o00oOOo0.this.o00oOo00(this.f4693o00oOo00);
                this.f4691o00oOOo0.put(i, o00oOo002);
                this.f4692o00oOOoO.put(o00oOo002, i);
                return o00oOo002;
            }
        }

        @Override // androidx.recyclerview.widget.o0O0OOO0
        @oo0oO0
        public o0OoO00O o00oOOo0(int i) {
            o0OoO00O o0ooo00o = this.f4689o00oOOo0.get(i);
            if (o0ooo00o != null) {
                return o0ooo00o;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Cannot find the wrapper for global view type ", i));
        }

        @Override // androidx.recyclerview.widget.o0O0OOO0
        @oo0oO0
        public o00oOo00 o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o) {
            return new C0042o00oOOo0(o0ooo00o);
        }

        public int o00oOo00(o0OoO00O o0ooo00o) {
            int i = this.f4690o00oOOoO;
            this.f4690o00oOOoO = i + 1;
            this.f4689o00oOOo0.put(i, o0ooo00o);
            return i;
        }

        public void o00oOooO(@oo0oO0 o0OoO00O o0ooo00o) {
            for (int size = this.f4689o00oOOo0.size() - 1; size >= 0; size--) {
                if (this.f4689o00oOOo0.valueAt(size) == o0ooo00o) {
                    this.f4689o00oOOo0.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o0O0OOO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public SparseArray<List<o0OoO00O>> f4695o00oOOo0 = new SparseArray<>();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements o00oOo00 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final o0OoO00O f4696o00oOOo0;

            public o00oOOo0(o0OoO00O o0ooo00o) {
                this.f4696o00oOOo0 = o0ooo00o;
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public void o00oOOoO() {
                o00oOOoO.this.o00oOo00(this.f4696o00oOOo0);
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public int o00oOo00(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.o0O0OOO0.o00oOo00
            public int o00oOooO(int i) {
                List<o0OoO00O> list = o00oOOoO.this.f4695o00oOOo0.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    o00oOOoO.this.f4695o00oOOo0.put(i, list);
                }
                if (!list.contains(this.f4696o00oOOo0)) {
                    list.add(this.f4696o00oOOo0);
                }
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.o0O0OOO0
        @oo0oO0
        public o0OoO00O o00oOOo0(int i) {
            List<o0OoO00O> list = this.f4695o00oOOo0.get(i);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Cannot find the wrapper for global view type ", i));
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.o0O0OOO0
        @oo0oO0
        public o00oOo00 o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o) {
            return new o00oOOo0(o0ooo00o);
        }

        public void o00oOo00(@oo0oO0 o0OoO00O o0ooo00o) {
            for (int size = this.f4695o00oOOo0.size() - 1; size >= 0; size--) {
                List<o0OoO00O> valueAt = this.f4695o00oOOo0.valueAt(size);
                if (valueAt.remove(o0ooo00o) && valueAt.isEmpty()) {
                    this.f4695o00oOOo0.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        void o00oOOoO();

        int o00oOo00(int i);

        int o00oOooO(int i);
    }

    @oo0oO0
    o0OoO00O o00oOOo0(int i);

    @oo0oO0
    o00oOo00 o00oOOoO(@oo0oO0 o0OoO00O o0ooo00o);
}
