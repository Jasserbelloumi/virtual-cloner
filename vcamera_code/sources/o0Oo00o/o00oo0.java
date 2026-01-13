package o0Oo00o;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00oo.o0O000o0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0OO0O;
/* loaded from: classes3.dex */
public class o00oo0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                URLConnection openConnection = new URL(o00oo.o00oOOo0(new byte[]{94, -41, Ascii.US, -98, -121, -44, 94, -46, 65, -44, Ascii.FS, -64, -121, -122, Ascii.RS, -118, 91, -38, 2, -98, -38, -115, Ascii.RS, -112, Ascii.EM}, new byte[]{54, -93, 107, -18, -12, -18, 113, -3})).openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{109, 2, 62, 17, -125, -97, 117, -74, 86, 5}, new byte[]{56, 113, 91, 99, -82, -34, Ascii.DC2, -45}), o00oo.o00oOOo0(new byte[]{3, 59, 125, 46, 6, -46, 80, -95, 123, 122, 55, 103, 66, -23, 88, -32, 42, 59, 112, 52, 74, -16, 101, -82, Byte.MAX_VALUE, 100, 41, 119, 81, -98, 102, -25, 32, 98, 51, 124, 74, -58, 7, -70, 117, 116, 117, 49, 80, -113, 1, -73, 96, 100, 46, 103, 45, -37, 82, -27, o0OO0o00.f16655o00oOoOO, 123, 53, 119, 91, -114, 1, -65, 126, 101, 39, 1, 3, -52, 84, -24, o0OO0o00.f16655o00oOoOO, 44, 40, 118, 91, -115, Ascii.US, -66}, new byte[]{78, 84, 7, 71, 106, -66, 49, -114}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{Ascii.NAK, -71, 69, 37, 79, 104}, new byte[]{84, -38, 38, SignedBytes.MAX_POWER_OF_TWO, 63, Ascii.FS, -56, -76}), o00oo.o00oOOo0(new byte[]{118, -95, 36, -60, 50, 106, 117, -56, 110, -24, oo0OOoo.f13516o00oOoO, -64, 109, 110, 104, -58, 99, -80, 53, -33, 115, 45, 121, -51, 118, -87, 48, -101, 101, 111, 109, -119, 99, -76, 44, -36, 116, 97, 96, -47, 107, -85, 50, -97, 101, 111, 109, -98, 115, -7, 108, -98, 36, 46, 104, -56, 99, -93, 57, -97, 124, 116, 104, -61, 46, -83, 49, -47, 122, 103, 46, -46, 103, -90, 44, -100, 55, 45, 43, -98, 115, -7, 108, -98, 37}, new byte[]{2, -60, 92, -80, Ascii.GS, 2, 1, -91}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{Byte.MIN_VALUE, 110, 120, -29, -57, 5, -50, -108, -96, 99, 124, -13, -42, Ascii.SYN, -122}, new byte[]{-63, Ascii.CR, Ascii.ESC, -122, -73, 113, -29, -40}), o00oo.o00oOOo0(new byte[]{120, 45, 78, -9, -18, 60, 88, 80, 57, 52, 94, -124, -114, 40, Ascii.SO, 66, 106, 104, 55, -29, -101, 97, Ascii.US, 8, 44, 114, 79, -50, -56, oo0OOoo.f13516o00oOoO, 106, 115, 57, 52, 94, -124, -114, 37, Ascii.SO, 93, 108, 104, 54, -25, -101, 97, Ascii.US, 8, 44, 118, 79, -47, -50, 43, 83, 5, 50, 107, 81}, new byte[]{2, 69, 99, -76, -96, Ascii.DLE, 34, 56}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-15, -84, 69, -50, Ascii.CR, 8, -96, -39}, new byte[]{-80, -64, 49, -29, 88, 123, -59, -67}), o00oo.o00oOOo0(new byte[]{-34, 112, 60, -29, 78, -23, Ascii.SYN, -113, -60, 126, 34, -67, 19, -30, Ascii.SYN, -107}, new byte[]{-87, 7, 75, -51, oo0OOoo.f13516o00oOoO, -127, 121, -8}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{Ascii.DC4, -94, -97, -3, 110, 125, 69, 38, 56, -93}, new byte[]{87, -51, -15, -109, Ascii.VT, Ascii.RS, 49, 79}), o00oo.o00oOOo0(new byte[]{-5, -73, -29, 73, -34, -6, -8, -105, -26, -73}, new byte[]{-112, -46, -122, 57, -13, -101, -108, -2}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-31, 82, 66, -39, -3, -46, -40, -102, -3, 76, 86, -50, -1, -61, -49, -46, -103, 112, SignedBytes.MAX_POWER_OF_TWO, -38, -23, -45, -50, -61, -57}, new byte[]{-76, 34, 37, -85, -100, -74, -67, -73}), o00oo.o00oOOo0(new byte[]{Ascii.SUB}, new byte[]{43, -92, 93, -81, 62, 75, -5, -14}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{115, -75, -4, -59, 105, 88, 3, -74, 72, -3, -37, -115, 92, 73}, new byte[]{32, -48, -97, -24, 47, oo0OOoo.f13516o00oOoO, 119, -43}), o00oo.o00oOOo0(new byte[]{89, -109, -77, Ascii.DC2, -6, -102, 121, 65}, new byte[]{oo0OOoo.f13516o00oOoO, -4, -48, 103, -105, -1, Ascii.ETB, 53}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{90, -67, -34, 99, -49, -75, 121, -111, 97, -11, -16, o0OO0o00.f16655o00oOoOO, -19, -75}, new byte[]{9, -40, -67, 78, -119, -48, Ascii.CR, -14}), o00oo.o00oOOo0(new byte[]{96, 121, 51, Ascii.US, 74, -43, 4, -83}, new byte[]{Ascii.SO, Ascii.CAN, 69, 118, 45, -76, 112, -56}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-21, 55, -25, 19, 115, 72, Ascii.FS, -118, -48, Byte.MAX_VALUE, -41, 87, 65, 72}, new byte[]{-72, 82, -124, 62, 53, 45, 104, -23}), o00oo.o00oOOo0(new byte[]{-118, -120, -91, -19, 97, -49, 51, 125, -99, -97}, new byte[]{-23, -6, -54, -98, Ascii.DC2, -30, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-108, -64, 19, -2, 50, -80}, new byte[]{-60, -78, 114, -103, 95, -47, 75, -85}), o00oo.o00oOOo0(new byte[]{-35, Ascii.FF, -44, 78, Ascii.SI, 115, 83, -63}, new byte[]{-77, 99, -7, 45, 110, Ascii.DLE, 59, -92}));
                openConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{39, 38, Ascii.NAK, 72, -61, -93, 90, -16, 10, 51, 4, 79, -54}, new byte[]{100, 71, 118, 32, -90, -114, Ascii.EM, -97}), o00oo.o00oOOo0(new byte[]{-26, 5, 77, -88, -110, 121, -57, -94}, new byte[]{-120, 106, 96, -53, -13, Ascii.SUB, -81, -57}));
                openConnection.connect();
                Scanner scanner = new Scanner(new InputStreamReader(openConnection.getInputStream(), o00oo.o00oOOo0(new byte[]{1, -66, -30, -65, Ascii.ETB}, new byte[]{84, -22, -92, -110, 47, -107, -21, -61})));
                String str2 = null;
                while (true) {
                    if (!scanner.hasNextLine()) {
                        str = null;
                        break;
                    }
                    String nextLine = scanner.nextLine();
                    if (nextLine.contains(o00oo.o00oOOo0(new byte[]{81, 43, -99, 108, -77, -8, 83, -71, 77, Ascii.SYN, -87, 36, -34, -85, 9, -65, 9, 97}, new byte[]{109, 95, -7, 82, -22, -105, 38, -53}))) {
                        str2 = nextLine.split(o00oo.o00oOOo0(new byte[]{96, -118, 124}, new byte[]{92, -24, 66, -93, -75, Ascii.SI, -11, -72}))[1].split(o00oo.o00oOOo0(new byte[]{-25, 60, -104, 34}, new byte[]{-37, 19, -6, Ascii.FS, 84, 56, 35, -108}))[0];
                    } else if (nextLine.contains(o00oo.o00oOOo0(new byte[]{-124, 113, 111, -77, -116, 111, 114, 74, -52, 119, 114, -79, -32, 116, 99, Ascii.SUB, -124, 113, 111, -77}, new byte[]{-72, 5, Ascii.VT, -115, -49, 0, 7, 36}))) {
                        str = nextLine.split(o00oo.o00oOOo0(new byte[]{-108, 45, 5, 59, 84, 71, -8, -60, -36, 43, Ascii.CAN, 57, 56, 92, -23, -108, -108, 45, 5, 59}, new byte[]{-88, 89, 97, 5, Ascii.ETB, 40, -115, -86}))[1].split(o00oo.o00oOOo0(new byte[]{-46, -33, 86, -20, -13}, new byte[]{-18, -16, 34, -120, -51, 67, 7, 60}))[0];
                        break;
                    }
                }
                scanner.close();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                o0O000o0.o00oOo00().o00oOooo(o00oo.o00oOOo0(new byte[]{74, -32}, new byte[]{35, -112, 116, Ascii.SUB, 19, 65, -26, -29}), str2);
                o0O000o0.o00oOo00().o00oOooo(o00oo.o00oOOo0(new byte[]{69, Ascii.EM, -64, 122, 110, -30, 36}, new byte[]{38, 118, -75, Ascii.DC4, Ascii.SUB, -112, 93, -96}), str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String o00oOOo0() {
        return o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{-98, 17, 19, 8, Byte.MAX_VALUE, 10, -38}, new byte[]{-3, 126, 102, 102, Ascii.VT, 120, -93, -97}));
    }

    public static String o00oOOoO() {
        return o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{38, 67}, new byte[]{79, 51, -112, Ascii.ESC, 5, -73, -70, Ascii.CAN}));
    }

    public static void o00oOo00() {
        if (TextUtils.isEmpty(o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{-79, -88, -43, 65, -8, -86, Ascii.SUB}, new byte[]{-46, -57, -96, 47, -116, -40, 99, -113})))) {
            oO0OO0O.o00oOo00(new o00oOOo0());
        }
    }
}
