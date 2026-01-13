package o0Oo0ooO;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import o0Oo0Oo0.o0O0O0O;
/* loaded from: classes3.dex */
public final class oO0000O implements HostnameVerifier {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO0000O f16670o00oOOo0 = new oO0000O();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16671o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16672o00oOo00 = 7;

    public static List<String> o00oOOo0(X509Certificate x509Certificate) {
        List<String> o00oOOoO2 = o00oOOoO(x509Certificate, 7);
        List<String> o00oOOoO3 = o00oOOoO(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(o00oOOoO3.size() + o00oOOoO2.size());
        arrayList.addAll(o00oOOoO2);
        arrayList.addAll(o00oOOoO3);
        return arrayList;
    }

    public static List<String> o00oOOoO(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public boolean o00oOo00(String str, X509Certificate x509Certificate) {
        return o0Oo0Oo.oO0000O.o00ooO(str) ? o00oOo0o(str, x509Certificate) : o00oOo0O(str, x509Certificate);
    }

    public final boolean o00oOo0O(String str, X509Certificate x509Certificate) {
        String o00oOOoO2;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> o00oOOoO3 = o00oOOoO(x509Certificate, 2);
        int size = o00oOOoO3.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (o00oOooO(lowerCase, o00oOOoO3.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (o00oOOoO2 = new oO00000o(x509Certificate.getSubjectX500Principal()).o00oOOoO("cn")) == null) {
            return false;
        }
        return o00oOooO(lowerCase, o00oOOoO2);
    }

    public final boolean o00oOo0o(String str, X509Certificate x509Certificate) {
        List<String> o00oOOoO2 = o00oOOoO(x509Certificate, 7);
        int size = o00oOOoO2.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(o00oOOoO2.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean o00oOooO(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (lowerCase.contains("*")) {
                if (!lowerCase.startsWith(o0O0O0O.o00oOOoO.f15827o00oOo0O) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || o0O0O0O.o00oOOoO.f15827o00oOo0O.equals(lowerCase)) {
                    return false;
                }
                String substring = lowerCase.substring(1);
                if (str.endsWith(substring)) {
                    int length = str.length() - substring.length();
                    return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                }
                return false;
            }
            return str.equals(lowerCase);
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return o00oOo00(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
