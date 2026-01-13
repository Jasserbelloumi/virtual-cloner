package o0O00;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00 {

    @Deprecated
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class o00oOOoO implements o00oOOo0 {
    }

    /* renamed from: o0O00.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00 implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOOo0 f9966o00oOOo0;

        public accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00(@oo0oO0 o00oOOo0 o00oooo02) {
            this.f9966o00oOOo0 = o00oooo02;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00) {
                return this.f9966o00oOOo0.equals(((accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00) obj).f9966o00oOOo0);
            }
            return false;
        }

        public int hashCode() {
            return this.f9966o00oOOo0.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f9966o00oOOo0.onAccessibilityStateChanged(z);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static boolean o00oOOo0(AccessibilityManager accessibilityManager, o00oOoO o00oooo2) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new o00oo00O(o00oooo2));
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(AccessibilityManager accessibilityManager, o00oOoO o00oooo2) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new o00oo00O(o00oooo2));
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        void onTouchExplorationStateChanged(boolean z);
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static final class o00oo00O implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOoO f9967o00oOOo0;

        public o00oo00O(@oo0oO0 o00oOoO o00oooo2) {
            this.f9967o00oOOo0 = o00oooo2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oo00O) {
                return this.f9967o00oOOo0.equals(((o00oo00O) obj).f9967o00oOOo0);
            }
            return false;
        }

        public int hashCode() {
            return this.f9967o00oOOo0.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f9967o00oOOo0.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean o00oOOo0(AccessibilityManager accessibilityManager, o00oOOo0 o00oooo02) {
        if (o00oooo02 == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00(o00oooo02));
    }

    public static boolean o00oOOoO(@oo0oO0 AccessibilityManager accessibilityManager, @oo0oO0 o00oOoO o00oooo2) {
        return o00oOo0O.o00oOOo0(accessibilityManager, o00oooo2);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> o00oOo00(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    public static boolean o00oOo0O(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean o00oOo0o(AccessibilityManager accessibilityManager, o00oOOo0 o00oooo02) {
        if (o00oooo02 == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new accessibility.AccessibilityManager$AccessibilityStateChangeListenerC0119o00oOo00(o00oooo02));
    }

    public static boolean o00oOoO0(@oo0oO0 AccessibilityManager accessibilityManager, @oo0oO0 o00oOoO o00oooo2) {
        return o00oOo0O.o00oOOoO(accessibilityManager, o00oooo2);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> o00oOooO(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }
}
