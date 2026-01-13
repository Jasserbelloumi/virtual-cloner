package o0Oo0oO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O;
/* loaded from: classes3.dex */
public class oO000O0 extends oO0Ooooo {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Method f16612o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Method f16613o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Class<?> f16614o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Method f16615o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final Class<?> f16616o00oOoOO;

    /* loaded from: classes3.dex */
    public static class o00oOOo0 implements InvocationHandler {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<String> f16617o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f16618o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String f16619o00oOo00;

        public o00oOOo0(List<String> list) {
            this.f16617o00oOOo0 = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = oO0000O.f15751o00oOOoO;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f16618o00oOOoO = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f16617o00oOOo0;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof List) {
                        List list = (List) obj3;
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                obj2 = this.f16617o00oOOo0.get(0);
                                break;
                            } else if (this.f16617o00oOOo0.contains(list.get(i))) {
                                obj2 = list.get(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                        String str = (String) obj2;
                        this.f16619o00oOo00 = str;
                        return str;
                    }
                }
                if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f16619o00oOo00 = (String) objArr[0];
                    return null;
                }
                return method.invoke(this, objArr);
            }
        }
    }

    public oO000O0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f16612o00oOo0O = method;
        this.f16613o00oOo0o = method2;
        this.f16615o00oOoO0 = method3;
        this.f16614o00oOoO = cls;
        this.f16616o00oOoOO = cls2;
    }

    public static oO0Ooooo o00oo0O() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new oO000O0(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oOOo0(SSLSocket sSLSocket) {
        try {
            this.f16615o00oOoO0.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public void o00oOo0O(SSLSocket sSLSocket, String str, List<o0O> list) {
        try {
            this.f16612o00oOo0O.invoke(null, sSLSocket, Proxy.newProxyInstance(oO0Ooooo.class.getClassLoader(), new Class[]{this.f16614o00oOoO, this.f16616o00oOoOO}, new o00oOOo0(oO0Ooooo.o00oOOoO(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o0Oo0oO.oO0Ooooo
    public String o00oOoOo(SSLSocket sSLSocket) {
        try {
            o00oOOo0 o00oooo02 = (o00oOOo0) Proxy.getInvocationHandler(this.f16613o00oOo0o.invoke(null, sSLSocket));
            boolean z = o00oooo02.f16618o00oOOoO;
            if (!z && o00oooo02.f16619o00oOo00 == null) {
                oO0Ooooo.f16623o00oOOo0.o00oo00O(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z) {
                return null;
            } else {
                return o00oooo02.f16619o00oOo00;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
