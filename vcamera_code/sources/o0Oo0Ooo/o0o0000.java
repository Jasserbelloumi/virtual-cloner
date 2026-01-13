package o0Oo0Ooo;

import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O00O;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0OO00o0;
/* loaded from: classes3.dex */
public final class o0o0000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00O f16312o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OOOO f16313o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Proxy f16314o00oOo00;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f16316o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f16317o00oOoO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public InetSocketAddress f16320o00oOooO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public List<Proxy> f16315o00oOo0O = Collections.emptyList();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public List<InetSocketAddress> f16318o00oOoO0 = Collections.emptyList();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final List<o0OO00o0> f16319o00oOoOO = new ArrayList();

    public o0o0000(o0O00O o0o00o, o0OOOO o0oooo) {
        this.f16312o00oOOo0 = o0o00o;
        this.f16313o00oOOoO = o0oooo;
        o00oOooo(o0o00o.f15769o00oOOo0, o0o00o.f15774o00oOoO);
    }

    public static String o00oOOoO(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    public void o00oOOo0(o0OO00o0 o0oo00o0, IOException iOException) {
        o0O00O o0o00o;
        ProxySelector proxySelector;
        if (o0oo00o0.f16106o00oOOoO.type() != Proxy.Type.DIRECT && (proxySelector = (o0o00o = this.f16312o00oOOo0).f15775o00oOoO0) != null) {
            proxySelector.connectFailed(o0o00o.f15769o00oOOo0.o00oooo(), o0oo00o0.f16106o00oOOoO.address(), iOException);
        }
        this.f16313o00oOOoO.o00oOOoO(o0oo00o0);
    }

    public boolean o00oOo00() {
        return o00oOooO() || o00oOo0o() || o00oOo0O();
    }

    public final boolean o00oOo0O() {
        return !this.f16319o00oOoOO.isEmpty();
    }

    public final boolean o00oOo0o() {
        return this.f16316o00oOo0o < this.f16315o00oOo0O.size();
    }

    public final InetSocketAddress o00oOoO() throws IOException {
        if (o00oOooO()) {
            List<InetSocketAddress> list = this.f16318o00oOoO0;
            int i = this.f16317o00oOoO;
            this.f16317o00oOoO = i + 1;
            return list.get(i);
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("No route to ");
        o00oOOo02.append(this.f16312o00oOOo0.f15769o00oOOo0.f15897o00oOooO);
        o00oOOo02.append("; exhausted inet socket addresses: ");
        o00oOOo02.append(this.f16318o00oOoO0);
        throw new SocketException(o00oOOo02.toString());
    }

    public o0OO00o0 o00oOoO0() throws IOException {
        if (!o00oOooO()) {
            if (!o00oOo0o()) {
                if (o00oOo0O()) {
                    return o00oOoOO();
                }
                throw new NoSuchElementException();
            }
            this.f16314o00oOo00 = o00oOoOo();
        }
        InetSocketAddress o00oOoO2 = o00oOoO();
        this.f16320o00oOooO = o00oOoO2;
        o0OO00o0 o0oo00o0 = new o0OO00o0(this.f16312o00oOOo0, this.f16314o00oOo00, o00oOoO2);
        if (this.f16313o00oOOoO.o00oOo00(o0oo00o0)) {
            this.f16319o00oOoOO.add(o0oo00o0);
            return o00oOoO0();
        }
        return o0oo00o0;
    }

    public final o0OO00o0 o00oOoOO() {
        return this.f16319o00oOoOO.remove(0);
    }

    public final Proxy o00oOoOo() throws IOException {
        if (!o00oOo0o()) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("No route to ");
            o00oOOo02.append(this.f16312o00oOOo0.f15769o00oOOo0.f15897o00oOooO);
            o00oOOo02.append("; exhausted proxy configurations: ");
            o00oOOo02.append(this.f16315o00oOo0O);
            throw new SocketException(o00oOOo02.toString());
        }
        List<Proxy> list = this.f16315o00oOo0O;
        int i = this.f16316o00oOo0o;
        this.f16316o00oOo0o = i + 1;
        Proxy proxy = list.get(i);
        o00oOoo0(proxy);
        return proxy;
    }

    public final void o00oOoo0(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f16318o00oOoO0 = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            o0O0o00O o0o0o00o = this.f16312o00oOOo0.f15769o00oOOo0;
            str = o0o0o00o.f15897o00oOooO;
            i = o0o0o00o.f15892o00oOo0O;
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Proxy.address() is not an InetSocketAddress: ");
                o00oOOo02.append(address.getClass());
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            str = o00oOOoO(inetSocketAddress);
            i = inetSocketAddress.getPort();
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f16318o00oOoO0.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List<InetAddress> o00oOOo03 = this.f16312o00oOOo0.f15770o00oOOoO.o00oOOo0(str);
            if (o00oOOo03.isEmpty()) {
                throw new UnknownHostException(this.f16312o00oOOo0.f15770o00oOOoO + " returned no addresses for " + str);
            }
            int size = o00oOOo03.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f16318o00oOoO0.add(new InetSocketAddress(o00oOOo03.get(i2), i));
            }
        }
        this.f16317o00oOoO = 0;
    }

    public final boolean o00oOooO() {
        return this.f16317o00oOoO < this.f16318o00oOoO0.size();
    }

    public final void o00oOooo(o0O0o00O o0o0o00o, Proxy proxy) {
        List<Proxy> o00oo0O02;
        if (proxy != null) {
            o00oo0O02 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f16312o00oOOo0.f15775o00oOoO0.select(o0o0o00o.o00oooo());
            o00oo0O02 = (select == null || select.isEmpty()) ? oO0000O.o00oo0O0(Proxy.NO_PROXY) : oO0000O.o00oo0OO(select);
        }
        this.f16315o00oOo0O = o00oo0O02;
        this.f16316o00oOo0o = 0;
    }
}
