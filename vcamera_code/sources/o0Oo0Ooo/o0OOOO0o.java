package o0Oo0Ooo;

import android.support.v4.media.o00oOo0O;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o0Oo.o0;
import o0Oo.o0O00000;
import o0Oo.o0O00o00;
import o0Oo.o0oO0Ooo;
import o0Oo0Oo.oO00000;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.o0O0O0O;
import o0Oo0Oo0.o0O0O0Oo;
import o0Oo0Oo0.o0O0O0o0;
import o0Oo0Oo0.o0O0o000;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0OO00o0;
import o0Oo0Oo0.o0ooO;
import o0Oo0Oo0.oo0ooO;
import o0Oo0o00.o00oo0;
import o0Oo0o00.o00oo0O0;
import o0Oo0o0O.o0O000;
import o0Oo0o0o.o0O00O;
import o0Oo0o0o.o0O00O0;
import o0Oo0o0o.o0OoO00O;
import o0Oo0o0o.o0OoOoOo;
import o0Oo0oO.oO0Ooooo;
import o0Oo0ooo.oO0000o0;
/* loaded from: classes3.dex */
public final class o0OOOO0o extends o0OoO00O.o00oo0O0 implements o0O0O0Oo {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f16295o00oo0O0 = "throw with null exception";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0O0o0 f16296o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0OO00o0 f16297o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Socket f16298o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O0o000 f16299o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o0OoO00O f16300o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O f16301o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O00000 f16302o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o0 f16303o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f16304o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Socket f16305o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f16306o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f16308o00oo00O = 1;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final List<Reference<oO0Oo>> f16307o00oo0 = new ArrayList();

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public long f16309o00oo0OO = Long.MAX_VALUE;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends oO0000o0.o00oo0 {

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ oO0Oo f16311o00oo0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(boolean z, o0O00000 o0o00000, o0 o0Var, oO0Oo oo0oo) {
            super(z, o0o00000, o0Var);
            this.f16311o00oo0o0 = oo0oo;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            oO0Oo oo0oo = this.f16311o00oo0o0;
            oo0oo.o00oo0O0(true, oo0oo.o00oOo00());
        }
    }

    public o0OOOO0o(o0O0O0o0 o0o0o0o0, o0OO00o0 o0oo00o0) {
        this.f16296o00oOOoO = o0o0o0o0;
        this.f16297o00oOo00 = o0oo00o0;
    }

    public static o0OOOO0o o00oo0oO(o0O0O0o0 o0o0o0o0, o0OO00o0 o0oo00o0, Socket socket, long j) {
        o0OOOO0o o0oooo0o = new o0OOOO0o(o0o0o0o0, o0oo00o0);
        o0oooo0o.f16298o00oOo0O = socket;
        o0oooo0o.f16309o00oo0OO = j;
        return o0oooo0o;
    }

    @Override // o0Oo0Oo0.o0O0O0Oo
    public o0O o00oOOo0() {
        return this.f16301o00oOoO0;
    }

    @Override // o0Oo0Oo0.o0O0O0Oo
    public o0OO00o0 o00oOOoO() {
        return this.f16297o00oOo00;
    }

    @Override // o0Oo0Oo0.o0O0O0Oo
    public o0O0o000 o00oOo00() {
        return this.f16299o00oOo0o;
    }

    @Override // o0Oo0o0o.o0OoO00O.o00oo0O0
    public void o00oOo0O(o0OoO00O o0ooo00o) {
        synchronized (this.f16296o00oOOoO) {
            this.f16308o00oo00O = o0ooo00o.o00oOoO();
        }
    }

    @Override // o0Oo0o0o.o0OoO00O.o00oo0O0
    public void o00oOo0o(o0O00O o0o00o) throws IOException {
        o0o00o.o00oOooO(o0OoOoOo.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: IOException -> 0x007b, TryCatch #1 {IOException -> 0x007b, blocks: (B:16:0x0054, B:18:0x005c, B:20:0x0063, B:19:0x0060), top: B:46:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: IOException -> 0x007b, TryCatch #1 {IOException -> 0x007b, blocks: (B:16:0x0054, B:18:0x005c, B:20:0x0063, B:19:0x0060), top: B:46:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOoO(int r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            o0Oo0Oo0.o0O r0 = r5.f16301o00oOoO0
            if (r0 != 0) goto La9
            o0Oo0Oo0.o0OO00o0 r0 = r5.f16297o00oOo00
            o0Oo0Oo0.o0O00O r0 = r0.f16105o00oOOo0
            java.util.List<o0Oo0Oo0.o0ooO> r0 = r0.f15773o00oOo0o
            o0Oo0Ooo.o0OOOO00 r1 = new o0Oo0Ooo.o0OOOO00
            r1.<init>(r0)
            o0Oo0Oo0.o0OO00o0 r2 = r5.f16297o00oOo00
            o0Oo0Oo0.o0O00O r2 = r2.f16105o00oOOo0
            javax.net.ssl.SSLSocketFactory r2 = r2.f15776o00oOoOO
            if (r2 != 0) goto L52
            o0Oo0Oo0.o0ooO r2 = o0Oo0Oo0.o0ooO.f16145o00oOoO
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L45
            o0Oo0Oo0.o0OO00o0 r0 = r5.f16297o00oOo00
            o0Oo0Oo0.o0O00O r0 = r0.f16105o00oOOo0
            o0Oo0Oo0.o0O0o00O r0 = r0.f15769o00oOOo0
            java.lang.String r0 = r0.f15897o00oOooO
            o0Oo0oO.oO0Ooooo r2 = o0Oo0oO.oO0Ooooo.o00oOoO()
            boolean r2 = r2.o00oOooo(r0)
            if (r2 == 0) goto L32
            goto L52
        L32:
            o0Oo0Ooo.o0OOo000 r6 = new o0Oo0Ooo.o0OOo000
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication to "
            java.lang.String r9 = " not permitted by network security policy"
            java.lang.String r8 = android.support.v4.media.o00oOoO.o00oOOo0(r8, r0, r9)
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L45:
            o0Oo0Ooo.o0OOo000 r6 = new o0Oo0Ooo.o0OOo000
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication not enabled for client"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L52:
            r0 = 0
            r2 = r0
        L54:
            o0Oo0Oo0.o0OO00o0 r3 = r5.f16297o00oOo00     // Catch: java.io.IOException -> L7b
            boolean r3 = r3.o00oOo00()     // Catch: java.io.IOException -> L7b
            if (r3 == 0) goto L60
            r5.o00oOoo0(r6, r7, r8)     // Catch: java.io.IOException -> L7b
            goto L63
        L60:
            r5.o00oOoOO(r6, r7)     // Catch: java.io.IOException -> L7b
        L63:
            r5.o00oo0(r1)     // Catch: java.io.IOException -> L7b
            o0Oo0o0o.o0OoO00O r6 = r5.f16300o00oOoO
            if (r6 == 0) goto L7a
            o0Oo0Oo0.o0O0O0o0 r6 = r5.f16296o00oOOoO
            monitor-enter(r6)
            o0Oo0o0o.o0OoO00O r7 = r5.f16300o00oOoO     // Catch: java.lang.Throwable -> L77
            int r7 = r7.o00oOoO()     // Catch: java.lang.Throwable -> L77
            r5.f16308o00oo00O = r7     // Catch: java.lang.Throwable -> L77
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L77
            goto L7a
        L77:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L77
            throw r7
        L7a:
            return
        L7b:
            r3 = move-exception
            java.net.Socket r4 = r5.f16298o00oOo0O
            o0Oo0Oo.oO0000O.o00oOo0O(r4)
            java.net.Socket r4 = r5.f16305o00oOooO
            o0Oo0Oo.oO0000O.o00oOo0O(r4)
            r5.f16298o00oOo0O = r0
            r5.f16305o00oOooO = r0
            r5.f16302o00oOoOO = r0
            r5.f16303o00oOoOo = r0
            r5.f16299o00oOo0o = r0
            r5.f16301o00oOoO0 = r0
            r5.f16300o00oOoO = r0
            if (r2 != 0) goto L9c
            o0Oo0Ooo.o0OOo000 r2 = new o0Oo0Ooo.o0OOo000
            r2.<init>(r3)
            goto L9f
        L9c:
            r2.addConnectException(r3)
        L9f:
            if (r9 == 0) goto La8
            boolean r3 = r1.o00oOOoO(r3)
            if (r3 == 0) goto La8
            goto L54
        La8:
            throw r2
        La9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "already connected"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0Ooo.o0OOOO0o.o00oOoO(int, int, int, boolean):void");
    }

    public void o00oOoO0() {
        oO0000O.o00oOo0O(this.f16305o00oOooO);
    }

    public final void o00oOoOO(int i, int i2) throws IOException {
        o0OO00o0 o0oo00o0 = this.f16297o00oOo00;
        Proxy proxy = o0oo00o0.f16106o00oOOoO;
        Socket createSocket = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? o0oo00o0.f16105o00oOOo0.f15771o00oOo00.createSocket() : new Socket(proxy);
        this.f16305o00oOooO = createSocket;
        createSocket.setSoTimeout(i2);
        try {
            oO0Ooooo.o00oOoO().o00oOo0o(this.f16305o00oOooO, this.f16297o00oOo00.f16107o00oOo00, i);
            try {
                this.f16302o00oOoOO = new o0O00o00(o0Oo.o0O00O.o00oo0(this.f16305o00oOooO));
                this.f16303o00oOoOo = new o0oO0Ooo(o0Oo.o0O00O.o00oOoOO(this.f16305o00oOooO));
            } catch (NullPointerException e) {
                if (f16295o00oo0O0.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Failed to connect to ");
            o00oOOo02.append(this.f16297o00oOo00.f16107o00oOo00);
            ConnectException connectException = new ConnectException(o00oOOo02.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void o00oOoOo(o0OOOO00 o0oooo00) throws IOException {
        SSLSocket sSLSocket;
        o0Oo0Oo0.o0O00O o0o00o = this.f16297o00oOo00.f16105o00oOOo0;
        SSLSocketFactory sSLSocketFactory = o0o00o.f15776o00oOoOO;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                Socket socket = this.f16305o00oOooO;
                o0O0o00O o0o0o00o = o0o00o.f15769o00oOOo0;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, o0o0o00o.f15897o00oOooO, o0o0o00o.f15892o00oOo0O, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            o0ooO o00oOOo02 = o0oooo00.o00oOOo0(sSLSocket);
            if (o00oOOo02.f16148o00oOOoO) {
                oO0Ooooo.o00oOoO().o00oOo0O(sSLSocket, o0o00o.f15769o00oOOo0.f15897o00oOooO, o0o00o.f15772o00oOo0O);
            }
            sSLSocket.startHandshake();
            o0O0o000 o00oOOoO2 = o0O0o000.o00oOOoO(sSLSocket.getSession());
            if (o0o00o.f15777o00oOoOo.verify(o0o00o.f15769o00oOOo0.f15897o00oOooO, sSLSocket.getSession())) {
                o0o00o.f15778o00oOoo0.o00oOOo0(o0o00o.f15769o00oOOo0.f15897o00oOooO, o00oOOoO2.f15876o00oOo00);
                String o00oOoOo2 = o00oOOo02.f16148o00oOOoO ? oO0Ooooo.o00oOoO().o00oOoOo(sSLSocket) : null;
                this.f16298o00oOo0O = sSLSocket;
                this.f16302o00oOoOO = new o0O00o00(o0Oo.o0O00O.o00oo0(sSLSocket));
                this.f16303o00oOoOo = new o0oO0Ooo(o0Oo.o0O00O.o00oOoOO(this.f16298o00oOo0O));
                this.f16299o00oOo0o = o00oOOoO2;
                this.f16301o00oOoO0 = o00oOoOo2 != null ? o0O.get(o00oOoOo2) : o0O.HTTP_1_1;
                oO0Ooooo.o00oOoO().o00oOOo0(sSLSocket);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) o00oOOoO2.f15876o00oOo00.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + o0o00o.f15769o00oOOo0.f15897o00oOooO + " not verified:\n    certificate: " + o0O0O0O.o00oOooO(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o0Oo0ooO.oO0000O.o00oOOo0(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!oO0000O.o00oo0o(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                oO0Ooooo.o00oOoO().o00oOOo0(sSLSocket2);
            }
            oO0000O.o00oOo0O(sSLSocket2);
            throw th;
        }
    }

    public final void o00oOoo0(int i, int i2, int i3) throws IOException {
        o0OO000o o00oo00O2 = o00oo00O();
        o0O0o00O o0o0o00o = o00oo00O2.f16086o00oOOo0;
        int i4 = 0;
        while (true) {
            i4++;
            if (i4 > 21) {
                throw new ProtocolException("Too many tunnel connections attempted: 21");
            }
            o00oOoOO(i, i2);
            o00oo00O2 = o00oOooo(i2, i3, o00oo00O2, o0o0o00o);
            if (o00oo00O2 == null) {
                return;
            }
            oO0000O.o00oOo0O(this.f16305o00oOooO);
            this.f16305o00oOooO = null;
            this.f16303o00oOoOo = null;
            this.f16302o00oOoOO = null;
        }
    }

    @Override // o0Oo0Oo0.o0O0O0Oo
    public Socket o00oOooO() {
        return this.f16298o00oOo0O;
    }

    public final o0OO000o o00oOooo(int i, int i2, o0OO000o o0oo000o, o0O0o00O o0o0o00o) throws IOException {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CONNECT ");
        o00oOOo02.append(oO0000O.o00oo0(o0o0o00o, true));
        o00oOOo02.append(" HTTP/1.1");
        String sb = o00oOOo02.toString();
        while (true) {
            o0O000 o0o000 = new o0O000(null, null, this.f16302o00oOoOO, this.f16303o00oOoOo);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f16302o00oOoOO.o00oOooO().o00oOoO(i, timeUnit);
            this.f16303o00oOoOo.o00oOooO().o00oOoO(i2, timeUnit);
            o0o000.o00oo0O0(o0oo000o.f16088o00oOo00, sb);
            o0o000.o00oOOo0();
            oo0ooO o00oOo002 = o0o000.o00oOooO(false).o00oo0O(o0oo000o).o00oOo00();
            long o00oOOoO2 = o00oo0O0.o00oOOoO(o00oOo002);
            if (o00oOOoO2 == -1) {
                o00oOOoO2 = 0;
            }
            o0Oo.o0O0O0Oo o00oo00O2 = o0o000.o00oo00O(o00oOOoO2);
            oO0000O.o0O0o(o00oo00O2, Integer.MAX_VALUE, timeUnit);
            o00oo00O2.close();
            int i3 = o00oOo002.f16171o00oo0Oo;
            if (i3 == 200) {
                if (this.f16302o00oOoOO.o00oOo00().o0O0O0oO() && this.f16303o00oOoOo.o00oOo00().o0O0O0oO()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (i3 != 407) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Unexpected response code for CONNECT: ");
                o00oOOo03.append(o00oOo002.f16171o00oo0Oo);
                throw new IOException(o00oOOo03.toString());
            } else {
                o0OO00o0 o0oo00o0 = this.f16297o00oOo00;
                o0OO000o o00oOOo04 = o0oo00o0.f16105o00oOOo0.f15779o00oOooO.o00oOOo0(o0oo00o0, o00oOo002);
                if (o00oOOo04 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(o00oOo002.o00oOooo("Connection", null))) {
                    return o00oOOo04;
                }
                o0oo000o = o00oOOo04;
            }
        }
    }

    public final void o00oo0(o0OOOO00 o0oooo00) throws IOException {
        if (this.f16297o00oOo00.f16105o00oOOo0.f15776o00oOoOO == null) {
            this.f16301o00oOoO0 = o0O.HTTP_1_1;
            this.f16298o00oOo0O = this.f16305o00oOooO;
            return;
        }
        o00oOoOo(o0oooo00);
        if (this.f16301o00oOoO0 == o0O.HTTP_2) {
            this.f16298o00oOo0O.setSoTimeout(0);
            o0OoO00O o00oOOo02 = new o0OoO00O.o00oo0OO(true).o00oOo0O(this.f16298o00oOo0O, this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0.f15897o00oOooO, this.f16302o00oOoOO, this.f16303o00oOoOo).o00oOOoO(this).o00oOOo0();
            this.f16300o00oOoO = o00oOOo02;
            o00oOOo02.o0O0O0Oo(true);
        }
    }

    public final o0OO000o o00oo00O() {
        return new o0OO000o.o00oOOo0().o00oo0Oo(this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0).o00oOoO(HttpHeaders.HOST, oO0000O.o00oo0(this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0, true)).o00oOoO("Proxy-Connection", HttpHeaders.KEEP_ALIVE).o00oOoO("User-Agent", "okhttp/3.8.0").o00oOOoO();
    }

    public boolean o00oo0O() {
        return this.f16300o00oOoO != null;
    }

    public boolean o00oo0O0(boolean z) {
        if (this.f16298o00oOo0O.isClosed() || this.f16298o00oOo0O.isInputShutdown() || this.f16298o00oOo0O.isOutputShutdown()) {
            return false;
        }
        o0OoO00O o0ooo00o = this.f16300o00oOoO;
        if (o0ooo00o != null) {
            return !o0ooo00o.o00oOoO0();
        }
        if (z) {
            try {
                int soTimeout = this.f16298o00oOo0O.getSoTimeout();
                try {
                    this.f16298o00oOo0O.setSoTimeout(1);
                    return !this.f16302o00oOoOO.o0O0O0oO();
                } finally {
                    this.f16298o00oOo0O.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean o00oo0OO(o0Oo0Oo0.o0O00O o0o00o, @Nullable o0OO00o0 o0oo00o0) {
        if (this.f16307o00oo0.size() >= this.f16308o00oo00O || this.f16304o00oOoo0 || !oO00000.f15748o00oOOo0.o00oOoO0(this.f16297o00oOo00.f16105o00oOOo0, o0o00o)) {
            return false;
        }
        if (o0o00o.f15769o00oOOo0.f15897o00oOooO.equals(this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0.f15897o00oOooO)) {
            return true;
        }
        if (this.f16300o00oOoO != null && o0oo00o0 != null && o0oo00o0.f16106o00oOOoO.type() == Proxy.Type.DIRECT && this.f16297o00oOo00.f16106o00oOOoO.type() == Proxy.Type.DIRECT && this.f16297o00oOo00.f16107o00oOo00.equals(o0oo00o0.f16107o00oOo00) && o0oo00o0.f16105o00oOOo0.f15777o00oOoOo == o0Oo0ooO.oO0000O.f16670o00oOOo0 && o00oo0o(o0o00o.f15769o00oOOo0)) {
            try {
                o0o00o.f15778o00oOoo0.o00oOOo0(o0o00o.f15769o00oOOo0.f15897o00oOooO, this.f16299o00oOo0o.f15876o00oOo00);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        return false;
    }

    public o00oo0 o00oo0Oo(o0O0oo00 o0o0oo00, oO0Oo oo0oo) throws SocketException {
        if (this.f16300o00oOoO != null) {
            return new o0O00O0(o0o0oo00, oo0oo, this.f16300o00oOoO);
        }
        this.f16298o00oOo0O.setSoTimeout(o0o0oo00.o00ooOO0());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f16302o00oOoOO.o00oOooO().o00oOoO(o0o0oo00.o00ooOO0(), timeUnit);
        this.f16303o00oOoOo.o00oOooO().o00oOoO(o0o0oo00.o00ooOoo(), timeUnit);
        return new o0O000(o0o0oo00, oo0oo, this.f16302o00oOoOO, this.f16303o00oOoOo);
    }

    public boolean o00oo0o(o0O0o00O o0o0o00o) {
        int i = o0o0o00o.f15892o00oOo0O;
        o0O0o00O o0o0o00o2 = this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0;
        if (i != o0o0o00o2.f15892o00oOo0O) {
            return false;
        }
        if (o0o0o00o.f15897o00oOooO.equals(o0o0o00o2.f15897o00oOooO)) {
            return true;
        }
        o0O0o000 o0o0o000 = this.f16299o00oOo0o;
        return o0o0o000 != null && o0Oo0ooO.oO0000O.f16670o00oOOo0.o00oOo00(o0o0o00o.f15897o00oOooO, (X509Certificate) o0o0o000.f15876o00oOo00.get(0));
    }

    public oO0000o0.o00oo0 o00oo0o0(oO0Oo oo0oo) {
        return new o00oOOo0(true, this.f16302o00oOoOO, this.f16303o00oOoOo, oo0oo);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Connection{");
        o00oOOo02.append(this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0.f15897o00oOooO);
        o00oOOo02.append(":");
        o00oOOo02.append(this.f16297o00oOo00.f16105o00oOOo0.f15769o00oOOo0.f15892o00oOo0O);
        o00oOOo02.append(", proxy=");
        o00oOOo02.append(this.f16297o00oOo00.f16106o00oOOoO);
        o00oOOo02.append(" hostAddress=");
        o00oOOo02.append(this.f16297o00oOo00.f16107o00oOo00);
        o00oOOo02.append(" cipherSuite=");
        o0O0o000 o0o0o000 = this.f16299o00oOo0o;
        o00oOOo02.append(o0o0o000 != null ? o0o0o000.f15875o00oOOoO : "none");
        o00oOOo02.append(" protocol=");
        o00oOOo02.append(this.f16301o00oOoO0);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
