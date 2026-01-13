package o0OOoo0O;

import com.google.common.base.Ascii;
import java.io.File;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00oo.o0O000o0;
/* loaded from: classes3.dex */
public class o0OO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f14927o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f14928o00oOo0o = 2;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f14929o00oOoO = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f14930o00oOoO0 = 3;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public String f14931o00oOOo0 = "";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f14932o00oOOoO = true;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f14933o00oOo00 = true;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f14934o00oOooO = true;

    public static o0OO o00oOOoO() {
        o0O000o0 o00oOo002;
        String o00oOOo02;
        o0OO o0oo = new o0OO();
        int o00oOooO2 = o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{67, -68, -81, 77, Ascii.US, -38, -68, -70, 87, -87, -66}, new byte[]{46, -39, -37, 37, 112, -66, -29, -50}), 1);
        if (o00oOooO2 != 1) {
            if (o00oOooO2 == 2) {
                o0oo.f14932o00oOOoO = true;
                o0oo.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{44, -12, -56, oo0OOoo.f13516o00oOoO, 83, 52, -85, -68, 46, -11, -13, 52, 83, 8, -70, -79, 5, -5, -59, 54, 93, 7, -124, -78, 47, -23}, new byte[]{90, -99, -84, 88, 60, 107, -37, -35}));
                o00oOo002 = o0O000o0.o00oOo00();
                o00oOOo02 = o00oo.o00oOOo0(new byte[]{-110, 86, -101, 109, -66, 75, 106, -74, -112, 87, -96, 100, -66, 119, 123, -69, -69, 94, -118, 108, -72, 123, 69, -78, -118, 94, -99, 100, -76}, new byte[]{-28, 63, -1, 8, -47, Ascii.DC4, Ascii.SUB, -41});
            } else if (o00oOooO2 == 3) {
                o0oo.f14932o00oOOoO = true;
                o0oo.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{Byte.MIN_VALUE, -46, 94, -31, 91, 58, Ascii.ETB, 43, -126, -45, 101, -22, 81, 17, Ascii.DLE, 37, -124, -48}, new byte[]{-10, -69, 58, -124, 52, 101, 103, 74}));
                o00oOo002 = o0O000o0.o00oOo00();
                o00oOOo02 = o00oo.o00oOOo0(new byte[]{-25, 49, -16, -120, -88, -55, -111, -56, -27, 48, -53, -125, -94, -30, -106, -58, -29, 51, -53, -116, -78, -14, -120, -58, -50, oo0OOoo.f13516o00oOoO, -6, -116, -91, -6, -124}, new byte[]{-111, 88, -108, -19, -57, -106, -31, -87});
            } else if (o00oOooO2 == 4) {
                o0oo.f14932o00oOOoO = true;
                o0oo.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{-113, Ascii.DLE, -76, -116, -28, -35, 118, -40, -117, 4, -78, -127, -28, -39, 112, -28, -119, Ascii.CAN, -92, -127, -44}, new byte[]{-1, 113, -64, -28, -69, -83, Ascii.US, -69}));
                o0oo.f14934o00oOooO = false;
            }
            o0oo.f14934o00oOooO = o00oOo002.o00oOOoO(o00oOOo02, true);
        } else {
            o0oo.f14932o00oOOoO = false;
            o0oo.f14931o00oOOo0 = "";
        }
        return o0oo;
    }

    public boolean o00oOOo0() {
        if (this.f14931o00oOOo0.startsWith(o00oo.o00oOOo0(new byte[]{-74, 32, 108, -77, -99}, new byte[]{-103, 68, Ascii.CR, -57, -4, Ascii.NAK, 17, -110}))) {
            return new File(this.f14931o00oOOo0).exists();
        }
        return true;
    }

    public void o00oOo00() {
        o0O000o0 o00oOo002;
        String o00oOOo02;
        int o00oOooO2 = o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{-79, -28, -69, 55, -23, 73, -69, 56, -91, -15, -86}, new byte[]{-36, -127, -49, 95, -122, 45, -28, 76}), 1);
        if (o00oOooO2 == 1) {
            this.f14932o00oOOoO = false;
            this.f14931o00oOOo0 = "";
            return;
        }
        if (o00oOooO2 == 2) {
            this.f14932o00oOOoO = true;
            this.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{120, 95, 97, 42, Ascii.FS, 34, -117, -96, 122, 94, 90, 35, Ascii.FS, Ascii.RS, -102, -83, 81, 80, 108, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.DC2, 17, -92, -82, 123, 66}, new byte[]{Ascii.SO, 54, 5, 79, 115, 125, -5, -63}));
            o00oOo002 = o0O000o0.o00oOo00();
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{45, 47, -58, 2, -7, -123, 4, -37, 47, 46, -3, Ascii.VT, -7, -71, Ascii.NAK, -42, 4, 39, -41, 3, -1, -75, 43, -33, 53, 39, -64, Ascii.VT, -13}, new byte[]{91, 70, -94, 103, -106, -38, 116, -70});
        } else if (o00oOooO2 != 3) {
            if (o00oOooO2 != 4) {
                return;
            }
            this.f14932o00oOOoO = true;
            this.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{90, -25, 49, oo0OOoo.f13516o00oOoO, 46, -72, -11, -38, 94, -13, 55, 48, 46, -68, -13, -26, 92, -17, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 48, Ascii.RS}, new byte[]{42, -122, 69, 85, 113, -56, -100, -71}));
            this.f14934o00oOooO = false;
            return;
        } else {
            this.f14932o00oOOoO = true;
            this.f14931o00oOOo0 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{-42, 86, 102, -96, -32, -4, -72, 8, -44, 87, 93, -85, -22, -41, -65, 6, -46, 84}, new byte[]{-96, 63, 2, -59, -113, -93, -56, 105}));
            o00oOo002 = o0O000o0.o00oOo00();
            o00oOOo02 = o00oo.o00oOOo0(new byte[]{79, 55, 71, 98, 34, Ascii.RS, -4, 95, 77, 54, 124, 105, 40, 53, -5, 81, 75, 53, 124, 102, 56, 37, -27, 81, 102, 59, 77, 102, 47, 45, -23}, new byte[]{57, 94, 35, 7, 77, 65, -116, 62});
        }
        this.f14934o00oOooO = o00oOo002.o00oOOoO(o00oOOo02, true);
    }
}
