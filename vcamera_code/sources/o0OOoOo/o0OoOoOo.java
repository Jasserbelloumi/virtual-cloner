package o0OOoOo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.lifecycle.o0O0OOOo;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import multispace.multiapp.clone.app.App;
import o0O0oooo.o0OO;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O00O;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.o0oO0Ooo;
import o0OOO0oo.oo0OOoo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO0O0;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OO00o;
import o0OOoOO.o00ooO0;
import o0OOoOO.o0O000;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0;
import o0ooO0O0.oO00o0;
import o0ooO0O0.oO0O000o;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0oO000;
import o0ooO0O0.oOo00ooO;
import o0ooO0O0.ooo0o;
import org.jetbrains.annotations.NotNull;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J0\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006J(\u0010\r\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u0006J$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006J$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006J$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006J\u001c\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\tJ\b\u0010\u001d\u001a\u00020\u0002H\u0002J \u0010 \u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u001a\u0010$\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006+"}, d2 = {"Lo0OOoOo/o0OoOoOo;", "", "Lo0OO0o/oO0Ooooo;", "o00oOoO", "", "userID", "Landroidx/lifecycle/o0O0OOOo;", "", "loadingLiveData", "", "Lo0OOoOO/o0O000;", "appsLiveData", o00oOOoO.f12961o00oOo00, "o00oOo00", "userId", "Lo0OOoOO/o00ooO0;", "", "o00oOo0O", "", FirebaseAnalytics.Param.SOURCE, "resultLiveData", "o00oOo0o", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "o00oOoOo", "launchLiveData", "o00oOoO0", "o00oOOo0", "dataList", "o00oOoo0", "o00oOoOO", "pkg", "isAdd", "o00oOooo", "Ljava/lang/String;", "o00oOooO", "()Ljava/lang/String;", "TAG", "Ljava/util/List;", "mInstalledList", "I", "START_SUCCESS", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0OoOoOo {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f14912o00oOOo0 = o00oo.o00oOOo0(new byte[]{87, Ascii.FF, 125, 4, 65, -115, 59, Ascii.SO, 101, Ascii.NAK, 121, Ascii.CAN, 97, -111}, new byte[]{Ascii.SYN, 124, Ascii.CR, 119, 19, -24, 75, 97});
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public List<o00ooO0> f14913o00oOOoO = new ArrayList();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f14914o00oOo00;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0OOoOO/o00ooO0;", "it", "", "invoke", "(Lo0OOoOO/o00ooO0;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<o00ooO0, CharSequence> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final CharSequence invoke(@NotNull o00ooO0 o00ooo02) {
            o0ooO.o00oo0O0(o00ooo02, o00oo.o00oOOo0(new byte[]{63, 7}, new byte[]{86, 115, -112, -4, 114, 104, -42, -80}));
            return o00ooo02.f14888o00oOo00;
        }
    }

    public final void o00oOOo0(@NotNull String str, int i, @NotNull o0O0OOOo<String> o0o0oooo) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{117, -66, Ascii.SO, -97, 44, -47, o0OO0o00.f16655o00oOoOO, 56, 100, -78, 8}, new byte[]{5, -33, 109, -12, 77, -74, 68, 118}));
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{8, -84, 115, 81, 19, -16, -55, 126, Ascii.FF, -84, 68, 69, Ascii.VT, -27}, new byte[]{122, -55, 0, 36, Byte.MAX_VALUE, -124, -123, Ascii.ETB}));
        o0OO.o00oOo00(str, i);
        o0o0oooo.o00oo0OO(ooo0o.o00oOOo0(R.string.clear_success, new String[0]));
    }

    public final void o00oOOoO(int i, @NotNull o0O0OOOo<Boolean> o0o0oooo, @NotNull o0O0OOOo<List<o0O000>> o0o0oooo2) {
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{120, -99, -91, -28, 73, -51, -82, -115, 125, -124, -95, -60, 65, -41, -88}, new byte[]{Ascii.DC4, -14, -60, Byte.MIN_VALUE, 32, -93, -55, -63}));
        o0ooO.o00oo0O0(o0o0oooo2, o00oo.o00oOOo0(new byte[]{49, -46, -87, 46, -57, -89, -44, -104, Ascii.DC4, -61, -83, 60}, new byte[]{80, -94, -39, 93, -117, -50, -94, -3}));
        o0o0oooo.o00oo0OO(Boolean.TRUE);
        synchronized (this.f14913o00oOOoO) {
            o0O0oo0o.o0OOo0o0(this.f14913o00oOOoO, o00oo.o00oOOo0(new byte[]{-110}, new byte[]{-66, -59, -11, -3, Ascii.SYN, -58, 79, o0OO0o00.f16655o00oOoOO}), null, null, 0, null, null, 62, null);
            List<o00ooO0> list = this.f14913o00oOOoO;
            ArrayList<o00ooO0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((o00ooO0) obj).f14889o00oOo0O) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(o0O00O.o0O000(arrayList, 10));
            for (o00ooO0 o00ooo02 : arrayList) {
                arrayList2.add(new o0O000(o00ooo02.f14886o00oOOo0, o00ooo02.f14887o00oOOoO, o00ooo02.f14888o00oOo00, o00ooo02.f14890o00oOooO, o0OO.o00oOoOo(o00ooo02.f14888o00oOo00, i, 0) != null));
            }
            o0o0oooo2.o00oo0OO(arrayList2);
            o0o0oooo.o00oo0OO(Boolean.FALSE);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        }
    }

    public final void o00oOo00(@NotNull o0O0OOOo<Boolean> o0o0oooo, @NotNull o0O0OOOo<List<o0O000>> o0o0oooo2) {
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{-82, -38, -31, 122, 109, -83, 38, Ascii.SO, -85, -61, -27, 90, 101, -73, 32}, new byte[]{-62, -75, Byte.MIN_VALUE, Ascii.RS, 4, -61, 65, 66}));
        o0ooO.o00oo0O0(o0o0oooo2, o00oo.o00oOOo0(new byte[]{-58, 78, -23, -47, -10, 70, 121, -48, -29, 95, -19, -61}, new byte[]{-89, 62, -103, -94, -70, 47, Ascii.SI, -75}));
        o0o0oooo.o00oo0OO(Boolean.TRUE);
        synchronized (this.f14913o00oOOoO) {
            List<o00ooO0> list = this.f14913o00oOOoO;
            ArrayList<o00ooO0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((o00ooO0) obj).f14889o00oOo0O) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(o0O00O.o0O000(arrayList, 10));
            for (o00ooO0 o00ooo02 : arrayList) {
                String str = o00ooo02.f14886o00oOOo0;
                Drawable drawable = o00ooo02.f14887o00oOOoO;
                String str2 = o00ooo02.f14888o00oOo00;
                arrayList2.add(new o0O000(str, drawable, str2, o00ooo02.f14890o00oOooO, oO0.o00oOOo0(str2, 0)));
            }
            o0o0oooo2.o00oo0OO(arrayList2);
            o0o0oooo.o00oo0OO(Boolean.FALSE);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        }
    }

    @NotNull
    public final List<o00ooO0> o00oOo0O(int i, @NotNull o0O0OOOo<List<o00ooO0>> o0o0oooo) {
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{-88, -91, 85, 72, 2, -117, 67, 115, -115, -76, 81, 90}, new byte[]{-55, -43, 37, 59, 78, -30, 53, Ascii.SYN}));
        String string = o0OO00o.o00oOOo0().getString(o00oo.o00oOOo0(new byte[]{Ascii.NAK, -92, 68, -46, -75, -124, 107}, new byte[]{84, -44, 52, -98, -36, -9, Ascii.US, -77}) + i, "");
        boolean z = true;
        List o0Ooo0 = string != null ? oO0O0.o0Ooo0(string, new String[]{o00oo.o00oOOo0(new byte[]{95}, new byte[]{115, 84, -27, 60, 7, -108, -16, 68})}, false, 0, 6, null) : null;
        List<String> o00oOoO2 = o0OO.o00oOoO(0, i);
        if (o00oOoO2 != null && o00oOoO2.size() > 0) {
            o00oOoO2.remove(o00oo.o00oOOo0(new byte[]{71, -97, -125, 52, 100, 120, -33, Ascii.SI, 75, -97, Byte.MIN_VALUE, 52, 126, 120, -119, 5, 84}, new byte[]{36, -16, -18, Ascii.SUB, 19, Ascii.EM, -89, 98}));
        }
        ArrayList<ApplicationInfo> arrayList = new ArrayList();
        o0ooO.o00oo0OO(o00oOoO2, o00oo.o00oOOo0(new byte[]{Ascii.ETB, Ascii.ETB, 76, -47, Ascii.NAK, 126, 121, 5, Ascii.SUB, 41, 84, -62, 7}, new byte[]{126, 121, 63, -91, 116, Ascii.DC2, Ascii.NAK, 96}));
        for (String str : o00oOoO2) {
            PackageInfo o00oOoOo2 = o0OO.o00oOoOo(str, i, 128);
            if (!o00oo.o00oOOo0(new byte[]{-7, 51, -15, 78, Ascii.SUB, -58, -17, 62, -10, 57, -78, 1, 19, -51, -14, 54, -13, 56, -78, 7, Ascii.DLE, -38}, new byte[]{-102, 92, -100, 96, 125, -87, Byte.MIN_VALUE, 89}).equals(o00oOoOo2.packageName) && !o00oo.o00oOOo0(new byte[]{Ascii.CR, o0OO0o00.f16655o00oOoOO, 4, 124, 99, 53, Ascii.GS, -112, 2, 43, 71, 51, 106, 62, 0, -104, 7, 42, 71, 53, 119, 60}, new byte[]{110, 78, 105, 82, 4, 90, 114, -9}).equals(o00oOoOo2.packageName) && !oO0oO000.o00oOOoO(o00oOoOo2.applicationInfo)) {
                ApplicationInfo applicationInfo = o00oOoOo2.applicationInfo;
                o0ooO.o00oo0OO(applicationInfo, o00oo.o00oOOo0(new byte[]{-125, 35, 101, 46, -98, 70, 82, Ascii.RS, -99, 36, 105, 107, -98, 81, 71, 59, -102, o0OO0o00.f16655o00oOoOO, 103, 49, -106, 78, 89, Ascii.RS, -99, 36, 105}, new byte[]{-13, 66, 6, 69, -1, o0OO0o00.f16655o00oOoOO, 55, 87}));
                arrayList.add(applicationInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (o0Ooo0 != null && !o0Ooo0.isEmpty()) {
            z = false;
        }
        if (!z) {
            o0oO0Ooo.o0O00OO(arrayList, new o0O000Oo(o0Ooo0));
        }
        for (ApplicationInfo applicationInfo2 : arrayList) {
            App.o00oOOo0 o00oooo02 = App.f6679o00oo0Oo;
            String obj = applicationInfo2.loadLabel(o00oooo02.o00oOOo0().getPackageManager()).toString();
            Drawable loadIcon = applicationInfo2.loadIcon(o00oooo02.o00oOOo0().getPackageManager());
            o0ooO.o00oo0OO(loadIcon, o00oo.o00oOOo0(new byte[]{87, -115, 83, -10, 111, -73, -44, 110, 93, -106, 19, -78, 109, -93, -36, 83, 87, -118, Ascii.CR, -5, 99, -77, -98, 74, -36, 121, -37, -30, 116, -2, -103, 9, 89, -100, 9, -54, 97, -75, -37, 70, 89, -100, 48, -5, 110, -73, -41, 66, 76, -47, 84, -77}, new byte[]{62, -7, 125, -102, 0, -42, -80, 39}));
            String str2 = applicationInfo2.packageName;
            o0ooO.o00oo0OO(str2, o00oo.o00oOOo0(new byte[]{Ascii.ETB, oo0OOoo.f13516o00oOoO, 67, -55, 71, 76, -33, -7, Ascii.EM, 44, 35, -40, 75, 74}, new byte[]{126, 73, 109, -71, 38, 47, -76, -104}));
            String str3 = applicationInfo2.sourceDir;
            o0ooO.o00oo0OO(str3, o00oo.o00oOOo0(new byte[]{99, -63, -67, -72, -33, -43, -39, 91, 111, -15, -6, -71}, new byte[]{10, -75, -109, -53, -80, -96, -85, 56}));
            arrayList2.add(new o00ooO0(obj, loadIcon, str2, str3, false));
        }
        o0o0oooo.o00oo0OO(arrayList2);
        return arrayList2;
    }

    public final void o00oOo0o(@NotNull String str, int i, @NotNull o0O0OOOo<String> o0o0oooo) {
        int o00oo0Oo2;
        String o00oOOo02;
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{57, -81, -36, -113, 99, 3}, new byte[]{74, -64, -87, -3, 0, 102, -74, -12}));
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{-123, 105, 49, 94, 73, -98, -104, 62, -127, 105, 6, 74, 81, -117}, new byte[]{-9, Ascii.FF, 66, 43, 37, -22, -44, 87}));
        try {
            if (URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                App.o00oOOo0 o00oooo02 = App.f6679o00oo0Oo;
                InputStream openInputStream = o00oooo02.o00oOOo0().getContentResolver().openInputStream(parse);
                File file = new File(o00oooo02.o00oOOo0().getFilesDir(), o00oo.o00oOOo0(new byte[]{97, 103, Ascii.SUB, 87, Ascii.SYN, Ascii.VT, -47, -8}, new byte[]{Ascii.NAK, 2, 119, 39, 56, 106, -95, -109}));
                file.delete();
                oO0O000o.o00oOoO0(openInputStream, file);
                if (oO0oO000.o00oOo00(file.getAbsolutePath())) {
                    o0o0oooo.o00oo0OO(ooo0o.o00oOOo0(R.string.install_fail, o00oo.o00oOOo0(new byte[]{-101, 71, 56, -32, -90, 35, 91, 36, -118, 67, 119, -6, -80, 103, Ascii.SUB, 101, -126, 88, 52, -7, -71, 102, 91, 119, -105, 19, 113, -25, -90, 119, 91, 104, -98, 19, 113, -3, -11, 106, 84, 36, -86, 67, 119, -6, -80, 103, Ascii.SUB, 73, -99, 87, 109, -27, -80, 35, 119, 101, -100, 82, Byte.MAX_VALUE, -20, -89, 45}, new byte[]{-14, 51, Ascii.CAN, -119, -43, 3, 58, 4})));
                    return;
                }
                o00oo0Oo2 = o0OO.o00oo0O(file.getAbsolutePath(), i, true);
            } else {
                o00oo0Oo2 = o0OO.o00oo0Oo(str, i, true);
            }
            try {
                if (o00oo0Oo2 == 1) {
                    o00oOooo(i, str, true);
                    o00oOOo02 = ooo0o.o00oOOo0(R.string.install_success, new String[0]);
                } else {
                    o00oOOo02 = ooo0o.o00oOOo0(R.string.install_fail, o00oo.o00oOOo0(new byte[]{87, -55, Byte.MAX_VALUE, 65, 90, -36, Ascii.DC2, -85, 94, -52, 115, Ascii.ETB}, new byte[]{49, -88, Ascii.SYN, 45, 63, -72, 50, -56}) + o00oo0Oo2);
                }
                o0o0oooo.o00oo0OO(o00oOOo02);
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void o00oOoO() {
        byte b;
        char c;
        int i;
        char c2;
        synchronized (this.f14913o00oOOoO) {
            List<ApplicationInfo> installedApplications = App.f6679o00oo0Oo.o00oOOo0().getPackageManager().getInstalledApplications(128);
            byte b2 = 5;
            char c3 = 6;
            int i2 = 22;
            o0ooO.o00oo0OO(installedApplications, o00oo.o00oOOo0(new byte[]{126, -55, -104, -2, -76, 52, -101, -100, 80, -41, -100, -75, -85, 37, -57, -10, 17, -34, -115, -92, -125, 48, -116, -76, -35, 57, 78, -79, -76, 52, -94, -66, 81, -40, -113, -75, -95, Byte.MAX_VALUE, -88, -102, 107, -26, -91, -107, -121, Ascii.DLE, -80, -101, 126, -19, -87, -7}, new byte[]{63, -71, -24, -48, -45, 81, -17, -33}));
            ArrayList arrayList = new ArrayList();
            for (ApplicationInfo applicationInfo : installedApplications) {
                File file = new File(applicationInfo.sourceDir);
                if ((applicationInfo.flags & 1) == 0 && oO00o0.o00oOo0O(file)) {
                    String str = applicationInfo.packageName;
                    App.o00oOOo0 o00oooo02 = App.f6679o00oo0Oo;
                    if (!str.equals(o00oooo02.o00oOOo0().getPackageName())) {
                        oOo00ooO.o00oOOo0(applicationInfo.packageName, 0);
                        byte[] bArr = new byte[i2];
                        bArr[0] = -85;
                        bArr[1] = -32;
                        bArr[2] = 83;
                        bArr[3] = -66;
                        bArr[4] = -81;
                        bArr[b2] = -42;
                        bArr[c3] = -16;
                        bArr[7] = Ascii.VT;
                        bArr[8] = -92;
                        bArr[9] = -22;
                        bArr[10] = Ascii.DLE;
                        bArr[11] = -15;
                        bArr[12] = -90;
                        bArr[13] = -35;
                        bArr[14] = -19;
                        bArr[15] = 3;
                        bArr[16] = -95;
                        bArr[17] = -21;
                        bArr[18] = Ascii.DLE;
                        bArr[19] = -9;
                        bArr[20] = -91;
                        bArr[21] = -54;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = -56;
                        bArr2[1] = -113;
                        bArr2[2] = 62;
                        bArr2[3] = -112;
                        bArr2[4] = -56;
                        bArr2[b2] = -71;
                        bArr2[c3] = -97;
                        bArr2[7] = 108;
                        if (!o00oo.o00oOOo0(bArr, bArr2).equals(applicationInfo.packageName)) {
                            byte[] bArr3 = new byte[22];
                            bArr3[0] = -115;
                            bArr3[1] = -41;
                            bArr3[2] = 91;
                            bArr3[3] = 43;
                            bArr3[4] = 69;
                            bArr3[b2] = 70;
                            bArr3[c3] = Ascii.DC2;
                            bArr3[7] = -83;
                            bArr3[8] = -126;
                            bArr3[9] = -35;
                            bArr3[10] = Ascii.CAN;
                            bArr3[11] = 100;
                            bArr3[12] = 76;
                            bArr3[13] = 77;
                            bArr3[14] = Ascii.SI;
                            bArr3[15] = -91;
                            bArr3[16] = -121;
                            bArr3[17] = -36;
                            bArr3[18] = Ascii.CAN;
                            bArr3[19] = 98;
                            bArr3[20] = 81;
                            bArr3[21] = 79;
                            byte[] bArr4 = new byte[8];
                            bArr4[0] = -18;
                            bArr4[1] = -72;
                            bArr4[2] = 54;
                            bArr4[3] = b2;
                            bArr4[4] = 34;
                            bArr4[b2] = 41;
                            bArr4[c3] = 125;
                            bArr4[7] = -54;
                            if (!o00oo.o00oOOo0(bArr3, bArr4).equals(applicationInfo.packageName)) {
                                byte[] bArr5 = new byte[19];
                                bArr5[0] = -18;
                                bArr5[1] = 100;
                                bArr5[2] = -19;
                                bArr5[3] = 35;
                                bArr5[4] = -43;
                                bArr5[b2] = -109;
                                bArr5[c3] = -75;
                                bArr5[7] = 34;
                                bArr5[8] = -30;
                                bArr5[9] = 98;
                                bArr5[10] = -28;
                                bArr5[11] = 35;
                                bArr5[12] = -62;
                                bArr5[13] = -104;
                                bArr5[14] = -65;
                                bArr5[15] = 52;
                                bArr5[16] = -28;
                                bArr5[17] = 101;
                                bArr5[18] = -25;
                                byte[] bArr6 = new byte[8];
                                bArr6[0] = -115;
                                bArr6[1] = Ascii.VT;
                                bArr6[2] = Byte.MIN_VALUE;
                                bArr6[3] = Ascii.CR;
                                bArr6[4] = -76;
                                bArr6[b2] = -3;
                                bArr6[c3] = -47;
                                bArr6[7] = 80;
                                if (!o00oo.o00oOOo0(bArr5, bArr6).equals(applicationInfo.packageName)) {
                                    boolean o00oOOoO2 = oO0oO000.o00oOOoO(applicationInfo);
                                    if (o00oOOoO2 || o00oooo02.o00oOOo0().getPackageManager().getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                                        App.o00oOOo0 o00oooo03 = App.f6679o00oo0Oo;
                                        String obj = applicationInfo.loadLabel(o00oooo03.o00oOOo0().getPackageManager()).toString();
                                        Drawable loadIcon = applicationInfo.loadIcon(o00oooo03.o00oOOo0().getPackageManager());
                                        byte[] bArr7 = new byte[52];
                                        bArr7[0] = Ascii.SYN;
                                        bArr7[1] = 118;
                                        bArr7[2] = 59;
                                        bArr7[3] = 63;
                                        bArr7[4] = 76;
                                        bArr7[b2] = -13;
                                        bArr7[c3] = 47;
                                        bArr7[7] = -10;
                                        bArr7[8] = Ascii.ESC;
                                        bArr7[9] = 89;
                                        bArr7[10] = 56;
                                        bArr7[11] = 59;
                                        bArr7[12] = 65;
                                        bArr7[13] = -10;
                                        bArr7[14] = 32;
                                        bArr7[15] = -14;
                                        bArr7[16] = Ascii.VT;
                                        bArr7[17] = 113;
                                        bArr7[18] = 39;
                                        bArr7[19] = 37;
                                        bArr7[20] = 3;
                                        bArr7[21] = -13;
                                        bArr7[22] = 44;
                                        bArr7[23] = -14;
                                        bArr7[24] = -99;
                                        bArr7[25] = -104;
                                        bArr7[26] = -18;
                                        bArr7[27] = 51;
                                        bArr7[28] = 89;
                                        bArr7[29] = -73;
                                        bArr7[30] = 106;
                                        bArr7[31] = -67;
                                        bArr7[32] = Ascii.CAN;
                                        bArr7[33] = 125;
                                        bArr7[34] = 60;
                                        bArr7[35] = Ascii.ESC;
                                        bArr7[36] = 76;
                                        bArr7[37] = -4;
                                        bArr7[38] = 40;
                                        bArr7[39] = -14;
                                        bArr7[40] = Ascii.CAN;
                                        bArr7[41] = 125;
                                        bArr7[42] = b2;
                                        bArr7[43] = 42;
                                        bArr7[44] = 67;
                                        bArr7[45] = -2;
                                        bArr7[46] = 36;
                                        bArr7[47] = -10;
                                        bArr7[48] = Ascii.CR;
                                        bArr7[49] = 48;
                                        bArr7[50] = 97;
                                        bArr7[51] = 98;
                                        byte[] bArr8 = new byte[8];
                                        bArr8[0] = Byte.MAX_VALUE;
                                        bArr8[1] = Ascii.CAN;
                                        bArr8[2] = 72;
                                        bArr8[3] = 75;
                                        bArr8[4] = 45;
                                        bArr8[b2] = -97;
                                        bArr8[6] = 67;
                                        bArr8[7] = -109;
                                        o0ooO.o00oo0OO(loadIcon, o00oo.o00oOOo0(bArr7, bArr8));
                                        String str2 = applicationInfo.packageName;
                                        byte[] bArr9 = new byte[32];
                                        bArr9[0] = -74;
                                        bArr9[1] = -101;
                                        bArr9[2] = 83;
                                        bArr9[3] = 69;
                                        bArr9[4] = 66;
                                        bArr9[b2] = 34;
                                        bArr9[6] = -47;
                                        bArr9[7] = -59;
                                        bArr9[8] = -69;
                                        bArr9[9] = -76;
                                        bArr9[10] = 80;
                                        bArr9[11] = 65;
                                        bArr9[12] = 79;
                                        bArr9[13] = 39;
                                        bArr9[14] = -34;
                                        bArr9[15] = -63;
                                        bArr9[16] = -85;
                                        bArr9[17] = -100;
                                        bArr9[18] = 79;
                                        bArr9[19] = 95;
                                        bArr9[20] = Ascii.CR;
                                        bArr9[21] = 62;
                                        bArr9[22] = -36;
                                        bArr9[23] = -61;
                                        bArr9[24] = -76;
                                        bArr9[25] = -108;
                                        bArr9[26] = 71;
                                        bArr9[27] = 84;
                                        bArr9[28] = 109;
                                        bArr9[29] = 47;
                                        bArr9[30] = -48;
                                        bArr9[31] = -59;
                                        o0ooO.o00oo0OO(str2, o00oo.o00oOOo0(bArr9, new byte[]{-33, -11, 32, 49, 35, 78, -67, -96}));
                                        String str3 = applicationInfo.sourceDir;
                                        i = 22;
                                        b = 5;
                                        c = 6;
                                        c2 = 7;
                                        o0ooO.o00oo0OO(str3, o00oo.o00oOOo0(new byte[]{60, 1, -30, -87, -27, Ascii.GS, 113, 34, 49, 46, -31, -83, -24, Ascii.CAN, 126, 38, o0OO0o00.f16655o00oOoOO, 6, -2, -77, -86, 2, 114, 50, 39, Ascii.FF, -12, -103, -19, 3}, new byte[]{85, 111, -111, -35, -124, 113, Ascii.GS, 71}));
                                        arrayList.add(new o00ooO0(obj, loadIcon, str2, str3, o00oOOoO2));
                                        i2 = i;
                                        c3 = c;
                                        b2 = b;
                                    } else {
                                        i2 = 22;
                                    }
                                }
                            }
                        }
                        b = b2;
                        c = c3;
                        i = 22;
                        c2 = 7;
                        i2 = i;
                        c3 = c;
                        b2 = b;
                    }
                }
            }
            this.f14913o00oOOoO.clear();
            this.f14913o00oOOoO.addAll(arrayList);
        }
    }

    public final void o00oOoO0(@NotNull String str, int i, @NotNull o0O0OOOo<Boolean> o0o0oooo) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{-8, 87, -105, -39, 46, -48, 93, Ascii.DC2, -23, 91, -111}, new byte[]{-120, 54, -12, -78, 79, -73, 56, 92}));
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{19, 102, 121, 110, -104, 108, Ascii.ETB, -68, 9, 98, 72, 97, -113, 101}, new byte[]{Byte.MAX_VALUE, 7, Ascii.FF, 0, -5, 4, 91, -43}));
        try {
            boolean z = false;
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-36, -40, -40, -64, -77, -89, -105, -63, -101, -114, -103, -45, -20, -26, -121, -63, -116, -125, -86, -125, -21}, new byte[]{-17, -21, -21, -13, Byte.MIN_VALUE, -121, -14, -81}));
            Intent o00oOoOO2 = o0OO.o00oOoOO(str, i);
            o0ooO.o00oo0OO(o00oOoOO2, o00oo.o00oOOo0(new byte[]{-113, -54, -10, -71, -109, 104, 3, -84, Byte.MIN_VALUE, -26, -20, -127, -105, 115, Ascii.EM, -119, -121, -35, -46, -108, -111, 118, Ascii.FF, -88, -115, -121, -14, -108, -111, 118, Ascii.FF, -88, -115, -31, -29, -104, -105, 49, Ascii.CAN, -68, -115, -35, -53, -111, -37}, new byte[]{-24, -81, -126, -11, -14, Ascii.GS, 109, -49}));
            o00oOoOO2.addFlags(2097152);
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{34, 56, 10, Ascii.RS, 107, -101, 37, 59, 101, 110, 87, 89, 98}, new byte[]{17, Ascii.VT, 57, 45, 88, -69, 76, 85}) + o00oOoOO2);
            int o00ooO0o2 = o0OO.o00ooO0o(o00oOoOO2, i);
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-96, -86, 121, Ascii.FF, Ascii.GS, 117, 19, -53, -70, -88, 113, 10, Ascii.DLE, Ascii.DC4, 2, -38, -89, -17, 34}, new byte[]{-45, -34, Ascii.CAN, 126, 105, 52, 112, -65}) + o00ooO0o2);
            if (o00ooO0o2 == 0 || o00ooO0o2 == 2) {
                o0o0oooo.o00oo0OO(Boolean.TRUE);
                return;
            }
            oOo00ooO.o00oOo0O();
            int o00ooO0o3 = o0OO.o00ooO0o(o00oOoOO2, i);
            oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{-6, 109, -104, 94, 98, 49, -45, 76, -32, 111, -112, 88, 111, 80, -62, 93, -3, 43, -61}, new byte[]{-119, Ascii.EM, -7, 44, Ascii.SYN, 112, -80, 56}) + o00ooO0o3);
            if (o00ooO0o3 == 0 || o00ooO0o3 == 2) {
                z = true;
            }
            o0o0oooo.o00oo0OO(Boolean.valueOf(z));
        } catch (Throwable th) {
            o00oo.o00oOOo0(new byte[]{-59, -29, -97, 88, -67}, new byte[]{-12, -46, -82, 105, -116, -13, -116, 62});
            o00oo.o00oOOo0(new byte[]{-5, -41, -124, -21, -21, -10, 60, 126, -4, -116}, new byte[]{-105, -74, -15, -123, -120, -98, 125, Ascii.SO});
            th.toString();
            o0o0oooo.o00oo0OO(Boolean.FALSE);
        }
    }

    public final void o00oOoOO() {
    }

    public final void o00oOoOo(@NotNull String str, int i, @NotNull o0O0OOOo<String> o0o0oooo) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{Ascii.DC4, -85, 6, Ascii.CAN, 107, -104, Ascii.EM, Ascii.RS, 5, -89, 0}, new byte[]{100, -54, 101, 115, 10, -1, 124, 80}));
        o0ooO.o00oo0O0(o0o0oooo, o00oo.o00oOOo0(new byte[]{-60, -77, -9, -92, -58, 50, -40, -92, -64, -77, -64, -80, -34, 39}, new byte[]{-74, -42, -124, -47, -86, 70, -108, -51}));
        o0OO.o00ooOO0(str, i);
        o00oOooo(i, str, false);
        o0o0oooo.o00oo0OO(ooo0o.o00oOOo0(R.string.uninstall_success, new String[0]));
    }

    public final void o00oOoo0(int i, @NotNull List<o00ooO0> list) {
        o0ooO.o00oo0O0(list, o00oo.o00oOOo0(new byte[]{2, -111, 105, -88, SignedBytes.MAX_POWER_OF_TWO, -61, -23, 85}, new byte[]{102, -16, Ascii.GS, -55, Ascii.FF, -86, -102, o0OO0o00.f16655o00oOoOO}));
        SharedPreferences.Editor edit = o0OO00o.o00oOOo0().edit();
        o0ooO.o00oo0OO(edit, o00oo.o00oOOo0(new byte[]{-95, 112, 82, oo0OOoo.f13516o00oOoO, 65, 125}, new byte[]{-60, Ascii.DC4, 59, 73, 46, Ascii.SI, 51, -5}));
        edit.putString(o00oo.o00oOOo0(new byte[]{50, 50, -39, 56, 106, 32, -6}, new byte[]{115, 66, -87, 116, 3, 83, -114, Ascii.ESC}) + i, o0O0oo0o.o0OOo0o0(list, o00oo.o00oOOo0(new byte[]{-46}, new byte[]{-2, -121, -77, -6, -36, -18, -45, -98}), null, null, 0, null, o00oOOo0.INSTANCE, 30, null));
        edit.apply();
    }

    @NotNull
    public final String o00oOooO() {
        return this.f14912o00oOOo0;
    }

    public final void o00oOooo(int i, String str, boolean z) {
        SharedPreferences o00oOOo02 = o0OO00o.o00oOOo0();
        String string = o00oOOo02.getString(o00oo.o00oOOo0(new byte[]{Ascii.SUB, -46, -16, 46, 105, Ascii.SYN, -80}, new byte[]{91, -94, Byte.MIN_VALUE, 98, 0, 101, -60, 7}) + i, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (string != null) {
            linkedHashSet.addAll(oO0O0.o0Ooo0(string, new String[]{o00oo.o00oOOo0(new byte[]{-91}, new byte[]{-119, -43, -34, -41, 80, -67, -26, 1})}, false, 0, 6, null));
        }
        if (z) {
            linkedHashSet.add(str);
        } else {
            linkedHashSet.remove(str);
        }
        SharedPreferences.Editor edit = o0OO00o.o00oOOo0().edit();
        o0ooO.o00oo0OO(edit, o00oo.o00oOOo0(new byte[]{80, -110, -121, -50, -59, 110}, new byte[]{53, -10, -18, -70, -86, Ascii.FS, -63, -4}));
        edit.putString(o00oo.o00oOOo0(new byte[]{-4, Ascii.DC2, Ascii.SUB, Ascii.NAK, 34, -112, -110}, new byte[]{-67, 98, 106, 89, 75, -29, -26, -46}) + i, o0O0oo0o.o0OOo0o0(linkedHashSet, o00oo.o00oOOo0(new byte[]{-80}, new byte[]{-100, -73, 76, 37, 116, -55, 40, 78}), null, null, 0, null, null, 62, null));
        edit.apply();
    }
}
