package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o0O000.o0O00OOO;
/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final ThreadLocal<o0> f4262o00oo0o = new ThreadLocal<>();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static Comparator<o00oOo00> f4263o00oo0oO = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public long f4264o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public long f4266o00oo0Oo;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ArrayList<RecyclerView> f4265o00oo0O0 = new ArrayList<>();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ArrayList<o00oOo00> f4267o00oo0o0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<o00oOo00> {
        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(o00oOo00 o00ooo002, o00oOo00 o00ooo003) {
            RecyclerView recyclerView = o00ooo002.f4276o00oOooO;
            if ((recyclerView == null) != (o00ooo003.f4276o00oOooO == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = o00ooo002.f4272o00oOOo0;
            if (z != o00ooo003.f4272o00oOOo0) {
                return z ? -1 : 1;
            }
            int i = o00ooo003.f4273o00oOOoO - o00ooo002.f4273o00oOOoO;
            if (i != 0) {
                return i;
            }
            int i2 = o00ooo002.f4274o00oOo00 - o00ooo003.f4274o00oOo00;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class o00oOOoO implements RecyclerView.o0O00000.o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4268o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4269o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int[] f4270o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4271o00oOooO;

        @Override // androidx.recyclerview.widget.RecyclerView.o0O00000.o00oOo00
        public void o00oOOo0(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f4271o00oOooO * 2;
            int[] iArr = this.f4270o00oOo00;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4270o00oOo00 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f4270o00oOo00 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4270o00oOo00;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f4271o00oOooO++;
        }

        public void o00oOOoO() {
            int[] iArr = this.f4270o00oOo00;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4271o00oOooO = 0;
        }

        public void o00oOo00(RecyclerView recyclerView, boolean z) {
            this.f4271o00oOooO = 0;
            int[] iArr = this.f4270o00oOo00;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o0O00000 o0o00000 = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || o0o00000 == null || !o0o00000.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.o00oo0O()) {
                    o0o00000.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                o0o00000.collectAdjacentPrefetchPositions(this.f4268o00oOOo0, this.f4269o00oOOoO, recyclerView.mState, this);
            }
            int i = this.f4271o00oOooO;
            if (i > o0o00000.mPrefetchMaxCountObserved) {
                o0o00000.mPrefetchMaxCountObserved = i;
                o0o00000.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.o00ooo0O();
            }
        }

        public void o00oOo0O(int i, int i2) {
            this.f4268o00oOOo0 = i;
            this.f4269o00oOOoO = i2;
        }

        public boolean o00oOooO(int i) {
            if (this.f4270o00oOo00 != null) {
                int i2 = this.f4271o00oOooO * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4270o00oOo00[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4272o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4273o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4274o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4275o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public RecyclerView f4276o00oOooO;

        public void o00oOOo0() {
            this.f4272o00oOOo0 = false;
            this.f4273o00oOOoO = 0;
            this.f4274o00oOo00 = 0;
            this.f4276o00oOooO = null;
            this.f4275o00oOo0O = 0;
        }
    }

    public static boolean o00oOo0O(RecyclerView recyclerView, int i) {
        int o00oOoOo2 = recyclerView.mChildHelper.o00oOoOo();
        for (int i2 = 0; i2 < o00oOoOo2; i2++) {
            RecyclerView.o0O00oO0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.o00oOoOO(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void o00oOOo0(RecyclerView recyclerView) {
        this.f4265o00oo0O0.add(recyclerView);
    }

    public final void o00oOOoO() {
        o00oOo00 o00ooo002;
        int size = this.f4265o00oo0O0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4265o00oo0O0.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.o00oOo00(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4271o00oOooO;
            }
        }
        this.f4267o00oo0o0.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4265o00oo0O0.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                o00oOOoO o00ooooo2 = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(o00ooooo2.f4269o00oOOoO) + Math.abs(o00ooooo2.f4268o00oOOo0);
                for (int i5 = 0; i5 < o00ooooo2.f4271o00oOooO * 2; i5 += 2) {
                    if (i3 >= this.f4267o00oo0o0.size()) {
                        o00ooo002 = new o00oOo00();
                        this.f4267o00oo0o0.add(o00ooo002);
                    } else {
                        o00ooo002 = this.f4267o00oo0o0.get(i3);
                    }
                    int[] iArr = o00ooooo2.f4270o00oOo00;
                    int i6 = iArr[i5 + 1];
                    o00ooo002.f4272o00oOOo0 = i6 <= abs;
                    o00ooo002.f4273o00oOOoO = abs;
                    o00ooo002.f4274o00oOo00 = i6;
                    o00ooo002.f4276o00oOooO = recyclerView2;
                    o00ooo002.f4275o00oOo0O = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4267o00oo0o0, f4263o00oo0oO);
    }

    public final void o00oOo00(o00oOo00 o00ooo002, long j) {
        RecyclerView.o0O00oO0 o00oOoOO2 = o00oOoOO(o00ooo002.f4276o00oOooO, o00ooo002.f4275o00oOo0O, o00ooo002.f4272o00oOOo0 ? Long.MAX_VALUE : j);
        if (o00oOoOO2 == null || o00oOoOO2.mNestedRecyclerView == null || !o00oOoOO2.isBound() || o00oOoOO2.isInvalid()) {
            return;
        }
        o00oOoO(o00oOoOO2.mNestedRecyclerView.get(), j);
    }

    public void o00oOo0o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4264o00oo0O == 0) {
            this.f4264o00oo0O = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.o00oOo0O(i, i2);
    }

    public final void o00oOoO(@o0OO00OO RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.o00oOoOo() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        o00oOOoO o00ooooo2 = recyclerView.mPrefetchRegistry;
        o00ooooo2.o00oOo00(recyclerView, true);
        if (o00ooooo2.f4271o00oOooO != 0) {
            try {
                o0O000.o0O00OOO.o00oOOoO(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                recyclerView.mState.o00oOoo0(recyclerView.mAdapter);
                for (int i = 0; i < o00ooooo2.f4271o00oOooO * 2; i += 2) {
                    o00oOoOO(recyclerView, o00ooooo2.f4270o00oOo00[i], j);
                }
                o0O00OOO.o00oOOo0.o00oOOoO();
            } catch (Throwable th) {
                o0O000.o0O00OOO.o00oOooO();
                throw th;
            }
        }
    }

    public void o00oOoO0(long j) {
        o00oOOoO();
        o00oOooO(j);
    }

    public final RecyclerView.o0O00oO0 o00oOoOO(RecyclerView recyclerView, int i, long j) {
        if (o00oOo0O(recyclerView, i)) {
            return null;
        }
        RecyclerView.o0O00O0 o0o00o0 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.o0O00oO0 o00ooo002 = o0o00o0.o00ooo00(i, false, j);
            if (o00ooo002 != null) {
                if (!o00ooo002.isBound() || o00ooo002.isInvalid()) {
                    o0o00o0.o00oOOo0(o00ooo002, false);
                } else {
                    o0o00o0.o00ooOO0(o00ooo002.itemView);
                }
            }
            return o00ooo002;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void o00oOoOo(RecyclerView recyclerView) {
        this.f4265o00oo0O0.remove(recyclerView);
    }

    public final void o00oOooO(long j) {
        for (int i = 0; i < this.f4267o00oo0o0.size(); i++) {
            o00oOo00 o00ooo002 = this.f4267o00oo0o0.get(i);
            if (o00ooo002.f4276o00oOooO == null) {
                return;
            }
            o00oOo00(o00ooo002, j);
            o00ooo002.o00oOOo0();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            o0O000.o0O00OOO.o00oOOoO(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f4265o00oo0O0.isEmpty()) {
                this.f4264o00oo0O = 0L;
                o0O00OOO.o00oOOo0.o00oOOoO();
                return;
            }
            int size = this.f4265o00oo0O0.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = this.f4265o00oo0O0.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f4264o00oo0O = 0L;
                o0O00OOO.o00oOOo0.o00oOOoO();
                return;
            }
            o00oOoO0(TimeUnit.MILLISECONDS.toNanos(j) + this.f4266o00oo0Oo);
            this.f4264o00oo0O = 0L;
            o0O00OOO.o00oOOo0.o00oOOoO();
        } catch (Throwable th) {
            this.f4264o00oo0O = 0L;
            o0O000.o0O00OOO.o00oOooO();
            throw th;
        }
    }
}
