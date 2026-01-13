package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class zzfkm extends zzfka {
    private zzfok<Integer> zza;
    private zzfok<Integer> zzb;
    @o0OO00OO
    private zzfkl zzc;
    @o0OO00OO
    private HttpURLConnection zzd;

    public zzfkm() {
        this(new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkj
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzfkm.zzf();
            }
        }, new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkk
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzfkm.zzg();
            }
        }, null);
    }

    public zzfkm(zzfok<Integer> zzfokVar, zzfok<Integer> zzfokVar2, @o0OO00OO zzfkl zzfklVar) {
        this.zza = zzfokVar;
        this.zzb = zzfokVar2;
        this.zzc = zzfklVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(@o0OO00OO HttpURLConnection httpURLConnection) {
        zzfkb.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfkb.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfkl zzfklVar = this.zzc;
        zzfklVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfklVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfkl zzfklVar, final int i, final int i2) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkd
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfklVar;
        return zzm();
    }

    @o0OOooO0(21)
    public HttpURLConnection zzo(@oo0oO0 final Network network, @oo0oO0 final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfke
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkf
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfkl() { // from class: com.google.android.gms.internal.ads.zzfkg
            @Override // com.google.android.gms.internal.ads.zzfkl
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@oo0oO0 final URL url, final int i) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkh
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfkl() { // from class: com.google.android.gms.internal.ads.zzfki
            @Override // com.google.android.gms.internal.ads.zzfkl
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
