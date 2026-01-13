package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00OO extends o0O0O0O {

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f4627o00oOoO0 = 100;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00O f4628o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O00O f4629o00oOo0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0OoOoOo {
        public o00oOOo0(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o0OoOoOo
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.o0OoOoOo
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.o0OoOoOo, androidx.recyclerview.widget.RecyclerView.o0O00OO
        public void onTargetFound(View view, RecyclerView.o0O00OOO o0o00ooo, RecyclerView.o0O00OO.o00oOOo0 o00oooo02) {
            o0O00OO o0o00oo = o0O00OO.this;
            int[] o00oOo002 = o0o00oo.o00oOo00(o0o00oo.f4635o00oOOo0.getLayoutManager(), view);
            int i = o00oOo002[0];
            int i2 = o00oOo002[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                o00oooo02.o00oOooo(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    @o0OO00OO
    public int[] o00oOo00(@oo0oO0 RecyclerView.o0O00000 o0o00000, @oo0oO0 View view) {
        int[] iArr = new int[2];
        if (o0o00000.canScrollHorizontally()) {
            iArr[0] = o00oo00O(view, o00oo0OO(o0o00000));
        } else {
            iArr[0] = 0;
        }
        if (o0o00000.canScrollVertically()) {
            iArr[1] = o00oo00O(view, o00oo0O(o0o00000));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    @o0OO00OO
    public RecyclerView.o0O00OO o00oOo0O(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        if (o0o00000 instanceof RecyclerView.o0O00OO.o00oOOoO) {
            return new o00oOOo0(this.f4635o00oOOo0.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    @o0OO00OO
    public View o00oOoO(RecyclerView.o0O00000 o0o00000) {
        o0O00O o00oo0OO2;
        if (o0o00000.canScrollVertically()) {
            o00oo0OO2 = o00oo0O(o0o00000);
        } else if (!o0o00000.canScrollHorizontally()) {
            return null;
        } else {
            o00oo0OO2 = o00oo0OO(o0o00000);
        }
        return o00oo0(o0o00000, o00oo0OO2);
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    public int o00oOoOO(RecyclerView.o0O00000 o0o00000, int i, int i2) {
        o0O00O o00oo0O02;
        int itemCount = o0o00000.getItemCount();
        if (itemCount == 0 || (o00oo0O02 = o00oo0O0(o0o00000)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int childCount = o0o00000.getChildCount();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = o0o00000.getChildAt(i5);
            if (childAt != null) {
                int o00oo00O2 = o00oo00O(childAt, o00oo0O02);
                if (o00oo00O2 <= 0 && o00oo00O2 > i3) {
                    view2 = childAt;
                    i3 = o00oo00O2;
                }
                if (o00oo00O2 >= 0 && o00oo00O2 < i4) {
                    view = childAt;
                    i4 = o00oo00O2;
                }
            }
        }
        boolean o00oo0Oo2 = o00oo0Oo(o0o00000, i, i2);
        if (!o00oo0Oo2 || view == null) {
            if (o00oo0Oo2 || view2 == null) {
                if (o00oo0Oo2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int position = o0o00000.getPosition(view) + (o00oo0o0(o0o00000) == o00oo0Oo2 ? -1 : 1);
                if (position < 0 || position >= itemCount) {
                    return -1;
                }
                return position;
            }
            return o0o00000.getPosition(view2);
        }
        return o0o00000.getPosition(view);
    }

    @o0OO00OO
    public final View o00oo0(RecyclerView.o0O00000 o0o00000, o0O00O o0o00o) {
        int childCount = o0o00000.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int o00oo0OO2 = (o0o00o.o00oo0OO() / 2) + o0o00o.o00oo0();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = o0o00000.getChildAt(i2);
            int abs = Math.abs(((o0o00o.o00oOo0O(childAt) / 2) + o0o00o.o00oOoO0(childAt)) - o00oo0OO2);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    public final int o00oo00O(@oo0oO0 View view, o0O00O o0o00o) {
        return ((o0o00o.o00oOo0O(view) / 2) + o0o00o.o00oOoO0(view)) - ((o0o00o.o00oo0OO() / 2) + o0o00o.o00oo0());
    }

    @oo0oO0
    public final o0O00O o00oo0O(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        o0O00O o0o00o = this.f4628o00oOo0O;
        if (o0o00o == null || o0o00o.f4592o00oOOo0 != o0o00000) {
            this.f4628o00oOo0O = new o0O00O.o00oOOoO(o0o00000);
        }
        return this.f4628o00oOo0O;
    }

    @o0OO00OO
    public final o0O00O o00oo0O0(RecyclerView.o0O00000 o0o00000) {
        if (o0o00000.canScrollVertically()) {
            return o00oo0O(o0o00000);
        }
        if (o0o00000.canScrollHorizontally()) {
            return o00oo0OO(o0o00000);
        }
        return null;
    }

    @oo0oO0
    public final o0O00O o00oo0OO(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        o0O00O o0o00o = this.f4629o00oOo0o;
        if (o0o00o == null || o0o00o.f4592o00oOOo0 != o0o00000) {
            this.f4629o00oOo0o = new o0O00O.o00oOOo0(o0o00000);
        }
        return this.f4629o00oOo0o;
    }

    public final boolean o00oo0Oo(RecyclerView.o0O00000 o0o00000, int i, int i2) {
        return o0o00000.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    public final boolean o00oo0o0(RecyclerView.o0O00000 o0o00000) {
        PointF computeScrollVectorForPosition;
        int itemCount = o0o00000.getItemCount();
        if (!(o0o00000 instanceof RecyclerView.o0O00OO.o00oOOoO) || (computeScrollVectorForPosition = ((RecyclerView.o0O00OO.o00oOOoO) o0o00000).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }
}
