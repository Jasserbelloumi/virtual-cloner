package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O000Oo extends o0O0O0O {

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final float f4583o00oOoO0 = 1.0f;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00O f4584o00oOo0O;
    @o0OO00OO

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O00O f4585o00oOo0o;

    @Override // androidx.recyclerview.widget.o0O0O0O
    public int[] o00oOo00(@oo0oO0 RecyclerView.o0O00000 o0o00000, @oo0oO0 View view) {
        int[] iArr = new int[2];
        if (o0o00000.canScrollHorizontally()) {
            iArr[0] = o00oo0(view, o00oo0O(o0o00000));
        } else {
            iArr[0] = 0;
        }
        if (o0o00000.canScrollVertically()) {
            iArr[1] = o00oo0(view, o00oo0Oo(o0o00000));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    public View o00oOoO(RecyclerView.o0O00000 o0o00000) {
        o0O00O o00oo0O2;
        if (o0o00000.canScrollVertically()) {
            o00oo0O2 = o00oo0Oo(o0o00000);
        } else if (!o0o00000.canScrollHorizontally()) {
            return null;
        } else {
            o00oo0O2 = o00oo0O(o0o00000);
        }
        return o00oo0O0(o0o00000, o00oo0O2);
    }

    @Override // androidx.recyclerview.widget.o0O0O0O
    public int o00oOoOO(RecyclerView.o0O00000 o0o00000, int i, int i2) {
        int itemCount;
        View o00oOoO2;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(o0o00000 instanceof RecyclerView.o0O00OO.o00oOOoO) || (itemCount = o0o00000.getItemCount()) == 0 || (o00oOoO2 = o00oOoO(o0o00000)) == null || (position = o0o00000.getPosition(o00oOoO2)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.o0O00OO.o00oOOoO) o0o00000).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (o0o00000.canScrollHorizontally()) {
            i4 = o00oo0OO(o0o00000, o00oo0O(o0o00000), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (o0o00000.canScrollVertically()) {
            i5 = o00oo0OO(o0o00000, o00oo0Oo(o0o00000), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (o0o00000.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = position + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= itemCount ? i3 : i7;
    }

    public final int o00oo0(@oo0oO0 View view, o0O00O o0o00o) {
        return ((o0o00o.o00oOo0O(view) / 2) + o0o00o.o00oOoO0(view)) - ((o0o00o.o00oo0OO() / 2) + o0o00o.o00oo0());
    }

    public final float o00oo00O(RecyclerView.o0O00000 o0o00000, o0O00O o0o00o) {
        int childCount = o0o00000.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = o0o00000.getChildAt(i3);
            int position = o0o00000.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(o0o00o.o00oOooO(view), o0o00o.o00oOooO(view2)) - Math.min(o0o00o.o00oOoO0(view), o0o00o.o00oOoO0(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i - i2) + 1);
    }

    @oo0oO0
    public final o0O00O o00oo0O(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        o0O00O o0o00o = this.f4585o00oOo0o;
        if (o0o00o == null || o0o00o.f4592o00oOOo0 != o0o00000) {
            this.f4585o00oOo0o = new o0O00O.o00oOOo0(o0o00000);
        }
        return this.f4585o00oOo0o;
    }

    @o0OO00OO
    public final View o00oo0O0(RecyclerView.o0O00000 o0o00000, o0O00O o0o00o) {
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

    public final int o00oo0OO(RecyclerView.o0O00000 o0o00000, o0O00O o0o00o, int i, int i2) {
        int[] o00oOooO2 = o00oOooO(i, i2);
        float o00oo00O2 = o00oo00O(o0o00000, o0o00o);
        if (o00oo00O2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(o00oOooO2[0]) > Math.abs(o00oOooO2[1]) ? o00oOooO2[0] : o00oOooO2[1]) / o00oo00O2);
    }

    @oo0oO0
    public final o0O00O o00oo0Oo(@oo0oO0 RecyclerView.o0O00000 o0o00000) {
        o0O00O o0o00o = this.f4584o00oOo0O;
        if (o0o00o == null || o0o00o.f4592o00oOOo0 != o0o00000) {
            this.f4584o00oOo0O = new o0O00O.o00oOOoO(o0o00000);
        }
        return this.f4584o00oOo0O;
    }
}
