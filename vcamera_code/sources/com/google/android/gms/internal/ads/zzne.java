package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzne {
    private final zzck zza;
    private zzfqk zzb = zzfqk.zzo();
    private zzfqn zzc = zzfqn.zzd();
    @o0OO00OO
    private zzss zzd;
    private zzss zze;
    private zzss zzf;

    public zzne(zzck zzckVar) {
        this.zza = zzckVar;
    }

    @o0OO00OO
    private static zzss zzj(zzcg zzcgVar, zzfqk zzfqkVar, @o0OO00OO zzss zzssVar, zzck zzckVar) {
        zzcn zzq = zzcgVar.zzq();
        int zzh = zzcgVar.zzh();
        Object zzf = zzq.zzo() ? null : zzq.zzf(zzh);
        int zzc = (zzcgVar.zzA() || zzq.zzo()) ? -1 : zzq.zzd(zzh, zzckVar, false).zzc(zzew.zzv(zzcgVar.zzn()));
        for (int i = 0; i < zzfqkVar.size(); i++) {
            zzss zzssVar2 = (zzss) zzfqkVar.get(i);
            if (zzm(zzssVar2, zzf, zzcgVar.zzA(), zzcgVar.zze(), zzcgVar.zzf(), zzc)) {
                return zzssVar2;
            }
        }
        if (zzfqkVar.isEmpty() && zzssVar != null) {
            if (zzm(zzssVar, zzf, zzcgVar.zzA(), zzcgVar.zze(), zzcgVar.zzf(), zzc)) {
                return zzssVar;
            }
        }
        return null;
    }

    private final void zzk(zzfqm zzfqmVar, @o0OO00OO zzss zzssVar, zzcn zzcnVar) {
        if (zzssVar == null) {
            return;
        }
        if (zzcnVar.zza(zzssVar.zza) != -1) {
            zzfqmVar.zza(zzssVar, zzcnVar);
            return;
        }
        zzcn zzcnVar2 = (zzcn) this.zzc.get(zzssVar);
        if (zzcnVar2 != null) {
            zzfqmVar.zza(zzssVar, zzcnVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (com.google.android.gms.internal.ads.zzfnp.zza(r3.zzd, r3.zzf) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.zzb.contains(r3.zzd) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        zzk(r0, r3.zzd, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzl(com.google.android.gms.internal.ads.zzcn r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzfqm r0 = new com.google.android.gms.internal.ads.zzfqm
            r0.<init>()
            com.google.android.gms.internal.ads.zzfqk r1 = r3.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.zzss r1 = r3.zze
            r3.zzk(r0, r1, r4)
            com.google.android.gms.internal.ads.zzss r1 = r3.zzf
            com.google.android.gms.internal.ads.zzss r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfnp.zza(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzss r1 = r3.zzf
            r3.zzk(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.zzss r1 = r3.zzd
            com.google.android.gms.internal.ads.zzss r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfnp.zza(r1, r2)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.zzss r1 = r3.zzd
            com.google.android.gms.internal.ads.zzss r2 = r3.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfnp.zza(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.google.android.gms.internal.ads.zzfqk r2 = r3.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.google.android.gms.internal.ads.zzfqk r2 = r3.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzss r2 = (com.google.android.gms.internal.ads.zzss) r2
            r3.zzk(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.google.android.gms.internal.ads.zzfqk r1 = r3.zzb
            com.google.android.gms.internal.ads.zzss r2 = r3.zzd
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.google.android.gms.internal.ads.zzss r1 = r3.zzd
            r3.zzk(r0, r1, r4)
        L5c:
            com.google.android.gms.internal.ads.zzfqn r4 = r0.zzc()
            r3.zzc = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzne.zzl(com.google.android.gms.internal.ads.zzcn):void");
    }

    private static boolean zzm(zzss zzssVar, @o0OO00OO Object obj, boolean z, int i, int i2, int i3) {
        if (zzssVar.zza.equals(obj)) {
            if (z) {
                if (zzssVar.zzb != i || zzssVar.zzc != i2) {
                    return false;
                }
            } else if (zzssVar.zzb != -1 || zzssVar.zze != i3) {
                return false;
            }
            return true;
        }
        return false;
    }

    @o0OO00OO
    public final zzcn zza(zzss zzssVar) {
        return (zzcn) this.zzc.get(zzssVar);
    }

    @o0OO00OO
    public final zzss zzb() {
        return this.zzd;
    }

    @o0OO00OO
    public final zzss zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfqk zzfqkVar = this.zzb;
        if (!(zzfqkVar instanceof List)) {
            Iterator<E> it = zzfqkVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (zzfqkVar.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            obj = zzfqkVar.get(zzfqkVar.size() - 1);
        }
        return (zzss) obj;
    }

    @o0OO00OO
    public final zzss zzd() {
        return this.zze;
    }

    @o0OO00OO
    public final zzss zze() {
        return this.zzf;
    }

    public final void zzg(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @o0OO00OO zzss zzssVar, zzcg zzcgVar) {
        this.zzb = zzfqk.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzss) list.get(0);
            zzssVar.getClass();
            this.zzf = zzssVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcgVar.zzq());
    }

    public final void zzi(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        zzl(zzcgVar.zzq());
    }
}
