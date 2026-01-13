package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o0O00.o00oo0O;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final boolean f4052o00oOoOo = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f4053o00oOoo0 = "GridLayoutManager";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f4054o00oOooo = -1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f4055o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f4056o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int[] f4057o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final SparseIntArray f4058o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final SparseIntArray f4059o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Rect f4060o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o00oOo00 f4061o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f4062o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public View[] f4063o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o00oOo00 {
        @Override // androidx.recyclerview.widget.GridLayoutManager.o00oOo00
        public int o00oOo0O(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.o00oOo00
        public int o00oOo0o(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends RecyclerView.o0O0000O {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4064o00oOoO0 = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4065o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4066o00oOo0o;

        public o00oOOoO(int i, int i2) {
            super(i, i2);
            this.f4065o00oOo0O = -1;
            this.f4066o00oOo0o = 0;
        }

        public o00oOOoO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4065o00oOo0O = -1;
            this.f4066o00oOo0o = 0;
        }

        public o00oOOoO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4065o00oOo0O = -1;
            this.f4066o00oOo0o = 0;
        }

        public o00oOOoO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4065o00oOo0O = -1;
            this.f4066o00oOo0o = 0;
        }

        public o00oOOoO(RecyclerView.o0O0000O o0o0000o) {
            super(o0o0000o);
            this.f4065o00oOo0O = -1;
            this.f4066o00oOo0o = 0;
        }

        public int o00oOoOo() {
            return this.f4065o00oOo0O;
        }

        public int o00oOoo0() {
            return this.f4066o00oOo0o;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final SparseIntArray f4067o00oOOo0 = new SparseIntArray();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final SparseIntArray f4068o00oOOoO = new SparseIntArray();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f4069o00oOo00 = false;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f4070o00oOooO = false;

        public static int o00oOOo0(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int o00oOOoO(int i, int i2) {
            if (this.f4070o00oOooO) {
                int i3 = this.f4068o00oOOoO.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int o00oOooO2 = o00oOooO(i, i2);
                this.f4068o00oOOoO.put(i, o00oOooO2);
                return o00oOooO2;
            }
            return o00oOooO(i, i2);
        }

        public int o00oOo00(int i, int i2) {
            if (this.f4069o00oOo00) {
                int i3 = this.f4067o00oOOo0.get(i, -1);
                if (i3 != -1) {
                    return i3;
                }
                int o00oOo0O2 = o00oOo0O(i, i2);
                this.f4067o00oOOo0.put(i, o00oOo0O2);
                return o00oOo0O2;
            }
            return o00oOo0O(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int o00oOo0O(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.o00oOo0o(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f4069o00oOo00
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f4067o00oOOo0
                int r2 = o00oOOo0(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f4067o00oOOo0
                int r3 = r3.get(r2)
                int r4 = r5.o00oOo0o(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.o00oOo0o(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o00oOo00.o00oOo0O(int, int):int");
        }

        public abstract int o00oOo0o(int i);

        public void o00oOoO() {
            this.f4067o00oOOo0.clear();
        }

        public void o00oOoO0() {
            this.f4068o00oOOoO.clear();
        }

        public boolean o00oOoOO() {
            return this.f4070o00oOooO;
        }

        public boolean o00oOoOo() {
            return this.f4069o00oOo00;
        }

        public void o00oOoo0(boolean z) {
            if (!z) {
                this.f4068o00oOOoO.clear();
            }
            this.f4070o00oOooO = z;
        }

        public int o00oOooO(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int o00oOOo02;
            if (!this.f4070o00oOooO || (o00oOOo02 = o00oOOo0(this.f4068o00oOOoO, i)) == -1) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i4 = this.f4068o00oOOoO.get(o00oOOo02);
                i5 = o00oOOo02 + 1;
                i3 = o00oOo0o(o00oOOo02) + o00oOo00(o00oOOo02, i2);
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                }
            }
            int o00oOo0o2 = o00oOo0o(i);
            while (i5 < i) {
                int o00oOo0o3 = o00oOo0o(i5);
                i3 += o00oOo0o3;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = o00oOo0o3;
                }
                i5++;
            }
            return i3 + o00oOo0o2 > i2 ? i4 + 1 : i4;
        }

        public void o00oOooo(boolean z) {
            if (!z) {
                this.f4068o00oOOoO.clear();
            }
            this.f4069o00oOo00 = z;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f4055o00oOOo0 = false;
        this.f4056o00oOOoO = -1;
        this.f4058o00oOo0O = new SparseIntArray();
        this.f4059o00oOo0o = new SparseIntArray();
        this.f4061o00oOoO0 = new o00oOOo0();
        this.f4060o00oOoO = new Rect();
        o00oo0o(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f4055o00oOOo0 = false;
        this.f4056o00oOOoO = -1;
        this.f4058o00oOo0O = new SparseIntArray();
        this.f4059o00oOo0o = new SparseIntArray();
        this.f4061o00oOoO0 = new o00oOOo0();
        this.f4060o00oOoO = new Rect();
        o00oo0o(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4055o00oOOo0 = false;
        this.f4056o00oOOoO = -1;
        this.f4058o00oOo0O = new SparseIntArray();
        this.f4059o00oOo0o = new SparseIntArray();
        this.f4061o00oOoO0 = new o00oOOo0();
        this.f4060o00oOoO = new Rect();
        o00oo0o(RecyclerView.o0O00000.getProperties(context, attributeSet, i, i2).f4141o00oOOoO);
    }

    public static int[] o00oOooO(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean checkLayoutParams(RecyclerView.o0O0000O o0o0000o) {
        return o0o0000o instanceof o00oOOoO;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.o0O00OOO o0o00ooo, LinearLayoutManager.o00oOo00 o00ooo002, RecyclerView.o0O00000.o00oOo00 o00ooo003) {
        int i = this.f4056o00oOOoO;
        for (int i2 = 0; i2 < this.f4056o00oOOoO && o00ooo002.o00oOo00(o0o00ooo) && i > 0; i2++) {
            int i3 = o00ooo002.f4100o00oOooO;
            o00ooo003.o00oOOo0(i3, Math.max(0, o00ooo002.f4096o00oOoO0));
            i -= this.f4061o00oOoO0.o00oOo0o(i3);
            o00ooo002.f4100o00oOooO += o00ooo002.f4093o00oOo0O;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return this.f4062o00oOoOO ? o00oOo0o(o0o00ooo) : super.computeHorizontalScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeHorizontalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return this.f4062o00oOoOO ? o00oOoO0(o0o00ooo) : super.computeHorizontalScrollRange(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollOffset(RecyclerView.o0O00OOO o0o00ooo) {
        return this.f4062o00oOoOO ? o00oOo0o(o0o00ooo) : super.computeVerticalScrollOffset(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int computeVerticalScrollRange(RecyclerView.o0O00OOO o0o00ooo) {
        return this.f4062o00oOoOO ? o00oOoO0(o0o00ooo) : super.computeVerticalScrollRange(o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, boolean z, boolean z2) {
        int i;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = getChildCount() - 1;
            i3 = -1;
        } else {
            i2 = childCount;
            i = 0;
        }
        int o00oOooO2 = o0o00ooo.o00oOooO();
        ensureLayoutState();
        int o00oo02 = this.mOrientationHelper.o00oo0();
        int o00oOoOO2 = this.mOrientationHelper.o00oOoOO();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < o00oOooO2 && o00oo00O(o0o00o0, o0o00ooo, position) == 0) {
                if (((RecyclerView.o0O0000O) childAt.getLayoutParams()).o00oOoO0()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.o00oOoO0(childAt) < o00oOoOO2 && this.mOrientationHelper.o00oOooO(childAt) >= o00oo02) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new o00oOOoO(-2, -1) : new o00oOOoO(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new o00oOOoO(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public RecyclerView.o0O0000O generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oOOoO((ViewGroup.MarginLayoutParams) layoutParams) : new o00oOOoO(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int getColumnCountForAccessibility(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (this.mOrientation == 1) {
            return this.f4056o00oOOoO;
        }
        if (o0o00ooo.o00oOooO() < 1) {
            return 0;
        }
        return o00oOooo(o0o00o0, o0o00ooo, o0o00ooo.o00oOooO() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public int getRowCountForAccessibility(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (this.mOrientation == 0) {
            return this.f4056o00oOOoO;
        }
        if (o0o00ooo.o00oOooO() < 1) {
            return 0;
        }
        return o00oOooo(o0o00o0, o0o00ooo, o0o00ooo.o00oOooO() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        r22.f4080o00oOOoO = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.o0O00O0 r19, androidx.recyclerview.widget.RecyclerView.o0O00OOO r20, androidx.recyclerview.widget.LinearLayoutManager.o00oOo00 r21, androidx.recyclerview.widget.LinearLayoutManager.o00oOOoO r22) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$o0O00O0, androidx.recyclerview.widget.RecyclerView$o0O00OOO, androidx.recyclerview.widget.LinearLayoutManager$o00oOo00, androidx.recyclerview.widget.LinearLayoutManager$o00oOOoO):void");
    }

    public final void o00oOOo0(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i3 = 1;
            i5 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.f4063o00oOooO[i2];
            o00oOOoO o00ooooo2 = (o00oOOoO) view.getLayoutParams();
            int o00oo02 = o00oo0(o0o00o0, o0o00ooo, getPosition(view));
            o00ooooo2.f4066o00oOo0o = o00oo02;
            o00ooooo2.f4065o00oOo0O = i4;
            i4 += o00oo02;
            i2 += i3;
        }
    }

    public final void o00oOOoO() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            o00oOOoO o00ooooo2 = (o00oOOoO) getChildAt(i).getLayoutParams();
            int o00oOooO2 = o00ooooo2.o00oOooO();
            this.f4058o00oOo0O.put(o00oOooO2, o00ooooo2.o00oOoo0());
            this.f4059o00oOo0o.put(o00oOooO2, o00ooooo2.o00oOoOo());
        }
    }

    public final void o00oOo00(int i) {
        this.f4057o00oOo00 = o00oOooO(this.f4057o00oOo00, this.f4056o00oOOoO, i);
    }

    public final void o00oOo0O() {
        this.f4058o00oOo0O.clear();
        this.f4059o00oOo0o.clear();
    }

    public final int o00oOo0o(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() != 0 && o0o00ooo.o00oOooO() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int o00oOOoO2 = this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToStart), this.f4056o00oOOoO);
                int o00oOOoO3 = this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToEnd), this.f4056o00oOOoO);
                int min = Math.min(o00oOOoO2, o00oOOoO3);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.f4061o00oOoO0.o00oOOoO(o0o00ooo.o00oOooO() - 1, this.f4056o00oOOoO) + 1) - Math.max(o00oOOoO2, o00oOOoO3)) - 1) : Math.max(0, min);
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.o00oOooO(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.o00oOoO0(findFirstVisibleChildClosestToStart)) / ((this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToEnd), this.f4056o00oOOoO) - this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToStart), this.f4056o00oOOoO)) + 1))) + (this.mOrientationHelper.o00oo0() - this.mOrientationHelper.o00oOoO0(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    public final void o00oOoO(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, LinearLayoutManager.o00oOOo0 o00oooo02, int i) {
        boolean z = i == 1;
        int o00oo00O2 = o00oo00O(o0o00o0, o0o00ooo, o00oooo02.f4075o00oOOoO);
        if (z) {
            while (o00oo00O2 > 0) {
                int i2 = o00oooo02.f4075o00oOOoO;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                o00oooo02.f4075o00oOOoO = i3;
                o00oo00O2 = o00oo00O(o0o00o0, o0o00ooo, i3);
            }
            return;
        }
        int o00oOooO2 = o0o00ooo.o00oOooO() - 1;
        int i4 = o00oooo02.f4075o00oOOoO;
        while (i4 < o00oOooO2) {
            int i5 = i4 + 1;
            int o00oo00O3 = o00oo00O(o0o00o0, o0o00ooo, i5);
            if (o00oo00O3 <= o00oo00O2) {
                break;
            }
            i4 = i5;
            o00oo00O2 = o00oo00O3;
        }
        o00oooo02.f4075o00oOOoO = i4;
    }

    public final int o00oOoO0(RecyclerView.o0O00OOO o0o00ooo) {
        if (getChildCount() != 0 && o0o00ooo.o00oOooO() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (isSmoothScrollbarEnabled()) {
                    int o00oOooO2 = this.mOrientationHelper.o00oOooO(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.o00oOoO0(findFirstVisibleChildClosestToStart);
                    int o00oOOoO2 = this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToStart), this.f4056o00oOOoO);
                    return (int) ((o00oOooO2 / ((this.f4061o00oOoO0.o00oOOoO(getPosition(findFirstVisibleChildClosestToEnd), this.f4056o00oOOoO) - o00oOOoO2) + 1)) * (this.f4061o00oOoO0.o00oOOoO(o0o00ooo.o00oOooO() - 1, this.f4056o00oOOoO) + 1));
                }
                return this.f4061o00oOoO0.o00oOOoO(o0o00ooo.o00oOooO() - 1, this.f4056o00oOOoO) + 1;
            }
        }
        return 0;
    }

    public final void o00oOoOO() {
        View[] viewArr = this.f4063o00oOooO;
        if (viewArr == null || viewArr.length != this.f4056o00oOOoO) {
            this.f4063o00oOooO = new View[this.f4056o00oOOoO];
        }
    }

    public int o00oOoOo(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f4057o00oOo00;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4057o00oOo00;
        int i3 = this.f4056o00oOOoO;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public int o00oOoo0() {
        return this.f4056o00oOOoO;
    }

    public final int o00oOooo(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, int i) {
        if (o0o00ooo.o00oOoOo()) {
            int o00oOoO02 = o0o00o0.o00oOoO0(i);
            if (o00oOoO02 == -1) {
                return 0;
            }
            return this.f4061o00oOoO0.o00oOOoO(o00oOoO02, this.f4056o00oOOoO);
        }
        return this.f4061o00oOoO0.o00oOOoO(i, this.f4056o00oOOoO);
    }

    public final void o00oo() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        o00oOo00(height - paddingTop);
    }

    public final int o00oo0(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, int i) {
        if (o0o00ooo.o00oOoOo()) {
            int i2 = this.f4058o00oOo0O.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int o00oOoO02 = o0o00o0.o00oOoO0(i);
            if (o00oOoO02 == -1) {
                return 1;
            }
            return this.f4061o00oOoO0.o00oOo0o(o00oOoO02);
        }
        return this.f4061o00oOoO0.o00oOo0o(i);
    }

    public final int o00oo00O(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, int i) {
        if (o0o00ooo.o00oOoOo()) {
            int i2 = this.f4059o00oOo0o.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int o00oOoO02 = o0o00o0.o00oOoO0(i);
            if (o00oOoO02 == -1) {
                return 0;
            }
            return this.f4061o00oOoO0.o00oOo00(o00oOoO02, this.f4056o00oOOoO);
        }
        return this.f4061o00oOoO0.o00oOo00(i, this.f4056o00oOOoO);
    }

    public boolean o00oo0O() {
        return this.f4062o00oOoOO;
    }

    public final void o00oo0O0(float f, int i) {
        o00oOo00(Math.max(Math.round(f * this.f4056o00oOOoO), i));
    }

    public o00oOo00 o00oo0OO() {
        return this.f4061o00oOoO0;
    }

    public final void o00oo0Oo(View view, int i, boolean z) {
        int i2;
        int i3;
        o00oOOoO o00ooooo2 = (o00oOOoO) view.getLayoutParams();
        Rect rect = o00ooooo2.f4145o00oOOoO;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) o00ooooo2).topMargin + ((ViewGroup.MarginLayoutParams) o00ooooo2).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) o00ooooo2).leftMargin + ((ViewGroup.MarginLayoutParams) o00ooooo2).rightMargin;
        int o00oOoOo2 = o00oOoOo(o00ooooo2.f4065o00oOo0O, o00ooooo2.f4066o00oOo0o);
        if (this.mOrientation == 1) {
            i3 = RecyclerView.o0O00000.getChildMeasureSpec(o00oOoOo2, i, i5, ((ViewGroup.MarginLayoutParams) o00ooooo2).width, false);
            i2 = RecyclerView.o0O00000.getChildMeasureSpec(this.mOrientationHelper.o00oo0OO(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) o00ooooo2).height, true);
        } else {
            int childMeasureSpec = RecyclerView.o0O00000.getChildMeasureSpec(o00oOoOo2, i, i4, ((ViewGroup.MarginLayoutParams) o00ooooo2).height, false);
            int childMeasureSpec2 = RecyclerView.o0O00000.getChildMeasureSpec(this.mOrientationHelper.o00oo0OO(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) o00ooooo2).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        o00oo0o0(view, i3, i2, z);
    }

    public void o00oo0o(int i) {
        if (i == this.f4056o00oOOoO) {
            return;
        }
        this.f4055o00oOOo0 = true;
        if (i < 1) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Span count should be at least 1. Provided ", i));
        }
        this.f4056o00oOOoO = i;
        this.f4061o00oOoO0.o00oOoO();
        requestLayout();
    }

    public final void o00oo0o0(View view, int i, int i2, boolean z) {
        RecyclerView.o0O0000O o0o0000o = (RecyclerView.o0O0000O) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, o0o0000o) : shouldMeasureChild(view, i, i2, o0o0000o)) {
            view.measure(i, i2);
        }
    }

    public void o00oo0oO(o00oOo00 o00ooo002) {
        this.f4061o00oOoO0 = o00ooo002;
    }

    public void o0O0o(boolean z) {
        this.f4062o00oOoOO = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, LinearLayoutManager.o00oOOo0 o00oooo02, int i) {
        super.onAnchorReady(o0o00o0, o0o00ooo, o00oooo02, i);
        o00oo();
        if (o0o00ooo.o00oOooO() > 0 && !o0o00ooo.o00oOoOo()) {
            o00oOoO(o0o00o0, o0o00ooo, o00oooo02, i);
        }
        o00oOoOO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.o0O00O0 r26, androidx.recyclerview.widget.RecyclerView.o0O00OOO r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o0O00O0, androidx.recyclerview.widget.RecyclerView$o0O00OOO):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo, View view, o0O00.o00oo0O o00oo0o2) {
        int i;
        int o00oOoOo2;
        int o00oOoo02;
        boolean z;
        boolean z2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof o00oOOoO)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, o00oo0o2);
            return;
        }
        o00oOOoO o00ooooo2 = (o00oOOoO) layoutParams;
        int o00oOooo2 = o00oOooo(o0o00o0, o0o00ooo, o00ooooo2.o00oOooO());
        if (this.mOrientation == 0) {
            i2 = o00ooooo2.o00oOoOo();
            i = o00ooooo2.o00oOoo0();
            o00oOoo02 = 1;
            z = false;
            z2 = false;
            o00oOoOo2 = o00oOooo2;
        } else {
            i = 1;
            o00oOoOo2 = o00ooooo2.o00oOoOo();
            o00oOoo02 = o00ooooo2.o00oOoo0();
            z = false;
            z2 = false;
            i2 = o00oOooo2;
        }
        o00oo0o2.o0O0o000(o00oo0O.o00oOo0O.o00oOoO(i2, i, o00oOoOo2, o00oOoo02, z, z2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f4061o00oOoO0.o00oOoO();
        this.f4061o00oOoO0.o00oOoO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4061o00oOoO0.o00oOoO();
        this.f4061o00oOoO0.o00oOoO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4061o00oOoO0.o00oOoO();
        this.f4061o00oOoO0.o00oOoO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f4061o00oOoO0.o00oOoO();
        this.f4061o00oOoO0.o00oOoO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4061o00oOoO0.o00oOoO();
        this.f4061o00oOoO0.o00oOoO0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutChildren(RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        if (o0o00ooo.o00oOoOo()) {
            o00oOOoO();
        }
        super.onLayoutChildren(o0o00o0, o0o00ooo);
        o00oOo0O();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public void onLayoutCompleted(RecyclerView.o0O00OOO o0o00ooo) {
        super.onLayoutCompleted(o0o00ooo);
        this.f4055o00oOOo0 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollHorizontallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        o00oo();
        o00oOoOO();
        return super.scrollHorizontallyBy(i, o0o00o0, o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public int scrollVerticallyBy(int i, RecyclerView.o0O00O0 o0o00o0, RecyclerView.o0O00OOO o0o00ooo) {
        o00oo();
        o00oOoOO();
        return super.scrollVerticallyBy(i, o0o00o0, o0o00ooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O00000
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.f4057o00oOo00 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.o0O00000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f4057o00oOo00;
            chooseSize = RecyclerView.o0O00000.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o0O00000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f4057o00oOo00;
            chooseSize2 = RecyclerView.o0O00000.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o0O00000
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f4055o00oOOo0;
    }
}
