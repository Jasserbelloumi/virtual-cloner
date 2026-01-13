package o0O0OOoO;

import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class o0O00000 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Pattern f11528o00oOoOo = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f11530o00oOOoO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Object[] f11532o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String f11537o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f11529o00oOOo0 = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String[] f11531o00oOo00 = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public String f11533o00oOo0o = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public String f11535o00oOoO0 = null;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public String f11534o00oOoO = null;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public String f11536o00oOoOO = null;

    public o0O00000(String str) {
        this.f11530o00oOOoO = str;
    }

    public static void o00oOOo0(StringBuilder sb, String str, String str2) {
        if (o00oOoOO(str2)) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    public static void o00oOOoO(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    public static o0O00000 o00oOo00(String str) {
        return new o0O00000(str);
    }

    public static boolean o00oOoOO(String str) {
        return str == null || str.length() == 0;
    }

    public o0 o00oOo0O() {
        if (!o00oOoOO(this.f11533o00oOo0o) || o00oOoOO(this.f11535o00oOoO0)) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("SELECT ");
            if (this.f11529o00oOOo0) {
                sb.append("DISTINCT ");
            }
            String[] strArr = this.f11531o00oOo00;
            if (strArr == null || strArr.length == 0) {
                sb.append(" * ");
            } else {
                o00oOOoO(sb, strArr);
            }
            sb.append(" FROM ");
            sb.append(this.f11530o00oOOoO);
            o00oOOo0(sb, " WHERE ", this.f11537o00oOooO);
            o00oOOo0(sb, " GROUP BY ", this.f11533o00oOo0o);
            o00oOOo0(sb, " HAVING ", this.f11535o00oOoO0);
            o00oOOo0(sb, " ORDER BY ", this.f11534o00oOoO);
            o00oOOo0(sb, " LIMIT ", this.f11536o00oOoOO);
            return new o0O0o(sb.toString(), this.f11532o00oOo0O);
        }
        throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    }

    public o0O00000 o00oOo0o() {
        this.f11529o00oOOo0 = true;
        return this;
    }

    public o0O00000 o00oOoO(String str) {
        this.f11535o00oOoO0 = str;
        return this;
    }

    public o0O00000 o00oOoO0(String str) {
        this.f11533o00oOo0o = str;
        return this;
    }

    public o0O00000 o00oOoOo(String str) {
        if (o00oOoOO(str) || f11528o00oOoOo.matcher(str).matches()) {
            this.f11536o00oOoOO = str;
            return this;
        }
        throw new IllegalArgumentException(o00oOoOo.o00oo.o00oOOo0("invalid LIMIT clauses:", str));
    }

    public o0O00000 o00oOoo0(String str) {
        this.f11534o00oOoO = str;
        return this;
    }

    public o0O00000 o00oOooO(String[] strArr) {
        this.f11531o00oOo00 = strArr;
        return this;
    }

    public o0O00000 o00oOooo(String str, Object[] objArr) {
        this.f11537o00oOooO = str;
        this.f11532o00oOo0O = objArr;
        return this;
    }
}
