package o0Oo00o0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import multispace.multiapp.clone.app.App;
import o0O0oo0o.o0OOooO0;
import o0OOO0oo.oo0OOoo;
import o0Oo00o0.o00ooO0;
import o0Oo00oo.o0O000o0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O00oO;
import o0ooO0O0.oO0Oo0o0;
/* loaded from: classes3.dex */
public final class o0 implements PurchasesUpdatedListener, BillingClientStateListener {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final boolean f15613o00oo0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public BillingClient f15617o00oOOoO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oo0O f15620o00oOooO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f15608o00oOoO0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{50, 19, -2, 74, -89, 90, -111, -38, Ascii.NAK, Ascii.SI, -13, 87, -108, 90, -105, -36, 8, 2, -7, 75}, new byte[]{97, 102, -100, 57, -60, 40, -8, -86});

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f15607o00oOoO = o0OOoO0.o00oo.o00oOOo0(new byte[]{54, 99, 3, oo0OOoo.f13516o00oOoO, 44, 95, 125, 17, oo0OOoo.f13516o00oOoO, 112, Ascii.EM, Ascii.DC2, 43, 67, 112, Ascii.FF}, new byte[]{94, 2, 112, 98, 95, 42, Ascii.US, 98});

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f15609o00oOoOO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-119, -94, 118, -83, Ascii.ESC, 108, -81, -39, -102, -82, 93, -78, Ascii.GS, 114}, new byte[]{-24, -63, 2, -60, 116, 2, -16, -87});

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f15610o00oOoOo = o0OOoO0.o00oo.o00oOOo0(new byte[]{87, 49, 92, -83, -97, Ascii.ETB, 85, Ascii.CAN, 74, 48, 86}, new byte[]{36, 68, 62, -14, -82, 72, 56, 119});

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f15611o00oOoo0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.NAK, -75, 120, Ascii.DLE, Ascii.SI, 125, 53, -126, 8, -76, 114}, new byte[]{102, -64, Ascii.SUB, 79, 60, 34, 88, -19});

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f15612o00oOooo = o0OOoO0.o00oo.o00oOOo0(new byte[]{-60, -41, -99, 87, 7, -98, 76, 75, -39, -42, -105}, new byte[]{-73, -94, -1, 8, 49, -63, o0OO0o00.f16655o00oOoOO, 36});

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f15614o00oo00O = o0OOoO0.o00oo.o00oOOo0(new byte[]{6, -62, -56, 50, -26, 69, -82, 125, Ascii.DC4, -59}, new byte[]{117, -73, -86, 109, -41, Ascii.SUB, -41, Ascii.CAN});

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static o0 f15606o00oOo0o = null;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static List<String> f15615o00oo0OO = Arrays.asList(o0OOoO0.o00oo.o00oOOo0(new byte[]{-81, -6, 126, -48, -28, 62, -61, -89, -78, -5, 116}, new byte[]{-36, -113, Ascii.FS, -113, -43, 97, -82, -56}), o0OOoO0.o00oo.o00oOOo0(new byte[]{57, 37, -59, 96, -44, 2, 34, -90, 36, 36, -49}, new byte[]{74, 80, -89, 63, -25, 93, 79, -55}), o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SUB, -108, 54, -43, 72, 78, -34, -65, 7, -107, 60}, new byte[]{105, -31, 84, -118, 126, 17, -77, -48}), o0OOoO0.o00oo.o00oOOo0(new byte[]{19, -113, -120, -30, -107, -103, 69, -15, 1, -120}, new byte[]{96, -6, -22, -67, -92, -58, 60, -108}));

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Runnable f15619o00oOo0O = new o00oOOo0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f15616o00oOOo0 = App.o00oOOoO();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O000o0 f15618o00oOo00 = o0O000o0.o00oOo00();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.this.o00oOoO0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements PurchasesResponseListener {
        public o00oOOoO() {
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            boolean z;
            String o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{107, -44, -15, Ascii.NAK, 44, 69, 55, -43, 76, -56, -4, 8, Ascii.US, 69, 49, -45, 81, -59, -10, Ascii.DC4}, new byte[]{56, -95, -109, 102, 79, 55, 94, -91});
            o0.o00oOOoO(o00oOOo02, o0OOoO0.o00oo.o00oOOo0(new byte[]{86, 37, 7, Ascii.VT, -10, 4, -30, -10, 76, 57, 53, Ascii.SYN, -14, 5, -2, -43, 107, 46, 37, Ascii.SO, -4, Ascii.CAN, -24, -61, Ascii.EM, 57, 51, Ascii.CR, -77, Ascii.NAK, -12, -62, 92, 113}, new byte[]{57, 75, 86, 126, -109, 118, -101, -90}) + billingResult.getResponseCode());
            if (billingResult.getResponseCode() != 0) {
                return;
            }
            Iterator<Purchase> it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Purchase next = it.next();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{75, -98, Ascii.EM, -89, 45, -63, 123, -5, 108, -126, Ascii.DC4, -70, Ascii.RS, -63, 125, -3, 113, -113, Ascii.RS, -90}, new byte[]{Ascii.CAN, -21, 123, -44, 78, -77, Ascii.DC2, -117});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{71, 4, -78, -1, -59, 88, -99, Ascii.ETB, Ascii.CR}, new byte[]{55, 113, -64, -100, -83, 57, -18, 114});
                Objects.toString(next);
                String str = next.getProducts().get(0);
                if (next.getPurchaseState() == 1 && o0.f15615o00oo0OO.contains(str)) {
                    if (!next.isAcknowledged()) {
                        o0.this.o00oOoOo(next);
                    }
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{109, 77, 92, Ascii.SUB, -62, 115, -122, 52, 74, 81, 81, 7, -15, 115, Byte.MIN_VALUE, 50, 87, 92, 91, Ascii.ESC}, new byte[]{62, 56, 62, 105, -95, 1, -17, 68});
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{75, -12, 6, 108, -95, 57, 52, -126, 86, -9, 91, 17}, new byte[]{35, -107, 117, 63, -44, 91, Ascii.DC4, -15});
                    z = o0.this.o00oo00O(next);
                }
            }
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-63, -39, Ascii.SO, 44, 17, -70, 87, o0OO0o00.f16655o00oOoOO, -26, -59, 3, 49, 34, -70, 81, 39, -5, -56, 9, 45}, new byte[]{-110, -84, 108, 95, 114, -56, 62, 81});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.FF, -6, -91, -86, 111, 3, 82, 43, 10, -3, -21}, new byte[]{Byte.MAX_VALUE, -97, -47, -118, 7, 98, o0OO0o00.f16655o00oOoOO, 120});
            o0.this.o00oo0Oo(z);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements ProductDetailsResponseListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00ooO f15623o00oOOo0;

        public o00oOo00(o00ooO o00ooo) {
            this.f15623o00oOOo0 = o00ooo;
        }

        @Override // com.android.billingclient.api.ProductDetailsResponseListener
        public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
            o0.this.o00oo0O(this.f15623o00oOOo0, billingResult, list);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements AcknowledgePurchaseResponseListener {
        public o00oOo0O() {
        }

        @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
        public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
            if (billingResult.getResponseCode() == 0) {
                o0.this.o00oo0Oo(true);
            }
        }
    }

    public o0() {
        this.f15620o00oOooO = null;
        this.f15620o00oOooO = new o00oo0O(this);
    }

    public static void o00oOOoO(String str, String str2) {
    }

    public static o0 o00oOoO() {
        if (f15606o00oOo0o == null) {
            synchronized (o0.class) {
                if (f15606o00oOo0o == null) {
                    f15606o00oOo0o = new o0();
                }
            }
        }
        return f15606o00oOo0o;
    }

    public static void o00oo0(String str, String str2) {
    }

    public final void o00oOo0O() {
        o00oOOoO o00ooooo2 = new o00oOOoO();
        this.f15617o00oOOoO.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(o0OOoO0.o00oo.o00oOOo0(new byte[]{91, 41, Ascii.DC4, 38}, new byte[]{40, 92, 118, 85, -27, -67, -64, -31})).build(), o00ooooo2);
    }

    public final void o00oOo0o(long j) {
        oO0O00oO.f17113o00oOOo0.removeCallbacks(this.f15619o00oOo0O);
        oO0O00oO.f17113o00oOOo0.postDelayed(this.f15619o00oOo0O, j);
    }

    public final boolean o00oOoO0() {
        BillingClient billingClient = this.f15617o00oOOoO;
        if (billingClient != null) {
            if (billingClient.isReady()) {
                return false;
            }
            try {
                this.f15617o00oOOoO.endConnection();
            } catch (Throwable unused) {
            }
        }
        BillingClient build = BillingClient.newBuilder(this.f15616o00oOOo0).enablePendingPurchases().setListener(this).build();
        this.f15617o00oOOoO = build;
        build.startConnection(this);
        return true;
    }

    public void o00oOoOO(o00ooO o00ooo) {
        if (this.f15617o00oOOoO == null) {
            o00ooo.o00oOOoO();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : f15615o00oo0OO) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType(o0OOoO0.o00oo.o00oOOo0(new byte[]{40, 121, 125, o0OO0o00.f16655o00oOoOO}, new byte[]{91, Ascii.FF, Ascii.US, 82, 89, -89, 123, -49})).build());
        }
        this.f15617o00oOOoO.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new o00oOo00(o00ooo));
    }

    public void o00oOoOo(Purchase purchase) {
        o00oOo0O o00ooo0o2 = new o00oOo0O();
        if (purchase.getPurchaseState() != 1 || purchase.isAcknowledged()) {
            return;
        }
        this.f15617o00oOOoO.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), o00ooo0o2);
    }

    public boolean o00oOoo0() {
        return this.f15618o00oOo00.o00oOOoO(f15607o00oOoO, false);
    }

    public void o00oOooo() {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{63, -50, 98, -87, Ascii.FF, -39, -33, 87, Ascii.CAN, -46, 111, -76, 63, -39, -39, 81, 5, -33, 101, -88, 79, -30, -40, 78, Ascii.CAN}, new byte[]{108, -69, 0, -38, 111, -85, -74, 39});
        o00oOoO0();
    }

    public final boolean o00oo00O(Purchase purchase) {
        try {
            Time time = new Time(purchase.getPurchaseTime());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(time);
            String str = purchase.getProducts().get(0);
            char c = 65535;
            switch (str.hashCode()) {
                case -1619983885:
                    if (str.equals(f15610o00oOoOo)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1477432776:
                    if (str.equals(f15612o00oOooo)) {
                        c = 2;
                        break;
                    }
                    break;
                case 155023477:
                    if (str.equals(f15611o00oOoo0)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1056468586:
                    if (str.equals(f15614o00oo00O)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                calendar.add(5, 7);
                calendar.add(2, 1);
            } else if (c == 1) {
                calendar.add(5, 7);
                calendar.add(2, 3);
            } else if (c == 2) {
                calendar.add(5, 7);
                calendar.add(2, 6);
            } else if (c == 3) {
                calendar.add(5, 14);
                calendar.add(1, 1);
            }
            long time2 = calendar.getTime().getTime();
            o0OOoO0.o00oo.o00oOOo0(new byte[]{108, -32, -123, 107, -85, -7, -33, -114, 113, -28, -115, 52}, new byte[]{Ascii.CAN, -119, -24, Ascii.SO, -28, -116, -85, -38});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-32, -122, -41, 76, -53, 40, 76, Ascii.DC4, -104, -116, -49, 91, -12, 36, 78, Ascii.FF, -91, -106, -104}, new byte[]{-52, -27, -94, 62, -71, 77, 34, 96});
            System.currentTimeMillis();
            return System.currentTimeMillis() < time2;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public void o00oo0O(o00ooO o00ooo, BillingResult billingResult, List<ProductDetails> list) {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{50, -80, 8, -57, 78, -119, 81, -123, Ascii.SO, -85, 56, -47, SignedBytes.MAX_POWER_OF_TWO, -108, 76, -112, 41, -73, 53, -52, 80, -76, SignedBytes.MAX_POWER_OF_TWO, -109, 45, -79, 52, -47, 70, -58, 73, -119, 46, -86, 96}, new byte[]{93, -34, 90, -94, 35, -26, 37, -32});
        Objects.toString(list);
        o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.ESC, 115, -102, -68, 69, 75, -55, 124, 82, 59}, new byte[]{55, 1, -1, -49, 101, 40, -90, Ascii.CAN});
        billingResult.getResponseCode();
        o0OOoO0.o00oo.o00oOOo0(new byte[]{97, -87, 72, -11, -46, 122, 7, 91, 62, -86, Ascii.ETB}, new byte[]{77, -51, 45, -105, -89, Ascii.GS, 39, 54});
        billingResult.getDebugMessage();
        if (list == null || list.size() <= 0) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{54, 63, -48, -118, Ascii.DC2, 102, Ascii.CAN}, new byte[]{83, 77, -94, -27, 96, 78, 49, Ascii.FS});
            o00ooo.o00oOOoO();
        } else if (billingResult.getResponseCode() != 0) {
            o00ooo.o00oOOoO();
        } else {
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list) {
                String productId = productDetails.getProductId();
                if (f15615o00oo0OO.contains(productId)) {
                    ProductDetails.PricingPhase pricingPhase = productDetails.getSubscriptionOfferDetails().get(0).getPricingPhases().getPricingPhaseList().get(0);
                    arrayList.add(new o00ooO0.o00oOOoO(productId, pricingPhase.getPriceAmountMicros() / 1000000.0d, pricingPhase.getPriceCurrencyCode(), productDetails));
                }
            }
            if (arrayList.size() <= 0) {
                o00ooo.o00oOOoO();
            } else {
                o00ooo.o00oOOo0(arrayList);
            }
        }
    }

    public void o00oo0O0(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-100, 47, -50, -60, -101, 5, 19, -109, -103, 43, -64, -6, -127, 0, Ascii.FS, -98, -100, 63, -64, -101, -44, 95, 95, -126, -113, 57, -64}, new byte[]{-3, 76, -91, -86, -12, 114, Byte.MAX_VALUE, -10});
            return;
        }
        o0OOoO0.o00oo.o00oOOo0(new byte[]{-89, 119, -7, 54, 8, -107, -15, 6, -94, 115, -9, 8, Ascii.DC2, -112, -2, Ascii.VT, -89, 103, -9, 105, 71, -49, -67, 5, -89, 120, -31, oo0OOoo.f13516o00oOoO}, new byte[]{-58, Ascii.DC4, -110, 88, 103, -30, -99, 99});
        o00oo0Oo(false);
    }

    public void o00oo0OO(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            o00oo0Oo(true);
            o0OOoO0.o00oo.o00oOOo0(new byte[]{108, -104, -63, 37, -94, -33, -86, 113, 105, -100, -49, Ascii.ESC, -72, -38, -91, 124, 108, -120, -49, 107, -32, -120, -78, 102, 120, -98}, new byte[]{Ascii.CR, -5, -86, 75, -51, -88, -58, Ascii.DC4});
            return;
        }
        o0OOoO0.o00oo.o00oOOo0(new byte[]{10, 35, -45, -104, -9, 4, -5, 71, Ascii.SI, 39, -35, -90, -19, 1, -12, 74, 10, 51, -35, -42, -75, 83, -15, 67, 7, 51, -35}, new byte[]{107, SignedBytes.MAX_POWER_OF_TWO, -72, -10, -104, 115, -105, 34});
        String.valueOf(billingResult.getResponseCode());
        o00oo0Oo(false);
    }

    public final void o00oo0Oo(boolean z) {
        if (z) {
            o0OOooO0.o00oOOoO(this.f15616o00oOOo0).o00oOooO(new Intent(f15609o00oOoOO));
        }
        this.f15618o00oOo00.o00oOoo0(f15607o00oOoO, Boolean.valueOf(z));
    }

    public void o00oo0o0(Activity activity, ProductDetails productDetails) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(productDetails.getSubscriptionOfferDetails().get(0).getOfferToken()).build());
            this.f15617o00oOOoO.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).build());
        } catch (Throwable th) {
            th.printStackTrace();
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-91, 1, 54, -47, -104, 102, -30, -41, -81, 85, 49, -62, -123, 42, -27, -58, -20}, new byte[]{-42, 117, 87, -93, -20, 70, Byte.MIN_VALUE, -94}) + th);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{-85, 92, Ascii.CR, 85, -2, -92, 77, Ascii.DLE, -93, 97, 42, 78, -28, -95, 71, Ascii.ESC, Byte.MIN_VALUE, 91, 60, 95, -3, -90, 74, Ascii.ESC, -89, 70, 42, 88}, new byte[]{-60, 50, 79, 60, -110, -56, 36, 126});
        o00oOo0o(10000L);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{-37, -25, 63, -85, 51, 19, 111, Ascii.ETB, -45, -38, Ascii.CAN, -74, 42, Ascii.SI, SignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, -38, -32, Ascii.SO, -86, 58, Ascii.ESC, 42, Ascii.RS, -47, -3, 47, -89, 44, Ascii.SI, 105, Ascii.ETB, -57, -20, 62, -83, 59, Ascii.SUB, 60}, new byte[]{-76, -119, 125, -62, 95, Byte.MAX_VALUE, 6, 121});
        billingResult.getResponseCode();
        o0OOoO0.o00oo.o00oOOo0(new byte[]{-107, 91, -46, 85, 52}, new byte[]{-71, 54, -95, 50, Ascii.SO, -18, 108, 86});
        billingResult.getDebugMessage();
        if (billingResult.getResponseCode() == 0) {
            o00oOo0O();
            return;
        }
        o00oo0Oo(false);
        int responseCode = billingResult.getResponseCode();
        if (responseCode == -2 || responseCode == 3) {
            oO0Oo0o0.o00oOoO(billingResult.getDebugMessage());
            o0OOoO0.o00oo.o00oOOo0(new byte[]{106, 119, 101, -109, -6, 19, Ascii.FF, 109, 98, 74, 66, -114, -29, Ascii.SI, 35, 106, 107, 112, 84, -110, -13, Ascii.ESC, 69, 102, 119, 107, Ascii.GS}, new byte[]{5, Ascii.EM, 39, -6, -106, Byte.MAX_VALUE, 101, 3});
            billingResult.getDebugMessage();
        }
        o00oOo0o(10000L);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() == 7) {
            o00oo0Oo(true);
        } else if (billingResult.getResponseCode() != 0 || list == null) {
            billingResult.getResponseCode();
        } else {
            for (Purchase purchase : list) {
                o00oOoOo(purchase);
            }
        }
    }
}
