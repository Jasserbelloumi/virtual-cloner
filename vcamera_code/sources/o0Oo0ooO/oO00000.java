package o0Oo0ooO;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import o0Oo0oO.oO0Ooooo;
import o0Oo0ooO.oO0000Oo;
/* loaded from: classes3.dex */
public abstract class oO00000 {
    public static oO00000 o00oOOoO(X509TrustManager x509TrustManager) {
        return oO0Ooooo.o00oOoO().o00oOo00(x509TrustManager);
    }

    public static oO00000 o00oOo00(X509Certificate... x509CertificateArr) {
        return new o(new oO0000Oo.o00oOOoO(x509CertificateArr));
    }

    public abstract List<Certificate> o00oOOo0(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
