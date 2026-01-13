package o0O0OOOo;

import android.database.Cursor;
import o00oOooO.o0OO0oO;
import o0O0OOoO.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f11484o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f11485o00oOOoO;

    public o00oo0O(String str, String str2) {
        this.f11484o00oOOo0 = str;
        this.f11485o00oOOoO = str2;
    }

    public static o00oo0O o00oOOo0(o00oo o00ooVar, String str) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            return o0O0Oo0o2.moveToFirst() ? new o00oo0O(o0O0Oo0o2.getString(0), o0O0Oo0o2.getString(1)) : new o00oo0O(str, null);
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o00oo0O o00oo0o2 = (o00oo0O) obj;
        String str = this.f11484o00oOOo0;
        if (str == null ? o00oo0o2.f11484o00oOOo0 == null : str.equals(o00oo0o2.f11484o00oOOo0)) {
            String str2 = this.f11485o00oOOoO;
            String str3 = o00oo0o2.f11485o00oOOoO;
            if (str2 != null) {
                if (str2.equals(str3)) {
                    return true;
                }
            } else if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11484o00oOOo0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11485o00oOOoO;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ViewInfo{name='");
        o00oOOo02.append(this.f11484o00oOOo0);
        o00oOOo02.append('\'');
        o00oOOo02.append(", sql='");
        o00oOOo02.append(this.f11485o00oOOoO);
        o00oOOo02.append('\'');
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
