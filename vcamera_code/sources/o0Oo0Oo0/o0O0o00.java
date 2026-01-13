package o0Oo0Oo0;

import android.support.v4.media.o00oOoO;
import androidx.fragment.app.o0O00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.Nullable;
import o00oOoOo.o00oo;
import o0Oo0Oo.oO0000O;
import o0Oo0o00.o00oo0OO;
/* loaded from: classes3.dex */
public final class o0O0o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String[] f15872o00oOOo0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<String> f15873o00oOOo0 = new ArrayList(20);

        public o00oOOo0 o00oOOo0(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return o00oOOoO(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException(o00oo.o00oOOo0("Unexpected header: ", str));
        }

        public o00oOOo0 o00oOOoO(String str, String str2) {
            o00oOo0o(str, str2);
            return o00oOooO(str, str2);
        }

        public o00oOOo0 o00oOo00(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? o00oOooO(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? o00oOooO("", str.substring(1)) : o00oOooO("", str);
        }

        public o0O0o00 o00oOo0O() {
            return new o0O0o00(this);
        }

        public final void o00oOo0o(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(oO0000O.o00oo00O("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new NullPointerException(o00oOoO.o00oOOo0("value for name ", str, " == null"));
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char charAt2 = str2.charAt(i2);
                if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                    throw new IllegalArgumentException(oO0000O.o00oo00O("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                }
            }
        }

        public o00oOOo0 o00oOoO(String str) {
            int i = 0;
            while (i < this.f15873o00oOOo0.size()) {
                if (str.equalsIgnoreCase(this.f15873o00oOOo0.get(i))) {
                    this.f15873o00oOOo0.remove(i);
                    this.f15873o00oOOo0.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public String o00oOoO0(String str) {
            for (int size = this.f15873o00oOOo0.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f15873o00oOOo0.get(size))) {
                    return this.f15873o00oOOo0.get(size + 1);
                }
            }
            return null;
        }

        public o00oOOo0 o00oOoOO(String str, String str2) {
            o00oOo0o(str, str2);
            o00oOoO(str);
            o00oOooO(str, str2);
            return this;
        }

        public o00oOOo0 o00oOooO(String str, String str2) {
            this.f15873o00oOOo0.add(str);
            this.f15873o00oOOo0.add(str2.trim());
            return this;
        }
    }

    public o0O0o00(o00oOOo0 o00oooo02) {
        List<String> list = o00oooo02.f15873o00oOOo0;
        this.f15872o00oOOo0 = (String[]) list.toArray(new String[list.size()]);
    }

    public o0O0o00(String[] strArr) {
        this.f15872o00oOOo0 = strArr;
    }

    public static String o00oOOoO(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static o0O0o00 o00oOoO(String... strArr) {
        if (strArr != null) {
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                for (int i = 0; i < strArr2.length; i++) {
                    String str = strArr2[i];
                    if (str == null) {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                    strArr2[i] = str.trim();
                }
                for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    if (str2.length() == 0 || str2.indexOf(0) != -1 || str3.indexOf(0) != -1) {
                        throw new IllegalArgumentException(o0O00.o00oOOo0("Unexpected header: ", str2, ": ", str3));
                    }
                }
                return new o0O0o00(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        throw new NullPointerException("namesAndValues == null");
    }

    public static o0O0o00 o00oOoO0(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = entry.getKey().trim();
                String trim2 = entry.getValue().trim();
                if (trim.length() == 0 || trim.indexOf(0) != -1 || trim2.indexOf(0) != -1) {
                    throw new IllegalArgumentException(o0O00.o00oOOo0("Unexpected header: ", trim, ": ", trim2));
                }
                strArr[i] = trim;
                strArr[i + 1] = trim2;
                i += 2;
            }
            return new o0O0o00(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o0O0o00) && Arrays.equals(((o0O0o00) obj).f15872o00oOOo0, this.f15872o00oOOo0);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15872o00oOOo0);
    }

    @Nullable
    public String o00oOOo0(String str) {
        return o00oOOoO(this.f15872o00oOOo0, str);
    }

    @Nullable
    public Date o00oOo00(String str) {
        String o00oOOo02 = o00oOOo0(str);
        if (o00oOOo02 != null) {
            return o00oo0OO.o00oOOoO(o00oOOo02);
        }
        return null;
    }

    public Set<String> o00oOo0O() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(o00oOooO(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public o00oOOo0 o00oOo0o() {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        Collections.addAll(o00oooo02.f15873o00oOOo0, this.f15872o00oOOo0);
        return o00oooo02;
    }

    public int o00oOoOO() {
        return this.f15872o00oOOo0.length / 2;
    }

    public Map<String, List<String>> o00oOoOo() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = o00oOooO(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(o00oOoo0(i));
        }
        return treeMap;
    }

    public String o00oOoo0(int i) {
        return this.f15872o00oOOo0[(i * 2) + 1];
    }

    public String o00oOooO(int i) {
        return this.f15872o00oOOo0[i * 2];
    }

    public List<String> o00oOooo(String str) {
        int length = this.f15872o00oOOo0.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(o00oOooO(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(o00oOoo0(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f15872o00oOOo0.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(o00oOooO(i));
            sb.append(": ");
            sb.append(o00oOoo0(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
