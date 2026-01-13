package o0O000oo;
/* loaded from: classes.dex */
public interface o0O00oO0 {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @o00oOooO.o0OO00OO int[] iArr, @o00oOooO.o0OO00OO int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
