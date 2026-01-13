package o0O000O;

import android.util.Base64;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OoOoOo;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f10305o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f10306o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f10307o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f10308o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final String f10309o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<List<byte[]>> f10310o00oOooO;

    public o00oo00O(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, @o0OoOoOo int i) {
        str.getClass();
        this.f10305o00oOOo0 = str;
        str2.getClass();
        this.f10306o00oOOoO = str2;
        str3.getClass();
        this.f10307o00oOo00 = str3;
        this.f10310o00oOooO = null;
        ooOOOOoo.o00oOOo0(i != 0);
        this.f10308o00oOo0O = i;
        this.f10309o00oOo0o = o00oOOo0(str, str2, str3);
    }

    public final String o00oOOo0(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @o0OO00OO
    public List<List<byte[]>> o00oOOoO() {
        return this.f10310o00oOooO;
    }

    @o0OoOoOo
    public int o00oOo00() {
        return this.f10308o00oOo0O;
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public String o00oOo0O() {
        return this.f10309o00oOo0o;
    }

    @oo0oO0
    public String o00oOo0o() {
        return this.f10305o00oOOo0;
    }

    @oo0oO0
    public String o00oOoO() {
        return this.f10307o00oOo00;
    }

    @oo0oO0
    public String o00oOoO0() {
        return this.f10306o00oOOoO;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public String o00oOooO() {
        return this.f10309o00oOo0o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("FontRequest {mProviderAuthority: ");
        o00oOOo02.append(this.f10305o00oOOo0);
        o00oOOo02.append(", mProviderPackage: ");
        o00oOOo02.append(this.f10306o00oOOoO);
        o00oOOo02.append(", mQuery: ");
        o00oOOo02.append(this.f10307o00oOo00);
        o00oOOo02.append(", mCertificates:");
        sb.append(o00oOOo02.toString());
        for (int i = 0; i < this.f10310o00oOooO.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f10310o00oOooO.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f10308o00oOo0O);
        return sb.toString();
    }

    public o00oo00O(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, @oo0oO0 List<List<byte[]>> list) {
        str.getClass();
        this.f10305o00oOOo0 = str;
        str2.getClass();
        this.f10306o00oOOoO = str2;
        str3.getClass();
        this.f10307o00oOo00 = str3;
        list.getClass();
        this.f10310o00oOooO = list;
        this.f10308o00oOo0O = 0;
        this.f10309o00oOo0o = o00oOOo0(str, str2, str3);
    }
}
