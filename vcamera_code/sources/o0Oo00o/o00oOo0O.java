package o0Oo00o;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Locale;
import multispace.multiapp.clone.app.App;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static String f15586o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static String f15587o00oOOoO;

    /* loaded from: classes3.dex */
    public interface o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final long f15588o00oOOo0 = 1048576;
    }

    /* loaded from: classes3.dex */
    public interface o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final long f15589o00oOOo0 = 1000;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final long f15590o00oOOoO = 60000;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final long f15591o00oOo00 = 3600000;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final long f15592o00oOooO = 86400000;
    }

    static {
        o00oOOoO();
        o00oOOo0();
    }

    public static void o00oOOo0() {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) App.o00oOOoO().getSystemService(o00oo.o00oOOo0(new byte[]{Ascii.DLE, -77, Ascii.US, 44, 67}, new byte[]{96, -37, 112, 66, 38, 114, -71, -57}));
        if (telephonyManager == null) {
            return;
        }
        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
        f15586o00oOOo0 = upperCase;
        if (TextUtils.isEmpty(upperCase)) {
            str = o00oo.o00oOOo0(new byte[]{98, -59, -117, -120, -85, -75, 39, Ascii.DC2, 81}, new byte[]{Ascii.SO, -92, -27, -17, -34, -44, SignedBytes.MAX_POWER_OF_TWO, 119}) + Locale.getDefault().getCountry().toUpperCase();
        } else {
            str = f15586o00oOOo0;
        }
        f15586o00oOOo0 = str;
    }

    public static void o00oOOoO() {
        String language = App.o00oOOoO().getResources().getConfiguration().locale.getLanguage();
        f15587o00oOOoO = language;
        if (TextUtils.isEmpty(language)) {
            f15587o00oOOoO = o00oo.o00oOOo0(new byte[]{-97, 88}, new byte[]{-6, 54, -104, -91, 65, Ascii.DC4, -26, 100});
        }
    }
}
