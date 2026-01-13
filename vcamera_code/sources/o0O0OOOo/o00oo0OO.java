package o0O0OOOo;

import android.database.Cursor;
import com.google.android.exoplayer2.text.CueDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o00oOOo0;
import o0O0OOoO.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0OO {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f11486o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f11487o00oOo0o = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f11488o00oOoO0 = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f11489o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<String, o00oOOo0> f11490o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Set<o00oOOoO> f11491o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Set<o00oOo0O> f11492o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f11493o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f11494o00oOOoO;
        @o00oOOo0.o00oOOoO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f11495o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f11496o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final String f11497o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final int f11498o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f11499o00oOooO;

        @Deprecated
        public o00oOOo0(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
        }

        public o00oOOo0(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f11493o00oOOo0 = str;
            this.f11494o00oOOoO = str2;
            this.f11499o00oOooO = z;
            this.f11496o00oOo0O = i;
            this.f11495o00oOo00 = o00oOOo0(str2);
            this.f11497o00oOo0o = str3;
            this.f11498o00oOoO0 = i2;
        }

        @o00oOOo0.o00oOOoO
        public static int o00oOOo0(@o0OO00OO String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            o00oOOo0 o00oooo02 = (o00oOOo0) obj;
            if (this.f11496o00oOo0O == o00oooo02.f11496o00oOo0O && this.f11493o00oOOo0.equals(o00oooo02.f11493o00oOOo0) && this.f11499o00oOooO == o00oooo02.f11499o00oOooO) {
                if (this.f11498o00oOoO0 != 1 || o00oooo02.f11498o00oOoO0 != 2 || (str3 = this.f11497o00oOo0o) == null || str3.equals(o00oooo02.f11497o00oOo0o)) {
                    if (this.f11498o00oOoO0 != 2 || o00oooo02.f11498o00oOoO0 != 1 || (str2 = o00oooo02.f11497o00oOo0o) == null || str2.equals(this.f11497o00oOo0o)) {
                        int i = this.f11498o00oOoO0;
                        return (i == 0 || i != o00oooo02.f11498o00oOoO0 || ((str = this.f11497o00oOo0o) == null ? o00oooo02.f11497o00oOo0o == null : str.equals(o00oooo02.f11497o00oOo0o))) && this.f11495o00oOo00 == o00oooo02.f11495o00oOo00;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f11493o00oOOo0.hashCode() * 31) + this.f11495o00oOo00) * 31) + (this.f11499o00oOooO ? 1231 : 1237)) * 31) + this.f11496o00oOo0O;
        }

        public boolean o00oOOoO() {
            return this.f11496o00oOo0O > 0;
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Column{name='");
            o00oOOo02.append(this.f11493o00oOOo0);
            o00oOOo02.append('\'');
            o00oOOo02.append(", type='");
            o00oOOo02.append(this.f11494o00oOOoO);
            o00oOOo02.append('\'');
            o00oOOo02.append(", affinity='");
            o00oOOo02.append(this.f11495o00oOo00);
            o00oOOo02.append('\'');
            o00oOOo02.append(", notNull=");
            o00oOOo02.append(this.f11499o00oOooO);
            o00oOOo02.append(", primaryKeyPosition=");
            o00oOOo02.append(this.f11496o00oOo0O);
            o00oOOo02.append(", defaultValue='");
            o00oOOo02.append(this.f11497o00oOo0o);
            o00oOOo02.append('\'');
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f11500o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f11501o00oOOoO;
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final String f11502o00oOo00;
        @oo0oO0

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final List<String> f11503o00oOo0O;
        @oo0oO0

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final List<String> f11504o00oOooO;

        public o00oOOoO(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, @oo0oO0 List<String> list, @oo0oO0 List<String> list2) {
            this.f11500o00oOOo0 = str;
            this.f11501o00oOOoO = str2;
            this.f11502o00oOo00 = str3;
            this.f11504o00oOooO = Collections.unmodifiableList(list);
            this.f11503o00oOo0O = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            o00oOOoO o00ooooo2 = (o00oOOoO) obj;
            if (this.f11500o00oOOo0.equals(o00ooooo2.f11500o00oOOo0) && this.f11501o00oOOoO.equals(o00ooooo2.f11501o00oOOoO) && this.f11502o00oOo00.equals(o00ooooo2.f11502o00oOo00) && this.f11504o00oOooO.equals(o00ooooo2.f11504o00oOooO)) {
                return this.f11503o00oOo0O.equals(o00ooooo2.f11503o00oOo0O);
            }
            return false;
        }

        public int hashCode() {
            int o00oOOo02 = o00oo0O0.o00oOOo0(this.f11502o00oOo00, o00oo0O0.o00oOOo0(this.f11501o00oOOoO, this.f11500o00oOOo0.hashCode() * 31, 31), 31);
            return this.f11503o00oOo0O.hashCode() + ((this.f11504o00oOooO.hashCode() + o00oOOo02) * 31);
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ForeignKey{referenceTable='");
            o00oOOo02.append(this.f11500o00oOOo0);
            o00oOOo02.append('\'');
            o00oOOo02.append(", onDelete='");
            o00oOOo02.append(this.f11501o00oOOoO);
            o00oOOo02.append('\'');
            o00oOOo02.append(", onUpdate='");
            o00oOOo02.append(this.f11502o00oOo00);
            o00oOOo02.append('\'');
            o00oOOo02.append(", columnNames=");
            o00oOOo02.append(this.f11504o00oOooO);
            o00oOOo02.append(", referenceColumnNames=");
            o00oOOo02.append(this.f11503o00oOo0O);
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOo00 implements Comparable<o00oOo00> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final int f11505o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int f11506o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final String f11507o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final String f11508o00oo0o0;

        public o00oOo00(int i, int i2, String str, String str2) {
            this.f11506o00oo0O0 = i;
            this.f11505o00oo0O = i2;
            this.f11507o00oo0Oo = str;
            this.f11508o00oo0o0 = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: o00oOOoO */
        public int compareTo(@oo0oO0 o00oOo00 o00ooo002) {
            int i = this.f11506o00oo0O0 - o00ooo002.f11506o00oo0O0;
            return i == 0 ? this.f11505o00oo0O - o00ooo002.f11505o00oo0O : i;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f11509o00oOooO = "index_";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f11510o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f11511o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final List<String> f11512o00oOo00;

        public o00oOo0O(String str, boolean z, List<String> list) {
            this.f11510o00oOOo0 = str;
            this.f11511o00oOOoO = z;
            this.f11512o00oOo00 = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            o00oOo0O o00ooo0o2 = (o00oOo0O) obj;
            if (this.f11511o00oOOoO == o00ooo0o2.f11511o00oOOoO && this.f11512o00oOo00.equals(o00ooo0o2.f11512o00oOo00)) {
                return this.f11510o00oOOo0.startsWith(f11509o00oOooO) ? o00ooo0o2.f11510o00oOOo0.startsWith(f11509o00oOooO) : this.f11510o00oOOo0.equals(o00ooo0o2.f11510o00oOOo0);
            }
            return false;
        }

        public int hashCode() {
            return this.f11512o00oOo00.hashCode() + ((((this.f11510o00oOOo0.startsWith(f11509o00oOooO) ? -1184239155 : this.f11510o00oOOo0.hashCode()) * 31) + (this.f11511o00oOOoO ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Index{name='");
            o00oOOo02.append(this.f11510o00oOOo0);
            o00oOOo02.append('\'');
            o00oOOo02.append(", unique=");
            o00oOOo02.append(this.f11511o00oOOoO);
            o00oOOo02.append(", columns=");
            o00oOOo02.append(this.f11512o00oOo00);
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    public o00oo0OO(String str, Map<String, o00oOOo0> map, Set<o00oOOoO> set) {
        this(str, map, set, Collections.emptySet());
    }

    public o00oo0OO(String str, Map<String, o00oOOo0> map, Set<o00oOOoO> set, Set<o00oOo0O> set2) {
        this.f11489o00oOOo0 = str;
        this.f11490o00oOOoO = Collections.unmodifiableMap(map);
        this.f11491o00oOo00 = Collections.unmodifiableSet(set);
        this.f11492o00oOooO = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static o00oo0OO o00oOOo0(o00oo o00ooVar, String str) {
        return new o00oo0OO(str, o00oOOoO(o00ooVar, str), o00oOooO(o00ooVar, str), o00oOo0o(o00ooVar, str));
    }

    public static Map<String, o00oOOo0> o00oOOoO(o00oo o00ooVar, String str) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (o0O0Oo0o2.getColumnCount() > 0) {
                int columnIndex = o0O0Oo0o2.getColumnIndex("name");
                int columnIndex2 = o0O0Oo0o2.getColumnIndex("type");
                int columnIndex3 = o0O0Oo0o2.getColumnIndex("notnull");
                int columnIndex4 = o0O0Oo0o2.getColumnIndex("pk");
                int columnIndex5 = o0O0Oo0o2.getColumnIndex("dflt_value");
                while (o0O0Oo0o2.moveToNext()) {
                    String string = o0O0Oo0o2.getString(columnIndex);
                    hashMap.put(string, new o00oOOo0(string, o0O0Oo0o2.getString(columnIndex2), o0O0Oo0o2.getInt(columnIndex3) != 0, o0O0Oo0o2.getInt(columnIndex4), o0O0Oo0o2.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public static List<o00oOo00> o00oOo00(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex(o0O0000o.o00oOo0O.f10276o00oOooO);
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new o00oOo00(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @o0OO00OO
    public static o00oOo0O o00oOo0O(o00oo o00ooVar, String str, boolean z) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = o0O0Oo0o2.getColumnIndex("seqno");
            int columnIndex2 = o0O0Oo0o2.getColumnIndex("cid");
            int columnIndex3 = o0O0Oo0o2.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (o0O0Oo0o2.moveToNext()) {
                    if (o0O0Oo0o2.getInt(columnIndex2) >= 0) {
                        int i = o0O0Oo0o2.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), o0O0Oo0o2.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new o00oOo0O(str, z, arrayList);
            }
            return null;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    @o0OO00OO
    public static Set<o00oOo0O> o00oOo0o(o00oo o00ooVar, String str) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = o0O0Oo0o2.getColumnIndex("name");
            int columnIndex2 = o0O0Oo0o2.getColumnIndex("origin");
            int columnIndex3 = o0O0Oo0o2.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (o0O0Oo0o2.moveToNext()) {
                    if (CueDecoder.BUNDLED_CUES.equals(o0O0Oo0o2.getString(columnIndex2))) {
                        String string = o0O0Oo0o2.getString(columnIndex);
                        boolean z = true;
                        if (o0O0Oo0o2.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        o00oOo0O o00oOo0O2 = o00oOo0O(o00ooVar, string, z);
                        if (o00oOo0O2 == null) {
                            return null;
                        }
                        hashSet.add(o00oOo0O2);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public static Set<o00oOOoO> o00oOooO(o00oo o00ooVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = o0O0Oo0o2.getColumnIndex("id");
            int columnIndex2 = o0O0Oo0o2.getColumnIndex("seq");
            int columnIndex3 = o0O0Oo0o2.getColumnIndex("table");
            int columnIndex4 = o0O0Oo0o2.getColumnIndex("on_delete");
            int columnIndex5 = o0O0Oo0o2.getColumnIndex("on_update");
            List<o00oOo00> o00oOo002 = o00oOo00(o0O0Oo0o2);
            int count = o0O0Oo0o2.getCount();
            for (int i = 0; i < count; i++) {
                o0O0Oo0o2.moveToPosition(i);
                if (o0O0Oo0o2.getInt(columnIndex2) == 0) {
                    int i2 = o0O0Oo0o2.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (o00oOo00 o00ooo002 : o00oOo002) {
                        if (o00ooo002.f11506o00oo0O0 == i2) {
                            arrayList.add(o00ooo002.f11507o00oo0Oo);
                            arrayList2.add(o00ooo002.f11508o00oo0o0);
                        }
                    }
                    hashSet.add(new o00oOOoO(o0O0Oo0o2.getString(columnIndex3), o0O0Oo0o2.getString(columnIndex4), o0O0Oo0o2.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public boolean equals(Object obj) {
        Set<o00oOo0O> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o00oo0OO o00oo0oo = (o00oo0OO) obj;
        String str = this.f11489o00oOOo0;
        if (str == null ? o00oo0oo.f11489o00oOOo0 == null : str.equals(o00oo0oo.f11489o00oOOo0)) {
            Map<String, o00oOOo0> map = this.f11490o00oOOoO;
            if (map == null ? o00oo0oo.f11490o00oOOoO == null : map.equals(o00oo0oo.f11490o00oOOoO)) {
                Set<o00oOOoO> set2 = this.f11491o00oOo00;
                if (set2 == null ? o00oo0oo.f11491o00oOo00 == null : set2.equals(o00oo0oo.f11491o00oOo00)) {
                    Set<o00oOo0O> set3 = this.f11492o00oOooO;
                    if (set3 == null || (set = o00oo0oo.f11492o00oOooO) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11489o00oOOo0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, o00oOOo0> map = this.f11490o00oOOoO;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<o00oOOoO> set = this.f11491o00oOo00;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("TableInfo{name='");
        o00oOOo02.append(this.f11489o00oOOo0);
        o00oOOo02.append('\'');
        o00oOOo02.append(", columns=");
        o00oOOo02.append(this.f11490o00oOOoO);
        o00oOOo02.append(", foreignKeys=");
        o00oOOo02.append(this.f11491o00oOo00);
        o00oOOo02.append(", indices=");
        o00oOOo02.append(this.f11492o00oOooO);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
