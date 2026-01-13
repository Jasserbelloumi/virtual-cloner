package o0Oo00o;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Random;
import java.util.UUID;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00oo.o0O000o0;
/* loaded from: classes3.dex */
public class o00oOo00 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static String f15584o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f15583o00oOOo0 = o00oo.o00oOOo0(new byte[]{-122, Ascii.US, 115, 98, -89, 43, Ascii.GS, 85, -122}, new byte[]{-30, 122, 5, Ascii.VT, -60, 78, 66, 60});

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o00oOo00 f15585o00oOo00 = null;

    public o00oOo00() {
        try {
            String o00oOo0o2 = o0O000o0.o00oOo00().o00oOo0o(o00oo.o00oOOo0(new byte[]{124, -51, -124, -61, 1, -67, 51, Ascii.DC4, 124}, new byte[]{Ascii.CAN, -88, -14, -86, 98, -40, 108, 125}));
            if (!TextUtils.isEmpty(o00oOo0o2)) {
                f15584o00oOOoO = o00oOo0o2;
                return;
            }
            f15584o00oOOoO = o00oOOo0(App.o00oOOoO());
            o0O000o0.o00oOo00().o00oOooo(o00oo.o00oOOo0(new byte[]{79, -48, 111, -67, 118, 53, Ascii.ETB, -110, 79}, new byte[]{43, -75, Ascii.EM, -44, Ascii.NAK, 80, 72, -5}), f15584o00oOOoO);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String o00oOOo0(Context context) {
        String o00oOOoO2 = o00oOOoO(context);
        if (o00oo.o00oOOo0(new byte[]{4, -27, 110, 10, -3, -38, 80, -25, Ascii.VT, -22, 107, 91, -84, -37, 95, -32}, new byte[]{oo0OOoo.f13516o00oOoO, -46, 89, 62, -103, -17, 102, -125}).equals(o00oOOoO2)) {
            Random random = new Random();
            o00oOOoO2 = Integer.toHexString(random.nextInt()) + Integer.toHexString(random.nextInt()) + Integer.toHexString(random.nextInt());
        }
        return new UUID(o00oOOoO2.hashCode(), o00oOo0O().hashCode()).toString();
    }

    public static String o00oOOoO(Context context) {
        return Settings.System.getString(context.getContentResolver(), o00oo.o00oOOo0(new byte[]{81, -15, -97, -90, -110, -45, -59, -43, 89, -5}, new byte[]{48, -97, -5, -44, -3, -70, -95, -118}));
    }

    public static String o00oOo0O() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Build.BRAND);
        stringBuffer.append(o00oo.o00oOOo0(new byte[]{42}, new byte[]{5, -115, 70, 7, Ascii.SO, 94, -47, -91}));
        stringBuffer.append(Build.PRODUCT);
        stringBuffer.append(o00oo.o00oOOo0(new byte[]{Ascii.GS}, new byte[]{50, -108, -64, 72, -7, 81, 80, 8}));
        stringBuffer.append(Build.DEVICE);
        stringBuffer.append(o00oo.o00oOOo0(new byte[]{76}, new byte[]{99, -114, -3, 101, -43, -3, -38, -115}));
        stringBuffer.append(Build.ID);
        stringBuffer.append(o00oo.o00oOOo0(new byte[]{-19}, new byte[]{-62, 93, 95, -74, -35, -122, 105, 76}));
        stringBuffer.append(Build.VERSION.INCREMENTAL);
        return stringBuffer.toString();
    }

    public static o00oOo00 o00oOooO() {
        if (f15585o00oOo00 == null) {
            synchronized (o00oOo00.class) {
                if (f15585o00oOo00 == null) {
                    f15585o00oOo00 = new o00oOo00();
                }
            }
        }
        return f15585o00oOo00;
    }

    public String o00oOo00() {
        return f15584o00oOOoO;
    }
}
