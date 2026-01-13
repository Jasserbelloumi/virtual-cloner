package o0Oo0Oo0;

import android.support.v4.media.o00oOo0O;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import o00oOoOo.o00oo;
import o0O0OOOo.o00oo0O0;
import o0Oo.o0O0000O;
import o0Oo0Oo.oO0000O;
import o0Oo0ooO.oO00000;
/* loaded from: classes3.dex */
public final class o0O0O0O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0O0O0O f15823o00oOo00 = new o00oOOo0().o00oOOoO();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<o00oOOoO> f15824o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO00000 f15825o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<o00oOOoO> f15826o00oOOo0 = new ArrayList();

        public o00oOOo0 o00oOOo0(String str, String... strArr) {
            if (str != null) {
                for (String str2 : strArr) {
                    this.f15826o00oOOo0.add(new o00oOOoO(str, str2));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public o0O0O0O o00oOOoO() {
            return new o0O0O0O(new LinkedHashSet(this.f15826o00oOOo0), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f15827o00oOo0O = "*.";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f15828o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f15829o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f15830o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o0O0000O f15831o00oOooO;

        public o00oOOoO(String str, String str2) {
            StringBuilder o00oOOo02;
            int i;
            this.f15828o00oOOo0 = str;
            if (str.startsWith(f15827o00oOo0O)) {
                o00oOOo02 = o00oOo0O.o00oOOo0("http://");
                str = str.substring(2);
            } else {
                o00oOOo02 = o00oOo0O.o00oOOo0("http://");
            }
            o00oOOo02.append(str);
            this.f15829o00oOOoO = o0O0o00O.o00oo0oO(o00oOOo02.toString()).f15897o00oOooO;
            if (str2.startsWith("sha1/")) {
                this.f15830o00oOo00 = "sha1/";
                i = 5;
            } else if (!str2.startsWith("sha256/")) {
                throw new IllegalArgumentException(o00oo.o00oOOo0("pins must start with 'sha256/' or 'sha1/': ", str2));
            } else {
                this.f15830o00oOo00 = "sha256/";
                i = 7;
            }
            this.f15831o00oOooO = o0O0000O.decodeBase64(str2.substring(i));
            if (this.f15831o00oOooO == null) {
                throw new IllegalArgumentException(o00oo.o00oOOo0("pins must be base64: ", str2));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof o00oOOoO) {
                o00oOOoO o00ooooo2 = (o00oOOoO) obj;
                if (this.f15828o00oOOo0.equals(o00ooooo2.f15828o00oOOo0) && this.f15830o00oOo00.equals(o00ooooo2.f15830o00oOo00) && this.f15831o00oOooO.equals(o00ooooo2.f15831o00oOooO)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f15831o00oOooO.hashCode() + o00oo0O0.o00oOOo0(this.f15830o00oOo00, o00oo0O0.o00oOOo0(this.f15828o00oOOo0, 527, 31), 31);
        }

        public boolean o00oOOo0(String str) {
            if (this.f15828o00oOOo0.startsWith(f15827o00oOo0O)) {
                String str2 = this.f15829o00oOOoO;
                return str.regionMatches(false, str.indexOf(46) + 1, str2, 0, str2.length());
            }
            return str.equals(this.f15829o00oOOoO);
        }

        public String toString() {
            return this.f15830o00oOo00 + this.f15831o00oOooO.base64();
        }
    }

    public o0O0O0O(Set<o00oOOoO> set, @Nullable oO00000 oo00000) {
        this.f15824o00oOOo0 = set;
        this.f15825o00oOOoO = oo00000;
    }

    public static o0O0000O o00oOo0O(X509Certificate x509Certificate) {
        return o0O0000O.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    public static o0O0000O o00oOo0o(X509Certificate x509Certificate) {
        return o0O0000O.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    public static String o00oOooO(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("sha256/");
            o00oOOo02.append(o00oOo0o((X509Certificate) certificate).base64());
            return o00oOOo02.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0O0O) {
            o0O0O0O o0o0o0o = (o0O0O0O) obj;
            if (oO0000O.o00oOooo(this.f15825o00oOOoO, o0o0o0o.f15825o00oOOoO) && this.f15824o00oOOo0.equals(o0o0o0o.f15824o00oOOo0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        oO00000 oo00000 = this.f15825o00oOOoO;
        return this.f15824o00oOOo0.hashCode() + ((oo00000 != null ? oo00000.hashCode() : 0) * 31);
    }

    public void o00oOOo0(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<o00oOOoO> o00oOo002 = o00oOo00(str);
        if (o00oOo002.isEmpty()) {
            return;
        }
        oO00000 oo00000 = this.f15825o00oOOoO;
        if (oo00000 != null) {
            list = oo00000.o00oOOo0(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = o00oOo002.size();
            o0O0000O o0o0000o = null;
            o0O0000O o0o0000o2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                o00oOOoO o00ooooo2 = o00oOo002.get(i2);
                if (o00ooooo2.f15830o00oOo00.equals("sha256/")) {
                    if (o0o0000o == null) {
                        o0o0000o = o00oOo0o(x509Certificate);
                    }
                    if (o00ooooo2.f15831o00oOooO.equals(o0o0000o)) {
                        return;
                    }
                } else if (!o00ooooo2.f15830o00oOo00.equals("sha1/")) {
                    throw new AssertionError();
                } else {
                    if (o0o0000o2 == null) {
                        o0o0000o2 = o00oOo0O(x509Certificate);
                    }
                    if (o00ooooo2.f15831o00oOooO.equals(o0o0000o2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0("Certificate pinning failure!", "\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            o00oOOo02.append("\n    ");
            o00oOOo02.append(o00oOooO(x509Certificate2));
            o00oOOo02.append(": ");
            o00oOOo02.append(x509Certificate2.getSubjectDN().getName());
        }
        o00oOOo02.append("\n  Pinned certificates for ");
        o00oOOo02.append(str);
        o00oOOo02.append(":");
        int size4 = o00oOo002.size();
        for (int i4 = 0; i4 < size4; i4++) {
            o00oOOo02.append("\n    ");
            o00oOOo02.append(o00oOo002.get(i4));
        }
        throw new SSLPeerUnverifiedException(o00oOOo02.toString());
    }

    public void o00oOOoO(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        o00oOOo0(str, Arrays.asList(certificateArr));
    }

    public List<o00oOOoO> o00oOo00(String str) {
        List<o00oOOoO> emptyList = Collections.emptyList();
        for (o00oOOoO o00ooooo2 : this.f15824o00oOOo0) {
            if (o00ooooo2.o00oOOo0(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(o00ooooo2);
            }
        }
        return emptyList;
    }

    public o0O0O0O o00oOoO0(oO00000 oo00000) {
        return oO0000O.o00oOooo(this.f15825o00oOOoO, oo00000) ? this : new o0O0O0O(this.f15824o00oOOo0, oo00000);
    }
}
