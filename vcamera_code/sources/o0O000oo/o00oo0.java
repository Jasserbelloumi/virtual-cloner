package o0O000oo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10429o00oOOo0 = 3840;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10430o00oOOoO = 2160;

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static void o00oOOo0(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.oo0oO0
        public static o00oOo00 o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
            Display.Mode mode = display.getMode();
            Point o00oOOo02 = o00oo0.o00oOOo0(context, display);
            return (o00oOOo02 == null || o00oOooO(mode, o00oOOo02)) ? new o00oOo00(mode, true) : new o00oOo00(mode, o00oOOo02);
        }

        @o00oOooO.oo0oO0
        @SuppressLint({"ArrayReturn"})
        public static o00oOo00[] o00oOOoO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            o00oOo00[] o00ooo00Arr = new o00oOo00[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point o00oOOo02 = o00oo0.o00oOOo0(context, display);
            if (o00oOOo02 == null || o00oOooO(mode, o00oOOo02)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    o00ooo00Arr[i] = new o00oOo00(supportedModes[i], o00oOo0O(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    o00ooo00Arr[i2] = o00oOo0O(supportedModes[i2], mode) ? new o00oOo00(supportedModes[i2], o00oOOo02) : new o00oOo00(supportedModes[i2], false);
                }
            }
            return o00ooo00Arr;
        }

        public static boolean o00oOo00(@o00oOooO.oo0oO0 Display display) {
            Display.Mode[] supportedModes;
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean o00oOo0O(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }

        public static boolean o00oOooO(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Display.Mode f10431o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Point f10432o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final boolean f10433o00oOo00;

        @o00oOooO.o0OOooO0(23)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            @o00oOooO.o0O0O0Oo
            public static int o00oOOo0(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @o00oOooO.o0O0O0Oo
            public static int o00oOOoO(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public o00oOo00(@o00oOooO.oo0oO0 Point point) {
            ooOOOOoo.o00oo00O(point, "physicalSize == null");
            this.f10432o00oOOoO = point;
            this.f10431o00oOOo0 = null;
            this.f10433o00oOo00 = true;
        }

        @o00oOooO.o0OOooO0(23)
        public o00oOo00(@o00oOooO.oo0oO0 Display.Mode mode, @o00oOooO.oo0oO0 Point point) {
            ooOOOOoo.o00oo00O(mode, "mode == null, can't wrap a null reference");
            ooOOOOoo.o00oo00O(point, "physicalSize == null");
            this.f10432o00oOOoO = point;
            this.f10431o00oOOo0 = mode;
            this.f10433o00oOo00 = true;
        }

        @o00oOooO.o0OOooO0(23)
        public o00oOo00(@o00oOooO.oo0oO0 Display.Mode mode, boolean z) {
            ooOOOOoo.o00oo00O(mode, "mode == null, can't wrap a null reference");
            this.f10432o00oOOoO = new Point(o00oOOo0.o00oOOoO(mode), o00oOOo0.o00oOOo0(mode));
            this.f10431o00oOOo0 = mode;
            this.f10433o00oOo00 = z;
        }

        public int o00oOOo0() {
            return this.f10432o00oOOoO.y;
        }

        public int o00oOOoO() {
            return this.f10432o00oOOoO.x;
        }

        @Deprecated
        public boolean o00oOo00() {
            return this.f10433o00oOo00;
        }

        @o00oOooO.o0OOooO0(23)
        @o00oOooO.o0OO00OO
        public Display.Mode o00oOooO() {
            return this.f10431o00oOOo0;
        }
    }

    public static Point o00oOOo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
        Point o00oOoOo2 = o00oOoOo("vendor.display-size", display);
        if (o00oOoOo2 != null) {
            return o00oOoOo2;
        }
        if (o00oOoO0(context) && o00oOOoO.o00oOo00(display)) {
            return new Point(f10429o00oOOo0, f10430o00oOOoO);
        }
        return null;
    }

    @o00oOooO.oo0oO0
    public static Point o00oOOoO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
        Point o00oOOo02 = o00oOOo0(context, display);
        if (o00oOOo02 != null) {
            return o00oOOo02;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @o00oOooO.oo0oO0
    public static o00oOo00 o00oOo00(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
        return o00oOOoO.o00oOOo0(context, display);
    }

    @o00oOooO.o0OO00OO
    public static String o00oOo0O(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean o00oOo0o(@o00oOooO.oo0oO0 Display display) {
        return o00oOOoO.o00oOo00(display);
    }

    public static boolean o00oOoO(@o00oOooO.oo0oO0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean o00oOoO0(@o00oOooO.oo0oO0 Context context) {
        return o00oOoO(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static Point o00oOoOO(@o00oOooO.oo0oO0 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @o00oOooO.o0OO00OO
    public static Point o00oOoOo(@o00oOooO.oo0oO0 String str, @o00oOooO.oo0oO0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String o00oOo0O2 = o00oOo0O(str);
        if (!TextUtils.isEmpty(o00oOo0O2) && o00oOo0O2 != null) {
            try {
                return o00oOoOO(o00oOo0O2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @o00oOooO.oo0oO0
    @SuppressLint({"ArrayReturn"})
    public static o00oOo00[] o00oOooO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 Display display) {
        return o00oOOoO.o00oOOoO(context, display);
    }
}
