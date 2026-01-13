package o0Oo0o00;

import android.support.v4.media.o00oOOo0;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import o0O0oooo.o0OO0oO;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O00O;
import o0Oo0Oo0.o0O0O0O;
import o0Oo0Oo0.o0O0o0;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0OO00o0;
import o0Oo0Oo0.oo0ooO;
import o0Oo0Ooo.o0OOOO0o;
import o0Oo0Ooo.o0OOo000;
import o0Oo0Ooo.oO0Oo;
import o0Oo0o0o.o0O000O;
/* loaded from: classes3.dex */
public final class o00ooO implements o0O0o0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f16351o00oOo0o = 20;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0oo00 f16352o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f16353o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public oO0Oo f16354o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public volatile boolean f16355o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Object f16356o00oOooO;

    public o00ooO(o0O0oo00 o0o0oo00, boolean z) {
        this.f16352o00oOOo0 = o0o0oo00;
        this.f16353o00oOOoO = z;
    }

    @Override // o0Oo0Oo0.o0O0o0
    public oo0ooO o00oOOo0(o0O0o0.o00oOOo0 o00oooo02) throws IOException {
        o0OO000o o00oOOo02 = o00oooo02.o00oOOo0();
        this.f16354o00oOo00 = new oO0Oo(this.f16352o00oOOo0.o00oOoo0(), o00oOo00(o00oOOo02.f16086o00oOOo0), this.f16356o00oOooO);
        int i = 0;
        oo0ooO oo0ooo = null;
        while (!this.f16355o00oOo0O) {
            try {
                try {
                    try {
                        oo0ooO o00oOo0O2 = ((o0O0o) o00oooo02).o00oOo0O(o00oOOo02, this.f16354o00oOo00, null, null);
                        if (oo0ooo != null) {
                            o00oOo0O2.getClass();
                            oo0ooO.o00oOOo0 o00oooo03 = new oo0ooO.o00oOOo0(o00oOo0O2);
                            oo0ooO.o00oOOo0 o00oooo04 = new oo0ooO.o00oOOo0(oo0ooo);
                            o00oooo04.f16187o00oOoO0 = null;
                            o00oOo0O2 = o00oooo03.o00oo00O(o00oooo04.o00oOo00()).o00oOo00();
                        }
                        oo0ooo = o00oOo0O2;
                        o00oOOo02 = o00oOooO(oo0ooo);
                    } catch (IOException e) {
                        if (!o00oOoO0(e, !(e instanceof o0O000O), o00oOOo02)) {
                            throw e;
                        }
                    }
                } catch (o0OOo000 e2) {
                    if (!o00oOoO0(e2.getLastConnectException(), false, o00oOOo02)) {
                        throw e2.getLastConnectException();
                    }
                }
                if (o00oOOo02 == null) {
                    if (!this.f16353o00oOOoO) {
                        this.f16354o00oOo00.o00oOoo0();
                    }
                    return oo0ooo;
                }
                oO0000O.o00oOo00(oo0ooo.f16180o0O0o);
                i++;
                if (i > 20) {
                    this.f16354o00oOo00.o00oOoo0();
                    throw new ProtocolException(o00oOOo0.o00oOOo0("Too many follow-up requests: ", i));
                } else if (o00oOOo02.f16091o00oOooO instanceof o0O00000) {
                    this.f16354o00oOo00.o00oOoo0();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", oo0ooo.f16171o00oo0Oo);
                } else if (!o00oOoO(oo0ooo, o00oOOo02.f16086o00oOOo0)) {
                    this.f16354o00oOo00.o00oOoo0();
                    this.f16354o00oOo00 = new oO0Oo(this.f16352o00oOOo0.o00oOoo0(), o00oOo00(o00oOOo02.f16086o00oOOo0), this.f16356o00oOooO);
                } else if (this.f16354o00oOo00.o00oOo00() != null) {
                    throw new IllegalStateException("Closing the body of " + oo0ooo + " didn't close its backing stream. Bad interceptor?");
                }
            } catch (Throwable th) {
                this.f16354o00oOo00.o00oo0OO(null);
                this.f16354o00oOo00.o00oOoo0();
                throw th;
            }
        }
        this.f16354o00oOo00.o00oOoo0();
        throw new IOException("Canceled");
    }

    public void o00oOOoO() {
        this.f16355o00oOo0O = true;
        oO0Oo oo0oo = this.f16354o00oOo00;
        if (oo0oo != null) {
            oo0oo.o00oOOoO();
        }
    }

    public final o0O00O o00oOo00(o0O0o00O o0o0o00o) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o0O0O0O o0o0o0o;
        if (o0o0o00o.o00oo0O()) {
            SSLSocketFactory o00ooOo02 = this.f16352o00oOOo0.o00ooOo0();
            hostnameVerifier = this.f16352o00oOOo0.o00oo0o0();
            sSLSocketFactory = o00ooOo02;
            o0o0o0o = this.f16352o00oOOo0.o00oOoOO();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            o0o0o0o = null;
        }
        return new o0O00O(o0o0o00o.f15897o00oOooO, o0o0o00o.f15892o00oOo0O, this.f16352o00oOOo0.o00oo0OO(), this.f16352o00oOOo0.o00ooOOo(), sSLSocketFactory, hostnameVerifier, o0o0o0o, this.f16352o00oOOo0.o00ooO0o(), this.f16352o00oOOo0.o00ooO0O(), this.f16352o00oOOo0.o00ooO0(), this.f16352o00oOOo0.o00oOooo(), this.f16352o00oOOo0.o00ooO());
    }

    public boolean o00oOo0O() {
        return this.f16355o00oOo0O;
    }

    public final boolean o00oOo0o(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean o00oOoO(oo0ooO oo0ooo, o0O0o00O o0o0o00o) {
        o0O0o00O o0o0o00o2 = oo0ooo.f16170o00oo0O0.f16086o00oOOo0;
        return o0o0o00o2.f15897o00oOooO.equals(o0o0o00o.f15897o00oOooO) && o0o0o00o2.f15892o00oOo0O == o0o0o00o.f15892o00oOo0O && o0o0o00o2.f15889o00oOOo0.equals(o0o0o00o.f15889o00oOOo0);
    }

    public final boolean o00oOoO0(IOException iOException, boolean z, o0OO000o o0oo000o) {
        this.f16354o00oOo00.o00oo0OO(iOException);
        if (this.f16352o00oOOo0.o00ooOO()) {
            return !(z && (o0oo000o.f16091o00oOooO instanceof o0O00000)) && o00oOo0o(iOException, z) && this.f16354o00oOo00.o00oOoO();
        }
        return false;
    }

    public void o00oOoOO(Object obj) {
        this.f16356o00oOooO = obj;
    }

    public oO0Oo o00oOoOo() {
        return this.f16354o00oOo00;
    }

    public final o0OO000o o00oOooO(oo0ooO oo0ooo) throws IOException {
        String o00oOooo2;
        o0O0o00O o00oooOO2;
        if (oo0ooo != null) {
            o0OOOO0o o00oOooO2 = this.f16354o00oOo00.o00oOooO();
            o0OO00o0 o0oo00o0 = o00oOooO2 != null ? o00oOooO2.f16297o00oOo00 : null;
            int i = oo0ooo.f16171o00oo0Oo;
            o0OO000o o0oo000o = oo0ooo.f16170o00oo0O0;
            String str = o0oo000o.f16087o00oOOoO;
            if (i == 307 || i == 308) {
                if (!str.equals(o00oo0o0.o00oo0.f7537o00oOoOO) && !str.equals("HEAD")) {
                    return null;
                }
            } else if (i != 401) {
                if (i == 407) {
                    if ((o0oo00o0 != null ? o0oo00o0.f16106o00oOOoO : this.f16352o00oOOo0.o00ooO0O()).type() == Proxy.Type.HTTP) {
                        return this.f16352o00oOOo0.o00ooO0o().o00oOOo0(o0oo00o0, oo0ooo);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (i == 408) {
                    if (o0oo000o.f16091o00oOooO instanceof o0O00000) {
                        return null;
                    }
                    return o0oo000o;
                } else {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case o0OO0oO.f12839o0 /* 303 */:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f16352o00oOOo0.o00oOooO().o00oOOo0(o0oo00o0, oo0ooo);
            }
            if (!this.f16352o00oOOo0.o00oo0O() || (o00oOooo2 = oo0ooo.o00oOooo("Location", null)) == null || (o00oooOO2 = oo0ooo.f16170o00oo0O0.f16086o00oOOo0.o00oooOO(o00oOooo2)) == null) {
                return null;
            }
            if (o00oooOO2.f15889o00oOOo0.equals(oo0ooo.f16170o00oo0O0.f16086o00oOOo0.f15889o00oOOo0) || this.f16352o00oOOo0.o00oo0Oo()) {
                o0OO000o o0oo000o2 = oo0ooo.f16170o00oo0O0;
                o0oo000o2.getClass();
                o0OO000o.o00oOOo0 o00oooo02 = new o0OO000o.o00oOOo0(o0oo000o2);
                if (o00oo0O.o00oOOoO(str)) {
                    boolean o00oOooO3 = o00oo0O.o00oOooO(str);
                    if (o00oo0O.o00oOo00(str)) {
                        o00oooo02.o00oOoOo(o00oo0o0.o00oo0.f7537o00oOoOO, null);
                    } else {
                        o00oooo02.o00oOoOo(str, o00oOooO3 ? oo0ooo.f16170o00oo0O0.f16091o00oOooO : null);
                    }
                    if (!o00oOooO3) {
                        o00oooo02.o00oo0(HttpHeaders.TRANSFER_ENCODING);
                        o00oooo02.o00oo0("Content-Length");
                        o00oooo02.o00oo0("Content-Type");
                    }
                }
                if (!o00oOoO(oo0ooo, o00oooOO2)) {
                    o00oooo02.o00oo0("Authorization");
                }
                return o00oooo02.o00oo0Oo(o00oooOO2).o00oOOoO();
            }
            return null;
        }
        throw new IllegalStateException();
    }
}
