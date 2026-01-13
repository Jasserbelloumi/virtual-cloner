package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import o00oOooO.o0O0OOOo;
import o00oOooO.oo0oO0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    @VisibleForTesting
    public zzfr zza = null;
    @o0O0OOOo("listenerMap")
    private final Map zzb = new androidx.collection.o00oOOo0();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.zza.zzv().zzV(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@oo0oO0 String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@oo0oO0 String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzU(zzcfVar, zzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzi(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzc(zzcfVar, this.zza.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String str;
        zzb();
        zzhx zzq = this.zza.zzq();
        if (zzq.zzt.zzw() != null) {
            str = zzq.zzt.zzw();
        } else {
            try {
                str = zzid.zzc(zzq.zzt.zzau(), "google_app_id", zzq.zzt.zzz());
            } catch (IllegalStateException e) {
                zzq.zzt.zzay().zzd().zzb("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        zzc(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzT(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        zzhx zzq = this.zza.zzq();
        zzq.zzt.zzaz().zzp(new zzhk(zzq, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzv().zzV(zzcfVar, this.zza.zzq().zzr());
        } else if (i == 1) {
            this.zza.zzv().zzU(zzcfVar, this.zza.zzq().zzm().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.zza.zzv().zzT(zzcfVar, this.zza.zzq().zzl().intValue());
            } else if (i != 4) {
            } else {
                this.zza.zzv().zzP(zzcfVar, this.zza.zzq().zzi().booleanValue());
            }
        } else {
            zzlb zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcfVar.zze(bundle);
            } catch (RemoteException e) {
                zzv.zzt.zzay().zzk().zzb("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzk(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@oo0oO0 Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j) throws RemoteException {
        zzfr zzfrVar = this.zza;
        if (zzfrVar == null) {
            this.zza = zzfr.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j));
        } else {
            zzfrVar.zzay().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzn(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaz().zzp(new zzj(this, zzcfVar, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, @oo0oO0 String str, @oo0oO0 IObjectWrapper iObjectWrapper, @oo0oO0 IObjectWrapper iObjectWrapper2, @oo0oO0 IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.zza.zzay().zzt(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@oo0oO0 IObjectWrapper iObjectWrapper, @oo0oO0 Bundle bundle, long j) throws RemoteException {
        zzb();
        zzhw zzhwVar = this.zza.zzq().zza;
        if (zzhwVar != null) {
            this.zza.zzq().zzB();
            zzhwVar.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@oo0oO0 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhwVar = this.zza.zzq().zza;
        if (zzhwVar != null) {
            this.zza.zzq().zzB();
            zzhwVar.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@oo0oO0 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhwVar = this.zza.zzq().zza;
        if (zzhwVar != null) {
            this.zza.zzq().zzB();
            zzhwVar.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@oo0oO0 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhw zzhwVar = this.zza.zzq().zza;
        if (zzhwVar != null) {
            this.zza.zzq().zzB();
            zzhwVar.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        zzb();
        zzhw zzhwVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzhwVar != null) {
            this.zza.zzq().zzB();
            zzhwVar.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@oo0oO0 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@oo0oO0 IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        zzb();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgs zzgsVar;
        zzb();
        synchronized (this.zzb) {
            zzgsVar = (zzgs) this.zzb.get(Integer.valueOf(zzciVar.zzd()));
            if (zzgsVar == null) {
                zzgsVar = new zzp(this, zzciVar);
                this.zzb.put(Integer.valueOf(zzciVar.zzd()), zzgsVar);
            }
        }
        this.zza.zzq().zzJ(zzgsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzK(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@oo0oO0 Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            o00oOOo0.o00oOOo0(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@oo0oO0 final Bundle bundle, final long j) throws RemoteException {
        zzb();
        final zzhx zzq = this.zza.zzq();
        zzq.zzt.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgv
            @Override // java.lang.Runnable
            public final void run() {
                zzhx zzhxVar = zzhx.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzhxVar.zzt.zzh().zzm())) {
                    zzhxVar.zzR(bundle2, 0, j2);
                } else {
                    zzhxVar.zzt.zzay().zzl().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@oo0oO0 Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@oo0oO0 IObjectWrapper iObjectWrapper, @oo0oO0 String str, @oo0oO0 String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzhx zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzt.zzaz().zzp(new zzht(zzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@oo0oO0 Bundle bundle) {
        zzb();
        final zzhx zzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzq.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgw
            @Override // java.lang.Runnable
            public final void run() {
                zzhx.this.zzC(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzb();
        zzo zzoVar = new zzo(this, zzciVar);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzT(zzoVar);
        } else {
            this.zza.zzaz().zzp(new zzl(this, zzoVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzhx zzq = this.zza.zzq();
        zzq.zzt.zzaz().zzp(new zzha(zzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@oo0oO0 final String str, long j) throws RemoteException {
        zzb();
        final zzhx zzq = this.zza.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            zzq.zzt.zzay().zzk().zza("User ID must be non-empty or null");
            return;
        }
        zzq.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgx
            @Override // java.lang.Runnable
            public final void run() {
                zzhx zzhxVar = zzhx.this;
                if (zzhxVar.zzt.zzh().zzp(str)) {
                    zzhxVar.zzt.zzh().zzo();
                }
            }
        });
        zzq.zzX(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgs zzgsVar;
        zzb();
        synchronized (this.zzb) {
            zzgsVar = (zzgs) this.zzb.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (zzgsVar == null) {
            zzgsVar = new zzp(this, zzciVar);
        }
        this.zza.zzq().zzZ(zzgsVar);
    }
}
