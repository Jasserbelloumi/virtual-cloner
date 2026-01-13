package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import o00oOooO.o0OO00OO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzbyt {
    public static final Handler zza = new zzfkr(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    @o0OO00OO
    private static String zzA(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray zzB(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            zzC(jSONArray, obj);
        }
        return jSONArray;
    }

    private final void zzC(JSONArray jSONArray, @o0OO00OO Object obj) throws JSONException {
        Object zzh;
        if (obj instanceof Bundle) {
            zzh = zzi((Bundle) obj);
        } else if (obj instanceof Map) {
            zzh = zzj((Map) obj);
        } else if (obj instanceof Collection) {
            zzh = zzB((Collection) obj);
        } else if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        } else {
            zzh = zzh((Object[]) obj);
        }
        jSONArray.put(zzh);
    }

    private final void zzD(JSONObject jSONObject, String str, @o0OO00OO Object obj) throws JSONException {
        Boolean[] boolArr;
        Object zzh;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzr)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            zzh = zzi((Bundle) obj);
        } else if (obj instanceof Map) {
            zzh = zzj((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    zzh = zzh(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    zzh = zzh(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    zzh = zzh(lArr);
                } else if (!(obj instanceof boolean[])) {
                    jSONObject.put(str, obj);
                    return;
                } else {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    zzh = zzh(boolArr);
                }
            }
            zzh = zzB(asList);
        }
        jSONObject.put(str, zzh);
    }

    private static final void zzE(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @o0OO00OO String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int zzy = zzy(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzy, zzqVar.zzc - zzy, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round((i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i, int i2, int i3) {
        float f;
        float f2;
        int i4;
        int zza2 = zza(context, i3);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i <= 655) {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i4, min), 50));
        }
        f = i / 728.0f;
        f2 = 90.0f;
        i4 = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(i4, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    @o0OO00OO
    public static String zze(String str) {
        return zzA(str, "MD5");
    }

    @o0OO00OO
    public static String zzf(String str) {
        return zzA(str, "SHA-256");
    }

    @o0OO00OO
    public static Throwable zzg(Throwable th) {
        if (((Boolean) zzbct.zzf.zze()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzp(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    @VisibleForTesting
    public static boolean zzp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbct.zzd.zze());
    }

    public static final int zzq(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @VisibleForTesting
    @o0OO00OO
    public static final String zzr(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int i2;
        String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzs() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzt(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static final boolean zzu(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzv() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzx(Context context, @o0OO00OO String str, String str2, Bundle bundle, boolean z, zzbys zzbysVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".230500000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("=").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzbysVar.zza(appendQueryParameter.toString());
    }

    public static final int zzy(Context context, int i) {
        return zzq(context.getResources().getDisplayMetrics(), i);
    }

    @o0OO00OO
    public static final String zzz(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return zzA(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzs()) ? "emulator" : "emulator", "MD5");
    }

    public final int zzb(Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.zzh);
    }

    @VisibleForTesting
    public final JSONArray zzh(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzC(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzD(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzD(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final JSONObject zzk(@o0OO00OO Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzi(bundle);
            } catch (JSONException e) {
                zzbza.zzh("Error converting Bundle to JSON", e);
                return null;
            }
        }
        return null;
    }

    public final void zzl(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzl((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @o0OO00OO String str, @o0OO00OO String str2) {
        if (str2 != null) {
            zzbza.zzj(str2);
        }
        zzE(viewGroup, zzqVar, str, o0.o00oOOo0.f6865o00oOo00, -16777216);
    }

    public final void zzn(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @o0OO00OO String str) {
        zzE(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void zzo(Context context, @o0OO00OO String str, String str2, Bundle bundle, boolean z) {
        zzx(context, str, "gmob-apps", bundle, true, new zzbys() { // from class: com.google.android.gms.internal.ads.zzbyq
            @Override // com.google.android.gms.internal.ads.zzbys
            public final boolean zza(String str3) {
                new zzbyr(zzbyt.this, str3).start();
                return true;
            }
        });
    }
}
