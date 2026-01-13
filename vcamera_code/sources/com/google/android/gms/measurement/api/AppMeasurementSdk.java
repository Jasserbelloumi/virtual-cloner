package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOO00;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {
    private final zzef zza;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ConditionalUserProperty {
        @oo0oO0
        @KeepForSdk
        public static final String ACTIVE = "active";
        @oo0oO0
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @oo0oO0
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @oo0oO0
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @oo0oO0
        @KeepForSdk
        public static final String NAME = "name";
        @oo0oO0
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @oo0oO0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @oo0oO0
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @oo0oO0
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @oo0oO0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @oo0oO0
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @oo0oO0
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @oo0oO0
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @oo0oO0
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @oo0oO0
        @KeepForSdk
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzgr {
        @Override // com.google.android.gms.measurement.internal.zzgr
        @ShowFirstParty
        @KeepForSdk
        @oO0Oo
        void interceptEvent(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zzgs {
        @Override // com.google.android.gms.measurement.internal.zzgs
        @ShowFirstParty
        @KeepForSdk
        @oO0Oo
        void onEvent(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzef zzefVar) {
        this.zza = zzefVar;
    }

    @ShowFirstParty
    @o0OO0oO0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @oo0oO0
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@oo0oO0 Context context) {
        return zzef.zzg(context, null, null, null, null).zzd();
    }

    @o0OO0oO0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @oo0oO0
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO String str3, @oo0oO0 Bundle bundle) {
        return zzef.zzg(context, str, str2, str3, bundle).zzd();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@oo0oO0 @o0OOO00(min = 1) String str) {
        this.zza.zzv(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@oo0oO0 @o0OOO00(max = 24, min = 1) String str, @o0OO00OO String str2, @o0OO00OO Bundle bundle) {
        this.zza.zzw(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@oo0oO0 @o0OOO00(min = 1) String str) {
        this.zza.zzx(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zzb();
    }

    @o0OO00OO
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzk();
    }

    @o0OO00OO
    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzm();
    }

    @oo0oO0
    @KeepForSdk
    @oO0Oo
    public List<Bundle> getConditionalUserProperties(@o0OO00OO String str, @o0OO00OO @o0OOO00(max = 23, min = 1) String str2) {
        return this.zza.zzq(str, str2);
    }

    @o0OO00OO
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzn();
    }

    @o0OO00OO
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzo();
    }

    @o0OO00OO
    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzp();
    }

    @KeepForSdk
    @oO0Oo
    public int getMaxUserProperties(@oo0oO0 @o0OOO00(min = 1) String str) {
        return this.zza.zza(str);
    }

    @oo0oO0
    @KeepForSdk
    @oO0Oo
    public Map<String, Object> getUserProperties(@o0OO00OO String str, @o0OO00OO @o0OOO00(max = 24, min = 1) String str2, boolean z) {
        return this.zza.zzr(str, str2, z);
    }

    @KeepForSdk
    public void logEvent(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle) {
        this.zza.zzz(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle, long j) {
        this.zza.zzA(str, str2, bundle, j);
    }

    @o0OO00OO
    @KeepForSdk
    public void performAction(@oo0oO0 Bundle bundle) {
        this.zza.zzc(bundle, false);
    }

    @o0OO00OO
    @KeepForSdk
    public Bundle performActionWithResponse(@oo0oO0 Bundle bundle) {
        return this.zza.zzc(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@oo0oO0 OnEventListener onEventListener) {
        this.zza.zzC(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@oo0oO0 Bundle bundle) {
        this.zza.zzE(bundle);
    }

    @KeepForSdk
    public void setConsent(@oo0oO0 Bundle bundle) {
        this.zza.zzF(bundle);
    }

    @KeepForSdk
    public void setCurrentScreen(@oo0oO0 Activity activity, @o0OO00OO @o0OOO00(max = 36, min = 1) String str, @o0OO00OO @o0OOO00(max = 36, min = 1) String str2) {
        this.zza.zzH(activity, str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @oO0Oo
    public void setEventInterceptor(@oo0oO0 EventInterceptor eventInterceptor) {
        this.zza.zzK(eventInterceptor);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@o0OO00OO Boolean bool) {
        this.zza.zzL(bool);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
        this.zza.zzL(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void setUserProperty(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Object obj) {
        this.zza.zzO(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@oo0oO0 OnEventListener onEventListener) {
        this.zza.zzP(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzI(z);
    }
}
