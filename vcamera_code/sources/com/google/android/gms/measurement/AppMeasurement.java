package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.measurement.internal.zzid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OOO00;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final String CRASH_ORIGIN = "crash";
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final String FCM_ORIGIN = "fcm";
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final zzd zzb;

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;
        @Keep
        @ShowFirstParty
        @oo0oO0
        @KeepForSdk
        public String mAppId;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;
        @oo0oO0
        @Keep
        public String mExpiredEventName;
        @oo0oO0
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        @ShowFirstParty
        @oo0oO0
        @KeepForSdk
        public String mName;
        @Keep
        @ShowFirstParty
        @oo0oO0
        @KeepForSdk
        public String mOrigin;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;
        @oo0oO0
        @Keep
        public String mTimedOutEventName;
        @oo0oO0
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        @ShowFirstParty
        @oo0oO0
        @KeepForSdk
        public String mTriggerEventName;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;
        @oo0oO0
        @Keep
        public String mTriggeredEventName;
        @oo0oO0
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;
        @Keep
        @ShowFirstParty
        @oo0oO0
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        public ConditionalUserProperty(@oo0oO0 Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzgn.zza(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzgn.zza(bundle, "origin", String.class, null);
            this.mName = (String) zzgn.zza(bundle, "name", String.class, null);
            this.mValue = zzgn.zza(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            this.mTriggerTimeout = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            this.mTimedOutEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            this.mTriggeredEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            this.mTriggeredEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            this.mTimeToLive = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            this.mExpiredEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            this.mActive = ((Boolean) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty(@oo0oO0 ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zza = zzid.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
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

    public AppMeasurement(zzfr zzfrVar) {
        this.zzb = new zza(zzfrVar);
    }

    public AppMeasurement(zzhy zzhyVar) {
        this.zzb = new zzb(zzhyVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    @com.google.android.gms.common.internal.ShowFirstParty
    @o00oOooO.o0OO0oO0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @o00oOooO.oo0oO0
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@o00oOooO.oo0oO0 android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.zza
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.zza     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r6] = r14     // Catch: java.lang.Throwable -> L56
            r3[r7] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzhy r2 = (com.google.android.gms.measurement.internal.zzhy) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.zza = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzfr r14 = com.google.android.gms.measurement.internal.zzfr.zzp(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.zza = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.zza
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(@oo0oO0 @o0OOO00(min = 1) String str) {
        this.zzb.zzp(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@oo0oO0 @o0OOO00(max = 24, min = 1) String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle) {
        this.zzb.zzq(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@oo0oO0 @o0OOO00(min = 1) String str) {
        this.zzb.zzr(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzb();
    }

    @oo0oO0
    @Keep
    public String getAppInstanceId() {
        return this.zzb.zzh();
    }

    @oo0oO0
    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zzc();
    }

    @Keep
    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    @oO0Oo
    public List<ConditionalUserProperty> getConditionalUserProperties(@oo0oO0 String str, @oo0oO0 @o0OOO00(max = 23, min = 1) String str2) {
        List<Bundle> zzm = this.zzb.zzm(str, str2);
        ArrayList arrayList = new ArrayList(zzm == null ? 0 : zzm.size());
        for (Bundle bundle : zzm) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @oo0oO0
    @Keep
    public String getCurrentScreenClass() {
        return this.zzb.zzi();
    }

    @oo0oO0
    @Keep
    public String getCurrentScreenName() {
        return this.zzb.zzj();
    }

    @oo0oO0
    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzd();
    }

    @oo0oO0
    @Keep
    public String getGmpAppId() {
        return this.zzb.zzk();
    }

    @oo0oO0
    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zze();
    }

    @oo0oO0
    @KeepForSdk
    public Long getLong() {
        return this.zzb.zzf();
    }

    @Keep
    @ShowFirstParty
    @KeepForSdk
    @oO0Oo
    public int getMaxUserProperties(@oo0oO0 @o0OOO00(min = 1) String str) {
        return this.zzb.zza(str);
    }

    @oo0oO0
    @KeepForSdk
    public String getString() {
        return this.zzb.zzl();
    }

    @VisibleForTesting
    @Keep
    @oo0oO0
    @oO0Oo
    public Map<String, Object> getUserProperties(@oo0oO0 String str, @oo0oO0 @o0OOO00(max = 24, min = 1) String str2, boolean z) {
        return this.zzb.zzo(str, str2, z);
    }

    @ShowFirstParty
    @oo0oO0
    @KeepForSdk
    @oO0Oo
    public Map<String, Object> getUserProperties(boolean z) {
        return this.zzb.zzn(z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle) {
        this.zzb.zzs(str, str2, bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    public void logEventInternalNoInterceptor(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle, long j) {
        this.zzb.zzt(str, str2, bundle, j);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@oo0oO0 OnEventListener onEventListener) {
        this.zzb.zzu(onEventListener);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@oo0oO0 ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        zzd zzdVar = this.zzb;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzgn.zzb(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.mTriggeredTimestamp);
        zzdVar.zzv(bundle);
    }

    @ShowFirstParty
    @KeepForSdk
    @oO0Oo
    public void setEventInterceptor(@oo0oO0 EventInterceptor eventInterceptor) {
        this.zzb.zzw(eventInterceptor);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@oo0oO0 OnEventListener onEventListener) {
        this.zzb.zzx(onEventListener);
    }
}
