package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzaue extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzatv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzaue() {
        zzatv zzatvVar = new zzatv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzatvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbcc.zzd.zze()).intValue();
        this.zzg = ((Long) zzbcc.zza.zze()).intValue();
        this.zzh = ((Long) zzbcc.zze.zze()).intValue();
        this.zzi = ((Long) zzbcc.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzQ)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzR)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzS)).intValue();
        this.zze = ((Long) zzbcc.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzU);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzV)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzW)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzX)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = com.google.android.gms.ads.internal.zzt.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        com.google.android.gms.internal.ads.zzbza.zze("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r0.getWindow() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzbza.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        com.google.android.gms.internal.ads.zzbza.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
        com.google.android.gms.internal.ads.zzbza.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00da->B:71:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.zzatz r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzatz r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            android.app.Activity r0 = r0.zza()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L69:
            r6.zzf()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbyj r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzu(r0, r3)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L9d:
            if (r1 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzaua r0 = new com.google.android.gms.internal.ads.zzaua     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r1.post(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbyj r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzu(r0, r2)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzbza.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto L69
        Lb8:
            int r0 = r6.zze     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Ld7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbza.zzh(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.zzbyj r2 = com.google.android.gms.ads.internal.zzt.zzo()
            r2.zzu(r0, r1)
            goto Ld7
        Ld1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbza.zzh(r1, r0)
        Ld7:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        Lda:
            boolean r1 = r6.zzb     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le9
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzbza.zze(r1)     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            java.lang.Object r1 = r6.zzc     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            r1.wait()     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            goto Lda
        Le9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto L0
        Lec:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.run():void");
    }

    public final zzatu zza() {
        return this.zzd.zza(this.zzp);
    }

    @VisibleForTesting
    public final zzaud zzb(@o0OO00OO View view, zzatu zzatuVar) {
        if (view == null) {
            return new zzaud(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzaud(this, 0, 0);
            }
            zzatuVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzaud(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzcei)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzatuVar.zzh();
                webView.post(new zzauc(this, zzatuVar, webView, globalVisibleRect));
                return new zzaud(this, 0, 1);
            }
            return new zzaud(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzaud zzb = zzb(viewGroup.getChildAt(i3), zzatuVar);
                i += zzb.zza;
                i2 += zzb.zzb;
            }
            return new zzaud(this, i, i2);
        } else {
            return new zzaud(this, 0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r11 == 0) goto L24;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzatu r9 = new com.google.android.gms.internal.ads.zzatu     // Catch: java.lang.Exception -> L83
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L83
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L83
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L83
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L83
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L83
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L83
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L83
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L83
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L83
            com.google.android.gms.internal.ads.zzatz r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Exception -> L83
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L54
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L83
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L83
            if (r1 != 0) goto L54
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L83
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzT     // Catch: java.lang.Exception -> L83
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Exception -> L83
            java.lang.Object r2 = r3.zzb(r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L83
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L83
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L54
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L83
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L53
            goto L54
        L53:
            return
        L54:
            com.google.android.gms.internal.ads.zzaud r11 = r10.zzb(r11, r9)     // Catch: java.lang.Exception -> L83
            r9.zzm()     // Catch: java.lang.Exception -> L83
            int r0 = r11.zza     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L65
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L64
            goto L65
        L64:
            return
        L65:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L83
            if (r11 != 0) goto L71
            int r11 = r9.zzc()     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L70
            goto L73
        L70:
            return
        L71:
            if (r11 != 0) goto L7d
        L73:
            com.google.android.gms.internal.ads.zzatv r11 = r10.zzd     // Catch: java.lang.Exception -> L83
            boolean r11 = r11.zzd(r9)     // Catch: java.lang.Exception -> L83
            if (r11 != 0) goto L7c
            goto L7d
        L7c:
            return
        L7d:
            com.google.android.gms.internal.ads.zzatv r11 = r10.zzd     // Catch: java.lang.Exception -> L83
            r11.zzb(r9)     // Catch: java.lang.Exception -> L83
            return
        L83:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.internal.ads.zzbza.zzh(r0, r11)
            com.google.android.gms.internal.ads.zzbyj r0 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.zzu(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.zzc(android.view.View):void");
    }

    @VisibleForTesting
    public final void zzd(zzatu zzatuVar, WebView webView, String str, boolean z) {
        zzatuVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzatuVar.zzl(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    zzatuVar.zzl(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzatuVar.zzo()) {
                this.zzd.zzc(zzatuVar);
            }
        } catch (JSONException unused) {
            zzbza.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzbza.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzbza.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzbza.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzbza.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
