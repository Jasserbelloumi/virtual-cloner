package o0OOOooO;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import o00oOoOo.o00oo;
import o00oooOo.oOO0O000;
import o0OO0o.o0OO00o0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O0OO extends o0O0OO0 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13954o00oOOo0;

        static {
            int[] iArr = new int[o0O0O0o0.values().length];
            try {
                iArr[o0O0O0o0.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0O0O0o0.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0O0O0o0.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o0O0O0o0.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o0O0O0o0.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o0O0O0o0.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o0O0O0o0.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f13954o00oOOo0 = iArr;
        }
    }

    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0O0o0 o00oOo0o(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return o0O0O0o0.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return o0O0O0o0.HOURS;
        } else {
            if (c == 'M') {
                return o0O0O0o0.MINUTES;
            }
            if (c == 'S') {
                return o0O0O0o0.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final String o00oOoO(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        switch (o00oOOo0.f13954o00oOOo0[o0o0o0o0.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return oOO0O000.f9796o00oOOoO;
            case 6:
                return "h";
            case 7:
                return GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
            default:
                throw new IllegalStateException(("Unknown unit: " + o0o0o0o0).toString());
        }
    }

    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0O0o0 o00oOoO0(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return o0O0O0o0.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return o0O0O0o0.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return o0O0O0o0.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return o0O0O0o0.SECONDS;
                    }
                } else if (str.equals(oOO0O000.f9796o00oOOoO)) {
                    return o0O0O0o0.MINUTES;
                }
            } else if (str.equals("h")) {
                return o0O0O0o0.HOURS;
            }
        } else if (str.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG)) {
            return o0O0O0o0.DAYS;
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0("Unknown duration unit short name: ", str));
    }
}
