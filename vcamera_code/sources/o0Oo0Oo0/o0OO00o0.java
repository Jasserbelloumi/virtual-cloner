package o0Oo0Oo0;

import android.support.v4.media.o00oOo0O;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public final class o0OO00o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00O f16105o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Proxy f16106o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final InetSocketAddress f16107o00oOo00;

    public o0OO00o0(o0O00O o0o00o, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (o0o00o == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f16105o00oOOo0 = o0o00o;
        this.f16106o00oOOoO = proxy;
        this.f16107o00oOo00 = inetSocketAddress;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OO00o0) {
            o0OO00o0 o0oo00o0 = (o0OO00o0) obj;
            if (o0oo00o0.f16105o00oOOo0.equals(this.f16105o00oOOo0) && o0oo00o0.f16106o00oOOoO.equals(this.f16106o00oOOoO) && o0oo00o0.f16107o00oOo00.equals(this.f16107o00oOo00)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16106o00oOOoO.hashCode();
        return this.f16107o00oOo00.hashCode() + ((hashCode + ((this.f16105o00oOOo0.hashCode() + 527) * 31)) * 31);
    }

    public o0O00O o00oOOo0() {
        return this.f16105o00oOOo0;
    }

    public Proxy o00oOOoO() {
        return this.f16106o00oOOoO;
    }

    public boolean o00oOo00() {
        return this.f16105o00oOOo0.f15776o00oOoOO != null && this.f16106o00oOOoO.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress o00oOooO() {
        return this.f16107o00oOo00;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Route{");
        o00oOOo02.append(this.f16107o00oOo00);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
