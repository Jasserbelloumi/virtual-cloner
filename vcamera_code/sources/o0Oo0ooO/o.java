package o0Oo0ooO;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes3.dex */
public final class o extends oO00000 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16661o00oOOoO = 9;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO0000Oo f16662o00oOOo0;

    public o(oO0000Oo oo0000oo) {
        this.f16662o00oOOo0 = oo0000oo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && ((o) obj).f16662o00oOOo0.equals(this.f16662o00oOOo0);
    }

    public int hashCode() {
        return this.f16662o00oOOo0.hashCode();
    }

    @Override // o0Oo0ooO.oO00000
    public List<Certificate> o00oOOo0(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate o00oOOo02 = this.f16662o00oOOo0.o00oOOo0(x509Certificate);
            if (o00oOOo02 == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (o00oOooO(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(o00oOOo02)) {
                arrayList.add(o00oOOo02);
            }
            if (o00oOooO(o00oOOo02, o00oOOo02)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean o00oOooO(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        }
        return false;
    }
}
