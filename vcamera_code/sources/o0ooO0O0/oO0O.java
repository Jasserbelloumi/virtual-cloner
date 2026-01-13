package o0ooO0O0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f17055o00oOOo0 = o00oo.o00oOOo0(new byte[]{-94, 98, 90, -4, -118, -22, -11, 87, -110, 115, 93}, new byte[]{-9, Ascii.SYN, 51, -112, -7, -71, -106, 37});

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f17056o00oo0O0;

        public o00oOOo0(View view) {
            this.f17056o00oo0O0 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0O.o00oo0O(this.f17056o00oo0O0);
        }
    }

    public static boolean o00oOOo0(Activity activity, int i, int i2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels == i && displayMetrics.heightPixels == i2;
    }

    public static float o00oOOoO(float f, Context context) {
        return (context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f;
    }

    public static float o00oOo00(float f, Context context) {
        return f / (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static int o00oOo0O(Context context) {
        try {
            Class<?> cls = Class.forName(o00oo.o00oOOo0(new byte[]{-66, 6, -73, -52, -81, Ascii.SYN, SignedBytes.MAX_POWER_OF_TWO, -117, -78, 0, -66, -52, -89, Ascii.SYN, 80, -100, -81, 7, -69, -114, -32, 42, 0, -99, -76, 4, -65, -116}, new byte[]{-35, 105, -38, -30, -50, 120, 36, -7}));
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField(o00oo.o00oOOo0(new byte[]{-80, 69, -91, 99, -76, -13, -9, Ascii.FS, -94, 67, -101, Byte.MAX_VALUE, -92, -23, -49, Ascii.SYN, -73}, new byte[]{-61, 49, -60, Ascii.ETB, -63, Byte.MIN_VALUE, -88, 126})).get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 38;
        }
    }

    public static float o00oOo0o(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            return context.getResources().getDisplayMetrics().density;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static Point o00oOoO(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(o00oo.o00oOOo0(new byte[]{102, -82, Ascii.SI, -117, Ascii.NAK, -56}, new byte[]{17, -57, 97, -17, 122, -65, -58, 63}))).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static Point o00oOoO0(Context context) {
        Point o00oOooo2 = o00oOooo(context, null);
        Point o00oOoO2 = o00oOoO(context);
        return o00oOooo2.y < o00oOoO2.y ? new Point(o00oOooo2.x, o00oOoO2.y - o00oOooo2.y) : new Point();
    }

    public static int o00oOoOO(Context context) {
        return o00oOooo(context, null).y;
    }

    public static int o00oOoOo(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int o00oOoo0(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int o00oOooO(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @SuppressLint({"NewApi"})
    public static Point o00oOooo(Context context, Point point) {
        WindowManager windowManager = (WindowManager) context.getSystemService(o00oo.o00oOOo0(new byte[]{-104, -93, -117, -123, 8, 78}, new byte[]{-17, -54, -27, -31, 103, 57, 112, -30}));
        if (point == null) {
            point = new Point();
        }
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static void o00oo0(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(o00oo.o00oOOo0(new byte[]{-92, Ascii.CAN, 114, 38, 88, -24, -29, 70, -71, Ascii.RS, 109, 55}, new byte[]{-51, 118, 2, 83, 44, -73, -114, 35}));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static int o00oo00O(Context context) {
        return o00oOooo(context, null).x;
    }

    public static void o00oo0O(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(o00oo.o00oOOo0(new byte[]{-69, 65, -73, Ascii.FF, 39, 40, Ascii.FS, -114, -90, 71, -88, Ascii.GS}, new byte[]{-46, 47, -57, 121, 83, 119, 113, -21}));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static int o00oo0O0(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean o00oo0OO(Context context) {
        return !((KeyguardManager) context.getSystemService(o00oo.o00oOOo0(new byte[]{Ascii.GS, 5, -64, 50, -65, -51, -48, 124}, new byte[]{118, 96, -71, 85, -54, -84, -94, Ascii.CAN}))).inKeyguardRestrictedInputMode();
    }

    public static void o00oo0Oo(View view, long j) {
        new Handler().postDelayed(new o00oOOo0(view), j);
    }

    public static int o00oo0o0(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
