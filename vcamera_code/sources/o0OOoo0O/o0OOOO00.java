package o0OOoo0O;

import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.ReturnCode;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0OOOO00 {
    public static boolean o00oOOo0(String str, String str2) {
        new File(str2).delete();
        FFmpegSession execute = FFmpegKit.execute(String.format(o00oo.o00oOOo0(new byte[]{3, -76, Ascii.RS, -10, 97, -66, 7, 62, Ascii.FS, -14, 19, -13, 99, -80, Ascii.DLE, 123, Ascii.US, -14, 19, -7, 126, -66, Ascii.CR, 62, 92, -77, 74, -6, 44, -18, SignedBytes.MAX_POWER_OF_TWO, 118, 71, -14, Ascii.ESC, -20, 44, -14, Ascii.DC2, 123, Ascii.GS, -30, Ascii.RS, -78, 122, -68, Ascii.SI, 63, 75, -79, Ascii.RS, -9, 62, -23, 84, 123, 3, -95, Ascii.RS, -82, 60, -25, 80, 113, Ascii.US, -21, Ascii.FF, -81, 44, -14, Ascii.DLE, 50, 86, -115, 88, -14, 120, -1, Ascii.EM, 46, 88, -26, Ascii.FF, -81, 124, -1, 77, 47, Ascii.SO, -31, Ascii.RS, -78, 122, -71, SignedBytes.MAX_POWER_OF_TWO, 121, 94, -77, 90, -94, 111, -70, 9, 55, 6, -69, 73, -80, 62, -10, 74, 105, Ascii.DC4, -79, 91, -10, 96, -9, 9, 51, 1, -32, Ascii.ETB, -75, 62, -3, SignedBytes.MAX_POWER_OF_TWO, 118, 87, -14, Ascii.ESC, -20}, new byte[]{46, -46, 62, -97, Ascii.FF, -33, 96, 91}), str, str2));
        File file = new File(str2);
        return ReturnCode.isSuccess(execute.getReturnCode()) && file.exists() && file.length() > 10;
    }
}
