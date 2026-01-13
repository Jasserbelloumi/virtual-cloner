package o0Oo0ooO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes3.dex */
public abstract class oO0000Oo {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends oO0000Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final X509TrustManager f16673o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Method f16674o00oOOoO;

        public o00oOOo0(X509TrustManager x509TrustManager, Method method) {
            this.f16674o00oOOoO = method;
            this.f16673o00oOOo0 = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof o00oOOo0) {
                o00oOOo0 o00oooo02 = (o00oOOo0) obj;
                return this.f16673o00oOOo0.equals(o00oooo02.f16673o00oOOo0) && this.f16674o00oOOoO.equals(o00oooo02.f16674o00oOOoO);
            }
            return false;
        }

        public int hashCode() {
            return (this.f16674o00oOOoO.hashCode() * 31) + this.f16673o00oOOo0.hashCode();
        }

        @Override // o0Oo0ooO.oO0000Oo
        public X509Certificate o00oOOo0(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f16674o00oOOoO.invoke(this.f16673o00oOOo0, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends oO0000Oo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Map<X500Principal, Set<X509Certificate>> f16675o00oOOo0 = new LinkedHashMap();

        public o00oOOoO(X509Certificate... x509CertificateArr) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                Set<X509Certificate> set = this.f16675o00oOOo0.get(subjectX500Principal);
                if (set == null) {
                    set = new LinkedHashSet<>(1);
                    this.f16675o00oOOo0.put(subjectX500Principal, set);
                }
                set.add(x509Certificate);
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof o00oOOoO) && ((o00oOOoO) obj).f16675o00oOOo0.equals(this.f16675o00oOOo0);
        }

        public int hashCode() {
            return this.f16675o00oOOo0.hashCode();
        }

        @Override // o0Oo0ooO.oO0000Oo
        public X509Certificate o00oOOo0(X509Certificate x509Certificate) {
            Set<X509Certificate> set = this.f16675o00oOOo0.get(x509Certificate.getIssuerX500Principal());
            if (set == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : set) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static oO0000Oo o00oOOoO(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new o00oOOo0(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new o00oOOoO(x509TrustManager.getAcceptedIssuers());
        }
    }

    public static oO0000Oo o00oOo00(X509Certificate... x509CertificateArr) {
        return new o00oOOoO(x509CertificateArr);
    }

    public abstract X509Certificate o00oOOo0(X509Certificate x509Certificate);
}
