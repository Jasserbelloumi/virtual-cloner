package o0Oo0Ooo;

import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import o0Oo0Oo.oO00000;
import o0Oo0Oo0.o0ooO;
/* loaded from: classes3.dex */
public final class o0OOOO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<o0ooO> f16291o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f16292o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f16293o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f16294o00oOooO;

    public o0OOOO00(List<o0ooO> list) {
        this.f16291o00oOOo0 = list;
    }

    public o0ooO o00oOOo0(SSLSocket sSLSocket) throws IOException {
        o0ooO o0ooo;
        int i = this.f16292o00oOOoO;
        int size = this.f16291o00oOOo0.size();
        while (true) {
            if (i >= size) {
                o0ooo = null;
                break;
            }
            o0ooo = this.f16291o00oOOo0.get(i);
            i++;
            if (o0ooo.o00oOo00(sSLSocket)) {
                this.f16292o00oOOoO = i;
                break;
            }
        }
        if (o0ooo != null) {
            this.f16293o00oOo00 = o00oOo00(sSLSocket);
            oO00000.f15748o00oOOo0.o00oOo00(o0ooo, sSLSocket, this.f16294o00oOooO);
            return o0ooo;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Unable to find acceptable protocols. isFallback=");
        o00oOOo02.append(this.f16294o00oOooO);
        o00oOOo02.append(", modes=");
        o00oOOo02.append(this.f16291o00oOOo0);
        o00oOOo02.append(", supported protocols=");
        o00oOOo02.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(o00oOOo02.toString());
    }

    public boolean o00oOOoO(IOException iOException) {
        this.f16294o00oOooO = true;
        if (!this.f16293o00oOo00 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException);
    }

    public final boolean o00oOo00(SSLSocket sSLSocket) {
        for (int i = this.f16292o00oOOoO; i < this.f16291o00oOOo0.size(); i++) {
            if (this.f16291o00oOOo0.get(i).o00oOo00(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
