package o0OOOooO;

import java.util.concurrent.TimeUnit;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O0OO0 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13955o00oOOo0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f13955o00oOOo0 = iArr;
        }
    }

    @o0OO00o0(version = "1.3")
    public static final double o00oOOo0(double d, @NotNull o0O0O0o0 o0o0o0o0, @NotNull o0O0O0o0 o0o0o0o02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "sourceUnit");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o02, "targetUnit");
        long convert = o0o0o0o02.getTimeUnit$kotlin_stdlib().convert(1L, o0o0o0o0.getTimeUnit$kotlin_stdlib());
        return convert > 0 ? d * convert : d / o0o0o0o0.getTimeUnit$kotlin_stdlib().convert(1L, o0o0o0o02.getTimeUnit$kotlin_stdlib());
    }

    @o0OO00o0(version = "1.5")
    public static final long o00oOOoO(long j, @NotNull o0O0O0o0 o0o0o0o0, @NotNull o0O0O0o0 o0o0o0o02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "sourceUnit");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o02, "targetUnit");
        return o0o0o0o02.getTimeUnit$kotlin_stdlib().convert(j, o0o0o0o0.getTimeUnit$kotlin_stdlib());
    }

    @o0OO00o0(version = "1.5")
    public static final long o00oOo00(long j, @NotNull o0O0O0o0 o0o0o0o0, @NotNull o0O0O0o0 o0o0o0o02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "sourceUnit");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o02, "targetUnit");
        return o0o0o0o02.getTimeUnit$kotlin_stdlib().convert(j, o0o0o0o0.getTimeUnit$kotlin_stdlib());
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final TimeUnit o00oOo0O(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        return o0o0o0o0.getTimeUnit$kotlin_stdlib();
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o0OO00o0(version = "1.8")
    @NotNull
    public static final o0O0O0o0 o00oOooO(@NotNull TimeUnit timeUnit) {
        o0OOOOO0.o0ooO.o00oo0O0(timeUnit, "<this>");
        switch (o00oOOo0.f13955o00oOOo0[timeUnit.ordinal()]) {
            case 1:
                return o0O0O0o0.NANOSECONDS;
            case 2:
                return o0O0O0o0.MICROSECONDS;
            case 3:
                return o0O0O0o0.MILLISECONDS;
            case 4:
                return o0O0O0o0.SECONDS;
            case 5:
                return o0O0O0o0.MINUTES;
            case 6:
                return o0O0O0o0.HOURS;
            case 7:
                return o0O0O0o0.DAYS;
            default:
                throw new o0OO0o.o0O0O0Oo();
        }
    }
}
