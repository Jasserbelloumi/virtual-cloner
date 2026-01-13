package o00ooOo;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f8953o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f8954o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f8955o00oOo00 = 4;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f8956o00oOo0O = 32;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f8957o00oOo0o = -1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f8958o00oOoO = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f8959o00oOoO0 = 2;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f8960o00oOoOO = 8;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f8961o00oOoOo = 16;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f8962o00oOoo0 = 32;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f8963o00oOooO = 8;

    @oo0oO0
    public static String o00oOOo0(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @oo0oO0
    public static String o00oOOoO(int i) {
        StringBuilder sb = new StringBuilder();
        String str = "[";
        while (true) {
            sb.append(str);
            while (i > 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
                i &= ~numberOfTrailingZeros;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                if (numberOfTrailingZeros == 1) {
                    str = "FEEDBACK_SPOKEN";
                } else if (numberOfTrailingZeros == 2) {
                    str = "FEEDBACK_HAPTIC";
                } else if (numberOfTrailingZeros == 4) {
                    str = "FEEDBACK_AUDIBLE";
                } else if (numberOfTrailingZeros == 8) {
                    str = "FEEDBACK_VISUAL";
                } else if (numberOfTrailingZeros == 16) {
                    str = "FEEDBACK_GENERIC";
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    @o0OO00OO
    public static String o00oOo00(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                return null;
                            }
                            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
                        }
                        return "FLAG_REPORT_VIEW_IDS";
                    }
                    return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
                }
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        return "DEFAULT";
    }

    @o0OO00OO
    public static String o00oOo0O(@oo0oO0 AccessibilityServiceInfo accessibilityServiceInfo, @oo0oO0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }

    public static int o00oOooO(@oo0oO0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }
}
