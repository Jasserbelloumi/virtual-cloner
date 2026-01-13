package o0Oo00o;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static String f15598o00oOOo0 = "";

    public static String o00oOOo0(String str) {
        BufferedReader bufferedReader;
        String str2 = "";
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(f15598o00oOOo0).openConnection();
                httpURLConnection.setRequestMethod(o00oo.o00oOOo0(new byte[]{-73, Ascii.EM, -36, Ascii.ESC}, new byte[]{-25, 86, -113, 79, 90, 51, -22, -118}));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{92, 51, -1, 49, -122, -6, -42, -127, 112, 50}, new byte[]{Ascii.US, 92, -111, 95, -29, -103, -94, -24}), o00oo.o00oOOo0(new byte[]{-122, 52, -120, -60, -32, -62, -31, 58, -69, 52}, new byte[]{-51, 81, -19, -76, -51, -125, -115, 83}));
                httpURLConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-33, -91, -87, -67, 85, -41, -120}, new byte[]{-100, -51, -56, -49, 38, -78, -4, -43}), o00oo.o00oOOo0(new byte[]{-2, -108, -55, -59, -123}, new byte[]{-85, -64, -113, -24, -67, -59, -93, Ascii.NAK}));
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{75, Ascii.US, -4, -19, 38, 88, Ascii.SO, -119, 92, 9, -30, -4}, new byte[]{8, 112, -110, -103, 67, 54, 122, -92}), o00oo.o00oOOo0(new byte[]{91, -41, 94, -21, -35, 109, 67, -4, 83, -56, SignedBytes.MAX_POWER_OF_TWO, -88, -34, 125, 77, -26, 1, -121, 77, -17, -43, 124, 81, -19, 78, -102, 123, -45, -14, 35, Ascii.SUB}, new byte[]{58, -89, 46, -121, -76, Ascii.SO, 34, -120}));
                httpURLConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 37, 54, 111, -100, 5}, new byte[]{o0OO0o00.f16655o00oOoOO, 70, 85, 10, -20, 113, 38, -3}), o00oo.o00oOOo0(new byte[]{35, -17, Ascii.DC4, 49, Ascii.CR, -40, 56, -116, 43, -16, 10, 114, Ascii.SO, -56, 54, -106}, new byte[]{66, -97, 100, 93, 100, -69, 89, -8}));
                if (str != null && !TextUtils.isEmpty(str)) {
                    httpURLConnection.setRequestProperty(o00oo.o00oOOo0(new byte[]{-68, 19, 7, 111, Ascii.VT, 62, 8, -46, -77, Ascii.EM, 7, 124, Ascii.SUB, 56}, new byte[]{-1, 124, 105, Ascii.ESC, 110, 80, 124, -1}), String.valueOf(str.getBytes().length));
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(str.getBytes());
                    outputStream.flush();
                    outputStream.close();
                    o00oo.o00oOOo0(new byte[]{122, 88, -81, 44, Byte.MIN_VALUE, 96, Ascii.DC2, 89, 118}, new byte[]{Ascii.DC2, 52, -57, 89, -16, Ascii.FF, 125, 56});
                    o00oo.o00oOOo0(new byte[]{-70, -4, 3, -10, -39, -99, 44, 9, -83, -25, 115, -91, -43, -100, Ascii.DC2, 8}, new byte[]{-34, -109, 73, -123, -74, -13, 124, 102});
                    httpURLConnection.getResponseCode();
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        str2 = bufferedReader.readLine();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            th.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    }
                } else {
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return str2;
    }
}
