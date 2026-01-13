package o0Oo0Oo0;

import android.support.v4.media.o00oOo0O;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0o00O;
/* loaded from: classes3.dex */
public final class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0o00O f15769o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0OOOo f15770o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final SocketFactory f15771o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final List<o0O> f15772o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final List<o0ooO> f15773o00oOo0o;
    @Nullable

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Proxy f15774o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final ProxySelector f15775o00oOoO0;
    @Nullable

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final SSLSocketFactory f15776o00oOoOO;
    @Nullable

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final HostnameVerifier f15777o00oOoOo;
    @Nullable

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final o0O0O0O f15778o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00OO f15779o00oOooO;

    public o0O00O(String str, int i, o0O0OOOo o0o0oooo, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable o0O0O0O o0o0o0o, o0O00OO o0o00oo, @Nullable Proxy proxy, List<o0O> list, List<o0ooO> list2, ProxySelector proxySelector) {
        this.f15769o00oOOo0 = new o0O0o00O.o00oOOoO().o00ooo0(sSLSocketFactory != null ? "https" : "http").o00oo0o0(str).o00ooO0o(i).o00oOoO();
        if (o0o0oooo == null) {
            throw new NullPointerException("dns == null");
        }
        this.f15770o00oOOoO = o0o0oooo;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f15771o00oOo00 = socketFactory;
        if (o0o00oo == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f15779o00oOooO = o0o00oo;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f15772o00oOo0O = oO0000O.o00oo0OO(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f15773o00oOo0o = oO0000O.o00oo0OO(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f15775o00oOoO0 = proxySelector;
        this.f15774o00oOoO = proxy;
        this.f15776o00oOoOO = sSLSocketFactory;
        this.f15777o00oOoOo = hostnameVerifier;
        this.f15778o00oOoo0 = o0o0o0o;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00O) {
            o0O00O o0o00o = (o0O00O) obj;
            if (this.f15769o00oOOo0.equals(o0o00o.f15769o00oOOo0) && o00oOooO(o0o00o)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f15770o00oOOoO.hashCode();
        int hashCode2 = this.f15779o00oOooO.hashCode();
        int hashCode3 = this.f15772o00oOo0O.hashCode();
        int hashCode4 = (this.f15775o00oOoO0.hashCode() + ((this.f15773o00oOo0o.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f15769o00oOOo0.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f15774o00oOoO;
        int hashCode5 = (hashCode4 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f15776o00oOoOO;
        int hashCode6 = (hashCode5 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f15777o00oOoOo;
        int hashCode7 = (hashCode6 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        o0O0O0O o0o0o0o = this.f15778o00oOoo0;
        return hashCode7 + (o0o0o0o != null ? o0o0o0o.hashCode() : 0);
    }

    @Nullable
    public o0O0O0O o00oOOo0() {
        return this.f15778o00oOoo0;
    }

    public List<o0ooO> o00oOOoO() {
        return this.f15773o00oOo0o;
    }

    public o0O0OOOo o00oOo00() {
        return this.f15770o00oOOoO;
    }

    @Nullable
    public HostnameVerifier o00oOo0O() {
        return this.f15777o00oOoOo;
    }

    public List<o0O> o00oOo0o() {
        return this.f15772o00oOo0O;
    }

    public o0O00OO o00oOoO() {
        return this.f15779o00oOooO;
    }

    @Nullable
    public Proxy o00oOoO0() {
        return this.f15774o00oOoO;
    }

    public ProxySelector o00oOoOO() {
        return this.f15775o00oOoO0;
    }

    public SocketFactory o00oOoOo() {
        return this.f15771o00oOo00;
    }

    @Nullable
    public SSLSocketFactory o00oOoo0() {
        return this.f15776o00oOoOO;
    }

    public boolean o00oOooO(o0O00O o0o00o) {
        return this.f15770o00oOOoO.equals(o0o00o.f15770o00oOOoO) && this.f15779o00oOooO.equals(o0o00o.f15779o00oOooO) && this.f15772o00oOo0O.equals(o0o00o.f15772o00oOo0O) && this.f15773o00oOo0o.equals(o0o00o.f15773o00oOo0o) && this.f15775o00oOoO0.equals(o0o00o.f15775o00oOoO0) && oO0000O.o00oOooo(this.f15774o00oOoO, o0o00o.f15774o00oOoO) && oO0000O.o00oOooo(this.f15776o00oOoOO, o0o00o.f15776o00oOoOO) && oO0000O.o00oOooo(this.f15777o00oOoOo, o0o00o.f15777o00oOoOo) && oO0000O.o00oOooo(this.f15778o00oOoo0, o0o00o.f15778o00oOoo0) && this.f15769o00oOOo0.f15892o00oOo0O == o0o00o.f15769o00oOOo0.f15892o00oOo0O;
    }

    public o0O0o00O o00oOooo() {
        return this.f15769o00oOOo0;
    }

    public String toString() {
        Object obj;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Address{");
        o00oOOo02.append(this.f15769o00oOOo0.f15897o00oOooO);
        o00oOOo02.append(":");
        o00oOOo02.append(this.f15769o00oOOo0.f15892o00oOo0O);
        if (this.f15774o00oOoO != null) {
            o00oOOo02.append(", proxy=");
            obj = this.f15774o00oOoO;
        } else {
            o00oOOo02.append(", proxySelector=");
            obj = this.f15775o00oOoO0;
        }
        o00oOOo02.append(obj);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
