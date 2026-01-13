package o0ooO0O0;

import com.google.common.base.Ascii;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO000o;
/* loaded from: classes3.dex */
public class oOo0o0oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o0O0oo00 f17136o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static X509TrustManager f17137o00oOOoO = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static o0O0oo00 o00oOOo0() {
        o0O0oo00.o00oOOoO o00ooooo2 = new o0O0oo00.o00oOOoO();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o00ooooo2.o00oOoO(10L, timeUnit);
        o00ooooo2.o00ooOo0(10L, timeUnit);
        o00ooooo2.o00ooO0O(30L, timeUnit);
        try {
            o00ooooo2.o00ooOOo(o00oOo0O(), f17137o00oOOoO);
        } catch (Throwable unused) {
        }
        return new o0O0oo00(o00ooooo2);
    }

    public static o0O0oo00 o00oOOoO() {
        if (f17136o00oOOo0 == null) {
            synchronized (oOo0o0oO.class) {
                if (f17136o00oOOo0 == null) {
                    f17136o00oOOo0 = o00oOOo0();
                }
            }
        }
        return f17136o00oOOo0;
    }

    public static String o00oOo00(String str) {
        return o00oOooO(str, o00oOOoO());
    }

    public static SSLSocketFactory o00oOo0O() throws Exception {
        TrustManager[] trustManagerArr = {f17137o00oOOoO};
        SSLContext sSLContext = SSLContext.getInstance(o00oo.o00oOOo0(new byte[]{62, -63, -90}, new byte[]{106, -115, -11, -25, -75, Ascii.VT, -7, 62}));
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    public static String o00oOooO(String str, o0O0oo00 o0o0oo00) {
        try {
            return o0o0oo00.o00oOOoO(new o0OO000o.o00oOOo0().o00oo0O0(str).o00oOo0o().o00oOOoO()).execute().f16180o0O0o.o00ooO0();
        } catch (Exception e) {
            e.printStackTrace();
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-25, Ascii.CR, 34, -39, 115, 76, 73, 122, -13, Ascii.FS, 108}, new byte[]{Byte.MIN_VALUE, 104, 86, -117, Ascii.SYN, oo0OOoo.f13516o00oOoO, 60, Ascii.US}) + e);
            return "";
        }
    }
}
