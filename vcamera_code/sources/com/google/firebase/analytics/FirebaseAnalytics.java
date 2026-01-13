package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOO00;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzef zzb;
    private ExecutorService zzc;

    /* loaded from: classes2.dex */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* loaded from: classes2.dex */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* loaded from: classes2.dex */
    public static class Event {
        @oo0oO0
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        @oo0oO0
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";
        @oo0oO0
        public static final String ADD_TO_CART = "add_to_cart";
        @oo0oO0
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        @oo0oO0
        public static final String AD_IMPRESSION = "ad_impression";
        @oo0oO0
        public static final String APP_OPEN = "app_open";
        @oo0oO0
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        @oo0oO0
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        @oo0oO0
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        @oo0oO0
        public static final String GENERATE_LEAD = "generate_lead";
        @oo0oO0
        public static final String JOIN_GROUP = "join_group";
        @oo0oO0
        public static final String LEVEL_END = "level_end";
        @oo0oO0
        public static final String LEVEL_START = "level_start";
        @oo0oO0
        public static final String LEVEL_UP = "level_up";
        @oo0oO0
        public static final String LOGIN = "login";
        @oo0oO0
        public static final String POST_SCORE = "post_score";
        @oo0oO0
        public static final String PURCHASE = "purchase";
        @oo0oO0
        public static final String REFUND = "refund";
        @oo0oO0
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        @oo0oO0
        public static final String SCREEN_VIEW = "screen_view";
        @oo0oO0
        public static final String SEARCH = "search";
        @oo0oO0
        public static final String SELECT_CONTENT = "select_content";
        @oo0oO0
        public static final String SELECT_ITEM = "select_item";
        @oo0oO0
        public static final String SELECT_PROMOTION = "select_promotion";
        @oo0oO0
        public static final String SHARE = "share";
        @oo0oO0
        public static final String SIGN_UP = "sign_up";
        @oo0oO0
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        @oo0oO0
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        @oo0oO0
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        @oo0oO0
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        @oo0oO0
        public static final String VIEW_CART = "view_cart";
        @oo0oO0
        public static final String VIEW_ITEM = "view_item";
        @oo0oO0
        public static final String VIEW_ITEM_LIST = "view_item_list";
        @oo0oO0
        public static final String VIEW_PROMOTION = "view_promotion";
        @oo0oO0
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";
    }

    /* loaded from: classes2.dex */
    public static class Param {
        @oo0oO0
        public static final String ACHIEVEMENT_ID = "achievement_id";
        @oo0oO0
        public static final String ACLID = "aclid";
        @oo0oO0
        public static final String AD_FORMAT = "ad_format";
        @oo0oO0
        public static final String AD_PLATFORM = "ad_platform";
        @oo0oO0
        public static final String AD_SOURCE = "ad_source";
        @oo0oO0
        public static final String AD_UNIT_NAME = "ad_unit_name";
        @oo0oO0
        public static final String AFFILIATION = "affiliation";
        @oo0oO0
        public static final String CAMPAIGN = "campaign";
        @oo0oO0
        public static final String CHARACTER = "character";
        @oo0oO0
        public static final String CONTENT = "content";
        @oo0oO0
        public static final String CONTENT_TYPE = "content_type";
        @oo0oO0
        public static final String COUPON = "coupon";
        @oo0oO0
        public static final String CP1 = "cp1";
        @oo0oO0
        public static final String CREATIVE_NAME = "creative_name";
        @oo0oO0
        public static final String CREATIVE_SLOT = "creative_slot";
        @oo0oO0
        public static final String CURRENCY = "currency";
        @oo0oO0
        public static final String DESTINATION = "destination";
        @oo0oO0
        public static final String DISCOUNT = "discount";
        @oo0oO0
        public static final String END_DATE = "end_date";
        @oo0oO0
        public static final String EXTEND_SESSION = "extend_session";
        @oo0oO0
        public static final String FLIGHT_NUMBER = "flight_number";
        @oo0oO0
        public static final String GROUP_ID = "group_id";
        @oo0oO0
        public static final String INDEX = "index";
        @oo0oO0
        public static final String ITEMS = "items";
        @oo0oO0
        public static final String ITEM_BRAND = "item_brand";
        @oo0oO0
        public static final String ITEM_CATEGORY = "item_category";
        @oo0oO0
        public static final String ITEM_CATEGORY2 = "item_category2";
        @oo0oO0
        public static final String ITEM_CATEGORY3 = "item_category3";
        @oo0oO0
        public static final String ITEM_CATEGORY4 = "item_category4";
        @oo0oO0
        public static final String ITEM_CATEGORY5 = "item_category5";
        @oo0oO0
        public static final String ITEM_ID = "item_id";
        @oo0oO0
        public static final String ITEM_LIST_ID = "item_list_id";
        @oo0oO0
        public static final String ITEM_LIST_NAME = "item_list_name";
        @oo0oO0
        public static final String ITEM_NAME = "item_name";
        @oo0oO0
        public static final String ITEM_VARIANT = "item_variant";
        @oo0oO0
        public static final String LEVEL = "level";
        @oo0oO0
        public static final String LEVEL_NAME = "level_name";
        @oo0oO0
        public static final String LOCATION = "location";
        @oo0oO0
        public static final String LOCATION_ID = "location_id";
        @oo0oO0
        public static final String MEDIUM = "medium";
        @oo0oO0
        public static final String METHOD = "method";
        @oo0oO0
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        @oo0oO0
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        @oo0oO0
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        @oo0oO0
        public static final String ORIGIN = "origin";
        @oo0oO0
        public static final String PAYMENT_TYPE = "payment_type";
        @oo0oO0
        public static final String PRICE = "price";
        @oo0oO0
        public static final String PROMOTION_ID = "promotion_id";
        @oo0oO0
        public static final String PROMOTION_NAME = "promotion_name";
        @oo0oO0
        public static final String QUANTITY = "quantity";
        @oo0oO0
        public static final String SCORE = "score";
        @oo0oO0
        public static final String SCREEN_CLASS = "screen_class";
        @oo0oO0
        public static final String SCREEN_NAME = "screen_name";
        @oo0oO0
        public static final String SEARCH_TERM = "search_term";
        @oo0oO0
        public static final String SHIPPING = "shipping";
        @oo0oO0
        public static final String SHIPPING_TIER = "shipping_tier";
        @oo0oO0
        public static final String SOURCE = "source";
        @oo0oO0
        public static final String START_DATE = "start_date";
        @oo0oO0
        public static final String SUCCESS = "success";
        @oo0oO0
        public static final String TAX = "tax";
        @oo0oO0
        public static final String TERM = "term";
        @oo0oO0
        public static final String TRANSACTION_ID = "transaction_id";
        @oo0oO0
        public static final String TRAVEL_CLASS = "travel_class";
        @oo0oO0
        public static final String VALUE = "value";
        @oo0oO0
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
    }

    /* loaded from: classes2.dex */
    public static class UserProperty {
        @oo0oO0
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        @oo0oO0
        public static final String SIGN_UP_METHOD = "sign_up_method";
    }

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.zzb = zzefVar;
    }

    @o0OO0oO0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @oo0oO0
    @Keep
    public static FirebaseAnalytics getInstance(@oo0oO0 Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return zza;
    }

    @o0OO00OO
    @Keep
    public static zzhy getScionFrontendApiImplementation(Context context, @o0OO00OO Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new zzd(zzg);
    }

    @EnsuresNonNull({"this.executor"})
    private final ExecutorService zzb() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzc == null) {
                this.zzc = new zza(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzc;
        }
        return executorService;
    }

    @oo0oO0
    public Task<String> getAppInstanceId() {
        try {
            return Tasks.call(zzb(), new zzb(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    @oo0oO0
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @oo0oO0
    public Task<Long> getSessionId() {
        try {
            return Tasks.call(zzb(), new zzc(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public void logEvent(@oo0oO0 @o0OOO00(max = 40, min = 1) String str, @o0OO00OO Bundle bundle) {
        this.zzb.zzy(str, bundle);
    }

    public void resetAnalyticsData() {
        this.zzb.zzD();
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zzL(Boolean.valueOf(z));
    }

    public void setConsent(@oo0oO0 Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.zzb.zzG(bundle);
    }

    @o0O
    @Keep
    @Deprecated
    public void setCurrentScreen(@oo0oO0 Activity activity, @o0OO00OO @o0OOO00(max = 36, min = 1) String str, @o0OO00OO @o0OOO00(max = 36, min = 1) String str2) {
        this.zzb.zzH(activity, str, str2);
    }

    public void setDefaultEventParameters(@o0OO00OO Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public void setSessionTimeoutDuration(long j) {
        this.zzb.zzM(j);
    }

    public void setUserId(@o0OO00OO String str) {
        this.zzb.zzN(str);
    }

    public void setUserProperty(@oo0oO0 @o0OOO00(max = 24, min = 1) String str, @o0OO00OO @o0OOO00(max = 36) String str2) {
        this.zzb.zzO(null, str, str2, false);
    }
}
