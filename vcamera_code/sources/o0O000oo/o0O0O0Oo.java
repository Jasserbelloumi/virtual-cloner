package o0O000oo;

import android.view.View;
/* loaded from: classes.dex */
public interface o0O0O0Oo {
    int getNestedScrollAxes();

    boolean onNestedFling(@o00oOooO.oo0oO0 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@o00oOooO.oo0oO0 View view, float f, float f2);

    void onNestedPreScroll(@o00oOooO.oo0oO0 View view, int i, int i2, @o00oOooO.oo0oO0 int[] iArr);

    void onNestedScroll(@o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i);

    boolean onStartNestedScroll(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i);

    void onStopNestedScroll(@o00oOooO.oo0oO0 View view);
}
