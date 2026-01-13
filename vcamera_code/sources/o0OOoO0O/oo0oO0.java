package o0OOoO0O;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Objects;
import multispace.multiapp.clone.app.App;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo00o.o00oOoO;
import o0ooO0O0.oO0OO0O;
/* loaded from: classes3.dex */
public class oo0oO0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final long f14843o00oOo0o = 7200000;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public InterstitialAd f14845o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f14846o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public long f14847o00oOo00 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Runnable f14848o00oOooO = new o00oOOo0();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f14842o00oOo0O = o00oo.o00oOOo0(new byte[]{-91, 45, -47, -6, -64, 114, 126, 94, -106, 0, -14, -24, -53, 97, 109, 107, -123, 46, -7}, new byte[]{-28, 73, -100, -101, -82, 19, Ascii.EM, 59});

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static oo0oO0 f14844o00oOoO0 = null;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oo0oO0 oo0oo0;
            try {
                if (oo0oO0.this.f14847o00oOo00 + 7200000 <= System.currentTimeMillis()) {
                    oo0oO0 oo0oo02 = oo0oO0.this;
                    oo0oo02.f14845o00oOOo0 = null;
                    oo0oo02.o00oOoO(App.o00oOOoO());
                }
                oO0OO0O.o00oOOoO(oo0oO0.this.f14848o00oOooO);
                oo0oo0 = oo0oO0.this;
            } catch (Throwable unused) {
                oO0OO0O.o00oOOoO(oo0oO0.this.f14848o00oOooO);
                oo0oo0 = oo0oO0.this;
            }
            oO0OO0O.o00oOo0o(oo0oo0.f14848o00oOooO, 7200000L);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends InterstitialAdLoadCallback {

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements OnPaidEventListener {
            public o00oOOo0() {
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(@o00oOooO.oo0oO0 AdValue adValue) {
                oo0oO0.this.o00oOoOO(adValue);
            }
        }

        public o00oOOoO() {
        }

        public void o00oOOo0(@o00oOooO.oo0oO0 InterstitialAd interstitialAd) {
            oo0oO0.this.f14845o00oOOo0 = interstitialAd;
            oo0oO0.this.f14845o00oOOo0.setOnPaidEventListener(new o00oOOo0());
            o00oo.o00oOOo0(new byte[]{-47, 66, 122, -110, -114, -42, -124, 6, -30, 111, 89, Byte.MIN_VALUE, -123, -59, -105, 51, -15, 65, 82}, new byte[]{-112, 38, 55, -13, -32, -73, -29, 99});
            o00oo.o00oOOo0(new byte[]{54, -83, Ascii.ESC, 47, 39, 65, 59, -37, 60, -89, 116, 101, 69}, new byte[]{89, -61, 90, 75, 107, 46, 90, -65});
            oo0oO0 oo0oo0 = oo0oO0.this;
            oo0oo0.f14846o00oOOoO = false;
            oo0oo0.f14847o00oOo00 = System.currentTimeMillis();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends FullScreenContentCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Activity f14852o00oOOo0;

        public o00oOo00(Activity activity) {
            this.f14852o00oOOo0 = activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{Ascii.GS, 105, 95, 111, 96, 89, -92, -95, 46, 68, 124, 125, 107, 74, -73, -108, oo0OOoo.f13516o00oOoO, 106, 119}, new byte[]{92, Ascii.CR, Ascii.DC2, Ascii.SO, Ascii.SO, 56, -61, -60});
            o00oo.o00oOOo0(new byte[]{-96, -73, 40, -120, 90, 47, Ascii.DC2, 42, -90, -86, Ascii.SUB, -119, 122, 0, Ascii.DC4, 43, -93, -118, 10, -98, 123, 35, Ascii.SI, 4, -96, -73, Ascii.GS, -119, 112, 50, 79, 105, -31}, new byte[]{-49, -39, 105, -20, Ascii.RS, 70, 97, 71});
            oo0oO0.this.f14845o00oOOo0 = null;
            oo0oO0.this.o00oOoO(this.f14852o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            o00oo.o00oOOo0(new byte[]{-3, 55, 94, 103, Ascii.SYN, -101, 120, -93, -50, Ascii.SUB, 125, 117, Ascii.GS, -120, 107, -106, -35, 52, 118}, new byte[]{-68, 83, 19, 6, 120, -6, Ascii.US, -58});
            o00oo.o00oOOo0(new byte[]{-7, 125, 80, -94, 40, 93, -38, 10, -13, 119, 69, -87, oo0OOoo.f13516o00oOoO, 84, -36, 17, -48, 102, 125, -86, oo0OOoo.f13516o00oOoO, 95, -63, 3, -13, 125, 82, -87, 0, 72, -42, 8, -30, 41}, new byte[]{-106, 19, 17, -58, 110, 60, -77, 102});
            Objects.toString(adError);
            oo0oO0.this.f14845o00oOOo0 = null;
            oo0oO0.this.o00oOoO(this.f14852o00oOOo0);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            o00oo.o00oOOo0(new byte[]{Ascii.NAK, Ascii.SI, 40, -122, -106, -75, -23, -37, 38, 34, Ascii.VT, -108, -99, -90, -6, -18, 53, Ascii.FF, 0}, new byte[]{84, 107, 101, -25, -8, -44, -114, -66});
            o00oo.o00oOOo0(new byte[]{58, 34, 118, -45, -25, -26, -54, 51, 48, 40, 113, -62, -40, -30, -10, 39, 39, 41, 82, -39, -9, -31, -53, 48, 48, 34, 67, -103, -102, -96}, new byte[]{85, 76, 55, -73, -76, -114, -91, 68});
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOo0O {
        void o00oOOo0();

        void o00oOOoO();
    }

    public static oo0oO0 o00oOo0o() {
        if (f14844o00oOoO0 == null) {
            synchronized (oo0oO0.class) {
                if (f14844o00oOoO0 == null) {
                    f14844o00oOoO0 = new oo0oO0();
                }
            }
        }
        return f14844o00oOoO0;
    }

    public synchronized void o00oOoO(Context context) {
        if (this.f14845o00oOOo0 == null && !this.f14846o00oOOoO) {
            this.f14846o00oOOoO = true;
            InterstitialAd.load(context, o0OO000.o00oOOo0(), new AdRequest.Builder().build(), new o00oOOoO());
        }
    }

    public boolean o00oOoO0() {
        return (this.f14845o00oOOo0 == null || this.f14846o00oOOoO) ? false : true;
    }

    public void o00oOoOO(AdValue adValue) {
        try {
            try {
                o00oOoO.o00oOooO().o00oOoO0(adValue, this.f14845o00oOOo0.getAdUnitId(), "", o00oo.o00oOOo0(new byte[]{56, -98, -43, 124, Ascii.VT, 115, -58, 93, Ascii.SYN, -107}, new byte[]{113, -16, -90, Ascii.EM, 121, 7, -106, 60}));
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o00oOoOo() {
        oO0OO0O.o00oOo0o(this.f14848o00oOooO, 7200000L);
        o00oOoO(App.o00oOOoO());
    }

    public boolean o00oOoo0(Activity activity) {
        try {
            if (o00oOo0o().o00oOoO0()) {
                return o00oOo0o().o00oOooo(activity);
            }
            o00oo.o00oOOo0(new byte[]{82, 102, -44, 99, 68, -56, -77, 123, 116, 122, -111, 51, 76, -63, -91, 62, 110, 111, -62, 99, 67, -55, -76, 62, 116, 107, -48, 39, 84, -120, -18, 48}, new byte[]{6, Ascii.SO, -79, 67, 45, -90, -64, Ascii.RS});
            o00oOo0o().o00oOoO(activity);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean o00oOooo(Activity activity) {
        InterstitialAd interstitialAd = this.f14845o00oOOo0;
        if (interstitialAd == null) {
            o00oo.o00oOOo0(new byte[]{95, 97, 51, -16, -58, -24, Ascii.US, 83, 121, 109, 51, -76, -108, -20, Ascii.FF, Ascii.DC2, 124, 104, 37, -66, -109, -7, 72, SignedBytes.MAX_POWER_OF_TWO, 110, 104, 50, -87, -108, -12, Ascii.CR, 70, 37}, new byte[]{Ascii.VT, 9, 86, -48, -76, -115, 104, 50});
            return false;
        }
        interstitialAd.setFullScreenContentCallback(new o00oOo00(activity));
        this.f14845o00oOOo0.show(activity);
        o00oo.o00oOOo0(new byte[]{Ascii.CR, Ascii.SYN, -72, -46, -56, -13, -54, -114, Ascii.ESC, Ascii.FF, -93, -123, -104, -5, -61, -104, 80, 80, -7, -117}, new byte[]{126, 126, -41, -91, -24, -102, -92, -3});
        return true;
    }
}
