package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO00;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface AnalyticsConnector {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void registerEventNames(@oo0oO0 Set<String> set);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void onMessageTriggered(int i, @o0OO00OO Bundle bundle);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {
        @KeepForSdk
        public boolean active;
        @KeepForSdk
        public long creationTimestamp;
        @o0OO00OO
        @KeepForSdk
        public String expiredEventName;
        @o0OO00OO
        @KeepForSdk
        public Bundle expiredEventParams;
        @oo0oO0
        @KeepForSdk
        public String name;
        @oo0oO0
        @KeepForSdk
        public String origin;
        @KeepForSdk
        public long timeToLive;
        @o0OO00OO
        @KeepForSdk
        public String timedOutEventName;
        @o0OO00OO
        @KeepForSdk
        public Bundle timedOutEventParams;
        @o0OO00OO
        @KeepForSdk
        public String triggerEventName;
        @KeepForSdk
        public long triggerTimeout;
        @o0OO00OO
        @KeepForSdk
        public String triggeredEventName;
        @o0OO00OO
        @KeepForSdk
        public Bundle triggeredEventParams;
        @KeepForSdk
        public long triggeredTimestamp;
        @o0OO00OO
        @KeepForSdk
        public Object value;
    }

    @KeepForSdk
    void clearConditionalUserProperty(@oo0oO0 @o0OOO00(max = 24, min = 1) String str, @o0OO00OO String str2, @o0OO00OO Bundle bundle);

    @oo0oO0
    @KeepForSdk
    @oO0Oo
    List<ConditionalUserProperty> getConditionalUserProperties(@oo0oO0 String str, @o0OO00OO @o0OOO00(max = 23, min = 1) String str2);

    @KeepForSdk
    @oO0Oo
    int getMaxUserProperties(@oo0oO0 @o0OOO00(min = 1) String str);

    @oo0oO0
    @KeepForSdk
    @oO0Oo
    Map<String, Object> getUserProperties(boolean z);

    @KeepForSdk
    void logEvent(@oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO Bundle bundle);

    @o0OO00OO
    @KeepForSdk
    @DeferredApi
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@oo0oO0 String str, @oo0oO0 AnalyticsConnectorListener analyticsConnectorListener);

    @KeepForSdk
    void setConditionalUserProperty(@oo0oO0 ConditionalUserProperty conditionalUserProperty);

    @KeepForSdk
    void setUserProperty(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Object obj);
}
