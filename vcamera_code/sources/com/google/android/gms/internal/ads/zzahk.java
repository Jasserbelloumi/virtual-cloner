package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahk implements zzaiy {
    private final List zza;

    public zzahk() {
        this(0);
    }

    public zzahk(int i) {
        this.zza = zzfqk.zzo();
    }

    public zzahk(int i, List list) {
        this.zza = list;
    }

    private final zzaio zzb(zzaix zzaixVar) {
        return new zzaio(zzd(zzaixVar));
    }

    private final zzajc zzc(zzaix zzaixVar) {
        return new zzajc(zzd(zzaixVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzaix zzaixVar) {
        String str;
        int i;
        List list;
        zzen zzenVar = new zzen(zzaixVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzenVar.zza() > 0) {
            int zzk = zzenVar.zzk();
            int zzc = zzenVar.zzc() + zzenVar.zzk();
            if (zzk == 134) {
                arrayList = new ArrayList();
                int zzk2 = zzenVar.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzenVar.zzx(3, zzfnh.zzc);
                    int zzk3 = zzenVar.zzk();
                    boolean z = (zzk3 & 128) != 0;
                    if (z) {
                        i = zzk3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte zzk4 = (byte) zzenVar.zzk();
                    zzenVar.zzG(1);
                    if (z) {
                        int i3 = zzk4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzdn.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzadVar = new zzad();
                    zzadVar.zzS(str);
                    zzadVar.zzK(zzx);
                    zzadVar.zzu(i);
                    zzadVar.zzI(list);
                    arrayList.add(zzadVar.zzY());
                }
            }
            zzenVar.zzF(zzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    @o0OO00OO
    public final zzaja zza(int i, zzaix zzaixVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaie(new zzaib(zzaixVar.zzb));
            }
            if (i == 21) {
                return new zzaie(new zzahz());
            }
            if (i == 27) {
                return new zzaie(new zzahw(zzb(zzaixVar), false, false));
            }
            if (i == 36) {
                return new zzaie(new zzahy(zzb(zzaixVar)));
            }
            if (i == 89) {
                return new zzaie(new zzahm(zzaixVar.zzc));
            }
            if (i == 138) {
                return new zzaie(new zzahl(zzaixVar.zzb));
            }
            if (i == 172) {
                return new zzaie(new zzahg(zzaixVar.zzb));
            }
            if (i == 257) {
                return new zzain(new zzaid(MimeTypes.APPLICATION_AIT));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzain(new zzaid(MimeTypes.APPLICATION_SCTE35));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzaie(new zzahj(false, zzaixVar.zzb));
                            case 16:
                                return new zzaie(new zzahs(zzc(zzaixVar)));
                            case 17:
                                return new zzaie(new zzaia(zzaixVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaie(new zzahd(zzaixVar.zzb));
            }
        }
        return new zzaie(new zzahp(zzc(zzaixVar)));
    }
}
