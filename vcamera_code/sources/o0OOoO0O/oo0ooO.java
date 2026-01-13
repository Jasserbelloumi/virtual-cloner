package o0OOoO0O;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.common.base.Ascii;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00o.o00oOoO;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O00oO;
/* loaded from: classes3.dex */
public class oo0ooO {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f14854o00oOo0o = o00oo.o00oOOo0(new byte[]{-29, -99, -32, -15, 59, 95, -79, Ascii.US, -48, -80, -61, -29, 48, 76, -94, 44, -53, -99, -56, -1}, new byte[]{-94, -7, -83, -112, 85, 62, -42, 122});

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static oo0ooO f14855o00oOoO = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final long f14856o00oOoO0 = 7200000;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public RewardedInterstitialAd f14857o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f14858o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f14859o00oOo00 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f14861o00oOooO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Runnable f14860o00oOo0O = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            oo0ooO oo0ooo;
            try {
                if (oo0ooO.this.f14859o00oOo00 + 7200000 < System.currentTimeMillis()) {
                    oo0ooO oo0ooo2 = oo0ooO.this;
                    oo0ooo2.f14857o00oOOo0 = null;
                    oo0ooo2.o00oOoO(App.o00oOOoO());
                }
                oO0O00oO.f17113o00oOOo0.removeCallbacks(oo0ooO.this.f14860o00oOo0O);
                handler = oO0O00oO.f17113o00oOOo0;
                oo0ooo = oo0ooO.this;
            } catch (Throwable unused) {
                oO0O00oO.f17113o00oOOo0.removeCallbacks(oo0ooO.this.f14860o00oOo0O);
                handler = oO0O00oO.f17113o00oOOo0;
                oo0ooo = oo0ooO.this;
            }
            handler.postDelayed(oo0ooo.f14860o00oOo0O, 480000L);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends RewardedInterstitialAdLoadCallback {

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements OnPaidEventListener {
            public o00oOOo0() {
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(@o00oOooO.oo0oO0 AdValue adValue) {
                oo0ooO.this.o00oOoOO(adValue);
            }
        }

        public o00oOOoO() {
        }

        public void o00oOOo0(RewardedInterstitialAd rewardedInterstitialAd) {
            oo0ooO.this.f14857o00oOOo0 = rewardedInterstitialAd;
            oo0ooO.this.f14857o00oOOo0.setOnPaidEventListener(new o00oOOo0());
            o00oo.o00oOOo0(new byte[]{-29, Ascii.RS, 79, 2, -89, Ascii.DC4, 79, -36, -48, 51, 108, Ascii.DLE, -84, 7, 92, -17, -53, Ascii.RS, 103, Ascii.FF}, new byte[]{-94, 122, 2, 99, -55, 117, 40, -71});
            o00oo.o00oOOo0(new byte[]{105, -125, -33, 1, -106, 44, 44, -124, 99, -119, -80, 75, -12}, new byte[]{6, -19, -98, 101, -38, 67, 77, -32});
            oo0ooO oo0ooo = oo0ooO.this;
            oo0ooo.f14858o00oOOoO = false;
            oo0ooo.f14859o00oOo00 = System.currentTimeMillis();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends FullScreenContentCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Activity f14865o00oOOo0;

        public o00oOo00(Activity activity) {
            this.f14865o00oOOo0 = activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{-97, 121, 40, Ascii.US, -6, -96, -102, 118, -84, 84, Ascii.VT, Ascii.CR, -15, -77, -119, 69, -73, 121, 0, 17}, new byte[]{-34, Ascii.GS, 101, 126, -108, -63, -3, 19});
            o00oo.o00oOOo0(new byte[]{-61, -40, 113, -67, 121, 66, 72, 38, -59, -59, 67, -68, 89, 109, 78, 39, -64, -27, 83, -85, 88, 78, 85, 8, -61, -40, 68, -68, 83, 95, Ascii.NAK, 101, -126}, new byte[]{-84, -74, 48, -39, oo0OOoo.f13516o00oOoO, 43, 59, 75});
            oo0ooO.this.f14857o00oOOo0 = null;
            oo0ooO.this.o00oOoO(this.f14865o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            o00oo.o00oOOo0(new byte[]{-83, 67, Ascii.US, 70, Ascii.ESC, 78, -85, 121, -98, 110, 60, 84, Ascii.DLE, 93, -72, 74, -123, 67, 55, 72}, new byte[]{-20, 39, 82, 39, 117, 47, -52, Ascii.FS});
            o00oo.o00oOOo0(new byte[]{88, 36, -24, 101, 77, 110, 71, -24, 82, 46, -3, 110, 88, 103, 65, -13, 113, 63, -59, 109, 88, 108, 92, -31, 82, 36, -22, 110, 101, 123, 75, -22, 67, 112, -119}, new byte[]{55, 74, -87, 1, Ascii.VT, Ascii.SI, 46, -124});
            adError.getMessage();
            oo0ooO.this.f14857o00oOOo0 = null;
            oo0ooO.this.o00oOoO(this.f14865o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{-114, 71, -86, -95, 17, -51, 46, -22, -67, 106, -119, -77, Ascii.SUB, -34, oo0OOoo.f13516o00oOoO, -39, -90, 71, -126, -81}, new byte[]{-49, 35, -25, -64, Byte.MAX_VALUE, -84, 73, -113});
            o00oo.o00oOOo0(new byte[]{-105, Ascii.DC2, 68, Ascii.DC2, -46, -67, 83, Ascii.SI, -99, Ascii.CAN, 67, 3, -19, -71, 111, Ascii.ESC, -118, Ascii.EM, 96, Ascii.CAN, -62, -70, 82, Ascii.FF, -99, Ascii.DC2, 113}, new byte[]{-8, 124, 5, 118, -127, -43, 60, 120});
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements OnUserEarnedRewardListener {
        public o00oOo0O() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            rewardItem.getAmount();
            rewardItem.getType();
            o00oo.o00oOOo0(new byte[]{112, 57, -35, 80, -2, -8, 36, -33, 67, Ascii.DC4, -2, 66, -11, -21, 55, -20, 88, 57, -11, 94}, new byte[]{49, 93, -112, 49, -112, -103, 67, -70});
            o00oo.o00oOOo0(new byte[]{-109, -60, -31, -58, 119, 42, -5, -87, -25, -55, -27, -108, 108, 60, -6, -5, -77, -60, -31, -58, 112, 60, -23, -70, -75, -56, -86, -108, 103, 46, -1, -87, -93, -8, -3, -106, 103, 99}, new byte[]{-57, -84, -124, -26, 2, 89, -98, -37});
            rewardItem.toString();
            o00oo.o00oOOo0(new byte[]{121, -127, -110, -99, -65, 108, -9, 44, 56, -100, -126, -124, -86, 36}, new byte[]{85, -13, -9, -22, -34, Ascii.RS, -109, 109});
        }
    }

    public static oo0ooO o00oOo0o() {
        if (f14855o00oOoO == null) {
            synchronized (oo0ooO.class) {
                if (f14855o00oOoO == null) {
                    f14855o00oOoO = new oo0ooO();
                }
            }
        }
        return f14855o00oOoO;
    }

    public synchronized void o00oOoO(Context context) {
        o00oo.o00oOOo0(new byte[]{-59, 54, 54, -14, -122, 42, -48, 57, -63, 60, Ascii.DLE, -14, -125, 107, -50, 50, -59, 60, 3, -13, -38, 36, -110}, new byte[]{-96, 88, 66, -105, -12, 10, -68, 86});
        if (this.f14857o00oOOo0 == null && !this.f14858o00oOOoO) {
            this.f14858o00oOOoO = true;
            AdRequest build = new AdRequest.Builder().build();
            o00oo.o00oOOo0(new byte[]{104, -86, -107, 39, 123, 36, 116, 114, 122, -70, -38, 123, o0OO0o00.f16655o00oOoOO}, new byte[]{Ascii.ESC, -34, -12, 85, Ascii.SI, 4, Ascii.CAN, Ascii.GS});
            RewardedInterstitialAd.load(context, o0OO000.o00oOOoO(), build, new o00oOOoO());
        }
    }

    public boolean o00oOoO0() {
        return (this.f14857o00oOOo0 == null || this.f14858o00oOOoO) ? false : true;
    }

    public void o00oOoOO(AdValue adValue) {
        try {
            try {
                o00oOoO.o00oOooO().o00oOoO0(adValue, this.f14857o00oOOo0.getAdUnitId(), "", o00oo.o00oOOo0(new byte[]{Ascii.ESC, 55, 113, 38, 35, 47, o0OO0o00.f16655o00oOoOO, 116, 54, 60, 109}, new byte[]{82, 89, 2, 67, 81, 91, 119, Ascii.GS}));
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o00oOoOo() {
        oO0O00oO.f17113o00oOOo0.postDelayed(this.f14860o00oOo0O, 30000L);
        o00oOoO(App.o00oOOoO());
    }

    public boolean o00oOoo0(Activity activity) {
        RewardedInterstitialAd rewardedInterstitialAd = this.f14857o00oOOo0;
        if (rewardedInterstitialAd == null) {
            o00oo.o00oOOo0(new byte[]{-113, -84, 91, 40, 55, -48, -23, 86, -87, -80, Ascii.RS, 126, 55, -38, -1, 92, -5, -84, 95, 123, 126, -48, -11, 71, -5, -74, 91, 105, 58, -57, -76, Ascii.GS, -11}, new byte[]{-37, -60, 62, 8, 94, -66, -102, 51});
            return false;
        }
        rewardedInterstitialAd.setFullScreenContentCallback(new o00oOo00(activity));
        this.f14857o00oOOo0.show(activity, new o00oOo0O());
        o00oo.o00oOOo0(new byte[]{-126, 19, 85, -103, -45, -53, -98, -37, -108, Ascii.DC4, Ascii.DC4, -64, -35, -109}, new byte[]{-15, 123, 58, -18, -13, -67, -9, -65});
        return true;
    }
}
