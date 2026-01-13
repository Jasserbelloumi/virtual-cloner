package o0Oo0Oo0;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class o0O0o000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OoOoO f15874o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0oo0o f15875o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<Certificate> f15876o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<Certificate> f15877o00oOooO;

    public o0O0o000(o0OoOoO o0ooooo, o0O0oo0o o0o0oo0o, List<Certificate> list, List<Certificate> list2) {
        this.f15874o00oOOo0 = o0ooooo;
        this.f15875o00oOOoO = o0o0oo0o;
        this.f15876o00oOo00 = list;
        this.f15877o00oOooO = list2;
    }

    public static o0O0o000 o00oOOoO(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            o0O0oo0o o00oOOo02 = o0O0oo0o.o00oOOo0(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                o0OoOoO forJavaName = o0OoOoO.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List o00oo0O02 = certificateArr != null ? oO0000O.o00oo0O0(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new o0O0o000(forJavaName, o00oOOo02, o00oo0O02, localCertificates != null ? oO0000O.o00oo0O0(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static o0O0o000 o00oOo00(o0OoOoO o0ooooo, o0O0oo0o o0o0oo0o, List<Certificate> list, List<Certificate> list2) {
        if (o0ooooo != null) {
            if (o0o0oo0o != null) {
                return new o0O0o000(o0ooooo, o0o0oo0o, oO0000O.o00oo0OO(list), oO0000O.o00oo0OO(list2));
            }
            throw new NullPointerException("cipherSuite == null");
        }
        throw new NullPointerException("tlsVersion == null");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0o000) {
            o0O0o000 o0o0o000 = (o0O0o000) obj;
            return this.f15874o00oOOo0.equals(o0o0o000.f15874o00oOOo0) && this.f15875o00oOOoO.equals(o0o0o000.f15875o00oOOoO) && this.f15876o00oOo00.equals(o0o0o000.f15876o00oOo00) && this.f15877o00oOooO.equals(o0o0o000.f15877o00oOooO);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f15875o00oOOoO.hashCode();
        int hashCode2 = this.f15876o00oOo00.hashCode();
        return this.f15877o00oOooO.hashCode() + ((hashCode2 + ((hashCode + ((this.f15874o00oOOo0.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public o0O0oo0o o00oOOo0() {
        return this.f15875o00oOOoO;
    }

    @Nullable
    public Principal o00oOo0O() {
        if (this.f15877o00oOooO.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f15877o00oOooO.get(0)).getSubjectX500Principal();
    }

    public List<Certificate> o00oOo0o() {
        return this.f15876o00oOo00;
    }

    public o0OoOoO o00oOoO() {
        return this.f15874o00oOOo0;
    }

    @Nullable
    public Principal o00oOoO0() {
        if (this.f15876o00oOo00.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f15876o00oOo00.get(0)).getSubjectX500Principal();
    }

    public List<Certificate> o00oOooO() {
        return this.f15877o00oOooO;
    }
}
