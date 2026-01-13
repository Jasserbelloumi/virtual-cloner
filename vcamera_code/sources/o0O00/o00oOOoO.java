package o0O00;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO {
    @Deprecated

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9936o00oOOo0 = 128;
    @Deprecated

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9937o00oOOoO = 256;
    @Deprecated

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9938o00oOo00 = 512;
    @Deprecated

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f9939o00oOo0O = 2048;
    @Deprecated

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9940o00oOo0o = 4096;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f9941o00oOoO = 16384;
    @Deprecated

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9942o00oOoO0 = 8192;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f9943o00oOoOO = 32768;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f9944o00oOoOo = 65536;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f9945o00oOoo0 = 131072;
    @Deprecated

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f9946o00oOooO = 1024;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f9947o00oOooo = 262144;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f9948o00oo = 8;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f9949o00oo0 = 1048576;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f9950o00oo00O = 524288;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f9951o00oo0O = 8388608;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f9952o00oo0O0 = 4194304;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f9953o00oo0OO = 2097152;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f9954o00oo0Oo = 16777216;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f9955o00oo0o = 1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f9956o00oo0o0 = 0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9957o00oo0oO = 2;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f9958o00ooO = 256;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f9959o00ooO0 = 32;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f9960o00ooO00 = 16;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f9961o00ooO0O = 64;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f9962o00ooO0o = 128;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f9963o00ooOO = -1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f9964o00ooOO0 = 512;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f9965o0O0o = 4;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @o0O0O0Oo
        public static int o00oOOoO(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @o0O0O0Oo
        public static void o00oOo00(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @o0O0O0Oo
        public static void o00oOooO(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @o0OOooO0(19)
    /* renamed from: o0O00.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0118o00oOOoO {
        @o0O0O0Oo
        public static int o00oOOo0(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @o0O0O0Oo
        public static void o00oOOoO(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    @Deprecated
    public static void o00oOOo0(AccessibilityEvent accessibilityEvent, o00ooO0 o00ooo02) {
        accessibilityEvent.appendRecord((AccessibilityRecord) o00ooo02.o00oOoO0());
    }

    @Deprecated
    public static o00ooO0 o00oOOoO(AccessibilityEvent accessibilityEvent) {
        return new o00ooO0(accessibilityEvent);
    }

    public static int o00oOo00(@oo0oO0 AccessibilityEvent accessibilityEvent) {
        return o00oOOo0.o00oOOo0(accessibilityEvent);
    }

    public static int o00oOo0O(@oo0oO0 AccessibilityEvent accessibilityEvent) {
        return o00oOOo0.o00oOOoO(accessibilityEvent);
    }

    @Deprecated
    public static o00ooO0 o00oOo0o(AccessibilityEvent accessibilityEvent, int i) {
        return new o00ooO0(accessibilityEvent.getRecord(i));
    }

    public static void o00oOoO(@oo0oO0 AccessibilityEvent accessibilityEvent, int i) {
        o00oOOo0.o00oOo00(accessibilityEvent, i);
    }

    @Deprecated
    public static int o00oOoO0(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void o00oOoOO(@oo0oO0 AccessibilityEvent accessibilityEvent, int i) {
        C0118o00oOOoO.o00oOOoO(accessibilityEvent, i);
    }

    public static void o00oOoOo(@oo0oO0 AccessibilityEvent accessibilityEvent, int i) {
        o00oOOo0.o00oOooO(accessibilityEvent, i);
    }

    public static int o00oOooO(@oo0oO0 AccessibilityEvent accessibilityEvent) {
        return C0118o00oOOoO.o00oOOo0(accessibilityEvent);
    }
}
