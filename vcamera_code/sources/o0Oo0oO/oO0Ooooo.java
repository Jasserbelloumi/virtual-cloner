package o0Oo0oO;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o00oOoOo.o00oo;
import o0Oo.o00ooO;
import o0Oo0Oo0.o0O;
import o0Oo0Oo0.o0O0oo00;
import o0Oo0ooO.o;
import o0Oo0ooO.oO00000;
import o0Oo0ooO.oO0000Oo;
/* loaded from: classes3.dex */
public class oO0Ooooo {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16624o00oOOoO = 4;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16625o00oOo00 = 5;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO0Ooooo f16623o00oOOo0 = o00oOoO0();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Logger f16626o00oOooO = Logger.getLogger(o0O0oo00.class.getName());

    public static List<String> o00oOOoO(List<o0O> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o0O o0o = list.get(i);
            if (o0o != o0O.HTTP_1_0) {
                arrayList.add(o0o.toString());
            }
        }
        return arrayList;
    }

    public static oO0Ooooo o00oOoO() {
        return f16623o00oOOo0;
    }

    public static oO0Ooooo o00oOoO0() {
        oO0Ooooo o00oo0O2 = oO0000o0.o00oo0O();
        if (o00oo0O2 != null) {
            return o00oo0O2;
        }
        oO000 o00oo0O3 = oO000.o00oo0O();
        if (o00oo0O3 != null) {
            return o00oo0O3;
        }
        oO0Ooooo o00oo0O4 = oO000O0.o00oo0O();
        return o00oo0O4 != null ? o00oo0O4 : new oO0Ooooo();
    }

    public static byte[] o00oOooO(List<o0O> list) {
        o00ooO o00ooo = new o00ooO();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o0O o0o = list.get(i);
            if (o0o != o0O.HTTP_1_0) {
                o00ooo.writeByte(o0o.toString().length());
                o00ooo.o00oooo0(o0o.toString());
            }
        }
        return o00ooo.o0O0O0o0();
    }

    public static <T> T o00oo0OO(Object obj, Class<T> cls, String str) {
        Object o00oo0OO2;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (o00oo0OO2 = o00oo0OO(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return (T) o00oo0OO(o00oo0OO2, cls, str);
    }

    public void o00oOOo0(SSLSocket sSLSocket) {
    }

    public oO00000 o00oOo00(X509TrustManager x509TrustManager) {
        return new o(oO0000Oo.o00oOOoO(x509TrustManager));
    }

    public void o00oOo0O(SSLSocket sSLSocket, String str, List<o0O> list) {
    }

    public void o00oOo0o(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String o00oOoOO() {
        return "OkHttp";
    }

    public String o00oOoOo(SSLSocket sSLSocket) {
        return null;
    }

    public Object o00oOoo0(String str) {
        if (f16626o00oOooO.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean o00oOooo(String str) {
        return true;
    }

    public void o00oo0(String str, Object obj) {
        if (obj == null) {
            str = o00oo.o00oOOo0(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        o00oo00O(5, str, (Throwable) obj);
    }

    public void o00oo00O(int i, String str, Throwable th) {
        f16626o00oOooO.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public X509TrustManager o00oo0O0(SSLSocketFactory sSLSocketFactory) {
        try {
            Object o00oo0OO2 = o00oo0OO(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (o00oo0OO2 == null) {
                return null;
            }
            return (X509TrustManager) o00oo0OO(o00oo0OO2, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
