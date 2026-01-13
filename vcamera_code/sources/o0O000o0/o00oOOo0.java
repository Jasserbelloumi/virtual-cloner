package o0O000o0;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10386o00oOOo0 = 4;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10387o00oOOoO = 14;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10388o00oOo00 = 5;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10389o00oOo0O = 5;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f10391o00oOoO = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f10392o00oOoO0 = "\n\u000b\f\r\u0085\u2028\u2029";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f10393o00oOoOO = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f10394o00oOoOo = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f10395o00oOoo0 = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10396o00oOooO = 25;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f10398o00oo0 = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f10399o00oo00O = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f10401o00oo0O0 = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f10402o00oo0OO = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final C0130o00oOOo0[] f10390o00oOo0o = {new C0130o00oOOo0(99, 99, -1, -1), new C0130o00oOOo0(35, 36, -1, -1), new C0130o00oOOo0(71, 72, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(85, 86, -1, -1), new C0130o00oOOo0(90, 96, -1, -1), new C0130o00oOOo0(80, 81, -1, -1), new C0130o00oOOo0(6, 6, -1, -1), new C0130o00oOOo0(20, 20, -1, -1), new C0130o00oOOo0(19, 19, -1, -1), new C0130o00oOOo0(32, 34, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(30, 31, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(50, 52, -1, -1), new C0130o00oOOo0(83, 83, -1, -1), new C0130o00oOOo0(60, 62, -1, -1), new C0130o00oOOo0(46, 47, -1, -1), new C0130o00oOOo0(66, 67, 73, -1), new C0130o00oOOo0(40, 42, -1, -1), new C0130o00oOOo0(70, 71, -1, -1), new C0130o00oOOo0(1, 2, -1, -1), new C0130o00oOOo0(20, 21, -1, -1), new C0130o00oOOo0(3, 4, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(48, 49, -1, -1), new C0130o00oOOo0(55, 56, -1, -1), new C0130o00oOOo0(63, 65, -1, -1), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(38, 39, -1, -1), new C0130o00oOOo0(55, 56, -1, -1), new C0130o00oOOo0(27, 28, -1, -1), new C0130o00oOOo0(58, 58, -1, -1), new C0130o00oOOo0(68, 69, -1, -1), new C0130o00oOOo0(3, 4, -1, -1), new C0130o00oOOo0(7, 8, -1, -1), new C0130o00oOOo0(87, 88, 86, -1), new C0130o00oOOo0(88, 89, 96, -1), new C0130o00oOOo0(10, 14, 0, 6), new C0130o00oOOo0(43, 45, -1, -1), new C0130o00oOOo0(73, 74, -1, -1), new C0130o00oOOo0(97, 97, -1, -1), new C0130o00oOOo0(15, 19, -1, -1), new C0130o00oOOo0(6, 6, 0, 9), new C0130o00oOOo0(96, 96, -1, -1), new C0130o00oOOo0(2, 2, -1, -1), new C0130o00oOOo0(29, 29, -1, -1), new C0130o00oOOo0(57, 57, -1, -1), new C0130o00oOOo0(37, 38, -1, -1), new C0130o00oOOo0(75, 79, 87, 88), new C0130o00oOOo0(84, 84, -1, -1), new C0130o00oOOo0(22, 24, 20, -1), new C0130o00oOOo0(6, 9, -1, -1), new C0130o00oOOo0(5, 5, -1, -1), new C0130o00oOOo0(98, 99, -1, -1), new C0130o00oOOo0(53, 54, -1, -1), new C0130o00oOOo0(24, 26, -1, -1), new C0130o00oOOo0(82, 83, -1, -1)};

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Pattern f10397o00oOooo = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final Pattern f10400o00oo0O = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final Pattern f10403o00oo0Oo = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final Pattern f10405o00oo0o0 = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final Pattern f10404o00oo0o = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final Pattern f10406o00oo0oO = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: o0O000o0.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f10407o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f10408o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f10409o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f10410o00oOooO;

        public C0130o00oOOo0(int i, int i2, int i3, int i4) {
            this.f10407o00oOOo0 = i;
            this.f10408o00oOOoO = i2;
            this.f10409o00oOo00 = i3;
            this.f10410o00oOooO = i4;
        }

        public boolean o00oOOo0(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            return (this.f10407o00oOOo0 <= parseInt && parseInt <= this.f10408o00oOOoO) || parseInt == this.f10409o00oOo00 || parseInt == this.f10410o00oOooO;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        return -r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o00oOOo0(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            int r14 = r14.end()
            java.util.regex.Pattern r0 = o0O000o0.o00oOOo0.f10397o00oOooo
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            r9 = r1
            r10 = r9
            r8 = r2
            r5 = r3
            r6 = r5
            r7 = r6
        L15:
            int r11 = r13.length()
            if (r14 >= r11) goto Ld5
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L27
            int r13 = r13.length()
        L25:
            int r13 = -r13
            return r13
        L27:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L39
            int r13 = r0.end()
            goto L25
        L39:
            int r11 = r0.start()
            if (r14 >= r11) goto L51
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r\u0085\u2028\u2029"
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L4f
            int r5 = r5 + 1
        L4f:
            r14 = r11
            goto L39
        L51:
            r11 = 5
            if (r5 <= r11) goto L56
            goto Ld5
        L56:
            int r6 = r6 + r3
            r12 = 14
            if (r6 <= r12) goto L5d
            goto Ld5
        L5d:
            java.util.regex.MatchResult r12 = o00oOoO(r13, r14)
            if (r12 == 0) goto L6d
            if (r7 == 0) goto L69
            if (r5 <= r3) goto L69
            int r13 = -r14
            return r13
        L69:
            if (r9 != r1) goto Lcb
            r9 = r14
            goto Lcb
        L6d:
            java.lang.String r7 = r0.group(r2)
            boolean r7 = o00oOooO(r7)
            if (r7 == 0) goto L7a
            r7 = r2
            r8 = r3
            goto Lcb
        L7a:
            if (r6 != r11) goto L83
            if (r8 != 0) goto L83
            int r14 = r0.end()
            goto Ld5
        L83:
            if (r8 == 0) goto Lca
            r7 = 4
            if (r6 <= r7) goto Lca
            java.util.regex.MatchResult r14 = o00oOoOO(r13, r14)
            if (r14 == 0) goto Lca
            java.lang.String r7 = "et"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            java.lang.String r4 = r14.group(r2)
            java.lang.String r7 = "al"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            int r14 = r14.end()
            goto Ld5
        La7:
            java.util.regex.Pattern r4 = o0O000o0.o00oOOo0.f10397o00oOooo
            java.util.regex.Matcher r4 = r4.matcher(r13)
            int r7 = r14.end()
            boolean r7 = r4.find(r7)
            if (r7 == 0) goto Lc6
            java.lang.String r7 = r4.group(r2)
            boolean r14 = o00oOoO0(r7, r14)
            if (r14 == 0) goto Lca
            int r13 = r4.end()
            return r13
        Lc6:
            int r10 = r14.end()
        Lca:
            r7 = r2
        Lcb:
            java.lang.String r4 = r0.group(r2)
            int r14 = r0.end()
            goto L15
        Ld5:
            if (r10 <= 0) goto Ld8
            return r10
        Ld8:
            if (r9 <= 0) goto Ldb
            goto Ldc
        Ldb:
            r9 = r14
        Ldc:
            int r13 = -r9
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O000o0.o00oOOo0.o00oOOo0(java.lang.String, java.util.regex.MatchResult):int");
    }

    public static boolean o00oOOoO(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f10404o00oo0o.matcher(str);
        if (matcher.find()) {
            int parseInt = Integer.parseInt(matcher.group(1));
            if (parseInt == 0) {
                return false;
            }
            String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
            int i3 = parseInt % 10;
            if (i3 == 1) {
                return lowerCase.equals(parseInt % 100 != 11 ? "st" : "th");
            } else if (i3 == 2) {
                return lowerCase.equals(parseInt % 100 != 12 ? "nd" : "th");
            } else if (i3 != 3) {
                return lowerCase.equals("th");
            } else {
                return lowerCase.equals(parseInt % 100 != 13 ? "rd" : "th");
            }
        }
        return true;
    }

    public static String o00oOo00(String str) {
        Matcher matcher = f10400o00oo0O.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            if (o00oOOoO(matcher.group(0))) {
                int start = matcher.start();
                int o00oOOo02 = o00oOOo0(str, matcher);
                if (o00oOOo02 > 0) {
                    return str.substring(start, o00oOOo02);
                }
                i = -o00oOOo02;
            } else {
                i = matcher.end();
            }
        }
        return null;
    }

    @o0o0000
    public static boolean o00oOo0O(String str) {
        return f10406o00oo0oO.matcher(str).matches();
    }

    @o0o0000
    public static boolean o00oOo0o(String str, String str2) {
        return o00oOoO0(str, o00oOoOO(str2, 0));
    }

    @o0o0000
    public static MatchResult o00oOoO(String str, int i) {
        if (i <= 0 || f10402o00oo0OO.indexOf(str.charAt(i - 1)) != -1) {
            Matcher region = f10400o00oo0O.matcher(str).region(i, str.length());
            if (region.lookingAt()) {
                MatchResult matchResult = region.toMatchResult();
                if (o00oOOoO(matchResult.group(0))) {
                    return matchResult;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean o00oOoO0(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i;
                break;
            }
            groupCount = i;
        }
        return f10406o00oo0oO.matcher(str).matches() && f10390o00oOo0o[groupCount].o00oOOo0(str);
    }

    @o0o0000
    public static MatchResult o00oOoOO(String str, int i) {
        if (i <= 0 || f10394o00oOoOo.indexOf(str.charAt(i - 1)) != -1) {
            Matcher region = f10403o00oo0Oo.matcher(str).region(i, str.length());
            if (region.lookingAt()) {
                return region.toMatchResult();
            }
            return null;
        }
        return null;
    }

    @o0o0000
    public static boolean o00oOooO(String str) {
        return f10405o00oo0o0.matcher(str).matches();
    }
}
