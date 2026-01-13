package o0Oo0oO;

import android.util.Log;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
import o0Oo0ooO.oO00000;
/* loaded from: classes3.dex */
public class oO0000o0 extends oO0Ooooo {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f16600o00oOoo0 = 4000;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Class<?> f16601o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final oO000O0O<Socket> f16602o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final oO000O0O<Socket> f16603o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final oO000O0O<Socket> f16604o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final oO000O0O<Socket> f16605o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final o00oOOoO f16606o00oOoOo = o00oOOoO.o00oOOoO();

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends oO00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f16607o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Method f16608o00oOOoO;

        public o00oOOo0(Object obj, Method method) {
            this.f16607o00oOOo0 = obj;
            this.f16608o00oOOoO = method;
        }

        public boolean equals(Object obj) {
            return obj instanceof o00oOOo0;
        }

        public int hashCode() {
            return 0;
        }

        @Override // o0Oo0ooO.oO00000
        public List<Certificate> o00oOOo0(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f16608o00oOOoO.invoke(this.f16607o00oOOo0, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Method f16609o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Method f16610o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Method f16611o00oOo00;

        public o00oOOoO(Method method, Method method2, Method method3) {
            this.f16609o00oOOo0 = method;
            this.f16610o00oOOoO = method2;
            this.f16611o00oOo00 = method3;
        }

        public static o00oOOoO o00oOOoO() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new o00oOOoO(method3, method2, method);
        }

        public Object o00oOOo0(String str) {
            Method method = this.f16609o00oOOo0;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f16610o00oOOoO.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean o00oOo00(Object obj) {
            if (obj != null) {
                try {
                    this.f16611o00oOo00.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public oO0000o0(Class<?> cls, oO000O0O<Socket> oo000o0o, oO000O0O<Socket> oo000o0o2, oO000O0O<Socket> oo000o0o3, oO000O0O<Socket> oo000o0o4) {
        this.f16601o00oOo0O = cls;
        this.f16602o00oOo0o = oo000o0o;
        this.f16604o00oOoO0 = oo000o0o2;
        this.f16603o00oOoO = oo000o0o3;
        this.f16605o00oOoOO = oo000o0o4;
    }

    public static oO0Ooooo o00oo0O() {
        Class<?> cls;
        oO000O0O oo000o0o;
        oO000O0O oo000o0o2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (ClassNotFoundException unused2) {
            cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        }
        Class<?> cls2 = cls;
        oO000O0O oo000o0o3 = new oO000O0O(null, "setUseSessionTickets", Boolean.TYPE);
        oO000O0O oo000o0o4 = new oO000O0O(null, "setHostname", String.class);
        try {
            Class.forName("android.net.Network");
            oo000o0o = new oO000O0O(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        } catch (ClassNotFoundException unused3) {
            oo000o0o = null;
        }
        try {
            oo000o0o2 = new oO000O0O(null, "setAlpnProtocols", byte[].class);
        } catch (ClassNotFoundException unused4) {
            oo000o0o2 = null;
            return new oO0000o0(cls2, oo000o0o3, oo000o0o4, oo000o0o, oo000o0o2);
        }
        return new oO0000o0(cls2, oo000o0o3, oo000o0o4, oo000o0o, oo000o0o2);
    }

    @Override // o0Oo0oO.oO0Ooooo
    public oO00000 o00oOo00(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new o00oOOo0(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.o00oOo00(x509TrustManager);
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oOo0O(SSLSocket sSLSocket, String str, List<o0O> list) {
        if (str != null) {
            this.f16602o00oOo0o.o00oOo0O(sSLSocket, Boolean.TRUE);
            this.f16604o00oOoO0.o00oOo0O(sSLSocket, str);
        }
        oO000O0O<Socket> oo000o0o = this.f16605o00oOoOO;
        if (oo000o0o == null || !oo000o0o.o00oOoO0(sSLSocket)) {
            return;
        }
        this.f16605o00oOoOO.o00oOo0o(sSLSocket, oO0Ooooo.o00oOooO(list));
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oOo0o(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!oO0000O.o00oo0o(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public String o00oOoOo(SSLSocket sSLSocket) {
        byte[] bArr;
        oO000O0O<Socket> oo000o0o = this.f16603o00oOoO;
        if (oo000o0o == null || !oo000o0o.o00oOoO0(sSLSocket) || (bArr = (byte[]) this.f16603o00oOoO.o00oOo0o(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, oO0000O.f15758o00oOoOo);
    }

    @Override // o0Oo0oO.oO0Ooooo
    public Object o00oOoo0(String str) {
        return this.f16606o00oOoOo.o00oOOo0(str);
    }

    @Override // o0Oo0oO.oO0Ooooo
    public boolean o00oOooo(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oo0(String str, Object obj) {
        if (this.f16606o00oOoOo.o00oOo00(obj)) {
            return;
        }
        o00oo00O(5, str, null);
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oo00O(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + f16600o00oOoo0);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public X509TrustManager o00oo0O0(SSLSocketFactory sSLSocketFactory) {
        Object o00oo0OO2 = oO0Ooooo.o00oo0OO(sSLSocketFactory, this.f16601o00oOo0O, "sslParameters");
        if (o00oo0OO2 == null) {
            try {
                o00oo0OO2 = oO0Ooooo.o00oo0OO(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.o00oo0O0(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) oO0Ooooo.o00oo0OO(o00oo0OO2, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) oO0Ooooo.o00oo0OO(o00oo0OO2, X509TrustManager.class, "trustManager");
    }
}
