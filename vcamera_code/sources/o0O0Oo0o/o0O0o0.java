package o0O0Oo0o;

import android.view.View;
/* loaded from: classes.dex */
public abstract class o0O0o0 extends o0O00O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11940o00oOOo0 = "android:visibilityPropagation:visibility";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f11941o00oOOoO = "android:visibilityPropagation:center";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String[] f11942o00oOo00 = {f11940o00oOOo0, f11941o00oOOoO};

    public static int o00oOooO(o0OoO00O o0ooo00o, int i) {
        int[] iArr;
        if (o0ooo00o == null || (iArr = (int[]) o0ooo00o.f11944o00oOOo0.get(f11941o00oOOoO)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // o0O0Oo0o.o0O00O0
    public void o00oOOo0(o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        Integer num = (Integer) o0ooo00o.f11944o00oOOo0.get(androidx.transition.o0O00O0o.PROPNAME_VISIBILITY);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        o0ooo00o.f11944o00oOOo0.put(f11940o00oOOo0, num);
        view.getLocationOnScreen(r2);
        int round = Math.round(view.getTranslationX()) + r2[0];
        int[] iArr = {round};
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        o0ooo00o.f11944o00oOOo0.put(f11941o00oOOoO, iArr);
    }

    @Override // o0O0Oo0o.o0O00O0
    public String[] o00oOOoO() {
        return f11942o00oOo00;
    }

    public int o00oOo0O(o0OoO00O o0ooo00o) {
        Integer num;
        if (o0ooo00o == null || (num = (Integer) o0ooo00o.f11944o00oOOo0.get(f11940o00oOOo0)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int o00oOo0o(o0OoO00O o0ooo00o) {
        return o00oOooO(o0ooo00o, 0);
    }

    public int o00oOoO0(o0OoO00O o0ooo00o) {
        return o00oOooO(o0ooo00o, 1);
    }
}
