package o0Oo0Oo0;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o00oOoOo.o00oo;
import o0O0OOOo.o00oo0O0;
import o0Oo0Oo.oO0000O;
import o0Oo0o00.o00oo0OO;
/* loaded from: classes3.dex */
public final class o0O0OO0 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Pattern f15842o00oOoOo = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final Pattern f15843o00oOoo0 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Pattern f15844o00oOooo = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final Pattern f15845o00oo00O = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f15846o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f15847o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final long f15848o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final String f15849o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f15850o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final boolean f15851o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final boolean f15852o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final boolean f15853o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final String f15854o00oOooO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public String f15855o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f15856o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public long f15857o00oOo00 = o00oo0OO.f16347o00oOOo0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public String f15858o00oOo0O = "/";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f15859o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f15860o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f15861o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f15862o00oOoOO;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public String f15863o00oOooO;

        public o0O0OO0 o00oOOo0() {
            return new o0O0OO0(this);
        }

        public o00oOOo0 o00oOOoO(String str) {
            return o00oOo00(str, false);
        }

        public final o00oOOo0 o00oOo00(String str, boolean z) {
            if (str != null) {
                String o00oOoo02 = oO0000O.o00oOoo0(str);
                if (o00oOoo02 != null) {
                    this.f15863o00oOooO = o00oOoo02;
                    this.f15862o00oOoOO = z;
                    return this;
                }
                throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected domain: ", str));
            }
            throw new NullPointerException("domain == null");
        }

        public o00oOOo0 o00oOo0O(String str) {
            return o00oOo00(str, true);
        }

        public o00oOOo0 o00oOo0o() {
            this.f15861o00oOoO0 = true;
            return this;
        }

        public o00oOOo0 o00oOoO(String str) {
            if (str.startsWith("/")) {
                this.f15858o00oOo0O = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public o00oOOo0 o00oOoO0(String str) {
            if (str != null) {
                if (str.trim().equals(str)) {
                    this.f15855o00oOOo0 = str;
                    return this;
                }
                throw new IllegalArgumentException("name is not trimmed");
            }
            throw new NullPointerException("name == null");
        }

        public o00oOOo0 o00oOoOO() {
            this.f15859o00oOo0o = true;
            return this;
        }

        public o00oOOo0 o00oOoOo(String str) {
            if (str != null) {
                if (str.trim().equals(str)) {
                    this.f15856o00oOOoO = str;
                    return this;
                }
                throw new IllegalArgumentException("value is not trimmed");
            }
            throw new NullPointerException("value == null");
        }

        public o00oOOo0 o00oOooO(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > o00oo0OO.f16347o00oOOo0) {
                j = 253402300799999L;
            }
            this.f15857o00oOo00 = j;
            this.f15860o00oOoO = true;
            return this;
        }
    }

    public o0O0OO0(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15846o00oOOo0 = str;
        this.f15847o00oOOoO = str2;
        this.f15848o00oOo00 = j;
        this.f15854o00oOooO = str3;
        this.f15849o00oOo0O = str4;
        this.f15850o00oOo0o = z;
        this.f15852o00oOoO0 = z2;
        this.f15853o00oOoOO = z3;
        this.f15851o00oOoO = z4;
    }

    public o0O0OO0(o00oOOo0 o00oooo02) {
        String str = o00oooo02.f15855o00oOOo0;
        if (str == null) {
            throw new NullPointerException("builder.name == null");
        }
        String str2 = o00oooo02.f15856o00oOOoO;
        if (str2 == null) {
            throw new NullPointerException("builder.value == null");
        }
        String str3 = o00oooo02.f15863o00oOooO;
        if (str3 == null) {
            throw new NullPointerException("builder.domain == null");
        }
        this.f15846o00oOOo0 = str;
        this.f15847o00oOOoO = str2;
        this.f15848o00oOo00 = o00oooo02.f15857o00oOo00;
        this.f15854o00oOooO = str3;
        this.f15849o00oOo0O = o00oooo02.f15858o00oOo0O;
        this.f15850o00oOo0o = o00oooo02.f15859o00oOo0o;
        this.f15852o00oOoO0 = o00oooo02.f15861o00oOoO0;
        this.f15851o00oOoO = o00oooo02.f15860o00oOoO;
        this.f15853o00oOoOO = o00oooo02.f15862o00oOoOO;
    }

    public static int o00oOOo0(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean o00oOo00(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !oO0000O.o00ooO(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o0Oo0Oo0.o0O0OO0 o00oOoOO(long r23, o0Oo0Oo0.o0O0o00O r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0Oo0.o0O0OO0.o00oOoOO(long, o0Oo0Oo0.o0O0o00O, java.lang.String):o0Oo0Oo0.o0O0OO0");
    }

    @Nullable
    public static o0O0OO0 o00oOoOo(o0O0o00O o0o0o00o, String str) {
        return o00oOoOO(System.currentTimeMillis(), o0o0o00o, str);
    }

    public static List<o0O0OO0> o00oOoo0(o0O0o00O o0o0o00o, o0O0o00 o0o0o00) {
        List<String> o00oOooo2 = o0o0o00.o00oOooo(HttpHeaders.SET_COOKIE);
        int size = o00oOooo2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            o0O0OO0 o00oOoOo2 = o00oOoOo(o0o0o00o, o00oOooo2.get(i));
            if (o00oOoOo2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o00oOoOo2);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public static String o00oOooo(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String o00oOoo02 = oO0000O.o00oOoo0(str);
        if (o00oOoo02 != null) {
            return o00oOoo02;
        }
        throw new IllegalArgumentException();
    }

    public static long o00oo0(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    public static long o00oo00O(String str, int i, int i2) {
        int o00oOOo02 = o00oOOo0(str, i, i2, false);
        Matcher matcher = f15845o00oo00O.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (o00oOOo02 < i2) {
            int o00oOOo03 = o00oOOo0(str, o00oOOo02 + 1, i2, true);
            matcher.region(o00oOOo02, o00oOOo03);
            if (i4 == -1 && matcher.usePattern(f15845o00oo00O).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f15844o00oOooo).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern = f15843o00oOoo0;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f15842o00oOoOo).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            o00oOOo02 = o00oOOo0(str, o00oOOo03 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (i5 < 1 || i5 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i4 < 0 || i4 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i7 < 0 || i7 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i8 < 0 || i8 > 59) {
                    throw new IllegalArgumentException();
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(oO0000O.f15766o00oo0OO);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i3);
                gregorianCalendar.set(2, i6 - 1);
                gregorianCalendar.set(5, i5);
                gregorianCalendar.set(11, i4);
                gregorianCalendar.set(12, i7);
                gregorianCalendar.set(13, i8);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static boolean o00oo0O0(o0O0o00O o0o0o00o, String str) {
        String o00oOoO2 = o0o0o00o.o00oOoO();
        if (o00oOoO2.equals(str)) {
            return true;
        }
        if (o00oOoO2.startsWith(str)) {
            return str.endsWith("/") || o00oOoO2.charAt(str.length()) == '/';
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0OO0) {
            o0O0OO0 o0o0oo0 = (o0O0OO0) obj;
            return o0o0oo0.f15846o00oOOo0.equals(this.f15846o00oOOo0) && o0o0oo0.f15847o00oOOoO.equals(this.f15847o00oOOoO) && o0o0oo0.f15854o00oOooO.equals(this.f15854o00oOooO) && o0o0oo0.f15849o00oOo0O.equals(this.f15849o00oOo0O) && o0o0oo0.f15848o00oOo00 == this.f15848o00oOo00 && o0o0oo0.f15850o00oOo0o == this.f15850o00oOo0o && o0o0oo0.f15852o00oOoO0 == this.f15852o00oOoO0 && o0o0oo0.f15851o00oOoO == this.f15851o00oOoO && o0o0oo0.f15853o00oOoOO == this.f15853o00oOoOO;
        }
        return false;
    }

    public int hashCode() {
        int o00oOOo02 = o00oo0O0.o00oOOo0(this.f15849o00oOo0O, o00oo0O0.o00oOOo0(this.f15854o00oOooO, o00oo0O0.o00oOOo0(this.f15847o00oOOoO, o00oo0O0.o00oOOo0(this.f15846o00oOOo0, 527, 31), 31), 31), 31);
        long j = this.f15848o00oOo00;
        return ((((((((o00oOOo02 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f15850o00oOo0o ? 1 : 0)) * 31) + (!this.f15852o00oOoO0 ? 1 : 0)) * 31) + (!this.f15851o00oOoO ? 1 : 0)) * 31) + (!this.f15853o00oOoOO ? 1 : 0);
    }

    public String o00oOOoO() {
        return this.f15854o00oOooO;
    }

    public boolean o00oOo0O() {
        return this.f15853o00oOoOO;
    }

    public boolean o00oOo0o() {
        return this.f15852o00oOoO0;
    }

    public String o00oOoO() {
        return this.f15846o00oOOo0;
    }

    public boolean o00oOoO0(o0O0o00O o0o0o00o) {
        if ((this.f15853o00oOoOO ? o0o0o00o.f15897o00oOooO.equals(this.f15854o00oOooO) : o00oOo00(o0o0o00o.f15897o00oOooO, this.f15854o00oOooO)) && o00oo0O0(o0o0o00o, this.f15849o00oOo0O)) {
            return !this.f15850o00oOo0o || o0o0o00o.o00oo0O();
        }
        return false;
    }

    public long o00oOooO() {
        return this.f15848o00oOo00;
    }

    public boolean o00oo0O() {
        return this.f15851o00oOoO;
    }

    public String o00oo0OO() {
        return this.f15849o00oOo0O;
    }

    public boolean o00oo0Oo() {
        return this.f15850o00oOo0o;
    }

    public String o00oo0o() {
        return this.f15847o00oOOoO;
    }

    public String o00oo0o0(boolean z) {
        String o00oOOo02;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15846o00oOOo0);
        sb.append('=');
        sb.append(this.f15847o00oOOoO);
        if (this.f15851o00oOoO) {
            if (this.f15848o00oOo00 == Long.MIN_VALUE) {
                o00oOOo02 = "; max-age=0";
            } else {
                sb.append("; expires=");
                o00oOOo02 = o00oo0OO.o00oOOo0(new Date(this.f15848o00oOo00));
            }
            sb.append(o00oOOo02);
        }
        if (!this.f15853o00oOoOO) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f15854o00oOooO);
        }
        sb.append("; path=");
        sb.append(this.f15849o00oOo0O);
        if (this.f15850o00oOo0o) {
            sb.append("; secure");
        }
        if (this.f15852o00oOoO0) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String toString() {
        return o00oo0o0(false);
    }
}
