package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f4388o00oOo0O = "ChildrenHelper";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final boolean f4389o00oOooO = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f4390o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOo0 f4391o00oOOoO = new o00oOOo0();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<View> f4392o00oOo00 = new ArrayList();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4393o00oOo00 = 64;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final long f4394o00oOooO = Long.MIN_VALUE;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public long f4395o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oOOo0 f4396o00oOOoO;

        public void o00oOOo0(int i) {
            if (i < 64) {
                this.f4395o00oOOo0 &= ~(1 << i);
                return;
            }
            o00oOOo0 o00oooo02 = this.f4396o00oOOoO;
            if (o00oooo02 != null) {
                o00oooo02.o00oOOo0(i - 64);
            }
        }

        public int o00oOOoO(int i) {
            long j;
            o00oOOo0 o00oooo02 = this.f4396o00oOOoO;
            if (o00oooo02 == null) {
                if (i >= 64) {
                    j = this.f4395o00oOOo0;
                    return Long.bitCount(j);
                }
            } else if (i >= 64) {
                return Long.bitCount(this.f4395o00oOOo0) + o00oooo02.o00oOOoO(i - 64);
            }
            j = this.f4395o00oOOo0 & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        public final void o00oOo00() {
            if (this.f4396o00oOOoO == null) {
                this.f4396o00oOOoO = new o00oOOo0();
            }
        }

        public void o00oOo0O(int i, boolean z) {
            if (i >= 64) {
                o00oOo00();
                this.f4396o00oOOoO.o00oOo0O(i - 64, z);
                return;
            }
            long j = this.f4395o00oOOo0;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4395o00oOOo0 = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                o00oOoO(i);
            } else {
                o00oOOo0(i);
            }
            if (z2 || this.f4396o00oOOoO != null) {
                o00oOo00();
                this.f4396o00oOOoO.o00oOo0O(0, z2);
            }
        }

        public boolean o00oOo0o(int i) {
            if (i >= 64) {
                o00oOo00();
                return this.f4396o00oOOoO.o00oOo0o(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4395o00oOOo0;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4395o00oOOo0 = j3;
            long j4 = j - 1;
            this.f4395o00oOOo0 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            o00oOOo0 o00oooo02 = this.f4396o00oOOoO;
            if (o00oooo02 != null) {
                if (o00oooo02.o00oOooO(0)) {
                    o00oOoO(63);
                }
                this.f4396o00oOOoO.o00oOo0o(0);
            }
            return z;
        }

        public void o00oOoO(int i) {
            if (i < 64) {
                this.f4395o00oOOo0 |= 1 << i;
                return;
            }
            o00oOo00();
            this.f4396o00oOOoO.o00oOoO(i - 64);
        }

        public void o00oOoO0() {
            this.f4395o00oOOo0 = 0L;
            o00oOOo0 o00oooo02 = this.f4396o00oOOoO;
            if (o00oooo02 != null) {
                o00oooo02.o00oOoO0();
            }
        }

        public boolean o00oOooO(int i) {
            if (i < 64) {
                return (this.f4395o00oOOo0 & (1 << i)) != 0;
            }
            o00oOo00();
            return this.f4396o00oOOoO.o00oOooO(i - 64);
        }

        public String toString() {
            if (this.f4396o00oOOoO == null) {
                return Long.toBinaryString(this.f4395o00oOOo0);
            }
            return this.f4396o00oOOoO.toString() + "xx" + Long.toBinaryString(this.f4395o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        View o00oOOo0(int i);

        void o00oOOoO(View view);

        int o00oOo00();

        void o00oOo0O(int i);

        void o00oOo0o(View view, int i);

        int o00oOoO(View view);

        void o00oOoO0();

        void o00oOoOO(View view);

        void o00oOoOo(int i);

        void o00oOoo0(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.o0O00oO0 o00oOooO(View view);
    }

    public o00oo0(o00oOOoO o00ooooo2) {
        this.f4390o00oOOo0 = o00ooooo2;
    }

    public void o00oOOo0(View view, int i, boolean z) {
        int o00oOo002 = i < 0 ? this.f4390o00oOOo0.o00oOo00() : o00oOoO(i);
        this.f4391o00oOOoO.o00oOo0O(o00oOo002, z);
        if (z) {
            o00oOooo(view);
        }
        this.f4390o00oOOo0.o00oOo0o(view, o00oOo002);
    }

    public void o00oOOoO(View view, boolean z) {
        o00oOOo0(view, -1, z);
    }

    public void o00oOo00(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int o00oOo002 = i < 0 ? this.f4390o00oOOo0.o00oOo00() : o00oOoO(i);
        this.f4391o00oOOoO.o00oOo0O(o00oOo002, z);
        if (z) {
            o00oOooo(view);
        }
        this.f4390o00oOOo0.o00oOoo0(view, o00oOo002, layoutParams);
    }

    public View o00oOo0O(int i) {
        int size = this.f4392o00oOo00.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4392o00oOo00.get(i2);
            RecyclerView.o0O00oO0 o00oOooO2 = this.f4390o00oOOo0.o00oOooO(view);
            if (o00oOooO2.getLayoutPosition() == i && !o00oOooO2.isInvalid() && !o00oOooO2.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View o00oOo0o(int i) {
        return this.f4390o00oOOo0.o00oOOo0(o00oOoO(i));
    }

    public final int o00oOoO(int i) {
        if (i < 0) {
            return -1;
        }
        int o00oOo002 = this.f4390o00oOOo0.o00oOo00();
        int i2 = i;
        while (i2 < o00oOo002) {
            int o00oOOoO2 = i - (i2 - this.f4391o00oOOoO.o00oOOoO(i2));
            if (o00oOOoO2 == 0) {
                while (this.f4391o00oOOoO.o00oOooO(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += o00oOOoO2;
        }
        return -1;
    }

    public int o00oOoO0() {
        return this.f4390o00oOOo0.o00oOo00() - this.f4392o00oOo00.size();
    }

    public View o00oOoOO(int i) {
        return this.f4390o00oOOo0.o00oOOo0(i);
    }

    public int o00oOoOo() {
        return this.f4390o00oOOo0.o00oOo00();
    }

    public void o00oOoo0(View view) {
        int o00oOoO2 = this.f4390o00oOOo0.o00oOoO(view);
        if (o00oOoO2 >= 0) {
            this.f4391o00oOOoO.o00oOoO(o00oOoO2);
            o00oOooo(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void o00oOooO(int i) {
        int o00oOoO2 = o00oOoO(i);
        this.f4391o00oOOoO.o00oOo0o(o00oOoO2);
        this.f4390o00oOOo0.o00oOo0O(o00oOoO2);
    }

    public final void o00oOooo(View view) {
        this.f4392o00oOo00.add(view);
        this.f4390o00oOOo0.o00oOOoO(view);
    }

    public boolean o00oo0(View view) {
        return this.f4392o00oOo00.contains(view);
    }

    public int o00oo00O(View view) {
        int o00oOoO2 = this.f4390o00oOOo0.o00oOoO(view);
        if (o00oOoO2 == -1 || this.f4391o00oOOoO.o00oOooO(o00oOoO2)) {
            return -1;
        }
        return o00oOoO2 - this.f4391o00oOOoO.o00oOOoO(o00oOoO2);
    }

    public void o00oo0O(int i) {
        int o00oOoO2 = o00oOoO(i);
        View o00oOOo02 = this.f4390o00oOOo0.o00oOOo0(o00oOoO2);
        if (o00oOOo02 == null) {
            return;
        }
        if (this.f4391o00oOOoO.o00oOo0o(o00oOoO2)) {
            o00oo0o(o00oOOo02);
        }
        this.f4390o00oOOo0.o00oOoOo(o00oOoO2);
    }

    public void o00oo0O0(View view) {
        int o00oOoO2 = this.f4390o00oOOo0.o00oOoO(view);
        if (o00oOoO2 < 0) {
            return;
        }
        if (this.f4391o00oOOoO.o00oOo0o(o00oOoO2)) {
            o00oo0o(view);
        }
        this.f4390o00oOOo0.o00oOoOo(o00oOoO2);
    }

    public void o00oo0OO() {
        this.f4391o00oOOoO.o00oOoO0();
        for (int size = this.f4392o00oOo00.size() - 1; size >= 0; size--) {
            this.f4390o00oOOo0.o00oOoOO(this.f4392o00oOo00.get(size));
            this.f4392o00oOo00.remove(size);
        }
        this.f4390o00oOOo0.o00oOoO0();
    }

    public boolean o00oo0Oo(View view) {
        int o00oOoO2 = this.f4390o00oOOo0.o00oOoO(view);
        if (o00oOoO2 == -1) {
            o00oo0o(view);
            return true;
        } else if (this.f4391o00oOOoO.o00oOooO(o00oOoO2)) {
            this.f4391o00oOOoO.o00oOo0o(o00oOoO2);
            o00oo0o(view);
            this.f4390o00oOOo0.o00oOoOo(o00oOoO2);
            return true;
        } else {
            return false;
        }
    }

    public final boolean o00oo0o(View view) {
        if (this.f4392o00oOo00.remove(view)) {
            this.f4390o00oOOo0.o00oOoOO(view);
            return true;
        }
        return false;
    }

    public void o00oo0o0(View view) {
        int o00oOoO2 = this.f4390o00oOOo0.o00oOoO(view);
        if (o00oOoO2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4391o00oOOoO.o00oOooO(o00oOoO2)) {
            this.f4391o00oOOoO.o00oOOo0(o00oOoO2);
            o00oo0o(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4391o00oOOoO.toString() + ", hidden list:" + this.f4392o00oOo00.size();
    }
}
