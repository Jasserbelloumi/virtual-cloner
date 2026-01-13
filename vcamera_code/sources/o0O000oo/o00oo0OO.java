package o0O000oo;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;
import o00oooOo.oOO00o;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public final class o00oo0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final DisplayCutout f10456o00oOOo0;

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static DisplayCutout o00oOOo0(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @o00oOooO.o0O0O0Oo
        public static List<Rect> o00oOOoO(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo00(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0O(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0o(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOooO(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static DisplayCutout o00oOOo0(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static DisplayCutout o00oOOo0(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @o00oOooO.o0O0O0Oo
        public static Insets o00oOOoO(DisplayCutout displayCutout) {
            Insets waterfallInsets;
            waterfallInsets = displayCutout.getWaterfallInsets();
            return waterfallInsets;
        }
    }

    public o00oo0OO(@o00oOooO.o0OO00OO Rect rect, @o00oOooO.o0OO00OO List<Rect> list) {
        this(o00oOOo0.o00oOOo0(rect, list));
    }

    public o00oo0OO(DisplayCutout displayCutout) {
        this.f10456o00oOOo0 = displayCutout;
    }

    public o00oo0OO(@o00oOooO.oo0oO0 oOO00o ooo00o, @o00oOooO.o0OO00OO Rect rect, @o00oOooO.o0OO00OO Rect rect2, @o00oOooO.o0OO00OO Rect rect3, @o00oOooO.o0OO00OO Rect rect4, @o00oOooO.oo0oO0 oOO00o ooo00o2) {
        this(o00oOOo0(ooo00o, rect, rect2, rect3, rect4, ooo00o2));
    }

    public static DisplayCutout o00oOOo0(@o00oOooO.oo0oO0 oOO00o ooo00o, @o00oOooO.o0OO00OO Rect rect, @o00oOooO.o0OO00OO Rect rect2, @o00oOooO.o0OO00OO Rect rect3, @o00oOooO.o0OO00OO Rect rect4, @o00oOooO.oo0oO0 oOO00o ooo00o2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return o00oOo00.o00oOOo0(ooo00o.o00oOoO(), rect, rect2, rect3, rect4, ooo00o2.o00oOoO());
        }
        if (i >= 29) {
            return o00oOOoO.o00oOOo0(ooo00o.o00oOoO(), rect, rect2, rect3, rect4);
        }
        Rect rect5 = new Rect(ooo00o.f9791o00oOOo0, ooo00o.f9792o00oOOoO, ooo00o.f9793o00oOo00, ooo00o.f9794o00oOooO);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return o00oOOo0.o00oOOo0(rect5, arrayList);
    }

    public static o00oo0OO o00oOoOO(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new o00oo0OO(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00oo0OO.class != obj.getClass()) {
            return false;
        }
        return oO0Ooooo.o00oOOo0.o00oOOo0(this.f10456o00oOOo0, ((o00oo0OO) obj).f10456o00oOOo0);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f10456o00oOOo0;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @o00oOooO.oo0oO0
    public List<Rect> o00oOOoO() {
        return o00oOOo0.o00oOOoO(this.f10456o00oOOo0);
    }

    public int o00oOo00() {
        return o00oOOo0.o00oOo00(this.f10456o00oOOo0);
    }

    public int o00oOo0O() {
        return o00oOOo0.o00oOo0O(this.f10456o00oOOo0);
    }

    public int o00oOo0o() {
        return o00oOOo0.o00oOo0o(this.f10456o00oOOo0);
    }

    @o00oOooO.o0OOooO0(28)
    public DisplayCutout o00oOoO() {
        return this.f10456o00oOOo0;
    }

    @o00oOooO.oo0oO0
    public oOO00o o00oOoO0() {
        return Build.VERSION.SDK_INT >= 30 ? oOO00o.o00oOoO0(o00oOo00.o00oOOoO(this.f10456o00oOOo0)) : oOO00o.f9790o00oOo0O;
    }

    public int o00oOooO() {
        return o00oOOo0.o00oOooO(this.f10456o00oOOo0);
    }

    @o00oOooO.oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("DisplayCutoutCompat{");
        o00oOOo02.append(this.f10456o00oOOo0);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
