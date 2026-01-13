package o0OOoO0O;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Date;
import java.util.Objects;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00o.o00oOoO;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O00oO;
/* loaded from: classes3.dex */
public class o0OO00OO {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final long f14828o00oOo0o = 7200000;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public AppOpenAd f14830o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f14831o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f14832o00oOo00 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Runnable f14833o00oOooO = new o00oOOo0();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f14827o00oOo0O = o00oo.o00oOOo0(new byte[]{126, 73, -34, Ascii.FS, -13, 63, -6, -40, 77, 98, -29, Ascii.CAN, -13, Ascii.CR, -2, -49, 90, 72, -3}, new byte[]{63, 45, -109, 125, -99, 94, -99, -67});

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static o0OO00OO f14829o00oOoO0 = null;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            o0OO00OO o0oo00oo;
            try {
                if (o0OO00OO.this.f14832o00oOo00 + 7200000 < System.currentTimeMillis()) {
                    o0OO00OO o0oo00oo2 = o0OO00OO.this;
                    o0oo00oo2.f14830o00oOOo0 = null;
                    o0oo00oo2.o00oOoOO(App.o00oOOoO());
                }
                oO0O00oO.f17113o00oOOo0.removeCallbacks(o0OO00OO.this.f14833o00oOooO);
                handler = oO0O00oO.f17113o00oOOo0;
                o0oo00oo = o0OO00OO.this;
            } catch (Throwable unused) {
                oO0O00oO.f17113o00oOOo0.removeCallbacks(o0OO00OO.this.f14833o00oOooO);
                handler = oO0O00oO.f17113o00oOOo0;
                o0oo00oo = o0OO00OO.this;
            }
            handler.postDelayed(o0oo00oo.f14833o00oOooO, 480000L);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends AppOpenAd.AppOpenAdLoadCallback {

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements OnPaidEventListener {
            public o00oOOo0() {
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(@o00oOooO.oo0oO0 AdValue adValue) {
                o0OO00OO.this.o00oOoOo(adValue);
            }
        }

        public o00oOOoO() {
        }

        public void o00oOOo0(@o00oOooO.oo0oO0 AppOpenAd appOpenAd) {
            o0OO00OO.this.f14830o00oOOo0 = appOpenAd;
            o0OO00OO.this.f14830o00oOOo0.setOnPaidEventListener(new o00oOOo0());
            o00oo.o00oOOo0(new byte[]{83, -51, 35, 121, -46, Byte.MAX_VALUE, 126, Ascii.EM, 96, -26, Ascii.RS, 125, -46, 77, 122, Ascii.SO, 119, -52, 0}, new byte[]{Ascii.DC2, -87, 110, Ascii.CAN, -68, Ascii.RS, Ascii.EM, 124});
            o00oo.o00oOOo0(new byte[]{97, 9, 66, -90, 54, -93, 17, -122, 107, 3, 45, -20, 84}, new byte[]{Ascii.SO, 103, 3, -62, 122, -52, 112, -30});
            o0OO00OO o0oo00oo = o0OO00OO.this;
            o0oo00oo.f14831o00oOOoO = false;
            o0oo00oo.f14832o00oOo00 = System.currentTimeMillis();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends FullScreenContentCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Activity f14837o00oOOo0;

        public o00oOo00(Activity activity) {
            this.f14837o00oOOo0 = activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{-27, 116, -112, -37, -8, 49, 59, -103, -42, 95, -83, -33, -8, 3, 63, -114, -63, 117, -77}, new byte[]{-92, Ascii.DLE, -35, -70, -106, 80, 92, -4});
            o00oo.o00oOOo0(new byte[]{44, Ascii.ETB, Ascii.DC4, 45, -95, oo0OOoo.f13516o00oOoO, -122, Ascii.DLE, 42, 10, 38, 44, -127, Ascii.DC2, Byte.MIN_VALUE, 17, 47, 42, 54, 59, Byte.MIN_VALUE, 49, -101, 62, 44, Ascii.ETB, o0OO0o00.f16655o00oOoOO, 44, -117, 32, -37, 83, 109}, new byte[]{67, 121, 85, 73, -27, 84, -11, 125});
            o0OO00OO.this.f14830o00oOOo0 = null;
            o0OO00OO.this.o00oOoOO(this.f14837o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            o00oo.o00oOOo0(new byte[]{-21, -44, -41, -4, 85, -28, -105, -100, -40, -1, -22, -8, 85, -42, -109, -117, -49, -43, -12}, new byte[]{-86, -80, -102, -99, 59, -123, -16, -7});
            o00oo.o00oOOo0(new byte[]{123, -12, 46, 8, 56, -114, 7, -82, 113, -2, 59, 3, 45, -121, 1, -75, 82, -17, 3, 0, 45, -116, Ascii.FS, -89, 113, -12, 44, 3, Ascii.DLE, -101, Ascii.VT, -84, 96, -96}, new byte[]{Ascii.DC4, -102, 111, 108, 126, -17, 110, -62});
            Objects.toString(adError);
            o0OO00OO.this.f14830o00oOOo0 = null;
            o0OO00OO.this.o00oOoOO(this.f14837o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{78, 10, 34, -122, -89, -48, -16, 75, 125, o0OO0o00.f16655o00oOoOO, Ascii.US, -126, -89, -30, -12, 92, 106, Ascii.VT, 1}, new byte[]{Ascii.SI, 110, 111, -25, -55, -79, -105, 46});
            o00oo.o00oOOo0(new byte[]{-27, -115, -110, -20, -60, 49, 4, 121, -17, -121, -107, -3, -5, 53, 56, 109, -8, -122, -74, -26, -44, 54, 5, 122, -17, -115, -89, -90, -71, 119}, new byte[]{-118, -29, -45, -120, -105, 89, 107, Ascii.SO});
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOo0O {
        void o00oOOo0();

        void o00oOOoO();
    }

    public static o0OO00OO o00oOo0o() {
        if (f14829o00oOoO0 == null) {
            synchronized (o0OO00OO.class) {
                if (f14829o00oOoO0 == null) {
                    f14829o00oOoO0 = new o0OO00OO();
                }
            }
        }
        return f14829o00oOoO0;
    }

    public boolean o00oOoO() {
        return (this.f14830o00oOOo0 == null || this.f14831o00oOOoO) ? false : true;
    }

    public final boolean o00oOoO0() {
        return this.f14830o00oOOo0 != null && o00oo0(4L);
    }

    public synchronized void o00oOoOO(Context context) {
        if (this.f14830o00oOOo0 == null && !this.f14831o00oOOoO) {
            this.f14831o00oOOoO = true;
            AppOpenAd.load(context, o0OO000.o00oOo00(), new AdRequest.Builder().build(), 1, new o00oOOoO());
        }
    }

    public void o00oOoOo(AdValue adValue) {
        try {
            try {
                o00oOoO.o00oOooO().o00oOoO0(adValue, this.f14830o00oOOo0.getAdUnitId(), "", o00oo.o00oOOo0(new byte[]{Ascii.US, -115, Ascii.DC4, -117, 78, 98, -50, 109, 53, -109}, new byte[]{80, -3, 113, -27, Ascii.GS, 1, -68, 8}));
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o00oOoo0() {
        oO0O00oO.f17113o00oOOo0.postDelayed(this.f14833o00oOooO, 30000L);
        o00oOoOO(App.o00oOOoO());
    }

    public boolean o00oOooo(Activity activity) {
        try {
            if (o00oOo0o().o00oOoO()) {
                o00oOo0o().o00oo00O(activity);
                return true;
            }
            o00oo.o00oOOo0(new byte[]{-119, -55, -67, oo0OOoo.f13516o00oOoO, -109, -64, 94, 43, -3, -46, -69, 111, -103, -43, 85, 101, -75, -64, -85, oo0OOoo.f13516o00oOoO, -110, -33, 79, 101, -81, -60, -71, 121, -123, -98, Ascii.NAK, 107}, new byte[]{-35, -95, -40, Ascii.GS, -4, -80, 59, 69});
            o00oOo0o().o00oOoOO(activity);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean o00oo0(long j) {
        return new Date().getTime() - this.f14832o00oOo00 < j * 3600000;
    }

    public final void o00oo00O(Activity activity) {
        if (this.f14830o00oOOo0 == null) {
            o00oo.o00oOOo0(new byte[]{38, 119, 53, -127, 40, 4, Ascii.CAN, -77, 0, 123, 53, -59, 122, 0, Ascii.VT, -14, 5, 126, 35, -49, 125, Ascii.NAK, 79, -96, Ascii.ETB, 126, 52, -40, 122, Ascii.CAN, 10, -90, 92}, new byte[]{114, Ascii.US, 80, -95, 90, 97, 111, -46});
        } else if (!o00oOoO0()) {
            o00oOoOO(activity);
        } else {
            this.f14830o00oOOo0.setFullScreenContentCallback(new o00oOo00(activity));
            this.f14830o00oOOo0.show(activity);
            o00oo.o00oOOo0(new byte[]{-26, -101, -40, 105, Ascii.DC2, -95, -98, -29, -5, -45, -60, 125, SignedBytes.MAX_POWER_OF_TWO, -85, -117, -24, -69, -35, -103, 48}, new byte[]{-107, -13, -73, Ascii.RS, 50, -50, -18, -122});
        }
    }
}
