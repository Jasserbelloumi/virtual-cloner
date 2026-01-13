package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzceh extends WebChromeClient {
    private final zzcei zza;

    public zzceh(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    private static final Context zzb(WebView webView) {
        if (webView instanceof zzcei) {
            zzcei zzceiVar = (zzcei) webView;
            Activity zzi = zzceiVar.zzi();
            return zzi != null ? zzi : zzceiVar.getContext();
        }
        return webView.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzcei) {
            com.google.android.gms.ads.internal.overlay.zzl zzL = ((zzcei) webView).zzL();
            if (zzL != null) {
                zzL.zzb();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzbza.zzj(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String o00oOOo02 = android.support.v4.media.o00oOo00.o00oOOo0(oO0OoOO0.o00oOOo0("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (o00oOOo02.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzceg.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzbza.zzg(o00oOOo02);
        } else if (i == 2) {
            zzbza.zzj(o00oOOo02);
        } else if (i == 3 || i == 4 || i != 5) {
            zzbza.zzi(o00oOOo02);
        } else {
            zzbza.zze(o00oOOo02);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = CacheDataSink.DEFAULT_FRAGMENT_SIZE - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min((long) PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), oo0oO0.o00oo0.f17344o00ooOo)) {
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), oo0oO0.o00oo0.f17346o00ooOoO)) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzbza.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzbza.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzL.zzA(view, customViewCallback);
        zzL.zzy(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcei zzceiVar;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzceiVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            zzbza.zzk("Fail to display Dialog.", e);
        }
        if (zzceiVar != null && zzceiVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
        zzG.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = zzG.setView(linearLayout).setPositiveButton(17039370, new zzcef(jsPromptResult, editText)).setNegativeButton(17039360, new zzcee(jsPromptResult)).setOnCancelListener(new zzced(jsPromptResult)).create();
        } else {
            create = zzG.setMessage(str3).setPositiveButton(17039370, new zzcec(jsResult)).setNegativeButton(17039360, new zzceb(jsResult)).setOnCancelListener(new zzcea(jsResult)).create();
        }
        create.show();
        return true;
    }
}
