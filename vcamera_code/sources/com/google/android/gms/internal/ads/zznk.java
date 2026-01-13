package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
@o0OOooO0(31)
/* loaded from: classes2.dex */
public final class zznk implements zzle, zznl {
    private final Context zza;
    private final zznm zzb;
    private final PlaybackSession zzc;
    @o0OO00OO
    private String zzi;
    @o0OO00OO
    private PlaybackMetrics$Builder zzj;
    private int zzk;
    @o0OO00OO
    private zzbw zzn;
    @o0OO00OO
    private zznj zzo;
    @o0OO00OO
    private zznj zzp;
    @o0OO00OO
    private zznj zzq;
    @o0OO00OO
    private zzaf zzr;
    @o0OO00OO
    private zzaf zzs;
    @o0OO00OO
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcm zze = new zzcm();
    private final zzck zzf = new zzck();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zznk(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzni zzniVar = new zzni(zzni.zza);
        this.zzb = zzniVar;
        zzniVar.zzg(this);
    }

    @o0OO00OO
    public static zznk zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zznk(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzew.zzl(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.zzj;
        if (playbackMetrics$Builder != null && this.zzz) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, @o0OO00OO zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzs, zzafVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzafVar;
        zzx(0, j, zzafVar, i2);
    }

    private final void zzu(long j, @o0OO00OO zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzt, zzafVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzafVar;
        zzx(2, j, zzafVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcn zzcnVar, @o0OO00OO zzss zzssVar) {
        int zza;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.zzj;
        if (zzssVar == null || (zza = zzcnVar.zza(zzssVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcnVar.zzd(zza, this.zzf, false);
        zzcnVar.zze(this.zzf.zzd, this.zze, 0L);
        zzay zzayVar = this.zze.zzd.zzd;
        if (zzayVar != null) {
            int zzp = zzew.zzp(zzayVar.zza);
            i = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        playbackMetrics$Builder.setStreamType(i);
        zzcm zzcmVar = this.zze;
        if (zzcmVar.zzn != C.TIME_UNSET && !zzcmVar.zzl && !zzcmVar.zzi && !zzcmVar.zzb()) {
            playbackMetrics$Builder.setMediaDurationMillis(zzew.zzz(this.zze.zzn));
        }
        playbackMetrics$Builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, @o0OO00OO zzaf zzafVar, int i) {
        if (zzew.zzU(this.zzr, zzafVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzafVar;
        zzx(1, j, zzafVar, i2);
    }

    private final void zzx(int i, long j, @o0OO00OO zzaf zzafVar, int i2) {
        TrackChangeEvent$Builder timeSinceCreatedMillis = new TrackChangeEvent$Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzafVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzafVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzafVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzafVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzafVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                String[] zzah = zzew.zzah(str4, "-");
                Pair create = Pair.create(zzah[0], zzah.length >= 2 ? zzah[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(@o0OO00OO zznj zznjVar) {
        return zznjVar != null && zznjVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzc(zzlc zzlcVar, String str) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null || !zzssVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta03");
            zzv(zzlcVar.zzb, zzlcVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzd(zzlc zzlcVar, String str, boolean z) {
        zzss zzssVar = zzlcVar.zzd;
        if ((zzssVar == null || !zzssVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zze(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzf(zzlc zzlcVar, int i, long j, long j2) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar != null) {
            String zze = this.zzb.zze(zzlcVar.zzb, zzssVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzg(zzlc zzlcVar, zzso zzsoVar) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null) {
            return;
        }
        zzaf zzafVar = zzsoVar.zzb;
        zzafVar.getClass();
        zznj zznjVar = new zznj(zzafVar, 0, this.zzb.zze(zzlcVar.zzb, zzssVar));
        int i = zzsoVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zznjVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zznjVar;
                return;
            }
        }
        this.zzo = zznjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzh(zzlc zzlcVar, int i, long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcg r21, com.google.android.gms.internal.ads.zzld r22) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznk.zzi(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzld):void");
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzj(zzlc zzlcVar, zzsj zzsjVar, zzso zzsoVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzk(zzlc zzlcVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzl(zzlc zzlcVar, zzbw zzbwVar) {
        this.zzn = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzm(zzlc zzlcVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzn(zzlc zzlcVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzo(zzlc zzlcVar, zzhb zzhbVar) {
        this.zzw += zzhbVar.zzg;
        this.zzx += zzhbVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzp(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzq(zzlc zzlcVar, zzda zzdaVar) {
        zznj zznjVar = this.zzo;
        if (zznjVar != null) {
            zzaf zzafVar = zznjVar.zza;
            if (zzafVar.zzs == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzX(zzdaVar.zzc);
                zzb.zzF(zzdaVar.zzd);
                this.zzo = new zznj(zzb.zzY(), 0, zznjVar.zzc);
            }
        }
    }
}
