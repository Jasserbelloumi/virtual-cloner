package o0Oo0oO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o0Oo0Oo0.o0O;
/* loaded from: classes3.dex */
public final class oO000 extends oO0Ooooo {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Method f16598o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Method f16599o00oOo0o;

    public oO000(Method method, Method method2) {
        this.f16598o00oOo0O = method;
        this.f16599o00oOo0o = method2;
    }

    public static oO000 o00oo0O() {
        try {
            return new oO000(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oOo0O(SSLSocket sSLSocket, String str, List<o0O> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> o00oOOoO2 = oO0Ooooo.o00oOOoO(list);
            this.f16598o00oOo0O.invoke(sSLParameters, o00oOOoO2.toArray(new String[o00oOOoO2.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public String o00oOoOo(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f16599o00oOo0o.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (str.equals("")) {
                    return null;
                }
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public X509TrustManager o00oo0O0(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
