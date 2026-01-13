package o0Oo0Oo0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.material.badge.BadgeDrawable;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import o00oOoOo.o00oo;
import o0OOOoo0.oOo0oooO;
import o0Oo.o00ooO;
import o0Oo0Oo.oO0000O;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public final class o0O0o00O {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final char[] f15878o00oOoOo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f15879o00oOoo0 = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f15880o00oOooo = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f15881o00oo0 = "[]";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f15882o00oo00O = " \"<>^`{}|/\\?#";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f15883o00oo0O = "\\^`{|}";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f15884o00oo0O0 = " \"'<>#&=";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f15885o00oo0OO = " \"'<>#";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f15886o00oo0Oo = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f15887o00oo0o = " \"#<>\\^`{|}";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f15888o00oo0o0 = "";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f15889o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f15890o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f15891o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f15892o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final List<String> f15893o00oOo0o;
    @Nullable

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final String f15894o00oOoO;
    @Nullable

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final List<String> f15895o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final String f15896o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final String f15897o00oOooO;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f15898o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.o00oOOo0.values().length];
            f15898o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.o00oOOo0.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15898o00oOOo0[o00oOOoO.o00oOOo0.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15898o00oOOo0[o00oOOoO.o00oOOo0.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15898o00oOOo0[o00oOOoO.o00oOOo0.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15898o00oOOo0[o00oOOoO.o00oOOo0.INVALID_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public String f15899o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f15900o00oOOoO = "";

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String f15901o00oOo00 = "";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f15902o00oOo0O = -1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final List<String> f15903o00oOo0o;
        @Nullable

        /* renamed from: o00oOoO  reason: collision with root package name */
        public String f15904o00oOoO;
        @Nullable

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public List<String> f15905o00oOoO0;
        @Nullable

        /* renamed from: o00oOooO  reason: collision with root package name */
        public String f15906o00oOooO;

        /* loaded from: classes3.dex */
        public enum o00oOOo0 {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public o00oOOoO() {
            ArrayList arrayList = new ArrayList();
            this.f15903o00oOo0o = arrayList;
            arrayList.add("");
        }

        public static String o00oOoOO(String str, int i, int i2) {
            String o00ooO0O2 = o0O0o00O.o00ooO0O(str, i, i2, false);
            if (o00ooO0O2.contains(":")) {
                InetAddress o00oOoo02 = (o00ooO0O2.startsWith("[") && o00ooO0O2.endsWith("]")) ? o00oOoo0(o00ooO0O2, 1, o00ooO0O2.length() - 1) : o00oOoo0(o00ooO0O2, 0, o00ooO0O2.length());
                if (o00oOoo02 == null) {
                    return null;
                }
                byte[] address = o00oOoo02.getAddress();
                if (address.length == 16) {
                    return o00oo0o(address);
                }
                throw new AssertionError();
            }
            return oO0000O.o00oOoo0(o00ooO0O2);
        }

        public static boolean o00oOoOo(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        @javax.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.net.InetAddress o00oOoo0(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r5 = r2
                r6 = r5
                r4 = r3
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L27
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = o00oOoOo(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r8 = r3
                r12 = r6
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = o0Oo0Oo0.o0O0o00O.o00oOooO(r9)
                if (r9 != r2) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo0Oo0.o0O0o00O.o00oOOoO.o00oOoo0(java.lang.String, int, int):java.net.InetAddress");
        }

        public static String o00oo0o(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4 && i6 >= 4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            o00ooO o00ooo = new o00ooO();
            while (i < bArr.length) {
                if (i == i2) {
                    o00ooo.writeByte(58);
                    i += i4;
                    if (i == 16) {
                        o00ooo.writeByte(58);
                    }
                } else {
                    if (i > 0) {
                        o00ooo.writeByte(58);
                    }
                    o00ooo.o0O0Ooo0(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return o00ooo.o0O0o0o0();
        }

        public static int o00ooO(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        public static int o00ooO00(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(o0O0o00O.o00oOOo0(str, i, i2, "", false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        public static int o00ooo0O(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public static int o00oooo0(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public o00oOOoO o00oOOo0(String str) {
            if (str != null) {
                o00ooOO0(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public o00oOOoO o00oOOoO(String str) {
            if (str != null) {
                return o00oOo0o(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public o00oOOoO o00oOo00(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f15905o00oOoO0 == null) {
                    this.f15905o00oOoO0 = new ArrayList();
                }
                this.f15905o00oOoO0.add(o0O0o00O.o00oOOoO(str, o0O0o00O.f15884o00oo0O0, true, false, true, true));
                this.f15905o00oOoO0.add(str2 != null ? o0O0o00O.o00oOOoO(str2, o0O0o00O.f15884o00oo0O0, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public o00oOOoO o00oOo0O(String str) {
            if (str != null) {
                return o00oOo0o(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public final o00oOOoO o00oOo0o(String str, boolean z) {
            int i = 0;
            do {
                int o00oOoOO2 = oO0000O.o00oOoOO(str, i, str.length(), "/\\");
                o00ooOO0(str, i, o00oOoOO2, o00oOoOO2 < str.length(), z);
                i = o00oOoOO2 + 1;
            } while (i <= str.length());
            return this;
        }

        public o0O0o00O o00oOoO() {
            if (this.f15899o00oOOo0 != null) {
                if (this.f15906o00oOooO != null) {
                    return new o0O0o00O(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public o00oOOoO o00oOoO0(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f15905o00oOoO0 == null) {
                    this.f15905o00oOoO0 = new ArrayList();
                }
                this.f15905o00oOoO0.add(o0O0o00O.o00oOOoO(str, o0O0o00O.f15884o00oo0O0, false, false, true, true));
                this.f15905o00oOoO0.add(str2 != null ? o0O0o00O.o00oOOoO(str2, o0O0o00O.f15884o00oo0O0, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public o00oOOoO o00oOooO(String str) {
            if (str != null) {
                o00ooOO0(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public int o00oOooo() {
            int i = this.f15902o00oOo0O;
            return i != -1 ? i : o0O0o00O.o00oOo0O(this.f15899o00oOOo0);
        }

        public o00oOOo0 o00oo(@Nullable o0O0o00O o0o0o00o, String str) {
            int o00oOoOO2;
            int i;
            int o00oo2 = oO0000O.o00oo(str, 0, str.length());
            int o00ooO002 = oO0000O.o00ooO00(str, o00oo2, str.length());
            if (o00ooo0O(str, o00oo2, o00ooO002) != -1) {
                if (str.regionMatches(true, o00oo2, "https:", 0, 6)) {
                    this.f15899o00oOOo0 = "https";
                    o00oo2 += 6;
                } else if (!str.regionMatches(true, o00oo2, "http:", 0, 5)) {
                    return o00oOOo0.UNSUPPORTED_SCHEME;
                } else {
                    this.f15899o00oOOo0 = "http";
                    o00oo2 += 5;
                }
            } else if (o0o0o00o == null) {
                return o00oOOo0.MISSING_SCHEME;
            } else {
                this.f15899o00oOOo0 = o0o0o00o.f15889o00oOOo0;
            }
            int o00oooo02 = o00oooo0(str, o00oo2, o00ooO002);
            char c = '?';
            char c2 = '#';
            if (o00oooo02 >= 2 || o0o0o00o == null || !o0o0o00o.f15889o00oOOo0.equals(this.f15899o00oOOo0)) {
                boolean z = false;
                int i2 = o00oo2 + o00oooo02;
                boolean z2 = false;
                while (true) {
                    o00oOoOO2 = oO0000O.o00oOoOO(str, i2, o00ooO002, "@/\\?#");
                    char charAt = o00oOoOO2 != o00ooO002 ? str.charAt(o00oOoOO2) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z2) {
                            i = o00oOoOO2;
                            this.f15901o00oOo00 += "%40" + o0O0o00O.o00oOOo0(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        } else {
                            int o00oOoO2 = oO0000O.o00oOoO(str, i2, o00oOoOO2, ':');
                            i = o00oOoOO2;
                            String o00oOOo02 = o0O0o00O.o00oOOo0(str, i2, o00oOoO2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            if (z) {
                                o00oOOo02 = this.f15900o00oOOoO + "%40" + o00oOOo02;
                            }
                            this.f15900o00oOOoO = o00oOOo02;
                            if (o00oOoO2 != i) {
                                this.f15901o00oOo00 = o0O0o00O.o00oOOo0(str, o00oOoO2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                z2 = true;
                            }
                            z = true;
                        }
                        i2 = i + 1;
                    }
                    c = '?';
                    c2 = '#';
                }
                int o00ooO2 = o00ooO(str, i2, o00oOoOO2);
                int i3 = o00ooO2 + 1;
                this.f15906o00oOooO = o00oOoOO(str, i2, o00ooO2);
                if (i3 < o00oOoOO2) {
                    int o00ooO003 = o00ooO00(str, i3, o00oOoOO2);
                    this.f15902o00oOo0O = o00ooO003;
                    if (o00ooO003 == -1) {
                        return o00oOOo0.INVALID_PORT;
                    }
                } else {
                    this.f15902o00oOo0O = o0O0o00O.o00oOo0O(this.f15899o00oOOo0);
                }
                if (this.f15906o00oOooO == null) {
                    return o00oOOo0.INVALID_HOST;
                }
                o00oo2 = o00oOoOO2;
            } else {
                this.f15900o00oOOoO = o0o0o00o.o00oOoo0();
                this.f15901o00oOo00 = o0o0o00o.o00oOoO0();
                this.f15906o00oOooO = o0o0o00o.f15897o00oOooO;
                this.f15902o00oOo0O = o0o0o00o.f15892o00oOo0O;
                this.f15903o00oOo0o.clear();
                this.f15903o00oOo0o.addAll(o0o0o00o.o00oOoOO());
                if (o00oo2 == o00ooO002 || str.charAt(o00oo2) == '#') {
                    o00oo0O0(o0o0o00o.o00oOoOo());
                }
            }
            int o00oOoOO3 = oO0000O.o00oOoOO(str, o00oo2, o00ooO002, "?#");
            o00ooo00(str, o00oo2, o00oOoOO3);
            if (o00oOoOO3 < o00ooO002 && str.charAt(o00oOoOO3) == '?') {
                int o00oOoO3 = oO0000O.o00oOoO(str, o00oOoOO3, o00ooO002, '#');
                this.f15905o00oOoO0 = o0O0o00O.o00ooo0o(o0O0o00O.o00oOOo0(str, o00oOoOO3 + 1, o00oOoO3, o0O0o00O.f15885o00oo0OO, true, false, true, true));
                o00oOoOO3 = o00oOoO3;
            }
            if (o00oOoOO3 < o00ooO002 && str.charAt(o00oOoOO3) == '#') {
                this.f15904o00oOoO = o0O0o00O.o00oOOo0(str, 1 + o00oOoOO3, o00ooO002, "", true, false, false, false);
            }
            return o00oOOo0.SUCCESS;
        }

        public o00oOOoO o00oo0(String str) {
            if (str != null) {
                this.f15901o00oOo00 = o0O0o00O.o00oOOoO(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        public o00oOOoO o00oo00O(@Nullable String str) {
            this.f15904o00oOoO = str != null ? o0O0o00O.o00oOOoO(str, "", true, false, false, false) : null;
            return this;
        }

        public o00oOOoO o00oo0O(String str) {
            if (str != null) {
                this.f15900o00oOOoO = o0O0o00O.o00oOOoO(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        public o00oOOoO o00oo0O0(@Nullable String str) {
            this.f15905o00oOoO0 = str != null ? o0O0o00O.o00ooo0o(o0O0o00O.o00oOOoO(str, o0O0o00O.f15885o00oo0OO, true, false, true, true)) : null;
            return this;
        }

        public o00oOOoO o00oo0OO(String str) {
            if (str != null) {
                if (str.startsWith("/")) {
                    o00ooo00(str, 0, str.length());
                    return this;
                }
                throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected encodedPath: ", str));
            }
            throw new NullPointerException("encodedPath == null");
        }

        public o00oOOoO o00oo0Oo(@Nullable String str) {
            this.f15904o00oOoO = str != null ? o0O0o00O.o00oOOoO(str, "", false, false, false, false) : null;
            return this;
        }

        public o00oOOoO o00oo0o0(String str) {
            if (str != null) {
                String o00oOoOO2 = o00oOoOO(str, 0, str.length());
                if (o00oOoOO2 != null) {
                    this.f15906o00oOooO = o00oOoOO2;
                    return this;
                }
                throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected host: ", str));
            }
            throw new NullPointerException("host == null");
        }

        public final boolean o00oo0oO(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public o00oOOoO o00ooO0(String str) {
            if (str != null) {
                this.f15901o00oOo00 = o0O0o00O.o00oOOoO(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public final void o00ooO0O() {
            List<String> list = this.f15903o00oOo0o;
            if (!list.remove(list.size() - 1).isEmpty() || this.f15903o00oOo0o.isEmpty()) {
                this.f15903o00oOo0o.add("");
                return;
            }
            List<String> list2 = this.f15903o00oOo0o;
            list2.set(list2.size() - 1, "");
        }

        public o00oOOoO o00ooO0o(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("unexpected port: ", i));
            }
            this.f15902o00oOo0O = i;
            return this;
        }

        public o00oOOoO o00ooOO(@Nullable String str) {
            this.f15905o00oOoO0 = str != null ? o0O0o00O.o00ooo0o(o0O0o00O.o00oOOoO(str, o0O0o00O.f15885o00oo0OO, false, false, true, true)) : null;
            return this;
        }

        public final void o00ooOO0(String str, int i, int i2, boolean z, boolean z2) {
            String o00oOOo02 = o0O0o00O.o00oOOo0(str, i, i2, o0O0o00O.f15882o00oo00O, z2, false, false, true);
            if (o00oo0oO(o00oOOo02)) {
                return;
            }
            if (o0O0o(o00oOOo02)) {
                o00ooO0O();
                return;
            }
            List<String> list = this.f15903o00oOo0o;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f15903o00oOo0o;
                list2.set(list2.size() - 1, o00oOOo02);
            } else {
                this.f15903o00oOo0o.add(o00oOOo02);
            }
            if (z) {
                this.f15903o00oOo0o.add("");
            }
        }

        public o00oOOoO o00ooOOo() {
            int size = this.f15903o00oOo0o.size();
            for (int i = 0; i < size; i++) {
                this.f15903o00oOo0o.set(i, o0O0o00O.o00oOOoO(this.f15903o00oOo0o.get(i), o0O0o00O.f15881o00oo0, true, true, false, true));
            }
            List<String> list = this.f15905o00oOoO0;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f15905o00oOoO0.get(i2);
                    if (str != null) {
                        this.f15905o00oOoO0.set(i2, o0O0o00O.o00oOOoO(str, o0O0o00O.f15883o00oo0O, true, true, true, true));
                    }
                }
            }
            String str2 = this.f15904o00oOoO;
            if (str2 != null) {
                this.f15904o00oOoO = o0O0o00O.o00oOOoO(str2, o0O0o00O.f15887o00oo0o, true, true, false, false);
            }
            return this;
        }

        public o00oOOoO o00ooOo(String str) {
            if (str != null) {
                if (this.f15905o00oOoO0 == null) {
                    return this;
                }
                o00ooOo0(o0O0o00O.o00oOOoO(str, o0O0o00O.f15884o00oo0O0, true, false, true, true));
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public final void o00ooOo0(String str) {
            for (int size = this.f15905o00oOoO0.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f15905o00oOoO0.get(size))) {
                    this.f15905o00oOoO0.remove(size + 1);
                    this.f15905o00oOoO0.remove(size);
                    if (this.f15905o00oOoO0.isEmpty()) {
                        this.f15905o00oOoO0 = null;
                        return;
                    }
                }
            }
        }

        public o00oOOoO o00ooOoO(String str) {
            if (str != null) {
                if (this.f15905o00oOoO0 == null) {
                    return this;
                }
                o00ooOo0(o0O0o00O.o00oOOoO(str, o0O0o00O.f15884o00oo0O0, false, false, true, true));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public o00oOOoO o00ooOoo(int i) {
            this.f15903o00oOo0o.remove(i);
            if (this.f15903o00oOo0o.isEmpty()) {
                this.f15903o00oOo0o.add("");
            }
            return this;
        }

        public o00oOOoO o00ooo0(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase("http")) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase("https")) {
                        throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected scheme: ", str));
                    }
                }
                this.f15899o00oOOo0 = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o00ooo00(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f15903o00oOo0o
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f15903o00oOo0o
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f15903o00oOo0o
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = o0Oo0Oo.oO0000O.o00oOoOO(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.o00ooOO0(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo0Oo0.o0O0o00O.o00oOOoO.o00ooo00(java.lang.String, int, int):void");
        }

        public o00oOOoO o00ooo0o(int i, String str) {
            if (str != null) {
                String o00oOOo02 = o0O0o00O.o00oOOo0(str, 0, str.length(), o0O0o00O.f15882o00oo00O, true, false, false, true);
                this.f15903o00oOo0o.set(i, o00oOOo02);
                if (o00oo0oO(o00oOOo02) || o0O0o(o00oOOo02)) {
                    throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected path segment: ", str));
                }
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public o00oOOoO o00oooO(String str, @Nullable String str2) {
            o00ooOo(str);
            o00oOo00(str, str2);
            return this;
        }

        public o00oOOoO o00oooOO(int i, String str) {
            if (str != null) {
                String o00oOOo02 = o0O0o00O.o00oOOo0(str, 0, str.length(), o0O0o00O.f15882o00oo00O, false, false, false, true);
                if (o00oo0oO(o00oOOo02) || o0O0o(o00oOOo02)) {
                    throw new IllegalArgumentException(o00oo.o00oOOo0("unexpected path segment: ", str));
                }
                this.f15903o00oOo0o.set(i, o00oOOo02);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public o00oOOoO o00oooOo(String str, @Nullable String str2) {
            o00ooOoO(str);
            o00oOoO0(str, str2);
            return this;
        }

        public o00oOOoO o00oooo(String str) {
            if (str != null) {
                this.f15900o00oOOoO = o0O0o00O.o00oOOoO(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public final boolean o0O0o(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15899o00oOOo0);
            sb.append("://");
            if (!this.f15900o00oOOoO.isEmpty() || !this.f15901o00oOo00.isEmpty()) {
                sb.append(this.f15900o00oOOoO);
                if (!this.f15901o00oOo00.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f15901o00oOo00);
                }
                sb.append('@');
            }
            if (this.f15906o00oOooO.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f15906o00oOooO);
                sb.append(']');
            } else {
                sb.append(this.f15906o00oOooO);
            }
            int o00oOooo2 = o00oOooo();
            if (o00oOooo2 != o0O0o00O.o00oOo0O(this.f15899o00oOOo0)) {
                sb.append(':');
                sb.append(o00oOooo2);
            }
            o0O0o00O.o00ooO00(sb, this.f15903o00oOo0o);
            if (this.f15905o00oOoO0 != null) {
                sb.append('?');
                o0O0o00O.o00oo0Oo(sb, this.f15905o00oOoO0);
            }
            if (this.f15904o00oOoO != null) {
                sb.append('#');
                sb.append(this.f15904o00oOoO);
            }
            return sb.toString();
        }
    }

    public o0O0o00O(o00oOOoO o00ooooo2) {
        this.f15889o00oOOo0 = o00ooooo2.f15899o00oOOo0;
        this.f15890o00oOOoO = o00ooO0o(o00ooooo2.f15900o00oOOoO, false);
        this.f15891o00oOo00 = o00ooO0o(o00ooooo2.f15901o00oOo00, false);
        this.f15897o00oOooO = o00ooooo2.f15906o00oOooO;
        this.f15892o00oOo0O = o00ooooo2.o00oOooo();
        this.f15893o00oOo0o = o00ooO(o00ooooo2.f15903o00oOo0o, false);
        List<String> list = o00ooooo2.f15905o00oOoO0;
        this.f15895o00oOoO0 = list != null ? o00ooO(list, true) : null;
        String str = o00ooooo2.f15904o00oOoO;
        this.f15894o00oOoO = str != null ? o00ooO0o(str, false) : null;
        this.f15896o00oOoOO = o00ooooo2.toString();
    }

    public static String o00oOOo0(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || o00ooOO(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            o00ooO o00ooo = new o00ooO();
            o00ooo.o0O00000(str, i, i3);
            o00oOo00(o00ooo, str, i3, i2, str2, z, z2, z3, z4);
            return o00ooo.o0O0o0o0();
        }
        return str.substring(i, i2);
    }

    public static String o00oOOoO(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return o00oOOo0(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    public static void o00oOo00(o00ooO o00ooo, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        o00ooO o00ooo2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    o00ooo.o00oooo0(z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !o00ooOO(str, i, i2)))))) {
                    if (o00ooo2 == null) {
                        o00ooo2 = new o00ooO();
                    }
                    o00ooo2.o00oo0o0(codePointAt);
                    while (!o00ooo2.o0O0O0oO()) {
                        int readByte = o00ooo2.readByte() & 255;
                        o00ooo.writeByte(37);
                        char[] cArr = f15878o00oOoOo;
                        o00ooo.writeByte(cArr[(readByte >> 4) & 15]);
                        o00ooo.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    o00ooo.o00oo0o0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static int o00oOo0O(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return PsExtractor.SYSTEM_HEADER_START_CODE;
        }
        return -1;
    }

    public static int o00oOooO(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    @Nullable
    public static o0O0o00O o00oo0(URL url) {
        return o00oo0oO(url.toString());
    }

    @Nullable
    public static o0O0o00O o00oo00O(URI uri) {
        return o00oo0oO(uri.toString());
    }

    public static o0O0o00O o00oo0OO(String str) throws MalformedURLException, UnknownHostException {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        o00oOOoO.o00oOOo0 o00oo2 = o00ooooo2.o00oo(null, str);
        int i = o00oOOo0.f15898o00oOOo0[o00oo2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new MalformedURLException("Invalid URL: " + o00oo2 + " for " + str);
            }
            throw new UnknownHostException(o00oo.o00oOOo0("Invalid host: ", str));
        }
        return o00ooooo2.o00oOoO();
    }

    public static void o00oo0Oo(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(oOo0oooO.f13912o00oOooO);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public static o0O0o00O o00oo0oO(String str) {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        if (o00ooooo2.o00oo(null, str) == o00oOOoO.o00oOOo0.SUCCESS) {
            return o00ooooo2.o00oOoO();
        }
        return null;
    }

    public static void o00ooO00(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String o00ooO0O(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                o00ooO o00ooo = new o00ooO();
                o00ooo.o0O00000(str, i, i3);
                o00ooOO0(o00ooo, str, i3, i2, z);
                return o00ooo.o0O0o0o0();
            }
        }
        return str.substring(i, i2);
    }

    public static String o00ooO0o(String str, boolean z) {
        return o00ooO0O(str, 0, str.length(), z);
    }

    public static boolean o00ooOO(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && o00oOooO(str.charAt(i + 1)) != -1 && o00oOooO(str.charAt(i3)) != -1;
    }

    public static void o00ooOO0(o00ooO o00ooo, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    o00ooo.writeByte(32);
                }
                o00ooo.o00oo0o0(codePointAt);
            } else {
                int o00oOooO2 = o00oOooO(str.charAt(i + 1));
                int o00oOooO3 = o00oOooO(str.charAt(i3));
                if (o00oOooO2 != -1 && o00oOooO3 != -1) {
                    o00ooo.writeByte((o00oOooO2 << 4) + o00oOooO3);
                    i = i3;
                }
                o00ooo.o00oo0o0(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static List<String> o00ooo0o(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o0O0o00O) && ((o0O0o00O) obj).f15896o00oOoOO.equals(this.f15896o00oOoOO);
    }

    public int hashCode() {
        return this.f15896o00oOoOO.hashCode();
    }

    @Nullable
    public String o00oOo0o() {
        if (this.f15894o00oOoO == null) {
            return null;
        }
        return this.f15896o00oOoOO.substring(this.f15896o00oOoOO.indexOf(35) + 1);
    }

    public String o00oOoO() {
        int indexOf = this.f15896o00oOoOO.indexOf(47, this.f15889o00oOOo0.length() + 3);
        String str = this.f15896o00oOoOO;
        return this.f15896o00oOoOO.substring(indexOf, oO0000O.o00oOoOO(str, indexOf, str.length(), "?#"));
    }

    public String o00oOoO0() {
        if (this.f15891o00oOo00.isEmpty()) {
            return "";
        }
        int indexOf = this.f15896o00oOoOO.indexOf(64);
        return this.f15896o00oOoOO.substring(this.f15896o00oOoOO.indexOf(58, this.f15889o00oOOo0.length() + 3) + 1, indexOf);
    }

    public List<String> o00oOoOO() {
        int indexOf = this.f15896o00oOoOO.indexOf(47, this.f15889o00oOOo0.length() + 3);
        String str = this.f15896o00oOoOO;
        int o00oOoOO2 = oO0000O.o00oOoOO(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o00oOoOO2) {
            int i = indexOf + 1;
            int o00oOoO2 = oO0000O.o00oOoO(this.f15896o00oOoOO, i, o00oOoOO2, '/');
            arrayList.add(this.f15896o00oOoOO.substring(i, o00oOoO2));
            indexOf = o00oOoO2;
        }
        return arrayList;
    }

    @Nullable
    public String o00oOoOo() {
        if (this.f15895o00oOoO0 == null) {
            return null;
        }
        int indexOf = this.f15896o00oOoOO.indexOf(63) + 1;
        String str = this.f15896o00oOoOO;
        return this.f15896o00oOoOO.substring(indexOf, oO0000O.o00oOoO(str, indexOf + 1, str.length(), '#'));
    }

    public String o00oOoo0() {
        if (this.f15890o00oOOoO.isEmpty()) {
            return "";
        }
        int length = this.f15889o00oOOo0.length() + 3;
        String str = this.f15896o00oOoOO;
        return this.f15896o00oOoOO.substring(length, oO0000O.o00oOoOO(str, length, str.length(), ":@"));
    }

    @Nullable
    public String o00oOooo() {
        return this.f15894o00oOoO;
    }

    public List<String> o00oo() {
        return this.f15893o00oOo0o;
    }

    public boolean o00oo0O() {
        return this.f15889o00oOOo0.equals("https");
    }

    public String o00oo0O0() {
        return this.f15897o00oOooO;
    }

    @Nullable
    public o00oOOoO o00oo0o(String str) {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        if (o00ooooo2.o00oo(this, str) == o00oOOoO.o00oOOo0.SUCCESS) {
            return o00ooooo2;
        }
        return null;
    }

    public o00oOOoO o00oo0o0() {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        o00ooooo2.f15899o00oOOo0 = this.f15889o00oOOo0;
        o00ooooo2.f15900o00oOOoO = o00oOoo0();
        o00ooooo2.f15901o00oOo00 = o00oOoO0();
        o00ooooo2.f15906o00oOooO = this.f15897o00oOooO;
        o00ooooo2.f15902o00oOo0O = this.f15892o00oOo0O != o00oOo0O(this.f15889o00oOOo0) ? this.f15892o00oOo0O : -1;
        o00ooooo2.f15903o00oOo0o.clear();
        o00ooooo2.f15903o00oOo0o.addAll(o00oOoOO());
        o00ooooo2.o00oo0O0(o00oOoOo());
        o00ooooo2.f15904o00oOoO = o00oOo0o();
        return o00ooooo2;
    }

    public final List<String> o00ooO(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? o00ooO0o(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int o00ooO0() {
        return this.f15893o00oOo0o.size();
    }

    public int o00ooOOo() {
        return this.f15892o00oOo0O;
    }

    @Nullable
    public String o00ooOo(String str) {
        List<String> list = this.f15895o00oOoO0;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f15895o00oOoO0.get(i))) {
                return this.f15895o00oOoO0.get(i + 1);
            }
        }
        return null;
    }

    @Nullable
    public String o00ooOo0() {
        if (this.f15895o00oOoO0 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        o00oo0Oo(sb, this.f15895o00oOoO0);
        return sb.toString();
    }

    public String o00ooOoO(int i) {
        List<String> list = this.f15895o00oOoO0;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> o00ooOoo() {
        if (this.f15895o00oOoO0 == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f15895o00oOoO0.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.f15895o00oOoO0.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public List<String> o00ooo0(String str) {
        if (this.f15895o00oOoO0 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f15895o00oOoO0.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f15895o00oOoO0.get(i))) {
                arrayList.add(this.f15895o00oOoO0.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String o00ooo00(int i) {
        List<String> list = this.f15895o00oOoO0;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public int o00ooo0O() {
        List<String> list = this.f15895o00oOoO0;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String o00oooO() {
        return o00oo0o("/...").o00oooo("").o00ooO0("").o00oOoO().f15896o00oOoOO;
    }

    @Nullable
    public o0O0o00O o00oooOO(String str) {
        o00oOOoO o00oo0o2 = o00oo0o(str);
        if (o00oo0o2 != null) {
            return o00oo0o2.o00oOoO();
        }
        return null;
    }

    public String o00oooOo() {
        return this.f15889o00oOOo0;
    }

    public URI o00oooo() {
        String o00ooooo2 = o00oo0o0().o00ooOOo().toString();
        try {
            return new URI(o00ooooo2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(o00ooooo2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @Nullable
    public String o00oooo0() {
        if (oO0000O.o00ooO(this.f15897o00oOooO)) {
            return null;
        }
        return o0OO0o00.o00oOo00().o00oOooO(this.f15897o00oOooO);
    }

    public URL o00ooooO() {
        try {
            return new URL(this.f15896o00oOoOO);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String o00ooooo() {
        return this.f15890o00oOOoO;
    }

    public String o0O0o() {
        return this.f15891o00oOo00;
    }

    public String toString() {
        return this.f15896o00oOoOO;
    }
}
