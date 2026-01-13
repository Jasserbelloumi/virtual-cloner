package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzapt implements zzaps {
    public static volatile zzaqx zza;
    public MotionEvent zzb;
    public double zzk;
    public float zzl;
    public float zzm;
    public float zzn;
    public float zzo;
    public DisplayMetrics zzq;
    @o0OO00OO
    public zzaqp zzr;
    private double zzs;
    private double zzt;
    public final LinkedList zzc = new LinkedList();
    public long zzd = 0;
    public long zze = 0;
    public long zzf = 0;
    public long zzg = 0;
    public long zzh = 0;
    public long zzi = 0;
    public long zzj = 0;
    private boolean zzu = false;
    public boolean zzp = false;

    public zzapt(Context context) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcO)).booleanValue()) {
                zzaol.zzd();
            } else {
                zzaqz.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcn)).booleanValue()) {
                this.zzr = new zzaqp();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapt.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaqn;

    public abstract zzamv zzb(Context context, View view, Activity activity);

    public abstract zzamv zzc(Context context, zzamo zzamoVar);

    public abstract zzamv zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zze(Context context, @o0OO00OO String str, @o0OO00OO View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzf(Context context, @o0OO00OO String str, @o0OO00OO View view, @o0OO00OO Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzg(Context context) {
        if (zzarb.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzh(Context context, @o0OO00OO View view, @o0OO00OO Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzara zzi(MotionEvent motionEvent) throws zzaqn;

    @Override // com.google.android.gms.internal.ads.zzaps
    public final synchronized void zzk(@o0OO00OO MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += Math.sqrt((d2 * d2) + (d * d));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzara zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi = l2.longValue() + zzi.zzg.longValue() + this.zzi;
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj = l.longValue() + zzi.zzh.longValue() + this.zzj;
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzaqn unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcd)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqp zzaqpVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcn)).booleanValue() || (zzaqpVar = this.zzr) == null) {
            return;
        }
        zzaqpVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public void zzo(View view) {
    }
}
