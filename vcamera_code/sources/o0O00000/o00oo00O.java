package o0O00000;

import android.location.Location;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10193o00oOOo0 = "mockLocation";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f10194o00oOOoO = "verticalAccuracy";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f10195o00oOo00 = "speedAccuracy";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f10196o00oOo0O = "androidx.core.location.extra.MSL_ALTITUDE";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f10197o00oOo0o = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    @o0OO00OO

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static Method f10198o00oOoO0 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f10199o00oOooO = "bearingAccuracy";

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static long o00oOOo0(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static boolean o00oOOo0(Location location) {
            return location.isFromMockProvider();
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static float o00oOOo0(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @o0O0O0Oo
        public static float o00oOOoO(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @o0O0O0Oo
        public static float o00oOo00(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @o0O0O0Oo
        public static boolean o00oOo0O(Location location) {
            return location.hasSpeedAccuracy();
        }

        @o0O0O0Oo
        public static boolean o00oOo0o(Location location) {
            return location.hasVerticalAccuracy();
        }

        @o0O0O0Oo
        public static void o00oOoO(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @o0O0O0Oo
        public static void o00oOoO0(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @o0O0O0Oo
        public static void o00oOoOO(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        @o0O0O0Oo
        public static boolean o00oOooO(Location location) {
            return location.hasBearingAccuracy();
        }
    }

    public static boolean o00oOOo0(@oo0oO0 Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float o00oOOoO(@oo0oO0 Location location) {
        return o00oOo00.o00oOOo0(location);
    }

    public static long o00oOo00(@oo0oO0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(o00oOOo0.o00oOOo0(location));
    }

    @o0O0OO0(from = 0.0d)
    public static float o00oOo0O(@oo0oO0 Location location) {
        ooOOOOoo.o00oo0OO(o00oo00O(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return o00oOoO0(location).getFloat(f10197o00oOo0o);
    }

    public static double o00oOo0o(@oo0oO0 Location location) {
        ooOOOOoo.o00oo0OO(o00oOooo(location), "The Mean Sea Level altitude of the location is not set.");
        return o00oOoO0(location).getDouble(f10196o00oOo0O);
    }

    public static Method o00oOoO() throws NoSuchMethodException {
        if (f10198o00oOoO0 == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f10198o00oOoO0 = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f10198o00oOoO0;
    }

    public static Bundle o00oOoO0(@oo0oO0 Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            return location.getExtras();
        }
        return extras;
    }

    public static float o00oOoOO(@oo0oO0 Location location) {
        return o00oOo00.o00oOOoO(location);
    }

    public static float o00oOoOo(@oo0oO0 Location location) {
        return o00oOo00.o00oOo00(location);
    }

    public static boolean o00oOoo0(@oo0oO0 Location location) {
        return o00oOo00.o00oOooO(location);
    }

    public static long o00oOooO(@oo0oO0 Location location) {
        return o00oOOo0.o00oOOo0(location);
    }

    public static boolean o00oOooo(@oo0oO0 Location location) {
        return o00oOOo0(location, f10196o00oOo0O);
    }

    public static void o00oo(@oo0oO0 Location location, double d) {
        o00oOoO0(location).putDouble(f10196o00oOo0O, d);
    }

    public static boolean o00oo0(@oo0oO0 Location location) {
        return o00oOo00.o00oOo0O(location);
    }

    public static boolean o00oo00O(@oo0oO0 Location location) {
        return o00oOOo0(location, f10197o00oOo0o);
    }

    public static void o00oo0O(@oo0oO0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static boolean o00oo0O0(@oo0oO0 Location location) {
        return o00oOOoO.o00oOOo0(location);
    }

    public static boolean o00oo0OO(@oo0oO0 Location location) {
        return o00oOo00.o00oOo0o(location);
    }

    public static void o00oo0Oo(@oo0oO0 Location location) {
        o00oo0O(location, f10196o00oOo0O);
    }

    public static void o00oo0o(@oo0oO0 Location location, float f) {
        o00oOo00.o00oOoO0(location, f);
    }

    public static void o00oo0o0(@oo0oO0 Location location) {
        o00oo0O(location, f10197o00oOo0o);
    }

    public static void o00oo0oO(@oo0oO0 Location location, boolean z) {
        try {
            o00oOoO().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void o00ooO0(@oo0oO0 Location location, float f) {
        o00oOo00.o00oOoOO(location, f);
    }

    public static void o00ooO00(@oo0oO0 Location location, float f) {
        o00oOo00.o00oOoO(location, f);
    }

    public static void o0O0o(@oo0oO0 Location location, @o0O0OO0(from = 0.0d) float f) {
        o00oOoO0(location).putFloat(f10197o00oOo0o, f);
    }
}
