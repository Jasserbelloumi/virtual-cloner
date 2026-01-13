package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O000O;
import o00oOooO.o0OOo000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    @o0O000O
    /* loaded from: classes.dex */
    public static final class Builder {
        private volatile String zza;
        private volatile zzbe zzb;
        private final Context zzc;
        private volatile PurchasesUpdatedListener zzd;
        private volatile zzaz zze;
        private volatile zzar zzf;
        private volatile AlternativeBillingListener zzg;

        public /* synthetic */ Builder(Context context, zzi zziVar) {
            this.zzc = context;
        }

        @oo0oO0
        public BillingClient build() {
            if (this.zzc != null) {
                if (this.zzd != null) {
                    if (this.zzb != null) {
                        if (this.zzd != null || this.zzg == null) {
                            return this.zzd != null ? new BillingClientImpl(null, this.zzb, this.zzc, this.zzd, this.zzg, null) : new BillingClientImpl(null, this.zzb, this.zzc, null, null);
                        }
                        throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing.");
                    }
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        @oo0oO0
        @zzd
        public Builder enableAlternativeBilling(@oo0oO0 AlternativeBillingListener alternativeBillingListener) {
            this.zzg = alternativeBillingListener;
            return this;
        }

        @oo0oO0
        public Builder enablePendingPurchases() {
            zzbc zzbcVar = new zzbc(null);
            zzbcVar.zza();
            this.zzb = zzbcVar.zzb();
            return this;
        }

        @oo0oO0
        public Builder setListener(@oo0oO0 PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FeatureType {
        @oo0oO0
        public static final String IN_APP_MESSAGING = "bbb";
        @oo0oO0
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        @oo0oO0
        public static final String PRODUCT_DETAILS = "fff";
        @oo0oO0
        public static final String SUBSCRIPTIONS = "subscriptions";
        @oo0oO0
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ProductType {
        @oo0oO0
        public static final String INAPP = "inapp";
        @oo0oO0
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface SkuType {
        @oo0oO0
        public static final String INAPP = "inapp";
        @oo0oO0
        public static final String SUBS = "subs";
    }

    @oo0oO0
    @o0O000O
    public static Builder newBuilder(@oo0oO0 Context context) {
        return new Builder(context, null);
    }

    @o0O000O
    public abstract void acknowledgePurchase(@oo0oO0 AcknowledgePurchaseParams acknowledgePurchaseParams, @oo0oO0 AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    @o0O000O
    public abstract void consumeAsync(@oo0oO0 ConsumeParams consumeParams, @oo0oO0 ConsumeResponseListener consumeResponseListener);

    @o0O000O
    public abstract void endConnection();

    @o0O000O
    public abstract int getConnectionState();

    @oo0oO0
    @o0O000O
    public abstract BillingResult isFeatureSupported(@oo0oO0 String str);

    @o0O000O
    public abstract boolean isReady();

    @oo0oO0
    @o0OOo000
    public abstract BillingResult launchBillingFlow(@oo0oO0 Activity activity, @oo0oO0 BillingFlowParams billingFlowParams);

    @o0O000O
    public abstract void queryProductDetailsAsync(@oo0oO0 QueryProductDetailsParams queryProductDetailsParams, @oo0oO0 ProductDetailsResponseListener productDetailsResponseListener);

    @o0O000O
    public abstract void queryPurchaseHistoryAsync(@oo0oO0 QueryPurchaseHistoryParams queryPurchaseHistoryParams, @oo0oO0 PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @o0O000O
    @Deprecated
    public abstract void queryPurchaseHistoryAsync(@oo0oO0 String str, @oo0oO0 PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @o0O000O
    public abstract void queryPurchasesAsync(@oo0oO0 QueryPurchasesParams queryPurchasesParams, @oo0oO0 PurchasesResponseListener purchasesResponseListener);

    @o0O000O
    @Deprecated
    public abstract void queryPurchasesAsync(@oo0oO0 String str, @oo0oO0 PurchasesResponseListener purchasesResponseListener);

    @o0O000O
    @Deprecated
    public abstract void querySkuDetailsAsync(@oo0oO0 SkuDetailsParams skuDetailsParams, @oo0oO0 SkuDetailsResponseListener skuDetailsResponseListener);

    @oo0oO0
    @o0OOo000
    public abstract BillingResult showInAppMessages(@oo0oO0 Activity activity, @oo0oO0 InAppMessageParams inAppMessageParams, @oo0oO0 InAppMessageResponseListener inAppMessageResponseListener);

    @o0O000O
    public abstract void startConnection(@oo0oO0 BillingClientStateListener billingClientStateListener);
}
