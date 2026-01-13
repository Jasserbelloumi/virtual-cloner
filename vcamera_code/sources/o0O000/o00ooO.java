package o0O000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00ooO implements o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Locale[] f10112o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f10113o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Locale[] f10108o00oOo00 = new Locale[0];

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Locale f10111o00oOooO = new Locale("en", "XA");

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Locale f10109o00oOo0O = new Locale("ar", "XB");

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Locale f10110o00oOo0o = o00ooO0.o00oOOoO("en-Latn");

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static String o00oOOo0(Locale locale) {
            return locale.getScript();
        }
    }

    public o00ooO(@oo0oO0 Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f10112o00oOOo0 = f10108o00oOo00;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < localeArr.length; i++) {
                Locale locale = localeArr[i];
                if (locale == null) {
                    throw new NullPointerException(o00ooO0.o00oOoO.o00oOOo0("list[", i, "] is null"));
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    o00oOoo0(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f10112o00oOOo0 = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f10113o00oOOoO = sb;
    }

    public static String o00oOoO(Locale locale) {
        String o00oOOo02 = o00oOOo0.o00oOOo0(locale);
        return !o00oOOo02.isEmpty() ? o00oOOo02 : "";
    }

    public static boolean o00oOoOO(Locale locale) {
        return f10111o00oOooO.equals(locale) || f10109o00oOo0O.equals(locale);
    }

    @o0O0o00O(from = 0, to = 1)
    public static int o00oOoOo(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || o00oOoOO(locale) || o00oOoOO(locale2)) {
            return 0;
        }
        String o00oOoO2 = o00oOoO(locale);
        if (o00oOoO2.isEmpty()) {
            String country = locale.getCountry();
            return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
        }
        return o00oOoO2.equals(o00oOoO(locale2)) ? 1 : 0;
    }

    @o0o0000
    public static void o00oOoo0(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00ooO)) {
            return false;
        }
        Locale[] localeArr = ((o00ooO) obj).f10112o00oOOo0;
        if (this.f10112o00oOOo0.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f10112o00oOOo0;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // o0O000.o0
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f10112o00oOOo0;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f10112o00oOOo0) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // o0O000.o0
    public boolean isEmpty() {
        return this.f10112o00oOOo0.length == 0;
    }

    @Override // o0O000.o0
    public int o00oOOo0(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f10112o00oOOo0;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @Override // o0O000.o0
    public String o00oOOoO() {
        return this.f10113o00oOOoO;
    }

    @Override // o0O000.o0
    @o0OO00OO
    public Object o00oOo00() {
        return null;
    }

    public final Locale o00oOo0O(Collection<String> collection, boolean z) {
        int o00oOo0o2 = o00oOo0o(collection, z);
        if (o00oOo0o2 == -1) {
            return null;
        }
        return this.f10112o00oOOo0[o00oOo0o2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o00oOo0o(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f10112o00oOOo0
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L8
            return r2
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = o0O000.o00ooO.f10110o00oOo0o
            int r6 = r4.o00oOoO0(r6)
            if (r6 != 0) goto L1b
            return r2
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = o0O000.o00ooO0.o00oOOoO(r1)
            int r1 = r4.o00oOoO0(r1)
            if (r1 != 0) goto L3a
            return r2
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r2
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O000.o00ooO.o00oOo0o(java.util.Collection, boolean):int");
    }

    public final int o00oOoO0(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f10112o00oOOo0;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (o00oOoOo(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    @Override // o0O000.o0
    public Locale o00oOooO(@oo0oO0 String[] strArr) {
        return o00oOo0O(Arrays.asList(strArr), false);
    }

    @Override // o0O000.o0
    public int size() {
        return this.f10112o00oOOo0.length;
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f10112o00oOOo0;
            if (i >= localeArr.length) {
                o00oOOo02.append("]");
                return o00oOOo02.toString();
            }
            o00oOOo02.append(localeArr[i]);
            if (i < this.f10112o00oOOo0.length - 1) {
                o00oOOo02.append(',');
            }
            i++;
        }
    }
}
