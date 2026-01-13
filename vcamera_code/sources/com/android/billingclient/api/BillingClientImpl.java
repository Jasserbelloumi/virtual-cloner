package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import o00oOooO.o0O000O;
import o00oOooO.o0OO00OO;
import o00ooOoo.oO00O0o0;
import org.json.JSONException;
/* loaded from: classes.dex */
public class BillingClientImpl extends BillingClient {
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzh zzd;
    private Context zze;
    private zzar zzf;
    private volatile com.google.android.gms.internal.play_billing.zze zzg;
    private volatile zzaf zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzbe zzx;
    private boolean zzy;
    private ExecutorService zzz;

    private BillingClientImpl(Activity activity, zzbe zzbeVar, String str) {
        this(activity.getApplicationContext(), zzbeVar, new zzaj(), str, null, null, null);
    }

    @o0O000O
    private BillingClientImpl(Context context, zzbe zzbeVar, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @o0OO00OO AlternativeBillingListener alternativeBillingListener, @o0OO00OO zzar zzarVar) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, zzbeVar, alternativeBillingListener, str, null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    @o0O000O
    public BillingClientImpl(@o0OO00OO String str, zzbe zzbeVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @o0OO00OO AlternativeBillingListener alternativeBillingListener, @o0OO00OO zzar zzarVar) {
        this(context, zzbeVar, purchasesUpdatedListener, zzR(), null, alternativeBillingListener, null);
    }

    @o0O000O
    public BillingClientImpl(@o0OO00OO String str, zzbe zzbeVar, Context context, zzaz zzazVar, @o0OO00OO zzar zzarVar) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzR();
        this.zze = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(zzR());
        zzv.zzi(this.zze.getPackageName());
        this.zzf = new zzaw(this.zze, (zzfm) zzv.zzc());
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzh(this.zze, null, this.zzf);
        this.zzx = zzbeVar;
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzbe zzbeVar, @o0OO00OO AlternativeBillingListener alternativeBillingListener, String str, @o0OO00OO zzar zzarVar) {
        this.zze = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(str);
        zzv.zzi(this.zze.getPackageName());
        if (zzarVar == null) {
            zzarVar = new zzaw(this.zze, (zzfm) zzv.zzc());
        }
        this.zzf = zzarVar;
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzh(this.zze, purchasesUpdatedListener, alternativeBillingListener, this.zzf);
        this.zzx = zzbeVar;
        this.zzy = alternativeBillingListener != null;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzaj zzajVar = new zzaj(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzaq.zzb(6));
            zzajVar.onBillingSetupFinished(zzat.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzd;
            zzarVar.zza(zzaq.zza(37, 6, billingResult));
            zzajVar.onBillingSetupFinished(billingResult);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzm;
            zzarVar2.zza(zzaq.zza(38, 6, billingResult2));
            zzajVar.onBillingSetupFinished(billingResult2);
        } else {
            this.zza = 1;
            this.zzd.zze();
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, zzajVar, null);
            Intent intent = new Intent("ru.wecyrega.gnpfobdho");
            intent.setPackage("ru.wecyrega.gnpfobdho");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"ru.wecyrega.gnpfobdho".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Billing service unavailable on device.");
            zzar zzarVar3 = this.zzf;
            BillingResult billingResult3 = zzat.zzc;
            zzarVar3.zza(zzaq.zza(i, 6, billingResult3));
            zzajVar.onBillingSetupFinished(billingResult3);
        }
    }

    public static /* synthetic */ zzbj zzN(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle zzi;
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (billingClientImpl.zzn) {
                    zzi = billingClientImpl.zzg.zzj(z != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                } else {
                    zzi = billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                }
                zzbk zza = zzbl.zza(zzi, "BillingClient", "getPurchase()");
                BillingResult zza2 = zza.zza();
                if (zza2 != zzat.zzl) {
                    billingClientImpl.zzf.zza(zzaq.zza(zza.zzb(), 9, zza2));
                    return new zzbj(zza2, list);
                }
                ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i3 = i2;
                int i4 = i3;
                while (i3 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i3);
                    String str4 = stringArrayList3.get(i3);
                    com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "BUG: empty/null token!");
                            i4 = 1;
                        }
                        arrayList.add(purchase);
                        i3++;
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e);
                        zzar zzarVar = billingClientImpl.zzf;
                        BillingResult billingResult = zzat.zzj;
                        zzarVar.zza(zzaq.zza(51, 9, billingResult));
                        return new zzbj(billingResult, null);
                    }
                }
                if (i4 != 0) {
                    billingClientImpl.zzf.zza(zzaq.zza(26, 9, zzat.zzj));
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzbj(zzat.zzl, arrayList);
                }
                list = null;
                z = true;
                i2 = 0;
            } catch (Exception e2) {
                zzar zzarVar2 = billingClientImpl.zzf;
                BillingResult billingResult2 = zzat.zzm;
                zzarVar2.zza(zzaq.zza(52, 9, billingResult2));
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzbj(billingResult2, null);
            }
        }
    }

    public final Handler zzO() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzP(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzH(billingResult);
            }
        });
        return billingResult;
    }

    public final BillingResult zzQ() {
        return (this.zza == 0 || this.zza == 3) ? zzat.zzm : zzat.zzj;
    }

    @SuppressLint({"PrivateApi"})
    private static String zzR() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    @o0OO00OO
    public final Future zzS(Callable callable, long j, @o0OO00OO final Runnable runnable, Handler handler) {
        if (this.zzz == null) {
            this.zzz = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new zzab(this));
        }
        try {
            final Future submit = this.zzz.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzw
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void zzT(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (zzS(new zzz(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzo
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzK(purchaseHistoryResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 11, zzQ));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzQ, null);
        }
    }

    private final void zzU(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 9, billingResult));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzu.zzk());
        } else if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please provide a valid product type.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzg;
            zzarVar2.zza(zzaq.zza(50, 9, billingResult2));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzu.zzk());
        } else if (zzS(new zzy(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzL(purchasesResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 9, zzQ));
            purchasesResponseListener.onQueryPurchasesResponse(zzQ, com.google.android.gms.internal.play_billing.zzu.zzk());
        }
    }

    private final void zzV(BillingResult billingResult, int i, int i2) {
        if (billingResult.getResponseCode() != 0) {
            this.zzf.zza(zzaq.zza(i2, 5, billingResult));
        } else {
            this.zzf.zzb(zzaq.zzb(5));
        }
    }

    public static /* synthetic */ zzai zzf(BillingClientImpl billingClientImpl, String str) {
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle zzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                zzbk zza = zzbl.zza(zzh, "BillingClient", "getPurchaseHistory()");
                BillingResult zza2 = zza.zza();
                if (zza2 != zzat.zzl) {
                    billingClientImpl.zzf.zza(zzaq.zza(zza.zzb(), 11, zza2));
                    return new zzai(zza2, null);
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = i;
                int i3 = i2;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "BUG: empty/null token!");
                            i3 = 1;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i2++;
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e);
                        zzar zzarVar = billingClientImpl.zzf;
                        BillingResult billingResult = zzat.zzj;
                        zzarVar.zza(zzaq.zza(51, 11, billingResult));
                        return new zzai(billingResult, null);
                    }
                }
                if (i3 != 0) {
                    billingClientImpl.zzf.zza(zzaq.zza(26, 11, zzat.zzj));
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzai(zzat.zzl, arrayList);
                }
                i = 0;
            } catch (RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                zzar zzarVar2 = billingClientImpl.zzf;
                BillingResult billingResult2 = zzat.zzm;
                zzarVar2.zza(zzaq.zza(59, 11, billingResult2));
                return new zzai(billingResult2, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzai(zzat.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please provide a valid purchase token.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzi;
            zzarVar2.zza(zzaq.zza(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
        } else if (!this.zzn) {
            zzar zzarVar3 = this.zzf;
            BillingResult billingResult3 = zzat.zzb;
            zzarVar3.zza(zzaq.zza(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (zzS(new Callable() { // from class: com.android.billingclient.api.zzp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzj(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzG(acknowledgePurchaseResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 3, zzQ));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzQ);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (zzS(new Callable() { // from class: com.android.billingclient.api.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzk(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzn
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzI(consumeResponseListener, consumeParams);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 4, zzQ));
            consumeResponseListener.onConsumeResponse(zzQ, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        this.zzf.zzb(zzaq.zzb(12));
        try {
            this.zzd.zzd();
            if (this.zzh != null) {
                this.zzh.zzc();
            }
            if (this.zzh != null && this.zzg != null) {
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Unbinding from service.");
                this.zze.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzz;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzz = null;
            }
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x002e, code lost:
        if (r6.equals(com.android.billingclient.api.BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION) != false) goto L11;
     */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0408  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, final com.android.billingclient.api.BillingFlowParams r33) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else if (this.zzt) {
            if (zzS(new Callable() { // from class: com.android.billingclient.api.zzk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzl(queryProductDetailsParams, productDetailsResponseListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzl
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzJ(productDetailsResponseListener);
                }
            }, zzO()) == null) {
                BillingResult zzQ = zzQ();
                this.zzf.zza(zzaq.zza(25, 7, zzQ));
                productDetailsResponseListener.onProductDetailsResponse(zzQ, new ArrayList());
            }
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying product details is not supported.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzv;
            zzarVar2.zza(zzaq.zza(20, 7, billingResult2));
            productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzT(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzT(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzU(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzU(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please fix the input params. SKU type can't be empty.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzf;
            zzarVar2.zza(zzaq.zza(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
        } else if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            zzar zzarVar3 = this.zzf;
            BillingResult billingResult3 = zzat.zze;
            zzarVar3.zza(zzaq.zza(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
        } else if (zzS(new Callable(skuType, skusList, null, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzj
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzm(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzM(skuDetailsResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 8, zzQ));
            skuDetailsResponseListener.onSkuDetailsResponse(zzQ, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service disconnected.");
            return zzat.zzm;
        } else if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzat.zzw;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            final Bundle bundle = new Bundle();
            oO00O0o0.o00oOOo0.o00oOOoO(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
            final zzaa zzaaVar = new zzaa(this, this.zzc, inAppMessageResponseListener);
            zzS(new Callable() { // from class: com.android.billingclient.api.zzv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzn(bundle, activity, zzaaVar);
                    return null;
                }
            }, 5000L, null, this.zzc);
            return zzat.zzl;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzaq.zzb(6));
            billingClientStateListener.onBillingSetupFinished(zzat.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzd;
            zzarVar.zza(zzaq.zza(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzar zzarVar2 = this.zzf;
            BillingResult billingResult2 = zzat.zzm;
            zzarVar2.zza(zzaq.zza(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
        } else {
            this.zza = 1;
            this.zzd.zze();
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, billingClientStateListener, null);
            Intent intent = new Intent("ru.wecyrega.gnpfobdho");
            intent.setPackage("ru.wecyrega.gnpfobdho");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"ru.wecyrega.gnpfobdho".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Billing service unavailable on device.");
            zzar zzarVar3 = this.zzf;
            BillingResult billingResult3 = zzat.zzc;
            zzarVar3.zza(zzaq.zza(i, 6, billingResult3));
            billingClientStateListener.onBillingSetupFinished(billingResult3);
        }
    }

    public final /* synthetic */ void zzG(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 3, billingResult));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzH(BillingResult billingResult) {
        if (this.zzd.zzc() != null) {
            this.zzd.zzc().onPurchasesUpdated(billingResult, null);
            return;
        }
        this.zzd.zzb();
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
    }

    public final /* synthetic */ void zzI(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 4, billingResult));
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzJ(ProductDetailsResponseListener productDetailsResponseListener) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 7, billingResult));
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzK(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 11, billingResult));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final /* synthetic */ void zzL(PurchasesResponseListener purchasesResponseListener) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 9, billingResult));
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzu.zzk());
    }

    public final /* synthetic */ void zzM(SkuDetailsResponseListener skuDetailsResponseListener) {
        zzar zzarVar = this.zzf;
        BillingResult billingResult = zzat.zzn;
        zzarVar.zza(zzaq.zza(24, 8, billingResult));
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    public final /* synthetic */ Object zzj(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd = zzeVar.zzd(9, packageName, purchaseToken, bundle);
            int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzd, "BillingClient");
            String zzf = com.google.android.gms.internal.play_billing.zzb.zzf(zzd, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb);
            newBuilder.setDebugMessage(zzf);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error acknowledge purchase!", e);
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(28, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return null;
        }
    }

    public final /* synthetic */ Object zzk(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str2 = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze = zzeVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzb.zzf(zze, "BillingClient");
            } else {
                zza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zza);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Successfully consumed purchase.");
            } else {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Error consuming purchase with token. Response code: " + zza);
                this.zzf.zza(zzaq.zza(23, 4, build));
            }
            consumeResponseListener.onConsumeResponse(build, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase!", e);
            zzar zzarVar = this.zzf;
            BillingResult billingResult = zzat.zzm;
            zzarVar.zza(zzaq.zza(29, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x012b, code lost:
        r0.zza(r2);
        r12 = r5;
        r13 = "Item is unavailable for purchase.";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object zzl(com.android.billingclient.api.QueryProductDetailsParams r27, com.android.billingclient.api.ProductDetailsResponseListener r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzl(com.android.billingclient.api.QueryProductDetailsParams, com.android.billingclient.api.ProductDetailsResponseListener):java.lang.Object");
    }

    public final /* synthetic */ Object zzm(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String str3;
        int i;
        Bundle zzk;
        zzar zzarVar;
        int i2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (true) {
            str3 = "Error trying to decode SkuDetails.";
            if (i3 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i4 = i3 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i3, i4 > size ? size : i4));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
                    String packageName = this.zze.getPackageName();
                    int i5 = this.zzk;
                    String str4 = this.zzb;
                    Bundle bundle2 = new Bundle();
                    if (i5 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str4);
                    }
                    if (i5 >= 9) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    zzk = zzeVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    zzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                }
                if (zzk == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "querySkuDetailsAsync got null sku details list");
                    zzarVar = this.zzf;
                    i2 = 44;
                    break;
                } else if (zzk.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = zzk.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "querySkuDetailsAsync got null response list");
                        zzarVar = this.zzf;
                        i2 = 46;
                        break;
                    }
                    for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i6));
                            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                            this.zzf.zza(zzaq.zza(47, 8, zzat.zza(6, "Error trying to decode SkuDetails.")));
                            i = 6;
                            arrayList = null;
                            BillingResult.Builder newBuilder = BillingResult.newBuilder();
                            newBuilder.setResponseCode(i);
                            newBuilder.setDebugMessage(str3);
                            skuDetailsResponseListener.onSkuDetailsResponse(newBuilder.build(), arrayList);
                            return null;
                        }
                    }
                    i3 = i4;
                } else {
                    int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzk, "BillingClient");
                    str3 = com.google.android.gms.internal.play_billing.zzb.zzf(zzk, "BillingClient");
                    if (zzb != 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() failed. Response code: " + zzb);
                        this.zzf.zza(zzaq.zza(23, 8, zzat.zza(zzb, str3)));
                        i = zzb;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        this.zzf.zza(zzaq.zza(45, 8, zzat.zza(6, str3)));
                        i = 6;
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                this.zzf.zza(zzaq.zza(43, 8, zzat.zzm));
                i = -1;
                str3 = "Service connection is disconnected.";
            }
        }
        zzarVar.zza(zzaq.zza(i2, 8, zzat.zzB));
        str3 = "Item is unavailable for purchase.";
        arrayList = null;
        i = 4;
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(i);
        newBuilder2.setDebugMessage(str3);
        skuDetailsResponseListener.onSkuDetailsResponse(newBuilder2.build(), arrayList);
        return null;
    }

    public final /* synthetic */ Object zzn(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzm(12, this.zze.getPackageName(), bundle, new zzah(new WeakReference(activity), resultReceiver, null));
        return null;
    }
}
