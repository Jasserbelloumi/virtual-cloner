package o0Oo0o00;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class o00oo0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f16347o00oOOo0 = 253402300799999L;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f16348o00oOOoO = new o00oOOo0();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String[] f16349o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final DateFormat[] f16350o00oOooO;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: o00oOOo0 */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(oO0000O.f15766o00oo0OO);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f16349o00oOo00 = strArr;
        f16350o00oOooO = new DateFormat[strArr.length];
    }

    public static String o00oOOo0(Date date) {
        return f16348o00oOOoO.get().format(date);
    }

    public static Date o00oOOoO(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f16348o00oOOoO.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f16349o00oOo00;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f16350o00oOooO;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f16349o00oOo00[i], Locale.US);
                    dateFormat.setTimeZone(oO0000O.f15766o00oo0OO);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
