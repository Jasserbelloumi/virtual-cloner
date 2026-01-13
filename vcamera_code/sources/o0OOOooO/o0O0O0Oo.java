package o0OOOooO;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Collection;
import java.util.Iterator;
import o0OO0o.o00oo;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0OOO00;
import o0OOOOoo.o0O00O0o;
import o0OOOo0o.o0O00O;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oO0O00o0;
import o0OOOoo0.oO0O0O0;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1484:1\n1436#1,6:1486\n1439#1,3:1492\n1436#1,6:1495\n1436#1,6:1501\n1439#1,3:1510\n1#2:1485\n1726#3,3:1507\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1360#1:1486,6\n1394#1:1492,3\n1397#1:1495,6\n1400#1:1501,6\n1436#1:1510,3\n1425#1:1507,3\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0O0Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f13950o00oOOo0 = 1000000;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final long f13951o00oOOoO = 4611686018426999999L;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final long f13952o00oOo00 = 4611686018427387903L;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final long f13953o00oOooO = 4611686018426L;

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0(double d) {
    }

    public static final long o00oOo0o(long j) {
        return j * 1000000;
    }

    public static final long o00oOoO0(long j) {
        return j / 1000000;
    }

    public static final long o00oOoOO(long j, int i) {
        return o0oO0O0o.o00oo00O((j << 1) + i);
    }

    public static final long o00oOoOo(long j) {
        return o0oO0O0o.o00oo00O((j << 1) + 1);
    }

    public static final long o00oOoo0(long j) {
        return new o0OOOo0o.o0O0OO0(-4611686018426L, f13953o00oOooO).o00oOoo0(j) ? o00oOooo(j * 1000000) : o00oOoOo(o0OOOo0o.oo0OOoo.o00ooo0(j, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long o00oOooo(long j) {
        return o0oO0O0o.o00oo00O(j << 1);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oo(double d) {
    }

    public static final long o00oo0(double d) {
        return o0O00O(d, o0O0O0o0.DAYS);
    }

    public static final long o00oo00O(long j) {
        return new o0OOOo0o.o0O0OO0(-4611686018426999999L, f13951o00oOOoO).o00oOoo0(j) ? o00oOooo(j) : o00oOoOo(j / 1000000);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oo0O(double d) {
    }

    public static final long o00oo0O0(long j) {
        return o0O00OOO(j, o0O0O0o0.DAYS);
    }

    public static final long o00oo0OO(int i) {
        return o0O00OO(i, o0O0O0o0.DAYS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oo0Oo(int i) {
    }

    public static final long o00oo0o(double d) {
        return o0O00O(d, o0O0O0o0.HOURS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oo0o0(long j) {
    }

    public static final long o00oo0oO(int i) {
        return o0O00OO(i, o0O0O0o0.HOURS);
    }

    public static final long o00ooO(long j) {
        return o0O00OOO(j, o0O0O0o0.MICROSECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooO0(long j) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooO00(int i) {
    }

    public static final long o00ooO0O(double d) {
        return o0O00O(d, o0O0O0o0.MICROSECONDS);
    }

    public static final long o00ooO0o(int i) {
        return o0O00OO(i, o0O0O0o0.MICROSECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooOO(int i) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooOO0(double d) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooOOo(long j) {
    }

    public static final long o00ooOo(int i) {
        return o0O00OO(i, o0O0O0o0.MILLISECONDS);
    }

    public static final long o00ooOo0(double d) {
        return o0O00O(d, o0O0O0o0.MILLISECONDS);
    }

    public static final long o00ooOoO(long j) {
        return o0O00OOO(j, o0O0O0o0.MILLISECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooOoo(double d) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooo0(long j) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00ooo00(int i) {
    }

    public static final long o00ooo0O(double d) {
        return o0O00O(d, o0O0O0o0.MINUTES);
    }

    public static final long o00ooo0o(int i) {
        return o0O00OO(i, o0O0O0o0.MINUTES);
    }

    public static final long o00oooO(long j) {
        return o0O00OOO(j, o0O0O0o0.MINUTES);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oooOO(double d) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oooOo(int i) {
    }

    public static final long o00oooo(double d) {
        return o0O00O(d, o0O0O0o0.NANOSECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oooo0(long j) {
    }

    public static final long o00ooooO(int i) {
        return o0O00OO(i, o0O0O0o0.NANOSECONDS);
    }

    public static final long o00ooooo(long j) {
        return o0O00OOO(j, o0O0O0o0.NANOSECONDS);
    }

    public static final int o0O00(String str, int i, o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        while (i < str.length() && o00ooVar.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    public static final long o0O000(int i) {
        return o0O00OO(i, o0O0O0o0.SECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0O00000(int i) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0O0000O(long j) {
    }

    public static final long o0O0000o(double d) {
        return o0O00O(d, o0O0O0o0.SECONDS);
    }

    public static final long o0O000O(long j) {
        return o0O00OOO(j, o0O0O0o0.SECONDS);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0O000Oo(int i) {
    }

    public static final long o0O000o(long j) {
        return j / 1000000;
    }

    public static final long o0O000o0(long j) {
        return j * 1000000;
    }

    public static final long o0O000oo(String str) {
        boolean z;
        int length = str.length();
        int i = (length <= 0 || !oO0O0.o0OOOoo("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            o0OOOo0o.o0O0O0Oo o0o0o0oo = new o0OOOo0o.o0O0O0Oo(i, oO0O0.o0OOo0oO(str));
            if (!(o0o0o0oo instanceof Collection) || !((Collection) o0o0o0oo).isEmpty()) {
                Iterator<Integer> it = o0o0o0oo.iterator();
                while (it.hasNext()) {
                    if (!new o0O00O('0', '9').o00oOoo0(str.charAt(((o0OO0oO.o0O0o0) it).nextInt()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (oO0O00o0.o0OOO0O(str, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, false, 2, null)) {
            str = oO0O0O0.o0o0OOoo(str, 1);
        }
        return Long.parseLong(str);
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o0OO00o0(version = "1.6")
    public static final long o0O00O(double d, @NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "unit");
        double o00oOOo02 = o0O0OO0.o00oOOo0(d, o0o0o0o0, o0O0O0o0.NANOSECONDS);
        if (!Double.isNaN(o00oOOo02)) {
            long o0O0OOo2 = o0O00O0o.o0O0OOo(o00oOOo02);
            return new o0OOOo0o.o0O0OO0(-4611686018426999999L, f13951o00oOOoO).o00oOoo0(o0O0OOo2) ? o00oOooo(o0O0OOo2) : o00oOoo0(o0O00O0o.o0O0OOo(o0O0OO0.o00oOOo0(d, o0o0o0o0, o0O0O0o0.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final String o0O00O0(String str, int i, o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        int i2 = i;
        while (i2 < str.length() && o00ooVar.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        o0OOOOO0.o0ooO.o00oo0(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o0O00O0o(int i, long j) {
        return o0oO0O0o.o0OoO00O(j, i);
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o0OO00o0(version = "1.6")
    public static final long o0O00OO(int i, @NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "unit");
        return o0o0o0o0.compareTo(o0O0O0o0.SECONDS) <= 0 ? o00oOooo(o0O0OO0.o00oOo00(i, o0o0o0o0, o0O0O0o0.NANOSECONDS)) : o0O00OOO(i, o0o0o0o0);
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o0OO00o0(version = "1.6")
    public static final long o0O00OOO(long j, @NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "unit");
        o0O0O0o0 o0o0o0o02 = o0O0O0o0.NANOSECONDS;
        long o00oOo002 = o0O0OO0.o00oOo00(f13951o00oOOoO, o0o0o0o02, o0o0o0o0);
        return new o0OOOo0o.o0O0OO0(-o00oOo002, o00oOo002).o00oOoo0(j) ? o00oOooo(o0O0OO0.o00oOo00(j, o0o0o0o0, o0o0o0o02)) : o00oOoOo(o0OOOo0o.oo0OOoo.o00ooo0(o0O0OO0.o00oOOoO(j, o0o0o0o0, o0O0O0o0.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long o0O0o(long j) {
        return o0O00OOO(j, o0O0O0o0.HOURS);
    }

    @oO0Oo0oo(markerClass = {o0O0OOO0.class})
    @o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o0OoO00O(double d, long j) {
        return o0oO0O0o.o0O00O0(j, d);
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0OoOoOO(long j) {
    }

    @o0O0OOO0
    @o00oo(errorSince = "1.8", warningSince = "1.5")
    @o0O0o(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @o0OO000(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o0OoOoOo(double d) {
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x00ad A[EDGE_INSN: B:172:0x00ad->B:49:0x00ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[LOOP:1: B:36:0x0072->B:47:0x009e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long o0ooOoOO(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOOooO.o0O0O0Oo.o0ooOoOO(java.lang.String, boolean):long");
    }
}
