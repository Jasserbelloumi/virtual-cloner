package o0O0OOOo;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o0O0OOoO.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String[] f11479o00oOooO = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f11480o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Set<String> f11481o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Set<String> f11482o00oOo00;

    public o00oOoO(String str, Set<String> set, String str2) {
        this.f11480o00oOOo0 = str;
        this.f11481o00oOOoO = set;
        this.f11482o00oOo00 = o00oOOo0(str2);
    }

    public o00oOoO(String str, Set<String> set, Set<String> set2) {
        this.f11480o00oOOo0 = str;
        this.f11481o00oOOoO = set;
        this.f11482o00oOo00 = set2;
    }

    @o0o0000
    public static Set<String> o00oOOo0(String str) {
        int i;
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = -1;
        for (i = 0; i < substring.length(); i = i + 1) {
            char charAt = substring.charAt(i);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt == '[') {
                        if (!arrayDeque.isEmpty()) {
                        }
                        arrayDeque.push(Character.valueOf(charAt));
                    } else if (charAt != ']') {
                        if (charAt != '`') {
                        }
                    } else if (!arrayDeque.isEmpty()) {
                        if (((Character) arrayDeque.peek()).charValue() != '[') {
                        }
                        arrayDeque.pop();
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i2 + 1, i).trim());
                    i2 = i;
                }
            }
            if (!arrayDeque.isEmpty()) {
                i = ((Character) arrayDeque.peek()).charValue() != charAt ? i + 1 : 0;
                arrayDeque.pop();
            }
            arrayDeque.push(Character.valueOf(charAt));
        }
        arrayList.add(substring.substring(i2 + 1).trim());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            for (String str3 : f11479o00oOooO) {
                if (str2.startsWith(str3)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static o00oOoO o00oOOoO(o00oo o00ooVar, String str) {
        return new o00oOoO(str, o00oOo00(o00ooVar, str), o00oOooO(o00ooVar, str));
    }

    public static Set<String> o00oOo00(o00oo o00ooVar, String str) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (o0O0Oo0o2.getColumnCount() > 0) {
                int columnIndex = o0O0Oo0o2.getColumnIndex("name");
                while (o0O0Oo0o2.moveToNext()) {
                    hashSet.add(o0O0Oo0o2.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public static Set<String> o00oOooO(o00oo o00ooVar, String str) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            String string = o0O0Oo0o2.moveToFirst() ? o0O0Oo0o2.getString(o0O0Oo0o2.getColumnIndexOrThrow("sql")) : "";
            o0O0Oo0o2.close();
            return o00oOOo0(string);
        } catch (Throwable th) {
            o0O0Oo0o2.close();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o00oOoO o00oooo2 = (o00oOoO) obj;
        String str = this.f11480o00oOOo0;
        if (str == null ? o00oooo2.f11480o00oOOo0 == null : str.equals(o00oooo2.f11480o00oOOo0)) {
            Set<String> set = this.f11481o00oOOoO;
            if (set == null ? o00oooo2.f11481o00oOOoO == null : set.equals(o00oooo2.f11481o00oOOoO)) {
                Set<String> set2 = this.f11482o00oOo00;
                Set<String> set3 = o00oooo2.f11482o00oOo00;
                return set2 != null ? set2.equals(set3) : set3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11480o00oOOo0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.f11481o00oOOoO;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f11482o00oOo00;
        return hashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("FtsTableInfo{name='");
        o00oOOo02.append(this.f11480o00oOOo0);
        o00oOOo02.append('\'');
        o00oOOo02.append(", columns=");
        o00oOOo02.append(this.f11481o00oOOoO);
        o00oOOo02.append(", options=");
        o00oOOo02.append(this.f11482o00oOo00);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
