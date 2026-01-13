package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f5417o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public LinearLayoutManager f5418o00oOOo0;

    /* renamed from: androidx.viewpager2.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0060o00oOOo0 implements Comparator<int[]> {
        public C0060o00oOOo0() {
        }

        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5417o00oOOoO = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public o00oOOo0(@oo0oO0 LinearLayoutManager linearLayoutManager) {
        this.f5418o00oOOo0 = linearLayoutManager;
    }

    public static boolean o00oOo00(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (o00oOo00(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o00oOOo0() {
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.f5418o00oOOo0.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.f5418o00oOOo0.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, childCount, 2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f5418o00oOOo0.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f5417o00oOOoO;
            int[] iArr2 = iArr[i3];
            if (z) {
                top = childAt.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = childAt.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new C0060o00oOOo0());
        for (int i4 = 1; i4 < childCount; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[childCount - 1][1] >= i5 - i6;
    }

    public final boolean o00oOOoO() {
        int childCount = this.f5418o00oOOo0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (o00oOo00(this.f5418o00oOOo0.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean o00oOooO() {
        return (!o00oOOo0() || this.f5418o00oOOo0.getChildCount() <= 1) && o00oOOoO();
    }
}
