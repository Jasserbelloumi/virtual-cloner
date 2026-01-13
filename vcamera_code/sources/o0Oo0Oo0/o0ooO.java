package o0Oo0Oo0;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import o0Oo0Oo.oO0000O;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes3.dex */
public final class o0ooO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0O0oo0o[] f16143o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0ooO f16144o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0ooO f16145o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o0ooO f16146o00oOoO0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f16147o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f16148o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String[] f16149o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final String[] f16150o00oOooO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f16151o00oOOo0;
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String[] f16152o00oOOoO;
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String[] f16153o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f16154o00oOooO;

        public o00oOOo0(o0ooO o0ooo) {
            this.f16151o00oOOo0 = o0ooo.f16147o00oOOo0;
            this.f16152o00oOOoO = o0ooo.f16149o00oOo00;
            this.f16153o00oOo00 = o0ooo.f16150o00oOooO;
            this.f16154o00oOooO = o0ooo.f16148o00oOOoO;
        }

        public o00oOOo0(boolean z) {
            this.f16151o00oOOo0 = z;
        }

        public o00oOOo0 o00oOOo0() {
            if (this.f16151o00oOOo0) {
                this.f16152o00oOOoO = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public o00oOOo0 o00oOOoO() {
            if (this.f16151o00oOOo0) {
                this.f16153o00oOo00 = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public o0ooO o00oOo00() {
            return new o0ooO(this);
        }

        public o00oOOo0 o00oOo0O(o0O0oo0o... o0o0oo0oArr) {
            if (this.f16151o00oOOo0) {
                String[] strArr = new String[o0o0oo0oArr.length];
                for (int i = 0; i < o0o0oo0oArr.length; i++) {
                    strArr[i] = o0o0oo0oArr[i].f16077o00oOOo0;
                }
                return o00oOooO(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public o00oOOo0 o00oOo0o(boolean z) {
            if (this.f16151o00oOOo0) {
                this.f16154o00oOooO = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public o00oOOo0 o00oOoO(o0OoOoO... o0oooooArr) {
            if (this.f16151o00oOOo0) {
                String[] strArr = new String[o0oooooArr.length];
                for (int i = 0; i < o0oooooArr.length; i++) {
                    strArr[i] = o0oooooArr[i].javaName;
                }
                return o00oOoO0(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public o00oOOo0 o00oOoO0(String... strArr) {
            if (this.f16151o00oOOo0) {
                if (strArr.length != 0) {
                    this.f16153o00oOo00 = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public o00oOOo0 o00oOooO(String... strArr) {
            if (this.f16151o00oOOo0) {
                if (strArr.length != 0) {
                    this.f16152o00oOOoO = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
    }

    static {
        o0O0oo0o[] o0o0oo0oArr = {o0O0oo0o.f16054o0O0Ooo0, o0O0oo0o.f16059o0O0o00, o0O0oo0o.f16053o0O0Ooo, o0O0oo0o.f16061o0O0o00O, o0O0oo0o.f16066o0O0o0o0, o0O0oo0o.f16065o0O0o0Oo, o0O0oo0o.f16032o0O0O0Oo, o0O0oo0o.f16040o0O0OOO, o0O0oo0o.f16034o0O0O0o0, o0O0oo0o.f16042o0O0OOOo, o0O0oo0o.f16019o0O00O0, o0O0oo0o.f16068o0OoO00O, o0O0oo0o.f15993o00ooOo, o0O0oo0o.f15997o00ooo0, o0O0oo0o.f15972o00oOoo0};
        f16143o00oOo0O = o0o0oo0oArr;
        o00oOOo0 o00oOo0O2 = new o00oOOo0(true).o00oOo0O(o0o0oo0oArr);
        o0OoOoO o0ooooo = o0OoOoO.TLS_1_0;
        o00oOOo0 o00oOo0o2 = o00oOo0O2.o00oOoO(o0OoOoO.TLS_1_3, o0OoOoO.TLS_1_2, o0OoOoO.TLS_1_1, o0ooooo).o00oOo0o(true);
        o00oOo0o2.getClass();
        o0ooO o0ooo = new o0ooO(o00oOo0o2);
        f16144o00oOo0o = o0ooo;
        o00oOOo0 o00oOo0o3 = new o00oOOo0(o0ooo).o00oOoO(o0ooooo).o00oOo0o(true);
        o00oOo0o3.getClass();
        f16146o00oOoO0 = new o0ooO(o00oOo0o3);
        f16145o00oOoO = new o0ooO(new o00oOOo0(false));
    }

    public o0ooO(o00oOOo0 o00oooo02) {
        this.f16147o00oOOo0 = o00oooo02.f16151o00oOOo0;
        this.f16149o00oOo00 = o00oooo02.f16152o00oOOoO;
        this.f16150o00oOooO = o00oooo02.f16153o00oOo00;
        this.f16148o00oOOoO = o00oooo02.f16154o00oOooO;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0ooO) {
            if (obj == this) {
                return true;
            }
            o0ooO o0ooo = (o0ooO) obj;
            boolean z = this.f16147o00oOOo0;
            if (z != o0ooo.f16147o00oOOo0) {
                return false;
            }
            return !z || (Arrays.equals(this.f16149o00oOo00, o0ooo.f16149o00oOo00) && Arrays.equals(this.f16150o00oOooO, o0ooo.f16150o00oOooO) && this.f16148o00oOOoO == o0ooo.f16148o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        if (this.f16147o00oOOo0) {
            return ((((527 + Arrays.hashCode(this.f16149o00oOo00)) * 31) + Arrays.hashCode(this.f16150o00oOooO)) * 31) + (!this.f16148o00oOOoO ? 1 : 0);
        }
        return 17;
    }

    public void o00oOOo0(SSLSocket sSLSocket, boolean z) {
        o0ooO o00oOo0O2 = o00oOo0O(sSLSocket, z);
        String[] strArr = o00oOo0O2.f16150o00oOooO;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = o00oOo0O2.f16149o00oOo00;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<o0O0oo0o> o00oOOoO() {
        String[] strArr = this.f16149o00oOo00;
        if (strArr != null) {
            return o0O0oo0o.o00oOOoO(strArr);
        }
        return null;
    }

    public boolean o00oOo00(SSLSocket sSLSocket) {
        if (this.f16147o00oOOo0) {
            String[] strArr = this.f16150o00oOooO;
            if (strArr == null || oO0000O.o00oo0oO(oO0000O.f15765o00oo0O0, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f16149o00oOo00;
                return strArr2 == null || oO0000O.o00oo0oO(o0O0oo0o.f15964o00oOOoO, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public final o0ooO o00oOo0O(SSLSocket sSLSocket, boolean z) {
        String[] o00oo0o02 = this.f16149o00oOo00 != null ? oO0000O.o00oo0o0(o0O0oo0o.f15964o00oOOoO, sSLSocket.getEnabledCipherSuites(), this.f16149o00oOo00) : sSLSocket.getEnabledCipherSuites();
        String[] o00oo0o03 = this.f16150o00oOooO != null ? oO0000O.o00oo0o0(oO0000O.f15765o00oo0O0, sSLSocket.getEnabledProtocols(), this.f16150o00oOooO) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int o00oo0O2 = oO0000O.o00oo0O(o0O0oo0o.f15964o00oOOoO, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && o00oo0O2 != -1) {
            o00oo0o02 = oO0000O.o00oOo0o(o00oo0o02, supportedCipherSuites[o00oo0O2]);
        }
        o00oOOo0 o00oOoO02 = new o00oOOo0(this).o00oOooO(o00oo0o02).o00oOoO0(o00oo0o03);
        o00oOoO02.getClass();
        return new o0ooO(o00oOoO02);
    }

    public boolean o00oOo0o() {
        return this.f16148o00oOOoO;
    }

    @Nullable
    public List<o0OoOoO> o00oOoO0() {
        String[] strArr = this.f16150o00oOooO;
        if (strArr != null) {
            return o0OoOoO.forJavaNames(strArr);
        }
        return null;
    }

    public boolean o00oOooO() {
        return this.f16147o00oOOo0;
    }

    public String toString() {
        if (this.f16147o00oOOo0) {
            StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("ConnectionSpec(cipherSuites=", this.f16149o00oOo00 != null ? o00oOOoO().toString() : "[all enabled]", ", tlsVersions=", this.f16150o00oOooO != null ? o00oOoO0().toString() : "[all enabled]", ", supportsTlsExtensions=");
            o00oOOo02.append(this.f16148o00oOOoO);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
        return "ConnectionSpec()";
    }
}
