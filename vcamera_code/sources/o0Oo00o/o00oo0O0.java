package o0Oo00o;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.common.base.Ascii;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import multispace.multiapp.clone.app.App;
import o0OOoO0.o00oo;
import o0Oo00oo.o0O000o0;
/* loaded from: classes3.dex */
public class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static String f15599o00oOOo0 = "";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static String f15600o00oOOoO = "";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static String f15601o00oOo00 = "";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static String f15602o00oOo0O = "";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static String f15603o00oOooO = "";

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements InstallReferrerStateListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f15604o00oOOo0;

        public o00oOOo0(InstallReferrerClient installReferrerClient) {
            this.f15604o00oOOo0 = installReferrerClient;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i != 0) {
                return;
            }
            o00oo0O0.o00oOo00(this.f15604o00oOOo0);
        }
    }

    public static void o00oOOoO() {
        String o00oOo0o2 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{-69, 7, -92, Byte.MAX_VALUE, -82}, new byte[]{-55, 98, -62, Ascii.SUB, -36, -108, 38, -97}));
        if (TextUtils.isEmpty(o00oOo0o2)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(App.o00oOOoO()).build();
            build.startConnection(new o00oOOo0(build));
            return;
        }
        f15599o00oOOo0 = o00oOo0o2;
        o00oOo0O();
    }

    public static void o00oOo00(InstallReferrerClient installReferrerClient) {
        try {
            ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
            f15599o00oOOo0 = installReferrer.getInstallReferrer();
            installReferrer.getReferrerClickTimestampSeconds();
            installReferrer.getInstallBeginTimestampSeconds();
            installReferrer.getGooglePlayInstantParam();
            o00oo.o00oOOo0(new byte[]{95, Ascii.DC2, 38, 42, 123}, new byte[]{110, 35, Ascii.ETB, Ascii.ESC, 74, Ascii.RS, -114, -45});
            o00oo.o00oOOo0(new byte[]{-88, -58, -125, -58, -41, -8, 59, -20, -113, -47, -119, -103}, new byte[]{-38, -93, -27, -93, -91, -118, 94, -98});
            o00oo.o00oOOo0(new byte[]{43, -75, 82, Ascii.CR, -81, -80, 71, -59, 102, -72, 78, 41, -113, -77, 81, -117}, new byte[]{7, -44, 34, 125, -26, -34, 52, -79});
            o00oo.o00oOOo0(new byte[]{78, 6, 36, -123, 56, Ascii.EM, 50, -28, 39, Ascii.ETB, 58, -109, 62, 17, 57, -2, 1, 10, 6, -105, 57, Ascii.SYN, 63, -8, 7, Ascii.VT, 112}, new byte[]{98, 111, 74, -10, 76, 120, 92, -112});
            installReferrerClient.endConnection();
            o00oOo0O();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o00oOo0O() {
        Map<String, String> o00oOooO2 = o00oOooO(f15599o00oOOo0);
        f15600o00oOOoO = o00oOooO2.get(o00oo.o00oOOo0(new byte[]{-79, 88, -5, Ascii.SI, -91, 53, -93, 101, -89, 73}, new byte[]{-60, 44, -106, 80, -42, 90, -42, Ascii.ETB}));
        f15601o00oOo00 = o00oOooO2.get(o00oo.o00oOOo0(new byte[]{-87, -111, -12, 69, 91, -11, -54, 81, -87, -120}, new byte[]{-36, -27, -103, Ascii.SUB, 54, -112, -82, 56}));
        f15603o00oOooO = o00oOooO2.get(o00oo.o00oOOo0(new byte[]{-48, 101, 46, 90, 118, 32, -14, -98, -60, 120, 36, 107}, new byte[]{-91, 17, 67, 5, Ascii.NAK, 65, -97, -18}));
        f15602o00oOo0O = o00oOooO2.get(o00oo.o00oOOo0(new byte[]{107, 63, -77, 124, -5, 114, 34, -5}, new byte[]{Ascii.RS, 75, -34, 35, -113, Ascii.ETB, 80, -106}));
    }

    public static Map<String, String> o00oOooO(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_MAP;
        }
        try {
            String[] split2 = str.split(o00oo.o00oOOo0(new byte[]{-76}, new byte[]{-110, -39, 100, 85, -20, -6, 66, -66}));
            HashMap hashMap = new HashMap();
            for (String str2 : split2) {
                if (!TextUtils.isEmpty(str2) && (split = str2.split(o00oo.o00oOOo0(new byte[]{122}, new byte[]{71, -25, -5, -112, 117, 91, -5, -101}))) != null && split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return Collections.EMPTY_MAP;
        }
    }
}
