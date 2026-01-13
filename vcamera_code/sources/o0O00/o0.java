package o0O00;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9925o00oOOoO = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9926o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f9927o00oOo0O = 3;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9928o00oOo0o = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9929o00oOoO0 = 5;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f9930o00oOooO = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f9931o00oOOo0;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @o0O0O0Oo
        public static AccessibilityWindowInfo o00oOOoO(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @o0O0O0Oo
        public static int o00oOo00(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @o0O0O0Oo
        public static int o00oOo0O(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @o0O0O0Oo
        public static AccessibilityWindowInfo o00oOo0o(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @o0O0O0Oo
        public static int o00oOoO(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @o0O0O0Oo
        public static AccessibilityNodeInfo o00oOoO0(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @o0O0O0Oo
        public static boolean o00oOoOO(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @o0O0O0Oo
        public static boolean o00oOoOo(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @o0O0O0Oo
        public static boolean o00oOoo0(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @o0O0O0Oo
        public static int o00oOooO(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @o0O0O0Oo
        public static AccessibilityWindowInfo o00oOooo() {
            return AccessibilityWindowInfo.obtain();
        }

        @o0O0O0Oo
        public static void o00oo0(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }

        @o0O0O0Oo
        public static AccessibilityWindowInfo o00oo00O(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static AccessibilityNodeInfo o00oOOo0(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @o0O0O0Oo
        public static CharSequence o00oOOoO(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static int o00oOOo0(AccessibilityWindowInfo accessibilityWindowInfo) {
            int displayId;
            displayId = accessibilityWindowInfo.getDisplayId();
            return displayId;
        }

        @o0O0O0Oo
        public static void o00oOOoO(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @o0O0O0Oo
        public static boolean o00oOo00(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public o0(Object obj) {
        this.f9931o00oOOo0 = obj;
    }

    @o0OO00OO
    public static o0 o00oo0O() {
        return o0O0o(o00oOOo0.o00oOooo());
    }

    @o0OO00OO
    public static o0 o00oo0Oo(@o0OO00OO o0 o0Var) {
        if (o0Var == null) {
            return null;
        }
        return o0O0o(o00oOOo0.o00oo00O((AccessibilityWindowInfo) o0Var.f9931o00oOOo0));
    }

    public static String o00oo0o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static o0 o0O0o(Object obj) {
        if (obj != null) {
            return new o0(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof o0)) {
            Object obj2 = this.f9931o00oOOo0;
            Object obj3 = ((o0) obj).f9931o00oOOo0;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f9931o00oOOo0;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @o0OO00OO
    public o00oo0O o00oOOo0() {
        return o00oo0O.o0OO0o00(o00oOOoO.o00oOOo0((AccessibilityWindowInfo) this.f9931o00oOOo0));
    }

    public void o00oOOoO(@oo0oO0 Rect rect) {
        o00oOOo0.o00oOOo0((AccessibilityWindowInfo) this.f9931o00oOOo0, rect);
    }

    @o0OO00OO
    public o0 o00oOo00(int i) {
        return o0O0o(o00oOOo0.o00oOOoO((AccessibilityWindowInfo) this.f9931o00oOOo0, i));
    }

    public int o00oOo0O() {
        if (Build.VERSION.SDK_INT >= 33) {
            return o00oOo00.o00oOOo0((AccessibilityWindowInfo) this.f9931o00oOOo0);
        }
        return 0;
    }

    public int o00oOo0o() {
        return o00oOOo0.o00oOooO((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    @o0OO00OO
    public o0 o00oOoO() {
        return o0O0o(o00oOOo0.o00oOo0o((AccessibilityWindowInfo) this.f9931o00oOOo0));
    }

    public int o00oOoO0() {
        return o00oOOo0.o00oOo0O((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public void o00oOoOO(@oo0oO0 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            o00oOo00.o00oOOoO((AccessibilityWindowInfo) this.f9931o00oOOo0, region);
            return;
        }
        Rect rect = new Rect();
        o00oOOo0.o00oOOo0((AccessibilityWindowInfo) this.f9931o00oOOo0, rect);
        region.set(rect);
    }

    @o0OO00OO
    public o00oo0O o00oOoOo() {
        return o00oo0O.o0OO0o00(o00oOOo0.o00oOoO0((AccessibilityWindowInfo) this.f9931o00oOOo0));
    }

    @o0OO00OO
    public CharSequence o00oOoo0() {
        return o00oOOoO.o00oOOoO((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public int o00oOooO() {
        return o00oOOo0.o00oOo00((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public int o00oOooo() {
        return o00oOOo0.o00oOoO((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public boolean o00oo0() {
        return o00oOOo0.o00oOoOo((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public boolean o00oo00O() {
        return o00oOOo0.o00oOoOO((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public boolean o00oo0O0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return o00oOo00.o00oOo00((AccessibilityWindowInfo) this.f9931o00oOOo0);
        }
        return false;
    }

    public boolean o00oo0OO() {
        return o00oOOo0.o00oOoo0((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    public void o00oo0o0() {
        o00oOOo0.o00oo0((AccessibilityWindowInfo) this.f9931o00oOOo0);
    }

    @o0OO00OO
    public AccessibilityWindowInfo o00oo0oO() {
        return (AccessibilityWindowInfo) this.f9931o00oOOo0;
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        o00oOOoO(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(o00oOo0o());
        sb.append(", type=");
        sb.append(o00oo0o(o00oOooo()));
        sb.append(", layer=");
        sb.append(o00oOoO0());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(o00oo0OO());
        sb.append(", active=");
        sb.append(o00oo0());
        sb.append(", hasParent=");
        sb.append(o00oOoO() != null);
        sb.append(", hasChildren=");
        sb.append(o00oOooO() > 0);
        sb.append(']');
        return sb.toString();
    }
}
